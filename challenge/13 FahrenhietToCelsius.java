import java.util.Scanner;

class FahrenhietToCelsius{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert fahrenhiet to celsius :-");
        System.out.print("Enter Temp in Fahrenhiet: ");
        Float F = input .nextFloat();
        
        Float C = (F-32) * 5/9;

        System.out.println("Your Temp in Celsius: " + C + " C.");
    }
}