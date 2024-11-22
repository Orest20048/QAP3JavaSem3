public class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String name, int age, String gender, String studentId, double gpa) {
        super(name, age, gender);
        this.studentId = validateString(studentId, "Student ID");
        this.gpa = validateGPA(gpa);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = validateString(studentId, "Student ID");
    }

    public void setGpa(double gpa) {
        this.gpa = validateGPA(gpa);
    }

    // Validation
    private double validateGPA(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
        return gpa;
    }

    // General Method
    public void displayStudentDetails() {
        super.displayPersonInfo();
        System.out.printf("Student ID: %s, GPA: %.2f%n", studentId, gpa);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Student [ID: %s, GPA: %.2f]", studentId, gpa);
    }
}
