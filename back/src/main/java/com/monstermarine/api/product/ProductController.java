package com.monstermarine.api.product;

import java.util.Map;

import com.monstermarine.common.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @업무명			: 상품 관리
 * @프로그램 설명 	: 상품을 관리한다.
 * @FileName		: ProductController.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    		:
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductMapper productMapper;
	
	/**
	 * 상품 상세 조회
	 */
	@RequestMapping(value = "/{productSeq}", method = RequestMethod.GET)
	public Map getProduct(ProductVO productVO, @PathVariable int productSeq) throws Exception {
		productVO.setProductId(productSeq);
		return CommonUtil.coverVoToMap("product", productMapper.getProduct(productVO));
	}
	
	/**
	 * 상품 목록 조회 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Map getProductList(ProductVO productVO) throws Exception {
		return CommonUtil.coverVoToMap("product", productMapper.getProductList(productVO));
	}
	
	/**
	 * 상품 등록
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Map insertProduct(ProductVO productVO) throws Exception {
		return CommonUtil.isWorkSuccess(productMapper.insertProduct(productVO));
		
	}
	
	/**
	 * 상품 수정
	 */
	@RequestMapping(value = "/{productSeq}", method = RequestMethod.PUT)
	public Map updateProduct(ProductVO productVO, @PathVariable int productSeq) throws Exception {
		return CommonUtil.isWorkSuccess(productMapper.updateProduct(productVO));
	}
	
	/**
	 * 상품 삭제
	 */
	@RequestMapping(value = "/{productSeq}/delete", method = RequestMethod.PUT)
	public Map deleteProduct(ProductVO productVO, @PathVariable int productSeq) throws Exception {
		return CommonUtil.isWorkSuccess(productMapper.deleteProduct(productVO));
	}
	
}
