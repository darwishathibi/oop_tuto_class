public class Student extends Person {
    private int studentId;

    @Override
    protected void displayInfo() {
        super.displayInfo();
        System.out.println("ID: " + studentId);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.studentId = 12345;
        student.displayInfo();
    }
}
