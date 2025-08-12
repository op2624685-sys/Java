import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter Calculater: ");

        double a = input .nextDouble();
        double b = input .nextDouble();
        double c = input .nextDouble();
        double d = input .nextDouble();

        // 1st way to show sum of number
        // double Perimeter = (a+b+c+d);
        // System.out.println("Perimeter is " + Perimeter);

        // 2nd way to show sum of number
       System.out.println("Perimeter is " + (a+b+c+d));
    }
}
