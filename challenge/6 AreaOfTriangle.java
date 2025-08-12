import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the area of triangle \n");
        System.out.print("Enter the base of triangle: ");
        double base = input .nextDouble();
        System.out.print("Enter the perpendicular height of triangle: ");
        double height = input .nextDouble();

        double area = (base * height) / 2;

        System.out.println("Area of triangle is: " + area );
    }
}
