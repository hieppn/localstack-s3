package com.example.springboot.service;

import com.example.springboot.model.DownloadedResource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
    String upload(MultipartFile multipartFile);
    DownloadedResource download(String id);
}
