package fr.dieunelson.binary2decimal;

import fr.dieunelson.neuralnetwork.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class AppCenterTask implements Task {

    public AppCenterTask(){

    }

    @Override
    public Double run(ArrayList<Double> values) {
        Double value = 0.0;
        for (Double d: values) {
            value+=d;
        }
        return value;
    }

    @Override
    public Double run(Double value) {
        return 0.0;
    }

    @Override
    public Double run(HashMap<String, Object> env, Double value) {
        return value;
    }
}
