package com.example.DXHei.common;

import javax.swing.plaf.PanelUI;

/**
 * @author XPR
 * @since 2023/10/6 17:08
 */
public class RespondModel {
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_FAILURE = 1;

    private int status;
    private Object data;

    public RespondModel() {
        status = STATUS_SUCCESS;
    }
    public RespondModel(Object data) {
        this.data = data;
    }
    public RespondModel(int status, Object data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
