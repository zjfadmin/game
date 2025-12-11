/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.v.BWDHJpanel2
 *  com.xy.i.iiIiIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.scene.BWDHRuleBattle
 *  com.xy.scene.BWDHRuleBattleRecord
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a.v;

import com.xy.a.v.BWDHJpanel2;
import com.xy.i.iiIiIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.scene.BWDHRuleBattle;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

/*
 * Exception performing whole class analysis ignored.
 */
static class BWDHButton1
extends IIIiiiiiIiIiI {
    private iiIiIiiiIIIiI iIiIiiiiIiIii;
    private IIIiiiiiIiIiI IiIIIiiiiIiiI;
    private iiIiIiiiIIIiI iiIiiiiiiiIii;
    final /* synthetic */ BWDHJpanel2 IiiiiiiiIIIII;
    private JLabel[] ALLATORIxDEMO;

    public BWDHButton1(BWDHJpanel2 iiIiIiiiiIiIi2) {
        this.IiiiiiiiIIIII = iiIiIiiiiIiIi2;
        super(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/142.png", (int)20, (int)10, (int)20, (int)10, (boolean)false));
        this.IiIIIiiiiIiiI = new IIIiiiiiIiIiI();
        this.add((Component)this.IiIIIiiiiIiiI);
        this.ALLATORIxDEMO = new JLabel[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.ALLATORIxDEMO.length) {
            this.ALLATORIxDEMO[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)12, (int)10, (int)130, (int)20, (Color)Color.black, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            if (IiiiiiiiIIIII == 1) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(4);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(147, 10, 100, 20);
            } else if (IiiiiiiiIIIII == 2) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setText("VS");
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(257, 10, 18, 20);
            } else if (IiiiiiiiIIIII == 3) {
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setHorizontalAlignment(10);
                this.ALLATORIxDEMO[IiiiiiiiIIIII].setBounds(285, 10, 100, 20);
            }
            this.add(this.ALLATORIxDEMO[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new iiIiIiiiIIIiI("sc/e/167.png", 1, 161, iiIIiiiiIiiII.iIIiiiiiiIIII, null, "查看", iiIiIiiiiIiIi2.ALLATORIxDEMO());
        this.iIiIiiiiIiIii.setBounds(417, 12, 61, 18);
        this.iiIiiiiiiiIii = new iiIiIiiiIIIiI("sc/e/167.png", 1, 162, iiIIiiiiIiiII.iIIiiiiiiIIII, null, "未开始", iiIiIiiiiIiIi2.ALLATORIxDEMO());
        this.iiIiiiiiiiIii.setBounds(505, 12, 61, 18);
        this.add((Component)this.iIiIiiiiIiIii);
        this.add((Component)this.iiIiiiiiiiIii);
    }

    public void ALLATORIxDEMO(BWDHRuleBattleRecord battleRecord) {
        BWDHRuleBattle IiiiiiiiIIIII = battleRecord.getBwdhRuleBattle();
        if (IiiiiiiiIIIII.getType() == 0) {
            this.ALLATORIxDEMO[0].setText("16强抢位赛第" + battleRecord.getIndex() + "轮");
        } else if (IiiiiiiiIIIII.getType() == 1) {
            this.ALLATORIxDEMO[0].setText("8强抢位赛第" + battleRecord.getIndex() + "轮");
        } else if (IiiiiiiiIIIII.getType() == 2) {
            this.ALLATORIxDEMO[0].setText("4强抢位赛第" + battleRecord.getIndex() + "轮");
        } else if (IiiiiiiiIIIII.getType() == 3) {
            this.ALLATORIxDEMO[0].setText("半决赛第" + battleRecord.getIndex() + "轮");
        } else if (IiiiiiiiIIIII.getType() == 4) {
            this.ALLATORIxDEMO[0].setText("季殿争夺赛第" + battleRecord.getIndex() + "轮");
        } else if (IiiiiiiiIIIII.getType() == 5) {
            this.ALLATORIxDEMO[0].setText("冠亚争夺赛第" + battleRecord.getIndex() + "轮");
        }
        this.ALLATORIxDEMO[1].setText(IiiiiiiiIIIII.getBwdhTeam1().getName());
        this.ALLATORIxDEMO[3].setText(IiiiiiiiIIIII.getBwdhTeam2().getName());
        this.iIiIiiiiIiIii.setName(String.valueOf(battleRecord.getId()));
        this.iiIiiiiiiiIii.setName(String.valueOf(battleRecord.getId()));
        if (battleRecord.getType() == 0) {
            this.iiIiiiiiiiIii.setText("未开始");
        } else if (battleRecord.getType() == 1) {
            this.iiIiiiiiiiIii.setText("直播");
        } else if (battleRecord.getWin() == 1 || battleRecord.getWin() == 2) {
            this.iiIiiiiiiiIii.setText("录像");
        } else if (battleRecord.getWin() == 5) {
            this.iiIiiiiiiiIii.setText("无效");
        } else {
            this.iiIiiiiiiiIii.setText("已结束");
        }
        if (battleRecord.getType() != 2) return;
        if (battleRecord.getWin() == 1) {
            this.IiIIIiiiiIiiI.iIiIiiiiIIiii("sc/d/144.png");
            this.IiIIIiiiiIiiI.setBounds(136, 5, 27, 24);
            return;
        }
        if (battleRecord.getWin() == 2) {
            this.IiIIIiiiiIiiI.iIiIiiiiIIiii("sc/d/144.png");
            this.IiIIIiiiiIiiI.setBounds(367, 5, 27, 24);
            return;
        }
        if (battleRecord.getWin() == 3) {
            this.IiIIIiiiiIiiI.iIiIiiiiIIiii("sc/d/195.png");
            this.IiIIIiiiiIiiI.setBounds(136, 5, 27, 24);
            return;
        }
        if (battleRecord.getWin() != 4) return;
        this.IiIIIiiiiIiiI.iIiIiiiiIIiii("sc/d/195.png");
        this.IiIIIiiiiIiiI.setBounds(367, 5, 27, 24);
    }
}
