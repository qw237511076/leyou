package com.leyou.upload.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Administrator
 * @date 2019/9/10
 */
public interface UploadFileService {

    String uploadImage(MultipartFile file);
}
