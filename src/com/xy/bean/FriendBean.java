/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 *  com.xy.entity.Friendtable
 */
package com.xy.bean;

import com.xy.bean.BeauBean;
import com.xy.entity.Friendtable;

public class FriendBean {
    private StringBuffer chatBuffer;
    private String roleName;
    private BeauBean beauBean;
    private int flag;
    private int lvl = 0;
    private int speciesId = 20001;
    private long fid;
    private boolean chat;

    public long getFid() {
        return this.fid;
    }

    public int getSpeciesId() {
        return this.speciesId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getGroup() {
        return this.flag & 0xF;
    }

    /*
     * WARNING - void declaration
     */
    public FriendBean ALLATORIxDEMO(Friendtable friendtable) {
        void friendtable2;
        this.fid = friendtable2.getRole_id().longValue();
        this.flag = 2 | (friendtable2.getOnlineState() == 1 ? 1 : 0) << 4;
        this.lvl = friendtable2.getGrade().intValue();
        this.speciesId = friendtable2.getSpecies_id().intValue();
        this.roleName = friendtable2.getRolename();
        this.beauBean = friendtable2.getBeauBean();
        return this;
    }

    public void ALLATORIxDEMO(String chat) {
        if (this.chatBuffer == null) {
            this.chatBuffer = new StringBuffer();
        }
        this.chatBuffer.append(chat);
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public BeauBean getBeauBean() {
        return this.beauBean;
    }

    public void setBeauBean(BeauBean beauBean) {
        this.beauBean = beauBean;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public void setChat(boolean chat) {
        this.chat = chat;
    }

    public String getChat() {
        if (this.chatBuffer == null) return "";
        return this.chatBuffer.toString();
    }

    public int getFlag() {
        return this.flag;
    }

    public boolean iIiIiiiiIIiii() {
        return this.chat;
    }

    public void setChatBuffer(StringBuffer chatBuffer) {
        this.chatBuffer = chatBuffer;
    }

    public FriendBean ALLATORIxDEMO(FriendBean friendBean) {
        this.flag = friendBean.flag;
        this.lvl = friendBean.lvl;
        this.speciesId = friendBean.speciesId;
        this.roleName = friendBean.roleName;
        this.beauBean = friendBean.beauBean;
        return this;
    }

    public boolean ALLATORIxDEMO() {
        if (this.flag >> 4 == 0) return false;
        return true;
    }

    public void setSpeciesId(int speciesId) {
        this.speciesId = speciesId;
    }
}
