package main.java.template_method_pattern.template;

public class DOCDataMiner extends DataMiner{

    @Override
    protected void extractDoc() {
        System.out.println("Extract DOC Dcoument");
    }

    @Override
    protected void parsingDoc() {
        System.out.println("parse DOC document data");
    }

    @Override
    protected void geek(){

    }

}
