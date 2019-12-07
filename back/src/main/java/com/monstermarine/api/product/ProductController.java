package com.monstermarine.api.product;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired 
	MappingJackson2JsonView jsonView;
	
	
	/**
	 * 상품 조회
	 */
	@RequestMapping(value = "/prodct", method = RequestMethod.GET)
	public ModelAndView getProduct(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(); 
		JSONObject json = new JSONObject();
		
		mav.addObject("datalist", productService.getProductList(param));
        mav.setView(jsonView);
		
		return mav;
		
	}
	
	/**
	 * 상품 목록 조회 
	 */
	@RequestMapping(value = "/prodct/{productSeq}", method = RequestMethod.GET)
	public ModelAndView getProductList(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(); 
		JSONObject json = new JSONObject();
		
		//mav.addObject("datalist", boardService.getBoardList(param));
        mav.setView(jsonView);
		
		return mav;
		
	}
	
	/**
	 * 상품 등록
	 */
	@RequestMapping(value = "/prodct", method = RequestMethod.POST)
	public ModelAndView insertProduct(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(); 
		JSONObject json = new JSONObject();
		
		//mav.addObject("datalist", boardService.getBoardList(param));
        mav.setView(jsonView);
		
		return mav;
		
	}
	
	/**
	 * 상품 수정
	 */
	@RequestMapping(value = "/prodct/{productSeq}", method = RequestMethod.PUT)
	public ModelAndView updateProduct(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(); 
		JSONObject json = new JSONObject();
		
		//mav.addObject("datalist", boardService.getBoardList(param));
        mav.setView(jsonView);
		
		return mav;
		
	}
	
	/**
	 * 상품 삭제
	 */
	@RequestMapping(value = "/prodct/{productSeq}/delete", method = RequestMethod.PUT)
	public ModelAndView deleteProduct(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(); 
		JSONObject json = new JSONObject();
		
		//mav.addObject("datalist", boardService.getBoardList(param));
        mav.setView(jsonView);
		
		return mav;
		
	}
	
}
