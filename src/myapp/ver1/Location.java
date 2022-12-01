package myapp.ver1;

import java.io.Console;

public class Location {
  
    public static void main(String[] args) {

        //Get the system console
        Console cons = System.console();

        //Read from the console, the result is assigned to a variable
        String name = " ";
        while (name.trim().length() <= 0) {

         name = cons.readLine ("What do you want to do?");
         
         if (name.equals("swim")) {
            System.out.println("Pasir Ris Recreation Centre is nearest to you");}


        }
    }
}
