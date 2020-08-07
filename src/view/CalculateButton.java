package view;

import controller.Actions.CalculateAction;
import model.Calculator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * The buttons located on the left panel (InputPanel). If pressed it will calculate the values.
 */
public class CalculateButton extends JButton {
    private Calculator calculator;
    private JFormattedTextField miningWattage;
    private JFormattedTextField idleWattage;
    private JCheckBox checkBox;

    public CalculateButton(Calculator calculator, JFormattedTextField miningWattage, JFormattedTextField idleWattage, JCheckBox checkBox) {
        super(new CalculateAction(calculator, miningWattage, idleWattage, checkBox));
        this.calculator = calculator;
        this.miningWattage = miningWattage;
        this.idleWattage = idleWattage;
        this.checkBox = checkBox;
        setButtonProperties();
    }

    /**
     * "ALT + A" will also trigger this button.
     */
    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setMnemonic(KeyEvent.VK_A);
    }

}
