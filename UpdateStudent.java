import java.util.Scanner;

public class UpdateStudent {
    public static void update() throws StudentNotFoundException {
        if (Student.id == 0) {
            throw new StudentNotFoundException("No student to update.");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new name: ");
        Student.name = sc.nextLine();

        System.out.print("Enter new email: ");
        Student.email = sc.nextLine();

        System.out.println("Student updated successfully.");
    }
}

