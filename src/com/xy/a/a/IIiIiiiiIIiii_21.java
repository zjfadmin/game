/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiiiiiiiIIII
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.a;

import com.xy.a.a.IiiiiiiiiIIII;
import com.xy.a.iiIiiiiiIIiiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiIiiiiIIiii
extends JComponent
implements MouseListener {
    private int IIiiIiiiIIiIi;
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private Image iiIiiiiiiiIii;
    final /* synthetic */ IiiiiiiiiIIII IiiiiiiiIIIII;
    private Image ALLATORIxDEMO;

    @Override
    public void mouseExited(MouseEvent e) {
        if (this.IiIIIiiiiIiiI != -1) {
            if (this.IiIIIiiiiIiiI != -2) return;
        }
        this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void ALLATORIxDEMO(int skillId, int slvl) {
        this.IiIIIiiiiIiiI = skillId;
        this.iIiIiiiiIiIii = slvl;
        if (skillId == -1) {
            this.ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/59.png");
        } else if (skillId == -2) {
            this.ALLATORIxDEMO = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/115.png");
        } else {
            IIiIiiiiIIiii iIiIiiiiIIiii = this;
            iIiIiiiiIIiii.ALLATORIxDEMO = skillId == 0 ? null : IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)String.valueOf(skillId));
        }
        this.iiIiiiiiiiIii = slvl >= 0 ? IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/83") : null;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(IiiiiiiiiIIII.ALLATORIxDEMO(), 0, 0, this.getWidth(), this.getHeight(), null);
        if (this.ALLATORIxDEMO != null) {
            g.drawImage(this.ALLATORIxDEMO, 6, 6, 50, 50, null);
        }
        if (this.iiIiiiiiiiIii == null) return;
        g.drawImage(this.iiIiiiiiiiIii, 40, 7, 15, 15, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (this.IiIIIiiiiIiiI != -1) {
            if (this.IiIIIiiiiIiiI != -2) return;
        }
        iiIiiiiiIIiiI IiiiiiiiIIIII = (iiIiiiiiIIiiI)this.IiiiiiiiIIIII.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
        if (this.IiIIIiiiiIiiI == -2) {
            IiiiiiiiIIIII.IiiIiiiiiiIiI("#R\u6280\u80fd\u683c(\u672a\u83b7\u53d6)#r#Y\u83b7\u53d6\u6280\u80fd\u683c\u7684\u65b9\u5f0f:#r1.\u53ec\u5524\u517d\u70b9\u5316\u540e,\u4f7f\u7528\u63d0\u70bc\u8fc7\u7684\u805a\u9b44\u4e39\u65f6\u6709\u51e0\u7387\u83b7\u5f97;#r2.\u53ec\u5524\u517d\u542f\u7075\u65f6,\u6709\u51e0\u7387\u83b7\u5f97(\u5c01\u5370\u72b6\u6001);");
            return;
        }
        if (this.IiIIIiiiiIiiI != -1) return;
        IiiiiiiiIIIII.IiiIiiiiiiIiI("#Y\u6280\u80fd\u683c(\u5c01\u5370)#r\u89e3\u5c01\u6280\u80fd\u683c\u65b9\u5f0f:#r1.\u660e\u96f7\u6218\u6597\u53ef\u968f\u673a\u5f00\u542f(\u56ed\u5b50\u6709\u66f4\u9ad8\u7684\u6982\u7387\u89e3\u5c01);#r2.\u4f7f\u7528\u542f\u9b42\u4e39\u5f00\u542f;");
    }

    public IIiIiiiiIIiii(IiiiiiiiiIIII iiiiiiiiiIIII, int index) {
        this.IiiiiiiiIIIII = iiiiiiiiiIIII;
        this.IIiiIiiiIIiIi = index;
        this.addMouseListener(this);
    }
}
