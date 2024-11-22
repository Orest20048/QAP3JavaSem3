public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = validateString(name, "Name");
        this.age = validateAge(age);
        this.gender = validateString(gender, "Gender");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = validateString(name, "Name");
    }

    public void setAge(int age) {
        this.age = validateAge(age);
    }

    public void setGender(String gender) {
        this.gender = validateString(gender, "Gender");
    }

    // Validation Methods
    private int validateAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be a positive integer.");
        }
        return age;
    }

    protected String validateString(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " cannot be empty.");
        }
        return value;
    }

    // General Method
    public void displayPersonInfo() {
        System.out.printf("Name: %s, Age: %d, Gender: %s%n", name, age, gender);
    }

    @Override
    public String toString() {
        return String.format("Person [Name: %s, Age: %d, Gender: %s]", name, age, gender);
    }
}
