package com.ssafy.server.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Component
public class FileStore {

    @Value("${file.dir}")
    private String fileDir;

    public String getFullPath(String filename){
        return fileDir + filename;
    }

    public String saveFile(@RequestParam MultipartFile file) throws IOException {
        if (file.isEmpty()){
            return "저장할 이미지가 없습니다.";
        }

        String originalFilename = file.getOriginalFilename();
        String storeFileName = createStoreFileName(originalFilename);

        file.transferTo(new File(getFullPath(storeFileName))) ;

        return "이미지가 저장되었습니다.";
    }

    private String createStoreFileName(String originalFilename) {
        String ext = extractExt(originalFilename);
        String uuid = UUID.randomUUID().toString();
        return uuid + "." + ext;
    }

    private String extractExt(String originalFilename) {
        int pos = originalFilename.lastIndexOf(".");
        return originalFilename.substring(pos + 1);
    }
}
