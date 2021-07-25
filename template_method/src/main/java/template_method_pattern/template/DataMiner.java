package main.java.template_method_pattern.template;
import java.awt.Desktop;
import java.io.*;


public abstract class DataMiner {

    public void execute(){
        openFile();
        geek();
        extractDoc();
        parsingDoc();
        analysisData();
        report();
        closeFile();
    }

    //파일 열기 -> 파일에서 문서 추출 -> 추출된 문서 파싱 -> 파싱된 데이터 분석 -> 보고 -> 파일 닫기" 순으로 진행
    protected abstract void extractDoc();
    protected abstract void parsingDoc();
    protected abstract void geek();

    public void openFile(){
        System.out.println("File opened");
    }

    public void analysisData(){
        System.out.println("Start analysing data");
    }

    public void report(){
        System.out.println("Start report data");
    }

    public void closeFile(){
        System.out.println("File Close");
    }



}
