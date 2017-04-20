package com.toolkit.api.enums;

/**
 * <p>存储返回给客户端的枚举信息</p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 23:06
 */
public enum  ResponseMessageEnum {
    FILE_UPLOAD_EMPTY(100,"上传的文件为空"),
    ;
    private Integer code;
    private String message;

    ResponseMessageEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
