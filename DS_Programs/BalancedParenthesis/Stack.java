package org.example.DS_Programs.BalancedParenthesis;
class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }
    /*
    @desc: push character in stackArray
     */
    public void push(char c) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++top] = c;
        }
    }
    /*
    @desc: erase out the top element of the stack
     */
    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            return stackArray[top--];
        }
    }
    /*
    @desc: return the top element of the stackArray
    @return: top element i.e. char
     */
    public char peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return '\0';
        } else {
            return stackArray[top];
        }
    }
    // return if the stackArray is empty or not
    public boolean isEmpty() {
        return (top == -1);
    }
    // return the current size of the StackArray
    public int size() {
        return top + 1;
    }
}
