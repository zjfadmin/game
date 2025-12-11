/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IIIIIiiiIiiII
 *  com.xy.a.a.PetJpanel2
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.readbean.Skill
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IIIIIiiiIiiII;
import com.xy.a.a.PetJpanel2;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Skill;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class PetButton1
extends JComponent
implements MouseListener {
    private Image iIiiIiiiiiiII;
    final /* synthetic */ PetJpanel2 IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private Image iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.IiiiiiiiIIIII <= 0) return;
        RoleSummoning IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO().getChosePet();
        Skill IiiiiiiiIIIII2 = this.IiiiiiiiIIIII != 0 ? this.IIiiIiiiIIiIi.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(this.IiiiiiiiIIIII)) : null;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII, this.IiiiiiiiIIIII, this.iIiIiiiiIiIii, IiiiiiiiIIIII2, this.ALLATORIxDEMO == 1);
        if (!this.IIiiIiiiIIiIi.ALLATORIxDEMO().gameBBXY) return;
        if (this.IiiiiiiiIIIII != 1250) {
            if (this.IiiiiiiiIIIII != 1269) return;
        }
        ((IIIIIiiiIiiII)this.IIiiIiiiIIiIi.ALLATORIxDEMO().iiiIiiiiiiIIi(146)).ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (this.IiiiiiiiIIIII != -1) {
            if (this.IiiiiiiiIIIII != -2) return;
        }
        if (!this.IIiiIiiiIIiIi.ALLATORIxDEMO().gamePetSkill) return;
        iiIiiiiiIIiiI IiiiiiiiIIIII = (iiIiiiiiIIiiI)this.IIiiIiiiIIiIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        if (this.IiIIIiiiiIiiI == 6) {
            if (this.IiiiiiiiIIIII == -2) {
                IiiiiiiiIIIII.IiiIiiiiiiIiI("#R\u795e\u517d\u6280\u80fd\u683c(\u672a\u83b7\u53d6)#r#Y\u83b7\u53d6\u6280\u80fd\u683c\u7684\u65b9\u5f0f:#r\u524d6\u4e2a\u6280\u80fd\u683c\u90fd\u83b7\u53d6\u65f6\u81ea\u52a8\u83b7\u53d6;");
                return;
            }
            if (this.IiiiiiiiIIIII != -1) return;
            IiiiiiiiIIIII.IiiIiiiiiiIiI("#Y\u795e\u517d\u6280\u80fd\u683c(\u5c01\u5370)#r\u89e3\u5c01\u6280\u80fd\u683c\u65b9\u5f0f:#r\u524d6\u4e2a\u6280\u80fd\u683c\u90fd\u5f00\u542f\u65f6\u81ea\u52a8\u5f00\u542f;");
            return;
        }
        if (this.IiiiiiiiIIIII == -2) {
            IiiiiiiiIIIII.IiiIiiiiiiIiI("#R\u6280\u80fd\u683c(\u672a\u83b7\u53d6)#r#Y\u83b7\u53d6\u6280\u80fd\u683c\u7684\u65b9\u5f0f:#r1.\u53ec\u5524\u517d\u70b9\u5316\u540e,\u4f7f\u7528\u63d0\u70bc\u8fc7\u7684\u805a\u9b44\u4e39\u65f6\u6709\u51e0\u7387\u83b7\u5f97;#r2.\u53ec\u5524\u517d\u542f\u7075\u65f6,\u6709\u51e0\u7387\u83b7\u5f97(\u5c01\u5370\u72b6\u6001);");
            return;
        }
        if (this.IiiiiiiiIIIII != -1) return;
        IiiiiiiiIIIII.IiiIiiiiiiIiI("#Y\u6280\u80fd\u683c(\u5c01\u5370)#r\u89e3\u5c01\u6280\u80fd\u683c\u65b9\u5f0f:#r1.\u660e\u96f7\u6218\u6597\u53ef\u968f\u673a\u5f00\u542f;#r2.\u4f7f\u7528\u542f\u9b42\u4e39\u5f00\u542f;");
    }

    static /* synthetic */ int iIiIiiiiIIiii(PetButton1 arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public PetButton1(PetJpanel2 petJpanel2, int type1, int type2) {
        this.IIiiIiiiIIiIi = petJpanel2;
        this.ALLATORIxDEMO = type1;
        this.IiIIIiiiiIiiI = type2;
        this.addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.iiIiiiiiiiIii != null) {
            g.drawImage(this.iiIiiiiiiiIii, 2, 2, this.getWidth() - 4, this.getHeight() - 4, null);
        }
        if (this.iIiiIiiiiiiII == null) return;
        g.drawImage(this.iIiiIiiiiiiII, 36, 3, 15, 15, null);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    static /* synthetic */ int ALLATORIxDEMO(PetButton1 arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (this.IiiiiiiiIIIII != -1) {
            if (this.IiiiiiiiIIIII != -2) return;
        }
        if (!this.IIiiIiiiIIiIi.ALLATORIxDEMO().gamePetSkill) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void ALLATORIxDEMO(int skillId, int slvl) {
        this.IiiiiiiiIIIII = skillId;
        this.iIiIiiiiIiIii = slvl;
        if (skillId == -1) {
            this.iiIiiiiiiiIii = com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/59.png");
        } else if (skillId == -2) {
            this.iiIiiiiiiiIii = com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/115.png");
        } else {
            PetButton1 petButton1 = this;
            petButton1.iiIiiiiiiiIii = skillId == 0 ? null : com.xy.w.IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)String.valueOf(skillId));
        }
        this.iIiiIiiiiiiII = slvl >= 0 ? com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/83") : null;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }
}
