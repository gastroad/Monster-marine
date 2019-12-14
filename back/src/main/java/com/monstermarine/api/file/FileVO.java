package com.monstermarine.api.file;

/**
 * @프로그램명		: 파일
 * @프로그램 설명 	: 파일 VO
 * @FileName		: FileVO.java
 * @Project			: MONSTER MARINE
 * @Date			: 2019. 12. 08.
 * @작성자			: selectjun
 * @ Copyright ⓒ SELECTJUN. All Right Reserved
 * @변경이력    	:
 */
public class FileVO {

    private int fileId;
    private String status;
    private String originalFIleName;
    private String pysicalFileName;

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginalFIleName() {
        return originalFIleName;
    }

    public void setOriginalFIleName(String originalFIleName) {
        this.originalFIleName = originalFIleName;
    }

    public String getPysicalFileName() {
        return pysicalFileName;
    }

    public void setPysicalFileName(String pysicalFileName) {
        this.pysicalFileName = pysicalFileName;
    }

}
