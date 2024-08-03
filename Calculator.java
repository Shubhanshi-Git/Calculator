//Create a Java program that acts as a simple calculator.
//        ● The program should prompt the user to enter two numbers and an operator (+, -,
//        *, /).
//        ● Perform the corresponding calculation based on the operator.
//        ● Handle potential exceptions, such as division by zero or invalid operator input.
//        ● Display the result or an appropriate error message.

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st num : ");
        double num1 = sc.nextDouble();
        System.out.println("enter any operator{+ ,-,*,/} :  ");
        char symbol = sc.next().charAt(0);
        System.out.println("enter the 2nd num : ");
        double num2 = sc.nextDouble();
        try {
            switch (symbol) {
                case '+':
                    System.out.println("Addition of num1 & num 2 : " +(num1 + num2) );
                    break;
                case'-':
                    System.out.println("Difference  of num1 & num 2 : " +(num1 - num2));
                    break;
                case '*' :
                    System.out.println("Multiplication of num1 & num2 : " +(num1 * num2));
                    break;
                case '/':
                   if(num2 ==0 ){
                       System.out.println("Exception : Division by 0 is not allowed! ");
                   }
                   else{
                       System.out.println("Divison of num1 & num 2 : " +(num1 / num2 ));
                   }
                     break;
            }

        }
        catch(Exception e ){
            System.out.println( e);
            System.out.println("===========================");
            System.out.println(e.getMessage());
            System.out.println("===========================");
            e.printStackTrace();
        }

    }}
