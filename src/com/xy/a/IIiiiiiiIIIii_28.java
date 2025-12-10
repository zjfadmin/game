/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Lingbao
 *  com.xy.formula.BaseValue
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.FBUtil
 *  com.xy.formula.PropertyUtil
 *  com.xy.game.RoleData
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Skill
 *  com.xy.richtext.ChatBoxOld
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a;

import com.xy.entity.Lingbao;
import com.xy.formula.BaseValue;
import com.xy.formula.ExpUtil;
import com.xy.formula.FBUtil;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Skill;
import com.xy.richtext.ChatBoxOld;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JLabel;

public class IIiiiiiiIIIii
extends IiiiIiiiiIiIi {
    private JLabel iiiiIiiiIIiii;
    private JLabel iIIiIiiiiiiIi;
    private JLabel IIIIiiiiiiiII;
    private JLabel iiIIIiiiiiiiI;
    private JLabel IiIiiiiiIIIII;
    private JLabel[] iiIiIiiiiIIIi;
    private Image iiiiIiiiIiiII;
    private IIIiiiiiIiIiI[] iiiIiiiiiiiIi;
    private JLabel iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private ChatBoxOld iIiIiiiiIiIii = new ChatBoxOld();
    private JLabel IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private JLabel IiiiiiiiIIIII;
    private ChatBoxOld ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    protected void paintComponent(Graphics g) {
        void IiiiiiiiIIIII;
        super.paintComponent(g);
        if (this.iiiiIiiiIiiII != null) {
            g.drawImage(this.iiiiIiiiIiiII, 10, 30, 96, 96, (ImageObserver)((Object)this));
        }
        Graphics graphics = g.create(110, 30, 360, 125);
        this.iIiIiiiiIiIii.paint((Graphics)IiiiiiiiIIIII);
        IiiiiiiiIIIII.dispose();
        Graphics IiiiiiiiIIIII2 = g.create(180, 140, 285, 105);
        this.ALLATORIxDEMO.paint(IiiiiiiiIIIII2);
        IiiiiiiiIIIII2.dispose();
    }

    public void ALLATORIxDEMO(int i, String skill) {
        if (skill.equals("\u5df2\u5f00\u542f")) {
            this.iiIiiiiiiiIii[i].iIiIiiiiIIiii("sc/d/46.png");
        } else if (skill.equals("\u672a\u5f00\u542f") || skill.equals("\u65e0\u6cd5\u5f00\u542f")) {
            this.iiIiiiiiiiIii[i].iIiIiiiiIIiii("sc/d/47.png");
        } else {
            this.iiIiiiiiiiIii[i].ALLATORIxDEMO(IIiIiiiiIiiIi.ALLATORIxDEMO((String)skill));
        }
        this.iiIiIiiiiIIIi[i].setText(skill);
    }

    public IIiiiiiiIIIii(GameView gameView) {
        super(45, 4, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.iiiIiiiiiiiIi = new IIIiiiiiIiIiI[5];
        this.ALLATORIxDEMO = new ChatBoxOld();
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[5];
        this.iiIiIiiiiIIIi = new JLabel[5];
        this.ALLATORIxDEMO(-1, 0, 470, 310, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/c/80", (int)20, (int)20, (int)20, (int)20, (boolean)false), null);
        this.IiIIIiiiiIiiI = new JLabel();
        this.IiIIIiiiiIiiI.setBounds(15, 5, 90, 25);
        this.IiIIIiiiiIiiI.setForeground(new Color(205, 79, 57));
        this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.IiIIIiiiiIiiI.setHorizontalAlignment(0);
        this.IiIIIiiiiIiiI.setVerticalAlignment(0);
        this.add(this.IiIIIiiiiIiiI);
        this.iIIiIiiiiiiIi = new JLabel();
        this.iIIiIiiiiiiIi.setBounds(110, 5, 75, 25);
        this.iIIiIiiiiiiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iIIiIiiiiiiIi.setForeground(Color.WHITE);
        this.add(this.iIIiIiiiiiiIi);
        this.iiiiIiiiIIiii = new JLabel();
        this.iiiiIiiiIIiii.setBounds(185, 5, 80, 25);
        this.iiiiIiiiIIiii.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiiiIiiiIIiii.setForeground(new Color(205, 79, 57));
        this.add(this.iiiiIiiiIIiii);
        this.IiiiiiiiIIIII = new JLabel();
        this.IiiiiiiiIIIII.setBounds(110, 30, 300, 25);
        this.IiiiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.IiiiiiiiIIIII.setForeground(Color.WHITE);
        this.add(this.IiiiiiiiIIIII);
        this.iIiiIiiiiiiII = new JLabel();
        this.iIiiIiiiiiiII.setBounds(110, 140, 30, 25);
        this.iIiiIiiiiiiII.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iIiiIiiiiiiII.setForeground(new Color(210, 180, 140));
        this.iIiiIiiiiiiII.setText("\u7b26\u77f3");
        this.add(this.iIiiIiiiiiiII);
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(145, 145 + IiiiiiiiIIIII * 18, 18, 18);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.IIiiIiiiIIiIi = new JLabel();
        this.IIiiIiiiIIiIi.setBounds(110, 240, 300, 25);
        this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.IIiiIiiiIIiIi.setForeground(new Color(164, 211, 238));
        this.IIiiIiiiIIiIi.setText("\u5929\u8d4b\u6280\u80fd: \u4f4e\u7ea7\u6839\u9aa8\u7070\u8272  \u4f4e\u7ea7\u6839\u9aa8\u7070\u8272");
        this.add(this.IIiiIiiiIIiIi);
        this.IIIIiiiiiiiII = new JLabel();
        this.IIIIiiiiiiiII.setBounds(110, 260, 300, 25);
        this.IIIIiiiiiiiII.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.IIIIiiiiiiiII.setForeground(new Color(162, 181, 205));
        this.IIIIiiiiiiiII.setText("\u64c5\u957f\u6280\u80fd: \u4f4e\u7ea7\u6839\u9aa8  \u4f4e\u7ea7\u6839\u9aa8  \u4f4e\u7ea7\u6839\u9aa8");
        this.add(this.IIIIiiiiiiiII);
        this.iiIIIiiiiiiiI = new JLabel();
        this.iiIIIiiiiiiiI.setBounds(175, 280, 300, 25);
        this.iiIIIiiiiiiiI.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.iiIIIiiiiiiiI.setForeground(new Color(162, 181, 205));
        this.iiIIIiiiiiiiI.setText("\u4f4e\u7ea7\u6839\u9aa8  \u4f4e\u7ea7\u6839\u9aa8  \u4f4e\u7ea7\u6839\u9aa8");
        this.add(this.iiIIIiiiiiiiI);
        this.IiIiiiiiIIIII = new JLabel();
        this.IiIiiiiiIIIII.setBounds(15, 160, 90, 25);
        this.IiIiiiiiIIIII.setForeground(new Color(238, 232, 205));
        this.IiIiiiiiIIIII.setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
        this.IiIiiiiiIIIII.setHorizontalAlignment(0);
        this.IiIiiiiiIIIII.setVerticalAlignment(0);
        this.IiIiiiiiIIIII.setText("\u6280\u80fd");
        this.add(this.IiIiiiiiIIIII);
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(15, 185 + IiiiiiiiIIIII * 20, 20, 20);
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII]);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = new JLabel();
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(40, 176 + IiiiiiiiIIIII * 21, 60, 30);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setFont(iiIIiiiiIiiII.iiIiiiiiiiiiI);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setForeground(new Color(162, 181, 205));
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setText("\u75be\u98ce\u9aa4\u96e8");
            this.add(this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
    }

    public void ALLATORIxDEMO(Lingbao lingbao) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("\u5929\u8d4b\u6280\u80fd:");
        IiiiiiiiIIIII.append(lingbao.getBaoname());
        this.IIiiIiiiIIiIi.setText(IiiiiiiiIIIII.toString());
        this.IIIIiiiiiiiII.setText("\u64c5\u957f\u6280\u80fd:\u65e0");
        this.iiIIIiiiiiiiI.setText("");
        this.ALLATORIxDEMO.removemsg();
        this.iIiIiiiiIiIii.removemsg();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < 5) {
            int n = IiiiiiiiIIIII2;
            this.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u65e0\u6cd5\u5f00\u542f");
            ++IiiiiiiiIIIII2;
            this.ALLATORIxDEMO(n, "#cD2B48C\u65e0\u6cd5\u5f00\u542f", IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/44.png"));
        }
        this.iIiIiiiiIiIii.addText("#Y" + lingbao.getKangxing().split("=")[0] + " " + lingbao.getKangxing().split("=")[1], 350);
        this.iIiIiiiiIiIii.addText("#Y\u9053\u884c:#R" + ExpUtil.ALLATORIxDEMO((long)(lingbao.getLingbaoexe().longValue() + ExpUtil.ALLATORIxDEMO((int)(lingbao.getLingbaolvl().intValue() - 1)))) + "/" + ExpUtil.ALLATORIxDEMO((long)ExpUtil.ALLATORIxDEMO((int)lingbao.getLingbaolvl().intValue())), 350, iiIIiiiiIiiII.iIiIIiiiiIIiI);
        Skill IiiiiiiiIIIII22 = this.ALLATORIxDEMO().ALLATORIxDEMO(lingbao.getBaoname());
        if (IiiiiiiiIIIII22 == null) return;
        int IiiiiiiiIIIII3 = Integer.parseInt(IiiiiiiiIIIII22.getSkillid());
        int IiiiiiiiIIIII4 = this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getTurnAround();
        int IiiiiiiiIIIII5 = IiiiIiiiiIIII.ALLATORIxDEMO((int)this.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getGrade());
        int IiiiiiiiIIIII6 = this.ALLATORIxDEMO().getFaPJ();
        int IiiiiiiiIIIII7 = BaseValue.getQv((String)lingbao.getBaoquality());
        int IiiiiiiiIIIII8 = lingbao.getLingbaolvl().intValue();
        int IiiiiiiiIIIII9 = BaseValue.getFBlvl((int)IiiiiiiiIIIII4, (int)IiiiiiiiIIIII5, (int)IiiiiiiiIIIII6, (int)IiiiiiiiIIIII7, (int)IiiiiiiiIIIII8);
        double IiiiiiiiIIIII10 = 0.0;
        double IiiiiiiiIIIII11 = 0.0;
        if (IiiiiiiiIIIII22.getGrow() != null && !IiiiiiiiIIIII22.getGrow().equals("")) {
            IiiiiiiiIIIII10 = Double.parseDouble(IiiiiiiiIIIII22.getGrow());
        }
        if (IiiiiiiiIIIII22.getValue() != null && !IiiiiiiiIIIII22.getGrow().equals("")) {
            IiiiiiiiIIIII11 = Double.parseDouble(IiiiiiiiIIIII22.getValue());
        }
        String IiiiiiiiIIIII12 = IIiiIiiiiIIiI.ALLATORIxDEMO((double)(IiiiiiiiIIIII11 + (double)IiiiiiiiIIIII9 * IiiiiiiiIIIII10), (int)1);
        String IiiiiiiiIIIII13 = String.valueOf(FBUtil.getFBcx((int)IiiiiiiiIIIII3, (int)IiiiiiiiIIIII8));
        String IiiiiiiiIIIII14 = null;
        String IiiiiiiiIIIII15 = String.valueOf(FBUtil.getFBsum((int)IiiiiiiiIIIII3, (int)IiiiiiiiIIIII8));
        if (IiiiiiiiIIIII3 == 4014) {
            IiiiiiiiIIIII14 = String.valueOf((int)((IiiiiiiiIIIII11 + (double)IiiiiiiiIIIII9 * IiiiiiiiIIIII10) * 12500.0));
        } else if (IiiiiiiiIIIII3 == 4015) {
            IiiiiiiiIIIII14 = IIiiIiiiiIIiI.ALLATORIxDEMO((double)((IiiiiiiiIIIII11 + (double)IiiiiiiiIIIII9 * IiiiiiiiIIIII10) * 2.0 / 3.0), (int)1);
        }
        String IiiiiiiiIIIII16 = IiiiiiiiIIIII22.getRemark();
        IiiiiiiiIIIII16 = IiiiiiiiIIIII16.replace("{\u6982\u7387}", IiiiiiiiIIIII12);
        IiiiiiiiIIIII16 = IiiiiiiiIIIII16.replace("{\u56de\u5408}", IiiiiiiiIIIII13);
        if (IiiiiiiiIIIII14 != null) {
            IiiiiiiiIIIII16 = IiiiiiiiIIIII16.replace("{\u6570\u503c}", IiiiiiiiIIIII14);
        }
        IiiiiiiiIIIII16 = IiiiiiiiIIIII16.replace("{\u76ee\u6807}", IiiiiiiiIIIII15);
        this.iIiIiiiiIiIii.addText(IiiiiiiiIIIII16, 350);
    }

    public void iiiIiiiiiiIIi(boolean center) {
        int IiiiiiiiIIIII = this.getWidth();
        int IiiiiiiiIIIII2 = this.getHeight();
        Point IiiiiiiiIIIII3 = center ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII2) : this.ALLATORIxDEMO().iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3.x, IiiiiiiiIIIII3.y, IiiiiiiiIIIII, IiiiiiiiIIIII2);
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Lingbao lingbao, boolean center) {
        this.IiIIIiiiiIiiI.setText("\u54c1\u8d28  " + lingbao.getBaoquality());
        this.iIIiIiiiiiiIi.setText(lingbao.getBaoname());
        this.iiiiIiiiIIiii.setText(lingbao.getLingbaolvl() + " \u7ea7");
        this.IiiiiiiiIIIII.setText(" ");
        this.iiiiIiiiIiiII = IIiIiiiiIiiIi.IIIIIiiiiIIii((String)lingbao.getSkin());
        if (lingbao.getBaotype().equals("\u6cd5\u5b9d")) {
            this.ALLATORIxDEMO(lingbao);
            this.iiiIiiiiiiIIi(center);
            return;
        }
        if (lingbao.getTianfuskill() == null) {
            lingbao.setTianfuskill("");
        }
        IiiiiiiiIIIII = lingbao.getTianfuskill().split("\\|");
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("\u5929\u8d4b\u6280\u80fd:");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            v0 = IiiiiiiiIIIII[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII.append(" " + v0);
        }
        this.IIiiIiiiIIiIi.setText(IiiiiiiiIIIII.toString());
        IiiiiiiiIIIII = null;
        if (lingbao.getGoodskill() != null && !lingbao.getGoodskill().equals("")) {
            IiiiiiiiIIIII = lingbao.getGoodskill().split("\\|");
        }
        IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("\u64c5\u957f\u6280\u80fd:");
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length && IiiiiiiiIIIII < 3) {
                v1 = IiiiiiiiIIIII[IiiiiiiiIIIII];
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.append(" " + v1);
            }
        }
        this.IIIIiiiiiiiII.setText(IiiiiiiiIIIII.toString());
        IiiiiiiiIIIII = new StringBuffer();
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.length >= 3) {
            IiiiiiiiIIIII = 3;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                v2 = IiiiiiiiIIIII[IiiiiiiiIIIII];
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.append(" " + v2);
            }
        }
        this.iiIIIiiiiiiiI.setText(IiiiiiiiIIIII.toString());
        this.iIiIiiiiIiIii.removemsg();
        this.iIiIiiiiIiIii.addText(PropertyUtil.getBaoString((Lingbao)lingbao, (RoleData)this.ALLATORIxDEMO(), (int)240), 350);
        this.iIiIiiiiIiIii.addText("#Y" + lingbao.getKangxing().split("=")[0] + " " + lingbao.getKangxing().split("=")[1], 350);
        this.iIiIiiiiIiIii.addText("#Y\u9053\u884c:#R" + ExpUtil.ALLATORIxDEMO((long)(lingbao.getLingbaoexe().longValue() + ExpUtil.ALLATORIxDEMO((int)(lingbao.getLingbaolvl().intValue() - 1)))) + "/" + ExpUtil.ALLATORIxDEMO((long)ExpUtil.ALLATORIxDEMO((int)lingbao.getLingbaolvl().intValue())), 350, iiIIiiiiIiiII.iIiIIiiiiIIiI);
        IiiiiiiiIIIII = null;
        if (lingbao.getSkills() != null && !lingbao.getSkills().equals("")) {
            IiiiiiiiIIIII = lingbao.getSkills().split("\\|");
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            if (IiiiiiiiIIIII < lingbao.getSkillsum()) {
                if (IiiiiiiiIIIII != null && IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[IiiiiiiiIIIII].split("=")[0]);
                } else {
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, "\u5df2\u5f00\u542f");
                }
            } else {
                this.ALLATORIxDEMO(IiiiiiiiIIIII, "\u672a\u5f00\u542f");
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = null;
        if (lingbao.getFushis() != null && !lingbao.getFushis().equals("")) {
            IiiiiiiiIIIII = lingbao.getFushis().split("\\|");
        }
        this.ALLATORIxDEMO.removemsg();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 5) {
            block22: {
                block20: {
                    block21: {
                        if (IiiiiiiiIIIII >= lingbao.getFusum()) break block20;
                        if (IiiiiiiiIIIII == null || IiiiiiiiIIIII >= IiiiiiiiIIIII.length) break block21;
                        IiiiiiiiIIIII = this.ALLATORIxDEMO().getGoodEquip(new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII]));
                        if (IiiiiiiiIIIII == null) break block22;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
                        IiiiiiiiIIIII = new StringBuffer();
                        IiiiiiiiIIIII.append("#cD2B48C");
                        IiiiiiiiIIIII = 0;
                        if (true) ** GOTO lbl99
                    }
                    this.ALLATORIxDEMO(IiiiiiiiIIIII, "#cD2B48C\u5df2\u5f00\u542f", IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/43.png"));
                    break block22;
                }
                this.ALLATORIxDEMO(IiiiiiiiIIIII, "#cD2B48C\u672a\u5f00\u542f", IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/44.png"));
                break block22;
                do {
                    if (IiiiiiiiIIIII == 0) {
                        IiiiiiiiIIIII.append("[" + IiiiiiiiIIIII[IiiiiiiiIIIII].split("=")[1] + "]");
                    } else if (IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("\u70bc\u5668\u5c5e\u6027") == -1) {
                        IiiiiiiiIIIII.append(String.valueOf(IiiiiiiiIIIII[IiiiiiiiIIIII].split("=")[0]) + IiiiiiiiIIIII[IiiiiiiiIIIII].split("=")[1]);
                    }
                    ++IiiiiiiiIIIII;
lbl99:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII.toString(), IIiIiiiiIiiIi.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getSkin()));
            }
            ++IiiiiiiiIIIII;
        }
        this.iiiIiiiiiiIIi(center);
    }

    public void ALLATORIxDEMO(int i, String text, Image image) {
        this.ALLATORIxDEMO.addText(text, 285);
        this.iiiIiiiiiiiIi[i].ALLATORIxDEMO(image);
    }
}
