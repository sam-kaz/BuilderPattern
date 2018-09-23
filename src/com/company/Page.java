package com.company;

public class Page implements PageBluePrint {
    int pageWidth;
    int pageHeight;
    int pageSide;
    String pageType;

    @Override
    public void setPagewidth(int width) {
        this.pageWidth=width;
    }

    @Override
    public void setPageHeight(int height) {
        this.pageHeight=height;
    }

    @Override
    public void setPageSide(int side) {
        this.pageSide=pageSide;
    }

    @Override
    public void setPageType(String type) {
        this.pageType=type;
    }

    public int getPageWidth() {
        return pageWidth;
    }

    public int getPageHeight() {
        return pageHeight;
    }

    public int getPageSide() {
        return pageSide;
    }

    public String getPageType() {
        return pageType;
    }
}
