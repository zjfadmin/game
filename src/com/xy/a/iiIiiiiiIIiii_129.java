/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiIiiiiIiIIi
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIIiii
 */
package com.xy.a;

import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiIiiiiIiIIi;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIIiii;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;

public class iiIiiiiiIIiii
extends IiiiIiiiiIiIi {
    private JLabel iiIIIiiiiiiiI;
    private RichLabel IiIiiiiiIIIII;
    private RichLabel iiIiIiiiiIIIi;
    private RichLabel iiiiIiiiIiiII;
    private IiiIiiiiIiIIi iiiIiiiiiiiIi;
    private RichLabel iIiiIiiiiiiII;
    private JLabel[] IIiiIiiiIIiIi;
    private JLabel iIiIiiiiIiIii;
    private RichLabel IiIIIiiiiIiiI;
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private int IiiiiiiiIIIII;
    private IiiIiiiiIiIIi ALLATORIxDEMO;

    public void iiiIiiiiiiIIi() {
        String IiiiiiiiIIIII = this.ALLATORIxDEMO().getLoginResult().getPassword();
        if (this.IiiiiiiiIIIII == 0 && IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            String IiiiiiiiIIIII2 = this.ALLATORIxDEMO.getText().trim();
            String IiiiiiiiIIIII3 = this.iiiIiiiiiiiIi.getText().trim();
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2)) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u5bc6\u7801");
                return;
            }
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (String)IiiiiiiiIIIII3)) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("2\u6b21\u5bc6\u7801\u8f93\u5165\u4e0d\u4e00\u81f4");
                return;
            }
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII3)) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u5bc6\u7801\u6700\u5c116\u4f4d\u5b57\u7b26\u4e14\u5305\u542b\u6570\u5b57\u548c\u5b57\u6bcd");
                return;
            }
            this.ALLATORIxDEMO().getLoginResult().setPassword(IiiiiiiiIIIII2);
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"rolechange", (String)("1" + IiiiiiiiIIIII2));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII4);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u5bc6\u7801\u8bbe\u7f6e\u6210\u529f!!!");
            return;
        }
        if (this.IiiiiiiiIIIII == 1 && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            String IiiiiiiiIIIII5 = this.ALLATORIxDEMO.getText().trim();
            String IiiiiiiiIIIII6 = this.iiiIiiiiiiiIi.getText().trim();
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII5, (String)IiiiiiiiIIIII)) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u539f\u5bc6\u7801\u4e0d\u6b63\u786e");
                return;
            }
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII6)) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u8bf7\u8f93\u5165\u65b0\u5bc6\u7801");
                return;
            }
            if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII6)) {
                this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u5bc6\u7801\u6700\u5c116\u4f4d\u5b57\u7b26\u4e14\u5305\u542b\u6570\u5b57\u548c\u5b57\u6bcd");
                return;
            }
            this.ALLATORIxDEMO().getLoginResult().setPassword(IiiiiiiiIIIII6);
            String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"rolechange", (String)("1" + IiiiiiiiIIIII6));
            this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII7);
            this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
            this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u5bc6\u7801\u8bbe\u7f6e\u6210\u529f!!!");
            return;
        }
        if (this.IiiiiiiiIIIII != 2) return;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) return;
        String IiiiiiiiIIIII8 = this.ALLATORIxDEMO.getText().trim();
        if (!IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII8, (String)IiiiiiiiIIIII)) {
            this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u5bc6\u7801\u4e0d\u6b63\u786e");
            return;
        }
        this.ALLATORIxDEMO().setLockPack();
        this.ALLATORIxDEMO().iiiIiiiiiiIIi(this.iIiIiiiiIIiii());
        this.ALLATORIxDEMO().iiiIiiiiiiIIi("\u80cc\u5305\u89e3\u9501\u6210\u529f");
    }

    public void iiiIiiiiiiIIi(int y) {
        this.IIiiIiiiIIiIi[1].setBounds(64, 99 + y, 200, 18);
        this.iiIiIiiiiIIIi.setBounds(63, 122 + y, this.iiIiIiiiiIIIi.getWidth(), this.iiIiIiiiiIIIi.getHeight());
        this.iiiiIiiiIiiII.setBounds(63, 140 + y, this.iiiiIiiiIiiII.getWidth(), this.iiiiIiiiIiiII.getHeight());
        this.IiIIIiiiiIiiI.setBounds(63, 165 + y, this.IiIIIiiiiIiiI.getWidth(), this.IiIIIiiiiIiiI.getHeight());
        this.iIiiIiiiiiiII.setBounds(63, 183 + y, this.iIiiIiiiiiiII.getWidth(), this.iIiiIiiiiiiII.getHeight());
        this.IiIiiiiiIIIII.setBounds(63, 200 + y, this.IiIiiiiiIIIII.getWidth(), this.IiIiiiiiIIIII.getHeight());
        this.iiIiiiiiiiIii.setBounds(143, 238 + y, 99, 25);
    }

    public iiIiiiiiIIiii(GameView gameView) {
        super(32, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 363, 318, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u8bbe\u7f6e\u5bc6\u7801");
        this.IIiiIiiiIIiIi = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IIiiIiiiIIiIi.length) {
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)64, (int)(34 + 65 * IiiiiiiiIIIII), (int)300, (int)18, (Color)Color.black, (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
            this.IIiiIiiiIIiIi[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u8bf7\u8bbe\u7f6e\u60a8\u7684\u52a0\u9501\u5bc6\u7801" : (IiiiiiiiIIIII == 1 ? "\u6e29\u99a8\u63d0\u793a\uff1a" : ""));
            this.add(this.IIiiIiiiIIiIi[IiiiiiiiIIIII++]);
        }
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)66, (int)66, (int)60, (int)14, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.iiIIIiiiiiiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)66, (int)89, (int)60, (int)14, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#c000000"), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI);
        this.add(this.iIiIiiiiIiIii);
        this.add(this.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)3, (int)3, (int)3, (int)3, (boolean)false), (Font)iiIIiiiiIiiII.iIiIIiiiiIIiI, (Color)Color.white);
        this.ALLATORIxDEMO.setBounds(128, 64, 195, 19);
        this.iiiIiiiiiiiIi.setBounds(128, 87, 195, 19);
        this.add((Component)this.ALLATORIxDEMO);
        this.add((Component)this.iiiIiiiiiiiIi);
        this.iiIiIiiiiIIIi = new RichLabel("#c0000001\u3001\u52a0\u9501\u540e\u7684\u7269\u54c1\u5c06#cFF0000\u4e0d\u80fd\u6267\u884c\u4ee5\u4e0b\u64cd\u4f5c\uff1a\u5408", iiIIiiiiIiiII.iIiIIiiiiIIiI, 260);
        this.add((Component)this.iiIiIiiiiIIIi);
        this.iiiiIiiiIiiII = new RichLabel("#cFF0000\u6210\u3001\u6253\u9020\u3001\u5bc4\u552e\u3001\u51fa\u552e\u3001\u4ea4\u6613\u3001\u7ed9\u4e88\u3002", iiIIiiiiIiiII.iIiIIiiiiIIiI, 260);
        this.add((Component)this.iiiiIiiiIiiII);
        this.IiIIIiiiiIiiI = new RichLabel("#c0000002\u3001\u8bf7\u7ed9\u60a8\u7684\u8d35\u91cd\u7269\u54c1\u52a0\u4e0a\u7269\u54c1\u9501\uff0c\u5e76\u7262", iiIIiiiiIiiII.iIiIIiiiiIIiI, 260);
        this.add((Component)this.IiIIIiiiiIiiI);
        this.iIiiIiiiiiiII = new RichLabel("#c000000\u8bb0\u60a8\u7684\u5bc6\u7801\uff0c\u8bf7\u52ff\u544a\u8bc9\u4ed6\u4eba\u60a8\u7684\u7269\u54c1\u9501\u5bc6", iiIIiiiiIiiII.iIiIIiiiiIIiI, 260);
        this.add((Component)this.iIiiIiiiiiiII);
        this.IiIiiiiiIIIII = new RichLabel("#c000000\u7801\u3002", iiIIiiiiIiiII.iIiIIiiiiIIiI, 260);
        this.add((Component)this.IiIiiiiiIIIII);
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI("sc/e/26.png", 1, 112, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, "\u8bbe\u7f6e\u5bc6\u7801", (IiiiIiiiiIiIi)this);
        this.add((Component)this.iiIiiiiiiiIii);
    }

    public void iIiIiiiiIIiii(int type) {
        this.IiiiiiiiIIIII = type;
        this.ALLATORIxDEMO.setText(null);
        this.iiiIiiiiiiiIi.setText(null);
        if (type == 0) {
            this.ALLATORIxDEMO("\u8bbe\u7f6e\u5bc6\u7801");
            this.iiiIiiiiiiIIi(23);
            this.IIiiIiiiIIiIi[0].setText("\u8bf7\u8bbe\u7f6e\u60a8\u7684\u52a0\u9501\u5bc6\u7801");
            this.iIiIiiiiIiIii.setText("\u8f93\u5165\u5bc6\u7801");
            this.iiIIIiiiiiiiI.setText("\u786e\u8ba4\u5bc6\u7801");
            this.iIiIiiiiIiIii.setVisible(true);
            this.iiIIIiiiiiiiI.setVisible(true);
            this.ALLATORIxDEMO.setVisible(true);
            this.iiiIiiiiiiiIi.setVisible(true);
            this.iiIiiiiiiiIii.setText("\u8bbe\u7f6e\u5bc6\u7801");
        } else if (type == 1) {
            this.ALLATORIxDEMO("\u4fee\u6539\u5bc6\u7801");
            this.iiiIiiiiiiIIi(23);
            this.IIiiIiiiIIiIi[0].setText("\u6b63\u5728\u4fee\u6539\u4f60\u7684\u7269\u54c1\u9501\u5bc6\u7801");
            this.iIiIiiiiIiIii.setText("\u539f \u5bc6 \u7801");
            this.iiIIIiiiiiiiI.setText("\u65b0 \u5bc6 \u7801");
            this.iIiIiiiiIiIii.setVisible(true);
            this.iiIIIiiiiiiiI.setVisible(true);
            this.ALLATORIxDEMO.setVisible(true);
            this.iiiIiiiiiiiIi.setVisible(true);
            this.iiIiiiiiiiIii.setText("\u4fee\u6539\u5bc6\u7801");
        } else if (type == 2) {
            this.ALLATORIxDEMO("\u89e3\u9501\u5bc6\u7801");
            this.iiiIiiiiiiIIi(0);
            this.IIiiIiiiIIiIi[0].setText("\u8bf7\u8f93\u5165\u4f60\u7684\u7269\u54c1\u9501\u5bc6\u7801");
            this.iIiIiiiiIiIii.setText("\u5bc6 \u7801");
            this.iIiIiiiiIiIii.setVisible(true);
            this.iiIIIiiiiiiiI.setVisible(false);
            this.ALLATORIxDEMO.setVisible(true);
            this.iiiIiiiiiiiIi.setVisible(false);
            this.iiIiiiiiiiIii.setText("\u89e3\u3000\u9501");
        }
        this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
    }
}
