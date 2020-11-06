package fr.dieunelson.binary2decimal;

import fr.dieunelson.neuralnetwork.NeuralNetwork;
import fr.dieunelson.neuralnetwork.Task;

public class App {

    private Ui ui;
    private AppNeuralNetwork network;

    public App(){
        network = new AppNeuralNetwork();
        ui = new Ui(network);

    }

    public static void main(String[] args) {
        new App().ui.start();
    }
}
