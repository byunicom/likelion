package com.example.web01.controller;

import com.example.web01.domain.UploadInfo;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@Slf4j
public class FileController {
    //파일 다운로드
    @GetMapping("/download")
    public void downloadFile(HttpServletResponse response){
        Path path = Paths.get("c:/temp/upload/cat.jpg");
        response.setContentType("image/jpeg");
        try (InputStream inputStream= Files.newInputStream(path)){
            StreamUtils.copy(inputStream, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            log.error("파일 다운로드 중 오류 발생 : "+ e.getMessage());
        }
    }
//curl -X POST http://localhost:8080/upload -H "Content-Type: multipart/form-data" -F "file=@C:/temp/cat.jpg" -F "info=@C:/temp/info.json;type=application/json"
    //파일 업로드
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(
            @RequestParam("file") MultipartFile file,
            @RequestPart(name = "info", required = false) UploadInfo uploadInfo
            ){
        log.info(uploadInfo.getDescription()+":::"+uploadInfo.getTag());
        log.info(file.getOriginalFilename());

        try(InputStream inputStream = file.getInputStream()){
            StreamUtils.copy(inputStream,
                    new FileOutputStream("c:/temp/upload/"+file.getOriginalFilename()));
            return  ResponseEntity.ok().body("파일저장 성공!"+file.getOriginalFilename());
        }catch (IOException e) {
            return ResponseEntity
                    .badRequest()
                    .body("failed upload : "+file.getOriginalFilename());
        }
    }

}
