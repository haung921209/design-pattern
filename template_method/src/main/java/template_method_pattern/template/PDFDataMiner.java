package main.java.template_method_pattern.template;

public class PDFDataMiner extends DataMiner {

    @Override
    protected void extractDoc() {
        System.out.println("Extract PDF Dcoument");
    }

    @Override
    protected void parsingDoc() {
        System.out.println("parse PDF document data");
    }

    @Override
    protected void geek(){

    }

}
