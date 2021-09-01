import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int age =0;
        System.out.print("What is your age? ");
        age = Scan.nextInt();

        System.out.println("Your maximum heart rate should be " + (220-age) + " beats per minute");
        System.out.println("Your target HR Zone is " + ((220-age)/2) +" - " +((220-age)*85/100) + " beats per minute");
    }
}
