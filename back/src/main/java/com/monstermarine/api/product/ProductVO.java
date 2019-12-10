package com.monstermarine.api.product;

import java.sql.Date;

public class ProductVO {

    private int productId;
    private String title;
    private String contents;
    private int price;
    private int attechment1;
    private int attechment2;
    private int attechment3;
    private int attechment4;
    private int attechment5;
    private int attechment6;
    private int attechment7;
    private int attechment8;
    private int attechment9;
    private int attechment10;
    private boolean isDelete;
    private Date createDate;
    private Date updateDate;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAttechment1() {
        return attechment1;
    }

    public void setAttechment1(int attechment1) {
        this.attechment1 = attechment1;
    }

    public int getAttechment2() {
        return attechment2;
    }

    public void setAttechment2(int attechment2) {
        this.attechment2 = attechment2;
    }

    public int getAttechment3() {
        return attechment3;
    }

    public void setAttechment3(int attechment3) {
        this.attechment3 = attechment3;
    }

    public int getAttechment4() {
        return attechment4;
    }

    public void setAttechment4(int attechment4) {
        this.attechment4 = attechment4;
    }

    public int getAttechment5() {
        return attechment5;
    }

    public void setAttechment5(int attechment5) {
        this.attechment5 = attechment5;
    }

    public int getAttechment6() {
        return attechment6;
    }

    public void setAttechment6(int attechment6) {
        this.attechment6 = attechment6;
    }

    public int getAttechment7() {
        return attechment7;
    }

    public void setAttechment7(int attechment7) {
        this.attechment7 = attechment7;
    }

    public int getAttechment8() {
        return attechment8;
    }

    public void setAttechment8(int attechment8) {
        this.attechment8 = attechment8;
    }

    public int getAttechment9() {
        return attechment9;
    }

    public void setAttechment9(int attechment9) {
        this.attechment9 = attechment9;
    }

    public int getAttechment10() {
        return attechment10;
    }

    public void setAttechment10(int attechment10) {
        this.attechment10 = attechment10;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
