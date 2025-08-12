package practical;

import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Hello " + name + " Please Enter Your Age: ");
        int age = input.nextInt();
        if (age > 18) {
            System.out.println(name + " You are adult \nAre you married ?");
        } 
        else {
            System.out.println(name + " You are teenager \nAre you Study ?");
        }
    }
}
