/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIiiiiiIiII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiIiiiiIiIi
 */
package com.xy.a;

import com.xy.a.IIIIiiiiiIiII;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiIiiiiIiIi;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIiiiiiiIiIii
implements TreeSelectionListener {
    final /* synthetic */ IIIIiiiiiIiII ALLATORIxDEMO;

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode IiiiiiiiIIIII = (DefaultMutableTreeNode)((JTree)e.getSource()).getLastSelectedPathComponent();
        if (IiiiiiiiIIIII == null) {
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).setViewportView(null);
            return;
        }
        String IiiiiiiiIIIII2 = IiiiiiiiIIIII.toString();
        if (IiiiiiiiIIIII2.equals("\u6e38\u620f\u4ecb\u7ecd") || IiiiiiiiIIIII2.equals("\u5145\u503c\u6bd4\u4f8b") || IiiiiiiiIIIII2.equals("\u7248\u672c\u7279\u8272") || IiiiiiiiIIIII2.equals("\u529f\u80fd\u4ecb\u7ecd")) {
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).setViewportView(null);
            String IiiiiiiiIIIII3 = iiIiIiiiiIiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3 == null) {
                return;
            }
            RichLabel IiiiiiiiIIIII4 = new RichLabel(IiiiiiiiIIIII3, iiIIiiiiIiiII.iiIiiiiiiIIiI);
            Dimension IiiiiiiiIIIII5 = IiiiiiiiIIIII4.computeSize(250);
            IiiiiiiiIIIII4.setSize(IiiiiiiiIIIII5);
            IiiiiiiiIIIII4.setPreferredSize(IiiiiiiiIIIII5);
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).setViewportView((Component)IiiiiiiiIIIII4);
            return;
        }
        if (IiiiiiiiIIIII.isLeaf()) {
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).setViewportView(null);
            String IiiiiiiiIIIII6 = iiIiIiiiiIiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (IiiiiiiiiIIII)this.ALLATORIxDEMO.ALLATORIxDEMO());
            if (IiiiiiiiIIIII6 == null) {
                return;
            }
            RichLabel IiiiiiiiIIIII7 = new RichLabel(IiiiiiiiIIIII6, iiIIiiiiIiiII.iiIiiiiiiIIiI);
            Dimension IiiiiiiiIIIII8 = IiiiiiiiIIIII7.computeSize(250);
            IiiiiiiiIIIII7.setSize(IiiiiiiiIIIII8);
            IiiiiiiiIIIII7.setPreferredSize(IiiiiiiiIIIII8);
            IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).setViewportView((Component)IiiiiiiiIIIII7);
            return;
        }
        IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).setViewportView(null);
        String IiiiiiiiIIIII9 = iiIiIiiiiIiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII9 == null) {
            return;
        }
        RichLabel IiiiiiiiIIIII10 = new RichLabel(IiiiiiiiIIIII9, iiIIiiiiIiiII.iiIiiiiiiIIiI);
        Dimension IiiiiiiiIIIII11 = IiiiiiiiIIIII10.computeSize(250);
        IiiiiiiiIIIII10.setSize(IiiiiiiiIIIII11);
        IiiiiiiiIIIII10.setPreferredSize(IiiiiiiiIIIII11);
        IIIIiiiiiIiII.ALLATORIxDEMO((IIIIiiiiiIiII)this.ALLATORIxDEMO).setViewportView((Component)IiiiiiiiIIIII10);
    }

    IIiiiiiiIiIii(IIIIiiiiiIiII iIIIiiiiiIiII) {
        this.ALLATORIxDEMO = iIIIiiiiiIiII;
    }
}
