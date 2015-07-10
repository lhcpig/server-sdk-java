package io.rong.models;

import io.rong.util.GsonUtil;


/**
 * Created by liuhengchong on 2015/7/8.
 * 提示条（小灰条）通知消息
 */
public class InfoNtfMessage extends Message {

    private String message;
    private String extra;

    public InfoNtfMessage(String message, String extra) {
        this.type = "RC:InfoNtf";
        this.message = message;
        this.extra = extra;
    }

    public String getMessage() {
        return message;
    }

    public String getExtra() {
        return extra;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this, InfoNtfMessage.class);
    }
}
