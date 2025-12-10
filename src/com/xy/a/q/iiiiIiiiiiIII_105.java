/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiiiiiiIIII
 *  com.xy.a.q.iiIiiiiiIIiIi
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.QuackGameBean
 *  com.xy.c.IiiiIiiiiIIII
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 */
package com.xy.a.q;

import com.xy.a.q.IIiiiiiiiIIII;
import com.xy.a.q.iiIiiiiiIIiIi;
import com.xy.bean.AssetUpdate;
import com.xy.bean.QuackGameBean;
import com.xy.c.IiiiIiiiiIIII;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiiiIiiiiiIII
extends IiiiIiiiiIiIi {
    private int iiIIiiiiIiIIi;
    private IIiiiiiiiIIII IiIIiiiiIIIII;
    private BigDecimal iIIIIiiiiiIIi;
    private BigDecimal IiiIIiiiiiiiI;
    private QuackGameBean IIiiiiiiIiiII;
    private String IiiiIiiiIiIII;
    private iiIiiiiiIIiIi[] IIiiiiiiiIIIi;
    private int IIIiiiiiIIiII;
    private List<IIiiiiiiiIIII> iiIiiiiiiIIiI;
    private int iIiiIiiiIiIIi;
    private BigDecimal iiiiIiiiIIiii;
    private long iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII;
    private JLabel iiIIIiiiiiiiI;
    private String IiIiiiiiIIIII;
    private JLabel iiIiIiiiiIIIi;
    private long iiiiIiiiIiiII;
    private IiiiiiiiiIIII iiiIiiiiiiiIi;
    private IiiiiiiiiIIII iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI = 1;
    private String iiIiiiiiiiIii;
    private IiiiiiiiiIIII IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public synchronized void iiiIiiiiiiIIi(QuackGameBean bean) {
        if (this.IIiiiiiiIiiII != null) {
            IiiiIiiiiIIII.ALLATORIxDEMO((AssetUpdate)this.IIiiiiiiIiiII.getAssetUpdate(), (GameView)this.iiIIiiiiIiIIi);
            this.iIiIiiiiIIiIi(this.IIiiiiiiIiiII.getPetmsg2());
        }
        this.IIiiiiiiIiiII = bean;
        if (bean == null) return;
        this.IiiiIiiiIiIII = bean.getIndex() < 10 ? "00" + bean.getIndex() : (bean.getIndex() < 100 ? "0" + bean.getIndex() : (bean.getIndex() < 1000 ? "0" + bean.getIndex() : "" + bean.getIndex()));
        this.IIIIiiiiiiiII = 0;
        this.IiIiiiiiIIIII = null;
        this.ALLATORIxDEMO = 0;
        this.iiiiIiiiIiiII = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.iIIiIiiiiiiIi = 0L;
        this.iiIIiiiiIiIIi = 0;
        this.IIIiiiiiIIiII = 0;
        int IiiiiiiiIIIII = Integer.parseInt(this.IiiiIiiiIiIII.substring(this.IIIIiiiiiiiII, this.IIIIiiiiiiiII + 1));
        this.IiIiiiiiIIIII = this.IiiiIiiiIiIII.substring(this.IiiiIiiiIiIII.length() - this.IIIIiiiiiiiII);
        this.ALLATORIxDEMO = 380 - this.IiiiIiiiIiIII.length() * 13 / 2;
        this.ALLATORIxDEMO += (this.IiiiIiiiIiIII.length() - this.IiIiiiiiIIIII.length()) * 13;
        this.IIIiiiiiIIiII = 500 + IiiiiiiiIIIII * 25;
    }

    public synchronized void iIiIiiiiIIiii(QuackGameBean bean) {
        this.iiiIiiiiiiIIi(bean);
    }

    public synchronized void iiiIiiiiiiIIi() {
        if (this.IIiiiiiiIiiII != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f");
            return;
        }
        if (this.IiIIiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u9009\u4e2d\u7684\u62bd\u5956\u7269\u54c1");
            return;
        }
        int IiiiiiiiIIIII = 0;
        if (this.iiiiIiiiIIiii != null) {
            IiiiiiiiIIIII += this.ALLATORIxDEMO().getGoodNum(this.iiiiIiiiIIiii);
        }
        if (this.IiiIIiiiiiiiI != null && this.iIIIIiiiiiIIi != null) {
            IiiiiiiiIIIII = (int)((long)IiiiiiiiIIIII + this.IiiIIiiiiiiiI.longValue() / this.iIIIIiiiiiIIi.longValue());
        }
        if (IIiiiiiiiIIII.iIiIiiiiIIiii((IIiiiiiiiIIII)this.IiIIiiiiIIIII) > IiiiiiiiIIIII) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u6b21\u6570\u4e0d\u8db3");
            return;
        }
        Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(this.iiiiIiiiIIiii);
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        IiiiiiiiIIIII3.append("V");
        IiiiiiiiIIIII3.append(this.IIiiIiiiIIiIi);
        IiiiiiiiIIIII3.append("|");
        IiiiiiiiIIIII3.append(IIiiiiiiiIIII.ALLATORIxDEMO((IIiiiiiiiIIII)this.IiIIiiiiIIIII));
        IiiiiiiiIIIII3.append("|");
        IiiiiiiiIIIII3.append(IIiiiiiiiIIII.iIiIiiiiIIiii((IIiiiiiiiIIII)this.IiIIiiiiIIIII));
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII3.append("|");
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII2.getRgid());
        }
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"getfivemsg", (String)IiiiiiiiIIIII3.toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
    }

    public synchronized void ALLATORIxDEMO(IIIiiiiiIiIiI imgGrid) {
        if (imgGrid == this.iIiIiiiiIiIii) {
            return;
        }
        if (this.IIiiiiiiIiiII != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f");
            return;
        }
        iiIiiiiiIIiIi IiiiiiiiIIIII = (iiIiiiiiIIiIi)imgGrid;
        if (iiIiiiiiIIiIi.ALLATORIxDEMO((iiIiiiiiIIiIi)IiiiiiiiIIIII) == null) {
            return;
        }
        this.IiIIiiiiIIIII = iiIiiiiiIIiIi.ALLATORIxDEMO((iiIiiiiiIIiIi)IiiiiiiiIIIII);
        Goodstable IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(IIiiiiiiiIIII.ALLATORIxDEMO((IIiiiiiiiIIII)this.IiIIiiiiIIIII));
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII2 != null ? 1 : 0, (Object)IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII2 == null) {
            this.iIiIiiiiIiIii.setVisible(true);
        }
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIiiiiiiiIIIi.length) {
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII3++].ALLATORIxDEMO();
        }
        IiiiiiiiIIIII.ALLATORIxDEMO("sc/b/S306.png");
        if (this.iIIIIiiiiiIIi != null) {
            this.iiIiIiiiiIIIi.setText(String.valueOf(this.iIIIIiiiiiIIi.longValue() * (long)IIiiiiiiiIIII.iIiIiiiiIIiii((IIiiiiiiiIIII)this.IiIIiiiiIIIII)));
            return;
        }
        this.iiIiIiiiiIIIi.setText("\u6570\u91cf:" + IIiiiiiiiIIII.iIiIiiiiIIiii((IIiiiiiiiIIII)this.IiIIiiiiIIIII));
    }

    public iiiiIiiiiiIII(GameView gameView) {
        super(128, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-2, 0, 741, 375, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S305.png");
        this.IiIiiiiiIIIII.setBtnPath("sc/b/B395.png");
        this.IiIiiiiiIIIII.setBounds(456, 15, 45, 46);
        this.iiIiiiiiiIIiI = new ArrayList<IIiiiiiiiIIII>();
        this.iiIiIiiiiIIIi = new JLabel("");
        this.iiIiIiiiiIIIi.setBounds(448, 310, 75, 18);
        this.iiIiIiiiiIIIi.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiIiIiiiiIIIi.setForeground(Color.red);
        this.add(this.iiIiIiiiiIIIi);
        this.iiIIIiiiiiiiI = new JLabel("");
        this.iiIIIiiiiiiiI.setBounds(325, 23, 75, 18);
        this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiIIIiiiiiiiI.setForeground(Color.red);
        this.add(this.iiIIIiiiiiiiI);
        this.iIiiIiiiiiiII = new IiiiiiiiiIIII("sc/e/42.png", 1, 201, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(460, 158, 18, 18);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII("sc/e/43.png", 1, 202, (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(478, 158, 18, 18);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.IiiiiiiiIIIII = new IiiiiiiiiIIII("sc/b/B394.png", 1, 200, (IiiiIiiiiIiIi)this);
        this.IiiiiiiiIIIII.setBounds(492, 272, 59, 72);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IIiiiiiiiIIIi = new iiIiiiiiIIiIi[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiiiiiiIIIi.length) {
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII] = new iiIiiiiiIIiIi(this);
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII].setBounds(262 + IiiiiiiiIIIII % 4 * 60, 42 + IiiiiiiiIIIII / 4 * 54, 54, 52);
            this.add((Component)this.IIiiiiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.setBounds(358, 254, 49, 49);
        this.add((Component)this.iIiIiiiiIiIii);
    }

    /*
     * WARNING - void declaration
     */
    protected void paintComponent(Graphics g) {
        void IiiiiiiiIIIII;
        super.paintComponent(g);
        if (this.IiiiIiiiIiIII == null) {
            return;
        }
        g.setColor(Color.red);
        g.setFont(iiIIiiiiIiiII.iiIIiiiiIIiIi);
        if (this.IiIiiiiiIIIII != null) {
            g.drawString(this.IiIiiiiiIIIII, this.ALLATORIxDEMO, 240);
        }
        if (this.IIIiiiiiIIiII == 0) {
            return;
        }
        long IiiiiiiiIIIII2 = (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.iiiiIiiiIiiII) / 5L;
        this.iiIIiiiiIiIIi = (int)((long)this.iiIIiiiiIiIIi + (IiiiiiiiIIIII2 -= this.iIIiIiiiiiiIi));
        this.iIIiIiiiiiiIi += IiiiiiiiIIIII2;
        if (this.iiIIiiiiIiIIi >= this.IIIiiiiiIIiII) {
            this.iiIIiiiiIiIIi = this.IIIiiiiiIIiII;
        }
        int IiiiiiiiIIIII3 = this.iiIIiiiiIiIIi / 25;
        int n = this.iiIIiiiiIiIIi % 25;
        g.setClip(this.ALLATORIxDEMO - 13, 215, 13, 25);
        g.drawString(String.valueOf(IiiiiiiiIIIII3 %= 10), this.ALLATORIxDEMO - 13, 240 - IiiiiiiiIIIII);
        g.drawString(String.valueOf(IiiiiiiiIIIII3 == 9 ? 0 : IiiiiiiiIIIII3 + 1), this.ALLATORIxDEMO - 13, 265 - IiiiiiiiIIIII);
        g.setClip(0, 0, this.getWidth(), this.getHeight());
        if (this.iiIIiiiiIiIIi != this.IIIiiiiiIIiII) return;
        this.iiIIiiiiIiIIi = 0;
        ++this.IIIIiiiiiiiII;
        this.IiIiiiiiIIIII = this.IiiiIiiiIiIII.substring(this.IiiiIiiiIiIII.length() - this.IIIIiiiiiiiII);
        this.ALLATORIxDEMO = 380 - this.IiiiIiiiIiIII.length() * 13 / 2;
        this.ALLATORIxDEMO += (this.IiiiIiiiIiIII.length() - this.IiIiiiiiIIIII.length()) * 13;
        if (this.IIIIiiiiiiiII >= this.IiiiIiiiIiIII.length()) {
            this.IIIiiiiiIIiII = 0;
            this.iiiIiiiiiiIIi(null);
            return;
        }
        int IiiiiiiiIIIII4 = Integer.parseInt(this.IiiiIiiiIiIII.substring(this.IIIIiiiiiiiII, this.IIIIiiiiiiiII + 1));
        this.IIIiiiiiIIiII = 500 + IiiiiiiiIIIII4 * 25;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(QuackGameBean gameBean) {
        this.IIiiIiiiIIiIi = gameBean.getMoney();
        this.iIiIiiiiIIiIi(gameBean.getPetmsg2());
        String[] IiiiiiiiIIIII = gameBean.getPetmsg() != null && !gameBean.getPetmsg().equals("") ? gameBean.getPetmsg().split("\\|") : null;
        this.IiIIiiiiIIIII = null;
        this.iIiIiiiiIiIii.ALLATORIxDEMO(0, null);
        this.iIiIiiiiIiIii.setVisible(true);
        this.iiIiiiiiiIIiI.clear();
        if (IiiiiiiiIIIII != null) {
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
                void IiiiiiiiIIIII3;
                String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("_");
                IIiiiiiiiIIII iIiiiiiiiIIII = new IIiiiiiiiIIII(this);
                IiiiiiiiIIIII3.ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII4[0]));
                IiiiiiiiIIIII3.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII4[1]));
                iIiiiiiiiIIII.iIiIiiiiIIiii(Integer.parseInt(IiiiiiiiIIIII4[2]));
                ++IiiiiiiiIIIII2;
                this.iiIiiiiiiIIiI.add((IIiiiiiiiIIII)IiiiiiiiIIIII3);
            }
        }
        this.iiiIiiiiiiIIi(0);
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public synchronized void iIiIiiiiIIiIi(String value) {
        String[] IiiiiiiiIIIII = value.split("=");
        this.iiiiIiiiIIiii = !IiiiiiiiIIIII[0].equals("null") ? new BigDecimal(IiiiiiiiIIIII[0]) : null;
        this.iiIiiiiiiiIii = !IiiiiiiiIIIII[1].equals("null") ? IiiiiiiiIIIII[1] : null;
        this.iIIIIiiiiiIIi = !IiiiiiiiIIIII[2].equals("null") ? new BigDecimal(IiiiiiiiIIIII[2]) : null;
        this.IiIIIiiiiIiiI = Integer.parseInt(IiiiiiiiIIIII[3]);
        if (IiiiiiiiIIIII.length == 5) {
            BigDecimal bigDecimal = this.IiiIIiiiiiiiI = !IiiiiiiiIIIII[4].equals("null") ? new BigDecimal(IiiiiiiiIIIII[4]) : null;
        }
        if (this.IiIIiiiiIIIII != null && this.iIIIIiiiiiIIi != null) {
            this.iiIiIiiiiIIIi.setText(String.valueOf(this.iIIIIiiiiiIIi.longValue() * (long)IIiiiiiiiIIII.iIiIiiiiIIiii((IIiiiiiiiIIII)this.IiIIiiiiIIIII)));
        } else {
            this.iiIiIiiiiIIIi.setText("");
        }
        this.iiIIIiiiiiiiI.setText(this.IiiIIiiiiiiiI != null ? this.IiiIIiiiiiiiI.toString() : "");
    }

    public int iiiIiiiiiiIIi() {
        return this.iIiiIiiiIiIIi;
    }

    public boolean ALLATORIxDEMO() {
        if (this.IIiiiiiiIiiII == null) return super.ALLATORIxDEMO();
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u62bd\u5956\u8fd8\u6ca1\u6709\u7ed3\u675f\u65e0\u6cd5\u5173\u95ed\u9762\u677f");
        return false;
    }

    public void iiiIiiiiiiIIi(int ys) {
        this.iIiiIiiiIiIIi = ys;
        if (this.iIiiIiiiIiIIi < 0) {
            this.iIiiIiiiIiIIi = 0;
        } else if (this.iIiiIiiiIiIIi > (this.iiIiiiiiiIIiI.size() - 1) / 8) {
            this.iIiiIiiiIiIIi = (this.iiIiiiiiiIIiI.size() - 1) / 8;
        }
        int IiiiiiiiIIIII = this.iIiiIiiiIiIIi * 8;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IIiiiiiiiIIIi.length) {
            IIiiiiiiiIIII IiiiiiiiIIIII3 = IiiiiiiiIIIII2 + IiiiiiiiIIIII < this.iiIiiiiiiIIiI.size() ? this.iiIiiiiiiIIiI.get(IiiiiiiiIIIII2 + IiiiiiiiIIIII) : null;
            this.IIiiiiiiiIIIi[IiiiiiiiIIIII2++].ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 200) {
            this.iiiIiiiiiiIIi();
            return;
        }
        if (id == 201) {
            this.iiiIiiiiiiIIi(this.iiiIiiiiiiIIi() - 1);
            return;
        }
        if (id != 202) return;
        this.iiiIiiiiiiIIi(this.iiiIiiiiiiIIi() + 1);
    }

    static /* synthetic */ IIiiiiiiiIIII ALLATORIxDEMO(iiiiIiiiiiIII arg0) {
        return arg0.IiIIiiiiIIIII;
    }
}
