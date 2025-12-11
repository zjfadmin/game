/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.v.IIiiIiiiiIIiI
 *  com.xy.a.v.iIiIIiiiIiiiI
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iIiIIiiiIiiiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.Activity2Role
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCBeau
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.v.IIiiIiiiiIIiI;
import com.xy.a.v.iIiIIiiiIiiiI;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.Activity2Role;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCBeau;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class iiiiiiiiiiIiI
extends IiiiIiiiiIiIi {
    private int[] IIiiiiiiiIIIi;
    private JLabel[] IIIiiiiiIIiII;
    private IIiiIiiiiIIiI[] iiIiiiiiiIIiI;
    private iiIiIiiiIIIiI[] iIiiIiiiIiIIi;
    private RichLabel iiiiIiiiIIiii;
    private int iIIiIiiiiiiIi = 1;
    private Activity IIIIiiiiiiiII;
    private List<Integer> iiIIIiiiiiiiI;
    private int IiIiiiiiIIIII = 1;
    private IIIiiiiiIiIiI iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private iIIiIiiiIiiIi iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private iIiIIiiiIiiiI[] IIiiIiiiIIiIi;
    private com.xy.q.iIiIIiiiIiiiI iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private com.xy.q.iIiIIiiiIiiiI IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public iiiiiiiiiiIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 703, 542, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iIiiIiiiIiIIi = new iiIiIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII] = IiiiiiiiIIIII == 0 ? new iiIiIiiiIIIiI("sc/e/186.png", 1, 191 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, null, "我的竞拍", (IiiiIiiiiIiIi)this) : new iiIiIiiiIIIiI(IiiiiiiiIIIII == 1 ? "sc/e/156.png" : "sc/e/155.png", 1, 191 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setBounds(543, 71, 112, 43);
            } else {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setBounds(305 + (IiiiiiiiIIIII - 1) * 94, 498, 18, 25);
            }
            this.add((Component)this.iIiiIiiiIiIIi[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)327, (int)500, (int)68, (int)19, (int)0, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiIiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iiiiIiiiIIiii = new RichLabel("", iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.add((Component)this.iiiiIiiiIIiii);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/66.png", (int)100, (int)1, (int)100, (int)1, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(47, 131, 629, 2);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(46, 58, 634, 65);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new com.xy.q.iIiIIiiiIiiiI();
        this.iiIiiiiiiIIiI = new IIiiIiiiiIIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiIIiI.length) {
            this.iiIiiiiiiIIiI[IiiiiiiiIIIII] = new IIiiIiiiiIIiI(this, IiiiiiiiIIIII, this);
            this.iiIiiiiiiIIiI[IiiiiiiiIIIII].setBounds(IiiiiiiiIIIII % 2 * 322, IiiiiiiiIIIII / 2 * 120, 312, 110);
            this.IiiiiiiiIIIII.add((Component)this.iiIiiiiiiIIiI[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII.setBounds(45, 141, 634, 350);
        this.add((Component)this.IiiiiiiiIIIII);
        this.iIiIiiiiIiIii = new com.xy.q.iIiIIiiiIiiiI();
        this.IIIiiiiiIIiII = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIiiiiiIIiII.length) {
            this.IIIiiiiiIIiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)7, (int)0, (int)150, (int)24, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c86745C"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIIiiiiiIIiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "极品ID靓号" : (IiiiiiiiIIIII == 1 ? "竞拍价" : (IiiiiiiiIIIII == 2 ? "状态" : (IiiiiiiiIIIII == 3 ? "操作" : ""))));
            this.IIIiiiiiIIiII[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.IIIiiiiiIIiII[IiiiiiiiIIIII].setBounds(170, 0, 150, 24);
            } else if (IiiiiiiiIIIII == 2) {
                this.IIIiiiiiIIiII[IiiiiiiiIIIII].setBounds(326, 0, 150, 24);
            } else if (IiiiiiiiIIIII == 3) {
                this.IIIiiiiiIIiII[IiiiiiiiIIIII].setBounds(476, 0, 150, 24);
            }
            this.iIiIiiiiIiIii.add((Component)this.IIIiiiiiIIiII[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new iIiIIiiiIiiiI[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new iIiIIiiiIiiiI(this, IiiiiiiiIIIII, this);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(0, 41 + IiiiiiiiIIIII * 40, 635, 24);
            this.iIiIiiiiIiIii.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI("sc/d/203.png");
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/101.png", (int)10, (int)50, (int)10, (int)50, (boolean)false));
        this.iiIiIiiiiIIIi.setBounds(0, 0, 635, 28);
        this.IiIIIiiiiIiiI.setBounds(1, 23, 633, 336);
        this.iIiIiiiiIiIii.add((Component)this.iiIiIiiiiIIIi);
        this.iIiIiiiiIiIii.add((Component)this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii.setBounds(44, 141, 635, 359);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    public void iiiIiiiiiiIIi() {
        if (this.ALLATORIxDEMO != 1) {
            return;
        }
        this.ALLATORIxDEMO = 0;
        this.ALLATORIxDEMO(191, 0);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(int var1_1) {
        block6: {
            this.iIIiIiiiiiiIi = var1_1;
            this.iiiIiiiiiiiIi.setText(String.valueOf(this.iIIiIiiiiiiIi) + "/" + this.IiIiiiiiIIIII);
            if (this.ALLATORIxDEMO != 0) break block6;
            var2_2 = 98;
            IiiiiiiiIIIII = 2 + (this.iIIiIiiiiiiIi - 1) * 2 * this.iiIiiiiiiIIiI.length;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl22
        }
        IiiiiiiiIIIII = 98;
        IiiiiiiiIIIII = this.ALLATORIxDEMO();
        IiiiiiiiIIIII = this.IIIIiiiiiiiII != null ? (Activity2Role)IiiiiiiiIIIII.getActivity(this.IIIIiiiiiiiII.getId()) : null;
        IiiiiiiiIIIII = (this.iIIiIiiiiiiIi - 1) * this.IIiiIiiiIIiIi.length;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl31
        do {
            if (IiiiiiiiIIIII < this.IIiiiiiiiIIIi.length) {
                this.iiIiiiiiiIIiI[IiiiiiiiIIIII].ALLATORIxDEMO(this.IIiiiiiiiIIIi[IiiiiiiiIIIII], this.IIiiiiiiiIIIi[IiiiiiiiIIIII + 1], (int)IiiiiiiiIIIII);
            } else {
                this.iiIiiiiiiIIiI[IiiiiiiiIIIII].ALLATORIxDEMO(0, 0, (int)IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII += 2;
lbl22:
            // 2 sources

        } while (IiiiiiiiIIIII < this.iiIiiiiiiIIiI.length);
        return;
        do {
            if (IiiiiiiiIIIII < this.iiIIIiiiiiiiI.size()) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(this.iiIIIiiiiiiiI.get(IiiiiiiiIIIII).intValue(), IiiiiiiiIIIII != null ? (int)IiiiiiiiIIIII.getValueByKey(this.iiIIIiiiiiiiI.get(IiiiiiiiIIIII).intValue()) : 0, IiiiiiiiIIIII);
            } else {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, 0, IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
            ++IiiiiiiiIIIII;
lbl31:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length);
    }

    public void ALLATORIxDEMO(int[] data) {
        this.iIiiIiiiiiiII = data[0];
        this.iiiiIiiiIiiII = data[1];
        this.IIIIiiiiiiiII = this.ALLATORIxDEMO().ALLATORIxDEMO();
        int IiiiiiiiIIIII = this.IIIIiiiiiiiII != null ? com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.IIIIiiiiiiiII.getActivitySet(), (String)"抢靓号设置=", (String)"|") : 0;
        ActivityFC IiiiiiiiIIIII2 = IiiiiiiiIIIII > 0 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII) : null;
        ActivityFCBeau IiiiiiiiIIIII3 = IiiiiiiiIIIII2 != null ? (ActivityFCBeau)IiiiiiiiIIIII2.getData() : null;
        iiiiiiiiiiIiI iiiiiiiiiiIiI2 = this;
        if (IiiiiiiiIIIII3 != null) {
            long IiiiiiiiIIIII4 = iiiiiiiiiiIiI2.IIIIiiiiiiiII.getTimeOpen() + (long)(this.iIiiIiiiiiiII - 1) * IiiiiiiiIIIII3.getCycleTime() * 1000L + (long)IiiiiiiiIIIII3.getPointTime().x * 1000L;
            long IiiiiiiiIIIII5 = this.IIIIiiiiiiiII.getTimeOpen() + (long)(this.iIiiIiiiiiiII - 1) * IiiiiiiiIIIII3.getCycleTime() * 1000L + (long)IiiiiiiiIIIII3.getPointTime().y * 1000L;
            this.iiiiIiiiIIiii.setTextSize("#c484333竞拍时间为#cFF0000  " + com.xy.v.iIiIIiiiIiiiI.iIiIiiiiIIiii((long)IiiiiiiiIIIII4) + " ~ " + com.xy.v.iIiIIiiiIiiiI.iIiIiiiiIIiii((long)IiiiiiiiIIIII5), 500);
        } else {
            iiiiiiiiiiIiI2.iiiiIiiiIIiii.setTextSize("", 500);
        }
        this.iiiiIiiiIIiii.setBounds(90, 75, this.iiiiIiiiIIiii.getWidth(), this.iiiiIiiiIIiii.getHeight());
        this.IIiiiiiiiIIIi = data;
        this.ALLATORIxDEMO = 1;
        this.ALLATORIxDEMO(191, 0);
    }

    static /* synthetic */ int ALLATORIxDEMO(iiiiiiiiiiIiI arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int id, int key) {
        block18: {
            block17: {
                if (id != 191) break block17;
                this.ALLATORIxDEMO = this.ALLATORIxDEMO == 0 ? 1 : 0;
                this.iIiiIiiiIiIIi[0].setText(this.ALLATORIxDEMO == 0 ? "我的竞拍" : "返回竞拍");
                if (this.ALLATORIxDEMO == 0) {
                    this.iIiIiiiiIiIii.setVisible(false);
                    this.IiiiiiiiIIIII.setVisible(true);
                    this.IiIiiiiiIIIII = 1 + ((this.IIiiiiiiiIIIi.length - 2) / 2 - 1) / this.iiIiiiiiiIIiI.length;
                    this.iIiIiiiiIIiii(1);
                    return;
                }
                this.IiiiiiiiIIIII.setVisible(false);
                this.iIiIiiiiIiIii.setVisible(true);
                if (this.iiIIIiiiiiiiI == null) {
                    this.iiIIIiiiiiiiI = new ArrayList<Integer>();
                } else {
                    this.iiIIIiiiiiiiI.clear();
                }
                IiiiiiiiIIIII = this.ALLATORIxDEMO();
                v0 = IiiiiiiiIIIII = this.IIIIiiiiiiiII != null ? (Activity2Role)IiiiiiiiIIIII.getActivity(this.IIIIiiiiiiiII.getId()) : null;
                if (IiiiiiiiIIIII == null) break block18;
                var6_11 = IiiiiiiiIIIII.getDataMap().keySet().iterator();
                if (true) ** GOTO lbl79
            }
            if (id == 192) {
                if (this.iIIiIiiiiiiIi <= 1) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("这是首页");
                    return;
                }
                this.iIiIiiiiIIiii(this.iIIiIiiiiiiIi - 1);
                return;
            }
            if (id == 193) {
                if (this.iIIiIiiiiiiIi >= this.IiIiiiiiIIIII) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("这是尾页");
                    return;
                }
                this.iIiIiiiiIIiii(this.iIIiIiiiiiiIi + 1);
                return;
            }
            if (id == 194) {
                if (key == 0) {
                    return;
                }
                IiiiiiiiIIIII = new StringBuffer();
                IiiiiiiiIIIII.append("[");
                IiiiiiiiIIIII.append(this.ALLATORIxDEMO().getLoginResult().getRolename());
                IiiiiiiiIIIII.append("#VBEAU2,");
                IiiiiiiiIIIII.append(key);
                IiiiiiiiIIIII.append("#L]");
                IiiiiiiiIIIII = (iiIiiiiiIIiiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
                IiiiiiiiIIIII.iiiiiiiiIIiii(IiiiiiiiIIIII.toString());
                return;
            }
            if (id == 195) {
                if (key == 0) {
                    return;
                }
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("B1" + key));
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (id == 196) {
                if (key == 0) {
                    return;
                }
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("Ba" + key));
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (id == 197) {
                if (key == 0) {
                    return;
                }
                IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("Bb" + key));
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (id != 198) return;
            if (key == 0) {
                return;
            }
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"BEAU", (String)("Bc" + key));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
            do {
                if ((IiiiiiiiIIIII = (Integer)var6_11.next()) == 0) continue;
                this.iiIIIiiiiiiiI.add(IiiiiiiiIIIII);
lbl79:
                // 3 sources

            } while (var6_11.hasNext());
        }
        this.IiIiiiiiIIIII = 1 + (this.iiIIIiiiiiiiI.size() - 1) / this.IIiiIiiiIIiIi.length;
        this.iIiIiiiiIIiii(1);
    }
}
