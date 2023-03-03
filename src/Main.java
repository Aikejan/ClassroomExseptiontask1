import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.println("First name");
            String firstName = scanner.nextLine();
            System.out.println("last name");
            String lastName = scanner.nextLine();
            System.out.println("Age");
            instagram.setAge(scanner.nextInt());
            if (instagram.getAge() <= 0) {
                throw new BadReguestion("Age can't be null or negative");
            }
        } catch (BadReguestion badReguestion) {
            System.out.println(badReguestion.getMessage());

        }


        try {
            System.out.println("email");
            String a = new Scanner(System.in).nextLine();

            if (!a.contains("@")) {
                System.out.println("No @");
            } else {
                instagram.setEmaill(a);
                System.out.println("Tuura");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
            try {
                System.out.println("Write only number");
                System.out.println("password");
                instagram.setPassword(scanner1.nextInt());
                if (instagram.getPassword() <= 7) {
                    System.out.println("Tuura jazyldy");
                } else {
                    throw new BadReguestion("Invalid password");
                }
            } catch (BadReguestion e1) {
                System.out.println(e1.getMessage());
            }
        }

}

