package com.example.springboot.model;

import lombok.Builder;
import lombok.Data;

import java.io.InputStream;

@Data
@Builder
public class DownloadedResource {
    private String id;
    private String fileName;
    private Long contentLength;
    private InputStream inputStream;
}
