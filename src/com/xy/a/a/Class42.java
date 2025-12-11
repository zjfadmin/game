package com.xy.a.a;

import com.xy.entity.RoleSummoning;
import com.xy.readbean.TYC;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;

public class Class42 extends com.xy.q.Class30 {
   private BigDecimal nh;
   private com.xy.i.Class4 mm;
   private List<Class23> tr;
   private com.xy.i.Class4 aln;
   private String nq;
   private JLabel di;
   private com.xy.i.Class4 hq;

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.h();
      }
   }

   public RoleSummoning jm() {
      return this.yx().getPet(this.nh);
   }

   public void ew(RoleSummoning var1) {
      this.nh = var1.getSid();
      this.nq = var1.getXy();
      this.f();
      this.zc().b(this.lj());
   }

   public Class23 aed(int var1) {
      Iterator var3;
      for (Iterator var10000 = var3 = this.tr.iterator(); var10000.hasNext(); var10000 = var3) {
         Class23 var2;
         if (Class23.op(var2 = (Class23)var3.next()).getV2() == var1) {
            return var2;
         }
      }

      return null;
   }

   public String jg() {
      boolean var1 = false;
      StringBuffer var2 = new StringBuffer();
      Iterator var4;
      Iterator var10000 = var4 = this.tr.iterator();

      while (var10000.hasNext()) {
         Class23 var3;
         if (Class23.oo(var3 = (Class23)var4.next()) != 0) {
            if (Class23.oq(var3) <= 0) {
               var10000 = var4;
               continue;
            }

            if (!var1 && Class23.oq(var3) > Class23.on(var3)) {
               var1 = true;
            }

            if (var2.length() != 0) {
               String var10001 = "m";
               var2.append("=");
            }

            var2.append(Class23.oo(var3));
         }

         var10000 = var4;
      }

      return var1 ? var2.toString() : null;
   }

   public void e() {
      RoleSummoning var1;
      RoleSummoning var10001 = var1 = this.jm();
      int var2 = var10001.getTurnRount();
      int var3 = com.xy.v.Class4.f(var10001.getGrade());
      int var4 = var10001.getXYLvl();
      int var5 = 0;

      Iterator var7;
      for (Iterator var10000 = var7 = this.tr.iterator(); var10000.hasNext(); var10000 = var7) {
         Class23 var6 = (Class23)var7.next();
         var5 += Class23.oq(var6);
      }

      Iterator var20 = var7 = this.tr.iterator();

      while (var20.hasNext()) {
         Class23 var13;
         if (Class23.oq(var13 = (Class23)var7.next()) > 0) {
            var20 = var7;
         } else if (Class23.op(var13).getList() == null) {
            var20 = var7;
            var13.be(true);
         } else {
            boolean var8 = true;

            int var9;
            for (int var21 = var9 = Class23.op(var13).getList().size() - 1; var21 >= 0; var21 = --var9) {
               TYC var10;
               if ((var10 = Class23.op(var13).getList().get(var9)).getType() == 2) {
                  int[] var17 = var10.getVs();
                  int var19 = Math.min(Class23.oq(var13), var17.length - 1);
                  if (var17[var19] > var5 - Class23.oq(var13)) {
                     var8 = false;
                  }
               } else if (var10.getType() == 3) {
                  Class23 var16;
                  if ((var16 = this.aed(var10.getV1())) == null || Class23.oq(var16) < var10.getV2()) {
                     var8 = false;
                  }
               } else if (var10.getType() == 4) {
                  if (var2 < var10.getV1() || var2 == var10.getV1() && var3 < var10.getV2()) {
                     var8 = false;
                  }
               } else {
                  int var15;
                  if (var10.getType() == 5) {
                     for (int var23 = var15 = 0; var23 < var10.getVs().length; var23 = ++var15) {
                        Class23 var18;
                        if ((var18 = this.aed(var10.getVs()[var15])) != null && Class23.oq(var13) > 0 && Class23.oo(var13) != Class23.oo(var18)) {
                           var8 = false;
                           break;
                        }
                     }
                  } else if (var10.getType() != 6) {
                     if (var10.getType() == 7 && 12 < var10.getV1()) {
                        var8 = false;
                     }
                  } else {
                     var15 = var10.getV1();

                     int var12;
                     for (int var22 = var12 = 0; var22 < var10.getVs().length; var22 = ++var12) {
                        if (this.aed(var10.getVs()[var12]) != null && Class23.oq(var13) > 0) {
                           var15--;
                        }
                     }

                     if (var15 <= 0 && Class23.oq(var13) <= 0) {
                        var8 = false;
                     }
                  }
               }
            }

            var20 = var7;
            var13.be(var8);
         }
      }

      this.di.setText(String.valueOf(var4 - var5));
      if (this.za().l(2, 8) || this.za().l(2, 11) || this.za().l(2, 12)) {
         if (var4 >= 12) {
            String var24 = "UbQ`";
            if (var1.a("1250")) {
               String var25 = "扴坳";
               this.mm.cp(84, "成圣");
               return;
            }
         }

         String var10002 = "儵挲";
         this.mm.cp(81, "兑换");
      }
   }

   public Class42(GameView var1) {
      super(146, 2, com.xy.q.Class30.afz, var1);
      String var10002 = "\u00173K3KaR`";
      this.yy(-1, 0, 901, 548, com.xy.q.Class30.agh);
      this.dp("sc/c/160");
      com.xy.v.Class8 var10000 = this.yt();
      String var10001 = "徧慟侊烬";
      List var2 = var10000.by("心意修炼");
      this.tr = new ArrayList<>();

      Iterator var4;
      for (Iterator var7 = var4 = var2.iterator(); var7.hasNext(); var7 = var4) {
         TYC var3 = (TYC)var4.next();
         Class23 var5 = new Class23(this, var3);
         Point var6 = this.aee(var3.getV1());
         var5.setBounds(var6.x, var6.y, 27, 27);
         this.tr.add(var5);
         this.add(var5);
      }

      this.di = new JLabel("0");
      this.di.setBounds(232, 416, 40, 16);
      this.di.setFont(com.xy.q.Class49.bx);
      this.di.setForeground(Color.red);
      this.add(this.di);
      String var10011 = "\u00173K5KgJ \n7";
      String var10016 = "儵挲";
      this.mm = new com.xy.i.Class4("sc/e/7.png", 1, 81, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑换", this);
      String var10010 = "\u00173K5KgJ \n7";
      String var10015 = "浳烩";
      this.hq = new com.xy.i.Class4("sc/e/7.png", 1, 82, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "洗点", this);
      String var10009 = "#\u0007\u007f\u0001\u007fVfJ \n7";
      String var10014 = "砊寊勄烩";
      this.aln = new com.xy.i.Class4("sc/e/26.png", 1, 83, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确定加点", this);
      this.mm.setBounds(167, 437, 68, 26);
      this.hq.setBounds(440, 476, 68, 26);
      this.aln.setBounds(428, 448, 92, 26);
      this.add(this.mm);
      this.add(this.hq);
      this.add(this.aln);
   }

   public void f() {
      Iterator var2;
      Iterator var10000 = var2 = this.tr.iterator();

      while (var10000.hasNext()) {
         Class23 var1 = (Class23)var2.next();
         var10000 = var2;
         var1.f();
      }

      String[] var8;
      if (this.nq != null && !this.nq.equals("")) {
         String var10001 = "m";
         var8 = this.nq.split("=");
      } else {
         var8 = null;
      }

      String[] var6 = var8;
      int var7 = var6 != null ? Integer.parseInt(var6[0]) : 0;
      int var3 = 1;
      int var4 = var6 != null ? var6.length : 0;

      for (int var9 = var3; var9 < var4; var9 = ++var3) {
         Class23 var5;
         if ((var5 = this.aed(Integer.parseInt(var6[var3]))) != null) {
            var5.n(1);
            var7 -= Class23.on(var5);
         }
      }

      this.di.setText(String.valueOf(var7));
      this.e();
   }

   public void g(int var1) {
      RoleSummoning var2;
      if ((var2 = this.jm()) != null) {
         if (var1 == 81) {
            String var12 = "\b=\b(,";
            String var7 = Agreement.getSendTextAES("userpet", "XYXL|" + var2.getSid());
            this.za().k(var7);
         } else if (var1 == 82) {
            String var11 = "\b=,";
            String var6 = Agreement.getSendTextAES("userpet", "XY|" + var2.getSid());
            this.za().k(var6);
         } else if (var1 == 83) {
            String var5;
            if ((var5 = this.jg()) == null) {
               String var9 = "讧侊敩烝攠";
               this.afx._do("请修改点数");
            } else {
               if (this.za().l(2, 11)) {
                  String var10001 = "对寍颺北呪従慫戝畻攘";
                  this.afx._do("宝宝飞升后心意才生效");
               }

               String var10 = "\b=,";
               StringBuilder var8 = new StringBuilder("XY|").append(var2.getSid());
               String var10002 = ",";
               String var4 = Agreement.getSendTextAES("userpet", var8.append("|").append(var5).toString());
               this.za().k(var4);
            }
         } else {
            if (var1 == 84) {
               String var10003 = "\b=\u00137,";
               String var3 = Agreement.getSendTextAES("userpet", "XYCS|" + var2.getSid());
               this.za().k(var3);
            }
         }
      }
   }

   public Point aee(int var1) {
      if (var1 == 11) {
         return new Point(464, 352);
      } else if (var1 == 12) {
         return new Point(390, 313);
      } else if (var1 == 21) {
         return new Point(317, 415);
      } else if (var1 == 22) {
         return new Point(607, 403);
      } else if (var1 == 31) {
         return new Point(545, 308);
      } else if (var1 == 32) {
         return new Point(380, 220);
      } else if (var1 == 41) {
         return new Point(231, 321);
      } else if (var1 == 42) {
         return new Point(689, 320);
      } else if (var1 == 51) {
         return new Point(539, 218);
      } else if (var1 == 52) {
         return new Point(459, 173);
      } else if (var1 == 61) {
         return new Point(202, 191);
      } else if (var1 == 62) {
         return new Point(717, 187);
      } else if (var1 == 71) {
         return new Point(267, 163);
      } else if (var1 == 72) {
         return new Point(656, 158);
      } else if (var1 == 81) {
         return new Point(225, 105);
      } else {
         return var1 == 82 ? new Point(693, 92) : null;
      }
   }

   public synchronized void h() {
      RoleSummoning var1;
      if ((var1 = this.jm()) == null) {
         this.zc().f(this.lj());
      } else {
         String var2;
         if ((var2 = var1.getXy()) == null) {
            var2 = "";
         }

         if (!var2.equals(this.nq)) {
            this.nq = var2;
            this.f();
         }
      }
   }

   // $VF: synthetic method
   static JLabel aef(Class42 var0) {
      return var0.di;
   }
}
