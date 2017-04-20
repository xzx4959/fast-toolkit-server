package com.toolkit.data;

/**
 * Created by xzx on 17/4/20.
 * 文件对象存储
 */
public interface ObjectFileStorageService {
    boolean uploadFile2Cloud();
    boolean downloadFile2Local();
    boolean deleteFileOnCloud();
}
