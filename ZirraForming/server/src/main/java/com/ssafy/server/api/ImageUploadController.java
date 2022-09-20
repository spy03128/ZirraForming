package com.ssafy.server.api;

import com.ssafy.server.api.dto.common.ResultDto;
import com.ssafy.server.file.FileStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class ImageUploadController {

    private final FileStore fileStore;

    @PostMapping("/upload")
    public ResponseEntity<ResultDto> saveFile(@RequestParam MultipartFile file) throws IOException {
        log.info("multipartFile={}", file);
        String message = fileStore.saveFile(file);
        return ResponseEntity.ok(ResultDto.of(message));
    }

    @GetMapping("{filename}")
    public String findFile(@PathVariable String filename) {
        return fileStore.getFullPath(filename);
    }
}
