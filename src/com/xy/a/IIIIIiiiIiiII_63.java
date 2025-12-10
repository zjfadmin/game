/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIiIii
 *  com.xy.a.IIiIiiiiIiIII
 *  com.xy.a.iiIIiiiiIiiII
 *  com.xy.a.iiIiIiiiiIiii
 *  com.xy.bean.Coordinates
 *  com.xy.game.RoleData
 *  com.xy.game.RoleTaskData
 *  com.xy.game.Task
 *  com.xy.game.TaskProgress
 *  com.xy.i.IIIIIiiiIIIiI
 *  com.xy.q.IIIIIiiiIiiII
 *  com.xy.q.IiIIIiiiiIIiI
 *  com.xy.q.IiiiIiiiiIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.AllTask
 *  com.xy.readbean.TaskData
 *  com.xy.readbean.TaskSet
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.text.GameView
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIIiiiiiIiIiI
 */
package com.xy.a;

import com.xy.a.IIIIIiiiIiIii;
import com.xy.a.IIiIiiiiIiIII;
import com.xy.a.iiIIiiiiIiiII;
import com.xy.a.iiIiIiiiiIiii;
import com.xy.bean.Coordinates;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.i.IIIIIiiiIIIiI;
import com.xy.q.IiIIIiiiiIIiI;
import com.xy.q.IiiiIiiiiIiIi;
import com.xy.readbean.AllTask;
import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIIiiiiiIiIiI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiiII
extends IiiiIiiiiIiIi {
    private RichLabel IiIiiiiiIIIII;
    private IIIiiiiiIiIiI[] iiIiIiiiiIIIi;
    private int iiiiIiiiIiiII;
    private JScrollPane iiiIiiiiiiiIi;
    private List<Integer> iIiiIiiiiiiII = new ArrayList<Integer>();
    private InputBean IIiiIiiiIIiIi;
    private JLabel[] iIiIiiiiIiIii;
    private JScrollPane IiIIIiiiiIiiI;
    private IIIIIiiiIIIiI iiIiiiiiiiIii;
    private JTree IiiiiiiiIIIII;
    private DefaultMutableTreeNode ALLATORIxDEMO;

    public IIIIIiiiIiiII(GameView gameView) {
        super(3, 2, IiiiIiiiiIiIi.iIIIIiiiiiIIi, gameView);
        this.ALLATORIxDEMO(-1, 0, 582, 415, IiiiIiiiiIiIi.iiIIIiiiiiiiI);
        this.ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/1.png", (int)68, (int)68, (int)68, (int)68, (boolean)false), "\u4efb\u52a1\u680f");
        this.iIiIiiiiIiIii = new JLabel[2];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.iIiIiiiiIiIii.length) {
            if (IiiiiiiiIIIII != 7 && IiiiiiiiIIIII != 8) {
                this.iIiIiiiiIiIii[IiiiiiiiIIIII] = IiIIIiiiiIIiI.ALLATORIxDEMO((int)0, (int)0, (int)0, (int)0, (int)(IiiiiiiiIIIII == 0 ? 10 : 0), (Color)Color.white, (Font)com.xy.q.iiIIiiiiIiiII.iiiiIiiiIiiII);
                this.iIiIiiiiIiIii[IiiiiiiiIIIII].setText(IiiiiiiiIIIII == 0 ? "\u4efb\u52a1\u5217\u8868" : (IiiiiiiiIIIII == 1 ? "\u4efb\u52a1\u8be6\u60c5" : ""));
                if (IiiiiiiiIIIII == 0) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(53, 58, 214, 21);
                } else if (IiiiiiiiIIIII == 1) {
                    this.iIiIiiiiIiIii[IiiiiiiiIIIII].setBounds(275, 58, 287, 21);
                }
                this.add(this.iIiIiiiiIiIii[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        this.ALLATORIxDEMO = new DefaultMutableTreeNode();
        this.IiiiiiiiIIIII = new JTree(this.ALLATORIxDEMO);
        this.IiiiiiiiIIIII.setOpaque(false);
        this.IiiiiiiiIIIII.putClientProperty("JTree.lineStyle", "None");
        ((BasicTreeUI)this.IiiiiiiiIIIII.getUI()).setLeftChildIndent(0);
        IIiIiiiiIiIII IiiiiiiiIIIII2 = new IIiIiiiiIiIII(this);
        IiiiiiiiIIIII2.setLeafIcon(null);
        IiiiiiiiIIIII2.setOpenIcon(com.xy.q.IIIIIiiiIiiII.iiiiIiiiIiiII);
        IiiiiiiiIIIII2.setClosedIcon(com.xy.q.IIIIIiiiIiiII.ALLATORIxDEMO);
        IiiiiiiiIIIII2.setFont(com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI);
        IiiiiiiiIIIII2.setBackgroundNonSelectionColor(com.xy.q.iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.setBackgroundSelectionColor(new Color(99, 93, 90));
        IiiiiiiiIIIII2.setBorderSelectionColor(com.xy.q.iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.setTextNonSelectionColor(Color.white);
        IiiiiiiiIIIII2.setTextSelectionColor(Color.white);
        this.IiiiiiiiIIIII.setCellRenderer((TreeCellRenderer)IiiiiiiiIIIII2);
        this.IiiiiiiiIIIII.setRootVisible(false);
        this.IiiiiiiiIIIII.setRowHeight(20);
        this.IiiiiiiiIIIII.addMouseListener((MouseListener)new iiIiIiiiiIiii(this));
        this.IiiiiiiiIIIII.addTreeSelectionListener((TreeSelectionListener)new iiIIiiiiIiiII(this));
        this.IiIiiiiiIIIII = new RichLabel("", com.xy.q.iiIIiiiiIiiII.iIiIIiiiiIIiI, 287);
        this.IiIiiiiiIIIII.addMouseListener((MouseListener)new IIIIIiiiIiIii(this));
        this.IiIIIiiiiIiiI = IiIIIiiiiIIiI.ALLATORIxDEMO((int)50, (int)79, (int)217, (int)307, (Component)this.IiiiiiiiIIIII, (int)190);
        this.add(this.IiIIIiiiiIiiI);
        this.iiiIiiiiiiiIi = IiIIIiiiiIIiI.ALLATORIxDEMO((int)275, (int)79, (int)287, (int)307, (Component)this.IiIiiiiiIIIII, (int)190);
        this.add(this.iiiIiiiiiiiIi);
        this.iiIiiiiiiiIii = new IIIIIiiiIIIiI("sc/e/28.png", 1, 115, com.xy.q.iiIIiiiiIiiII.iiIiiiiiiIIiI, com.xy.q.iiIIiiiiIiiII.iIiiIiiiiiIIi, "\u53d6\u6d88\u4efb\u52a1", (IiiiIiiiiIiIi)this);
        this.iiIiiiiiiiIii.setBounds(490, 38, 68, 17);
        this.add((Component)this.iiIiiiiiiiIii);
        this.iiIiIiiiiIIIi = new IIIiiiiiIiIiI[5];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.iiIiIiiiiIIIi.length) {
            this.iiIiIiiiiIIIi[IiiiiiiiIIIII3] = new IIIiiiiiIiIiI();
            if (IiiiiiiiIIIII3 == 0) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(50, 58, 217, 21);
            } else if (IiiiiiiiIIIII3 == 1) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/25.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(275, 58, 287, 21);
            } else if (IiiiiiiiIIIII3 == 2) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(50, 58, 217, 328);
            } else if (IiiiiiiiIIIII3 == 3) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/24.png", (int)2, (int)2, (int)2, (int)2, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(275, 58, 287, 328);
            } else if (IiiiiiiiIIIII3 == 4) {
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].ALLATORIxDEMO(com.xy.w.IIIIIiiiIiiII.ALLATORIxDEMO((String)"sc/d/35.png", (int)80, (int)10, (int)80, (int)10, (boolean)false));
                this.iiIiIiiiiIIIi[IiiiiiiiIIIII3].setBounds(38, 36, 532, 20);
            }
            this.add((Component)this.iiIiIiiiiIIIi[IiiiiiiiIIIII3++]);
        }
    }

    public void ALLATORIxDEMO(Task task, TaskData taskData) {
        TaskSet IiiiiiiiIIIII;
        int n = this.iiiiIiiiIiiII = taskData != null ? taskData.getTaskID() : 0;
        if (taskData == null) {
            this.IiIiiiiiIIIII.setTextSize("", 287);
            return;
        }
        if (task == null) return;
        IiiiiiiiiIIII IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        if (taskData.getTaskText() != null) {
            IiiiiiiiIIIII3.append("#Y\u4efb\u52a1\u76ee\u7684:#r#W");
            String IiiiiiiiIIIII4 = taskData.getTaskText();
            int IiiiiiiiIIIII5 = -1;
            int IiiiiiiiIIIII6 = -1;
            int IiiiiiiiIIIII7 = 0;
            do {
                InputBean IiiiiiiiIIIII8;
                Coordinates IiiiiiiiIIIII9;
                TaskProgress IiiiiiiiIIIII10;
                if ((IiiiiiiiIIIII5 = IiiiiiiiIIIII4.indexOf("{")) != -1) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII4.indexOf("}");
                }
                if (IiiiiiiiIIIII5 == -1 || IiiiiiiiIIIII6 == -1) {
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII4);
                    continue;
                }
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII4.substring(0, IiiiiiiiIIIII5));
                String IiiiiiiiIIIII11 = IiiiiiiiIIIII4.substring(IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII6);
                if (IiiiiiiiIIIII11.startsWith("\u76ee\u6807")) {
                    if (IiiiiiiiIIIII7 < task.getProgress().size()) {
                        IiiiiiiiIIIII10 = (TaskProgress)task.getProgress().get(IiiiiiiiIIIII7);
                        if (IiiiiiiiIIIII10.getType() == 0 || IiiiiiiiIIIII10.getType() == 1 || IiiiiiiiIIIII10.getType() == 2 || IiiiiiiiIIIII10.getType() == 3) {
                            if (IiiiiiiiIIIII10.getMap() == 0) {
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getDName());
                            } else {
                                IiiiiiiiIIIII9 = new Coordinates(IiiiiiiiIIIII10.getMap(), IiiiiiiiIIIII10.getX(), IiiiiiiiIIIII10.getY());
                                IiiiiiiiIIIII8 = new InputBean(null, IiiiiiiiIIIII10.getType() + 20, new BigDecimal(IiiiiiiiIIIII10.getDId()), IiiiiiiiIIIII10.getDName(), "G", IiiiiiiiIIIII9);
                                if (IiiiiiiiIIIII10.getType() == 1) {
                                    IiiiiiiiIIIII3.append("#G");
                                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII2.iiiIiiiiiiIIi(String.valueOf(IiiiiiiiIIIII10.getMap())));
                                    IiiiiiiiIIIII3.append("#W\u51fb\u6740");
                                }
                                IiiiiiiiIIIII3.append("#V");
                                IiiiiiiiIIIII3.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
                                IiiiiiiiIIIII3.append("#L");
                                IiiiiiiiIIIII3.append("(");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getX() / 20);
                                IiiiiiiiIIIII3.append(",");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getY() / 20);
                                IiiiiiiiIIIII3.append(")");
                            }
                        } else if (IiiiiiiiIIIII10.getType() == 4) {
                            IiiiiiiiIIIII3.append("\u5e26\u7740");
                            IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getMax());
                            IiiiiiiiIIIII3.append("\u4e2a");
                            IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getDName());
                            IiiiiiiiIIIII3.append("\u63a2\u671b");
                            if (IiiiiiiiIIIII10.getMap() == 0) {
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getGName());
                            } else {
                                IiiiiiiiIIIII9 = new Coordinates(IiiiiiiiIIIII10.getMap(), IiiiiiiiIIIII10.getX(), IiiiiiiiIIIII10.getY());
                                IiiiiiiiIIIII8 = new InputBean(null, IiiiiiiiIIIII10.getType() + 20, new BigDecimal(IiiiiiiiIIIII10.getGId()), IiiiiiiiIIIII10.getGName(), "G", IiiiiiiiIIIII9);
                                IiiiiiiiIIIII3.append("#V");
                                IiiiiiiiIIIII3.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
                                IiiiiiiiIIIII3.append("#L");
                                IiiiiiiiIIIII3.append("(");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getX() / 20);
                                IiiiiiiiIIIII3.append(",");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getY() / 20);
                                IiiiiiiiIIIII3.append(")");
                            }
                        } else if (IiiiiiiiIIIII10.getType() == 5) {
                            IiiiiiiiIIIII3.append("\u62a4\u9001");
                            IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getDName());
                            IiiiiiiiIIIII3.append("\u5230");
                            if (IiiiiiiiIIIII10.getMap() == 0) {
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getGName());
                            } else {
                                IiiiiiiiIIIII9 = new Coordinates(IiiiiiiiIIIII10.getMap(), IiiiiiiiIIIII10.getX(), IiiiiiiiIIIII10.getY());
                                IiiiiiiiIIIII8 = new InputBean(null, IiiiiiiiIIIII10.getType() + 20, new BigDecimal(IiiiiiiiIIIII10.getGId()), IiiiiiiiIIIII10.getGName(), "G", IiiiiiiiIIIII9);
                                IiiiiiiiIIIII3.append("#V");
                                IiiiiiiiIIIII3.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
                                IiiiiiiiIIIII3.append("#L");
                                IiiiiiiiIIIII3.append("(");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getX() / 20);
                                IiiiiiiiIIIII3.append(",");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getY() / 20);
                                IiiiiiiiIIIII3.append(")");
                            }
                        } else if (IiiiiiiiIIIII10.getType() == 7) {
                            IiiiiiiiIIIII3.append("\u524d\u5f80");
                            if (IiiiiiiiIIIII10.getMap() == 0) {
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getGName());
                            } else {
                                IiiiiiiiIIIII9 = new Coordinates(IiiiiiiiIIIII10.getMap(), IiiiiiiiIIIII10.getX(), IiiiiiiiIIIII10.getY());
                                IiiiiiiiIIIII8 = new InputBean(null, IiiiiiiiIIIII10.getType() + 20, new BigDecimal(IiiiiiiiIIIII10.getGId()), IiiiiiiiIIIII10.getGName(), "G", IiiiiiiiIIIII9);
                                IiiiiiiiIIIII3.append("#V");
                                IiiiiiiiIIIII3.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
                                IiiiiiiiIIIII3.append("#L");
                                IiiiiiiiIIIII3.append("(");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getX() / 20);
                                IiiiiiiiIIIII3.append(",");
                                IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getY() / 20);
                                IiiiiiiiIIIII3.append(")");
                            }
                            IiiiiiiiIIIII3.append("\u5b8c\u6210");
                            IiiiiiiiIIIII3.append(IiiiiiiiIIIII10.getMax());
                            IiiiiiiiIIIII3.append("\u6b21\u7b54\u9898");
                        }
                    }
                    ++IiiiiiiiIIIII7;
                } else if (IiiiiiiiIIIII11.startsWith("\u4f4d\u7f6e")) {
                    IiiiiiiiIIIII10 = IiiiiiiiIIIII11.split("-");
                    IiiiiiiiIIIII9 = new Coordinates(Integer.parseInt((String)IiiiiiiiIIIII10[1]), Integer.parseInt((String)IiiiiiiiIIIII10[2]), Integer.parseInt((String)IiiiiiiiIIIII10[3]));
                    IiiiiiiiIIIII8 = new InputBean(null, 10, null, IiiiiiiiIIIII10[1].substring(2), "G", IiiiiiiiIIIII9);
                    IiiiiiiiIIIII3.append("#V");
                    IiiiiiiiIIIII3.append(iiIiiiiiIIiii.ALLATORIxDEMO().toJson(IiiiiiiiIIIII8));
                    IiiiiiiiIIIII3.append("#L");
                    IiiiiiiiIIIII3.append("(");
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII9.getX() / 20);
                    IiiiiiiiIIIII3.append(",");
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII9.getY() / 20);
                    IiiiiiiiIIIII3.append(")");
                }
                IiiiiiiiIIIII4 = IiiiiiiiIIIII4.substring(IiiiiiiiIIIII6 + 1);
            } while (IiiiiiiiIIIII5 != -1 && IiiiiiiiIIIII6 != -1);
        }
        if (task.getProgress().size() != 0) {
            if (IiiiiiiiIIIII3.length() != 0) {
                IiiiiiiiIIIII3.append("#r #r");
            }
            IiiiiiiiIIIII3.append("#Y\u4efb\u52a1\u72b6\u6001:");
            int IiiiiiiiIIIII12 = 0;
            while (IiiiiiiiIIIII12 < task.getProgress().size()) {
                TaskProgress IiiiiiiiIIIII13 = (TaskProgress)task.getProgress().get(IiiiiiiiIIIII12);
                IiiiiiiiIIIII3.append("#r#W");
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII13.getType() == 7 ? "\u7b54\u9898" : (IiiiiiiiIIIII13.getType() == 6 ? "\u5de1\u903b" : IiiiiiiiIIIII13.getDName()));
                IiiiiiiiIIIII3.append(":#G");
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII13.getSum());
                IiiiiiiiIIIII3.append("/");
                ++IiiiiiiiIIIII12;
                IiiiiiiiIIIII3.append(IiiiiiiiIIIII13.getMax());
            }
        }
        if ((IiiiiiiiIIIII = taskData.getTaskSet()).getTaskMsg() != null) {
            if (IiiiiiiiIIIII3.length() != 0) {
                IiiiiiiiIIIII3.append("#r #r");
            }
            IiiiiiiiIIIII3.append("#Y\u4efb\u52a1\u63d0\u793a:#r#W");
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII.getTaskMsg());
        }
        this.IiIiiiiiIIIII.setTextSize(IiiiiiiiIIIII3.toString(), 287);
    }

    static /* synthetic */ InputBean ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.IIiiIiiiIIiIi;
    }

    public void iiiIiiiiiiIIi() {
        RoleTaskData IiiiiiiiIIIII;
        this.ALLATORIxDEMO.removeAllChildren();
        this.iIiiIiiiiiiII.clear();
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        RoleTaskData roleTaskData = IiiiiiiiIIIII = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getTaskSystem() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII.getSetId(this.iIiiIiiiiiiII);
        AllTask IiiiiiiiIIIII3 = this.ALLATORIxDEMO().ALLATORIxDEMO();
        IiiiiiiiIIIII3.getSetId(this.iIiiIiiiiiiII);
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.getTypeList().size()) {
            String IiiiiiiiIIIII5 = (String)IiiiiiiiIIIII3.getTypeList().get(IiiiiiiiIIIII4);
            DefaultMutableTreeNode IiiiiiiiIIIII6 = null;
            int IiiiiiiiIIIII7 = this.iIiiIiiiiiiII.size() - 1;
            while (IiiiiiiiIIIII7 >= 0) {
                TaskSet IiiiiiiiIIIII8 = (TaskSet)IiiiiiiiIIIII3.getAllTaskSet().get(this.iIiiIiiiiiiII.get(IiiiiiiiIIIII7));
                if (IiiiiiiiIIIII8.getTaskType().equals(IiiiiiiiIIIII5)) {
                    this.iIiiIiiiiiiII.remove(IiiiiiiiIIIII7);
                    Task IiiiiiiiIIIII9 = IiiiiiiiIIIII.getTaskSet(IiiiiiiiIIIII8.getTaskSetID());
                    if (IiiiiiiiIIIII9 != null) {
                        if (IiiiiiiiIIIII6 == null) {
                            IiiiiiiiIIIII6 = new DefaultMutableTreeNode(IiiiiiiiIIIII5);
                        }
                        DefaultMutableTreeNode IiiiiiiiIIIII10 = new DefaultMutableTreeNode(IiiiiiiiIIIII9.getTaskData());
                        IiiiiiiiIIIII6.add(IiiiiiiiIIIII10);
                    }
                }
                --IiiiiiiiIIIII7;
            }
            if (IiiiiiiiIIIII6 != null) {
                this.ALLATORIxDEMO.add(IiiiiiiiIIIII6);
            }
            ++IiiiiiiiIIIII4;
        }
        DefaultTreeModel IiiiiiiiIIIII22 = (DefaultTreeModel)this.IiiiiiiiIIIII.getModel();
        IiiiiiiiIIIII22.reload();
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIIIiiiIiiII arg0, InputBean arg1) {
        arg0.IIiiIiiiIIiIi = arg1;
    }

    static /* synthetic */ JTree ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(TaskData taskData) {
        RoleTaskData IiiiiiiiIIIII;
        if (this.iiiiIiiiIiiII == taskData.getTaskID()) {
            return;
        }
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        RoleTaskData roleTaskData = IiiiiiiiIIIII = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getTaskSystem() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII.getTaskId(taskData.getTaskID()), taskData);
    }

    public void iIiIiiiiIIiii() {
        RoleTaskData IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = this.ALLATORIxDEMO();
        RoleTaskData roleTaskData = IiiiiiiiIIIII = IiiiiiiiIIIII2 != null ? IiiiiiiiIIIII2.getTaskSystem() : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        this.iiiIiiiiiiIIi();
        super.iIiIiiiiIIiii();
    }

    public int iiiIiiiiiiIIi() {
        return this.iiiiIiiiIiiII;
    }

    static /* synthetic */ RichLabel ALLATORIxDEMO(IIIIIiiiIiiII arg0) {
        return arg0.IiIiiiiiIIIII;
    }
}
