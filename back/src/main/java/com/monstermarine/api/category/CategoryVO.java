package com.monstermarine.api.category;

/**
 * @프로그램명		: 카테고리
 * @프로그램 설명 	: 카테고리 VO
 * @FileName		: CategoryVO.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
public class CategoryVO {

    private int categoryId;
    private String groupBy;
    private boolean isUse;
    private String name;
    private String depth1;
    private String depth2;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepth1() {
        return depth1;
    }

    public void setDepth1(String depth1) {
        this.depth1 = depth1;
    }

    public String getDepth2() {
        return depth2;
    }

    public void setDepth2(String depth2) {
        this.depth2 = depth2;
    }

}
