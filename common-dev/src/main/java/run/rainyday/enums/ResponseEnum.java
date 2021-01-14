package run.rainyday.enums;

import lombok.Data;

/**
 * 响应枚举类:
 *   200 成功;
 *   1xxx 入参错误;
 *   3xxx
 *   4xxx
 *   5xxx 服务器异常;
 *
 * @author: RenChenHao
 * @date: 2021.1.7 11:35
 */
public enum ResponseEnum {

    SUCCESS(200, "处理成功!"),

    PARAM(1000, "入参错误!"),

    SERVICE_ERROR(5000, "服务器内部错误!"),

    SERVER_BUSY(5003,"服务器正忙，请稍后再试!");

    private Integer code;

    private String msg;

    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
