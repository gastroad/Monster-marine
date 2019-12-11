package com.monstermarine.api.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.monstermarine.common.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeMapper noticeMapper;

	/**
	 * 공지사항 상세 조회
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.GET)
	public Map getNotice(NoticeVO noticeVO, @PathVariable int noticeId) throws Exception {
		noticeVO.setNoticeId(noticeId);
		return CommonUtil.coverVoToMap("notice", noticeMapper.getNotice(noticeVO));
	}

	/**
	 * 공지사항 목록 조회
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Map getNoticeList(NoticeVO noticeVO) throws Exception {
		return CommonUtil.coverListToMap("notice", noticeMapper.getNoticeList(noticeVO));
	}

	/**
	 * 공지사항 등록
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Map insertNotice(NoticeVO noticeVO) throws Exception {
		return CommonUtil.isWorkSuccess(noticeMapper.insertNotice(noticeVO));
	}
	
	/**
	 * 공지사항 수정
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.PUT)
	public Map updateNotice(NoticeVO noticeVO, @PathVariable int noticeId) throws Exception {
		return CommonUtil.isWorkSuccess(noticeMapper.updateNotice(noticeVO));
	}
	
	/**
	 * 공지사항 삭제
	 */
	@RequestMapping(value = "/{noticeId}/delete", method = RequestMethod.PUT)
	public Map deleteNotice(NoticeVO noticeVO, @PathVariable int noticeId) throws Exception {
		noticeVO.setNoticeId(noticeId);
		return CommonUtil.isWorkSuccess(noticeMapper.deleteNotice(noticeVO));
	}
	
}
