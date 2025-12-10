/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiiiiiI
 *  com.xy.a.IIiIIiiiiIiiI
 *  com.xy.a.IiIIiiiiiIiiI
 *  com.xy.a.iIiiIiiiiiIIi
 *  com.xy.a.iiiiIiiiIiIii
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.SummonPetBean
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.petExchange
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIIiIiiiiiiiI;
import com.xy.a.IIiIIiiiiIiiI;
import com.xy.a.IiIIiiiiiIiiI;
import com.xy.a.iIiiIiiiiiIIi;
import com.xy.a.iiiiIiiiIiIii;
import com.xy.bean.ConfirmBean;
import com.xy.bean.SummonPetBean;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.petExchange;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIIiiiiiIIII
extends IiiiIiiiiIiIi {
    private IIIiIiiiiiiiI iIiiIiiiiiiII;
    private IIiIIiiiiIiiI IIiiIiiiIIiIi;
    private IIIIIiiiIIIiI[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private iIiiIiiiiiIIi iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private iiiiIiiiIiIii ALLATORIxDEMO;

    static /* synthetic */ iIiiIiiiiiIIi ALLATORIxDEMO(iiIIiiiiiIIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number < 0L) {
            return 0L;
        }
        if (this.IiiiiiiiIIIII == 0) {
            if (textField == iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[0]) {
                long IiiiiiiiIIIII = this.iiIiiiiiiiIii.iiiiIiiiIiiII + iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO();
                IiiiiiiiIIIII = IiiiiiiiIIIII > 0L ? this.ALLATORIxDEMO().getLoginResult().getGold().longValue() / IiiiiiiiIIIII : 0L;
                if (number <= IiiiiiiiIIIII) return null;
                return IiiiiiiiIIIII;
            }
            if (textField != iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[1]) return null;
            long IiiiiiiiIIIII = this.iiIiiiiiiiIii.iiiiIiiiIiiII + (number > 999999L ? 999999L : number);
            long l = IiiiiiiiIIIII = IiiiiiiiIIIII > 0L ? this.ALLATORIxDEMO().getLoginResult().getGold().longValue() / IiiiiiiiIIIII : 0L;
            if (IiiiiiiiIIIII < iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[0].ALLATORIxDEMO()) {
                iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[0].setText(String.valueOf(IiiiiiiiIIIII));
            }
            if (number <= 999999L) return null;
            return 999999L;
        }
        if (this.IiiiiiiiIIIII == 1) {
            if (textField == IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[0]) {
                long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getCodecard().longValue();
                if (number <= IiiiiiiiIIIII) return null;
                return IiiiiiiiIIIII;
            }
            if (textField != IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[1]) return null;
            long IiiiiiiiIIIII = 10000000L;
            if (number > IiiiiiiiIIIII) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u6700\u59271\u70b9\u4ed9\u7389\u53ef\u5bc4\u552e1000W\u5927\u8bdd\u5e01");
            }
            if (number <= IiiiiiiiIIIII) return null;
            return IiiiiiiiIIIII;
        }
        if (this.IiiiiiiiIIIII != 2) return null;
        if (textField == iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[0]) {
            long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getCodecard().longValue();
            if (number <= IiiiiiiiIIIII) return null;
            return IiiiiiiiIIIII;
        }
        if (textField != iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[1]) return null;
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getGold().longValue();
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(int type, String mes) {
        block10: {
            block9: {
                block8: {
                    this.IiiiiiiiIIIII = type;
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiiiiiiiIIIII);
                        ++IiiiiiiiIIIII;
                    }
                    if (type != 0) break block8;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl35
                }
                if (type != 1) break block9;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl48
            }
            if (type == 2) {
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO, (petExchange)this.ALLATORIxDEMO().ALLATORIxDEMO(1));
                iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO, (petExchange)this.ALLATORIxDEMO().ALLATORIxDEMO(2));
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).setTextSize("#c000000\u5c06\u4ed9\u7389\u5151\u6362\u6210\u7ed1\u7389\uff0c\u5151\u6362\u6bd4\u4f8b\u4e3a#cFF0000 " + iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHp() + "\uff1a" + iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).getMp(), 360);
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).setBounds(129, 124, iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).getWidth(), iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHeight());
                iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).setTextSize("#c000000\u5c06\u5927\u8bdd\u5e01\u5151\u6362\u6210\u7ed1\u7389\uff0c\u5151\u6362\u6bd4\u4f8b\u4e3a#cFF0000 " + iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHp() + "\uff1a" + iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).getMp(), 360);
                iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).setBounds(129, 142, iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).getWidth(), iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHeight());
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[0].setText("0");
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[1].setText("0");
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[0].iIiIiiiiIIiii();
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[1].iIiIiiiiIIiii();
                iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[2].iIiIiiiiIIiii();
            } else if (type == 3) {
                this.iIiiIiiiiiiII.ALLATORIxDEMO(null);
                IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.iIiiIiiiiiiII).iIiIiiiiIIiii();
            }
            break block10;
            do {
                this.iiIiiiiiiiIii.add((Component)iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[IiiiiiiiIIIII++]);
lbl35:
                // 2 sources

            } while (IiiiiiiiIIIII < iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii).length);
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii).length) {
                this.iiIiiiiiiiIii.add((Component)iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[IiiiiiiiIIIII++], 0);
            }
            iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[4].setText("\u786e\u5b9a\u8d2d\u4e70");
            this.iiIiiiiiiiIii.ALLATORIxDEMO(mes);
            iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii).iIiIiiiiIIiii();
            break block10;
            do {
                this.IIiiIiiiIIiIi.add((Component)iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[IiiiiiiiIIIII++]);
lbl48:
                // 2 sources

            } while (IiiiiiiiIIIII < iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii).length);
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii).length) {
                this.IIiiIiiiIIiIi.add((Component)iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[IiiiiiiiIIIII++], 0);
            }
            iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[4].setText("\u786e\u5b9a\u5bc4\u552e");
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(mes);
            IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[0].iIiIiiiiIIiii();
            IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[1].iIiIiiiiIIiii();
        }
        this.iiIiiiiiiiIii.setVisible(type == 0);
        this.IIiiIiiiIIiIi.setVisible(type == 1);
        this.ALLATORIxDEMO.setVisible(type == 2);
        this.iIiiIiiiiiiII.setVisible(type == 3);
    }

    public void iIiIiiiiIIiii(int type) {
        if (type != 0 && type != 1) {
            this.ALLATORIxDEMO(type, (String)null);
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"exchange", (String)("X" + type + "1"));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (this.IiiiiiiiIIIII == 0) {
            long IiiiiiiiIIIII = iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[0] == textField ? number : iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[0].ALLATORIxDEMO();
            long IiiiiiiiIIIII2 = iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[1] == textField ? number : iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO();
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[2], (long)(IiiiiiiiIIIII * (IiiiiiiiIIIII2 += this.iiIiiiiiiiIii.iiiiIiiiIiiII)));
            return;
        }
        if (this.IiiiiiiiIIIII == 1) {
            long IiiiiiiiIIIII = IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[0] == textField ? number : IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[0].ALLATORIxDEMO();
            long IiiiiiiiIIIII3 = IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[1] == textField ? number : IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[1].ALLATORIxDEMO();
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[1], (long)(IiiiiiiiIIIII * IiiiiiiiIIIII3));
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        if (textField == iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[0]) {
            long IiiiiiiiIIIII = iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHp() != 0 ? number / (long)iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHp() * (long)iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO).getMp() : 0L;
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[0], (long)IiiiiiiiIIIII);
            return;
        }
        if (textField != iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[1]) return;
        long IiiiiiiiIIIII = iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHp() != 0 ? number / (long)iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).getHp() * (long)iiiiIiiiIiIii.iIiIiiiiIIiii((iiiiIiiiIiIii)this.ALLATORIxDEMO).getMp() : 0L;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[1], (long)IiiiiiiiIIIII);
    }

    public void ALLATORIxDEMO(long id) {
        if (this.IiiiiiiiIIIII != 1) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii).length) {
            if (iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[IiiiiiiiIIIII].isVisible() && IiIIiiiiiIiiI.ALLATORIxDEMO((IiIIiiiiiIiiI)iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[IiiiiiiiIIIII]) == id) {
                iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[IiiiiiiiIIIII].ALLATORIxDEMO();
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    /*
     * Unable to fully structure code
     */
    public iiIIiiiiiIIII(GameView gameView) {
        block5: {
            block7: {
                block6: {
                    super(117, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
                    this.ALLATORIxDEMO(-1, 0, 481, 510, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
                    this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u5151\u6362\u7cfb\u7edf");
                    this.iIiIiiiiIiIii = new IIIIIiiiIIIiI[4];
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/38.png", 2, 181 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u4e70\u4ed9\u7389" : (IiiiiiiiIIIII == 1 ? "\u5356\u4ed9\u7389" : (IiiiiiiiIIIII == 2 ? "\u7ed1\u7389\u5151\u6362" : (IiiiiiiiIIIII == 3 ? "\u7269\u54c1\u5408\u6210" : ""))), (IiiiIiiiiIiIi)this);
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
                        this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(57 + 92 * IiiiiiiiIIIII, 20, 85, 33);
                        this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
                    }
                    this.iiIiiiiiiiIii = new iIiiIiiiiiIIi(this);
                    this.IIiiIiiiIIiIi = new IIiIIiiiiIiiI(this);
                    this.ALLATORIxDEMO = new iiiiIiiiIiIii(this);
                    this.iIiiIiiiiiiII = new IIIiIiiiiiiiI(this);
                    this.iiIiiiiiiiIii.setBounds(0, 0, 481, 510);
                    this.IIiiIiiiIIiIi.setBounds(0, 0, 481, 510);
                    this.ALLATORIxDEMO.setBounds(0, 0, 481, 510);
                    this.iIiiIiiiiiiII.setBounds(0, 0, 481, 510);
                    this.add((Component)this.iiIiiiiiiiIii);
                    this.add((Component)this.IIiiIiiiIIiIi);
                    this.add((Component)this.ALLATORIxDEMO);
                    this.add((Component)this.iIiiIiiiiiiII);
                    this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                    this.IiIIIiiiiIiiI.setBounds(47, 34, 408, 20);
                    this.add((Component)this.IiIIIiiiiIiiI);
                    if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) break block5;
                    if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 8)) break block6;
                    this.iIiIiiiiIiIii[2].setVisible(false);
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl58
                }
                if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3) && !this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) break block7;
                this.iIiIiiiiIiIii[0].setVisible(false);
                this.iIiIiiiiIiIii[1].setVisible(false);
                this.iIiIiiiiIiIii[2].setVisible(false);
                IiiiiiiiIIIII = 3;
                if (true) ** GOTO lbl65
            }
            if (this.ALLATORIxDEMO().gameType != 1 && this.ALLATORIxDEMO().gameType != 2) break block5;
            this.iIiIiiiiIiIii[0].setVisible(false);
            this.iIiIiiiiIiIii[1].setVisible(false);
            IiiiiiiiIIIII = 2;
            if (true) ** GOTO lbl72
            do {
                if (this.iIiIiiiiIiIii[IiiiiiiiIIIII].isVisible()) {
                    v0 = 57 + 92 * IiiiiiiiIIIII;
                    ++IiiiiiiiIIIII;
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(v0, 20, 85, 33);
                }
                ++IiiiiiiiIIIII;
lbl58:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
            break block5;
            do {
                v1 = this.iIiIiiiiIiIii[IiiiiiiiIIIII];
                v2 = 57 + 92 * (IiiiiiiiIIIII - 3);
                ++IiiiiiiiIIIII;
                v1.setBounds(v2, 20, 85, 33);
lbl65:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
            break block5;
            do {
                v3 = this.iIiIiiiiIiIii[IiiiiiiiIIIII];
                v4 = 57 + 92 * (IiiiiiiiIIIII - 2);
                ++IiiiiiiiIIIII;
                v3.setBounds(v4, 20, 85, 33);
lbl72:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length);
        }
        this.iIiIiiiiIIiii(3);
    }

    public void ALLATORIxDEMO(int id, Object data) {
        petExchange IiiiiiiiIIIII;
        if (id == 185 || id == 186 || id == 187 || id == 188) {
            long IiiiiiiiIIIII2 = this.iiIiiiiiiiIii.iiIIIiiiiiiiI;
            long IiiiiiiiIIIII3 = this.iiIiiiiiiiIii.iiiIiiiiiiiIi;
            long IiiiiiiiIIIII4 = IiiiiiiiIIIII2;
            if (id == 185) {
                IiiiiiiiIIIII4 = 1L;
            } else if (id == 187) {
                --IiiiiiiiIIIII4;
            } else if (id == 188) {
                ++IiiiiiiiIIIII4;
            } else if (id == 186) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
            }
            if (IiiiiiiiIIIII4 <= 0L) {
                IiiiiiiiIIIII4 = 1L;
            }
            if (IiiiiiiiIIIII4 > IiiiiiiiIIIII3) {
                IiiiiiiiIIIII4 = IiiiiiiiIIIII3;
            }
            if (IiiiiiiiIIIII4 == IiiiiiiiIIIII2) {
                return;
            }
            if (this.IiiiiiiiIIIII == 0) {
                String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"exchange", (String)("X0" + IiiiiiiiIIIII4));
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
                return;
            }
            if (this.IiiiiiiiIIIII != 1) return;
            String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"exchange", (String)("X1" + IiiiiiiiIIIII4));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
            return;
        }
        if (id == 189) {
            if (this.IiiiiiiiIIIII == 0) {
                if (this.iiIiiiiiiiIii.iiiiIiiiIiiII <= 0L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u6b63\u5728\u9500\u552e\u4ed9\u7389");
                    return;
                }
                long IiiiiiiiIIIII7 = iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[0].ALLATORIxDEMO();
                if (IiiiiiiiIIIII7 < 100L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8d2d\u4e70\u6570\u91cf\u6700\u5c11\u4e3a100");
                    return;
                }
                long IiiiiiiiIIIII8 = iIiiIiiiiiIIi.ALLATORIxDEMO((iIiiIiiiiiIIi)this.iiIiiiiiiiIii)[1].ALLATORIxDEMO() + this.iiIiiiiiiiIii.iiiiIiiiIiiII;
                StringBuffer IiiiiiiiIIIII9 = new StringBuffer();
                IiiiiiiiIIIII9.append("\u8bf7\u786e\u8ba4\u9700\u8981\u6d88\u8017#Y");
                IiiiiiiiIIIII9.append(IiiiiiiiIIIII8 * IiiiiiiiIIIII7);
                IiiiiiiiIIIII9.append("#W\u5927\u8bdd\u5e01\u8d2d\u4e70#Y");
                IiiiiiiiIIIII9.append(IiiiiiiiIIIII7);
                IiiiiiiiIIIII9.append("#W\u70b9\u4ed9\u7389");
                this.ALLATORIxDEMO().ALLATORIxDEMO(new ConfirmBean(29, "B0" + IiiiiiiiIIIII8 + "|" + IiiiiiiiIIIII7, IiiiiiiiIIIII9.toString()));
                return;
            }
            if (this.IiiiiiiiIIIII != 1) return;
            long IiiiiiiiIIIII10 = IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[0].ALLATORIxDEMO();
            long IiiiiiiiIIIII11 = IIiIIiiiiIiiI.ALLATORIxDEMO((IIiIIiiiiIiiI)this.IIiiIiiiIIiIi)[1].ALLATORIxDEMO();
            if (IiiiiiiiIIIII10 < 100L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u552e\u5356\u6570\u91cf\u6700\u5c11\u4e3a100");
                return;
            }
            if (IiiiiiiiIIIII11 < 100L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ef7\u683c\u4e0d\u80fd\u4e3a\u96f6");
                return;
            }
            String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"exchange", (String)("S0" + IiiiiiiiIIIII11 + "|" + IiiiiiiiIIIII10));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII12);
            return;
        }
        if (id == 190) {
            IiIIiiiiiIiiI IiiiiiiiIIIII13 = (IiIIiiiiiIiiI)data;
            if (this.IiiiiiiiIIIII != 1) return;
            if (IiIIiiiiiIiiI.ALLATORIxDEMO((IiIIiiiiiIiiI)IiiiiiiiIIIII13) == 0L) {
                return;
            }
            String IiiiiiiiIIIII14 = Agreement.getSendTextAES((String)"exchange", (String)("S1" + IiIIiiiiiIiiI.ALLATORIxDEMO((IiIIiiiiiIiiI)IiiiiiiiIIIII13)));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII14);
            return;
        }
        if (id == 191 || id == 192) {
            long IiiiiiiiIIIII15 = iiiiIiiiIiIii.ALLATORIxDEMO((iiiiIiiiIiIii)this.ALLATORIxDEMO)[id == 191 ? 0 : 1].ALLATORIxDEMO();
            if (IiiiiiiiIIIII15 <= 0L) {
                return;
            }
            SummonPetBean IiiiiiiiIIIII16 = new SummonPetBean();
            IiiiiiiiIIIII16.setOpertype(id == 191 ? 3 : 4);
            IiiiiiiiIIIII16.setPetid(new BigDecimal(IiiiiiiiIIIII15));
            String IiiiiiiiIIIII17 = Agreement.getSendTextAES((String)"summonpet", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII16));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII17);
            return;
        }
        if (id != 193) {
            if (id != 194) return;
        }
        if ((IiiiiiiiIIIII = IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.iIiiIiiiiiiII)) == null) {
            return;
        }
        if (IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.iIiiIiiiiiiII) != 0L && IIIiIiiiiiiiI.ALLATORIxDEMO((IIIiIiiiiiiiI)this.iIiiIiiiiiiII) > this.ALLATORIxDEMO().getLoginResult().getGold().longValue()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
            return;
        }
        if (!this.iIiiIiiiiiiII.ALLATORIxDEMO()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fbe\u4e0d\u5230\u5408\u6210\u6761\u4ef6");
            return;
        }
        SummonPetBean IiiiiiiiIIIII18 = new SummonPetBean();
        IiiiiiiiIIIII18.setOpertype(5);
        IiiiiiiiIIIII18.setPetid(new BigDecimal(IiiiiiiiIIIII.geteId()));
        IiiiiiiiIIIII18.setGoodid(new BigDecimal(id == 193 ? 1 : 99));
        String IiiiiiiiIIIII19 = Agreement.getSendTextAES((String)"summonpet", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII18));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII19);
    }
}
