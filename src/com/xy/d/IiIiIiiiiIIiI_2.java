/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleBuff
 *  com.xy.battle.BattleControl
 *  com.xy.battle.BattleDisplay
 *  com.xy.battle.BattleHandle
 *  com.xy.battle.BattleMan
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.BattleScene
 *  com.xy.battle.BattleSkillShow
 *  com.xy.battle.FightingState
 *  com.xy.battle.effect.MoveEffect
 *  com.xy.bean.PathPoint
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.game.GameMove
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.d;

import com.xy.battle.BattleBuff;
import com.xy.battle.BattleControl;
import com.xy.battle.BattleDisplay;
import com.xy.battle.BattleHandle;
import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlayProgress;
import com.xy.battle.BattleScene;
import com.xy.battle.BattleSkillShow;
import com.xy.battle.FightingState;
import com.xy.battle.effect.MoveEffect;
import com.xy.bean.PathPoint;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.game.GameMove;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.LinkedList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiIiIiiiiIIiI
extends iiiiiiiiiiIiI {
    private double IIIIiiiiiiiII = 1.0;
    private BattleMan iiIIIiiiiiiiI;
    private int IiIiiiiiIIIII = 0;
    private boolean iiiiIiiiIiiII;
    public int iiiIiiiiiiiIi;
    private BattleScene iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private int IiIIIiiiiIiiI;
    private LinkedList<BattleDisplay> ALLATORIxDEMO;

    public void IiiIiiiiiiIiI() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = this.iiIIIiiiiiiiI.getMan();
        if (this.iiIIIiiiiiiiI.getType() == 3) {
            IiiiiiiiIIIII3 -= 10;
        } else if (this.iiIIIiiiiiiiI.getType() == 4) {
            IiiiiiiiIIIII3 -= 15;
        }
        if (IiiiiiiiIIIII3 == 0) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 3;
        } else if (IiiiiiiiIIIII3 == 5) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 3;
        } else if (IiiiiiiiIIIII3 == 1) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 4;
        } else if (IiiiiiiiIIIII3 == 6) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 4;
        } else if (IiiiiiiiIIIII3 == 2) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 5;
        } else if (IiiiiiiiIIIII3 == 7) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 5;
        } else if (IiiiiiiiIIIII3 == 3) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 6;
        } else if (IiiiiiiiIIIII3 == 8) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 6;
        } else if (IiiiiiiiIIIII3 == 4) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 7;
        } else if (IiiiiiiiIIIII3 == 9) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 7;
        }
        this.iiIiIiiiiIIIi = 315 + 60 * IiiiiiiiIIIII - 60 * IiiiiiiiIIIII2;
        this.IIiiiiiiiIIIi = -325 + 114 * IiiiiiiiIIIII2 + 24 * IiiiiiiiIIIII;
        if (this.iiIIIiiiiiiiI.getType() == 3) {
            this.iiIiIiiiiIIIi -= 50;
            return;
        }
        if (this.iiIIIiiiiiiiI.getType() != 4) return;
        this.iiIiIiiiiIIIi -= 40;
    }

    public int ALLATORIxDEMO(iiiiiiiiiiIiI unit) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = (IiIiIiiiiIIiI)unit;
        if (this.iiIIIiiiiiiiI.getType() >= IiiiiiiiIIIII.iiIIIiiiiiiiI.getType()) return -1;
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics g, int camp, iiiiiiiiiiIiI XZUnit, BattleControl battleControl) {
        void IiiiiiiiIIIII;
        if (this.iiIIIiiiiiiiI.ALLATORIxDEMO()) {
            this.iIiIiiiiIIiIi(g);
            this.iIiIiiiiIIiii(g);
            return;
        }
        boolean bl = this == XZUnit;
        BattleBuff IiiiiiiiIIIII2 = this.iIiiIiiiiiiII.buffUtil.getZT(this.IIiiIiiiIIiIi);
        boolean IiiiiiiiIIIII3 = this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, this.iiiiIiiiIIiii, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iIiiIiiiiiiII.getBattleRound());
        if (IiiiiiiiIIIII != false) {
            if (this.iiIIIiiiiiiiI.iiiIiiiiiiIIi() == 8) {
                this.iiIIIiiiiiiiI.iIiIiiiiIIiii(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiiIiiiiiiiIi, -1L, IiiiiiiiIIIII2 != null ? 0.3f : this.iiIIIiiiiiiiI.getAlpha());
            } else if (this.iiIIIiiiiiiiI.getType() == 3 && this.iiIIIiiiiiiiI.iiiIiiiiiiIIi() == 5) {
                this.iiIIIiiiiiiiI.iIiIiiiiIIiii(g, battleControl.gameView.screenData.Screen_x / 2, battleControl.gameView.screenData.Screen_y / 2, this.iiiIiiiiiiiIi, this.iiiiIiiiIIiii, IiiiiiiiIIIII2 != null ? 0.3f : this.iiIIIiiiiiiiI.getAlpha());
            } else {
                this.iiIIIiiiiiiiI.iIiIiiiiIIiii(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiiIiiiiiiiIi, this.iiiiIiiiIIiii, IiiiiiiiIIIII2 != null ? 0.3f : this.iiIIIiiiiiiiI.getAlpha());
            }
        } else if (this.iiIIIiiiiiiiI.iiiIiiiiiiIIi() == 8) {
            this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiiIiiiiiiiIi, IiiiiiiiIIIII2 != null ? 0.3f : this.iiIIIiiiiiiiI.getAlpha());
        } else if (this.iiIIIiiiiiiiI.getType() == 3 && this.iiIIIiiiiiiiI.iiiIiiiiiiIIi() == 5) {
            this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, battleControl.gameView.screenData.Screen_x / 2, battleControl.gameView.screenData.Screen_y / 2, this.iiiIiiiiiiiIi, this.iiiiIiiiIIiii, IiiiiiiiIIIII2 != null ? 0.3f : this.iiIIIiiiiiiiI.getAlpha());
        } else {
            this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi, this.iiiIiiiiiiiIi, this.iiiiIiiiIIiii, IiiiiiiiIIIII2 != null ? 0.3f : this.iiIIIiiiiiiiI.getAlpha());
        }
        this.ALLATORIxDEMO(g, camp, battleControl);
        if (IiiiiiiiIIIII3) {
            this.iiIIIiiiiiiiI.ALLATORIxDEMO(g, this.iiiiIiiiIIiii, this.iiIiiiiiiIIiI, this.iIiiIiiiIiIIi);
        }
        this.iIiIiiiiIIiIi(g);
        this.iIiIiiiiIIiii(g);
    }

    public void iIiIiiiiIIiii(BattlePlayProgress zhixing) {
        if (zhixing.getData() == null && zhixing.getHp_Change() == 0 && zhixing.getMp_Change() == 0) {
            return;
        }
        boolean IiiiiiiiIIIII = zhixing.getData() != null && (zhixing.getData().equals("\u6cd5\u529b\u4e0d\u8db3") || zhixing.getData().equals("\u65e0\u6cd5\u7528\u836f") || zhixing.getData().equals("\u6028\u6c14\u4e0d\u8db3"));
        BattleDisplay IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = zhixing.getHp_Change();
        int IiiiiiiiIIIII4 = zhixing.getMp_Change();
        if (IiiiiiiiIIIII3 < 0 && -IiiiiiiiIIIII3 > this.iiIIIiiiiiiiI.getHp_Current()) {
            IiiiiiiiIIIII3 = -this.iiIIIiiiiiiiI.getHp_Current();
        }
        if (IiiiiiiiIIIII4 < 0 && -IiiiiiiiIIIII4 > this.iiIIIiiiiiiiI.getMp_Current()) {
            IiiiiiiiIIIII4 = -this.iiIIIiiiiiiiI.getMp_Current();
        }
        IiiiiiiiIIIII2 = new BattleDisplay(IiiiiiiiIIIII, zhixing.getData(), IiiiiiiiIIIII3, IiiiiiiiIIIII4);
        this.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void ALLATORIxDEMO(int type, int dir) {
        if (type == 0) return;
        if (type == 2) {
            return;
        }
        this.IiIIIiiiiIiiI = 0;
        this.iiiiIiiiIIiii = 0;
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(type);
        this.iiIIIiiiiiiiI.ALLATORIxDEMO();
        if (dir == 0) {
            dir = 3;
        }
        this.iiIiiiiiiiIii = dir;
        if (type == 9) {
            this.IIIIiiiiiiiII = 2.0;
            return;
        }
        if (type == 4 || type == 5) {
            this.IIIIiiiiiiiII = 1.4;
            return;
        }
        if (type != 3 && type != 11 && type != 12) {
            this.IIIIiiiiiiiII = 1.3;
            return;
        }
        this.IIIIiiiiiiiII = 1.8;
    }

    public void ALLATORIxDEMO(double xsx, double xsy, int sx, int sy, int camp) {
        double d;
        if (camp != this.IIiiIiiiIIiIi) {
            d = xsx;
            this.iiIiiiiiiIIiI = this.iiIiIiiiiIIIi;
            this.iIiiIiiiIiIIi = this.IIiiiiiiiIIIi;
            this.iiiIiiiiiiiIi = this.iiIiiiiiiiIii;
        } else {
            this.iiIiiiiiiIIiI = 1024 - this.iiIiIiiiiIIIi;
            this.iIiiIiiiIiIIi = 700 - this.IIiiiiiiiIIIi;
            this.iiiIiiiiiiiIi = BattleHandle.getdir((int)this.iiIiiiiiiiIii);
            d = xsx;
        }
        if (d < 1.0) {
            this.iiIiiiiiiIIiI = (int)((double)this.iiIiiiiiiIIiI * xsx);
        }
        if (xsy < 1.0) {
            this.iIiiIiiiIiIIi = (int)((double)this.iIiiIiiiIiIIi * xsy);
        }
        this.iiIiiiiiiIIiI += sx;
        this.iIiiIiiiIiIIi += sy;
    }

    public IiIiIiiiiIIiI(BattleMan battleMan, BattleScene battleScene) {
        this.iIiiIiiiiiiII = battleScene;
        battleMan.ALLATORIxDEMO();
        this.iiIIIiiiiiiiI = battleMan;
        if (this.iiIIIiiiiiiiI.iIiIiiiiIIiii("\u9690\u8eab")) {
            this.iiIIIiiiiiiiI.setAlpha(0.3f);
        }
        this.iiIIIiiiiiiiI = battleMan.getPart();
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(battleMan.getHp_Current() <= 0 ? 8 : 7);
        this.IIIiiiiiIIiII = battleMan.getManname();
        this.iiIiiiiiiiIii = 3;
        this.IIiiIiiiIIiIi = battleMan.getCamp();
        this.IiiIiiiiiiIiI();
        if (battleScene.getBattleRound() != 1) {
            return;
        }
        if (battleMan.getCamp() == 0 && battleMan.getMan() == 2) {
            if (battleScene.getBattleType() == 15) {
                this.ALLATORIxDEMO("\u5927\u80c6\u72d7\u8d3c!\u54ea\u91cc\u9003");
            } else if (battleScene.getBattleType() == 16) {
                this.ALLATORIxDEMO("\u73b0\u5728\u5e74\u8f7b\u4eba\u771f\u662f\u6ca1\u6709\u773c\u529b\u52b2");
            }
        }
        this.iIiIiiiiIIiIi();
    }

    public boolean ALLATORIxDEMO(BattlePlayProgress zhixing) {
        if (zhixing.getZxzt() == 2) {
            return false;
        }
        if (zhixing.getZxzt() == 0) {
            this.iIiIiiiiIIiii(zhixing);
            this.iIiiIiiiiiiII.iiiIiiiiiiIIi(zhixing.getMusic());
            this.ALLATORIxDEMO(zhixing.getSpell());
            this.ALLATORIxDEMO(zhixing.getText());
            if (this.IiIiiiiiIIIII == 0) {
                this.IiIiiiiiIIIII = 1;
                zhixing.setZxzt(1);
                this.ALLATORIxDEMO(zhixing.getType(), zhixing.getDir());
                return this.ALLATORIxDEMO(zhixing);
            }
            zhixing.setZxzt(2);
            if (this.iiIIIiiiiiiiI.ALLATORIxDEMO(zhixing.getHp_Change(), zhixing.getMp_Change(), zhixing.getYq_Change(), zhixing.getNq_Change())) {
                this.iIiiIiiiiiiII.iiiIiiiiiiIIi(this);
            }
            this.iiIIIiiiiiiiI.iIiIiiiiIIiii(zhixing.getAddchixu());
            this.iiIIIiiiiiiiI.ALLATORIxDEMO(zhixing.getDeletechixu());
            this.iIiiIiiiiiiII.buffUtil.ALLATORIxDEMO(zhixing.getBuff());
            return false;
        }
        if (zhixing.getZxzt() == 1) {
            if (zhixing.getPath() != null) {
                if (!this.ALLATORIxDEMO(zhixing.getPath(), zhixing.getData2())) {
                    zhixing.setZxzt(2);
                    this.IiIiiiiiIIIII = 3;
                    this.ALLATORIxDEMO(zhixing);
                    this.iiIIIiiiiiiiI.iIiIiiiiIIiii(zhixing.getAddchixu());
                    this.iiIIIiiiiiiiI.ALLATORIxDEMO(zhixing.getDeletechixu());
                    this.iIiiIiiiiiiII.buffUtil.ALLATORIxDEMO(zhixing.getBuff());
                }
            } else {
                if (this.IiIiiiiiIIIII == 1 && this.ALLATORIxDEMO(zhixing.getType())) {
                    this.IiIiiiiiIIIII = 2;
                    this.ALLATORIxDEMO(zhixing);
                    return this.ALLATORIxDEMO(zhixing);
                }
                if (this.IiIiiiiiIIIII == 2) {
                    this.IiIiiiiiIIIII = 3;
                    zhixing.setZxzt(2);
                    this.iiIIIiiiiiiiI.iIiIiiiiIIiii(zhixing.getAddchixu());
                    this.iiIIIiiiiiiiI.ALLATORIxDEMO(zhixing.getDeletechixu());
                    this.iIiiIiiiiiiII.buffUtil.ALLATORIxDEMO(zhixing.getBuff());
                }
            }
        }
        if (this.IiIiiiiiIIIII != 3) return true;
        this.IiIiiiiiIIIII = 0;
        return false;
    }

    public boolean ALLATORIxDEMO(List<PathPoint> path, String type) {
        if (!type.equals("\u9041\u5730")) {
            if (!GameMove.getMovetime((IiIiIiiiiIIiI)this, path)) return true;
            path.clear();
            return false;
        }
        long IiiiiiiiIIIII = this.iiIIIiiiiiiiI.iIiIiiiiIIiii();
        if (path.size() > 1) {
            this.iiIiIiiiiIIIi = path.get(1).getX();
            this.IIiiiiiiiIIIi = path.get(1).getY();
            path.clear();
        } else if (path.size() == 1) {
            this.iiIiIiiiiIIIi = path.get(0).getX();
            this.IIiiiiiiiIIIi = path.get(0).getY();
            path.clear();
        }
        if (this.iiiiIiiiIIiii <= IiiiiiiiIIIII) return true;
        return false;
    }

    public void ALLATORIxDEMO(long time) {
        this.iiiIiiiiiiIIi();
        this.IiIIIiiiiIiiI = (int)((long)this.IiIIIiiiiIiiI + time);
        this.iiiiIiiiIIiii = this.IIIIiiiiiiiII != 1.0 ? (int)((double)this.IiIIIiiiiIiiI * this.IIIIiiiiiiiII) : this.IiIIIiiiiIiiI;
        this.iIiIiiiiIIiii((int)time);
    }

    public void ALLATORIxDEMO(Graphics g, int camp) {
        if (this.ALLATORIxDEMO == null) return;
        if (this.ALLATORIxDEMO.size() == 0) {
            return;
        }
        int IiiiiiiiIIIII = this.iiIiiiiiiIIiI;
        int IiiiiiiiIIIII2 = this.iIiiIiiiIiIIi;
        int IiiiiiiiIIIII3 = 0;
        for (BattleDisplay IiiiiiiiIIIII4 : this.ALLATORIxDEMO) {
            if (!IiiiiiiiIIIII4.ALLATORIxDEMO(camp == this.iiIIIiiiiiiiI.getCamp())) continue;
            int n = IiiiiiiiIIIII2 - 25 + IiiiiiiiIIIII3 * 16;
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII4.ALLATORIxDEMO(g, IiiiiiiiIIIII, n, camp == this.iiIIIiiiiiiiI.getCamp());
        }
    }

    public void iIiIiiiiIIiii(boolean operate) {
        this.iiiiIiiiIiiII = operate;
    }

    public void ALLATORIxDEMO(BattlePlayProgress zhixing) {
        if (this.iiIIIiiiiiiiI.ALLATORIxDEMO(zhixing.getHp_Change(), zhixing.getMp_Change(), zhixing.getYq_Change(), zhixing.getNq_Change())) {
            this.iIiiIiiiiiiII.iiiIiiiiiiIIi(this);
        }
        this.ALLATORIxDEMO(this.iiIIIiiiiiiiI.getHp_Current() > 0 ? 7 : 8, zhixing.getDirend());
    }

    public void iIiIiiiiIIiii(Graphics g) {
        if (this.IIIiiiiiIIiII == null) {
            return;
        }
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        Object IiiiiiiiIIIII2 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
        Object IiiiiiiiIIIII3 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (IiiiiiiiIIIII2 != RenderingHints.VALUE_STROKE_DEFAULT) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        } else {
            IiiiiiiiIIIII2 = null;
        }
        if (IiiiiiiiIIIII3 != RenderingHints.VALUE_ANTIALIAS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            IiiiiiiiIIIII3 = null;
        }
        g.setFont(iiIIiiiiIiiII.iIiIiiiiIiiii);
        int IiiiiiiiIIIII4 = this.iIiiIiiiIiIIi + 23;
        if (this.iIiIiiiiIiIii == 0) {
            this.iIiIiiiiIiIii = g.getFontMetrics().stringWidth(this.IIIiiiiiIIiII) / 2;
        }
        int IiiiiiiiIIIII5 = this.iiIiiiiiiIIiI - this.iIiIiiiiIiIii;
        if (this.iiIIIiiiiiiiI.getW() != null) {
            if (this.iiIIIiiiiiiiI.getW() == 6) {
                IIIIIiiiIiIii IiiiiiiiIIIII6 = com.xy.w.iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)this.iiIIIiiiiiiiI.getW().toString()));
                if (IiiiiiiiIIIII6 != null) {
                    IiiiiiiiIIIII6.ALLATORIxDEMO(this.iiiiIiiiIIiii, 0);
                    IiiiiiiiIIIII6.ALLATORIxDEMO(g, IiiiiiiiIIIII5 - 28, IiiiiiiiIIIII4 - 20);
                }
            } else {
                Image IiiiiiiiIIIII7 = IIiIiiiiIiiIi.iiiIiiiiiiIIi((int)this.iiIIIiiiiiiiI.getW());
                g.drawImage(IiiiiiiiIIIII7, IiiiiiiiIIIII5 - 28, IiiiiiiiIIIII4 - 18, null);
            }
        }
        if (this.iiIIIiiiiiiiI.getType() == 0 || this.iiIIIiiiiiiiI.getType() == 1) {
            g.setColor(iiIIiiiiIiiII.iiiiiiiiIIIii);
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII4 + 1);
            g.setColor(iiIIiiiiIiiII.ALLATORIxDEMO((int)this.iiIIIiiiiiiiI.getZs()));
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII5, IiiiiiiiIIIII4);
        } else if (this.iiIIIiiiiiiiI.getType() == 2) {
            g.setColor(iiIIiiiiIiiII.iiiiiiiiIIIii);
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII4 + 1);
            g.setColor(Color.GREEN);
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII5, IiiiiiiiIIIII4);
        } else {
            if (this.iiIIIiiiiiiiI.getType() == 3) {
                IiiiiiiiIIIII4 += 15;
            } else if (this.iiIIIiiiiiiiI.getType() == 4) {
                IiiiiiiiIIIII4 -= 5;
            }
            g.setColor(iiIIiiiiIiiII.iiiiiiiiIIIii);
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII4 + 1);
            g.setColor(Color.GREEN);
            g.drawString(this.IIIiiiiiIIiII, IiiiiiiiIIIII5, IiiiiiiiIIIII4);
        }
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII2);
        }
        if (IiiiiiiiIIIII3 == null) return;
        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII3);
    }

    public BattleScene ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    public void iIiIiiiiIIiIi() {
        if (this.iiIIIiiiiiiiI.getHp_Current() <= 0) {
            return;
        }
        String IiiiiiiiIIIII = this.iiIIIiiiiiiiI.getMsg();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.equals("")) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.iIiiIiiiiiiII.ALLATORIxDEMO("#Q[" + this.IIIiiiiiIIiII + "]" + IiiiiiiiIIIII);
    }

    public int iiiIiiiiiiIIi() {
        return this.iiIIIiiiiiiiI.getCamp();
    }

    public void ALLATORIxDEMO(Graphics g, int camp, BattleControl battleControl) {
        if (this.iiIIIiiiiiiiI.getType() == 3) return;
        if (this.iiIIIiiiiiiiI.getType() == 4) return;
        if (this.iiIIIiiiiiiiI.getType() == 999) {
            return;
        }
        if (camp == this.iiIIIiiiiiiiI.getCamp() || (this.iiIIIiiiiiiiI.getCamp() == 1 ? this.iIiiIiiiiiiII.buffUtil.isMcqh2 : this.iIiiIiiiiiiII.buffUtil.isMcqh1)) {
            int IiiiiiiiIIIII = (int)(60.0 * (double)this.iiIIIiiiiiiiI.getHp_Current() / (double)this.iiIIIiiiiiiiI.getHp_Total());
            if (IiiiiiiiIIIII > 60) {
                IiiiiiiiIIIII = 60;
            } else if (IiiiiiiiIIIII < 0) {
                IiiiiiiiIIIII = 0;
            }
            g.drawImage(IIIIIiiiIiiII.ALLATORIxDEMO[0], this.iiIiiiiiiIIiI - 35, this.iIiiIiiiIiIIi - 126, 60, 5, null);
            g.drawImage(IIIIIiiiIiiII.ALLATORIxDEMO[1], this.iiIiiiiiiIIiI - 35, this.iIiiIiiiIiIIi - 126, IiiiiiiiIIIII, 5, null);
            int IiiiiiiiIIIII2 = (int)(60.0 * (double)this.iiIIIiiiiiiiI.getMp_Current() / (double)this.iiIIIiiiiiiiI.getMp_Total());
            if (IiiiiiiiIIIII2 > 60) {
                IiiiiiiiIIIII2 = 60;
            } else if (IiiiiiiiIIIII2 < 0) {
                IiiiiiiiIIIII2 = 0;
            }
            g.drawImage(IIIIIiiiIiiII.ALLATORIxDEMO[0], this.iiIiiiiiiIIiI - 35, this.iIiiIiiiIiIIi - 120, 60, 5, null);
            g.drawImage(IIIIIiiiIiiII.ALLATORIxDEMO[2], this.iiIiiiiiiIIiI - 35, this.iIiiIiiiIiIIi - 120, IiiiiiiiIIIII2, 5, null);
        }
        if (battleControl.battleCamp != this.iiIIIiiiiiiiI.getCamp()) return;
        if (this.iiiiIiiiIiiII) return;
        if (battleControl.battleScene.getBattleState() != 1) return;
        g.drawImage(IIIIIiiiIiiII.ALLATORIxDEMO[3], this.iiIiiiiiiIIiI - 49, this.iIiiIiiiIiIIi - 127, 13, 13, null);
    }

    public void ALLATORIxDEMO(GameView view) {
    }

    public IiIiIiiiiIIiI(BattleMan battleMan, FightingState state, BattleScene battleScene) {
        int IiiiiiiiIIIII;
        this.iIiiIiiiiiiII = battleScene;
        battleMan.ALLATORIxDEMO();
        this.iiIIIiiiiiiiI = battleMan;
        if (this.iiIIIiiiiiiiI.iIiIiiiiIIiii("\u9690\u8eab")) {
            this.iiIIIiiiiiiiI.setAlpha(0.3f);
        }
        this.iiIIIiiiiiiiI = battleMan.getPart();
        this.iiIIIiiiiiiiI.ALLATORIxDEMO(battleMan.getHp_Current() <= 0 ? 8 : 7);
        this.IIIiiiiiIIiII = battleMan.getManname();
        int IiiiiiiiIIIII2 = battleMan.getCampId();
        this.IIiiIiiiIIiIi = IiiiiiiiIIIII = IiiiiiiiIIIII2 & 3;
        this.iiIiiiiiiiIii = IiiiiiiiIIIII2 >> 2 & 0xF;
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII2 >> 6 & 3);
        IiiiiiiiIIIII3.append("|");
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII2 >> 8 & 0x3F);
        IiiiiiiiIIIII = IiiiiiiiIIIII2 >> 14 & 0xF;
        if (IiiiiiiiIIIII != 0) {
            IiiiiiiiIIIII3.append("|");
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII);
        }
        PathPoint IiiiiiiiIIIII4 = MoveEffect.ALLATORIxDEMO((String)IiiiiiiiIIIII3.toString(), (int)(battleMan.getCampId() & 3));
        this.iiIiIiiiiIIIi = IiiiiiiiIIIII4.getX();
        this.IIiiiiiiiIIIi = IiiiiiiiIIIII4.getY();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int time) {
        if (this.ALLATORIxDEMO == null) return;
        if (this.ALLATORIxDEMO.size() == 0) {
            return;
        }
        var2_2 = this;
        synchronized (var2_2) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO.iterator();
            if (true) ** GOTO lbl16
            do {
                if ((IiiiiiiiIIIII = (BattleDisplay)IiiiiiiiIIIII.next()).getTime() < (long)BattleDisplay.TILIU) {
                    IiiiiiiiIIIII.ALLATORIxDEMO(time);
                    continue;
                }
                IiiiiiiiIIIII.remove();
lbl16:
                // 3 sources

            } while (IiiiiiiiIIIII.hasNext());
            return;
        }
    }

    public BattleMan ALLATORIxDEMO() {
        return this.iiIIIiiiiiiiI;
    }

    public boolean iiiIiiiiiiIIi() {
        if (this.iiiiIiiiIIiii < (long)this.iiIIIiiiiiiiI.iIiIiiiiIIiii()) return false;
        return true;
    }

    public static PathPoint ALLATORIxDEMO(int camp, int man) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        if (man == 0) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 3;
        } else if (man == 5) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 3;
        } else if (man == 1) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 4;
        } else if (man == 6) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 4;
        } else if (man == 2) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 5;
        } else if (man == 7) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 5;
        } else if (man == 3) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 6;
        } else if (man == 8) {
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 6;
        } else if (man == 4) {
            IiiiiiiiIIIII = 3;
            IiiiiiiiIIIII2 = 7;
        } else {
            if (man != 9) return new PathPoint(315 + 60 * IiiiiiiiIIIII - 60 * IiiiiiiiIIIII2, -325 + 114 * IiiiiiiiIIIII2 + 24 * IiiiiiiiIIIII);
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII2 = 7;
        }
        return new PathPoint(315 + 60 * IiiiiiiiIIIII - 60 * IiiiiiiiIIIII2, -325 + 114 * IiiiiiiiIIIII2 + 24 * IiiiiiiiIIIII);
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        return this.iiIIIiiiiiiiI.ALLATORIxDEMO(x - this.iiIiiiiiiIIiI, y - this.iIiiIiiiIiIIi);
    }

    public boolean iIiIiiiiIIiii() {
        return this.iiiiIiiiIiiII;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO(BattleDisplay newDisplay) {
        if (newDisplay == null) {
            return;
        }
        IiIiIiiiiIIiI iiIiIiiiiIIiI = this;
        synchronized (iiIiIiiiiIIiI) {
            BattleDisplay IiiiiiiiIIIII;
            if (this.ALLATORIxDEMO == null) {
                this.ALLATORIxDEMO = new LinkedList();
            } else if (this.ALLATORIxDEMO.size() != 0 && (IiiiiiiiIIIII = this.ALLATORIxDEMO.getLast()) != null) {
                newDisplay.setTime(Math.min(0L, IiiiiiiiIIIII.getTime() - 100L));
            }
            this.ALLATORIxDEMO.addLast(newDisplay);
            return;
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(BattleSkillShow skill) {
        if (skill == null) {
            return;
        }
        if (skill.getSkinpath() == 0 || skill.getSkinpath() == 4 || skill.getSkinpath() == 5) {
            this.iIiiIiiiiiiII.showSkillList.add(skill);
            return;
        }
        int IiiiiiiiIIIII = this.iIiiIiiiiiiII.showSkillList.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            BattleSkillShow IiiiiiiiIIIII2 = (BattleSkillShow)this.iIiiIiiiiiiII.showSkillList.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getRound() == skill.getRound() && IiiiiiiiIIIII2.getSkillid().equals(skill.getSkillid())) {
                return;
            }
            --IiiiiiiiIIIII;
        }
        this.iIiiIiiiiiiII.showSkillList.add(skill);
    }

    public boolean ALLATORIxDEMO(int type) {
        if (type == 0) return true;
        if (type == 2) {
            return true;
        }
        if (this.iiiiIiiiIIiii < (long)this.iiIIIiiiiiiiI.iIiIiiiiIIiii()) return false;
        return true;
    }
}
