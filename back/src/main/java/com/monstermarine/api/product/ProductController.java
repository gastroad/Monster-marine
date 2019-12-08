package com.monstermarine.api.product;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

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
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired 
	MappingJackson2JsonView jsonView;
	
	/**
	 * 상품 상세 조회
	 */
	@RequestMapping(value = "/product/{productSeq}", method = RequestMethod.GET)
	public ModelAndView getProduct(@PathVariable String productSeq, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		param.put("productSeq", productSeq);
		mav.addObject("RESULT", productService.getProduct(param));
		
		return mav;
		
	}
	
	/**
	 * 상품 목록 조회 
	 */
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView getProductList(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		mav.addObject("RESULT", productService.getProductList(param));
		
		return mav;
		
	}
	
	/**
	 * 상품 등록
	 */
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public ModelAndView insertProduct(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		mav.addObject("RESULT", productService.insertProudct(param));

		return mav;
		
	}
	
	/**
	 * 상품 수정
	 */
	@RequestMapping(value = "/product/{productSeq}", method = RequestMethod.PUT)
	public ModelAndView updateProduct(@PathVariable String productSeq, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		param.put("productSeq", productSeq);
		mav.addObject("RESULT", productService.updateProduct(param));

		return mav;
		
	}
	
	/**
	 * 상품 삭제
	 */
	@RequestMapping(value = "/product/{productSeq}/delete", method = RequestMethod.PUT)
	public ModelAndView deleteProduct(@PathVariable String productSeq, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		param.put("productSeq", productSeq);
		mav.addObject("RESULT", productService.deleteProduct(param));
		
		return mav;
		
	}
	
}
