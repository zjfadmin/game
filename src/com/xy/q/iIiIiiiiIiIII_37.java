/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiiIiiiiIiII
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.a.q.iIiIIiiiIiiiI
 *  com.xy.a.q.iIiIIiiiiiiiI
 *  com.xy.a.q.iiiIIiiiIIIii
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.RoleData
 *  com.xy.game.RolePet
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.q.IIIIIiiiIIIiI
 *  com.xy.q.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.q;

import com.xy.a.IiiiIiiiiIiII;
import com.xy.a.a.iiIiIiiiiIiii;
import com.xy.a.q.iIiIIiiiIiiiI;
import com.xy.a.q.iIiIIiiiiiiiI;
import com.xy.a.q.iiiIIiiiIIIii;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.q.IIIIIiiiIIIiI;
import com.xy.q.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIiiiiIiIII
extends JComponent
implements MouseListener {
    private IiIiIiiiiIIiI IIIIiiiiiiiII;
    private boolean iiIIIiiiiiiiI;
    private IIIIIiiiIIIiI IiIiiiiiIIIII;
    private long iiIiIiiiiIIIi;
    private boolean iiiiIiiiIiiII;
    public static Color iiiIiiiiiiiIi;
    public static Color iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi;
    private JLabel iIiIiiiiIiIii;
    private IiiiIiiiiIiIi IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    public static Color IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.iiiiIiiiIiiII) {
            g.setColor(iIiiIiiiiiiII);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            return;
        }
        if (!this.iiIIIiiiiiiiI) return;
        g.setColor(iiiIiiiiiiiIi);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public iIiIiiiiIiIII(IiiiIiiiiIiIi form) {
        this.IiIIIiiiiIiiI = form;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IIIIiiiiiiiII = new IiIiIiiiiIIiI("sc/c/81", 1, 6, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, null, form);
        this.IIIIiiiiiiiII.setBounds(3, 1, 18, 18);
        this.IIIIiiiiiiiII.ALLATORIxDEMO((Object)this);
        this.add((Component)this.IIIIiiiiiiiII);
        this.iIiIiiiiIiIii = new JLabel();
        this.iIiIiiiiIiIii.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iIiIiiiiIiIii.setForeground(Color.GREEN);
        this.iIiIiiiiIiIii.setBounds(24, 2, 110, 16);
        this.add(this.iIiIiiiiIiIii);
        this.addMouseListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        RolePet IiiiiiiiIIIII;
        this.iiIIIiiiiiiiI = true;
        if (!(this.IiIIIiiiiIiiI instanceof iiIiIiiiiIiii)) {
            if (!(this.IiIIIiiiiIiiI instanceof iIiIIiiiIiiiI)) return;
        }
        if ((IiiiiiiiIIIII = this.IiIIIiiiiIiiI.ALLATORIxDEMO().getRolePet(this.iiIiIiiiiIIIi)) == null) {
            return;
        }
        ((IiiiIiiiiIiII)this.IiIiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO().iiiIiiiiiiIIi(42)).ALLATORIxDEMO(IiiiiiiiIIIII.getPet(), null, false);
    }

    public void ALLATORIxDEMO(long id, String name) {
        this.iiIiIiiiiIIIi = id;
        this.iIiIiiiiIiIii.setText(name);
    }

    static {
        IiiiiiiiIIIII = new Color(203, 181, 91);
        iIiiIiiiiiiII = new Color(75, 165, 145, 180);
        iiiIiiiiiiiIi = new Color(153, 153, 153, 150);
    }

    public void iIiIiiiiIIiii(boolean inside) {
        this.iiIIIiiiiiiiI = inside;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!e.isMetaDown()) return;
        if (!(this.IiIIIiiiiIiiI instanceof iiIiIiiiiIiii)) return;
        this.IiIIIiiiiIiiI.ALLATORIxDEMO().iiiIiiiiiiIIi(this.IiIIIiiiiIiiI.iIiIiiiiIIiii());
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(RoleSummoning roleSummoning) {
        void pet;
        this.ALLATORIxDEMO = 0;
        this.iiIiIiiiiIIIi = pet != null ? pet.getSid().longValue() : 0L;
        this.iIiIiiiiIiIii.setText(pet != null ? pet.getSummoningname() : null);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        RoleSummoning IiiiiiiiIIIII;
        RolePet IiiiiiiiIIIII2 = this.IiIIIiiiiIiiI.ALLATORIxDEMO().getRolePet(this.iiIiIiiiiIIIi);
        RoleSummoning roleSummoning = IiiiiiiiIIIII = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getPet() : null;
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (e.getButton() == 1) {
            if (e.isShiftDown()) {
                try {
                    JTextField IiiiiiiiIIIII3 = this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.getBaseView().ALLATORIxDEMO();
                    ((IiiIiiiiIIIii)IiiiiiiiIIIII3.getDocument()).ALLATORIxDEMO(IiiiiiiiIIIII3.getCaretPosition(), 3, IiiiiiiiIIIII2.getId(), "[" + IiiiiiiiIIIII.getSummoningname() + "]", "G", null);
                }
                catch (BadLocationException IiiiiiiiIIIII4) {
                    IiiiiiiiIIIII4.printStackTrace();
                }
            }
            if (this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.getMouseIndex() == iiIiIiiiIIIiI.iiIIIiiiiiiiI) {
                this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
                if ((IiiiiiiiIIIII.getPetlock() >> 0 & 1) == 1) {
                    this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u5df2\u52a0\u9501");
                } else {
                    IiiiiiiiIIIII.setPetlock(IiiiiiiiIIIII.getPetlock() | 1);
                    ParamTool.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII, (GameClient)this.IiIIIiiiiIiiI.ALLATORIxDEMO());
                    this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u52a0\u9501\u6210\u529f");
                    if (this.iiiiIiiiIiiII) {
                        ((iiIiIiiiiIiii)this.IiIIIiiiiIiiI).iiiIiiiiiiIIi(true);
                    }
                }
            } else if (this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.getMouseIndex() == iiIiIiiiIIIiI.iiiIiiiiiiiIi && (IiiiiiiiIIIII.getPetlock() >> 0 & 1) == 1) {
                this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.setMouseIndex(iiIiIiiiIIIiI.IiIIIiiiiIiiI);
                IiiiiiiiIIIII.setPetlock(IiiiiiiiIIIII.getPetlock() & 0xFFFFFFFE);
                ParamTool.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII, (GameClient)this.IiIIIiiiiIiiI.ALLATORIxDEMO());
                this.IiIIIiiiiIiiI.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u89e3\u9501\u6210\u529f");
                if (this.iiiiIiiiIiiII) {
                    ((iiIiIiiiiIiii)this.IiIIIiiiiIiiI).iiiIiiiiiiIIi(false);
                }
            }
        }
        this.IiIiiiiiIIIII.ALLATORIxDEMO(this);
    }

    public iIiIiiiiIiIII(IIIIIiiiIIIiI petBox) {
        this.IiIIIiiiiIiiI = petBox.ALLATORIxDEMO();
        this.IiIiiiiiIIIII = petBox;
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.IIIIiiiiiiiII = new IiIiIiiiiIIiI("sc/c/81", 1, 6, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, null, this.IiIIIiiiiIiiI);
        this.IIIIiiiiiiiII.setBounds(3, 1, 18, 18);
        this.IIIIiiiiiiiII.ALLATORIxDEMO((Object)this);
        this.add((Component)this.IIIIiiiiiiiII);
        this.iIiIiiiiIiIii = new JLabel();
        this.iIiIiiiiIiIii.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iIiIiiiiIiIii.setForeground(Color.GREEN);
        this.iIiIiiiiIiIii.setBounds(24, 2, 110, 16);
        this.add(this.iIiIiiiiIiIii);
        this.addMouseListener(this);
    }

    public void ALLATORIxDEMO(int index) {
        this.IIiiIiiiIIiIi = index;
        this.IIIIiiiiiiiII.setText(String.valueOf(index));
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Lingbao lingbao) {
        void lingbao2;
        this.ALLATORIxDEMO = 1;
        this.iiIiIiiiiIIIi = lingbao2 != null ? lingbao2.getBaoid().longValue() : 0L;
        this.iIiIiiiiIiIii.setText(lingbao2 != null ? lingbao2.getBaoname() : null);
    }

    public JLabel ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag == this.isVisible()) return;
        this.show(aFlag);
    }

    public int ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public boolean ALLATORIxDEMO() {
        return this.iiIIIiiiiiiiI;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iiIIIiiiiiiiI = false;
        if (!(this.IiIIIiiiiIiiI instanceof iiIiIiiiiIiii)) {
            if (!(this.IiIIIiiiiIiiI instanceof iIiIIiiiIiiiI)) return;
        }
        this.IiIiiiiiIIIII.ALLATORIxDEMO().ALLATORIxDEMO().iiiIiiiiiiIIi(42);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.IiIIIiiiiIiiI instanceof iiiIIiiiIIIii) {
            ((iiiIIiiiIIIii)this.IiIIIiiiiIiiI).ALLATORIxDEMO(this);
            return;
        }
        if (this.IiIIIiiiiIiiI instanceof iiIiIiiiiIiii) {
            this.ALLATORIxDEMO(e);
            return;
        }
        if (this.IiIIIiiiiIiiI instanceof iIiIIiiiIiiiI) {
            ((iIiIIiiiIiiiI)this.IiIIIiiiiIiiI).ALLATORIxDEMO(this.IiIIIiiiiIiiI.ALLATORIxDEMO().getRolePet(this.iiIiIiiiiIIIi), e);
            return;
        }
        if (this.IiIiiiiiIIIII == null) return;
        this.IiIiiiiiIIIII.ALLATORIxDEMO(this);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public void ALLATORIxDEMO(boolean select) {
        this.iiiiIiiiIiiII = select;
        if (!(this.IiIIIiiiiIiiI instanceof iIiIIiiiiiiiI)) return;
        this.iIiIiiiiIiIii.setForeground(select ? Color.red : Color.white);
    }

    public boolean ALLATORIxDEMO(int index, long selectId, RoleSummoning pet, RoleData roleData, List<BigDecimal> dieList) {
        this.iiIiIiiiiIIIi = pet.getSid().longValue();
        this.iiiiIiiiIiiII = this.iiIiIiiiiIIIi == selectId;
        this.iiIiiiiiiiIii = pet.getPetlock() == 1;
        String IiiiiiiiIIIII = pet.getSummoningname();
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII, (String)this.iIiIiiiiIiIii.getText())) {
            this.iIiIiiiiIiIii.setText(IiiiiiiiIIIII);
        }
        if (this.IIiiIiiiIIiIi != index) {
            this.IIiiIiiiIIiIi = index;
            this.IIIIiiiiiiiII.setText(String.valueOf(index));
        }
        if (this.IiIIIiiiiIiiI instanceof iiIiIiiiiIiii) {
            if (dieList != null && dieList.contains(pet.getSid())) {
                this.iIiIiiiiIiIii.setForeground(Color.red);
            } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)roleData.getLoginResult().getSummoning_id(), (BigDecimal)pet.getSid())) {
                this.iIiIiiiiIiIii.setForeground(iIiIiiiiIiIII.IiiiiiiiIIIII);
            } else {
                this.iIiIiiiiIiIii.setForeground(Color.white);
            }
        } else {
            if (!(this.IiIIIiiiiIiiI instanceof iIiIIiiiiiiiI)) return this.iiiiIiiiIiiII;
            this.iIiIiiiiIiIii.setForeground(this.iiiiIiiiIiiII ? Color.red : Color.white);
        }
        return this.iiiiIiiiIiiII;
    }

    public void ALLATORIxDEMO() {
        this.ALLATORIxDEMO = 0;
        this.iiIiIiiiiIIIi = 0L;
        this.iiiiIiiiIiiII = false;
        this.iiIiiiiiiiIii = false;
        this.iIiIiiiiIiIii.setText(null);
        this.iIiIiiiiIiIii.setForeground(Color.GREEN);
    }

    public long ALLATORIxDEMO() {
        return this.iiIiIiiiiIIIi;
    }
}
