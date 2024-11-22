public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 28, "F");
        person.displayPersonInfo();

        Student student = new Student("John", 20, "M", "ST12345", 3.7);
        student.displayStudentDetails();

        Teacher teacher = new Teacher("Dr. Smith", 40, "M", "Physics", 85000.0);
        teacher.displayTeacherInfo();

        CollegeStudent collegeStudent = new CollegeStudent("Jane", 21, "F", "CS56789", 3.9, "Computer Science", 3);
        collegeStudent.displayCollegeStudentDetails();
    }
}
