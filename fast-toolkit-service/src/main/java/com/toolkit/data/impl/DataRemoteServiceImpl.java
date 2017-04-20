package com.toolkit.data.impl;

import com.toolkit.data.DataRemoteService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * <p>数据<->数据库服务</-></p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/15 19:01
 */
public class DataRemoteServiceImpl implements DataRemoteService {

    public String uploadFile() {

        return null;
    }

    public boolean insertData(String fileName, String targetTable) throws FileNotFoundException {

        InputStream inputStream = new FileInputStream(fileName);
        return false;
    }
}
