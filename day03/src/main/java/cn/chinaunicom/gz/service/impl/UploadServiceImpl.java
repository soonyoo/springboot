package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.service.UploadService;
import org.springframework.stereotype.Service;


/**
 * @author : xuwenyuan
 * @date : 2019-07-30
 * 上传至本地服务器实现类
 */
@Service
public class UploadServiceImpl implements UploadService {
    @Override
    public void uploadPicture(String filePath) {
        System.out.println("上传到本地服务器。。。");
    }
}
