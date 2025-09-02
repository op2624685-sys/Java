import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Simple interest:- \n");
        System.out.print("Enter your principle amount Rs.  ");
        int principle = input .nextInt();
        System.out.print("Enter rate of interest: ");
        Float rate = input .nextFloat();
        System.out.print("Enter for how many years you borrow this money: ");
        Float time = input .nextFloat();

        Float interest = (principle * rate * time) / 100;
        System.out.println("Your simple interest is Rs. " + interest);

        System.out.println("Thank You");
    }
}