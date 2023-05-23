package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressAction implements ActionListener {
    private InterfaceComponents components;
    private EndGameGheck endGameGheck;
    private int count = 0;

    public ButtonPressAction(InterfaceComponents components) {
        this.components = components;
        this.endGameGheck = new EndGameGheck(components);
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BlueRedWhiteButton button = (BlueRedWhiteButton) e.getSource();
        JTextArea textArea = components.getTextArea();

        if (components.getGameIsEnd()) {
            textArea.append("Игра окончена! \n");
            System.out.println("Игра окончена!");
            return;
        }

        if (button.getBackground() == Color.white) {
            if (count % 2 != 0) {
                button.setBackground(Color.red);
                button.setCheckInt(200);
                count++;
                textArea.append("Клетка " + button.getText() + " окрасилась в красный! \n");
                System.out.println("Клетка " + button.getText() + " окрасилась в красный!");
            } else {
                button.setBackground(Color.blue);
                button.setCheckInt(10);
                count++;
                textArea.append("Клетка " + button.getText() + " окрасилась в синий! \n");
                System.out.println("Клетка " + button.getText() + " окрасилась в синий!");
            }
        } else {
            textArea.append("Клетка уже закрашена! \n");
            System.out.println("Клетка уже закрашена!");
        }
        endGameGheck.run();
    }
}
