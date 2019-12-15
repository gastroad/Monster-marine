package com.monstermarine.api.main;

import com.monstermarine.api.banner.BannerVO;
import com.monstermarine.api.category.CategoryVO;
import com.monstermarine.api.mainProduct.MainProductVO;
import com.monstermarine.common.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @프로그램명		: 메인
 * @프로그램 설명 	: 메인 Controller
 * @FileName		: NoticeController.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
@RestController
@RequestMapping("/main")
public class MainController {

	@Autowired
	private MainMapper mainMapper;

	/**
	 * Banner 목록 조회
	 */
	@RequestMapping(value = "/banner", method = RequestMethod.GET)
	public Map getBannerList(BannerVO bannerVO) throws Exception {
		Map returnData = new HashMap();
		returnData.put("mainBanner", mainMapper.getMainBannerList(bannerVO));
		returnData.put("subBanner", mainMapper.getSubBannerList(bannerVO));

		return CommonUtil.coverListToMap("banner", returnData);
	}

	/**
	 * HotPrice 목록 조회
	 */
	@RequestMapping(value = "/hotPrice", method = RequestMethod.GET)
	public Map getHotPriceList(BannerVO bannerVO) throws Exception {
		return CommonUtil.coverListToMap("hotPrice", mainMapper.getHotPriceList(bannerVO));
	}

	/**
	 * WeeklyBest 목록 조회
	 */
	@RequestMapping(value = "/weeklyBestList", method = RequestMethod.GET)
	public Map getWeeklyBestList(MainProductVO mainProductVO) throws Exception {
		List returnDataList = new ArrayList();
		List weeklyBestCategoryNameList = mainMapper.getWeeklyBestCategoryNameList(mainProductVO);

		for (int i = 0; i < weeklyBestCategoryNameList.size(); i++) {
			// temp 변수 선언
			Map tmpData = new HashMap();
			Map weeklyBestCategoryName = (HashMap) weeklyBestCategoryNameList.get(i);

			// param 변수 선언
			MainProductVO mainProductVO2 = new MainProductVO();
			if (weeklyBestCategoryName.get("categoryId") !=  null) {
				mainProductVO2.setCategoryId((int) weeklyBestCategoryName.get("categoryId"));
			}

			// data 조회
			if (weeklyBestCategoryName.get("categoryId") !=  null) {
				tmpData.put("name", weeklyBestCategoryName.get("categoryName"));
			} else {
				tmpData.put("name", "기타");
			}
			tmpData.put("productList", mainMapper.getWeeklyBestCategoryDataList(mainProductVO2));

			// data 추가
			returnDataList.add(tmpData);
		}

		return  CommonUtil.coverListToMap("weeklyBest", returnDataList);
	}

	/**
	 * 상품 목록 조회
	 */
	@RequestMapping(value = "/productList/{status}", method = RequestMethod.GET)
	public Map getMainProductList(MainProductVO mainProductVO, @PathVariable String status) throws Exception {
		mainProductVO.setStatus(status);
		return CommonUtil.coverListToMap("mainProductList", mainMapper.getMainProductList(mainProductVO));
	}




}
