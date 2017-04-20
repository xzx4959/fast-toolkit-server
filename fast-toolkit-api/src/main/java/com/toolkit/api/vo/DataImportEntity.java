package com.toolkit.api.vo;

import com.toolkit.api.ToolkitBaseEntity;
import lombok.Data;

/**
 * <p></p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 19:01
 */
@Data
public class DataImportEntity extends ToolkitBaseEntity{
    private String tableName;
    private String fileName;
}
