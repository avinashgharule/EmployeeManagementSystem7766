package bgv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class BackgroundVerification {
    public static void main(String[] args) {
        SpringApplication.run(BackgroundVerification.class, args);

        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter name of employee: ");
        String name = scanner.nextLine();

        System.out.print("Enter skills: ");
        String skills = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        boolean isClear = isBackgroundVerificationClear();

        System.out.println("Background Verification Status:");
        System.out.println("Name: " + name);
        System.out.println("Skills: " + skills);
        System.out.println("Address: " + address);
        System.out.println("Clearance: " + (isClear ? "BGV is Clear" : "BGV is Not Clear"));
    }

    private static boolean isBackgroundVerificationClear() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
