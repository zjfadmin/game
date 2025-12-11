/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.a.iiIiIiiiIIIiI
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.a.w.IIIIIiiiIIIiI
 *  com.xy.a.w.IIIIiiiiIIIIi
 *  com.xy.a.w.IIIiiiiiIiIiI
 *  com.xy.a.w.IIIiiiiiiiiIi
 *  com.xy.a.w.IIiIIiiiIIIiI
 *  com.xy.a.w.IIiIiiiiIiIII
 *  com.xy.a.w.IIiiIiiiiIIiI
 *  com.xy.a.w.IiIIIiiiIIiII
 *  com.xy.a.w.IiIIIiiiiiiIi
 *  com.xy.a.w.IiiIiiiiIIIii
 *  com.xy.a.w.iIIIIiiiIiiIi
 *  com.xy.a.w.TeststateJpanel
 *  com.xy.a.w.iIiIiiiiIiIII
 *  com.xy.a.w.iiIiIiiiIIIiI
 *  com.xy.a.w.iiIiIiiiiIiii
 *  com.xy.a.w.iiiiiiiiiiIiI
 *  com.xy.bean.LoginResult
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseMeridians
 *  com.xy.formula.PetProperty
 *  com.xy.formula.RoleProperty
 *  com.xy.formula.SkillUtil
 *  com.xy.game.ExpIncreaseUntil
 *  com.xy.game.RoleData
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IiiiIiiiiIIII
 */
package com.xy.i;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.a.w.IIIIIiiiIIIiI;
import com.xy.a.w.IIIIiiiiIIIIi;
import com.xy.a.w.IIIiiiiiIiIiI;
import com.xy.a.w.IIIiiiiiiiiIi;
import com.xy.a.w.IIiIIiiiIIIiI;
import com.xy.a.w.IiIIIiiiIIiII;
import com.xy.a.w.IiIIIiiiiiiIi;
import com.xy.a.w.iIIIIiiiIiiIi;
import com.xy.a.w.TeststateJpanel;
import com.xy.a.w.iIiIiiiiIiIII;
import com.xy.a.w.iiIiIiiiIIIiI;
import com.xy.a.w.iiIiIiiiiIiii;
import com.xy.a.w.iiiiiiiiiiIiI;
import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMeridians;
import com.xy.formula.PetProperty;
import com.xy.formula.RoleProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.ExpIncreaseUntil;
import com.xy.game.RoleData;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IiiiIiiiiIIII;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class JpanelOnJalbelBtn
extends IIiiIiiiiIIiI {
    private Object IiiiiiiiIIIII;
    private int ALLATORIxDEMO;

    public void IiiIiiiiiiIiI() {
        LoginResult IiiiiiiiIIIII = this.form.ALLATORIxDEMO().getLoginResult();
        if (IiiiiiiiIIIII.getTurnAround() <= 3) {
            return;
        }
        int IiiiiiiiIIIII2 = IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade());
        if (IiiiiiiiIIIII2 >= 200) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("已达到等级上限");
            return;
        }
        int IiiiiiiiIIIII3 = IiiiIiiiiIIII.iIiIiiiiIIiIi((int)IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 > IiiiiiiiIIIII.getXiuwei()) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("不够修为点升级");
            return;
        }
        ++IiiiiiiiIIIII2;
        this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("升级成功");
        IiiiiiiiIIIII.setXiuwei(Integer.valueOf(IiiiiiiiIIIII.getXiuwei() - IiiiiiiiIIIII3));
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolechange", (String)"4");
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolelevelup", (String)(String.valueOf(IiiiiiiiIIIII.getRolename()) + "|" + IiiiiiiiIIIII.getGrade()));
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        ExpIncreaseUntil.ALLATORIxDEMO((GameView)this.form.iiIIiiiiIiIIi);
        ((com.xy.a.w.IIiiIiiiiIIiI)this.form).iiiIiiiiiiIIi();
    }

    public JpanelOnJalbelBtn(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
        this.form = form;
    }

    public void iiiIiiiiiiIIi(int id) {
        this.ALLATORIxDEMO = id;
    }

    public void ALLATORIxDEMO(Object data) {
        this.IiiiiiiiIIIII = data;
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.ALLATORIxDEMO == 2) {
            if (!this.form.iiIIiiiiIiIIi.getClient().gameBeau) {
                return;
            }
            IiiIiiiiIIIii.ALLATORIxDEMO((int)183, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 3) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"titlelist", null);
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 4) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)132, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 6) {
            RoleData IiiiiiiiIIIII = this.form.ALLATORIxDEMO();
            RoleProperty IiiiiiiiIIIII2 = IiiiiiiiIIIII.getRoleProperty();
            LoginResult IiiiiiiiIIIII3 = IiiiiiiiIIIII.getLoginResult();
            TeststateJpanel IiiiiiiiIIIII4 = (TeststateJpanel)this.form;
            IiiiiiiiIIIII3.setBone(Integer.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO(0) - (int)IiiiiiiiIIIII2.getValue("根骨")));
            IiiiiiiiIIIII3.setSpir(Integer.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO(1) - (int)IiiiiiiiIIIII2.getValue("灵性")));
            IiiiiiiiIIIII3.setPower(Integer.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO(2) - (int)IiiiiiiiIIIII2.getValue("力量")));
            IiiiiiiiIIIII3.setSpeed(Integer.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO(3) - (int)IiiiiiiiIIIII2.getValue("敏捷")));
            if (IiiiiiiiIIIII3.getTurnAround() >= 4) {
                IiiiiiiiIIIII3.setCalm(Integer.valueOf(IiiiiiiiIIIII4.ALLATORIxDEMO(4) - (int)IiiiiiiiIIIII2.getValue("定力")));
            }
            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"rolechange", (String)("D" + IiiiiiiiIIIII3.getBone() + "=" + IiiiiiiiIIIII3.getSpir() + "=" + IiiiiiiiIIIII3.getPower() + "=" + IiiiiiiiIIIII3.getSpeed() + "=" + IiiiiiiiIIIII3.getCalm()));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5);
            IiiiiiiiIIIII.getRoleProperty().IIIiiiiiiIIiI();
            return;
        }
        if (this.ALLATORIxDEMO == 7) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)89, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 8) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)43, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 9) {
            if (this.form.ALLATORIxDEMO().getBattleScene() != null) {
                String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"fig8", null);
                this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            IIIiiiiiiiiIi IiiiiiiiIIIII = (IIIiiiiiiiiIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(8);
            IiiiiiiiIIIII.ALLATORIxDEMO(this.form.ALLATORIxDEMO().getRoleProperty().getQuality(), 0, null);
            return;
        }
        if (this.ALLATORIxDEMO == 10) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)82, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 11) {
            if (this.form.ALLATORIxDEMO().gameMount) {
                IiiIiiiiIIIii.ALLATORIxDEMO((int)172, (GameView)this.form.iiIIiiiiIiIIi);
                return;
            }
            IiiIiiiiIIIii.ALLATORIxDEMO((int)7, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 12) {
            if (this.form.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
                return;
            }
            IiiIiiiiIIIii.ALLATORIxDEMO((int)61, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 54) {
            ((IIIIiiiiIIIIi)this.form).IiiIiiiiiiIiI();
            return;
        }
        if (this.ALLATORIxDEMO == 71) {
            ((iIiIiiiiIiIII)this.form).iiiIiiiiiiIIi(true);
            return;
        }
        if (this.ALLATORIxDEMO == 72) {
            ((iIiIiiiiIiIII)this.form).iiiIiiiiiiIIi(false);
            return;
        }
        if (this.ALLATORIxDEMO == 73) {
            ((iIiIiiiiIiIII)this.form).iIiIiiiiIIiIi();
            return;
        }
        if (this.ALLATORIxDEMO == 74) {
            ((iIiIiiiiIiIII)this.form).iIiIiiiiIIiii(0);
            ((iIiIiiiiIiIII)this.form).iIiIiiiiIIiii(1);
            ((iIiIiiiiIiIII)this.form).iIiIiiiiIIiii(2);
            ((iIiIiiiiIiIII)this.form).iIiIiiiiIIiii(3);
            return;
        }
        if (this.ALLATORIxDEMO == 13) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)81, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 91) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)"X50");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 92 || this.ALLATORIxDEMO == 93 || this.ALLATORIxDEMO == 94) {
            String IiiiiiiiIIIII = Agreement.getSendTextAES((String)"rolechange", (String)("X5" + (this.ALLATORIxDEMO - 91)));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 95 || this.ALLATORIxDEMO == 96) {
            RoleData IiiiiiiiIIIII = this.form.ALLATORIxDEMO();
            BaseMeridians IiiiiiiiIIIII6 = IiiiiiiiIIIII.getRoleProperty().getMeridians(0);
            if (IiiiiiiiIIIII6 == null) {
                return;
            }
            LoginResult IiiiiiiiIIIII7 = IiiiiiiiIIIII.getLoginResult();
            int IiiiiiiiIIIII8 = IiiiiiiiIIIII6 != null && IiiiiiiiIIIII6.getKey() != null ? Integer.parseInt(IiiiiiiiIIIII6.getKey()) - 1 : -1;
            int IiiiiiiiIIIII9 = SkillUtil.getSepciesIndex((BigDecimal)IiiiiiiiIIIII7.getSpecies_id());
            IiiiiiiiIIIII8 = SkillUtil.getFMIndex((int)IiiiiiiiIIIII9, (int)IiiiiiiiIIIII8);
            int IiiiiiiiIIIII10 = (this.ALLATORIxDEMO == 95 ? 12000 : 12500) + IiiiiiiiIIIII8;
            if (this.form.ALLATORIxDEMO().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII10)) == null) {
                return;
            }
            ((IiIIIiiiiiiIi)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(123)).ALLATORIxDEMO(IiiiiiiiIIIII6, this.ALLATORIxDEMO == 95 ? 0 : 1);
            return;
        }
        if (this.ALLATORIxDEMO >= 100 && this.ALLATORIxDEMO <= 109) {
            int IiiiiiiiIIIII = e.isShiftDown() ? 40 : 1;
            this.iIiIiiiiIIiii(IiiiiiiiIIIII * (this.ALLATORIxDEMO % 2 == 0 ? -1 : 1));
            return;
        }
        if (this.ALLATORIxDEMO >= 200 && this.ALLATORIxDEMO <= 209) {
            int IiiiiiiiIIIII = e.isShiftDown() ? 40 : 1;
            this.ALLATORIxDEMO(IiiiiiiiIIIII * (this.ALLATORIxDEMO % 2 == 0 ? -1 : 1));
            return;
        }
        if (this.ALLATORIxDEMO == 302) {
            ((iiIiIiiiiIiii)this.form).IiiIiiiiiiIiI();
            return;
        }
        if (this.ALLATORIxDEMO == 303) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)83, (GameView)this.form.iiIIiiiiIiIIi);
            return;
        }
        if (this.ALLATORIxDEMO == 304) {
            ((iiIiIiiiiIiii)this.form).iIiIiiiiIIiIi();
            return;
        }
        if (this.ALLATORIxDEMO == 305) {
            ((iiIiIiiiiIiii)this.form).iIiIiiiiIIiii(-1);
            return;
        }
        if (this.ALLATORIxDEMO == 306) {
            ((iiIiIiiiiIiii)this.form).iiiiiiiiIIiii();
            return;
        }
        if (this.ALLATORIxDEMO == 307 || this.ALLATORIxDEMO == 308) {
            iiIiIiiiiIiii IiiiiiiiIIIII = (iiIiIiiiiIiii)this.form;
            if (IiiiiiiiIIIII.iIiIiiiiIIiii()) {
                this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("你需要洗点后才能切换天演策");
                return;
            }
            int IiiiiiiiIIIII11 = IiiiiiiiIIIII.iiiIiiiiiiIIi();
            IiiiiiiiIIIII11 = (IiiiiiiiIIIII11 += this.ALLATORIxDEMO == 307 ? 1 : -1) < 0 ? (IiiiiiiiIIIII11 += 3) : (IiiiiiiiIIIII11 %= 3);
            IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII11, null);
            return;
        }
        if (this.ALLATORIxDEMO == 321) {
            this.iiiIiiiiiiIIi();
            return;
        }
        if (this.ALLATORIxDEMO == 322) {
            this.IiiIiiiiiiIiI();
            return;
        }
        if (this.ALLATORIxDEMO == 323) {
            this.iIiIiiiiIIiIi();
            return;
        }
        if (this.ALLATORIxDEMO == 331) {
            ((com.xy.a.w.IIiIiiiiIiIII)this.form).iiiiiiiiIIiii();
            return;
        }
        if (this.ALLATORIxDEMO == 332) {
            ((com.xy.a.w.IIiIiiiiIiIII)this.form).iiiIiiiiiiIIi();
            return;
        }
        if (this.ALLATORIxDEMO == 333 || this.ALLATORIxDEMO == 334) {
            IiIIIiiiiiiIi IiiiiiiiIIIII = (IiIIIiiiiiiIi)this.form;
            String IiiiiiiiIIIII12 = Agreement.getSendTextAES((String)"rolechange", (String)("X" + (IiiiiiiiIIIII.iiiIiiiiiiIIi() == 0 ? "6" : "7") + (this.ALLATORIxDEMO == 334 ? "1" : "")));
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII12);
            return;
        }
        if (this.ALLATORIxDEMO >= 343 && this.ALLATORIxDEMO <= 346) {
            ((com.xy.a.w.IiiIiiiiIIIii)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO == 347 || this.ALLATORIxDEMO == 348) {
            ((com.xy.a.w.IiiIiiiiIIIii)this.form).ALLATORIxDEMO(this.ALLATORIxDEMO == 348, this.IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 349) {
            ((iIIIIiiiIiiIi)this.form).iiiIiiiiiiIIi();
            return;
        }
        if (this.ALLATORIxDEMO == 361) {
            ((IIiIIiiiIIIiI)this.form).IiiIiiiiiiIiI();
            return;
        }
        if (this.ALLATORIxDEMO == 371 || this.ALLATORIxDEMO == 372) {
            ((IIIiiiiiIiIiI)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO == 373) {
            ((com.xy.a.iiIiIiiiIIIiI)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO >= 381 && this.ALLATORIxDEMO <= 385) {
            ((IiIIIiiiIIiII)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO >= 386 && this.ALLATORIxDEMO <= 387) {
            ((IIIIIiiiIIIiI)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        if (this.ALLATORIxDEMO != 390) return;
        ((iiIiIiiiIIIiI)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
    }

    public JpanelOnJalbelBtn(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }

    public void iIiIiiiiIIiii(int value) {
        int IiiiiiiiIIIII = (this.ALLATORIxDEMO - 100) / 2;
        TeststateJpanel IiiiiiiiIIIII2 = (TeststateJpanel)this.form;
        value = this.ALLATORIxDEMO(this.ALLATORIxDEMO(IiiiiiiiIIIII, null), IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII), IiiiiiiiIIIII2.ALLATORIxDEMO(5), value);
        if (value == 0) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiii("已无法改变点数");
            return;
        }
        IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII, value);
    }

    public Object ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
        if (this.ALLATORIxDEMO == 51 || this.ALLATORIxDEMO == 52 || this.ALLATORIxDEMO == 53) {
            if (!isChoice) return;
            ((IIIIiiiiIIIIi)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO - 51);
            return;
        }
        if (this.ALLATORIxDEMO == 61 || this.ALLATORIxDEMO == 62 || this.ALLATORIxDEMO == 63 || this.ALLATORIxDEMO == 64) {
            if (!isChoice) return;
            ((iIiIiiiiIiIII)this.form).iiiIiiiiiiIIi(this.ALLATORIxDEMO - 61);
            return;
        }
        if (this.ALLATORIxDEMO == 81 || this.ALLATORIxDEMO == 82 || this.ALLATORIxDEMO == 83) {
            if (!isChoice) return;
            ((iiiiiiiiiiIiI)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO - 81);
            return;
        }
        if (this.ALLATORIxDEMO == 341 || this.ALLATORIxDEMO == 342) {
            if (!isChoice) return;
            ((com.xy.a.w.IiiIiiiiIIIii)this.form).iiiIiiiiiiIIi(this.ALLATORIxDEMO - 340);
            return;
        }
        if (this.ALLATORIxDEMO >= 351 && this.ALLATORIxDEMO <= 355) {
            if (!isChoice) return;
            ((IIiIIiiiIIIiI)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO - 351);
            return;
        }
        if (this.ALLATORIxDEMO < 391) return;
        if (this.ALLATORIxDEMO > 394) return;
        if (!isChoice) return;
        ((iiIiIiiiIIIiI)this.form).iiiIiiiiiiIIi(this.ALLATORIxDEMO - 391);
    }

    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        if (this.ALLATORIxDEMO < 100 || this.ALLATORIxDEMO > 109) {
            if (this.ALLATORIxDEMO < 200) return;
            if (this.ALLATORIxDEMO > 209) return;
        }
        this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(46);
    }

    public int ALLATORIxDEMO(int d, int z, int f, int point) {
        if (d > z + point) {
            point = d - z;
        }
        if (f - point >= 0) return point;
        point = f;
        return point;
    }

    public int ALLATORIxDEMO(int type, RoleSummoning pet) {
        if (pet != null) {
            int[] IiiiiiiiIIIII = PetProperty.getPetHMASp((RoleSummoning)pet, (RoleData)this.form.ALLATORIxDEMO());
            return IiiiiiiiIIIII[5 + type];
        }
        RoleProperty IiiiiiiiIIIII = this.form.ALLATORIxDEMO().getRoleProperty();
        if (type == 0) {
            return IiiiiiiiIIIII.getBone();
        }
        if (type == 1) {
            return IiiiiiiiIIIII.getSpir();
        }
        if (type == 2) {
            return IiiiiiiiIIIII.getPower();
        }
        if (type != 3) return IiiiiiiiIIIII.getCalm();
        return IiiiiiiiIIIII.getSpeed();
    }

    public void iIiIiiiiIIiIi() {
        RoleData IiiiiiiiIIIII = this.form.ALLATORIxDEMO();
        LoginResult IiiiiiiiIIIII2 = IiiiiiiiIIIII.getLoginResult();
        if (IiiiiiiiIIIII2.getTurnAround() <= 3) {
            return;
        }
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getExtraPointInt("F") + 1;
        if (IiiiiiiiIIIII3 > IiiiiiiiIIIII2.getXiuwei()) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("修为点不够兑换");
            return;
        }
        if (IiiiiiiiIIIII3 >= 41) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("属性点兑换达到上限");
            return;
        }
        this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("兑换了一点属性点");
        IiiiiiiiIIIII2.setXiuwei(Integer.valueOf(IiiiiiiiIIIII2.getXiuwei() - IiiiiiiiIIIII3));
        IiiiiiiiIIIII2.setExtraPoint("F", 1);
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolechange", (String)"5");
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        IiiiiiiiIIIII.getRoleProperty().IIIiiiiiiIIiI();
        ((com.xy.a.w.IIiiIiiiiIIiI)this.form).iiiIiiiiiiIIi();
    }

    public JpanelOnJalbelBtn(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.ALLATORIxDEMO = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        this.setHorizontalAlignment(0);
        this.setText(text);
    }

    public void ALLATORIxDEMO(int value) {
        RoleSummoning IiiiiiiiIIIII = this.form.ALLATORIxDEMO().getChosePet();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        int IiiiiiiiIIIII2 = (this.ALLATORIxDEMO - 200) / 2;
        com.xy.a.a.iiIiIiiiiIiii IiiiiiiiIIIII3 = (com.xy.a.a.iiIiIiiiiIiii)this.form;
        value = this.ALLATORIxDEMO(this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII), IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII2), IiiiiiiiIIIII3.ALLATORIxDEMO(5), value);
        if (value == 0) {
            this.form.ALLATORIxDEMO().iIiIiiiiIIiii("已无法改变点数");
            return;
        }
        IiiiiiiiIIIII3.ALLATORIxDEMO(IiiiiiiiIIIII2, value);
    }

    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        if (this.ALLATORIxDEMO < 100 || this.ALLATORIxDEMO > 109) {
            if (this.ALLATORIxDEMO < 200) return;
            if (this.ALLATORIxDEMO > 209) return;
        }
        ((iiIiiiiiIIiiI)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(46)).IiiIiiiiiiIiI("按Shift键加40点");
    }

    public void iiiIiiiiiiIIi() {
        LoginResult IiiiiiiiIIIII = this.form.ALLATORIxDEMO().getLoginResult();
        if (IiiiiiiiIIIII.getTurnAround() <= 3) {
            return;
        }
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII.getExperience().longValue();
        if (IiiiiiiiIIIII2 < 1000000000L) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("当前经验不足10E");
            return;
        }
        int IiiiiiiiIIIII3 = IiiiIiiiiIIII.iiiIiiiiiiIIi((int)IiiiIiiiiIIII.ALLATORIxDEMO((int)IiiiiiiiIIIII.getGrade()));
        if (IiiiiiiiIIIII.getXiuwei() >= IiiiiiiiIIIII3) {
            this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("修为点以达到上限,无法继续转换");
            return;
        }
        IiiiiiiiIIIII.setExperience(new BigDecimal(IiiiiiiiIIIII2 -= 1000000000L));
        IiiiiiiiIIIII.setXiuwei(Integer.valueOf(IiiiiiiiIIIII.getXiuwei() + 1));
        String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolechange", (String)"3");
        this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
        this.form.iiIIiiiiIiIIi.iiiIiiiiiiIIi("修为值加1");
        ((com.xy.a.w.IIiiIiiiiIIiI)this.form).iiiIiiiiiiIIi();
        this.form.iiIIiiiiIiIIi.baseView.IIiIIiiiIiIIi();
    }

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }
}
