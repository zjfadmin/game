/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleBuff
 *  com.xy.battle.BattleControl
 *  com.xy.battle.BattleScene
 *  com.xy.battle.SkillTx
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.battle;

import com.xy.battle.BattleBuff;
import com.xy.battle.BattleControl;
import com.xy.battle.BattleScene;
import com.xy.battle.SkillTx;
import com.xy.v.IIiiIiiiiIIiI;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class BattleBuffUtil {
    public boolean isMcqh2 = false;
    public boolean isMcqh1 = false;
    public BattleBuff buffZT2;
    public BattleBuff buffZT1;
    public BattleScene battleScene;
    public List<BattleBuff> buffs = new ArrayList<BattleBuff>();

    public void iIiIiiiiIIiii(Graphics g, int camp, BattleControl battleControl) {
        int IiiiiiiiIIIII = this.buffs.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            this.buffs.get(--IiiiiiiiIIIII).ALLATORIxDEMO(g, camp, battleControl);
        }
        IiiiiiiiIIIII = battleControl.skills.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            SkillTx skillTx = (SkillTx)battleControl.skills.get(IiiiiiiiIIIII);
            --IiiiiiiiIIIII;
            skillTx.ALLATORIxDEMO(g, battleControl);
        }
        BattleBuff IiiiiiiiIIIII2 = camp == 1 ? this.buffZT1 : this.buffZT2;
        if (IiiiiiiiIIIII2 == null) return;
        IiiiiiiiIIIII2.ALLATORIxDEMO(g, camp, battleControl);
    }

    public BattleBuff getZT(int camp) {
        if (camp != 1) return this.buffZT2;
        return this.buffZT1;
    }

    public BattleBuffUtil(BattleScene battleScene) {
        this.battleScene = battleScene;
    }

    public void ALLATORIxDEMO(Graphics g, int camp, BattleControl battleControl) {
        BattleBuff IiiiiiiiIIIII = camp == 1 ? this.buffZT2 : this.buffZT1;
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(g, camp, battleControl);
    }

    public void iIiIiiiiIIiii(String text) {
        this.isMcqh1 = false;
        this.isMcqh2 = false;
        this.buffZT1 = null;
        this.buffZT2 = null;
        this.buffs.clear();
        this.ALLATORIxDEMO(text);
    }

    public void ALLATORIxDEMO(int camp) {
        if (camp == -1) {
            camp = 1;
        }
        BattleBuff IiiiiiiiIIIII = null;
        BattleBuff IiiiiiiiIIIII2 = null;
        BattleBuff IiiiiiiiIIIII3 = null;
        BattleBuff IiiiiiiiIIIII4 = null;
        BattleBuff IiiiiiiiIIIII5 = null;
        BattleBuff IiiiiiiiIIIII6 = null;
        BattleBuff IiiiiiiiIIIII7 = null;
        BattleBuff IiiiiiiiIIIII8 = null;
        BattleBuff IiiiiiiiIIIII9 = null;
        BattleBuff IiiiiiiiIIIII10 = null;
        BattleBuff IiiiiiiiIIIII11 = null;
        int IiiiiiiiIIIII12 = this.buffs.size() - 1;
        while (IiiiiiiiIIIII12 >= 0) {
            BattleBuff IiiiiiiiIIIII13 = this.buffs.get(IiiiiiiiIIIII12);
            IiiiiiiiIIIII13.setIsv(false);
            if (IiiiiiiiIIIII13.getType().equals("bbsgqx") || IiiiiiiiIIIII13.getType().equals("bbtm")) {
                IiiiiiiiIIIII13.setXy(1);
                IiiiiiiiIIIII13.setIsv(true);
                if (IiiiiiiiIIIII13.getType().equals("bbsgqx")) {
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII.setIsv(false);
                    }
                } else {
                    IiiiiiiiIIIII = IiiiiiiiIIIII13;
                }
            } else if (IiiiiiiiIIIII13.getType().equals("bbmcqh")) {
                IiiiiiiiIIIII13.setXy(2);
                IiiiiiiiIIIII13.setIsv(true);
            } else if (IiiiiiiiIIIII13.getType().equals("\u5316\u65e0")) {
                if (IiiiiiiiIIIII13.getCamp() == camp) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII13;
                } else {
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII13;
                }
            } else if (IiiiiiiiIIIII13.getType().equals("1881")) {
                if (IiiiiiiiIIIII13.getCamp() == camp) {
                    IiiiiiiiIIIII9 = IiiiiiiiIIIII13;
                } else {
                    IiiiiiiiIIIII8 = IiiiiiiiIIIII13;
                }
            } else if (IiiiiiiiIIIII13.getType().equals("1234")) {
                if (IiiiiiiiIIIII13.getCamp() == camp) {
                    IiiiiiiiIIIII10 = IiiiiiiiIIIII13;
                } else {
                    IiiiiiiiIIIII11 = IiiiiiiiIIIII13;
                }
            } else if (IiiiiiiiIIIII13.getType().equals("bbxr")) {
                if (IiiiiiiiIIIII13.getCamp() == camp) {
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII13;
                } else {
                    IiiiiiiiIIIII5 = IiiiiiiiIIIII13;
                }
            } else if (IiiiiiiiIIIII13.getType().equals("bbyh")) {
                if (IiiiiiiiIIIII13.getCamp() == camp) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII13;
                } else {
                    IiiiiiiiIIIII7 = IiiiiiiiIIIII13;
                }
            }
            --IiiiiiiiIIIII12;
        }
        if (IiiiiiiiIIIII2 == null && IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4;
            IiiiiiiiIIIII4 = null;
        }
        if (IiiiiiiiIIIII4 == null) {
            IiiiiiiiIIIII4 = IiiiiiiiIIIII6;
        }
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2.setXy(3);
            IiiiiiiiIIIII2.setIsv(true);
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII4.setXy(4);
            IiiiiiiiIIIII4.setIsv(true);
        }
        if (IiiiiiiiIIIII10 != null) {
            IiiiiiiiIIIII10.setXy(5);
            IiiiiiiiIIIII10.setIsv(true);
        }
        if (IiiiiiiiIIIII8 != null) {
            IiiiiiiiIIIII8.setXy(6);
            IiiiiiiiIIIII8.setIsv(true);
        }
        if (IiiiiiiiIIIII3 == null && IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII5;
            IiiiiiiiIIIII5 = null;
        }
        if (IiiiiiiiIIIII5 == null) {
            IiiiiiiiIIIII5 = IiiiiiiiIIIII7;
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3.setXy(3);
            IiiiiiiiIIIII3.setIsv(true);
        }
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII5.setXy(4);
            IiiiiiiiIIIII5.setIsv(true);
        }
        if (IiiiiiiiIIIII11 != null) {
            IiiiiiiiIIIII11.setXy(5);
            IiiiiiiiIIIII11.setIsv(true);
        }
        if (IiiiiiiiIIIII9 != null) {
            IiiiiiiiIIIII9.setXy(6);
            IiiiiiiiIIIII9.setIsv(true);
        }
        if (this.buffZT1 != null) {
            this.buffZT1.setXy(7);
            this.buffZT1.setIsv(true);
        }
        if (this.buffZT2 == null) return;
        this.buffZT2.setXy(7);
        this.buffZT2.setIsv(true);
    }

    public void ALLATORIxDEMO(String text) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)text)) {
            return;
        }
        String[] IiiiiiiiIIIII = text.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            block17: {
                String[] IiiiiiiiIIIII3;
                block15: {
                    block18: {
                        block16: {
                            IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=");
                            if (!IiiiiiiiIIIII3[0].equals("0")) break block15;
                            if (!IiiiiiiiIIIII3[3].equals("\u5316\u65e0") && !IiiiiiiiIIIII3[3].equals("bbxr") && !IiiiiiiiIIIII3[3].equals("bbyh") && !IiiiiiiiIIIII3[3].equals("bbtm") && !IiiiiiiiIIIII3[3].equals("bbsgqx") && !IiiiiiiiIIIII3[3].equals("1881") && !IiiiiiiiIIIII3[3].equals("1234")) break block16;
                            BattleBuff IiiiiiiiIIIII4 = new BattleBuff(IiiiiiiiIIIII3);
                            this.buffs.add(IiiiiiiiIIIII4);
                            break block17;
                        }
                        if (!IiiiiiiiIIIII3[3].equals("bbmcqh")) break block18;
                        BattleBuff IiiiiiiiIIIII5 = new BattleBuff(IiiiiiiiIIIII3);
                        this.buffs.add(IiiiiiiiIIIII5);
                        if (IiiiiiiiIIIII5.getCamp() == 1) {
                            this.isMcqh1 = true;
                        } else {
                            this.isMcqh2 = true;
                        }
                        break block17;
                    }
                    if (!IiiiiiiiIIIII3[3].equals("3028")) break block17;
                    BattleBuff IiiiiiiiIIIII6 = new BattleBuff(IiiiiiiiIIIII3);
                    if (IiiiiiiiIIIII6.getCamp() == 1) {
                        this.buffZT1 = IiiiiiiiIIIII6;
                    } else {
                        this.buffZT2 = IiiiiiiiIIIII6;
                    }
                    break block17;
                }
                int IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII3[1]);
                if (this.buffZT1 != null && this.buffZT1.getId() == IiiiiiiiIIIII7) {
                    this.buffZT1 = null;
                } else if (this.buffZT2 != null && this.buffZT2.getId() == IiiiiiiiIIIII7) {
                    this.buffZT2 = null;
                } else {
                    int IiiiiiiiIIIII8 = this.buffs.size() - 1;
                    while (IiiiiiiiIIIII8 >= 0) {
                        BattleBuff IiiiiiiiIIIII9 = this.buffs.get(IiiiiiiiIIIII8);
                        if (IiiiiiiiIIIII9.getId() == IiiiiiiiIIIII7) {
                            if (IiiiiiiiIIIII9.getType().equals("bbmcqh")) {
                                if (IiiiiiiiIIIII9.getCamp() == 1) {
                                    this.isMcqh1 = false;
                                } else {
                                    this.isMcqh2 = false;
                                }
                            }
                            this.buffs.remove(IiiiiiiiIIIII8);
                            break;
                        }
                        --IiiiiiiiIIIII8;
                    }
                }
            }
            ++IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO(1);
    }
}
