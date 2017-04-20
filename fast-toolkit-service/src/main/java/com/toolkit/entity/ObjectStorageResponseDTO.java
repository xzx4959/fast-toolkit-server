package com.toolkit.entity;

/**
 * <p>腾讯云文件存储返回值</p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/20 22:16
 */
public class ObjectStorageResponseDTO {
    private Integer code;
    private String message;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ObjectStorageResponseDTO{");
        sb.append("code=").append(code);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
