/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiIiiiiIIiI
 *  com.xy.a.iiiiiiiiiiiIi
 *  com.xy.battle.BattleControl
 *  com.xy.battle.FightingEvents
 *  com.xy.bean.FightOperation
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiIIIiI
 */
package com.xy.i;

import com.xy.a.iiIiIiiiiIIiI;
import com.xy.a.iiiiiiiiiiiIi;
import com.xy.battle.BattleControl;
import com.xy.battle.FightingEvents;
import com.xy.bean.FightOperation;
import com.xy.d.IiIiIiiiiIIiI;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiIIIiI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

public class IiIIIiiiIIiII
extends IIiiIiiiiIIiI {
    private int ALLATORIxDEMO;

    public int ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public static void ALLATORIxDEMO(int type, BattleControl battleControl) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = battleControl.getHandleUnit();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        if (type == 1) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)34, (GameView)battleControl.gameView);
            return;
        }
        if (type == 2) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)2, (GameView)battleControl.gameView);
            return;
        }
        if (type != 3) return;
        if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() != 0) {
            return;
        }
        IiiIiiiiIIIii.ALLATORIxDEMO((int)6, (GameView)battleControl.gameView);
    }

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public static void IIiiIiiiiIiII(BattleControl battleControl) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = battleControl.getHandleUnit();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() != 0) {
            return;
        }
        battleControl.setMouseIndex(iiIiIiiiIIIiI.IiiiiiiiIIIII, null);
        battleControl.iiiiiiiiIIiii();
    }

    public IiIIIiiiIIiII(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
    }

    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        if (this.ALLATORIxDEMO != 10) return;
        BattleControl IiiiiiiiIIIII = this.form.iiIIiiiiIiIIi.getBattleControl();
        if (IiiiiiiiIIIII.battleScene == null) return;
        if (!IiiiiiiiIIIII.battleScene.battleTip) {
            return;
        }
        if (this.form instanceof iiiiiiiiiiiIi) {
            return;
        }
        ((iiIiIiiiiIIiI)this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(161)).iiiIiiiiiiIIi();
    }

    public static void IIIiiiiiiIIiI(BattleControl battleControl) {
        IiIIIiiiIIiII.ALLATORIxDEMO(3, battleControl);
    }

    public static void IIIIIiiiiIIii(BattleControl battleControl) {
        IiIIIiiiIIiII.ALLATORIxDEMO(1, battleControl);
    }

    public static void iiiiiiiiIIiii(BattleControl battleControl) {
        IiIIIiiiIIiII.ALLATORIxDEMO(2, battleControl);
    }

    public static void IiiIiiiiiiIiI(BattleControl battleControl) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = battleControl.getHandleUnit();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        FightOperation IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO().getType() == 0 ? battleControl.RoleOperation : battleControl.PetOperation;
        IiiiiiiiIIIII2.ALLATORIxDEMO(true, -1, 6, null);
        IiiiiiiiIIIII2.setCamp(-1);
        battleControl.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public IiIIIiiiIIiII(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }

    public IiIIIiiiIIiII(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
        super(path, type, colors, form);
        this.ALLATORIxDEMO = id;
        if (font != null) {
            this.setFont(font);
        } else {
            this.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        }
        if (id != 21 && id != 22) {
            this.setHorizontalAlignment(0);
        }
        this.setText(text);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        if (this.form instanceof iiiiiiiiiiiIi) {
            ((iiiiiiiiiiiIi)this.form).iIiIiiiiIIiii(this.ALLATORIxDEMO);
            return;
        }
        BattleControl IiiiiiiiIIIII = this.form.iiIIiiiiIiIIi.getBattleControl();
        if (IiiiiiiiIIIII.battleScene == null) {
            return;
        }
        if (IiiiiiiiIIIII.battleCamp == -1) {
            if (this.ALLATORIxDEMO != 9) return;
            if (IiiiiiiiIIIII.battleScene.video) {
                IiiiiiiiIIIII.battleScene.iIiIiiiiIIiii(IiiiiiiiIIIII);
                return;
            }
            if (!this.form.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIIiIi()) {
                this.form.iiIIiiiiIiIIi.iIiIiiiiIIiii("\u961f\u5458\u6ca1\u6cd5\u4e3b\u52a8\u79bb\u5f00\u89c2\u6218");
                return;
            }
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"battleconnection", (String)"-1");
            this.form.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        if (this.ALLATORIxDEMO == 1) {
            IiIIIiiiIIiII.IIIIIiiiiIIii(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 2) {
            IiIIIiiiIIiII.iiiiiiiiIIiii(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 3) {
            IiIIIiiiIIiII.iIiIiiiiIIiii(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 4) {
            IiIIIiiiIIiII.ALLATORIxDEMO(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 5) {
            IiIIIiiiIIiII.IIIiiiiiiIIiI(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 6) {
            IiIIIiiiIIiII.iiiIiiiiiiIIi(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 7) {
            IiIIIiiiIIiII.IIiiIiiiiIiII(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO == 8) {
            IiIIIiiiIIiII.IiiIiiiiiiIiI(IiiiiiiiIIIII);
            return;
        }
        if (this.ALLATORIxDEMO != 9) return;
        IiIIIiiiIIiII.iIiIiiiiIIiIi(IiiiiiiiIIIII);
    }

    /*
     * WARNING - void declaration
     */
    public static void iIiIiiiiIIiIi(BattleControl battleControl) {
        void IiiiiiiiIIIII;
        battleControl.automationTime = iIiIIiiiIiiiI.ALLATORIxDEMO();
        iiiiiiiiiiiIi iiiiiiiiiiiIi2 = (iiiiiiiiiiiIi)battleControl.gameView.getFormManagement().iiiIiiiiiiIIi(151);
        IiiiiiiiIIIII.ALLATORIxDEMO(0, battleControl.RoleOperation, battleControl);
        IiiiiiiiIIIII.ALLATORIxDEMO(1, battleControl.PetOperation, battleControl);
        IiiIiiiiIIIii.ALLATORIxDEMO((int)151, (GameView)battleControl.gameView);
    }

    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        if (this.ALLATORIxDEMO != 10) return;
        if (this.form.iiIIiiiiIiIIi.getBattleControl().battleScene == null) {
            return;
        }
        if (this.form instanceof iiiiiiiiiiiIi) {
            return;
        }
        this.form.ALLATORIxDEMO().iiiIiiiiiiIIi(161);
    }

    public static void iiiIiiiiiiIIi(BattleControl battleControl) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = battleControl.getHandleUnit();
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.ALLATORIxDEMO().getType() != 0) {
            return;
        }
        if (battleControl.getPetUnit() == null) {
            return;
        }
        battleControl.ALLATORIxDEMO(IiIIIiiiIIiII.ALLATORIxDEMO("\u53ec\u56de", IiiiiiiiIIIII, battleControl));
        IiiiiiiiIIIII.iIiIiiiiIIiii(true);
        battleControl.IIIIIiiiiIIii();
    }

    public static FightingEvents ALLATORIxDEMO(String type, IiIiIiiiiIIiI handleUnit, BattleControl battleControl) {
        FightingEvents fightingEvents = new FightingEvents();
        fightingEvents.setOriginator(battleControl.ALLATORIxDEMO(type, handleUnit));
        return fightingEvents;
    }

    public static void iIiIiiiiIIiii(BattleControl battleControl) {
        IiIiIiiiiIIiI IiiiiiiiIIIII = battleControl.getHandleUnit();
        if (IiiiiiiiIIIII == null) {
            return;
        }
        FightOperation IiiiiiiiIIIII2 = IiiiiiiiIIIII.ALLATORIxDEMO().getType() == 0 ? battleControl.RoleOperation : battleControl.PetOperation;
        IiiiiiiiIIIII2.ALLATORIxDEMO(true, -1, 5, null);
        IiiiiiiiIIIII2.setCamp(-1);
        battleControl.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(BattleControl battleControl) {
        if (battleControl.getHandleUnit() == null) {
            return;
        }
        battleControl.setMouseIndex(iiIiIiiiIIIiI.IIiiIiiiIIiIi, null);
        battleControl.iiiiiiiiIIiii();
    }
}
