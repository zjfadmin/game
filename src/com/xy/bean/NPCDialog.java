/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.util.List;

public class NPCDialog {
    private List<String> functions;
    private String type;
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<String> getFunctions() {
        return this.functions;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getType() {
        return this.type;
    }

    public void setFunctions(List<String> functions) {
        this.functions = functions;
    }
}
