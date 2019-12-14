package com.monstermarine.api.notice;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @프로그램명		: 공지사항
 * @프로그램 설명 	: 공지사항 Mapper
 * @FileName		: NoticeMapper.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력         :
 */
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
