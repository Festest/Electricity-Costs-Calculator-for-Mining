package view;

import model.Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class DrawPanel extends JPanel implements Observer {
    private Calculator calculator;

    public DrawPanel(Calculator calculator) {
        this.calculator = calculator;
        setBackground(Color.GRAY);
        calculator.addObserver(this);
    }

    public void textBoxes() {
        TextField highWattage = new TextField("170", 5);
        TextField lowWattage = new TextField("40", 5);
        add(highWattage);
        add(lowWattage);
        setVisible(true);
    }

    public void checkBoxes() {
        JCheckBox checkBox = new JCheckBox("Summer Time");
        add(checkBox);
        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        checkBoxes();
        textBoxes();
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
