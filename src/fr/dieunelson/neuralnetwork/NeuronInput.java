package fr.dieunelson.neuralnetwork;

public class NeuronInput extends Neuron{

    public NeuronInput(SynapseOutput output, Task task) {
        super(null, output, task);
    }

    @Override
    public void run() {
        try {
            Double value = this.getTask().run(1.0);
            this.getOutput().setContent(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
