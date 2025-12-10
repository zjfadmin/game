/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IiiIIiiiiIiii
 *  com.xy.a.a.iIiIiiiiiiiIi
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.q.IIiiiiiiIiIii
 *  com.xy.a.q.iIIiiiiiIiIII
 *  com.xy.a.w.IiiIiiiiIIIii
 *  com.xy.bean.ConfirmBean
 *  com.xy.bean.QuoteOutBean
 *  com.xy.bean.SuitOperBean
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.entity.PartJade
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.MsgUntil
 *  com.xy.game.HandleBangBattle
 *  com.xy.game.HandleGood
 *  com.xy.game.HandleOption
 *  com.xy.game.HandlePet
 *  com.xy.game.RoleData
 *  com.xy.game.Task
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.readbean.ActivityFC
 *  com.xy.readbean.ActivityFCEnroll
 *  com.xy.readbean.Door
 *  com.xy.readbean.GoodFight
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.richtext.RichLabel
 *  com.xy.scene.DNTGScene
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIIIIiiiIiIii
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.game;

import com.xy.a.IiiIIiiiiIiii;
import com.xy.a.a.iIiIiiiiiiiIi;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.q.IIiiiiiiIiIii;
import com.xy.a.q.iIIiiiiiIiIII;
import com.xy.a.w.IiiIiiiiIIIii;
import com.xy.bean.ConfirmBean;
import com.xy.bean.QuoteOutBean;
import com.xy.bean.SuitOperBean;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.MsgUntil;
import com.xy.game.HandleBangBattle;
import com.xy.game.HandleGood;
import com.xy.game.HandleOption;
import com.xy.game.HandlePet;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivityFCEnroll;
import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.NpcInfoBean;
import com.xy.richtext.RichLabel;
import com.xy.scene.DNTGScene;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIIIIiiiIiIii;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiiiiiIIiii;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;

public class NpcOption
extends RichLabel
implements MouseListener {
    private int type;
    private Object data;
    private com.xy.q.IiiiIiiiiIiIi form;
    private int id;

    @Override
    public void mouseExited(MouseEvent e) {
        this.sectionList.set(0, Color.green);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiiII monsterUnit) {
        if (monsterUnit.IiiiiiiiIIIII.getTaskList() == null) {
            return;
        }
        IiiiiiiiIIIII = (String)this.data;
        IiiiiiiiIIIII = this.form.ALLATORIxDEMO();
        IiiiiiiiIIIII = this.form.ALLATORIxDEMO().getTaskSystem();
        IiiiiiiiIIIII = monsterUnit.IiiiiiiiIIIII.getTaskList();
        IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
            block9: {
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(((Integer)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).intValue());
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.getTaskList().size()) {
                        IiiiiiiiIIIII = (Task)IiiiiiiiIIIII.getTaskList().get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII.getTaskData().getTaskID() == IiiiiiiiIIIII.getTaskID() && IiiiiiiiIIIII.getTaskState() == 2) {
                            if (IiiiiiiiIIIII != null) {
                                if (IiiiiiiiIIIII.equals("\u6211\u8981\u53d6\u6d88" + IiiiiiiiIIIII.getTaskName())) {
                                    if (iIiIIiiiIiiiI.ALLATORIxDEMO() < this.form.iiIIiiiiIiIIi.timeTask + 60000L) {
                                        this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u9700\u8981\u7b49\u5f851\u5206\u949f\u624d\u80fd\u518d\u4e00\u6b21\u53d6\u6d88\u4efb\u52a1");
                                        return;
                                    }
                                    this.form.iiIIiiiiIiIIi.timeTask = iIiIIiiiIiiiI.ALLATORIxDEMO();
                                    IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("E" + IiiiiiiiIIIII.getTaskId()));
                                    this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                                    return;
                                } else {
                                    ** GOTO lbl25
                                }
                            }
                            break block9;
                        }
lbl25:
                        // 4 sources

                        ++IiiiiiiiIIIII;
                    }
                    if (IiiiiiiiIIIII.getTaskOpen().equals(IiiiiiiiIIIII)) {
                        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("L" + IiiiiiiiIIIII.getTaskID()));
                        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                        return;
                    }
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(this.form.iIiIiiiiIIiii());
        if (e.isMetaDown()) {
            return;
        }
        this.ALLATORIxDEMO();
    }

    private /* synthetic */ void iiiIiiiiiiIIi() {
        iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
        iiiiiiiiiiIiI IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO();
        if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2 instanceof IIIIIiiiIiiII) {
            this.ALLATORIxDEMO((IIIIIiiiIiiII)IiiiiiiiIIIII2);
            return;
        }
        String IiiiiiiiIIIII3 = (String)this.data;
        NpcInfoBean IiiiiiiiIIIII4 = this.form.ALLATORIxDEMO().ALLATORIxDEMO(String.valueOf(IiiiiiiiIIIII.iIiIiiiiIIiii()));
        if (IiiiiiiiIIIII4 == null) return;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII4.getNpctable().getNpcway())) {
            return;
        }
        NpcOption.ALLATORIxDEMO(0, 0, IiiiiiiiIIIII3, IiiiiiiiIIIII4.getNpctable().getNpcway(), this.form.iiIIiiiiIiIIi);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public com.xy.q.IiiiIiiiiIiIi getForm() {
        return this.form;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    public void iIiIiiiiIIiii() {
        if (this.id == 0) {
            return;
        }
        if (this.id == 1) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            HandleOption.ALLATORIxDEMO((int)((Integer)this.data), (iiiiiiiiiiIiI)IiiiiiiiIIIII.ALLATORIxDEMO(), (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 2) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            IiiiiiiiIIIII.iIiIiiiiIIiIi(((Integer)this.data).intValue());
            return;
        }
        if (this.id == 3) {
            HandleOption.ALLATORIxDEMO((int)0, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 4 || this.id == 5) {
            this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u8be5\u529f\u80fd\u53d6\u6d88,\u53ef\u5728\u7ba1\u5bb6\u5904\u76f4\u63a5\u9886\u517b\u5b69\u5b50");
            return;
        }
        if (this.id == 6) {
            HandleOption.IiiIiiiiiiIiI((int)((Integer)this.data), (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 7) {
            HandleOption.IiiIiiiiiiIiI((int)-1, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 8) {
            HandleOption.IiiIiiiiiiIiI((int)-2, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 9) {
            HandleOption.ALLATORIxDEMO((String)((String)this.data), (iIIiiiiiIIIIi)((iIIiiiiiIIIIi)this.form));
            return;
        }
        if (this.id == 10) {
            HandleOption.ALLATORIxDEMO((GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 11) {
            HandleOption.iIiIiiiiIIiii((String)((String)this.data), (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 12) {
            HandleOption.iiiIiiiiiiIIi((int)0, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 14) {
            HandleOption.iiiIiiiiiiIIi((int)1, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 16) return;
        if (this.id == 18) {
            HandleOption.iiiIiiiiiiIIi((String)"\u795e\u517d\u5b66\u4e60\u6280\u80fd", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 19) {
            HandleOption.iiiIiiiiiiIIi((String)"\u98de\u5347\u5f53\u524d\u53c2\u6218\u795e\u517d", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 20) {
            IIiiiiiiIiIii IiiiiiiiIIIII = (IIiiiiiiIiIii)this.form.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(36);
            IiiiiiiiIIIII.iIiIiiiiIIiii(0);
            return;
        }
        if (this.id == 21) {
            IIiiiiiiIiIii IiiiiiiiIIIII = (IIiiiiiiIiIii)this.form.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(36);
            IiiiiiiiIIIII.iIiIiiiiIIiii(1);
            return;
        }
        if (this.id == 22) {
            HandleOption.iiiIiiiiiiIIi((String)"\u8f6c\u751f\u5f53\u524d\u53ec\u5524\u517d", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 23) {
            HandleOption.iiiIiiiiiiIIi((String)"\u70b9\u5316\u5f53\u524d\u53ec\u5524\u517d", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 24) {
            HandleOption.iiiIiiiiiiIIi((String)"\u542f\u7075\u5f53\u524d\u53ec\u5524\u517d", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 25) {
            HandleOption.IiiIiiiiiiIiI((GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 26) {
            HandleOption.ALLATORIxDEMO((String)"\u6211\u5df2\u505a\u597d\u4e86\u8f6c\u751f\u51c6\u5907", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 27) {
            HandleOption.ALLATORIxDEMO((String)"\u6211\u60f3\u8f6c\u6362\u79cd\u65cf", (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 28) {
            HandleBangBattle.ALLATORIxDEMO((String)((String)this.data), (iIIiiiiiIIIIi)((iIIiiiiiIIIIi)this.form));
            return;
        }
        if (this.id == 31) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(25);
            return;
        }
        if (this.id == 32) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"ganglist", null);
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 33) {
            HandleOption.iiiIiiiiiiIIi((GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 34) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(55);
            return;
        }
        if (this.id == 35) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(29);
            return;
        }
        if (this.id == 36) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"pawnpet", (String)"SHOW");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 37) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"exchange", (String)"J0");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 38) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"exchange", (String)"J1");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 39) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"exchange", (String)"J2");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 41) {
            this.form.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(83, null, "\u8f93\u5165\u5bf9\u5e94CDK"));
            return;
        }
        if (this.id == 42) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"obtainarticle", null);
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 44) {
            int IiiiiiiiIIIII = this.form.iiIIiiiiIiIIi.roleData.getLoginResult().getGrade() - 279;
            if (IiiiiiiiIIIII < 50) {
                this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u5f53\u524d\u7684\u7b49\u7ea7\u4e0d\u80fd\u4e0b\u6311\u6218\u4e66\uff01\uff01");
                return;
            }
            IiiIIiiiiIiii IiiiiiiiIIIII2 = (IiiIIiiiiIiii)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(66);
            IiiiiiiiIIIII2.ALLATORIxDEMO(0, null);
            return;
        }
        if (this.id == 45) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(63);
            return;
        }
        if (this.id == 46) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(64);
            return;
        }
        if (this.id == 47) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(65);
            return;
        }
        if (this.id == 49) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(84);
            return;
        }
        if (this.id == 50) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(85);
            return;
        }
        if (this.id == 51) {
            if (this.form.iiIIiiiiIiIIi.scene == null) return;
            if (!(this.form.iiIIiiiiIiIIi.scene instanceof DNTGScene)) return;
            DNTGScene IiiiiiiiIIIII = (DNTGScene)this.form.iiIIiiiiIiIIi.scene;
            IiiiiiiiIIIII.iIiIiiiiIIiii();
            return;
        }
        if (this.id == 53) {
            IiiIiiiiIIIii IiiiiiiiIIIII = (IiiIiiiiIIIii)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(54);
            IiiiiiiiIIIII.iiiIiiiiiiIIi(((Integer)this.data).intValue());
            this.form.ALLATORIxDEMO().iIiIiiiiIIiIi(54);
            return;
        }
        if (this.id == 54) {
            iiIiIiiiiIiii.ALLATORIxDEMO((iiiiiiiiiiIiI)((iIIiiiiiIIIIi)this.form).ALLATORIxDEMO(), (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 55) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"teamArena", (String)"O");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 56) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"hjsl", (String)"S");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 57) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"getfivemsg", (String)"QQ");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 58) {
            HandleOption.ALLATORIxDEMO((int)((Integer)this.data), (iIIiiiiiIIIIi)((iIIiiiiiIIIIi)this.form));
            return;
        }
        if (this.id == 59 || this.id == 61) {
            if (this.id != 61 && !ParamTool.ALLATORIxDEMO((long)88888888L, (GameView)this.form.iiIIiiiiIiIIi)) {
                this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u91d1\u94b1\u4e0d\u8db388888888");
                return;
            }
            RoleData IiiiiiiiIIIII = this.form.ALLATORIxDEMO();
            IiiiiiiiIIIII.getPkSys().setPk2(0);
            IiiiiiiiIIIII.getLoginResult().setTaskDaily(IiiiiiiiIIIII.getPkSys().ALLATORIxDEMO());
            QuoteOutBean IiiiiiiiIIIII2 = new QuoteOutBean();
            IiiiiiiiIIIII2.setData(IiiiiiiiIIIII.getLoginResult().getTaskDaily());
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"quoteout", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII2));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII3);
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u597d\u597d\u505a\u4eba");
            return;
        }
        if (this.id == 60) {
            HandleOption.getfight((int)16, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 62) {
            HandleOption.ALLATORIxDEMO((int)((Integer)this.data), (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 63) {
            HandleOption.iIiIiiiiIIiii((GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 64) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangbattle", (String)((String)this.data));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.id == 65) {
            if (this.form.iiIIiiiiIiIIi.roleData.getLoginResult().getGrade() < 399) {
                this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u5f53\u524d\u7684\u7b49\u7ea7\u4e0d\u80fd\u4e0b\u6218\u4e66\uff01\uff01");
                return;
            }
            IiiIIiiiiIiii IiiiiiiiIIIII = (IiiIIiiiiIiii)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(66);
            IiiiiiiiIIIII.ALLATORIxDEMO(1, null);
            return;
        }
        if (this.id == 66) {
            this.form.iiIIiiiiIiIIi.ALLATORIxDEMO(new ConfirmBean(3, null, "\u4f60\u786e\u5b9a\u9886\u517b\u4e00\u4e2a\u5b69\u5b50"));
            return;
        }
        if (this.id == 67) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            IiiiiiiiIIIII.iiiiiiiiIIiii();
            return;
        }
        if (this.id == 68) {
            HandleOption.iIiIiiiiIIiIi((GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.id == 69) {
            int IiiiiiiiIIIII = (Integer)this.data;
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII) + "|I"));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        if (this.id != 70) {
            if (this.id != 71) return;
            int IiiiiiiiIIIII = (Integer)this.data;
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII) + "|D"));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
            return;
        }
        int IiiiiiiiIIIII = (Integer)this.data;
        Activity IiiiiiiiIIIII6 = this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
        if (IiiiiiiiIIIII6 == null) {
            return;
        }
        int IiiiiiiiIIIII7 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII6.getActivitySet(), (String)"\u62a5\u540d\u8bbe\u7f6e=", (String)"|");
        ActivityFC IiiiiiiiIIIII8 = IiiiiiiiIIIII7 > 0 ? this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7) : null;
        ActivityFCEnroll IiiiiiiiIIIII9 = IiiiiiiiIIIII8 != null && IiiiiiiiIIIII8.getType() == 4 ? (ActivityFCEnroll)IiiiiiiiIIIII8.getData() : null;
        IiiiiiiiIIIII8 = IiiiiiiiIIIII9 != null ? this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII9.getT1()) : null;
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(new ConfirmBean(33, String.valueOf(IiiiiiiiIIIII), IiiiiiiiIIIII8 != null ? IiiiiiiiIIIII8.getValue() : ""));
    }

    public Object getData() {
        return this.data;
    }

    public void ALLATORIxDEMO(int type, int id, Object data, String text, int size) {
        this.type = type;
        this.id = id;
        this.data = data;
        this.setTextSize("#G" + text, 450);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void ALLATORIxDEMO(int taskSetID, int taskID, String msg, String npcway, GameView gameView) {
        IiiiiiiiIIIII = gameView.getObjectArea();
        IiiiiiiiIIIII = gameView.roleData.getTaskSystem();
        IiiiiiiiIIIII = npcway.split(" ");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block11: {
                IiiiiiiiIIIII = IIIIIiiiIiIii.iIiIiiiiIIiii((String)IiiiiiiiIIIII[IiiiiiiiIIIII]);
                IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(Integer.parseInt((String)IiiiiiiiIIIII.get(0)));
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.getTaskList().size()) {
                        IiiiiiiiIIIII /* !! */  = (Task)IiiiiiiiIIIII.getTaskList().get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII /* !! */ .getTaskData().getTaskID() == IiiiiiiiIIIII.getTaskID() && IiiiiiiiIIIII /* !! */ .getTaskState() == 2) {
                            if (msg != null) {
                                if (msg.equals("\u6211\u8981\u53d6\u6d88" + IiiiiiiiIIIII.getTaskName())) {
                                    if (iIiIIiiiIiiiI.ALLATORIxDEMO() < gameView.timeTask + 60000L) {
                                        gameView.iiiIiiiiiiIIi("\u4f60\u9700\u8981\u7b49\u5f851\u5206\u949f\u624d\u80fd\u518d\u4e00\u6b21\u53d6\u6d88\u4efb\u52a1");
                                        return;
                                    }
                                    gameView.timeTask = iIiIIiiiIiiiI.ALLATORIxDEMO();
                                    IiiiiiiiIIIII = Agreement.getSendTextAES((String)"taskN", (String)("E" + IiiiiiiiIIIII /* !! */ .getTaskId()));
                                    gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
                                    return;
                                } else {
                                    ** GOTO lbl23
                                }
                            }
                            break block11;
                        }
lbl23:
                        // 4 sources

                        ++IiiiiiiiIIIII;
                    }
                    if (taskSetID != 0) {
                        if (taskSetID == IiiiiiiiIIIII.getTaskSetID() && (taskID == 0 || taskID == IiiiiiiiIIIII.getTaskID())) {
                            IiiiiiiiIIIII = (String)IiiiiiiiIIIII.get(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII.size()));
                            IiiiiiiiIIIII /* !! */  = Agreement.getSendTextAES((String)"taskN", (String)("L" + IiiiiiiiIIIII));
                            gameView.getClient().ALLATORIxDEMO((String)IiiiiiiiIIIII /* !! */ );
                            return;
                        }
                    } else if (IiiiiiiiIIIII.getTaskOpen().equals(msg)) {
                        IiiiiiiiIIIII = (String)IiiiiiiiIIIII.get(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(IiiiiiiiIIIII.size()));
                        IiiiiiiiIIIII /* !! */  = Agreement.getSendTextAES((String)"taskN", (String)("L" + IiiiiiiiIIIII));
                        gameView.getClient().ALLATORIxDEMO((String)IiiiiiiiIIIII /* !! */ );
                        return;
                    }
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public void ALLATORIxDEMO() {
        if (!this.form.iiIIiiiiIiIIi.roleUnit.iiiIiiiiiiIIi()) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u8fd8\u5728\u6446\u644a");
            return;
        }
        if (this.type == 0) {
            this.iIiIiiiiIIiii();
            return;
        }
        if (this.type == 1) {
            this.iiiIiiiiiiIIi();
            return;
        }
        if (this.type == 2) {
            HandleOption.ALLATORIxDEMO((Door)((Door)this.data), (int)2, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.type == 3) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            Goodstable IiiiiiiiIIIII2 = this.form.ALLATORIxDEMO().getGood(new BigDecimal(IiiiiiiiIIIII.iIiIiiiiIIiii()));
            if (IiiiiiiiIIIII2 == null) {
                return;
            }
            GoodFight IiiiiiiiIIIII3 = (GoodFight)this.data;
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII3.getMenu());
            return;
        }
        if (this.type == 4) {
            if (!HandleGood.ALLATORIxDEMO((RoleData)this.form.ALLATORIxDEMO())) {
                return;
            }
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            Goodstable IiiiiiiiIIIII4 = this.form.ALLATORIxDEMO().getGood(new BigDecimal(IiiiiiiiIIIII.iIiIiiiiIIiii()));
            if (IiiiiiiiIIIII4 == null) {
                return;
            }
            if (this.id == 0) {
                HandleOption.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII4, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            if (this.id == 1) {
                HandleOption.ALLATORIxDEMO((boolean)false, (GoodFight)((GoodFight)this.data), (Goodstable)IiiiiiiiIIIII4, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            if (this.id == 2) {
                HandleOption.ALLATORIxDEMO((GoodFight)((GoodFight)this.data), (Goodstable)IiiiiiiiIIIII4, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            if (this.id != 3) return;
            HandleOption.iIiIiiiiIIiii((GoodFight)((GoodFight)this.data), (Goodstable)IiiiiiiiIIIII4, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.type == 5) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            Goodstable IiiiiiiiIIIII5 = this.form.ALLATORIxDEMO().getGood(new BigDecimal(IiiiiiiiIIIII.iIiIiiiiIIiii()));
            if (IiiiiiiiIIIII5 == null) {
                return;
            }
            HandlePet.getChangeCJS((Goodstable)IiiiiiiiIIIII5, (String)((String)this.data), (RoleData)this.form.ALLATORIxDEMO());
            return;
        }
        if (this.type == 6) return;
        if (this.type == 7) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            Task IiiiiiiiIIIII6 = this.form.ALLATORIxDEMO().getTaskSystem().getTaskId(IiiiiiiiIIIII.iIiIiiiiIIiii().intValue());
            if (IiiiiiiiIIIII6 == null) {
                return;
            }
            String IiiiiiiiIIIII7 = (String)this.data;
            String IiiiiiiiIIIII8 = Agreement.getSendTextAES((String)"taskN", (String)("Q" + IiiiiiiiIIIII6.getTaskId() + "|" + IiiiiiiiIIIII7 + "|" + this.id));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII8);
            return;
        }
        if (this.type == 8) {
            HandleOption.iIiIiiiiIIiIi((int)this.id, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.type == 9) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            String IiiiiiiiIIIII9 = Agreement.getSendTextAES((String)"userpet", (String)(IiiiiiiiIIIII.ALLATORIxDEMO() + "|" + IiiiiiiiIIIII.iIiIiiiiIIiii() + "|" + this.id));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII9);
            return;
        }
        if (this.type == 10) {
            if (this.id == 0) {
                return;
            }
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            RoleSummoning IiiiiiiiIIIII10 = IiiiiiiiIIIII.ALLATORIxDEMO().getPet(new BigDecimal(IiiiiiiiIIIII.iIiIiiiiIIiii()));
            if (IiiiiiiiIIIII10 == null) {
                return;
            }
            String IiiiiiiiIIIII11 = IiiiiiiiIIIII10.getSummoningskin();
            MsgUntil.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII10);
            if (IiiiiiiiIIIII11.equals(IiiiiiiiIIIII10.getSummoningskin())) {
                return;
            }
            ParamTool.ALLATORIxDEMO((RoleSummoning)IiiiiiiiIIIII10, (GameClient)this.form.ALLATORIxDEMO());
            return;
        }
        if (this.type == 11) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"userpet", (String)("N|" + IiiiiiiiIIIII.iIiIiiiiIIiii() + "|" + this.id));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII12);
            return;
        }
        if (this.type == 12) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            RoleData IiiiiiiiIIIII12 = this.form.ALLATORIxDEMO();
            Goodstable IiiiiiiiIIIII13 = IiiiiiiiIIIII12.getGood(new BigDecimal(IiiiiiiiIIIII.iIiIiiiiIIiii()));
            if (IiiiiiiiIIIII13 == null) {
                return;
            }
            SuitOperBean IiiiiiiiIIIII14 = new SuitOperBean();
            ArrayList<BigDecimal> IiiiiiiiIIIII15 = new ArrayList<BigDecimal>();
            IiiiiiiiIIIII15.add(IiiiiiiiIIIII13.getRgid());
            IiiiiiiiIIIII14.setType(59);
            PartJade IiiiiiiiIIIII16 = null;
            IiiiiiiiIIIII14.setGoods(IiiiiiiiIIIII15);
            if (this.id == 0) {
                if (IiiiiiiiIIIII12.getLoginResult().getScoretype("\u661f\u8292").compareTo(new BigDecimal(100)) < 0) {
                    this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u661f\u8292\u4e0d\u8db3");
                    return;
                }
                IiiiiiiiIIIII16 = new PartJade(1L, 0);
            } else {
                if (IiiiiiiiIIIII12.getLoginResult().getGold().compareTo(new BigDecimal(10000000)) < 0) {
                    this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3");
                    return;
                }
                IiiiiiiiIIIII16 = new PartJade(0L, 0);
            }
            IiiiiiiiIIIII14.setJade(IiiiiiiiIIIII16);
            String IiiiiiiiIIIII17 = Agreement.getSendTextAES((String)"suitoperate", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII14));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII17);
            return;
        }
        if (this.type == 13) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)("EFZ" + this.id));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.type == 14 || this.type == 15) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            RoleData IiiiiiiiIIIII18 = this.form.ALLATORIxDEMO();
            Goodstable IiiiiiiiIIIII19 = IiiiiiiiIIIII18.getGood(new BigDecimal(IiiiiiiiIIIII.iIiIiiiiIIiii()));
            int IiiiiiiiIIIII20 = IiiiiiiiIIIII.ALLATORIxDEMO().intValue();
            if (IiiiiiiiIIIII19 == null) return;
            if (IiiiiiiiIIIII20 > IiiiiiiiIIIII19.getUsetime()) {
                return;
            }
            if (this.type == 14) {
                IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII19, this.id, IiiiiiiiIIIII20);
                return;
            }
            if (this.type != 15) return;
            String IiiiiiiiIIIII21 = Agreement.getSendTextAES((String)"user", (String)(String.valueOf(IiiiiiiiIIIII19.getRgid().toString()) + "|" + IiiiiiiiIIIII20 + "|" + this.id));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII21);
            return;
        }
        if (this.type == 16) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
            IiiiiiiiIIIII.iiiIiiiiiiIIi(this.id);
            return;
        }
        if (this.type == 17) {
            HandleOption.iiiIiiiiiiIIi((int)this.id, (iIIiiiiiIIIIi)((iIIiiiiiIIIIi)this.form));
            return;
        }
        if (this.type == 18) {
            iIIiiiiiIiIII IiiiiiiiIIIII = (iIIiiiiiIiIII)this.form.ALLATORIxDEMO().iIiIiiiiIIiii(17);
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.iiiIiiiiiiIIi(true);
            return;
        }
        if (this.type == 19) {
            BigDecimal IiiiiiiiIIIII = (BigDecimal)this.data;
            RoleData IiiiiiiiIIIII22 = this.form.ALLATORIxDEMO();
            Goodstable IiiiiiiiIIIII23 = IiiiiiiiIIIII22.getGood(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII23 == null) {
                return;
            }
            iIiIiiiiiiiIi IiiiiiiiIIIII24 = (iIiIiiiiiiiIi)IiiiiiiiIIIII22.getGameView().getFormManagement().iiiIiiiiiiIIi(162);
            IiiiiiiiIIIII24.ALLATORIxDEMO(IiiiiiiiIIIII23);
            return;
        }
        if (this.type == 20) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"usermount", (String)("SHNJ" + this.id));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.type != 21) return;
        iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.form;
        long IiiiiiiiIIIII25 = IiiiiiiiIIIII.iIiIiiiiIIiii();
        String IiiiiiiiIIIII26 = Agreement.getSendTextAES((String)"activity", (String)(String.valueOf(IiiiiiiiIIIII25) + "|n" + this.id));
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII26);
    }

    public NpcOption(com.xy.q.IiiiIiiiiIiIi form) {
        super("#G", iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.form = form;
        if (!(form instanceof iIIiiiiiIIIIi)) return;
        this.addMouseListener(this);
    }

    public int getId() {
        return this.id;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.sectionList.set(0, Color.red);
    }
}
