/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.iiiIIiiiIiIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Skill
 *  com.xy.scene.DNTGScene
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.q;

import com.xy.a.q.iiiIIiiiIiIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Skill;
import com.xy.scene.DNTGScene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;

public class iiIiiiiiiIIii
extends IiiiIiiiiIiIi {
    private iiiIIiiiIiIII[] IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI iiIiiiiiiiIii;
    private iiIiIiiiiIiIi IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void IiiIiiiiiiIiI() {
        IiiiiiiiiIIII IiiiiiiiIIIII = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 8) {
            Skill IiiiiiiiIIIII3 = IiiiiiiiIIIII.iIiIiiiiIIiii("" + (10001 + IiiiiiiiIIIII2));
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII2++].ALLATORIxDEMO(IiiiiiiiIIIII3);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iIiIiiiiIIiIi();
    }

    public void iIiIiiiiIIiIi() {
        long IiiiiiiiIIIII = 0L;
        if (this.iiIIiiiiIiIIi.scene != null && this.iiIIiiiiIiIIi.scene.getSceneId() == 1011) {
            IiiiiiiiIIIII = ((DNTGScene)this.iiIIiiiiIiIIi.scene).getDN_JB().longValue();
        }
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public void iIiIiiiiIIiIi(String value) {
        this.iiiIiiiiiiIIi();
        if (value != null && !"".equals(value)) {
            String[] IiiiiiiiIIIII = value.split("&");
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
                String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("\\$");
                int IiiiiiiiIIIII4 = 0;
                while (IiiiiiiiIIIII4 < this.IiIIIiiiiIiiI.length) {
                    if (iiiIIiiiIiIII.ALLATORIxDEMO((iiiIIiiiIiIII)this.IiIIIiiiiIiiI[IiiiiiiiIIIII4]) != null && IiiiiiiiIIIII3[0].equals(iiiIIiiiIiIII.ALLATORIxDEMO((iiiIIiiiIiIII)this.IiIIIiiiiIiiI[IiiiiiiiIIIII4]).getSkillid())) {
                        this.IiIIIiiiiIiiI[IiiiiiiiIIIII4].ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII3[1]));
                    }
                    ++IiiiiiiiIIIII4;
                }
                ++IiiiiiiiIIIII2;
            }
        }
        this.iIiIiiiiIIiIi();
    }

    public void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII++].ALLATORIxDEMO(0);
        }
    }

    public iiIiiiiiiIIii(GameView gameView) {
        super(98, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 546, 395, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u795e\u529b\u52a0\u6301");
        this.IiIIIiiiiIiiI = new iiiIIiiiIiIII[8];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII] = new iiiIIiiiIiIII(this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII].setBounds(50 + 235 * (IiiiiiiiIIIII % 2), 63 + 75 * (IiiiiiiiIIIII / 2), 224, 68);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII++]);
        }
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((int)42, (int)26, (int)72, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.ALLATORIxDEMO.setText("\u6211\u7684\u91d1\u5e01");
        this.add(this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)115, (int)26, (int)106, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(2);
        this.IiiiiiiiIIIII.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false));
        this.IiiiiiiiIIIII.setText("0");
        this.add((Component)this.IiiiiiiiIIIII);
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)20, (int)20, (int)20, (int)20, (boolean)false));
        this.iiIiiiiiiiIii.setBounds(41, 53, 478, 317);
        this.add((Component)this.iiIiiiiiiiIii);
        this.IiiIiiiiiiIiI();
    }

    public void ALLATORIxDEMO(Object data) {
        iiiIIiiiIiIII IiiiiiiiIIIII = (iiiIIiiiIiIII)data;
        if (this.iiIIiiiiIiIIi.scene == null) return;
        if (this.iiIIiiiiIiIIi.scene.getSceneId() != 1011) return;
        int IiiiiiiiIIIII2 = ((DNTGScene)this.iiIIiiiiIiIIi.scene).getDN_JB().intValue();
        if ((iiiIIiiiIiIII.ALLATORIxDEMO((iiiIIiiiIiIII)IiiiiiiiIIIII) + 1) * iiiIIiiiIiIII.iIiIiiiiIIiii((iiiIIiiiIiIII)IiiiiiiiIIIII) > IiiiiiiiIIIII2) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u5e01\u4e0d\u8db3\uff0c\u65e0\u6cd5\u5347\u7ea7");
            return;
        }
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"scene", (String)("1011|L" + iiiIIiiiIiIII.ALLATORIxDEMO((iiiIIiiiIiIII)IiiiiiiiIIIII).getSkillid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }
}
