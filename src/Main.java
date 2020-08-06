import model.Calculator;
import view.DrawFrame;

/**
 * Main class, initializes the program
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        new DrawFrame(calculator);
    }
}
