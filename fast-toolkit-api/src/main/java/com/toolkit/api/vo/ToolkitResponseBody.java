package com.toolkit.api.vo;

import com.toolkit.api.ToolkitBaseEntity;
import lombok.Data;

/**
 * <p></p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 19:45
 */
@Data
public class ToolkitResponseBody extends ToolkitBaseEntity {
    private String message;
    private Object data;
    private Boolean isSuccess = true;

    public ToolkitResponseBody(String message, Object data, Boolean isSuccess) {
        this.message = message;
        this.data = data;
        this.isSuccess = isSuccess;
    }

    /**
     * 处理成功的返回
     * @param data
     */
    public ToolkitResponseBody(Object data) {
        this.data = data;
    }

    /**
     * 处理失败的返回
     * @param message
     */
    public ToolkitResponseBody(String message) {
        this.message = message;
        this.setIsSuccess(false);
    }
}
