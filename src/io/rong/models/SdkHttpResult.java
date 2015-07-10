package io.rong.models;

//对server sdk返回的封装
public class SdkHttpResult {

    private int code;
    private String result;

    public static SdkHttpResult CONNECT_ERROR = new SdkHttpResult(555, "连接融云服务器出错");

    public SdkHttpResult(int code, String result) {
        this.code = code;
        this.result = result;
    }

    public int getHttpCode() {
        return code;
    }

    public String getResult() {
        return result;
    }

    public boolean isSuccess(){
        return code == 200;
    }
    @Override
    public String toString() {
        return String.format("{\"code\":\"%s\",\"result\":%s}", code,
                result);
    }
}
