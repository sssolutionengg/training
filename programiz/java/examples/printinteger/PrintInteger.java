import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("You entered: " + number);
    }

}
