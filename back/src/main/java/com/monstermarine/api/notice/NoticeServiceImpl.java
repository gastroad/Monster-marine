package com.monstermarine.api.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.monstermarine.common.CommonService;

/**
 * @업무명			: 공지사항 관리
 * @프로그램 설명	: 공지사항 관리 ServiceImpl
 * @FileName		: NoticeServiceImpl.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력			:
 */
@Service
public class NoticeServiceImpl extends CommonService implements NoticeService {

	/**
	 * 공지사항 상세 조회
	 */
	@Override
	public Map<?, ?> getNotice(Map<String, Object> param) throws Exception {
		return super.commonDAO.select("notice.getNotice", param);
	}

	/**
	 * 공지사항 목록 조회
	 */
	@Override
	public List<?> getNoticeList(Map<String, Object> param) throws Exception {
		return super.commonDAO.list("notice.getNoticeList", param);
	}

	/**
	 * 공지사항 등록
	 */
	@Override
	public Map<?, ?> insertNotice(Map<String, Object> param) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>();

		int success = super.commonDAO.insert("notice.insertNotice", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}
		
		return result;

	}

	/**
	 * 공지사항 수정
	 */
	@Override
	public Map<?, ?> updateNotice(Map<String, Object> param) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>();
		
		int success = super.commonDAO.update("notice.updateNotice", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}

		return result;

	}

	/**
	 * 공지사항 삭제
	 */
	@Override
	public  Map<?, ?> deleteNotice(Map<String, Object> param) throws Exception {

		Map<String, Object> result = new HashMap<String, Object>();
		
		int success = super.commonDAO.update("notice.deleteNotice", param);
		if (success == 1) {
			result.put("SUCCESS", true);
		} else {
			result.put("SUCCESS", false);
		}

		return result;
		
	}

}
