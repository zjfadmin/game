package com.xy;

import com.xy.bean.Coordinates;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.readbean.AllTask;
import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class Class624 extends Class345 {
   private RichLabel lt;
   private DefaultMutableTreeNode ann;
   private JLabel[] fb;
   private JScrollPane eb;
   private int gw;
   private JScrollPane mv;
   private JTree ano;
   private List<Integer> im;
   private Class436[] e;
   private InputBean akc;
   private Class322 sa;

   public void afk(TaskData var1) {
      if (this.gw != var1.getTaskID()) {
         RoleData var2;
         RoleTaskData var3 = (var2 = this.vd()) != null ? var2.getTaskSystem() : null;
         if (var3 != null) {
            this.afo(var3.getTaskId(var1.getTaskID()), var1);
         }
      }
   }

   public void q() {
      RoleData var1;
      RoleTaskData var2 = (var1 = this.vd()) != null ? var1.getTaskSystem() : null;
      if (var2 != null) {
         this.d();
         super.q();
      }
   }

   public Class624(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      super(--3, --2, Class345.aef, var1);
      this.im = new ArrayList();
      this.va(var10005, 5 >> 3, 13279 & 20070, 8159 & 25023, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 87 & 108, 87 & 108, 87 & 108, 87 & 108, (boolean)(3 >> 2)), "任务栏");
      JLabel[] var5 = new JLabel[var10001];
      boolean var10003 = true;
      this.fb = var5;

      int var10000;
      int var2;
      Class624 var4;
      for(var10000 = var2 = 3 >> 2; var10000 < this.fb.length; var10000 = var2) {
         if (var2 != (127 & 7) && var2 != (30 & 105)) {
            this.fb[var2] = Class133.c(2 & 5, 2 & 5, 2 & 5, 2 & 5, var2 == 0 ? 63 & 74 : 0, Color.white, Class681.ak);
            this.fb[var2].setText(var2 == 0 ? "任务列表" : (var2 == 5 >> 2 ? "任务详情" : ""));
            if (var2 == 0) {
               var4 = this;
               this.fb[var2].setBounds(61 & 119, 123 & 62, 4094 & 28887, 119 & 29);
            } else {
               if (var2 == --1) {
                  this.fb[var2].setBounds(18815 & 14227, 63 & 122, 1823 & 31231, 95 & 53);
               }

               var4 = this;
            }

            var4.add(this.fb[var2]);
         }

         ++var2;
      }

      this.ann = new DefaultMutableTreeNode();
      this.ano = new JTree(this.ann);
      this.ano.setOpaque((boolean)(3 >> 2));
      this.ano.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.ano.getUI()).setLeftChildIndent(5 >> 3);
      DefaultTreeCellRenderer var3 = new DefaultTreeCellRenderer() {
         public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
            super.getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, var7);
            DefaultMutableTreeNode var8;
            if ((var8 = (DefaultMutableTreeNode)var2).getUserObject() instanceof TaskData) {
               TaskData var9 = (TaskData)var8.getUserObject();
               this.setText(var9.getTaskName());
            }

            return this;
         }
      };
      var3.setLeafIcon((Icon)null);
      var3.setOpenIcon(Class512.azt);
      var3.setClosedIcon(Class512.azr);
      var3.setFont(Class681.ce);
      var3.setBackgroundNonSelectionColor(Class681.cu);
      var3.setBackgroundSelectionColor(new Color(119 & 107, 93 & 127, 90));
      var3.setBorderSelectionColor(Class681.cu);
      var3.setTextNonSelectionColor(Color.white);
      var3.setTextSelectionColor(Color.white);
      this.ano.setCellRenderer(var3);
      this.ano.setRootVisible((boolean)(5 >> 3));
      this.ano.setRowHeight(20);
      this.ano.addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent var1) {
            DefaultMutableTreeNode var10000 = (DefaultMutableTreeNode)Class624.this.ano.getLastSelectedPathComponent();
            TreePath var2;
            if (SwingUtilities.isLeftMouseButton(var1) && (var2 = Class624.this.ano.getSelectionPath()) != null) {
               if (Class624.this.ano.isExpanded(var2)) {
                  Class624.this.ano.collapsePath(var2);
                  return;
               }

               Class624.this.ano.expandPath(var2);
            }

         }
      });
      this.ano.addTreeSelectionListener(new TreeSelectionListener() {
         public void valueChanged(TreeSelectionEvent var1) {
            DefaultMutableTreeNode var2;
            if ((var2 = (DefaultMutableTreeNode)((JTree)var1.getSource()).getLastSelectedPathComponent()) != null && var2.isLeaf()) {
               Class624.this.afk((TaskData)var2.getUserObject());
            }

         }
      });
      this.lt = new RichLabel("", Class681.ce, 287);
      this.lt.addMouseListener(new MouseListener() {
         public void mouseExited(MouseEvent var1) {
         }

         public void mousePressed(MouseEvent var1) {
            Class624.this.akc = Class624.this.lt.isMonitor(var1.getX(), var1.getY());
            if (Class624.this.akc != null) {
               Class624.this.akc.setM((boolean)(4 ^ 5));
            }

         }

         public void mouseReleased(MouseEvent var1) {
            if (Class624.this.akc != null) {
               GameUtil.d(Class624.this.akc, Class624.this.gk().aej);
               Class624.this.akc = null;
            }

         }

         public void mouseClicked(MouseEvent var1) {
         }

         public void mouseEntered(MouseEvent var1) {
         }
      });
      this.mv = Class133.f(50, 79, 217, 307, this.ano, 190);
      this.add(this.mv);
      this.eb = Class133.f(275, 79, 287, 307, this.lt, 190);
      this.add(this.eb);
      this.sa = new Class322("sc/e/28.png", 5 >> 2, 115, Class681.bm, Class681.an, "取消任务", this);
      this.sa.setBounds(490, 38, 68, 17);
      this.add(this.sa);
      Class436[] var6 = new Class436[--5];
      var10003 = true;
      this.e = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.e[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
            this.e[var2].setBounds(50, 58, 217, 21);
         } else if (var2 == --1) {
            var4 = this;
            this.e[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.e[var2].setBounds(275, 58, 287, 21);
         } else if (var2 == --2) {
            var4 = this;
            this.e[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
            this.e[var2].setBounds(50, 58, 217, 328);
         } else if (var2 == --3) {
            var4 = this;
            this.e[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(2 & 5)));
            this.e[var2].setBounds(275, 58, 287, 328);
         } else {
            if (var2 == --4) {
               this.e[var2].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 & 4)));
               this.e[var2].setBounds(38, 36, 532, 20);
            }

            var4 = this;
         }

         var4.add(this.e[var2++]);
      }

   }

   public int e() {
      return this.gw;
   }

   public void d() {
      this.ann.removeAllChildren();
      this.im.clear();
      RoleData var1;
      RoleTaskData var7 = (var1 = this.vd()) != null ? var1.getTaskSystem() : null;
      if (var7 != null) {
         var7.getSetId(this.im);
         AllTask var8 = this.vc().ap();
         int var10000 = 2 & 5;
         var8.getSetId(this.im);

         for(int var5 = var10000; var10000 < var8.getTypeList().size(); var10000 = var5) {
            String var4 = (String)var8.getTypeList().get(var5);
            DefaultMutableTreeNode var3 = null;

            int var6;
            for(var10000 = var6 = this.im.size() - (5 >> 2); var10000 >= 0; var10000 = var6) {
               TaskSet var2;
               if ((var2 = (TaskSet)var8.getAllTaskSet().get(this.im.get(var6))).getTaskType().equals(var4)) {
                  this.im.remove(var6);
                  Task var9 = var7.getTaskSet(var2.getTaskSetID());
                  if (var9 != null) {
                     if (var3 == null) {
                        var3 = new DefaultMutableTreeNode(var4);
                     }

                     DefaultMutableTreeNode var10 = new DefaultMutableTreeNode(var9.getTaskData());
                     var3.add(var10);
                  }
               }

               --var6;
            }

            if (var3 != null) {
               this.ann.add(var3);
            }

            ++var5;
         }

         ((DefaultTreeModel)this.ano.getModel()).reload();
      }
   }

   public void afo(Task var1, TaskData var2) {
      this.gw = var2 != null ? var2.getTaskID() : 0;
      if (var2 == null) {
         this.lt.setTextSize("", 19391 & 13663);
      } else {
         if (var1 != null) {
            Class603 var4 = this.vc();
            StringBuffer var3 = new StringBuffer();
            int var10000;
            if (var2.getTaskText() != null) {
               var3.append("#Y任务目的:#r#W");
               String var5 = var2.getTaskText();
               int var6 = -4 >> 2;
               int var7 = -4 >> 2;
               int var8 = 3 & 4;

               do {
                  if ((var6 = var5.indexOf("{")) != -4 >> 2) {
                     var7 = var5.indexOf("}");
                  }

                  if (var6 != -4 >> 2 && var7 != -4 >> 2) {
                     var3.append(var5.substring(3 & 4, var6));
                     String var9 = var5.substring(var6 + --1, var7);
                     Coordinates var11;
                     InputBean var12;
                     String var18;
                     if (var9.startsWith("目标")) {
                        if (var8 < var1.getProgress().size()) {
                           TaskProgress var10;
                           if ((var10 = (TaskProgress)var1.getProgress().get(var8)).getType() != 0 && var10.getType() != (3 & 5) && var10.getType() != 5 >> 1 && var10.getType() != --3) {
                              if (var10.getType() == --4) {
                                 var3.append("带着");
                                 var3.append(var10.getMax());
                                 var3.append("个");
                                 var3.append(var10.getDName());
                                 var3.append("探望");
                                 if (var10.getMap() == 0) {
                                    var3.append(var10.getGName());
                                 } else {
                                    var11 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                                    var12 = new InputBean((Integer)null, var10.getType() + (85 & 62), new BigDecimal(var10.getGId()), var10.getGName(), "G", var11);
                                    var3.append("#V");
                                    var3.append(Class695.b().toJson(var12));
                                    var3.append("#L");
                                    var3.append("(");
                                    var3.append(var10.getX() / (84 & 63));
                                    var3.append(",");
                                    var3.append(var10.getY() / (125 & 22));
                                    var3.append(")");
                                 }
                              } else if (var10.getType() == --5) {
                                 var3.append("护送");
                                 var3.append(var10.getDName());
                                 var3.append("到");
                                 if (var10.getMap() == 0) {
                                    var3.append(var10.getGName());
                                 } else {
                                    var11 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                                    var12 = new InputBean((Integer)null, var10.getType() + (125 & 22), new BigDecimal(var10.getGId()), var10.getGName(), "G", var11);
                                    var3.append("#V");
                                    var3.append(Class695.b().toJson(var12));
                                    var3.append("#L");
                                    var3.append("(");
                                    var3.append(var10.getX() / (62 & 85));
                                    var3.append(",");
                                    var3.append(var10.getY() / (52 & 95));
                                    var3.append(")");
                                 }
                              } else if (var10.getType() == (103 & 31)) {
                                 var3.append("前往");
                                 StringBuffer var17;
                                 if (var10.getMap() == 0) {
                                    var17 = var3;
                                    var3.append(var10.getGName());
                                 } else {
                                    var11 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                                    var12 = new InputBean((Integer)null, var10.getType() + (92 & 55), new BigDecimal(var10.getGId()), var10.getGName(), "G", var11);
                                    var3.append("#V");
                                    var3.append(Class695.b().toJson(var12));
                                    var17 = var3;
                                    var3.append("#L");
                                    var3.append("(");
                                    var3.append(var10.getX() / (63 & 84));
                                    var3.append(",");
                                    var3.append(var10.getY() / (52 & 95));
                                    var3.append(")");
                                 }

                                 var17.append("完成");
                                 var3.append(var10.getMax());
                                 var3.append("次答题");
                              } else if (var10.getType() == (123 & 12)) {
                                 var3.append("前往");
                                 var11 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                                 var12 = new InputBean((Integer)null, var10.getType() + (127 & 20), new BigDecimal(var10.getDId()), "挂机点", "G", var11);
                                 var3.append("#V");
                                 var3.append(Class695.b().toJson(var12));
                                 var3.append("#L");
                                 var3.append("(");
                                 var3.append(var10.getX() / 20);
                                 var3.append(",");
                                 var3.append(var10.getY() / 20);
                                 var3.append(")");
                                 var3.append("完成");
                                 var3.append(var10.getMax());
                                 var3.append("次泡点");
                              }
                           } else if (var10.getMap() == 0) {
                              var3.append(var10.getDName());
                           } else {
                              var11 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                              var12 = new InputBean((Integer)null, var10.getType() + (20 & 127), new BigDecimal(var10.getDId()), var10.getDName(), "G", var11);
                              if (var10.getType() == --1) {
                                 var3.append("#G");
                                 var3.append(var4.ab(String.valueOf(var10.getMap())));
                                 var3.append("#W击杀");
                              }

                              var3.append("#V");
                              var3.append(Class695.b().toJson(var12));
                              var3.append("#L");
                              var3.append("(");
                              var3.append(var10.getX() / (30 & 117));
                              var3.append(",");
                              var3.append(var10.getY() / (29 & 118));
                              var3.append(")");
                           }
                        }

                        ++var8;
                        var18 = var5;
                     } else {
                        if (var9.startsWith("位置")) {
                           String[] var16 = var9.split("-");
                           var11 = new Coordinates(Integer.parseInt(var16[5 >> 2]), Integer.parseInt(var16[1 ^ 3]), Integer.parseInt(var16[--3]));
                           var12 = new InputBean((Integer)null, 10, (BigDecimal)null, var16[--1].substring(5 >> 1), "G", var11);
                           var3.append("#V");
                           var3.append(Class695.b().toJson(var12));
                           var3.append("#L");
                           var3.append("(");
                           var3.append(var11.getX() / 20);
                           var3.append(",");
                           var3.append(var11.getY() / 20);
                           var3.append(")");
                        }

                        var18 = var5;
                     }

                     var5 = var18.substring(var7 + (3 >> 1));
                     var10000 = var6;
                  } else {
                     var3.append(var5);
                     var10000 = var6;
                  }
               } while(var10000 != -1 && var7 != -4 >> 2);
            }

            if (var1.getProgress().size() != 0) {
               if (var3.length() != 0) {
                  var3.append("#r #r");
               }

               var3.append("#Y任务状态:");
               int var13 = 2 & 5;

               for(var10000 = var13; var10000 < var1.getProgress().size(); var10000 = var13) {
                  TaskProgress var15;
                  TaskProgress var10001 = var15 = (TaskProgress)var1.getProgress().get(var13);
                  var3.append("#r#W");
                  var3.append(var10001.getType() == 8 ? "泡点" : (var15.getType() == 7 ? "答题" : (var15.getType() == 6 ? "巡逻" : var15.getDName())));
                  var3.append(":#G");
                  var3.append(var15.getSum());
                  var3.append("/");
                  ++var13;
                  var3.append(var15.getMax());
               }
            }

            TaskSet var14;
            if ((var14 = var2.getTaskSet()).getTaskMsg() != null) {
               if (var3.length() != 0) {
                  var3.append("#r #r");
               }

               var3.append("#Y任务提示:#r#W");
               var3.append(var14.getTaskMsg());
            }

            this.lt.setTextSize(var3.toString(), 287);
         }

      }
   }
}
