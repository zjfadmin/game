/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IiiiIiiiiIiIi
 *  com.xy.q.iIiIIiiiIIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.i;

import com.xy.i.IiiiIiiiiIiIi;
import com.xy.q.iIiIIiiiIIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiiiiiiiIIIII;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class IIIIIiiiIiiII
extends JComponent
implements MouseListener,
IiiiIiiiiIiIi {
    private boolean iiiiIiiiIIiii;
    private int iIIiIiiiiiiIi;
    private boolean IIIIiiiiiiiII;
    protected Image iiIIIiiiiiiiI;
    private boolean IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi = -1;
    private iiiiiiiiIIIII iiiiIiiiIiiII;
    private String[] iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi = -1;
    public static Image iIiIiiiiIiIii;
    private int[] IiIIIiiiiIiiI;
    private boolean iiIiiiiiiiIii;
    private Color[] IiiiiiiiIIIII;
    private boolean ALLATORIxDEMO;

    public void iIiIiiiiIIiii(boolean isRed) {
        this.iiIiiiiiiiIii = isRed;
    }

    public void iIiIiiiiIIiii(String path) {
        this.ALLATORIxDEMO(path);
        this.ALLATORIxDEMO(this.iIiiIiiiiiiII);
    }

    protected void iIiIiiiiIIiii(Graphics g) {
        if (!(g.getFont() instanceof iIiIIiiiIIiIi)) {
            this.ALLATORIxDEMO(g);
            return;
        }
        Graphics2D IiiiiiiiIIIII = (Graphics2D)g;
        Object IiiiiiiiIIIII2 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_RENDERING);
        Object IiiiiiiiIIIII3 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (IiiiiiiiIIIII2 != RenderingHints.VALUE_RENDER_QUALITY) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        } else {
            IiiiiiiiIIIII2 = null;
        }
        if (IiiiiiiiIIIII3 != RenderingHints.VALUE_ANTIALIAS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            IiiiiiiiIIIII3 = null;
        }
        this.ALLATORIxDEMO(g);
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, IiiiiiiiIIIII2);
        }
        if (IiiiiiiiIIIII3 == null) return;
        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII3);
    }

    public void iIiIiiiiIIiii() {
        if (this.iIIiIiiiiiiIi == -1) {
            return;
        }
        this.iIIiIiiiiiiIi = this.iiiiIiiiIIiii || this.ALLATORIxDEMO ? 2 : (this.IiIiiiiiIIIII ? 1 : 0);
        if (this.IiiiiiiiIIIII == null) return;
        if (this.getForeground() == this.IiiiiiiiIIIII[this.iIIiIiiiiiiIi]) return;
        this.setForeground(this.IiiiiiiiIIIII[this.iIIiIiiiiiiIi]);
    }

    public void iiiIiiiiiiIIi(MouseEvent e) {
        if (this.iIiiIiiiiiiII != 2) {
            return;
        }
        this.ALLATORIxDEMO(e, !this.ALLATORIxDEMO);
    }

    public void ALLATORIxDEMO(boolean isKeep) {
        this.ALLATORIxDEMO = isKeep;
        this.iIiIiiiiIIiii();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (this.iIiiIiiiiiiII == -1) {
            return;
        }
        this.IiIiiiiiIIIII = Boolean.TRUE;
        this.iIiIiiiiIIiii();
    }

    protected void ALLATORIxDEMO(Graphics g) {
        int IiiiiiiiIIIII;
        if (this.iiiiIiiiIiiII == null || this.iiiiIiiiIiiII.IiiiiiiiIIIII == 0) {
            if (this.iiiiIiiiIiiII == null) {
                this.iiiiIiiiIiiII = new iiiiiiiiIIIII(0, 0, 0, 0);
                this.iiiiIiiiIiiII.IiiiiiiiIIIII = g.getFontMetrics().getHeight();
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
                    String string = this.iiiIiiiiiiiIi[IiiiiiiiIIIII];
                    ++IiiiiiiiIIIII;
                    this.iiiiIiiiIiiII.iiIiiiiiiiIii = Math.max(this.iiiiIiiiIiiII.iiIiiiiiiiIii, g.getFontMetrics().stringWidth(string));
                }
                this.iiiiIiiiIiiII.ALLATORIxDEMO = (this.getWidth() - this.iiiiIiiiIiiII.iiIiiiiiiiIii) / 2;
                this.iiiiIiiiIiiII.IiIIIiiiiIiiI = (this.getHeight() - this.iiiiIiiiIiiII.IiiiiiiiIIIII * this.iiiIiiiiiiiIi.length) / 2;
            }
            this.iiiiIiiiIiiII.IiiiiiiiIIIII = g.getFontMetrics().getHeight();
        }
        g.setColor(this.getForeground());
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            g.drawString(this.iiiIiiiiiiiIi[IiiiiiiiIIIII], this.iiiiIiiiIiiII.ALLATORIxDEMO, this.iiiiIiiiIiiII.IiIIIiiiiIiiI + IiiiiiiiIIIII++ * this.iiiiIiiiIiiII.IiiiiiiiIIIII);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.iiiiIiiiIIiii = Boolean.FALSE;
        this.IiIiiiiiIIIII = Boolean.FALSE;
        this.iIiIiiiiIIiii();
    }

    public void ALLATORIxDEMO(int[] offsetTexts) {
        this.IiIIIiiiiIiiI = offsetTexts;
    }

    public boolean ALLATORIxDEMO(int btn, String path) {
        if (this.iIiiIiiiiiiII == btn) {
            return false;
        }
        this.ALLATORIxDEMO(path);
        this.ALLATORIxDEMO(btn);
        return true;
    }

    public IIIIIiiiIiiII(String path, int type) {
        this(path, type, null);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String[] stringArray) {
        void texts;
        this.iiiIiiiiiiiIi = texts;
        this.IIIIiiiiiiiII = texts != null;
    }

    public abstract void ALLATORIxDEMO(MouseEvent var1);

    public void ALLATORIxDEMO(int btn) {
        this.iIiiIiiiiiiII = btn;
        if (btn == -1) {
            this.iIIiIiiiiiiIi = -1;
            if (this.IiiiiiiiIIIII == null) return;
            if (this.getForeground() == this.IiiiiiiiIIIII[0]) return;
            this.setForeground(this.IiiiiiiiIIIII[0]);
            return;
        }
        this.iIIiIiiiiiiIi = 0;
        this.iIiIiiiiIIiii();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.iIiiIiiiiiiII == -1) {
            return;
        }
        this.iiiiIiiiIIiii = Boolean.TRUE;
        this.iIiIiiiiIIiii();
        if (!this.IiIiiiiiIIIII) return;
        this.iiiIiiiiiiIIi(e);
    }

    public void ALLATORIxDEMO(iiiiiiiiIIIII textPoint) {
        this.iiiiIiiiIiiII = textPoint;
    }

    public IIIIIiiiIiiII(String path, int type, Color[] colors) {
        this.setOpaque(false);
        this.iIiiIiiiiiiII = type;
        this.ALLATORIxDEMO(path);
        this.IiiiiiiiIIIII = colors;
        if (colors == null) {
            this.setForeground(Color.WHITE);
        }
        this.addMouseListener(this);
        this.iIiIiiiiIIiii();
    }

    public abstract void ALLATORIxDEMO(MouseEvent var1, boolean var2);

    public void ALLATORIxDEMO(String path) {
        if (path != null) {
            this.iiIIIiiiiiiiI = com.xy.w.IIIIIiiiIiiII.iiiIiiiiiiIIi((String)path);
        }
        this.iiIiIiiiiIIIi = -1;
        this.IIiiIiiiIIiIi = -1;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.iIiiIiiiiiiII == -1) {
            return;
        }
        this.iiiiIiiiIIiii = Boolean.FALSE;
        this.iIiIiiiiIIiii();
        if (!this.IiIiiiiiIIIII) return;
        this.iIiIiiiiIIiii(e);
    }

    public void iIiIiiiiIIiii(MouseEvent e) {
        if (this.iIiiIiiiiiiII != 1) {
            return;
        }
        if (iIiIIiiiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        this.ALLATORIxDEMO(e);
    }

    public int ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.iiIIIiiiiiiiI != null) {
            if (this.iiIiIiiiiIIIi == -1) {
                this.ALLATORIxDEMO();
            }
            if (this.iIiiIiiiiiiII == 1 || this.iIiiIiiiiiiII == 2) {
                g.drawImage(this.iiIIIiiiiiiiI, 0, 0, this.getWidth(), this.getHeight(), 0, this.IIiiIiiiIIiIi * this.iIIiIiiiiiiIi, this.iiIiIiiiiIIIi, this.IIiiIiiiIIiIi * this.iIIiIiiiiiiIi + this.IIiiIiiiIIiIi, null);
            } else if (this.iIiiIiiiiiiII == -1) {
                g.drawImage(this.iiIIIiiiiiiiI, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        }
        if (this.IIIIiiiiiiiII) {
            if (this.IiIIIiiiiIiiI != null) {
                g.translate(this.IiIIIiiiiIiiI[this.iIIiIiiiiiiIi], 0);
                if (this.iiiiIiiiIIiii) {
                    g.translate(1, 1);
                    this.iIiIiiiiIIiii(g);
                    g.translate(-1, -1);
                } else {
                    this.iIiIiiiiIIiii(g);
                }
                g.translate(-this.IiIIIiiiiIiiI[this.iIIiIiiiiiiIi], 0);
            } else if (this.iiiiIiiiIIiii) {
                g.translate(1, 1);
                this.iIiIiiiiIIiii(g);
                g.translate(-1, -1);
            } else {
                this.iIiIiiiiIIiii(g);
            }
        }
        if (!this.iiIiiiiiiiIii) return;
        if (iIiIiiiiIiIii == null) {
            iIiIiiiiIiIii = com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO();
        }
        g.drawImage(iIiIiiiiIiIii, this.getWidth() - 10, 0, null);
    }

    public void ALLATORIxDEMO() {
        this.iiIiIiiiiIIIi = this.iiIIIiiiiiiiI.getWidth(null);
        this.IIiiIiiiIIiIi = this.iiIIIiiiiiiiI.getHeight(null) / 3;
    }
}
