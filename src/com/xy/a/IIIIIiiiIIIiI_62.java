/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIiIiiiIiIII
 *  com.xy.a.IiIIIiiiIIiII
 *  com.xy.a.iIIIIiiiIiiIi
 *  com.xy.a.iIiIiiiiIiIII
 *  com.xy.bean.Commodity
 *  com.xy.bean.Stall
 *  com.xy.bean.StallBean
 *  com.xy.bean.StallBuy
 *  com.xy.bean.StallNeedBean
 *  com.xy.d.iiIIiiiiIiiII
 *  com.xy.game.RoleData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.StallBuyData
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIIiIiiiIiIII;
import com.xy.a.IiIIIiiiIIiII;
import com.xy.a.iIIIIiiiIiiIi;
import com.xy.a.iIiIiiiiIiIII;
import com.xy.bean.Commodity;
import com.xy.bean.Stall;
import com.xy.bean.StallBean;
import com.xy.bean.StallBuy;
import com.xy.bean.StallNeedBean;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StallBuyData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIIIiI
extends IiiiIiiiiIiIi {
    private iIIIIiiiIiiIi[] iiIiIiiiIiiII;
    private iIIiIiiiIiiIi IIiIIiiiiiIII;
    private JScrollPane IiiIIiiiiIiIi;
    private Stall iIIIiiiiIiiiI;
    private com.xy.w.IIIiiiiiIiIiI iIiIIiiiIIiII;
    private com.xy.w.IIIiiiiiIiIiI IIiIIiiiIiiII;
    private JComponent IIIIIiiiIIIII;
    private JLabel[] IiiIiiiiIIiiI;
    private iIIiIiiiIiiIi[] IiIiiiiiiiiIi;
    private IIIiiiiiIiIiI IiIIIiiiIiiIi;
    private com.xy.i.IIIIIiiiIIIiI IIIiiiiiiIiiI;
    public static IIIIIiiiIiIii IIiIiiiiIiiiI;
    private JScrollPane IiiiIiiiIiiIi;
    private iiIiIiiiiIiIi iiIIIiiiIiIii;
    private com.xy.i.IIIIIiiiIIIiI[] IIiIiiiiIIiII;
    private IiiiIiiiiIiII iIiiIiiiiIiiI;
    private iiIiIiiiiIiIi iiIiiiiiiiiiI;
    private com.xy.i.IIIIIiiiIIIiI iiIiIiiiiIIII;
    private int IiIIIiiiiiiiI;
    public iiIIiiiiIiIiI iIiIIiiiIIIii;
    private com.xy.w.IIIiiiiiIiIiI IIIIIiiiIiIIi;
    private JLabel[] iiIIiiiiIiIIi;
    private com.xy.w.IIIiiiiiIiIiI IiIIiiiiIIIII;
    private RichLabel iIIIIiiiiiIIi;
    private int IiiIIiiiiiiiI = 0;
    private IiiiIiiiiIiII IIiiiiiiIiiII;
    private JComponent IiiiIiiiIiIII;
    private MoneyType IIiiiiiiiIIIi;
    private com.xy.w.IIIiiiiiIiIiI[] IIIiiiiiIIiII;
    private StallNeedBean iiIiiiiiiIIiI;
    private iIIIIiiiIiiIi[] iIiiIiiiIiIIi;
    private com.xy.i.IIIIIiiiIIIiI iiiiIiiiIIiii;
    private RichLabel iIIiIiiiiiiIi;
    private iIIiIiiiIiiIi[] IIIIiiiiiiiII;
    private IIiIIiiiIIIiI iiIIIiiiiiiiI;
    private com.xy.w.IIIiiiiiIiIiI[] IiIiiiiiIIIII;
    private com.xy.w.IIIiiiiiIiIiI iiIiIiiiiIIIi;
    private com.xy.i.IIIIIiiiIIIiI iiiiIiiiIiiII;
    private JComponent iiiIiiiiiiiIi;
    private com.xy.i.IIIIIiiiIIIiI iIiiIiiiiiiII;
    private com.xy.i.IIIIIiiiIIIiI[] IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private Commodity iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IIiIIiiiIIIiI ALLATORIxDEMO;

    public void iIiIiiiiIIiii(String value, StringBuffer buffer) {
        String IiiiiiiiIIIII = null;
        String IiiiiiiiIIIII2 = null;
        String IiiiiiiiIIIII3 = null;
        boolean IiiiiiiiIIIII4 = false;
        int IiiiiiiiIIIII5 = 1;
        long IiiiiiiiIIIII6 = 0L;
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 != value.length()) {
            IiiiiiiiIIIII9 = value.indexOf("|", IiiiiiiiIIIII8 + 1);
            if (IiiiiiiiIIIII9 == -1) {
                IiiiiiiiIIIII9 = value.length();
            }
            if (IiiiiiiiIIIII7 == 1) {
                IiiiiiiiIIIII = value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9);
            } else if (IiiiiiiiIIIII7 == 3) {
                IiiiiiiiIIIII2 = value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9);
            } else if (IiiiiiiiIIIII7 == 4) {
                IiiiiiiiIIIII5 = Integer.parseInt(value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9));
            } else if (IiiiiiiiIIIII7 == 5) {
                IiiiiiiiIIIII6 = (long)IiiiiiiiIIIII5 * Long.parseLong(value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9));
            } else if (IiiiiiiiIIIII7 == 6) {
                IiiiiiiiIIIII3 = value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9);
            } else if (IiiiiiiiIIIII7 == 7 && value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9).startsWith("\u5b88\u62a4")) {
                IiiiiiiiIIIII4 = true;
            }
            ++IiiiiiiiIIIII7;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII9 + 1;
        }
        buffer.append("#R");
        buffer.append(IiiiiiiiIIIII);
        buffer.append("\u3000#G");
        buffer.append(IiiiiiiiIIIII2);
        buffer.append("#W\u4ee5#Y");
        buffer.append(IiiiiiiiIIIII6);
        buffer.append("#W\u7684\u4ef7\u683c\u51fa\u552e\u4e86");
        if (!IiiiiiiiIIIII4) {
            buffer.append("#G");
            buffer.append(IiiiiiiiIIIII5);
            buffer.append("#W\u4e2a#G");
            buffer.append(IiiiiiiiIIIII3);
            return;
        }
        buffer.append("\u5b88\u62a4#G");
        buffer.append(IiiiiiiiIIIII3);
    }

    public void ALLATORIxDEMO(StallBean stallBean) {
        if (this.iIIIiiiiIiiiI == null) return;
        if (this.iIIIiiiiIiiiI.getId() != stallBean.getId()) return;
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iIiIiiiiIIiIi();
    }

    /*
     * WARNING - void declaration
     */
    public void IiiIiiiiiiIiI(int id) {
        if (id == 241) {
            if (this.iIIIiiiiIiiiI.getId() == 0) {
                return;
            }
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.iIIIiiiiIiiiI.getRoleid(), (BigDecimal)this.ALLATORIxDEMO().getLoginResult().getRole_id())) {
                this.iIIIiiiiIiiiI.setState(com.xy.d.iiIIiiiiIiiII.iiiIiiiiiiiIi);
                String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"stall", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(this.iIIIiiiiIiiiI));
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
                return;
            }
            if (this.iiIiiiiiiiIii == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u6ca1\u6709\u9009\u4e2d\u5546\u54c1");
                return;
            }
            if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
            int IiiiiiiiIIIII2 = (int)this.iiIIIiiiiiiiI.ALLATORIxDEMO();
            if (IiiiiiiiIIIII2 <= 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8d2d\u4e70\u6570\u91cf\u4e3a0");
                return;
            }
            if (this.iiIiiiiiiiIii.getGood() != null) {
                if (IiiiiiiiIIIII2 > this.iiIiiiiiiiIii.getGood().getUsetime()) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u6570\u91cf\u4e0d\u8db3");
                    return;
                }
                IiiiiiiiIIIII2 = IiiiiiiiIIIII.getGoodPackSum(this.iiIiiiiiiiIii.getGood().getType().longValue(), this.iiIiiiiiiiIii.getGood().getGoodsid(), IiiiiiiiIIIII2);
                if (IiiiiiiiIIIII2 <= 0) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u80cc\u5305\u5df2\u6ee1");
                    return;
                }
                long IiiiiiiiIIIII3 = (long)IiiiiiiiIIIII2 * this.iiIiiiiiiiIii.getMoney();
                if (IiiiiiiiIIIII3 > 0L && IiiiiiiiIIIII3 <= IiiiiiiiIIIII.getLoginResult().getGold().longValue()) {
                    void IiiiiiiiIIIII4;
                    StallBuy stallBuy = new StallBuy();
                    IiiiiiiiIIIII4.setId(this.iIIIiiiiIiiiI.getId());
                    IiiiiiiiIIIII4.setType(0);
                    IiiiiiiiIIIII4.setBuyid(this.iiIiiiiiiiIii.getGood().getRgid());
                    IiiiiiiiIIIII4.setSum(IiiiiiiiIIIII2);
                    String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"stallbuy", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII4));
                    this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
                    return;
                }
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
                return;
            }
            if (this.iiIiiiiiiiIii.getPet() == null) {
                this.iiIiiiiiiiIii.getLingbao();
                return;
            }
            if (IiiiiiiiIIIII.pets.size() >= 21) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u7684\u53ec\u5524\u517d\u53ef\u643a\u5e26\u7684\u6570\u91cf\u5df2\u6ee1\uff01\uff01\uff01");
                return;
            }
            long IiiiiiiiIIIII6 = this.iiIiiiiiiiIii.getMoney();
            if (IiiiiiiiIIIII6 > 0L && IiiiiiiiIIIII6 <= IiiiiiiiIIIII.getLoginResult().getGold().longValue()) {
                StallBuy IiiiiiiiIIIII4 = new StallBuy();
                IiiiiiiiIIIII4.setId(this.iIIIiiiiIiiiI.getId());
                IiiiiiiiIIIII4.setType(1);
                IiiiiiiiIIIII4.setBuyid(this.iiIiiiiiiiIii.getPet().getSid());
                IiiiiiiiIIIII4.setSum(1);
                String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"stallbuy", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII4));
                this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
                return;
            }
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db3");
            return;
        }
        if (id == 242) {
            if (this.IiiIIiiiiiiiI <= 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u662f\u9996\u9875");
                return;
            }
            --this.IiiIIiiiiiiiI;
            this.iIiIiiiiIIiii(this.IiiIIiiiiiiiI);
            this.iiiIiiiiiiIIi();
            return;
        }
        if (id == 243) {
            int IiiiiiiiIIIII = this.iIIIiiiiIiiiI.getNeedNum();
            int IiiiiiiiIIIII8 = (IiiiiiiiIIIII - 1) / this.iiIiIiiiIiiII.length;
            if (this.IiiIIiiiiiiiI >= IiiiiiiiIIIII8) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u662f\u5c3e\u9875");
                return;
            }
            ++this.IiiIIiiiiiiiI;
            this.iIiIiiiiIIiii(this.IiiIIiiiiiiiI);
            this.iiiIiiiiiiIIi();
            return;
        }
        if (id != 244) {
            if (id != 240) return;
            IiiIiiiiIIIii.ALLATORIxDEMO((int)181, (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
            return;
        }
        if (this.iiIiiiiiiIIiI == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u6536\u8d2d\u79cd\u7c7b");
            return;
        }
        int IiiiiiiiIIIII = (int)this.ALLATORIxDEMO.ALLATORIxDEMO();
        if (IiiiiiiiIIIII <= 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u51fa\u552e\u6570\u91cf\u4e3a0");
            return;
        }
        Goodstable IiiiiiiiIIIII9 = (Goodstable)this.IiIIIiiiiIiiI.ALLATORIxDEMO();
        if (IiiiiiiiIIIII9 != null) {
            IiiiiiiiIIIII9 = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII9.getRgid());
        }
        if (IiiiiiiiIIIII9 == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u7269\u54c1");
            return;
        }
        StallBuy IiiiiiiiIIIII6 = new StallBuy();
        IiiiiiiiIIIII6.setId(this.iIIIiiiiIiiiI.getId());
        IiiiiiiiIIIII6.setType(3);
        IiiiiiiiIIIII6.setSoldId(this.iiIiiiiiiIIiI.getId());
        IiiiiiiiIIIII6.setBuyid(IiiiiiiiIIIII9.getRgid());
        IiiiiiiiIIIII6.setSum(IiiiiiiiIIIII);
        String IiiiiiiiIIIII10 = Agreement.getSendTextAES((String)"stallbuy", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII6));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII10);
    }

    public void ALLATORIxDEMO(StallNeedBean needBean) {
        this.iiIiiiiiiIIiI = needBean;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(0, null);
        if (needBean != null) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIIIiiiiiiiII[1], (long)needBean.getMoney());
        } else {
            this.IIIIiiiiiiiII[1].setText("");
        }
        this.iIiiIiiiiIiiI.setText("");
        this.iiiIiiiiiiIIi();
        StallBuyData IiiiiiiiIIIII = needBean != null ? this.ALLATORIxDEMO().ALLATORIxDEMO(needBean.getId()) : null;
        this.iIiIIiiiIIIii.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void iiiiiiiiIIiii() {
        IiiiiiiiiIIII IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIiIiiiIiiII.length) {
            StallBuyData IiiiiiiiIIIII3 = iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.iiIiIiiiIiiII[IiiiiiiiIIIII2]) != null ? IiiiiiiiIIIII.ALLATORIxDEMO(iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.iiIiIiiiIiiII[IiiiiiiiIIIII2]).getId()) : null;
            iIIIIiiiIiiIi iIIIIiiiIiiIi2 = this.iiIiIiiiIiiII[IiiiiiiiIIIII2];
            ++IiiiiiiiIIIII2;
            iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)iIIIIiiiIiiIi2, (boolean)this.iIiIIiiiIIIii.ALLATORIxDEMO(IiiiiiiiIIIII3));
        }
        StallBuyData IiiiiiiiIIIII22 = this.iiIiiiiiiIIiI != null ? IiiiiiiiIIIII.ALLATORIxDEMO(this.iiIiiiiiiIIiI.getId()) : null;
        this.iIiIIiiiIIIii.ALLATORIxDEMO(IiiiiiiiIIIII22);
    }

    public void ALLATORIxDEMO(String value, StringBuffer buffer) {
        String IiiiiiiiIIIII = null;
        String IiiiiiiiIIIII2 = null;
        String IiiiiiiiIIIII3 = null;
        boolean IiiiiiiiIIIII4 = false;
        int IiiiiiiiIIIII5 = 1;
        long IiiiiiiiIIIII6 = 0L;
        int IiiiiiiiIIIII7 = 0;
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        while (IiiiiiiiIIIII9 != value.length()) {
            IiiiiiiiIIIII9 = value.indexOf("|", IiiiiiiiIIIII8 + 1);
            if (IiiiiiiiIIIII9 == -1) {
                IiiiiiiiIIIII9 = value.length();
            }
            if (IiiiiiiiIIIII7 == 1) {
                IiiiiiiiIIIII = value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9);
            } else if (IiiiiiiiIIIII7 == 3) {
                IiiiiiiiIIIII2 = value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9);
            } else if (IiiiiiiiIIIII7 == 4) {
                IiiiiiiiIIIII5 = Integer.parseInt(value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9));
            } else if (IiiiiiiiIIIII7 == 5) {
                IiiiiiiiIIIII6 = (long)IiiiiiiiIIIII5 * Long.parseLong(value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9));
            } else if (IiiiiiiiIIIII7 == 6) {
                IiiiiiiiIIIII3 = value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9);
            } else if (IiiiiiiiIIIII7 == 7 && value.substring(IiiiiiiiIIIII8, IiiiiiiiIIIII9).startsWith("\u5b88\u62a4")) {
                IiiiiiiiIIIII4 = true;
            }
            ++IiiiiiiiIIIII7;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII9 + 1;
        }
        buffer.append("#R");
        buffer.append(IiiiiiiiIIIII);
        buffer.append("\u3000#G");
        buffer.append(IiiiiiiiIIIII2);
        buffer.append("#W\u82b1\u8d39#Y");
        buffer.append(IiiiiiiiIIIII6);
        buffer.append("#W\u7684\u4ef7\u683c\u8d2d\u4e70\u4e86");
        if (!IiiiiiiiIIIII4) {
            buffer.append("#G");
            buffer.append(IiiiiiiiIIIII5);
            buffer.append("#W\u4e2a#G");
            buffer.append(IiiiiiiiIIIII3);
            return;
        }
        buffer.append("\u5b88\u62a4#G");
        buffer.append(IiiiiiiiIIIII3);
    }

    public IIIIIiiiIIIiI(GameView gameView) {
        super(153, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 692, 491, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u67e5\u770b\u51fa\u552e");
        this.IIiiIiiiIIiIi = new com.xy.i.IIIIIiiiIIIiI[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = new com.xy.i.IIIIIiiiIIIiI("sc/e/72.png", 2, 231 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u51fa\u552e" : (IiiiiiiiIIIII == 1 ? "\u6536\u8d2d" : (IiiiiiiiIIIII == 2 ? "\u4ea4\u6613\u8bb0\u5f55" : "")), (IiiiIiiiiIiIi)this);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setBounds(61 + 92 * IiiiiiiiIIIII, 15, 85, 33);
            this.add((Component)this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.IIiIIiiiiiIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)336, (int)22, (int)183, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.IIiIIiiiiiIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIiIIiiiiiIII);
        this.IIIIIiiiIiIIi = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/90.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.add((Component)this.IIIIIiiiIiIIi);
        this.iiIiIiiiiIIII = new com.xy.i.IIIIIiiiIIIiI("sc/e/31.png", 1, 240, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u5406\u559d", (IiiiIiiiiIiIi)this);
        this.iiIiIiiiiIIII.setBounds(530, 17, 79, 25);
        this.add((Component)this.iiIiIiiiiIIII);
        if (!this.ALLATORIxDEMO().gamePawn) {
            this.iiIiIiiiiIIII.setVisible(false);
        }
        this.IiiiIiiiIiIII = new IiIIIiiiIIiII(this);
        this.IIIIIiiiIIIII = new iIiIiiiiIiIII(this);
        this.iiiIiiiiiiiIi = new IIIiIiiiIiIII(this);
        this.IiiiIiiiIiIII.setBounds(0, 0, 692, 491);
        this.IIIIIiiiIIIII.setBounds(0, 0, 692, 491);
        this.iiiIiiiiiiiIi.setBounds(0, 0, 692, 491);
        this.add(this.IiiiIiiiIiIII);
        this.add(this.IIIIIiiiIIIII);
        this.add(this.iiiIiiiiiiiIi);
        this.IIiIiiiiIIiII = new com.xy.i.IIIIIiiiIIIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiIiiiiIIiII.length) {
            this.IIiIiiiiIIiII[IiiiiiiiIIIII] = new com.xy.i.IIIIIiiiIIIiI("sc/e/61.png", 2, 236 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u9053\u5177" : (IiiiiiiiIIIII == 1 ? "\u53ec\u5524\u517d" : (IiiiiiiiIIIII == 2 ? "\u7075\u5b9d" : "")), (IiiiIiiiiIiIi)this);
            this.IIiIiiiiIIiII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IIiIiiiiIIiII[IiiiiiiiIIIII].setBounds(59 + 92 * IiiiiiiiIIIII, 53, 90, 24);
            this.IiiiIiiiIiIII.add((Component)this.IIiIiiiiIIiII[IiiiiiiiIIIII++]);
        }
        this.IIiIiiiiIIiII[2].setVisible(false);
        this.IIIiiiiiiIiiI = new com.xy.i.IIIIIiiiIIIiI("sc/e/31.png", 1, 241, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u8d2d\u4e70", (IiiiIiiiiIiIi)this);
        this.IIIiiiiiiIiiI.setBounds(525, 433, 79, 25);
        this.IiiiIiiiIiIII.add((Component)this.IIIiiiiiiIiiI);
        this.IiiIiiiiIIiiI = new JLabel[4];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiIiiiiIIiiI.length) {
            this.IiiIiiiiIIiiI[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(162 + IiiiiiiiIIIII % 2 * 169), (int)(424 + IiiiiiiiIIIII / 2 * 27), (int)36, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IiiIiiiiIIiiI[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6570\u91cf" : (IiiiiiiiIIIII == 1 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 2 ? "\u5355\u4ef7" : (IiiiiiiiIIIII == 3 ? "\u73b0\u91d1" : ""))));
            this.IiiIiiiiIIiiI[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.IiiiIiiiIiIII.add(this.IiiIiiiiIIiiI[IiiiiiiiIIIII++]);
        }
        this.IIiiiiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IIiiiiiiIiiII.setBounds(198, 424, 114, 19);
        this.IiiiIiiiIiIII.add((Component)this.IIiiiiiiIiiII);
        this.iiIIIiiiiiiiI = new IIiIIiiiIIIiI(15, (JTextField)this.IIiiiiiiIiiII, (IiiiIiiiiIiIi)this);
        this.IiIiiiiiiiiIi = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiiiiIi.length) {
            this.IiIiiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiIiiiiiiiiIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.IiIiiiiiiiiIi[IiiiiiiiIIIII].setBounds(367, 424, 114, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIiiiiiiiiIi[IiiiiiiiIIIII].setBounds(198, 451, 114, 19);
            }
            this.IiiiIiiiIiIII.add((Component)this.IiIiiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IIiiiiiiiIIIi = new MoneyType();
        this.IIiiiiiiiIIIi.setIdAndKey(1, "\u91d1\u94b1");
        this.iiIIIiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)367, (int)451, (int)114, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.IIiiiiiiiIIIi, (GameView)gameView);
        this.iiIIIiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIIIiiiIiIii.ALLATORIxDEMO(2);
        this.IiiiIiiiIiIII.add((Component)this.iiIIIiiiIiIii);
        this.iIiiIiiiIiIIi = new iIIIIiiiIiiIi[24];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII] = new iIIIIiiiIiiIi(this, IiiiiiiiIIIII, false);
            this.IiiiIiiiIiIII.add((Component)this.iIiiIiiiIiIIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
        this.iiIiIiiiiIIIi.setBounds(44, 77, 612, 338);
        this.IiiiIiiiIiIII.add((Component)this.iiIiIiiiiIIIi);
        this.IiIIIiiiIiiIi = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiIIIiiiIiiIi.setBounds(101, 424, 46, 46);
        this.IiiiIiiiIiIII.add((Component)this.IiIIIiiiIiiIi);
        this.iIiIIiiiIIiII = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/81.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.iIiIIiiiIIiII.setBounds(99, 422, 50, 50);
        this.IiiiIiiiIiIII.add((Component)this.iIiIIiiiIIiII);
        this.iiiiIiiiIIiii = new com.xy.i.IIIIIiiiIIIiI("sc/e/47.png", 1, 242, (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIiiII = new com.xy.i.IIIIIiiiIIIiI("sc/e/48.png", 1, 243, (IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII = new com.xy.i.IIIIIiiiIIIiI("sc/e/31.png", 1, 244, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u51fa\u552e", (IiiiIiiiiIiIi)this);
        this.iiiiIiiiIIiii.setBounds(655, 267, 18, 18);
        this.iiiiIiiiIiiII.setBounds(655, 309, 18, 18);
        this.iIiiIiiiiiiII.setBounds(525, 433, 79, 25);
        this.IIIIIiiiIIIII.add((Component)this.iiiiIiiiIIiii);
        this.IIIIIiiiIIIII.add((Component)this.iiiiIiiiIiiII);
        this.IIIIIiiiIIIII.add((Component)this.iIiiIiiiiiiII);
        this.iIiIiiiiIiIii = new JLabel[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)44, (int)53, (int)612, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6b63\u5728\u6536\u8d2d\u7684\u7269\u54c1" : (IiiiiiiiIIIII == 1 ? "\u53ef\u4ee5\u51fa\u552e\u7684\u7269\u54c1" : (IiiiiiiiIIIII == 2 ? "\u6570\u91cf" : (IiiiiiiiIIIII == 3 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 4 ? "\u5355\u4ef7" : (IiiiiiiiIIIII == 5 ? "\u73b0\u91d1" : ""))))));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(44, 333, 612, 21);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 5) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(162 + (IiiiiiiiIIIII - 2) % 2 * 169, 424 + (IiiiiiiiIIIII - 2) / 2 * 27, 36, 19);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.IIIIIiiiIIIII.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iIiiIiiiiIiiI.setBounds(198, 424, 114, 19);
        this.IIIIIiiiIIIII.add((Component)this.iIiiIiiiiIiiI);
        this.ALLATORIxDEMO = new IIiIIiiiIIIiI(15, (JTextField)this.iIiiIiiiiIiiI, (IiiiIiiiiIiIi)this);
        this.IIIIiiiiiiiII = new iIIiIiiiIiiIi[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiiiiIi.length) {
            this.IIIIiiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IIIIiiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            if (IiiiiiiiIIIII == 0) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(367, 424, 114, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.IIIIiiiiiiiII[IiiiiiiiIIIII].setBounds(198, 451, 114, 19);
            }
            this.IIIIIiiiIIIII.add((Component)this.IIIIiiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)367, (int)451, (int)114, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.IIiiiiiiiIIIi, (GameView)gameView);
        this.iiIiiiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIiiiiiiiiiI.ALLATORIxDEMO(2);
        this.IIIIIiiiIIIII.add((Component)this.iiIiiiiiiiiiI);
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiIIIiiiiIiiI.setBounds(101, 424, 46, 46);
        this.IIIIIiiiIIIII.add((Component)this.IiIIIiiiiIiiI);
        this.IIiIIiiiIiiII = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/81.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
        this.IIiIIiiiIiiII.setBounds(99, 422, 50, 50);
        this.IIIIIiiiIIIII.add((Component)this.IIiIIiiiIiiII);
        this.iiIiIiiiIiiII = new iIIIIiiiIiiIi[12];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiIiiII.length) {
            this.iiIiIiiiIiiII[IiiiiiiiIIIII] = new iIIIIiiiIiiIi(this, IiiiiiiiIIIII, true);
            this.iiIiIiiiIiiII[IiiiiiiiIIIII].setBounds(47 + IiiiiiiiIIIII % 3 * 203, 82 + IiiiiiiiIIIII / 3 * 61, 200, 56);
            this.IIIIIiiiIIIII.add((Component)this.iiIiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        IIiiIiiiIiiiI[] IiiiiiiiIIIII2 = new IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new IIiiIiiiIiiiI(IiiiiiiiIIIII3 == 0 ? "sc/e/47.png" : "sc/e/48.png", 1, IiiiiiiiIIIII3, (IiiiIiiiiIiIi)this);
            IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(655, 354 + 42 * IiiiiiiiIIIII3, 18, 18);
            this.IIIIIiiiIIIII.add((Component)IiiiiiiiIIIII2[IiiiiiiiIIIII3++]);
        }
        this.iIiIIiiiIIIii = new iiIIiiiiIiIiI((IiiiIiiiiIiIi)this, 10, 1, 60, 60, 1, 1, 45, 353);
        this.iIiIIiiiIIIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/4.png"));
        this.iIiIIiiiIIIii.iIiIiiiiIIiii(IiiiiiiiIIIII2, 1);
        this.IIIIIiiiIIIII.add((Component)this.iIiIIiiiIIIii);
        this.IiIiiiiiIIIII = new com.xy.w.IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII3] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 >= 0 && IiiiiiiiIIIII3 <= 1) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII3 == 0) {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(44, 53, 612, 21);
                } else if (IiiiiiiiIIIII3 == 1) {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(44, 333, 612, 21);
                }
            } else if (IiiiiiiiIIIII3 >= 2 && IiiiiiiiIIIII3 <= 3) {
                this.IiIiiiiiIIIII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII3 == 2) {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(44, 53, 612, 274);
                } else if (IiiiiiiiIIIII3 == 3) {
                    this.IiIiiiiiIIIII[IiiiiiiiIIIII3].setBounds(44, 333, 612, 80);
                }
            }
            this.IIIIIiiiIIIII.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII3++]);
        }
        this.iiIIiiiiIiIIi = new JLabel[2];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiIIiiiiIiIIi.length) {
            this.iiIIiiiiIiIIi[IiiiiiiiIIIII3] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(42 + 305 * IiiiiiiiIIIII3), (int)54, (int)305, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIIiiiiIiIIi[IiiiiiiiIIIII3].setText(IiiiiiiiIIIII3 == 0 ? "\u51fa\u552e\u8bb0\u5f55" : (IiiiiiiiIIIII3 == 1 ? "\u6536\u8d2d\u8bb0\u5f55" : ""));
            this.iiIIiiiiIiIIi[IiiiiiiiIIIII3].setHorizontalAlignment(0);
            this.iiiIiiiiiiiIi.add(this.iiIIiiiiIiIIi[IiiiiiiiIIIII3++]);
        }
        this.iIIiIiiiiiiIi = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iIIIIiiiiiIIi = new RichLabel("", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.IiiIIiiiiIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)45, (int)74, (int)301, (int)375, (Component)this.iIIiIiiiiiiIi, (int)20);
        this.IiiiIiiiIiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)350, (int)74, (int)301, (int)375, (Component)this.iIIIIiiiiiIIi, (int)20);
        this.iiiIiiiiiiiIi.add(this.IiiIIiiiiIiIi);
        this.iiiIiiiiiiiIi.add(this.IiiiIiiiIiiIi);
        this.IIIiiiiiIIiII = new com.xy.w.IIIiiiiiIiIiI[4];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IIIiiiiiIIiII.length) {
            this.IIIiiiiiIIiII[IiiiiiiiIIIII3] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].setBounds(42, 54, 305, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].setBounds(347, 54, 305, 21);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].setBounds(42, 54, 305, 397);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IIIiiiiiIIiII[IiiiiiiiIIIII3].setBounds(347, 54, 305, 397);
            }
            this.iiiIiiiiiiiIi.add((Component)this.IIIiiiiiIIiII[IiiiiiiiIIIII3++]);
        }
        this.IiIIiiiiIIIII = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.IiIIiiiiIIIII.setBounds(35, 29, 611, 20);
        this.add((Component)this.IiIIiiiiIIIII);
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(int type) {
        block8: {
            block7: {
                if (type == 2) {
                    return;
                }
                this.IiiiiiiiIIIII = type;
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < this.IIiIiiiiIIiII.length) {
                    this.IIiIiiiiIIiII[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiiiiiiiIIIII);
                    ++IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = 0;
                if (type != 0) break block7;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl21
            }
            if (type != 1) break block8;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl27
            do {
                if ((IiiiiiiiIIIII = this.iIIIiiiiIiiiI.getGoodstables()[IiiiiiiiIIIII]) != null) {
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII++].ALLATORIxDEMO(IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
lbl21:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIIIiiiiIiiiI.getGoodstables().length);
            break block8;
            do {
                if ((IiiiiiiiIIIII = this.iIIIiiiiIiiiI.getPets()[IiiiiiiiIIIII]) != null) {
                    this.iIiiIiiiIiIIi[IiiiiiiiIIIII++].ALLATORIxDEMO(IiiiiiiiIIIII);
                }
                ++IiiiiiiiIIIII;
lbl27:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIIIiiiiIiiiI.getPets().length);
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII++].ALLATORIxDEMO(null);
        }
        this.iiiIiiiiiiIIi();
    }

    public void IiiIiiiiiiIiI() {
        this.IiiIIiiiiiiiI = 0;
        this.iIiIiiiiIIiii(this.IiiIIiiiiiiiI);
        this.ALLATORIxDEMO((StallNeedBean)null);
    }

    public void iiiIiiiiiiIIi(int type) {
        if (type == 1 && !this.ALLATORIxDEMO().gamePawn) {
            return;
        }
        this.IiIIIiiiiiiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.IiIIIiiiiiiiI);
            ++IiiiiiiiIIIII;
        }
        if (type == 0) {
            this.iiIIIiiiIiIii.iIiIiiiiIIiii();
        }
        if (type == 1) {
            this.IiiIiiiiiiIiI();
        }
        this.IiiiIiiiIiIII.setVisible(type == 0);
        this.IIIIIiiiIIIII.setVisible(type == 1);
        this.iiiIiiiiiiiIi.setVisible(type == 2);
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiIi() {
        if (this.IiIIIiiiiiiiI != 1) return;
        this.iiiiiiiiIIiii();
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (textField == this.iIiiIiiiiIiiI) {
            if (number < 0L) return 0L;
            if (this.iiIiiiiiiIIiI == null) {
                return 0L;
            }
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiIIIiiiiIiiI.ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            if (IiiiiiiiIIIII == null) {
                return 0L;
            }
            long IiiiiiiiIIIII2 = Math.min(IiiiiiiiIIIII.getUsetime(), this.iiIiiiiiiIIiI.getTotal() - this.iiIiiiiiiIIiI.getNum());
            if (number <= IiiiiiiiIIIII2) return null;
            return IiiiiiiiIIIII2;
        }
        if (number < 0L) return 0L;
        if (this.iiIiiiiiiiIii == null) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getGold().longValue() / this.iiIiiiiiiiIii.getMoney();
        IiiiiiiiIIIII = Math.min(IiiiiiiiIIIII, (long)(this.iiIiiiiiiiIii.getGood() != null ? this.iiIiiiiiiiIii.getGood().getUsetime() : 1));
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(Stall stall) {
        boolean IiiiiiiiIIIII = this.iIIIiiiiIiiiI != null && this.iIIIiiiiIiiiI.getId() == stall.getId();
        StallNeedBean IiiiiiiiIIIII2 = IiiiiiiiIIIII ? this.iiIiiiiiiIIiI : null;
        this.iIIIiiiiIiiiI = stall;
        this.IIiIIiiiiiIII.setText(stall.getStall());
        boolean IiiiiiiiIIIII3 = stall.ALLATORIxDEMO(0);
        boolean IiiiiiiiIIIII4 = stall.ALLATORIxDEMO(1);
        boolean IiiiiiiiIIIII5 = stall.ALLATORIxDEMO(2);
        boolean IiiiiiiiIIIII6 = stall.ALLATORIxDEMO(3);
        this.IIiIiiiiIIiII[0].setBtn(IiiiiiiiIIIII3 ? 2 : -1, IiiiiiiiIIIII3 ? "sc/e/61.png" : "sc/e/74.png");
        this.IIiIiiiiIIiII[1].setBtn(IiiiiiiiIIIII4 ? 2 : -1, IiiiiiiiIIIII4 ? "sc/e/61.png" : "sc/e/74.png");
        this.IIiIiiiiIIiII[2].setBtn(IiiiiiiiIIIII5 ? 2 : -1, IiiiiiiiIIIII5 ? "sc/e/61.png" : "sc/e/74.png");
        if (IiiiiiiiIIIII3) {
            this.iIiIiiiiIIiIi(0);
        } else if (IiiiiiiiIIIII4) {
            this.iIiIiiiiIIiIi(1);
        } else {
            IIIIIiiiIIIiI iIIIIiiiIIIiI = this;
            if (IiiiiiiiIIIII5) {
                iIIIIiiiIIIiI.iIiIiiiiIIiIi(2);
            } else {
                iIIIIiiiIIIiI.IIiIiiiiIIiII[0].setBtn(2, "sc/e/61.png");
                this.iIiIiiiiIIiIi(0);
            }
        }
        int IiiiiiiiIIIII7 = this.IiIIIiiiiiiiI;
        if (IiiiiiiiIIIII7 == 1 && !IiiiiiiiIIIII6) {
            IiiiiiiiIIIII7 = 0;
        }
        this.iiiIiiiiiiIIi(IiiiiiiiIIIII7);
        if (IiiiiiiiIIIII && IiiiiiiiIIIII7 == 1 && IiiiiiiiIIIII2 != null && (IiiiiiiiIIIII2 = stall.getStallNeedBean(IiiiiiiiIIIII2.getId())) != null && IiiiiiiiIIIII2.getTotal() > IiiiiiiiIIIII2.getNum()) {
            this.ALLATORIxDEMO(IiiiiiiiIIIII2);
        }
        if (stall.getId() == 0) {
            this.IIIiiiiiiIiiI.setVisible(false);
            this.iIiiIiiiiiiII.setVisible(false);
            this.iiIiIiiiiIIII.setVisible(false);
        } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)stall.getRoleid(), (BigDecimal)this.ALLATORIxDEMO().getLoginResult().getRole_id())) {
            this.IIIiiiiiiIiiI.setText("\u6536\u644a");
            this.IIIiiiiiiIiiI.setVisible(true);
            this.iIiiIiiiiiiII.setVisible(false);
            this.iiIiIiiiiIIII.setVisible(true);
        } else {
            this.IIIiiiiiiIiiI.setText("\u8d2d\u4e70");
            this.IIIiiiiiiIiiI.setVisible(true);
            this.iIiiIiiiiiiII.setVisible(true);
            this.iiIiIiiiiIIII.setVisible(false);
        }
        this.ALLATORIxDEMO(stall);
        this.ALLATORIxDEMO((Commodity)null);
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) != null) return;
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi() {
        block5: {
            block4: {
                if (this.iiIiiiiiiiIii == null || this.IiIIIiiiiiiiI != 0) break block4;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl14
            }
            if (this.iiIiiiiiiIIiI == null || this.IiIIIiiiiiiiI != 1) break block5;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl22
            do {
                if (iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.iIiiIiiiIiIIi[IiiiiiiiIIIII]) != null && iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.iIiiIiiiIiIIi[IiiiiiiiIIIII]) == this.iiIiiiiiiiIii) {
                    this.IIIIIiiiIiIIi.setBounds(this.iIiiIiiiIiIIi[IiiiiiiiIIIII].getX() - 1, this.iIiiIiiiIiIIi[IiiiiiiiIIIII].getY() - 1, this.iIiiIiiiIiIIi[IiiiiiiiIIIII].getWidth() + 2, this.iIiiIiiiIiIIi[IiiiiiiiIIIII].getHeight() + 2);
                    this.IIIIIiiiIiIIi.setVisible(true);
                    return;
                }
                ++IiiiiiiiIIIII;
lbl14:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length);
            break block5;
            do {
                if (iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.iiIiIiiiIiiII[IiiiiiiiIIIII]) != null && iIIIIiiiIiiIi.ALLATORIxDEMO((iIIIIiiiIiiIi)this.iiIiIiiiIiiII[IiiiiiiiIIIII]) == this.iiIiiiiiiIIiI) {
                    this.IIIIIiiiIiIIi.setBounds(this.iiIiIiiiIiiII[IiiiiiiiIIIII].getX() - 1, this.iiIiIiiiIiiII[IiiiiiiiIIIII].getY() - 1, this.iiIiIiiiIiiII[IiiiiiiiIIIII].getWidth() + 2, this.iiIiIiiiIiiII[IiiiiiiiIIIII].getHeight() + 2);
                    this.IIIIIiiiIiIIi.setVisible(true);
                    return;
                }
                ++IiiiiiiiIIIII;
lbl22:
                // 2 sources

            } while (IiiiiiiiIIIII < this.iiIiIiiiIiiII.length);
        }
        this.IIIIIiiiIiIIi.setVisible(false);
    }

    public void ALLATORIxDEMO(Commodity commodity) {
        this.iiIiiiiiiiIii = commodity;
        if (commodity == null) {
            this.IiIIIiiiIiiIi.ALLATORIxDEMO(0, null);
            this.IiIiiiiiiiiIi[1].setText("");
            this.IIiiiiiiIiiII.setText("");
            this.iiiIiiiiiiIIi();
            return;
        }
        if (commodity.getGood() != null) {
            this.IiIIIiiiIiiIi.ALLATORIxDEMO(18, (Object)commodity.getGood());
        } else if (commodity.getPet() != null) {
            this.IiIIIiiiIiiIi.ALLATORIxDEMO(21, (Object)commodity.getPet());
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIiiiiiiiiIi[1], (long)commodity.getMoney());
        this.IIiiiiiiIiiII.setText("1");
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (textField == this.iIiiIiiiiIiiI) {
            if (this.iiIiiiiiiIIiI != null && number > 0L) {
                iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIIIiiiiiiiII[0], (long)(this.iiIiiiiiiIIiI.getMoney() * number));
                return;
            }
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IIIIiiiiiiiII[0], (long)0L);
            return;
        }
        if (this.iiIiiiiiiiIii != null && number > 0L) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIiiiiiiiiIi[0], (long)(this.iiIiiiiiiiIii.getMoney() * number));
            return;
        }
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.IiIiiiiiiiiIi[0], (long)0L);
    }

    public void iIiIiiiiIIiii(int page) {
        int IiiiiiiiIIIII = (this.iIIIiiiiIiiiI.getNeedNum() - 1) / this.iiIiIiiiIiiII.length;
        page = Math.max(0, page);
        page = Math.min(IiiiiiiiIIIII, page);
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = page * this.iiIiIiiiIiiII.length;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII3 + this.iiIiIiiiIiiII.length;
        List IiiiiiiiIIIII5 = this.iIIIiiiiIiiiI.getNeeds();
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII5.size() : 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII7 && IiiiiiiiIIIII2 < IiiiiiiiIIIII4) {
            StallNeedBean IiiiiiiiIIIII8 = (StallNeedBean)IiiiiiiiIIIII5.get(IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII8.getNum() < IiiiiiiiIIIII8.getTotal()) {
                if (IiiiiiiiIIIII2 >= IiiiiiiiIIIII3) {
                    this.iiIiIiiiIiiII[IiiiiiiiIIIII2 - IiiiiiiiIIIII3].ALLATORIxDEMO(IiiiiiiiIIIII8);
                }
                ++IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII6;
        }
        IiiiiiiiIIIII6 = Math.max(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4) {
            int n = IiiiiiiiIIIII6 - IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII6;
            this.iiIiIiiiIiiII[n].ALLATORIxDEMO(null);
        }
        this.iiiiiiiiIIiii();
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Stall stall) {
        block7: {
            block6: {
                v0 = IiiiiiiiIIIII = stall != null ? stall.getId() : 0;
                if (IiiiiiiiIIIII == 0) {
                    this.iIIiIiiiiiiIi.setTextSize("", 285);
                    return;
                }
                IiiiiiiiIIIII = stall.getMsg();
                IiiiiiiiIIIII = stall.getMsg2();
                if (IiiiiiiiIIIII == null) break block6;
                IiiiiiiiIIIII = new StringBuffer(128 * IiiiiiiiIIIII.size());
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = IiiiiiiiIIIII.size();
                if (true) ** GOTO lbl22
            }
            this.iIIiIiiiiiiIi.setTextSize("", 285);
            break block7;
            do {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("#r");
                }
                v1 = IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                this.ALLATORIxDEMO((String)v1, IiiiiiiiIIIII);
lbl22:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            this.iIIiIiiiiiiIi.setTextSize(IiiiiiiiIIIII.toString(), 285);
            IiiiiiiiIIIII = this.IiiIIiiiiIiIi.getVerticalScrollBar();
            IiiiiiiiIIIII.setMaximum(this.iIIiIiiiiiiIi.getHeight());
            IiiiiiiiIIIII.setValue(IiiiiiiiIIIII.getMaximum());
        }
        if (IiiiiiiiIIIII == null) {
            this.iIIIIiiiiiIIi.setTextSize("", 285);
            return;
        }
        IiiiiiiiIIIII = new StringBuffer(128 * IiiiiiiiIIIII.size());
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = IiiiiiiiIIIII.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("#r");
            }
            v2 = IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            this.iIiIiiiiIIiii((String)v2, IiiiiiiiIIIII);
        }
        this.iIIIIiiiiiIIi.setTextSize(IiiiiiiiIIIII.toString(), 285);
        IiiiiiiiIIIII = this.IiiiIiiiIiiIi.getVerticalScrollBar();
        IiiiiiiiIIIII.setMaximum(this.iIIIIiiiiiIIi.getHeight());
        IiiiiiiiIIIII.setValue(IiiiiiiiIIIII.getMaximum());
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void ALLATORIxDEMO(Goodstable good, int num) {
        this.IiIIIiiiiIiiI.ALLATORIxDEMO(1, (Object)good);
        this.iIiiIiiiiIiiI.setText(String.valueOf(num));
    }
}
