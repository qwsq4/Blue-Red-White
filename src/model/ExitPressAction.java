package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitPressAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Выход из приложения");
        System.exit(0);
    }
}
