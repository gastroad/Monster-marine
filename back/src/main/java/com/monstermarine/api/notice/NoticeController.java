package com.monstermarine.api.notice;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monstermarine.common.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @업무명			: 공지사항 관리
 * @프로그램 설명 	: 공지사항을 관리한다.
 * @FileName		: NoticeController.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@Autowired 
	MappingJackson2JsonView jsonView;
	
	/**
	 * 공지사항 상세 조회
	 */
	@RequestMapping(value = "/notice/{noticeId}", method = RequestMethod.GET)
	public ModelAndView getNotice(@PathVariable String noticeId, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(jsonView); 
		param.put("noticeId", noticeId);
		mav.addObject("RESULT", noticeService.getNotice(param));
		
		return mav;
		
	}
	
	/**
	 * 공지사항 목록 조회
	 */
	@RequestMapping(value = "/notice", method = RequestMethod.GET)
	public ModelAndView getNoticeList(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		mav.addObject("RESULT", noticeService.getNoticeList(param));

		return mav;

	}
	
	/**
	 * 공지사항 등록
	 */
	@RequestMapping(value = "/notice", method = RequestMethod.POST)
	public ModelAndView insertNotice(@RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView(jsonView);
		mav.addObject("RESULT", noticeService.insertNotice(param));
		
		return mav;
		
	}
	
	/**
	 * 공지사항 수정
	 */
	@RequestMapping(value = "/notice/{noticeId}", method = RequestMethod.PUT)
	public ModelAndView updateNotice(@PathVariable String noticeId, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(jsonView); 
		param.put("noticeId", noticeId);
		mav.addObject("RESULT", noticeService.updateNotice(param));
		
		return mav;
		
	}
	
	/**
	 * 공지사항 삭제
	 */
	@RequestMapping(value = "/notice/{noticeId}/delete", method = RequestMethod.PUT)
	public ModelAndView deleteNotice(@PathVariable String noticeId, @RequestParam  Map<String, Object> param, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView(jsonView); 
		param.put("noticeId", noticeId);
		mav.addObject("RESULT", noticeService.deleteNotice(param));
		
		return mav;
		
	}
	
}
