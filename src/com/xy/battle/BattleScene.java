/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.battle.BattleBuffUtil
 *  com.xy.battle.BattleConnection
 *  com.xy.battle.BattleControl
 *  com.xy.battle.BattleHandle
 *  com.xy.battle.BattleMan
 *  com.xy.battle.BattlePlay
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleSkillShow
 *  com.xy.battle.BattleVideo
 *  com.xy.battle.FightingEvents
 *  com.xy.bean.FightingEndD
 *  com.xy.bean.SummonPetBean
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.d.IiiiIiiiiIiIi
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.entity.Lingbao
 *  com.xy.game.RolePet
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.battle;

import com.xy.a.a.iiIiIiiiiIiii;
import com.xy.battle.BattleBuffUtil;
import com.xy.battle.BattleConnection;
import com.xy.battle.BattleControl;
import com.xy.battle.BattleHandle;
import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlay;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.BattleVideo;
import com.xy.battle.FightingEvents;
import com.xy.bean.FightingEndD;
import com.xy.bean.SummonPetBean;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.entity.Lingbao;
import com.xy.game.RolePet;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BattleScene {
    private long battleId;
    private long time;
    private String rountString;
    private long controlTime;
    public int battleRoundMax;
    public static final int AUTOMATION_PLAYER = 2000;
    public String campName1;
    private Image[] images;
    private int battleState;
    public String campName2;
    public static final int ROUND_TIME_INDEX = 50;
    public boolean video;
    private int battleRound;
    public boolean battleTip;
    public static final int HANDLEPLAY = 2;
    private int battleEventIndex;
    public int campPetDie2;
    public int campPetDie1;
    private ArrayList<IiIiIiiiiIIiI> showUnitList = new ArrayList();
    public BattleBuffUtil buffUtil;
    public int campLingDie2;
    public static final int HANDLE = 1;
    private long countdown;
    public ArrayList<BattleSkillShow> showSkillList = new ArrayList();
    public long battleMapId;
    private LinkedList<BattleControl> controlList = new LinkedList();
    public static final int USUAL = 0;
    public int campLingDie1;
    public static final int REMOVE = 3333;
    public boolean gameBattle;
    private int battleType;
    private Map<Integer, BattlePlay> battlePlayMap;
    private LinkedList<IiIiIiiiiIIiI> battleUnitList;
    public static final int HANDLE_PET = 2;
    private String musicNow;
    public static final int HANDLEPLAYEND = 3;
    public static final int ROUND_TIME = 50000;
    private String music;
    public static final int HANDLE_PLAYER = 1;
    public static final int AUTOMATION_PET = 750;

    public long getBattleId() {
        return this.battleId;
    }

    public boolean iIiIiiiiIIiii() {
        if (this.battleType == 5) return false;
        if (this.battleType == 11) return false;
        if (this.battleType == 12) return false;
        if (this.battleType == 31) return false;
        if (this.battleType == 33) return false;
        if (this.battleType != 34) return true;
        return false;
    }

    public void ALLATORIxDEMO(String msg, IiIiIiiiiIIiI battleUnit) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)msg)) {
            return;
        }
        for (BattleControl IiiiiiiiIIIII : this.controlList) {
            if (IiiiiiiiIIIII.getRoleId() != (long)battleUnit.ALLATORIxDEMO().getId()) continue;
            IiiiiiiiIIIII.gameView.iiiIiiiiiiIIi(msg);
            return;
        }
    }

    public void ALLATORIxDEMO(GameView gameView) {
        if (gameView.roleUnit.ALLATORIxDEMO() == null) {
            return;
        }
        if (gameView.roleUnit.iIiIiiiiIiIii.getTroop_id() == null) {
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"team5", (String)"D");
        gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
        gameView.getFormManagement().iiiIiiiiiiIIi(13);
    }

    public int getOtherCamp(int battleCamp) {
        Iterator iterator = this.battleUnitList.iterator();
        while (iterator.hasNext()) {
            BattleMan IiiiiiiiIIIII = ((IiIiIiiiiIIiI)iterator.next()).ALLATORIxDEMO();
            if (IiiiiiiiIIIII.getCamp() != battleCamp) return IiiiiiiiIIIII.getCamp();
        }
        return -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String mes, int index) {
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = null;
        var8_8 = this;
        synchronized (var8_8) {
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl47
            do {
                if ((IiiiiiiiIIIII = mes.indexOf("|", index + 1)) == -1) {
                    IiiiiiiiIIIII = mes.length();
                }
                if (IiiiiiiiIIIII == 0) {
                    if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII) != this.battleRound) {
                        return;
                    }
                } else if (IiiiiiiiIIIII == 1) {
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII < 0) {
                        IiiiiiiiIIIII = true;
                        IiiiiiiiIIIII = -IiiiiiiiIIIII;
                    }
                    if (IiiiiiiiIIIII <= this.battleEventIndex) {
                        return;
                    }
                    this.battleEventIndex = IiiiiiiiIIIII;
                } else if (IiiiiiiiIIIII == 2) {
                    IiiiiiiiIIIII = mes.substring(index, IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII.startsWith("\u6280\u80fd,")) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.substring(3);
                        IiiiiiiiIIIII = IiiiiiiiIIIII.substring(0, 2);
                    }
                } else if (IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 4) {
                    IiiiiiiiIIIII = mes.indexOf(",", index + 1);
                    var12_14 = new Point();
                    IiiiiiiiIIIII.x = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)index, (int)IiiiiiiiIIIII);
                    var12_14.y = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mes, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII == 3) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                    } else {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                    }
                }
                ++IiiiiiiiIIIII;
                index = IiiiiiiiIIIII + 1;
lbl47:
                // 2 sources

            } while (IiiiiiiiIIIII < mes.length());
        }
        IiiiiiiiIIIII = this.getBattleUnitByCampMan(IiiiiiiiIIIII.x, IiiiiiiiIIIII.y);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (!IiiiiiiiIIIII) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(true);
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? this.getBattleUnitByCampMan(IiiiiiiiIIIII.x, IiiiiiiiIIIII.y) : null;
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("#F");
        this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, "#G");
        if (IiiiiiiiIIIII.equals("\u9632\u5fa1") || IiiiiiiiIIIII.equals("\u4fdd\u62a4") || IiiiiiiiIIIII.equals("\u6355\u6349") || IiiiiiiiIIIII.equals("\u9003\u8dd1") || IiiiiiiiIIIII.equals("\u53ec\u5524") || IiiiiiiiIIIII.equals("\u53ec\u56de")) {
            IiiiiiiiIIIII.append("#W\u4f7f\u7528");
            IiiiiiiiIIIII.append(IiiiiiiiIIIII);
        } else {
            IiiiiiiiIIIII.append("#W\u5bf9");
            if (IiiiiiiiIIIII != null) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII.x == IiiiiiiiIIIII.x ? "#G" : "#R");
            } else {
                IiiiiiiiIIIII.append("#G\u968f\u673a\u76ee\u6807");
            }
            if (IiiiiiiiIIIII.equals("\u836f")) {
                IiiiiiiiIIIII.append("#W\u4f7f\u7528#Y\u836f\u54c1");
            } else if (IiiiiiiiIIIII.equals("\u6280\u80fd")) {
                IiiiiiiiIIIII.append("#W\u4f7f\u7528#Y");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            } else if (IiiiiiiiIIIII.equals("\u666e\u901a\u653b\u51fb")) {
                IiiiiiiiIIIII.append("#Y\u7269\u7406\u653b\u51fb");
            } else {
                IiiiiiiiIIIII.append("#W\u4f7f\u7528#Y");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII);
            }
        }
        if (IiiiiiiiIIIII) {
            IiiiiiiiIIIII.append("#G(\u989d\u5916\u6307\u4ee4)");
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII.x, IiiiiiiiIIIII.toString());
    }

    public IiIiIiiiiIIiI getBattleUnit(int type, long id) {
        for (IiIiIiiiiIIiI IiiiiiiiIIIII : this.battleUnitList) {
            if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() != type) continue;
            if ((long)IiiiiiiiIIIII.ALLATORIxDEMO().getId() == id) return IiiiiiiiIIIII;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iIiIiiiiIIiii(BattleControl control) {
        BattleScene battleScene = this;
        synchronized (battleScene) {
            if (!this.controlList.remove(control)) {
                return;
            }
            this.controlTime = iIiIIiiiIiiiI.ALLATORIxDEMO();
            control.setBattle(0, null);
            return;
        }
    }

    public void iIiIiiiiIIiIi(IiIiIiiiiIIiI battleUnit) {
        if (battleUnit == null) {
            return;
        }
        this.battleUnitList.add(battleUnit);
    }

    public void iiiIiiiiiiIIi() {
        Iterator iterator = this.battleUnitList.iterator();
        while (iterator.hasNext()) {
            ((IiIiIiiiiIIiI)iterator.next()).iIiIiiiiIIiii(false);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(long pass) {
        var3_2 = this;
        synchronized (var3_2) {
            block28: {
                block27: {
                    block25: {
                        block26: {
                            var5_3 = this.battleUnitList.iterator();
                            if (true) ** GOTO lbl11
                            do {
                                IiiiiiiiIIIII = (IiIiIiiiiIIiI)var5_3.next();
                                IiiiiiiiIIIII.ALLATORIxDEMO(pass);
lbl11:
                                // 2 sources

                            } while (var5_3.hasNext());
                            IiiiiiiiIIIII = this.showSkillList.size() - 1;
                            while (IiiiiiiiIIIII >= 0) {
                                if (this.showSkillList.get(IiiiiiiiIIIII).ALLATORIxDEMO(pass)) {
                                    this.showSkillList.remove(IiiiiiiiIIIII);
                                }
                                --IiiiiiiiIIIII;
                            }
                            if (this.battleState != 1) break block26;
                            IiiiiiiiIIIII = iIiIIiiiIiiiI.iIiIiiiiIIiii();
                            IiiiiiiiIIIII = 50L - (IiiiiiiiIIIII - this.time) / 1000L;
                            if (IiiiiiiiIIIII < 0L) {
                                IiiiiiiiIIIII = 0L;
                            }
                            if (this.countdown == IiiiiiiiIIIII) return;
                            this.countdown = IiiiiiiiIIIII;
                            if (this.countdown >= 47L) return;
                            var9_11 = this.controlList.iterator();
                            if (true) ** GOTO lbl64
                        }
                        if (this.battleState != 2) return;
                        IiiiiiiiIIIII = this.battlePlayMap.get(this.battleRound);
                        if (IiiiiiiiIIIII == null) {
                            this.ALLATORIxDEMO(3, iIiIIiiiIiiiI.iIiIiiiiIIiii());
                            return;
                        }
                        IiiiiiiiIIIII = true;
                        if (!IiiiiiiiIIIII.ALLATORIxDEMO()) break block27;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getState();
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII = BattleHandle.ALLATORIxDEMO((FightingEvents)IiiiiiiiIIIII.getEvents(), (int)IiiiiiiiIIIII.getProgress(), (BattleScene)this);
                            IiiiiiiiIIIII.setState(IiiiiiiiIIIII);
                        }
                        try {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
                            while (IiiiiiiiIIIII >= 0) {
                                IiiiiiiiIIIII = (BattlePlayProgress)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                                if (!IiiiiiiiIIIII.ALLATORIxDEMO(pass) && (IiiiiiiiIIIII = IiiiiiiiIIIII.getBattleUnit()).ALLATORIxDEMO(IiiiiiiiIIIII)) {
                                    IiiiiiiiIIIII = false;
                                }
                                --IiiiiiiiIIIII;
                            }
                            IiiiiiiiIIIII = this.showSkillList.size() - 1;
                            while (IiiiiiiiIIIII >= 0) {
                                IiiiiiiiIIIII = this.showSkillList.get(IiiiiiiiIIIII);
                                if (IiiiiiiiIIIII.getShadowMode() != null) {
                                    IiiiiiiiIIIII = false;
                                    break block25;
                                }
                                --IiiiiiiiIIIII;
                            }
                            break block25;
                        }
                        catch (Exception IiiiiiiiIIIII) {
                            IiiiiiiiIIIII.printStackTrace();
                        }
                        break block25;
                        do {
                            IiiiiiiiIIIII = (BattleControl)var9_11.next();
                            IiiiiiiiIIIII.ALLATORIxDEMO(this.countdown);
lbl64:
                            // 2 sources

                        } while (var9_11.hasNext());
                        break block28;
                    }
                    if (IiiiiiiiIIIII) {
                        IiiiiiiiIIIII.setProgress(IiiiiiiiIIIII.getProgress() + 1);
                        IiiiiiiiIIIII.setState(null);
                        this.musicNow = null;
                        IiiiiiiiIIIII = null;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
                        while (IiiiiiiiIIIII >= 0) {
                            IiiiiiiiIIIII = (BattlePlayProgress)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                            v1 = IiiiiiiiIIIII = IiiiiiiiIIIII.getEscape() == 1 ? IiiiiiiiIIIII.getBattleUnit() : null;
                            if (IiiiiiiiIIIII != null) {
                                if (IiiiiiiiIIIII == null) {
                                    IiiiiiiiIIIII = new ArrayList<IiIiIiiiiIIiI>();
                                }
                                IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                            }
                            --IiiiiiiiIIIII;
                        }
                        IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() - 1 : -1;
                        while (IiiiiiiiIIIII >= 0) {
                            this.iIiIiiiiIIiii((IiIiIiiiiIIiI)IiiiiiiiIIIII.get(IiiiiiiiIIIII--));
                        }
                    }
                }
                if (!IiiiiiiiIIIII.ALLATORIxDEMO()) {
                    this.ALLATORIxDEMO(3, iIiIIiiiIiiiI.iIiIiiiiIIiii());
                } else {
                    if (IiiiiiiiIIIII == false) return;
                    if (this.battleState != 2) return;
                    this.ALLATORIxDEMO(0L);
                }
            }
            return;
        }
    }

    public void iiiIiiiiiiIIi(IiIiIiiiiIIiI battleUnit) {
        BattleMan IiiiiiiiIIIII = battleUnit.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getType() == 0 ? battleUnit.ALLATORIxDEMO().getId() : (IiiiiiiiIIIII.getType() == 1 ? IiiiiiiiIIIII.getCampId() : 0);
        if (IiiiiiiiIIIII2 == 0L) {
            return;
        }
        for (BattleControl IiiiiiiiIIIII3 : this.controlList) {
            if (IiiiiiiiIIIII3.getRoleId() != IiiiiiiiIIIII2) continue;
            GameView IiiiiiiiIIIII4 = IiiiiiiiIIIII3.gameView;
            if (IiiiiiiiIIIII.getType() != 0) {
                if (IiiiiiiiIIIII.getType() != 1) return;
                IiiiiiiiIIIII4.baseView.ALLATORIxDEMO(0, (double)IiiiiiiiIIIII.getHp_Current() / (double)IiiiiiiiIIIII.getHp_Total());
                IiiiiiiiIIIII4.baseView.ALLATORIxDEMO(1, (double)IiiiiiiiIIIII.getMp_Current() / (double)IiiiiiiiIIIII.getMp_Total());
                return;
            }
            IiiiiiiiIIIII3.nqz = String.valueOf(IiiiiiiiIIIII.getNqz());
            IiiiiiiiIIIII3.yqz = String.valueOf(IiiiiiiiIIIII.getYqz());
            if (this.iIiIiiiiIIiii()) {
                IiiiiiiiIIIII4.roleData.getLoginResult().setHp(new BigDecimal(IiiiiiiiIIIII.getHp_Current()));
                IiiiiiiiIIIII4.roleData.getLoginResult().setMp(new BigDecimal(IiiiiiiiIIIII.getMp_Current()));
            }
            IiiiiiiiIIIII4.baseView.iIiIiiiiIIiii(0, (double)IiiiiiiiIIIII.getHp_Current() / (double)IiiiiiiiIIIII.getHp_Total());
            IiiiiiiiIIIII4.baseView.iIiIiiiiIIiii(1, (double)IiiiiiiiIIIII.getMp_Current() / (double)IiiiiiiiIIIII.getMp_Total());
            return;
        }
    }

    public void iiiIiiiiiiIIi(String path) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)path)) {
            return;
        }
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)path, (String)this.musicNow)) {
            return;
        }
        this.musicNow = path;
        Iterator iterator = this.controlList.iterator();
        while (iterator.hasNext()) {
            ((BattleControl)iterator.next()).gameView.iIiIiiiiIIiii(false, String.valueOf(path) + ".mp3");
        }
    }

    public void ALLATORIxDEMO(int camp, String msg) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)msg)) {
            return;
        }
        for (BattleControl IiiiiiiiIIIII : this.controlList) {
            if (camp != -1 && camp != IiiiiiiiIIIII.battleCamp || !IiiiiiiiIIIII.gameView.getClient().gameText) continue;
            IiiiiiiiIIIII.gameView.chatBox.addChat(10, msg);
        }
    }

    public void ALLATORIxDEMO(BattleVideo battleVideo) {
        if (this.battleUnitList == null) {
            this.battleUnitList = new LinkedList();
        }
        if (this.battlePlayMap == null) {
            this.battlePlayMap = new HashMap<Integer, BattlePlay>();
        }
        this.battleRound = battleVideo.getRound();
        this.rountString = "\u7b2c " + this.battleRound + " \u56de \u5408";
        this.iIiIiiiiIIiii(battleVideo.getTip());
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < battleVideo.getLists().size()) {
            BattlePlay IiiiiiiiIIIII22 = new BattlePlay(0L, this.battleRound + IiiiiiiiIIIII);
            IiiiiiiiIIIII22.setRound((List)battleVideo.getLists().get(IiiiiiiiIIIII));
            int n = this.battleRound + IiiiiiiiIIIII;
            ++IiiiiiiiIIIII;
            this.battlePlayMap.put(n, IiiiiiiiIIIII22);
        }
        this.buffUtil.iIiIiiiiIIiii(battleVideo.getBuff());
        this.battleUnitList.clear();
        List IiiiiiiiIIIII2 = battleVideo.getDatas();
        for (BattlePlay IiiiiiiiIIIII22 : IiiiiiiiIIIII2) {
            this.ALLATORIxDEMO((BattleMan)IiiiiiiiIIIII22);
        }
        this.video = true;
        this.ALLATORIxDEMO(2, 0L);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int state, long time) {
        block6: {
            block5: {
                this.battleState = state;
                this.time = time;
                if (this.battleState != 1) break block5;
                this.iiiIiiiiiiIIi();
                var5_3 = this.controlList.iterator();
                if (true) ** GOTO lbl30
            }
            if (this.battleState != 2) break block6;
            this.ALLATORIxDEMO(-1, "#F*****\u7b2c#Y " + this.battleRound + " #W\u56de\u5408\u6218\u6597\u6307\u4ee4\u7ed3\u675f*****");
            var5_4 = this.controlList.iterator();
            if (true) ** GOTO lbl35
        }
        if (this.battleState != 3) return;
        this.iIiIiiiiIIiii();
        if (this.video) {
            ++this.battleRound;
            this.rountString = "\u7b2c " + this.battleRound + " \u56de \u5408";
            IiiiiiiiIIIII = this.battlePlayMap.get(this.battleRound);
            v0 = this;
            if (IiiiiiiiIIIII != null) {
                v0.ALLATORIxDEMO(2, 0L);
                return;
            }
            v0.ALLATORIxDEMO();
            return;
        }
        var5_5 = this.controlList.iterator();
        if (true) ** GOTO lbl40
        do {
            IiiiiiiiIIIII = (BattleControl)var5_3.next();
            IiiiiiiiIIIII.IIIIIiiiiIIii();
lbl30:
            // 2 sources

        } while (var5_3.hasNext());
        return;
        do {
            IiiiiiiiIIIII = (BattleControl)var5_4.next();
            IiiiiiiiIIIII.iIiIiiiiIIiIi();
lbl35:
            // 2 sources

        } while (var5_4.hasNext());
        return;
        do {
            IiiiiiiiIIIII = (BattleControl)var5_5.next();
            IiiiiiiiIIIII.ALLATORIxDEMO(this.battleRound);
lbl40:
            // 2 sources

        } while (var5_5.hasNext());
    }

    public IiIiIiiiiIIiI getHandleUnit(long roleId) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = null;
        for (IiIiIiiiiIIiI IiiiiiiiIIIII2 : this.battleUnitList) {
            if (IiiiiiiiIIIII2.iIiIiiiiIIiii()) continue;
            BattleMan IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO();
            if (IiiiiiiiIIIII3.getType() == 0 && (long)IiiiiiiiIIIII3.getId() == roleId) {
                IiiiiiiiIIIII = IiiiiiiiIIIII2;
                return IiiiiiiiIIIII;
            }
            if (IiiiiiiiIIIII3.getType() != 1 || (long)IiiiiiiiIIIII3.getCampId().intValue() != roleId || IiiiiiiiIIIII != null && IiiiiiiiIIIII3.getId() <= IiiiiiiiIIIII.ALLATORIxDEMO().getId()) continue;
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public IiIiIiiiiIIiI getPetUnit(long roleId) {
        for (IiIiIiiiiIIiI IiiiiiiiIIIII : this.battleUnitList) {
            BattleMan IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO();
            if (IiiiiiiiIIIII2.getType() != 1 || (long)IiiiiiiiIIIII2.getCampId().intValue() != roleId) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(int camp, int man, BigDecimal sid) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = this.getBattleUnitByCampMan(camp, man);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() != 0) {
            return;
        }
        for (BattleControl IiiiiiiiIIIII2 : this.controlList) {
            void IiiiiiiiIIIII3;
            if (IiiiiiiiIIIII2.getRoleId() != (long)IiiiiiiiIIIII.ALLATORIxDEMO().getId()) continue;
            GameView IiiiiiiiIIIII4 = IiiiiiiiIIIII2.gameView;
            if (IiiiiiiiIIIII4.roleData.pets.size() >= 21) {
                IiiiiiiiIIIII4.iiiIiiiiiiIIi("\u60a8\u7684\u53ec\u5524\u517d\u53ef\u643a\u5e26\u7684\u6570\u91cf\u5df2\u6ee1\uff01\uff01\uff01");
                return;
            }
            SummonPetBean summonPetBean = new SummonPetBean();
            IiiiiiiiIIIII3.setPetid(sid);
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"summonpet", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII3));
            IiiiiiiiIIIII4.getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
            IiiiiiiiIIIII4.chatBox.addChat(5, "#T#Y\u83b7\u5f97\u60a8\u6210\u529f\u6355\u83b7\u4e86\u53ec\u5524\u517d");
            return;
        }
    }

    public void iIiIiiiiIIiii(int type, BattleMan battleMan) {
        if (battleMan.getType() != 3) {
            return;
        }
        IiIiIiiiiIIiI IiiiiiiiIIIII = this.getBattleUnitByCampMan(battleMan.getCamp(), battleMan.getMan() - 10);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        for (BattleControl IiiiiiiiIIIII2 : this.controlList) {
            if (IiiiiiiiIIIII2.getRoleId() != (long)IiiiiiiiIIIII.ALLATORIxDEMO().getId()) continue;
            GameView IiiiiiiiIIIII3 = IiiiiiiiIIIII2.gameView;
            Lingbao IiiiiiiiIIIII4 = type == 0 ? IiiiiiiiIIIII3.roleData.getLingbao(new BigDecimal(battleMan.getId())) : null;
            IiiiiiiiIIIII3.baseView.iIiIiiiiIIiii().ALLATORIxDEMO(type == 0 && IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4 : null);
            return;
        }
    }

    public void ALLATORIxDEMO(StringBuffer buffer, IiIiIiiiiIIiI battleUnit, String color) {
        IiIiIiiiiIIiI IiiiiiiiIIIII;
        buffer.append(color);
        if (battleUnit.ALLATORIxDEMO().getType() == 1 && (IiiiiiiiIIIII = this.getBattleUnit(0, battleUnit.ALLATORIxDEMO().getCampId().intValue())) != null) {
            buffer.append(IiiiiiiiIIIII.ALLATORIxDEMO());
            buffer.append("#W\u7684");
            buffer.append(color);
        }
        buffer.append(battleUnit.ALLATORIxDEMO());
    }

    public void setHandleUnit(long roleId, int type, boolean operate) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = null;
        for (IiIiIiiiiIIiI IiiiiiiiIIIII2 : this.battleUnitList) {
            BattleMan IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO();
            if (IiiiiiiiIIIII3.getType() != type) continue;
            if (IiiiiiiiIIIII3.getType() == 0 && (long)IiiiiiiiIIIII3.getId() == roleId) {
                IiiiiiiiIIIII = IiiiiiiiIIIII2;
                break;
            }
            if (IiiiiiiiIIIII3.getType() != 1 || (long)IiiiiiiiIIIII3.getCampId().intValue() != roleId || IiiiiiiiIIIII != null && IiiiiiiiIIIII3.getId() <= IiiiiiiiIIIII.ALLATORIxDEMO().getId()) continue;
            IiiiiiiiIIIII = IiiiiiiiIIIII2;
        }
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.iIiIiiiiIIiii(operate);
    }

    public IiIiIiiiiIIiI ALLATORIxDEMO(int camp, int man) {
        Iterator IiiiiiiiIIIII = this.battleUnitList.iterator();
        while (IiiiiiiiIIIII.hasNext()) {
            IiIiIiiiiIIiI IiiiiiiiIIIII2 = (IiIiIiiiiIIiI)IiiiiiiiIIIII.next();
            if (IiiiiiiiIIIII2.ALLATORIxDEMO().getCamp() != camp || IiiiiiiiIIIII2.ALLATORIxDEMO().getMan() != man) continue;
            IiiiiiiiIIIII.remove();
            return IiiiiiiiIIIII2;
        }
        return null;
    }

    public void iIiIiiiiIIiii(String tip) {
        this.battleTip = !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)tip);
        this.battleRoundMax = 120;
        this.campName1 = null;
        this.campPetDie1 = 0;
        this.campLingDie1 = 0;
        this.campName2 = null;
        this.campPetDie2 = 0;
        this.campLingDie2 = 0;
        if (!this.battleTip) return;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < tip.length()) {
            int IiiiiiiiIIIII4;
            IiiiiiiiIIIII3 = tip.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = tip.length();
            }
            if (IiiiiiiiIIIII == 0) {
                this.battleRoundMax = IIiiIiiiiIIiI.ALLATORIxDEMO((String)tip, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII == 1) {
                this.campName1 = tip.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII == 2) {
                this.campName2 = tip.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII == 3) {
                int n = tip.indexOf(",", IiiiiiiiIIIII2 + 1);
                this.campPetDie1 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)tip, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII4);
                this.campLingDie1 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)tip, (int)(IiiiiiiiIIIII4 + true), (int)IiiiiiiiIIIII3);
            } else if (IiiiiiiiIIIII == 3) {
                IiiiiiiiIIIII4 = tip.indexOf(",", IiiiiiiiIIIII2 + 1);
                this.campPetDie2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)tip, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII4);
                this.campLingDie2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)tip, (int)(IiiiiiiiIIIII4 + 1), (int)IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(IiIiIiiiiIIiI battleUnit) {
        int IiiiiiiiIIIII = battleUnit.ALLATORIxDEMO().getType();
        int IiiiiiiiIIIII2 = battleUnit.ALLATORIxDEMO().getCamp();
        int IiiiiiiiIIIII3 = battleUnit.ALLATORIxDEMO().getMan();
        this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
        if (IiiiiiiiIIIII != 0) {
            if (IiiiiiiiIIIII != 2) return;
            if (IiiiiiiiIIIII3 < 0) return;
            if (IiiiiiiiIIIII3 > 4) return;
            this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3 + 10);
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3 + 5);
        this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3 + 10);
        this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3 + 15);
        long IiiiiiiiIIIII4 = battleUnit.ALLATORIxDEMO().getId();
        for (BattleControl IiiiiiiiIIIII5 : this.controlList) {
            void IiiiiiiiIIIII6;
            if (IiiiiiiiIIIII5.getRoleId() != IiiiiiiiIIIII4) continue;
            this.ALLATORIxDEMO(IiiiiiiiIIIII5.gameView);
            FightingEndD fightingEndD = new FightingEndD();
            IiiiiiiiIIIII6.setFightingsumber((int)this.battleId);
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"fig6", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII6));
            IiiiiiiiIIIII5.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(int round) {
        BattleScene battleScene = this;
        synchronized (battleScene) {
            if (round <= this.battleRound) {
                return;
            }
            if (this.battleState == 1) {
                return;
            }
            long IiiiiiiiIIIII = 25L;
            while (this.battleState == 2) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII);
            }
            this.battleRound = round;
            this.rountString = "\u7b2c " + this.battleRound + " \u56de \u5408";
            this.ALLATORIxDEMO(1, iIiIIiiiIiiiI.iIiIiiiiIIiii());
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(int round, BattlePlay battlePlay) {
        BattleScene battleScene = this;
        synchronized (battleScene) {
            if (this.battlePlayMap.get(round) != null) {
                return;
            }
            if (round < this.battleRound) {
                return;
            }
            this.battlePlayMap.put(round, battlePlay);
            this.ALLATORIxDEMO(2, iIiIIiiiIiiiI.iIiIiiiiIIiii());
            return;
        }
    }

    public void iIiIiiiiIIiii() {
        Iterator IiiiiiiiIIIII = this.battleUnitList.iterator();
        while (IiiiiiiiIIIII.hasNext()) {
            IiIiIiiiiIIiI IiiiiiiiIIIII2 = (IiIiIiiiiIIiI)IiiiiiiiIIIII.next();
            if (IiiiiiiiIIIII2.ALLATORIxDEMO().getHp_Current() > 0 || IiiiiiiiIIIII2.ALLATORIxDEMO().getType() == 0 || IiiiiiiiIIIII2.ALLATORIxDEMO().getType() == 2 && (IiiiiiiiIIIII2.ALLATORIxDEMO().getDie() == null || IiiiiiiiIIIII2.ALLATORIxDEMO().getDie() != 1)) continue;
            IiiiiiiiIIIII.remove();
            if (IiiiiiiiIIIII2.ALLATORIxDEMO().getType() == 1) {
                this.ALLATORIxDEMO(1, IiiiiiiiIIIII2.ALLATORIxDEMO());
                continue;
            }
            if (IiiiiiiiIIIII2.ALLATORIxDEMO().getType() != 3) continue;
            this.iIiIiiiiIIiii(1, IiiiiiiiIIIII2.ALLATORIxDEMO());
        }
    }

    public void ALLATORIxDEMO(String msg) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)msg)) {
            return;
        }
        Iterator iterator = this.controlList.iterator();
        while (iterator.hasNext()) {
            ((BattleControl)iterator.next()).gameView.chatBox.addChat(0, msg);
        }
    }

    public boolean ALLATORIxDEMO(IiIiIiiiiIIiI battleUnit) {
        if (battleUnit.ALLATORIxDEMO().getHp_Current() > 0) {
            return false;
        }
        long IiiiiiiiIIIII = battleUnit.ALLATORIxDEMO().getId();
        Iterator iterator = this.battleUnitList.iterator();
        while (iterator.hasNext()) {
            BattleMan IiiiiiiiIIIII2 = ((IiIiIiiiiIIiI)iterator.next()).ALLATORIxDEMO();
            if (IiiiiiiiIIIII2.getType() != 1 || (long)IiiiiiiiIIIII2.getCampId().intValue() != IiiiiiiiIIIII || IiiiiiiiIIIII2.getHp_Current() <= 0) continue;
            return false;
        }
        return true;
    }

    public IiIiIiiiiIIiI getBattleUnitByCampMan(int camp, int man) {
        for (IiIiIiiiiIIiI IiiiiiiiIIIII : this.battleUnitList) {
            BattleMan IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO();
            if (IiiiiiiiIIIII2.getCamp() != camp) continue;
            if (IiiiiiiiIIIII2.getMan() == man) return IiiiiiiiIIIII;
        }
        return null;
    }

    public int getBattleType() {
        return this.battleType;
    }

    public void ALLATORIxDEMO(IiIiIiiiiIIiI battleUnit) {
        if (battleUnit.ALLATORIxDEMO().getType() != 0) {
            return;
        }
        for (BattleControl IiiiiiiiIIIII : this.controlList) {
            if (IiiiiiiiIIIII.getRoleId() != (long)battleUnit.ALLATORIxDEMO().getId()) continue;
            IiiiiiiiIIIII.ALLATORIxDEMO(battleUnit.ALLATORIxDEMO().ALLATORIxDEMO("\u6280\u80fd"));
            return;
        }
    }

    public void ALLATORIxDEMO(int type, BattleMan battleMan) {
        if (battleMan.getType() != 1) {
            return;
        }
        for (BattleControl IiiiiiiiIIIII : this.controlList) {
            iiIiIiiiiIiii IiiiiiiiIIIII2;
            RolePet IiiiiiiiIIIII3;
            if (IiiiiiiiIIIII.getRoleId() != (long)battleMan.getCampId().intValue()) continue;
            GameView IiiiiiiiIIIII4 = IiiiiiiiIIIII.gameView;
            RolePet rolePet = IiiiiiiiIIIII3 = type == 0 ? IiiiiiiiIIIII4.roleData.getRolePet((long)battleMan.getId()) : null;
            if (IiiiiiiiIIIII3 != null && (IiiiiiiiIIIII2 = (iiIiIiiiiIiii)IiiiiiiiIIIII4.getFormManagement().iiiIiiiiiiIIi(6)) != null) {
                IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII3);
            }
            IiiiiiiiIIIII4.baseView.ALLATORIxDEMO().ALLATORIxDEMO((Object)(IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getPet() : null));
            return;
        }
    }

    public BattleScene() {
        int IiiiiiiiIIIII = IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(13);
        this.music = IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1 ? "m" + (1 + IiiiiiiiIIIII) + ".mp3" : (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 6 ? "m" + (2 + IiiiiiiiIIIII) + ".mp3" : (IiiiiiiiIIIII >= 7 && IiiiiiiiIIIII <= 12 ? "m" + (3 + IiiiiiiiIIIII) + ".mp3" : "m1.mp3"));
        this.buffUtil = new BattleBuffUtil(this);
        this.images = new Image[14];
        this.controlTime = iIiIIiiiIiiiI.ALLATORIxDEMO();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public IiIiIiiiiIIiI ALLATORIxDEMO(BattleMan battleMan) {
        if (battleMan == null) {
            return null;
        }
        var2_2 = this;
        synchronized (var2_2) {
            IiiiiiiiIIIII = this.battleUnitList.iterator();
            if (true) ** GOTO lbl13
            do {
                if ((IiiiiiiiIIIII = (IiIiIiiiiIIiI)IiiiiiiiIIIII.next()).ALLATORIxDEMO().getCamp() != battleMan.getCamp() || IiiiiiiiIIIII.ALLATORIxDEMO().getMan() != battleMan.getMan()) continue;
                IiiiiiiiIIIII.remove();
lbl13:
                // 3 sources

            } while (IiiiiiiiIIIII.hasNext());
            IiiiiiiiIIIII = new IiIiIiiiiIIiI(battleMan, this);
            this.battleUnitList.add(IiiiiiiiIIIII);
            return IiiiiiiiIIIII;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(BattleConnection connection) {
        var2_2 = this;
        synchronized (var2_2) {
            if (this.battleRound == connection.getRound() && this.battleState == connection.getState()) {
                return;
            }
            if (this.battleUnitList == null) {
                this.battleUnitList = new LinkedList<E>();
            }
            if (this.battlePlayMap == null) {
                this.battlePlayMap = new HashMap<Integer, BattlePlay>();
            }
            this.battleId = connection.getFightingNumber();
            this.battleRound = connection.getRound();
            this.rountString = "\u7b2c " + this.battleRound + " \u56de \u5408";
            this.iIiIiiiiIIiii(connection.tip);
            if (connection.getPlayeEvents() != null) {
                this.battlePlayMap.put(this.battleRound, connection.getPlay());
            }
            this.buffUtil.iIiIiiiiIIiii(connection.getBuff());
            this.battleUnitList.clear();
            var5_3 = connection.getDatas().iterator();
            if (true) ** GOTO lbl27
            do {
                IiiiiiiiIIIII = (BattleMan)var5_3.next();
                this.ALLATORIxDEMO(IiiiiiiiIIIII);
lbl27:
                // 2 sources

            } while (var5_3.hasNext());
            if (connection.getState() == 0) {
                this.ALLATORIxDEMO(1, iIiIIiiiIiiiI.iIiIiiiiIIiii() - connection.getTime());
            } else if (connection.getState() == 1) {
                this.ALLATORIxDEMO(1, iIiIIiiiIiiiI.iIiIiiiiIIiii() - connection.getTime());
            } else if (connection.getState() == 2) {
                this.ALLATORIxDEMO(2, iIiIIiiiIiiiI.iIiIiiiiIIiii() - connection.getTime());
                IiiiiiiiIIIII = connection.getTime();
                var6_6 = 25L;
                v1 = IiiiiiiiIIIII;
                while (v1 > 0L) {
                    v1 = IiiiiiiiIIIII -= IiiiiiiiIIIII;
                    this.ALLATORIxDEMO((long)IiiiiiiiIIIII);
                }
            } else {
                if (connection.getState() != 3) return;
                this.ALLATORIxDEMO(3, iIiIIiiiIiiiI.iIiIiiiiIIiii() - connection.getTime());
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics g, BattleControl battleControl) {
        int IiiiiiiiIIIII = battleControl.battleCamp == -1 ? 1 : battleControl.battleCamp;
        iiiiiiiiiiIiI IiiiiiiiIIIII2 = null;
        this.showUnitList.clear();
        double IiiiiiiiIIIII3 = (double)battleControl.gameView.screenData.Screen_x / 1024.0;
        double IiiiiiiiIIIII4 = (double)battleControl.gameView.screenData.Screen_y / 700.0;
        int IiiiiiiiIIIII5 = Math.max(0, (battleControl.gameView.screenData.Screen_x - 1024) / 2);
        int IiiiiiiiIIIII6 = Math.max(0, (battleControl.gameView.screenData.Screen_y - 700) / 2);
        int IiiiiiiiIIIII7 = battleControl.gameView.getMousePoint().x;
        int IiiiiiiiIIIII8 = battleControl.gameView.getMousePoint().y;
        for (IiIiIiiiiIIiI iiIiIiiiiIIiI : this.battleUnitList) {
            void IiiiiiiiIIIII9;
            IiiiiiiiIIIII9.ALLATORIxDEMO(IiiiiiiiIIIII3, IiiiiiiiIIIII4, IiiiiiiiIIIII5, IiiiiiiiIIIII6, IiiiiiiiIIIII);
            if ((IiiiiiiiIIIII2 == null || IiiiiiiiIIIII2.IIiiiiiiiIIIi < IiiiiiiiIIIII9.IIiiiiiiiIIIi) && IiiiiiiiIIIII9.ALLATORIxDEMO().getType() != 3 && IiiiiiiiIIIII9.ALLATORIxDEMO().getType() != 4 && IiiiiiiiIIIII9.ALLATORIxDEMO().getType() != 999 && IiiiiiiiIIIII9.ALLATORIxDEMO(IiiiiiiiIIIII7, IiiiiiiiIIIII8)) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII9;
            }
            this.showUnitList.add((IiIiIiiiiIIiI)IiiiiiiiIIIII9);
        }
        com.xy.d.IiiiIiiiiIiIi.ALLATORIxDEMO(this.showUnitList, (int)0, (int)(this.showUnitList.size() - 1));
        battleControl.setXZUnit(IiiiiiiiIIIII2);
        if (this.images[11] == null) {
            if (battleControl.gameView.getClient().ALLATORIxDEMO(2, 11)) {
                this.images[11] = this.battleMapId == 1207L || this.battleMapId == 1236L || this.battleMapId == 1237L || this.battleMapId == 1238L || this.battleMapId == 1243L || this.battleMapId >= 1246L && this.battleMapId <= 1250L || this.battleMapId >= 1297L && this.battleMapId <= 1300L || this.battleMapId == 3000L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(5)) : (this.battleMapId == 1228L || this.battleMapId == 1229L || this.battleMapId == 1277L || this.battleMapId >= 3360L && this.battleMapId <= 3363L || this.battleMapId == 40001L || this.battleMapId == 40002L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(19)) : (this.battleMapId >= 1230L && this.battleMapId <= 1234L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(17)) : (this.battleMapId == 3304L || this.battleMapId == 3305L || this.battleMapId == 3318L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(18)) : (this.battleMapId == 1244L || this.battleMapId == 1245L || this.battleMapId == 1272L || this.battleMapId == 3156L || this.battleMapId == 3161L || this.battleMapId == 3180L || this.battleMapId == 3190L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(15)) : (this.battleMapId == 3011L || this.battleMapId == 3203L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(16)) : (this.battleMapId == 1254L || this.battleMapId == 1255L || this.battleMapId == 1256L || this.battleMapId >= 1282L && this.battleMapId <= 1288L || this.battleMapId == 3323L || this.battleMapId == 3325L || this.battleMapId == 3326L || this.battleMapId == 40003L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(13)) : (this.battleMapId >= 1257L && this.battleMapId <= 1266L || this.battleMapId >= 1289L && this.battleMapId <= 1295L || this.battleMapId == 3324L || this.battleMapId == 3327L || this.battleMapId == 3328L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(14)) : (this.battleMapId == 1176L || this.battleMapId == 1267L || this.battleMapId == 1296L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(12)) : (this.battleMapId == 1278L || this.battleMapId == 1279L || this.battleMapId == 1280L || this.battleMapId == 3015L || this.battleMapId == 3205L || this.battleMapId >= 3208L && this.battleMapId <= 3211L || this.battleMapId == 3301L || this.battleMapId == 3302L || this.battleMapId == 3303L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(21)) : (this.battleMapId == 1210L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(20)) : (this.battleMapId == 3012L || this.battleMapId == 3013L || this.battleMapId == 3014L || this.battleMapId == 40007L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(22)) : (this.battleMapId == 3316L || this.battleMapId == 3317L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(23)) : (this.battleMapId == 1214L || this.battleMapId == 1215L || this.battleMapId == 1216L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(24)) : (this.battleMapId == 1211L || this.battleMapId == 1227L || this.battleMapId >= 1268L && this.battleMapId <= 1271L || this.battleMapId >= 1273L && this.battleMapId <= 1276L || this.battleMapId == 1281L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(25)) : (this.battleMapId == 3202L || this.battleMapId == 3334L || this.battleMapId == 3335L || this.battleMapId == 3336L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(26)) : (this.battleMapId == 1860L || this.battleMapId == 3312L || this.battleMapId == 3313L || this.battleMapId == 3314L || this.battleMapId == 3373L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(27)) : (this.battleMapId == 3204L || this.battleMapId >= 3329L && this.battleMapId <= 3333L || this.battleMapId == 3353L || this.battleMapId == 3354L || this.battleMapId == 3355L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(28)) : (this.battleMapId == 1950L || this.battleMapId == 3010L || this.battleMapId == 3315L || this.battleMapId == 3320L || this.battleMapId == 3356L || this.battleMapId == 3365L || this.battleMapId >= 40008L && this.battleMapId <= 40012L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(3)) : (this.battleMapId == 1241L || this.battleMapId == 3016L || this.battleMapId == 3017L || this.battleMapId == 3201L || this.battleMapId == 3319L || this.battleMapId == 3321L || this.battleMapId == 3322L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(2)) : (this.battleMapId == 1240L || this.battleMapId == 3155L || this.battleMapId == 3352L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(1)) : (this.battleMapId == 1193L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(10)) : (this.battleMapId >= 1221L && this.battleMapId <= 1226L || this.battleMapId == 3306L || this.battleMapId == 3311L || this.battleMapId >= 3338L && this.battleMapId <= 3351L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(7)) : (this.battleMapId == 1136L || this.battleMapId == 1208L || this.battleMapId == 3307L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(6)) : (this.battleMapId == 3308L || this.battleMapId == 3309L || this.battleMapId == 3310L || this.battleMapId == 3337L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(4)) : (this.battleMapId == 1242L || this.battleMapId == 3364L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(9)) : (this.battleMapId == 1213L || this.battleMapId == 1251L || this.battleMapId == 1252L || this.battleMapId == 1253L || this.battleMapId == 40004L || this.battleMapId == 40005L || this.battleMapId == 40006L ? IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(8)) : IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(1L + this.battleId / 100000L % 28L))))))))))))))))))))))))))));
            }
            if (this.images[11] == null || this.images[11] == IIIIIiiiIiiII.ALLATORIxDEMO()) {
                long IiiiiiiiIIIII10 = this.battleId / 100000L;
                IiiiiiiiIIIII10 %= 5L;
                this.images[11] = IIIIIiiiIiiII.ALLATORIxDEMO((String)String.valueOf(++IiiiiiiiIIIII10));
            }
        }
        g.drawImage(this.images[11], 0, 0, battleControl.gameView.screenData.Screen_x, battleControl.gameView.screenData.Screen_y, null);
        this.buffUtil.iIiIiiiiIIiii(g, IiiiiiiiIIIII, battleControl);
        int IiiiiiiiIIIII11 = 0;
        while (IiiiiiiiIIIII11 < this.showUnitList.size()) {
            this.showUnitList.get(++IiiiiiiiIIIII11).ALLATORIxDEMO(g, IiiiiiiiIIIII, IiiiiiiiIIIII2, battleControl);
        }
        IiiiiiiiIIIII11 = 0;
        while (IiiiiiiiIIIII11 < this.showSkillList.size()) {
            this.showSkillList.get(++IiiiiiiiIIIII11).ALLATORIxDEMO(g, IiiiiiiiIIIII, battleControl);
        }
        IiiiiiiiIIIII11 = 0;
        while (IiiiiiiiIIIII11 < this.showUnitList.size()) {
            this.showUnitList.get(++IiiiiiiiIIIII11).ALLATORIxDEMO(g, IiiiiiiiIIIII);
        }
        this.buffUtil.ALLATORIxDEMO(g, IiiiiiiiIIIII, battleControl);
        this.ALLATORIxDEMO(g);
        if (battleControl.battleCamp != -1) {
            g.setFont(iiIIiiiiIiiII.iIIIIiiiiiIiI);
            g.setColor(Color.yellow);
            if (this.images[12] == null) {
                this.images[12] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/map/yq.png");
            }
            if (this.images[13] == null) {
                this.images[13] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/map/nq.png");
            }
            IiiiiiiiIIIII11 = battleControl.gameView.screenData.Screen_x / 2;
            g.drawImage(this.images[12], IiiiiiiiIIIII11, 15, null);
            Graphics graphics = g;
            graphics.drawString(battleControl.yqz, IiiiiiiiIIIII11 += 20, 30);
            graphics.drawImage(this.images[13], IiiiiiiiIIIII11 += 45, 15, null);
            g.drawString(battleControl.nqz, IiiiiiiiIIIII11 += 20, 30);
        }
        if (this.battleState != 1) return;
        if (battleControl.getHandleUnit() == null) {
            if (this.images[10] == null) {
                this.images[10] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/F10.png");
            }
            g.drawImage(this.images[10], (battleControl.gameView.screenData.Screen_x - this.images[10].getWidth(null)) / 2, 62, null);
            return;
        }
        if (this.countdown < 0L) return;
        IiiiiiiiIIIII11 = battleControl.gameView.screenData.Screen_x / 2 + 38;
        int IiiiiiiiIIIII12 = 62;
        int IiiiiiiiIIIII13 = (int)this.countdown;
        while (true) {
            int IiiiiiiiIIIII14;
            if (this.images[IiiiiiiiIIIII14 = IiiiiiiiIIIII13 % 10] == null) {
                this.images[IiiiiiiiIIIII14] = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)("sc/b/F" + IiiiiiiiIIIII14 + ".png"));
            }
            int n = IiiiiiiiIIIII11;
            IiiiiiiiIIIII11 -= 38;
            g.drawImage(this.images[IiiiiiiiIIIII14], n, IiiiiiiiIIIII12, null);
            if (IiiiiiiiIIIII13 < 10) {
                return;
            }
            IiiiiiiiIIIII13 /= 10;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void ALLATORIxDEMO(BattleControl battleControl) {
        BattleScene battleScene = this;
        synchronized (battleScene) {
            if (this.controlList.contains(battleControl)) {
                return;
            }
            IiIiIiiiiIIiI iiIiIiiiiIIiI = !this.video ? this.getBattleUnit(0, battleControl.getRoleId()) : null;
            {
                IiIiIiiiiIIiI IiiiiiiiIIIII = iiIiIiiiiIIiI;
                battleControl.setBattle(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.ALLATORIxDEMO().getCamp() : -1, this);
                this.controlList.add(battleControl);
                this.controlTime = iIiIIiiiIiiiI.ALLATORIxDEMO();
                if (this.battleState != 3) return;
                battleControl.ALLATORIxDEMO(this.battleRound);
                return;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO() {
        var1_1 = this;
        synchronized (var1_1) {
            this.controlTime = iIiIIiiiIiiiI.ALLATORIxDEMO();
            var3_2 = this.controlList.iterator();
            if (true) ** GOTO lbl11
            do {
                ((BattleControl)var3_2.next()).setBattle(0, null);
lbl11:
                // 2 sources

            } while (var3_2.hasNext());
            this.controlList.clear();
            return;
        }
    }

    public String getMusic() {
        return this.music;
    }

    public int getBattleRound() {
        return this.battleRound;
    }

    public void ALLATORIxDEMO(Graphics g) {
        Graphics2D IiiiiiiiIIIII;
        Graphics2D graphics2D = IiiiiiiiIIIII = (Graphics2D)g;
        Graphics2D graphics2D2 = IiiiiiiiIIIII;
        Object IiiiiiiiIIIII2 = graphics2D2.getRenderingHint(RenderingHints.KEY_RENDERING);
        Object IiiiiiiiIIIII3 = graphics2D.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
        Object IiiiiiiiIIIII4 = graphics2D2.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
        Object IiiiiiiiIIIII5 = graphics2D.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
        Object IiiiiiiiIIIII6 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (IiiiiiiiIIIII2 != RenderingHints.VALUE_RENDER_QUALITY) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        } else {
            IiiiiiiiIIIII2 = null;
        }
        if (IiiiiiiiIIIII3 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        } else {
            IiiiiiiiIIIII3 = null;
        }
        if (IiiiiiiiIIIII4 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        } else {
            IiiiiiiiIIIII4 = null;
        }
        if (IiiiiiiiIIIII5 != RenderingHints.VALUE_STROKE_DEFAULT) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        } else {
            IiiiiiiiIIIII5 = null;
        }
        if (IiiiiiiiIIIII6 != RenderingHints.VALUE_ANTIALIAS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            IiiiiiiiIIIII6 = null;
        }
        IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIIiiiiIIiIi);
        IiiiiiiiIIIII.setColor(Color.yellow);
        IiiiiiiiIIIII.drawString(this.rountString, 5, 82);
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, IiiiiiiiIIIII2);
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, IiiiiiiiIIIII4);
        }
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII6 == null) return;
        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII6);
    }

    public int getBattleState() {
        return this.battleState;
    }

    public boolean ALLATORIxDEMO() {
        if (this.controlList.size() != 0) return false;
        if (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.controlTime < 3333L) return false;
        return true;
    }
}
