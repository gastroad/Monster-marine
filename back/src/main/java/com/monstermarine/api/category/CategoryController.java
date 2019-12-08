package com.monstermarine.api.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @업무명			: 카테고리 관리
 * @프로그램 설명 	: 카테고리를 관리한다.
 * @FileName		: CategoryController.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired 
	MappingJackson2JsonView jsonView;
	
	/**
	 * 카테고리 그룹 상세 조회
	 */
	@RequestMapping(value = "/category/{groupBy}/{categorySeq}", method = RequestMethod.GET)
	public ModelAndView getCategory(@PathVariable String groupBy, @PathVariable String categorySeq, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(jsonView);
		param.put("groupBy", groupBy);
		param.put("categorySeq", categorySeq);
		mav.addObject("RESULT", categoryService.getCategoryGroup(param));
		
		return mav;
		
	}
	
	/**
	 * 카테고리 그룹 목록 조회
	 */
	@RequestMapping(value = "/category/{groupBy}", method = RequestMethod.GET)
	public ModelAndView getNoticeList(@PathVariable String groupBy, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		param.put("groupBy", groupBy);
		mav.addObject("RESULT", categoryService.getCategoryGroupList(param));
		
		return mav;
		
	}
	
}
