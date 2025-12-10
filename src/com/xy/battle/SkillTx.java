/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleControl
 *  com.xy.readbean.Skill
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.battle;

import com.xy.battle.BattleControl;
import com.xy.readbean.Skill;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Graphics;
import java.awt.Image;

public class SkillTx {
    private boolean is;
    private int index;
    private static Image back;
    private Skill skill;
    private int id;
    private Image image;

    public void ALLATORIxDEMO(String skillName, int index, IiiiiiiiiIIII objectArea) {
        this.is = false;
        this.index = index;
        if (this.skill != null) {
            if (this.skill.getSkillname().equals(skillName)) return;
        }
        this.skill = objectArea.ALLATORIxDEMO(skillName);
        this.id = Integer.parseInt(this.skill.getSkillid());
        this.image = null;
    }

    public void ALLATORIxDEMO(Graphics g, BattleControl battleControl) {
        int IiiiiiiiIIIII = battleControl.gameView.screenData.Screen_x - this.index * 40;
        int IiiiiiiiIIIII2 = battleControl.gameView.screenData.Screen_y - 120;
        if (this.image == null) {
            this.image = IIiIiiiiIiiIi.iIiIiiiiIIiIi((int)this.id);
        }
        g.drawImage(back, IiiiiiiiIIIII - 3, IiiiiiiiIIIII2 - 3, 36, 36, null);
        g.drawImage(this.image, IiiiiiiiIIIII, IiiiiiiiIIIII2, 30, 30, null);
    }

    public SkillTx() {
        if (back != null) return;
        back = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/54");
    }

    public int getId() {
        return this.id;
    }

    public void setIs(boolean is) {
        this.is = is;
    }

    public boolean ALLATORIxDEMO() {
        return this.is;
    }

    public Skill getSkill() {
        return this.skill;
    }

    public boolean ALLATORIxDEMO(int Mx, int My, BattleControl battleControl) {
        int IiiiiiiiIIIII = battleControl.gameView.screenData.Screen_x - this.index * 40;
        int IiiiiiiiIIIII2 = battleControl.gameView.screenData.Screen_y - 120;
        if (IiiiiiiiIIIII > Mx) return false;
        if (IiiiiiiiIIIII + 30 < Mx) return false;
        if (IiiiiiiiIIIII2 > My) return false;
        if (IiiiiiiiIIIII2 + 30 < My) return false;
        return true;
    }
}
