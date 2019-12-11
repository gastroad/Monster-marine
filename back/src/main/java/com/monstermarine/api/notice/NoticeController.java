package com.monstermarine.api.notice;

import java.util.List;

import com.monstermarine.common.CommonUtil;
import com.monstermarine.common.JsonUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
	public NoticeVO getNotice(NoticeVO noticeVO, @PathVariable int noticeId) throws Exception {
		noticeVO.setNoticeId(noticeId);
		return noticeMapper.getNotice(noticeVO);
	}

	/**
	 * 공지사항 목록 조회
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List getNoticeList(NoticeVO noticeVO) throws Exception {
		CommonUtil.convertObjectToMap(noticeMapper.getNoticeList(noticeVO));
		return noticeMapper.getNoticeList(noticeVO);
	}

	/**
	 * 공지사항 등록
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public boolean insertNotice(NoticeVO noticeVO) throws Exception {
		return noticeMapper.insertNotice(noticeVO) == 1 ? true : false;
	}
	
	/**
	 * 공지사항 수정
	 */
	@RequestMapping(value = "/{noticeId}", method = RequestMethod.PUT)
	public boolean updateNotice(NoticeVO noticeVO, @PathVariable int noticeId) throws Exception {
		return noticeMapper.updateNotice(noticeVO) == 1 ? true : false;
	}
	
	/**
	 * 공지사항 삭제
	 */
	@RequestMapping(value = "/{noticeId}/delete", method = RequestMethod.PUT)
	public boolean deleteNotice(NoticeVO noticeVO, @PathVariable int noticeId) throws Exception {
		noticeVO.setNoticeId(noticeId);
		return noticeMapper.deleteNotice(noticeVO) == 1 ? true : false;
	}
	
}
