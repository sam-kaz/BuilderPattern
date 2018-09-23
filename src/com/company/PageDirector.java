package com.company;

public class PageDirector {
    private PageBuilder pageBuilder;

    public PageDirector(PageBuilder pageBuilder) {
        this.pageBuilder = pageBuilder;
    }

    public Page getPageBuilder(){ return this.pageBuilder.getPage();}


    public void makePage(){
        this.pageBuilder.buildPageWidth();
        this.pageBuilder.buildPageHeigt();
        this.pageBuilder.buildPageSides();
        this.pageBuilder.buildPageType();
    }

}
