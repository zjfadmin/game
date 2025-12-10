/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.i.IiIiiiiiIIIiI
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.a.iiIIiiiiiIIII
 *  com.xy.a.q.IIIiIiiiIiIii
 *  com.xy.a.q.IiIiiiiiIiIii
 *  com.xy.a.v.IIIIiiiiIIIIi
 *  com.xy.a.v.iIIiIiiiIiiIi
 *  com.xy.i.IIiiIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Activity
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 */
package com.xy.i;

import com.xy.a.i.IiIiiiiiIIIiI;
import com.xy.a.iIiIiiiiiiiIi;
import com.xy.a.iiIIiiiiiIIII;
import com.xy.a.q.IIIiIiiiIiIii;
import com.xy.a.q.IiIiiiiiIiIii;
import com.xy.a.v.IIIIiiiiIIIIi;
import com.xy.a.v.iIIiIiiiIiiIi;
import com.xy.i.IIiiIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Activity;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class IiiIiiiiIIIii
extends IIiiIiiiiIIiI {
    private int ALLATORIxDEMO;

    public void ALLATORIxDEMO(MouseEvent e, boolean isChoice) {
    }

    public static void ALLATORIxDEMO(int id, GameView gameView) {
        IiiIiiiiIIIii.ALLATORIxDEMO(id, gameView, null);
    }

    public static void ALLATORIxDEMO(GameView gameView) {
        BigDecimal IiiiiiiiIIIII = gameView.roleUnit.iIiIiiiiIiIii.getGang_id();
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.longValue() != 0L) {
            String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"intogang", (String)IiiiiiiiIIIII.toString());
            gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
            return;
        }
        gameView.iiiIiiiiiiIIi("\u4f60\u6ca1\u6709\u5e2e\u6d3e!");
    }

    public IiiIiiiiIIIii(String path, int type, int id, IiiiIiiiiIiIi form) {
        super(path, type, form);
        this.ALLATORIxDEMO = id;
    }

    public static void ALLATORIxDEMO(int id, GameView gameView, Object data) {
        IiiiIiiiiIiIi IiiiiiiiIIIII = gameView.getFormManagement().iIiIiiiiIIiii(id);
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.isVisible()) {
            gameView.getFormManagement().iiiIiiiiiiIIi(id);
            return;
        }
        if (id == 22) {
            iIiIiiiiiiiIi IiiiiiiiIIIII2 = (iIiIiiiiiiiIi)gameView.getFormManagement().iiiIiiiiiiIIi(22);
            IiiiiiiiIIIII2.ALLATORIxDEMO(gameView.mapScene.iiIiiiiiiiIii);
            return;
        }
        if (id == 48) {
            IiiIiiiiIIIii.ALLATORIxDEMO(gameView);
            return;
        }
        if (id == 87) {
            IIIiIiiiIiIii IiiiiiiiIIIII3 = (IIIiIiiiIiIii)gameView.getFormManagement().iiiIiiiiiiIIi(id);
            IiiiiiiiIIIII3.iIiIiiiiIIiii(1);
            gameView.getFormManagement().iIiIiiiiIIiIi(id);
            return;
        }
        if (id == 103) {
            IiIiiiiiIiIii IiiiiiiiIIIII4 = (IiIiiiiiIiIii)gameView.getFormManagement().iiiIiiiiiiIIi(id);
            IiiiiiiiIIIII4.iIiIiiiiIIiii(1);
            return;
        }
        if (id == 117) {
            if (gameView.getClient().ALLATORIxDEMO(2, 3) || gameView.getClient().ALLATORIxDEMO(2, 8) || gameView.getClient().ALLATORIxDEMO(2, 12)) {
                iiIIiiiiiIIII IiiiiiiiIIIII5 = (iiIIiiiiiIIII)gameView.getFormManagement().iiiIiiiiiiIIi(id);
                IiiiiiiiIIIII5.iIiIiiiiIIiii(3);
                gameView.getFormManagement().iIiIiiiiIIiIi(id);
                return;
            }
            if (gameView.getClient().gameType != 1 && gameView.getClient().gameType != 2) {
                String IiiiiiiiIIIII6 = Agreement.getSendTextAES((String)"exchange", (String)"X01");
                gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII6);
                return;
            }
            iiIIiiiiiIIII IiiiiiiiIIIII7 = (iiIIiiiiiIIII)gameView.getFormManagement().iiiIiiiiiiIIi(id);
            IiiiiiiiIIIII7.iIiIiiiiIIiii(2);
            gameView.getFormManagement().iIiIiiiiIIiIi(id);
            return;
        }
        if (id == 137) {
            IiIiiiiiIIIiI IiiiiiiiIIIII8 = (IiIiiiiiIIIiI)gameView.getFormManagement().iiiIiiiiiiIIi(id);
            IiiiiiiiIIIII8.iiiIiiiiiiIIi(-1);
            return;
        }
        if (id == 167) {
            IIIIiiiiIIIIi IiiiiiiiIIIII9 = (IIIIiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(id);
            if (data == null) {
                IiiiiiiiIIIII9.iIiIiiiiIIiii(0);
                return;
            }
            if (data instanceof Integer) {
                IiiiiiiiIIIII9.iIiIiiiiIIiii(((Integer)data).intValue());
                return;
            }
            if (!(data instanceof Activity)) return;
            IiiiiiiiIIIII9.ALLATORIxDEMO((Activity)data);
            return;
        }
        if (id == 168) {
            iIIiIiiiIiiIi IiiiiiiiIIIII10 = (iIIiIiiiIiiIi)gameView.getFormManagement().iiiIiiiiiiIIi(id);
            if (!(data instanceof Activity)) return;
            IiiiiiiiIIIII10.ALLATORIxDEMO((Activity)data);
            return;
        }
        gameView.getFormManagement().iIiIiiiiIIiIi(id);
    }

    public void ALLATORIxDEMO(MouseEvent e) {
        IiiIiiiiIIIii.ALLATORIxDEMO(this.ALLATORIxDEMO, this.form.iiIIiiiiIiIIi);
    }

    public IiiIiiiiIIIii(String path, int type, int id, Font font, Color[] colors, String text, IiiiIiiiiIiIi form) {
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

    public IiiIiiiiIIIii(String path, int type, int id, String text, IiiiIiiiiIiIi form) {
        this(path, type, id, null, null, text, form);
    }
}
