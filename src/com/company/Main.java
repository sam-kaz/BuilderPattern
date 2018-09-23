package com.company;

public class Main {

    public static void main(String[] args) {
    PageBuilder A4=new A4PageBuilder();
    PageDirector pd=new PageDirector(A4);
    pd.makePage();

    Page p=pd.getPageBuilder();
    System.out.println(p.getPageWidth());
        System.out.println(p.getPageHeight());

    }
}
