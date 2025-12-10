/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIIiiiiiIiII
 *  com.xy.a.q.IIIiIiiiiIiII
 *  com.xy.a.q.iiIiIiiiIiIiI
 *  com.xy.game.GameUtil
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIIIiiiiiIiII;
import com.xy.a.q.IIIiIiiiiIiII;
import com.xy.a.q.iiIiIiiiIiIiI;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IiiiIiiiiIiIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Component;
import java.awt.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIIiiiiIiiII
extends com.xy.q.IiiiIiiiiIiIi {
    private IIIiIiiiiIiII iIiiIiiiiiiII;
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private iiIiIiiiIiIiI iIiIiiiiIiIii;
    private IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private IiiiiiiiiIIII[] iiIiiiiiiiIii;
    private int IiiiiiiiIIIII = -1;
    private IIIIiiiiiIiII[] ALLATORIxDEMO;

    public void iiiIiiiiiiIIi(int type) {
        if (this.iIiIiiiiIIiii()) {
            return;
        }
        if (this.IiiiiiiiIIIII != type) {
            this.IIiiIiiiIIiIi[1].iIiIiiiiIIiii(type == 0 ? "sc/b/S325.png" : "sc/b/S326.png");
        }
        this.IiiiiiiiIIIII = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
        }
        if (this.IiiiiiiiIIIII == 0) {
            if (this.iIiiIiiiiiiII != null) {
                this.iIiiIiiiiiiII.setVisible(false);
            }
            if (this.iIiIiiiiIiIii == null) {
                this.iIiIiiiiIiIii = new iiIiIiiiIiIiI(this);
                this.add((Component)this.iIiIiiiiIiIii, 2);
            }
            this.iIiIiiiiIiIii.setVisible(true);
            return;
        }
        if (this.IiiiiiiiIIIII != 1) return;
        if (this.iIiIiiiiIiIii != null) {
            this.iIiIiiiiIiIii.setVisible(false);
        }
        if (this.iIiiIiiiiiiII == null) {
            this.iIiiIiiiiiiII = new IIIiIiiiiIiII(this);
            this.add((Component)this.iIiiIiiiiiiII, 2);
        }
        this.iIiiIiiiiiiII.setVisible(true);
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ALLATORIxDEMO.length) {
            RolePet IiiiiiiiIIIII3 = IiiiiiiiIIIII.getBBRolePet(IiiiiiiiIIIII2 + 1);
            this.ALLATORIxDEMO[IiiiiiiiIIIII2++].ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
    }

    public void iIiIiiiiIIiii() {
        if (this.iIiIiiiiIIiii()) {
            return;
        }
        this.iIiIiiiiIIiIi();
        this.iiiIiiiiiiIIi();
        this.iiiIiiiiiiIIi(0);
        super.iIiIiiiiIIiii();
    }

    static /* synthetic */ int ALLATORIxDEMO(iIIIiiiiIiiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IiIIIiiiiIiiI == null) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(g, 149, 210, 4, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    public iiIiIiiiIiIiI ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public iIIIiiiiIiiII(GameView gameView) {
        super(135, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 602, 375, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u53ec\u5524\u517d\u6bd4\u6597");
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/38.png", 2, 206 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5355\u6311\u738b\u8005" : (IiiiiiiiIIIII == 1 ? "\u6700\u5f3a\u56e2\u961f" : ""), (com.xy.q.IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(64 + 102 * IiiiiiiiIIIII, 18, 95, 33);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = new IIIIiiiiiIiII[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = new IIIIiiiiiIiII(this, "sc/b/B441.png", 1, IiiiiiiiIIIII + 1);
            this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(67 + IiiiiiiiIIIII * 42, 234, 42, 55);
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(50, 32, 430, 20);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(50, 51, 519, 290);
            }
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(int type, boolean match) {
        if (type == 0 && this.iIiIiiiiIiIii != null) {
            this.iIiIiiiiIiIii.ALLATORIxDEMO(match);
            return;
        }
        if (type != 1) return;
        if (this.iIiiIiiiiiiII == null) return;
        this.iIiiIiiiiiiII.ALLATORIxDEMO(match);
    }

    public void iiiIiiiiiiIIi() {
        long IiiiiiiiIIIII;
        RoleData roleData = this.ALLATORIxDEMO();
        long IiiiiiiiIIIII2 = roleData.getLoginResult().getSpecies_id().longValue();
        Goodstable IiiiiiiiIIIII3 = roleData.getGoodEquip(roleData.goodChoses[0]);
        if (IiiiiiiiIIIII3 != null && (IiiiiiiiIIIII = (long)GameUtil.ALLATORIxDEMO((int)Integer.parseInt(IiiiiiiiIIIII3.getSkin()))) != 0L) {
            IiiiiiiiIIIII2 = (IiiiiiiiIIIII += 18L) << 32 | IiiiiiiiIIIII2;
        }
        if (this.IiIIIiiiiIiiI == null) {
            this.IiIIIiiiiIiiI = iiiiiiiiiiIiI.ALLATORIxDEMO((long)IiiiiiiiIIIII2, (int)2, (int)1, null);
            return;
        }
        this.IiIIIiiiiIiiI = iiiiiiiiiiIiI.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIIIiiiiIiiI, (int)1, (String)String.valueOf(IiiiiiiiIIIII2));
    }

    public IIIiIiiiiIiII ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    public boolean iIiIiiiiIIiii() {
        if (this.iIiIiiiiIiIii != null && this.iIiIiiiiIiIii.ALLATORIxDEMO()) {
            return true;
        }
        if (this.iIiiIiiiiiiII == null) return false;
        if (!this.iIiiIiiiiiiII.ALLATORIxDEMO()) return false;
        return true;
    }

    public boolean ALLATORIxDEMO() {
        if (this.iIiIiiiiIIiii()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6b63\u5728\u5339\u914d\u4e2d\u65e0\u6cd5\u5173\u95ed\u9762\u677f");
            return false;
        }
        this.IiIIIiiiiIiiI = null;
        return super.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 208) {
            if (this.iIiiIiiiiiiII != null && this.iIiiIiiiiiiII.ALLATORIxDEMO()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6b63\u5728\u5339\u914d\u56e2\u961f\u53ec\u5524\u517d\u6bd4\u6597");
                return;
            }
            boolean IiiiiiiiIIIII = this.iIiIiiiiIiIii != null && this.iIiIiiiiIiIii.ALLATORIxDEMO();
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"petArena", (String)(IiiiiiiiIIIII ? "311" : "310"));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (id == 211) {
            if (this.iIiIiiiiIiIii != null && this.iIiIiiiiIiIii.ALLATORIxDEMO()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6b63\u5728\u5339\u914d\u5355\u4eba\u53ec\u5524\u517d\u6bd4\u6597");
                return;
            }
            boolean IiiiiiiiIIIII = this.iIiiIiiiiiiII != null && this.iIiiIiiiiiiII.ALLATORIxDEMO();
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"petArena", (String)(IiiiiiiiIIIII ? "313" : "312"));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        String IiiiiiiiIIIII = null;
        if (id == 209) {
            IiiiiiiiIIIII = "320";
        } else if (id == 210) {
            IiiiiiiiIIIII = "321";
        } else if (id == 212) {
            IiiiiiiiIIIII = "330";
        } else if (id == 213) {
            IiiiiiiiIIIII = "331";
        } else if (id == 214) {
            IiiiiiiiIIIII = "332";
        } else if (id == 215) {
            IiiiiiiiIIIII = "333";
        }
        if (IiiiiiiiIIIII == null) {
            return;
        }
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"petArena", (String)IiiiiiiiIIIII);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }
}
