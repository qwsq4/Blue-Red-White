package model;

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

        BlueRedWhiteButton[][] buttons = components.getButtonsArray();
        for (BlueRedWhiteButton[] button : buttons) {
            for (BlueRedWhiteButton blueRedWhiteButton : button) {
                blueRedWhiteButton.setBackground(Color.white);
                blueRedWhiteButton.setCheckInt(0);
            }
        }

        components.getTextArea().append("Поле очищено! \n");
        System.out.println("Поле очищено!");
    }
}
