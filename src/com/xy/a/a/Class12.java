package com.xy.a.a;

import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class12 extends com.xy.q.Class30 {
   private List<Class41> mg;
   private Image mh;
   private Image mi;
   private BigDecimal ko;
   private Image mj;
   private com.xy.i.Class4 mk;
   private int z;
   private com.xy.i.Class4 ml;
   private String ao;
   private com.xy.i.Class4 mm;
   private com.xy.i.Class4 mn;
   private com.xy.i.Class4[] bg;
   private Image hf;
   private JLabel di;
   private String mo;

   public synchronized void a() {
      com.xy.v.Class8 var1;
      List var2 = (var1 = this.yt()).by(this.mo);
      String[] var10000;
      if (this.ao != null) {
         String var10001 = "\u0018";
         var10000 = this.ao.split("=");
      } else {
         var10000 = new String[0];
      }

      String[] var3 = var10000;
      if (var3.length > 2 && !var3[2].equals(this.mo)) {
         this.zc().f(115);
      } else {
         int var4;
         for (int var12 = var4 = 0; var12 < this.mg.size(); var12 = var4) {
            Class41 var5 = this.mg.get(var4);
            var4++;
            var5.ads(this.jo(var2, Class41.adx(var5)));
         }

         for (int var13 = var4 = 3; var13 < var3.length; var13 = ++var4) {
            String var14 = var3[var4];
            String var15 = "D";
            Skill var6;
            int var11;
            if ((var11 = var14.indexOf("-")) != -1 && (var6 = var1.ac(var3[var4].substring(0, var11))) != null) {
               int var7 = Integer.parseInt(var6.getSkillid());
               int var8 = Integer.parseInt(var3[var4].substring(var11 + 1));
               Class41 var9;
               if ((var9 = this.jk(var7)) != null) {
                  Class41.adv(var9, var8);
                  Class41.aea(var9, var8);
                  Class41.aeb(var9, Integer.parseInt(var6.getSkilllevel()));
               }
            }
         }

         this.c();
      }
   }

   // $VF: synthetic method
   static Image jf(Class12 var0) {
      return var0.mi;
   }

   public void c() {
      RoleSummoning var10000 = this.jm();
      int var2 = var10000.getTurnRount();
      int var3 = com.xy.v.Class4.f(var10000.getGrade());
      int var4 = var10000.getLxGZ();
      int var5 = 0;

      int var6;
      for (int var19 = var6 = 0; var19 < this.mg.size(); var19 = ++var6) {
         Class41 var7;
         if ((var7 = this.mg.get(var6)).isVisible()) {
            var5 += Class41.ady(var7);
         }
      }

      label105:
      for (int var20 = var6 = 0; var20 < this.mg.size(); var20 = ++var6) {
         Class41 var14;
         if ((var14 = this.mg.get(var6)).isVisible()) {
            Class41.aec(var14, false);
            Class41 var21;
            if (Class41.adu(var14).getList() == null) {
               Class41.adt(var14, true);
               var21 = var14;
            } else {
               Class41.adt(var14, false);
               var21 = var14;
            }

            int var8;
            for (int var22 = var8 = Class41.adu(var21).getList().size() - 1; var22 >= 0; var22 = --var8) {
               TYC var9;
               if ((var9 = Class41.adu(var14).getList().get(var8)).getType() == 2) {
                  int[] var10 = var9.getVs();
                  int var11 = Math.min(Class41.ady(var14), var10.length - 1);
                  if (var10[var11] > var5 - Class41.ady(var14)) {
                     Class41.adt(var14, false);
                     continue label105;
                  }
               } else if (var9.getType() == 4) {
                  if (var2 < var9.getV1() || var2 == var9.getV1() && var3 < var9.getV2()) {
                     Class41.adt(var14, false);
                     continue label105;
                  }
               } else {
                  int var15;
                  if (var9.getType() == 5) {
                     for (int var23 = var15 = 0; var23 < var9.getVs().length; var23 = ++var15) {
                        Class41 var17;
                        if ((var17 = this.jk(var9.getVs()[var15])) != null && Class41.ady(var17) > 0 && Class41.adz(var17) != Class41.adz(var14)) {
                           Class41.adt(var14, false);
                           continue label105;
                        }
                     }
                  } else if (var9.getType() == 6) {
                     var15 = var9.getV1();

                     int var18;
                     for (int var24 = var18 = 0; var24 < var9.getVs().length; var24 = ++var18) {
                        Class41 var12;
                        if ((var12 = this.jk(var9.getVs()[var18])) != null && Class41.ady(var12) > 0) {
                           var15--;
                        }
                     }

                     if (var15 <= 0 && Class41.ady(var14) <= 0) {
                        Class41.adt(var14, false);
                        continue label105;
                     }
                  } else if (var9.getType() == 7 && var4 < var9.getV1()) {
                     Class41.adt(var14, false);
                     Class41.aec(var14, true);
                     continue label105;
                  }
               }
            }

            Class41.aec(var14, false);
            Class41.adt(var14, true);
         }
      }

      this.di.setText(String.valueOf(this.z - var5));
   }

   public void e() {
      this.bg = new com.xy.i.Class4[3];

      int var1;
      for (int var10000 = var1 = 0; var10000 < this.bg.length; var10000 = var1) {
         String var10009 = "5\ni\u000bi+";
         this.bg[var1] = new com.xy.i.Class4("sc/b/B" + (363 + var1) + ".png", 1, 95 + var1, this);
         this.bg[var1].setBounds(52 + 182 * var1, 12, 171, 346);
         this.add(this.bg[var1++]);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.f();
      }
   }

   public String jg() {
      boolean var1 = false;
      StringBuffer var2;
      (var2 = new StringBuffer()).append(this.mo);
      int var3 = 0;

      for (int var10000 = var3; var10000 < this.mg.size(); var10000 = ++var3) {
         Class41 var4;
         if (Class41.adz(var4 = this.mg.get(var3)) != 0 && Class41.ady(var4) > 0) {
            if (!var1 && Class41.ady(var4) > Class41.adw(var4)) {
               var1 = true;
            }

            String var10001 = "\u0018";
            var2.append("=");
            var2.append(Class41.adz(var4));
            String var10003 = "D";
            var2.append("-");
            var2.append(Class41.ady(var4));
         }
      }

      return var1 ? var2.toString() : null;
   }

   public void ci(String var1) {
      if ((this.mo = var1).equals("物理系")) {
         this._do("sc/b/S268.png");
         this.y(1);
         this.z = BaseValue.getLxLvl(this.jm().getLxValue());
         this.a();
      } else {
         if (this.ao == null) {
            this.ci("");
         } else {
            if (this.ao.indexOf("物理系") != -1) {
               this.ci("物理系");
            } else {
               if (this.ao.indexOf("法术系") != -1) {
                  this.ci("法术系");
               } else {
                  if (this.ao.indexOf("辅助系") != -1) {
                     this.ci("辅助系");
                  } else {
                     this.ci("");
                  }
               }
            }
         }
      }
   }

   public synchronized void f() {
      RoleSummoning var1;
      if ((var1 = this.jm()) == null) {
         this.zc().f(115);
      } else {
         int var3 = BaseValue.getLxLvl(var1.getLxValue());
         this.z = var3;
         if (this.mo != null && !this.mo.equals("")) {
            String var4;
            if ((var4 = var1.getLx()) == null) {
               var4 = "";
            }

            if (!var4.equals(this.ao)) {
               this.ao = var4;
               this.a();
            }
         } else {
            this.di.setText(String.valueOf(var3));
         }
      }
   }

   public void y(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.bg.length; var10000 = ++var2) {
         this.bg[var2].setVisible(var1 == 0);
      }

      this.mm.setVisible(var1 == 1);
      this.mn.setVisible(var1 == 1);

      for (int var5 = var2 = 0; var5 < this.mg.size(); var5 = ++var2) {
         Class41 var3 = this.mg.get(var2);
         if (var1 == 1) {
            var3.setVisible(Class41.adz(var3) != 0);
         } else {
            var3.setVisible(false);
         }
      }
   }

   public static String jh(Skill var0, int var1) {
      String var2 = var0.getRemark();
      double var3 = Double.parseDouble(var0.getValue());
      double var5 = Double.parseDouble(var0.getGrow());

      int var7;
      for (int var10000 = var7 = 1; var10000 <= 34; var10000 = var7) {
         String var8 = MsgUntil.h(var7);
         if (var7 > 10 && var7 % 10 == 0) {
            var8 = new StringBuilder(String.valueOf(MsgUntil.h(var7 / 10))).append("十").toString();
         } else if (var7 > 20) {
            var8 = new StringBuilder(String.valueOf(MsgUntil.h(var7 / 10))).append("十").append(MsgUntil.h(var7 % 10)).toString();
         } else if (var7 > 10) {
            var8 = "十" + MsgUntil.h(var7 % 10);
         }

         var8 = new StringBuilder("{灵犀").append(var8).append("}").toString();
         var2 = var2.replace(var8, jq(var7++, var3, var5, var1));
      }

      return var2;
   }

   // $VF: synthetic method
   static Image ji(Class12 var0) {
      return var0.mj;
   }

   // $VF: synthetic method
   static Image jj(Class12 var0) {
      return var0.hf;
   }

   public void ew(RoleSummoning var1) {
      this.ko = var1.getSid();
      this.ao = var1.getLx();
      if (this.ao == null) {
         this.ci("");
      } else {
         if (this.ao.indexOf("物理系") != -1) {
            this.ci("物理系");
         } else {
            if (this.ao.indexOf("法术系") != -1) {
               this.ci("法术系");
            } else {
               if (this.ao.indexOf("辅助系") != -1) {
                  this.ci("辅助系");
               } else {
                  this.ci("");
               }
            }
         }
      }

      var10000.zc().b(this.lj());
   }

   public void h() {
      String var10008 = "V}\n|\n\\\u0016(\u00130UpB";
      this.mm = new com.xy.i.Class4("sc/b/B366.png", 1, 93, this);
      String var10007 = "\u001a%F#Ft_h\u0019(\u000e";
      String var10012 = "硰宿劾炜";
      this.mn = new com.xy.i.Class4("sc/e/26.png", 1, 94, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "确定加点", this);
      this.mm.setBounds(0, 310, 55, 43);
      this.mn.setBounds(510, 365, 92, 26);
      this.add(this.mm);
      this.add(this.mn);
      this.mg = new ArrayList<>();
      int var1 = 0;

      for (int var10000 = var1; var10000 < 24; var10000 = var1) {
         Object var2 = null;
         Class12 var4;
         if (var1 < 6) {
            var2 = new Class41(this, 11 + var1);
            var4 = this;
         } else if (var1 < 10) {
            var2 = new Class41(this, 22 + var1 - 6);
            var4 = this;
         } else if (var1 < 12) {
            var2 = new Class41(this, 33 + var1 - 10);
            var4 = this;
         } else if (var1 < 14) {
            var2 = new Class41(this, 43 + var1 - 12);
            var4 = this;
         } else if (var1 < 16) {
            var2 = new Class41(this, 53 + var1 - 14);
            var4 = this;
         } else if (var1 < 18) {
            var2 = new Class41(this, 63 + var1 - 16);
            var4 = this;
         } else {
            var2 = new Class41(this, 71 + var1 - 18);
            var4 = this;
         }

         var4.mg.add((Class41)var2);
         var1++;
         this.add((Component)var2);
      }
   }

   public void g(int var1) {
      RoleSummoning var2;
      if ((var2 = this.jm()) != null) {
         if (var1 == 95) {
            String var17 = "牌琘糞";
            this.ci("物理系");
         } else if (var1 == 96) {
            String var16 = "沼杩粒";
            this.ci("法术系");
         } else if (var1 == 97) {
            String var15 = "辠劷糞";
            this.ci("辅助系");
         } else if (var1 == 91) {
            ((Class5)this.zc().j(116)).i(var2.getSid());
         } else if (var1 == 92) {
            int var8 = var2.getLxValue();
            int var9 = var2.getLxGZ();
            if (var8 != 0) {
               int var14;
               long var10000;
               if (this.za().l(2, 12)) {
                  var10000 = 1000000L;
                  var14 = var9;
               } else {
                  var10000 = 10000000L;
                  var14 = var9;
               }

               long var5 = var10000 * var14;
               GameView var10 = this.afx;
               String var10006 = "%\u001e1\u0002\u0015";
               String var10004 = "LXXD|" + var2.getSid();
               String var10007 = "=|佾硋宄覤芯贜=w";
               StringBuilder var10005 = new StringBuilder("#Y你确定要花费#R").append(var5 / 10000L);
               var10006 = "\u0011J\u001f奎讛幨醋浾瀳狩拆肔";
               var10.dm(new ConfirmBean(13, var10004, var10005.append("W#Y大话币重洗灵犀技能").toString()));
            }
         } else if (var1 == 93) {
            String var7;
            if ((var7 = var2.getLx()) != null) {
               String var12 = "糞";
               if (var7.indexOf("系") != -1) {
                  var12 = "靆觨浑烐呈戤肻醤时遠抯奀贍粒";
                  this.afx._do("需要洗点后才能重新选择天赋系");
                  return;
               }
            }

            this.ci("");
         } else {
            if (var1 == 94) {
               String var3;
               if ((var3 = this.jg()) == null) {
                  String var11 = "诒俰攜炧敕";
                  this.afx._do("请修改点数");
                  return;
               }

               String var10003 = "%\u001e#\b\u0015";
               StringBuilder var10001 = new StringBuilder("LXJN|").append(var2.getSid());
               String var10002 = "Y";
               String var4 = Agreement.getSendTextAES("userpet", var10001.append("|").append(var3).toString());
               this.za().k(var4);
            }
         }
      }
   }

   public Class41 jk(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.mg.size(); var10000 = ++var2) {
         Class41 var3;
         if (Class41.adz(var3 = this.mg.get(var2)) == var1) {
            return var3;
         }
      }

      return null;
   }

   // $VF: synthetic method
   static Image jl(Class12 var0) {
      return var0.mh;
   }

   public RoleSummoning jm() {
      return this.yx().getPet(this.ko);
   }

   public Class12(GameView var1) {
      super(115, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "mF1G1\u0012&znKy\u000bf\\,PwLsB0GjKAUrJ}N0UpB";
      String var10010 = "5\ni\u000bi蓰爎\u001eu]j\u0001u]h\u0019(\u000e";
      String var10012 = "mF1G1v-\u001c0UpB";
      String var10014 = "\u001a%F$F\u0015[qXh\u0019(\u000e";
      this.hf = com.xy.w.Class16.c("sc/b/S271.png");
      this.mj = com.xy.w.Class16.c("sc/b/S39.png");
      this.mh = com.xy.w.Class16.c("sc/b/蒙版w34,h34.png");
      this.mi = com.xy.w.Class16.c("sc/b/78_png.xy2uiimg.btn_plock.png");
      this.yy(-1, 0, 644, 405, com.xy.q.Class30.agh);
      this.di = new JLabel("0");
      this.di.setBounds(132, 368, 40, 16);
      this.di.setFont(com.xy.q.Class49.ab);
      this.di.setForeground(Color.white);
      this.add(this.di);
      String var10009 = "5\ni\fi^h\u0019(\u000e";
      var10014 = "兏捇";
      this.ml = new com.xy.i.Class4("sc/e/7.png", 1, 91, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "兑换", this);
      var10008 = "5\ni\fi^h\u0019(\u000e";
      String var10013 = "洉炜";
      this.mk = new com.xy.i.Class4("sc/e/7.png", 1, 92, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "洗点", this);
      this.ml.setBounds(190, 365, 68, 26);
      this.mk.setBounds(265, 365, 68, 26);
      this.add(this.ml);
      this.add(this.mk);
      this.e();
      this.h();
   }

   public String jn(Skill var1, Class41 var2) {
      StringBuffer var3;
      StringBuffer var10000 = var3 = new StringBuffer();
      String var10001 = "J%\u000f \u000f \u000f べ笏绎し`";
      var10000.append("#cffffff【等级】\t");
      var3.append(Class41.ady(var2));
      String var10003 = "\n";
      var3.append("/");
      var3.append(Class41.adr(var2));
      String var10005 = "J4べ拆肔簽剂し`";
      var3.append("#r【技能类别】\t");
      String var10006 = "袵劍";
      var3.append("被动");
      String var10007 = "e\u001be.";
      var3.append("#r#G");
      var3.append(jh(var1, Class41.ady(var2)));
      String var10009 = "=W=r學久板仓";
      var3.append("#r#W学习条件");
      int var4 = 0;

      for (int var13 = var4; var13 < Class41.adu(var2).getList().size(); var13 = ++var4) {
         TYC var5;
         if ((var5 = Class41.adu(var2).getList().get(var4)).getType() == 2) {
            int[] var10 = var5.getVs();
            int var12 = Math.min(Class41.ady(var2), var10.length - 1);
            var10003 = "e\u001be0靆嶛剀鄤烿攙e;";
            StringBuilder var24 = new StringBuilder("#r#Y需已分配点数#R").append(var10[var12]);
            String var28 = "\u0006G炜";
            var3.append(var24.append("#Y点").toString());
         } else if (var5.getType() == 4) {
            var10003 = "e\u001be0厪啍儻觨迸剙";
            StringBuilder var22 = new StringBuilder("#r#Y召唤兽要达到");
            String var25;
            if (var5.getV1() == 4) {
               var25 = "炧匳";
               var25 = "点化";
            } else {
               StringBuilder var26 = new StringBuilder(String.valueOf(var5.getV1()));
               var10003 = "輅";
               var25 = var26.append("转").toString();
            }

            StringBuilder var23 = var22.append(var25).append(var5.getV2());
            var25 = "纂";
            var3.append(var23.append("级").toString());
         } else if (var5.getType() == 5) {
            var10001 = "J4乧e;";
            var3.append("#r与#R");
            boolean var9 = false;
            int var11 = 0;

            for (int var15 = var11; var15 < var5.getVs().length; var15 = ++var11) {
               Skill var8;
               if (var5.getVs()[var11] != Class41.adz(var2) && (var8 = this.yt().ac(String.valueOf(var5.getVs()[var11]))) != null) {
                  if (!var9) {
                     var10001 = "〤";
                     var3.append("、");
                  }

                  var3.append(var8.getSkillname());
                  var9 = true;
               }
            }

            var10001 = "e0仔旌";
            var3.append("#Y互斥");
         } else if (var5.getType() == 6) {
            var10001 = "\u0006l及吒旓俰炙=w";
            var3.append("#r可同时修炼#R");
            int var6 = 0;

            for (int var14 = var6; var14 < var5.getVs().length; var14 = ++var6) {
               Skill var7;
               if ((var7 = this.yt().ac(String.valueOf(var5.getVs()[var6]))) != null) {
                  if (var6 != 0) {
                     var10001 = "と";
                     var3.append("、");
                  }

                  var3.append(var7.getSkillname());
               }
            }

            var10001 = "=|丳皡=w";
            var3.append("#Y中的#R");
            var3.append(var5.getV1());
            var10003 = "J\u001f禤拆肔";
            var3.append("#Y种技能");
         }
      }

      return var3.toString();
   }

   public TYC jo(List<TYC> var1, int var2) {
      int var3;
      for (int var10000 = var3 = 0; var10000 < var1.size(); var10000 = ++var3) {
         TYC var4;
         if ((var4 = var1.get(var3)).getV1() == var2) {
            return var4;
         }
      }

      return null;
   }

   // $VF: synthetic method
   static JLabel jp(Class12 var0) {
      return var0.di;
   }

   public static String jq(int var0, double var1, double var3, int var5) {
      if (var0 == 1) {
         var1 += var3 * var5;
      } else if (var0 == 2) {
         var1 = var1 / 6.0 * 5.0 + var3 / 3.0 * 10.0 * var5;
      } else if (var0 == 3) {
         var1 = var1 / 10.0 * 9.0 + var3 / 10.0 * 3.0 * var5;
      } else if (var0 == 4) {
         var1 = (var1 + var3 * var5) * 2.5;
      } else if (var0 == 5) {
         var1 = var3 / 3.0 * 10.0 * var5;
      } else if (var0 == 6) {
         var1 = (var1 + var3 * var5) * 10.0;
      } else if (var0 == 7) {
         var1 = var1 * 10.0 + var3 * 15.0 * var5;
      } else if (var0 == 9) {
         var1 = 50 + 10 * var5;
      } else if (var0 == 10) {
         var1 = 0.1 + 0.035 * var5;
      } else if (var0 == 11) {
         var1 = 20 + 1 * var5;
      } else if (var0 == 12) {
         var1 = 40 + 1 * var5;
      } else if (var0 == 13) {
         var1 = 50.0 - 1.2 * var5;
      } else if (var0 == 14) {
         var1 = 20.0 - 0.5 * var5;
      } else if (var0 == 15) {
         var1 = 2.5 + 0.08 * var5;
      } else if (var0 == 16) {
         var1 = 28.0 + 2.4 * var5;
      } else if (var0 == 17) {
         var1 = 10 + 10 * var5;
      } else if (var0 == 18) {
         var1 = 20 + 10 * var5;
      } else if (var0 == 19) {
         var1 = 11.0 + 1.3 * var5;
      } else if (var0 == 20) {
         var1 = 28.0 + 2.4 * var5;
      } else if (var0 == 21) {
         var1 = 3.8 + 0.54 * var5;
      } else if (var0 == 22) {
         var1 = 11.0 + 0.31 * var5;
      } else if (var0 == 23) {
         var1 = 97.5 + 2.75 * var5;
      } else if (var0 == 24) {
         var1 = 13.5 + 0.75 * var5;
      } else if (var0 == 25) {
         var1 = 5.5 + 0.65 * var5;
      } else if (var0 == 26) {
         var1 = 3.0 + 0.4 * var5;
      } else if (var0 == 27) {
         var1 = 15 + 5 * var5;
      } else if (var0 == 28) {
         var1 = var1 + var3 * var5 + 2.0;
      } else if (var0 == 29) {
         var1 = var1 + var3 * var5 + 4.0;
      } else if (var0 == 30) {
         var1 = Math.min(var5, 3);
      } else if (var0 == 31) {
         var1 = 9000 + 2500 * var5;
      } else if (var0 == 32) {
         var1 = 4500 + 1250 * var5;
      } else if (var0 == 33) {
         var1 = 40000 + 2000 * var5;
      } else if (var0 == 34) {
         var1 = 60000 + 8000 * var5;
      } else {
         var1 += var3 * var5;
      }

      String var10002 = "e;";
      StringBuilder var10000 = new StringBuilder("#R").append(com.xy.v.Class5.d(var1));
      String var10001 = "=b";
      return var10000.append("#G").toString();
   }
}
