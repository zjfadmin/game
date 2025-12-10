/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIiIIiiiiiiii
 *  com.xy.a.iiIiiiiiiIIii
 *  com.xy.a.iiiIIiiiIiIII
 *  com.xy.a.iiiiiiiiiIiII
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.i.IiiIiiiiIIIii
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.ChatBox
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.richtext.TextListFile
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiIIIiiiiiiIi
 *  com.xy.v.IiiIIiiiiIiii
 *  com.xy.v.iiIIiiiiIiiII
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.iIiIIiiiiiiii;
import com.xy.a.iiIiiiiiiIIii;
import com.xy.a.iiiIIiiiIiIII;
import com.xy.a.iiiiiiiiiIiII;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.i.IiiIiiiiIIIii;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.ChatBox;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.richtext.TextListFile;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiIIIiiiiiiIi;
import com.xy.v.IiiIIiiiiIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class IiIIiiiiiIIII
extends IiiiIiiiiIiIi {
    private JLabel IIIIiiiiiiiII;
    private int iiIIIiiiiiiiI;
    private LinkedList<RichLabel> IiIiiiiiIIIII;
    private int iiIiIiiiiIIIi = -1;
    private int iiiiIiiiIiiII;
    private IIIIIiiiIIIiI[] iiiIiiiiiiiIi;
    private IIIiiiiiIiIiI[] iIiiIiiiiiiII;
    String[] IIiiIiiiIIiIi = new String[]{"\u5f53\u524d", "\u961f\u4f0d", "\u5e2e\u6d3e", "\u4e16\u754c", "\u4f20\u97f3", "\u7cfb\u7edf", "\u6d88\u606f", "\u6218\u6597"};
    private int iIiIiiiiIiIii;
    private int IiIIIiiiiIiiI;
    private InputBean iiIiiiiiiiIii;
    private IIIIIiiiIIIiI[] IiiiiiiiIIIII;
    private JComponent ALLATORIxDEMO;

    public boolean ALLATORIxDEMO() {
        this.ALLATORIxDEMO(this.IiIiiiiiIIIII);
        return super.ALLATORIxDEMO();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public synchronized void ALLATORIxDEMO(TextListFile textListFile, int index) {
        block10: {
            if (textListFile == null) {
                return;
            }
            if (textListFile.points.size() != index) break block10;
            var4_3 = textListFile.fileList.iterator();
            if (true) ** GOTO lbl40
        }
        try {
            IiiiiiiiIIIII = (com.xy.v.iiIIiiiiIiiII)textListFile.points.get(index);
            IiiiiiiiIIIII = ChatBox.getChatFileRandom((int)textListFile.id, (long)this.iiIIiiiiIiIIi.roleData.getRoleId(), (boolean)false);
            IiiiiiiiIIIII = new byte[(int)IiiiiiiiIIIII.IiiiiiiiIIIII];
            IiiiiiiiIIIII.read(IiiiiiiiIIIII.ALLATORIxDEMO, IiiiiiiiIIIII);
            IiiiiiiiIIIII = IiiIIiiiiIiii.ALLATORIxDEMO((byte[])IiiiiiiiIIIII);
            IiiiiiiiIIIII = new String(IiiiiiiiIIIII, IiIIIiiiiiiIi.iIiiIiiiiiiII);
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
                return;
            }
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII.length();
lbl18:
            // 2 sources

            while (true) {
                block11: {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.lastIndexOf("\n", IiiiiiiiIIIII - 1);
                    if (IiiiiiiiIIIII == -1) break block11;
                    if (IiiiiiiiIIIII + 1 == IiiiiiiiIIIII) {
                        v0 = IiiiiiiiIIIII;
                    } else {
                        var9_13 = ChatBox.getTextList((String)IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1, IiiiiiiiIIIII), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (int)328);
                        v0 = IiiiiiiiIIIII;
                        this.IiIiiiiiIIIII.addFirst(IiiiiiiiIIIII);
                    }
                    ** GOTO lbl-1000
                }
                IiiiiiiiIIIII = ChatBox.getTextList((String)IiiiiiiiIIIII.substring(0, IiiiiiiiIIIII), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (int)328);
                v1 = this;
                this.IiIiiiiiIIIII.addFirst(IiiiiiiiIIIII);
                ** GOTO lbl-1000
                break;
            }
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
        do {
            IiiiiiiiIIIII = (String)var4_3.next();
            IiiiiiiiIIIII = ChatBox.getTextList((String)IiiiiiiiIIIII, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (int)328);
            this.IiIiiiiiIIIII.addLast(IiiiiiiiIIIII);
lbl40:
            // 2 sources

        } while (var4_3.hasNext());
        this.iiiIiiiiiiIIi();
        return;
lbl-1000:
        // 2 sources

        {
            IiiiiiiiIIIII = v0;
            ** continue;
        }
lbl-1000:
        // 1 sources

        {
            v1.iiiIiiiiiiIIi();
            return;
        }
    }

    public void ALLATORIxDEMO(int h, int height) {
        if (this.iiIIIiiiiiiiI == -1 && height > 0) {
            this.iiIIIiiiiiiiI = this.ALLATORIxDEMO(height, this.IiIIIiiiiIiiI, this.iIiIiiiiIiIii);
        }
        this.iiIIIiiiiiiiI = Math.max(Math.min(this.iiIIIiiiiiiiI + h, this.IiIIIiiiiIiiI), 0);
        if (this.iiIIIiiiiiiiI < this.IiIIIiiiiIiiI) return;
        if (this.iiiiIiiiIiiII <= 0) return;
        int IiiiiiiiIIIII = this.iiIiIiiiiIIIi;
        if (IiiiiiiiIIIII == 1) {
            IiiiiiiiIIIII = 3;
        } else if (IiiiiiiiIIIII == 2) {
            IiiiiiiiIIIII = 1;
        } else if (IiiiiiiiIIIII == 3) {
            IiiiiiiiIIIII = 2;
        } else if (IiiiiiiiIIIII == 4) {
            IiiiiiiiIIIII = 8;
        }
        --this.iiiiIiiiIiiII;
        this.ALLATORIxDEMO(this.iiIIiiiiIiIIi.chatBox.getTextListFile(IiiiiiiiIIIII), this.iiiiIiiiIiiII);
    }

    static /* synthetic */ InputBean ALLATORIxDEMO(IiIIiiiiiIIII arg0, int arg1, int arg2) {
        return arg0.ALLATORIxDEMO(arg1, arg2);
    }

    public IiIIiiiiiIIII(GameView gameView) {
        super(159, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 482, 485, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u804a\u5929\u8bb0\u5f55");
        this.IiIiiiiiIIIII = new LinkedList();
        this.ALLATORIxDEMO = new iiiiiiiiiIiII(this);
        this.ALLATORIxDEMO.setBounds(51, 46, 326, 392);
        this.ALLATORIxDEMO.addMouseWheelListener((MouseWheelListener)new iiIiiiiiiIIii(this));
        this.ALLATORIxDEMO.addMouseListener((MouseListener)new iiiIIiiiIiIII(this));
        this.add(this.ALLATORIxDEMO);
        this.IIIIiiiiiiiII = IiIIIiiiiIIiI.ALLATORIxDEMO((int)47, (int)25, (int)350, (int)21, (int)0, (Color)iiIIiiiiIiiII.ALLATORIxDEMO((String)"#cFFFFFF"), (Font)iiIIiiiiIiiII.iiiiIiiiIiiII);
        this.IIIIiiiiiiiII.setText("\u804a\u5929\u8bb0\u5f55\u67e5\u8be2");
        this.add(this.IIIIiiiiiiiII);
        this.iiiIiiiiiiiIi = new IIIIIiiiIIIiI[4];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iiiIiiiiiiiIi.length) {
            this.iiiIiiiiiiiIi[IiiiiiiiIIIII] = IiiiiiiiIIIII == 0 || IiiiiiiiIIIII == 1 ? new IIIIIiiiIIIiI(IiiiiiiiIIIII == 0 ? "sc/e/6.png" : "sc/e/69.png", 1, 314 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiIiiiiiiIIiI, null, IiiiiiiiIIIII == 0 ? "\u5237\u65b0" : (IiiiiiiiIIIII == 1 ? "\u5173\u952e\u8bcd\u641c\u7d22" : ""), (IiiiIiiiiIiIi)this) : new IIIIIiiiIIIiI(IiiiiiiiIIIII == 2 ? "sc/e/47.png" : "sc/e/48.png", 1, 314 + IiiiiiiiIIIII, (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII == 0) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(350, 27, 34, 18);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
            } else if (IiiiiiiiIIIII == 1) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(310, 447, 85, 18);
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setOffsetTexts(iiIIiiiiIiiII.IiIIIiiiIIiIi);
            } else if (IiiiiiiiIIIII == 2) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(378, 45, 18, 18);
            } else if (IiiiiiiiIIIII == 3) {
                this.iiiIiiiiiiiIi[IiiiiiiiIIIII].setBounds(378, 421, 18, 18);
            }
            this.add((Component)this.iiiIiiiiiiiIi[IiiiiiiiIIIII++]);
        }
        this.iIiiIiiiiiiII = new IIIiiiiiIiIiI[2];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiiIiiiiiiII.length) {
            this.iIiiIiiiiiiII[IiiiiiiiIIIII] = new IIIiiiiiIiIiI();
            this.add((Component)this.iIiiIiiiiiiII[IiiiiiiiIIIII]);
            if (IiiiiiiiIIIII == 0) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(47, 25, 350, 21);
            } else if (IiiiiiiiIIIII == 1) {
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].ALLATORIxDEMO(IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iIiiIiiiiiiII[IiiiiiiiIIIII].setBounds(47, 25, 350, 415);
            }
            ++IiiiiiiiIIIII;
        }
        this.IiiiiiiiIIIII = new IIIIIiiiIIIiI[9];
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.length) {
            this.IiiiiiiiIIIII[IiiiiiiiIIIII] = new IIIIIiiiIIIiI("sc/e/7.png", 1, 320 + IiiiiiiiIIIII, iiIIiiiiIiiII.iiiiIiiiIiiII, iiIIiiiiIiiII.IIiiiiiiIiiII, IiiiiiiiIIIII == 0 ? "\u5f53\u524d" : (IiiiiiiiIIIII == 1 ? "\u4e16\u754c" : (IiiiiiiiIIIII == 2 ? "\u961f\u4f0d" : (IiiiiiiiIIIII == 3 ? "\u5e2e\u6d3e" : (IiiiiiiiIIIII == 4 ? "\u6218\u6597" : (IiiiiiiiIIIII == 5 ? "\u7cfb\u7edf" : (IiiiiiiiIIIII == 6 ? "\u4fe1\u606f" : (IiiiiiiiIIIII == 7 ? "\u4f20\u97f3" : (IiiiiiiiIIIII == 8 ? "\u641c\u7d22" : "")))))))), (IiiiIiiiiIiIi)this);
            if (IiiiiiiiIIIII <= 6) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(393, 38 + IiiiiiiiIIIII * 30, 64, 25);
            } else if (IiiiiiiiIIIII == 7) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(393, 368, 64, 25);
            } else if (IiiiiiiiIIIII == 8) {
                this.IiiiiiiiIIIII[IiiiiiiiIIIII].setBounds(393, 398, 64, 25);
            }
            this.add((Component)this.IiiiiiiiIIIII[IiiiiiiiIIIII++]);
        }
    }

    private /* synthetic */ void iiiIiiiiiiIIi() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        for (RichLabel IiiiiiiiIIIII3 : this.IiIiiiiiIIIII) {
            if (++IiiiiiiiIIIII2 == this.IiIiiiiiIIIII.size()) continue;
            IiiiiiiiIIIII += IiiiiiiiIIIII3.getHeight();
        }
        this.IiIIIiiiiIiiI = IiiiiiiiIIIII;
        this.iIiIiiiiIiIii = this.IiIiiiiiIIIII.size() > 0 ? this.IiIiiiiiIIIII.getLast().getHeight() : 0;
    }

    public void IiiIiiiiiiIiI(int menuType) {
        this.iIiIiiiiIIiii(menuType);
        if (this.ALLATORIxDEMO().iIiIiiiiIIiii(this.iIiIiiiiIIiii()) == null) {
            this.ALLATORIxDEMO().iIiIiiiiIIiIi(this.iIiIiiiiIIiii());
            return;
        }
        this.iIiIiiiiIIiIi(menuType != -1 ? menuType : 0);
    }

    protected void ALLATORIxDEMO(Graphics g) {
        int IiiiiiiiIIIII = this.iiIIIiiiiiiiI;
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII = Math.min(Math.max(this.ALLATORIxDEMO.getHeight() - this.iIiIiiiiIiIii, 0), this.IiIIIiiiiIiiI);
        }
        int IiiiiiiiIIIII2 = 0;
        g.translate(0, IiiiiiiiIIIII -= this.IiIIIiiiiIiiI);
        for (RichLabel IiiiiiiiIIIII3 : this.IiIiiiiiIIIII) {
            g.translate(0, IiiiiiiiIIIII2);
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3.getHeight();
            if ((IiiiiiiiIIIII += IiiiiiiiIIIII2) >= 0) {
                IiiiiiiiIIIII3.paint(g);
            }
            if (IiiiiiiiIIIII <= this.IiIIIiiiiIiiI) continue;
            return;
        }
    }

    private /* synthetic */ InputBean ALLATORIxDEMO(int x, int y) {
        int IiiiiiiiIIIII = this.iiIIIiiiiiiiI;
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII = Math.min(Math.max(this.ALLATORIxDEMO.getHeight() - this.iIiIiiiiIiIii, 0), this.IiIIIiiiiIiiI);
        }
        IiiiiiiiIIIII -= this.IiIIIiiiiIiiI;
        int IiiiiiiiIIIII2 = 0;
        for (RichLabel IiiiiiiiIIIII3 : this.IiIiiiiiIIIII) {
            if (IiiiiiiiIIIII3 == null) return null;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3.getHeight();
            if ((IiiiiiiiIIIII += IiiiiiiiIIIII2) >= 0 && IiiiiiiiIIIII >= y) {
                return IiiiiiiiIIIII3.isMonitor(x, y - (IiiiiiiiIIIII - IiiiiiiiIIIII2));
            }
            if (IiiiiiiiIIIII > this.IiIIIiiiiIiiI) return null;
        }
        return null;
    }

    public void ALLATORIxDEMO(LinkedList<RichLabel> list) {
        if (list == null) {
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ChatBox.removeTextList((RichLabel)((RichLabel)iterator.next()));
        }
        list.clear();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public synchronized void ALLATORIxDEMO(iIiIIiiiiiiii view, StringBuffer buffer, int channelType, TextListFile textListFile, int index) {
        block22: {
            if (textListFile == null) {
                return;
            }
            IiiiiiiiIIIII = view.iiiIiiiiiiIIi();
            if (textListFile.points.size() != index) break block22;
            var8_7 = textListFile.fileList.iterator();
            if (true) ** GOTO lbl92
        }
        try {
            IiiiiiiiIIIII = (com.xy.v.iiIIiiiiIiiII)textListFile.points.get(index);
            IiiiiiiiIIIII = ChatBox.getChatFileRandom((int)textListFile.id, (long)this.iiIIiiiiIiIIi.roleData.getRoleId(), (boolean)false);
            IiiiiiiiIIIII = new byte[(int)IiiiiiiiIIIII.IiiiiiiiIIIII];
            IiiiiiiiIIIII.read(IiiiiiiiIIIII.ALLATORIxDEMO, IiiiiiiiIIIII);
            IiiiiiiiIIIII = IiiIIiiiiIiii.ALLATORIxDEMO((byte[])IiiiiiiiIIIII);
            IiiiiiiiIIIII = new String(IiiiiiiiIIIII, IiIIIiiiiiiIi.iIiiIiiiiiiII);
            if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) {
                return;
            }
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            while (true) {
                block21: {
                    block24: {
                        block23: {
                            if (IiiiiiiiIIIII == -1) {
                                return;
                            }
                            IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("\n", IiiiiiiiIIIII);
                            IiiiiiiiIIIII = null;
                            if (IiiiiiiiIIIII == -1) break block23;
                            if (IiiiiiiiIIIII + 1 == IiiiiiiiIIIII) break block21;
                            IiiiiiiiIIIII = ChatBox.getTextList((String)IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (int)328);
                            break block24;
                        }
                        IiiiiiiiIIIII = ChatBox.getTextList((String)IiiiiiiiIIIII.substring(IiiiiiiiIIIII), (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (int)328);
                    }
                    buffer.setLength(0);
                    IiiiiiiiIIIII = 0;
                    while (true) {
                        if (IiiiiiiiIIIII >= IiiiiiiiIIIII.sectionList.size()) break;
                        IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.sectionList.get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII /* !! */  instanceof String) {
                            buffer.append(IiiiiiiiIIIII /* !! */ );
                        } else if (IiiiiiiiIIIII /* !! */  instanceof InputBean) {
                            buffer.append(((InputBean)IiiiiiiiIIIII /* !! */ ).getName());
                        }
                        ++IiiiiiiiIIIII;
                    }
                    IiiiiiiiIIIII = 0;
                    while (true) {
                        if (IiiiiiiiIIIII >= IiiiiiiiIIIII) {
                            ChatBox.removeTextList((RichLabel)IiiiiiiiIIIII);
                            break block21;
                        }
                        IiiiiiiiIIIII /* !! */  = view.ALLATORIxDEMO(IiiiiiiiIIIII);
                        if (this.IIiiIiiiIIiIi[channelType].equals(IiiiiiiiIIIII /* !! */ )) {
                            this.IiIiiiiiIIIII.addLast(IiiiiiiiIIIII);
                            break block21;
                        }
                        if (buffer.indexOf((String)IiiiiiiiIIIII /* !! */ ) != -1) break;
                        ++IiiiiiiiIIIII;
                    }
                    this.IiIiiiiiIIIII.addLast(IiiiiiiiIIIII);
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
            }
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
        block5: do {
            IiiiiiiiIIIII = (String)var8_7.next();
            buffer.setLength(0);
            IiiiiiiiIIIII = ChatBox.getTextList((String)IiiiiiiiIIIII, (Font)iiIIiiiiIiiII.iIIIiiiiIIIii, (int)328);
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.sectionList.size()) {
                IiiiiiiiIIIII /* !! */  = IiiiiiiiIIIII.sectionList.get(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII /* !! */  instanceof String) {
                    buffer.append(IiiiiiiiIIIII /* !! */ );
                } else if (IiiiiiiiIIIII /* !! */  instanceof InputBean) {
                    buffer.append(((InputBean)IiiiiiiiIIIII /* !! */ ).getName());
                }
                ++IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                IiiiiiiiIIIII /* !! */  = view.ALLATORIxDEMO(IiiiiiiiIIIII);
                if (this.IIiiIiiiIIiIi[channelType].equals(IiiiiiiiIIIII /* !! */ )) {
                    this.IiIiiiiiIIIII.addLast(IiiiiiiiIIIII);
                    continue block5;
                }
                if (buffer.indexOf((String)IiiiiiiiIIIII /* !! */ ) == -1) {
                    ++IiiiiiiiIIIII;
                    continue;
                }
                this.IiIiiiiiIIIII.addLast(IiiiiiiiIIIII);
                continue block5;
            }
            ChatBox.removeTextList((RichLabel)IiiiiiiiIIIII);
lbl92:
            // 4 sources

        } while (var8_7.hasNext());
    }

    static /* synthetic */ void ALLATORIxDEMO(IiIIiiiiiIIII arg0, InputBean arg1) {
        arg0.iiIiiiiiiiIii = arg1;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiIi(int id) {
        block31: {
            block30: {
                this.iIiIiiiiIIiii(id);
                IiiiiiiiIIIII = null;
                if (this.IiIiiiiiIIIII.size() != 0) {
                    IiiiiiiiIIIII = this.IiIiiiiiIIIII;
                    this.IiIiiiiiIIIII = new LinkedList<E>();
                }
                if (this.iiIiIiiiiIIIi != 8) break block30;
                this.iiiiIiiiIiiII = 0;
                this.iiIIIiiiiiiiI = -1;
                this.IiIIIiiiiIiiI = 0;
                this.iIiIiiiiIiIii = 0;
                IiiiiiiiIIIII = (iIiIIiiiiiiii)this.ALLATORIxDEMO().iiiIiiiiiiIIi(160);
                IiiiiiiiIIIII = IiiiiiiiIIIII.iiiIiiiiiiIIi();
                IiiiiiiiIIIII = IiiiiiiiIIIII != 0 ? new StringBuffer() : null;
                IiiiiiiiIIIII = IiiiiiiiIIIII != 0 ? 0 : 9999;
                if (true) ** GOTO lbl77
            }
            IiiiiiiiIIIII = this.iiIiIiiiiIIIi;
            if (IiiiiiiiIIIII == 1) {
                IiiiiiiiIIIII = 3;
            } else if (IiiiiiiiIIIII == 2) {
                IiiiiiiiIIIII = 1;
            } else if (IiiiiiiiIIIII == 3) {
                IiiiiiiiIIIII = 2;
            } else if (IiiiiiiiIIIII == 4) {
                IiiiiiiiIIIII = 7;
            } else if (IiiiiiiiIIIII == 7) {
                IiiiiiiiIIIII = 4;
            }
            this.iiiiIiiiIiiII = 0;
            this.iiIIIiiiiiiiI = -1;
            this.IiIIIiiiiIiiI = 0;
            this.iIiIiiiiIiIii = 0;
            IiiiiiiiIIIII = this.iiIIiiiiIiIIi.chatBox.getTextListFile(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII != null) {
                this.iiiiIiiiIiiII = IiiiiiiiIIIII.points.size();
                this.ALLATORIxDEMO(IiiiiiiiIIIII, this.iiiiIiiiIiiII);
            }
            if (IiiiiiiiIIIII != null && this.iiiiIiiiIiiII > 0 && this.IiIIIiiiiIiiI < this.ALLATORIxDEMO.getHeight()) {
                --this.iiiiIiiiIiiII;
                this.ALLATORIxDEMO(IiiiiiiiIIIII, this.iiiiIiiiIiiII);
            }
            break block31;
            do {
                IiiiiiiiIIIII = 0;
                if (IiiiiiiiIIIII == 0) {
                    IiiiiiiiIIIII = 5;
                } else if (IiiiiiiiIIIII == 1) {
                    IiiiiiiiIIIII = 6;
                } else if (IiiiiiiiIIIII == 2) {
                    IiiiiiiiIIIII = 7;
                } else if (IiiiiiiiIIIII == 3) {
                    IiiiiiiiIIIII = 0;
                } else if (IiiiiiiiIIIII == 4) {
                    IiiiiiiiIIIII = 2;
                } else if (IiiiiiiiIIIII == 5) {
                    IiiiiiiiIIIII = 1;
                } else if (IiiiiiiiIIIII == 6) {
                    IiiiiiiiIIIII = 4;
                } else if (IiiiiiiiIIIII == 7) {
                    IiiiiiiiIIIII = 3;
                }
                IiiiiiiiIIIII = this.iiIIiiiiIiIIi.chatBox.getTextListFile(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.points.size();
                    while (IiiiiiiiIIIII <= IiiiiiiiIIIII) {
                        this.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII++);
                    }
                }
                ++IiiiiiiiIIIII;
lbl77:
                // 2 sources

            } while (IiiiiiiiIIIII < 8);
            this.iiiIiiiiiiIIi();
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    static /* synthetic */ InputBean ALLATORIxDEMO(IiIIiiiiiIIII arg0) {
        return arg0.iiIiiiiiiiIii;
    }

    public void iIiIiiiiIIiii() {
        this.iIiIiiiiIIiIi(this.iiIiIiiiiIIIi != -1 ? this.iiIiIiiiiIIIi : 0);
        super.iIiIiiiiIIiii();
    }

    static /* synthetic */ JComponent ALLATORIxDEMO(IiIIiiiiiIIII arg0) {
        return arg0.ALLATORIxDEMO;
    }

    public void iiiIiiiiiiIIi(int id) {
        if (id == 314) {
            this.iIiIiiiiIIiIi(this.iiIiIiiiiIIIi != -1 ? this.iiIiIiiiiIIIi : 0);
            return;
        }
        if (id == 315) {
            IiiIiiiiIIIii.ALLATORIxDEMO((int)160, (GameView)this.iiIIiiiiIiIIi);
            return;
        }
        if (id == 316) {
            this.ALLATORIxDEMO(150, this.ALLATORIxDEMO.getHeight());
            return;
        }
        if (id != 317) return;
        this.ALLATORIxDEMO(-150, this.ALLATORIxDEMO.getHeight());
    }

    private /* synthetic */ int ALLATORIxDEMO(int H, int maxH, int newH) {
        return Math.min(Math.max(H - newH, 0), maxH);
    }

    public void iIiIiiiiIIiii(int id) {
        if (this.iiIiIiiiiIIIi == id) return;
        if (this.iiIiIiiiiIIIi != -1) {
            this.IiiiiiiiIIIII[this.iiIiIiiiiIIIi].setBounds(this.IiiiiiiiIIIII[this.iiIiIiiiiIIIi].getX() - 6, this.IiiiiiiiIIIII[this.iiIiIiiiiIIIi].getY(), 64, 25);
        }
        this.iiIiIiiiiIIIi = id;
        this.IiiiiiiiIIIII[this.iiIiIiiiiIIIi].setBounds(this.IiiiiiiiIIIII[this.iiIiIiiiiIIIi].getX() + 6, this.IiiiiiiiIIIII[this.iiIiIiiiiIIIi].getY(), 64, 25);
    }
}
