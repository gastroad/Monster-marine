package com.monstermarine.api.category;

import com.monstermarine.common.CommonService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @업무명			: 카테고리 관리
 * @프로그램 설명	: 카테고리 관리 ServiceImpl
 * @FileName		: CategoryServiceImpl.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력			:
 */
@Service
public class CategoryServiceImpl extends CommonService implements CategoryService {

	/**
	 * 카테고리 그룹 상세 조회
	 */
	@Override
	public Map<?, ?> getCategoryGroup(Map<String, Object> param) throws Exception {
		return super.commonDAO.select("category.getCategoryGroup", param);
	}

	/**
	 * 카테고리 그룹 목록 조회
	 */
	@Override
	public List<?> getCategoryGroupList(Map<String, Object> param) throws Exception {
		return super.commonDAO.list("category.getCategoryGroupList", param);
	}

}
