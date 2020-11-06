package fr.dieunelson.neuralnetwork;

import java.util.ArrayList;
import java.util.HashMap;

public class Neuron extends NeuronInput{


    private ArrayList<Double> values;
    private HashMap<String,Object> env;
    private int nbSynapseInput;

    public Neuron(String name, Task task){
        super(name,task);
        values = new ArrayList<>();
        nbSynapseInput = 0;
    }

    public void incrementInput(){
        nbSynapseInput++;
    }

    @Override
    public void activate(Double value) throws Exception {
        values.add(value);
        if (values.size()>=nbSynapseInput)getSynapse().setContent(getTask().run(values));
    }

    public ArrayList<Double> getValues() {
        return values;
    }

    public void setValues(ArrayList<Double> values) {
        this.values = values;
    }

    public int getNbSynapseInput() {
        return nbSynapseInput;
    }
}
