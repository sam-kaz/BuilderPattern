package com.company;

public class A4PageBuilder implements PageBuilder{
    private Page page;

    public A4PageBuilder() {
        this.page = new Page();
    }


    @Override
    public void buildPageWidth() {
        page.setPagewidth(400);
    }

    @Override
    public void buildPageHeigt() {
        page.setPageHeight(1200);
    }

    @Override
    public void buildPageSides() {
        page.setPageSide(2);
    }

    @Override
    public void buildPageType() {
        page.setPageType("Normal Wooden");
    }

    @Override
    public Page getPage() {
        return page;
    }
}
