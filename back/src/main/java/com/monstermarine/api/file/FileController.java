package com.monstermarine.api.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileMapper fileMapper;

    @Value("#{prop['upload.path']}")
    private String path;

    @Value("${upload.actualPath}")
    private String actualPath;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Map upload() throws Exception {
        return null;
    }

    @RequestMapping(value = "/{fileId}", method = RequestMethod.GET)
    public String getPath(FileVO fileVO, @PathVariable int fileId) throws Exception {
        fileVO.setFileId(fileId);
        FileVO resultData = fileMapper.getPath(fileVO);
        return path + resultData.getStatus() + "/" + resultData.getPysicalFileName();
    }

}
