import java.util.Scanner;

abstract class Person {
    abstract void introduce();

    public void greet() {
        System.out.println("Hello!");
    }
}

enum Gender {
    MALE, FEMALE, OTHER;
}

interface Identifiable {
    void displayID();
}

strictfp public class JavaKeywordsExample extends Person implements Identifiable {

    private static final double PI = 3.14159; // final constant
    private static boolean isJavaFun = true; // boolean variable
    private static int age = 25; // int variable
    private static Gender gender = Gender.MALE; // enum variable
    private static int count = 0;

    private String name; // private variable
    public int studentId; // public variable
    protected String course; // protected variable

    public JavaKeywordsExample(String name, int studentId, String course) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
        count++; // Increment static count
    }

    public void displayID() {
        System.out.println("Student ID: " + studentId);
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }

    public void checkGender() {
        switch (gender) {
            case MALE:
                System.out.println("Gender: Male");
                break;
            case FEMALE:
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Gender: Other");
                break;
        }
    }

    public static void main(String[] args) {
        assert isJavaFun : "Java is not fun!"; // assert statement

        JavaKeywordsExample student1 = new JavaKeywordsExample("Alice", 101, "Computer Science");
        student1.introduce(); // Method call to abstract method
        student1.displayID(); // Calling method from interface
        student1.checkGender(); // Calling method with 'switch' and 'case'

        // Using try-catch-finally block
        try {
            int result = 10 / 0; // Division by zero to trigger an exception
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }

        // Correct usage of synchronized block
        synchronized (student1) {
            System.out.println("Synchronizing access to student1 object");
        }

        // Using instanceof
        if (student1 instanceof JavaKeywordsExample) {
            System.out.println("student1 is an instance of JavaKeywordsExample.");
        }

        // Using strictfp
        float result = (float) Math.PI * 2;  // No longer using strictfp on variable
        System.out.println("Strictfp result: " + result);

        // Using 'return' from a method
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);

        // Using 'volatile' (removed for local variable, not needed)
        boolean isRunning = true;
        System.out.println("Is running: " + isRunning);

        // Using 'super' to call parent class method
        student1.greet(); // This calls the greet() method from the Person class via 'super'

        // Using 'static' field (count)
        System.out.println("Number of students: " + count);

        // Using 'throw' and 'throws'
        try {
            checkEligibility(0); // Will throw an exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkEligibility(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible.");
        } else {
            System.out.println("Eligible!");
        }
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
