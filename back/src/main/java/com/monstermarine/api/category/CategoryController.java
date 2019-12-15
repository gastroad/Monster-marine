package com.monstermarine.api.category;

import com.monstermarine.common.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @프로그램명		: 카테고리
 * @프로그램 설명 	: 카테고리 Controller
 * @FileName		: CategoryController.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryMapper categoryMapper;
	
	/**
	 * 카테고리 상세 조회
	 */
	@RequestMapping(value = "/{categoryId}", method = RequestMethod.GET)
	public Map getCategory(CategoryVO categoryVO, @PathVariable int categoryId) throws Exception {
		categoryVO.setCategoryId(categoryId);
		return CommonUtil.coverVoToMap("category", categoryMapper.getCategory(categoryVO));
	}

	/**
	 * 카테고리 목록 조회
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map getCategoryList(CategoryVO categoryVO) throws Exception {
		List returnDataList = new ArrayList();
		List categoryDepth1DataList = categoryMapper.getCategoryDepth1(categoryVO);

		for (int i = 0; i < categoryDepth1DataList.size(); i++) {
			// temp 변수 선언
			Map tmpData = new HashMap();
			Map categoryDepth1Data = (HashMap) categoryDepth1DataList.get(i);

			// param 변수 선언
			CategoryVO categoryVO2 = new CategoryVO();
			categoryVO2.setDepth1((String) categoryDepth1Data.get("depth1"));

			// data 조회
			tmpData.put("depth2", categoryMapper.getCategoryDepth2(categoryVO2));
			tmpData.put("name", categoryDepth1Data.get("name"));
			tmpData.put("categoryId", categoryDepth1Data.get("categoryId"));

			// data 추가
			returnDataList.add(tmpData);
		}

		return CommonUtil.coverListToMap("category", returnDataList);
	}

}
