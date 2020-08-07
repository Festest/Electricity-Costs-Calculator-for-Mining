package controller.Actions;

import model.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * The action to be executed when the Calculate button is pressed.
 */
public class CalculateAction extends AbstractAction {
    private Calculator calculator;
    private JFormattedTextField miningWattage;
    private JFormattedTextField idleWattage;
    private JCheckBox checkBox;

    public CalculateAction(Calculator calculator, JFormattedTextField miningWattage, JFormattedTextField idleWattage, JCheckBox checkBox) {
        super("Calculate");
        this.calculator = calculator;
        this.miningWattage = miningWattage;
        this.idleWattage = idleWattage;
        this.checkBox = checkBox;
    }

    /**
     * Update all the values in the calculator
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.setSummerTime(checkBox.isSelected());
        calculator.setIdleWattage((float) idleWattage.getValue());
        calculator.setMiningWattage((float) miningWattage.getValue());
        calculator.calculate();
    }
}
