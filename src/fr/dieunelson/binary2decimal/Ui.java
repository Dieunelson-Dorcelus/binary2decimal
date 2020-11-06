package fr.dieunelson.binary2decimal;

import javax.swing.*;
import java.util.EventListener;


public class Ui {
    private JPanel rootPan;
    private JButton eight_btn;
    private JButton one_btn;
    private JButton four_btn;
    private JButton two_btn;
    private JPanel panel_txt;
    private JLabel one_txt;
    private JLabel two_txt;
    private JLabel four_txt;
    private JLabel eight_txt;
    private JLabel value;
    private JButton runButton;

    public final static String APP_NAME = "Binary2Decimal";
    private JLabel[] bits;
    private AppListener listener;

    public Ui(AppNeuralNetwork eventListener) {

        bits = new JLabel[]{this.one_txt, this.two_txt, this.four_txt, this.eight_txt};
        listener = new AppListener(this, eventListener);

        one_btn.addActionListener(listener);
        two_btn.addActionListener(listener);
        four_btn.addActionListener(listener);
        eight_btn.addActionListener(listener);
        runButton.addActionListener(listener);

        eventListener.init(listener);
    }

    public boolean toggleBit(int index){
        boolean bit = this.bits[index].getText()=="1";
        this.bits[index].setText((bit)? "0" : "1");
        return !bit;
    }

    public void start() {
        JFrame frame = new JFrame(APP_NAME);
        frame.setContentPane(this.rootPan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public JLabel getValue() {
        return value;
    }

    public JButton getEight_btn() {
        return eight_btn;
    }

    public JButton getFour_btn() {
        return four_btn;
    }

    public JButton getOne_btn() {
        return one_btn;
    }

    public JButton getTwo_btn() {
        return two_btn;
    }

    public JButton getRunButton() {
        return runButton;
    }

    public AppListener getListener() {
        return listener;
    }

    public JLabel[] getBits() {
        return bits;
    }
}
