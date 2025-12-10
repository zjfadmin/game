/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiIIIiiiIIiIi
 *  com.xy.a.iiiIIiiiiiiii
 *  com.xy.bean.GangReward
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IiIIIiiiIIiIi;
import com.xy.a.iiiIIiiiiiiii;
import com.xy.bean.GangReward;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class iiiIiiiiIiIiI
extends IiiiIiiiiIiIi {
    private int iiIIIiiiiiiiI = 0;
    private iIIiIiiiIiiIi IiIiiiiiIIIII;
    private MoneyType iiIiIiiiiIIIi;
    private List<JLabel> iiiiIiiiIiiII;
    private IIIIIiiiIIIiI iiiIiiiiiiiIi;
    private List<GangReward> iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private iIIiIiiiIiiIi iIiIiiiiIiIii;
    public IiIIIiiiIIiIi[] IiIIIiiiiIiiI;
    private iiIiIiiiiIiIi iiIiiiiiiiIii;
    private JLabel[] IiiiiiiiIIIII;
    public static ImageIcon ALLATORIxDEMO = new ImageIcon("sc/b/B162.png");

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii(int index) {
        this.iiIIIiiiiiiiI = index;
        this.IiiIiiiiiiIiI();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(null);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].setBorder(null);
        }
        IiiiiiiiIIIII = this.iIiiIiiiiiiII.size() > (index + 1) * 24 ? 24 : this.iIiiIiiiiiiII.size() - index * 24;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII) {
            IiIIIiiiIIiIi iiIIIiiiIIiIi = this.IiIIIiiiiIiiI[IiiiiiiiIIIII2];
            int n = index * 24 + IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII2;
            iiIIIiiiIIiIi.ALLATORIxDEMO(this.iIiiIiiiiiiII.get(n));
        }
    }

    public void IiiIiiiiiiIiI() {
        int IiiiiiiiIIIII = (this.iIiiIiiiiiiII.size() - 1) / 24 + 1;
        if (this.iiiiIiiiIiiII == null) {
            this.iiiiIiiiIiiII = new ArrayList<JLabel>();
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII) {
            int IiiiiiiiIIIII3;
            if (IiiiiiiiIIIII2 >= 8) break;
            if (IiiiiiiiIIIII2 >= this.iiiiIiiiIiiII.size()) {
                if (IiiiiiiiIIIII > 8 && IiiiiiiiIIIII2 == 0) {
                    this.iiiiIiiiIiiII.add(this.ALLATORIxDEMO("首页", IiiiiiiiIIIII2));
                } else if (IiiiiiiiIIIII > 8 && IiiiiiiiIIIII2 == 7) {
                    this.iiiiIiiiIiiII.add(this.ALLATORIxDEMO("尾页", IiiiiiiiIIIII2));
                } else if (IiiiiiiiIIIII > 8) {
                    if (this.iiIIIiiiiiiiI == 0) {
                        this.iiiiIiiiIiiII.add(this.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII2), IiiiiiiiIIIII2));
                    } else if (this.iiIIIiiiiiiiI > IiiiiiiiIIIII - 5) {
                        IiiiiiiiIIIII3 = IiiiiiiiIIIII - 6;
                        this.iiiiIiiiIiiII.add(this.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII2 + IiiiiiiiIIIII3), IiiiiiiiIIIII2));
                    } else {
                        this.iiiiIiiiIiiII.add(this.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII2 + this.iiIIIiiiiiiiI - 1), IiiiiiiiIIIII2));
                    }
                } else {
                    this.iiiiIiiiIiiII.add(this.ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII2 + 1), IiiiiiiiIIIII2));
                }
            } else if (IiiiiiiiIIIII > 8 && IiiiiiiiIIIII2 == 0) {
                this.iiiiIiiiIiiII.get(IiiiiiiiIIIII2).setText("首页");
            } else if (IiiiiiiiIIIII > 8 && IiiiiiiiIIIII2 == 7) {
                this.iiiiIiiiIiiII.get(IiiiiiiiIIIII2).setText("尾页");
            } else if (IiiiiiiiIIIII > 8) {
                if (this.iiIIIiiiiiiiI == 0) {
                    this.iiiiIiiiIiiII.get(IiiiiiiiIIIII2).setText(String.valueOf(IiiiiiiiIIIII2));
                } else if (this.iiIIIiiiiiiiI > IiiiiiiiIIIII - 5) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII - 6;
                    this.iiiiIiiiIiiII.get(IiiiiiiiIIIII2).setText(String.valueOf(IiiiiiiiIIIII2 + IiiiiiiiIIIII3));
                } else {
                    this.iiiiIiiiIiiII.get(IiiiiiiiIIIII2).setText(String.valueOf(IiiiiiiiIIIII2 + this.iiIIIiiiiiiiI - 1));
                }
            } else {
                this.iiiiIiiiIiiII.get(IiiiiiiiIIIII2).setText(String.valueOf(IiiiiiiiIIIII2 + 1));
            }
            ++IiiiiiiiIIIII2;
        }
        if (this.iiiiIiiiIiiII.size() <= IiiiiiiiIIIII) return;
        IiiiiiiiIIIII2 = this.iiiiIiiiIiiII.size() - 1;
        while (IiiiiiiiIIIII2 >= IiiiiiiiIIIII) {
            this.remove(this.iiiiIiiiIiiII.get(IiiiiiiiIIIII2));
            this.iiiiIiiiIiiII.remove(IiiiiiiiIIIII2--);
        }
    }

    static /* synthetic */ List ALLATORIxDEMO(iiiIiiiiIiIiI arg0) {
        return arg0.iIiiIiiiiiiII;
    }

    public void iIiIiiiiIIiIi() {
        if (this.ALLATORIxDEMO().getLoginResult().getScoretype("帮派积分").compareTo(new BigDecimal(50)) < 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("您的战功不足以进行抽奖活动！！");
            return;
        }
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"drawnitems", null);
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public static GangReward ALLATORIxDEMO(List<GangReward> rewardList, int id, int num) {
        if (rewardList == null) {
            return null;
        }
        for (GangReward IiiiiiiiIIIII : rewardList) {
            if (IiiiiiiiIIIII.getGoodId().intValue() != id || IiiiiiiiIIIII.getDropNum() != num) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO(GangReward gangReward) {
        GangReward IiiiiiiiIIIII = iiiIiiiiIiIiI.ALLATORIxDEMO(this.iIiiIiiiiiiII, gangReward.getGoodId().intValue(), gangReward.getDropNum());
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII.setRewardNum(gangReward.getRewardNum());
        if (IiiiiiiiIIIII.getRewardNum() <= 0) {
            this.iIiiIiiiiiiII.remove(IiiiiiiiIIIII);
        }
        this.iIiIiiiiIIiii(Math.min((this.iIiiIiiiiiiII.size() - 1) / 24, this.iiIIIiiiiiiiI));
    }

    public JLabel ALLATORIxDEMO(String text, int i) {
        JLabel IiiiiiiiIIIII = new JLabel();
        IiiiiiiiIIIII.setBounds(47 + i * 41, 238, 39, 23);
        IiiiiiiiIIIII.setIcon(ALLATORIxDEMO);
        IiiiiiiiIIIII.setBackground(new Color(0, 0, 0, 0));
        IiiiiiiiIIIII.setText(text);
        IiiiiiiiIIIII.setForeground(Color.WHITE);
        IiiiiiiiIIIII.setHorizontalTextPosition(0);
        IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iIiIIiiiiIIiI);
        IiiiiiiiIIIII.addMouseListener((MouseListener)new iiiIIiiiiiiii(this, IiiiiiiiIIIII));
        this.add(IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(List<GangReward> list) {
        this.iIiiIiiiiiiII = list;
        this.iIiIiiiiIIiii(0);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public iiiIiiiiIiIiI(GameView gameView) {
        super(59, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 380, 387, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "赏功堂");
        this.iiiIiiiiiiiIi = new IIIIIiiiIIIiI("sc/e/7.png", 1, 216, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "抽奖", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(172, 340, 59, 25);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiiiiiiiIIIII = new JLabel[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)86, (int)(258 + 25 * IiiiiiiiIIIII), (int)72, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "消耗战功" : (IiiiiiiiIIIII == 1 ? "抽奖次数" : (IiiiiiiiIIIII == 2 ? "我的战功" : "")));
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new MoneyType();
        this.iiIiIiiiiIIIi.setIdAndKey(0, "帮派积分");
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)164, (int)258, (int)143, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.IiIiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)164, (int)283, (int)143, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)164, (int)308, (int)143, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiIiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIiiiiiiiIii.ALLATORIxDEMO(2);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.IiIiiiiiIIIII);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiIiiiiIiIii.setText("50");
        this.IiIiiiiiIIIII.setText("0");
        this.iiIiiiiiiiIii.setText("0");
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI();
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.IIiiIiiiIIiIi.setBounds(47, 31, 309, 207);
        this.add((Component)this.IIiiIiiiIIiIi);
        this.IiIIIiiiiIiiI = new IiIIIiiiIIiIi[24];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new IiIIIiiiIIiIi(this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(48 + 51 * (IiiiiiiiIIIII % 6), 33 + 51 * (IiiiiiiiIIIII / 6), 51, 51);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].iIiIiiiiIIiii(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].ALLATORIxDEMO(com.xy.q.IIIiiiiiIiIiI.iiIIIiiiiiiiI);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
    }

    static /* synthetic */ int ALLATORIxDEMO(iiiIiiiiIiIiI arg0) {
        return arg0.iiIIIiiiiiiiI;
    }

    public void iiiIiiiiiiIIi() {
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getMoney(this.iiIiIiiiiIIIi);
        if (this.iiIiiiiiiiIii.ALLATORIxDEMO() == IiiiiiiiIIIII) {
            return;
        }
        this.iiIiiiiiiiIii.ALLATORIxDEMO(IiiiiiiiIIIII);
        this.IiIiiiiiIIIII.setText(String.valueOf(IiiiiiiiIIIII / 50L));
    }
}
