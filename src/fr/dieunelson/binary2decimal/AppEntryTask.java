package fr.dieunelson.binary2decimal;

import fr.dieunelson.neuralnetwork.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class AppEntryTask implements Task {

    private Double value;

    public AppEntryTask(Double value){
        this.value = value;
    }

    @Override
    public Double run(ArrayList<Double> values) {
        return 0.0;
    }

    @Override
    public Double run(Double value) {
        if (value==1.0)return this.value;
        return 0.0;
    }

    @Override
    public Double run(HashMap<String, Object> env, Double value) {
        return 0.0;
    }
}
