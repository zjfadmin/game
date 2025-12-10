package com.xy;

import com.xy.bean.QualityClBean;
import com.xy.bean.UseCardBean;
import com.xy.formula.BaseEquip;
import com.xy.formula.GoodType;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class53 extends Class345 {
   private Class556 air;
   private Class436[] oi;
   private List<null> vz;
   public int gw;
   private MoneyType rr;
   private Class659 qc;
   public QualityClBean ais;
   private BigDecimal ne;
   private JLabel[] ly;
   private Class529[] acz;

   public Class53(GameView var1) {
      int var10001 = --3;
      int var10004 = 5 >> 2;
      int var10008 = -4 >> 2;
      super(31 & 107, --3, Class345.aef, var1);
      this.va(var10008, 3 >> 2, 15351 & 17886, 7118 & 25977, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 79 & 116, 79 & 116, 79 & 116, 79 & 116, (boolean)(2 & 5)), (String)null);
      this.ak((boolean)var10004);
      this.vz = new ArrayList();
      Class529[] var5 = new Class529[var10001];
      boolean var10003 = true;
      this.acz = var5;

      int var2;
      Class53 var4;
      int var10000;
      for(var10000 = var2 = 3 ^ 3; var10000 < this.acz.length; var10000 = var2) {
         Class529[] var3 = this.acz;
         Class529 var10002 = new Class529;
         int var10005 = 4 ^ 5;
         int var10006 = (17147 & 15844) + var2;
         Font var10007 = Class681.ak;
         String var10009;
         Class53 var10010;
         if (var2 == 0) {
            var10009 = "保留原属性";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "替换新属性";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "再次炼化";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/46.png", var10005, var10006, var10007, (Color[])null, var10009, var10010);
         var3[var2] = var10002;
         if (var2 != 0 && var2 != (3 & 5)) {
            if (var2 == --2) {
               this.acz[var2].setFont(Class681.bm);
               this.acz[var2].setImage("sc/e/28.png");
               this.acz[var2].setBounds(23423 & 9709, 61 & 94, 108 & 87, 87 & 58);
            }

            var4 = this;
         } else {
            var4 = this;
            this.acz[var2].setForeground(Color.black);
            this.acz[var2].setBounds((103 & 93) + (12015 & 20959) * var2, 8471 & 24575, 127 & 119, 123 & 29);
         }

         var4.add(this.acz[var2++]);
      }

      var10001 = --5;
      this.qc = new Class659();
      this.qc.gb((boolean)(--1));
      this.qc.fx("初学乍练");
      this.qc.fx("初窥门径");
      this.qc.fx("略有小成");
      this.qc.fx("融会贯通");
      this.qc.fx("心领神会");
      this.qc.fx("炉火纯青");
      this.qc.vf(126 & 69, 30 & 125, 99, 19);
      this.qc.setVisible((boolean)(3 ^ 3));
      this.add(this.qc);
      this.rr = new MoneyType();
      this.rr.setIdAndKey(--3, "仙玉");
      this.air = Class133.m(68, 28, 99, 19, 10, Color.white, Class681.q, this.rr, var1);
      this.air.ab(1 ^ 3);
      this.air.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.add(this.air);
      JLabel[] var6 = new JLabel[var10001];
      var10003 = true;
      this.ly = var6;

      for(var10000 = var2 = 5 >> 3; var10000 < this.ly.length; var10000 = var2) {
         JLabel[] var8 = this.ly;
         int var9 = 57 + 210 * var2;
         Color var10;
         int var11;
         if (var2 == 0) {
            var10 = Color.white;
            var11 = var2;
         } else if (var2 == 5 >> 2) {
            var10 = Color.green;
            var11 = var2;
         } else {
            var10 = Color.black;
            var11 = var2;
         }

         var8[var2] = Class133.b(var9, 59, 183, 23, var10, var11 == 4 ? Class681.ce : (var2 != (1 ^ 3) && var2 != --3 ? Class681.cg : Class681.ak));
         this.ly[var2].setHorizontalAlignment(10);
         this.ly[var2].setText(var2 == 0 ? "原炼化属性" : (var2 == 3 >> 1 ? "新炼化属性" : (var2 == 5 >> 1 ? "仙玉" : (var2 == --3 ? "追加特技" : ""))));
         if (var2 == --2) {
            var4 = this;
            this.ly[var2].setBounds(28, 28, 36, 19);
         } else if (var2 == --3) {
            var4 = this;
            this.ly[var2].setBounds(293, 29, 68, 17);
         } else {
            if (var2 == --4) {
               this.ly[var2].setBounds(30, 10, 450, 17);
            }

            var4 = this;
         }

         var4.add(this.ly[var2++]);
      }

      Class436[] var7 = new Class436[--5];
      var10003 = true;
      this.oi = var7;

      for(var10000 = var2 = 3 & 4; var10000 < this.oi.length; var10000 = var2) {
         this.oi[var2] = new Class436();
         if (var2 == 0) {
            var4 = this;
            this.oi[var2].fw("sc/e/29.png");
            this.oi[var2].setBounds(276, 28, 17, 17);
         } else if (var2 != (2 ^ 3) && var2 != 2) {
            if (var2 == 3 || var2 == 4) {
               this.oi[var2].eq(Class511.q("sc/d/36.png", 20, 20, 20, 20, (boolean)(5 >> 3)));
               this.oi[var2].setBounds(26 + (var2 - 3) * 210, 50, 208, 218);
            }

            var4 = this;
         } else {
            var4 = this;
            this.oi[var2].fw("sc/d/34.png");
            this.oi[var2].setBounds(36 + (var2 - (3 & 5)) * 210, 59, 183, 23);
         }

         var4.add(this.oi[var2++]);
      }

      if (this.uw().n(2, 7)) {
         this.oi[3 ^ 3].setVisible((boolean)(3 >> 2));
         this.ly[3].setVisible((boolean)(3 ^ 3));
      } else {
         if (this.uw().gameType == 2) {
            this.oi[0].setVisible(false);
            this.ly[3].setVisible(false);
            this.ly[2].setVisible(false);
            this.air.setVisible(false);
         }

      }
   }

   public <undefinedtype> zd(boolean var1, int var2, boolean var3) {
      int var4;
      for(int var10000 = var4 = 3 >> 2; var10000 < this.vz.size(); var10000 = var4) {
         <undefinedtype> var5;
         if ((var5 = (<undefinedtype>)this.vz.get(var4)).ee == var1 && var5.j == var2) {
            var5.rl((String)null, (String)null);
            if (var5.av != null) {
               var5.av.setVisible(var3);
            }

            var5.setVisible((boolean)(3 & 5));
            return var5;
         }

         ++var4;
      }

      MouseListener var6;
      (var6 = new MouseListener(var1, var2) {
         private Class436 tu;
         private boolean hg;
         private JLabel at;
         private boolean ee;
         private int j;
         private Class436 av;
         private JLabel rk;
         private Class436 ih;

         public {
            int var10001 = 43 & 93;
            this.ee = var2;
            this.j = var3;
            this.at = Class133.b(var10001, 2 & 5, 127 & 126, 95 & 60, var2 ? Color.white : Color.green, Class681.ab);
            this.rk = Class133.b(8155 & 24751, 5 >> 3, 81 & 127, 94 & 61, var2 ? Color.white : Color.green, Class681.ab);
            this.tu = new Class436(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
            this.ih = new Class436(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(5 >> 3)));
            this.add(this.at);
            this.add(this.rk);
            if (var2) {
               this.av = new Class436();
               this.av.setBounds(112 & 127, --5, 121 & 23, 121 & 23);
               this.add(this.av);
               this.addMouseListener(this);
            }

            this.tu.setBounds(2 & 5, 2 & 5, 18663 & 14239, 60 & 95);
            this.ih.setBounds(12462 & 20441, 5 >> 3, 63 & 119, 61 & 94);
            this.add(this.tu);
            this.add(this.ih);
         }

         public void mousePressed(MouseEvent var1) {
         }

         public void mouseReleased(MouseEvent var1) {
         }

         public void mouseEntered(MouseEvent var1) {
         }

         public void ak(boolean var1) {
            if (this.av != null) {
               if (this.av.ga() == null || this.hg != var1) {
                  this.hg = var1;
                  this.av.fw(var1 ? "sc/e/30.png" : "sc/e/29.png");
               }
            }
         }

         public void mouseExited(MouseEvent var1) {
         }

         public void rl(String var1, String var2) {
            this.at.setText(var1);
            this.rk.setText(var2);
         }

         public void mouseClicked(MouseEvent var1) {
         }
      }).setBounds(var1 ? 115 & 46 : 244, 85 + (126 & 31) * var2, 14556 & 18431, 93 & 62);
      this.vz.add(var6);
      this.add(var6, --5);
      if (var6.av != null) {
         var6.av.setVisible(var3);
      }

      var6.setVisible((boolean)(5 >> 2));
      return var6;
   }

   public void ze(String var1, int var2, boolean var3) {
      if (this.uw().n(1 ^ 3, 103 & 31)) {
         if (this.gw != 0) {
            var3 = 2 & 5;
         }
      } else if (this.uw().gameType == --2) {
         var3 = 3 ^ 3;
      }

      int var4 = 1;
      int var5;
      <undefinedtype> var6;
      int var10000;
      String var28;
      if (var2 == 0) {
         for(var10000 = var5 = 3 >> 2; var10000 < this.vz.size(); var10000 = var5) {
            if ((var6 = (<undefinedtype>)this.vz.get(var5)).ee) {
               var6.av.setVisible((boolean)(5 >> 3));
            }

            ++var5;
         }

         if (this.gw == 0) {
            this.ly[--4].setText((String)null);
         }

         this.ais = null;

         for(var10000 = var5 = 2 & 5; var10000 < this.vz.size(); var10000 = var5) {
            Object var27 = this.vz.get(var5);
            ++var5;
            ((<undefinedtype>)var27).setVisible((boolean)(3 & 4));
         }

         var4 = 3 >> 1;
         var28 = var1;
      } else {
         if (var2 == (4 ^ 5)) {
            for(var10000 = var5 = 3 & 4; var10000 < this.vz.size(); var10000 = var5) {
               if (!(var6 = (<undefinedtype>)this.vz.get(var5)).ee) {
                  var6.setVisible((boolean)(3 >> 2));
               }

               ++var5;
            }

            var4 = 5 >> 3;
         }

         var28 = var1;
      }

      if (var28 != null && !var1.equals("")) {
         String[] var19 = var1.split(this.gw == (7 & 127) ? "\\|" : "&");
         int var18 = 3 >> 2;
         int var7;
         String[] var8;
         int var16;
         String var10001;
         StringBuilder var10002;
         String var10003;
         int var21;
         <undefinedtype> var29;
         if (this.gw != 0 && this.gw != (2 ^ 3) && this.gw != -4 >> 2 && this.gw != (40 & 95)) {
            if (this.gw == --2 || this.gw == --3) {
               for(var10000 = var7 = 1; var10000 < var19.length; var10000 = var7) {
                  if (!(var8 = var19[var7].split("="))[5 >> 3].equals("星阵 ")) {
                     var29 = this.zd((boolean)var4, var18, (boolean)var3);
                     var10001 = var8[0];
                     var10002 = new StringBuilder(String.valueOf(var8[1]));
                     var10003 = Class270.so(var8[0]);
                     ++var18;
                     var29.rl(var10001, var10002.append(var10003).toString());
                  } else {
                     var29 = this.zd((boolean)var4, var18, (boolean)var3);
                     var10001 = var8[1];
                     int var30 = --2;
                     ++var18;
                     var29.rl(var10001, var8[var30]);
                  }

                  ++var7;
               }
            } else if (this.gw == --4) {
               for(var10000 = var7 = 0; var10000 < var19.length; var10000 = var7) {
                  var8 = var19[var7].split("=");
                  var29 = this.zd((boolean)var4, var18, (boolean)var3);
                  var10001 = var8[0];
                  var10002 = new StringBuilder(String.valueOf(var8[1]));
                  var10003 = Class270.so(var8[0]);
                  ++var18;
                  var29.rl(var10001, var10002.append(var10003).toString());
                  ++var7;
               }
            } else if (this.gw == --5 || this.gw == (102 & 31)) {
               double var20 = 1.0D;
               var21 = (var16 = Integer.parseInt(var19[1])) >> --5 & 127 & 31;
               int var10 = var16 & 127 & 31;
               if (var2 == 0 && this.gw == (31 & 102)) {
                  this.ly[--4].setText("粹炼需要消耗" + (1 + var21 / (75 & 60) + var10 / (25 & 110)) + "份材料");
               }

               var29 = this.zd((boolean)var4, var18, (boolean)var3);
               String var10004 = String.valueOf(var21 + var10);
               ++var18;
               var29.rl("总点粹值", var10004);

               int var11;
               Skill var12;
               for(var10000 = var11 = --4; var10000 < var19.length; var10000 = var11) {
                  if (var19[var11].startsWith("特技=") && (var12 = this.vc().bf(var19[var11].substring(--3))) != null) {
                     int var13;
                     if ((var13 = Integer.parseInt(var12.getSkillid())) == (32699 & 8189)) {
                        var20 += 0.15D;
                     } else if (var13 == (24507 & 16382)) {
                        var20 += 0.25D;
                     }
                  }

                  ++var11;
               }

               for(var10000 = var11 = --2; var10000 < 4 && var11 < var19.length; var10000 = var11) {
                  int var25;
                  if (!var19[var11].startsWith("特技=") && (var25 = var19[var11].indexOf("=")) != -4 >> 2) {
                     String var26 = var19[var11].substring(0, var25);
                     var25 = var19[var11].indexOf("#", var26.length() + 1);
                     double var14 = BaseEquip.getDouble(var19[var11].substring(var26.length() + 1, var25)) * (double)(var11 == 2 ? var21 : var10) + BaseEquip.getDouble(var19[var11].substring(var25 + 1));
                     if (var20 != 1.0D) {
                        var14 *= var20;
                     }

                     var29 = this.zd((boolean)var4, var18, (boolean)var3);
                     var10002 = new StringBuilder(String.valueOf(Class509.d(var14)));
                     var10003 = Class270.so(var26);
                     ++var18;
                     var29.rl(var26, var10002.append(var10003).toString());
                  }

                  ++var11;
               }

               for(var10000 = var11 = 4; var10000 < var19.length; var10000 = var11) {
                  if (var19[var11].startsWith("特技=") && (var12 = this.vc().bf(var19[var11].substring(3))) != null) {
                     var29 = this.zd((boolean)var4, var18, (boolean)var3);
                     ++var18;
                     var29.rl("特技", var12.getSkillname());
                  }

                  ++var11;
               }
            } else if (this.gw == (39 & 95)) {
               for(var10000 = var7 = 0; var10000 < var19.length; var10000 = var7) {
                  var8 = var19[var7].split("=");
                  var29 = this.zd((boolean)var4, var18, (boolean)var3);
                  var10001 = var8[0];
                  ++var18;
                  var29.rl(var10001, var8[1]);
                  ++var7;
               }
            }
         } else {
            var7 = this.gw == 0 ? --1 : 2;

            for(var10000 = var7; var10000 < var19.length; var10000 = var7) {
               if (!(var8 = var19[var7].split("="))[3 ^ 3].equals("特技")) {
                  var29 = this.zd((boolean)var4, var18, (boolean)var3);
                  var10001 = var8[2 & 5];
                  var10002 = new StringBuilder(String.valueOf(var8[2 ^ 3]));
                  var10003 = Class270.so(var8[3 >> 2]);
                  ++var18;
                  var29.rl(var10001, var10002.append(var10003).toString());
               } else {
                  for(var10000 = var16 = 1; var10000 < var8.length; var10000 = var16) {
                     Skill var9;
                     if ((var9 = this.vc().bf(var8[var16])) != null) {
                        var29 = this.zd((boolean)var4, var18, (boolean)var3);
                        var10001 = var8[3 ^ 3];
                        ++var18;
                        var29.rl(var10001, var9.getSkillname());
                     }

                     ++var16;
                  }
               }

               ++var7;
            }
         }

         int var22;
         boolean var31;
         label199: {
            boolean var24 = false;
            if (var2 == 0) {
               if (this.gw == 1) {
                  var22 = 0;
                  var16 = 0;

                  for(var10000 = var21 = 0; var10000 < this.vz.size(); var10000 = var21) {
                     <undefinedtype> var23;
                     if ((var23 = (<undefinedtype>)this.vz.get(var21)).ee) {
                        if (var23.isVisible()) {
                           ++var22;
                        }

                        if (var23.ee && var23.hg) {
                           ++var16;
                        }
                     }

                     ++var21;
                  }

                  if (var16 > var22) {
                     var31 = var24 = true;
                     this.aej.f("请重新锁定");
                     break label199;
                  }
               } else {
                  var24 = true;
               }
            }

            var31 = var24;
         }

         if (var31) {
            for(var10000 = var22 = 0; var10000 < this.vz.size(); var10000 = var22) {
               <undefinedtype> var17;
               if ((var17 = (<undefinedtype>)this.vz.get(var22)).ee) {
                  var17.ak(false);
               }

               ++var22;
            }
         }

      } else {
         if (var2 == 0 && this.gw == (22 & 111)) {
            this.ly[--4].setText("粹炼需要消耗1份材料");
         }

      }
   }

   public void y(int var1) {
      if (var1 == (16120 & 16871)) {
         this.ve().n(this.ae());
      } else if (var1 == (10477 & 22515)) {
         if (this.ais != null) {
            String var2 = Agreement.getSendTextAES("extrattroper", Class695.b().toJson(this.ais));
            this.uw().d(var2);
            this.zh(this.ais);
         } else {
            this.ve().n(this.ae());
         }
      } else {
         if (var1 == (9958 & 23035)) {
            this.d();
         }

      }
   }

   public int ov() {
      int var1 = 5 >> 3;
      int var2 = 2 & 5;
      return var1 * (14 & 123) + var2;
   }

   public String zf(boolean var1) {
      int var2;
      if ((var2 = this.qc.ae()) == -4 >> 2) {
         return null;
      } else {
         UseCardBean var3;
         if ((var3 = this.vd().getLimit("单人竞技场")) == null) {
            if (var1) {
               this.aej.f("你还未获得称号");
            }

            return null;
         } else {
            String[] var5 = var3.getValue().split("\\|");
            Class367 var4 = this.qc.ana();
            if (var5.length < var2 + (5 >> 2)) {
               if (var1) {
                  this.aej.f("你还未获得" + var4.d() + "称号");
               }

               return null;
            } else {
               this.qc.fa().setText(var4.d());
               return var5[var2];
            }
         }
      }
   }

   public String pu(boolean var1) {
      this.qc.ak((boolean)(3 & 4));
      this.qc.setVisible(var1);
      return var1 ? this.zf((boolean)(5 >> 3)) : null;
   }

   public void d() {
      Class595 var1;
      Class250 var2;
      String var3;
      if (this.gw == 0) {
         var2 = (var1 = (Class595)this.aej.getFormManagement().e(63 & 125)).e() == 0 ? var1.zl() : null;
         var3 = var2 != null ? var2.yo() : null;
         if (var3 == null || !var3.equals("炼化装备") && !var3.equals("炼化仙器") && !var3.equals("炼化神兵")) {
            this.aej.f("请选择材料");
         } else {
            var2.ij((boolean)(2 & 5));
         }
      } else if (this.gw != (4 ^ 5) && this.gw != -4 >> 2) {
         if (this.gw != 5 >> 1 && this.gw != --3) {
            if (this.gw != --4) {
               if (this.gw == --5) {
                  var2 = (var1 = (Class595)this.aej.getFormManagement().e(63 & 125)).e() == (3 & 5) ? var1.zl() : null;
                  var3 = var2 != null ? var2.yo() : null;
                  if (var3 != null && var3.equals("配饰点粹")) {
                     var2.ij((boolean)(3 >> 2));
                     return;
                  }

                  this.aej.f("请选择材料");
                  return;
               }

               if (this.gw == (127 & 6)) {
                  var2 = (var1 = (Class595)this.aej.getFormManagement().e(125 & 63)).e() == (3 & 5) ? var1.zl() : null;
                  var3 = var2 != null ? var2.yo() : null;
                  if (var3 != null && var3.equals("配饰粹炼")) {
                     var2.ij((boolean)(3 ^ 3));
                     return;
                  }

                  this.aej.f("请选择材料");
                  return;
               }

               Class660 var4;
               if (this.gw == (79 & 55)) {
                  if ((var4 = (Class660)this.aej.getFormManagement().e(30198 & 2735)).e() == 5 >> 2) {
                     var4.bl();
                     return;
                  }
               } else if (this.gw == (29 & 106) && (var4 = (Class660)this.aej.getFormManagement().e(22006 & 10927)).e() == 0) {
                  var4.bl();
               }
            }

         } else {
            ((Class95)this.aej.getFormManagement().e(127 & 95)).bl();
         }
      } else {
         var2 = (var1 = (Class595)this.aej.getFormManagement().e(125 & 63)).e() == 5 >> 1 ? var1.zl() : null;
         var3 = var2 != null ? var2.yo() : null;
         if (var3 != null && var3.equals(this.gw == -4 >> 2 ? "保留炼器" : "炼器")) {
            var2.ij((boolean)(3 >> 2));
         } else {
            this.aej.f("请选择材料");
         }
      }
   }

   public boolean zg(int var1, BigDecimal var2) {
      return (boolean)(this.gw == var1 && Class394.v(this.ne, var2) ? 4 ^ 5 : 0);
   }

   public void zh(QualityClBean var1) {
      Class53 var10000;
      if (var1.getType() >= (111 & 87) && var1.getType() <= (79 & 124)) {
         var10000 = this;
         this.gw = --4;
         this.ze(var1.getNewAttr(), 2 & 5, (boolean)(2 & 5));
      } else {
         label116: {
            Goodstable var7;
            if ((var7 = this.vd().getGood(var1.getRgid())) != null) {
               if (var1.getType() == --2 || var1.getType() == (-1 & -2)) {
                  this.gw = var1.getType() == (1 ^ 3) ? -4 >> 2 : 1;
                  var10000 = this;
                  var7.setValue(GoodType.o(var7.getValue().split("\\|"), 5 >> 2, var1.getNewAttr()));
                  this.ze(var1.getNewAttr(), 3 ^ 3, (boolean)(--1));
                  break label116;
               }

               if (var1.getType() == 3 >> 1) {
                  var10000 = this;
                  this.gw = 2 & 5;
                  var7.setValue(GoodType.o(var7.getValue().split("\\|"), 3 ^ 3, var1.getNewAttr()));
                  this.ze(var1.getNewAttr(), 3 ^ 3, (boolean)(3 & 5));
                  break label116;
               }

               if (var1.getType() == (127 & 53)) {
                  var10000 = this;
                  this.gw = --2;
                  var7.setValue(GoodType.o(var7.getValue().split("\\|"), 2 & 5, var1.getNewAttr()));
                  this.ze(var1.getNewAttr(), 3 ^ 3, (boolean)(3 ^ 3));
                  break label116;
               }

               if (var1.getType() == (127 & 54)) {
                  var10000 = this;
                  this.gw = --3;
                  var7.setValue(GoodType.o(var7.getValue().split("\\|"), 119 & 14, var1.getNewAttr()));
                  this.ze(var1.getNewAttr(), 2 & 5, (boolean)(2 & 5));
                  break label116;
               }

               if (var1.getType() == (-1 & -81) || var1.getType() == (-82 & -1) || var1.getType() == (122 & 87)) {
                  this.gw = var1.getType() == (-1 & -81) ? --5 : 6;
                  var10000 = this;
                  var7.setValue(GoodType.o(var7.getValue().split("\\|"), 56 & 79, var1.getNewAttr()));
                  this.ze(var1.getNewAttr(), 3 & 4, (boolean)(3 & 4));
                  break label116;
               }

               if (var1.getType() == (26053 & 6847)) {
                  this.gw = 87 & 47;
                  String var5 = Class394.d(var7.getValue(), "等级=", "|");
                  String var4 = Class394.d(var7.getValue(), "装备类型=", "|");
                  String var3 = Class394.d(var7.getValue(), "性别要求=", "|");
                  String var6 = Class394.d(var7.getValue(), "炼器属性&", "|");
                  StringBuffer var2 = new StringBuffer();
                  var2.append("等级=");
                  var2.append(var5 != null ? var5 : "0");
                  var2.append("|装备类型=");
                  var2.append(var4 != null ? var4 : "未知");
                  if (var3 != null && (var3.equals("男") || var3.equals("女"))) {
                     var2.append("|性别要求=");
                     var2.append(var3);
                  }

                  if (!Class394.o(var1.getNewAttr())) {
                     var2.append("|");
                     var2.append(var1.getNewAttr());
                  }

                  if (!Class394.o(var6)) {
                     var2.append("|炼器属性&");
                     var2.append(var6);
                  }

                  var7.setValue(var2.toString());
                  var10000 = this;
                  this.ze(var1.getNewAttr(), 3 ^ 3, (boolean)(4 ^ 5));
                  break label116;
               }

               if (var1.getType() == (5623 & 27279)) {
                  var10000 = this;
                  this.gw = 89 & 46;
                  var7.setValue(GoodType.o(var7.getValue().split("\\|"), 5 >> 2, var1.getNewAttr()));
                  this.ze(var1.getNewAttr(), 3 ^ 3, (boolean)(3 & 5));
                  break label116;
               }
            } else {
               this.ze((String)null, 3 >> 2, (boolean)(3 >> 2));
            }

            var10000 = this;
         }
      }

      var10000.ais = null;
   }

   public void zi(BigDecimal var1, String var2, int var3, boolean var4) {
      int var5;
      for(int var10000 = var5 = 3 ^ 3; var10000 < this.vz.size(); var10000 = var5) {
         <undefinedtype> var6;
         if ((var6 = (<undefinedtype>)this.vz.get(var5)).ee) {
            var6.ak((boolean)(5 >> 3));
            var6.av.setVisible((boolean)(3 & 4));
         }

         ++var5;
      }

      this.ly[--4].setText((String)null);
      this.gw = var3;
      this.ne = var1;
      String var7 = this.pu((boolean)(var3 == --4 ? 2 ^ 3 : 0));
      if (var3 == --4) {
         var2 = var7;
      }

      this.ze(var2, 3 >> 2, var4);
      this.ve().a(this.ae());
   }

   public int e() {
      return 3 & 4;
   }

   public void ay(QualityClBean var1) {
      Class605 var2;
      if (var1.getType() == (-1 & -2)) {
         this.zh(var1);
         if ((var2 = (Class605)this.aej.getFormManagement().m(121 & 127)) != null) {
            var2.pm(var1.getNewAttr());
            return;
         }
      } else if (var1.getType() != (4 ^ 5) && var1.getType() != --2) {
         if (var1.getType() == (53 & 127)) {
            this.ais = var1;
            this.ze(var1.getNewAttr(), 5 >> 2, (boolean)(5 >> 3));
            if ((var2 = (Class605)this.aej.getFormManagement().m(125 & 123)) != null) {
               var2.pj(var1.getNewAttr());
               return;
            }
         } else if (var1.getType() == (62 & 119)) {
            String var13 = (this.ais = var1).getNewAttr();
            double var3 = 0.0D;
            BigDecimal var5;
            Goodstable var6 = (var5 = ((Class95)this.aej.getFormManagement().e(127 & 95)).ez()) != null ? this.vd().getGood(var5) : null;
            String var14 = var6 != null ? GoodType.getExtra(var6.getValue(), "炼化属性") : null;
            String[] var16 = var14 != null ? var14.split("&") : null;
            String[] var15 = null;
            int var7;
            int var10000 = var7 = 5 >> 2;

            int var8;
            String[] var19;
            while(true) {
               if (var10000 >= (var16 != null ? var16.length : 0)) {
                  var19 = var15;
                  break;
               }

               if ((var8 = var16[var7].indexOf("=")) != -4 >> 2 && var16[var7].substring(5 >> 3, var8).equals("星阵属性")) {
                  var19 = var15 = var16[var7].split("=");
                  break;
               }

               ++var7;
               var10000 = var7;
            }

            var16 = var19 != null ? var13.split("&") : null;
            var7 = 5 >> 3;

            for(var10000 = var8 = 3 >> 2; var10000 < this.vz.size(); var10000 = var8) {
               <undefinedtype> var9;
               if (!(var9 = (<undefinedtype>)this.vz.get(var8)).ee) {
                  var9.setVisible((boolean)(3 ^ 3));
               }

               ++var8;
            }

            var8 = 3 ^ 3;

            int var17;
            <undefinedtype> var20;
            for(var10000 = var17 = 3 >> 1; var10000 < (var16 != null ? var16.length : 0); var10000 = var17) {
               int var10;
               if ((var10 = var16[var17].indexOf("=")) != -4 >> 2) {
                  String var11 = var16[var17].substring(3 ^ 3, var10);
                  String var12 = var16[var17].substring(var10 + (5 >> 2));
                  var3 += MsgUntil.l(var15[5 >> 1], var11, var12);
                  var20 = this.zd((boolean)var7, var8, (boolean)(5 >> 3));
                  ++var8;
                  var20.rl(var11, var12);
               }

               ++var17;
            }

            var20 = this.zd((boolean)var7, var8, (boolean)(3 ^ 3));
            Object[] var10005 = new Object[2 ^ 3];
            boolean var10007 = true;
            var10005[5 >> 3] = var3;
            StringBuilder var10002 = new StringBuilder(String.valueOf(String.format("%.1f", var10005)));
            ++var8;
            var20.rl("五行加成", var10002.append("%").toString());
            Class605 var18;
            if ((var18 = (Class605)this.aej.getFormManagement().m(123 & 125)) != null) {
               var18.pn(var1.getNewAttr(), var15 == null ? -1.0D : var3);
               return;
            }
         } else {
            if (var1.getType() >= (95 & 103) && var1.getType() <= (77 & 126)) {
               this.ze((this.ais = var1).getNewAttr(), --1, false);
               return;
            }

            if (var1.getType() != (-65 & -17) && var1.getType() != (-66 & -17)) {
               if (var1.getType() == (126 & 83)) {
                  this.ais = var1;
                  this.ze(var1.getNewAttr(), 1, false);
                  if ((var2 = (Class605)this.aej.getFormManagement().m(121 & 127)) != null) {
                     var2.py(var1.getNewAttr(), false);
                     return;
                  }
               } else if (var1.getType() == 133) {
                  this.ais = var1;
                  this.ze(var1.getNewAttr(), 1, false);
                  if ((var2 = (Class605)this.aej.getFormManagement().m(121)) != null) {
                     var2.px(var1.getNewAttr());
                     return;
                  }
               } else if (var1.getType() == 135) {
                  this.ais = var1;
                  this.ze(var1.getNewAttr(), 1, false);
                  if ((var2 = (Class605)this.aej.getFormManagement().m(121)) != null) {
                     var2.ps(var1.getNewAttr());
                  }
               }
            } else {
               this.zh(var1);
               if ((var2 = (Class605)this.aej.getFormManagement().m(127 & 121)) != null) {
                  var2.py(var1.getNewAttr(), var1.getType() == (-81 & -1));
                  return;
               }
            }
         }
      } else {
         this.ze((this.ais = var1).getNewAttr(), 5 >> 2, (boolean)(3 >> 2));
         if ((var2 = (Class605)this.aej.getFormManagement().m(127 & 121)) != null) {
            if (var1.getType() == --1) {
               var2.pt(var1.getNewAttr());
               return;
            }

            if (var1.getType() == 5 >> 1) {
               var2.pm(var1.getNewAttr());
               return;
            }
         }
      }

   }
}
