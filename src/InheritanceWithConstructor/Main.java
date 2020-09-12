package InheritanceWithConstructor;

import java.util.Scanner;
// Multi Level Inheritance
// Multi Level Inheritance
// Multi Level Inheritance
// Multi Level Inheritance


public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String person_name = scan.next();
        System.out.println("Enter Your Age");
        int person_age = scan.nextInt();
        System.out.println("Enter Your Gender");
        String person_gender = scan.next();

        Grand_Child gc = new Grand_Child(person_name, person_age, person_gender);
        gc.show_name();
        gc.show_age();
        gc.show_gender();


    }
}
