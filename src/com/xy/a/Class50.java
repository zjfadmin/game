package com.xy.a;

import com.xy.bean.Coordinates;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Class50 extends com.xy.q.Class30 {
   private RichLabel to;
   private com.xy.w.Class18[] iq;
   private int z;
   private JScrollPane rf;
   private List<Integer> kj;
   private InputBean xh;
   private JLabel[] r;
   private JScrollPane i;
   private com.xy.i.Class18 md;
   private JTree xi;
   private DefaultMutableTreeNode xj;

   public Class50(GameView var1) {
      super(3, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0015pIwI\"Hc\bt";
      this.kj = new ArrayList<>();
      this.yy(-1, 0, 582, 415, com.xy.q.Class30.agh);
      com.xy.w.Class9 var18 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "京劔桘";
      this.yu(var18, "任务栏");
      this.r = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.r.length; var10000 = ++var2) {
         if (var2 != 7 && var2 != 8) {
            this.r[var2] = com.xy.q.Class1.f(0, 0, 0, 0, var2 == 0 ? 10 : 0, Color.white, com.xy.q.Class49.ch);
            JLabel var5 = this.r[var2];
            String var9;
            if (var2 == 0) {
               var9 = "亝劲剱衻";
               var9 = "任务列表";
            } else if (var2 == 1) {
               var9 = "从勶诓悒";
               var9 = "任务详情";
            } else {
               var9 = "";
            }

            var5.setText(var9);
            Class50 var6;
            if (var2 == 0) {
               var6 = this;
               this.r[var2].setBounds(53, 58, 214, 21);
            } else {
               if (var2 == 1) {
                  this.r[var2].setBounds(275, 58, 287, 21);
               }

               var6 = this;
            }

            var6.add(this.r[var2]);
         }
      }

      this.xj = new DefaultMutableTreeNode();
      this.xi = new JTree(this.xj);
      this.xi.setOpaque(false);
      String var10002 = "Y2a\u0003vH\u007f\u000f}\u0003@\u0012j\nv";
      var10003 = "{8[2";
      this.xi.putClientProperty("JTree.lineStyle", "None");
      ((BasicTreeUI)this.xi.getUI()).setLeftChildIndent(0);
      Class81 var4 = new Class81(this);
      var4.setLeafIcon(null);
      var4.setOpenIcon(com.xy.q.Class47.arm);
      var4.setClosedIcon(com.xy.q.Class47.arp);
      var4.setFont(com.xy.q.Class49.ac);
      var4.setBackgroundNonSelectionColor(com.xy.q.Class49.bk);
      var4.setBackgroundSelectionColor(new Color(99, 93, 90));
      var4.setBorderSelectionColor(com.xy.q.Class49.bk);
      var4.setTextNonSelectionColor(Color.white);
      var4.setTextSelectionColor(Color.white);
      this.xi.setCellRenderer(var4);
      this.xi.setRootVisible(false);
      this.xi.setRowHeight(20);
      this.xi.addMouseListener(new Class101(this));
      this.xi.addTreeSelectionListener(new Class99(this));
      this.to = new RichLabel("", com.xy.q.Class49.ac, 287);
      this.to.addMouseListener(new Class64(this));
      this.i = com.xy.q.Class1.g(50, 79, 217, 307, this.xi, 190);
      this.add(this.i);
      this.rf = com.xy.q.Class1.g(275, 79, 287, 307, this.to, 190);
      this.add(this.rf);
      String var10009 = "`\u0005<\u0003<T+Hc\bt";
      String var10014 = "口淟从勶";
      this.md = new com.xy.i.Class18("sc/e/28.png", 1, 115, com.xy.q.Class49.bz, com.xy.q.Class49.r, "取消任务", this);
      this.md.setBounds(490, 38, 68, 17);
      this.add(this.md);
      this.iq = new com.xy.w.Class18[5];

      int var3;
      for (int var7 = var3 = 0; var7 < this.iq.length; var7 = var3) {
         this.iq[var3] = new com.xy.w.Class18();
         Class50 var8;
         if (var3 == 0) {
            var8 = this;
            com.xy.w.Class18 var12 = this.iq[var3];
            var10003 = "`\u0005<\u0002<T&Hc\bt";
            var12.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var3].setBounds(50, 58, 217, 21);
         } else if (var3 == 1) {
            var8 = this;
            com.xy.w.Class18 var13 = this.iq[var3];
            var10003 = "$VxQx\u0007b\u001b'[0";
            var13.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var3].setBounds(275, 58, 287, 21);
         } else if (var3 == 2) {
            var8 = this;
            com.xy.w.Class18 var14 = this.iq[var3];
            var10003 = "`\u0005<\u0002<T'Hc\bt";
            var14.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var3].setBounds(50, 58, 217, 328);
         } else if (var3 == 3) {
            var8 = this;
            com.xy.w.Class18 var15 = this.iq[var3];
            var10003 = "$VxQx\u0007c\u001b'[0";
            var15.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var3].setBounds(275, 58, 287, 328);
         } else {
            if (var3 == 4) {
               com.xy.w.Class18 var11 = this.iq[var3];
               var10002 = "`\u0005<\u0002<U&Hc\bt";
               var11.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
               this.iq[var3].setBounds(38, 36, 532, 20);
            }

            var8 = this;
         }

         var8.add(this.iq[var3++]);
      }
   }

   public void rx(Task var1, TaskData var2) {
      this.z = var2 != null ? var2.getTaskID() : 0;
      if (var2 == null) {
         this.to.setTextSize("", 287);
      } else {
         if (var1 != null) {
            com.xy.v.Class8 var3 = this.yt();
            StringBuffer var4 = new StringBuffer();
            if (var2.getTaskText() != null) {
               String var10001 = "tl京劔皹皱m\u0016%\u0016\u0000";
               var4.append("#Y任务目的:#r#W");
               String var5 = var2.getTaskText();
               int var6 = -1;
               int var7 = -1;
               int var8 = 0;

               int var10000;
               do {
                  var10001 = "h";
                  if ((var6 = var5.indexOf("{")) != -1) {
                     var10001 = "*";
                     var7 = var5.indexOf("}");
                  }

                  if (var6 != -1 && var7 != -1) {
                     var4.append(var5.substring(0, var6));
                     String var9 = var5.substring(var6 + 1, var7);
                     var10001 = "皈栔";
                     String var27;
                     if (!var9.startsWith("目标")) {
                        var10001 = "佸缹";
                        if (var9.startsWith("位置")) {
                           var10001 = ">";
                           String[] var17 = var9.split("-");
                           Coordinates var21 = new Coordinates(Integer.parseInt(var17[1]), Integer.parseInt(var17[2]), Integer.parseInt(var17[3]));
                           String var77 = var17[1].substring(2);
                           String var82 = "\u0010";
                           InputBean var25 = new InputBean(null, 10, null, var77, "G", var21);
                           var10001 = "EE";
                           var4.append("#V");
                           var4.append(com.xy.v.Class31.a().toJson(var25));
                           String var60 = "\u0016\u001b";
                           var4.append("#L");
                           String var71 = ";";
                           var4.append("(");
                           var4.append(var21.getX() / 20);
                           var4.append(",");
                           var4.append(var21.getY() / 20);
                           String var85 = "~";
                           var4.append(")");
                        }

                        var27 = var5;
                     } else {
                        if (var8 < var1.getProgress().size()) {
                           TaskProgress var10;
                           if ((var10 = var1.getProgress().get(var8)).getType() != 0 && var10.getType() != 1 && var10.getType() != 2 && var10.getType() != 3) {
                              if (var10.getType() == 4) {
                                 var10001 = "幀睓";
                                 var4.append("带着");
                                 var4.append(var10.getMax());
                                 String var63 = "乽";
                                 var4.append("个");
                                 var4.append(var10.getDName());
                                 String var78 = "揄月";
                                 var4.append("探望");
                                 if (var10.getMap() == 0) {
                                    var4.append(var10.getGName());
                                 } else {
                                    Coordinates var18 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                                    int var54 = var10.getType() + 20;
                                    BigDecimal var64 = new BigDecimal(var10.getGId());
                                    String var73 = var10.getGName();
                                    var78 = "\u0010";
                                    InputBean var22 = new InputBean(null, var54, var64, var73, "G", var18);
                                    var10001 = "EE";
                                    var4.append("#V");
                                    var4.append(com.xy.v.Class31.a().toJson(var22));
                                    String var55 = "\u0016\u001b";
                                    var4.append("#L");
                                    var63 = ";";
                                    var4.append("(");
                                    var4.append(var10.getX() / 20);
                                    var4.append(",");
                                    var4.append(var10.getY() / 20);
                                    String var83 = "~";
                                    var4.append(")");
                                 }
                              } else if (var10.getType() == 5) {
                                 var10001 = "拂递";
                                 var4.append("护送");
                                 var4.append(var10.getDName());
                                 String var66 = "剧";
                                 var4.append("到");
                                 if (var10.getMap() == 0) {
                                    var4.append(var10.getGName());
                                 } else {
                                    Coordinates var19 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                                    int var56 = var10.getType() + 20;
                                    BigDecimal var67 = new BigDecimal(var10.getGId());
                                    String var74 = var10.getGName();
                                    String var80 = "T";
                                    InputBean var23 = new InputBean(null, var56, var67, var74, "G", var19);
                                    var10001 = "\u0016\u0001";
                                    var4.append("#V");
                                    var4.append(com.xy.v.Class31.a().toJson(var23));
                                    String var57 = "E_";
                                    var4.append("#L");
                                    var66 = "\u007f";
                                    var4.append("(");
                                    var4.append(var10.getX() / 20);
                                    var4.append(",");
                                    var4.append(var10.getY() / 20);
                                    String var84 = ":";
                                    var4.append(")");
                                 }
                              } else if (var10.getType() == 7) {
                                 String var10002 = "剸志";
                                 var4.append("前往");
                                 StringBuffer var26;
                                 if (var10.getMap() == 0) {
                                    var26 = var4;
                                    var4.append(var10.getGName());
                                 } else {
                                    Coordinates var20 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                                    int var58 = var10.getType() + 20;
                                    BigDecimal var69 = new BigDecimal(var10.getGId());
                                    String var75 = var10.getGName();
                                    String var81 = "T";
                                    InputBean var24 = new InputBean(null, var58, var69, var75, "G", var20);
                                    var10001 = "\u0016\u0001";
                                    var4.append("#V");
                                    var4.append(com.xy.v.Class31.a().toJson(var24));
                                    var26 = var4;
                                    String var70 = "E_";
                                    var4.append("#L");
                                    var75 = "\u007f";
                                    var4.append("(");
                                    var4.append(var10.getX() / 20);
                                    var4.append(",");
                                    var4.append(var10.getY() / 20);
                                    String var10009 = ":";
                                    var4.append(")");
                                 }

                                 var10001 = "容扇";
                                 var26.append("完成");
                                 var4.append(var10.getMax());
                                 String var59 = "欲笲颋";
                                 var4.append("次答题");
                              }
                           } else if (var10.getMap() == 0) {
                              var4.append(var10.getDName());
                           } else {
                              Coordinates var11 = new Coordinates(var10.getMap(), var10.getX(), var10.getY());
                              int var10003 = var10.getType() + 20;
                              BigDecimal var10004 = new BigDecimal(var10.getDId());
                              String var10005 = var10.getDName();
                              String var10006 = "\u0010";
                              InputBean var12 = new InputBean(null, var10003, var10004, var10005, "G", var11);
                              if (var10.getType() == 1) {
                                 var10001 = "ET";
                                 var4.append("#G");
                                 var4.append(var3.d(String.valueOf(var10.getMap())));
                                 String var52 = "\u0016\u0000凎朗";
                                 var4.append("#W击杀");
                              }

                              var10001 = "EE";
                              var4.append("#V");
                              var4.append(com.xy.v.Class31.a().toJson(var12));
                              String var53 = "\u0016\u001b";
                              var4.append("#L");
                              String var62 = ";";
                              var4.append("(");
                              var4.append(var10.getX() / 20);
                              var4.append(",");
                              var4.append(var10.getY() / 20);
                              String var10008 = "~";
                              var4.append(")");
                           }
                        }

                        var8++;
                        var27 = var5;
                     }

                     var5 = var27.substring(var7 + 1);
                     var10000 = var6;
                  } else {
                     var4.append(var5);
                     var10000 = var6;
                  }
               } while (var10000 != -1 && var7 != -1);
            }

            if (var1.getProgress().size() != 0) {
               if (var4.length() != 0) {
                  String var43 = "0\u00143Ea";
                  var4.append("#r #r");
               }

               String var44 = "tl京劔狡怴m";
               var4.append("#Y任务状态:");
               int var13 = 0;

               for (int var28 = var13; var28 < var1.getProgress().size(); var28 = var13) {
                  TaskProgress var16;
                  TaskProgress var45 = var16 = var1.getProgress().get(var13);
                  String var61 = "EaED";
                  var4.append("#r#W");
                  if (var45.getType() == 7) {
                     var44 = "筡飏";
                     var44 = "答题";
                  } else if (var16.getType() == 6) {
                     var44 = "嶇逨";
                     var44 = "巡逻";
                  } else {
                     var44 = var16.getDName();
                  }

                  var4.append(var44);
                  String var51 = "m\u0016\u0010";
                  var4.append(":#G");
                  var4.append(var16.getSum());
                  String var72 = "<";
                  var4.append("/");
                  var13++;
                  var4.append(var16.getMax());
               }
            }

            TaskSet var14;
            if ((var14 = var2.getTaskSet()).getTaskMsg() != null) {
               if (var4.length() != 0) {
                  String var49 = "tGw\u0016%";
                  var4.append("#r #r");
               }

               String var50 = "0?仨勇揃祜)EaED";
               var4.append("#Y任务提示:#r#W");
               var4.append(var14.getTaskMsg());
            }

            this.to.setTextSize(var4.toString(), 287);
         }
      }
   }

   // $VF: synthetic method
   static InputBean ry(Class50 var0) {
      return var0.xh;
   }

   public void h() {
      this.xj.removeAllChildren();
      this.kj.clear();
      RoleData var1;
      RoleTaskData var2 = (var1 = this.yx()) != null ? var1.getTaskSystem() : null;
      if (var2 != null) {
         var2.getSetId(this.kj);
         AllTask var3 = this.yt().b();
         int var10000 = 0;
         var3.getSetId(this.kj);

         for (int var4 = 0; var10000 < var3.getTypeList().size(); var10000 = ++var4) {
            String var5 = var3.getTypeList().get(var4);
            DefaultMutableTreeNode var6 = null;

            int var7;
            for (int var11 = var7 = this.kj.size() - 1; var11 >= 0; var11 = --var7) {
               TaskSet var8;
               if ((var8 = var3.getAllTaskSet().get(this.kj.get(var7))).getTaskType().equals(var5)) {
                  this.kj.remove(var7);
                  Task var9 = var2.getTaskSet(var8.getTaskSetID());
                  if (var9 != null) {
                     if (var6 == null) {
                        var6 = new DefaultMutableTreeNode(var5);
                     }

                     DefaultMutableTreeNode var10 = new DefaultMutableTreeNode(var9.getTaskData());
                     var6.add(var10);
                  }
               }
            }

            if (var6 != null) {
               this.xj.add(var6);
            }
         }

         ((DefaultTreeModel)this.xi.getModel()).reload();
      }
   }

   // $VF: synthetic method
   static void rz(Class50 var0, InputBean var1) {
      var0.xh = var1;
   }

   // $VF: synthetic method
   static JTree sa(Class50 var0) {
      return var0.xi;
   }

   public void sb(TaskData var1) {
      if (this.z != var1.getTaskID()) {
         RoleData var2;
         RoleTaskData var3 = (var2 = this.yx()) != null ? var2.getTaskSystem() : null;
         if (var3 != null) {
            this.rx(var3.getTaskId(var1.getTaskID()), var1);
         }
      }
   }

   @Override
   public void l() {
      RoleData var1;
      RoleTaskData var2 = (var1 = this.yx()) != null ? var1.getTaskSystem() : null;
      if (var2 != null) {
         this.h();
         super.l();
      }
   }

   public int dx() {
      return this.z;
   }

   // $VF: synthetic method
   static RichLabel sc(Class50 var0) {
      return var0.to;
   }
}
