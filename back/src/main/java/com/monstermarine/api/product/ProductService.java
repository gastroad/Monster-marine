package com.monstermarine.api.product;

import java.util.List;
import java.util.Map;

/**
 * @업무명			: 상품 관리
 * @프로그램 설명 	: 상품 관리 Service
 * @FileName		: ProductService.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력			:
 */
public interface ProductService {

	/**
	 * 상품 상세 조회
	 */
	public Map<?, ?> getProduct(Map<String, Object> param) throws Exception;

	/**
	 * 상품 목록 조회
	 */
	public List<?> getProductList(Map<String, Object> param) throws Exception;

	/**
	 * 상품 등록
	 */
	public Map<?, ?> insertProudct(Map<String, Object> param) throws Exception;

	/**
	 * 상품 수정
	 */
	public Map<?, ?> updateProduct(Map<String, Object> param) throws Exception;

	/**
	 * 상품 삭제
	 */
	public Map<?, ?> deleteProduct(Map<String, Object> param) throws Exception;
	
}
