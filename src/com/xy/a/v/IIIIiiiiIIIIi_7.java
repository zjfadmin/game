/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.IiiIiiiiIIIiI
 *  com.xy.a.v.iiIiiiiiIIiiI
 *  com.xy.i.IIIIIiiiIiIii
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a.v;

import com.xy.a.v.IiiIiiiiIIIiI;
import com.xy.a.v.iiIiiiiiIIiiI;
import com.xy.i.IIIIIiiiIiIii;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIiiiiIIIIi
extends IiiiIiiiiIiIi {
    private List<iiIiIiiiIIIiI> IiIIIiiiiIiiI;
    private List<IiiiIiiiiIiIi> iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public IIIIiiiiIIIIi(GameView gameView) {
        super(167, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 745, 452, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/95.png", (int)0, (int)0, (int)0, (int)0, (boolean)false), null);
        this.iIiIiiiiIIiii(false);
        this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, 12, 0, 0));
        this.IiIiiiiiIIIII.setImage("sc/e/157.png");
        this.IiIiiiiiIIIII.setBounds(704, 25, 33, 32);
        this.IiIIIiiiiIiiI = new ArrayList<iiIiIiiiIIIiI>();
        iiIiIiiiIIIiI IiiiiiiiIIIII = new iiIiIiiiIIIiI("sc/e/152.png", 2, 1, iiIIiiiiIiiII.IIiIiiiiiIiII, null, "新人福利", (IiiiIiiiiIiIi)this);
        IiiiiiiiIIIII.setBounds(88, 0, 107, 33);
        IiiiiiiiIIIII.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c513B32"));
        this.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
        this.add((Component)IiiiiiiiIIIII);
        this.iiIiiiiiiiIii = new ArrayList<IiiiIiiiiIiIi>();
    }

    public IiiiIiiiiIiIi iiiIiiiiiiIIi(int id, int key) {
        this.ALLATORIxDEMO = this.ALLATORIxDEMO(id, key);
        if (this.ALLATORIxDEMO == 1) {
            key = 0;
        }
        this.IiiiiiiiIIIII = key;
        for (iiIiIiiiIIIiI IiiiiiiiIIIII2 : this.IiIIIiiiiIiiI) {
            IiiiiiiiIIIII2.setKeep(IiiiiiiiIIIII2.iIiIiiiiIIiii() == this.ALLATORIxDEMO && IiiiiiiiIIIII2.ALLATORIxDEMO() == key);
        }
        IiiiIiiiiIiIi IiiiiiiiIIIII = this.ALLATORIxDEMO(id, key);
        if (IiiiiiiiIIIII == null) {
            if (this.ALLATORIxDEMO == 1) {
                IiiiiiiiIIIII = new IiiIiiiiIIIiI(this.iiIIiiiiIiIIi);
            } else if (this.ALLATORIxDEMO == 2) {
                Activity activity = this.ALLATORIxDEMO().ALLATORIxDEMO(key);
                IiiiiiiiIIIII = new iiIiiiiiIIiiI(activity, this.iiIIiiiiIiIIi);
            }
            this.iiIiiiiiiiIii.add(IiiiiiiiIIIII);
            this.add((Component)IiiiiiiiIIIII);
        }
        if (IiiiiiiiIIIII instanceof IiiIiiiiIIIiI) {
            ((IiiIiiiiIIIiI)IiiiiiiiIIIII).iiiIiiiiiiIIi();
        } else if (IiiiiiiiIIIII instanceof iiIiiiiiIIiiI) {
            ((iiIiiiiiIIiiI)IiiiiiiiIIIII).IiiIiiiiiiIiI();
        }
        for (IiiiIiiiiIiIi iiiiIiiiiIiIi : this.iiIiiiiiiiIii) {
            iiiiIiiiiIiIi.setVisible(iiiiIiiiiIiIi == IiiiiiiiIIIII);
        }
        return IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(int id, int key, List<IIIIIiiiIiIii> vionBtnList) {
        if (id == 1) {
            return true;
        }
        if (id != 2) return false;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = vionBtnList != null ? vionBtnList.size() : 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            if (vionBtnList.get(IiiiiiiiIIIII).ALLATORIxDEMO() == key) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public void iiiIiiiiiiIIi(int menuType) {
        if (this.ALLATORIxDEMO != menuType) {
            return;
        }
        IiiiIiiiiIiIi IiiiiiiiIIIII = this.ALLATORIxDEMO(menuType, this.IiiiiiiiIIIII);
        if (IiiiiiiiIIIII instanceof IiiIiiiiIIIiI) {
            ((IiiIiiiiIIIiI)IiiiiiiiIIIII).iIiIiiiiIIiIi();
            return;
        }
        if (!(IiiiiiiiIIIII instanceof iiIiiiiiIIiiI)) return;
        ((iiIiiiiiIIiiI)IiiiiiiiIIIII).iiiIiiiiiiIIi();
    }

    public boolean ALLATORIxDEMO(int id, int key) {
        for (iiIiIiiiIIIiI IiiiiiiiIIIII : this.IiIIIiiiiIiiI) {
            if (IiiiiiiiIIIII.iIiIiiiiIIiii() != id || IiiiiiiiIIIII.ALLATORIxDEMO() != key) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public int ALLATORIxDEMO(int id, int key) {
        Activity IiiiiiiiIIIII;
        iiIiIiiiIIIiI IiiiiiiiIIIII22;
        boolean IiiiiiiiIIIII3 = false;
        List IiiiiiiiIIIII4 = this.iiIIiiiiIiIIi.baseView.ALLATORIxDEMO();
        int IiiiiiiiIIIII5 = this.IiIIIiiiiIiiI.size() - 1;
        while (IiiiiiiiIIIII5 >= 0) {
            IiiiiiiiIIIII22 = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII5);
            if (!this.ALLATORIxDEMO(IiiiiiiiIIIII22.iIiIiiiiIIiii(), key, IiiiiiiiIIIII4)) {
                this.remove((Component)IiiiiiiiIIIII22);
                this.IiIIIiiiiIiiI.remove(IiiiiiiiIIIII5);
                IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII22.iIiIiiiiIIiii(), key);
                if (IiiiiiiiIIIII != null) {
                    this.remove((Component)IiiiiiiiIIIII);
                    this.iiIiiiiiiiIii.remove(IiiiiiiiIIIII);
                }
                IiiiiiiiIIIII3 = true;
            }
            --IiiiiiiiIIIII5;
        }
        IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.size()) {
            IiiiiiiiIIIII22 = (IIIIIiiiIiIii)IiiiiiiiIIIII4.get(IiiiiiiiIIIII5);
            if (IiiiiiiiIIIII22.ALLATORIxDEMO() > 100 && IiiiiiiiIIIII22.ALLATORIxDEMO() < 200 && (IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII22.ALLATORIxDEMO())) != null && IiiiiiiiIIIII.getModelId() == 2 && !this.ALLATORIxDEMO(2, IiiiiiiiIIIII.getId())) {
                void IiiiiiiiIIIII6;
                iiIiIiiiIIIiI iiIiIiiiIIIiI2 = new iiIiIiiiIIIiI("sc/e/152.png", 2, 2, iiIIiiiiIiiII.IIiIiiiiiIiII, null, IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getBaseSet(), (String)"名称=", (String)"|"), (IiiiIiiiiIiIi)this);
                IiiiiiiiIIIII6.iIiIiiiiIIiii(IiiiiiiiIIIII.getId());
                IiiiiiiiIIIII6.setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c513B32"));
                this.IiIIIiiiiIiiI.add((iiIiIiiiIIIiI)IiiiiiiiIIIII6);
                this.add((Component)IiiiiiiiIIIII6);
                IiiiiiiiIIIII3 = true;
            }
            ++IiiiiiiiIIIII5;
        }
        if (!this.ALLATORIxDEMO(id, key)) {
            id = 1;
        }
        if (!IiiiiiiiIIIII3) return id;
        IiiiiiiiIIIII5 = 0;
        for (iiIiIiiiIIIiI IiiiiiiiIIIII22 : this.IiIIIiiiiIiiI) {
            int n = 88 + 109 * IiiiiiiiIIIII5;
            ++IiiiiiiiIIIII5;
            IiiiiiiiIIIII22.setBounds(n, 0, 107, 33);
        }
        return id;
    }

    public IiiiIiiiiIiIi iIiIiiiiIIiii(int menuType, int key) {
        IiiiIiiiiIiIi IiiiiiiiIIIII = this.ALLATORIxDEMO(menuType, key);
        if (IiiiiiiiIIIII == null) return null;
        if (!IiiiiiiiIIIII.isVisible()) return null;
        return IiiiiiiiIIIII;
    }

    public IiiiIiiiiIiIi ALLATORIxDEMO(int id, int key) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size()) {
            IiiiIiiiiIiIi IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
            if (id == 1 && IiiiiiiiIIIII2 instanceof IiiIiiiiIIIiI) {
                return IiiiiiiiIIIII2;
            }
            if (id == 2 && IiiiiiiiIIIII2 instanceof iiIiiiiiIIiiI && ((iiIiiiiiIIiiI)IiiiiiiiIIIII2).iiiIiiiiiiIIi() == key) {
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void iIiIiiiiIIiii(int data) {
        if (data == 0) {
            IiiiIiiiiIiIi IiiiiiiiIIIII = this.iiiIiiiiiiIIi(1, 0);
            if (IiiiiiiiIIIII instanceof IiiIiiiiIIIiI) {
                ((IiiIiiiiIIIiI)IiiiiiiiIIIII).iIiIiiiiIIiii(21);
            }
        } else if (data == 1) {
            IiiiIiiiiIiIi IiiiiiiiIIIII = this.iiiIiiiiiiIIi(1, 0);
            if (IiiiiiiiIIIII instanceof IiiIiiiiIIIiI) {
                ((IiiIiiiiIIIiI)IiiiiiiiIIIII).iIiIiiiiIIiii(22);
            }
        } else if (data != 1) {
            return;
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public int iiiIiiiiiiIIi() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(Activity activity) {
        if (activity == null) {
            return;
        }
        if (activity.getModelId() != 2) return;
        this.iiiIiiiiiiIIi(2, activity.getId());
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
