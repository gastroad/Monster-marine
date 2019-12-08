package com.monstermarine.api.notice;

import java.util.List;
import java.util.Map;

/**
 * @업무명			: 공지사항 관리
 * @프로그램 설명	: 공지사항 관리 Service
 * @FileName		: NoticeService.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력			:
 */
public interface NoticeService {

	/**
	 * 공지사항 상세 조회
	 */
	public Map<?, ?> getNotice(Map<String, Object> param) throws Exception;

	/**
	 * 공지사항 목록 조회
	 */
	public List<?> getNoticeList(Map<String, Object> param) throws Exception;

	/**
	 * 공지사항 등록
	 */
	public Map<?, ?> insertNotice(Map<String, Object> param) throws Exception;

	/**
	 * 공지사항 수정
	 */
	public Map<?, ?> updateNotice(Map<String, Object> param) throws Exception;

	/**
	 * 공지사항 삭제
	 */
	public  Map<?, ?> deleteNotice(Map<String, Object> param) throws Exception;

}
