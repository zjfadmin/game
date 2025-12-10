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
import com.xy.v.iIiIIiiiIiiiI;
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
public abstract class IIiiIiiiiIIiI
extends JLabel
implements MouseListener,
IiiiIiiiiIiIi {
    private int imgW = -1;
    private int[] offsetTexts;
    public static Image JT;
    private boolean isMouse;
    private int btn;
    private boolean isInside;
    private boolean isText;
    private int imgH = -1;
    private int index;
    protected Image image;
    private boolean isRed;
    protected com.xy.q.IiiiIiiiiIiIi form;
    private boolean isKeep;
    private Color[] colors;

    public void iIiIiiiiIIiii() {
    }

    public void iiiIiiiiiiIIi(MouseEvent e) {
        if (this.btn != 1) {
            return;
        }
        if (iIiIIiiiIiiiI.ALLATORIxDEMO()) {
            return;
        }
        this.iIiIiiiiIIiii();
        this.ALLATORIxDEMO(e);
    }

    public void setKeep(boolean isKeep) {
        this.isKeep = isKeep;
        this.ALLATORIxDEMO();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.image != null) {
            if (this.imgW == -1) {
                this.getImageSize();
            }
            if (this.btn == 1 || this.btn == 2) {
                g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), 0, this.imgH * this.index, this.imgW, this.imgH * this.index + this.imgH, null);
            } else if (this.btn == -1) {
                g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        }
        if (this.isText) {
            if (this.offsetTexts != null) {
                g.translate(0, this.offsetTexts[this.index >= 0 ? this.index : 0]);
                if (this.isMouse) {
                    g.translate(1, 1);
                    super.paintComponent(g);
                    g.translate(-1, -1);
                } else {
                    super.paintComponent(g);
                }
                g.translate(0, -this.offsetTexts[this.index >= 0 ? this.index : 0]);
            } else if (this.isMouse) {
                g.translate(1, 1);
                super.paintComponent(g);
                g.translate(-1, -1);
            } else {
                super.paintComponent(g);
            }
        }
        if (!this.isRed) return;
        if (JT == null) {
            JT = IIIIIiiiIiiII.ALLATORIxDEMO();
        }
        g.drawImage(JT, this.getWidth() - 10, 0, null);
    }

    public void ALLATORIxDEMO() {
        if (this.index == -1) {
            return;
        }
        this.index = this.isMouse || this.isKeep ? 2 : (this.isInside ? 1 : 0);
        if (this.colors == null) return;
        if (this.getForeground() == this.colors[this.index]) return;
        this.setForeground(this.colors[this.index]);
    }

    public void setImage(String path) {
        if (path != null) {
            this.image = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)path);
        }
        this.imgW = -1;
        this.imgH = -1;
    }

    public void setRed(boolean isRed) {
        this.isRed = isRed;
    }

    public boolean ALLATORIxDEMO() {
        return this.isKeep;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.btn == -1) {
            return;
        }
        this.isMouse = Boolean.FALSE;
        this.ALLATORIxDEMO();
        if (!this.isInside) return;
        this.iiiIiiiiiiIIi(e);
    }

    public void setBtnPath(String path) {
        this.setImage(path);
        this.setBtn(this.btn);
    }

    public int getBtn() {
        return this.btn;
    }

    public com.xy.q.IiiiIiiiiIiIi getForm() {
        return this.form;
    }

    public abstract void ALLATORIxDEMO(MouseEvent var1, boolean var2);

    @Override
    public void mouseExited(MouseEvent e) {
        this.isMouse = Boolean.FALSE;
        this.isInside = Boolean.FALSE;
        this.ALLATORIxDEMO();
    }

    public void getImageSize() {
        this.imgW = this.image.getWidth(null);
        this.imgH = this.image.getHeight(null) / 3;
    }

    public IIiiIiiiiIIiI(String path, int type, com.xy.q.IiiiIiiiiIiIi form) {
        this(path, type, null, form);
    }

    public void setOffsetTexts(int[] offsetTexts) {
        this.offsetTexts = offsetTexts;
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        try {
            if (this.getX() != x) {
                com.xy.q.IiiiIiiiiIiIi.iIiiIiiiIiIIi.set(this, x);
            }
            if (this.getY() != y) {
                com.xy.q.IiiiIiiiiIiIi.IiiIIiiiiiiiI.set(this, y);
            }
            if (this.getWidth() != width) {
                com.xy.q.IiiiIiiiiIiIi.iIiiIiiiiiiII.set(this, width);
            }
            if (this.getHeight() == height) return;
            com.xy.q.IiiiIiiiiIiIi.IiIIiiiiIIIII.set(this, height);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
    }

    public IIiiIiiiiIIiI(String path, int type, Color[] colors, com.xy.q.IiiiIiiiiIiIi form) {
        this.btn = type;
        this.form = form;
        this.setImage(path);
        this.colors = colors;
        if (colors == null) {
            this.setForeground(Color.WHITE);
        }
        this.addMouseListener(this);
        this.ALLATORIxDEMO();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (this.btn == -1) {
            return;
        }
        this.isMouse = Boolean.TRUE;
        this.ALLATORIxDEMO();
        if (!this.isInside) return;
        this.iIiIiiiiIIiii(e);
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag == this.isVisible()) return;
        this.show(aFlag);
    }

    public abstract void ALLATORIxDEMO(MouseEvent var1);

    public int getImgW() {
        return this.imgW;
    }

    public int getImgH() {
        return this.imgH;
    }

    public void setBtn(int btn) {
        this.btn = btn;
        if (btn == -1) {
            this.index = -1;
            if (this.colors == null) return;
            if (this.getForeground() == this.colors[0]) return;
            this.setForeground(this.colors[0]);
            return;
        }
        this.index = 0;
        this.ALLATORIxDEMO();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void setText(String text) {
        this.isText = text != null && !text.equals("");
        super.setText(text);
    }

    public Image getImage() {
        return this.image;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (this.btn == -1) {
            return;
        }
        this.isInside = Boolean.TRUE;
        this.ALLATORIxDEMO();
    }

    public void iIiIiiiiIIiii(MouseEvent e) {
        if (this.btn != 2) {
            return;
        }
        this.iIiIiiiiIIiii();
        this.ALLATORIxDEMO(e, !this.isKeep);
    }

    public boolean setBtn(int btn, String path) {
        if (this.btn == btn) {
            return false;
        }
        this.setImage(path);
        this.setBtn(btn);
        return true;
    }
}
