package com.toolkit.data.impl;

import com.qcloud.cos.COS;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.request.UploadFileRequest;
import com.qcloud.cos.sign.Credentials;
import com.toolkit.data.ObjectFileStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by xzx on 17/4/20.
 * 对象文件存储实现类
 */
@Service
public class ObjectFileStorageServiceImpl implements ObjectFileStorageService {
    private static final long appId = 1251778795l;
    private static final String secretId = "AKIDkNoHogYvGOK4e149vVt44rsiMo35ofDZ";
    private static final String secretKey = "IOI0Yu7h6JJ7i6II5g6KNI1Yu65sTr33";
    private static final String bucketName = "toolkit";
    private static final String cosPath = "/orders/";
    private static final String localPathPrefix = "/upload_file/";
    private Credentials credentials;
    private ClientConfig clientConfig;
    private COSClient cosClient;
    private final Logger logger = LoggerFactory.getLogger(ObjectFileStorageServiceImpl.class);
    @PostConstruct
    private void start() {
        credentials = new Credentials(appId, secretId, secretKey);
        clientConfig = new ClientConfig();
        clientConfig.setRegion("sh");
        cosClient = new COSClient(clientConfig,credentials);
    }

    public boolean uploadFile2Cloud(String filePath) {
        String localPath = localPathPrefix + filePath;
        String desPath = cosPath + filePath;
        UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName,desPath,localPath);
        String uploadFileRet = cosClient.uploadFile(uploadFileRequest);
        return false;
    }

    public boolean downloadFile2Local() {
        return false;
    }

    public boolean deleteFileOnCloud() {
        return false;
    }
}