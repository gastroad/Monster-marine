package com.monstermarine.api.file;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper {

    /**
     * 파일 경로 조회
     */
    public FileVO getPath(FileVO fileVO) throws Exception;

}
