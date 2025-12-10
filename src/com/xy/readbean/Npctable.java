/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Npctable {
    private String npcname;
    private String title;
    private String npcid;
    private String skin;
    private String ticktxt;
    private String npcway;
    private String ty;
    private String tx;
    private String binding;
    private String tick;
    private String talkid;
    private String dir;
    private String npctype;
    private String mname;

    public String getDir() {
        return this.dir;
    }

    public String getSkin() {
        return this.skin;
    }

    public String getTick() {
        return this.tick;
    }

    public String getTicktxt() {
        return this.ticktxt;
    }

    public void setNpcway(String npcway) {
        this.npcway = npcway == null ? null : npcway.trim();
    }

    public String getTalkid() {
        return this.talkid;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setNpctype(String npctype) {
        this.npctype = npctype;
    }

    public String getMname() {
        return this.mname;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public void setTalkid(String talkid) {
        this.talkid = talkid == null ? null : talkid.trim();
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTick(String tick) {
        this.tick = tick;
    }

    public void setNpcname(String npcname) {
        this.npcname = npcname == null ? null : npcname.trim();
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getNpcname() {
        return this.npcname;
    }

    public void setNpcid(String npcid) {
        this.npcid = npcid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTy() {
        return this.ty;
    }

    public String getBinding() {
        return this.binding;
    }

    public String getTx() {
        return this.tx;
    }

    public String getNpcid() {
        return this.npcid;
    }

    public void setTicktxt(String ticktxt) {
        this.ticktxt = ticktxt == null ? null : ticktxt.trim();
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getNpcway() {
        return this.npcway;
    }

    public String getNpctype() {
        return this.npctype;
    }
}
