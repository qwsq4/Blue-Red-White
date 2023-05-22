package model;

import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

public class EndGameGheck extends TimerTask {

    private InterfaceComponents components;

    public EndGameGheck(InterfaceComponents components) {
        this.components = components;
    }

    @Override
    public void run() {
        try {
            gameVictoryCheck(components.getButtonsArray());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void gameVictoryCheck(JButton[] buttons) throws InterruptedException {
        if (components.getGameIsEnd()) {
             return;
        }

        if (buttons[0].getBackground() != Color.white &&
                buttons[0].getBackground() == buttons[1].getBackground() &&
                buttons[0].getBackground() == buttons[2].getBackground()
                ||
                buttons[0].getBackground() != Color.white &&
                        buttons[0].getBackground() == buttons[3].getBackground() &&
                        buttons[0].getBackground() == buttons[6].getBackground()
                ||
                buttons[0].getBackground() != Color.white &&
                buttons[0].getBackground() == buttons[4].getBackground() &&
                        buttons[0].getBackground() == buttons[8].getBackground()) {
            if (buttons[0].getBackground() == Color.blue) {
                components.setGameIsEnd(true);
                components.getTextArea().append("Синие выиграли! \n");
                System.out.println("Синие выиграли!");
                return;
            } else {
                components.setGameIsEnd(true);
                components.getTextArea().append("Красные выиграли! \n");
                System.out.println("Красные выиграли!");
                return;
            }
        }

            if (buttons[3].getBackground() != Color.white &&
                    buttons[3].getBackground() == buttons[4].getBackground() &&
                    buttons[3].getBackground() == buttons[5].getBackground()) {
                if (buttons[3].getBackground() == Color.blue) {
                    components.setGameIsEnd(true);
                    components.getTextArea().append("Синие выиграли! \n");
                    System.out.println("Синие выиграли!");
                    return;
                } else {
                    components.setGameIsEnd(true);
                    components.getTextArea().append("Красные выиграли! \n");
                    System.out.println("Красные выиграли!");
                    return;
                }
            }

            if (buttons[6].getBackground() != Color.white &&
                    buttons[6].getBackground() == buttons[7].getBackground() &&
                    buttons[6].getBackground() == buttons[8].getBackground()
                    ||
                    buttons[6].getBackground() != Color.white &&
                            buttons[6].getBackground() == buttons[7].getBackground() &&
                            buttons[6].getBackground() == buttons[8].getBackground()) {
                    if (buttons[6].getBackground() == Color.blue) {
                        components.setGameIsEnd(true);
                        components.getTextArea().append("Синие выиграли! \n");
                        System.out.println("Синие выиграли!");
                        return;
                    } else {
                        components.setGameIsEnd(true);
                        components.getTextArea().append("Красные выиграли! \n");
                        System.out.println("Красные выиграли!");
                        return;
                    }
                }

                if (buttons[1].getBackground() != Color.white &&
                        buttons[1].getBackground() == buttons[4].getBackground() &&
                        buttons[1].getBackground() == buttons[7].getBackground()) {
                    if (buttons[1].getBackground() == Color.blue) {
                        components.setGameIsEnd(true);
                        components.getTextArea().append("Синие выиграли! \n");
                        System.out.println("Синие выиграли!");
                    } else {
                        components.setGameIsEnd(true);
                        components.getTextArea().append("Красные выиграли! \n");
                        System.out.println("Красные выиграли!");
                        return;
                    }
                }

        if (buttons[2].getBackground() != Color.white &&
                buttons[2].getBackground() == buttons[4].getBackground() &&
                buttons[2].getBackground() == buttons[6].getBackground()
                ||
                buttons[2].getBackground() != Color.white &&
                        buttons[2].getBackground() == buttons[5].getBackground() &&
                        buttons[2].getBackground() == buttons[8].getBackground()) {
            if (buttons[2].getBackground() == Color.blue) {
                components.setGameIsEnd(true);
                components.getTextArea().append("Синие выиграли! \n");
                System.out.println("Синие выиграли!");
                return;
            } else {
                components.setGameIsEnd(true);
                components.getTextArea().append("Красные выиграли!\n");
                System.out.println("Красные выиграли!");
                return;
            }
        }

        for (JButton button:buttons) {
            if (button.getBackground() == Color.white) {
                return;
            }
        }
        components.getTextArea().append("Ничья! \n");
        System.out.println("Ничья!");
        components.setGameIsEnd(true);
    }
}
