/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.IiiIiiiiIIIIi
 *  com.xy.a.a.IiiiIiiiiIIII
 *  com.xy.entity.Mount
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.ExpUtil
 *  com.xy.game.RoleData
 *  com.xy.i.IiIiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IIIiIiiiIiIII
 *  com.xy.q.IIIiiiiiiiiIi
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iIIiIiiiIiiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiIiiiiIiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.a.a;

import com.xy.a.a.IiiIiiiiIIIIi;
import com.xy.a.a.IiiiIiiiiIIII;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.game.RoleData;
import com.xy.i.IiIiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IIIiIiiiIiIII;
import com.xy.q.IIIiiiiiiiiIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iIIiIiiiIiiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class IiIIIiiiiIIiI
extends IiiiIiiiiIiIi {
    private IIIiiiiiiiiIi iiIIIiiiiiiiI;
    private IiiIiiiiIIIIi[] IiIiiiiiIIIII;
    private JLabel[] iiIiIiiiiIIIi;
    private com.xy.w.IiiiIiiiiIiIi iiiiIiiiIiiII;
    private IiIiIiiiiIIiI[] iiiIiiiiiiiIi;
    private IIIiIiiiIiIII iIiiIiiiiiiII;
    private Image IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/d/149.png");
    private RichLabel iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private IIIiiiiiIiIiI[] iiIiiiiiiiIii;
    private iIIiIiiiIiiIi[] IiiiiiiiIIIII;
    private JScrollPane ALLATORIxDEMO;

    public void IIIIIiiiiIIii() {
        this.iiiiIiiiIiiII = null;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII++].setText(null);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(Mount mount) {
        block16: {
            block15: {
                IiiiiiiiIIIII = this.ALLATORIxDEMO();
                if (IiiiiiiiIIIII == null) {
                    return;
                }
                IiiiiiiiIIIII.setChoseMountId(mount != null ? mount.getMid() : null);
                this.IIIIIiiiiIIii();
                if (mount == null) {
                    this.ALLATORIxDEMO().iiiIiiiiiiIIi(20);
                    return;
                }
                IiiiiiiiIIIII = mount.getMountlvl();
                if (IiiiiiiiIIIII > 100) {
                    IiiiiiiiIIIII -= 100;
                }
                var4_4 = (int)Math.floor((float)mount.getSpri().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)mount.getSpri().intValue() / 2.0f);
                IiiiiiiiIIIII = (int)Math.floor((float)mount.getPower().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)mount.getPower().intValue() / 2.0f);
                IiiiiiiiIIIII = (int)Math.floor((float)mount.getBone().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)mount.getBone().intValue() / 2.0f);
                IiiiiiiiIIIII = mount.getMountCZ();
                IiiiiiiiIIIII = IiiiiiiiIIIII >> 6;
                if (IiiiiiiiIIIII > 0) {
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < 3) {
                        if ((IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII & 1) != 0) {
                            v0 = IiiiiiiiIIIII = (IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII + 1 & 1) == 1;
                            if (IiiiiiiiIIIII == 0) {
                                IiiiiiiiIIIII += IiiiiiiiIIIII != false ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                            } else if (IiiiiiiiIIIII == 1) {
                                IiiiiiiiIIIII += IiiiiiiiIIIII != false ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                            } else if (IiiiiiiiIIIII == 2) {
                                IiiiiiiiIIIII += IiiiiiiiIIIII != false ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                            }
                        }
                        ++IiiiiiiiIIIII;
                    }
                }
                this.iiiIiiiiiiiIi[0].setText(IiiiiiiiIIIII.getLoginResult().getMount_id() == mount.getMountid() ? "\u4e0b\u9a91" : "\u9a91\u4e58");
                this.IiiiiiiiIIIII[0].setText(mount.getMountlvlString());
                this.IiiiiiiiIIIII[1].setText("" + mount.getLive());
                this.IiiiiiiiIIIII[2].setText(String.valueOf((int)IiiiiiiiIIIII));
                this.IiiiiiiiIIIII[3].setText(String.valueOf(IiiiiiiiIIIII));
                this.IiiiiiiiIIIII[4].setText(String.valueOf(IiiiiiiiIIIII));
                if (IiiiiiiiIIIII < 100) {
                    this.IiiiiiiiIIIII[5].setText(mount.getExp() + "/" + ExpUtil.getMountExp((int)mount.getMountlvl()));
                } else {
                    this.IiiiiiiiIIIII[5].setText(mount.getExp() + "/999999");
                }
                this.iiiiIiiiIiiII = iiiiiiiiiiIiI.ALLATORIxDEMO((long)((long)mount.getMountid().intValue() << 40 | IiiiiiiiIIIII.getLoginResult().getSpecies_id().longValue()), (int)2, (int)1, null);
                if (mount.getMountlvl() <= 100) break block15;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl54
            }
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl62
            do {
                v1 = this.IiIiiiiiIIIII[IiiiiiiiIIIII];
                v2 = 69 + 65 * IiiiiiiiIIIII;
                ++IiiiiiiiIIIII;
                v1.setBounds(636, v2, 59, 57);
lbl54:
                // 2 sources

            } while (IiiiiiiiIIIII < 3);
            this.IiIiiiiiIIIII[2].setVisible(true);
            break block16;
            do {
                v3 = this.IiIiiiiiIIIII[IiiiiiiiIIIII];
                v4 = 91 + 68 * IiiiiiiiIIIII;
                ++IiiiiiiiIIIII;
                v3.setBounds(636, v4, 59, 57);
lbl62:
                // 2 sources

            } while (IiiiiiiiIIIII < 2);
            this.IiIiiiiiIIIII[2].setVisible(false);
        }
        this.iiiiiiiiIIiii();
        IiiiiiiiIIIII = (IiiiIiiiiIIII)this.iiIIiiiiIiIIi.getFormManagement().iIiIiiiiIIiii(20);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(mount);
    }

    public void iiiiiiiiIIiii() {
        Mount IiiiiiiiIIIII = this.ALLATORIxDEMO().getChoseMount();
        this.IiIiiiiiIIIII[0].ALLATORIxDEMO(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getSid() : null);
        this.IiIiiiiiIIIII[1].ALLATORIxDEMO(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getOthrersid() : null);
        this.IiIiiiiiIIIII[2].ALLATORIxDEMO(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getSid3() : null);
    }

    public void iIiIiiiiIIiii(BigDecimal sid) {
        RoleSummoning IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        Mount IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getChoseMount();
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        RoleSummoning roleSummoning = IiiiiiiiIIIII = sid != null ? IiiiiiiiIIIII2.getPet(sid) : null;
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4f60\u8981\u7ba1\u5236\u7684\u53ec\u5524\u517d\uff01");
            return;
        }
        int IiiiiiiiIIIII4 = 0;
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII3.getSid(), (BigDecimal)sid)) {
            IiiiiiiiIIIII4 = 1;
            IiiiiiiiIIIII3.setSid(null);
        } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII3.getOthrersid(), (BigDecimal)sid)) {
            IiiiiiiiIIIII4 = 2;
            IiiiiiiiIIIII3.setOthrersid(null);
        } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII3.getSid3(), (BigDecimal)sid)) {
            IiiiiiiiIIIII4 = 3;
            IiiiiiiiIIIII3.setSid3(null);
        }
        if (IiiiiiiiIIIII4 == 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ec\u5524\u517d\u4e0d\u88ab\u8be5\u5750\u9a91\u7ba1\u5236!");
            return;
        }
        String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"changemountvalue", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII3));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
        this.iIiiIiiiiiiII.ALLATORIxDEMO();
        this.iiiiiiiiIIiii();
    }

    public void IiiIiiiiiiIiI() {
        this.ALLATORIxDEMO((Mount)null);
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        Mount IiiiiiiiIIIII2 = IiiiiiiiIIIII.getChoseMount();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (IiiiiiiiIIIII.getLoginResult().getMount_id().intValue() == IiiiiiiiIIIII2.getMountid().intValue()) {
            IiiiiiiiIIIII.getLoginResult().setMount_id(Integer.valueOf(0));
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"rolechange", (String)"M");
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            this.iiiIiiiiiiiIi[0].setText("\u9a91\u4e58");
            return;
        }
        IiiiiiiiIIIII.getLoginResult().setMount_id(IiiiiiiiIIIII2.getMountid());
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolechange", (String)("M" + IiiiiiiiIIIII2.getMountid() + "=" + IiiiiiiiIIIII2.getMid()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        this.iiiIiiiiiiiIi[0].setText("\u4e0b\u9a91");
    }

    public IiIIIiiiiIIiI(GameView gameView) {
        super(-1, -1, IiiiIiiiiIiIi.iIIiIiiiiiiIi, gameView);
        this.ALLATORIxDEMO(0, 0, 743, 519, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiIIIiiiiiiiI = new IIIiiiiiiiiIi((IiiiIiiiiIiIi)this);
        this.iiIIIiiiiiiiI.setBounds(0, 0, 200, 20);
        this.IiIIIiiiiIiiI = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)71, (int)207, (int)221, (Component)this.iiIIIiiiiiiiI, (int)20);
        this.add(this.IiIIIiiiiIiiI);
        this.iIiiIiiiiiiII = new IIIiIiiiIiIII((IiiiIiiiiIiIi)this);
        this.iIiiIiiiiiiII.setBounds(0, 0, 422, 20);
        this.ALLATORIxDEMO = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)279, (int)301, (int)422, (int)195, (Component)this.iIiiIiiiiiiII, (int)20);
        this.add(this.ALLATORIxDEMO);
        this.IiIiiiiiIIIII = new IiiIiiiiIIIIi[3];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII] = new IiiIiiiiIIIIi(this);
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiiIiiiiiiiIi = new IiIiIiiiiIIiI[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new IiIiIiiiiIIiI("sc/e/7.png", 1, 171 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII == 0 ? "\u4e0b\u9a91" : (IiiiiiiiIIIII == 1 ? "\u6280\u80fd" : (IiiiiiiiIIIII == 2 ? "\u5582\u517b" : "")), (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setForeground(Color.black);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(48 + 76 * IiiiiiiiIIIII, 477, 59, 25);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiIiIiiiiIIIi = new JLabel[10];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII] = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)48, (int)(298 + 30 * IiiiiiiiIIIII), (int)36, (int)19, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u7b49\u7ea7" : (IiiiiiiiIIIII == 1 ? "\u4f53\u529b" : (IiiiiiiiIIIII == 2 ? "\u7075\u6027" : (IiiiiiiiIIIII == 3 ? "\u529b\u91cf" : (IiiiiiiiIIIII == 4 ? "\u6839\u9aa8" : (IiiiiiiiIIIII == 5 ? "\u7ecf\u9a8c" : (IiiiiiiiIIIII == 6 ? "\u7ba1\u5236" : (IiiiiiiiIIIII == 7 ? "\u5750\u9a91\u5217\u8868" : (IiiiiiiiIIIII == 8 ? "\u53ec\u5524\u517d\u5217\u8868" : (IiiiiiiiIIIII == 9 ? "\u7ba1\u5236\u5750\u9a91" : ""))))))))));
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setHorizontalAlignment(10);
            if (IiiiiiiiIIIII == 6) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(534, 152, 36, 19);
            } else if (IiiiiiiiIIIII == 7) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setForeground(Color.white);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setHorizontalAlignment(0);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(48, 50, 210, 21);
            } else if (IiiiiiiiIIIII == 8) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setForeground(Color.white);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(330, 281, 100, 21);
            } else if (IiiiiiiiIIIII == 9) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setForeground(Color.white);
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII].setBounds(540, 281, 100, 21);
            }
            this.add(this.iiIiIiiiiIIIi[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiIiiiiIiIii.setTextSize("#cFF0000\u53f3\u952e#c000000\u70b9\u51fb\u5217\u8868\u5207\u6362\u7ba1\u5236\uff0c#cFF0000\u53f3\u952e#c000000\u70b9\u51fb\u5934\u50cf\u89e3\u9664\u7ba1\u5236", 300);
        this.iIiIiiiiIiIii.setBounds(358, 259, this.iIiIiiiiIiIii.getWidth(), this.iIiIiiiiIiIii.getHeight());
        this.add((Component)this.iIiIiiiiIiIii);
        this.IiiiiiiiIIIII = new iIIiIiiiIiiIi[6];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = com.xy.q.IiIIIiiiiIIiI.ALLATORIxDEMO((int)90, (int)(298 + 30 * IiiiiiiiIIIII), (int)168, (int)19, (int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii);
            this.IiiiiiiiIIIII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false));
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
        this.iiIiiiiiiiIii = new IIIiiiiiIiIiI[7];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.length) {
            this.iiIiiiiiiiIii[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 0) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(48, 50, 210, 21);
                } else if (IiiiiiiiIIIII == 1) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(277, 281, 426, 21);
                }
            } else if (IiiiiiiiIIIII >= 2 && IiiiiiiiIIIII <= 4) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                if (IiiiiiiiIIIII == 2) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(48, 50, 210, 242);
                } else if (IiiiiiiiIIIII == 3) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(277, 58, 230, 200);
                } else if (IiiiiiiiIIIII == 4) {
                    this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(277, 281, 426, 215);
                }
            } else if (IiiiiiiiIIIII == 5) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].iIiIiiiiIIiii("sc/d/150.png");
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(585, 133, 30, 56);
            } else if (IiiiiiiiIIIII == 6) {
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/36.png", (int)30, (int)30, (int)30, (int)30, (boolean)false));
                this.iiIiiiiiiiIii[IiiiiiiiIIIII].setBounds(269, 50, 446, 453);
            }
            this.add((Component)this.iiIiiiiiiiIii[IiiiiiiiIIIII++]);
        }
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 171) {
            this.iIiIiiiiIIiIi();
            return;
        }
        if (id == 172) {
            if (this.ALLATORIxDEMO().getBattleScene() != null) {
                return;
            }
            IiiIiiiiIIIii.ALLATORIxDEMO((int)20, (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        if (id != 173) return;
        if (this.ALLATORIxDEMO().getBattleScene() != null) {
            return;
        }
        IiiIiiiiIIIii.ALLATORIxDEMO((int)2, (GameView)this.iiIIiiiiIiIIi);
    }

    public void iiiIiiiiiiIIi() {
        this.iiIIIiiiiiiiI.ALLATORIxDEMO();
        this.iIiiIiiiiiiII.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(BigDecimal sid) {
        RoleSummoning IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        Mount IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getChoseMount();
        if (IiiiiiiiIIIII3 == null) {
            return;
        }
        RoleSummoning roleSummoning = IiiiiiiiIIIII = sid != null ? IiiiiiiiIIIII2.getPet(sid) : null;
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8bf7\u9009\u62e9\u4f60\u8981\u7ba1\u5236\u7684\u53ec\u5524\u517d\uff01");
            return;
        }
        Mount IiiiiiiiIIIII4 = IiiiiiiiIIIII2.getPetMount(IiiiiiiiIIIII.getSid());
        if (IiiiiiiiIIIII4 != null && IiiiiiiiIIIII4.getMountid().intValue() == IiiiiiiiIIIII3.getMountid().intValue()) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u53ec\u5524\u517d\u5df2\u88ab\u8be5\u5750\u9a91\u7ba1\u5236!");
            return;
        }
        if (IiiiiiiiIIIII3.getSid() != null && IiiiiiiiIIIII3.getOthrersid() != null && (IiiiiiiiIIIII3.getMountlvl() <= 100 || IiiiiiiiIIIII3.getMountlvl() > 100 && IiiiiiiiIIIII3.getSid3() != null)) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u8be5\u5750\u9a91\u7ba1\u5236\u540d\u5355\u5df2\u6ee1");
            return;
        }
        if (IiiiiiiiIIIII4 != null) {
            if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII4.getSid(), (BigDecimal)sid)) {
                IiiiiiiiIIIII4.setSid(null);
            } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII4.getOthrersid(), (BigDecimal)sid)) {
                IiiiiiiiIIIII4.setOthrersid(null);
            } else if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)IiiiiiiiIIIII4.getSid3(), (BigDecimal)sid)) {
                IiiiiiiiIIIII4.setSid3(null);
            }
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"changemountvalue", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII4));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
        }
        int IiiiiiiiIIIII6 = 0;
        if (IiiiiiiiIIIII3.getSid() == null) {
            IiiiiiiiIIIII6 = 1;
            IiiiiiiiIIIII3.setSid(IiiiiiiiIIIII.getSid());
        } else if (IiiiiiiiIIIII3.getOthrersid() == null) {
            IiiiiiiiIIIII6 = 2;
            IiiiiiiiIIIII3.setOthrersid(IiiiiiiiIIIII.getSid());
        } else if (IiiiiiiiIIIII3.getMountlvl() > 100 && IiiiiiiiIIIII3.getSid3() == null) {
            IiiiiiiiIIIII6 = 3;
            IiiiiiiiIIIII3.setSid3(IiiiiiiiIIIII.getSid());
        }
        if (IiiiiiiiIIIII6 != 0) {
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"changemountvalue", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII3));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
        }
        this.iIiiIiiiiiiII.ALLATORIxDEMO();
        this.iiiiiiiiIIiii();
    }

    protected void paintChildren(Graphics g) {
        if (this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) {
            this.iiiiiiiiIIiii();
        }
        super.paintChildren(g);
        if (this.iiiiIiiiIiiII == null) return;
        this.iiiiIiiiIiiII.ALLATORIxDEMO(g, 392, 220, 0, iIiIIiiiIiiiI.ALLATORIxDEMO());
    }

    static /* synthetic */ Image ALLATORIxDEMO(IiIIIiiiiIIiI arg0) {
        return arg0.IIiiIiiiIIiIi;
    }
}
