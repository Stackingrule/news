package com.mooc.utils;

public class JSONResult {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应数据
    private Object data;

    private String ok;	// 不使用

    public JSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONResult() {
    }

    public static JSONResult build(Integer status, String msg, Object data) {
        return new JSONResult(status, msg, data);
    }

}
