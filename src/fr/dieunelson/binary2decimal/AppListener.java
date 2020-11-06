package fr.dieunelson.binary2decimal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class AppListener implements ActionListener {

    private Ui ui;
    private AppNeuralNetwork eventListener;

    public AppListener(Ui ui, AppNeuralNetwork eventListener){
        this.ui = ui;
        this.eventListener = eventListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ui.getOne_btn())){
            this.ui.toggleBit(0);
            this.eventListener.one();
        }else if (e.getSource().equals(ui.getTwo_btn())){
            ui.toggleBit(1);
            eventListener.two();
        }else if (e.getSource().equals(ui.getFour_btn())){
            ui.toggleBit(2);
            eventListener.four();
        }else if (e.getSource().equals(ui.getEight_btn())){
            ui.toggleBit(3);
            eventListener.eight();
        }else if (e.getSource().equals(ui.getRunButton())){
            try {
                this.eventListener.run();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void setValue(Double value){
        ui.getValue().setText(value.toString());
    }
}
