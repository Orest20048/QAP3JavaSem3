public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = validateString(subject, "Subject");
        this.salary = validateSalary(salary);
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = validateString(subject, "Subject");
    }

    public void setSalary(double salary) {
        this.salary = validateSalary(salary);
    }

    // Validation
    private double validateSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        return salary;
    }

    // General Method
    public void displayTeacherInfo() {
        super.displayPersonInfo();
        System.out.printf("Subject: %s, Salary: %.2f%n", subject, salary);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Teacher [Subject: %s, Salary: %.2f]", subject, salary);
    }
}
