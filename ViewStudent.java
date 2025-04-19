public class ViewStudent {
    public static void view() throws StudentNotFoundException {
        if (Student.id == 0) {
            throw new StudentNotFoundException("No student data available.");
        }
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + Student.id);
        System.out.println("Name: " + Student.name);
        System.out.println("Email: " + Student.email);
    }
}

