package com.toolkit.api.service;

import java.io.File;

/**
 * <p>对接腾讯云  文件存储服务</p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/19 23:32
 */
public interface ObjectFileRemoteService {
    File uploadFile();
    File downloadFile();
    boolean deleteFile();
}
