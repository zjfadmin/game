/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIIIiI
 *  com.xy.a.IIiIiiiiIIiii
 *  com.xy.a.IiIIIiiiiiiIi
 *  com.xy.a.IiiiiiiiiIIII
 *  com.xy.a.i.IiiIiiiiIIIIi
 *  com.xy.bean.Commodity
 *  com.xy.bean.Stall
 *  com.xy.bean.StallBean
 *  com.xy.bean.StallNeedBean
 *  com.xy.d.iiIIiiiiIiiII
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IIiiIiiiiIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.IiiiiiiiiIIII
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.StallBuyData
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.a.IIIIIiiiIIIiI;
import com.xy.a.IIiIiiiiIIiii;
import com.xy.a.IiIIIiiiiiiIi;
import com.xy.a.IiiiiiiiiIIII;
import com.xy.a.i.IiiIiiiiIIIIi;
import com.xy.bean.Commodity;
import com.xy.bean.Stall;
import com.xy.bean.StallBean;
import com.xy.bean.StallNeedBean;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.q.IIIiiiiiIiIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IIiiIiiiiIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StallBuyData;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiiIIi
extends IiiiIiiiiIiIi {
    private IIIiiiiiIiIiI IIiIIiiiIiiII;
    private IiiIiiiiIIIIi IIIIIiiiIIIII;
    private IiiiIiiiiIiII IiiIiiiiIIiiI;
    private iiIiIiiiiIiIi IiIiiiiiiiiIi;
    private IIiIIiiiIIIiI IiIIIiiiIiiIi;
    private IIiIIiiiIIIiI IIIiiiiiiIiiI;
    private IiiiIiiiiIiII IIiIiiiiIiiiI;
    private com.xy.i.IIIIIiiiIIIiI IiiiIiiiIiiIi;
    private IIiIIiiiIIIiI iiIIIiiiIiIii;
    private JComponent IIiIiiiiIIiII;
    private int iIiiIiiiiIiiI;
    private IiiiIiiiiIiII iiIiiiiiiiiiI;
    private MoneyType iiIiIiiiiIIII;
    private com.xy.w.IIIiiiiiIiIiI[] IiIIIiiiiiiiI;
    private com.xy.i.IIIIIiiiIIIiI iIiIIiiiIIIii;
    private com.xy.i.IIIIIiiiIIIiI[] IIIIIiiiIiIIi;
    private JComponent iiIIiiiiIiIIi;
    private IIIiiiiiIiIiI IiIIiiiiIIIII;
    private iiIiIiiiiIiIi iIIIIiiiiiIIi;
    private com.xy.i.IIIIIiiiIIIiI[] IiiIIiiiiiiiI;
    private com.xy.w.IIIiiiiiIiIiI IIiiiiiiIiiII;
    private IiiIiiiiIIIIi IiiiIiiiIiIII;
    private int IIiiiiiiiIIIi;
    private com.xy.i.IIIIIiiiIIIiI IIIiiiiiIIiII;
    private IIiiIiiiIiiiI[] iiIiiiiiiIIiI;
    private IiiiIiiiiIiII iIiiIiiiIiIIi;
    private iIIiIiiiIiiIi iiiiIiiiIIiii;
    private iIIiIiiiIiiIi iIIiIiiiiiiIi;
    private IiiiIiiiiIiII IIIIiiiiiiiII;
    private com.xy.q.IiiiiiiiiIIII iiIIIiiiiiiiI;
    private Stall IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi;
    private com.xy.q.IiiiiiiiiIIII iiiiIiiiIiiII;
    private JLabel[] iiiIiiiiiiiIi;
    private IIiIiiiiIIiii[] iIiiIiiiiiiII;
    private IiiiIiiiiIiII IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private com.xy.i.IIIIIiiiIIIiI[] IiIIIiiiiIiiI;
    private com.xy.w.IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private com.xy.i.IIIIIiiiIIIiI[] IiiiiiiiIIIII;
    private IIiIIiiiIIIiI ALLATORIxDEMO;

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        long l;
        if (this.IIiiIiiiIIiIi == textField || this.IIiIiiiiIiiiI == textField) {
            if (number < 0L) return 0L;
            if (this.IiIIiiiiIIIII.ALLATORIxDEMO() == 0) {
                return 0L;
            }
            if (this.IIiIiiiiIiiiI != textField) return null;
            if (this.IiIIiiiiIIIII.ALLATORIxDEMO() != 1) return 1L;
            Goodstable IiiiiiiiIIIII = (Goodstable)this.IiIIiiiiIIIII.ALLATORIxDEMO();
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
            }
            long IiiiiiiiIIIII2 = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getUsetime() : 0;
            if (number <= IiiiiiiiIIIII2) return null;
            return IiiiiiiiIIIII2;
        }
        if (this.IIIIiiiiiiiII != textField) {
            if (this.iiIiiiiiiiiiI != textField) return 0L;
        }
        if (number < 0L) return 0L;
        if (this.IIiIIiiiIiiII.ALLATORIxDEMO() == 0) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getGold().longValue();
        if (this.IIIIiiiiiiiII == textField) {
            IiiiiiiiIIIII /= Math.max(1L, this.IIIiiiiiiIiiI.ALLATORIxDEMO());
            l = number;
        } else {
            IiiiiiiiIIIII /= Math.max(1L, this.iiIIIiiiIiIii.ALLATORIxDEMO());
            l = number;
        }
        if (l <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    public void IiiIiiiiiiIiI() {
        Commodity IiiiiiiiIIIII;
        long IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3;
        BigDecimal IiiiiiiiIIIII4;
        Object IiiiiiiiIIIII5;
        int IiiiiiiiIIIII6;
        int IiiiiiiiIIIII7;
        if (!this.iiIIiiiiIiIIi.getClient().gamePawn) {
            return;
        }
        boolean IiiiiiiiIIIII8 = false;
        boolean IiiiiiiiIIIII9 = false;
        RoleData IiiiiiiiIIIII10 = this.ALLATORIxDEMO();
        String IiiiiiiiIIIII11 = null;
        String IiiiiiiiIIIII12 = null;
        String IiiiiiiiIIIII13 = null;
        String IiiiiiiiIIIII14 = null;
        FileInputStream IiiiiiiiIIIII15 = null;
        InputStreamReader IiiiiiiiIIIII16 = null;
        try {
            File IiiiiiiiIIIII17 = new File("map/stall" + IiiiiiiiIIIII10.getRoleId());
            if (!IiiiiiiiIIIII17.exists()) {
                return;
            }
            Properties IiiiiiiiIIIII18 = new Properties();
            IiiiiiiiIIIII15 = new FileInputStream(IiiiiiiiIIIII17);
            IiiiiiiiIIIII16 = new InputStreamReader((InputStream)IiiiiiiiIIIII15, "UTF-8");
            IiiiiiiiIIIII18.load(IiiiiiiiIIIII16);
            IiiiiiiiIIIII11 = IiiiiiiiIIIII18.getProperty("good");
            IiiiiiiiIIIII12 = IiiiiiiiIIIII18.getProperty("pet");
            IiiiiiiiIIIII13 = IiiiiiiiIIIII18.getProperty("ling");
            IiiiiiiiIIIII14 = IiiiiiiiIIIII18.getProperty("sold");
        }
        catch (Exception IiiiiiiiIIIII19) {
            IiiiiiiiIIIII19.printStackTrace();
        }
        try {
            if (IiiiiiiiIIIII16 != null) {
                IiiiiiiiIIIII16.close();
            }
        }
        catch (IOException IiiiiiiiIIIII20) {
            IiiiiiiiIIIII20.printStackTrace();
        }
        try {
            if (IiiiiiiiIIIII15 != null) {
                IiiiiiiiIIIII15.close();
            }
        }
        catch (IOException IiiiiiiiIIIII21) {
            IiiiiiiiIIIII21.printStackTrace();
        }
        if (!com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi(IiiiiiiiIIIII11)) {
            int IiiiiiiiIIIII22 = 0;
            int IiiiiiiiIIIII23 = 0;
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII11.length()) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII11.indexOf("|", IiiiiiiiIIIII23 + 1);
                if (IiiiiiiiIIIII7 == -1) {
                    IiiiiiiiIIIII7 = IiiiiiiiIIIII11.length();
                }
                if ((IiiiiiiiIIIII6 = IiiiiiiiIIIII11.indexOf(",", IiiiiiiiIIIII23 + 1)) == -1 || IiiiiiiiIIIII6 > IiiiiiiiIIIII7) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII7;
                }
                if ((IiiiiiiiIIIII5 = IiiiiiiiIIIII10.getGood(IiiiiiiiIIIII4 = new BigDecimal(com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII11, (int)IiiiiiiiIIIII23, (int)IiiiiiiiIIIII6)))) != null && IiiiiiiiIIIII5.getStatus() == 0 && !GoodType.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII5)) {
                    int IiiiiiiiIIIII24;
                    IiiiiiiiIIIII23 = IiiiiiiiIIIII6 + 1;
                    if ((IiiiiiiiIIIII6 = IiiiiiiiIIIII11.indexOf(",", IiiiiiiiIIIII23 + 1)) == -1 || IiiiiiiiIIIII6 > IiiiiiiiIIIII7) {
                        IiiiiiiiIIIII6 = IiiiiiiiIIIII7;
                    }
                    IiiiiiiiIIIII3 = Math.min(IiiiiiiiIIIII5.getUsetime(), com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII11, (int)IiiiiiiiIIIII23, (int)IiiiiiiiIIIII6));
                    IiiiiiiiIIIII2 = com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII11, (int)(IiiiiiiiIIIII6 + 1), (int)IiiiiiiiIIIII7);
                    if (IiiiiiiiIIIII3 > 0 && IiiiiiiiIIIII2 > 0L && (IiiiiiiiIIIII = this.IiIiiiiiIIIII.getGood(IiiiiiiiIIIII4)) == null && (IiiiiiiiIIIII24 = this.IiIiiiiiIIIII.getPath(0)) != -1) {
                        IiiiiiiiIIIII5 = (Goodstable)IiiiiiiiIIIII5.clone();
                        IiiiiiiiIIIII5.setUsetime(Integer.valueOf(IiiiiiiiIIIII3));
                        IiiiiiiiIIIII = new Commodity();
                        IiiiiiiiIIIII.setGood((Goodstable)IiiiiiiiIIIII5);
                        IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII2);
                        IiiiiiiiIIIII.setCurrency("\u91d1\u94b1");
                        this.IiIiiiiiIIIII.getGoodstables()[IiiiiiiiIIIII24] = IiiiiiiiIIIII;
                        IiiiiiiiIIIII8 = true;
                    }
                }
                ++IiiiiiiiIIIII22;
                IiiiiiiiIIIII23 = IiiiiiiiIIIII7 + 1;
            }
        }
        if (!com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi(IiiiiiiiIIIII12)) {
            int IiiiiiiiIIIII25 = 0;
            int IiiiiiiiIIIII26 = 0;
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII12.length()) {
                IiiiiiiiIIIII7 = IiiiiiiiIIIII12.indexOf("|", IiiiiiiiIIIII26 + 1);
                if (IiiiiiiiIIIII7 == -1) {
                    IiiiiiiiIIIII7 = IiiiiiiiIIIII12.length();
                }
                if ((IiiiiiiiIIIII6 = IiiiiiiiIIIII12.indexOf(",", IiiiiiiiIIIII26 + 1)) == -1 || IiiiiiiiIIIII6 > IiiiiiiiIIIII7) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII7;
                }
                if (!((IiiiiiiiIIIII5 = IiiiiiiiIIIII10.getPet(IiiiiiiiIIIII4 = new BigDecimal(com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII12, (int)IiiiiiiiIIIII26, (int)IiiiiiiiIIIII6)))) == null || (IiiiiiiiIIIII5.getPetlock() >>> 0 & 1) == 1 || (IiiiiiiiIIIII5.getPetlock() >>> 1 & 1) == 1 || (IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII5.getSummoningid())) >= 100000 && IiiiiiiiIIIII3 <= 200000 || com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.ALLATORIxDEMO().getLoginResult().getSummoning_id(), (BigDecimal)IiiiiiiiIIIII5.getSid()) || this.ALLATORIxDEMO().getPetMount(IiiiiiiiIIIII5.getSid()) != null)) {
                    int IiiiiiiiIIIII27;
                    Commodity IiiiiiiiIIIII28;
                    IiiiiiiiIIIII26 = IiiiiiiiIIIII6 + 1;
                    if ((IiiiiiiiIIIII6 = IiiiiiiiIIIII12.indexOf(",", IiiiiiiiIIIII26 + 1)) == -1 || IiiiiiiiIIIII6 > IiiiiiiiIIIII7) {
                        IiiiiiiiIIIII6 = IiiiiiiiIIIII7;
                    }
                    int IiiiiiiiIIIII29 = Math.min(1, com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII12, (int)IiiiiiiiIIIII26, (int)IiiiiiiiIIIII6));
                    long IiiiiiiiIIIII30 = com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII12, (int)(IiiiiiiiIIIII6 + 1), (int)IiiiiiiiIIIII7);
                    if (IiiiiiiiIIIII29 > 0 && IiiiiiiiIIIII30 > 0L && (IiiiiiiiIIIII28 = this.IiIiiiiiIIIII.getPet(IiiiiiiiIIIII4)) == null && (IiiiiiiiIIIII27 = this.IiIiiiiiIIIII.getPath(1)) != -1) {
                        IiiiiiiiIIIII28 = new Commodity();
                        IiiiiiiiIIIII28.setPet((RoleSummoning)IiiiiiiiIIIII5);
                        IiiiiiiiIIIII28.setMoney(IiiiiiiiIIIII30);
                        IiiiiiiiIIIII28.setCurrency("\u91d1\u94b1");
                        this.IiIiiiiiIIIII.getPets()[IiiiiiiiIIIII27] = IiiiiiiiIIIII28;
                        IiiiiiiiIIIII8 = true;
                    }
                }
                ++IiiiiiiiIIIII25;
                IiiiiiiiIIIII26 = IiiiiiiiIIIII7 + 1;
            }
        }
        if (!com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi(IiiiiiiiIIIII14)) {
            com.xy.v.IiiiiiiiiIIII IiiiiiiiIIIII31 = this.ALLATORIxDEMO();
            int IiiiiiiiIIIII32 = 0;
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII6 = 0;
            int IiiiiiiiIIIII33 = 0;
            while (IiiiiiiiIIIII6 < IiiiiiiiIIIII14.length()) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII14.indexOf("|", IiiiiiiiIIIII7 + 1);
                if (IiiiiiiiIIIII6 == -1) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII14.length();
                }
                if ((IiiiiiiiIIIII33 = IiiiiiiiIIIII14.indexOf(",", IiiiiiiiIIIII7 + 1)) == -1 || IiiiiiiiIIIII33 > IiiiiiiiIIIII6) {
                    IiiiiiiiIIIII33 = IiiiiiiiIIIII6;
                }
                if (IiiiiiiiIIIII31.ALLATORIxDEMO(((BigDecimal)(IiiiiiiiIIIII5 = new BigDecimal(com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII14, (int)IiiiiiiiIIIII7, (int)IiiiiiiiIIIII33)))).intValue()) != null) {
                    IiiiiiiiIIIII7 = IiiiiiiiIIIII33 + 1;
                    if ((IiiiiiiiIIIII33 = IiiiiiiiIIIII14.indexOf(",", IiiiiiiiIIIII7 + 1)) == -1 || IiiiiiiiIIIII33 > IiiiiiiiIIIII6) {
                        IiiiiiiiIIIII33 = IiiiiiiiIIIII6;
                    }
                    IiiiiiiiIIIII3 = Math.min(1, com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII14, (int)IiiiiiiiIIIII7, (int)IiiiiiiiIIIII33));
                    IiiiiiiiIIIII2 = com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII14, (int)(IiiiiiiiIIIII33 + 1), (int)IiiiiiiiIIIII6);
                    if (IiiiiiiiIIIII3 > 0 && IiiiiiiiIIIII2 > 0L && (IiiiiiiiIIIII = this.IiIiiiiiIIIII.getStallNeedBean(((BigDecimal)IiiiiiiiIIIII5).intValue())) == null) {
                        IiiiiiiiIIIII = new StallNeedBean();
                        IiiiiiiiIIIII.setId(((BigDecimal)IiiiiiiiIIIII5).intValue());
                        IiiiiiiiIIIII.setTotal(IiiiiiiiIIIII3);
                        IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII2);
                        this.IiIiiiiiIIIII.ALLATORIxDEMO((StallNeedBean)IiiiiiiiIIIII);
                        IiiiiiiiIIIII9 = true;
                    }
                }
                ++IiiiiiiiIIIII32;
                IiiiiiiiIIIII7 = IiiiiiiiIIIII6 + 1;
            }
        }
        this.iiiIiiiiiiIIi(this.IIiiiiiiiIIIi);
        if (!IiiiiiiiIIIII8) {
            if (!IiiiiiiiIIIII9) return;
        }
        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u81ea\u52a8\u8bfb\u53d6\u4f60\u4e0a\u4e00\u6b21\u6446\u644a\u548c\u6536\u8d2d\u8bb0\u5f55,\u5efa\u8bae\u901a\u8fc7\u9884\u89c8\u6838\u5bf9\u4fe1\u606f");
    }

    public void iIiIiiiiIIiii() {
        this.iiIiiiiiiIIiI = this.ALLATORIxDEMO((IIiiIiiiiIIiI)this.iiiiIiiiIiiII, this.iiIiiiiiiIIiI, 362, 66);
        this.IiiIiiiiiiIiI(0);
        this.iIiIiiiiIIiIi(0);
        this.IiiIiiiiIIiiI.setText(this.ALLATORIxDEMO().getLoginResult().getRolename());
        this.IiIiiiiiIIIII = new Stall();
        this.iIiIiiiiIIiIi();
        this.IiiIiiiiiiIiI();
        this.IiIiiiiiiiiIi.iIiIiiiiIIiii();
        super.iIiIiiiiIIiii();
    }

    public IiiIiiiiIIIIi iIiIiiiiIIiii() {
        return this.IiiiIiiiIiIII;
    }

    public void ALLATORIxDEMO(long number, JTextField textField) {
        if (this.IIiiIiiiIIiIi == textField || this.IIiIiiiiIiiiI == textField) {
            if (this.IiIIiiiiIIIII.ALLATORIxDEMO() == 0) {
                iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIIiIiiiiiiIi, (long)0L);
                return;
            }
            if (this.IIiiIiiiIIiIi == textField) {
                iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIIiIiiiiiiIi, (long)(number * this.ALLATORIxDEMO.ALLATORIxDEMO()));
                return;
            }
            if (this.IIiIiiiiIiiiI != textField) return;
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iIIiIiiiiiiIi, (long)(number * this.IiIIIiiiIiiIi.ALLATORIxDEMO()));
            return;
        }
        if (this.IIIIiiiiiiiII != textField) {
            if (this.iiIiiiiiiiiiI != textField) return;
        }
        if (this.IIiIIiiiIiiII.ALLATORIxDEMO() == 0) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIIiii, (long)0L);
            return;
        }
        if (this.IIIIiiiiiiiII == textField) {
            iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIIiii, (long)(number * this.IIIiiiiiiIiiI.ALLATORIxDEMO()));
            return;
        }
        if (this.iiIiiiiiiiiiI != textField) return;
        iiIIiiiiIiiII.ALLATORIxDEMO((JLabel)this.iiiiIiiiIIiii, (long)(number * this.iiIIIiiiIiIii.ALLATORIxDEMO()));
    }

    /*
     * Unable to fully structure code
     */
    public iiIiIiiiiiIIi(GameView gameView) {
        super(152, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 662, 443, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u6446\u644a\u76d8\u70b9");
        this.IIIIIiiiIiIIi = new com.xy.i.IIIIIiiiIIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIIiiiIiIIi.length) {
            this.IIIIIiiiIiIIi[IiiiiiiiIIIII] = new com.xy.i.IIIIIiiiIIIiI("sc/e/72.png", 2, 217 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiiiiiiIIIi, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u51fa\u552e" : (IiiiiiiiIIIII == 1 ? "\u6536\u8d2d" : ""), (IiiiIiiiiIiIi)this);
            this.IIIIIiiiIiIIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IIiiiiiiiIIII);
            this.IIIIIiiiIiIIi[IiiiiiiiIIIII].setBounds(61 + 92 * IiiiiiiiIIIII, 15, 85, 33);
            this.add((Component)this.IIIIIiiiIiIIi[IiiiiiiiIIIII++]);
        }
        this.IiiiIiiiIiiIi = new com.xy.i.IIIIIiiiIIIiI("sc/e/6.png", 1, 225, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u66f4\u6539", (IiiiIiiiiIiIi)this);
        this.IIIiiiiiIIiII = new com.xy.i.IIIIIiiiIIIiI("sc/e/6.png", 1, 226, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u9884\u89c8", (IiiiIiiiiIiIi)this);
        this.iIiIIiiiIIIii = new com.xy.i.IIIIIiiiIIIiI("sc/e/31.png", 1, 229, iiIIiiiiIiiII.iiiiIiiiIiiII, null, "\u6446 \u644a", (IiiiIiiiiIiIi)this);
        this.IiiiIiiiIiiIi.setBounds(430, 22, 34, 18);
        this.IIIiiiiiIIiII.setBounds(484, 22, 34, 18);
        this.iIiIIiiiIIIii.setBounds(290, 387, 79, 25);
        this.iIiIIiiiIIIii.setForeground(Color.black);
        this.add((Component)this.IiiiIiiiIiiIi);
        this.add((Component)this.IIIiiiiiIIiII);
        this.add((Component)this.iIiIIiiiIIIii);
        this.IiiIiiiiIIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((com.xy.w.IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IiiIiiiiIIiiI.setBounds(343, 23, 120, 17);
        this.add((Component)this.IiiIiiiiIIiiI);
        this.IIiIiiiiIIiII = new IiIIIiiiiiiIi(this);
        this.iiIIiiiiIiIIi = new IiiiiiiiiIIII(this);
        this.IIiIiiiiIIiII.setBounds(0, 0, 662, 443);
        this.iiIIiiiiIiIIi.setBounds(0, 0, 662, 443);
        this.add(this.IIiIiiiiIIiII);
        this.add(this.iiIIiiiiIiIIi);
        this.IIiiiiiiIiiII = new com.xy.w.IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
        this.IIiiiiiiIiiII.setBounds(35, 29, 611, 20);
        this.add((Component)this.IIiiiiiiIiiII);
        this.IiiiiiiiIIIII = new com.xy.i.IIIIIiiiIIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new com.xy.i.IIIIIiiiIIIiI("sc/e/39.png", 2, 221 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u53ec\u5524\u517d" : (IiiiiiiiIIIII == 1 ? "\u7075\u5b9d" : ""), (IiiiIiiiiIiIi)this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(54 + 65 * IiiiiiiiIIIII, 284, 63, 24);
            this.IIiIiiiiIIiII.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII[1].setVisible(false);
        this.IiIIIiiiiIiiI = new com.xy.i.IIIIIiiiIIIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new com.xy.i.IIIIIiiiIIIiI("sc/e/31.png", 1, 227 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u4e0a\u67b6" : (IiiiiiiiIIIII == 1 ? "\u4e0b\u67b6" : ""), (IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setForeground(Color.black);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(436 + IiiiiiiiIIIII * 89, 321, 79, 25);
            this.IIiIiiiiIIiII.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)433, (int)(213 + 31 * IiiiiiiiIIIII), (int)36, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5355\u4ef7" : (IiiiiiiiIIIII == 1 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 2 ? "\u73b0\u91d1" : "")));
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.IIiIiiiiIIiII.add(this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((com.xy.w.IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IIiIiiiiIiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((com.xy.w.IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IIiiIiiiIIiIi.setBounds(472, 213, 134, 19);
        this.IIiIiiiiIiiiI.setBounds(485, 167, 72, 19);
        this.iIIiIiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)472, (int)244, (int)134, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iIIiIiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iiIiIiiiiIIII = new MoneyType();
        this.iiIiIiiiiIIII.setIdAndKey(1, "\u91d1\u94b1");
        this.IiIiiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)472, (int)275, (int)134, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiIiiiiIIII, (GameView)gameView);
        this.IiIiiiiiiiiIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IiIiiiiiiiiIi.ALLATORIxDEMO(2);
        this.IIiIiiiiIIiII.add((Component)this.IIiiIiiiIIiIi);
        this.IIiIiiiiIIiII.add((Component)this.IIiIiiiiIiiiI);
        this.IIiIiiiiIIiII.add((Component)this.iIIiIiiiiiiIi);
        this.IIiIiiiiIIiII.add((Component)this.IiIiiiiiiiiIi);
        this.IiIIIiiiIiiIi = new IIiIIiiiIIIiI(15, (JTextField)this.IIiiIiiiIIiIi, (IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO = new IIiIIiiiIIIiI(15, (JTextField)this.IIiIiiiiIiiiI, (IiiiIiiiiIiIi)this);
        this.IiIIiiiiIIIII = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IiIIiiiiIIIII.setBounds(490, 101, 60, 60);
        this.IIiIiiiiIIiII.add((Component)this.IiIIiiiiIIIII);
        this.iiIiiiiiiiIii = new com.xy.w.IIIiiiiiIiIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            block44: {
                block45: {
                    block43: {
                        this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
                        this.IIiIiiiiIIiII.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
                        if (IiiiiiiiIIIII != 0) break block43;
                        this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                        this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(53, 66, 309, 207);
                        this.iiiiIiiiIiiII = new com.xy.q.IiiiiiiiiIIII(0, (IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 54, 68);
                        this.iiiiIiiiIiiII.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                        this.IIiIiiiiIIiII.add((Component)this.iiiiIiiiIiiII);
                        break block44;
                    }
                    if (IiiiiiiiIIIII != 1) break block45;
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(53, 307, 309, 54);
                    IiiiiiiiIIIII = new IIiiIiiiIiiiI[2];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl134
                }
                if (IiiiiiiiIIIII == 2) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/4.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(486, 97, 69, 67);
                } else if (IiiiiiiiIIIII == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(45, 55, 370, 320);
                } else if (IiiiiiiiIIIII == 4) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(421, 55, 200, 320);
                }
                break block44;
                do {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIiiIiiiIiiiI(IiiiiiiiIIIII == 0 ? "sc/e/47.png" : "sc/e/48.png", 1, IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                    IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(361, 309 + IiiiiiiiIIIII * 32, 18, 18);
                    this.IIiIiiiiIIiII.add((Component)IiiiiiiiIIIII[IiiiiiiiIIIII++]);
lbl134:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                this.iiIIIiiiiiiiI = new com.xy.q.IiiiiiiiiIIII(1, (IiiiIiiiiIiIi)this, 6, 1, 51, 51, 0, 0, 54, 309);
                this.iiIIIiiiiiiiI.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
                this.iiIIIiiiiiiiI.ALLATORIxDEMO(IiiiiiiiIIIII, 1);
                this.IIiIiiiiIIiII.add((Component)this.iiIIIiiiiiiiI);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiIIiiiiiiiI = new com.xy.i.IIIIIiiiIIIiI[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiIIiiiiiiiI.length) {
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII] = new com.xy.i.IIIIIiiiIIIiI(IiiiiiiiIIIII == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, 245 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(41 + IiiiiiiiIIIII * 32, 382, 18, 18);
            } else {
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII] = new com.xy.i.IIIIIiiiIIIiI(IiiiiiiiIIIII == 2 ? "sc/e/7.png" : "sc/e/31.png", 1, 245 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 2 ? "\u641c\u7d22" : (IiiiiiiiIIIII == 3 ? "\u6536\u8d2d" : (IiiiiiiiIIIII == 4 ? "\u53d6\u6d88" : "")), (IiiiIiiiiIiIi)this);
                this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setForeground(Color.black);
                if (IiiiiiiiIIIII == 2) {
                    this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(570, 254, 59, 25);
                } else {
                    this.IiiIIiiiiiiiI[IiiiiiiiIIIII].setBounds(544, 321 + (IiiiiiiiIIIII - 3) * 28, 79, 25);
                }
            }
            this.iiIIiiiiIiIIi.add((Component)this.IiiIIiiiiiiiI[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new JLabel[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)41, (int)54, (int)282, (int)21, (Color)Color.white, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u6211\u7684\u6536\u8d2d" : (IiiiiiiiIIIII == 1 ? "\u5217\u8868" : (IiiiiiiiIIIII == 2 ? "\u8be6\u7ec6\u7269\u54c1" : (IiiiiiiiIIIII == 3 ? "\u5355\u4ef7" : (IiiiiiiiIIIII == 4 ? "\u603b\u4ef7" : (IiiiiiiiIIIII == 5 ? "\u73b0\u91d1" : ""))))));
            this.iIiIiiiiIiIii[IiiiiiiiIIIII].setHorizontalAlignment(0);
            if (IiiiiiiiIIIII == 1) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(327, 54, 132, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(462, 54, 166, 21);
            } else if (IiiiiiiiIIIII >= 3 && IiiiiiiiIIIII <= 5) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(398, 295 + (IiiiiiiiIIIII - 3) * 28, 36, 19);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setForeground(Color.black);
            }
            this.iiIIiiiiIiIIi.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiIiIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((com.xy.w.IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IIIIiiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((com.xy.w.IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iiIiiiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((com.xy.w.IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.iIiiIiiiIiIIi.setBounds(463, 257, 104, 19);
        this.IIIIiiiiiiiII.setBounds(336, 351, 58, 19);
        this.iiIiiiiiiiiiI.setBounds(434, 295, 104, 19);
        this.iiiiIiiiIIiii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)434, (int)323, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
        this.iiiiIiiiIIiii.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIIIIiiiiiIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)434, (int)351, (int)104, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIiIiiiiIIII, (GameView)gameView);
        this.iIIIIiiiiiIIi.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.iIIIIiiiiiIIi.ALLATORIxDEMO(2);
        this.iiIIiiiiIiIIi.add((Component)this.iIiiIiiiIiIIi);
        this.iiIIiiiiIiIIi.add((Component)this.IIIIiiiiiiiII);
        this.iiIIiiiiIiIIi.add((Component)this.iiIiiiiiiiiiI);
        this.iiIIiiiiIiIIi.add((Component)this.iiiiIiiiIIiii);
        this.iiIIiiiiIiIIi.add((Component)this.iIIIIiiiiiIIi);
        this.iiIIIiiiIiIii = new IIiIIiiiIIIiI(15, (JTextField)this.IIIIiiiiiiiII, (IiiiIiiiiIiIi)this);
        this.IIIiiiiiiIiiI = new IIiIIiiiIIIiI(15, (JTextField)this.iiIiiiiiiiiiI, (IiiiIiiiiIiIi)this);
        this.IIIIIiiiIIIII = new IiiIiiiiIIIIi((IiiiIiiiiIiIi)this);
        this.IiiiIiiiIiIII = new IiiIiiiiIIIIi((IiiiIiiiiIiIi)this);
        this.IIIIIiiiIIIII.ALLATORIxDEMO().setBounds(329, 75, 130, 204);
        this.IiiiIiiiIiIII.ALLATORIxDEMO().setBounds(464, 75, 164, 174);
        this.iiIIiiiiIiIIi.add(this.IIIIIiiiIIIII.ALLATORIxDEMO());
        this.iiIIiiiiIiIIi.add(this.IiiiIiiiIiIII.ALLATORIxDEMO());
        this.iIiiIiiiiiiII = new IIiIiiiiIIiii[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIiIiiiiIIiii(this);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(46 + IiiiiiiiIIIII % 2 * 138, 79 + IiiiiiiiIIIII / 2 * 61, 134, 54);
            this.iiIIiiiiIiIIi.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII++]);
        }
        this.IIiIIiiiIiiII = new IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
        this.IIiIIiiiIiiII.setBounds(339, 294, 50, 50);
        this.iiIIiiiiIiIIi.add((Component)this.IIiIIiiiIiiII);
        this.IiIIIiiiiiiiI = new com.xy.w.IIIiiiiiIiIiI[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiiiiI.length) {
            this.IiIIIiiiiiiiI[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/4.png");
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(335, 290, 59, 57);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/30.png");
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(336, 347, 58, 1);
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 2) {
                    this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(41, 54, 282, 21);
                } else if (IiiiiiiiIIIII == 3) {
                    this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(327, 54, 132, 21);
                } else if (IiiiiiiiIIIII == 4) {
                    this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(462, 54, 166, 21);
                }
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 6) {
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 5) {
                    this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(327, 54, 132, 227);
                } else if (IiiiiiiiIIIII == 6) {
                    this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(462, 54, 166, 197);
                }
            } else if (IiiiiiiiIIIII == 7) {
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(327, 282, 305, 100);
            } else if (IiiiiiiiIIIII == 8) {
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.IiIIIiiiiiiiI[IiiiiiiiIIIII].setBounds(41, 54, 282, 328);
            }
            this.iiIIiiiiIiIIi.add((Component)this.IiIIIiiiiiiiI[IiiiiiiiIIIII++]);
        }
    }

    public void iIiIiiiiIIiIi() {
        this.IiIIiiiiIIIII.ALLATORIxDEMO(0, null);
        this.IIiiIiiiIIiIi.setText("");
        this.IIiIiiiiIiiiI.setText("");
        this.IiIIIiiiiIiiI[0].setVisible(false);
        this.IiIIIiiiiIiiI[1].setVisible(false);
    }

    public JComponent iIiIiiiiIIiii() {
        return this.iiIIiiiiIiIIi;
    }

    public void ALLATORIxDEMO(Lingbao lingbao) {
    }

    public void ALLATORIxDEMO(RoleSummoning pet) {
        if ((pet.getPetlock() >>> 0 & 1) == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + pet.getSummoningname() + "\u5df2\u88ab\u52a0\u9501\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01");
            return;
        }
        if ((pet.getPetlock() >>> 1 & 1) == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + pet.getSummoningname() + "\u5df2\u88ab\u7981\u4ea4\u6613\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01");
            return;
        }
        int IiiiiiiiIIIII = Integer.parseInt(pet.getSummoningid());
        if (IiiiiiiiIIIII >= 100000 && IiiiiiiiIIIII <= 200000) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + pet.getSummoningname() + "\u5df2\u88ab\u7981\u4ea4\u6613\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01");
            return;
        }
        if (com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.ALLATORIxDEMO().getLoginResult().getSummoning_id(), (BigDecimal)pet.getSid())) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u5728\u53c2\u6218\u4e2d\uff0c\u4e0d\u53ef\u6446\u644a\uff01");
            return;
        }
        if (this.ALLATORIxDEMO().getPetMount(pet.getSid()) != null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8fd9\u53ea\u53ec\u5524\u517d\u88ab\u7ba1\u5236\u4e2d\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01\uff01");
            return;
        }
        Commodity IiiiiiiiIIIII2 = this.IiIiiiiiIIIII.getPet(pet.getSid());
        if (IiiiiiiiIIIII2 != null) {
            this.IiIIiiiiIIIII.ALLATORIxDEMO(21, (Object)pet);
            this.IIiiIiiiIIiIi.setText(String.valueOf(IiiiiiiiIIIII2.getMoney()));
            this.IIiIiiiiIiiiI.setText("1");
            this.IiIIIiiiiIiiI[0].setText("\u66f4\u65b0");
            this.IiIIIiiiiIiiI[0].setVisible(true);
            this.IiIIIiiiiIiiI[1].setVisible(true);
            return;
        }
        if (this.IiIiiiiiIIIII.getPath(1) == -1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u7a7a\u4f59\u7684\u4f4d\u7f6e");
            return;
        }
        this.IiIIiiiiIIIII.ALLATORIxDEMO(21, (Object)pet);
        this.IIiiIiiiIIiIi.setText("");
        this.IIiIiiiiIiiiI.setText("1");
        this.IiIIIiiiiIiiI[0].setText("\u4e0a\u67b6");
        this.IiIIIiiiiIiiI[0].setVisible(true);
        this.IiIIIiiiiIiiI[1].setVisible(false);
    }

    public JComponent ALLATORIxDEMO() {
        return this.IIiIiiiiIIiII;
    }

    public void ALLATORIxDEMO(StallBuyData buyData, StallNeedBean needBean) {
        if (needBean != null) {
            buyData = this.ALLATORIxDEMO().ALLATORIxDEMO(needBean.getId());
        } else if (buyData != null) {
            needBean = this.IiIiiiiiIIIII.getStallNeedBean(buyData.getId());
        }
        if (buyData == null) {
            this.IIiIIiiiIiiII.ALLATORIxDEMO(0, null);
            this.iiIiiiiiiiiiI.setText("");
            this.IIIIiiiiiiiII.setText("");
            this.IiiIIiiiiiiiI[3].setVisible(false);
            this.IiiIIiiiiiiiI[4].setVisible(false);
            return;
        }
        if (needBean != null) {
            this.IIiIIiiiIiiII.ALLATORIxDEMO(24, (Object)buyData);
            this.iiIiiiiiiiiiI.setText(String.valueOf(needBean.getMoney()));
            this.IIIIiiiiiiiII.setText("1");
            this.IiiIIiiiiiiiI[3].setText("\u66f4\u65b0");
            this.IiiIIiiiiiiiI[3].setVisible(true);
            this.IiiIIiiiiiiiI[4].setVisible(true);
            return;
        }
        this.IIiIIiiiIiiII.ALLATORIxDEMO(24, (Object)buyData);
        this.iiIiiiiiiiiiI.setText("");
        this.IIIIiiiiiiiII.setText("1");
        this.IiiIIiiiiiiiI[3].setText("\u6536\u8d2d");
        this.IiiIIiiiiiiiI[3].setVisible(true);
        this.IiiIIiiiiiiiI[4].setVisible(false);
    }

    public void ALLATORIxDEMO(StallBean stallBean) {
        Goodstable IiiiiiiiIIIII;
        Commodity IiiiiiiiIIIII2;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiIiiiiiIIIII.getGoodstables().length) {
            IiiiiiiiIIIII2 = this.IiIiiiiiIIIII.getGoodstables()[IiiiiiiiIIIII4];
            if (IiiiiiiiIIIII2 != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII3.getGood(IiiiiiiiIIIII2.getGood().getRgid());
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2.getGood().getUsetime().intValue());
                if (IiiiiiiiIIIII.getUsetime() <= 0) {
                    IiiiiiiiIIIII3.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                }
            }
            ++IiiiiiiiIIIII4;
        }
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiIiiiiiIIIII.getPets().length) {
            IiiiiiiiIIIII2 = this.IiIiiiiiIIIII.getPets()[IiiiiiiiIIIII4];
            if (IiiiiiiiIIIII2 != null) {
                IiiiiiiiIIIII = IiiiiiiiIIIII3.getRolePet(IiiiiiiiIIIII2.getPet().getSid().longValue());
                IiiiiiiiIIIII3.pets.remove(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII.getId())) {
                    IiiiiiiiIIIII3.setChosePetId(null);
                }
            }
            ++IiiiiiiiIIIII4;
        }
    }

    public void IiiIiiiiiiIiI(int type) {
        if (type == 1 && !this.ALLATORIxDEMO().gamePawn) {
            return;
        }
        this.iiIiIiiiiIIIi = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIIIIiiiIiIIi.length) {
            this.IIIIIiiiIiIIi[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiIiIiiiiIIIi);
            ++IiiiiiiiIIIII;
        }
        if (type == 1) {
            iiIiIiiiiiIIi iiIiIiiiiiIIi2 = this;
            iiIiIiiiiiIIi iiIiIiiiiiIIi3 = this;
            this.IIIIIiiiIIIII.iIiIiiiiIIiii();
            this.IiiiIiiiIiIII.ALLATORIxDEMO(null);
            iiIiIiiiiiIIi3.IIiiiiiiiIIIi = 0;
            iiIiIiiiiiIIi2.iiiIiiiiiiIIi(this.IIiiiiiiiIIIi);
            iiIiIiiiiiIIi3.IIiIIiiiIiiII.ALLATORIxDEMO(0, null);
            iiIiIiiiiiIIi2.iIiiIiiiIiIIi.setText("");
            iiIiIiiiiiIIi3.IIIIiiiiiiiII.setText("");
            iiIiIiiiiiIIi2.iiIiiiiiiiiiI.setText("");
            iiIiIiiiiiIIi3.IiiIIiiiiiiiI[3].setVisible(false);
            iiIiIiiiiiIIi2.IiiIIiiiiiiiI[4].setVisible(false);
        }
        this.IIiIiiiiIIiII.setVisible(type == 0);
        this.iiIIiiiiIiIIi.setVisible(type == 1);
    }

    public Stall ALLATORIxDEMO() {
        return this.IiIiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi() {
        if (!this.iiIIiiiiIiIIi.getClient().gamePawn) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        FileOutputStream IiiiiiiiIIIII2 = null;
        try {
            Properties IiiiiiiiIIIII3 = new Properties();
            IiiiiiiiIIIII2 = new FileOutputStream("map/stall" + IiiiiiiiIIIII.getRoleId());
            IiiiiiiiIIIII3.setProperty("good", this.IiIiiiiiIIIII.iIiIiiiiIIiii());
            IiiiiiiiIIIII3.setProperty("pet", this.IiIiiiiiIIIII.iIiIiiiiIIiIi());
            IiiiiiiiIIIII3.setProperty("ling", this.IiIiiiiiIIIII.ALLATORIxDEMO());
            IiiiiiiiIIIII3.setProperty("sold", this.IiIiiiiiIIIII.iiiIiiiiiiIIi());
            IiiiiiiiIIIII3.store(IiiiiiiiIIIII2, null);
        }
        catch (IOException IiiiiiiiIIIII4) {
            IiiiiiiiIIIII4.printStackTrace();
        }
        try {
            if (IiiiiiiiIIIII2 == null) return;
            IiiiiiiiIIIII2.close();
            return;
        }
        catch (IOException IiiiiiiiIIIII5) {
            IiiiiiiiIIIII5.printStackTrace();
        }
    }

    public void iIiIiiiiIIiIi(int type) {
        this.iIiiIiiiiIiiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iIiiIiiiiIiiI);
            ++IiiiiiiiIIIII;
        }
        this.iiIIIiiiiiiiI.ALLATORIxDEMO().iIiIiiiiIIiIi(0);
        this.iiIIIiiiiiiiI.iiiIiiiiiiIIi(1 + this.iIiiIiiiiIiiI);
    }

    public IiiIiiiiIIIIi ALLATORIxDEMO() {
        return this.IIIIIiiiIIIII;
    }

    public void ALLATORIxDEMO(Goodstable good, int num) {
        if (GoodType.ALLATORIxDEMO((Goodstable)good)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u65e0\u6cd5\u4ea4\u6613");
            return;
        }
        Commodity IiiiiiiiIIIII = this.IiIiiiiiIIIII.getGood(good.getRgid());
        if (IiiiiiiiIIIII != null) {
            this.IiIIiiiiIIIII.ALLATORIxDEMO(1, (Object)good);
            this.IIiiIiiiIIiIi.setText(String.valueOf(IiiiiiiiIIIII.getMoney()));
            this.IIiIiiiiIiiiI.setText(String.valueOf(IiiiiiiiIIIII.getGood().getUsetime()));
            this.IiIIIiiiiIiiI[0].setText("\u66f4\u65b0");
            this.IiIIIiiiiIiiI[0].setVisible(true);
            this.IiIIIiiiiIiiI[1].setVisible(true);
            return;
        }
        if (this.IiIiiiiiIIIII.getPath(0) == -1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u7a7a\u4f59\u7684\u4f4d\u7f6e");
            return;
        }
        this.IiIIiiiiIIIII.ALLATORIxDEMO(1, (Object)good);
        this.IIiiIiiiIIiIi.setText("");
        this.IIiIiiiiIiiiI.setText(String.valueOf(num));
        this.IiIIIiiiiIiiI[0].setText("\u4e0a\u67b6");
        this.IiIIIiiiiIiiI[0].setVisible(true);
        this.IiIIIiiiiIiiI[1].setVisible(false);
    }

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        return true;
    }

    public void iiiIiiiiiiIIi(int page) {
        List IiiiiiiiIIIII = this.IiIiiiiiIIIII.getNeeds();
        int IiiiiiiiIIIII2 = ((IiiiiiiiIIIII != null ? IiiiiiiiIIIII.size() : 0) - 1) / this.iIiiIiiiiiiII.length;
        page = Math.max(0, page);
        page = Math.min(IiiiiiiiIIIII2, page);
        int IiiiiiiiIIIII3 = page * this.iIiiIiiiiiiII.length;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiiIiiiiiiII.length) {
            StallNeedBean IiiiiiiiIIIII5 = IiiiiiiiIIIII != null && IiiiiiiiIIIII3 < IiiiiiiiIIIII.size() ? (StallNeedBean)IiiiiiiiIIIII.get(IiiiiiiiIIIII3) : null;
            this.iIiiIiiiiiiII[IiiiiiiiIIIII4++].ALLATORIxDEMO(IiiiiiiiIIIII5);
            ++IiiiiiiiIIIII3;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void iIiIiiiiIIiii(int id) {
        block61: {
            if (id == 225) return;
            if (id == 226) {
                IiiiiiiiIIIII = this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii;
                this.IiIiiiiiIIIII.setMapid(IiiiiiiiIIIII.getMapid().intValue());
                this.IiIiiiiiIIIII.setRole(IiiiiiiiIIIII.getRolename());
                this.IiIiiiiiIIIII.setStall(this.IiiIiiiiIIiiI.getText().trim());
                this.IiIiiiiiIIIII.setState(com.xy.d.iiIIiiiiIiiII.IiIiiiiiIIIII);
                this.IiIiiiiiIIIII.setX(IiiiiiiiIIIII.getX() - 50);
                this.IiIiiiiiIIIII.setY(IiiiiiiiIIIII.getY() - 135);
                IiiiiiiiIIIII = (IIIIIiiiIIIiI)this.ALLATORIxDEMO().iiiIiiiiiiIIi(153);
                IiiiiiiiIIIII.iIiIiiiiIIiii(this.IiIiiiiiIIIII);
                return;
            }
            if (id == 227) {
                IiiiiiiiIIIII = this.IiIIIiiiIiiIi.ALLATORIxDEMO();
                IiiiiiiiIIIII = (int)this.ALLATORIxDEMO.ALLATORIxDEMO();
                if (IiiiiiiiIIIII <= 0L) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ef7\u683c\u4e0d\u80fd\u4e3a0");
                    return;
                }
                if (IiiiiiiiIIIII <= 0) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6570\u91cf\u4e0d\u80fd\u4e3a0");
                    return;
                }
                if (this.IiIIiiiiIIIII.ALLATORIxDEMO() == 1) {
                    IiiiiiiiIIIII = (Goodstable)this.IiIIiiiiIIIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = this.ALLATORIxDEMO().getGood(IiiiiiiiIIIII.getRgid());
                    if (IiiiiiiiIIIII == null) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u627e\u4e0d\u5230\u7269\u54c1");
                        return;
                    }
                    if (GoodType.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII)) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u7269\u54c1\u65e0\u6cd5\u4ea4\u6613");
                        return;
                    }
                    IiiiiiiiIIIII = this.IiIiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII.getGood().setUsetime(Integer.valueOf(IiiiiiiiIIIII));
                        IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII);
                        this.iIiIiiiiIIiIi();
                        return;
                    }
                    IiiiiiiiIIIII = this.IiIiiiiiIIIII.getPath(0);
                    if (IiiiiiiiIIIII == -1) {
                        this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u7a7a\u4f59\u7684\u4f4d\u7f6e");
                        return;
                    }
                    IiiiiiiiIIIII = (Goodstable)IiiiiiiiIIIII.clone();
                    IiiiiiiiIIIII.setUsetime(Integer.valueOf(IiiiiiiiIIIII));
                    IiiiiiiiIIIII = new Commodity();
                    IiiiiiiiIIIII.setGood(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII);
                    IiiiiiiiIIIII.setCurrency("\u91d1\u94b1");
                    this.IiIiiiiiIIIII.getGoodstables()[IiiiiiiiIIIII] = IiiiiiiiIIIII;
                    this.iIiIiiiiIIiIi();
                    return;
                }
                if (this.IiIIiiiiIIIII.ALLATORIxDEMO() != 21) return;
                IiiiiiiiIIIII = (RoleSummoning)this.IiIIiiiiIIIII.ALLATORIxDEMO();
                IiiiiiiiIIIII = this.ALLATORIxDEMO().getPet(IiiiiiiiIIIII.getSid());
                if (IiiiiiiiIIIII == null) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u627e\u4e0d\u5230\u53ec\u5524\u517d");
                    return;
                }
                if ((IiiiiiiiIIIII.getPetlock() >>> 0 & 1) == 1) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + IiiiiiiiIIIII.getSummoningname() + "\u5df2\u88ab\u52a0\u9501\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01");
                    return;
                }
                if ((IiiiiiiiIIIII.getPetlock() >>> 1 & 1) == 1) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + IiiiiiiiIIIII.getSummoningname() + "\u5df2\u88ab\u7981\u4ea4\u6613\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01");
                    return;
                }
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII.getSummoningid());
                if (IiiiiiiiIIIII >= 100000 && IiiiiiiiIIIII <= 200000) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + IiiiiiiiIIIII.getSummoningname() + "\u5df2\u88ab\u7981\u4ea4\u6613\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01");
                    return;
                }
                if (com.xy.v.IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.ALLATORIxDEMO().getLoginResult().getSummoning_id(), (BigDecimal)IiiiiiiiIIIII.getSid())) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u5728\u53c2\u6218\u4e2d\uff0c\u4e0d\u53ef\u6446\u644a\uff01");
                    return;
                }
                if (this.ALLATORIxDEMO().getPetMount(IiiiiiiiIIIII.getSid()) != null) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8fd9\u53ea\u53ec\u5524\u517d\u88ab\u7ba1\u5236\u4e2d\uff0c\u4e0d\u53ef\u6446\u644a\uff01\uff01\uff01");
                    return;
                }
                IiiiiiiiIIIII = this.IiIiiiiiIIIII.getPet(IiiiiiiiIIIII.getSid());
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII);
                    this.iIiIiiiiIIiIi();
                    return;
                }
                IiiiiiiiIIIII = this.IiIiiiiiIIIII.getPath(1);
                if (IiiiiiiiIIIII == -1) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6ca1\u6709\u7a7a\u4f59\u7684\u4f4d\u7f6e");
                    return;
                }
                IiiiiiiiIIIII = new Commodity();
                IiiiiiiiIIIII.setPet(IiiiiiiiIIIII);
                IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII);
                IiiiiiiiIIIII.setCurrency("\u91d1\u94b1");
                this.IiIiiiiiIIIII.getPets()[IiiiiiiiIIIII] = IiiiiiiiIIIII;
                this.iIiIiiiiIIiIi();
                return;
            }
            if (id == 228) {
                IiiiiiiiIIIII = null;
                if (this.IiIIiiiiIIIII.ALLATORIxDEMO() == 1) {
                    IiiiiiiiIIIII = (Goodstable)this.IiIIiiiiIIIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = this.IiIiiiiiIIIII.getGood(IiiiiiiiIIIII.getRgid());
                } else if (this.IiIIiiiiIIIII.ALLATORIxDEMO() == 21) {
                    IiiiiiiiIIIII = (RoleSummoning)this.IiIIiiiiIIIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = this.IiIiiiiiIIIII.getPet(IiiiiiiiIIIII.getSid());
                }
                v0 = IiiiiiiiIIIII = IiiiiiiiIIIII != null ? this.IiIiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII) : -1;
                if (IiiiiiiiIIIII == -1) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4e0d\u662f\u5df2\u4e0a\u67b6\u7684\u5546\u54c1");
                    return;
                }
                this.iIiIiiiiIIiIi();
                return;
            }
            if (id != 229) break block61;
            IiiiiiiiIIIII = this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii;
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                if (!(IiiiiiiiIIIII.getMapid() == 1236L && IiiiiiiiIIIII.getX() > 5977 && IiiiiiiiIIIII.getX() < 8290 && IiiiiiiiIIIII.getY() > 3099 && IiiiiiiiIIIII.getY() < 4174 || IiiiiiiiIIIII.getMapid() == 1207L && IiiiiiiiIIIII.getX() > 3320 && IiiiiiiiIIIII.getX() < 4320 && IiiiiiiiIIIII.getY() > 4220 && IiiiiiiiIIIII.getY() < 4500)) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5728\u6d1b\u9633\u96c6\u5e02\u6216\u8005\u957f\u5b89\u96c6\u5e02\u6446\u644a");
                    return;
                }
                if (IiiiiiiiIIIII.getMapid() == 1236L && IiiiiiiiIIIII.getX() > 7130 && IiiiiiiiIIIII.getX() < 7370 && IiiiiiiiIIIII.getY() > 3435 && IiiiiiiiIIIII.getY() < 3585) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f66\u592b\u5468\u56f4\u7981\u6b62\u6446\u644a");
                    return;
                }
            } else {
                if (IiiiiiiiIIIII.getMapid() != 1236L || IiiiiiiiIIIII.getX() <= 5977 || IiiiiiiiIIIII.getX() >= 8290 || IiiiiiiiIIIII.getY() <= 3099 || IiiiiiiiIIIII.getY() >= 4174) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ea\u80fd\u5728\u6d1b\u9633\u96c6\u5e02\u6446\u644a");
                    return;
                }
                if (IiiiiiiiIIIII.getMapid() == 1236L && IiiiiiiiIIIII.getX() > 7130 && IiiiiiiiIIIII.getX() < 7370 && IiiiiiiiIIIII.getY() > 3435 && IiiiiiiiIIIII.getY() < 3585) {
                    this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8f66\u592b\u5468\u56f4\u7981\u6b62\u6446\u644a");
                    return;
                }
            }
            if (IiiiiiiiIIIII.getTroop_id() != null || this.iiIIiiiiIiIIi.getBattleScene() != null && this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(14) != null) {
                this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u5f53\u524d\u72b6\u6001\u4e0d\u80fd\u6446\u644a\uff01");
                return;
            }
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                if (IiiiiiiiIIIII.getGrade() < 50) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("50\u7ea7\u4e4b\u540e\u624d\u53ef\u4ee5\u6446\u644a");
                    return;
                }
            } else if (IiiiiiiiIIIII.getGrade() <= 102) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8f6c\u751f\u4e4b\u540e\u624d\u53ef\u4ee5\u6446\u644a");
                return;
            }
            if (IiiiiiiiIIIII.getMount_id() != 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5728\u6446\u644a\u4e86\u8fd8\u8981\u9a91\u7740\u5750\u9a91\u5e72\u4ec0\u4e48");
                return;
            }
            this.IiIiiiiiIIIII.setMapid(IiiiiiiiIIIII.getMapid().intValue());
            this.IiIiiiiiIIIII.setRole(IiiiiiiiIIIII.getRolename());
            this.IiIiiiiiIIIII.setStall(this.IiiIiiiiIIiiI.getText().trim());
            if (com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.IiIiiiiiIIIII.getStall())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u644a\u4f4d\u540d\u4e0d\u80fd\u4e3a\u7a7a");
                return;
            }
            if (this.IiIiiiiiIIIII.getStall().length() > 7) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u644a\u4f4d\u540d\u957f\u5ea6\u6700\u5927\u9650\u5236\u4e3a6");
                return;
            }
            this.IiIiiiiiIIIII.setState(com.xy.d.iiIIiiiiIiiII.IiIiiiiiIIIII);
            this.IiIiiiiiIIIII.setX(IiiiiiiiIIIII.getX() - 50);
            this.IiIiiiiiIIIII.setY(IiiiiiiiIIIII.getY() - 135);
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl217
        }
        if (id == 245) {
            if (this.IIiiiiiiiIIIi <= 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u662f\u9996\u9875");
                return;
            }
            --this.IIiiiiiiiIIIi;
            this.iiiIiiiiiiIIi(this.IIiiiiiiiIIIi);
            return;
        }
        if (id == 246) {
            IiiiiiiiIIIII = ((this.IiIiiiiiIIIII.getNeeds() != null ? this.IiIiiiiiIIIII.getNeeds().size() : 0) - 1) / this.iIiiIiiiiiiII.length;
            if (this.IIiiiiiiiIIIi >= IiiiiiiiIIIII) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5f53\u524d\u662f\u5c3e\u9875");
                return;
            }
            ++this.IIiiiiiiiIIIi;
            this.iiiIiiiiiiIIi(this.IIiiiiiiiIIIi);
            return;
        }
        if (id == 247) {
            IiiiiiiiIIIII = this.iIiiIiiiIiIIi.getText();
            if (com.xy.v.IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5173\u952e\u8bcd\u4e0d\u80fd\u4e3a\u7a7a");
                return;
            }
            this.IiiiIiiiIiIII.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (id != 248) {
            if (id != 249) return;
        }
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = null;
        if (this.IIiIIiiiIiiII.ALLATORIxDEMO() == 24) {
            IiiiiiiiIIIII = (StallBuyData)this.IIiIIiiiIiiII.ALLATORIxDEMO();
        }
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII = this.IiIiiiiiIIIII.getStallNeedBean(IiiiiiiiIIIII.getId());
        }
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u6ca1\u6709\u9009\u4e2d\u7684\u7269\u54c1");
            return;
        }
        if (id == 248) {
            IiiiiiiiIIIII = (int)this.iiIIIiiiIiIii.ALLATORIxDEMO();
            IiiiiiiiIIIII = this.IIIiiiiiiIiiI.ALLATORIxDEMO();
            if (IiiiiiiiIIIII <= 0L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ef7\u683c\u4e0d\u80fd\u4e3a0");
                return;
            }
            if (IiiiiiiiIIIII <= 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6570\u91cf\u4e0d\u80fd\u4e3a0");
                return;
            }
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.setTotal(IiiiiiiiIIIII);
                IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII);
            } else {
                IiiiiiiiIIIII = new StallNeedBean();
                IiiiiiiiIIIII.setId(IiiiiiiiIIIII.getId());
                IiiiiiiiIIIII.setTotal(IiiiiiiiIIIII);
                IiiiiiiiIIIII.setMoney(IiiiiiiiIIIII);
                if (!this.IiIiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII)) {
                    this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u6536\u8d2d\u4e0a\u965024\u79cd");
                    return;
                }
            }
            this.ALLATORIxDEMO(null, null);
            this.iiiIiiiiiiIIi(this.IIiiiiiiiIIIi);
            return;
        }
        if (id != 249) return;
        if (!this.IiIiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII.getId())) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u7269\u54c1\u8fd8\u672a\u6536\u8d2d");
            return;
        }
        this.ALLATORIxDEMO(null, null);
        this.iiiIiiiiiiIIi(this.IIiiiiiiiIIIi);
        return;
        do {
            if ((IiiiiiiiIIIII /* !! */  = this.IiIiiiiiIIIII.getGoodstables()[IiiiiiiiIIIII]) != null && ((IiiiiiiiIIIII = IiiiiiiiIIIII.getGood(IiiiiiiiIIIII /* !! */ .getGood().getRgid())) == null || IiiiiiiiIIIII.getUsetime() < IiiiiiiiIIIII /* !! */ .getGood().getUsetime())) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u552e\u5356\u7269\u54c1\u5f02\u5e38");
                return;
            }
            ++IiiiiiiiIIIII;
lbl217:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.getGoodstables().length);
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.getPets().length) {
            IiiiiiiiIIIII /* !! */  = this.IiIiiiiiIIIII.getPets()[IiiiiiiiIIIII];
            if (IiiiiiiiIIIII /* !! */  != null && (IiiiiiiiIIIII = IiiiiiiiIIIII.getPet(IiiiiiiiIIIII /* !! */ .getPet().getSid())) == null) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u552e\u5356\u53ec\u5524\u517d\u5f02\u5e38");
                return;
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"stall", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(this.IiIiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        if (this.iiIIiiiiIiIIi.getClient().gamePawn == false) return;
        IiiiiiiiIIIII /* !! */  = null;
        try {
            IiiiiiiiIIIII = new Properties();
            IiiiiiiiIIIII /* !! */  = new FileOutputStream("map/stall" + IiiiiiiiIIIII.getRoleId());
            IiiiiiiiIIIII.setProperty("good", this.IiIiiiiiIIIII.iIiIiiiiIIiii());
            IiiiiiiiIIIII.setProperty("pet", this.IiIiiiiiIIIII.iIiIiiiiIIiIi());
            IiiiiiiiIIIII.setProperty("ling", this.IiIiiiiiIIIII.ALLATORIxDEMO());
            IiiiiiiiIIIII.setProperty("sold", this.IiIiiiiiIIIII.iiiIiiiiiiIIi());
            IiiiiiiiIIIII.store((OutputStream)IiiiiiiiIIIII /* !! */ , null);
        }
        catch (IOException IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
        try {
            if (IiiiiiiiIIIII /* !! */  == null) return;
            IiiiiiiiIIIII /* !! */ .close();
            return;
        }
        catch (IOException IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }
}
