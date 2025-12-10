/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IiiiIiiiiIiIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.i;

import com.xy.i.IiiiIiiiiIiIi;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class iIiIIiiiIiiiI
extends JLabel
implements MouseListener,
IiiiIiiiiIiIi {
    private boolean iiIIIiiiiiiiI;
    private boolean IiIiiiiiIIIII;
    private boolean iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    protected Image[] iiiIiiiiiiiIi;
    private Color[] iIiiIiiiiiiII;
    private boolean IIiiIiiiIIiIi;
    private int[] iIiIiiiiIiIii;
    public static Image IiIIIiiiiIiiI;
    protected com.xy.q.IiiiIiiiiIiIi iiIiiiiiiiIii;
    private boolean IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    @Override
    public void mouseExited(MouseEvent e) {
        this.IIiiIiiiIIiIi = Boolean.FALSE;
        this.iiIiIiiiiIIIi = Boolean.FALSE;
        this.ALLATORIxDEMO();
    }

    public iIiIIiiiIiiiI(String path, int type, com.xy.q.IiiiIiiiiIiIi form) {
        this(path, type, null, form);
    }

    public void ALLATORIxDEMO(int[] offsetTexts) {
        this.iIiIiiiiIiIii = offsetTexts;
    }

    public void iIiIiiiiIIiii(boolean isRed) {
        this.IiIiiiiiIIIII = isRed;
    }

    public void iIiIiiiiIIiii(String path) {
    }

    public void ALLATORIxDEMO(boolean isKeep) {
        this.IiiiiiiiIIIII = isKeep;
        this.ALLATORIxDEMO();
    }

    public void iiiIiiiiiiIIi(MouseEvent e) {
        if (this.ALLATORIxDEMO != 1) {
            return;
        }
        if (com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        this.iIiIiiiiIIiii();
        this.ALLATORIxDEMO(e);
    }

    public void iIiIiiiiIIiii() {
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public boolean ALLATORIxDEMO(int btn, String path) {
        if (this.ALLATORIxDEMO == btn) {
            return false;
        }
        this.iIiIiiiiIIiii(path);
        this.ALLATORIxDEMO(btn);
        return true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.iiiIiiiiiiiIi != null) {
            if (this.ALLATORIxDEMO == 1 || this.ALLATORIxDEMO == 2) {
                g.drawImage(this.iiiIiiiiiiiIi[this.iiiiIiiiIiiII], 0, 0, null);
            } else if (this.ALLATORIxDEMO == -1) {
                g.drawImage(this.iiiIiiiiiiiIi[0], 0, 0, null);
            }
        }
        if (this.iiIIIiiiiiiiI) {
            if (this.iIiIiiiiIiIii != null) {
                g.translate(0, this.iIiIiiiiIiIii[this.iiiiIiiiIiiII >= 0 ? this.iiiiIiiiIiiII : 0]);
                if (this.IIiiIiiiIIiIi) {
                    g.translate(1, 1);
                    super.paintComponent(g);
                    g.translate(-1, -1);
                } else {
                    super.paintComponent(g);
                }
                g.translate(0, -this.iIiIiiiiIiIii[this.iiiiIiiiIiiII >= 0 ? this.iiiiIiiiIiiII : 0]);
            } else if (this.IIiiIiiiIIiIi) {
                g.translate(1, 1);
                super.paintComponent(g);
                g.translate(-1, -1);
            } else {
                super.paintComponent(g);
            }
        }
        if (!this.IiIiiiiiIIIII) return;
        if (IiIIIiiiiIiiI == null) {
            IiIIIiiiiIiiI = IIIIIiiiIiiII.ALLATORIxDEMO();
        }
        g.drawImage(IiIIIiiiiIiiI, this.getWidth() - 10, 0, null);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.ALLATORIxDEMO == -1) {
            return;
        }
        this.IIiiIiiiIIiIi = Boolean.TRUE;
        this.ALLATORIxDEMO();
        if (!this.iiIiIiiiiIIIi) return;
        this.iIiIiiiiIIiii(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.ALLATORIxDEMO == -1) {
            return;
        }
        this.IIiiIiiiIIiIi = Boolean.FALSE;
        this.ALLATORIxDEMO();
        if (!this.iiIiIiiiiIIIi) return;
        this.iiiIiiiiiiIIi(e);
    }

    public abstract void ALLATORIxDEMO(MouseEvent var1);

    public void iIiIiiiiIIiii(MouseEvent e) {
        if (this.ALLATORIxDEMO != 2) {
            return;
        }
        this.iIiIiiiiIIiii();
        this.ALLATORIxDEMO(e, !this.IiiiiiiiIIIII);
    }

    public iIiIIiiiIiiiI(String path, int type, Color[] colors, com.xy.q.IiiiIiiiiIiIi form) {
        this.ALLATORIxDEMO = type;
        this.iiIiiiiiiiIii = form;
        this.iIiIiiiiIIiii(path);
        this.iIiiIiiiiiiII = colors;
        if (colors == null) {
            this.setForeground(Color.WHITE);
        }
        this.addMouseListener(this);
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO() {
        if (this.iiiiIiiiIiiII == -1) {
            return;
        }
        this.iiiiIiiiIiiII = this.IIiiIiiiIIiIi || this.IiiiiiiiIIIII ? 2 : (this.iiIiIiiiiIIIi ? 1 : 0);
        if (this.iIiiIiiiiiiII == null) return;
        if (this.getForeground() == this.iIiiIiiiiiiII[this.iiiiIiiiIiiII]) return;
        this.setForeground(this.iIiiIiiiiiiII[this.iiiiIiiiIiiII]);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (this.ALLATORIxDEMO == -1) {
            return;
        }
        this.iiIiIiiiiIIIi = Boolean.TRUE;
        this.ALLATORIxDEMO();
    }

    @Override
    public void setText(String text) {
        this.iiIIIiiiiiiiI = text != null && !text.equals("");
        super.setText(text);
    }

    public abstract void ALLATORIxDEMO(MouseEvent var1, boolean var2);

    public void ALLATORIxDEMO(String path) {
        this.iIiIiiiiIIiii(path);
        this.ALLATORIxDEMO(this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(Image[] images) {
        this.iiiIiiiiiiiIi = images;
    }

    public void ALLATORIxDEMO(int btn) {
        this.ALLATORIxDEMO = btn;
        if (btn == -1) {
            this.iiiiIiiiIiiII = -1;
            if (this.iIiiIiiiiiiII == null) return;
            if (this.getForeground() == this.iIiiIiiiiiiII[0]) return;
            this.setForeground(this.iIiiIiiiiiiII[0]);
            return;
        }
        this.iiiiIiiiIiiII = 0;
        this.ALLATORIxDEMO();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
