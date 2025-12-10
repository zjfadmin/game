/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIIiiiiIIIii
 *  com.xy.a.q.IIIiiiiiiiiIi
 *  com.xy.a.q.iIiIiiiiIIiIi
 *  com.xy.a.q.iiIIIiiiIIiII
 *  com.xy.bean.QuackGameBean
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.IIIIiiiiIIIii;
import com.xy.a.q.IIIiiiiiiiiIi;
import com.xy.a.q.iIiIiiiiIIiIi;
import com.xy.a.q.iiIIIiiiIIiII;
import com.xy.bean.QuackGameBean;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class IIIiIiiiIiIii
extends IiiiIiiiiIiIi {
    private iIIiIiiiIiiIi IIiiiiiiIiiII;
    private int IiiiIiiiIiIII;
    private String IIiiiiiiiIIIi;
    private int[] IIIiiiiiIIiII;
    private int iiIiiiiiiIIiI = 1;
    private JLabel[] iIiiIiiiIiIIi;
    private IIIIiiiiIIIii[] iiiiIiiiIIiii;
    private iiIiIiiiiIiIi iIIiIiiiiiiIi;
    private int IIIIiiiiiiiII = 0;
    private String[] iiIIIiiiiiiiI;
    private boolean IiIiiiiiIIIII = true;
    private boolean iiIiIiiiiIIIi = false;
    private IiiiiiiiiIIII[] iiiIiiiiiiiIi;
    private com.xy.q.IIIiiiiiIiIiI iIiiIiiiiiiII;
    private BigDecimal IIiiIiiiIIiIi;
    private IIIiiiiiIiIiI[] iIiIiiiiIiIii;
    private BigDecimal IiIIIiiiiIiiI;
    private com.xy.q.IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private List<IiiiiiiiiIIII> IiiiiiiiIIIII;
    private MoneyType ALLATORIxDEMO;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public void ALLATORIxDEMO(int i, int num, String text, boolean keep) {
        IiiiiiiiiIIII IiiiiiiiIIIII;
        try {
            IiiiiiiiiIIII iiiiiiiiiIIII = IiiiiiiiIIIII = i < this.IiiiiiiiIIIII.size() ? this.IiiiiiiiIIIII.get(i) : null;
        }
        catch (Exception IiiiiiiiIIIII2) {
            IiiiiiiiIIIII2.printStackTrace();
            return;
        }
        {
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new IiiiiiiiiIIII("sc/e/38.png", 2, 230, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, "", (IiiiIiiiiIiIi)this);
                this.IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                this.add((Component)IiiiiiiiIIIII, 0);
            }
            IiiiiiiiIIIII.setText(text);
            IiiiiiiiIIIII.ALLATORIxDEMO((Object)num);
            IiiiiiiiIIIII.setKeep(keep);
            IiiiiiiiIIIII.setBounds(61 + 102 * i, 27, 95, 33);
            IiiiiiiiIIIII.setVisible(true);
            return;
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiIiiiIiIii arg0, boolean arg1) {
        arg0.IiIiiiiiIIIII = arg1;
    }

    public void iiiIiiiiiiIIi(int id) {
        Serializable IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        Goodstable IiiiiiiiIIIII3;
        if (id == 231) {
            if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            List IiiiiiiiIIIII4 = (List)this.ALLATORIxDEMO().ALLATORIxDEMO().getNpcShopMap().get(String.valueOf(499 + this.iiIiiiiiiIIiI));
            if (IiiiiiiiIIIII4 == null) {
                return;
            }
            IIIiiiiiiiiIi IiiiiiiiIIIII5 = (IIIiiiiiiiiIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(88);
            IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII4, this.IIiiiiiiiIIIi);
            this.ALLATORIxDEMO().iIiIiiiiIIiIi(88);
            return;
        }
        if (id != 232) {
            if (id != 233) return;
        }
        if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
            return;
        }
        if (this.iiIIIiiiiiiiI != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0a\u4e00\u6b21\u5956\u90fd\u8fd8\u6ca1\u6709\u62bd\u5b8c\uff0c\u8bf7\u7b49\u4e00\u4e0b\u5427\uff01\uff01");
            return;
        }
        this.iiiIiiiiiiIIi();
        RoleData IiiiiiiiIIIII6 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII7 = id == 232 ? 10 : 11;
        IiiiiiiiIIIII7 %= 10;
        Goodstable goodstable = IiiiiiiiIIIII3 = this.IIiiIiiiIIiIi != null ? IiiiiiiiIIIII6.ALLATORIxDEMO(this.IIiiIiiiIIiIi) : null;
        if (this.IiIiiiiiIIIII) {
            if (this.IiIIIiiiiIiiI == null) {
                this.IiIIIiiiiIiiI = new BigDecimal(0);
            }
            IiiiiiiiIIIII2 = IiiiiiiiIIIII7 == 0 ? 1 : 10;
            if ((IiiiiiiiIIIII2 -= IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getUsetime() : 0) > 0) {
                IiiiiiiiIIIII = new BigDecimal(this.IiIIIiiiiIiiI.longValue() * (long)IiiiiiiiIIIII2);
                if (this.IIIIiiiiiiiII == 0) {
                    if (IiiiiiiiIIIII6.getLoginResult().getCodecard().compareTo((BigDecimal)IiiiiiiiIIIII) < 0) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8db3\u591f\u7684\u4ed9\u7389\u4e86\uff01\uff01");
                        return;
                    }
                } else if (this.IIIIiiiiiiiII == 1) {
                    if (IiiiiiiiIIIII6.getLoginResult().getGold().compareTo((BigDecimal)IiiiiiiiIIIII) < 0) {
                        this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8db3\u591f\u7684\u5927\u8bdd\u5e01\u4e86\uff01\uff01");
                        return;
                    }
                } else if (this.IIIIiiiiiiiII == 2 && IiiiiiiiIIIII6.getLoginResult().getSavegold().compareTo((BigDecimal)IiiiiiiiIIIII) < 0) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u8db3\u591f\u7684\u7ed1\u7389\u4e86\uff01\uff01");
                    return;
                }
            }
        } else if (IiiiiiiiIIIII3 == null || IiiiiiiiIIIII3.getUsetime() < (IiiiiiiiIIIII7 == 0 ? 1 : 10)) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u4f60\u6ca1\u6709\u62bd\u5956\u5238\uff0c\u5feb\u53bb\u8d2d\u4e70\u5427\uff01\uff01");
            return;
        }
        if ((IiiiiiiiIIIII2 = IiiiiiiiIIIII6.getGoodPackSum(-1L, new BigDecimal(-1), IiiiiiiiIIIII7 == 0 ? 1 : 12)) < (IiiiiiiiIIIII7 == 0 ? 1 : 12)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u80cc\u5305\u5df2\u6ee1");
            return;
        }
        IiiiiiiiIIIII = new StringBuffer();
        ((StringBuffer)IiiiiiiiIIIII).append("C");
        ((StringBuffer)IiiiiiiiIIIII).append(this.iiIiiiiiiIIiI);
        ((StringBuffer)IiiiiiiiIIIII).append("|" + IiiiiiiiIIIII7);
        ((StringBuffer)IiiiiiiiIIIII).append("|" + (this.IiIiiiiiIIIII ? 1 : 0));
        if (IiiiiiiiIIIII3 != null) {
            int IiiiiiiiIIIII8 = 0;
            int IiiiiiiiIIIII9 = 0;
            while (IiiiiiiiIIIII9 < IiiiiiiiIIIII3.getUsetime() && IiiiiiiiIIIII9 < (IiiiiiiiIIIII7 == 0 ? 1 : 10)) {
                ++IiiiiiiiIIIII8;
                ++IiiiiiiiIIIII9;
                ((StringBuffer)IiiiiiiiIIIII).append("|" + IiiiiiiiIIIII3.getRgid());
            }
            this.IIiiiiiiIiiII.setText(String.valueOf(IiiiiiiiIIIII3.getUsetime() - IiiiiiiiIIIII8));
        }
        String IiiiiiiiIIIII10 = Agreement.getSendTextAES((String)"getfivemsg", (String)((StringBuffer)IiiiiiiiIIIII).toString());
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII10);
        this.iiIiIiiiiIIIi = true;
    }

    public boolean ALLATORIxDEMO() {
        if (this.iiIIIiiiiiiiI == null) return super.ALLATORIxDEMO();
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6b63\u5728\u62bd\u5956\uff0c\u8bf7\u52ff\u5207\u6362\u9762\u677f\uff01\uff01");
        return false;
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII].ALLATORIxDEMO(null, 0);
            this.IIIiiiiiIIiII[IiiiiiiiIIIII++] = 0;
        }
        this.IiiiIiiiIiIII = 0;
    }

    public void ALLATORIxDEMO(QuackGameBean gameBean) {
        CharSequence IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.IiiiiiiiIIIII.size()) {
            IiiiiiiiiIIII iiiiiiiiiIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            iiiiiiiiiIIII.setVisible(false);
        }
        String IiiiiiiiIIIII22 = gameBean.getPetmsg();
        String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII22.split("\\|");
        int IiiiiiiiIIIII4 = 0;
        this.iiIiiiiiiIIiI = 1;
        this.IIiiiiiiiIIIi = null;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII3.length) {
            if (IiiiiiiiIIIII3[IiiiiiiiIIIII5].startsWith("Y")) {
                int IiiiiiiiIIIII6 = IiiiiiiiIIIII3[IiiiiiiiIIIII5].indexOf("-");
                this.IIiiiiiiiIIIi = String.valueOf(IiiiiiiiIIIII3[IiiiiiiiIIIII5].substring(IiiiiiiiIIIII6 + 1)) + "\u79ef\u5206";
                this.iiIiiiiiiIIiI = Integer.parseInt(IiiiiiiiIIIII3[IiiiiiiiIIIII5].substring(1, IiiiiiiiIIIII6));
                IiiiiiiiIIIII = null;
                if (this.iiIiiiiiiIIiI == 1) {
                    IiiiiiiiIIIII = "\u4ed9\u7389\u62bd\u5956";
                } else if (this.iiIiiiiiiIIiI == 2) {
                    IiiiiiiiIIIII = "\u7ed1\u7389\u62bd\u5956";
                } else if (this.iiIiiiiiiIIiI == 3) {
                    IiiiiiiiIIIII = "\u91d1\u5e01\u62bd\u5956";
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII5, this.iiIiiiiiiIIiI, (String)IiiiiiiiIIIII, true);
            } else if (IiiiiiiiIIIII3[IiiiiiiiIIIII5].startsWith("N")) {
                int IiiiiiiiIIIII7 = IiiiiiiiIIIII3[IiiiiiiiIIIII5].indexOf("-");
                IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII3[IiiiiiiiIIIII5].substring(1, IiiiiiiiIIIII7));
                IiiiiiiiIIIII = null;
                if (IiiiiiiiIIIII7 == 1) {
                    IiiiiiiiIIIII = "\u4ed9\u7389\u62bd\u5956";
                } else if (IiiiiiiiIIIII7 == 2) {
                    IiiiiiiiIIIII = "\u7ed1\u7389\u62bd\u5956";
                } else if (IiiiiiiiIIIII7 == 3) {
                    IiiiiiiiIIIII = "\u91d1\u5e01\u62bd\u5956";
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII5, IiiiiiiiIIIII7, (String)IiiiiiiiIIIII, false);
            } else {
                Goodstable IiiiiiiiIIIII8 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII3[IiiiiiiiIIIII5]));
                if (IiiiiiiiIIIII8 != null) {
                    com.xy.q.IIIiiiiiIiIiI iIIiiiiiIiIiI = this.iiIiiiiiiiIii[IiiiiiiiIIIII4];
                    ++IiiiiiiiIIIII4;
                    iIIiiiiiIiIiI.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII8);
                }
            }
            ++IiiiiiiiIIIII5;
        }
        this.ALLATORIxDEMO.setIdAndKey(0, this.IIiiiiiiiIIIi);
        this.iIIiIiiiiiiIi.iIiIiiiiIIiii();
        this.IiIIIiiiiIiiI = gameBean.getMoney();
        this.IIIIiiiiiiiII = 0;
        this.IIiiIiiiIIiIi = null;
        if (gameBean.getPetmsg2() != null) {
            IiiiiiiiIIIII5 = gameBean.getPetmsg2().indexOf("|");
            this.IIIIiiiiiiiII = Integer.parseInt(gameBean.getPetmsg2().substring(0, IiiiiiiiIIIII5));
            String IiiiiiiiIIIII9 = gameBean.getPetmsg2().substring(IiiiiiiiIIIII5 + 1, gameBean.getPetmsg2().length());
            this.IIiiIiiiIIiIi = !IiiiiiiiIIIII9.equals("null") ? new BigDecimal(IiiiiiiiIIIII9) : null;
            IiiiiiiiIIIII = new StringBuffer();
            ((StringBuffer)IiiiiiiiIIIII).append("\u5f53\u7269\u54c1\u4e0d\u8db3\u65f6\u6d88\u8017");
            ((StringBuffer)IiiiiiiiIIIII).append(this.IiIIIiiiiIiiI);
            ((StringBuffer)IiiiiiiiIIIII).append(this.IIIIiiiiiiiII == 0 ? "\u4ed9\u7389" : (this.IIIIiiiiiiiII == 1 ? "\u5927\u8bdd\u5e01" : "\u7ed1\u7389"));
            ((StringBuffer)IiiiiiiiIIIII).append("\u4ee3\u66ff");
            this.iIiiIiiiIiIIi[2].setText(((StringBuffer)IiiiiiiiIIIII).toString());
        } else {
            this.iIiiIiiiIiIIi[2].setText("\u5f53\u7269\u54c1\u4e0d\u8db3\u65f6\u6d88\u8017" + gameBean.getMoney() + "\u4ed9\u7389\u4ee3\u66ff");
        }
        Goodstable IiiiiiiiIIIII32 = this.IIiiIiiiIIiIi != null ? this.ALLATORIxDEMO().ALLATORIxDEMO(this.IIiiIiiiIIiIi) : null;
        IIIiIiiiIiIii iIIiIiiiIiIii = this;
        if (IiiiiiiiIIIII32 != null) {
            iIIiIiiiIiIii.iIiiIiiiiiiII.ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII32);
            this.IIiiiiiiIiiII.setText(String.valueOf(this.ALLATORIxDEMO().getGoodNum(this.IIiiIiiiIIiIi)));
            return;
        }
        iIIiIiiiIiIii.iIiiIiiiiiiII.ALLATORIxDEMO(0, (Object)IiiiiiiiIIIII32);
        this.IIiiiiiiIiiII.setText(null);
    }

    protected void paintChildren(Graphics g) {
        int IiiiiiiiIIIII;
        super.paintChildren(g);
        if (this.iiIiIiiiiIIIi) {
            iiIIIiiiIIiII.iiIiIiiiiIIIi.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.length) {
                if (this.IIIiiiiiIIiII[IiiiiiiiIIIII] == 1) {
                    iiIIIiiiIIiII.iiIiIiiiiIIIi.ALLATORIxDEMO(g, this.iiiiIiiiIIiii[IiiiiiiiIIIII].getX() + IIIIiiiiIIIii.ALLATORIxDEMO((IIIIiiiiIIIii)this.iiiiIiiiIIiii[IiiiiiiiIIIII]).getX() + 3, this.iiiiIiiiIIiii[IiiiiiiiIIIII].getY() + IIIIiiiiIIIii.ALLATORIxDEMO((IIIIiiiiIIIii)this.iiiiIiiiIIiii[IiiiiiiiIIIII]).getY() + 2);
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (this.iiIIIiiiiiiiI == null) return;
        if (this.IiiiIiiiIiIII % 15 == 0) {
            IiiiiiiiIIIII = this.IiiiIiiiIiIII / 15;
            String[] IiiiiiiiIIIII2 = this.iiIIIiiiiiiiI[IiiiiiiiIIIII].split("_");
            Goodstable IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO(new BigDecimal(IiiiiiiiIIIII2[0]));
            if (IiiiiiiiIIIII3 != null) {
                this.iiiiIiiiIIiii[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII3, Integer.parseInt(IiiiiiiiIIIII2[1]));
                this.IIIiiiiiIIiII[IiiiiiiiIIIII] = Integer.parseInt(IiiiiiiiIIIII2[2]);
                if (this.IIIiiiiiIIiII[IiiiiiiiIIIII] == 1) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u83b7\u5f97\u4e86\u6570\u91cf\u4e3a" + IiiiiiiiIIIII2[1] + "\u7684" + IiiiiiiiIIIII3.getGoodsname());
                }
            } else {
                System.out.println(IiiiiiiiIIIII2[0]);
            }
            if (IiiiiiiiIIIII >= this.iiIIIiiiiiiiI.length - 1) {
                this.iiIIIiiiiiiiI = null;
            }
        }
        ++this.IiiiIiiiIiIII;
    }

    public void ALLATORIxDEMO(String[] drawGoods) {
        this.iiIIIiiiiiiiI = drawGoods;
    }

    public void iIiIiiiiIIiii(int type) {
        if (this.iiIIIiiiiiiiI == null) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"getfivemsg", (String)("CC" + type));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            this.iiiIiiiiiiIIi();
            this.iiIiIiiiiIIIi = false;
            return;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6b63\u5728\u62bd\u5956\uff0c\u8bf7\u52ff\u5207\u6362\u9762\u677f\uff01\uff01");
    }

    public IIIiIiiiIiIii(GameView gameView) {
        super(87, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 653, 479, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), " \u62bd \u5956 ");
        this.IiiiiiiiIIIII = new ArrayList<IiiiiiiiiIIII>();
        this.IIIiiiiiIIiII = new int[12];
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/28.png", 1, 231 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u79ef\u5206\u5151\u6362" : (IiiiiiiiIIIII == 1 ? "\u62bd\u5956" : (IiiiiiiiIIIII == 2 ? "\u5341\u8fde\u62bd\u5956" : (IiiiiiiiIIIII == 3 ? "\uff1f" : ""))), (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(538, 32, 68, 17);
            if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/7.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(289, 394, 59, 25);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/26.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(359, 394, 99, 25);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setForeground(Color.black);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiiiIiiiIiiII);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setImage("sc/e/40.png");
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(603, 195, 18, 18);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new com.xy.q.IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(302 + IiiiiiiiIIIII * 65, 91, 50, 50);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiIiIIi = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)386, (int)31, (int)72, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5f53\u524d\u79ef\u5206" : (IiiiiiiiIIIII == 1 ? "\u62e5\u6709\u7269\u54c1" : (IiiiiiiiIIIII == 2 ? "\u5f53\u7269\u54c1\u4e0d\u8db3\u65f6\u6d88\u8017666\u4ed9\u7389\u4ee3\u66ff" : "")));
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iIiiIiiiIiIIi[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setBounds(289, 372, 60, 19);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iIIiiiiiiIIII);
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII].setBounds(309, 422, 300, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new MoneyType();
        this.ALLATORIxDEMO.setIdAndKey(1, "\u91d1\u94b1");
        this.iIIiIiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)456, (int)31, (int)150, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.ALLATORIxDEMO, (GameView)gameView);
        this.IIiiiiiiIiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)346, (int)372, (int)112, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IIiiiiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(2);
        this.add((Component)this.IIiiiiiiIiiII);
        this.add((Component)this.iIIiIiiiiiiIi);
        this.iIiiIiiiiiiII = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(212, 381, 43, 43);
        this.add((Component)this.iIiiIiiiiiiII);
        this.iiiiIiiiIIiii = new IIIIiiiiIIIii[12];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIIiii.length) {
            this.iiiiIiiiIIiii[IiiiiiiiIIIII] = new IIIIiiiiIIIii(this);
            this.iiiiIiiiIIiii[IiiiiiiiIIIII].setBounds(75 + IiiiiiiiIIIII % 6 * 90, 215 + IiiiiiiiIIIII / 6 * 79, 75, 80);
            this.add((Component)this.iiiiIiiiIIiii[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(31, 41, 596, 20);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/b/S79.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(48, 69, 580, 119);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(204, 373, 66, 65);
            } else if (IiiiiiiiIIIII == 3) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/e/30.png");
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(288, 423, 17, 17);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].addMouseListener((MouseListener)new iIiIiiiiIIiIi(this));
            } else if (IiiiiiiiIIIII == 4) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(47, 191, 581, 265);
            }
            this.add((Component)this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii() {
        super.iIiIiiiiIIiii();
    }

    static /* synthetic */ IIIiiiiiIiIiI[] ALLATORIxDEMO(IIIiIiiiIiIii arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    static /* synthetic */ boolean ALLATORIxDEMO(IIIiIiiiIiIii arg0) {
        return arg0.IiIiiiiiIIIII;
    }
}
