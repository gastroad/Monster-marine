package com.monstermarine.api.category;

import java.util.List;
import java.util.Map;

/**
 * @업무명			: 카테고리 관리
 * @프로그램 설명	: 카테고리 관리 Service
 * @FileName		: CategoryService.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력			:
 */
public interface CategoryService {

	/**
	 * 카테고리 그룹 상세 조회
	 */
	public Map<?, ?> getCategoryGroup(Map<String, Object> param) throws Exception;

	/**
	 * 공지사항 그룹 목록 조회
	 */
	public List<?> getCategoryGroupList(Map<String, Object> param) throws Exception;

}
