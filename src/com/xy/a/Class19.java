package com.xy.a;

import com.xy.bean.Coordinates;
import com.xy.bean.RoleShow;
import com.xy.game.RoleData;
import com.xy.readbean.ActiveAward;
import com.xy.readbean.ActiveBase;
import com.xy.readbean.AllActive;
import com.xy.richtext.RichLabel;
import com.xy.script.ScriptOpen;
import com.xy.script.ScriptTask;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class19 extends com.xy.q.Class30 {
   private JScrollPane ip;
   private com.xy.w.Class18[] iq;
   private JLabel[] ir;
   private int aa;
   private RichLabel ed;
   private JScrollPane is;
   private JComponent it;
   private com.xy.q.Class14 iu;
   private static Image hf;
   private List<Class2> iv;
   private static Image bp;

   public void g(int var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         if (var1 == 2) {
            int var7 = var2.getTaskSystem().f(2, 3);

            int var8;
            for (int var12 = var8 = 0; var12 < this.iv.size(); var12 = ++var8) {
               Class2 var9;
               if (Integer.parseInt((var9 = this.iv.get(var8)).a.getText()) > this.aa) {
                  String var10002 = "D4\u00185\u0018\u0015\u0004g\u000eyG9P";
                  var9.c.setBtn(-1, "sc/b/B309.png");
               } else if ((var7 >> var8 & 1) == 1) {
                  String var13 = "\u00006\\7\\\u0017@dC{\u0003;\u0014";
                  var9.c.setBtn(-1, "sc/b/B310.png");
               } else {
                  String var14 = "D4\u00185\u0018\u0015\u0004g\u000fyG9P";
                  var9.c.setBtn(1, "sc/b/B308.png");
               }
            }
         } else {
            int var3 = this.it.getComponentCount();

            int var4;
            for (int var10000 = var4 = 0; var10000 < var3; var10000 = ++var4) {
               Class71 var5;
               if ((var5 = (Class71)this.it.getComponent(var4)).adi.getSid() == var1) {
                  int var6 = var2.getTaskSystem().f(var1, 2);
                  var5.wt(var5.adi, var6);
                  Class19 var11;
                  if (var5.adi.getNum() < var6) {
                     var11 = this;
                     var6 = var5.adi.getNum();
                  } else {
                     var11 = this;
                     this.aa = this.aa + var5.adi.getValue();
                  }

                  var11.iu.setText(String.valueOf(this.aa));
                  this.g(2);
                  return;
               }
            }
         }
      }
   }

   public synchronized void f() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         AllActive var2;
         if ((var2 = this.yt().q()) != null) {
            this.aa = 0;
            int var3 = this.it.getComponentCount();
            ActiveBase[] var4 = var2.getBases();

            int var5;
            for (int var10000 = var5 = 0; var10000 < var4.length; var10000 = var5) {
               ActiveBase var6 = var4[var5];
               Class71 var7 = null;
               RoleData var20;
               if (var5 < var3) {
                  var7 = (Class71)this.it.getComponent(var5);
                  var20 = var1;
               } else {
                  var7 = new Class71(this);
                  var20 = var1;
                  this.it.add(var7);
               }

               int var8 = var20.getTaskSystem().f(var6.getSid(), 2);
               var7.wt(var6, var8);
               var7.setBounds(0, 0 + var5 * 61, 371, 61);
               if (var6.getNum() < var8) {
                  var8 = var6.getNum();
               }

               int var10001 = this.aa;
               int var10003 = var6.getValue();
               var5++;
               this.aa = var10001 + var8 * var10003;
            }

            for (int var21 = var5 = var3 - 1; var21 >= var4.length; var21 = var5) {
               this.it.remove(var5--);
            }

            this.it.setPreferredSize(new Dimension(371, 61 * var4.length));
            this.iu.setText(String.valueOf(this.aa));
            ActiveAward[] var12 = var2.getAwards();
            int var13 = 340 / var12.length;
            int var15 = var1.getTaskSystem().f(2, 3);
            var3 = this.iv.size();

            int var16;
            for (int var22 = var16 = 0; var22 < var12.length; var22 = var16) {
               Object var9 = null;
               Class2 var23;
               if (var16 < var3) {
                  var23 = (Class2)(var9 = this.iv.get(var16));
               } else {
                  var9 = new Class2(this, var16);
                  this.add(((Class2)var9).c);
                  var23 = (Class2)var9;
                  this.add(((Class2)var9).a);
                  this.iv.add((Class2)var9);
                  this.remove(this.iq[6]);
                  this.remove(this.iq[7]);
                  this.add(this.iq[6]);
                  this.add(this.iq[7]);
               }

               var23.a.setText(String.valueOf(var12[var16].getActive()));
               ((Class2)var9).c.setName(var12[var16].getValue());
               Class2 var24;
               if (var12[var16].getActive() > this.aa) {
                  var24 = (Class2)var9;
                  String var29 = "\u00006\\7\\\u0017@eJ{\u0003;\u0014";
                  ((Class2)var9).c.setBtn(-1, "sc/b/B309.png");
               } else if ((var15 >> var16 & 1) == 1) {
                  var24 = (Class2)var9;
                  String var30 = "D4\u00185\u0018\u0015\u0004f\u0007yG9P";
                  ((Class2)var9).c.setBtn(-1, "sc/b/B310.png");
               } else {
                  var24 = (Class2)var9;
                  String var31 = "\u00006\\7\\\u0017@eK{\u0003;\u0014";
                  ((Class2)var9).c.setBtn(1, "sc/b/B308.png");
               }

               var24.c.setBounds(90 + var13 * (var16 + 1), 412, 45, 36);
               int var27 = 90 + var13 * (var16 + 1);
               var16++;
               ((Class2)var9).a.setBounds(var27, 443, 45, 20);
            }

            for (int var25 = var16 = var3 - 1; var25 >= var12.length; var25 = var16) {
               Class2 var19;
               Class2 var28 = var19 = this.iv.remove(var16);
               var16--;
               this.remove(var19.c);
               this.remove(var28.a);
            }

            this.iq[6].setBounds(133, 429, (int)Math.min(342.0, 342.0 * (this.aa / 340.0)), 8);
         }
      }
   }

   // $VF: synthetic method
   static Image go() {
      return hf;
   }

   public void h() {
      this.f();
   }

   public int gp(String var1, String var2) {
      String var3 = var1.replace(var2, "");
      return var1.length() - var3.length();
   }

   @Override
   public void l() {
      this.f();
      super.l();
   }

   // $VF: synthetic method
   static RichLabel gq(Class19 var0) {
      return var0.ed;
   }

   // $VF: synthetic method
   static void gr(Image var0) {
      hf = var0;
   }

   public void gs(int var1, Object var2) {
      if (var1 == 154) {
         if (this.afx.getBattleScene() == null) {
            if (!this.afx.roleUnit.bb()) {
               String var13 = "伵晜陊含斵沦撘伯";
               this.afx._do("你是队员无法操作");
            } else if (!this.afx.roleUnit.k()) {
               String var12 = "佗辏土搑摽";
               this.afx._do("你还在摆摊");
            } else {
               Class71 var10;
               String var10000 = (var10 = (Class71)var2).adi.getGuide();
               String var10001 = "^";
               String[] var5;
               if ((var5 = var10000.split("-")).length == 5) {
                  this.afx.automation.j(new ScriptTask(var5, var10.adi.getSid()));
               } else {
                  RoleShow var6 = this.afx.roleUnit.ap;
                  Coordinates var7 = new Coordinates(Integer.parseInt(var5[0]), Integer.parseInt(var5[1]), Integer.parseInt(var5[2]));
                  List var8;
                  if ((
                        var8 = this.afx
                           .getObjectArea()
                           .y()
                           .a(var6.getMapid().intValue(), var6.getX(), var6.getY(), 0, var7.getMapID(), var7.getX(), var7.getY(), 0, 0, this.afx.roleData)
                     )
                     == null) {
                     var10001 = "伷扷坿佺缹旗沂辉剧盙盓圇";
                     this.afx._do("你所在位置无法达到目的地");
                  } else {
                     ScriptOpen var9 = new ScriptOpen(11, Integer.parseInt(var5[3]));
                     var8.add(0, var9);
                     this.afx.automation.e(var8);
                  }
               }
            }
         }
      } else {
         if (var1 == 155) {
            String var10003 = "!gN";
            String var3 = Agreement.getSendTextAES("taskN", "R2=" + var2);
            this.za().k(var3);
         }
      }
   }

   public Class19(GameView var1) {
      super(40, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "&\u0010z\u0017zB{\u0003;\u0014";
      this.aa = 0;
      this.yy(-1, 0, 655, 481, com.xy.q.Class30.agh);
      com.xy.w.Class9 var37 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10005 = "浬功";
      this.yu(var37, "活动");
      this.iv = new ArrayList<>();
      this.ir = new JLabel[7];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ir.length; var10000 = var2) {
         String var10008 = "v\u0010eCeCeC";
         this.ir[var2] = com.xy.q.Class1.f(44, 33, 90, 23, 0, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var4 = this.ir[var2];
         String var9;
         if (var2 == 0) {
            var9 = "殘旒浬功";
            var9 = "每日活动";
         } else if (var2 == 1) {
            var9 = "浮勛斣閇仛殼新冿昽SuSuS剢旃";
            var9 = "活动时间于每日凌晨     刷新";
         } else if (var2 == 2) {
            var9 = "\u0005c\rg\u0007";
            var9 = "24:00";
         } else if (var2 == 3) {
            var9 = "浮勛剂蠛";
            var9 = "活动列表";
         } else if (var2 == 4) {
            var9 = "浬功讱惲";
            var9 = "活动详情";
         } else if (var2 == 5) {
            var9 = "浈趖廕";
            var9 = "活跃度";
         } else if (var2 == 6) {
            var9 = "彤刚洌趔庑";
            var9 = "当前活跃度";
         } else {
            var9 = "";
         }

         var4.setText(var9);
         Class19 var5;
         if (var2 == 0) {
            var5 = this;
            this.ir[var2].setFont(com.xy.q.Class49.bx);
            JLabel var16 = this.ir[var2];
            String var10002 = "v\u0010\u00135\u00135\u00135";
            var16.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
         } else if (var2 == 1) {
            var5 = this;
            this.ir[var2].setHorizontalAlignment(10);
            this.ir[var2].setBounds(384, 38, 250, 19);
         } else if (var2 == 2) {
            var5 = this;
            this.ir[var2].setHorizontalAlignment(10);
            this.ir[var2].setBounds(537, 38, 50, 19);
            JLabel var17 = this.ir[var2];
            String var20 = "tT\u0011qg\u0007g\u0007";
            var17.setForeground(com.xy.q.Class49.c("#cFF0000"));
         } else {
            label109: {
               if (var2 != 3 && var2 != 4) {
                  if (var2 == 5) {
                     var5 = this;
                     this.ir[var2].setBounds(71, 423, 59, 18);
                     break label109;
                  }

                  if (var2 == 6) {
                     this.ir[var2].setBounds(511, 418, 97, 18);
                  }
               } else {
                  JLabel var6 = this.ir[var2];
                  var9 = "v\u0010\u00135\u00135\u00135";
                  var6.setForeground(com.xy.q.Class49.c("#cFFFFFF"));
                  if (var2 == 3) {
                     var5 = this;
                     this.ir[var2].setBounds(52, 62, 385, 21);
                     break label109;
                  }

                  if (var2 == 4) {
                     var5 = this;
                     this.ir[var2].setBounds(440, 62, 180, 21);
                     break label109;
                  }
               }

               var5 = this;
            }
         }

         var5.add(this.ir[var2++]);
      }

      this.iu = com.xy.q.Class1.i(524, 438, 71, 19, 0, Color.white, com.xy.q.Class49.w);
      var10005 = "D4\u00183\u0018f\u0000yG9P";
      this.iu.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.iu);
      this.it = new Class82(this);
      this.ed = new RichLabel("", com.xy.q.Class49.ac);
      this.is = com.xy.q.Class1.g(54, 84, 383, 310, this.it, 20);
      this.ip = com.xy.q.Class1.g(442, 84, 178, 310, this.ed, 20);
      this.add(this.is);
      this.add(this.ip);
      this.iq = new com.xy.w.Class18[8];

      for (int var7 = var2 = 0; var7 < this.iq.length; var7 = var2) {
         this.iq[var2] = new com.xy.w.Class18();
         Class19 var8;
         if (var2 == 0) {
            var8 = this;
            com.xy.w.Class18 var22 = this.iq[var2];
            String var10003 = "\u00006\\1\\fG{\u0003;\u0014";
            var22.dp("sc/d/34.png");
            this.iq[var2].setBounds(44, 33, 177, 23);
         } else if (var2 == 1) {
            var8 = this;
            com.xy.w.Class18 var23 = this.iq[var2];
            String var31 = "D4\u00183\u0018e\u0002yG9P";
            var23.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var2].setBounds(52, 62, 385, 21);
         } else if (var2 == 2) {
            var8 = this;
            com.xy.w.Class18 var24 = this.iq[var2];
            String var32 = "\u00006\\1\\gF{\u0003;\u0014";
            var24.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.iq[var2].setBounds(440, 62, 180, 21);
         } else if (var2 == 3) {
            var8 = this;
            com.xy.w.Class18 var25 = this.iq[var2];
            String var33 = "D4\u00183\u0018e\u0003yG9P";
            var25.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var2].setBounds(52, 62, 385, 332);
         } else if (var2 == 4) {
            var8 = this;
            com.xy.w.Class18 var26 = this.iq[var2];
            String var34 = "\u00006\\1\\gG{\u0003;\u0014";
            var26.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.iq[var2].setBounds(440, 62, 180, 332);
         } else if (var2 == 5) {
            var8 = this;
            com.xy.w.Class18 var27 = this.iq[var2];
            String var35 = "D4\u00183\u0018d\u0001yG9P";
            var27.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
            this.iq[var2].setBounds(42, 27, 587, 380);
         } else if (var2 == 6) {
            var8 = this;
            com.xy.w.Class18 var28 = this.iq[var2];
            String var36 = "\u00006\\1\\cD{\u0003;\u0014";
            var28.mt(com.xy.w.Class16.m("sc/d/67.png", 3, 3, 3, 3, false));
            this.iq[var2].setBounds(133, 429, 342, 8);
         } else {
            if (var2 == 7) {
               com.xy.w.Class18 var19 = this.iq[var2];
               String var29 = "D4\u00183\u0018f\u0000yG9P";
               var19.mt(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false));
               this.iq[var2].setBounds(132, 428, 344, 10);
            }

            var8 = this;
         }

         var8.add(this.iq[var2++]);
      }
   }

   // $VF: synthetic method
   static void gt(Image var0) {
      bp = var0;
   }

   // $VF: synthetic method
   static Image gu() {
      return bp;
   }
}
