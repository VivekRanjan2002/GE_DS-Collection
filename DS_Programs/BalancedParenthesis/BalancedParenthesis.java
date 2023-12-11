/*
a. Desc -> Take an Arithmetic Expression such as
(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
performance of operations. Ensure parentheses must appear in a balanced
fashion.
b. I/P -> read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
c. Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed
parenthesis “)”. At the End of the Expression if the Stack is Empty then the
Arithmetic Expression is Balanced. Stack Class Methods are Stack(), push(),
pop(), peak(), isEmpty(), size()
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.
 */

package org.example.DS_Programs.BalancedParenthesis;
import java.util.*;
class BalancedParentheses {
    /*
    @desc: compute whether the expression string is balanced or not
    @return: if expression string is balanced then true else false
     */
    public static boolean isBalanced(String expression) {
        Stack stack = new Stack(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String inputExpression = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
        boolean isExpressionBalanced = isBalanced(inputExpression);

        if (isExpressionBalanced) {
            System.out.println("Arithmetic Expression is balanced.");
        } else {
            System.out.println("Arithmetic Expression is not balanced.");
        }
    }
}
