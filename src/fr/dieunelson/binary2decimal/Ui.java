package fr.dieunelson.binary2decimal;

import javax.swing.*;


public class Ui {
    private JPanel panel1;
    private JButton activeButton;
    private JButton activeButton3;
    private JButton activeButton1;
    private JButton activeButton2;

    public final static String APP_NAME = "Binary2Decimal";

    public static void main(String[] args) {
        JFrame frame = new JFrame(APP_NAME);
        frame.setContentPane(new Ui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
