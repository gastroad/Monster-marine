package com.monstermarine.api.main;

import com.monstermarine.api.banner.BannerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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

    /**
     * 공지사항 등록
     */
    // public int insertNotice(MainVO noticeVO) throws Exception;

    /**
     * 공지사항 수정
     */
    // public int updateNotice(MainVO noticeVO) throws Exception;

    /**
     * 공지사항 삭제
     */
    // public  int deleteNotice(MainVO noticeVO) throws Exception;


}
