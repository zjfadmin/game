/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiiIiiiiIIII
 *  com.xy.a.a.IIiiIiiiIiiiI
 *  com.xy.bean.MonsterBean
 *  com.xy.bean.NPCDialog
 *  com.xy.d.IIIIIiiiIiIii
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.IIiIiiiiIiIII
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodExchange
 *  com.xy.formula.MsgUntil
 *  com.xy.game.NpcOption
 *  com.xy.game.PKSys
 *  com.xy.game.RoleData
 *  com.xy.game.Task
 *  com.xy.game.TaskProgress
 *  com.xy.i.IIIIIiiiIiIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Door
 *  com.xy.readbean.GoodFight
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.readbean.Question
 *  com.xy.readbean.Skill
 *  com.xy.readbean.Talk
 *  com.xy.readbean.TaskData
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.text.GameView
 *  com.xy.v.IIIIIiiiIiIii
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IiiiiiiiiIIII
 */
package com.xy.a;

import com.xy.a.IiiiIiiiiIIII;
import com.xy.a.a.IIiiIiiiIiiiI;
import com.xy.bean.MonsterBean;
import com.xy.bean.NPCDialog;
import com.xy.d.IIIIIiiiIiIii;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.IIiIiiiiIiIII;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodExchange;
import com.xy.formula.MsgUntil;
import com.xy.game.NpcOption;
import com.xy.game.PKSys;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.Question;
import com.xy.readbean.Skill;
import com.xy.readbean.Talk;
import com.xy.readbean.TaskData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIiiiiiIIIIi
extends IiiiIiiiiIiIi {
    private Long iiiIiiiiiiiIi;
    private int iIiiIiiiiiiII;
    private IIIiiiiiIiIiI IIiiIiiiIIiIi;
    private JScrollPane iIiIiiiiIiIii;
    private Long IiIIIiiiiIiiI;
    private JComponent iiIiiiiiiiIii;
    private iiiiiiiiiiIiI IiiiiiiiIIIII;
    private RichLabel ALLATORIxDEMO;

    public JComponent ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public void iIiIiiiiIIiii(int sizeh, int h) {
        sizeh = sizeh > 50 ? sizeh : 50;
        int IiiiiiiiIIIII = 187 - h;
        this.iiIiiiiiiiIii.setPreferredSize(new Dimension(450, sizeh));
        this.iIiIiiiiIiIii.setBounds(20, h, 470, sizeh < IiiiiiiiIIIII ? sizeh : IiiiiiiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public void iiiIiiiiiiIIi(IIiIiiiiIiIII iIiIiiiiIiIII, NpcInfoBean npcInfoBean, int n) {
        void npcUnit;
        void npcInfoBean2;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 0;
        this.IiIIIiiiiIiiI = npcInfoBean2 != null ? Long.valueOf(Long.parseLong(npcInfoBean2.getNpctable().getNpcid())) : null;
        this.IiiiiiiiIIIII = npcUnit;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        PKSys IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getPkSys();
        if (IiiiiiiiIIIII4.getPk1() == 0) {
            this.IiiIiiiiiiIiI("\u4e00\u4e2a\u826f\u6c11\u778e\u70b9\u5565,\u5728\u95f9\u8bf7\u4f60\u8fdb\u53bb");
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 62, 1, "\u6211\u60f3\u53bb\u6b7b\u7262\u63a2\u76d1", 450);
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 62, 2, "\u6211\u60f3\u53bb\u5730\u7262\u63a2\u76d1", 450);
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 62, 3, "\u6211\u60f3\u53bb\u5929\u7262\u63a2\u76d1", 450);
        } else {
            StringBuffer IiiiiiiiIIIII5 = new StringBuffer();
            IiiiiiiiIIIII5.append(IiiiiiiiIIIII3.getLoginResult().getRolename());
            IiiiiiiiIIIII5.append(",\u4f60\u8fd8\u6709");
            IiiiiiiiIIIII5.append(IiiiiiiiIIIII4.getPk1());
            IiiiiiiiIIIII5.append("\u70b9PK\u6807\u5fd7\u81ea\u9996\u53ef\u4ee5\u51cf\u8f7b\u7f6a\u884c");
            this.IiiIiiiiiiIiI(IiiiiiiiIIIII5.toString());
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 63, null, "\u6211\u662f\u6765\u81ea\u9996\u7684", 450);
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 0, null, "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a", 450);
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, 23 + this.ALLATORIxDEMO.getHeight());
        this.iIiIiiiiIIiIi(npcInfoBean2.getNpctable().getSkin());
    }

    public void iIiIiiiiIIiIi(int npcType) {
        int IiiiiiiiIIIII = MsgUntil.getSM((int)npcType, (int)this.ALLATORIxDEMO().getLoginResult().getSpecies_id().intValue());
        if (IiiiiiiiIIIII == -1) {
            return;
        }
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 13;
        this.IiIIIiiiiIiiI = npcType;
        this.IiiIiiiiiiIiI("");
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        IiiiiiiiiIIII IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < 5) {
            Skill IiiiiiiiIIIII6 = IiiiiiiiIIIII4.iIiIiiiiIIiii(String.valueOf(1001 + IiiiiiiiIIIII * 5 + IiiiiiiiIIIII5));
            if (IiiiiiiiIIIII6 != null) {
                IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 8, 1001 + IiiiiiiiIIIII * 5 + IiiiiiiiIIIII5, null, IiiiiiiiIIIII6.getSkillname(), 450);
            }
            ++IiiiiiiiIIIII5;
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(BigDecimal petId, int value) {
        int IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 17;
        this.IiIIIiiiiIiiI = petId.longValue();
        this.iiiIiiiiiiiIi = value;
        this.IiiIiiiiiiIiI("\u8bf7\u9009\u62e9\u4e0b\u9762\u5176\u4e2d\u4e00\u9879\u589e\u52a0" + value + "\u70b9\u7684\u57fa\u7840\u503c");
        int IiiiiiiiIIIII2 = 0;
        int n = 0;
        IiiiiiiiIIIII = n + this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 11, 0, 0, "HP", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 11, 1, 0, "MP", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 11, 2, 0, "AP", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 11, 3, 0, "SP", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void iiiiiiiiIIiii(String text) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)text)) {
            return;
        }
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 9;
        this.IiiIiiiiiiIiI(text);
        this.iIiIiiiiIIiii(0, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void IiiIiiiiiiIiI(Goodstable good) {
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 1;
        this.IiIIIiiiiIiiI = good.getRgid().longValue();
        this.IiiIiiiiiiIiI("\u9009\u62e9\u6253\u5f00\u5409\u7965\u5982\u610f\u86cb\u7684\u65b9\u5f0f\uff08\u7948\u798f\u5956\u52b1\u66f4\u4e30\u5bcc\uff09");
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 2) {
            NpcOption IiiiiiiiIIIII4 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            if (IiiiiiiiIIIII3 == 0) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(6, 1, null, "\u76f4\u63a5\u6253\u5f00", 450);
            } else {
                IiiiiiiiIIIII4.ALLATORIxDEMO(6, 2, null, "\u7948\u798f\uff08500W\u91d1\u5e01\uff09", 450);
            }
            IiiiiiiiIIIII4.setBounds(0, IiiiiiiiIIIII2, 470, IiiiiiiiIIIII4.getHeight());
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII2 += IiiiiiiiIIIII4.getHeight();
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(IIIIIiiiIiIii taskUnit) {
        int IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 0;
        this.IiiiiiiiIIIII = taskUnit;
        this.IiiIiiiiiiIiI("\u8fd9\u91cc\u98ce\u666f\u8fd8\u4e0d\u5dee");
        int IiiiiiiiIIIII2 = 0;
        int n = 0;
        IiiiiiiiIIIII = n + this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 58, 0, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684", 450);
        TaskData IiiiiiiiIIIII3 = taskUnit.ALLATORIxDEMO.getTask().getTaskData();
        if (IiiiiiiiIIIII3 != null) {
            int IiiiiiiiIIIII4 = 1;
            while (IiiiiiiiIIIII4 <= IiiiiiiiIIIII3.getNd()) {
                if (IiiiiiiiIIIII4 == 1) {
                    IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 58, 1, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u56f0\u96be\u96be\u5ea6)", 450);
                } else if (IiiiiiiiIIIII4 == 2) {
                    IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 58, 2, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u5353\u8d8a\u96be\u5ea6)", 450);
                } else if (IiiiiiiiIIIII4 == 3) {
                    IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 58, 3, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u5730\u72f1\u96be\u5ea6)", 450);
                } else if (IiiiiiiiIIIII4 == 4) {
                    IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 58, 4, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u5929\u5802\u96be\u5ea6)", 450);
                }
                ++IiiiiiiiIIIII4;
            }
        }
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 0, null, "\u6211\u4ec0\u4e48\u90fd\u4e0d\u60f3\u505a", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iIiIiiiiIIiIi((String)null);
    }

    public void ALLATORIxDEMO(Goodstable good, int index, int num) {
        GoodExchange[] IiiiiiiiIIIII;
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.iiIIiiiiIiIIi.getObjectArea();
        Goodstable IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO(good.getGoodsid());
        GoodExchange[] goodExchangeArray = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? IiiiiiiiIIIII3.getExchanges() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.iIiiIiiiiiiII = 21;
        this.IiIIIiiiiIiiI = good.getRgid().longValue();
        this.iiiIiiiiiiiIi = num;
        this.IiiIiiiiiiIiI("\u8bf7\u9009\u62e9\u9700\u8981\u5151\u6362\u7684\u9009\u9879\u3002\u5f53\u524d\u5151\u6362\u6570\u91cf:" + num);
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        GoodExchange IiiiiiiiIIIII6 = IiiiiiiiIIIII[index];
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII6.getGoods().length) {
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII6.getGoods()[IiiiiiiiIIIII7]);
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII5 += this.ALLATORIxDEMO(IiiiiiiiIIIII4++, IiiiiiiiIIIII5, 15, IiiiiiiiIIIII6.getGoods()[IiiiiiiiIIIII7].intValue(), null, IiiiiiiiIIIII3.getGoodsname(), 450);
            }
            ++IiiiiiiiIIIII7;
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII5, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiiiIiiiIiiII) return;
        this.iiiiIiiiIiiII = false;
        this.iIiIiiiiIiIii.updateUI();
    }

    public void iIiIiiiiIIiIi(Goodstable good) {
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 1;
        this.IiIIIiiiiIiiI = good.getRgid().longValue();
        this.IiiIiiiiiiIiI("\u5c06\u5f69\u6676\u77f3\u88c5\u6362\u4e3a\u5bf9\u5e94\u7684\u53ec\u5524\u517d\u9970\u54c1");
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 33) {
            NpcOption IiiiiiiiIIIII4 = this.ALLATORIxDEMO(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            if (IiiiiiiiIIIII3 == 0) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u9f99\u9a6c\u9970\u54c1", "\u9f99\u9a6c\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 1) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u767d\u9f99\u5e1d\u9970\u54c1", "\u767d\u9f99\u5e1d\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 2) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u701a\u5a01\u732b\u5c06\u7684\u5927\u5200", "\u701a\u5a01\u732b\u5c06\u7684\u5927\u5200", 450);
            } else if (IiiiiiiiIIIII3 == 3) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u68d5\u5c0f\u4ed9\u9970\u54c1", "\u68d5\u5c0f\u4ed9\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 4) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u7f57\u5239\u9b3c\u59ec\u9970\u54c1", "\u7f57\u5239\u9b3c\u59ec\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 5) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u51a5\u96f7\u9970\u54c1", "\u51a5\u96f7\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 6) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u897f\u57df\u54cd\u9a6c\u9970\u54c1", "\u897f\u57df\u54cd\u9a6c\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 7) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u91d1\u4e0d\u6362\u9970\u54c1", "\u91d1\u4e0d\u6362\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 8) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u677e\u9f20\u9970\u54c1", "\u677e\u9f20\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 9) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u62e8\u6d6a\u9f13\u9970\u54c1", "\u62e8\u6d6a\u9f13\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 10) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u54e5\u4fe9\u597d\u9970\u54c1", "\u54e5\u4fe9\u597d\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 11) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u5b54\u96c0\u660e\u738b\u9970\u54c1", "\u5b54\u96c0\u660e\u738b\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 12) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u8d6d\u708e\u9970\u54c1", "\u8d6d\u708e\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 13) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u753b\u76ae\u5a18\u5b50\u9970\u54c1", "\u753b\u76ae\u5a18\u5b50\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 14) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u51a5\u7075\u5983\u5b50\u9970\u54c1", "\u51a5\u7075\u5983\u5b50\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 15) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u9ec4\u91d1\u517d\u9970\u54c1", "\u9ec4\u91d1\u517d\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 16) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u5251\u7cbe\u7075\u9970\u54c1", "\u5251\u7cbe\u7075\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 17) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u6ce5\u77f3\u602a\u9970\u54c1", "\u6ce5\u77f3\u602a\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 18) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u51b0\u96ea\u9b54\u9970\u54c1", "\u51b0\u96ea\u9b54\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 19) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u8774\u8776\u4ed9\u5b50\u9970\u54c1", "\u8774\u8776\u4ed9\u5b50\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 20) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u51e4\u51f0\u9970\u54c1", "\u51e4\u51f0\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 21) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u51b2\u51b2\u866b\u9970\u54c1", "\u51b2\u51b2\u866b\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 22) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u732a\u602a\u9970\u54c1", "\u732a\u602a\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 23) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u7b26\u5492\u5973\u5a32\u9970\u54c1", "\u7b26\u5492\u5973\u5a32\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 24) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u7cbe\u536b\u9970\u54c1", "\u7cbe\u536b\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 25) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u7334\u7cbe\u9970\u54c1", "\u7334\u7cbe\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 26) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u5929\u9f99\u5973\u9970\u54c1", "\u5929\u9f99\u5973\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 27) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u5409\u7965\u679c\u9970\u54c1", "\u5409\u7965\u679c\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 28) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u72ee\u864e\u517d\u9970\u54c1", "\u72ee\u864e\u517d\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 29) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u5999\u97f3\u9e3e\u5973\u9970\u54c1", "\u5999\u97f3\u9e3e\u5973\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 30) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u78a7\u6c34\u7cbe\u9b44\u9970\u54c1", "\u78a7\u6c34\u7cbe\u9b44\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 31) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u4fcf\u5a18\u5b50\u9970\u54c1", "\u4fcf\u5a18\u5b50\u9970\u54c1", 450);
            } else if (IiiiiiiiIIIII3 == 32) {
                IiiiiiiiIIIII4.ALLATORIxDEMO(5, 1, (Object)"\u6728\u7532\u4eba\u9970\u54c1", "\u6728\u7532\u4eba\u9970\u54c1", 450);
            }
            IiiiiiiiIIIII4.setBounds(0, IiiiiiiiIIIII2, 470, IiiiiiiiIIIII4.getHeight());
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII2 += IiiiiiiiIIIII4.getHeight();
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        if (this.iIiiIiiiiiiII != 10) return;
        if (e.getButton() != 1) return;
        this.iIiIiiiiIIiIi();
    }

    public void ALLATORIxDEMO(BigDecimal petId) {
        int IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 16;
        this.IiIIIiiiiIiiI = petId.longValue();
        this.IiiIiiiiiiIiI("\u662f\u5426\u53d8\u5316\u8be5\u53ec\u5524\u517d\u7684\u9020\u578b");
        int IiiiiiiiIIIII2 = 0;
        int n = 0;
        IiiiiiiiIIIII = n + this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 10, 1, 0, "\u662f", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 10, 0, 0, "\u5426", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public iiiiiiiiiiIiI ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void IiiIiiiiiiIiI(String text) {
        this.ALLATORIxDEMO.setTextSize(text != null ? text : "", 495);
        this.ALLATORIxDEMO.setBounds(20, 15, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
    }

    public void iiiIiiiiiiIIi(Goodstable goodstable) {
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 18;
        this.IiIIIiiiiIiiI = goodstable.getRgid().longValue();
        String IiiiiiiiIIIII = goodstable.getValue().split("\\|")[2].split("=")[1];
        this.IiiIiiiiiiIiI("\u8be5\u661f\u5361\u5f53\u524d\u6218\u529b\u4e3a:" + IiiiiiiiIIIII + ",\u53ef\u4ee5\u9009\u62e9\u4ee5\u4e0b\u4e24\u79cd\u8865\u5145\u6218\u529b");
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
            IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 12, 0, 0, "\u661f\u8292\u6062\u590d(10\u70b9=1000\u70b9\u6218\u529b)", 450);
            IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 12, 1, 0, "\u91d1\u5e01\u6062\u590d(100\u4e07=1000\u70b9\u6218\u529b)", 450);
        } else {
            IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 12, 0, 0, "\u661f\u8292\u6062\u590d(100\u70b9=1000\u70b9\u6218\u529b)", 450);
            IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 12, 1, 0, "\u91d1\u5e01\u6062\u590d(1000\u4e07=1000\u70b9\u6218\u529b)", 450);
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(int id, Point rulePoint, int[] vs, String rivalName) {
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 27;
        this.IiIIIiiiiIiiI = id;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        if (rulePoint.x == 3) {
            if (rulePoint.y == 0) {
                this.IiiIiiiiiiIiI("#W\u672c\u573a\u6bd4\u8d5b\u4e3a16\u5f3a\u62a2\u4f4d\u8d5b(" + vs[1] + "/" + vs[2] + "),\u4f60\u7684\u5bf9\u624b\u662f#G" + rivalName + "#W\u961f\u4f0d\u3002\u5f53\u524d\u6bd4\u5206#R" + vs[4] + "#W:#R" + vs[5]);
            } else if (rulePoint.y == 1) {
                this.IiiIiiiiiiIiI("#W\u672c\u573a\u6bd4\u8d5b\u4e3a8\u5f3a\u62a2\u4f4d\u8d5b(" + vs[1] + "/" + vs[2] + "),\u4f60\u7684\u5bf9\u624b\u662f#G" + rivalName + "#W\u961f\u4f0d\u3002\u5f53\u524d\u6bd4\u5206#R" + vs[4] + "#W:#R" + vs[5]);
            } else if (rulePoint.y == 2) {
                this.IiiIiiiiiiIiI("#W\u672c\u573a\u6bd4\u8d5b\u4e3a4\u5f3a\u62a2\u4f4d\u8d5b(" + vs[1] + "/" + vs[2] + "),\u4f60\u7684\u5bf9\u624b\u662f#G" + rivalName + "#W\u961f\u4f0d\u3002\u5f53\u524d\u6bd4\u5206#R" + vs[4] + "#W:#R" + vs[5]);
            }
        } else if (rulePoint.x == 4) {
            if (rulePoint.y == 0) {
                this.IiiIiiiiiiIiI("#W\u672c\u573a\u6bd4\u8d5b\u4e3a\u534a\u51b3\u8d5b\u4e0a\u534a\u573a(" + vs[1] + "/" + vs[2] + "),\u4f60\u7684\u5bf9\u624b\u662f#G" + rivalName + "#W\u961f\u4f0d\u3002\u5f53\u524d\u6bd4\u5206#R" + vs[4] + "#W:#R" + vs[5]);
            } else if (rulePoint.y == 1) {
                this.IiiIiiiiiiIiI("#W\u672c\u573a\u6bd4\u8d5b\u4e3a\u534a\u51b3\u8d5b\u4e0b\u534a\u573a(" + vs[1] + "/" + vs[2] + "),\u4f60\u7684\u5bf9\u624b\u662f#G" + rivalName + "#W\u961f\u4f0d\u3002\u5f53\u524d\u6bd4\u5206#R" + vs[4] + "#W:#R" + vs[5]);
            }
        } else if (rulePoint.x == 5) {
            if (rulePoint.y == 0) {
                this.IiiIiiiiiiIiI("#W\u672c\u573a\u6bd4\u8d5b\u4e3a\u5b63\u6bbf\u4e89\u593a\u8d5b(" + vs[1] + "/" + vs[2] + "),\u4f60\u7684\u5bf9\u624b\u662f#G" + rivalName + "#W\u961f\u4f0d\u3002\u5f53\u524d\u6bd4\u5206#R" + vs[4] + "#W:#R" + vs[5]);
            } else if (rulePoint.y == 1) {
                this.IiiIiiiiiiIiI("#W\u672c\u573a\u6bd4\u8d5b\u4e3a\u51a0\u4e9a\u4e89\u593a\u8d5b(" + vs[1] + "/" + vs[2] + "),\u4f60\u7684\u5bf9\u624b\u662f#G" + rivalName + "#W\u961f\u4f0d\u3002\u5f53\u524d\u6bd4\u5206#R" + vs[4] + "#W:#R" + vs[5]);
            }
        }
        IiiiiiiiIIIII2 = vs[3] == 0 ? (IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 21, 1, null, "\u6211\u51c6\u5907\u597d\u4e86", 450)) : (IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 21, 2, null, "\u6211\u8fd8\u6ca1\u51c6\u5907\u597d", 450));
        IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 0, null, "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    /*
     * WARNING - void declaration
     */
    public void iIiIiiiiIIiii(RoleSummoning pet, Goodstable good) {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        if (pet == null) return;
        if (good == null) {
            return;
        }
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 15;
        this.IiIIIiiiiIiiI = pet.getSid().longValue();
        this.iiiIiiiiiiiIi = good.getRgid().longValue();
        int IiiiiiiiIIIII3 = 0;
        String[] IiiiiiiiIIIII4 = null;
        if (pet.getPetSkills() != null && !pet.getPetSkills().equals("")) {
            IiiiiiiiIIIII4 = pet.getPetSkills().split("\\|");
            IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < IiiiiiiiIIIII4.length) {
                if (IiiiiiiiIIIII4[IiiiiiiiIIIII2].startsWith("L") || IiiiiiiiIIIII4[IiiiiiiiIIIII2].startsWith("Q") || IiiiiiiiIIIII4[IiiiiiiiIIIII2].startsWith("T") || IiiiiiiiIIIII4[IiiiiiiiIIIII2].startsWith("X")) {
                    IiiiiiiiIIIII4[IiiiiiiiIIIII2] = null;
                } else {
                    IiiiiiiiIIIII = IiiiiiiiIIIII4[IiiiiiiiIIIII2].indexOf("=");
                    int IiiiiiiiIIIII5 = Integer.parseInt(IiiiiiiiIIIII == -1 ? IiiiiiiiIIIII4[IiiiiiiiIIIII2] : IiiiiiiiIIIII4[IiiiiiiiIIIII2].substring(0, IiiiiiiiIIIII));
                    if (!IIiiIiiiIiiiI.ALLATORIxDEMO((int)IiiiiiiiIIIII5, (GameClient)this.ALLATORIxDEMO())) {
                        IiiiiiiiIIIII4[IiiiiiiiIIIII2] = null;
                    } else {
                        ++IiiiiiiiIIIII3;
                    }
                }
                ++IiiiiiiiIIIII2;
            }
        }
        if (IiiiiiiiIIIII3 == 0) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u53ec\u5524\u517d\u8fd8\u672a\u5b66\u4e60\u5230\u53ef\u609f\u7075\u7684\u6280\u80fd");
            return;
        }
        this.IiiIiiiiiiIiI("\u53ef\u5c06" + pet.getSummoningname() + "\u4ee5\u4e0b\u6280\u80fd\u8fdb\u884c\u7075\u8fd4");
        IiiiiiiiIIIII2 = 0;
        IiiiiiiiIIIII = 0;
        IiiiiiiiiIIII IiiiiiiiIIIII6 = this.ALLATORIxDEMO();
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII4.length) {
            int IiiiiiiiIIIII8;
            Skill IiiiiiiiIIIII9;
            if (IiiiiiiiIIIII4[IiiiiiiiIIIII7] != null && (IiiiiiiiIIIII9 = IiiiiiiiIIIII6.iIiIiiiiIIiii((IiiiiiiiIIIII8 = IiiiiiiiIIIII4[IiiiiiiiIIIII7].indexOf("=")) == -1 ? IiiiiiiiIIIII4[IiiiiiiiIIIII7] : IiiiiiiiIIIII4[IiiiiiiiIIIII7].substring(0, IiiiiiiiIIIII8))) != null) {
                void IiiiiiiiIIIII10;
                String string = IiiiiiiiIIIII8 != -1 ? String.valueOf(IiiiiiiiIIIII9.getSkillname()) + "(" + IiiiiiiiIIIII4[IiiiiiiiIIIII7].substring(IiiiiiiiIIIII8 + 1) + ")" : IiiiiiiiIIIII9.getSkillname();
                IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 9, Integer.parseInt(IiiiiiiiIIIII9.getSkillid()), null, (String)IiiiiiiiIIIII10, 450);
            }
            ++IiiiiiiiIIIII7;
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void iiiIiiiiiiIIi(int id) {
        int IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 23;
        if (id == 1) {
            this.IiiIiiiiiiIiI("\u4f7f\u7528#Y90#W\u4e2a#G\u795e\u517d\u788e\u7247#W\u53ef\u4ee5\u968f\u673a\u5151\u6362\u4ee5\u4e0b\u795e\u517d\u4e2d\u7684\u968f\u673a\u4e00\u53ea\uff1a#r\u4e94\u5e38\u795e\u517d\uff1a#G\u4e94\u53f6\u3001\u6d6a\u6dd8\u6c99\u3001\u989c\u5982\u7389\u3001\u5782\u4e91\u53df\u3001\u8303\u5f0f\u4e4b\u9b42#r#W\u7ecf\u5178\u795e\u517d\uff1a#G\u8d85\u7ea7\u98de\u9c7c\u3001\u8d85\u7ea7\u87fe\u870d\u3001\u8d85\u7ea7\u8718\u86db\u3001\u8d85\u7ea7\u8759\u8760\u3001\u8d85\u7ea7\u6bd2\u86c7\u3001\u8d85\u7ea7\u6d77\u9f9f#r#W\u516d\u827a\u795e\u517d\uff1a#G\u7075\u542c\u3001\u98de\u8f69\u3001\u83b2\u751f\u3001\u5927\u5415\u3001\u5170\u4ead\u3001\u5e7b\u65b9");
        } else if (id == 2) {
            this.IiiIiiiiiiIiI("\u4f7f\u7528#Y500#W\u4e2a#G\u73cd\u60dc\u795e\u517d\u788e\u7247#W\u53ef\u4ee5\u968f\u673a\u5151\u6362\u4ee5\u4e0b\u795e\u517d\u4e2d\u7684\u968f\u673a\u4e00\u53ea\uff1a#r#W\u73cd\u7a00\u795e\u517d\uff1a#G\u5e74\u3001\u753b\u4e2d\u4ed9\u3001\u767d\u6cfd");
        }
        int IiiiiiiiIIIII2 = 0;
        int n = 0;
        IiiiiiiiIIIII = n + this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 17, id, null, "\u7ed9\u4f60\u795e\u517d\u788e\u7247\uff0c\u6211\u5df2\u7ecf\u8feb\u4e0d\u53ca\u5f85\u4e86\uff01", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 0, null, "\u6211\u5728\u8003\u8651\u8003\u8651", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(NPCDialog npcDialog) {
        block10: {
            block9: {
                block8: {
                    this.IiiIiiiiiiIiI();
                    this.iIiiIiiiiiiII = 14;
                    this.IiiIiiiiiiIiI(npcDialog.getMsg());
                    if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)npcDialog.getType())) {
                        if (npcDialog.getType().startsWith("N")) {
                            this.IiIIIiiiiIiiI = IIiiIiiiiIIiI.ALLATORIxDEMO((String)npcDialog.getType(), (int)1, (int)npcDialog.getType().length());
                            this.iiiIiiiiiiiIi = 0L;
                        } else if (npcDialog.getType().startsWith("M")) {
                            this.IiIIIiiiiIiiI = IIiiIiiiiIIiI.ALLATORIxDEMO((String)npcDialog.getType(), (int)1, (int)npcDialog.getType().length());
                            this.iiiIiiiiiiiIi = 1L;
                            IiiiiiiiIIIII = this.iiIIiiiiIiIIi.mapScene.iIiIiiiiIIiii(this.IiIIIiiiiIiiI.intValue());
                            if (IiiiiiiiIIIII == null) {
                                return;
                            }
                            this.IiiiiiiiIIIII = IiiiiiiiIIIII;
                        }
                    }
                    IiiiiiiiIIIII = null;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (npcDialog.getFunctions() == null) break block8;
                    IiiiiiiiIIIII = false;
                    if (this.iiiIiiiiiiiIi == null || this.iiiIiiiiiiiIi != 1L) break block9;
                    IiiiiiiiIIIII = (IIIIIiiiIiiII)this.IiiiiiiiIIIII;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.IiiiiiiiIIIII;
                    if (IiiiiiiiIIIII.getRobottype() < 100 || IiiiiiiiIIIII.getRobottype() > 199 || IiiiiiiiIIIII.getRobottype() == 132) break block9;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl35
                }
                IiiiiiiiIIIII = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
                break block10;
                do {
                    var9_10 = (String)npcDialog.getFunctions().get(IiiiiiiiIIIII);
                    v0 = IiiiiiiiIIIII++;
                    ++IiiiiiiiIIIII;
                    IiiiiiiiIIIII += this.ALLATORIxDEMO(v0, IiiiiiiiIIIII, 0, 64, "M" + IiiiiiiiIIIII.getI() + "|" + (String)IiiiiiiiIIIII, (String)IiiiiiiiIIIII, 450);
lbl35:
                    // 2 sources

                } while (IiiiiiiiIIIII < npcDialog.getFunctions().size());
                IiiiiiiiIIIII = true;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII != false ? npcDialog.getFunctions().size() : 0;
            while (IiiiiiiiIIIII < npcDialog.getFunctions().size()) {
                IiiiiiiiIIIII = (String)npcDialog.getFunctions().get(IiiiiiiiIIIII);
                IiiiiiiiIIIII = IiiiiiiiIIIII.equals("\u6211\u8981\u56de\u957f\u5b89") ? (IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII, 0, 3, null, "\u6211\u8981\u56de\u957f\u5b89", 450)) : (IiiiiiiiIIIII.equals("\u6211\u8981\u4e0b\u6218\u4e66") ? (IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII, 0, 65, null, "\u6211\u8981\u4e0b\u6218\u4e66", 450)) : (IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII, 0, 28, IiiiiiiiIIIII, (String)IiiiiiiiIIIII, 450)));
                ++IiiiiiiiIIIII;
            }
        }
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII, 0, 0, null, IiiiiiiiIIIII, 450);
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii(int n) {
        this.IiiIiiiiiiIiI();
        int type = 19;
        this.IiIIIiiiiIiiI = type;
        this.IiiIiiiiiiIiI(type == 0 ? "\u8bf7\u9009\u9879\u5bf9\u5e94\u7684\u526f\u804c\u4e1a" : "\u4f60\u8981\u66f4\u6362\u6210\u90a3\u4e2a\u526f\u804c\u4e1a\uff1f\u526f\u804c\u4e1a\u7b49\u7ea7\u6700\u5c1110\u7ea7\u624d\u80fd\u66f4\u6362\u526f\u804c\u4e1a,\u4e14\u6bcf\u6b21\u66f4\u6362\u540e\u526f\u804c\u4e1a\u7b49\u7ea7\u4f1a\u964d\u4f4e3\u7ea7\u3002");
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        if (type != 1) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 13, 1, 0, "\u755c\u7267", 450);
        }
        if (type != 2) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 13, 2, 0, "\u79cd\u690d", 450);
        }
        if (type != 3) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 13, 3, 0, "\u91c7\u77ff", 450);
        }
        if (type != 4) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 13, 4, 0, "\u5bb6\u5177", 450);
        }
        if (type != 5) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 13, 5, 0, "\u5236\u836f", 450);
        }
        if (type != 6) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 13, 6, 0, "\u7b26\u6587", 450);
        }
        if (type != 0) {
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 0, null, "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a", 450);
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiii(Goodstable good) {
        NpcOption IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 1;
        this.IiIIIiiiiIiiI = good.getRgid().longValue();
        this.IiiIiiiiiiIiI("\u8bb0\u5f55\u591a\u4e2a\u5750\u6807\u7684\u98de\u884c\u68cb");
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        GoodFight IiiiiiiiIIIII4 = good.getFight();
        while (IiiiiiiiIIIII4 != null && IiiiiiiiIIIII4.getMap() != 0) {
            NpcOption npcOption = this.ALLATORIxDEMO(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.ALLATORIxDEMO(3, 0, (Object)IiiiiiiiIIIII4, IiiiiiiiIIIII4.getMenu(), 450);
            npcOption.setBounds(0, IiiiiiiiIIIII3, 470, IiiiiiiiIIIII.getHeight());
            IiiiiiiiIIIII3 += IiiiiiiiIIIII.getHeight();
            IiiiiiiiIIIII4 = IiiiiiiiIIIII4.getNextFight();
        }
        if (IiiiiiiiIIIII2 < 5) {
            IiiiiiiiIIIII = this.ALLATORIxDEMO(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.ALLATORIxDEMO(4, 0, null, "\u65b0\u589e\u5750\u6807", 450);
            IiiiiiiiIIIII.setBounds(0, IiiiiiiiIIIII3, 470, IiiiiiiiIIIII.getHeight());
            IiiiiiiiIIIII3 += IiiiiiiiIIIII.getHeight();
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public Long iIiIiiiiIIiii() {
        return this.IiIIIiiiiIiiI;
    }

    public void iIiIiiiiIIiii(IIiIiiiiIiIII npcUnit, NpcInfoBean npcInfoBean, int npctype) {
        String IiiiiiiiIIIII;
        List IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3;
        Object IiiiiiiiIIIII4;
        Object IiiiiiiiIIIII5;
        Talk IiiiiiiiIIIII6;
        if (npctype == 101) {
            this.ALLATORIxDEMO(npcUnit, npcInfoBean, npctype);
            return;
        }
        if (npctype == 102) {
            this.iiiIiiiiiiIIi(npcUnit, npcInfoBean, npctype);
            return;
        }
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 0;
        this.IiIIIiiiiIiiI = npcInfoBean != null ? Long.valueOf(Long.parseLong(npcInfoBean.getNpctable().getNpcid())) : null;
        this.IiiiiiiiIIIII = npcUnit;
        Talk talk = IiiiiiiiIIIII6 = npcInfoBean != null ? npcInfoBean.ALLATORIxDEMO() : null;
        if (IiiiiiiiIIIII6 != null) {
            this.IiiIiiiiiiIiI(IiiiiiiiIIIII6.getTalktext());
            if (npcInfoBean.getNpctable().getNpcid().equals("400102")) {
                this.ALLATORIxDEMO().ALLATORIxDEMO(Agreement.getSendTextAES((String)"hatchvalue", null));
            }
        } else {
            this.IiiIiiiiiiIiI((String)null);
        }
        String IiiiiiiiIIIII7 = null;
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        if (npctype >= 5 && npctype <= 10 || npctype >= 13 && npctype <= 15 || npctype == 18 || npctype == 37 || npctype == 45 || npctype == 50 || npctype == 88 || npctype == 99 || npctype == 120 || npctype == 121 || npctype == 123 || npctype == 124 || npctype == 125 || npctype == 131 || npctype == 136 || npctype == 735 || npctype == 2025) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype >= 19 && npctype <= 30 || npctype >= 72 && npctype <= 75) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            if (MsgUntil.ALLATORIxDEMO((int)npctype, (int)this.ALLATORIxDEMO().getLoginResult().getSpecies_id().intValue())) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 2, npctype, "\u5b66\u4e60\u6cd5\u672f", 450);
            }
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 3, null, "\u6211\u8981\u56de\u957f\u5b89", 450);
        } else if (npctype == 888) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 4, null, "\u6211\u8981\u7ed3\u5a5a", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 5, null, "\u6211\u8981\u79bb\u5a5a", 450);
        } else if (npctype == 39) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 6, 60, "\u6211\u8981\u9886\u53d6\u4e00\u5c0f\u65f6\u53cc\u500d\u65f6\u95f4", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 6, 120, "\u6211\u8981\u9886\u53d6\u4e8c\u5c0f\u65f6\u53cc\u500d\u65f6\u95f4", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 6, 240, "\u6211\u8981\u9886\u53d6\u56db\u5c0f\u65f6\u53cc\u500d\u65f6\u95f4", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 7, null, "\u6211\u8981\u51bb\u7ed3\u53cc\u500d\u65f6\u95f4", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 8, null, "\u6211\u8981\u67e5\u8be2\u5269\u4f59\u53cc\u500d\u65f6\u95f4", 450);
        } else if (npctype == 40) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u6362\u4e2a\u9ad8\u7ea7\u85cf\u5b9d\u56fe", "\u6362\u4e2a\u9ad8\u7ea7\u85cf\u5b9d\u56fe", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u6362\u4e2a\u8d85\u7ea7\u85cf\u5b9d\u56fe", "\u6362\u4e2a\u8d85\u7ea7\u85cf\u5b9d\u56fe", 450);
            if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11) && !this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u6362\u4e2a\u73b2\u73d1\u85cf\u5b9d\u56fe(\u6d88\u801710E\u5927\u8bdd\u5e01,1W\u4ed9\u7389)", "\u6362\u4e2a\u73b2\u73d1\u85cf\u5b9d\u56fe(\u6d88\u801710E\u5927\u8bdd\u5e01,1W\u4ed9\u7389)", 450);
            }
        } else if (npctype == 41) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 10, null, "\u6211\u8981\u4f4f\u5e97(\u6263\u96642000\u94f6\u4e24)", 450);
        } else if (npctype == 12) {
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u5347\u7ea7\u795e\u5175", "\u6211\u8981\u5347\u7ea7\u795e\u5175", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u4e0a\u795e\u5175\u77f3", "\u6211\u8981\u4e0a\u795e\u5175\u77f3", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u7cbe\u70bc\u795e\u5175", "\u7cbe\u70bc\u795e\u5175", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3", "\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u5b9d\u77f3\u5408\u6210", "\u5b9d\u77f3\u5408\u6210", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u5b9d\u77f3\u9576\u5d4c", "\u5b9d\u77f3\u9576\u5d4c", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u5b9d\u77f3\u8ffd\u52a0", "\u5b9d\u77f3\u8ffd\u52a0", 450);
            } else {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907", "\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u5347\u7ea7\u795e\u5175", "\u6211\u8981\u5347\u7ea7\u795e\u5175", 450);
                if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
                    IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u7cbe\u70bc\u795e\u5175", "\u7cbe\u70bc\u795e\u5175", 450);
                }
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u4e0a\u795e\u5175\u77f3", "\u6211\u8981\u4e0a\u795e\u5175\u77f3", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3", "\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u7b26\u77f3", "\u7b26\u77f3", 450);
            }
        } else if (npctype == 16) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 12, null, "\u6cbb\u7597\u5f53\u524d\u53ec\u5524\u517d\u5e76\u6062\u590d\u5fe0\u8bda", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 14, null, "\u5168\u90e8\u533b\u6cbb\u548c\u4fee\u590d", 450);
        } else if (npctype == 32) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 16, null, "\u6211\u8981\u4e00\u9897\u60c5\u82b1\u82d7", 450);
        } else if (npctype == 36) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u6211\u662f\u6765\u53ec\u5524\u4f60\u7684", "\u6211\u662f\u6765\u53ec\u5524\u4f60\u7684", 450);
        } else if (npctype == 38) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 18, null, "\u795e\u517d\u5b66\u4e60\u6280\u80fd", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 19, null, "\u98de\u5347\u5f53\u524d\u53c2\u6218\u795e\u517d", 450);
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 67, null, "\u6211\u6709\u795e\u517d\u788e\u7247,\u6211\u6765\u6362\u795e\u517d", 450);
            } else {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 20, null, "\u6211\u8981\u5408\u6210\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 21, null, "\u6211\u8981\u5e7b\u5316\u5f53\u524d\u53c2\u6218\u53ec\u5524\u517d", 450);
            }
        } else if (npctype == 44) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 22, null, "\u8f6c\u751f\u5f53\u524d\u53ec\u5524\u517d", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 23, null, "\u70b9\u5316\u5f53\u524d\u53ec\u5524\u517d", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 24, null, "\u542f\u7075\u5f53\u524d\u53ec\u5524\u517d", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 25, null, "\u70b9\u5316\u5f53\u524d\u5750\u9a91", 450);
            if (this.ALLATORIxDEMO().gameMount) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 68, null, "\u6211\u8981\u91cd\u5851\u4e00\u5230\u4e94\u5750\u9a91", 450);
            }
        } else if (npctype == 47) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 26, null, "\u6211\u5df2\u505a\u597d\u4e86\u8f6c\u751f\u51c6\u5907", 450);
        } else if (npctype == 48) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 27, null, "\u6211\u60f3\u8f6c\u6362\u79cd\u65cf", 450);
        } else if (npctype == 54) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907", "\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6253\u902011-14\u7ea7\u88c5\u5907", "\u6253\u902011-14\u7ea7\u88c5\u5907", 450);
            } else {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6253\u902011-16\u7ea7\u88c5\u5907", "\u6253\u902011-16\u7ea7\u88c5\u5907", 450);
            }
            if (this.ALLATORIxDEMO().gameBaby) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6253\u9020\u5b69\u5b50\u88c5\u5907", "\u6253\u9020\u5b69\u5b50\u88c5\u5907", 450);
            }
        } else if (npctype == 61) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u6765\u62a5\u540d\u53c2\u52a0\u5e2e\u6218", "\u6211\u6765\u62a5\u540d\u53c2\u52a0\u5e2e\u6218", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u53c2\u52a0\u5e2e\u6218", "\u6211\u8981\u53c2\u52a0\u5e2e\u6218", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u9886\u53d6\u5e2e\u6218\u5956\u52b1", "\u6211\u8981\u9886\u53d6\u5e2e\u6218\u5956\u52b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 63) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 31, null, "\u6211\u8981\u521b\u5efa\u5e2e\u6d3e,(\u9700\u8981\u4e00\u4e2a\u53ec\u96c6\u4ee4)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 32, null, "\u52a0\u5165\u5e2e\u6d3e", 450);
        } else if (npctype == 64) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 33, null, "\u8fdb\u5165\u5e2e\u6d3e", 450);
        } else if (npctype == 66) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u5408\u6210\u4ed9\u5668", "\u6211\u8981\u5408\u6210\u4ed9\u5668", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u5347\u7ea7\u4ed9\u5668", "\u6211\u8981\u5347\u7ea7\u4ed9\u5668", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u6d17\u70bc\u4ed9\u5668", "\u6211\u8981\u6d17\u70bc\u4ed9\u5668", 450);
        } else if (npctype == 69) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u57f9\u517b\u62a4\u8eab\u7b26", "\u6211\u8981\u57f9\u517b\u62a4\u8eab\u7b26", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u91cd\u94f8\u62a4\u8eab\u7b26", "\u6211\u8981\u91cd\u94f8\u62a4\u8eab\u7b26", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u57f9\u517b\u9970\u54c1", "\u6211\u8981\u57f9\u517b\u9970\u54c1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u91cd\u94f8\u9970\u54c1", "\u6211\u8981\u91cd\u94f8\u9970\u54c1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u57f9\u517b\u5f69\u6676\u77f3", "\u57f9\u517b\u5f69\u6676\u77f3", 450);
        } else if (npctype == 31) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 34, null, "\u6211\u8981\u53d6\u56de\u7269\u54c1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 35, null, "\u6211\u8981\u5178\u5f53\u7269\u54c1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 36, null, "\u6211\u8981\u5178\u5f53\u53ec\u5524\u517d", 450);
        } else if (npctype == 33) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 37, null, "\u6211\u6765\u67e5\u8be2\u5bc4\u552e\u91d1\u94b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 38, null, "\u6211\u8981\u53d6\u51fa\u5bc4\u552e\u91d1\u94b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 39, null, "\u6211\u8981\u5b58\u70b9\u94b1(0.1%\u624b\u7eed\u8d39)", 450);
        } else if (npctype == 130) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 66, null, "\u6211\u8981\u9886\u517b\u4e00\u4e2a\u5b69\u5b50", 450);
        } else if (npctype == 1001) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u8fdb\u5165\u6218\u573a", "\u6211\u8981\u8fdb\u5165\u6218\u573a", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u8fdb\u5165\u9ad8\u624b\u6311\u6218\u8d5b", "\u6211\u8981\u8fdb\u5165\u9ad8\u624b\u6311\u6218\u8d5b", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u56de\u5230\u8425\u5730", "\u56de\u5230\u8425\u5730", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u8131\u79bb\u5e2e\u6218", "\u6211\u8981\u8131\u79bb\u5e2e\u6218", 450);
        } else if (npctype == 1003) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5267\u6bd2\u5c01\u5370\u4e4b\u4e66", "\u5267\u6bd2\u5c01\u5370\u4e4b\u4e66", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5bd2\u51b0\u5c01\u5370\u4e4b\u4e66", "\u5bd2\u51b0\u5c01\u5370\u4e4b\u4e66", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5929\u96f7\u5c01\u5370\u4e4b\u4e66", "\u5929\u96f7\u5c01\u5370\u4e4b\u4e66", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5fa1\u5251\u5c01\u5370\u4e4b\u4e66", "\u5fa1\u5251\u5c01\u5370\u4e4b\u4e66", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u72c2\u529b\u5c01\u5370\u4e4b\u4e66", "\u72c2\u529b\u5c01\u5370\u4e4b\u4e66", 450);
        } else if (npctype == 1004) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u51a5\u7075\u53e4\u5377", "\u51a5\u7075\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u73b2\u73d1\u53e4\u5377", "\u73b2\u73d1\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5de8\u7ffc\u53e4\u5377", "\u5de8\u7ffc\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u846b\u82a6\u53e4\u5377", "\u846b\u82a6\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5982\u610f\u53e4\u5377", "\u5982\u610f\u53e4\u5377", 450);
        } else if (npctype == 1005) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u82cd\u51db\u53e4\u5377", "\u82cd\u51db\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u8d6d\u708e\u53e4\u5377", "\u8d6d\u708e\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5f53\u5eb7\u53e4\u5377", "\u5f53\u5eb7\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u677e\u9f20\u53e4\u5377", "\u677e\u9f20\u53e4\u5377", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u4f73\u97f3\u5c0f\u4f7f\u53e4\u5377", "\u4f73\u97f3\u5c0f\u4f7f\u53e4\u5377", 450);
        } else if (npctype == 1006) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 3, null, "\u6211\u8981\u56de\u957f\u5b89", 450);
        } else if (npctype == 1100) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 41, null, "\u6211\u8981\u6fc0\u6d3b\u5151\u5956\u7801", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5151\u6362\u5f69\u6676\u77f3", "\u5151\u6362\u5f69\u6676\u77f3", 450);
        } else if (npctype == 122) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 42, null, "\u6211\u8981\u62bd\u5956", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 43, null, "\u6211\u8981\u6295\u653e\u529f\u7ee9\u7269\u54c1", 450);
        } else if (npctype == 126) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u53c2\u52a0\u6c34\u9646\u5927\u4f1a", "\u6211\u8981\u53c2\u52a0\u6c34\u9646\u5927\u4f1a", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u9886\u53d6\u6c34\u9646\u5927\u4f1a\u5956\u52b1", "\u9886\u53d6\u6c34\u9646\u5927\u4f1a\u5956\u52b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 127) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 128) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 44, null, "\u6211\u8981\u4e0b\u6311\u6218\u4e66", 450);
        } else if (npctype == 129) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 45, null, "\u6211\u8981\u5151\u6362\u7075\u4fee\u503c", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 46, null, "\u6211\u8981\u6536\u5f55\u7389\u7b26\uff08\u7389\u7b26\u8f6c\u7b26\u5f55\uff09", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 47, null, "\u6211\u8981\u67e5\u770b\u5df2\u6709\u7b26\u5f55\uff08\u7b26\u5f55\u8f6c\u7389\u7b26\uff09", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 3, null, "\u6211\u8981\u56de\u957f\u5b89", 450);
        } else if (npctype == 132) {
            IiiiiiiiIIIII7 = "\u524d\u9014\u7f08\u7f08\uff0c\u6211\u8fd8\u662f\u518d\u51c6\u5907\u4e0b\u5427";
        } else if (npctype == 133) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5e74(588\u788e\u7247)", "\u5e74(588\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u753b\u4e2d\u4ed9(488\u788e\u7247)", "\u753b\u4e2d\u4ed9(488\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u767d\u6cfd(468\u788e\u7247)", "\u767d\u6cfd(468\u788e\u7247)", 450);
        } else if (npctype == 134) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u9f99\u9a6c(188\u788e\u7247)", "\u9f99\u9a6c(188\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u753b\u76ae\u5a18\u5b50(188\u788e\u7247)", "\u753b\u76ae\u5a18\u5b50(188\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5b54\u96c0\u660e\u738b(188\u788e\u7247)", "\u5b54\u96c0\u660e\u738b(188\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5317\u51a5\u9f99\u541b(288\u788e\u7247)", "\u5317\u51a5\u9f99\u541b(288\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5b5f\u6781(288\u788e\u7247)", "\u5b5f\u6781(288\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u955c\u82b1\u6c34\u6708(388\u788e\u7247)", "\u955c\u82b1\u6c34\u6708(388\u788e\u7247)", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 9, "\u5999\u97f3\u683e\u5973(388\u788e\u7247)", "\u5999\u97f3\u683e\u5973(388\u788e\u7247)", 450);
        } else if (npctype == 137) {
            IiiiiiiiIIIII7 = "\u5143\u65e6\u5feb\u4e50\uff0c\u6709\u4e8b\u5148\u95ea";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 48, null, "\u6211\u6765\u52a9\u4f60\u4e00\u5b75\u4e4b\u529b\uff08\u9700\u63d0\u4ea4\u4e00\u4e2a\u7269\u54c1\uff09", 450);
        } else if (npctype == 1106) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u53c2\u52a0\u79cd\u65cf\u8d5b", "\u53c2\u52a0\u79cd\u65cf\u8d5b", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u4e00\u952e\u9886\u53d6\u79cd\u65cf\u8d5b\u5956\u52b1", "\u4e00\u952e\u9886\u53d6\u79cd\u65cf\u8d5b\u5956\u52b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 515) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u53c2\u52a0\u64c2\u53f0\u8d5b", "\u53c2\u52a0\u64c2\u53f0\u8d5b", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u4e00\u952e\u9886\u53d6\u64c2\u53f0\u8d5b\u5956\u52b1", "\u4e00\u952e\u9886\u53d6\u64c2\u53f0\u8d5b\u5956\u52b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 520) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u8fdb\u884c\u4e5d\u751f\u4e5d\u6b7b\u6311\u6218", "\u6211\u8981\u8fdb\u884c\u4e5d\u751f\u4e5d\u6b7b\u6311\u6218", 450);
        } else if (npctype == 85) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 49, null, "\u6211\u8981\u6253\u9020,\u6458\u6284\u5b9d\u77f3", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 50, null, "\u6211\u8981\u5408\u6210\u5b9d\u77f3\u7b49", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 800) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u53c2\u52a0\u8de8\u670d\u8054\u8d5b", "\u6211\u8981\u53c2\u52a0\u8de8\u670d\u8054\u8d5b", 450);
        } else if (npctype == 530) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u6765\u4e0a\u4ea4\u5730\u715e\u661f\u4e4b\u9b42", "\u6211\u6765\u4e0a\u4ea4\u5730\u715e\u661f\u4e4b\u9b42", 450);
        } else if (npctype == 605) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u56de\u5230500\u5e74\u524d", "\u6211\u8981\u56de\u5230500\u5e74\u524d", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u9886\u53d6\u5927\u95f9\u5929\u5bab\u5956\u52b1", "\u9886\u53d6\u5927\u95f9\u5929\u5bab\u5956\u52b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 42 || npctype == 43) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u6765\u4e0a\u4ea4\u4e0a\u53e4\u5b9d\u7bb1", "\u6211\u6765\u4e0a\u4ea4\u4e0a\u53e4\u5b9d\u7bb1", 450);
        } else if (npctype == 103) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u53c2\u89c2\u4e0a\u53e4\u6218\u573a\u7684\u98ce\u91c7", "\u6211\u8981\u53c2\u89c2\u4e0a\u53e4\u6218\u573a\u7684\u98ce\u91c7", 450);
        } else if (npctype == 104) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u9001\u6211\u56de\u540e\u65b9\u8425\u5730", "\u9001\u6211\u56de\u540e\u65b9\u8425\u5730", 450);
        } else if (npctype == 105) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 51, null, "\u795e\u529b\u52a0\u6301", 450);
        } else if (npctype == 2021) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u5347\u7ea7\u5e2e\u6d3e\u7b49\u7ea7", "\u5347\u7ea7\u5e2e\u6d3e\u7b49\u7ea7", 450);
        } else if (npctype == 2024) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 52, null, "\u6211\u8981\u63d0\u4ea4\u6750\u6599", 450);
        } else if (npctype == 2026) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 53, 1, "\u5b88\u62a4\u5c0f\u6210\u4fee\u70bc", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 53, 2, "\u5b88\u62a4\u5927\u6210\u4fee\u70bc", 450);
        } else if (npctype == 89) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 54, null, "\u6211\u60f3\u4ece\u4f60\u8fd9\u6362\u70b9\u7ed1\u7389", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 2027) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 55, null, "\u6211\u8981\u53c2\u52a0\u5929\u68af\u5dc5\u5cf0\u8d5b", 450);
        } else if (npctype == 2028) {
            IiiiiiiiIIIII7 = "\u6211\u70b9\u9519\u4e86\uff0c\u6211\u5b9e\u529b\u672a\u5230\uff0c\u4e0d\u6562\u5c1d\u8bd5";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 56, null, "\u6211\u8981\u6311\u6218\u8bd5\u70bc\u5e7b\u5883", 450);
        } else if (npctype == 2029) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 57, null, "\u6211\u8981\u4e0a\u67f1\u9999", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 2030) {
            IiiiiiiiIIIII7 = "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a";
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u6211\u8981\u53c2\u52a0\u5927\u4e71\u6597", "\u6211\u8981\u53c2\u52a0\u5927\u4e71\u6597", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 28, "\u9886\u53d6\u5927\u4e71\u6597\u5403\u9e21\u5956\u52b1", "\u9886\u53d6\u5927\u4e71\u6597\u5403\u9e21\u5956\u52b1", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, npctype, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (npctype == 59998) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, 5, "\u6742\u8d27\u5e97", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, 9, "\u836f\u5e97", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, 14, "\u6280\u80fd\u5546\u5e97", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, 15, "\u5185\u4e39\u5546\u5e97", 450);
            if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, 37, "\u7b26\u6587\u5546\u5e97", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, -71, "\u91d1\u5e01\u56de\u6536\u5546", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 1, -89, "\u7ed1\u7389\u56de\u6536\u5546", 450);
            }
        } else if (npctype == 59990) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907", "\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u5347\u7ea7\u795e\u5175", "\u6211\u8981\u5347\u7ea7\u795e\u5175", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u6211\u8981\u4e0a\u795e\u5175\u77f3", "\u6211\u8981\u4e0a\u795e\u5175\u77f3", 450);
            if (!this.ALLATORIxDEMO().ALLATORIxDEMO(2, 11)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 11, "\u7cbe\u70bc\u795e\u5175", "\u7cbe\u70bc\u795e\u5175", 450);
            }
        } else if (npctype == -44) {
            if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 3)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 22, null, "\u8f6c\u751f\u5f53\u524d\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 20, null, "\u6211\u8981\u5408\u6210\u53ec\u5524\u517d", 450);
            } else if (this.ALLATORIxDEMO().ALLATORIxDEMO(2, 12)) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 22, null, "\u8f6c\u751f\u5f53\u524d\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 23, null, "\u70b9\u5316\u5f53\u524d\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 24, null, "\u542f\u7075\u5f53\u524d\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 25, null, "\u70b9\u5316\u5f53\u524d\u5750\u9a91", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 18, null, "\u795e\u517d\u5b66\u4e60\u6280\u80fd", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 19, null, "\u98de\u5347\u5f53\u524d\u53c2\u6218\u795e\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 67, null, "\u6211\u6709\u795e\u517d\u788e\u7247,\u6211\u6765\u6362\u795e\u517d", 450);
            } else {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 22, null, "\u8f6c\u751f\u5f53\u524d\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 23, null, "\u70b9\u5316\u5f53\u524d\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 24, null, "\u542f\u7075\u5f53\u524d\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 25, null, "\u70b9\u5316\u5f53\u524d\u5750\u9a91", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 18, null, "\u795e\u517d\u5b66\u4e60\u6280\u80fd", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 19, null, "\u98de\u5347\u5f53\u524d\u53c2\u6218\u795e\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 20, null, "\u6211\u8981\u5408\u6210\u53ec\u5524\u517d", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 21, null, "\u6211\u8981\u5e7b\u5316\u5f53\u524d\u53c2\u6218\u53ec\u5524\u517d", 450);
            }
            if (this.ALLATORIxDEMO().gameMount) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 68, null, "\u6211\u8981\u91cd\u5851\u4e00\u5230\u4e94\u5750\u9a91", 450);
            }
        } else if (npctype == -47) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 27, null, "\u6211\u60f3\u8f6c\u6362\u79cd\u65cf", 450);
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 26, null, "\u6211\u5df2\u505a\u597d\u4e86\u8f6c\u751f\u51c6\u5907", 450);
        } else if (npctype == 155) {
            IiiiiiiiIIIII5 = this.iiIIiiiiIiIIi.baseView.ALLATORIxDEMO();
            IiiiiiiiIIIII4 = null;
            IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < IiiiiiiiIIIII5.size()) {
                IiiiiiiiIIIII2 = (com.xy.i.IIIIIiiiIiIii)IiiiiiiiIIIII5.get(IiiiiiiiIIIII3);
                Object object = IiiiiiiiIIIII = IiiiiiiiIIIII2.ALLATORIxDEMO() > 100 && IiiiiiiiIIIII2.ALLATORIxDEMO() < 200 ? this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2.ALLATORIxDEMO()) : null;
                if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getModelId() == 3) {
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII;
                    break;
                }
                ++IiiiiiiiIIIII3;
            }
            if (IiiiiiiiIIIII4 != null) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 69, IiiiiiiiIIIII4.getId(), "\u6211\u8981\u8fdb\u5165\u6bd4\u6b66\u5927\u4f1a\u573a\u5730", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 70, IiiiiiiiIIIII4.getId(), "\u6211\u8981\u62a5\u540d\u53c2\u52a0\u6bd4\u6b66\u5927\u4f1a", 450);
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 71, IiiiiiiiIIIII4.getId(), "\u6211\u8981\u9886\u53d6\u6bd4\u6b66\u5927\u4f1a\u5956\u52b1", 450);
            }
        }
        if (npcInfoBean != null) {
            TaskData IiiiiiiiIIIII10;
            if (npcInfoBean.getDoors() != null) {
                int IiiiiiiiIIIII11 = 0;
                while (IiiiiiiiIIIII11 < npcInfoBean.getDoors().size()) {
                    IiiiiiiiIIIII4 = (Door)npcInfoBean.getDoors().get(IiiiiiiiIIIII11);
                    if (IiiiiiiiIIIII4 != null && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII4.getDoorkey())) {
                        IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 2, 0, IiiiiiiiIIIII4, IiiiiiiiIIIII4.getDoorkey(), 450);
                    }
                    ++IiiiiiiiIIIII11;
                }
                IiiiiiiiIIIII7 = "\u6211\u54ea\u91cc\u90fd\u4e0d\u53bb";
            }
            if (npctype != 2 && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)npcInfoBean.getNpctable().getNpcway())) {
                IiiiiiiiIIIII5 = npcInfoBean.getNpctable().getNpcway();
                int IiiiiiiiIIIII12 = 0;
                IiiiiiiiIIIII3 = 0;
                while (IiiiiiiiIIIII3 < ((String)IiiiiiiiIIIII5).length()) {
                    IiiiiiiiIIIII3 = ((String)IiiiiiiiIIIII5).indexOf(" ", IiiiiiiiIIIII12 + 1);
                    if (IiiiiiiiIIIII3 == -1) {
                        IiiiiiiiIIIII3 = ((String)IiiiiiiiIIIII5).length();
                    }
                    if ((IiiiiiiiIIIII2 = com.xy.v.IIIIIiiiIiIii.iIiIiiiiIIiii((String)((String)IiiiiiiiIIIII5).substring(IiiiiiiiIIIII12, IiiiiiiiIIIII3))).size() != 0 && (IiiiiiiiIIIII = this.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(Integer.parseInt((String)IiiiiiiiIIIII2.get(0)))) != null) {
                        IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 1, 0, IiiiiiiiIIIII, IiiiiiiiIIIII, 450);
                    }
                    IiiiiiiiIIIII12 = IiiiiiiiIIIII3 + 1;
                }
            }
            TaskData taskData = IiiiiiiiIIIII10 = (IiiiiiiiIIIII5 = this.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(Integer.parseInt(npcInfoBean.getNpctable().getNpcid()))) != null ? IiiiiiiiIIIII5.getTask().getTaskData() : null;
            if (IiiiiiiiIIIII10 != null) {
                IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 58, 0, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684", 450);
                IiiiiiiiIIIII3 = 1;
                while (IiiiiiiiIIIII3 <= IiiiiiiiIIIII10.getNd()) {
                    if (IiiiiiiiIIIII3 == 1) {
                        IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 58, 1, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u56f0\u96be\u96be\u5ea6)", 450);
                    } else if (IiiiiiiiIIIII3 == 2) {
                        IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 58, 2, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u5353\u8d8a\u96be\u5ea6)", 450);
                    } else if (IiiiiiiiIIIII3 == 3) {
                        IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 58, 3, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u5730\u72f1\u96be\u5ea6)", 450);
                    } else if (IiiiiiiiIIIII3 == 4) {
                        IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 58, 4, "\u6211\u662f\u6765\u51fb\u6740\u4f60\u7684(\u5929\u5802\u96be\u5ea6)", 450);
                    }
                    ++IiiiiiiiIIIII3;
                }
            }
        }
        if (IiiiiiiiIIIII7 != null) {
            IiiiiiiiIIIII9 += this.ALLATORIxDEMO(IiiiiiiiIIIII8++, IiiiiiiiIIIII9, 0, 0, null, IiiiiiiiIIIII7, 450);
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII9, 23 + this.ALLATORIxDEMO.getHeight());
        this.iIiIiiiiIIiIi(npcInfoBean != null ? npcInfoBean.getNpctable().getSkin() : null);
    }

    public void ALLATORIxDEMO(Goodstable good) {
        int IiiiiiiiIIIII;
        if (good.getType() != 721L) {
            return;
        }
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 25;
        if (good.getType() == 721L) {
            this.IiiIiiiiiiIiI("\u4f60\u662f\u5426\u5c06\u7b4b\u9aa8\u63d0\u6c14\u4e39\u5151\u6362\u6210\u7075\u5143\u6676\uff1f#R(\u5151\u6362\u6bd4\u4f8b3:2)");
        }
        int IiiiiiiiIIIII2 = 0;
        int n = 0;
        IiiiiiiiIIIII = n + this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 19, 0, good.getRgid(), "\u6211\u8981\u5151\u6362", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 0, null, "\u6211\u4e0d\u613f\u610f", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(IIIIIiiiIiiII monsterUnit) {
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 0;
        this.IiIIIiiiiIiiI = monsterUnit.IiiiiiiiIIIII.getI().longValue();
        this.IiiiiiiiIIIII = monsterUnit;
        MonsterBean IiiiiiiiIIIII = monsterUnit.IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI("\u60f3\u8981\u6211\u8eab\u4e0a\u7684\u5b9d\u7269\u5417? \u60f3\u8981\u5c31\u6765\u62a2\u554a!");
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII.getRobottype();
        if (IiiiiiiiIIIII4 == 2) {
            IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 0, 1, 0, "\u6211\u60f3\u4e70\u70b9\u4e1c\u897f", 450);
        } else if (IiiiiiiiIIIII.getTaskList() == null || (Integer)IiiiiiiiIIIII.getTaskList().get(0) == 0) {
            IiiiiiiiIIIII3 = (IiiiiiiiIIIII4 == 4 || IiiiiiiiIIIII4 == 132) && IiiiiiiiIIIII.getFollow() != null ? (IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 0, 58, 0, "\u6211\u662f\u6765\u52ab\u9053\u7684", 450)) : (IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 0, 58, 0, "\u6ee1\u5730\u5b9d\u7269\u5148\u62a2\u4e00\u4e2a\u5728\u8bf4", 450));
        }
        if (IiiiiiiiIIIII.getTaskList() != null) {
            int IiiiiiiiIIIII5 = 1;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII.getTaskList().size()) {
                String IiiiiiiiIIIII6 = this.ALLATORIxDEMO().getTaskSystem().ALLATORIxDEMO(((Integer)IiiiiiiiIIIII.getTaskList().get(IiiiiiiiIIIII5)).intValue());
                if (IiiiiiiiIIIII6 != null) {
                    IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 1, 0, IiiiiiiiIIIII6, IiiiiiiiIIIII6, 450);
                }
                ++IiiiiiiiIIIII5;
            }
        }
        IiiiiiiiIIIII3 += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII3, 0, 0, null, "\u6211\u4ec0\u4e48\u90fd\u4e0d\u60f3\u505a", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3, 23 + this.ALLATORIxDEMO.getHeight());
        this.iIiIiiiiIIiIi(IiiiiiiiIIIII.getRobotskin());
    }

    /*
     * WARNING - void declaration
     */
    public int ALLATORIxDEMO(int index, int sizeh, int type, int id, Object data, String text, int size) {
        void IiiiiiiiIIIII;
        NpcOption npcOption = this.ALLATORIxDEMO(index);
        IiiiiiiiIIIII.ALLATORIxDEMO(type, id, data, text, size);
        npcOption.setBounds(0, sizeh, 470, IiiiiiiiIIIII.getHeight());
        return IiiiiiiiIIIII.getHeight();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(IIiIiiiiIiIII npcUnit, NpcInfoBean npc, Task task, TaskProgress progress) {
        this.IiiIiiiiiiIiI();
        Question IiiiiiiiIIIII = this.ALLATORIxDEMO().ALLATORIxDEMO(progress.getDId());
        if (IiiiiiiiIIIII == null) {
            this.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u627e\u4e0d\u5230\u5bf9\u5e94\u9898\u5e93");
            return;
        }
        this.iIiiIiiiiiiII = 12;
        this.IiIIIiiiiIiiI = task.getTaskId();
        this.IiiiiiiiIIIII = npcUnit;
        this.IiiIiiiiiiIiI(IiiiiiiiIIIII.getKey());
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.getValues().length) {
            void IiiiiiiiIIIII5;
            NpcOption npcOption = this.ALLATORIxDEMO(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII5.ALLATORIxDEMO(7, IiiiiiiiIIIII4 + 1, (Object)npc.getNpctable().getNpcname(), IiiiiiiiIIIII.getValues()[IiiiiiiiIIIII4], 450);
            npcOption.setBounds(0, IiiiiiiiIIIII3, 470, IiiiiiiiIIIII5.getHeight());
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII3 += IiiiiiiiIIIII5.getHeight();
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII3, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public NpcOption ALLATORIxDEMO(int index) {
        NpcOption IiiiiiiiIIIII = (NpcOption)(index < this.iiIiiiiiiiIii.getComponentCount() ? this.iiIiiiiiiiIii.getComponent(index) : null);
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = new NpcOption((IiiiIiiiiIiIi)this);
            this.iiIiiiiiiiIii.add((Component)IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII.setVisible(true);
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(Goodstable good, int num) {
        GoodExchange[] IiiiiiiiIIIII;
        Goodstable IiiiiiiiIIIII2 = this.iiIIiiiiIiIIi.getObjectArea().ALLATORIxDEMO(good.getGoodsid());
        GoodExchange[] goodExchangeArray = IiiiiiiiIIIII = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getExchanges() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (IiiiiiiiIIIII.length == 1) {
            this.ALLATORIxDEMO(good, 0, num);
            return;
        }
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 20;
        this.IiIIIiiiiIiiI = good.getRgid().longValue();
        this.iiiIiiiiiiiIi = num;
        this.IiiIiiiiiiIiI("\u8bf7\u9009\u62e9\u5bf9\u5e94\u7684\u5151\u6362\u5206\u7c7b\u3002\u5f53\u524d\u5151\u6362\u6570\u91cf:" + num);
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < IiiiiiiiIIIII.length) {
            int n = IiiiiiiiIIIII5;
            String string = IiiiiiiiIIIII[IiiiiiiiIIIII5].getKey();
            ++IiiiiiiiIIIII5;
            IiiiiiiiIIIII4 += this.ALLATORIxDEMO(IiiiiiiiIIIII3++, IiiiiiiiIIIII4, 14, n, null, string, 450);
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII4, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(int num, int total) {
        int IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 26;
        this.IiiIiiiiiiIiI("\u4f60\u6709#G" + num + "#W\u4e2a\u5b88\u62a4\u77f3\u53ef\u4fee\u590d\uff0c\u7d2f\u8ba1\u53d7\u635f\u8010\u4e45\u503c#R" + total + "#W\u3002\u4f18\u5148\u4fee\u590d\u8010\u4e45\u6700\u4f4e\u7684\u5b88\u62a4\u77f3\uff0c\u6bcf\u70b9\u8010\u4e45\u503c\u9700\u8981\u6d88\u8017\u4e00\u70b9\u5b88\u62a4\u4e4b\u5c18");
        int IiiiiiiiIIIII2 = 0;
        int n = 0;
        IiiiiiiiIIIII = n + this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 20, 100, null, "\u4fee\u590d100\u70b9\u8010\u4e45", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 20, 1000, null, "\u4fee\u590d1000\u70b9\u8010\u4e45", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 20, 99999, null, "\u5168\u90e8\u4fee\u590d", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 0, 0, null, "\u6682\u65f6\u4e0d\u4fee\u590d", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void ALLATORIxDEMO(Goodstable good, String value) {
        GoodFight IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        GoodFight goodFight = IiiiiiiiIIIII = good != null ? good.getFight() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        GoodFight IiiiiiiiIIIII2 = null;
        while (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getMap() != 0) {
            if (IiiiiiiiIIIII.getMenu().equals(value)) {
                IiiiiiiiIIIII2 = IiiiiiiiIIIII;
                break;
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getNextFight();
        }
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        this.iIiiIiiiiiiII = 1;
        this.IiIIIiiiiIiiI = good.getRgid().longValue();
        this.IiiIiiiiiiIiI("\u4f60\u771f\u7684\u8981\u53bb" + value + "\u5417\uff1f");
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < 3) {
            NpcOption IiiiiiiiIIIII6 = this.ALLATORIxDEMO(IiiiiiiiIIIII3);
            ++IiiiiiiiIIIII3;
            if (IiiiiiiiIIIII5 == 0) {
                IiiiiiiiIIIII6.ALLATORIxDEMO(4, 1, (Object)IiiiiiiiIIIII2, "\u5feb\u9001\u6211\u53bb", 450);
            } else if (IiiiiiiiIIIII5 == 1) {
                IiiiiiiiIIIII6.ALLATORIxDEMO(4, 2, (Object)IiiiiiiiIIIII2, "\u5220\u9664\u8def\u6807", 450);
            } else {
                IiiiiiiiIIIII6.ALLATORIxDEMO(4, 3, (Object)IiiiiiiiIIIII2, "\u91cd\u65b0\u505a\u8def\u6807", 450);
            }
            IiiiiiiiIIIII6.setBounds(0, IiiiiiiiIIIII4, 470, IiiiiiiiIIIII6.getHeight());
            ++IiiiiiiiIIIII5;
            IiiiiiiiIIIII4 += IiiiiiiiIIIII6.getHeight();
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII4, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public iIIiiiiiIIIIi(GameView gameView) {
        super(27, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(100, 80, 526, 149, IiiiIiiiiIiIi.iIIiIiiiiiiIi);
        this.iiiIiiiiiiIIi("sc/d/26.png");
        this.IIiiIiiiIIiIi = new IIIiiiiiIiIiI();
        this.add((Component)this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = com.xy.v.IIiIiiiiIiIII.ALLATORIxDEMO((String)"", (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (int)495);
        this.add((Component)this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IiiiIiiiiIIII(this);
        this.iiIiiiiiiiIii.addMouseListener((MouseListener)((Object)this));
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)15, (int)10, (int)470, (int)160, (Component)this.iiIiiiiiiiIii, (int)20);
        this.add(this.iIiIiiiiIiIii);
    }

    public void iiiiiiiiIIiii() {
        int IiiiiiiiIIIII;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 22;
        this.IiiIiiiiiiIiI("\u8bf7\u9009\u62e9\u4f60\u8981\u5151\u6362\u7684\u7c7b\u578b");
        int IiiiiiiiIIIII2 = 0;
        int n = 0;
        IiiiiiiiIIIII = n + this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 16, 1, null, "\u6211\u8981\u752890\u4e2a\u795e\u517d\u788e\u7247\u6765\u5151\u6362\u795e\u517d", 450);
        IiiiiiiiIIIII += this.ALLATORIxDEMO(IiiiiiiiIIIII2++, IiiiiiiiIIIII, 16, 2, null, "\u6211\u8981\u7528500\u4e2a\u73cd\u60dc\u795e\u517d\u788e\u7247\u6765\u5151\u6362\u7a00\u6709\u795e\u517d", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void IiiIiiiiiiIiI() {
        this.iIiiIiiiiiiII = 0;
        this.IiiiiiiiIIIII = null;
        this.IiIIIiiiiIiiI = null;
        this.iiiIiiiiiiiIi = null;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiIiiiiiiiIii.getComponentCount()) {
            this.iiIiiiiiiiIii.getComponent(IiiiiiiiIIIII++).setVisible(false);
        }
        this.ALLATORIxDEMO.setTextSize("", 495);
        this.IIiiIiiiIIiIi.iIiIiiiiIIiii();
    }

    public Long ALLATORIxDEMO() {
        return this.iiiIiiiiiiiIi;
    }

    private /* synthetic */ void iIiIiiiiIIiIi() {
    }

    public void iiiIiiiiiiIIi() {
        this.iIiIiiiiIIiIi((String)null);
    }

    public void ALLATORIxDEMO(int id, int[] vs) {
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 27;
        this.IiIIIiiiiIiiI = id;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        this.IiiIiiiiiiIiI("#W\u79ef\u5206\u8d5b\u4e00\u5171\u6709#G" + vs[0] + "#W\u4e2a\u961f\u4f0d,\u5f53\u524d\u6b63\u5728\u5339\u914d\u961f\u4f0d\u6709#G" + vs[1] + "#W\u4e2a\u961f\u4f0d");
        IiiiiiiiIIIII2 = vs[2] == 0 ? (IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 21, 1, null, "\u6211\u8981\u8fdb\u884c\u5339\u914d", 450)) : (IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 21, 2, null, "\u6211\u8981\u53d6\u6d88\u5339\u914d", 450));
        IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 0, null, "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(IIiIiiiiIiIII iIiIiiiiIiIII, NpcInfoBean npcInfoBean, int n) {
        void npcUnit;
        void npcInfoBean2;
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 0;
        this.IiIIIiiiiIiiI = npcInfoBean2 != null ? Long.valueOf(Long.parseLong(npcInfoBean2.getNpctable().getNpcid())) : null;
        this.IiiiiiiiIIIII = npcUnit;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        RoleData IiiiiiiiIIIII3 = this.ALLATORIxDEMO();
        PKSys IiiiiiiiIIIII4 = IiiiiiiiIIIII3.getPkSys();
        if (IiiiiiiiIIIII4.getPk2() == 0) {
            this.IiiIiiiiiiIiI("\u4e00\u4e2a\u826f\u6c11\u778e\u70b9\u5565,\u5728\u95f9\u8bf7\u4f60\u8fdb\u53bb");
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 3, null, "\u6211\u8981\u56de\u957f\u5b89", 450);
        } else if (IiiiiiiiIIIII4.getPk1() != 0) {
            StringBuffer IiiiiiiiIIIII5 = new StringBuffer();
            IiiiiiiiIIIII5.append(IiiiiiiiIIIII3.getLoginResult().getRolename());
            IiiiiiiiIIIII5.append(",\u4f60\u8fd8\u6709");
            IiiiiiiiIIIII5.append(IiiiiiiiIIIII4.getPk1());
            IiiiiiiiIIIII5.append("\u70b9PK\u6807\u5fd7\u672a\u6e05\u9664");
            this.IiiIiiiiiiIiI(IiiiiiiiIIIII5.toString());
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 0, null, "\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a", 450);
        } else if (IiiiiiiiIIIII4.getPk2() == 1) {
            this.IiiIiiiiiiIiI("\u4eca\u5929\u53c8\u6536\u5230\u7ea2\u8272\u70b8\u5f39\u4e86\u3002\u54ce\u65e5\u5b50\u96be\u8fc7\u554a");
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 59, null, "\u8fd9\u662f8888W,\u5c0f\u5c0f\u610f\u601d", 450);
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 60, null, "\u54e6?\u5927\u7237\u662f\u6765\u529e\u7406\u51fa\u72f1\u624b\u7eed", 450);
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 0, null, "\u522b\u6101,\u6211\u53bb\u5e2e\u4f60\u7b79\u70b9\u94b1", 450);
        } else {
            this.IiiIiiiiiiIiI("\u4eca\u5929\u5929\u6c14\u771f\u597d,\u662f\u51fa\u72f1\u7684\u597d\u65e5\u5b50");
            IiiiiiiiIIIII2 += this.ALLATORIxDEMO(IiiiiiiiIIIII++, IiiiiiiiIIIII2, 0, 61, null, "\u6211\u662f\u6765\u529e\u7406\u51fa\u72f1\u624b\u7eed", 450);
        }
        this.iIiIiiiiIIiii(IiiiiiiiIIIII2, 23 + this.ALLATORIxDEMO.getHeight());
        this.iIiIiiiiIIiIi(npcInfoBean2.getNpctable().getSkin());
    }

    public boolean ALLATORIxDEMO() {
        if (this.iIiiIiiiiiiII != 10) return super.ALLATORIxDEMO();
        this.iIiIiiiiIIiIi();
        return false;
    }

    public void ALLATORIxDEMO(RoleSummoning pet, Goodstable good) {
        this.IiiIiiiiiiIiI();
        this.iIiiIiiiiiiII = 24;
        StringBuffer IiiiiiiiIIIII = new StringBuffer("#W\u4f60\u53ec\u5524\u517d\u6253\u70bc\u5996\u540e\u7684\u5c5e\u6027\u5c06\u4e3a(#Y\u9ec4\u8272#W\u4e3a\u539f\u59cb\u5c5e\u6027,#G\u7eff\u8272#W\u4e3a\u5df2\u7ecf\u6709\u7684\u70bc\u5996\u5c5e\u6027,#R\u7ea2\u8272#W\u4e3a\u7269\u54c1\u589e\u52a0\u7684\u5c5e\u6027,#c4ADEDD[]\u5185\u672a\u53ec\u5524\u517d\u6b64\u6297\u6027\u7684\u70bc\u5996\u4e0a\u9650,\u8d85\u8fc7\u6ca1\u6709\u5b9e\u9645\u6548\u679c#W):");
        String IiiiiiiiIIIII2 = "#c4ADEDD[" + (this.ALLATORIxDEMO().getPetMount(pet.getSid()) != null ? 95 : 75) + "]";
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII4 < good.getValue().length()) {
            String IiiiiiiiIIIII6;
            IiiiiiiiIIIII4 = good.getValue().indexOf("|", IiiiiiiiIIIII3 + 1);
            if (IiiiiiiiIIIII4 == -1) {
                IiiiiiiiIIIII4 = good.getValue().length();
            }
            if ((IiiiiiiiIIIII5 = good.getValue().indexOf("=", IiiiiiiiIIIII3 + 1)) == -1 || IiiiiiiiIIIII5 > IiiiiiiiIIIII4) {
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4;
            }
            if (!(IiiiiiiiIIIII6 = good.getValue().substring(IiiiiiiiIIIII3, IiiiiiiiIIIII5)).equals("\u7b49\u7ea7")) {
                IiiiiiiiIIIII.append("#r#W");
                IiiiiiiiIIIII.append(IiiiiiiiIIIII6);
                IiiiiiiiIIIII.append(": ");
                String IiiiiiiiIIIII7 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)pet.getResistance(), (String)(String.valueOf(IiiiiiiiIIIII6) + "="), (String)"|");
                if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII7)) {
                    IiiiiiiiIIIII.append("#Y");
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII7);
                    IiiiiiiiIIIII.append(" #W+ ");
                }
                if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)(IiiiiiiiIIIII7 = IIiiIiiiiIIiI.iIiIiiiiIIiii((String)pet.getLyk(), (String)(String.valueOf(IiiiiiiiIIIII6) + "="), (String)"|")))) {
                    IiiiiiiiIIIII.append("#G");
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII7);
                    IiiiiiiiIIIII.append(" #W+ ");
                }
                IiiiiiiiIIIII.append("#R");
                IiiiiiiiIIIII.append(good.getValue(), IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII4);
                IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
            }
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4 + 1;
        }
        this.IiiIiiiiiiIiI(IiiiiiiiIIIII.toString());
        IiiiiiiiIIIII3 = 0;
        IiiiiiiiIIIII4 = 0;
        IiiiiiiiIIIII4 += this.ALLATORIxDEMO(IiiiiiiiIIIII3++, IiiiiiiiIIIII4, 18, 0, null, "\u597d\u5c31\u8fd9\u6837\u4e86", 450);
        IiiiiiiiIIIII4 += this.ALLATORIxDEMO(IiiiiiiiIIIII3++, IiiiiiiiIIIII4, 0, 0, null, "\u6211\u518d\u51c6\u5907\u4e00\u4e0b", 450);
        this.iIiIiiiiIIiii(IiiiiiiiIIIII4, 23 + this.ALLATORIxDEMO.getHeight());
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiIi(String headSkin) {
        com.xy.w.IiiiiiiiiIIII IiiiiiiiIIIII = !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)headSkin) ? com.xy.w.IIIIIiiiIiiII.iIiIiiiiIIiii((String)headSkin) : null;
        int IiiiiiiiIIIII2 = IiiiiiiiIIIII != null ? 1 + IiiiiiiiIIIII.ALLATORIxDEMO().getHeight(null) : 0;
        int IiiiiiiiIIIII3 = Math.max(150, 200 - Math.max(0, 150 - this.iIiIiiiiIiIii.getY() - this.iIiIiiiiIiIii.getHeight()));
        iIIiiiiiIIIIi iIIiiiiiIIIIi2 = this;
        if (IiiiiiiiIIIII2 > 0) {
            iIIiiiiiIIIIi2.IIiiIiiiIIiIi.ALLATORIxDEMO(IiiiiiiiIIIII.ALLATORIxDEMO());
            this.IIiiIiiiIIiIi.setBounds(2, 1, IiiiiiiiIIIII.ALLATORIxDEMO().getWidth(null), IiiiiiiiIIIII.ALLATORIxDEMO().getHeight(null));
            this.iIiIiiiiIiIii.setBounds(this.iIiIiiiiIiIii.getX(), this.iIiIiiiiIiIii.getY() + IiiiiiiiIIIII2, this.iIiIiiiiIiIii.getWidth(), this.iIiIiiiiIiIii.getHeight());
            this.ALLATORIxDEMO.setBounds(this.ALLATORIxDEMO.getX(), this.ALLATORIxDEMO.getY() + IiiiiiiiIIIII2, this.ALLATORIxDEMO.getWidth(), this.ALLATORIxDEMO.getHeight());
            this.iIiIiiiiIIiii((this.iiIIiiiiIiIIi.screenData.Screen_x - 526) / 2, (this.iiIIiiiiIiIIi.screenData.Screen_y - IiiiiiiiIIIII3) / 2 - IiiiiiiiIIIII2, this.getWidth(), IiiiiiiiIIIII3 + IiiiiiiiIIIII2);
            this.ALLATORIxDEMO(new iiiiiiiiIIIII(0, IiiiiiiiIIIII2, 0, 0));
        } else {
            iIIiiiiiIIIIi2.IIiiIiiiIIiIi.iIiIiiiiIIiii();
            this.iIiIiiiiIIiii((this.iiIIiiiiIiIIi.screenData.Screen_x - 526) / 2, (this.iiIIiiiiIiIIi.screenData.Screen_y - IiiiiiiiIIIII3) / 2, this.getWidth(), IiiiiiiiIIIII3);
            this.ALLATORIxDEMO(null);
        }
        this.iIiIiiiiIiIii.getVerticalScrollBar().setValue(0);
        if (this.iIiiIiiiiiiII == 24) {
            this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii());
            return;
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
