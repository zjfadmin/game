/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiiIiiiIiIIi
 *  com.xy.battle.BattleControl
 *  com.xy.bean.ChatBean
 *  com.xy.i.IiIIIiiiIIiII
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameFrame
 *  com.xy.text.GameMain
 *  com.xy.text.GameView
 *  com.xy.text.SystemData
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.text;

import com.xy.a.iIiiIiiiIiIIi;
import com.xy.battle.BattleControl;
import com.xy.bean.ChatBean;
import com.xy.i.IiIIIiiiIIiII;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameFrame;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.v.iiIiiiiiIIiii;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;

public class GameAWTEventListener
implements AWTEventListener {
    static String[] v = new String[]{"#T", "#X", "#J", "#Q", "#D", "#P", "#F", "#H", "Q\u53f7", "q\u53f7", "QQ", "qq", "Qq", "\u516c\u76ca\u670d", "\u514d\u8d39\u9001", "\u6263\u6263\u7fa4"};
    private long time;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(GameView gameView, KeyEvent event) {
        block41: {
            try {
                if (gameView.getBattleScene() != null) {
                    IiiiiiiiIIIII = gameView.getBattleControl();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getHandleUnit();
                    if (IiiiiiiiIIIII == null) {
                        return;
                    }
                    v0 = IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO().getType() == 0 ? IiiiiiiiIIIII.RoleOperation : IiiiiiiiIIIII.PetOperation;
                }
                ** GOTO lbl42
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                break block41;
            }
            {
                if (event.getKeyCode() == 65) {
                    IiiiiiiiIIIII.ALLATORIxDEMO(true, -1, 0, null);
                    IiiiiiiiIIIII.setCamp(-1);
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                    return;
                }
                if (event.getKeyCode() == 87) {
                    IiIIIiiiIIiII.ALLATORIxDEMO((int)1, (BattleControl)IiiiiiiiIIIII);
                    return;
                }
                if (event.getKeyCode() == 68) {
                    IiIIIiiiIIiII.iIiIiiiiIIiii((BattleControl)IiiiiiiiIIIII);
                    return;
                }
                if (event.getKeyCode() == 69) {
                    IiIIIiiiIIiII.ALLATORIxDEMO((int)2, (BattleControl)IiiiiiiiIIIII);
                    return;
                }
                if (event.getKeyCode() == 84) {
                    IiIIIiiiIIiII.ALLATORIxDEMO((BattleControl)IiiiiiiiIIIII);
                    return;
                }
                if (event.getKeyCode() == 66) {
                    IiIIIiiiIIiII.IIiiIiiiiIiII((BattleControl)IiiiiiiiIIIII);
                    return;
                }
                if (event.getKeyCode() != 83) return;
                v1 = IiiiiiiiIIIII = IiiiiiiiIIIII.getSpell() != null ? gameView.getObjectArea().ALLATORIxDEMO(IiiiiiiiIIIII.getSpell()) : null;
                if (IiiiiiiiIIIII == null) {
                    gameView.iiiIiiiiiiIIi("\u6ca1\u6709\u9ed8\u8ba4\u7684\u6cd5\u672f");
                    return;
                }
                IiiiiiiiIIIII.setMouseIndex(iiIiIiiiIIIiI.ALLATORIxDEMO, (Object)IiiiiiiiIIIII);
                gameView.getFormManagement().iiiIiiiiiiIIi(34);
                gameView.getFormManagement().iiiIiiiiiiIIi(46);
                IiiiiiiiIIIII.iiiiiiiiIIiii();
                return;
lbl42:
                // 1 sources

                if (event.getKeyCode() == 49) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)22, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 50) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)155, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 81) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)3, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 87) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)0, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 79) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)6, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 73 || event.getKeyCode() == 69) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)2, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 65) {
                    gameView.setMouseIndex(iiIiIiiiIIIiI.IiIiiiiiIIIII);
                    return;
                }
                if (event.getKeyCode() == 84) {
                    if (gameView.baseView.ALLATORIxDEMO(3)) {
                        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team6", null);
                        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
                        gameView.baseView.ALLATORIxDEMO(3, false);
                        return;
                    }
                    if (gameView.roleData.teamBean != null) {
                        com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)13, (GameView)gameView);
                        return;
                    }
                    gameView.setMouseIndex(iiIiIiiiIIIiI.iIiiIiiiiiiII);
                    return;
                }
                if (event.getKeyCode() == 71) {
                    gameView.setMouseIndex(iiIiIiiiIIIiI.iiIiiiiiiiIii);
                    return;
                }
                if (event.getKeyCode() == 88) {
                    gameView.setMouseIndex(iiIiIiiiIIIiI.iIiIiiiiIiIii);
                    return;
                }
                if (event.getKeyCode() == 82) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)(gameView.getClient().gameMount != false ? 172 : 7), (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 70) {
                    IiiiiiiiIIIII = gameView.baseView;
                    if (!IiiiiiiiIIIII.ALLATORIxDEMO(9)) {
                        com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)4, (GameView)gameView);
                        return;
                    }
                    IiiiiiiiIIIII = gameView.roleData.getFriendChat();
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII.setChat(false);
                        IiiiiiiiIIIII = (iIiiIiiiIiIIi)gameView.getFormManagement().iiiIiiiiiiIIi(56);
                        IiiiiiiiIIIII.ALLATORIxDEMO(gameView.roleData.getFriend(IiiiiiiiIIIII.getFid()));
                    }
                    if ((IiiiiiiiIIIII = gameView.roleData.getFriendChat()) != null) return;
                    IiiiiiiiIIIII.ALLATORIxDEMO(9, false);
                    return;
                }
                if (event.getKeyCode() == 89) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)1, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 86) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)43, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 66) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)48, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 83) {
                    gameView.baseView.iIiIiiiiIIiii(21);
                    return;
                }
                if (event.getKeyCode() == 48) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)52, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 51) {
                    com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)150, (GameView)gameView);
                    return;
                }
                if (event.getKeyCode() == 52) {
                    SystemData.ISNAME = SystemData.ISNAME == false;
                    return;
                }
                if (event.getKeyCode() == 53) {
                    SystemData.ISTCP = SystemData.ISTCP == false;
                    return;
                }
                if (event.getKeyCode() == 54) {
                    SystemData.ISSTALL = SystemData.ISSTALL == false;
                    return;
                }
                if (event.getKeyCode() == 55) {
                    SystemData.ISMOUNT = SystemData.ISMOUNT == false;
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < GameMain.frameList.size()) {
                        IiiiiiiiIIIII = (GameFrame)GameMain.frameList.get(IiiiiiiiIIIII);
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.gameList.size()) {
                            v2 = IiiiiiiiIIIII.gameList.get(IiiiiiiiIIIII);
                            ++IiiiiiiiIIIII;
                            ((GameView)v2).mapScene.ALLATORIxDEMO();
                        }
                        ++IiiiiiiiIIIII;
                    }
                    return;
                }
                if (event.getKeyCode() != 67) return;
                if (gameView.getClient().VALUE.indexOf("P") == -1) return;
                if (gameView.roleData.goodChoses[14] != null) {
                    IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)("FE" + gameView.roleData.goodChoses[14]));
                    gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
                    return;
                }
                IiiiiiiiIIIII = gameView.roleData.getUsableFly();
                if (IiiiiiiiIIIII == null) return;
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)("FE" + IiiiiiiiIIIII.getRgid()));
                gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
        }
    }

    public void ALLATORIxDEMO(GameView gameView) {
        iIiiIiiiIiIIi IiiiiiiiIIIII;
        if (gameView == null) {
            return;
        }
        JTextField IiiiiiiiIIIII2 = gameView.getBaseView().ALLATORIxDEMO();
        if (IiiiiiiiIIIII2.isFocusOwner()) {
            String IiiiiiiiIIIII3 = ((IiiIiiiiIIIii)IiiiiiiiIIIII2.getDocument()).ALLATORIxDEMO();
            if (IiiiiiiiIIIII3.equals("")) {
                gameView.iIiIiiiiIIiii("\u8bf7\u8f93\u5165\u5185\u5bb9");
                return;
            }
            int IiiiiiiiIIIII4 = gameView.roleData.getLoginResult().getTurnAround() * 20;
            if (IiiiiiiiIIIII4 < 20) {
                IiiiiiiiIIIII4 = 20;
            }
            if (IiiiiiiiIIIII2.getText().length() > IiiiiiiiIIIII4) {
                gameView.iIiIiiiiIIiii("\u6700\u5927\u5b57\u7b26\u9650\u5236" + IiiiiiiiIIIII4 + "\u4e2a");
                return;
            }
            if (GameAWTEventListener.ALLATORIxDEMO(IiiiiiiiIIIII3)) {
                gameView.iIiIiiiiIIiii("\u53d1\u9001\u5185\u5bb9\u5e26\u6709\u654f\u611f\u8bcd");
                return;
            }
            IiiiiiiiIIIII2.setText("");
            int IiiiiiiiIIIII5 = gameView.getBaseView().iiiIiiiiiiIIi();
            this.ALLATORIxDEMO(gameView, IiiiiiiiIIIII3, IiiiiiiiIIIII5);
            return;
        }
        IiiiIiiiiIiIi IiiiiiiiIIIII6 = gameView.getFormManagement().iIiIiiiiIIiii(56);
        if (IiiiiiiiIIIII6 != null && (IiiiiiiiIIIII = (iIiiIiiiIiIIi)IiiiiiiiIIIII6).ALLATORIxDEMO().isFocusOwner()) {
            return;
        }
        if (!gameView.isVisible()) return;
        if (!gameView.gameFrame.isFocused()) return;
        IiiiiiiiIIIII2.requestFocus();
    }

    @Override
    public void eventDispatched(AWTEvent event) {
        if (event.getClass() != KeyEvent.class) return;
        KeyEvent IiiiiiiiIIIII = (KeyEvent)event;
        if (IiiiiiiiIIIII.getID() != 401) return;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < GameMain.frameList.size()) {
            GameFrame IiiiiiiiIIIII3 = (GameFrame)GameMain.frameList.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3.isFocused()) {
                try {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII3);
                    return;
                }
                catch (Exception IiiiiiiiIIIII4) {
                    IiiiiiiiIIIII4.printStackTrace();
                    return;
                }
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public void ALLATORIxDEMO(KeyEvent event, GameFrame gameFrame) {
        if (event.getKeyCode() == 10) {
            this.ALLATORIxDEMO(gameFrame.gameView);
            return;
        }
        if (event.getKeyCode() >= 112 && event.getKeyCode() <= 119) {
            gameFrame.gameView.baseView.ALLATORIxDEMO().iIiIiiiiIIiii(event.getKeyCode() - 112);
            return;
        }
        if (event.isAltDown()) {
            this.ALLATORIxDEMO(gameFrame.gameView, event);
            return;
        }
        if (!event.isControlDown()) return;
        if (event.getKeyCode() >= 49 && event.getKeyCode() <= 57) {
            gameFrame.setGameView(event.getKeyCode() - 49);
            return;
        }
        if (event.getKeyCode() != 9) return;
        gameFrame.setGameView();
    }

    public void ALLATORIxDEMO(GameView gameView, String sendmes, int type) {
        ChatBean IiiiiiiiIIIII;
        if (type < 0) return;
        if (type > 4) {
            return;
        }
        long IiiiiiiiIIIII2 = iIiIIiiiIiiiI.iIiIiiiiIIiii();
        if (type == 3) {
            if (IiiiiiiiIIIII2 - this.time < 10000L) {
                gameView.iIiIiiiiIIiii("\u4e16\u754c\u558a\u8bdd\u95f4\u969410\u79d2");
                return;
            }
        } else if (type == 0) {
            if (IiiiiiiiIIIII2 - this.time < 2000L) {
                gameView.iIiIiiiiIIiii("\u5f53\u524d\u558a\u8bdd\u95f4\u96942\u79d2");
                return;
            }
        } else if (type == 2) {
            if (gameView.roleData.getLoginResult().getGang_id().compareTo(new BigDecimal(0)) == 0) {
                gameView.iIiIiiiiIIiii("\u60a8\u6ca1\u6709\u5e2e\u6d3e\uff0c\u65e0\u6cd5\u53d1\u9001\u5e2e\u6d3e\u4fe1\u606f\uff01\uff01");
                return;
            }
            if (IiiiiiiiIIIII2 - this.time < 2000L) {
                gameView.iIiIiiiiIIiii("\u5f53\u524d\u558a\u8bdd\u95f4\u96942\u79d2");
                return;
            }
        } else if (type == 1) {
            if (gameView.roleData.teamBean == null) {
                gameView.iIiIiiiiIIiii("\u60a8\u8fd8\u6ca1\u6709\u52a0\u5165\u961f\u4f0d\uff0c\u65e0\u6cd5\u53d1\u9001\u961f\u4f0d\u4fe1\u606f\uff01\uff01");
                return;
            }
            if (IiiiiiiiIIIII2 - this.time < 2000L) {
                gameView.iIiIiiiiIIiii("\u5f53\u524d\u558a\u8bdd\u95f4\u96942\u79d2");
                return;
            }
        } else if (type == 4) {
            IiiiiiiiIIIII = gameView.roleData.ALLATORIxDEMO(2324L);
            if (IiiiiiiiIIIII == null) {
                gameView.iIiIiiiiIIiii("\u60a8\u6ca1\u6709\u8db3\u591f\u5c0f\u5587\u53ed");
                return;
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(1);
            ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)1, (GameClient)gameView.getClient());
            if (IiiiiiiiIIIII.getUsetime() <= 0) {
                gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            }
        }
        this.time = IiiiiiiiIIIII2;
        IiiiiiiiIIIII = new ChatBean();
        IiiiiiiiIIIII.setId(type);
        IiiiiiiiIIIII.setMessage(sendmes);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"chat", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public static boolean ALLATORIxDEMO(String text) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < v.length) {
            if (text.indexOf(v[IiiiiiiiIIIII]) != -1) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }
}
