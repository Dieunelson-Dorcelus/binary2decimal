package fr.dieunelson.neuralnetwork;

import java.util.ArrayList;
import java.util.HashMap;

public interface Task{
    public Double run(ArrayList<Double> values);
    public Double run(Double value);

    public Double run(HashMap<String, Object> env, Double value);
}
