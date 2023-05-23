package model;

import javax.swing.*;

public class EndGameGheck {

    private InterfaceComponents components;

    public EndGameGheck(InterfaceComponents components) {
        this.components = components;
    }

    public void run() {
        switch (gameVictoryCheck(components.getButtonsArray())) {
            case -1 -> {
                components.setGameIsEnd(true);
                components.getTextArea().append("Ничья! \n");
                System.out.println("Ничья!");
                JOptionPane.showMessageDialog(components.getFrame(), "Ничья!", "Ничья!", JOptionPane.INFORMATION_MESSAGE);
            }
            case 1 -> {
                components.setGameIsEnd(true);
                components.getTextArea().append("Синие выиграли! \n");
                System.out.println("Синие выиграли!");
                JOptionPane.showMessageDialog(components.getFrame(), "Синие выиграли!", "Победа!", JOptionPane.INFORMATION_MESSAGE);
            }
            case 2 -> {
                components.setGameIsEnd(true);
                components.getTextArea().append("Красные выиграли! \n");
                System.out.println("Красные выиграли!");
                JOptionPane.showMessageDialog(components.getFrame(), "Красные выиграли!", "Победа!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

        private synchronized int gameVictoryCheck (BlueRedWhiteButton[][]buttons) {
            int diag1 = 0;
            int diag2 = 0;

            boolean hasEmpty = false;

            for (int i = 0; i < 3; i++) {
                diag1 += buttons[i][i].getCheckInt();
                diag2 += buttons[i][2 - i].getCheckInt();
            }

            if (diag1 == 30 || diag2 == 30) {
                return 1;
            }

            if (diag1 == 600 || diag2 == 600) {
                return 2;
            }

            for (int i = 0; i < 3; i++) {
                int checkX = 0;
                int checkY = 0;
                for (int j = 0; j < 3; j++) {
                    if (buttons[i][j].getCheckInt() == 0) {
                        hasEmpty = true;
                    }
                    checkX += buttons[i][j].getCheckInt();
                    checkY += buttons[j][i].getCheckInt();
                }
                if (checkX == 30 || checkY == 30) {
                    return 1;
                }

                if (checkX == 600 || checkY == 600) {
                    return 2;
                }
            }
            if (hasEmpty) {
                return 0;
            } else return -1;
        }
    }
