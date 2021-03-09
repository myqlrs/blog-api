package com.myq.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 孟赟强
 * @date 2021/1/12-0:16
 * 工具类：封装结果集
 */
@Data
public class Result implements Serializable {
    private String code;//成功：1 失败：0
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        Result m = new Result();
        m.setCode("200");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }

    public static Result succ(String mess, Object data) {
        Result m = new Result();
        m.setCode("200");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String mess) {
        Result m = new Result();
        m.setCode("400");
        m.setData(null);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String mess, Object data) {
        Result m = new Result();
        m.setCode("400");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
}

