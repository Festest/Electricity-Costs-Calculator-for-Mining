package view;

import model.Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.util.function.ObjDoubleConsumer;

public class OutputPanel extends JPanel implements Observer {
    private Calculator calculator;
    private JLabel highHours;
    private JLabel mediumHours;
    private JLabel lowHours;
    private JLabel monthly;
    private JLabel daily;

    public OutputPanel(Calculator calculator) {
        setBackground(Color.DARK_GRAY);

        this.calculator = calculator;
        this.highHours = new JLabel("<html><font color=\"white\">High Hours Cost: " + calculator.getComputedHigh() + " €</font></html>");
        this.mediumHours = new JLabel("<html><font color=\"white\">Medium Hours Cost: " + calculator.getComputedMedium() + " €</font></html>");
        this.lowHours = new JLabel("<html><font color=\"white\">Low Hours Cost: " + calculator.getComputedLow() + " €</font></html>");
        this.monthly = new JLabel("<html><font color=\"white\">Monthly Cost: " + calculator.getTotal() + " €</font></html>");
        this.daily = new JLabel("<html><font color=\"white\">Daily Cost: " + (calculator.getTotal() / 30) + " €</font></html>");

        GroupLayout layout = new GroupLayout(this);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(highHours)
                                .addComponent(mediumHours)
                                .addComponent(lowHours)
                                .addComponent(monthly)
                                .addComponent(daily)
                        )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(highHours)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(mediumHours)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(lowHours)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(monthly)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(daily)
                        )
        );
        this.setLayout(layout);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void update(Observable o, Object arg) {
        highHours.setText("<html><font color=\"white\">High Hours Cost: " + calculator.getComputedHigh() + " €</font></html>");
        mediumHours.setText("<html><font color=\"white\">Medium Hours Cost: " + calculator.getComputedMedium() + " €</font></html>");
        lowHours.setText("<html><font color=\"white\">Low Hours Cost: " + calculator.getComputedLow() + " €</font></html>");
        monthly.setText("<html><font color=\"white\">Monthly Cost: " + calculator.getTotal() + " €</font></html>");
        daily.setText("<html><font color=\"white\">Daily Cost: " + (calculator.getTotal() / 30) + " €</font></html>");
    }
}
