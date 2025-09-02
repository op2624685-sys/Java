import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication Table:- ");
        System.out.print("Enter which multiplication table you want: ");
        int num = input.nextInt();
        printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }

}
