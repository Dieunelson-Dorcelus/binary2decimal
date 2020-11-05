package fr.dieunelson.neuralnetwork;

public class SynapseInput extends Synapse{

    @Override
    public Double getContent() throws Exception {
        throw new Exception("SynapseInput can write only !");
    }

    @Override
    public void setContent(Double content) throws Exception {
        super.setContent(content);
    }
}
