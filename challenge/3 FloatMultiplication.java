import java.util.Scanner;

class FloatMultiplication{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("We are doing FloatMultiplication\n");

        double Num1 = input .nextDouble();
        double Num2 = input .nextDouble();

        System.out.println(Num1 * Num2);
    }
}