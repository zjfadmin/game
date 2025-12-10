/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIIiiiiiIiIiI
 *  com.xy.i.IIiiIiiiIiiiI
 */
package com.xy.i;

import com.xy.i.IIIiiiiiIiIiI;
import com.xy.i.IIiiIiiiIiiiI;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiIiIII {
    private int iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private IIiiIiiiIiiiI[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private List<JLabel> iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void iIiIiiiiIIiIi(int page) {
        if (this.iIiiIiiiiiiII == 0) {
            this.iIiIiiiiIIiii(page);
        } else if (this.iIiiIiiiiiiII == 1) {
            if (this.IiIIIiiiiIiiI.ALLATORIxDEMO(page)) {
                this.IiiiiiiiIIIII = page;
            } else {
                int IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
                if (page > IiiiiiiiIIIII) {
                    this.IiiiiiiiIIIII = IiiiiiiiIIIII;
                }
            }
        }
        this.ALLATORIxDEMO();
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(boolean b) {
        block3: {
            block2: {
                if (this.iIiIiiiiIiIii == null) break block2;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl10
            }
            if (this.iiIiiiiiiiIii == null) break block3;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl16
            do {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII++].setVisible(b);
lbl10:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
            break block3;
            do {
                v0 = this.iiIiiiiiiiIii.get(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                v0.setVisible(b);
lbl16:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size());
        }
        if (this.ALLATORIxDEMO == null) return;
        this.ALLATORIxDEMO.setVisible(b);
    }

    public IIIiIiiiIiIII(List<JLabel> list, IIIiiiiiIiIiI pageNum, int type) {
        this.iIiiIiiiiiiII = type;
        this.iiIiiiiiiiIii = list;
        this.IiIIIiiiiIiiI = pageNum;
        this.IIiiIiiiIIiIi = list.size();
        if (type != 0) return;
        this.iiiIiiiiiiIIi(this.IIiiIiiiIIiIi);
    }

    public IIIiIiiiIiIII(IIiiIiiiIiiiI[] btns, IIIiiiiiIiIiI pageNum, int type) {
        this.iIiIiiiiIiIii = btns;
        this.IiIIIiiiiIiiI = pageNum;
        this.iIiiIiiiiiiII = type;
        this.IIiiIiiiIIiIi = btns.length;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII++].ALLATORIxDEMO(this);
        }
        if (type != 0) return;
        this.iiiIiiiiiiIIi(this.IIiiIiiiIIiIi);
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi(int max) {
        block5: {
            block4: {
                if (max < 0 || max > this.iIiIiiiiIIiii()) {
                    max = this.iIiIiiiiIIiii();
                }
                this.IIiiIiiiIIiIi = max;
                if (this.iIiIiiiiIiIii == null) break block4;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl16
            }
            if (this.iiIiiiiiiiIii == null) break block5;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl21
            do {
                if (IiiiiiiiIIIII < max) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBtn(2);
                }
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setVisible(IiiiiiiiIIIII < max);
                ++IiiiiiiiIIIII;
lbl16:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
            break block5;
            do {
                this.iiIiiiiiiiIii.get(IiiiiiiiIIIII).setVisible(IiiiiiiiIIIII < max);
                ++IiiiiiiiIIIII;
lbl21:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.size());
        }
        this.iIiIiiiiIIiii(this.IiiiiiiiIIIII);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int page) {
        block4: {
            block3: {
                if (this.iIiIiiiiIiIii == null) break block3;
                if (page < 0 || page >= this.IIiiIiiiIIiIi) {
                    page = 0;
                }
                this.IiiiiiiiIIIII = page;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl13
            }
            if (this.iiIiiiiiiiIii != null) {
                this.IiiiiiiiIIIII = page;
            }
            break block4;
            do {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII++].setKeep(false);
lbl13:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
            this.iIiIiiiiIiIii[page].setKeep(true);
        }
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(IIiiIiiiIiiiI[] btns, int type) {
        this.iIiIiiiiIiIii = btns;
        this.iIiiIiiiiiiII = type;
        this.IIiiIiiiIIiIi = btns.length;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII++].ALLATORIxDEMO(this);
        }
        if (type == 0) {
            this.iiiIiiiiiiIIi(this.IIiiIiiiIIiIi);
        }
        this.ALLATORIxDEMO(this.IiiiiiiiIIIII);
    }

    public int iIiIiiiiIIiii() {
        if (this.iIiIiiiiIiIii != null) {
            return this.iIiIiiiiIiIii.length;
        }
        if (this.iiIiiiiiiiIii == null) return 0;
        return this.iiIiiiiiiiIii.size();
    }

    public int ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public List<JLabel> ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public void ALLATORIxDEMO(int page) {
        if (this.iIiiIiiiiiiII == 0) {
            this.iIiIiiiiIIiii(page);
        } else if (this.iIiiIiiiiiiII == 1) {
            if (page == 0) {
                page = this.IiiiiiiiIIIII - 1;
            } else if (page == 1) {
                page = this.IiiiiiiiIIIII + 1;
            } else if (page == -1) {
                page = 0;
            } else if (page == 2) {
                page = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
            }
            if (page < 0) {
                return;
            }
            if (this.IiIIIiiiiIiiI.ALLATORIxDEMO(page)) {
                this.IiiiiiiiIIIII = page;
            } else {
                int IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO();
                if (page > IiiiiiiiIIIII) {
                    this.IiiiiiiiIIIII = IiiiiiiiIIIII;
                }
            }
        }
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO() {
        if (this.ALLATORIxDEMO == null) {
            return;
        }
        this.ALLATORIxDEMO.setText(String.valueOf(this.IiiiiiiiIIIII + 1) + "/" + (this.IiIIIiiiiIiiI.ALLATORIxDEMO() + 1));
    }

    public void ALLATORIxDEMO(JLabel pageLabel) {
        this.ALLATORIxDEMO = pageLabel;
        this.ALLATORIxDEMO();
    }

    public IIiiIiiiIiiiI[] ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public JLabel ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }
}
