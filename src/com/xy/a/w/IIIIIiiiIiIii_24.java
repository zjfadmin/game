/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.w.iiIiIiiiiIiii
 *  com.xy.formula.SkillUtil
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.readbean.TYCModel
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.w;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.w.iiIiIiiiiIiii;
import com.xy.formula.SkillUtil;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.readbean.TYCModel;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class IIIIIiiiIiIii
extends IIIiiiiiIiIiI
implements MouseListener {
    private boolean iiiIiiiiiiiIi;
    private boolean iIiiIiiiiiiII;
    final /* synthetic */ iiIiIiiiiIiii IIiiIiiiIIiIi;
    private TYCModel iIiIiiiiIiIii;
    private boolean IiIIIiiiiIiiI;
    private int iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII = new JLabel();
    private int ALLATORIxDEMO;

    static /* synthetic */ int iIiIiiiiIIiii(IIIIIiiiIiIii arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void iiiiiiiiIIiii() {
        this.IiiiiiiiIIIII.setText(String.valueOf(this.ALLATORIxDEMO) + "/5");
        if (!this.iiiIiiiiiiiIi && this.ALLATORIxDEMO == 0) {
            this.IiiiiiiiIIIII.setVisible(false);
            this.ALLATORIxDEMO();
            return;
        }
        if (this.iiiIiiiiiiiIi) {
            this.IiiiiiiiIIIII.setForeground(this.ALLATORIxDEMO == this.iiIiiiiiiiIii ? Color.yellow : Color.green);
        } else {
            this.IiiiiiiiIIIII.setForeground(this.ALLATORIxDEMO == 5 ? Color.yellow : Color.red);
        }
        this.ALLATORIxDEMO("sc/c/153");
        this.IiiiiiiiIIIII.setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.iIiIiiiiIIiIi();
        if (!this.iiiIiiiiiiiIi && this.ALLATORIxDEMO <= 0) {
            return;
        }
        this.iIiiIiiiiiiII = Boolean.TRUE;
    }

    public void IiiIiiiiiiIiI() {
        this.iIiIiiiiIIiii();
        this.ALLATORIxDEMO();
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiIii arg0, boolean arg1) {
        arg0.iiiIiiiiiiiIi = arg1;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.ALLATORIxDEMO(Boolean.FALSE);
        this.iIiiIiiiiiiII = Boolean.FALSE;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (e.getButton() == 1) {
            if (this.ALLATORIxDEMO >= 5) return;
            this.IIiiIiiiIIiIi.ALLATORIxDEMO(this, true);
            return;
        }
        if (e.getButton() != 3) return;
        if (this.ALLATORIxDEMO <= 0) return;
        this.IIiiIiiiIIiIi.ALLATORIxDEMO(this, false);
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiIii arg0, int arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    static /* synthetic */ int ALLATORIxDEMO(IIIIIiiiIiIii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(boolean isMouse) {
        if (this.IiIIIiiiiIiiI == isMouse) {
            return;
        }
        this.IiIIIiiiiIiiI = isMouse;
        this.setBounds(this.getX() + (isMouse ? 1 : -1), this.getY() + (isMouse ? 1 : -1), this.getWidth(), this.getHeight());
    }

    public void ALLATORIxDEMO(int point) {
        this.ALLATORIxDEMO = point;
    }

    public IIIIIiiiIiIii(iiIiIiiiiIiii iiIiIiiiiIiii2) {
        this.IIiiIiiiIIiIi = iiIiIiiiiIiii2;
        this.IiiiiiiiIIIII.setOpaque(true);
        this.IiiiiiiiIIIII.setBackground(Color.BLACK);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.IiiiiiiiIIIII.setHorizontalAlignment(0);
        this.IiiiiiiiIIIII.setBounds(1, 24, 24, 13);
        this.add(this.IiiiiiiiIIIII);
        this.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!this.iiiIiiiiiiiIi && this.ALLATORIxDEMO <= 0) {
            return;
        }
        this.ALLATORIxDEMO(Boolean.TRUE);
        if (!this.iIiiIiiiiiiII) return;
        this.ALLATORIxDEMO(e);
    }

    static /* synthetic */ TYCModel ALLATORIxDEMO(IIIIIiiiIiIii arg0) {
        return arg0.iIiIiiiiIiIii;
    }

    public void iIiIiiiiIIiIi() {
        Skill IiiiiiiiIIIII = this.iIiIiiiiIiIii.getSkill(this.IIiiIiiiIIiIi.ALLATORIxDEMO());
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII2.append("#W\u3010\u7b49\u7ea7\u3011");
            IiiiiiiiIIIII2.append(this.ALLATORIxDEMO);
            IiiiiiiiIIIII2.append("/5#r\u3010\u5883\u754c\u3011");
            IiiiiiiiIIIII2.append(this.iIiIiiiiIiIii.getLvl());
            IiiiiiiiIIIII2.append("#r\u3010\u795e\u5143\u3011");
            if (this.iIiIiiiiIiIii.getType() == 0) {
                IiiiiiiiIIIII2.append("\u901a\u7528");
            } else if (this.iIiIiiiiIiIii.getType() == 1) {
                IiiiiiiiIIIII2.append("\u4e13\u6709");
            } else if (this.iIiIiiiiIiIii.getType() == 2) {
                IiiiiiiiIIIII2.append("\u878d\u5408");
            }
            if (this.ALLATORIxDEMO > 0) {
                this.ALLATORIxDEMO(this.ALLATORIxDEMO, IiiiiiiiIIIII, IiiiiiiiIIIII2);
            }
            if (this.ALLATORIxDEMO < 5) {
                IiiiiiiiIIIII2.append("#r#W\u4e0b\u4e00\u7b49\u7ea7");
                this.ALLATORIxDEMO(this.ALLATORIxDEMO + 1, IiiiiiiiIIIII, IiiiiiiiIIIII2);
                if (!this.iiiIiiiiiiiIi) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII2);
                }
            }
        }
        ((iiIiiiiiIIiiI)this.IIiiIiiiIIiIi.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).ALLATORIxDEMO(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getSkillname() : "", IiiiiiiiIIIII2.toString());
    }

    public void ALLATORIxDEMO(TYCModel model) {
        this.iiIiiiiiiiIii = 0;
        this.iIiIiiiiIiIii = model;
        if (model != null) {
            this.iiiIiiiiiiIIi();
        } else {
            this.IiiIiiiiiiIiI();
        }
        this.setVisible(model != null);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (!this.iiiIiiiiiiiIi && this.ALLATORIxDEMO <= 0) {
            return;
        }
        this.ALLATORIxDEMO(Boolean.FALSE);
    }

    public void ALLATORIxDEMO(int point, Skill skill, StringBuffer buffer) {
        buffer.append("#r#G");
        SkillUtil.ALLATORIxDEMO((StringBuffer)buffer, (String)skill.getRemark(), (Skill)skill, (int)point);
    }

    public void iiiIiiiiiiIIi() {
        this.ALLATORIxDEMO = 0;
        this.iiiIiiiiiiiIi = this.iIiIiiiiIiIii.getType() == 0 && this.ALLATORIxDEMO != 5;
        this.ALLATORIxDEMO(IIiIiiiiIiiIi.iIiIiiiiIIiIi((int)this.iIiIiiiiIiIii.getSkillId()));
        this.iiiiiiiiIIiii();
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(StringBuffer buffer) {
        block13: {
            block12: {
                if (this.iIiIiiiiIiIii.getType() != 1) break block12;
                IiiiiiiiIIIII = this.iIiIiiiiIiIii.getLvl() == 1 ? 20 : 5;
                IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO(0, this.iIiIiiiiIiIii.getKey(), this.iIiIiiiiIiIii.getLvl() - 1, null);
                if (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    buffer.append("#r#R\u524d\u7f6e\u533a\u57df(");
                    if (this.iIiIiiiiIiIii.getLvl() != 1) {
                        buffer.append(SkillUtil.getSmKey((int)this.iIiIiiiiIiIii.getKey()));
                        buffer.append("\u7cfb\u5883\u754c");
                    } else {
                        buffer.append("\u901a\u7528\u5883\u754c");
                    }
                    buffer.append(this.iIiIiiiiIiIii.getLvl() - 1);
                    buffer.append(")\u4e0d\u8db3");
                    buffer.append(IiiiiiiiIIIII);
                    buffer.append("\u70b9");
                }
                if (this.iIiIiiiiIiIii.getLvl() == 5) {
                    IiiiiiiiIIIII = this.ALLATORIxDEMO == 0 ? 20 : (this.ALLATORIxDEMO == 0 ? 25 : (this.ALLATORIxDEMO == 0 ? 30 : (this.ALLATORIxDEMO == 0 ? 35 : 39)));
                    IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO(1, this.iIiIiiiiIiIii.getKey(), 0, null);
                    if (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        buffer.append("#r#R\u9700\u8981");
                        buffer.append(SkillUtil.getSmKey((int)this.iIiIiiiiIiIii.getKey()));
                        buffer.append("\u7cfb");
                        buffer.append(IiiiiiiiIIIII);
                        buffer.append("\u70b9\u603b\u70b9\u6570");
                    }
                }
                if (this.iIiIiiiiIiIii.getLvl() == 5 && IiiiiiiiIIIII >= IiiiiiiiIIIII || this.iIiIiiiiIiIii.getLvl() == 6) {
                    IiiiiiiiIIIII = this.iIiIiiiiIiIii.getLvl() == 5 ? (this.IIiiIiiiIIiIi.ALLATORIxDEMO(0, this.iIiIiiiiIiIii.getKey() == this.IIiiIiiiIIiIi.iiiIiiiiiiiIi ? this.IIiiIiiiIIiIi.iIIIIiiiiiIIi : this.IIiiIiiiIIiIi.iiiIiiiiiiiIi, 5, null) > 0 ? 119 : 0) : 80;
                    IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO(2, 0, 0, null);
                    if (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        buffer.append("#r#R\u9700\u8981");
                        buffer.append(IiiiiiiiIIIII);
                        buffer.append("\u70b9\u603b\u70b9\u6570");
                    }
                }
                if (this.iIiIiiiiIiIii.getLvl() != 5) break block13;
                var5_6 = iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)this.IIiiIiiiIIiIi).iterator();
                if (true) ** GOTO lbl90
            }
            if (this.iIiIiiiiIiIii.getType() != 2) return;
            IiiiiiiiIIIII = 5;
            IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO(0, this.IIiiIiiiIIiIi.iiiIiiiiiiiIi, this.iIiIiiiiIiIii.getLvl(), null);
            IiiiiiiiIIIII = this.IIiiIiiiIIiIi.ALLATORIxDEMO(0, this.IIiiIiiiIIiIi.iIIIIiiiiiIIi, this.iIiIiiiiIiIii.getLvl(), null);
            if (IiiiiiiiIIIII < IiiiiiiiIIIII || IiiiiiiiIIIII < IiiiiiiiIIIII) {
                buffer.append("#r#R\u524d\u7f6e\u533a\u57df(");
                buffer.append(SkillUtil.getSmKey((int)(IiiiiiiiIIIII < IiiiiiiiIIIII ? this.IIiiIiiiIIiIi.iiiIiiiiiiiIi : this.IIiiIiiiIIiIi.iIIIIiiiiiIIi)));
                buffer.append("\u7cfb\u5883\u754c");
                buffer.append(this.iIiIiiiiIiIii.getLvl());
                if (IiiiiiiiIIIII < IiiiiiiiIIIII && IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    buffer.append("\u548c");
                    buffer.append(SkillUtil.getSmKey((int)this.IIiiIiiiIIiIi.iIIIIiiiiiIIi));
                    buffer.append("\u7cfb\u5883\u754c");
                    buffer.append(this.iIiIiiiiIiIii.getLvl());
                    buffer.append(")\u4e0d\u8db3");
                    buffer.append(IiiiiiiiIIIII);
                    buffer.append("\u70b9");
                }
            }
            var6_11 = iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)this.IIiiIiiiIIiIi).iterator();
            if (true) ** GOTO lbl119
            do {
                IiiiiiiiIIIII = (IIIIIiiiIiIii)var5_6.next();
                if (IiiiiiiiIIIII.iIiIiiiiIiIii == null || IiiiiiiiIIIII == this || !this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII.iIiIiiiiIiIii)) continue;
                buffer.append("#r#R\u4e0e#Y");
                buffer.append(IiiiiiiiIIIII.iIiIiiiiIiIii.getSkillName(this.IIiiIiiiIIiIi.ALLATORIxDEMO()));
                buffer.append("#R\u4e92\u65a5");
lbl90:
                // 3 sources

            } while (var5_6.hasNext());
        }
        if (this.iIiIiiiiIiIii.getLvl() != 6) return;
        IiiiiiiiIIIII = 5;
        IiiiiiiiIIIII = null;
        for (IIIIIiiiIiIii IiiiiiiiIIIII : iiIiIiiiiIiii.ALLATORIxDEMO((iiIiIiiiiIiii)this.IIiiIiiiIIiIi)) {
            if (IiiiiiiiIIIII.iIiIiiiiIiIii == null || IiiiiiiiIIIII.iIiIiiiiIiIii.getType() != this.iIiIiiiiIiIii.getType() || IiiiiiiiIIIII.iIiIiiiiIiIii.getKey() != this.iIiIiiiiIiIii.getKey() || IiiiiiiiIIIII.iIiIiiiiIiIii.getLvl() + 1 != this.iIiIiiiiIiIii.getLvl() || IiiiiiiiIIIII.iIiIiiiiIiIii.getIndex() != this.iIiIiiiiIiIii.getIndex()) continue;
            IiiiiiiiIIIII = IiiiiiiiIIIII;
            break;
        }
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.ALLATORIxDEMO >= IiiiiiiiIIIII) return;
        buffer.append("#r#R\u9700\u8981");
        buffer.append(IiiiiiiiIIIII);
        buffer.append("\u70b9#Y");
        buffer.append(IiiiiiiiIIIII.iIiIiiiiIiIii.getSkillName(this.IIiiIiiiIIiIi.ALLATORIxDEMO()));
        return;
        do {
            IiiiiiiiIIIII = (IIIIIiiiIiIii)var6_11.next();
            if (IiiiiiiiIIIII.iIiIiiiiIiIii == null || IiiiiiiiIIIII == this || !this.iIiIiiiiIiIii.ALLATORIxDEMO(IiiiiiiiIIIII.iIiIiiiiIiIii)) continue;
            buffer.append("#r#R\u4e0e#Y");
            buffer.append(IiiiiiiiIIIII.iIiIiiiiIiIii.getSkillName(this.IIiiIiiiIIiIi.ALLATORIxDEMO()));
            buffer.append("#R\u4e92\u65a5");
lbl119:
            // 3 sources

        } while (var6_11.hasNext());
    }

    /*
     * WARNING - void declaration
     */
    protected void paintComponent(Graphics graphics) {
        void g;
        g.setColor(Color.BLACK);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        super.paintComponent((Graphics)g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
