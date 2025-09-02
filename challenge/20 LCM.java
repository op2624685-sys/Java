import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate LCM of number \n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your Second number: ");
        int num2 = input.nextInt();
        int lcm = numberOfLCM(num1, num2);
        System.out.println("LCM is: " + lcm);
    }

    public static int numberOfLCM(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }
}
