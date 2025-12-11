package com.xy.a.q;

import com.xy.bean.SummonPetBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.readbean.Goodstable;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class34 extends com.xy.q.Class30 {
   private com.xy.q.Class21 wx;
   private JScrollPane ip;
   private com.xy.i.Class3[] nf;
   private JScrollPane wy;
   private com.xy.q.Class18 wz;
   private com.xy.i.Class4[] oc;
   private RichLabel in;
   private com.xy.w.Class18[] fd;
   private com.xy.q.Class54 vo;
   private JLabel[] gj;
   private com.xy.w.Class0 xa;
   private com.xy.q.Class14 p;

   public void ew(RoleSummoning var1) {
      if (var1 == null) {
         this.in.isTextSize("", 130);
      } else {
         Goodstable var2;
         if ((var2 = (Goodstable)this.vo.jx()) != null && !GoodType.ap(var2.getType())) {
            var2 = null;
         }

         ArrayList var3 = null;
         StringBuffer var4 = new StringBuffer();
         if (!com.xy.v.Class12.h(var1.getLyk())) {
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var10000 = var6;

            while (var10000 < var1.getLyk().length()) {
               String var35 = var1.getLyk();
               String var10001 = "J";
               if ((var6 = var35.indexOf("|", var5 + 1)) == -1) {
                  var6 = var1.getLyk().length();
               }

               String var36 = var1.getLyk();
               var10001 = "\u001f";
               if ((var7 = var36.indexOf("=", var5 + 1)) == -1 || var7 > var6) {
                  var7 = var6;
               }

               String var8;
               String var37 = var8 = var1.getLyk().substring(var5, var7);
               var10001 = "爋哷仐寰";
               if (var37.equals("物品亲密")) {
                  var10000 = var6;
               } else {
                  label199: {
                     long var9 = (long)(Double.parseDouble(var1.getLyk().substring(var7 + 1, var6)) * 100.0);
                     if (var3 == null) {
                        var3 = new ArrayList();
                     }

                     Iterator var12;
                     for (Iterator var38 = var12 = var3.iterator(); var38.hasNext(); var38 = var12) {
                        com.xy.v.Class26 var11;
                        if ((var11 = (com.xy.v.Class26)var12.next()).a.equals(var8)) {
                           var11.b += var9;
                           var10000 = var6;
                           break label199;
                        }
                     }

                     var10000 = var6;
                     var3.add(new com.xy.v.Class26(var8, var9));
                  }
               }

               var5 = var10000 + 1;
               var10000 = var6;
            }
         }

         if (!com.xy.v.Class12.h(var1.getResistance())) {
            int var13 = 0;
            int var17 = 0;
            int var23 = 0;
            int var40 = var17;

            while (var40 < var1.getResistance().length()) {
               String var41 = var1.getResistance();
               String var56 = "^";
               if ((var17 = var41.indexOf("|", var13 + 1)) == -1) {
                  var17 = var1.getResistance().length();
               }

               String var42 = var1.getResistance();
               var56 = "\u000b";
               if ((var23 = var42.indexOf("=", var13 + 1)) == -1 || var23 > var17) {
                  var23 = var17;
               }

               String var28;
               String var43 = var28 = var1.getResistance().substring(var13, var23);
               var56 = "牽哣亦寤";
               if (var43.equals("物品亲密")) {
                  var40 = var17;
               } else {
                  label200: {
                     long var30 = (long)(Double.parseDouble(var1.getResistance().substring(var23 + 1, var17)) * 100.0);
                     if (var3 == null) {
                        var3 = new ArrayList();
                     }

                     Iterator var34;
                     for (Iterator var44 = var34 = var3.iterator(); var44.hasNext(); var44 = var34) {
                        com.xy.v.Class26 var32;
                        if ((var32 = (com.xy.v.Class26)var34.next()).a.equals(var28)) {
                           var32.b += var30;
                           var40 = var17;
                           break label200;
                        }
                     }

                     var40 = var17;
                     var3.add(new com.xy.v.Class26(var28, var30));
                  }
               }

               var13 = var40 + 1;
               var40 = var17;
            }
         }

         if (var2 != null) {
            int var14 = 0;
            int var19 = 0;
            int var25 = 0;
            int var46 = var19;

            while (var46 < var2.getValue().length()) {
               String var47 = var2.getValue();
               String var59 = "J";
               if ((var19 = var47.indexOf("|", var14 + 1)) == -1) {
                  var19 = var2.getValue().length();
               }

               String var48 = var2.getValue();
               var59 = "\u001f";
               if ((var25 = var48.indexOf("=", var14 + 1)) == -1 || var25 > var19) {
                  var25 = var19;
               }

               String var29;
               String var49 = var29 = var2.getValue().substring(var14, var25);
               var59 = "笫纑";
               if (var49.equals("等级")) {
                  var46 = var19;
               } else {
                  com.xy.v.Class26 var31 = null;
                  int var10 = 0;
                  int var33 = var3 != null ? var3.size() : 0;
                  var46 = var10;

                  StringBuffer var51;
                  while (true) {
                     if (var46 >= var33) {
                        var51 = var4;
                        break;
                     }

                     if (var29.equals(((com.xy.v.Class26)var3.get(var10)).a)) {
                        var31 = (com.xy.v.Class26)var3.remove(var10);
                        var51 = var4;
                        break;
                     }

                     var46 = ++var10;
                  }

                  if (var4.length() == 0) {
                     var59 = "7u";
                     var59 = "#W";
                  } else {
                     var59 = "AD";
                     var59 = "#r";
                  }

                  var51.append(var59);
                  var4.append(var29);
                  String var10003 = ".\u0002";
                  var4.append(": ");
                  var4.append(var31 != null ? com.xy.v.Class12.e(var31.b / 100.0, 1) : 0);
                  String var10002 = "\u0016AqI\u0016";
                  var4.append(" #G+ ");
                  var4.append(com.xy.v.Class12.e(Double.parseDouble(var2.getValue().substring(var25 + 1, var19)), 1));
                  String var10004 = "7u";
                  var4.append("#W");
                  var46 = var19;
               }

               var14 = var46 + 1;
               var46 = var19;
            }
         }

         int var15 = 0;
         int var21 = var3 != null ? var3.size() : 0;

         for (int var53 = var15; var53 < var21; var53 = var15) {
            com.xy.v.Class26 var27 = (com.xy.v.Class26)var3.get(var15);
            String var66;
            if (var4.length() == 0) {
               var66 = "Aa";
               var66 = "#W";
            } else {
               var66 = "7P";
               var66 = "#r";
            }

            var4.append(var66);
            var4.append(var27.a);
            String var68 = "X\u0016";
            var4.append(": ");
            double var69 = var27.b / 100.0;
            var15++;
            var4.append(com.xy.v.Class12.e(var69, 1));
         }

         this.in.isTextSize(var4.toString(), 130);
      }
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         this.f();
         this.vo.gs(0, null);
         this.wz.t();
         super.l();
      }
   }

   public Class34(GameView var1) {
      super(17, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "\u0011UMRM\u0007LF\fQ";
      this.yy(-1, 0, 560, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var40 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "\u0002炨\u0002如\u0002";
      this.yu(var40, " 炼 妖 ");
      this.wz = new com.xy.q.Class18(this);
      this.wz.setBounds(0, 0, 140, 20);
      this.wy = com.xy.q.Class1.g(42, 270, 170, 185, this.wz, 20);
      this.add(this.wy);
      this.in = new RichLabel("", com.xy.q.Class49.n, 130);
      this.ip = com.xy.q.Class1.g(376, 60, 145, 178, this.in, 20);
      this.add(this.ip);
      this.oc = new com.xy.i.Class4[5];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.oc.length; var10000 = var2) {
         com.xy.i.Class4[] var5 = this.oc;
         String var35;
         if (var2 == 0) {
            var35 = "E\u0001\u0019\u0007\u0019Q\u000eLF\fQ";
            var35 = "sc/e/38.png";
         } else {
            var35 = "gA;G;\u0015:RzE";
            var35 = "sc/e/7.png";
         }

         byte var10006;
         int var10007;
         if (var2 == 0) {
            var10006 = 0;
            var10007 = var2;
         } else {
            var10006 = 51;
            var10007 = var2;
         }

         Font var39 = var10007 == 0 ? com.xy.q.Class49.bx : com.xy.q.Class49.ch;
         Class34 var44;
         if (var2 == 0) {
            var10009 = "炊B妠";
            var10009 = "炼 妖";
            var44 = this;
         } else if (var2 == 1) {
            var10009 = "炨妴";
            var10009 = "炼妖";
            var44 = this;
         } else {
            var10009 = "";
            var44 = this;
         }

         com.xy.i.Class4 var10001 = new com.xy.i.Class4(var35, 1, var10006, var39, com.xy.q.Class49.bv, var10009, var44);
         var5[var2] = var10001;
         Class34 var6;
         if (var2 == 0) {
            var6 = this;
            this.oc[var2].setOffsetTexts(com.xy.q.Class49.d);
            this.oc[var2].setBounds(60, 16, 95, 33);
            this.oc[var2].setKeep(true);
         } else {
            if (var2 == 1) {
               this.oc[var2].setBounds(258, 168, 59, 25);
            }

            var6 = this;
         }

         var6.add(this.oc[var2++]);
      }

      this.gj = new JLabel[3];

      for (int var7 = var2 = 0; var7 < this.gj.length; var7 = ++var2) {
         if (var2 != 0 && var2 != 1) {
            int var37 = 101 + var2 * 17;
            String var10008 = "AU[\u000f[\u000f[\u000f";
            this.gj[var2] = com.xy.q.Class1.f(256, var37, 59, 16, 0, com.xy.q.Class49.c("#c999999"), com.xy.q.Class49.bz);
            JLabel var8 = this.gj[var2];
            String var12;
            if (var2 == 0) {
               var12 = "炨妴";
               var12 = "炼妖";
            } else if (var2 == 1) {
               var12 = "爋哷";
               var12 = "物品";
            } else if (var2 == 2) {
               var12 = "炞如欃敤Ｘ";
               var12 = "炼妖次数：";
            } else {
               var12 = "";
            }

            var8.setText(var12);
            if (var2 == 2) {
               this.gj[var2].setFont(com.xy.q.Class49.ch);
               JLabel var15 = this.gj[var2];
               String var17 = "AUR\u0006R\u0006R\u0006";
               var15.setForeground(com.xy.q.Class49.c("#c000000"));
               this.gj[var2].setBounds(218, 203, 86, 19);
            }

            this.add(this.gj[var2]);
         }
      }

      this.p = com.xy.q.Class1.i(300, 203, 44, 19, 0, Color.white, com.xy.q.Class49.ac);
      String var10005 = "Qw\rp\r%\u0015:RzE";
      this.p.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.p);
      this.vo = new com.xy.q.Class54(this);
      this.vo.setBounds(260, 93, 50, 50);
      this.add(this.vo);
      this.fd = new com.xy.w.Class18[9];

      for (int var9 = var2 = 0; var9 < this.fd.length; var9 = var2) {
         this.fd[var2] = new com.xy.w.Class18();
         Class34 var10;
         if (var2 == 0) {
            var10 = this;
            com.xy.w.Class18 var18 = this.fd[var2];
            String var10003 = "E\u0001\u0019\u0006\u0019P\u0002LF\fQ";
            var18.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fd[var2].setBounds(46, 59, 150, 180);
         } else if (var2 == 1) {
            var10 = this;
            com.xy.w.Class18 var19 = this.fd[var2];
            String var28 = "gA;F;\u0016:RzE";
            var19.dp("sc/d/4.png");
            this.fd[var2].setBounds(256, 89, 59, 57);
         } else if (var2 == 2) {
            var10 = this;
            com.xy.w.Class18 var20 = this.fd[var2];
            String var29 = "E\u0001\u0019\u0006\u0019Q\u0006LF\fQ";
            var20.dp("sc/d/30.png");
            this.fd[var2].setBounds(257, 146, 58, 1);
         } else if (var2 == 3) {
            var10 = this;
            com.xy.w.Class18 var21 = this.fd[var2];
            String var30 = "Qw\rp\r \u001b:RzE";
            var21.mt(com.xy.w.Class16.m("sc/d/49.png", 6, 6, 6, 6, false));
            this.fd[var2].setBounds(372, 59, 150, 180);
         } else if (var2 == 4) {
            var10 = this;
            com.xy.w.Class18 var22 = this.fd[var2];
            String var31 = "E\u0001\u0019\u0006\u0019P\u0002LF\fQ";
            var22.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fd[var2].setBounds(372, 59, 150, 180);
         } else if (var2 == 5) {
            var10 = this;
            com.xy.w.Class18 var23 = this.fd[var2];
            String var32 = "Qw\rp\r&\u0017:RzE";
            var23.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.fd[var2].setBounds(42, 249, 170, 21);
         } else if (var2 == 6) {
            var10 = this;
            com.xy.w.Class18 var24 = this.fd[var2];
            String var33 = "E\u0001\u0019\u0006\u0019P\u0002LF\fQ";
            var24.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.fd[var2].setBounds(42, 249, 170, 206);
         } else if (var2 == 7) {
            var10 = this;
            com.xy.w.Class18 var25 = this.fd[var2];
            String var34 = "Qw\rp\r%\u001b:RzE";
            var25.mt(com.xy.w.Class16.m("sc/d/19.png", 5, 5, 5, 5, false));
            this.fd[var2].setBounds(217, 249, 309, 207);
         } else {
            if (var2 == 8) {
               com.xy.w.Class18 var16 = this.fd[var2];
               String var26 = "E\u0001\u0019\u0006\u0019Q\u0003LF\fQ";
               var16.mt(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
               this.fd[var2].setBounds(31, 30, 515, 20);
            }

            var10 = this;
         }

         var10.add(this.fd[var2++]);
      }

      this.wx = new com.xy.q.Class21(this, 6, 4, 51, 51, 0, 0, 218, 251);
      String var38 = "Qw\rp\r%\u001a:RzE";
      this.wx.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.wx.rm(true);
      this.add(this.wx);
   }

   public com.xy.q.Class54 ep() {
      return this.vo;
   }

   public void c() {
      this.p.setText(null);
      this.xa = null;
      this.ew(null);
   }

   public void e() {
      this.lc(this.yx().getRolePet(this.wz.ee()));
   }

   public void f() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.nf == null || this.nf.length != var1) {
         this.nf = this.zd(this.nf, var1, this.wx.ah());
         short var2 = 526;
         short var3 = 249;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.nf.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.nf[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.wx.vr(this.nf, 0);
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.xa != null) {
         this.xa.r(var1, 122, 215, 0, com.xy.v.Class22.l());
      }
   }

   public void cr(boolean var1) {
      RoleData var2;
      RolePet var3;
      RoleSummoning var4 = (var3 = (var2 = this.yx()).getRolePet(this.wz.ee())) != null ? var3.getPet() : null;
      if (var4 == null) {
         String var15 = "诣逫拽佂覕炞匂皦司唆兩Ｃ";
         this.afx._do("请选择你要炼化的召唤兽！");
      } else {
         Goodstable var5 = this.vo.il() == 1 ? var2.getGood(new BigDecimal(this.vo.ee())) : null;
         if (var5 == null) {
            String var14 = "佖辺沗遫丛爋哷";
            this.afx._do("你还没选中物品");
         } else if (var5.getGoodlock() == 1) {
            String var13 = "诇牽哣左袉労锣";
            this.afx.dp("该物品已被加锁");
         } else {
            SummonPetBean var6 = null;
            SummonPetBean var10000;
            if (var5.getType() == 701L) {
               if (var4.getSsn() != null && !var4.getSsn().equals("0")) {
                  String var10 = "辻叜厎唒償旖沷佉畊釧枑霄";
                  this.afx._do("这只召唤兽无法使用金柳露");
                  return;
               }

               if (var4.getTurnRount() != 0) {
                  String var10001 = "月轸皦安宿扙反仱佝甼釳柧霐";
                  this.afx._do("未转的宝宝才可以使用金柳露");
                  return;
               }

               var10000 = var6 = new SummonPetBean(1);
            } else if (var5.getType() == 713L) {
               var10000 = var6 = new SummonPetBean(101);
            } else if (var5.getType() == 714L) {
               var10000 = var6 = new SummonPetBean(102);
            } else {
               if (GoodType.ap(var5.getType())) {
                  int var7 = this.za().l(2, 3) ? 9 : (this.za().l(2, 12) ? 11 : 12);
                  if (var4.getAlchemynum() >= var7) {
                     GameView var9 = this.afx;
                     String var10003 = "叚商克";
                     StringBuilder var11 = new StringBuilder("召唤兽").append(var4.getSummoningname());
                     String var10002 = "皦炨妴欵敒左续趑迥";
                     var11 = var11.append("的炼妖次数已经超过").append(var7);
                     var10002 = "歃Ｗ";
                     var9._do(var11.append("次！").toString());
                     return;
                  }

                  if (!var1 && this.za().l(2, 12)) {
                     ((com.xy.a.Class6)this.zc().j(27)).ch(var4, var5);
                     return;
                  }

                  var6 = new SummonPetBean(103);
               }

               var10000 = var6;
            }

            if (var10000 != null) {
               var6.setPetid(var4.getSid());
               var6.setGoodid(var5.getRgid());
               String var8 = Agreement.getSendTextAES("summonpet", com.xy.v.Class31.a().toJson(var6));
               this.za().k(var8);
               this.vo.gs(0, null);
            }
         }
      }
   }

   public void h() {
      RolePet var1;
      this.ew((var1 = this.yx().getRolePet(this.wz.ee())) != null ? var1.getPet() : null);
   }

   @Override
   public boolean ah() {
      this.c();
      return super.ah();
   }

   public void lc(RolePet var1) {
      if (var1 == null) {
         this.c();
      } else {
         this.p.setText(String.valueOf(var1.getPet().getAlchemynum()));
         this.xa = var1.getPet().getPart(this.afx);
         this.ew(var1.getPet());
      }
   }
}
