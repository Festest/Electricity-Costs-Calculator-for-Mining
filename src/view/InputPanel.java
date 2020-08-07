package view;

import model.Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class InputPanel extends JPanel implements Observer {
    private Calculator calculator;
    private TextField miningWattage;
    private TextField idleWattage;

    public InputPanel(Calculator calculator) {
        this.calculator = calculator;
        setBackground(Color.GRAY);
        calculator.addObserver(this);

        JLabel label1 = new JLabel("Mining Wattage");
        JFormattedTextField miningWattage = new JFormattedTextField();
        miningWattage.setValue(new Float(170));
        JLabel label2 = new JLabel("Idle Wattage");
        JFormattedTextField idleWattage = new JFormattedTextField();
        idleWattage.setValue(new Float(40));
        JCheckBox checkBox = new JCheckBox("Summer Time",true);
        CalculateButton calculateButton = new CalculateButton(calculator, miningWattage, idleWattage, checkBox);

        GroupLayout layout = new GroupLayout(this);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGap(10)
                        .addComponent(label1)
                        .addGap(10)
                        .addComponent(label2)
                        .addGap(10)
                        .addComponent(checkBox)
                        .addGap(10)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGap(10)
                        .addComponent(miningWattage)
                        .addGap(10)
                        .addComponent(idleWattage)
                        .addGap(10)
                        .addComponent(calculateButton)
                        .addGap(10)
                )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGap(10)
                        .addComponent(label1)
                        .addGap(10)
                        .addComponent(miningWattage)
                        .addGap(10)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGap(10)
                        .addComponent(label2)
                        .addGap(10)
                        .addComponent(idleWattage)
                        .addGap(10)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGap(10)
                        .addComponent(checkBox)
                        .addGap(10)
                        .addComponent(calculateButton)
                        .addGap(10)
                )
        );
        this.setLayout(layout);
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
