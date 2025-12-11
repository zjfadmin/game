/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiiiiii
 *  com.xy.a.iIiiIiiiIiIIi
 *  com.xy.bean.FriendBean
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.i.iiIiIiiiiiIIi
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IIiIiiiiIiiIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IIiiIiiiIiiiI
 */
package com.xy.a;

import com.xy.a.IIIIIiiiiiiii;
import com.xy.a.iIiiIiiiIiIIi;
import com.xy.bean.FriendBean;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.i.iiIiIiiiiiIIi;
import com.xy.q.IIIIIiiiIiiII;
import com.xy.q.IIiIiiiiIiiIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIiiIiiiIiiiI;
import java.awt.Component;
import java.util.List;
import javax.swing.Icon;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TestfriendlistJpanel
extends IiiiIiiiiIiIi {
    private iiIiIiiiiiIIi[] IiIIIiiiiIiiI;
    private iiIiIiiiiiIIi[] iiIiiiiiiiIii;
    private IIIIIiiiIiiII IiiiiiiiIIIII;
    private long ALLATORIxDEMO;

    public TestfriendlistJpanel(GameView gameView) {
        super(4, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 160, 496, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/23.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), null);
        this.IiIiiiiiIIIII = new IiiIiiiiIIIii("sc/e/16.png", 1, this.iIiIiiiiIIiii(), (IiiiIiiiiIiIi)this);
        this.IiIiiiiiIIIII.setBounds(143, 9, 12, 11);
        this.add((Component)this.IiIiiiiiIIIII);
        this.IiIIIiiiiIiiI = new iiIiIiiiiiIIi[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new iiIiIiiiiiIIi("sc/e/" + (17 + IiiiiiiiIIIII) + ".png", 1, 0, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(4, 29, 53, 25);
            } else if (IiiiiiiiIIIII == 1) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(5 + 54 * IiiiiiiiIIIII, 34, 52, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(5 + 54 * IiiiiiiiIIIII, 34, 41, 21);
            }
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new iiIiIiiiiiIIi[5];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new iiIiIiiiiiIIi("sc/e/" + (20 + IiiiiiiiIIIII) + ".png", 1, 1 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(8 + 31 * IiiiiiiiIIIII, 472, 20, 17);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
        this.IiiiiiiiIIIII = new IIIIIiiiIiiII((IiiiIiiiiIiIi)this, 30);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(true);
        this.IiiiiiiiIIIII.setBounds(5, 58, 150, 400);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiiiiiiiIIIII.ALLATORIxDEMO().removeAllChildren();
        FriendBean IiiiiiiiIIIII2 = new FriendBean();
        IiiiiiiiIIIII2.setRoleName("大话精灵");
        IiiiiiiiIIIII2.setSpeciesId(999999);
        IiiiiiiiIIIII2 = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
        IIiIiiiiIiiIi IiiiiiiiIIIII3 = new IIiIiiiiIiiIi(IiiiiiiiIIIII2.getRoleName(), (Object)IiiiiiiiIIIII2);
        IiiiiiiiIIIII3.ALLATORIxDEMO(iiIIiiiiIiiII.ALLATORIxDEMO((int)0));
        IiiiiiiiIIIII3.ALLATORIxDEMO(iiIIiiiiIiiII.IIiiIiiiIIiIi);
        IiiiiiiiIIIII3.ALLATORIxDEMO((Icon)new IIiiIiiiIiiiI(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)com.xy.w.IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + IiiiiiiiIIIII2.getSpeciesId()))), 28, 28, 2, 2));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode(IiiiiiiiIIIII3));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("在线好友[0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("我的好友[0/0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("师徒关系[0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("结伴江湖[0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("跨服好友[0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("移民好友[0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("临时好友[0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO().add(new DefaultMutableTreeNode("黑名单[0]"));
        this.IiiiiiiiIIIII.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii() {
        if (this.ALLATORIxDEMO() == null) {
            return;
        }
        if (this.iIiIiiiiIIiii()) {
            return;
        }
        this.iIiIiiiiIIiii(this.iiIIiiiiIiIIi.screenData.Screen_x - 200, 120, this.getWidth(), this.getHeight());
        super.iIiIiiiiIIiii();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(long id) {
        iIiiiiiiiiiii iIiiiiiiiiiii2 = this;
        synchronized (iIiiiiiiiiiii2) {
            this.ALLATORIxDEMO(id, null);
            this.iiiIiiiiiiIIi();
            this.IiiiiiiiIIIII.ALLATORIxDEMO();
            return;
        }
    }

    public void iiiIiiiiiiIIi() {
        DefaultMutableTreeNode IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChildCount();
        int IiiiiiiiIIIII3 = 1;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2) {
            DefaultMutableTreeNode IiiiiiiiIIIII4 = (DefaultMutableTreeNode)IiiiiiiiIIIII.getChildAt(IiiiiiiiIIIII3);
            String IiiiiiiiIIIII5 = ((String)IiiiiiiiIIIII4.getUserObject()).substring(0, 4);
            if (IiiiiiiiIIIII3 != 2) {
                IiiiiiiiIIIII4.setUserObject(String.valueOf(IiiiiiiiIIIII5) + "[" + IiiiiiiiIIIII4.getChildCount() + "]");
            } else {
                int IiiiiiiiIIIII6 = 0;
                int IiiiiiiiIIIII7 = 0;
                while (IiiiiiiiIIIII7 < IiiiiiiiIIIII4.getChildCount()) {
                    DefaultMutableTreeNode IiiiiiiiIIIII8 = (DefaultMutableTreeNode)IiiiiiiiIIIII4.getChildAt(IiiiiiiiIIIII7);
                    if (IiiiiiiiIIIII8.getUserObject() instanceof IIiIiiiiIiiIi && ((FriendBean)((IIiIiiiiIiiIi)IiiiiiiiIIIII8.getUserObject()).ALLATORIxDEMO()).ALLATORIxDEMO()) {
                        ++IiiiiiiiIIIII6;
                    }
                    ++IiiiiiiiIIIII7;
                }
                IiiiiiiiIIIII4.setUserObject(String.valueOf(IiiiiiiiIIIII5) + "[" + IiiiiiiiIIIII6 + "/" + IiiiiiiiIIIII4.getChildCount() + "]");
            }
            ++IiiiiiiiIIIII3;
        }
    }

    public boolean iIiIiiiiIIiii() {
        if (System.currentTimeMillis() - this.ALLATORIxDEMO < (long)iIiIIiiiIiiiI.iiIiIiiiiIIIi) {
            return false;
        }
        this.ALLATORIxDEMO = System.currentTimeMillis() - (long)iIiIIiiiIiiiI.iiIiIiiiiIIIi + (long)(iIiIIiiiIiiiI.IIIIiiiiiiiII * 5);
        String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"friend", (String)String.valueOf(this.ALLATORIxDEMO().getRoleId()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(List<FriendBean> list, boolean show) {
        var3_3 = this;
        synchronized (var3_3) {
            IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
            IiiiiiiiIIIII = IiiiiiiiIIIII.getChildCount();
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl15
            do {
                v1 = (DefaultMutableTreeNode)IiiiiiiiIIIII.getChildAt(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII = v1;
                IiiiiiiiIIIII.removeAllChildren();
lbl15:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            for (FriendBean IiiiiiiiIIIII : list) {
                IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                this.ALLATORIxDEMO(IiiiiiiiIIIII.getFid(), IiiiiiiiIIIII);
            }
            this.iiiIiiiiiiIIi();
            if (show) {
                this.ALLATORIxDEMO = System.currentTimeMillis();
                this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
            }
            this.IiiiiiiiIIIII.ALLATORIxDEMO();
            return;
        }
    }

    public void ALLATORIxDEMO(FriendBean friendBean, int button) {
        if (friendBean == null) {
            return;
        }
        if (button == 1) {
            iIiiIiiiIiIIi IiiiiiiiIIIII = (iIiiIiiiIiIIi)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(56);
            IiiiiiiiIIIII.ALLATORIxDEMO(this.ALLATORIxDEMO().getFriend(friendBean.getFid()));
            return;
        }
        if (button != 3) return;
        IIIIIiiiiiiii IiiiiiiiIIIII = (IIIIIiiiiiiii)this.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(76);
        IiiiiiiiIIIII.ALLATORIxDEMO(this.ALLATORIxDEMO().getFriend(friendBean.getFid()));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(FriendBean friendBean) {
        iIiiiiiiiiiii iIiiiiiiiiiii2 = this;
        synchronized (iIiiiiiiiiiii2) {
            friendBean = this.ALLATORIxDEMO().ALLATORIxDEMO(friendBean);
            this.ALLATORIxDEMO(friendBean.getFid(), friendBean);
            this.iiiIiiiiiiIIi();
            this.IiiiiiiiIIIII.ALLATORIxDEMO();
            return;
        }
    }

    public void ALLATORIxDEMO(long id, FriendBean friendBean) {
        Object IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = 0;
        IIiIiiiiIiiIi IiiiiiiiIIIII3 = null;
        if (friendBean != null) {
            IiiiiiiiIIIII2 = friendBean.getGroup();
            if (friendBean.getFid() != 0L && IiiiiiiiIIIII2 == 0) {
                IiiiiiiiIIIII2 = 7;
            }
            IiiiiiiiIIIII3 = new IIiIiiiiIiiIi(friendBean.getRoleName(), (Object)friendBean);
            IiiiiiiiIIIII3.ALLATORIxDEMO(friendBean.ALLATORIxDEMO() ? iiIIiiiiIiiII.ALLATORIxDEMO((int)IiiiIiiiiIIII.iIiIiiiiIIiii((int)friendBean.getLvl())) : iiIIiiiiIiiII.ALLATORIxDEMO((int)-1));
            IiiiiiiiIIIII3.ALLATORIxDEMO(iiIIiiiiIiiII.iIIiiiiiIiiii);
            IiiiiiiiIIIII = com.xy.w.IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + friendBean.getSpeciesId()));
            IiiiiiiiIIIII3.ALLATORIxDEMO((Icon)new IIiiIiiiIiiiI(com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)IiiiiiiiIIIII), 24, 24, 1, 1));
        }
        IiiiiiiiIIIII = this.IiiiiiiiIIIII.ALLATORIxDEMO();
        int IiiiiiiiIIIII4 = ((DefaultMutableTreeNode)IiiiiiiiIIIII).getChildCount();
        int IiiiiiiiIIIII5 = 1;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4) {
            block10: {
                DefaultMutableTreeNode IiiiiiiiIIIII6 = (DefaultMutableTreeNode)((DefaultMutableTreeNode)IiiiiiiiIIIII).getChildAt(IiiiiiiiIIIII5);
                int IiiiiiiiIIIII7 = 0;
                while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.getChildCount()) {
                    DefaultMutableTreeNode IiiiiiiiIIIII8 = (DefaultMutableTreeNode)IiiiiiiiIIIII6.getChildAt(IiiiiiiiIIIII7);
                    if (IiiiiiiiIIIII8.getUserObject() instanceof IIiIiiiiIiiIi && ((FriendBean)((IIiIiiiiIiiIi)IiiiiiiiIIIII8.getUserObject()).ALLATORIxDEMO()).getFid() == id) {
                        if (IiiiiiiiIIIII5 == 1 && IiiiiiiiIIIII3 != null && friendBean.ALLATORIxDEMO()) {
                            IiiiiiiiIIIII8.setUserObject(IiiiiiiiIIIII3);
                        } else if (IiiiiiiiIIIII5 != 1 && IiiiiiiiIIIII3 != null && IiiiiiiiIIIII5 == IiiiiiiiIIIII2) {
                            IiiiiiiiIIIII8.setUserObject(IiiiiiiiIIIII3);
                        } else {
                            IiiiiiiiIIIII6.remove(IiiiiiiiIIIII7);
                        }
                        break block10;
                    }
                    ++IiiiiiiiIIIII7;
                }
                if (IiiiiiiiIIIII3 != null && (IiiiiiiiIIIII5 == 1 && friendBean.ALLATORIxDEMO() || IiiiiiiiIIIII5 != 0 && IiiiiiiiIIIII5 == IiiiiiiiIIIII2)) {
                    IiiiiiiiIIIII6.add(new DefaultMutableTreeNode(IiiiiiiiIIIII3));
                }
            }
            ++IiiiiiiiIIIII5;
        }
    }
}
