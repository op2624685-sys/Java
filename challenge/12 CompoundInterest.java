import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Compound Interest :-\n");
        System.out.print("Enter your principle amount Rs.");
        int principle = input .nextInt();
        System.out.print("Enter your rate of interest: ");
        Float rate = input .nextFloat();
        System.out.print("Enter by how many years you borrow the money: ");
        Float time = input .nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100 ), time);

        System.out.println("Your Simple Interest is Rs." + compInt);
        
    }
}
