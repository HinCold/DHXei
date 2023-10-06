package com.example.DXHei.entity.DO;

import java.math.BigDecimal;

public class ItemDO {
    private Long id;

    private String actsName;

    private String actsTitle;

    private String actsImg;

    private BigDecimal actsPrice;

    private Integer actsStock;

    private Integer sales;

    private String actsDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActsName() {
        return actsName;
    }

    public void setActsName(String actsName) {
        this.actsName = actsName == null ? null : actsName.trim();
    }

    public String getActsTitle() {
        return actsTitle;
    }

    public void setActsTitle(String actsTitle) {
        this.actsTitle = actsTitle == null ? null : actsTitle.trim();
    }

    public String getActsImg() {
        return actsImg;
    }

    public void setActsImg(String actsImg) {
        this.actsImg = actsImg == null ? null : actsImg.trim();
    }

    public BigDecimal getActsPrice() {
        return actsPrice;
    }

    public void setActsPrice(BigDecimal actsPrice) {
        this.actsPrice = actsPrice;
    }

    public Integer getActsStock() {
        return actsStock;
    }

    public void setActsStock(Integer actsStock) {
        this.actsStock = actsStock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getActsDetail() {
        return actsDetail;
    }

    public void setActsDetail(String actsDetail) {
        this.actsDetail = actsDetail == null ? null : actsDetail.trim();
    }
}