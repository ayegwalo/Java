import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFXCheck extends Application {

    private static final String COULD_NOT_DETERMINE = "could not determine";
    private static String studentName = COULD_NOT_DETERMINE;

    // Method to get system property by key
    private static String getProperty(String key) {
        try {
            String property = System.getProperty(key);
            return (property != null && !property.isEmpty()) ? property : COULD_NOT_DETERMINE;
        } catch (Throwable t) {
            System.err.println("Could not retrieve property for key: " + key);
            return COULD_NOT_DETERMINE;
        }
    }

    // Method to format the system property information
    private static String getInfo(String propertyFriendly, String propertyKey) {
        return propertyFriendly + ": " + getProperty(propertyKey) + "\n";
    }

    // Method to construct label text with system properties
    private static String getLabelText(String studentName) {
        String text = "Full Name: " + studentName + "\n";
        text += getInfo("Java Version", "java.runtime.version");
        text += getInfo("Java Distribution", "java.vendor.version");
        text += getInfo("JVM", "java.vm.name");
        text += getInfo("JavaFX Version", "javafx.runtime.version");
        text += getInfo("OS", "os.name");
        text += getInfo("OS Version", "os.version");
        text += getInfo("OS Architecture", "os.arch");
        return text;
    }

    // Method to get student name from the console
    private static void getStudentName() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your full name: ");
            JavaFXCheck.studentName = sc.nextLine();
        } catch (Throwable t) {
            System.err.println("Could not retrieve full name");
        }
    }

    // JavaFX start method to set up the UI
    @Override
    public void start(Stage stage) {
        // Creating a label with system properties
        Label info = new Label(getLabelText(studentName));
        info.setStyle("-fx-font-family: 'serif'");

        // Creating the scene with the label
        stage.setScene(new Scene(info, 500, 300));
        stage.setTitle("JavaFX Check");

        // Show the window
        stage.show();
        stage.requestFocus();
    }

    // Main entry point for the application
    public static void main(String[] args) {
        // Get student's name before launching JavaFX
        JavaFXCheck.getStudentName();

        // Launch the JavaFX application
        Application.launch(args);
    }
}
