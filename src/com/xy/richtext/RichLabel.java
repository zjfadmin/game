/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.ChatBox$TextList
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichBeau
 *  com.xy.richtext.RichBeauUnit
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.iIIIIiiiIiiIi
 *  com.xy.w.iiIiIiiiiiIIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.richtext;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.ChatBox;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichBeau;
import com.xy.richtext.RichBeauUnit;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.iIIIIiiiIiiIi;
import com.xy.w.iiIiIiiiiiIIi;
import com.xy.w.iiiiiiiiiiIiI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComponent;

public class RichLabel
extends JComponent {
    private String text;
    private static Pattern pattern;
    private static HashMap<String, iIIIIiiiIiiIi> faceAnimations;
    private static final long serialVersionUID = 4898130145332371300L;
    static Graphics2D tempG2d;
    private Font font;
    private long startTime;
    public boolean isInteractive;
    static Graphics tempG;
    private String lastStr;
    public static String PATH;
    public ArrayList<Object> sectionList;
    private Point point = new Point(0, 0);
    private long currTime;
    private InputBean lastBean;

    /*
     * WARNING - void declaration
     */
    public static ChatBox.TextList getTextList(String text) {
        void IiiiiiiiIIIII;
        ChatBox.TextList textList = new ChatBox.TextList();
        textList.list = new ArrayList();
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)text)) {
            return IiiiiiiiIIIII;
        }
        Matcher IiiiiiiiIIIII2 = pattern.matcher(text);
        block2: while (IiiiiiiiIIIII2.find()) {
            String IiiiiiiiIIIII3 = IiiiiiiiIIIII2.group();
            if (IiiiiiiiIIIII3.startsWith("#")) {
                iiIiIiiiiiIIi IiiiiiiiIIIII4;
                String IiiiiiiiIIIII5;
                iIIIIiiiIiiIi IiiiiiiiIIIII6 = faceAnimations.get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII6 == null && IiiiiiiiIIIII3.charAt(1) >= '0' && IiiiiiiiIIIII3.charAt(1) <= '9') {
                    IiiiiiiiIIIII5 = IiiiiiiiIIIII3.substring(1);
                    if (IiiiiiiiIIIII5.equals("880")) {
                        IiiiiiiiIIIII6 = new iIIIIiiiIiiIi();
                        IiiiiiiiIIIII4 = new iiIiIiiiiiIIi(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S190.png"), 0, 0);
                        IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII4);
                    } else if (IiiiiiiiIIIII5.equals("881")) {
                        IiiiiiiiIIIII6 = new iIIIIiiiIiiIi();
                        IiiiiiiiIIIII4 = new iiIiIiiiiiIIi(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S189.png"), 0, 0);
                        IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII4);
                    } else {
                        IiiiiiiiIIIII6 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)(String.valueOf(PATH) + IiiiiiiiIIIII5 + ".was"));
                    }
                    if (IiiiiiiiIIIII6 != null) {
                        faceAnimations.put(IiiiiiiiIIIII3, IiiiiiiiIIIII6);
                    }
                } else if ((IiiiiiiiIIIII3.equals("#T") || IiiiiiiiIIIII3.equals("#X") || IiiiiiiiIIIII3.equals("#J") || IiiiiiiiIIIII3.equals("#Q") || IiiiiiiiIIIII3.equals("#D") || IiiiiiiiIIIII3.equals("#P") || IiiiiiiiIIIII3.equals("#F") || IiiiiiiiIIIII3.equals("#H")) && (IiiiiiiiIIIII6 = faceAnimations.get(IiiiiiiiIIIII3)) == null && (IiiiiiiiIIIII6 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)(String.valueOf(PATH) + RichLabel.gethead(IiiiiiiiIIIII3.substring(1)) + ".was"))) != null) {
                    faceAnimations.put(IiiiiiiiIIIII3, IiiiiiiiIIIII6);
                }
                if (IiiiiiiiIIIII6 != null) {
                    IiiiiiiiIIIII.list.add(IiiiiiiiIIIII6);
                    continue;
                }
                if (IiiiiiiiIIIII3.startsWith("#c")) {
                    if (IiiiiiiiIIIII3.length() != 8) continue;
                    IiiiiiiiIIIII.list.add(iiIIiiiiIiiII.ALLATORIxDEMO((String)IiiiiiiiIIIII3));
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#R")) {
                    IiiiiiiiIIIII.list.add(Color.RED);
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#G")) {
                    IiiiiiiiIIIII.list.add(Color.GREEN);
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#B")) {
                    IiiiiiiiIIIII.list.add(Color.BLUE);
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#W")) {
                    IiiiiiiiIIIII.list.add(Color.WHITE);
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#K")) {
                    IiiiiiiiIIIII.list.add(Color.BLACK);
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#Y")) {
                    IiiiiiiiIIIII.list.add(Color.YELLOW);
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#r")) {
                    IiiiiiiiIIIII.list.add(new Integer(-1));
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#n")) {
                    IiiiiiiiIIIII.list.add(Color.WHITE);
                    continue;
                }
                if (IiiiiiiiIIIII3.equals("#Z")) {
                    IiiiiiiiIIIII.list.add(new Integer(-2));
                    continue;
                }
                if (!IiiiiiiiIIIII3.equals("#V")) continue;
                try {
                    if (!IiiiiiiiIIIII2.find()) continue;
                    IiiiiiiiIIIII5 = IiiiiiiiIIIII2.group();
                    if (IiiiiiiiIIIII5.startsWith("c4f0f0f")) {
                        IiiiiiiiIIIII.list.add(new InputBean(-1));
                        continue;
                    }
                    if (IiiiiiiiIIIII5.startsWith("BEAU")) {
                        IiiiiiiiIIIII4 = new RichBeau(IiiiiiiiIIIII5, 4, IiiiiiiiIIIII5.length());
                        if (!IiiiiiiiIIIII4.init()) continue;
                        int IiiiiiiiIIIII7 = 0;
                        while (true) {
                            if (IiiiiiiiIIIII7 >= IiiiiiiiIIIII4.getUnits().length) continue block2;
                            IiiiiiiiIIIII.list.add(IiiiiiiiIIIII4.getUnits()[IiiiiiiiIIIII7++]);
                        }
                    }
                    IiiiiiiiIIIII4 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson(IiiiiiiiIIIII5, InputBean.class);
                    if (IiiiiiiiIIIII4.getColor() != null && !IiiiiiiiIIIII4.getColor().equals("")) {
                        Color IiiiiiiiIIIII8 = null;
                        if (IiiiiiiiIIIII4.getColor().startsWith("c")) {
                            String IiiiiiiiIIIII9 = IiiiiiiiIIIII3.substring(2);
                            if (!IiiiiiiiIIIII9.equals("")) {
                                IiiiiiiiIIIII8 = Color.decode("0x" + IiiiiiiiIIIII9);
                            }
                        } else if (IiiiiiiiIIIII4.getColor().equals("R")) {
                            IiiiiiiiIIIII8 = Color.RED;
                        } else if (IiiiiiiiIIIII4.getColor().equals("G")) {
                            IiiiiiiiIIIII8 = Color.GREEN;
                        } else if (IiiiiiiiIIIII4.getColor().equals("B")) {
                            IiiiiiiiIIIII8 = Color.BLUE;
                        } else if (IiiiiiiiIIIII4.getColor().equals("W")) {
                            IiiiiiiiIIIII8 = Color.WHITE;
                        } else if (IiiiiiiiIIIII4.getColor().equals("K")) {
                            IiiiiiiiIIIII8 = Color.BLACK;
                        } else if (IiiiiiiiIIIII4.getColor().equals("Y")) {
                            IiiiiiiiIIIII8 = Color.YELLOW;
                        }
                        IiiiiiiiIIIII4.setColor2(IiiiiiiiIIIII8);
                    }
                    IiiiiiiiIIIII4.setColor(null);
                    IiiiiiiiIIIII4.setText(IiiiiiiiIIIII4.getName());
                    IiiiiiiiIIIII.list.add(IiiiiiiiIIIII4);
                    IiiiiiiiIIIII.isInteractive = true;
                    if (IiiiiiiiIIIII4.getRichBeau() == null) continue;
                    IiiiiiiiIIIII4.getRichBeau().init();
                    int IiiiiiiiIIIII102 = 0;
                    while (true) {
                        if (IiiiiiiiIIIII102 >= IiiiiiiiIIIII4.getRichBeau().getUnits().length) {
                            if (!IiiiiiiiIIIII4.getName().endsWith("]")) continue block2;
                            InputBean IiiiiiiiIIIII102 = IiiiiiiiIIIII4.clone();
                            IiiiiiiiIIIII.list.add(IiiiiiiiIIIII102);
                            IiiiiiiiIIIII4.setText(IiiiiiiiIIIII4.getName().substring(0, IiiiiiiiIIIII4.getName().length() - 1));
                            IiiiiiiiIIIII102.setText("]");
                            IiiiiiiiIIIII4.setInputBean(IiiiiiiiIIIII102);
                            IiiiiiiiIIIII102.setRichBeau(IiiiiiiiIIIII4.getRichBeau());
                            IiiiiiiiIIIII102.setInputBean((InputBean)IiiiiiiiIIIII4);
                        }
                        IiiiiiiiIIIII.list.add(IiiiiiiiIIIII4.getRichBeau().getUnits()[IiiiiiiiIIIII102++]);
                    }
                }
                catch (Exception IiiiiiiiIIIII11) {
                    IiiiiiiiIIIII11.printStackTrace();
                }
                continue;
            }
            IiiiiiiiIIIII.list.add(IiiiiiiiIIIII3);
        }
        return IiiiiiiiIIIII;
    }

    public void setText(String text) {
        this.text = text;
        this.sectionList.clear();
        this.isInteractive = false;
        this.parseText(text);
    }

    public void parseText(String text) {
        if (text == null) {
            return;
        }
        Matcher IiiiiiiiIIIII = pattern.matcher(text);
        block2: while (IiiiiiiiIIIII.find()) {
            String IiiiiiiiIIIII2 = IiiiiiiiIIIII.group();
            if (IiiiiiiiIIIII2.startsWith("#")) {
                iiIiIiiiiiIIi IiiiiiiiIIIII3;
                Object IiiiiiiiIIIII4;
                iIIIIiiiIiiIi IiiiiiiiIIIII5 = faceAnimations.get(IiiiiiiiIIIII2);
                if (IiiiiiiiIIIII5 == null && IiiiiiiiIIIII2.charAt(1) >= '0' && IiiiiiiiIIIII2.charAt(1) <= '9') {
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII2.substring(1);
                    if (((String)IiiiiiiiIIIII4).equals("880")) {
                        IiiiiiiiIIIII5 = new iIIIIiiiIiiIi();
                        IiiiiiiiIIIII3 = new iiIiIiiiiiIIi(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S190.png"), 0, 0);
                        IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII3);
                    } else if (((String)IiiiiiiiIIIII4).equals("881")) {
                        IiiiiiiiIIIII5 = new iIIIIiiiIiiIi();
                        IiiiiiiiIIIII3 = new iiIiIiiiiiIIi(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/b/S189.png"), 0, 0);
                        IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII3);
                        this.sectionList.add(IiiiiiiiIIIII5);
                    } else {
                        IiiiiiiiIIIII5 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)(String.valueOf(PATH) + (String)IiiiiiiiIIIII4 + ".was"));
                    }
                    if (IiiiiiiiIIIII5 != null) {
                        faceAnimations.put(IiiiiiiiIIIII2, IiiiiiiiIIIII5);
                    }
                } else if ((IiiiiiiiIIIII2.equals("#T") || IiiiiiiiIIIII2.equals("#X") || IiiiiiiiIIIII2.equals("#J") || IiiiiiiiIIIII2.equals("#Q") || IiiiiiiiIIIII2.equals("#D") || IiiiiiiiIIIII2.equals("#P") || IiiiiiiiIIIII2.equals("#F") || IiiiiiiiIIIII2.equals("#H")) && (IiiiiiiiIIIII5 = faceAnimations.get(IiiiiiiiIIIII2)) == null && (IiiiiiiiIIIII5 = iiiiiiiiiiIiI.ALLATORIxDEMO((String)(String.valueOf(PATH) + RichLabel.gethead(IiiiiiiiIIIII2.substring(1)) + ".was"))) != null) {
                    faceAnimations.put(IiiiiiiiIIIII2, IiiiiiiiIIIII5);
                }
                if (IiiiiiiiIIIII5 != null) {
                    this.sectionList.add(IiiiiiiiIIIII5);
                    continue;
                }
                if (IiiiiiiiIIIII2.startsWith("#c")) {
                    if (IiiiiiiiIIIII2.length() != 8) continue;
                    IiiiiiiiIIIII4 = iiIIiiiiIiiII.ALLATORIxDEMO((String)IiiiiiiiIIIII2);
                    this.sectionList.add(IiiiiiiiIIIII4);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#R")) {
                    this.sectionList.add(Color.RED);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#G")) {
                    this.sectionList.add(Color.GREEN);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#B")) {
                    this.sectionList.add(Color.BLUE);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#W")) {
                    this.sectionList.add(Color.WHITE);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#K")) {
                    this.sectionList.add(Color.BLACK);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#Y")) {
                    this.sectionList.add(Color.YELLOW);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#r")) {
                    this.sectionList.add(new Integer(-1));
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#n")) {
                    this.sectionList.add(Color.WHITE);
                    continue;
                }
                if (IiiiiiiiIIIII2.equals("#Z")) {
                    this.sectionList.add(new Integer(-2));
                    continue;
                }
                if (!IiiiiiiiIIIII2.equals("#V")) continue;
                try {
                    if (!IiiiiiiiIIIII.find()) continue;
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII.group();
                    if (((String)IiiiiiiiIIIII4).startsWith("c4f0f0f")) {
                        this.sectionList.add(new InputBean(-1));
                        continue;
                    }
                    if (((String)IiiiiiiiIIIII4).startsWith("BEAU")) {
                        IiiiiiiiIIIII3 = new RichBeau((String)IiiiiiiiIIIII4, 4, ((String)IiiiiiiiIIIII4).length());
                        if (!IiiiiiiiIIIII3.init()) continue;
                        int IiiiiiiiIIIII6 = 0;
                        while (true) {
                            if (IiiiiiiiIIIII6 >= IiiiiiiiIIIII3.getUnits().length) continue block2;
                            this.sectionList.add(IiiiiiiiIIIII3.getUnits()[IiiiiiiiIIIII6++]);
                        }
                    }
                    IiiiiiiiIIIII3 = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson((String)IiiiiiiiIIIII4, InputBean.class);
                    if (IiiiiiiiIIIII3.getColor() != null && !IiiiiiiiIIIII3.getColor().equals("")) {
                        Color IiiiiiiiIIIII7 = null;
                        if (IiiiiiiiIIIII3.getColor().startsWith("c")) {
                            String IiiiiiiiIIIII8 = IiiiiiiiIIIII2.substring(2);
                            if (!IiiiiiiiIIIII8.equals("")) {
                                IiiiiiiiIIIII7 = Color.decode("0x" + IiiiiiiiIIIII8);
                            }
                        } else if (IiiiiiiiIIIII3.getColor().equals("R")) {
                            IiiiiiiiIIIII7 = Color.RED;
                        } else if (IiiiiiiiIIIII3.getColor().equals("G")) {
                            IiiiiiiiIIIII7 = Color.GREEN;
                        } else if (IiiiiiiiIIIII3.getColor().equals("B")) {
                            IiiiiiiiIIIII7 = Color.BLUE;
                        } else if (IiiiiiiiIIIII3.getColor().equals("W")) {
                            IiiiiiiiIIIII7 = Color.WHITE;
                        } else if (IiiiiiiiIIIII3.getColor().equals("K")) {
                            IiiiiiiiIIIII7 = Color.BLACK;
                        } else if (IiiiiiiiIIIII3.getColor().equals("Y")) {
                            IiiiiiiiIIIII7 = Color.YELLOW;
                        }
                        IiiiiiiiIIIII3.setColor2(IiiiiiiiIIIII7);
                    }
                    IiiiiiiiIIIII3.setColor(null);
                    IiiiiiiiIIIII3.setText(IiiiiiiiIIIII3.getName());
                    if (IiiiiiiiIIIII3.getRichBeau() != null && !IiiiiiiiIIIII3.getRichBeau().isDraw()) {
                        IiiiiiiiIIIII3.setRichBeau(null);
                    }
                    this.sectionList.add(IiiiiiiiIIIII3);
                    this.isInteractive = true;
                    if (IiiiiiiiIIIII3.getRichBeau() == null) continue;
                    IiiiiiiiIIIII3.getRichBeau().init();
                    int IiiiiiiiIIIII92 = 0;
                    while (true) {
                        if (IiiiiiiiIIIII92 >= IiiiiiiiIIIII3.getRichBeau().getUnits().length) {
                            if (!IiiiiiiiIIIII3.getName().endsWith("]")) continue block2;
                            InputBean IiiiiiiiIIIII92 = IiiiiiiiIIIII3.clone();
                            this.sectionList.add(IiiiiiiiIIIII92);
                            IiiiiiiiIIIII3.setText(IiiiiiiiIIIII3.getName().substring(0, IiiiiiiiIIIII3.getName().length() - 1));
                            IiiiiiiiIIIII92.setText("]");
                            IiiiiiiiIIIII3.setInputBean(IiiiiiiiIIIII92);
                            IiiiiiiiIIIII92.setRichBeau(IiiiiiiiIIIII3.getRichBeau());
                            IiiiiiiiIIIII92.setInputBean((InputBean)IiiiiiiiIIIII3);
                        }
                        this.sectionList.add(IiiiiiiiIIIII3.getRichBeau().getUnits()[IiiiiiiiIIIII92++]);
                    }
                }
                catch (Exception IiiiiiiiIIIII10) {
                    IiiiiiiiIIIII10.printStackTrace();
                }
                continue;
            }
            this.sectionList.add(IiiiiiiiIIIII2);
        }
        return;
    }

    static {
        faceAnimations = new HashMap(100);
        Object IiiiiiiiIIIII = "#([RGBKYWTXJQDPVZFHLnbur#]|[1][0-5][0-9]|[1][6][0-8]|[8][8][0-1]|[1-9]\\d|[0-9]|c[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?[0-9A-Fa-f]?)|[^#]+";
        pattern = Pattern.compile((String)IiiiiiiiIIIII);
        PATH = "sc/emoticons/";
        IiiiiiiiIIIII = new BufferedImage(1, 1, 8);
        tempG = ((BufferedImage)IiiiiiiiIIIII).getGraphics();
    }

    public void addText(String text) {
        this.text = String.valueOf(this.text) + text;
        this.parseText(text);
    }

    public void addText(String text, int size) {
        this.text = String.valueOf(this.text) + text;
        this.parseText(text);
        Dimension IiiiiiiiIIIII = this.computeSize(size);
        this.setSize(IiiiiiiiIIIII);
        this.setPreferredSize(IiiiiiiiIIIII);
    }

    public InputBean isMonitor(int x, int y) {
        if (!this.isInteractive) return null;
        int IiiiiiiiIIIII = this.sectionList.size();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII) {
            InputBean IiiiiiiiIIIII3;
            Object IiiiiiiiIIIII4 = this.sectionList.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII4 instanceof InputBean && (IiiiiiiiIIIII3 = (InputBean)IiiiiiiiIIIII4).getType() != -1 && IiiiiiiiIIIII3.isMonitor(x, y)) {
                return IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    public void remove() {
        this.sectionList.clear();
        this.isInteractive = false;
        this.disable();
    }

    public boolean isTextSize(String text, int size) {
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.text, (String)text)) {
            return false;
        }
        this.setTextSize(text, size);
        return true;
    }

    public void addList(Object object) {
        this.sectionList.add(object);
    }

    public RichLabel(String text, ArrayList<Object> sectionList, boolean isInteractive, Font font, int size) {
        this.text = text;
        this.font = font;
        this.sectionList = sectionList;
        this.isInteractive = isInteractive;
        this.setBackground(Color.RED);
        this.setForeground(Color.BLUE);
        this.setIgnoreRepaint(true);
        this.setBorder(null);
        this.setOpaque(false);
        Dimension IiiiiiiiIIIII = this.computeSize(size);
        this.setSize(IiiiiiiiIIIII);
        this.setPreferredSize(IiiiiiiiIIIII);
    }

    public String getText() {
        return this.text;
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag == this.isVisible()) return;
        this.show(aFlag);
    }

    @Override
    public void paintImmediately(int x, int y, int w, int h) {
    }

    public RichLabel(String text, Font font) {
        this.sectionList = new ArrayList();
        this.setBackground(Color.RED);
        this.setForeground(Color.BLUE);
        this.setIgnoreRepaint(true);
        this.setBorder(null);
        this.setOpaque(false);
        this.text = text;
        this.font = font;
        this.parseText(text);
        Dimension IiiiiiiiIIIII = new Dimension(98, 16);
        this.setSize(IiiiiiiiIIIII);
        this.setPreferredSize(IiiiiiiiIIIII);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ Point paintRichText(Graphics g, int x, int y, int width, int rowh, int start, int end) {
        if (this.lastStr != null) {
            if (this.lastBean != null) {
                IiiiiiiiIIIII = g.getColor();
                IiiiiiiiIIIII = g.getFontMetrics();
                if (this.lastBean.getColor2() != null) {
                    g.setColor(this.lastBean.getColor2());
                }
                g.drawString(this.lastStr, 0, y + rowh);
                if (this.lastBean.getType() != 1) {
                    g.drawLine(this.lastBean.isM() != false ? 1 : 0, y + 3 + rowh + (this.lastBean.isM() != false ? 1 : 0), IiiiiiiiIIIII.stringWidth(this.lastStr) + (this.lastBean.isM() != false ? 1 : 0), y + 3 + rowh + (this.lastBean.isM() != false ? 1 : 0));
                }
                g.setColor(IiiiiiiiIIIII);
            } else {
                g.drawString(this.lastStr, 0, y + rowh);
            }
            this.lastStr = null;
            this.lastBean = null;
        }
        IiiiiiiiIIIII = start;
        while (IiiiiiiiIIIII < end) {
            block28: {
                block30: {
                    block29: {
                        block27: {
                            block26: {
                                IiiiiiiiIIIII = this.sectionList.get(IiiiiiiiIIIII);
                                if (!(IiiiiiiiIIIII instanceof String)) break block26;
                                IiiiiiiiIIIII = (String)IiiiiiiiIIIII;
                                IiiiiiiiIIIII = g.getFontMetrics();
                                IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                                IiiiiiiiIIIII = 0;
                                IiiiiiiiIIIII = 0;
                                IiiiiiiiIIIII = 0;
                                if (true) ** GOTO lbl93
                            }
                            if (!(IiiiiiiiIIIII instanceof Color)) break block27;
                            g.setColor((Color)IiiiiiiiIIIII);
                            break block28;
                        }
                        if (!(IiiiiiiiIIIII instanceof iIIIIiiiIiiIi)) break block29;
                        IiiiiiiiIIIII = (iIIIIiiiIiiIi)IiiiiiiiIIIII;
                        IiiiiiiiIIIII.iiiIiiiiiiIIi(this.currTime - this.startTime);
                        g.drawImage(IiiiiiiiIIIII.ALLATORIxDEMO(), x, y + 4 + rowh - IiiiiiiiIIIII.ALLATORIxDEMO(), null);
                        x += IiiiiiiiIIIII.iIiIiiiiIIiii();
                        break block28;
                    }
                    if (!(IiiiiiiiIIIII instanceof InputBean)) break block30;
                    IiiiiiiiIIIII = (InputBean)IiiiiiiiIIIII;
                    if (IiiiiiiiIIIII.getType() == -1) break block28;
                    IiiiiiiiIIIII = g.getColor();
                    if (IiiiiiiiIIIII.getColor2() != null) {
                        g.setColor(IiiiiiiiIIIII.getColor2());
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getText();
                    IiiiiiiiIIIII = g.getFontMetrics();
                    if (IiiiiiiiIIIII.getHeight() == null) {
                        IiiiiiiiIIIII.setS_x(Integer.valueOf(x));
                        IiiiiiiiIIIII.setS_y(Integer.valueOf(y - IiiiiiiiIIIII.getHeight() + rowh));
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl123
                }
                if (IiiiiiiiIIIII instanceof RichBeauUnit) {
                    IiiiiiiiIIIII = (RichBeauUnit)IiiiiiiiIIIII;
                    IiiiiiiiIIIII = g.getFontMetrics();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getHeight();
                    IiiiiiiiIIIII = 2;
                    IiiiiiiiIIIII -= IiiiiiiiIIIII.getHeight();
                    IiiiiiiiIIIII += (IiiiiiiiIIIII - 18) / 2;
                    if (IiiiiiiiIIIII.isM()) {
                        g.drawImage(IiiiiiiiIIIII.getImage(), 1 + x, 1 + y + rowh + IiiiiiiiIIIII, null);
                    } else {
                        g.drawImage(IiiiiiiiIIIII.getImage(), x, y + rowh + IiiiiiiiIIIII, null);
                    }
                    x += IiiiiiiiIIIII.getWidth();
                }
                break block28;
                do {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.charWidth(IiiiiiiiIIIII.charAt(IiiiiiiiIIIII));
                    while (x + IiiiiiiiIIIII <= width) {
                        if (++IiiiiiiiIIIII >= IiiiiiiiIIIII) break;
                        IiiiiiiiIIIII += IiiiiiiiIIIII.charWidth(IiiiiiiiIIIII.charAt(IiiiiiiiIIIII));
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII == end - 1 && IiiiiiiiIIIII >= IiiiiiiiIIIII && x + IiiiiiiiIIIII < width && this.sectionList.size() > end) {
                        this.lastStr = IiiiiiiiIIIII;
                        IiiiiiiiIIIII = this.sectionList.get(end);
                        if (IiiiiiiiIIIII instanceof iIIIIiiiIiiIi && ((iIIIIiiiIiiIi)IiiiiiiiIIIII).iIiIiiiiIIiii() + x + IiiiiiiiIIIII > width || IiiiiiiiIIIII instanceof RichBeauUnit && ((RichBeauUnit)IiiiiiiiIIIII).getWidth() + x + IiiiiiiiIIIII > width) {
                            g.drawString(IiiiiiiiIIIII, x, y + rowh);
                            this.lastStr = null;
                        }
                    } else {
                        g.drawString(IiiiiiiiIIIII, x, y + rowh);
                    }
                    if (IiiiiiiiIIIII < IiiiiiiiIIIII || x + IiiiiiiiIIIII == width) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                        x = 0;
                        y += rowh;
                        rowh = IiiiiiiiIIIII.getHeight();
                        continue;
                    }
                    x += IiiiiiiiIIIII.stringWidth(IiiiiiiiIIIII);
lbl93:
                    // 3 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                break block28;
                do {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.charWidth(IiiiiiiiIIIII.charAt(IiiiiiiiIIIII));
                    while (x + IiiiiiiiIIIII <= width) {
                        if (++IiiiiiiiIIIII >= IiiiiiiiIIIII) break;
                        IiiiiiiiIIIII += IiiiiiiiIIIII.charWidth(IiiiiiiiIIIII.charAt(IiiiiiiiIIIII));
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII == end - 1 && IiiiiiiiIIIII >= IiiiiiiiIIIII && x + IiiiiiiiIIIII < width && this.sectionList.size() > end) {
                        this.lastStr = IiiiiiiiIIIII;
                        this.lastBean = IiiiiiiiIIIII;
                        IiiiiiiiIIIII = this.sectionList.get(end);
                        if (IiiiiiiiIIIII instanceof iIIIIiiiIiiIi && ((iIIIIiiiIiiIi)IiiiiiiiIIIII).iIiIiiiiIIiii() + x + IiiiiiiiIIIII > width || IiiiiiiiIIIII instanceof RichBeauUnit && ((RichBeauUnit)IiiiiiiiIIIII).getWidth() + x + IiiiiiiiIIIII > width) {
                            g.drawString(IiiiiiiiIIIII, x + (IiiiiiiiIIIII.isM() != false ? 1 : 0), y + rowh + (IiiiiiiiIIIII.isM() != false ? 1 : 0));
                            if (IiiiiiiiIIIII.getType() != 1) {
                                g.drawLine(x + (IiiiiiiiIIIII.isM() != false ? 1 : 0), y + 3 + rowh + (IiiiiiiiIIIII.isM() != false ? 1 : 0), x + IiiiiiiiIIIII.stringWidth(IiiiiiiiIIIII) + (IiiiiiiiIIIII.isM() != false ? 1 : 0), y + 3 + rowh + (IiiiiiiiIIIII.isM() != false ? 1 : 0));
                            }
                            this.lastStr = null;
                            this.lastBean = null;
                        }
                    } else {
                        g.drawString(IiiiiiiiIIIII, x + (IiiiiiiiIIIII.isM() != false ? 1 : 0), y + rowh + (IiiiiiiiIIIII.isM() != false ? 1 : 0));
                        if (IiiiiiiiIIIII.getType() != 1) {
                            g.drawLine(x + (IiiiiiiiIIIII.isM() != false ? 1 : 0), y + 3 + rowh + (IiiiiiiiIIIII.isM() != false ? 1 : 0), x + IiiiiiiiIIIII.stringWidth(IiiiiiiiIIIII) + (IiiiiiiiIIIII.isM() != false ? 1 : 0), y + 3 + rowh + (IiiiiiiiIIIII.isM() != false ? 1 : 0));
                        }
                    }
                    if (IiiiiiiiIIIII < IiiiiiiiIIIII || x + IiiiiiiiIIIII == width) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                        x = 0;
                        y += rowh;
                        rowh = IiiiiiiiIIIII.getHeight();
                        continue;
                    }
                    x += IiiiiiiiIIIII.stringWidth(IiiiiiiiIIIII);
lbl123:
                    // 3 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
                if (IiiiiiiiIIIII.getHeight() == null) {
                    IiiiiiiiIIIII.setHeight(Integer.valueOf(IiiiiiiiIIIII.getHeight()));
                    IiiiiiiiIIIII.setE_x(Integer.valueOf(x));
                    IiiiiiiiIIIII.setE_y(Integer.valueOf(y - IiiiiiiiIIIII.getHeight() + rowh));
                }
                g.setColor((Color)IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
        }
        this.point.move(x, y);
        return this.point;
    }

    public void clear() {
        this.text = null;
        this.sectionList.clear();
        this.isInteractive = false;
    }

    public RichLabel(String text, Font font, int size) {
        this.sectionList = new ArrayList();
        this.setBackground(Color.RED);
        this.setForeground(Color.BLUE);
        this.setIgnoreRepaint(true);
        this.setBorder(null);
        this.setOpaque(false);
        this.text = text;
        this.font = font;
        this.parseText(text);
        Dimension IiiiiiiiIIIII = this.computeSize(size);
        this.setSize(IiiiiiiiIIIII);
        this.setPreferredSize(IiiiiiiiIIIII);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D IiiiiiiiIIIII = null;
        Object IiiiiiiiIIIII2 = null;
        Object IiiiiiiiIIIII3 = null;
        Object IiiiiiiiIIIII4 = null;
        Object IiiiiiiiIIIII5 = null;
        Object IiiiiiiiIIIII6 = null;
        g.setFont(this.font != null ? this.font : iiIIiiiiIiiII.iiIiiiiiiIIiI);
        g.setColor(Color.WHITE);
        if (this.startTime == 0L) {
            this.startTime = System.currentTimeMillis();
        }
        this.currTime = System.currentTimeMillis();
        int IiiiiiiiIIIII7 = this.getWidth();
        int IiiiiiiiIIIII8 = 0;
        int IiiiiiiiIIIII9 = 0;
        int IiiiiiiiIIIII10 = 0;
        int IiiiiiiiIIIII11 = this.sectionList.size();
        int IiiiiiiiIIIII12 = 0;
        int IiiiiiiiIIIII13 = 0;
        if (IiiiiiiiIIIII7 == 1) {
            return;
        }
        int IiiiiiiiIIIII14 = 0;
        while (IiiiiiiiIIIII14 < IiiiiiiiIIIII11) {
            Object IiiiiiiiIIIII15;
            Object IiiiiiiiIIIII16 = this.sectionList.get(IiiiiiiiIIIII14);
            if (IiiiiiiiIIIII16 instanceof String) {
                String IiiiiiiiIIIII17 = (String)IiiiiiiiIIIII16;
                IiiiiiiiIIIII15 = g.getFontMetrics();
                IiiiiiiiIIIII10 = Math.max(IiiiiiiiIIIII10, ((FontMetrics)IiiiiiiiIIIII15).getHeight());
                int IiiiiiiiIIIII18 = ((FontMetrics)IiiiiiiiIIIII15).stringWidth(IiiiiiiiIIIII17);
                if (IiiiiiiiIIIII8 + IiiiiiiiIIIII18 <= IiiiiiiiIIIII7) {
                    IiiiiiiiIIIII8 += IiiiiiiiIIIII18;
                } else {
                    Point IiiiiiiiIIIII19 = this.paintRichText(g, IiiiiiiiIIIII13, IiiiiiiiIIIII9, IiiiiiiiIIIII7, IiiiiiiiIIIII10, IiiiiiiiIIIII12, IiiiiiiiIIIII14 + 1);
                    IiiiiiiiIIIII12 = IiiiiiiiIIIII14 + 1;
                    IiiiiiiiIIIII8 = IiiiiiiiIIIII19.x;
                    IiiiiiiiIIIII10 = ((FontMetrics)IiiiiiiiIIIII15).getHeight();
                    IiiiiiiiIIIII13 = IiiiiiiiIIIII19.x;
                    IiiiiiiiIIIII9 = IiiiiiiiIIIII19.y;
                }
            } else if (IiiiiiiiIIIII16 instanceof iIIIIiiiIiiIi) {
                iIIIIiiiIiiIi IiiiiiiiIIIII20 = (iIIIIiiiIiiIi)IiiiiiiiIIIII16;
                if (IiiiiiiiIIIII20.iIiIiiiiIIiii() + IiiiiiiiIIIII8 > IiiiiiiiIIIII7) {
                    this.paintRichText(g, IiiiiiiiIIIII13, IiiiiiiiIIIII9, IiiiiiiiIIIII7, IiiiiiiiIIIII10, IiiiiiiiIIIII12, IiiiiiiiIIIII14);
                    IiiiiiiiIIIII12 = IiiiiiiiIIIII14;
                    IiiiiiiiIIIII13 = 0;
                    IiiiiiiiIIIII9 += IiiiiiiiIIIII10;
                    IiiiiiiiIIIII8 = IiiiiiiiIIIII20.iIiIiiiiIIiii();
                    IiiiiiiiIIIII10 = IiiiiiiiIIIII20.ALLATORIxDEMO();
                } else {
                    IiiiiiiiIIIII10 = Math.max(IiiiiiiiIIIII10, IiiiiiiiIIIII20.ALLATORIxDEMO());
                    IiiiiiiiIIIII8 += IiiiiiiiIIIII20.iIiIiiiiIIiii();
                }
            } else if (IiiiiiiiIIIII16 instanceof Integer) {
                int IiiiiiiiIIIII21 = (Integer)IiiiiiiiIIIII16;
                if (IiiiiiiiIIIII21 == -1) {
                    this.paintRichText(g, IiiiiiiiIIIII13, IiiiiiiiIIIII9, IiiiiiiiIIIII7, IiiiiiiiIIIII10, IiiiiiiiIIIII12, IiiiiiiiIIIII14 + 1);
                    IiiiiiiiIIIII12 = IiiiiiiiIIIII14;
                    IiiiiiiiIIIII13 = 0;
                    IiiiiiiiIIIII9 += IiiiiiiiIIIII10;
                    IiiiiiiiIIIII8 = 0;
                    IiiiiiiiIIIII10 = 0;
                } else if (IiiiiiiiIIIII21 == -2 && IiiiiiiiIIIII14 == 0) {
                    Graphics2D graphics2D = IiiiiiiiIIIII = (Graphics2D)g;
                    Graphics2D graphics2D2 = IiiiiiiiIIIII;
                    IiiiiiiiIIIII2 = graphics2D2.getRenderingHint(RenderingHints.KEY_RENDERING);
                    IiiiiiiiIIIII3 = graphics2D.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
                    IiiiiiiiIIIII4 = graphics2D2.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
                    IiiiiiiiIIIII5 = graphics2D.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
                    if (IiiiiiiiIIIII2 != RenderingHints.VALUE_RENDER_QUALITY) {
                        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                    } else {
                        IiiiiiiiIIIII2 = null;
                    }
                    if (IiiiiiiiIIIII3 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
                        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
                    } else {
                        IiiiiiiiIIIII3 = null;
                    }
                    if (IiiiiiiiIIIII4 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
                        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                    } else {
                        IiiiiiiiIIIII4 = null;
                    }
                    if (IiiiiiiiIIIII5 != RenderingHints.VALUE_STROKE_DEFAULT) {
                        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
                    } else {
                        IiiiiiiiIIIII5 = null;
                    }
                    if (IiiiiiiiIIIII6 != RenderingHints.VALUE_ANTIALIAS_ON) {
                        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    } else {
                        IiiiiiiiIIIII6 = null;
                    }
                }
            } else if (IiiiiiiiIIIII16 instanceof InputBean) {
                InputBean IiiiiiiiIIIII22 = (InputBean)IiiiiiiiIIIII16;
                if (IiiiiiiiIIIII22.getType() != -1) {
                    IiiiiiiiIIIII15 = IiiiiiiiIIIII22.getText();
                    FontMetrics IiiiiiiiIIIII23 = g.getFontMetrics();
                    IiiiiiiiIIIII10 = Math.max(IiiiiiiiIIIII10, IiiiiiiiIIIII23.getHeight());
                    int IiiiiiiiIIIII24 = IiiiiiiiIIIII23.stringWidth((String)IiiiiiiiIIIII15);
                    if (IiiiiiiiIIIII8 + IiiiiiiiIIIII24 <= IiiiiiiiIIIII7) {
                        IiiiiiiiIIIII8 += IiiiiiiiIIIII24;
                    } else {
                        Point IiiiiiiiIIIII25 = this.paintRichText(g, IiiiiiiiIIIII13, IiiiiiiiIIIII9, IiiiiiiiIIIII7, IiiiiiiiIIIII10, IiiiiiiiIIIII12, IiiiiiiiIIIII14 + 1);
                        IiiiiiiiIIIII12 = IiiiiiiiIIIII14 + 1;
                        IiiiiiiiIIIII8 = IiiiiiiiIIIII25.x;
                        IiiiiiiiIIIII10 = IiiiiiiiIIIII23.getHeight();
                        IiiiiiiiIIIII13 = IiiiiiiiIIIII25.x;
                        IiiiiiiiIIIII9 = IiiiiiiiIIIII25.y;
                    }
                }
            } else if (IiiiiiiiIIIII16 instanceof RichBeauUnit) {
                RichBeauUnit IiiiiiiiIIIII26 = (RichBeauUnit)IiiiiiiiIIIII16;
                if (IiiiiiiiIIIII26.getWidth() + IiiiiiiiIIIII8 > IiiiiiiiIIIII7) {
                    this.paintRichText(g, IiiiiiiiIIIII13, IiiiiiiiIIIII9, IiiiiiiiIIIII7, IiiiiiiiIIIII10, IiiiiiiiIIIII12, IiiiiiiiIIIII14);
                    IiiiiiiiIIIII12 = IiiiiiiiIIIII14;
                    IiiiiiiiIIIII13 = 0;
                    IiiiiiiiIIIII9 += IiiiiiiiIIIII10;
                    IiiiiiiiIIIII8 = IiiiiiiiIIIII26.getWidth();
                    IiiiiiiiIIIII10 = IiiiiiiiIIIII26.getHeight();
                } else {
                    IiiiiiiiIIIII10 = Math.max(IiiiiiiiIIIII10, 18);
                    IiiiiiiiIIIII8 += IiiiiiiiIIIII26.getWidth();
                }
            }
            ++IiiiiiiiIIIII14;
        }
        this.paintRichText(g, IiiiiiiiIIIII13, IiiiiiiiIIIII9, IiiiiiiiIIIII7, IiiiiiiiIIIII10, IiiiiiiiIIIII12, IiiiiiiiIIIII11);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_RENDERING, IiiiiiiiIIIII2);
        }
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, IiiiiiiiIIIII3);
        }
        if (IiiiiiiiIIIII4 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, IiiiiiiiIIIII4);
        }
        if (IiiiiiiiIIIII5 != null) {
            IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII5);
        }
        if (IiiiiiiiIIIII6 == null) return;
        IiiiiiiiIIIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII6);
    }

    @Override
    public void setFont(Font font) {
        this.font = font;
    }

    public RichLabel() {
        this(null, null);
    }

    public void setTextSize(String text, int size) {
        this.text = text;
        this.sectionList.clear();
        this.isInteractive = false;
        this.parseText(text);
        Dimension IiiiiiiiIIIII = this.computeSize(size);
        this.setSize(IiiiiiiiIIIII);
        this.setPreferredSize(IiiiiiiiIIIII);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public Dimension computeSize(int maxwidth) {
        if (this.sectionList.size() == 0) {
            return new Dimension(1, 1);
        }
        Graphics graphics = tempG;
        synchronized (graphics) {
            Graphics IiiiiiiiIIIII;
            int IiiiiiiiIIIII2 = 0;
            int IiiiiiiiIIIII3 = 0;
            int IiiiiiiiIIIII4 = 0;
            int IiiiiiiiIIIII5 = this.sectionList.size();
            int IiiiiiiiIIIII6 = 0;
            int IiiiiiiiIIIII7 = 0;
            Graphics2D IiiiiiiiIIIII8 = null;
            Object IiiiiiiiIIIII9 = null;
            Object IiiiiiiiIIIII10 = null;
            Object IiiiiiiiIIIII11 = null;
            Object IiiiiiiiIIIII12 = null;
            Object IiiiiiiiIIIII13 = null;
            Graphics graphics2 = IiiiiiiiIIIII = tempG;
            Font font = this.font != null ? this.font : iiIIiiiiIiiII.iiIiiiiiiIIiI;
            {
                graphics2.setFont(font);
                boolean IiiiiiiiIIIII14 = false;
                int IiiiiiiiIIIII15 = 0;
                while (IiiiiiiiIIIII15 < IiiiiiiiIIIII5) {
                    Object IiiiiiiiIIIII16;
                    Object IiiiiiiiIIIII17 = this.sectionList.get(IiiiiiiiIIIII15);
                    if (IiiiiiiiIIIII17 instanceof String) {
                        String IiiiiiiiIIIII18 = (String)IiiiiiiiIIIII17;
                        IiiiiiiiIIIII16 = IiiiiiiiIIIII.getFontMetrics();
                        IiiiiiiiIIIII4 = Math.max(IiiiiiiiIIIII4, ((FontMetrics)IiiiiiiiIIIII16).getHeight());
                        int IiiiiiiiIIIII19 = ((FontMetrics)IiiiiiiiIIIII16).stringWidth(IiiiiiiiIIIII18);
                        if (IiiiiiiiIIIII2 + IiiiiiiiIIIII19 <= maxwidth) {
                            IiiiiiiiIIIII2 += IiiiiiiiIIIII19;
                        } else {
                            Point IiiiiiiiIIIII20 = this.paintRichText(IiiiiiiiIIIII, IiiiiiiiIIIII7, IiiiiiiiIIIII3, maxwidth, IiiiiiiiIIIII4, IiiiiiiiIIIII6, IiiiiiiiIIIII15 + 1);
                            IiiiiiiiIIIII6 = IiiiiiiiIIIII15 + 1;
                            IiiiiiiiIIIII2 = IiiiiiiiIIIII20.x;
                            IiiiiiiiIIIII4 = ((FontMetrics)IiiiiiiiIIIII16).getHeight();
                            IiiiiiiiIIIII7 = IiiiiiiiIIIII20.x;
                            IiiiiiiiIIIII3 = IiiiiiiiIIIII20.y;
                        }
                    } else if (IiiiiiiiIIIII17 instanceof iIIIIiiiIiiIi) {
                        iIIIIiiiIiiIi IiiiiiiiIIIII21 = (iIIIIiiiIiiIi)IiiiiiiiIIIII17;
                        if (IiiiiiiiIIIII21.iIiIiiiiIIiii() + IiiiiiiiIIIII2 > maxwidth) {
                            this.paintRichText(IiiiiiiiIIIII, IiiiiiiiIIIII7, IiiiiiiiIIIII3, maxwidth, IiiiiiiiIIIII4, IiiiiiiiIIIII6, IiiiiiiiIIIII15);
                            IiiiiiiiIIIII6 = IiiiiiiiIIIII15;
                            IiiiiiiiIIIII7 = 0;
                            IiiiiiiiIIIII3 += IiiiiiiiIIIII4;
                            IiiiiiiiIIIII2 = IiiiiiiiIIIII21.iIiIiiiiIIiii();
                            IiiiiiiiIIIII4 = IiiiiiiiIIIII21.ALLATORIxDEMO();
                        } else {
                            IiiiiiiiIIIII4 = Math.max(IiiiiiiiIIIII4, IiiiiiiiIIIII21.ALLATORIxDEMO());
                            IiiiiiiiIIIII2 += IiiiiiiiIIIII21.iIiIiiiiIIiii();
                        }
                    } else if (IiiiiiiiIIIII17 instanceof Integer) {
                        int IiiiiiiiIIIII22 = (Integer)IiiiiiiiIIIII17;
                        if (IiiiiiiiIIIII22 == -1) {
                            this.paintRichText(IiiiiiiiIIIII, IiiiiiiiIIIII7, IiiiiiiiIIIII3, maxwidth, IiiiiiiiIIIII4, IiiiiiiiIIIII6, IiiiiiiiIIIII15 + 1);
                            IiiiiiiiIIIII6 = IiiiiiiiIIIII15;
                            IiiiiiiiIIIII7 = 0;
                            IiiiiiiiIIIII3 += IiiiiiiiIIIII4;
                            IiiiiiiiIIIII2 = 0;
                            IiiiiiiiIIIII4 = 0;
                        } else if (IiiiiiiiIIIII22 == -2 && IiiiiiiiIIIII15 == 0) {
                            Graphics2D graphics2D = IiiiiiiiIIIII8 = (Graphics2D)IiiiiiiiIIIII;
                            Graphics2D graphics2D2 = IiiiiiiiIIIII8;
                            IiiiiiiiIIIII9 = graphics2D2.getRenderingHint(RenderingHints.KEY_RENDERING);
                            IiiiiiiiIIIII10 = graphics2D.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
                            IiiiiiiiIIIII11 = graphics2D2.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
                            IiiiiiiiIIIII12 = graphics2D.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
                            IiiiiiiiIIIII13 = IiiiiiiiIIIII8.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
                            if (IiiiiiiiIIIII9 != RenderingHints.VALUE_RENDER_QUALITY) {
                                IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                            } else {
                                IiiiiiiiIIIII9 = null;
                            }
                            if (IiiiiiiiIIIII10 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
                                IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
                            } else {
                                IiiiiiiiIIIII10 = null;
                            }
                            if (IiiiiiiiIIIII11 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
                                IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                            } else {
                                IiiiiiiiIIIII11 = null;
                            }
                            if (IiiiiiiiIIIII12 != RenderingHints.VALUE_STROKE_DEFAULT) {
                                IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
                            } else {
                                IiiiiiiiIIIII12 = null;
                            }
                            if (IiiiiiiiIIIII13 != RenderingHints.VALUE_ANTIALIAS_ON) {
                                IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                            } else {
                                IiiiiiiiIIIII13 = null;
                            }
                        }
                    } else if (IiiiiiiiIIIII17 instanceof InputBean) {
                        InputBean IiiiiiiiIIIII23 = (InputBean)IiiiiiiiIIIII17;
                        if (IiiiiiiiIIIII23.getType() == -1) {
                            IiiiiiiiIIIII14 = true;
                        } else {
                            IiiiiiiiIIIII16 = IiiiiiiiIIIII23.getText();
                            FontMetrics IiiiiiiiIIIII24 = IiiiiiiiIIIII.getFontMetrics();
                            IiiiiiiiIIIII4 = Math.max(IiiiiiiiIIIII4, IiiiiiiiIIIII24.getHeight());
                            int IiiiiiiiIIIII25 = IiiiiiiiIIIII24.stringWidth((String)IiiiiiiiIIIII16);
                            if (IiiiiiiiIIIII2 + IiiiiiiiIIIII25 <= maxwidth) {
                                IiiiiiiiIIIII2 += IiiiiiiiIIIII25;
                            } else {
                                Point IiiiiiiiIIIII26 = this.paintRichText(IiiiiiiiIIIII, IiiiiiiiIIIII7, IiiiiiiiIIIII3, maxwidth, IiiiiiiiIIIII4, IiiiiiiiIIIII6, IiiiiiiiIIIII15 + 1);
                                IiiiiiiiIIIII6 = IiiiiiiiIIIII15 + 1;
                                IiiiiiiiIIIII2 = IiiiiiiiIIIII26.x;
                                IiiiiiiiIIIII4 = IiiiiiiiIIIII24.getHeight();
                                IiiiiiiiIIIII7 = IiiiiiiiIIIII26.x;
                                IiiiiiiiIIIII3 = IiiiiiiiIIIII26.y;
                            }
                        }
                    } else if (IiiiiiiiIIIII17 instanceof RichBeauUnit) {
                        RichBeauUnit IiiiiiiiIIIII27 = (RichBeauUnit)IiiiiiiiIIIII17;
                        if (IiiiiiiiIIIII27.getWidth() + IiiiiiiiIIIII2 > maxwidth) {
                            this.paintRichText(IiiiiiiiIIIII, IiiiiiiiIIIII7, IiiiiiiiIIIII3, maxwidth, IiiiiiiiIIIII4, IiiiiiiiIIIII6, IiiiiiiiIIIII15);
                            IiiiiiiiIIIII6 = IiiiiiiiIIIII15;
                            IiiiiiiiIIIII7 = 0;
                            IiiiiiiiIIIII3 += IiiiiiiiIIIII4;
                            IiiiiiiiIIIII4 = 18;
                            IiiiiiiiIIIII2 = IiiiiiiiIIIII27.getWidth();
                        } else {
                            IiiiiiiiIIIII4 = Math.max(IiiiiiiiIIIII4, 18);
                            IiiiiiiiIIIII2 += IiiiiiiiIIIII27.getWidth();
                        }
                    }
                    ++IiiiiiiiIIIII15;
                }
                if (IiiiiiiiIIIII8 != null) {
                    if (IiiiiiiiIIIII9 != null) {
                        IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_RENDERING, IiiiiiiiIIIII9);
                    }
                    if (IiiiiiiiIIIII10 != null) {
                        IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, IiiiiiiiIIIII10);
                    }
                    if (IiiiiiiiIIIII11 != null) {
                        IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, IiiiiiiiIIIII11);
                    }
                    if (IiiiiiiiIIIII12 != null) {
                        IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, IiiiiiiiIIIII12);
                    }
                    if (IiiiiiiiIIIII13 != null) {
                        IiiiiiiiIIIII8.setRenderingHint(RenderingHints.KEY_ANTIALIASING, IiiiiiiiIIIII13);
                    }
                }
                Point IiiiiiiiIIIII22 = this.paintRichText(IiiiiiiiIIIII, IiiiiiiiIIIII7, IiiiiiiiIIIII3, maxwidth, IiiiiiiiIIIII4, IiiiiiiiIIIII6, IiiiiiiiIIIII5);
                if (IiiiiiiiIIIII14) {
                    maxwidth = 0;
                } else {
                    if (IiiiiiiiIIIII3 != 0) return new Dimension(maxwidth, IiiiiiiiIIIII3 + IiiiiiiiIIIII4 + 4);
                    if (IiiiiiiiIIIII22.x == 0) return new Dimension(maxwidth, IiiiiiiiIIIII3 + IiiiiiiiIIIII4 + 4);
                    maxwidth = IiiiiiiiIIIII22.x;
                }
                return new Dimension(maxwidth, IiiiiiiiIIIII3 + IiiiiiiiIIIII4 + 4);
            }
        }
    }

    public static int gethead(String head) {
        if (head.equals("T")) {
            return 400;
        }
        if (head.equals("X")) {
            return 401;
        }
        if (head.equals("J")) {
            return 402;
        }
        if (head.equals("Q")) {
            return 403;
        }
        if (head.equals("D")) {
            return 404;
        }
        if (head.equals("F")) {
            return 406;
        }
        if (!head.equals("H")) return 405;
        return 407;
    }
}
