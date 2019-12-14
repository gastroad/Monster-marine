package com.monstermarine.api.main;

import com.monstermarine.api.banner.BannerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @프로그램명		: 메인
 * @프로그램 설명 	: 메인 Mapper
 * @FileName		: MainMapper.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
@Mapper
public interface MainMapper {

    /**
     * Main Banner 목록 조회
     */
    public List getMainBannerList(BannerVO bannerVO) throws Exception;

    /**
     * Sub Banner 목록 조회
     */
    public List getSubBannerList(BannerVO bannerVO) throws Exception;

    /**
     * HotPrice 목록 조회
     */
    public List getHotPriceList(BannerVO bannerVO) throws Exception;


}
