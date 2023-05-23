package model;

import javax.swing.*;

public class BlueRedWhiteButton extends JButton {

    private int checkInt;

    public BlueRedWhiteButton(int checkInt) {
        this.checkInt = checkInt;
    }

    public int getCheckInt() {
        return checkInt;
    }

    public void setCheckInt(int checkInt) {
        this.checkInt = checkInt;
    }
}
