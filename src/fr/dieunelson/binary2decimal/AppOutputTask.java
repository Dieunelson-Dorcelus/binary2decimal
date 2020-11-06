package fr.dieunelson.binary2decimal;

import fr.dieunelson.neuralnetwork.Task;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;

public class AppOutputTask implements Task {

    private int number;
    private AppListener appListener;

    public AppOutputTask(int number, AppListener appListener){
        this.number = number;
        this.appListener = appListener;
    }
    
    @Override
    public Double run(ArrayList<Double> values) {
        Double value = 0.0;
        for (Double d: values) {
            value+=d;
        }
        return run(value);
    }

    @Override
    public Double run(Double value) {
        if (number==value.intValue()){
            appListener.setValue(value);
        }
        return value;
    }

    @Override
    public Double run(HashMap<String, Object> env, Double value) {
        return value;
    }
}
