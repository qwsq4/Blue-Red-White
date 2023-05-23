package model;

import javax.swing.*;
import java.awt.*;

public class InterfaceComponents {

    private JFrame frame;

    private JMenuBar menuBar;

    private ButtonPressAction buttonListener;
    private ClearFieldPressAction clearMenuListener;
    private ExitPressAction exitMenuListener;

    private JTextArea textArea;

    private BlueRedWhiteButton button1;
    private BlueRedWhiteButton button2;
    private BlueRedWhiteButton button3;
    private BlueRedWhiteButton button4;
    private BlueRedWhiteButton button5;
    private BlueRedWhiteButton button6;
    private BlueRedWhiteButton button7;
    private BlueRedWhiteButton button8;
    private BlueRedWhiteButton button9;

    private BlueRedWhiteButton[][] buttonsArray;

    private boolean gameIsEnd = false;

    public boolean getGameIsEnd() {
        return gameIsEnd;
    }

    public void setGameIsEnd(boolean gameIsEnd) {
        this.gameIsEnd = gameIsEnd;
    }

    public JFrame getFrame() {
        return frame;
    }

    public ButtonPressAction getButtonListener() {
        return buttonListener;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public BlueRedWhiteButton[][] getButtonsArray() {
        return buttonsArray;
    }

    public void initializate() {

        frame = new JFrame("Blue-Red-White");
        frame.setSize(1200, 1100);
        frame.setLayout(null);
        frame.setVisible(true);

        buttonListener = new ButtonPressAction(this);
        clearMenuListener = new ClearFieldPressAction(this, buttonListener);
        exitMenuListener = new ExitPressAction();

        menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");


        JMenuItem clearMenuItem = new JMenuItem("Очистить");
        clearMenuItem.addActionListener(clearMenuListener);

        JMenuItem exitMenuItem = new JMenuItem("Выход");
        exitMenuItem.addActionListener(exitMenuListener);

        fileMenu.add(clearMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        textArea = new JTextArea();
        textArea.setBounds(630, 100, 400, 600);
        textArea.setBackground(Color.gray);
        textArea.setVisible(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(630, 100, 400, 600);

        Icon clearFieldIcon = new ImageIcon("icons/Clear_field.png");

        buttonsArray = new BlueRedWhiteButton[3][3];

        button1 = new BlueRedWhiteButton(0);
        button1.setBackground(Color.white);
        button1.setIcon(clearFieldIcon);
        button1.setBounds(10, 100, 200, 200);
        button1.addActionListener(buttonListener);

        button2 = new BlueRedWhiteButton(0);
        button2.setBackground(Color.white);
        button2.setIcon(clearFieldIcon);
        button2.setBounds(210, 100, 200, 200);
        button2.addActionListener(buttonListener);

        button3 = new BlueRedWhiteButton(0);
        button3.setBackground(Color.white);
        button3.setIcon(clearFieldIcon);
        button3.setBounds(410, 100, 200, 200);
        button3.addActionListener(buttonListener);

        button4 = new BlueRedWhiteButton(0);
        button4.setBackground(Color.white);
        button4.setIcon(clearFieldIcon);
        button4.setBounds(10, 300, 200, 200);
        button4.addActionListener(buttonListener);

        button5 = new BlueRedWhiteButton(0);
        button5.setBackground(Color.white);
        button5.setIcon(clearFieldIcon);
        button5.setBounds(210, 300, 200, 200);
        button5.addActionListener(buttonListener);

        button6 = new BlueRedWhiteButton(0);
        button6.setBackground(Color.white);
        button6.setIcon(clearFieldIcon);
        button6.setBounds(410, 300, 200, 200);
        button6.addActionListener(buttonListener);

        button7 = new BlueRedWhiteButton(0);
        button7.setBackground(Color.white);
        button7.setIcon(clearFieldIcon);
        button7.setBounds(10, 500, 200, 200);
        button7.addActionListener(buttonListener);

        button8 = new BlueRedWhiteButton(0);
        button8.setBackground(Color.white);
        button8.setIcon(clearFieldIcon);
        button8.setBounds(210, 500, 200, 200);
        button8.addActionListener(buttonListener);

        button9 = new BlueRedWhiteButton(0);
        button9.setBackground(Color.white);
        button9.setIcon(clearFieldIcon);
        button9.setBounds(410, 500, 200, 200);
        button9.addActionListener(buttonListener);

        buttonsArray[0] = new BlueRedWhiteButton[] {button1, button2, button3};
        buttonsArray[1] = new BlueRedWhiteButton[] {button4, button5, button6};
        buttonsArray[2] = new BlueRedWhiteButton[] {button7, button8, button9};

        frame.setJMenuBar(menuBar);

        frame.add(scrollPane);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
    }
}
