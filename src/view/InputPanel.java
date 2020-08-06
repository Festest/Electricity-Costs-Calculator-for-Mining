package view;

import model.Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class InputPanel extends JPanel implements Observer {
    private Calculator calculator;
    private TextField highWattage;
    private TextField lowWattage;

    public InputPanel(Calculator calculator) {
        this.calculator = calculator;
        setBackground(Color.GRAY);
        calculator.addObserver(this);

        JLabel label1 = new JLabel("Mining Wattage");
        TextField highWattage = new TextField("170", 5);
        JLabel label2 = new JLabel("Idle Wattage");
        TextField lowWattage = new TextField("40", 5);
        JCheckBox checkBox = new JCheckBox("Summer Time");

        GroupLayout layout = new GroupLayout(this);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(label1)
                    .addGap(10)
                    .addComponent(label2)
                    .addGap(10)
                    .addComponent(checkBox)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(highWattage)
                    .addGap(10)
                    .addComponent(lowWattage)
                )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(label1)
                    .addGap(10)
                    .addComponent(highWattage)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(label2)
                    .addGap(10)
                    .addComponent(lowWattage)
                )
                .addGap(10)
                .addComponent(checkBox)
        );
        this.setLayout(layout);
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
