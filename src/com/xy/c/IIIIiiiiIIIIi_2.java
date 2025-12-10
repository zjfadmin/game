/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.w.IIIiiiiiiiiIi
 *  com.xy.battle.BattleConnection
 *  com.xy.battle.BattlePlay
 *  com.xy.battle.BattleScene
 *  com.xy.battle.BattleVideo
 *  com.xy.battle.FightingRound
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.BattleEnd
 *  com.xy.bean.PathPoint
 *  com.xy.c.IiiiIiiiiIIII
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.formula.Ql
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ServerAction
 *  com.xy.text.GameView
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.c;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.w.IIIiiiiiiiiIi;
import com.xy.battle.BattleConnection;
import com.xy.battle.BattlePlay;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleVideo;
import com.xy.battle.FightingRound;
import com.xy.bean.AssetUpdate;
import com.xy.bean.BattleEnd;
import com.xy.bean.PathPoint;
import com.xy.c.IiiiIiiiiIIII;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.formula.Ql;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ServerAction;
import com.xy.text.GameView;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;

public class IIIIiiiiIIIIi
implements ServerAction {
    public void iiiIiiiiiiIIi(String mes, int start, int end, GameView gameView) {
        int IiiiiiiiIIIII = start;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < end) {
            IiiiiiiiIIIII2 = mes.indexOf("#", IiiiiiiiIIIII + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > end) {
                IiiiiiiiIIIII2 = end;
            }
            this.ALLATORIxDEMO(mes, IiiiiiiiIIIII, IiiiiiiiIIIII2, gameView);
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String head, String mes, GameClient gameClient) {
        block53: {
            block54: {
                block55: {
                    block52: {
                        block51: {
                            IiiiiiiiIIIII = gameClient.gameView;
                            if (!head.equals("fig7")) break block51;
                            IiiiiiiiIIIII = 0;
                            IiiiiiiiIIIII = 0;
                            if (true) ** GOTO lbl148
                        }
                        if (head.equals("fig5")) {
                            IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, FightingRound.class);
                            IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((long)IiiiiiiiIIIII.getFightingsumber());
                            if (IiiiiiiiIIIII == null) {
                                return;
                            }
                            IiiiiiiiIIIII = new BattlePlay();
                            IiiiiiiiIIIII.setRound(IiiiiiiiIIIII.getRound());
                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getCurrentRound(), IiiiiiiiIIIII);
                            return;
                        }
                        if (head.equals("fig1")) {
                            IiiiiiiiIIIII = mes.indexOf("|");
                            IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((long)IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)0, (int)IiiiiiiiIIIII));
                            if (IiiiiiiiIIIII == null) {
                                return;
                            }
                            IiiiiiiiIIIII.ALLATORIxDEMO(mes, IiiiiiiiIIIII + 1);
                            return;
                        }
                        if (head.equals("fig4")) {
                            IiiiiiiiIIIII = Integer.parseInt(mes);
                            IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((long)IiiiiiiiIIIII);
                            if (IiiiiiiiIIIII == null) {
                                return;
                            }
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getBattleRound() + 1;
                            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                            return;
                        }
                        if (!head.equals("fig6")) break block52;
                        IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, BattleEnd.class);
                        IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((long)IiiiiiiiIIIII.getFightingNumber());
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getBattleUnit(0, IiiiiiiiIIIII.roleData.getRoleId()) : null;
                        IiiiiiiiIIIII = false;
                        if (IiiiiiiiIIIII == null) break block53;
                        v0 = IiiiiiiiIIIII = IiiiiiiiIIIII.getCamp() == IiiiiiiiIIIII.iiiIiiiiiiIIi();
                        if (!gameClient.ALLATORIxDEMO(2, 12)) {
                            IiiiiiiiIIIII.chatBox.addChat(5, IiiiiiiiIIIII != false ? "#T#Y\u6218\u6597\u80dc\u5229" : "#T#Y\u6218\u6597\u5931\u8d25");
                        }
                        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.getMsg())) break block54;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getMsg().split("\\|");
                        IiiiiiiiIIIII = 0;
                        if (true) ** GOTO lbl154
                    }
                    if (head.equals("battleconnection")) {
                        IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, BattleConnection.class);
                        if (IiiiiiiiIIIII.getFightingNumber() == -1) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getBattleScene();
                            if (IiiiiiiiIIIII == null) return;
                            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getBattleControl());
                            return;
                        }
                        IiiiiiiiIIIII = null;
                        IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO();
                        synchronized (IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((long)IiiiiiiiIIIII.getFightingNumber());
                            if (IiiiiiiiIIIII == null) {
                                IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO((BattleConnection)IiiiiiiiIIIII);
                            } else {
                                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                            }
                            if (IiiiiiiiIIIII.battleMapId == 0L) {
                                IiiiiiiiIIIII.battleMapId = IiiiiiiiIIIII.mapScene.IiiiIiiiIiIII;
                                IiiiiiiiIIIII.gameBattle = IiiiiiiiIIIII.getClient().gameBattle;
                            }
                        }
                        if (IiiiiiiiIIIII.getState() == 1) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.roleData.getRoleId();
                            if (IiiiiiiiIIIII.getEventState() == 1) {
                                IiiiiiiiIIIII.setHandleUnit(IiiiiiiiIIIII, 0, false);
                                IiiiiiiiIIIII.setHandleUnit(IiiiiiiiIIIII, 1, false);
                            } else if (IiiiiiiiIIIII.getEventState() == 2) {
                                IiiiiiiiIIIII.setHandleUnit(IiiiiiiiIIIII, 0, true);
                                IiiiiiiiIIIII.setHandleUnit(IiiiiiiiIIIII, 1, false);
                            } else {
                                v2 = IiiiiiiiIIIII;
                                IiiiiiiiIIIII.setHandleUnit(v2, 0, true);
                                IiiiiiiiIIIII.setHandleUnit(v2, 1, true);
                            }
                        }
                        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getBattleControl());
                        if (IiiiiiiiIIIII.BattleType == 10 && IiiiiiiiIIIII.getRound() == 1 && IiiiiiiiIIIII.getBattleControl().battleCamp == 1) {
                            IiiiiiiiIIIII.roleData.iIiIiiiiIIiii("\u6740\u4eba\u9999");
                        }
                        IiiiiiiiIIIII.automation.iIiIiiiiIIiii();
                        if (IiiiiiiiIIIII.getGameReadBar().readBarType == 2 || IiiiiiiiIIIII.getGameReadBar().readBarType == 3) {
                            IiiiiiiiIIIII.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
                        }
                        if (IiiiiiiiIIIII.getBattleType() == 101) {
                            IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(5);
                            return;
                        }
                        if (IiiiiiiiIIIII.getBattleType() != 103) return;
                        IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(111);
                        return;
                    }
                    if (head.equals("fig8")) {
                        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)mes)) {
                            return;
                        }
                        IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, Ql.class);
                        IiiiiiiiIIIII = (IIIiiiiiiiiIi)IiiiiiiiIIIII.getFormManagement().iiiIiiiiiiIIi(8);
                        IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, 0, null);
                        return;
                    }
                    if (!head.equals(Agreement.fightCard)) break block55;
                    if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)mes)) {
                        return;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.roleData.getLimit("\u53d8\u8eab\u5361");
                    if (IiiiiiiiIIIII == null) {
                        return;
                    }
                    IiiiiiiiIIIII = Integer.parseInt(mes);
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl184
                }
                if (head.equals(Agreement.fightAuto)) {
                    IiiiiiiiIIIII = mes.indexOf("|");
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)0, (int)IiiiiiiiIIIII);
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(IiiiiiiiIIIII + 1), (int)mes.length());
                    IiiiiiiiIIIII.getBattleControl().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    return;
                }
                if (head.equals(Agreement.fightVideo) == false) return;
                if (IiiiiiiiIIIII.getBattleScene() != null) {
                    IiiiiiiiIIIII.iiiIiiiiiiIIi("\u4f60\u5728\u6218\u6597\u4e2d\uff0c\u65e0\u6cd5\u89c2\u770b\u5f55\u50cf");
                    return;
                }
                IiiiiiiiIIIII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(mes, BattleVideo.class);
                IiiiiiiiIIIII = null;
                var7_33 = IIiIiiiiIiIII.ALLATORIxDEMO();
                synchronized (var7_33) {
                    IiiiiiiiIIIII = new BattleScene();
                    IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.battleMapId = IiiiiiiiIIIII.mapScene.IiiiIiiiIiIII;
                    IiiiiiiiIIIII.gameBattle = IiiiiiiiIIIII.getClient().gameBattle;
                    IIiIiiiiIiIII.ALLATORIxDEMO().add(IiiiiiiiIIIII);
                }
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getBattleControl());
                IiiiiiiiIIIII.automation.iIiIiiiiIIiii();
                if (IiiiiiiiIIIII.getGameReadBar().readBarType != 2) {
                    if (IiiiiiiiIIIII.getGameReadBar().readBarType != 3) return;
                }
                IiiiiiiiIIIII.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
                return;
                do {
                    if ((IiiiiiiiIIIII = mes.indexOf("|", IiiiiiiiIIIII + 1)) == -1) {
                        IiiiiiiiIIIII = mes.length();
                    }
                    if (mes.charAt(IiiiiiiiIIIII) == 'R') {
                        this.iIiIiiiiIIiii(mes, IiiiiiiiIIIII + 1, IiiiiiiiIIIII, IiiiiiiiIIIII);
                    } else if (mes.charAt(IiiiiiiiIIIII) == 'M') {
                        this.iiiIiiiiiiIIi(mes, IiiiiiiiIIIII + 1, IiiiiiiiIIIII, IiiiiiiiIIIII);
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
lbl148:
                    // 2 sources

                } while (IiiiiiiiIIIII != mes.length());
                return;
                do {
                    v4 = IiiiiiiiIIIII[IiiiiiiiIIIII];
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII.chatBox.addChat(6, "#X#Y" + v4);
lbl154:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            if (!IiiiiiiiIIIII) {
                IiiiiiiiIIIII = true;
            }
        }
        if (IiiiiiiiIIIII.getTaskDaily() != null) {
            IiiiiiiiIIIII.roleData.getPkSys().ALLATORIxDEMO(IiiiiiiiIIIII.getTaskDaily());
        }
        IiiiIiiiiIIII.ALLATORIxDEMO((AssetUpdate)IiiiiiiiIIIII.getAssetUpdate(), (GameView)IiiiiiiiIIIII);
        IiiiiiiiIIIII.roleData.getTaskSystem().ALLATORIxDEMO(IiiiiiiiIIIII.getTaskn());
        if (IiiiiiiiIIIII == false) return;
        IiiiiiiiIIIII.automation.ALLATORIxDEMO();
        return;
        do {
            if (!((IiiiiiiiIIIII = IiiiiiiiIIIII.getQls()[IiiiiiiiIIIII]) == null || IiiiiiiiIIIII.getKey().equals("\u4eb2\u548c\u529b") || IiiiiiiiIIIII.getKey().equals("\u7b49\u7ea7") || IiiiiiiiIIIII.getKey().equals("\u79cd\u65cf") || IiiiiiiiIIIII.getKey().equals("\u91d1") || IiiiiiiiIIIII.getKey().equals("\u6728") || IiiiiiiiIIIII.getKey().equals("\u6c34") || IiiiiiiiIIIII.getKey().equals("\u706b") || IiiiiiiiIIIII.getKey().equals("\u571f") || IiiiiiiiIIIII.getKey().equals("\u76ae\u80a4"))) {
                IiiiiiiiIIIII = (int)(IiiiiiiiIIIII.getValue() * (double)IiiiiiiiIIIII / 100.0);
                if (IiiiiiiiIIIII.getKey().equals("\u52a0\u5f3a\u6c14\u8840")) {
                    IiiiiiiiIIIII.chatBox.addChat(6, "#X#R\u4f60\u7684\u6700\u5927HP\u589e\u52a0\u4e86" + IiiiiiiiIIIII + "%");
                } else if (IiiiiiiiIIIII.getKey().equals("\u52a0\u5f3a\u9b54\u6cd5")) {
                    IiiiiiiiIIIII.chatBox.addChat(6, "#X#R\u4f60\u7684\u6700\u5927MP\u589e\u52a0\u4e86" + IiiiiiiiIIIII + "%");
                } else if (IiiiiiiiIIIII.getKey().equals("\u52a0\u5f3a\u653b\u51fb")) {
                    IiiiiiiiIIIII.chatBox.addChat(6, "#X#R\u4f60\u7684\u6700\u5927AP\u589e\u52a0\u4e86" + IiiiiiiiIIIII + "%");
                } else if (IiiiiiiiIIIII.getKey().equals("\u52a0\u5f3a\u901f\u5ea6")) {
                    IiiiiiiiIIIII.chatBox.addChat(6, "#X#R\u4f60\u7684\u6700\u5927SP\u589e\u52a0\u4e86" + IiiiiiiiIIIII + "%");
                } else {
                    IiiiiiiiIIIII.chatBox.addChat(6, "#X#R" + IiiiiiiiIIIII.getKey() + IiiiiiiiIIIII + iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getKey()));
                }
            }
            ++IiiiiiiiIIIII;
lbl184:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.getQls().length);
    }

    public void ALLATORIxDEMO(GameView gameView) {
        if (gameView.roleUnit.iIiIiiiiIiIii.getFighting() == 0) {
            return;
        }
        BattleScene IiiiiiiiIIIII = gameView.getBattleScene();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.getBattleId() != (long)gameView.roleUnit.iIiIiiiiIiIii.getFighting()) {
            return;
        }
        IiiiiiiiIIIII.iIiIiiiiIIiii(gameView.getBattleControl());
    }

    public void iIiIiiiiIIiii(String mes, int start, int end, GameView gameView) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = start;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < end) {
            IiiiiiiiIIIII4 = mes.indexOf("#", IiiiiiiiIIIII3 + 1);
            if (IiiiiiiiIIIII4 == -1 || IiiiiiiiIIIII4 > end) {
                IiiiiiiiIIIII4 = end;
            }
            if (IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)IiiiiiiiIIIII3, (int)IiiiiiiiIIIII4);
            } else {
                iiIiIiiiiIiii IiiiiiiiIIIII5 = gameView.mapScene.ALLATORIxDEMO(mes.substring(IiiiiiiiIIIII3, IiiiiiiiIIIII4));
                if (IiiiiiiiIIIII5 != null) {
                    if (IiiiiiiiIIIII == 0 && IiiiiiiiIIIII5 == gameView.roleUnit) {
                        this.ALLATORIxDEMO(gameView);
                    }
                    IiiiiiiiIIIII5.iIiIiiiiIiIii.setFighting(IiiiiiiiIIIII);
                    IiiiiiiiIIIII5.ALLATORIxDEMO();
                }
            }
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + 1;
        }
    }

    public void ALLATORIxDEMO(String mes, int start, int end, GameView gameView) {
        int IiiiiiiiIIIII = 0;
        IIIIIiiiIiiII IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = start;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < end) {
            int IiiiiiiiIIIII6;
            int IiiiiiiiIIIII7;
            int IiiiiiiiIIIII8;
            IiiiiiiiIIIII5 = mes.indexOf("^", IiiiiiiiIIIII4 + 1);
            if (IiiiiiiiIIIII5 == -1 || IiiiiiiiIIIII5 > end) {
                IiiiiiiiIIIII5 = end;
            }
            if (IiiiiiiiIIIII3 == 0) {
                IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII5);
            } else if (IiiiiiiiIIIII3 == 1) {
                int IiiiiiiiIIIII9 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII5);
                if (IiiiiiiiIIIII9 == 2) {
                    gameView.mapScene.ALLATORIxDEMO(IiiiiiiiIIIII);
                    return;
                }
                IiiiiiiiIIIII2 = gameView.mapScene.iIiIiiiiIIiii(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII2 == null) {
                    return;
                }
                IiiiiiiiIIIII2.IiiiiiiiIIIII.setType(IiiiiiiiIIIII9);
            } else if (mes.charAt(IiiiiiiiIIIII4) == 'H') {
                int IiiiiiiiIIIII10 = mes.indexOf(",", IiiiiiiiIIIII4 + 1);
                if (IiiiiiiiIIIII10 != -1 && IiiiiiiiIIIII10 <= IiiiiiiiIIIII5) {
                    IiiiiiiiIIIII8 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(IiiiiiiiIIIII4 + 1), (int)IiiiiiiiIIIII10);
                    IiiiiiiiIIIII7 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(IiiiiiiiIIIII10 + 1), (int)IiiiiiiiIIIII5);
                    if (IiiiiiiiIIIII2.IiiiiiiiIIIII.getHP() != null) {
                        IiiiiiiiIIIII2.IiiiiiiiIIIII.getHP().setX(IiiiiiiiIIIII8);
                        IiiiiiiiIIIII2.IiiiiiiiIIIII.getHP().setY(IiiiiiiiIIIII7);
                    } else {
                        IiiiiiiiIIIII2.IiiiiiiiIIIII.setHP(new PathPoint(IiiiiiiiIIIII8, IiiiiiiiIIIII7));
                    }
                }
            } else if (mes.charAt(IiiiiiiiIIIII4) == 'G') {
                iiIiIiiiiIiii IiiiiiiiIIIII11 = gameView.mapScene.ALLATORIxDEMO(new BigDecimal(mes.substring(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII5)));
                if (IiiiiiiiIIIII11 != null) {
                    IiiiiiiiIIIII2.IiiiiiiiIIIII.setFollow(IiiiiiiiIIIII11.ALLATORIxDEMO());
                }
            } else if (mes.charAt(IiiiiiiiIIIII4) == 'Z' && (IiiiiiiiIIIII6 = mes.indexOf(",", IiiiiiiiIIIII4 + 1)) != -1 && IiiiiiiiIIIII6 <= IiiiiiiiIIIII5) {
                IiiiiiiiIIIII8 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(IiiiiiiiIIIII4 + 1), (int)IiiiiiiiIIIII6);
                IiiiiiiiIIIII7 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(IiiiiiiiIIIII6 + 1), (int)IiiiiiiiIIIII5);
                IiiiiiiiIIIII2.IiiiiiiiIIIII.setX(Integer.valueOf(IiiiiiiiIIIII8));
                IiiiiiiiIIIII2.IiiiiiiiIIIII.setY(Integer.valueOf(IiiiiiiiIIIII7));
                IiiiiiiiIIIII2.iiIiIiiiiIIIi = IiiiiiiiIIIII8;
                IiiiiiiiIIIII2.IIiiiiiiiIIIi = IiiiiiiiIIIII7;
            }
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII4 = IiiiiiiiIIIII5 + 1;
        }
    }
}
