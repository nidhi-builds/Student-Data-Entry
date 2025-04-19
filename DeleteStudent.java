public class DeleteStudent {
    public static void delete() throws StudentNotFoundException {
        if (Student.id == 0) {
            throw new StudentNotFoundException("No student to delete.");
        }

        Student.id = 0;
        Student.name = null;
        Student.email = null;
        System.out.println("Student deleted.");
    }
}

