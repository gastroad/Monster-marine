package com.monstermarine.api.category;

import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface CategoryMapper {

	/**
	 * 카테고리 상세 조회
	 */
	public CategoryVO getCategory(CategoryVO categoryVO) throws Exception;

	/**
	 * 카테고리 그룹 조회
	 */
	public List getCategoryList(CategoryVO categoryVO) throws Exception;

	/**
	 * 카데고리 DEPTH1 조회
	 */
	public List getCategoryDepth1(CategoryVO categoryVO) throws Exception;

	/**
	 * 카데고리 DEPTH2 조회
	 */
	public List getCategoryDepth2(CategoryVO categoryVO) throws Exception;
}
