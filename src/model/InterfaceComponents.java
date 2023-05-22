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

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    private JButton[] buttonsArray;

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

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public JButton[] getButtonsArray() {
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

        buttonsArray = new JButton[9];

        button1 = new JButton("1");
        button1.setBackground(Color.white);
        button1.setIcon(clearFieldIcon);
        button1.setBounds(10, 100, 200, 200);
        button1.addActionListener(buttonListener);

        button2 = new JButton("2");
        button2.setBackground(Color.white);
        button2.setIcon(clearFieldIcon);
        button2.setBounds(210, 100, 200, 200);
        button2.addActionListener(buttonListener);

        button3 = new JButton("3");
        button3.setBackground(Color.white);
        button3.setIcon(clearFieldIcon);
        button3.setBounds(410, 100, 200, 200);
        button3.addActionListener(buttonListener);

        button4 = new JButton("4");
        button4.setBackground(Color.white);
        button4.setIcon(clearFieldIcon);
        button4.setBounds(10, 300, 200, 200);
        button4.addActionListener(buttonListener);

        button5 = new JButton("5");
        button5.setBackground(Color.white);
        button5.setIcon(clearFieldIcon);
        button5.setBounds(210, 300, 200, 200);
        button5.addActionListener(buttonListener);

        button6 = new JButton("6");
        button6.setBackground(Color.white);
        button6.setIcon(clearFieldIcon);
        button6.setBounds(410, 300, 200, 200);
        button6.addActionListener(buttonListener);

        button7 = new JButton("7");
        button7.setBackground(Color.white);
        button7.setIcon(clearFieldIcon);
        button7.setBounds(10, 500, 200, 200);
        button7.addActionListener(buttonListener);

        button8 = new JButton("8");
        button8.setBackground(Color.white);
        button8.setIcon(clearFieldIcon);
        button8.setBounds(210, 500, 200, 200);
        button8.addActionListener(buttonListener);

        button9 = new JButton("9");
        button9.setBackground(Color.white);
        button9.setIcon(clearFieldIcon);
        button9.setBounds(410, 500, 200, 200);
        button9.addActionListener(buttonListener);

        buttonsArray[0] = button1;
        buttonsArray[1] = button2;
        buttonsArray[2] = button3;
        buttonsArray[3] = button4;
        buttonsArray[4] = button5;
        buttonsArray[5] = button6;
        buttonsArray[6] = button7;
        buttonsArray[7] = button8;
        buttonsArray[8] = button9;

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
