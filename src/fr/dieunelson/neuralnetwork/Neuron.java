package fr.dieunelson.neuralnetwork;

import java.util.HashMap;

public class Neuron extends Thread{

    private SynapseInput input;
    private SynapseOutput output;
    private Task task;
    private HashMap<String,Object> env;

    public Neuron(SynapseInput input, SynapseOutput output, Task task){
        this.input = input;
        this.output = output;
        this.task = task;
    }

    public Neuron(Task task){
        this(new SynapseInput(), new SynapseOutput(), task);
    }

    @Override
    public void run() {
        synchronized (this.input.lock){
            try {
                this.input.lock.wait();
                Double content = this.input.getContent();
                Double value = this.task.run(content);
                this.output.setContent(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public SynapseInput getInput() {
        return input;
    }

    public SynapseOutput getOutput() {
        return output;
    }

    public Task getTask() {
        return task;
    }
}
