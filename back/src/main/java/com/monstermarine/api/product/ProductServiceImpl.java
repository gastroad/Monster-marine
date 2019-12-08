package com.monstermarine.api.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.monstermarine.common.CommonService;

/**
 * @업무명			: 상품 관리
 * @프로그램 설명 	: 상품 관리 ServiceImpl
 * @FileName		: ProductServiceImpl.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    		:
 */
@Service
public class ProductServiceImpl extends CommonService implements ProductService {

	/**
	 * 상품 상세 조회
	 */
	@Override
	public Map<?, ?> getProduct(Map<String, Object> param) throws Exception {
		return super.commonDAO.select("product.getProduct", param);
	}

	/**
	 * 상품 목록 조회
	 */
	@Override
	public List<?> getProductList(Map<String, Object> param) throws Exception {
		return super.commonDAO.list("product.getProductList", param);
	}

	/**
	 * 상품 등록
	 */
	@Override
	public Map<?, ?> insertProudct(Map<String, Object> param) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>();

		int success = super.commonDAO.insert("product.insertProduct", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}

		return result;

	}

	/**
	 * 상품 수정
	 */
	@Override
	public Map<?, ?> updateProduct(Map<String, Object> param) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>();

		int success = super.commonDAO.update("product.updateProduct", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}

		return result;

	}

	/**
	 * 상품 삭제
	 */
	@Override
	public Map<?, ?> deleteProduct(Map<String, Object> param) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>();

		int success = super.commonDAO.update("product.deleteProduct", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}

		return result;

	}

}
