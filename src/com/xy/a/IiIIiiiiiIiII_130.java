/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIIiiiiiiiIi
 *  com.xy.battle.TypeState
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.formula.SkillUtil
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.a;

import com.xy.a.iiIIiiiiiiiIi;
import com.xy.battle.TypeState;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.formula.SkillUtil;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class IiIIiiiiiIiII
extends IiiiIiiiiIiIi {
    private RichLabel IiIIIiiiiIiiI;
    private Color iiIiiiiiiiIii = iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cCBB55B");
    private iiIIiiiiiiiIi[] IiiiiiiiIIIII;
    private IiIiIiiiiIIiI ALLATORIxDEMO;

    public IiIIiiiiiIiII(GameView gameView) {
        super(34, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 420, 310, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/0", (int)6, (int)6, (int)6, (int)6, (boolean)false), null);
        this.IiiiiiiiIIIII = new iiIIiiiiiiiIi[6];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new iiIIiiiiiiiIi(this);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setVisible(false);
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.IiIIIiiiiIiiI = new RichLabel("", iiIIiiiiIiiII.iiIiIiiiIiiII);
        this.add((Component)this.IiIIIiiiiIiiI);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D IiiiiiiiIIIII;
        super.paintComponent(g);
        Graphics2D graphics2D = IiiiiiiiIIIII = (Graphics2D)g;
        Graphics2D graphics2D2 = IiiiiiiiIIIII;
        Object IiiiiiiiIIIII2 = graphics2D2.getRenderingHint(RenderingHints.KEY_RENDERING);
        Object IiiiiiiiIIIII3 = graphics2D.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
        Object IiiiiiiiIIIII4 = graphics2D2.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
        Object IiiiiiiiIIIII5 = graphics2D.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
        Object IiiiiiiiIIIII6 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        if (IiiiiiiiIIIII2 != RenderingHints.VALUE_RENDER_QUALITY) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        } else {
            IiiiiiiiIIIII2 = null;
        }
        if (IiiiiiiiIIIII3 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
        } else {
            IiiiiiiiIIIII3 = null;
        }
        if (IiiiiiiiIIIII4 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        } else {
            IiiiiiiiIIIII4 = null;
        }
        if (IiiiiiiiIIIII5 != RenderingHints.VALUE_STROKE_DEFAULT) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        } else {
            IiiiiiiiIIIII5 = null;
        }
        if (IiiiiiiiIIIII6 != RenderingHints.VALUE_ANTIALIAS_ON) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            IiiiiiiiIIIII6 = null;
        }
        g.setColor(this.iiIiiiiiiiIii);
        g.setFont(iiIIiiiiIiiII.IiIiIiiiiiiiI);
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < this.IiiiiiiiIIIII.length) {
            if (this.IiiiiiiiIIIII[IiiiiiiiIIIII7].isVisible() && this.IiiiiiiiIIIII[IiiiiiiiIIIII7].IiiiiiiiIIIII != null) {
                int IiiiiiiiIIIII8 = 0;
                while (IiiiiiiiIIIII8 < this.IiiiiiiiIIIII[IiiiiiiiIIIII7].IiiiiiiiIIIII.length) {
                    g.drawString(this.IiiiiiiiIIIII[IiiiiiiiIIIII7].IiiiiiiiIIIII[IiiiiiiiIIIII8], this.IiiiiiiiIIIII[IiiiiiiiIIIII7].getX(), this.IiiiiiiiIIIII[IiiiiiiiIIIII7].getY() + 17 + 25 * IiiiiiiiIIIII8++);
                }
            }
            ++IiiiiiiiIIIII7;
        }
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, IiiiiiiiIIIII2);
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, IiiiiiiiIIIII4);
        }
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII6 == null) return;
        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII6);
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(IiIiIiiiiIIiI handleUnit) {
        block17: {
            IiiiiiiiIIIII = this.ALLATORIxDEMO();
            this.ALLATORIxDEMO = handleUnit;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII++].ALLATORIxDEMO();
            }
            IiiiiiiiIIIII = handleUnit.ALLATORIxDEMO().ALLATORIxDEMO("\u6280\u80fd");
            if (handleUnit.ALLATORIxDEMO().getType() != 0) break block17;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl38
        }
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl55
        do {
            block16: {
                if ((IiiiiiiiIIIII = (TypeState)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getState() == 0 || IiiiiiiiIIIII.getState() == 2) {
                    IiiiiiiiIIIII = SkillUtil.getSkillSM((String)IiiiiiiiIIIII.getType(), (IiiiiiiiiIIII)IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII == null) {
                        this.IiiiiiiiIIIII[5].ALLATORIxDEMO(IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII.equals("\u5957\u88c5")) {
                        this.IiiiiiiiIIIII[4].ALLATORIxDEMO(IiiiiiiiIIIII);
                    } else if (IiiiiiiiIIIII.equals("\u6cd5\u95e8")) {
                        this.IiiiiiiiIIIII[3].ALLATORIxDEMO(IiiiiiiiIIIII);
                    } else {
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < 3) {
                            if (this.IiiiiiiiIIIII[IiiiiiiiIIIII].IiiiiiiiIIIII == null || this.IiiiiiiiIIIII[IiiiiiiiIIIII].IiiiiiiiIIIII[0].equals(IiiiiiiiIIIII)) {
                                if (this.IiiiiiiiIIIII[IiiiiiiiIIIII].IiiiiiiiIIIII == null) {
                                    this.IiiiiiiiIIIII[IiiiiiiiIIIII].IiiiiiiiIIIII = new String[]{IiiiiiiiIIIII};
                                }
                                this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IiiiiiiiIIIII);
                                break block16;
                            }
                            ++IiiiiiiiIIIII;
                        }
                        this.IiiiiiiiIIIII[5].ALLATORIxDEMO(IiiiiiiiIIIII);
                    }
                }
            }
            ++IiiiiiiiIIIII;
lbl38:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        this.IiiiiiiiIIIII[3].IiiiiiiiIIIII = new String[]{"\u6cd5", "\u95e8"};
        this.IiiiiiiiIIIII[4].IiiiiiiiIIIII = new String[]{"\u5957", "\u88c5"};
        this.IiiiiiiiIIIII[5].IiiiiiiiIIIII = new String[]{"\u5176", "\u4ed6"};
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(5 + IiiiiiiiIIIII % 3 * 140, 10 + IiiiiiiiIIIII / 3 * 170, 135, 160);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++].setVisible(true);
        }
        this.iIiIiiiiIIiii(-1, 0, 420, 340);
        this.IiIIIiiiiIiiI.setTextSize("\u5f53\u524dMP:" + handleUnit.ALLATORIxDEMO().getMp_Current(), 400);
        this.IiIIIiiiiIiiI.setBounds(12, 310, this.IiIIIiiiiIiiI.getWidth(), this.IiIIIiiiiIiiI.getHeight());
        return;
        do {
            if ((IiiiiiiiIIIII = (TypeState)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getState() == 0 || IiiiiiiiIIIII.getState() == 2) {
                this.IiiiiiiiIIIII[0].ALLATORIxDEMO(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
lbl55:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        this.IiiiiiiiIIIII[0].IiiiiiiiIIIII = new String[]{"\u53ec", "\u5524", "\u517d"};
        this.IiiiiiiiIIIII[1].IiiiiiiiIIIII = new String[]{"\u5176", "\u4ed6"};
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 2) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(5 + IiiiiiiiIIIII * 140, 10, 135, 270);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++].setVisible(true);
        }
        this.iIiIiiiiIIiii(-1, 0, 290, 290);
        this.IiIIIiiiiIiiI.setTextSize("\u5f53\u524dMP:" + handleUnit.ALLATORIxDEMO().getMp_Current(), 400);
        this.IiIIIiiiiIiiI.setBounds(12, 260, this.IiIIIiiiiIiiI.getWidth(), this.IiIIIiiiiIiiI.getHeight());
    }

    static /* synthetic */ IiIiIiiiiIIiI ALLATORIxDEMO(IiIIiiiiiIiII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void iIiIiiiiIIiii() {
        IiIiIiiiiIIiI IiiiiiiiIIIII = this.iiIIiiiiIiIIi.getBattleControl().getHandleUnit();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
        super.iIiIiiiiIIiii();
    }
}
