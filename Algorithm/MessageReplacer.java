/*
Desc -> Read in the following message: Hello <<name>>, We have your full
name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
Use Regex to replace name, full name, Mobile#, and Date with proper value.
b. I/P -> read in the Message
c. Logic -> Use Regex to do the following
i. Replace <<name>> by first name of the user ( assume you are the user)
ii. replace <<full name>> by user full name.
iii. replace any occurance of mobile number that should be in format
91-xxxxxxxxxx by your contact number.

iv. replace any date in the format XX/XX/XXXX by current date.
 */
package org.example.Algorithm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MessageReplacer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message= sc.nextLine();

        // user detail
        String name="Vivek";
        String fullName="Vivek Ranjan";
        String phoneNo="91-1234567890";
        String date=CurrentDate();

        // Regex Pattern
        String nameRegex= "<<name>>";
        String fullNameRegex="<<full name>>";
        String phoneRegex="91-\\w{10}";
        String dateRegex="\\d{2}/\\d{2}/\\d{4}";

        // Replace regex pattern with user detail
        message=message.replaceAll(nameRegex,name);
        message=message.replaceAll(fullNameRegex,fullName);
        message=message.replaceAll(phoneRegex,phoneNo);
        message=message.replaceAll(dateRegex,date);

        // print the modified message
        System.out.println("Modified Message : ");
        System.out.println(message);

    }
    public  static String CurrentDate(){
        LocalDate currdate= LocalDate.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return formatter.format(currdate);
    }
}
