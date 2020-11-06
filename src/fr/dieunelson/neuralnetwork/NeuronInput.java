package fr.dieunelson.neuralnetwork;

import java.util.ArrayList;

public class NeuronInput{

    private Synapse synapse;
    private Task task;
    private Object lock;
    private String name;

    public NeuronInput(String name, Task task) {
        this.name = name;
        this.task = task;
        synapse = new Synapse();
    }

    public void activate(Double value) throws Exception {
        synapse.setContent(getTask().run(value));
    }

    public Synapse getSynapse() {
        return synapse;
    }

    public Task getTask() {
        return task;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }

    public String getName() {
        return name;
    }
}
