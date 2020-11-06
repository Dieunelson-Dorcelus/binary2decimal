package fr.dieunelson.neuralnetwork;


import java.util.ArrayList;
import java.util.HashMap;

public class NeuralNetwork {

    private HashMap<String,NeuronInput> neurons;
    public Object lock;

    public NeuralNetwork(){
        this.neurons = new HashMap<>();
        this.lock = new Object();
    }

    public void createInputNeuron(String name, Task task){
        this.neurons.put(name, new NeuronInput(name, task));
    }

    public void createOutputNeuron(String name, Task task, String neuronInputName){
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(neuronInputName);
        createOutputNeuron(name, task, inputs);
    }

    public void createOutputNeuron(String name, Task task, ArrayList<String> neuronInputnames){
        NeuronOutput n = new NeuronOutput(name, task);
        this.neurons.put(name, n);
        for (String s: neuronInputnames) {
            neurons.get(s).getSynapse().addNeuron(n);
        }
    }

    public void createNeuron(String name, Task task, String neuronInputName){
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add(neuronInputName);
        createNeuron(name, task, inputs);
    }

    public void createNeuron(String name, Task task, ArrayList<String> neuronInputNames){
        Neuron n = new Neuron(name, task);
        this.neurons.put(name, n);
        for (String s: neuronInputNames) {
            neurons.get(s).getSynapse().addNeuron(n);
        }
    }

    public HashMap<String, NeuronInput> getNeurons() {
        return neurons;
    }
}
