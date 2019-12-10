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
    public Map getNoticeList(Map map) throws Exception;

    /**
     * 공지사항 등록
     */
    public Map insertNotice(Map map) throws Exception;

    /**
     * 공지사항 수정
     */
    public Map updateNotice(Map map) throws Exception;

    /**
     * 공지사항 삭제
     */
    public  Map deleteNotice(Map map) throws Exception;


}
