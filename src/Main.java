import model.Calculator;
import view.Frame;

/**
 * Main class, initializes the program
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        new Frame(calculator);
    }
}
