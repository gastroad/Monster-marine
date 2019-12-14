package com.monstermarine.api.file;

import org.apache.ibatis.annotations.Mapper;

/**
 * @프로그램명		: 파일
 * @프로그램 설명 	: 파일 Mapper
 * @FileName		: FileMapper.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
@Mapper
public interface FileMapper {

    /**
     * 파일 경로 조회
     */
    public FileVO getPath(FileVO fileVO) throws Exception;

}
