package fr.dieunelson.neuralnetwork;

public class Synapse {


    private Double content;
    private Boolean noReset;
    public Object lock;

    public Synapse(){}


    public void setContent(Double content) throws Exception {
        this.content = content;
        lock.notifyAll();
    }

    public Double getContent() throws Exception {
        Double tmp = this.content;
        if (!this.noReset)this.content = 0.0;
        return tmp;
    }

    private void setNoReset(Boolean value){
        this.noReset = value;
    }
}
