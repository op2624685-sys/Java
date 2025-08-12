import java.util.Scanner;

class UserInput {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good morning " + name);
        System.out.print(name + ",Also tell me your age");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);

        if (age >=18) {
            System.out.print("You are adult.");
        } else {
            System.out.print("You are teenage.");
        }
        System.out.print(age);
    }
}
