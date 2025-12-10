/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIiiiiiiIIIii
 *  com.xy.a.q.IiiiIiiiiIiII
 *  com.xy.game.RoleData
 *  com.xy.i.IiiiiiiiiIIII
 *  com.xy.q.IIIiiiiiIiIiI
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiII
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.aCard
 *  com.xy.richtext.RichLabel
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiiiiiiiIIIII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IIiIiiiiIiiIi
 */
package com.xy.a.q;

import com.xy.a.q.IIiiiiiiIIIii;
import com.xy.a.q.IiiiIiiiiIiII;
import com.xy.game.RoleData;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.aCard;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiiiiiiiIIIII;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellRenderer;

public class IIIiIiiiiIIii
extends IiiiIiiiiIiIi {
    private aCard IIIIiiiiiiiII;
    private RichLabel iiIIIiiiiiiiI;
    private com.xy.i.IiiiiiiiiIIII[] IiIiiiiiIIIII;
    private Vector<Vector<Object>> iiIiIiiiiIIIi;
    private JLabel[] iiiiIiiiIiiII;
    private com.xy.i.IiiiiiiiiIIII[] iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    private int IIiiIiiiIIiIi = 0;
    private JScrollPane iIiIiiiiIiIii;
    private com.xy.q.IIIiiiiiIiIiI[] IiIIIiiiiIiiI;
    private com.xy.q.IiiiIiiiiIiII iiIiiiiiiiIii;
    private JScrollPane IiiiiiiiIIIII;
    private JTable ALLATORIxDEMO;

    public Color ALLATORIxDEMO(String cardGn) {
        if (cardGn.equals("\u5f3a\u6cd5")) {
            return Color.red;
        }
        if (!cardGn.equals("\u6297\u6027")) return Color.green;
        return iiIIiiiiIiiII.IIiIIiiiiiIII;
    }

    public void iIiIiiiiIIiii(int caozuo) {
        this.IIiiIiiiIIiIi = caozuo;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setKeep(IiiiiiiiIIIII == caozuo);
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO(this.ALLATORIxDEMO().ALLATORIxDEMO().getaMap(), null);
    }

    public void iIiIiiiiIIiIi(boolean showCard) {
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        aCard IiiiiiiiIIIII2 = null;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3].ALLATORIxDEMO(0, null);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII3++].setVisible(true);
        }
        String string = IiiiiiiiIIIII = this.ALLATORIxDEMO().gameMount ? IiiiiiiiIIIII.getPackRecord().getOtherValue("BS") : IiiiiiiiIIIII.getPackRecord().getlCard();
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
            IiiiiiiiiIIII IiiiiiiiIIIII4 = this.ALLATORIxDEMO();
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII.split(this.ALLATORIxDEMO().gameMount ? "#" : "\\|");
            int IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 < IiiiiiiiIIIII5.length && IiiiiiiiIIIII6 < this.IiIIIiiiiIiiI.length) {
                aCard IiiiiiiiIIIII7 = (aCard)IiiiiiiiIIIII4.ALLATORIxDEMO().getaMap().get(Integer.decode(IiiiiiiiIIIII5[IiiiiiiiIIIII6]));
                if (IiiiiiiiIIIII7 != null) {
                    this.IiIIIiiiiIiiI[IiiiiiiiIIIII6].ALLATORIxDEMO(11, (Object)IiiiiiiiIIIII7);
                    if (IiiiiiiiIIIII2 == null) {
                        IiiiiiiiIIIII2 = IiiiiiiiIIIII7;
                    }
                }
                ++IiiiiiiiIIIII6;
            }
        }
        if (!showCard) return;
        this.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    static /* synthetic */ Vector ALLATORIxDEMO(IIIiIiiiiIIii arg0) {
        return arg0.iiIiIiiiiIIIi;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(aCard card) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        this.IIIIiiiiiiiII = card;
        if (this.IIIIiiiiiiiII == null) {
            this.iIiiIiiiiiiII[5].iIiIiiiiIIiii("sc/d/62.png");
            this.iiIIIiiiiiiiI.setTextSize("", 130);
            return;
        }
        this.iIiiIiiiiiiII[5].iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)this.IIIIiiiiiiiII.getSkin()));
        String IiiiiiiiIIIII3 = null;
        String IiiiiiiiIIIII4 = null;
        String IiiiiiiiIIIII5 = null;
        String IiiiiiiiIIIII6 = null;
        String IiiiiiiiIIIII7 = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("#cffffff\u540d\u79f0:" + this.IIIIiiiiiiiII.getName() + "#r");
        stringBuffer.append("#cff0000\u6d88\u8017:" + this.IIIIiiiiiiiII.getMoney() + (this.IIIIiiiiiiiII.getType() == 0 ? "\u5927\u8bdd\u5e01" : "\u4ed9\u7389") + "#r");
        String IiiiiiiiIIIII8 = this.IIIIiiiiiiiII.getValue();
        if (IiiiiiiiIIIII8 != null && !"".equals(IiiiiiiiIIIII8)) {
            String[] IiiiiiiiIIIII9 = this.IIIIiiiiiiiII.getValue().split("\\|");
            IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < IiiiiiiiIIIII9.length) {
                int IiiiiiiiIIIII10 = IiiiiiiiIIIII9[IiiiiiiiIIIII2].indexOf("=");
                if (IiiiiiiiIIIII10 != -1) {
                    String IiiiiiiiIIIII11 = IiiiiiiiIIIII9[IiiiiiiiIIIII2].substring(0, IiiiiiiiIIIII10);
                    String IiiiiiiiIIIII12 = IiiiiiiiIIIII9[IiiiiiiiIIIII2].substring(IiiiiiiiIIIII10 + 1);
                    if (IiiiiiiiIIIII11.equals("\u4eb2\u548c\u529b") || IiiiiiiiIIIII11.equals("\u79cd\u65cf") || IiiiiiiiIIIII11.equals("\u7b49\u7ea7")) {
                        IiiiiiiiIIIII.append("#W\u3010" + IiiiiiiiIIIII11 + "\u3011" + IiiiiiiiIIIII12 + "#r");
                    } else if (IiiiiiiiIIIII11.equals("\u52a0\u5f3a\u6c14\u8840") || IiiiiiiiIIIII11.equals("\u52a0\u5f3a\u9b54\u6cd5") || IiiiiiiiIIIII11.equals("\u52a0\u5f3a\u653b\u51fb") || IiiiiiiiIIIII11.equals("\u52a0\u5f3a\u901f\u5ea6")) {
                        IiiiiiiiIIIII.append("#Y" + IiiiiiiiIIIII11 + ":" + IiiiiiiiIIIII12 + "#r");
                    } else if (IiiiiiiiIIIII11.equals("\u91d1")) {
                        IiiiiiiiIIIII3 = "\u91d1: " + IiiiiiiiIIIII12 + " ";
                    } else if (IiiiiiiiIIIII11.equals("\u6728")) {
                        IiiiiiiiIIIII4 = "\u6728: " + IiiiiiiiIIIII12 + " ";
                    } else if (IiiiiiiiIIIII11.equals("\u6c34")) {
                        IiiiiiiiIIIII5 = "\u6c34: " + IiiiiiiiIIIII12 + " ";
                    } else if (IiiiiiiiIIIII11.equals("\u706b")) {
                        IiiiiiiiIIIII6 = "\u706b: " + IiiiiiiiIIIII12 + " ";
                    } else if (IiiiiiiiIIIII11.equals("\u571f")) {
                        IiiiiiiiIIIII7 = "\u571f: " + IiiiiiiiIIIII12 + " ";
                    } else {
                        IiiiiiiiIIIII.append("#G" + IiiiiiiiIIIII11 + ":" + IiiiiiiiIIIII12 + "#r");
                    }
                }
                ++IiiiiiiiIIIII2;
            }
        }
        IiiiiiiiIIIII.append("#c57FAFF\u6301\u7eed\u65f6\u95f4:" + this.IIIIiiiiiiiII.getTime() + "\u5206");
        boolean IiiiiiiiIIIII13 = true;
        IiiiiiiiIIIII2 = 0;
        if (IiiiiiiiIIIII3 != null) {
            if (IiiiiiiiIIIII13) {
                IiiiiiiiIIIII.append("#r\u3000#r#Y");
                IiiiiiiiIIIII13 = false;
            }
            if (++IiiiiiiiIIIII2 == 3 || IiiiiiiiIIIII2 == 5) {
                IiiiiiiiIIIII.append("#r");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 != null) {
            if (IiiiiiiiIIIII13) {
                IiiiiiiiIIIII.append("#r\u3000#r#Y");
                IiiiiiiiIIIII13 = false;
            }
            if (++IiiiiiiiIIIII2 == 3 || IiiiiiiiIIIII2 == 5) {
                IiiiiiiiIIIII.append("#r");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII4);
        }
        if (IiiiiiiiIIIII5 != null) {
            if (IiiiiiiiIIIII13) {
                IiiiiiiiIIIII.append("#r\u3000#r#Y");
                IiiiiiiiIIIII13 = false;
            }
            if (++IiiiiiiiIIIII2 == 3 || IiiiiiiiIIIII2 == 5) {
                IiiiiiiiIIIII.append("#r");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII6 != null) {
            if (IiiiiiiiIIIII13) {
                IiiiiiiiIIIII.append("#r\u3000#r#Y");
                IiiiiiiiIIIII13 = false;
            }
            if (++IiiiiiiiIIIII2 == 3 || IiiiiiiiIIIII2 == 5) {
                IiiiiiiiIIIII.append("#r");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII6);
        }
        if (IiiiiiiiIIIII7 != null) {
            if (IiiiiiiiIIIII13) {
                IiiiiiiiIIIII.append("#r\u3000#r#Y");
                IiiiiiiiIIIII13 = false;
            }
            if (++IiiiiiiiIIIII2 == 3 || IiiiiiiiIIIII2 == 5) {
                IiiiiiiiIIIII.append("#r");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII7);
        }
        this.iiIIIiiiiiiiI.setTextSize(IiiiiiiiIIIII.toString(), 130);
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Map<Integer, aCard> aCardMap, String selectName) {
        aCard IiiiiiiiIIIII;
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)selectName)) {
            selectName = null;
        }
        this.iiIiIiiiiIIIi.clear();
        ArrayList<Integer> IiiiiiiiIIIII2 = new ArrayList<Integer>();
        for (Integer IiiiiiiiIIIII3 : aCardMap.keySet()) {
            IiiiiiiiIIIII = aCardMap.get(IiiiiiiiIIIII3);
            if (IiiiiiiiIIIII == null || IiiiiiiiIIIII.getType() != this.IIiiIiiiIIiIi || selectName != null && IiiiiiiiIIIII.getName().indexOf(selectName) == -1) continue;
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII3);
        }
        Collections.sort(IiiiiiiiIIIII2);
        for (Integer IiiiiiiiIIIII3 : IiiiiiiiIIIII2) {
            void IiiiiiiiIIIII4;
            IiiiiiiiIIIII = aCardMap.get(IiiiiiiiIIIII3);
            Vector<String> vector = new Vector<String>();
            vector.add(IiiiiiiiIIIII.getGn());
            vector.add(IiiiiiiiIIIII.getName());
            IiiiiiiiIIIII4.add(String.valueOf(IiiiiiiiIIIII.getTime()) + "\u5206");
            vector.add(String.valueOf(IiiiiiiiIIIII.getMoney()) + (IiiiiiiiIIIII.getType() == 0 ? "\u5927\u8bdd\u5e01" : "\u4ed9\u7389"));
            IiiiiiiiIIIII4.add(IiiiiiiiIIIII3);
            this.iiIiIiiiiIIIi.addElement((Vector<Object>)IiiiiiiiIIIII4);
        }
        this.ALLATORIxDEMO.clearSelection();
        this.IiiiiiiiIIIII.getVerticalScrollBar().setValue(0);
        this.IiiiiiiiIIIII.updateUI();
    }

    public void iiiIiiiiiiIIi() {
        this.ALLATORIxDEMO(this.ALLATORIxDEMO().ALLATORIxDEMO().getaMap(), this.iiIiiiiiiiIii.getText().trim());
    }

    public void iiiIiiiiiiIIi(boolean skin) {
        if (this.IIIIiiiiiiiII == null) {
            return;
        }
        RoleData IiiiiiiiIIIII = this.ALLATORIxDEMO();
        if (this.IIIIiiiiiiiII.getType() == 0) {
            if (new BigDecimal(this.IIIIiiiiiiiII.getMoney()).compareTo(IiiiiiiiIIIII.getLoginResult().getGold()) > 0) {
                this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u5927\u8bdd\u5e01\u4e0d\u8db3");
                return;
            }
        } else if (new BigDecimal(this.IIIIiiiiiiiII.getMoney()).compareTo(IiiiiiiiIIIII.getLoginResult().getCodecard()) > 0) {
            this.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4ed9\u7389\u4e0d\u8db3");
            return;
        }
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"usercard", (String)(String.valueOf(skin ? 0 : 1) + "|" + this.IIIIiiiiiiiII.getId()));
        this.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    static /* synthetic */ JTable ALLATORIxDEMO(IIIiIiiiiIIii arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public IIIiIiiiiIIii(GameView gameView) {
        super(89, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 800, 423, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4e03\u5341\u4e8c\u53d8");
        this.iiiIiiiiiiiIi = new com.xy.i.IiiiiiiiiIIII[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = new com.xy.i.IiiiiiiiiIIII("sc/e/52.png", 2, 11 + IiiiiiiiIIIII, iiIIiiiiIiiII.IIiiIiiiIIiIi, null, IiiiiiiiIIIII == 0 ? "\u91d1\u94b1\u53d8\u8eab" : (IiiiiiiiIIIII == 1 ? "\u4ed9\u7389\u53d8\u8eab" : ""), (IiiiIiiiiIiIi)this);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiiiiiI);
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(379 + 102 * IiiiiiiiIIIII, 21, 100, 24);
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iiiiIiiiIiiII = new JLabel[3];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiiIiiiIiiII.length) {
            this.iiiiIiiiIiiII[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)0, (Color)(IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 2 ? Color.black : Color.white), (Font)(IiiiiiiiIIIII == 2 ? iiIIiiiiIiiII.iIIiiiiiiIIII : iiIIiiiiIiiII.iiiiIiiiIiiII));
            this.iiiiIiiiIiiII[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u5361\u540d" : (IiiiiiiiIIIII == 1 ? "\u5c5e\u6027" : (IiiiiiiiIIIII == 2 ? "\u4e94\u884c\u76f8\u514b\uff1a\u91d1\u514b\u6728\u3001\u6728\u514b\u571f\u3001\u571f\u514b\u6c34\u3001\u6c34\u514b\u706b\u3001\u706b\u514b\u91d1" : "")));
            if (IiiiiiiiIIIII == 0) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(587, 24, 42, 19);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(45, 45, 150, 21);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiiIiiiIiiII[IiiiiiiiIIIII].setBounds(45, 24, 312, 20);
            }
            this.add(this.iiiiIiiiIiiII[IiiiiiiiIIIII++]);
        }
        this.iiIIIiiiiiiiI = new RichLabel("", iiIIiiiiIiiII.iIIiiiiiiIIII);
        this.iIiIiiiiIiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((int)49, (int)66, (int)145, (int)325, (Component)this.iiIIIiiiiiiiI, (int)20);
        this.add(this.iIiIiiiiIiIii);
        Vector<String> IiiiiiiiIIIII2 = new Vector<String>();
        IiiiiiiiIIIII2.addElement("\u529f\u80fd");
        IiiiiiiiIIIII2.addElement("\u5361\u540d");
        IiiiiiiiIIIII2.addElement("\u65f6\u95f4");
        IiiiiiiiIIIII2.addElement("\u91d1\u94b1");
        this.iiIiIiiiiIIIi = new Vector();
        this.ALLATORIxDEMO = IiIIIiiiiIIiI.ALLATORIxDEMO(this.iiIiIiiiiIIIi, IiiiiiiiIIIII2, (Font)iiIIiiiiIiiII.ALLATORIxDEMO, (Color)Color.white, (int[])new int[]{60, 120, 80, 120});
        this.ALLATORIxDEMO.getSelectionModel().addListSelectionListener((ListSelectionListener)new IIiiiiiiIIIii(this));
        IiiiIiiiiIiII IiiiiiiiIIIII3 = new IiiiIiiiiIiII(this);
        IiiiiiiiIIIII3.setHorizontalAlignment(0);
        this.ALLATORIxDEMO.setDefaultRenderer(Object.class, (TableCellRenderer)IiiiiiiiIIIII3);
        this.IiiiiiiiIIIII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)379, (int)45, (int)394, (int)350, (Component)this.ALLATORIxDEMO, (int)20);
        this.add(this.IiiiiiiiIIIII);
        this.IiIiiiiiIIIII = new com.xy.i.IiiiiiiiiIIII[3];
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.IiIiiiiiIIIII.length) {
            this.IiIiiiiiIIIII[IiiiiiiiIIIII4] = new com.xy.i.IiiiiiiiiIIII(IiiiiiiiIIIII4 == 0 ? "sc/e/5.png" : "sc/e/46.png", 1, 13 + IiiiiiiiIIIII4, IiiiiiiiIIIII4 == 0 ? iiIIiiiiIiiII.iiIiiiiiiIIiI : iiIIiiiiIiiII.iiiiIiiiIiiII, null, IiiiiiiiIIIII4 == 0 ? "\u641c\u7d22" : (IiiiiiiiIIIII4 == 1 ? "\u53d8\u8eab\u9020\u578b" : (IiiiiiiiIIIII4 == 2 ? "\u4e0d\u53d8\u8eab\u9020\u578b" : "")), (IiiiIiiiiIiIi)this);
            IIIiIiiiiIIii iIIiIiiiiIIii = this;
            if (IiiiiiiiIIIII4 == 0) {
                iIIiIiiiiIIii.IiIiiiiiIIIII[IiiiiiiiIIIII4].setBounds(719, 25, 34, 17);
            } else {
                iIIiIiiiiIIii.IiIiiiiiIIIII[IiiiiiiiIIIII4].setForeground(Color.black);
                this.IiIiiiiiIIIII[IiiiiiiiIIIII4].setBounds(229, 338 + 30 * (IiiiiiiiIIIII4 - 1), 119, 25);
            }
            this.add((Component)this.IiIiiiiiIIIII[IiiiiiiiIIIII4++]);
        }
        this.iiIiiiiiiiIii = IiIIIiiiiIIiI.ALLATORIxDEMO((IIiIiiiiIIiii)IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/17.png", (int)6, (int)6, (int)6, (int)6, (boolean)false), (Font)iiIIiiiiIiiII.iiIiiiiiiIIiI, (Color)Color.white);
        this.iiIiiiiiiiIii.setBounds(633, 24, 120, 19);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[7];
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII4] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII4 == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(45, 45, 150, 21);
            } else if (IiiiiiiiIIIII4 == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(45, 45, 150, 350);
            } else if (IiiiiiiiIIIII4 == 2) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(379, 45, 394, 21);
            } else if (IiiiiiiiIIIII4 == 3) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(379, 45, 394, 350);
            } else if (IiiiiiiiIIIII4 == 4) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].iIiIiiiiIIiii("sc/d/61.png");
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(208, 53, 160, 221);
            } else if (IiiiiiiiIIIII4 == 5) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(209, 55, 158, 218);
            } else if (IiiiiiiiIIIII4 == 6) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII4].setBounds(206, 45, 165, 240);
            }
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII4++]);
        }
        iiiiiiiiIIIII IiiiiiiiIIIII32 = new iiiiiiiiIIIII(7, 3, 26, 34);
        this.IiIIIiiiiIiiI = new com.xy.q.IIIiiiiiIiIiI[3];
        int IiiiiiiiIIIII5 = 0;
        while (IiiiiiiiIIIII5 < this.IiIIIiiiiIiiI.length) {
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII5] = new com.xy.q.IIIiiiiiIiIiI((IiiiIiiiiIiIi)this);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII5].ALLATORIxDEMO(IiiiiiiiIIIII32);
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII5].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
            this.IiIIIiiiiIiiI[IiiiiiiiIIIII5].setBounds(214 + 52 * IiiiiiiiIIIII5, 291, 40, 40);
            this.add((Component)this.IiIIIiiiiIiiI[IiiiiiiiIIIII5++]);
        }
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi(true);
        this.iIiIiiiiIIiii(0);
        super.iIiIiiiiIIiii();
    }
}
