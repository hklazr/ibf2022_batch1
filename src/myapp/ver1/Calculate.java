package myapp.ver1;

import java.io.Console;

public class Calculate {
    public static void main(String[] args) {

        //Get system console
        Console cons = System.console();

        String num1 = cons.readLine ("What is the first number?");
        String num2 = cons.readLine ("What is the second number?");
        String num3 = cons.readLine ("What is the third number?");
        String num4 = cons.readLine ("What is the last number?");

        int num01 = Integer.parseInt(num1);
        int num02 = Integer.parseInt(num2);
        int num03 = Integer.parseInt(num3);
       if (num4.equals("stop")){

        int sum = num01 + num02 + num03;
        System.out.println("The total is " + sum);
       }
    }
}