package fr.dieunelson.neuralnetwork;

import java.util.ArrayList;
import java.util.EventListener;

public class NeuronOutput extends Neuron{

    private Object lock;
    private Double value;

    public NeuronOutput(String name, Task task) {
        super(name,task);
    }

    @Override
    public void activate(Double value) throws Exception {

        getValues().add(value);
        if (getValues().size()>= getNbSynapseInput()){
            this.value = getTask().run(getValues());
            //  Reset
            setValues(new ArrayList<>());
            //  Notify
            if (lock!=null){
                lock.notifyAll();
            }
        }
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }

    public Object getLock() {
        return lock;
    }

    public Double getValue() {
        return value;
    }
}
