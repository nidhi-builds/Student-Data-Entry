/*
Name: Nidhi Pandit
PRN: 23070126081
Batch: B1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Data Entry System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> AddStudent.add();
                    case 2 -> ViewStudent.view();
                    case 3 -> UpdateStudent.update();
                    case 4 -> DeleteStudent.delete();
                    case 5 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid option!");
                }
            } catch (InvalidInputException | StudentNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 5);

        sc.close();
    }
}
