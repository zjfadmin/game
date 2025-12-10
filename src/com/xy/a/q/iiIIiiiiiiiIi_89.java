/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIiiiiiiiiIi
 *  com.xy.a.q.iiIiIiiiiIIiI
 *  com.xy.a.q.iiiIiiiiiiiiI
 *  com.xy.bean.LoginResult
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiIIIiiiiiiIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.q.iiIiIiiiiIiIi
 *  com.xy.readbean.Goodstable
 *  com.xy.text.GameView
 */
package com.xy.a.q;

import com.xy.a.q.IIIiiiiiiiiIi;
import com.xy.a.q.iiIiIiiiiIIiI;
import com.xy.a.q.iiiIiiiiiiiiI;
import com.xy.bean.LoginResult;
import com.xy.game.RoleData;
import com.xy.i.IiiiiiiiiIIII;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiIIIiiiiiiIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.q.iiIiIiiiiIiIi;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;

public class iiIIiiiiiiiIi
extends IiiiIiiiiIiIi {
    private BigDecimal[] IiIiiiiiIIIII;
    private iiIiIiiiiIiIi iiIiIiiiiIIIi;
    private IiIIIiiiiiiIi iiiiIiiiIiiII;
    private IiiiiiiiiIIII iiiIiiiiiiiIi;
    private IiiiiiiiiIIII[] iIiiIiiiiiiII;
    private JLabel IIiiIiiiIIiIi;
    private IiiiiiiiiIIII iIiIiiiiIiIii;
    private JLabel IiIIIiiiiIiiI;
    private IiiiiiiiiIIII iiIiiiiiiiIii;
    private IiIIIiiiiiiIi IiiiiiiiIIIII;
    private JLabel ALLATORIxDEMO;

    public void ALLATORIxDEMO(BigDecimal[] goods) {
        this.IiIiiiiiIIIII = goods;
        this.iiiIiiiiiiIIi();
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(112);
    }

    public void iIiIiiiiIIiii(int id) {
        if (id == 31) {
            this.iiiiIiiiIiiII.setVisible(true);
            return;
        }
        if (id == 32) {
            this.IiiiiiiiIIIII.setVisible(true);
            return;
        }
        if (id == 33 || id == 34 || id == 35) {
            int IiiiiiiiIIIII;
            if (this.IiIiiiiiIIIII == null) {
                return;
            }
            RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
            String IiiiiiiiIIIII3 = this.ALLATORIxDEMO.getText();
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII3.equals("\u4e0d\u52a0\u6301") ? 0 : (IiiiiiiiIIIII3.equals("1\u70b9") ? 1 : (IiiiiiiiIIIII3.equals("8\u70b9") ? 8 : 20));
            String IiiiiiiiIIIII5 = this.IiIIIiiiiIiiI.getText();
            int n = IiiiiiiiIIIII5.equals("\u4e94\u8fde\u62bd") ? 5 : (IiiiiiiiIIIII = IiiiiiiiIIIII5.equals("\u4e8c\u5341\u8fde\u62bd") ? 20 : 1);
            if (IiiiiiiiIIIII2.getGoodPackSum(-1L, new BigDecimal(-1), 1 + IiiiiiiiIIIII) <= 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u80cc\u5305\u7a7a\u95f4\u4e0d\u8db3");
                return;
            }
            BigDecimal IiiiiiiiIIIII6 = this.IiIiiiiiIIIII[id - 33];
            Goodstable IiiiiiiiIIIII7 = IiiiiiiiIIIII2.ALLATORIxDEMO(IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII7 == null || IiiiiiiiIIIII > IiiiiiiiIIIII7.getUsetime()) {
                IiiiiiiiIIIII7 = this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII6);
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi(IiiiiiiiIIIII7 != null ? "\u80cc\u5305\u6ca1\u6709" + IiiiiiiiIIIII7.getGoodsname() : "\u7269\u54c1\u4e0d\u8db3");
                return;
            }
            if (IiiiiiiiIIIII4 != 0 && (long)(IiiiiiiiIIIII4 * IiiiiiiiIIIII) > IiiiiiiiIIIII2.getLoginResult().getScoretype("\u7948\u613f\u79ef\u5206").longValue()) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u7948\u613f\u79ef\u5206\u4e0d\u8db3");
                return;
            }
            this.iiIIiiiiIiIIi.gameTXMask.ALLATORIxDEMO("DWQY", 1, "Q" + (id - 32) + "|" + IiiiiiiiIIIII7.getRgid() + "|" + IiiiiiiiIIIII4 + "|" + IiiiiiiiIIIII);
            return;
        }
        if (id != 36) return;
        if (this.iiIIiiiiIiIIi.ALLATORIxDEMO()) {
            return;
        }
        List IiiiiiiiIIIII = (List)this.ALLATORIxDEMO().ALLATORIxDEMO().getNpcShopMap().get("3000");
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IIIiiiiiiiiIi IiiiiiiiIIIII8 = (IIIiiiiiiiiIi)this.ALLATORIxDEMO().iiiIiiiiiiIIi(88);
        IiiiiiiiIIIII8.ALLATORIxDEMO(IiiiiiiiIIIII, "\u7948\u798f\u79ef\u5206");
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(88);
    }

    static /* synthetic */ IiIIIiiiiiiIi iIiIiiiiIIiii(iiIIiiiiiiiIi arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void iiiIiiiiiiIIi() {
        LoginResult IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult();
        this.iiIiIiiiiIIIi.ALLATORIxDEMO(IiiiiiiiIIIII.getScoretype("\u7948\u613f\u79ef\u5206").longValue());
        this.IIiiIiiiIIiIi.setText("\u7948\u798f\u79ef\u5206:" + IiiiiiiiIIIII.getScoretype("\u7948\u798f\u79ef\u5206"));
    }

    static /* synthetic */ JLabel iIiIiiiiIIiii(iiIIiiiiiiiIi arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public iiIIiiiiiiiIi(GameView gameView) {
        super(112, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 696, 446, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.iiiIiiiiiiIIi("sc/b/S256.png");
        this.IiIiiiiiIIIII.setBounds(638, 14, 25, 25);
        String[] IiiiiiiiIIIII = new String[]{"\u4e0d\u52a0\u6301", "1\u70b9", "8\u70b9", "20\u70b9"};
        this.iiiiIiiiIiiII = new IiIIIiiiiiiIi(78, 80, "sc/c/157", IiiiiiiiIIIII);
        this.iiiiIiiiIiiII.setBounds(160, 319, 78, 80);
        this.iiiiIiiiIiiII.setVisible(false);
        this.add((Component)this.iiiiIiiiIiiII);
        this.iiiiIiiiIiiII.ALLATORIxDEMO().addMouseListener((MouseListener)new iiIiIiiiiIIiI(this));
        this.ALLATORIxDEMO = new JLabel("\u4e0d\u52a0\u6301");
        this.ALLATORIxDEMO.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.ALLATORIxDEMO.setBounds(162, 400, 60, 18);
        this.ALLATORIxDEMO.setForeground(Color.WHITE);
        this.add(this.ALLATORIxDEMO);
        this.iiIiiiiiiiIii = new IiiiiiiiiIIII("sc/c/5", 1, 31, (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(225, 400, 18, 18);
        this.add((Component)this.iiIiiiiiiiIii);
        String[] IiiiiiiiIIIII2 = new String[]{"\u5355\u62bd", "\u4e94\u8fde\u62bd", "\u4e8c\u5341\u8fde\u62bd"};
        this.IiiiiiiiIIIII = new IiIIIiiiiiiIi(78, 80, "sc/c/157", IiiiiiiiIIIII2);
        this.IiiiiiiiIIIII.setBounds(342, 319, 78, 80);
        this.IiiiiiiiIIIII.setVisible(false);
        this.add((Component)this.IiiiiiiiIIIII);
        this.IiiiiiiiIIIII.ALLATORIxDEMO().addMouseListener((MouseListener)new iiiIiiiiiiiiI(this));
        this.IiIIIiiiiIiiI = new JLabel("\u5355\u62bd");
        this.IiIIIiiiiIiiI.setFont(iiIIiiiiIiiII.ALLATORIxDEMO);
        this.IiIIIiiiiIiiI.setBounds(344, 400, 80, 18);
        this.IiIIIiiiiIiiI.setForeground(Color.WHITE);
        this.add(this.IiIIIiiiiIiiI);
        this.iIiIiiiiIiIii = new IiiiiiiiiIIII("sc/c/5", 1, 32, (IiiiIiiiiIiIi)this);
        this.iIiIiiiiIiIii.setBounds(407, 400, 17, 17);
        this.add((Component)this.iIiIiiiiIiIii);
        this.iIiiIiiiiiiII = new IiiiiiiiiIIII[3];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII3] = new IiiiiiiiiIIII("sc/b/" + (IiiiiiiiIIIII3 == 0 ? "B350" : (IiiiiiiiIIIII3 == 1 ? "B351" : "B352")) + ".png", 1, 33 + IiiiiiiiIIIII3, (IiiiIiiiiIiIi)this);
            this.iIiiIiiiiiiII[IiiiiiiiIIIII3].setBounds(IiiiiiiiIIIII3 == 0 ? 63 : (IiiiiiiiIIIII3 == 1 ? 252 : 440), -7, 200, 400);
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII3++]);
        }
        this.IIiiIiiiIIiIi = new JLabel("\u7948\u798f\u79ef\u5206:0", 4);
        this.IIiiIiiiIIiIi.setBounds(290, 420, 260, 17);
        this.IIiiIiiiIIiIi.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        this.IIiiIiiiIIiIi.setOpaque(false);
        this.IIiiIiiiIIiIi.setForeground(Color.black);
        this.add(this.IIiiIiiiIIiIi);
        this.iiIiIiiiiIIIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)10, (Color)Color.white, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, null, (GameView)gameView);
        this.iiIiIiiiiIIIi.setBounds(506, 399, 80, 19);
        this.iiIiIiiiiIIIi.setText("0");
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iiiIiiiiiiiIi = new IiiiiiiiiIIII("sc/e/27.png", 1, 36, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, "\u79ef\u5206\u5151\u6362", (IiiiIiiiiIiIi)this);
        this.iiiIiiiiiiiIi.setBounds(573, 420, 51, 17);
        this.iiiIiiiiiiiIi.setOpaque(false);
        this.add((Component)this.iiiIiiiiiiiIi);
    }

    static /* synthetic */ JLabel ALLATORIxDEMO(iiIIiiiiiiiIi arg0) {
        return arg0.IiIIIiiiiIiiI;
    }

    static /* synthetic */ IiIIIiiiiiiIi ALLATORIxDEMO(iiIIiiiiiiiIi arg0) {
        return arg0.iiiiIiiiIiiII;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!this.iiIIiiiiIiIIi.iIiIiiiiIIiii()) return;
        this.iiiIiiiiiiIIi();
    }
}
