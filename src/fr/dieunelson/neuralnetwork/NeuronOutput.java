package fr.dieunelson.neuralnetwork;

public class NeuronOutput extends Neuron{

    private Double value;

    public NeuronOutput(SynapseInput input, Task task) {
        super(input, null, task);
    }

    @Override
    public void run() {
        synchronized (this.getInput().lock){
            try {
                this.getInput().lock.wait();
                Double content = this.getInput().getContent();
                this.value = this.getTask().run(content);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Double getValue() {
        return value;
    }
}
