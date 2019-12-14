package com.monstermarine.api.main;

import com.monstermarine.api.banner.BannerVO;
import com.monstermarine.common.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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

}
