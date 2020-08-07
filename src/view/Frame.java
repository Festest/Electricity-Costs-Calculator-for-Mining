package view;

import model.Calculator;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(Calculator calculator) {
        /* Create a frame for the GUI */
        super("Electricity Costs Calculator");

        /* Make sure our program exits when we close the frame */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Create a view for the game */
        InputPanel inputPanel = new InputPanel(calculator);
        OutputPanel outputPanel = new OutputPanel(calculator);

        /* Position each panel */
        inputPanel.setBounds(0,0,230,115);

        /* Add the view to the frame */
        add(inputPanel);
        add(outputPanel);

        /* Set the size of the frame */
        setPreferredSize(new Dimension(460, 150));

        /* Set minimum size*/
        setResizable(false);

        /* Try to make all the components at or above their preferred size */
        pack();

        /* Center the frame on the screen */
        setLocationRelativeTo(null);

        /* Make sure we can actually see the frame */
        setVisible(true);
    }
}
