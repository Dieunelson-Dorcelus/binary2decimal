package fr.dieunelson.neuralnetwork;

public class SynapseOutput extends Synapse{

    @Override
    public Double getContent() throws Exception {
        return super.getContent();
    }

    @Override
    public void setContent(Double content) throws Exception {
        throw new Exception("SynapseOutput can read only !");
    }
}
