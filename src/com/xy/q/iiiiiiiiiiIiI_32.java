/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIiiiiiiiiIi
 *  com.xy.a.a.iiIiIiiiiiIIi
 *  com.xy.a.i.IiIIIiiiiiiIi
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.q.IIIIIiiiIIIiI
 *  com.xy.a.q.IIIiIiiiIiIII
 *  com.xy.a.q.IiIIIiiiiIiii
 *  com.xy.a.q.iIIiiiiiIiIII
 *  com.xy.a.q.iIiIIiiiIiiiI
 *  com.xy.a.q.iiIiIiiiIIIiI
 *  com.xy.a.q.iiiiIiiiiIiii
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodType
 *  com.xy.game.HandleGood
 *  com.xy.game.HandlePet
 *  com.xy.game.RoleData
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.a.IIIiiiiiiiiIi;
import com.xy.a.a.iiIiIiiiiiIIi;
import com.xy.a.i.IiIIIiiiiiiIi;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.q.IIIIIiiiIIIiI;
import com.xy.a.q.IIIiIiiiIiIII;
import com.xy.a.q.IiIIIiiiiIiii;
import com.xy.a.q.iIIiiiiiIiIII;
import com.xy.a.q.iIiIIiiiIiiiI;
import com.xy.a.q.iiIiIiiiIIIiI;
import com.xy.a.q.iiiiIiiiiIiii;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.HandleGood;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class iiiiiiiiiiIiI
extends IIiiIiiiiIIiI {
    protected boolean ALLATORIxDEMO;

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        if (this.ALLATORIxDEMO && choseIndex >= this.IiiIiiiiiiIiI() - this.iIiiIiiiiiiII.length) {
            this.ALLATORIxDEMO(choseIndex - this.IiiIiiiiiiIiI() + this.iIiiIiiiiiiII.length, true, roleData);
            return;
        }
        Goodstable IiiiiiiiIIIII = roleData.getGood(roleData.goodPacks[choseIndex]);
        if (this.iiIiiiiiiiIii instanceof IIIiiiiiiiiIi) {
            if (e.isShiftDown()) {
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                try {
                    JTextField IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBaseView().ALLATORIxDEMO();
                    ((IiiIiiiiIIIii)IiiiiiiiIIIII2.getDocument()).ALLATORIxDEMO(IiiiiiiiIIIII2.getCaretPosition(), 2, IiiiiiiiIIIII.getRgid(), "[" + IiiiiiiiIIIII.getGoodsname() + "]", "G", null);
                    return;
                }
                catch (BadLocationException IiiiiiiiIIIII3) {
                    IiiiiiiiIIIII3.printStackTrace();
                    return;
                }
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == com.xy.v.iiIiIiiiIIIiI.iiIIIiiiiiiiI) {
                if (IiiiiiiiIIIII.getGoodlock() == 1) {
                    this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u5df2\u52a0\u9501");
                    return;
                }
                if (GoodType.ALLATORIxDEMO((Long)IiiiiiiiIIIII.getType())) {
                    this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u65e0\u6cd5\u52a0\u9501");
                    return;
                }
                IiiiiiiiIIIII.setGoodlock(1);
                ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getClient());
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.setMouseIndex(com.xy.v.iiIiIiiiIIIiI.IiIIIiiiiIiiI);
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u52a0\u9501\u6210\u529f");
                return;
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == com.xy.v.iiIiIiiiIIIiI.iiiIiiiiiiiIi) {
                if (IiiiiiiiIIIII.getGoodlock() == 0) {
                    this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u7269\u54c1\u672a\u52a0\u9501");
                    return;
                }
                IiiiiiiiIIIII.setGoodlock(0);
                ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)0, (GameClient)this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getClient());
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.setMouseIndex(com.xy.v.iiIiIiiiIIIiI.IiIIIiiiiIiiI);
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u89e3\u9501\u6210\u529f");
                return;
            }
            IiIiIiiiiIIiI IiiiiiiiIIIII4 = this.iiIiiiiiiiIii.iiIIiiiiIiIIi.choseImg;
            if (IiiiiiiiIIIII4.iIiIiiiiIiIii != 1) {
                if (IiiiiiiiIIIII == null) return;
                IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            Goodstable IiiiiiiiIIIII5 = roleData.getGood(IiiiiiiiIIIII4.iiIIIiiiiiiiI);
            if (IiiiiiiiIIIII5 != null) {
                if (IiiiiiiiIIIII5.getStatus() != 0) return;
                roleData.iiiIiiiiiiIIi(IiiiiiiiIIIII4.iiIIIiiiiiiiI, choseIndex);
                IiiiiiiiIIIII4.ALLATORIxDEMO();
                return;
            }
            IiiiiiiiIIIII4.ALLATORIxDEMO();
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiIIIiiiiIiii) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(choseIndex);
            IiIIIiiiiIiii IiiiiiiiIIIII6 = (IiIIIiiiiIiii)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII, false);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiiiIiiiiIiii) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(choseIndex);
            iiiiIiiiiIiii IiiiiiiiIIIII7 = (iiiiIiiiiIiii)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII7.ALLATORIxDEMO(IiiiiiiiIIIII, false);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiIIIiiiiiiIi) {
            if (IiiiiiiiIIIII == null) return;
            if (IiiiiiiiIIIII.getType() != 505L) {
                return;
            }
            IiIIIiiiiiiIi IiiiiiiiIIIII8 = (IiIIIiiiiiiIi)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII8.ALLATORIxDEMO().ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            IiiiiiiiIIIII8.ALLATORIxDEMO()[1].setText("1");
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIIIIiiiIIIiI) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            IIIIIiiiIIIiI IiiiiiiiIIIII9 = (IIIIIiiiIIIiI)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII9.iIiIiiiiIIiii(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIIiIiiiIiIII) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            IIIiIiiiIiIII IiiiiiiiIIIII10 = (IIIiIiiiIiIII)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII10.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI)) return;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        iIiIIiiiIiiiI IiiiiiiiIIIII11 = (iIiIIiiiIiiiI)this.iiIiiiiiiiIii;
        IiiiiiiiIIIII11.ALLATORIxDEMO(IiiiiiiiIIIII, false);
    }

    protected void iIiIiiiiIIiii() {
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void iIiIiiiiIIiii(boolean task) {
        this.ALLATORIxDEMO = task;
    }

    protected void iIiIiiiiIIiii(Graphics g, RoleData roleData) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        Goodstable[] IiiiiiiiIIIII3 = roleData.getObjectArea().ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiiIiiiiiiII.length) {
            Goodstable IiiiiiiiIIIII5;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            if ((IiiiiiiiIIIII5 = IiiiiiiiIIIII3[IiiiiiiiIIIII4]) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] == null || IiiiiiiiIIIII5.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII4] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IiiiiiiiIIIII5);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO, (int)(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)(this.ALLATORIxDEMO ? 1 : 0));
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO, (int)(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)(this.ALLATORIxDEMO ? 1 : 0));
                }
                if (IiiiiiiiIIIII5.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
                if (this.IiiiiiiiIIIII && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO ? 1 : 0);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                } else if (this.iiIIIiiiiiiiI == IiiiiiiiIIIII4) {
                    g.setColor(Color.white);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO ? 1 : 0);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII4;
        }
    }

    public boolean ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public iiiiiiiiiiIiI(IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
    }

    public void ALLATORIxDEMO(int index, boolean left, RoleData roleData) {
        Goodstable IiiiiiiiIIIII = roleData.getObjectArea().ALLATORIxDEMO()[index];
        if (IiiiiiiiIIIII == null) return;
        if (com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.getValue())) {
            return;
        }
        if (IiiiiiiiIIIII.getValue().equals("\u661f\u5361")) {
            com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)95, (GameView)roleData.getGameView());
            return;
        }
        if (IiiiiiiiIIIII.getValue().equals("\u661f\u76d8")) {
            com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)137, (GameView)roleData.getGameView());
            return;
        }
        if (!IiiiiiiiIIIII.getValue().equals("\u4f0f\u9b54\u4ee4")) return;
        com.xy.i.IiiIiiiiIIIii.ALLATORIxDEMO((int)170, (GameView)roleData.getGameView());
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        if (this.ALLATORIxDEMO && IiiiiiiiIIIII >= this.IiiIiiiiiiIiI() - this.iIiiIiiiiiiII.length) {
            this.iIiIiiiiIIiii(g, roleData);
            return;
        }
        boolean IiiiiiiiIIIII2 = this.iiIiiiiiiiIii instanceof IIIiiiiiiiiIi && this.iiIiiiiiiiIii.ALLATORIxDEMO().getBattleScene() != null;
        int IiiiiiiiIIIII3 = 0;
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        g.setColor(Color.white);
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiiIiiiiiiII.length) {
            Goodstable IiiiiiiiIIIII5;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            if ((IiiiiiiiIIIII5 = roleData.getGood(roleData.goodPacks[IiiiiiiiIIIII3])) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] == null || IiiiiiiiIIIII5.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII4] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IiiiiiiiIIIII5);
                }
                if (IiiiiiiiIIIII3 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO, (int)(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)(this.ALLATORIxDEMO ? 1 : 0));
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO, (int)(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)(this.ALLATORIxDEMO ? 1 : 0));
                }
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iIIiIiiiiiiIi != null) {
                    g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iIIiIiiiiiiIi, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 14);
                }
                if (IiiiiiiiIIIII5.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
                if (this.IiiiiiiiIIIII && IiiiiiiiIIIII3 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO ? 1 : 0);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                } else if (this.iiIIIiiiiiiiI == IiiiiiiiIIIII4) {
                    g.setColor(Color.white);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO ? 1 : 0);
                    g.drawRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                }
                if (IiiiiiiiIIIII2 && IiiiiiiiIIIII5.getType() != 0L && IiiiiiiiIIIII5.getType() != 1L) {
                    g.setColor(iiIIiiiiIiiII.iiIIIiiiiiiiI);
                    g.fillRect(IiiiiiiiIIIII4 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII4 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO ? 1 : 0);
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII4;
        }
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        if (this.ALLATORIxDEMO && choseIndex >= this.IiiIiiiiiiIiI() - this.iIiiIiiiiiiII.length) {
            this.ALLATORIxDEMO(choseIndex - this.IiiIiiiiiiIiI() + this.iIiiIiiiiiiII.length, false, roleData);
            return;
        }
        Goodstable IiiiiiiiIIIII = roleData.getGood(roleData.goodPacks[choseIndex]);
        if (this.iiIiiiiiiiIii instanceof IIIiiiiiiiiIi) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == com.xy.v.iiIiIiiiIIIiI.iiIIIiiiiiiiI) return;
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == com.xy.v.iiIiIiiiIIIiI.iiiIiiiiiiiIi) {
                return;
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBattleScene() == null) {
                try {
                    HandleGood.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (boolean)e.isShiftDown(), (RoleData)roleData);
                    return;
                }
                catch (Exception IiiiiiiiIIIII2) {
                    IiiiiiiiIIIII2.printStackTrace();
                    return;
                }
            }
            if (IiiiiiiiIIIII.getType() != 0L && IiiiiiiiIIIII.getType() != 1L) {
                return;
            }
            com.xy.d.IiIiIiiiiIIiI IiiiiiiiIIIII3 = this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBattleControl().getHandleUnit();
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            if (this.iiIiiiiiiiIii.ALLATORIxDEMO().gameBattle || !IiiiiiiiIIIII3.ALLATORIxDEMO().iIiIiiiiIIiii("\u9057\u5fd8")) {
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBattleControl().setMouseIndex(com.xy.v.iiIiIiiiIIIiI.iiIiIiiiiIIIi, (Object)IiiiiiiiIIIII);
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBattleControl().iiiiiiiiIIiii();
            } else {
                this.iiIiiiiiiiIii.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5f53\u524d\u72b6\u6001\u65e0\u6cd5\u4f7f\u7528\u836f\u54c1");
            }
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(46);
            this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(2);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiIiIiiiiiIIi) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == com.xy.v.iiIiIiiiIIIiI.iiIIIiiiiiiiI) return;
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getMouseIndex() == com.xy.v.iiIiIiiiIIIiI.iiiIiiiiiiiIi) {
                return;
            }
            if (this.iiIiiiiiiiIii.iiIIiiiiIiIIi.getBattleScene() != null) return;
            try {
                RoleSummoning IiiiiiiiIIIII4 = this.iiIiiiiiiiIii.ALLATORIxDEMO().getChosePet();
                if (IiiiiiiiIIIII4 == null) {
                    return;
                }
                HandlePet.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII4, (Goodstable)IiiiiiiiIIIII, (boolean)e.isShiftDown(), (RoleData)roleData);
                return;
            }
            catch (Exception IiiiiiiiIIIII5) {
                IiiiiiiiIIIII5.printStackTrace();
                return;
            }
        }
        if (this.iiIiiiiiiiIii instanceof iIIiiiiiIiIII) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            long IiiiiiiiIIIII6 = IiiiiiiiIIIII.getType();
            if ((IiiiiiiiIIIII6 < 701L || IiiiiiiiIIIII6 > 711L) && IiiiiiiiIIIII6 != 713L && IiiiiiiiIIIII6 != 714L && IiiiiiiiIIIII6 != 722L) {
                if (IiiiiiiiIIIII6 != 723L) return;
            }
            ((iIIiiiiiIiIII)this.iiIiiiiiiiIii).ALLATORIxDEMO().ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            ((iIIiiiiiIiIII)this.iiIiiiiiiiIii).iiiIiiiiiiIIi();
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiIiIiiiIIIiI) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            iiIiIiiiIIIiI IiiiiiiiIIIII7 = (iiIiIiiiIIIiI)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII7.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiIIIiiiiIiii) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(choseIndex);
            IiIIIiiiiIiii IiiiiiiiIIIII8 = (IiIIIiiiiIiii)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII8.ALLATORIxDEMO(IiiiiiiiIIIII, true);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof iiiiIiiiiIiii) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(choseIndex);
            iiiiIiiiiIiii IiiiiiiiIIIII9 = (iiiiIiiiiIiii)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII9.ALLATORIxDEMO(IiiiiiiiIIIII, true);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIIIIiiiIIIiI) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            IIIIIiiiIIIiI IiiiiiiiIIIII10 = (IIIIIiiiIIIiI)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII10.iIiIiiiiIIiii(IiiiiiiiIIIII);
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IiIIIiiiiiiIi) {
            if (IiiiiiiiIIIII == null) return;
            if (IiiiiiiiIIIII.getType() != 505L) {
                return;
            }
            IiIIIiiiiiiIi IiiiiiiiIIIII11 = (IiIIIiiiiiiIi)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII11.ALLATORIxDEMO().ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
            IiiiiiiiIIIII11.ALLATORIxDEMO()[1].setText(String.valueOf(IiiiiiiiIIIII.getUsetime()));
            return;
        }
        if (this.iiIiiiiiiiIii instanceof IIIiIiiiIiIII) {
            if (IiiiiiiiIIIII == null) {
                return;
            }
            IIIiIiiiIiIII IiiiiiiiIIIII12 = (IIIiIiiiIiIII)this.iiIiiiiiiiIii;
            IiiiiiiiIIIII12.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (!(this.iiIiiiiiiiIii instanceof iIiIIiiiIiiiI)) return;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        iIiIIiiiIiiiI IiiiiiiiIIIII13 = (iIiIIiiiIiiiI)this.iiIiiiiiiiIii;
        IiiiiiiiIIIII13.ALLATORIxDEMO(IiiiiiiiIIIII, true);
    }

    protected void ALLATORIxDEMO(RoleData roleData) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        if (this.ALLATORIxDEMO && IiiiiiiiIIIII >= this.IiiIiiiiiiIiI() - this.iIiiIiiiiiiII.length) {
            Goodstable[] IiiiiiiiIIIII2 = roleData.getObjectArea().ALLATORIxDEMO();
            Goodstable IiiiiiiiIIIII3 = IiiiiiiiIIIII2[this.iiIIIiiiiiiiI + IiiiiiiiIIIII - this.IiiIiiiiiiIiI() + this.iIiiIiiiiiiII.length];
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            ((iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII3, false);
            return;
        }
        Goodstable IiiiiiiiIIIII4 = roleData.getGood(roleData.goodPacks[this.iiIIIiiiiiiiI + IiiiiiiiIIIII]);
        if (IiiiiiiiIIIII4 == null) {
            return;
        }
        iiIiiiiiIIiiI IiiiiiiiIIIII5 = (iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII4, false);
    }
}
