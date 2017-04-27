package com.toolkit.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * <p></p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/20 21:29
 */
public interface DataRemoteService {
    boolean insertData(String fileName, String targetTable) throws FileNotFoundException;
}
