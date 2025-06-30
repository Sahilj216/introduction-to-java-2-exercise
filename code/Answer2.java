import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Answer2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("sol2.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Failed to create file");
            e.printStackTrace();
        }

        do {
            try (var br = new BufferedWriter(new FileWriter(file, true))) {
                System.out.println("Create a new User.");
                System.out.print("Enter First Name : ");
                String firstName = input.nextLine();
                System.out.print("Enter Last Name : ");
                String lastName = input.nextLine();
                System.out.print("Enter Age : ");
                int age = input.nextInt();
                input.nextLine(); // consume newline
                System.out.print("Enter Phone Number : ");
                String number = input.nextLine();

                br.write(new User(firstName, lastName, age, number).toString());
                br.newLine();
                br.flush();

                System.out.print("Do you want to create another user? Type QUIT to exit or press Enter to continue: ");
                String line = input.nextLine();
                if (line.equalsIgnoreCase("QUIT")) {
                    break;
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } while (true);

        input.close();
    }
}

class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber=" + phoneNumber + "}";
    }
}

