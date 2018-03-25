package com.mall.common;

public class PagingEntity {
    
    private int page;
    private int startNum;
    private int endNum;
    
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
        
        this.setStartNum((page*10) -9);
        this.setEndNum(page*10);
    }
    public int getStartNum() {
        return startNum;
    }
    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }
    public int getEndNum() {
        return endNum;
    }
    public void setEndNum(int endNum) {
        this.endNum = endNum;
    }
    
}
