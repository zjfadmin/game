/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.ChatBean
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichBeau
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameMain
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.bean.ChatBean;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichBeau;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;

public class IiiIIiiiiIiii
implements ServerAction {
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        Object IiiiiiiiIIIII;
        GameView IiiiiiiiIIIII2 = gameClient.gameView;
        if (head.equals("prompt")) {
            IiiiiiiiIIIII2.iiiIiiiiiiIIi(mes);
            return;
        }
        if (!head.equals("chat")) return;
        ChatBean IiiiiiiiIIIII3 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, ChatBean.class);
        if (IiiiiiiiIIIII3.getId() == 0 || IiiiiiiiIIIII3.getId() == 1) {
            if (IiiiiiiiIIIII2.getBattleScene() != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII2.getBattleScene().getBattleUnit(0, IiiiiiiiIIIII3.getRoleId().longValue());
                if (IiiiiiiiIIIII != null) {
                    if ((long)IiiiiiiiIIIII.ALLATORIxDEMO().getId() == IiiiiiiiIIIII2.roleData.getRoleId()) {
                        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII3.getMessage());
                    } else if (!GameMain.ALLATORIxDEMO((long)IiiiiiiiIIIII.ALLATORIxDEMO().getId())) {
                        IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII3.getMessage());
                    }
                }
            } else {
                IiiiiiiiIIIII = IiiiiiiiIIIII2.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII3.getRole());
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII3.getMessage());
                }
            }
        } else {
            if (IiiiiiiiIIIII3.getId() == 8 || IiiiiiiiIIIII3.getId() == 9) {
                IiiiiiiiIIIII2.ALLATORIxDEMO("#T" + IiiiiiiiIIIII3.getMessage(), IiiiiiiiIIIII3.getId(), IiiiiiiiIIIII3.getSkin());
                return;
            }
            if (IiiiiiiiIIIII3.getId() == 10) {
                StringBuffer IiiiiiiiIIIII4 = new StringBuffer();
                IiiiiiiiIIIII4.append("#X");
                InputBean IiiiiiiiIIIII5 = new InputBean();
                IiiiiiiiIIIII5.setType(15);
                IiiiiiiiIIIII5.setId(IiiiiiiiIIIII3.getRoleId());
                IiiiiiiiIIIII5.setName("[\u644a\u4f4d:" + IiiiiiiiIIIII3.getRole() + "]");
                IiiiiiiiIIIII5.setColor("G");
                IiiiiiiiIIIII4.append("#V");
                IiiiiiiiIIIII4.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII5));
                IiiiiiiiIIIII4.append("#L#W");
                IiiiiiiiIIIII4.append(IiiiiiiiIIIII3.getMessage());
                IiiiiiiiIIIII2.chatBox.addChat(11, IiiiiiiiIIIII4.toString());
                return;
            }
        }
        IiiiiiiiIIIII = new StringBuffer();
        if (IiiiiiiiIIIII3.getId() == 4) {
            if (IiiiiiiiIIIII3.getRoleId() != null) {
                InputBean IiiiiiiiIIIII5 = new InputBean();
                IiiiiiiiIIIII5.setType(1);
                IiiiiiiiIIIII5.setId(IiiiiiiiIIIII3.getRoleId());
                IiiiiiiiIIIII5.setName("[" + IiiiiiiiIIIII3.getRole() + "]");
                IiiiiiiiIIIII5.setColor("cFFFF00");
                IiiiiiiiIIIII5.setRichBeau(IiiiiiiiIIIII3.getBeauBean() != null ? new RichBeau(IiiiiiiiIIIII3.getBeauBean().toString()) : null);
                ((StringBuffer)IiiiiiiiIIIII).append("#V");
                ((StringBuffer)IiiiiiiiIIIII).append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII5));
                ((StringBuffer)IiiiiiiiIIIII).append("#L#W");
            }
            ((StringBuffer)IiiiiiiiIIIII).append(IiiiiiiiIIIII3.getMessage());
            IiiiiiiiIIIII2.iIiIiiiiIIiIi(((StringBuffer)IiiiiiiiIIIII).toString());
            return;
        }
        if (IiiiiiiiIIIII3.getId() == 7) {
            IiiiiiiiIIIII2.ALLATORIxDEMO("#T" + IiiiiiiiIIIII3.getMessage(), 8, null);
        }
        if (IiiiiiiiIIIII3.getId() == 0) {
            ((StringBuffer)IiiiiiiiIIIII).append("#Q");
        } else if (IiiiiiiiIIIII3.getId() == 1) {
            ((StringBuffer)IiiiiiiiIIIII).append("#D");
        } else if (IiiiiiiiIIIII3.getId() == 2) {
            ((StringBuffer)IiiiiiiiIIIII).append("#P");
        } else if (IiiiiiiiIIIII3.getId() == 3) {
            ((StringBuffer)IiiiiiiiIIIII).append("#J");
        } else if (IiiiiiiiIIIII3.getId() == 5 || IiiiiiiiIIIII3.getId() == 7) {
            ((StringBuffer)IiiiiiiiIIIII).append("#T");
        } else if (IiiiiiiiIIIII3.getId() == 6) {
            ((StringBuffer)IiiiiiiiIIIII).append("#X");
        }
        if (IiiiiiiiIIIII3.getId() == 5 || IiiiiiiiIIIII3.getId() == 6 || IiiiiiiiIIIII3.getId() == 7) {
            ((StringBuffer)IiiiiiiiIIIII).append("#Y");
            ((StringBuffer)IiiiiiiiIIIII).append(IiiiiiiiIIIII3.getMessage());
        } else {
            if (IiiiiiiiIIIII3.getRoleId() != null) {
                InputBean IiiiiiiiIIIII6 = new InputBean();
                IiiiiiiiIIIII6.setType(1);
                IiiiiiiiIIIII6.setId(IiiiiiiiIIIII3.getRoleId());
                IiiiiiiiIIIII6.setName("[" + IiiiiiiiIIIII3.getRole() + "]");
                IiiiiiiiIIIII6.setColor("G");
                IiiiiiiiIIIII6.setRichBeau(IiiiiiiiIIIII3.getBeauBean() != null ? new RichBeau(IiiiiiiiIIIII3.getBeauBean().toString()) : null);
                ((StringBuffer)IiiiiiiiIIIII).append("#V");
                ((StringBuffer)IiiiiiiiIIIII).append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII6));
                ((StringBuffer)IiiiiiiiIIIII).append("#L");
            } else if (IiiiiiiiIIIII3.getRole() != null) {
                ((StringBuffer)IiiiiiiiIIIII).append("[" + IiiiiiiiIIIII3.getRole() + "]");
            }
            ((StringBuffer)IiiiiiiiIIIII).append(IiiiiiiiIIIII3.getMessage());
        }
        IiiiiiiiIIIII2.chatBox.addChat(IiiiiiiiIIIII3.getId(), ((StringBuffer)IiiiiiiiIIIII).toString());
    }
}
