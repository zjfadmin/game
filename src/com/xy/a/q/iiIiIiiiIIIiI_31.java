/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.NpcComposeBean
 *  com.xy.bean.SuitOperBean
 *  com.xy.formula.GoodType
 *  com.xy.formula.MsgUntil
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIIIIiiiIiIii
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.bean.NpcComposeBean;
import com.xy.bean.SuitOperBean;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIIIIiiiIiIii;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class iiIiIiiiIIIiI
extends IiiiIiiiiIiIi {
    private IIiiIiiiIiiiI[] iiIiIiiiiIIIi;
    private String iiiiIiiiIiiII;
    private IiiiiiiiiIIII iiiIiiiiiiiIi;
    private BigDecimal iIiiIiiiiiiII = new BigDecimal(100000);
    private IIIiiiiiIiIiI[] IIiiIiiiIIiIi;
    private iiIiIiiiiIiIi iIiIiiiiIiIii;
    private iIIiIiiiIiiIi IiIIIiiiiIiiI;
    private JLabel[] iiIiiiiiiiIii;
    private com.xy.q.IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private iiiiiiiiiiIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiii(Goodstable good) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            if (this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO() == 1) {
                Goodstable IiiiiiiiIIIII2 = (Goodstable)this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO();
                if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)good.getRgid(), (BigDecimal)IiiiiiiiIIIII2.getRgid())) {
                    if (good.getUsetime() > 0) {
                        this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(1, (Object)good);
                    } else {
                        this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
                    }
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public boolean iIiIiiiiIIiii(Goodstable good1, Goodstable good2) {
        int IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)good1.getValue());
        int IiiiiiiiIIIII2 = MsgUntil.getGoodLvl((String)good2.getValue());
        if (this.ALLATORIxDEMO().gameType == 2 && !this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
            if (IiiiiiiiIIIII2 < 6) {
                if (IiiiiiiiIIIII >= 11) return false;
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9700\u8981\u4f7f\u7528\u66f4\u9ad8\u7ea7\u7684\u77ff\u77f3");
                return true;
            }
            int IiiiiiiiIIIII3 = 5 + IiiiiiiiIIIII2;
            if (IiiiiiiiIIIII < 11 && IiiiiiiiIIIII3 == 11) {
                return false;
            }
            if (IiiiiiiiIIIII >= 11) {
                if (IiiiiiiiIIIII == IiiiiiiiIIIII3) return false;
                if (IiiiiiiiIIIII + 1 == IiiiiiiiIIIII3) {
                    return false;
                }
            }
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9700\u8981\u4f7f\u7528\u5bf9\u5e94\u7b49\u7ea7\u7684\u77ff\u77f3\u6765\u5347\u7ea7\u6216\u8005\u91cd\u94f8");
            return true;
        }
        if (IiiiiiiiIIIII < 10) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u90201-10\u7ea7\u88c5\u5907\u53bb\u957f\u5b89\u57ce\u6253\u94c1\u94fa\u627e\u51af\u94c1\u5320!");
            return true;
        }
        boolean IiiiiiiiIIIII4 = false;
        if (IiiiiiiiIIIII >= 10 && IiiiiiiiIIIII <= 13) {
            if (IiiiiiiiIIIII2 != 8 && IiiiiiiiIIIII2 != 9) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u902011-14\u7ea7\u88c5\u5907\u4f7f\u75289\u7ea7\u77ff\u77f3!");
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f810-13\u7ea7\u88c5\u5907\u4f7f\u75288\u7ea7\u77ff\u77f3!");
                return true;
            }
            if (IiiiiiiiIIIII2 != 9) return false;
            IiiiiiiiIIIII4 = true;
        } else if (IiiiiiiiIIIII == 14) {
            if (IiiiiiiiIIIII2 != 9 && IiiiiiiiIIIII2 != 10) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u902015\u7ea7\u88c5\u5907\u4f7f\u752810\u7ea7\u77ff\u77f3!");
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f814\u7ea7\u88c5\u5907\u4f7f\u75289\u7ea7\u77ff\u77f3!");
                return true;
            }
            if (IiiiiiiiIIIII2 != 10) return false;
            IiiiiiiiIIIII4 = true;
        } else if (IiiiiiiiIIIII == 15) {
            if (IiiiiiiiIIIII2 != 10 && IiiiiiiiIIIII2 != 11) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u902016\u7ea7\u88c5\u5907\u4f7f\u752811\u7ea7\u77ff\u77f3!");
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f815\u7ea7\u88c5\u5907\u4f7f\u752810\u7ea7\u77ff\u77f3!");
                return true;
            }
            if (IiiiiiiiIIIII2 != 11) return false;
            IiiiiiiiIIIII4 = true;
        } else {
            if (IiiiiiiiIIIII == 16) {
                if (IiiiiiiiIIIII2 == 11) return false;
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91cd\u94f816\u7ea7\u88c5\u5907\u4f7f\u752811\u7ea7\u77ff\u77f3!");
                return true;
            }
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9519\u8bef\u516c\u5f0f");
            return true;
        }
        return false;
    }

    public void iIiIiiiiIIiIi() {
        int IiiiiiiiIIIII = 1 + this.ALLATORIxDEMO().goodPacks.length / 24;
        if (this.iiIiIiiiiIIIi != null) {
            if (this.iiIiIiiiiIIIi.length == IiiiiiiiIIIII) return;
        }
        this.iiIiIiiiiIIIi = this.ALLATORIxDEMO(this.iiIiIiiiiIIIi, IiiiiiiiIIIII, this.ALLATORIxDEMO.ALLATORIxDEMO());
        int IiiiiiiiIIIII2 = 356;
        int IiiiiiiiIIIII3 = 158;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iiIiIiiiiIIIi.length) {
            IIiiIiiiIiiiI iIiiIiiiIiiiI = this.iiIiIiiiiIIIi[IiiiiiiiIIIII4];
            int n = IiiiiiiiIIIII3 + IiiiiiiiIIIII4 * 35;
            ++IiiiiiiiIIIII4;
            iIiiIiiiIiiiI.setBounds(IiiiiiiiIIIII2, n, 36, 33);
        }
        this.ALLATORIxDEMO.ALLATORIxDEMO(this.iiIiIiiiiIIIi, 0);
    }

    public iiIiIiiiIIIiI(GameView gameView) {
        super(26, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 402, 393, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6253\u9020");
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII("sc/e/31.png", 1, 72, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u6253 \u9020", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(298, 115, 79, 25);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)263, (int)45, (int)114, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, null, (GameView)gameView);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(2);
        this.iIiIiiiiIiIii.setText("0");
        this.iIiIiiiiIiIii.setBounds(263, 80, 114, 19);
        MoneyType IiiiiiiiIIIII = new MoneyType();
        IiiiiiiiIIIII.setId(1);
        IiiiiiiiIIIII.setKey("\u73b0\u91d1");
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.add((Component)this.iIiIiiiiIiIii);
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIIIiiiiIiiI, (long)this.iIiiIiiiiiiII.longValue());
        this.iiIiiiiiiiIii = new JLabel[4];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)46, (int)(32 + 26 * IiiiiiiiIIIII2), (int)36, (int)19, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setText(IiiiiiiiIIIII2 == 0 ? "" : (IiiiiiiiIIIII2 == 1 ? "" : (IiiiiiiiIIIII2 == 2 ? "\u6240\u9700\u91d1\u989d" : (IiiiiiiiIIIII2 == 3 ? "\u73b0 \u91d1" : ""))));
            this.add(this.iiIiiiiiiiIii[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII2 == 0) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setBounds(53, 38, 57, 21);
            } else if (IiiiiiiiIIIII2 == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setBounds(127, 38, 62, 21);
            } else if (IiiiiiiiIIIII2 >= 2 && IiiiiiiiIIIII2 <= 3) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setForeground(iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
                if (IiiiiiiiIIIII2 == 2) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setBounds(190, 45, 72, 19);
                } else if (IiiiiiiiIIIII2 == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII2].setBounds(215, 80, 48, 19);
                }
            }
            ++IiiiiiiiIIIII2;
        }
        this.IiiiiiiiIIIII = new com.xy.q.IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII2] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII2].setBounds(56 + 76 * IiiiiiiiIIIII2, 61, 50, 50);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII2++]);
        }
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII2] = new IIIiiiiiIiIiI();
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII2]);
            if (IiiiiiiiIIIII2 >= 0 && IiiiiiiiIIIII2 <= 1) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII2 == 0) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].setBounds(53, 38, 57, 21);
                } else if (IiiiiiiiIIIII2 == 1) {
                    this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].setBounds(127, 38, 62, 21);
                }
            }
            if (IiiiiiiiIIIII2 >= 2 && IiiiiiiiIIIII2 <= 3) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/30.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].setBounds(54 + 76 * (IiiiiiiiIIIII2 - 2), 59, 55, 1);
            }
            if (IiiiiiiiIIIII2 >= 4 && IiiiiiiiIIIII2 <= 5) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/4.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].setBounds(52 + 76 * (IiiiiiiiIIIII2 - 4), 57, 59, 57);
            }
            if (IiiiiiiiIIIII2 >= 6 && IiiiiiiiIIIII2 <= 7) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].iIiIiiiiIIiii("sc/d/30.png");
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].setBounds(53 + 76 * (IiiiiiiiIIIII2 - 6), 114, 58, 1);
            }
            if (IiiiiiiiIIIII2 == 8) {
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.IIiiIiiiIIiIi[IiiiiiiiIIIII2].setBounds(47, 158, 309, 207);
            }
            ++IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO = new iiiiiiiiiiIiI((IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 48, 160);
        this.ALLATORIxDEMO.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.ALLATORIxDEMO.iIiIiiiiIIiii(true);
        this.add((Component)this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u5408\u6210\u4ed9\u5668")) {
            if (good.getType() == 7099L) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.iiiIIiiiiIIii((long)good.getType())) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u5347\u7ea7\u4ed9\u5668")) {
            if (good.getType() == 7099L) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.IIIiiiiiiiiII((long)good.getType())) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u6d17\u70bc\u4ed9\u5668")) {
            if (GoodType.iiiIIiiiiIIii((long)good.getType())) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (good.getType() != 212L) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6253\u902011-16\u7ea7\u88c5\u5907") || this.iiiiIiiiIiiII.equals("\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907")) {
            if (GoodType.iiiiIiiiIIIiI((long)good.getType())) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.IIIiiiiiiiiII((long)good.getType())) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u5347\u7ea7\u795e\u5175")) {
            if (GoodType.IIIIIiiiiIIii((long)good.getType())) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.IIIiiiiiiiiII((long)good.getType())) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3")) {
            if (!GoodType.IiiIiiiiiiIiI((long)good.getType())) return;
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12) && IIiiIiiiiIIiI.ALLATORIxDEMO((String)good.getValue(), (String)"\u7b49\u7ea7=", (String)"|") >= 10) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u70bc\u5996\u77f3\u6700\u9ad810\u7ea7");
                return;
            }
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (IiiiiiiiIIIII == good) return;
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)"\u7b49\u7ea7=", (String)"|") != IIiiIiiiiIIiI.ALLATORIxDEMO((String)good.getValue(), (String)"\u7b49\u7ea7=", (String)"|")) {
                return;
            }
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u57f9\u517b\u9970\u54c1")) {
            if (good.getType() == 1008L) {
                this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.iIiIiiiiIIiIi((long)good.getType())) return;
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (IiiiiiiiIIIII == good) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u91cd\u94f8\u9970\u54c1")) {
            if (GoodType.iIiIiiiiIIiIi((long)good.getType())) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.IIIiiiiiiiiII((long)good.getType())) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u4e0a\u795e\u5175\u77f3")) {
            if (GoodType.IIIIIiiiiIIii((long)good.getType())) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (good.getType() != 191L) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u57f9\u517b\u62a4\u8eab\u7b26")) {
            if (!GoodType.iiiiiiiiIIiii((long)good.getType())) return;
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (IiiiiiiiIIIII == good) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u91cd\u94f8\u62a4\u8eab\u7b26")) {
            if (GoodType.iiiiiiiiIIiii((long)good.getType())) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.IIIiiiiiiiiII((long)good.getType())) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u70bc\u5316\u4ed9\u5668")) {
            if (good.getType() == 7005L) {
                this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (!GoodType.iiiIIiiiiIIii((long)good.getType())) return;
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (IiiiiiiiIIIII == good) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u57f9\u517b\u5f69\u6676\u77f3")) {
            if (good.getType() != 729L) return;
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (IiiiiiiiIIIII == good) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u7cbe\u70bc\u795e\u5175")) {
            if (!GoodType.IIIIIiiiiIIii((long)good.getType())) return;
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (IiiiiiiiIIIII == good) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u5408\u6210")) {
            if (good.getType() != 700L) return;
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
                return;
            }
            if (IiiiiiiiIIIII == good) return;
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (!this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u9576\u5d4c")) {
            if (!this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u8ffd\u52a0")) return;
        }
        if (GoodType.iiiiIiiiIIIiI((long)good.getType())) {
            this.IiiiiiiiIIIII[0].ALLATORIxDEMO(1, (Object)good);
            return;
        }
        if (good.getType() != 700L) return;
        this.IiiiiiiiIIIII[1].ALLATORIxDEMO(1, (Object)good);
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi() {
        block62: {
            block71: {
                block70: {
                    block69: {
                        block68: {
                            block67: {
                                block66: {
                                    block65: {
                                        block64: {
                                            block63: {
                                                block61: {
                                                    if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                                                        return;
                                                    }
                                                    IiiiiiiiIIIII = this.ALLATORIxDEMO();
                                                    if (IiiiiiiiIIIII.getLoginResult().getGold().longValue() < this.iIiiIiiiiiiII.longValue()) {
                                                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u91d1\u94b1\u4e0d\u8db3");
                                                        return;
                                                    }
                                                    IiiiiiiiIIIII = 0;
                                                    while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
                                                        IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO();
                                                        if (IiiiiiiiIIIII != null) {
                                                            IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
                                                        }
                                                        if (IiiiiiiiIIIII == null || IiiiiiiiIIIII.getStatus() != 0) {
                                                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u51d1\u9f50\u7269\u54c1\u518d\u6765");
                                                            return;
                                                        }
                                                        if (IiiiiiiiIIIII.getGoodlock() == 1) {
                                                            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u7269\u54c1\u5df2\u88ab\u52a0\u9501");
                                                            return;
                                                        }
                                                        if (GoodType.ALLATORIxDEMO((long)IiiiiiiiIIIII.getType()) != -1) {
                                                            if (GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[3]) != null) {
                                                                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5957\u88c5\u65e0\u6cd5\u7528\u4e8e\u6253\u9020\u7cfb\u5217");
                                                                return;
                                                            }
                                                            if (GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[4]) != null || IiiiiiiiIIIII.getQhv() != null && IiiiiiiiIIIII.getQhv() > 0) {
                                                                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5df2\u9576\u5d4c\u5b9d\u77f3\u65e0\u6cd5\u7528\u4e8e\u6253\u9020\u7cfb\u5217");
                                                                return;
                                                            }
                                                        }
                                                        ++IiiiiiiiIIIII;
                                                    }
                                                    IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[0].ALLATORIxDEMO();
                                                    IiiiiiiiIIIII = (Goodstable)this.IiiiiiiiIIIII[1].ALLATORIxDEMO();
                                                    if (IiiiiiiiIIIII != null) {
                                                        IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                                                    }
                                                    if (IiiiiiiiIIIII != null) {
                                                        IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                                                    }
                                                    if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u5408\u6210\u4ed9\u5668")) break block61;
                                                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                                                    if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII >= 6) {
                                                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6700\u9ad8\u5408\u6210\u516d\u9636\u4ed9\u5668");
                                                        return;
                                                    }
                                                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                                                    if (IiiiiiiiIIIII == IiiiiiiiIIIII) {
                                                        IiiiiiiiIIIII = Pattern.compile("\u7075\u6c14=(.*?)\u70b9");
                                                        IiiiiiiiIIIII = IiiiiiiiIIIII.matcher(IiiiiiiiIIIII.getValue());
                                                        v0 = IiiiiiiiIIIII = IiiiiiiiIIIII.find() != false ? Integer.parseInt(IiiiiiiiIIIII.group(1)) : 0;
                                                        v1 = IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2 ? 8 : (IiiiiiiiIIIII == 3 ? 6 : (IiiiiiiiIIIII = IiiiiiiiIIIII == 4 ? 5 : 3));
                                                        if (IiiiiiiiIIIII >= IiiiiiiiIIIII) {
                                                            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u74f6\u5b50\u7075\u6c14\u5df2\u6ee1");
                                                            return;
                                                        }
                                                        if (GoodType.IiiIiiiiIiiiI((long)IiiiiiiiIIIII.getQuality()) != GoodType.IiiIiiiiIiiiI((long)IiiiiiiiIIIII.getQuality())) {
                                                            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u7ed1\u5b9a\u548c\u4e0d\u7ed1\u5b9a\u4e0d\u80fd\u6df7\u5408");
                                                            return;
                                                        }
                                                    } else if (IiiiiiiiIIIII != 0) {
                                                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9636\u6570\u4e0d\u76f8\u540c");
                                                        return;
                                                    }
                                                    break block62;
                                                }
                                                if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u5347\u7ea7\u4ed9\u5668")) break block63;
                                                IiiiiiiiIIIII = IiiiiiiiIIIII.getValue();
                                                if (IiiiiiiiIIIII == null || IiiiiiiiIIIII.equals("")) {
                                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8fd9\u662f\u7a7a\u74f6\u5b50");
                                                    return;
                                                }
                                                IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII);
                                                IiiiiiiiIIIII = Pattern.compile("\u7075\u6c14=(.*?)\u70b9");
                                                IiiiiiiiIIIII = IiiiiiiiIIIII.matcher(IiiiiiiiIIIII.getValue());
                                                v2 = IiiiiiiiIIIII = IiiiiiiiIIIII.find() != false ? Integer.parseInt(IiiiiiiiIIIII.group(1)) : 0;
                                                v3 = IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2 ? 8 : (IiiiiiiiIIIII == 3 ? 6 : (IiiiiiiiIIIII = IiiiiiiiIIIII == 4 ? 5 : 3));
                                                if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u74f6\u5b50\u7075\u6c14\u672a\u6ee1");
                                                    return;
                                                }
                                                IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                                                if (IiiiiiiiIIIII + 5 != IiiiiiiiIIIII) {
                                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii(String.valueOf(MsgUntil.iIiIiiiiIIiii((int)IiiiiiiiIIIII)) + "\u9636\u4ed9\u5668\u4f7f\u7528" + (IiiiiiiiIIIII + 5) + "\u7ea7\u77ff\u77f3\u5347\u7ea7");
                                                    return;
                                                }
                                                if (IiiiiiiiIIIII >= 6) {
                                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u652f\u6301\u516d\u9636\u4ed9\u5668\u5347\u7ea7!");
                                                    return;
                                                }
                                                break block62;
                                            }
                                            if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u6d17\u70bc\u4ed9\u5668")) break block62;
                                            if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907")) break block64;
                                            if (this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                                                return;
                                            }
                                            break block62;
                                        }
                                        if (!this.iiiiIiiiIiiII.equals("\u6253\u902011-16\u7ea7\u88c5\u5907")) break block65;
                                        if (this.iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                                            return;
                                        }
                                        break block62;
                                    }
                                    if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u5347\u7ea7\u795e\u5175")) break block66;
                                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                                    if (IiiiiiiiIIIII < 1 || IiiiiiiiIIIII > 5) {
                                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u652f\u63016\u7ea7\u795e\u5175\u5347\u7ea7!");
                                        return;
                                    }
                                    if (IiiiiiiiIIIII + 5 != IiiiiiiiIIIII) {
                                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII) + "\u7ea7\u795e\u5175\u4f7f\u7528" + (IiiiiiiiIIIII + 5) + "\u7ea7\u77ff\u77f3\u5347\u7ea7");
                                        return;
                                    }
                                    break block62;
                                }
                                if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3")) break block62;
                                if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u57f9\u517b\u9970\u54c1")) break block67;
                                if (GoodType.iIiIiiiiIIiIi((long)IiiiiiiiIIIII.getType())) {
                                    if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
                                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u526f\u914d\u9970\u53ea\u5141\u8bb8\u4f7f\u7528\u914d\u9970\u7cbe\u534e");
                                        return;
                                    }
                                    if (MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue()) >= 2) {
                                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u526f\u914d\u9970\u5df2\u7ecf\u8fbe\u52302\u7ea7\u4ee5\u4e0a");
                                        return;
                                    }
                                }
                                if (MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue()) > 6) {
                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5df2\u8fbe\u5230\u6700\u9ad8\u914d\u9970\u7b49\u7ea7");
                                    return;
                                }
                                if (IiiiiiiiIIIII.getValue().indexOf("\u57f9\u517b=") == -1) {
                                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u914d\u9970\u65e0\u6cd5\u57f9\u517b");
                                    return;
                                }
                                break block62;
                            }
                            if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u91cd\u94f8\u9970\u54c1")) break block68;
                            this.iiiiIiiiIiiII = "\u4f69\u9970\u91cd\u94f8";
                            IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                            if (IiiiiiiiIIIII + 3 != (IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue()))) {
                                this.iiIIiiiiIiIIi.iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII) + "\u7ea7\u9970\u54c1\u4f7f\u7528" + (IiiiiiiiIIIII + 3) + "\u7ea7\u77ff\u77f3\u91cd\u94f8");
                                return;
                            }
                            if (IIIIIiiiIiIii.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[8], (String)"|") != null) {
                                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u914d\u9970\u5df2\u6709\u70b9\u7cb9\u5c5e\u6027\u65e0\u6cd5\u91cd\u94f8");
                                return;
                            }
                            if (IIIIIiiiIiIii.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)GoodType.Extras[3], (String)"|") != null) {
                                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u914d\u9970\u5df2\u6709\u5957\u88c5\u5c5e\u6027\u65e0\u6cd5\u91cd\u94f8");
                                return;
                            }
                            break block62;
                        }
                        if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u4e0a\u795e\u5175\u77f3")) break block69;
                        if (IiiiiiiiIIIII.getValue().indexOf("\u795e\u5175\u5c5e\u6027") != -1) {
                            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u795e\u5175\u5df2\u6709\u795e\u5175\u5c5e\u6027");
                            return;
                        }
                        break block62;
                    }
                    if (!this.iiiiIiiiIiiII.equals("\u6211\u8981\u57f9\u517b\u62a4\u8eab\u7b26")) break block70;
                    IiiiiiiiIIIII = (int)IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)"\u54c1\u8d28=", (String)"|");
                    IiiiiiiiIIIII = 800;
                    IiiiiiiiIIIII = GoodType.getExtra((String)IiiiiiiiIIIII.getValue(), (String)"\u70bc\u5316\u5c5e\u6027");
                    if (IiiiiiiiIIIII == null) break block71;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.split("&");
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl194
                }
                if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u91cd\u94f8\u62a4\u8eab\u7b26")) {
                    IiiiiiiiIIIII = (int)IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue(), (String)"\u54c1\u8d28=", (String)"|");
                    if (IiiiiiiiIIIII < 300) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u62a4\u8eab\u7b26\u54c1\u8d28\u9ad8\u4e8e300\u624d\u80fd\u91cd\u94f8");
                        return;
                    }
                    IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                    if (IiiiiiiiIIIII != 9 && IiiiiiiiIIIII != 10) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u62a4\u8eab\u7b26\u91cd\u94f8\u4f7f\u75289\u7ea7\u77ff\u77f3");
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u62a4\u8eab\u7b26\u5347\u7ea7\u4f7f\u752810\u7ea7\u77ff\u77f3");
                        return;
                    }
                    if (IiiiiiiiIIIII == 10 && MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue()) > (this.ALLATORIxDEMO().IiiIiiiiiiIiI() != false ? 8 : 6)) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u62a4\u8eab\u7b26\u7b49\u7ea7\u6700\u9ad8\u4e3a" + (this.ALLATORIxDEMO().IiiIiiiiiiIiI() != false ? 9 : 7) + "\u7ea7");
                        return;
                    }
                } else if (this.iiiiIiiiIiiII.equals("\u70bc\u5316\u4ed9\u5668")) {
                    v4 = IiiiiiiiIIIII = IiiiiiiiIIIII.getType() == 7005L ? GoodType.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue())[1] : GoodType.ALLATORIxDEMO((String)IiiiiiiiIIIII.getValue())[0];
                    if (!IiiiiiiiIIIII.equals("\u9636\u6570=1")) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f7f\u7528\u4e00\u9636\u4f5c\u4e3a\u70bc\u5316\u6750\u6599\u592a\u6389\u4ef7\u4e86\u5417?");
                        return;
                    }
                } else if (!this.iiiiIiiiIiiII.equals("\u57f9\u517b\u5f69\u6676\u77f3")) {
                    if (this.iiiiIiiiIiiII.equals("\u7cbe\u70bc\u795e\u5175")) {
                        IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                        IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)IiiiiiiiIIIII.getValue());
                        if (IiiiiiiiIIIII < 1 || IiiiiiiiIIIII > 5) {
                            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4e0d\u652f\u63016\u7ea7\u795e\u5175\u5347\u7ea7!");
                            return;
                        }
                        if (IiiiiiiiIIIII <= 3) {
                            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("4\u7ea7\u53ca\u4ee5\u4e0a\u7684\u795e\u5175\u624d\u53ef\u4ee5\u7cbe\u7ec3");
                            return;
                        }
                        if (IiiiiiiiIIIII > 3) {
                            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u75283\u7ea7\u4ee5\u4e0b\u7684\u795e\u5175\u7cbe\u7ec3");
                            return;
                        }
                    } else if (!this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u5408\u6210") && !this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u9576\u5d4c")) {
                        this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u8ffd\u52a0");
                    }
                }
                break block62;
                block1: do {
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("="))[0].equals("\u7279\u6280")) {
                        IiiiiiiiIIIII = 1;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                            if (IiiiiiiiIIIII[IiiiiiiiIIIII].equals("8031")) {
                                IiiiiiiiIIIII = 900;
                                break block1;
                            }
                            ++IiiiiiiiIIIII;
                        }
                    }
                    ++IiiiiiiiIIIII;
lbl194:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            if (IiiiiiiiIIIII > IiiiiiiiIIIII) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u62a4\u8eab\u7b26\u54c1\u8d28\u5927\u4e8e" + IiiiiiiiIIIII + "\u540e\u65e0\u6cd5\u57f9\u517b");
                return;
            }
        }
        if (this.iiiiIiiiIiiII.equals("\u6211\u8981\u5347\u7ea7\u795e\u5175") || this.iiiiIiiiIiiII.equals("\u7cbe\u70bc\u795e\u5175")) {
            IiiiiiiiIIIII.getLoginResult().setGold(IiiiiiiiIIIII.getLoginResult().getGold().subtract(this.iIiiIiiiiiiII));
            IiiiiiiiIIIII = new SuitOperBean();
            IiiiiiiiIIIII.setType(16);
            IiiiiiiiIIIII = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
            IiiiiiiiIIIII.setUsetime(Integer.valueOf(0));
            IiiiiiiiIIIII.ALLATORIxDEMO(1);
            if (IiiiiiiiIIIII.getUsetime() <= 0) {
                IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(0, null);
            }
            if (IiiiiiiiIIIII.getUsetime() <= 0) {
                IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                this.IiiiiiiiIIIII[1].ALLATORIxDEMO(0, null);
            }
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
            return;
        }
        if (this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u5408\u6210") || this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u9576\u5d4c") || this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u8ffd\u52a0")) {
            IiiiiiiiIIIII = new SuitOperBean();
            IiiiiiiiIIIII.setType(this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u5408\u6210") != false ? 121 : (this.iiiiIiiiIiiII.equals("\u5b9d\u77f3\u9576\u5d4c") != false ? 122 : 123));
            IiiiiiiiIIIII = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
            IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII);
            IiiiiiiiIIIII = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
            this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
            return;
        }
        if (!ParamTool.ALLATORIxDEMO((long)this.iIiiIiiiiiiII.longValue(), (GameView)this.iiIIiiiiIiIIi)) {
            return;
        }
        IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
        IiiiiiiiIIIII.add(IiiiiiiiIIIII.getRgid());
        IiiiiiiiIIIII.setUsetime(Integer.valueOf(0));
        IiiiiiiiIIIII.ALLATORIxDEMO(1);
        if (IiiiiiiiIIIII.getUsetime() <= 0) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            this.IiiiiiiiIIIII[0].ALLATORIxDEMO(0, null);
        }
        if (IiiiiiiiIIIII.getUsetime() <= 0) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
            this.IiiiiiiiIIIII[1].ALLATORIxDEMO(0, null);
        }
        IiiiiiiiIIIII = new NpcComposeBean();
        IiiiiiiiIIIII.setComposetype(this.iiiiIiiiIiiII);
        IiiiiiiiIIIII.setGoodstables(IiiiiiiiIIIII);
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"npccompose", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO((String)IiiiiiiiIIIII);
    }

    public void iIiIiiiiIIiIi(String type) {
        this.iiiiIiiiIiiII = type;
        if (type.equals("\u6211\u8981\u70bc\u5668")) {
            this.iiIiiiiiiiIii[0].setText("\u4ed9\u5668");
            this.iiIiiiiiiiIii[1].setText("\u6750\u6599");
            this.iiiIiiiiiiiIi.setText("\u70bc \u5668");
        } else if (type.equals("\u6211\u8981\u57f9\u517b\u9970\u54c1")) {
            this.iiIiiiiiiiIii[0].setText("\u4e3b\u9970\u54c1");
            this.iiIiiiiiiiIii[1].setText("\u526f\u9970\u54c1");
            this.iiiIiiiiiiiIi.setText("\u57f9 \u517b");
        } else if (type.equals("\u6211\u8981\u91cd\u94f8\u9970\u54c1")) {
            this.iiIiiiiiiiIii[0].setText("\u9970\u54c1");
            this.iiIiiiiiiiIii[1].setText("\u77ff\u77f3");
            this.iiiIiiiiiiiIi.setText("\u91cd \u94f8");
        } else if (type.equals("\u5b9d\u77f3\u5408\u6210")) {
            this.iiIiiiiiiiIii[0].setText("\u5b9d\u77f3");
            this.iiIiiiiiiiIii[1].setText("\u5b9d\u77f3");
            this.iiiIiiiiiiiIi.setText("\u5408 \u6210");
        } else if (type.equals("\u5b9d\u77f3\u9576\u5d4c") || type.equals("\u5b9d\u77f3\u8ffd\u52a0")) {
            this.iiIiiiiiiiIii[0].setText("\u88c5\u5907");
            this.iiIiiiiiiiIii[1].setText("\u5b9d\u77f3");
            this.iiiIiiiiiiiIi.setText("\u9576 \u5d4c");
        } else if (type.equals("\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907") || type.equals("\u6253\u902011-16\u7ea7\u88c5\u5907")) {
            this.iiIiiiiiiiIii[0].setText("\u88c5\u5907");
            this.iiIiiiiiiiIii[1].setText("\u77ff\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u5347\u7ea7\u795e\u5175")) {
            this.iiIiiiiiiiIii[0].setText("\u795e\u5175");
            this.iiIiiiiiiiIii[1].setText("\u77ff\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u4e0a\u795e\u5175\u77f3")) {
            this.iiIiiiiiiiIii[0].setText("\u795e\u5175");
            this.iiIiiiiiiiIii[1].setText("\u795e\u5175\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u7cbe\u70bc\u795e\u5175")) {
            this.iiIiiiiiiiIii[0].setText("\u4e3b\u795e\u5175");
            this.iiIiiiiiiiIii[1].setText("\u526f\u795e\u5175");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3")) {
            this.iiIiiiiiiiIii[0].setText("\u70bc\u5996\u77f3");
            this.iiIiiiiiiiIii[1].setText("\u70bc\u5996\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u5408\u6210\u4ed9\u5668")) {
            this.iiIiiiiiiiIii[0].setText("\u516b\u8352\u9057\u98ce");
            this.iiIiiiiiiiIii[1].setText("\u4ed9\u5668");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u5347\u7ea7\u4ed9\u5668")) {
            this.iiIiiiiiiiIii[0].setText("\u516b\u8352\u9057\u98ce");
            this.iiIiiiiiiiIii[1].setText("\u77ff\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u6d17\u70bc\u4ed9\u5668")) {
            this.iiIiiiiiiiIii[0].setText("\u4ed9\u5668");
            this.iiIiiiiiiiIii[1].setText("\u6094\u68a6\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u57f9\u517b\u62a4\u8eab\u7b26")) {
            this.iiIiiiiiiiIii[0].setText("\u62a4\u8eab\u7b26");
            this.iiIiiiiiiiIii[1].setText("\u62a4\u8eab\u7b26");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u6211\u8981\u91cd\u94f8\u62a4\u8eab\u7b26")) {
            this.iiIiiiiiiiIii[0].setText("\u62a4\u8eab\u7b26");
            this.iiIiiiiiiiIii[1].setText("\u77ff\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else if (type.equals("\u57f9\u517b\u5f69\u6676\u77f3")) {
            this.iiIiiiiiiiIii[0].setText("\u5f69\u6676\u77f3");
            this.iiIiiiiiiiIii[1].setText("\u5f69\u6676\u77f3");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        } else {
            this.iiIiiiiiiiIii[0].setText("\u7269\u54c1");
            this.iiIiiiiiiiIii[1].setText("\u7269\u54c1");
            this.iiiIiiiiiiiIi.setText("\u6253 \u9020");
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.IiiiiiiiIIIII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            iIIiiiiiIiIiI.ALLATORIxDEMO(0, null);
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi();
        super.iIiIiiiiIIiii();
    }

    public boolean ALLATORIxDEMO(Goodstable good1, Goodstable good2) {
        int IiiiiiiiIIIII = MsgUntil.getGoodLvl((String)good1.getValue());
        int IiiiiiiiIIIII2 = MsgUntil.getGoodLvl((String)good2.getValue());
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
            if (IiiiiiiiIIIII2 <= 9) {
                return false;
            }
        } else if (this.ALLATORIxDEMO().gameType == 2) {
            if (IiiiiiiiIIIII2 < 6) {
                if (IiiiiiiiIIIII >= 11) return false;
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9700\u8981\u4f7f\u7528\u66f4\u9ad8\u7ea7\u7684\u77ff\u77f3");
                return true;
            }
            int IiiiiiiiIIIII3 = 5 + IiiiiiiiIIIII2;
            if (IiiiiiiiIIIII < 11 && IiiiiiiiIIIII3 == 11) {
                return false;
            }
            if (IiiiiiiiIIIII >= 11) {
                if (IiiiiiiiIIIII == IiiiiiiiIIIII3) return false;
                if (IiiiiiiiIIIII + 1 == IiiiiiiiIIIII3) {
                    return false;
                }
            }
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u9700\u8981\u4f7f\u7528\u5bf9\u5e94\u7b49\u7ea7\u7684\u77ff\u77f3\u6765\u5347\u7ea7\u6216\u8005\u91cd\u94f8");
            return true;
        }
        if (IiiiiiiiIIIII >= 10) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u902011-16\u7ea7\u88c5\u5907\u53bb\u957f\u5b89\u6865\u5934!");
            return true;
        }
        if (IiiiiiiiIIIII2 <= 9) return false;
        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u6253\u90201-10\u7ea7\u88c5\u5907\u6700\u9ad8\u53ea\u80fd\u4f7f\u75289\u7ea7\u77ff\u77f3!");
        return true;
    }
}
