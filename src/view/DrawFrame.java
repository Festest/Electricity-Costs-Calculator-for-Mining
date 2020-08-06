package view;

import model.Calculator;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    public DrawFrame(Calculator calculator) {
        /* Create a frame for the GUI */
        super("Electricity Costs Calculator");

        /* Make sure our program exits when we close the frame */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Add a menu to the frame */
//        setJMenuBar(new ButtonMenu(calculator));

        /* Create a view for the game */
        DrawPanel panel = new DrawPanel(calculator);

        /* Create a controller for the mouse input */
//        new SelectionController(calculator, panel);

        /* Add the view to the frame */
        add(panel);

        /* Set the size of the frame */
        setPreferredSize(new Dimension(1600, 900));  // real panel is 1583x834 for some unknown reason

        /* Set minimum size*/
        setMinimumSize(new Dimension(858, 480));

        /* Try to make all the components at or above their preferred size */
        pack();

        /* Center the frame on the screen */
        setLocationRelativeTo(null);

        /* Make sure we can actually see the frame */
        setVisible(true);
    }
}
