package com.monstermarine.api.notice;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface NoticeMapper {

    /**
     * 공지사항 상세 조회
     */
    public NoticeVO getNotice(NoticeVO NoticeVO) throws Exception;

    /**
     * 공지사항 목록 조회
     */
    public List getNoticeList(NoticeVO noticeVO) throws Exception;

    /**
     * 공지사항 등록
     */
    public int insertNotice(NoticeVO noticeVO) throws Exception;

    /**
     * 공지사항 수정
     */
    public int updateNotice(NoticeVO noticeVO) throws Exception;

    /**
     * 공지사항 삭제
     */
    public  int deleteNotice(NoticeVO noticeVO) throws Exception;


}
