import java.util.Scanner;

public class AddStudent {
    public static void add() throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (id <= 0) {
            throw new InvalidInputException("ID must be positive.");
        }

        sc.nextLine();  // Consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        if (name.length() < 2) {
            throw new InvalidInputException("Name must have at least 2 characters.");
        }

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        if (!email.contains("@")) {
            throw new InvalidInputException("Email format is invalid.");
        }

        Student student = new Student(id, name, email);
        System.out.println("Student added: " + Student.name);
    }
}

