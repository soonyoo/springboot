package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.service.UploadService;
import org.springframework.stereotype.Service;

/**
 * @author : xuwneyuan
 * @date : 2019-07-30
 * 上传到S3（亚马逊的文件服务器）
 */

@Service
public class UploadServiceS3Impl implements UploadService {
    @Override
    public void uploadPicture(String filePath) {
        System.out.println("上传到S3执行了...");
    }
}
