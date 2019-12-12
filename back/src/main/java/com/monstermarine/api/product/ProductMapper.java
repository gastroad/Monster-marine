package com.monstermarine.api.product;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    /**
     * 상품 상세 조회
     */
    public ProductVO getProduct(ProductVO productVO) throws Exception;

    /**
     * 상품 목록 조회
     */
    public List getProductList(ProductVO productVO) throws Exception;

    /**
     * 상품 등록
     */
    public int insertProduct(ProductVO productVO) throws Exception;

    /**
     * 상품 수정
     */
    public int updateProduct(ProductVO productVO) throws Exception;

    /**
     * 상품 삭제
     */
    public int deleteProduct(ProductVO productVO) throws Exception;

}
