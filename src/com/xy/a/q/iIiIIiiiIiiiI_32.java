/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiiiiiIiIiI
 *  com.xy.a.q.IiiiIiiiiIiIi
 *  com.xy.bean.FriendBean
 *  com.xy.bean.GoodTrans2
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodType
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IIiiIiiiIiiiI
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIIIiiiIIIiI
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IIiIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiIIiiiiIiii
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.q.iiiiiiiiiiIiI
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a.q;

import com.xy.a.q.IIIiiiiiIiIiI;
import com.xy.a.q.IiiiIiiiiIiIi;
import com.xy.bean.FriendBean;
import com.xy.bean.GoodTrans2;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IIiiIiiiIiiiI;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IIIIIiiiIIIiI;
import com.xy.q.IIiIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiIIiiiiIiii;
import com.xy.q.IiiiIiiiiIiII;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.q.iiiiiiiiiiIiI;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiiIiiiI
extends com.xy.q.IiiiIiiiiIiIi {
    private IiiiIiiiiIiII IIiiiiiiiIIIi;
    private iiIiIiiiiIiIi IIIiiiiiIIiII;
    private int iiIiiiiiiIIiI;
    private com.xy.q.IIIiiiiiIiIiI[] iIiiIiiiIiIIi;
    private IiiIIiiiiIiii iiiiIiiiIIiii;
    private IIiIIiiiIIIiI iIIiIiiiiiiIi;
    private IiiiiiiiiIIII IIIIiiiiiiiII;
    private MoneyType iiIIIiiiiiiiI;
    private IiiiIiiiiIiIi IiIiiiiiIIIII;
    private com.xy.w.IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private IiiiiiiiiIIII[] iiiiIiiiIiiII;
    private IIiiIiiiIiiiI[] iiiIiiiiiiiIi;
    private JLabel[] iIiiIiiiiiiII;
    private IiiiIiiiiIiIi IIiiIiiiIIiIi;
    private iiiiiiiiiiIiI iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private com.xy.w.IIIiiiiiIiIiI[] IiiiiiiiIIIII;
    private iIIiIiiiIiiIi[] ALLATORIxDEMO;

    public boolean ALLATORIxDEMO(long number, JTextField textField) {
        if (this.IIiiIiiiIIiIi == null) return false;
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi) != 0) return false;
        return true;
    }

    static /* synthetic */ iIIiIiiiIiiIi[] ALLATORIxDEMO(iIiIIiiiIiiiI arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(int zhi, String roleName) {
        IiiiIiiiiIiIi IiiiiiiiIIIII = null;
        IiiiIiiiiIiIi IiiiiiiiIIIII2 = null;
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).equals(roleName)) {
            IiiiiiiiIIIII = this.IiIiiiiiIIIII;
            IiiiiiiiIIIII2 = this.IIiiIiiiIIiIi;
        } else if (this.ALLATORIxDEMO().getLoginResult().getRolename().equals(roleName)) {
            IiiiiiiiIIIII = this.IIiiIiiiIIiIi;
            IiiiiiiiIIIII2 = this.IiIiiiiiIIIII;
        }
        if (zhi == 3) {
            IiiiiiiiIIIII.ALLATORIxDEMO(1);
            return;
        }
        if (zhi == 4) {
            IiiiiiiiIIIII.ALLATORIxDEMO(0);
            if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)IiiiiiiiIIIII2) != 2) return;
            IiiiiiiiIIIII2.ALLATORIxDEMO(1);
            return;
        }
        if (zhi != 5) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(2);
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII;
        if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
            return;
        }
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi) == 0 || IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII) == 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53cc\u65b9\u90fd\u9501\u5b9a\u624d\u80fd\u70b9\u51fb\u786e\u5b9a");
            return;
        }
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getGoods() != null && (IiiiiiiiIIIII = this.ALLATORIxDEMO().getGoodPackSum(-1L, new BigDecimal(-1), 999)) < IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getGoods().size()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u80cc\u5305\u4e0d\u8db3");
            return;
        }
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getPets() != null) {
            IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getPets().size();
            IiiiiiiiIIIII += this.ALLATORIxDEMO().pets.size();
            if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPets() != null) {
                IiiiiiiiIIIII -= IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPets().size();
            }
            if (IiiiiiiiIIIII > 21) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ec\u5524\u517d\u683c\u5b50\u4e0d\u8db3");
                return;
            }
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"TransState", (String)"5");
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public boolean ALLATORIxDEMO() {
        if (this.IiIiiiiiIIIII != null && IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII) != null) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"TransState", (String)"2");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return false;
        }
        if (this.IIiiIiiiIIiIi != null) {
            IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi, null);
        }
        if (this.IiIiiiiiIIIII != null) {
            IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII, null);
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII++].setVisible(true);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII++].setText(null);
        }
        return super.ALLATORIxDEMO();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(RolePet rolePet, MouseEvent e) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        RoleSummoning IiiiiiiiIIIII3;
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi) != 0) {
            return;
        }
        RoleSummoning roleSummoning = IiiiiiiiIIIII3 = rolePet != null ? rolePet.getPet() : null;
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        if ((IiiiiiiiIIIII3.getPetlock() >>> 0 & 1) == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + IiiiiiiiIIIII3.getSummoningname() + "\u5df2\u88ab\u52a0\u9501\uff0c\u4e0d\u53ef\u4ea4\u6613\uff01\uff01");
            return;
        }
        if ((IiiiiiiiIIIII3.getPetlock() >>> 1 & 1) == 1) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + IiiiiiiiIIIII3.getSummoningname() + "\u5df2\u88ab\u7981\u4ea4\u6613\uff0c\u4e0d\u53ef\u4ea4\u6613\uff01\uff01");
            return;
        }
        int IiiiiiiiIIIII4 = Integer.parseInt(IiiiiiiiIIIII3.getSummoningid());
        if (IiiiiiiiIIIII4 >= 100000 && IiiiiiiiIIIII4 <= 200000) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u53ec\u5524\u517d" + IiiiiiiiIIIII3.getSummoningname() + "\u5df2\u88ab\u7981\u4ea4\u6613\uff0c\u4e0d\u53ef\u4ea4\u6613\uff01\uff01");
            return;
        }
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.ALLATORIxDEMO().getLoginResult().getSummoning_id(), (BigDecimal)IiiiiiiiIIIII3.getSid())) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u5728\u53c2\u6218\u4e2d\uff0c\u4e0d\u53ef\u4ea4\u6613\uff01");
            return;
        }
        if (this.ALLATORIxDEMO().getPetMount(IiiiiiiiIIIII3.getSid()) != null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8fd9\u53ea\u53ec\u5524\u517d\u88ab\u7ba1\u5236\u4e2d\uff0c\u4e0d\u53ef\u4ea4\u6613\uff01\uff01\uff01");
            return;
        }
        int IiiiiiiiIIIII5 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPets() != null ? IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPets().size() : 0;
        boolean IiiiiiiiIIIII6 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).setPet(IiiiiiiiIIIII3);
        int n = IiiiiiiiIIIII2 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPets() != null ? IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPets().size() : 0;
        if (IiiiiiiiIIIII5 == IiiiiiiiIIIII2) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u683c\u5b50\u5df2\u6ee1");
            return;
        }
        GoodTrans2 goodTrans2 = new GoodTrans2();
        IiiiiiiiIIIII.setI(IiiiiiiiIIIII6);
        IiiiiiiiIIIII.setPet(IiiiiiiiIIIII3);
        String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"TransGood", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
        this.ALLATORIxDEMO((GoodTrans2)IiiiiiiiIIIII);
    }

    protected void paintChildren(Graphics g) {
        super.paintChildren(g);
        if (this.IIiiIiiiIIiIi != null) {
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(g);
        }
        if (this.IiIiiiiiIIIII == null) return;
        this.IiIiiiiiIIIII.ALLATORIxDEMO(g);
    }

    public void iiiIiiiiiiIIi(boolean is) {
        if (this.IIiiIiiiIIiIi == null) return;
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi) == null) {
            return;
        }
        if (is) {
            Goodstable IiiiiiiiIIIII;
            Goodstable IiiiiiiiIIIII2;
            RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
            List IiiiiiiiIIIII4 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getGoods();
            List IiiiiiiiIIIII5 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPets();
            List IiiiiiiiIIIII6 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getLingbaos();
            int IiiiiiiiIIIII7 = 0;
            int IiiiiiiiIIIII8 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.size() : 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
                IiiiiiiiIIIII2 = (Goodstable)IiiiiiiiIIIII4.get(IiiiiiiiIIIII7);
                IiiiiiiiIIIII = IiiiiiiiIIIII3.getGood(IiiiiiiiIIIII2.getRgid());
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2.getUsetime().intValue());
                if (IiiiiiiiIIIII.getUsetime() <= 0) {
                    IiiiiiiiIIIII3.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                }
                ++IiiiiiiiIIIII7;
            }
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII5.size() : 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
                IiiiiiiiIIIII2 = (RoleSummoning)IiiiiiiiIIIII5.get(IiiiiiiiIIIII7);
                IiiiiiiiIIIII = IiiiiiiiIIIII3.getRolePet(IiiiiiiiIIIII2.getSid().longValue());
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII3.pets.remove(IiiiiiiiIIIII);
                }
                if (IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII.getId())) {
                    IiiiiiiiIIIII3.setChosePetId(null);
                }
                ++IiiiiiiiIIIII7;
            }
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII6 != null ? IiiiiiiiIIIII6.size() : 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
                IiiiiiiiIIIII2 = (Lingbao)IiiiiiiiIIIII6.get(IiiiiiiiIIIII7);
                IiiiiiiiIIIII3.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII2);
                IiiiiiiiIIIII3.lingbaoMap.remove(IiiiiiiiIIIII2.getBaoid());
                IiiiiiiiIIIII3.lingbaoList.remove(IiiiiiiiIIIII2.getBaoid());
                if (IiiiiiiiIIIII3.iIiIiiiiIIiIi(IiiiiiiiIIIII2.getBaoid())) {
                    IiiiiiiiIIIII3.setChoseBaoId(null);
                }
                ++IiiiiiiiIIIII7;
            }
            iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
            iIiIIiiiIiiiI iIiIIiiiIiiiI3 = this;
            IiiiiiiiIIIII4 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI3.IiIiiiiiIIIII).getGoods();
            IiiiiiiiIIIII5 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI2.IiIiiiiiIIIII).getPets();
            IiiiiiiiIIIII6 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI3.IiIiiiiiIIIII).getLingbaos();
            if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)iIiIIiiiIiiiI2.IiIiiiiiIIIII).getMoney() != null && IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getMoney().longValue() > 0L) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u83b7\u5f97\u91d1\u94b1#c00FFFF" + IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getMoney());
            }
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.size() : 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
                IiiiiiiiIIIII2 = (Goodstable)IiiiiiiiIIIII4.get(IiiiiiiiIIIII7);
                ++IiiiiiiiIIIII7;
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u83b7\u5f97#G" + IiiiiiiiIIIII2.getUsetime() + "#Y\u4e2a#c00FFFF" + IiiiiiiiIIIII2.getGoodsname());
            }
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII5.size() : 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
                IiiiiiiiIIIII2 = (RoleSummoning)IiiiiiiiIIIII5.get(IiiiiiiiIIIII7);
                ++IiiiiiiiIIIII7;
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u83b7\u5f97\u53ec\u5524\u517d#c00FFFF" + IiiiiiiiIIIII2.getSummoningname());
            }
            IiiiiiiiIIIII7 = 0;
            IiiiiiiiIIIII8 = IiiiiiiiIIIII6 != null ? IiiiiiiiIIIII6.size() : 0;
            while (IiiiiiiiIIIII7 < IiiiiiiiIIIII8) {
                IiiiiiiiIIIII2 = (Lingbao)IiiiiiiiIIIII6.get(IiiiiiiiIIIII7);
                ++IiiiiiiiIIIII7;
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u83b7\u5f97\u7075\u5b9d#c00FFFF" + IiiiiiiiIIIII2.getBaoname());
            }
        }
        IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi, null);
        IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII, null);
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
    }

    public Long ALLATORIxDEMO(long number, JTextField textField) {
        if (number < 0L) {
            return 0L;
        }
        long IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getGold().longValue();
        if (number <= IiiiiiiiIIIII) return null;
        return IiiiiiiiIIIII;
    }

    static /* synthetic */ com.xy.w.IIIiiiiiIiIiI[] ALLATORIxDEMO(iIiIIiiiIiiiI arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    static /* synthetic */ IiiiIiiiiIiIi iIiIiiiiIIiii(iIiIIiiiIiiiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public iIiIIiiiIiiiI(GameView gameView) {
        super(14, 2, com.xy.q.IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 562, 475, com.xy.q.IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4ea4\u6613");
        this.iiiiIiiiIiiII = new IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = new IiiiiiiiiIIII("sc/e/39.png", 2, 221 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u53ec\u5524\u517d" : (IiiiiiiiIIIII == 1 ? "\u7075\u5b9d" : ""), (com.xy.q.IiiiIiiiiIiIi)this);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(50 + 65 * IiiiiiiiIIIII, 9, 63, 24);
            this.add((Component)this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI((com.xy.q.IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(0, 0, 140, 20);
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)53, (int)160, (int)160, (Component)this.iiIiiiiiiiIii, (int)20);
        this.add(this.IiIIIiiiiIiiI);
        this.iiIiIiiiiIIIi = new com.xy.w.IIIiiiiiIiIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(47, 32, 160, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(47, 32, 160, 180);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(49, 32, 156, 156);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.IIIIiiiiiiiII = new IiiiiiiiiIIII("sc/e/7.png", 1, 223, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u786e\u5b9a", (com.xy.q.IiiiIiiiiIiIi)this);
        this.IIIIiiiiiiiII.setBounds(42, 272, 59, 25);
        this.add((Component)this.IIIIiiiiiiiII);
        this.iIiiIiiiiiiII = new JLabel[11];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)(220 + 22 * IiiiiiiiIIIII), (int)36, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u73b0\u91d1" : (IiiiiiiiIIIII == 1 ? "\u94f6\u4e24" : (IiiiiiiiIIIII == 2 ? "\u94f6\u4e24" : "")));
            this.iIiiIiiiiiiII[IiiiiiiiIIIII].setHorizontalAlignment(10);
            this.add(this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(337, 246, 36, 19);
            }
            ++IiiiiiiiIIIII;
        }
        this.iiIIIiiiiiiiI = new MoneyType();
        this.iiIIIiiiiiiiI.setIdAndKey(1, "\u91d1\u94b1");
        this.IIIiiiiiIIiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (MoneyType)this.iiIIIiiiiiiiI, (GameView)gameView);
        this.IIIiiiiiIIiII.ALLATORIxDEMO(2);
        this.IIIiiiiiIIiII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
        this.IIIiiiiiIIiII.setBounds(85, 220, 123, 19);
        this.add((Component)this.IIIiiiiiIIiII);
        this.IIiiiiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (Color)Color.white);
        this.IIiiiiiiiIIIi.setBounds(85, 242, 123, 19);
        this.add((Component)this.IIiiiiiiiIIIi);
        this.iIIiIiiiiiiIi = new IIiIIiiiIIIiI(15, (JTextField)this.IIiiiiiiiIIIi, (com.xy.q.IiiiIiiiiIiIi)this);
        this.ALLATORIxDEMO = new iIIiIiiiIiiIi[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            if (IiiiiiiiIIIII == 0) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)375, (int)246, (int)123, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            } else if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 4) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(42 + (IiiiiiiiIIIII - 1) / 2 * 106), (int)(302 + (IiiiiiiiIIIII - 1) % 2 * 20), (int)100, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].addMouseListener((MouseListener)new IIIiiiiiIiIiI(this, 1, IiiiiiiiIIIII - 1));
            } else if (IiiiiiiiIIIII >= 5 && IiiiiiiiIIIII <= 8) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)(313 + (IiiiiiiiIIIII - 5) / 2 * 106), (int)(302 + (IiiiiiiiIIIII - 5) % 2 * 20), (int)100, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].addMouseListener((MouseListener)new IIIiiiiiIiIiI(this, 2, IiiiiiiiIIIII - 5));
            }
            this.ALLATORIxDEMO[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new com.xy.w.IIIiiiiiIiIiI[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new com.xy.w.IIIiiiiiIiIiI();
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII >= 0 && IiiiiiiiIIIII <= 2) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/19.png", (int)5, (int)5, (int)5, (int)5, (boolean)false));
                if (IiiiiiiiIIIII == 0) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(215, 32, 309, 207);
                } else if (IiiiiiiiIIIII == 1) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(41, 345, 207, 105);
                } else if (IiiiiiiiIIIII == 2) {
                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(313, 345, 207, 105);
                }
            } else if (IiiiiiiiIIIII == 3) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(140, 269, 17, 17);
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].addMouseListener((MouseListener)new IIIiiiiiIiIiI(this, 0, 0));
            } else if (IiiiiiiiIIIII == 4) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(503, 247, 17, 17);
            } else if (IiiiiiiiIIIII == 5) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(270, 258, 34, 59);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIiIii = new iiiiiiiiiiIiI((com.xy.q.IiiiIiiiiIiIi)this, 6, 4, 51, 51, 0, 0, 216, 34);
        this.iIiIiiiiIiIii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.add((Component)this.iIiIiiiiIiIii);
        IIiiIiiiIiiiI[] IiiiiiiiIIIII2 = new IIiiIiiiIiiiI[2];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            IiiiiiiiIIIII2[IiiiiiiiIIIII3] = new IIiiIiiiIiiiI(IiiiiiiiIIIII3 == 0 ? "sc/e/42.png" : "sc/e/43.png", 1, IiiiiiiiIIIII3, (com.xy.q.IiiiIiiiiIiIi)this);
            IiiiiiiiIIIII2[IiiiiiiiIIIII3].setBounds(163 + 21 * IiiiiiiiIIIII3, 187, 18, 18);
            this.add((Component)IiiiiiiiIIIII2[IiiiiiiiIIIII3++]);
        }
        this.iiiiIiiiIIiii = new IiiIIiiiiIiii(true, (com.xy.q.IiiiIiiiiIiIi)this, 3, 3, 51, 51, 0, 0, 50, 34);
        this.iiiiIiiiIIiii.ALLATORIxDEMO(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/18.png"));
        this.iiiiIiiiIIiii.ALLATORIxDEMO(IiiiiiiiIIIII2, 1);
        this.add((Component)this.iiiiIiiiIIiii);
        this.iIiiIiiiIiIIi = new com.xy.q.IIIiiiiiIiIiI[16];
        IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII3] = new com.xy.q.IIIiiiiiIiIiI((com.xy.q.IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII3 < 8) {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII3].setBounds(42 + 51 * (IiiiiiiiIIIII3 % 4), 347 + 51 * (IiiiiiiiIIIII3 / 4), 51, 51);
            } else {
                this.iIiiIiiiIiIIi[IiiiiiiiIIIII3].setBounds(314 + 51 * ((IiiiiiiiIIIII3 - 8) % 4), 347 + 51 * ((IiiiiiiiIIIII3 - 8) / 4), 51, 51);
            }
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII3].ALLATORIxDEMO("sc/d/18.png");
            this.add((Component)this.iIiiIiiiIiIIi[IiiiiiiiIIIII3++]);
        }
    }

    static /* synthetic */ IiiiIiiiiIiIi ALLATORIxDEMO(iIiIIiiiIiiiI arg0) {
        return arg0.IiIiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(long number, JTextField textField) {
        void IiiiiiiiIIIII;
        if (this.IiIiiiiiIIIII == null) return;
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII) == null) return;
        long IiiiiiiiIIIII2 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getMoney() != null ? IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getMoney().longValue() : 0L;
        if (number == IiiiiiiiIIIII2) return;
        IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).setMoney(new BigDecimal(number));
        GoodTrans2 goodTrans2 = new GoodTrans2();
        IiiiiiiiIIIII.setI(true);
        IiiiiiiiIIIII.setMoney(IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getMoney());
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"TransGood", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void iIiIiiiiIIiii(GoodTrans2 goodTrans2) {
        Goodstable IiiiiiiiIIIII;
        IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).ALLATORIxDEMO(goodTrans2);
        if (goodTrans2.getMoney() != null) {
            this.IiIiiiiiIIIII.ALLATORIxDEMO(goodTrans2.getMoney().longValue());
        }
        if (goodTrans2.getGoods() != null) {
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < 8) {
                IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getGood(IiiiiiiiIIIII2);
                Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iIiiIiiiIiIIi[8 + IiiiiiiiIIIII2].ALLATORIxDEMO();
                if (IiiiiiiiIIIII != null || IiiiiiiiIIIII3 != null) {
                    if (IiiiiiiiIIIII == null) {
                        this.iIiiIiiiIiIIi[8 + IiiiiiiiIIIII2].ALLATORIxDEMO(0, null);
                        this.iIiiIiiiIiIIi[8 + IiiiiiiiIIIII2].setVisible(true);
                    } else if (IiiiiiiiIIIII3 == null) {
                        this.iIiiIiiiIiIIi[8 + IiiiiiiiIIIII2].ALLATORIxDEMO(18, (Object)IiiiiiiiIIIII);
                    } else if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getRgid(), (BigDecimal)IiiiiiiiIIIII3.getRgid())) {
                        this.iIiiIiiiIiIIi[8 + IiiiiiiiIIIII2].ALLATORIxDEMO(18, (Object)IiiiiiiiIIIII);
                    }
                }
                ++IiiiiiiiIIIII2;
            }
        }
        if (goodTrans2.getPet() != null) {
            RoleSummoning IiiiiiiiIIIII4 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getPet(0);
            IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getPet(1);
            this.ALLATORIxDEMO[5].setText(IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getSummoningname() : null);
            this.ALLATORIxDEMO[6].setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getSummoningname() : null);
        }
        if (goodTrans2.getLingbao() == null) return;
        Lingbao IiiiiiiiIIIII5 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getLingbao(0);
        IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII).getLingbao(1);
        this.ALLATORIxDEMO[7].setText(IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII5.getBaoname() : null);
        this.ALLATORIxDEMO[8].setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getBaoname() : null);
    }

    public void iIiIiiiiIIiii(int type) {
        this.iiIiiiiiiIIiI = type;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == this.iiIiiiiiiIIiI);
            ++IiiiiiiiIIIII;
        }
        if (this.iiIiiiiiiIIiI == 0) {
            this.iiIiiiiiiiIii.ALLATORIxDEMO();
            this.IiIIIiiiiIiiI.setVisible(true);
            this.iiIiIiiiiIIIi[0].setVisible(true);
            this.iiIiIiiiiIIIi[1].setVisible(true);
            this.iiIiIiiiiIIIi[2].setVisible(false);
            this.iiiiIiiiIIiii.setVisible(false);
            return;
        }
        if (this.iiIiiiiiiIIiI != 1) return;
        this.iiIiIiiiiIIIi[2].setVisible(true);
        this.iiiiIiiiIIiii.setVisible(true);
        this.iiIiIiiiiIIIi[0].setVisible(false);
        this.iiIiIiiiiIIIi[1].setVisible(false);
        this.IiIIIiiiiIiiI.setVisible(false);
    }

    public void ALLATORIxDEMO(BigDecimal role_id, String roleName) {
        if (this.IiIiiiiiIIIII != null) {
            IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IiIiiiiiIIIII, null);
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiIiIIi.length) {
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII].ALLATORIxDEMO(0, null);
            this.iIiiIiiiIiIIi[IiiiiiiiIIIII++].setVisible(true);
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII++].setText(null);
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = new IiiiIiiiiIiIi(this);
        }
        if (this.IiIiiiiiIIIII == null) {
            this.IiIiiiiiIIIII = new IiiiIiiiiIiIi(this);
        }
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(null, null);
        this.IiIiiiiiIIIII.ALLATORIxDEMO(role_id, roleName);
        this.IIiiiiiiiIIIi.setText("0");
        FriendBean IiiiiiiiIIIII2 = this.ALLATORIxDEMO().getFriend(role_id.longValue());
        this.IiiiiiiiIIIII[5].iIiIiiiiIIiii((String)(IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.getGroup() == 2 ? null : "sc/b/s00.png"));
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    public void ALLATORIxDEMO(GoodTrans2 goodTrans2) {
        Goodstable IiiiiiiiIIIII;
        if (goodTrans2.getGoods() != null) {
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < 8) {
                IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getGood(IiiiiiiiIIIII2);
                Goodstable IiiiiiiiIIIII3 = (Goodstable)this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].ALLATORIxDEMO();
                if (IiiiiiiiIIIII != null || IiiiiiiiIIIII3 != null) {
                    if (IiiiiiiiIIIII == null) {
                        this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].ALLATORIxDEMO(0, null);
                        this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].setVisible(true);
                    } else if (IiiiiiiiIIIII3 == null) {
                        this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
                    } else if (!IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII.getRgid(), (BigDecimal)IiiiiiiiIIIII3.getRgid())) {
                        this.iIiiIiiiIiIIi[IiiiiiiiIIIII2].ALLATORIxDEMO(1, (Object)IiiiiiiiIIIII);
                    }
                }
                ++IiiiiiiiIIIII2;
            }
        }
        if (goodTrans2.getPet() != null) {
            RoleSummoning IiiiiiiiIIIII4 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPet(0);
            IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getPet(1);
            this.ALLATORIxDEMO[1].setText(IiiiiiiiIIIII4 != null ? IiiiiiiiIIIII4.getSummoningname() : null);
            this.ALLATORIxDEMO[2].setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getSummoningname() : null);
        }
        if (goodTrans2.getLingbao() == null) return;
        Lingbao IiiiiiiiIIIII5 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getLingbao(0);
        IiiiiiiiIIIII = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getLingbao(1);
        this.ALLATORIxDEMO[3].setText(IiiiiiiiIIIII5 != null ? IiiiiiiiIIIII5.getBaoname() : null);
        this.ALLATORIxDEMO[4].setText(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getBaoname() : null);
    }

    public void iIiIiiiiIIiii() {
        this.iiiIiiiiiiiIi = this.ALLATORIxDEMO(this.iIiIiiiiIiIii, this.iiiIiiiiiiiIi, 524, 51);
        this.IIIiiiiiIIiII.iIiIiiiiIIiii();
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Goodstable good, boolean type) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi) != 0) {
            return;
        }
        if (GoodType.ALLATORIxDEMO((Goodstable)good)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u7269\u54c1\u7981\u6b62\u4ea4\u6613");
            return;
        }
        Goodstable IiiiiiiiIIIII3 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getGood(good.getRgid());
        if (IiiiiiiiIIIII3 == null) {
            if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getGoods() != null && IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getGoods().size() >= 8) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u683c\u5b50\u5df2\u6ee1");
                return;
            }
            IiiiiiiiIIIII3 = (Goodstable)good.clone();
            IiiiiiiiIIIII3.setUsetime(Integer.valueOf(1));
            IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).setGood(IiiiiiiiIIIII3);
            IiiiiiiiIIIII3.setUsetime(Integer.valueOf(0));
        }
        Goodstable goodstable = good;
        int n = IiiiiiiiIIIII2 = type ? goodstable.getUsetime() : Math.min(goodstable.getUsetime(), IiiiiiiiIIIII3.getUsetime() + 1);
        if (IiiiiiiiIIIII2 == IiiiiiiiIIIII3.getUsetime()) {
            return;
        }
        IiiiiiiiIIIII3.setUsetime(Integer.valueOf(IiiiiiiiIIIII2));
        GoodTrans2 goodTrans2 = new GoodTrans2();
        IiiiiiiiIIIII.setI(true);
        IiiiiiiiIIIII.setGoods(IiiiiiiiIIIII3);
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"TransGood", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        this.ALLATORIxDEMO((GoodTrans2)IiiiiiiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Lingbao lingbao) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        if (IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi) != 0) {
            return;
        }
        if (lingbao == null) {
            return;
        }
        if (lingbao.getEquipment() == 1) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u7075\u5b9d\u5728\u53c2\u6218\u4e2d\uff0c\u4e0d\u53ef\u4ea4\u6613\uff01");
            return;
        }
        int IiiiiiiiIIIII3 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getLingbaos() != null ? IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getLingbaos().size() : 0;
        boolean IiiiiiiiIIIII4 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).setLingbao(lingbao);
        int n = IiiiiiiiIIIII2 = IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getLingbaos() != null ? IiiiIiiiiIiIi.ALLATORIxDEMO((IiiiIiiiiIiIi)this.IIiiIiiiIIiIi).getLingbaos().size() : 0;
        if (IiiiiiiiIIIII3 == IiiiiiiiIIIII2) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u683c\u5b50\u5df2\u6ee1");
            return;
        }
        GoodTrans2 goodTrans2 = new GoodTrans2();
        IiiiiiiiIIIII.setI(IiiiiiiiIIIII4);
        IiiiiiiiIIIII.setLingbao(lingbao);
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"TransGood", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
        this.ALLATORIxDEMO((GoodTrans2)IiiiiiiiIIIII);
    }
}
