package com.monstermarine.api.main;

import com.monstermarine.api.banner.BannerVO;
import com.monstermarine.api.notice.NoticeVO;
import com.monstermarine.common.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
@RequestMapping("/main")
public class MainController {
	/*
		Request URL / http://monster-marin.com/api/main/prdocutList?seq=1
		Request URL / http://monster-marin.com/api/main/weeklybest
		Request URL /  http://monster-marin.com/api/main/layout
			-> main banner
			-> sub banner
			-> hot price

	*/
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


	
}
