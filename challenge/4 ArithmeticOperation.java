import java.util.Scanner;

class ArithmeticOperation {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome To Om Calculater ");
            System.out.println("Calculate: ");

            int p = input .nextInt();
            int q = input .nextInt();

            int add = p+q;
            int sub = p-q;
            int mul = p*q;
            int div = p/q;
            int mod = p%q;

            System.out.println(add);
            System.out.println(sub);
            System.out.println(mul);
            System.out.println(div);
            System.out.println(mod);
        }

    }