package fr.dieunelson.neuralnetwork;

import java.util.ArrayList;

public class Synapse {


    private Double content;
    private Boolean noReset;
    private ArrayList<Neuron> neurons;

    public Synapse(){
        neurons = new ArrayList<>();
        noReset = false;
    }

    public void addNeuron(Neuron n){
        neurons.add(n);
        n.incrementInput();
    }


    public void setContent(Double content) throws Exception {
        this.content = content;
        for (Neuron n : neurons) {
            n.activate(content);
        }
        if (!noReset){
            content = 0.0;
        }
    }

    public Double getContent() throws Exception {
        return content;
    }

    private void setNoReset(Boolean value){
        this.noReset = value;
    }
}
