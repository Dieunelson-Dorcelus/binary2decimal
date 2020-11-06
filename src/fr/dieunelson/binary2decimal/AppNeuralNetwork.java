package fr.dieunelson.binary2decimal;

import fr.dieunelson.neuralnetwork.NeuralNetwork;
import fr.dieunelson.neuralnetwork.Neuron;
import fr.dieunelson.neuralnetwork.Task;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;

public class AppNeuralNetwork extends NeuralNetwork implements EventListener {

    private boolean active_one;
    private boolean active_two;
    private boolean active_four;
    private boolean active_eight;

    private Double value;

    public AppNeuralNetwork(){
        super();

        active_eight = false;
        active_four = false;
        active_two = false;
        active_one = false;

    }

    public void init(AppListener listener){
        this.createInputNeuron("one", new AppEntryTask(1.0));

        this.createInputNeuron("two", new AppEntryTask(2.0));

        this.createInputNeuron("four", new AppEntryTask(4.0));

        this.createInputNeuron("eight", new AppEntryTask(8.0));

        ArrayList<String> inputs = new ArrayList<>();
        inputs.add("one");
        inputs.add("two");
        inputs.add("four");
        inputs.add("eight");

        this.createNeuron("accumulator", new AppCenterTask(), inputs);


        for (int i = 0; i<=15; i++){
            this.createOutputNeuron(i+"", new AppOutputTask(i, listener), "accumulator");
        }
    }

    public void one(){
        active_one = !active_one;

    }

    public void two(){
        active_two = !active_two;

    }

    public void four(){
        active_four = !active_four;

    }

    public void eight(){
        active_eight = !active_eight;

    }

    public void run() throws Exception {
        if (active_one)getNeurons().get("one").activate(1.0);
        else getNeurons().get("one").activate(0.0);
        if (active_two)getNeurons().get("two").activate(1.0);
        else getNeurons().get("two").activate(0.0);
        if (active_four)getNeurons().get("four").activate(1.0);
        else getNeurons().get("four").activate(0.0);
        if (active_eight)getNeurons().get("eight").activate(1.0);
        else getNeurons().get("eight").activate(0.0);
        ((Neuron)getNeurons().get("accumulator")).getValues().clear();
    }

}
