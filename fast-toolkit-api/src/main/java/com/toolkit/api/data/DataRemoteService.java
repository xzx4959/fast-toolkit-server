package com.toolkit.api.data;

import java.io.FileNotFoundException;

/**
 * <p>数据操作接口</p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/15 19:04
 */
public interface DataRemoteService {
    String uploadFile();
    boolean insertData(String fileName,String targetTable) throws FileNotFoundException;

}
