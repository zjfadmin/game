/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiiiiiIIIii
 *  com.xy.a.IiiiIiiiiIiII
 *  com.xy.a.iiIiIiiiiiIIi
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.bean.Stall
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 */
package com.xy.q;

import com.xy.a.IIiiiiiiIIIii;
import com.xy.a.IiiiIiiiiIiII;
import com.xy.a.iiIiIiiiiiIIi;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.bean.Stall;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;

public class IiiiiiiiiIIII
extends IIiiIiiiiIIiI {
    public static Image iiIiiiiiiiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/89.png");
    private int IiiiiiiiIIIII;

    protected void ALLATORIxDEMO(RoleData roleData) {
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        if (this.IiiiiiiiIIIII == 0) {
            Goodstable IiiiiiiiIIIII2 = roleData.getGood(roleData.goodPacks[this.iiIIIiiiiiiiI + IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII2 == null) {
                return;
            }
            iiIiiiiiIIiiI IiiiiiiiIIIII3 = (iiIiiiiiIIiiI)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
            IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII2, false);
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            RoleSummoning IiiiiiiiIIIII4;
            RoleSummoning roleSummoning = IiiiiiiiIIIII4 = this.iiIIIiiiiiiiI + IiiiiiiiIIIII < roleData.pets.size() ? ((RolePet)roleData.pets.get(this.iiIIIiiiiiiiI + IiiiiiiiIIIII)).getPet() : null;
            if (IiiiiiiiIIIII4 == null) {
                return;
            }
            IiiiIiiiiIiII IiiiiiiiIIIII5 = (IiiiIiiiiIiII)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(42);
            IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII4, null, false);
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        Lingbao IiiiiiiiIIIII6 = roleData.getLingBaoIndex(this.iiIIIiiiiiiiI + IiiiiiiiIIIII);
        if (IiiiiiiiIIIII6 == null) {
            return;
        }
        IIiiiiiiIIIii IiiiiiiiIIIII7 = (IIiiiiiiIIIii)this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(45);
        IiiiiiiiIIIII7.ALLATORIxDEMO(IiiiiiiiIIIII6, false);
    }

    /*
     * WARNING - void declaration
     */
    protected void iiiIiiiiiiIIi(Graphics graphics, Stall stall, RoleData roleData) {
        void g;
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        graphics.setColor(Color.white);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            void roleData2;
            Goodstable IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            if ((IiiiiiiiIIIII4 = roleData2.getGood(roleData2.goodPacks[IiiiiiiiIIIII2])) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO();
                }
            } else {
                void stall2;
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null || IiiiiiiiIIIII4.getRgid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII4);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIIiIiiiiiiIi != null) {
                    g.drawString(this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iIIiIiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 4, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 14);
                }
                if (IiiiiiiiIIIII4.getGoodlock() == 1) {
                    g.drawImage(IIiIiiiiIiiIi.IiIIIiiiiIiiI, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 36, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, 10, 12, null);
                }
                if (stall2.getGood(IiiiiiiiIIIII4.getRgid()) != null) {
                    g.drawImage(iiIiiiiiiiIii, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 29, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 28, 20, 21, null);
                }
                if (this.IiiiiiiiIIIII != 0 && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public boolean ALLATORIxDEMO(int page) {
        int IiiiiiiiIIIII = page * this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        if (IiiiiiiiIIIII == 0) {
            return true;
        }
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        if (this.IiiiiiiiIIIII == 1) {
            if (IiiiiiiiIIIII >= IiiiiiiiIIIII2.pets.size()) return false;
            return true;
        }
        if (this.IiiiiiiiIIIII != 2) return false;
        if (IiiiiiiiIIIII2.getLingBaoIndex(IiiiiiiiIIIII) == null) return false;
        return true;
    }

    protected void iIiIiiiiIIiii() {
        if (this.IiiiiiiiIIIII == 0) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(42);
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        this.iiIiiiiiiiIii.ALLATORIxDEMO().iiiIiiiiiiIIi(45);
    }

    public IiiiiiiiiIIII(int type, IiiiIiiiiIiIi form, int bw, int bh, int bw1, int bh1, int bw2, int bh2, int px, int py) {
        super(form, bw, bh, bw1, bh1, bw2, bh2, px, py);
        this.IiiiiiiiIIIII = type;
    }

    public int ALLATORIxDEMO() {
        int IiiiiiiiIIIII = this.IiIIIiiiiIiiI * this.IIiiIiiiIIiIi;
        RoleData IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return 0;
        }
        if (this.IiiiiiiiIIIII == 1) {
            return (IiiiiiiiIIIII2.pets.size() - 1) / IiiiiiiiIIIII;
        }
        if (this.IiiiiiiiIIIII != 2) return 0;
        return (IiiiiiiiIIIII2.lingbaoList.size() - 1) / IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(boolean left, Lingbao lingbao, RoleData roleData) {
        ((iiIiIiiiiiIIi)this.iiIiiiiiiiIii).ALLATORIxDEMO(lingbao);
    }

    protected void ALLATORIxDEMO(Graphics g, RoleData roleData) {
        Stall IiiiiiiiIIIII = ((iiIiIiiiiiIIi)this.iiIiiiiiiiIii).ALLATORIxDEMO();
        if (this.IiiiiiiiIIIII == 0) {
            this.iiiIiiiiiiIIi(g, IiiiiiiiIIIII, roleData);
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            this.ALLATORIxDEMO(g, IiiiiiiiIIIII, roleData);
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        this.iIiIiiiiIIiii(g, IiiiiiiiIIIII, roleData);
    }

    public void ALLATORIxDEMO(boolean left, Goodstable good, RoleData roleData) {
        ((iiIiIiiiiiIIi)this.iiIiiiiiiiIii).ALLATORIxDEMO(good, left ? 1 : good.getUsetime());
    }

    protected void iIiIiiiiIIiii(int choseIndex, MouseEvent e, RoleData roleData) {
        if (this.IiiiiiiiIIIII == 0) {
            Goodstable IiiiiiiiIIIII = roleData.getGood(roleData.goodPacks[choseIndex]);
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(true, IiiiiiiiIIIII, roleData);
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            RoleSummoning IiiiiiiiIIIII;
            RoleSummoning roleSummoning = IiiiiiiiIIIII = choseIndex < roleData.pets.size() ? ((RolePet)roleData.pets.get(choseIndex)).getPet() : null;
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(true, IiiiiiiiIIIII, roleData);
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        Lingbao IiiiiiiiIIIII = roleData.getLingBaoIndex(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(true, IiiiiiiiIIIII, roleData);
    }

    public void iiiIiiiiiiIIi(int type) {
        this.IiiiiiiiIIIII = type;
    }

    /*
     * WARNING - void declaration
     */
    protected void iIiIiiiiIIiii(Graphics graphics, Stall stall, RoleData roleData) {
        void g;
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        graphics.setColor(Color.white);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            void roleData2;
            Lingbao IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            if ((IiiiiiiiIIIII4 = roleData2.getLingBaoIndex(IiiiiiiiIIIII2)) == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO();
                }
            } else {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null || IiiiiiiiIIIII4.getBaoid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII4);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (this.IiiiiiiiIIIII != 0 && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void ALLATORIxDEMO(Graphics graphics, Stall stall, RoleData roleData) {
        void g;
        int IiiiiiiiIIIII = this.iiiIiiiiiiIIi();
        int IiiiiiiiIIIII2 = 0;
        g.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        graphics.setColor(Color.white);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            void roleData2;
            RoleSummoning IiiiiiiiIIIII4;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + IiiiiiiiIIIII;
            if (this.iiiIiiiiiiiIi != null) {
                g.drawImage(this.iiiIiiiiiiiIi, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii, this.iiIiIiiiiIIIi + 2, this.ALLATORIxDEMO + 2, null);
            }
            RoleSummoning roleSummoning = IiiiiiiiIIIII4 = IiiiiiiiIIIII2 < roleData2.pets.size() ? ((RolePet)roleData2.pets.get(IiiiiiiiIIIII2)).getPet() : null;
            if (IiiiiiiiIIIII4 == null) {
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] != null) {
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO();
                }
            } else {
                void stall2;
                if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null || IiiiiiiiIIIII4.getSid() != this.iIiiIiiiiiiII[IiiiiiiiIIIII3].iiIIIiiiiiiiI) {
                    if (this.iIiiIiiiiiiII[IiiiiiiiIIIII3] == null) {
                        this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IiIiIiiiiIIiI();
                    }
                    this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII4);
                }
                if (IiiiiiiiIIIII2 != this.iIIiIiiiiiiIi) {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                } else {
                    IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.iIiiIiiiiiiII[IiiiiiiiIIIII3].ALLATORIxDEMO, (int)(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2), (int)(IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2), (int)this.iiIiIiiiiIIIi, (int)this.ALLATORIxDEMO);
                }
                if (stall2.getPet(IiiiiiiiIIIII4.getSid()) != null) {
                    g.drawImage(iiIiiiiiiiIii, IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 29, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 28, 20, 21, null);
                }
                if (this.IiiiiiiiIIIII != 0 && IiiiiiiiIIIII2 == this.IIIIiiiiiiiII) {
                    g.setColor(Color.red);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 1, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 1, this.iiIiIiiiiIIIi, this.ALLATORIxDEMO);
                    g.drawRect(IiiiiiiiIIIII3 % this.IiIIIiiiiIiiI * this.iiiiIiiiIiiII + 2, IiiiiiiiIIIII3 / this.IiIIIiiiiIiiI * this.iIiIiiiiIiIii + 2, this.iiIiIiiiiIIIi - 2, this.ALLATORIxDEMO - 2);
                    g.setColor(Color.white);
                }
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public void ALLATORIxDEMO(boolean left, RoleSummoning pet, RoleData roleData) {
        ((iiIiIiiiiiIIi)this.iiIiiiiiiiIii).ALLATORIxDEMO(pet);
    }

    protected void ALLATORIxDEMO(int choseIndex, MouseEvent e, RoleData roleData) {
        if (this.IiiiiiiiIIIII == 0) {
            Goodstable IiiiiiiiIIIII = roleData.getGood(roleData.goodPacks[choseIndex]);
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(false, IiiiiiiiIIIII, roleData);
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            RoleSummoning IiiiiiiiIIIII;
            RoleSummoning roleSummoning = IiiiiiiiIIIII = choseIndex < roleData.pets.size() ? ((RolePet)roleData.pets.get(choseIndex)).getPet() : null;
            if (IiiiiiiiIIIII == null) {
                return;
            }
            this.ALLATORIxDEMO(false, IiiiiiiiIIIII, roleData);
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        Lingbao IiiiiiiiIIIII = roleData.getLingBaoIndex(choseIndex);
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(false, IiiiiiiiIIIII, roleData);
    }
}
