public class CollegeStudent extends Student {
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender, String studentId, double gpa, String major, int year) {
        super(name, age, gender, studentId, gpa);
        this.major = validateString(major, "Major");
        this.year = validateYear(year);
    }

    // Getters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setMajor(String major) {
        this.major = validateString(major, "Major");
    }

    public void setYear(int year) {
        this.year = validateYear(year);
    }

    // Validation
    private int validateYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Year must be 1 or greater.");
        }
        return year;
    }

    // General Method
    public void displayCollegeStudentDetails() {
        super.displayStudentDetails();
        System.out.printf("Major: %s, Year: %d%n", major, year);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", CollegeStudent [Major: %s, Year: %d]", major, year);
    }
}
