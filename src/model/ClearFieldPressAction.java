package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearFieldPressAction implements ActionListener {

    private ButtonPressAction buttonPressAction;

    private InterfaceComponents components;

    public ClearFieldPressAction(InterfaceComponents components, ButtonPressAction buttonPressAction) {
        this.buttonPressAction = buttonPressAction;
        this.components = components;
    }

    @Override
    public synchronized void actionPerformed(ActionEvent e) {
        notifyAll();
        components.setGameIsEnd(false);
        buttonPressAction.setCount(0);

        JButton[] buttons = components.getButtonsArray();
        for (JButton button : buttons) {
            button.setBackground(Color.white);
        }
        components.getTextArea().append("Поле очищено! \n");
        System.out.println("Поле очищено!");
    }
}
