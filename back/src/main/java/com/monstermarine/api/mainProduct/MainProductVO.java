package com.monstermarine.api.mainProduct;

/**
 * @프로그램명		: 메인 상품
 * @프로그램 설명 	: 메인 상품 VO
 * @FileName		: MainProductVO.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
public class MainProductVO {

    private int mainProductId;
    private String status;
    private int categoryId;
    private String categoryName;
    private int productId;

    public int getMainProductId() {
        return mainProductId;
    }

    public void setMainProductId(int mainProductId) {
        this.mainProductId = mainProductId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

}
