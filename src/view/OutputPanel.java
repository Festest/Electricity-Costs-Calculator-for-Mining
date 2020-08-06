package view;

import model.Calculator;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class OutputPanel extends JPanel implements Observer {


    public OutputPanel(Calculator calculator) {
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
