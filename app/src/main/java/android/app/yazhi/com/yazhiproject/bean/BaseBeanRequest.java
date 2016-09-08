package android.app.yazhi.com.yazhiproject.bean;

import java.util.ArrayList;

/**
 * Created by apple on 16-9-8.
 */
public class BaseBeanRequest<T> {
    String jsonrpc;
    ArrayList<T> params;

    public String getJsonrpc() {
        return jsonrpc = "2.0";
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public ArrayList<T> getParams() {
        return params;
    }

    public void setParams(ArrayList<T> params) {
        this.params = params;
    }
}
