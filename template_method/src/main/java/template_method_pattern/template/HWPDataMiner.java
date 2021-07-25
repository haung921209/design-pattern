package main.java.template_method_pattern.template;

public class HWPDataMiner extends DataMiner{

    @Override
    protected void extractDoc() {
        System.out.println("Extract HWP Dcoument");
    }

    @Override
    protected void parsingDoc() {
        System.out.println("parse HWP document data");
    }


    @Override
    protected void geek(){
        System.out.println("HWP file's extra step");
    }

}
