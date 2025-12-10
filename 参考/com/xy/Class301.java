package com.xy;

import com.xy.entity.RoleSummoning;
import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;

public class Class301 extends Class345 {
   private JLabel as;
   private Class643 kr;
   private String nc;
   private List<null> im;
   private BigDecimal ne;
   private Class643 dy;
   private Class643 avm;

   public synchronized void p() {
      RoleSummoning var1;
      if ((var1 = this.gj()) == null) {
         this.ve().n(this.ae());
      } else {
         String var2;
         if ((var2 = var1.getXy()) == null) {
            var2 = "";
         }

         if (!var2.equals(this.nc)) {
            this.nc = var2;
            this.d();
         }
      }
   }

   public void s() {
      RoleSummoning var10;
      RoleSummoning var10001 = var10 = this.gj();
      int var6 = var10001.getTurnRount();
      int var11 = Class224.p(var10001.getGrade());
      int var4 = var10001.getXYLvl();
      int var5 = 3 & 4;

      <undefinedtype> var2;
      Iterator var7;
      Iterator var10000;
      for(var10000 = var7 = this.im.iterator(); var10000.hasNext(); var10000 = var7) {
         var2 = (<undefinedtype>)var7.next();
         var5 += var2.cy;
      }

      var10000 = var7 = this.im.iterator();

      while(true) {
         while(var10000.hasNext()) {
            if ((var2 = (<undefinedtype>)var7.next()).cy > 0) {
               var10000 = var7;
            } else if (var2.anf.getList() == null) {
               var10000 = var7;
               var2.ak((boolean)(--1));
            } else {
               int var8 = 1;

               int var9;
               for(int var16 = var9 = var2.anf.getList().size() - --1; var16 >= 0; var16 = var9) {
                  TYC var1;
                  int var12;
                  if ((var1 = (TYC)var2.anf.getList().get(var9)).getType() == --2) {
                     int[] var14 = var1.getVs();
                     var12 = Math.min(var2.cy, var14.length - (2 ^ 3));
                     if (var14[var12] > var5 - var2.cy) {
                        var8 = 3 ^ 3;
                     }
                  } else if (var1.getType() == --3) {
                     <undefinedtype> var13;
                     if ((var13 = this.aks(var1.getV1())) == null || var13.cy < var1.getV2()) {
                        var8 = 0;
                     }
                  } else if (var1.getType() == --4) {
                     if (var6 < var1.getV1() || var6 == var1.getV1() && var11 < var1.getV2()) {
                        var8 = 0;
                     }
                  } else {
                     int var3;
                     if (var1.getType() == --5) {
                        for(var16 = var3 = 2 & 5; var16 < var1.getVs().length; var16 = var3) {
                           <undefinedtype> var15;
                           if ((var15 = this.aks(var1.getVs()[var3])) != null && var2.cy > 0 && var2.gw != var15.gw) {
                              var8 = 5 >> 3;
                              break;
                           }

                           ++var3;
                        }
                     } else if (var1.getType() != (31 & 102)) {
                        if (var1.getType() == (87 & 47) && (78 & 61) < var1.getV1()) {
                           var8 = 3 >> 2;
                        }
                     } else {
                        var3 = var1.getV1();

                        for(var16 = var12 = 3 & 4; var16 < var1.getVs().length; var16 = var12) {
                           if (this.aks(var1.getVs()[var12]) != null && var2.cy > 0) {
                              --var3;
                           }

                           ++var12;
                        }

                        if (var3 <= 0 && var2.cy <= 0) {
                           var8 = 3 >> 2;
                        }
                     }
                  }

                  --var9;
               }

               var10000 = var7;
               var2.ak((boolean)var8);
            }
         }

         this.as.setText(String.valueOf(var4 - var5));
         if (this.uw().n(--2, 8 & 127) || this.uw().n(5 >> 1, 79 & 59) || this.uw().n(5 >> 1, 79 & 60)) {
            if (var4 >= (77 & 62) && var10.c("1250")) {
               this.kr.gd(92 & 119, "成圣");
               return;
            }

            this.kr.gd(91 & 117, "兑换");
         }

         return;
      }
   }

   public <undefinedtype> aks(int var1) {
      Iterator var3;
      for(Iterator var10000 = var3 = this.im.iterator(); var10000.hasNext(); var10000 = var3) {
         <undefinedtype> var2;
         if ((var2 = (<undefinedtype>)var3.next()).anf.getV2() == var1) {
            return var2;
         }
      }

      return null;
   }

   public String nn() {
      int var1 = 5 >> 3;
      StringBuffer var2 = new StringBuffer();
      Iterator var4;
      Iterator var10000 = var4 = this.im.iterator();

      while(true) {
         while(var10000.hasNext()) {
            <undefinedtype> var3;
            if ((var3 = (<undefinedtype>)var4.next()).gw != 0) {
               if (var3.cy <= 0) {
                  var10000 = var4;
                  continue;
               }

               if (var1 == 0 && var3.cy > var3.bn) {
                  var1 = 4 ^ 5;
               }

               if (var2.length() != 0) {
                  var2.append("=");
               }

               var2.append(var3.gw);
            }

            var10000 = var4;
         }

         if (var1 != 0) {
            return var2.toString();
         }

         return null;
      }
   }

   public void y(int var1) {
      RoleSummoning var2;
      if ((var2 = this.gj()) != null) {
         String var3;
         if (var1 == (117 & 91)) {
            var3 = Agreement.getSendTextAES("userpet", "XYXL|" + var2.getSid());
            this.uw().d(var3);
         } else if (var1 == (126 & 83)) {
            var3 = Agreement.getSendTextAES("userpet", "XY|" + var2.getSid());
            this.uw().d(var3);
         } else if (var1 == (115 & 95)) {
            if ((var3 = this.nn()) == null) {
               this.aej.f("请修改点数");
            } else {
               if (this.uw().n(--2, 15 & 123)) {
                  this.aej.f("宝宝飞升后心意才生效");
               }

               String var4 = Agreement.getSendTextAES("userpet", "XY|" + var2.getSid() + "|" + var3);
               this.uw().d(var4);
            }
         } else {
            if (var1 == (125 & 86)) {
               var3 = Agreement.getSendTextAES("userpet", "XYCS|" + var2.getSid());
               this.uw().d(var3);
            }

         }
      }
   }

   public void v(RoleSummoning var1) {
      this.ne = var1.getSid();
      this.nc = var1.getXy();
      this.d();
      this.ve().a(this.ae());
   }

   public Class301(GameView var1) {
      int var10004 = -4 >> 2;
      super(17599 & 15314, 5 >> 1, Class345.aef, var1);
      this.va(var10004, 3 >> 2, 11199 & 22469, 20134 & 13181, Class345.aeo);
      this.im("sc/c/160");
      List var4 = this.vc().l("心意修炼");
      this.im = new ArrayList();

      Iterator var2;
      for(Iterator var10000 = var2 = var4.iterator(); var10000.hasNext(); var10000 = var2) {
         TYC var5 = (TYC)var2.next();
         MouseListener var3 = new MouseListener(var5) {
            private Skill ane;
            private int gw;
            private TYC anf;
            private boolean ee;
            private int bn;
            private int cy;
            private int m;

            public void mousePressed(MouseEvent var1) {
            }

            public void s() {
               if (this.cy > 0) {
                  this.fw("sc/c/161");
               } else if (this.ee) {
                  this.fw("sc/c/162");
               } else {
                  this.q();
               }
            }

            public void ak(boolean var1) {
               this.ee = var1;
               this.s();
            }

            public void ab(int var1) {
               this.bn = this.cy = var1;
               this.ee = (boolean)(--1);
               this.s();
            }

            public void d() {
               this.bn = this.cy = 2 & 5;
               this.ee = (boolean)(3 & 4);
               this.s();
            }

            public void mouseEntered(MouseEvent var1) {
               RoleSummoning var2;
               if ((var2 = Class301.this.gj()) != null) {
                  String var3 = Class683.api(var2, this.anf.getV2(), 3 >> 1, this.ane, Class301.this.uw());
                  ((Class270)Class301.this.ve().e(111 & 62)).rl(this.ane.getSkillname(), var3);
               }

            }

            public {
               int var10002 = 5 >> 3;
               int var10004 = 3 >> 2;
               this.gw = var2.getV2();
               this.anf = var2;
               this.ane = Class301.this.vc().bf(String.valueOf(this.gw));
               this.ee = (boolean)var10004;
               this.bn = this.cy = var10002;
               this.m = 5 >> 2;
               this.addMouseListener(this);
            }

            public void mouseExited(MouseEvent var1) {
               Class301.this.ve().n(62 & 111);
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.ee) {
                  int var2;
                  if ((var2 = this.cy + (var1.isMetaDown() ? -4 >> 2 : 1)) <= 0 || !Class301.this.as.getText().equals("0")) {
                     if (var2 >= this.bn) {
                        if (var2 <= this.m) {
                           this.cy = var2;
                           this.s();
                           Class301.this.s();
                        }
                     }
                  }
               }
            }
         };
         Point var6 = this.akt(var5.getV1());
         var3.setBounds(var6.x, var6.y, 91 & 63, 91 & 63);
         this.im.add(var3);
         this.add(var3);
      }

      this.as = new JLabel("0");
      this.as.setBounds(28921 & 4078, 1522 & 31661, 122 & 45, 50 & 93);
      this.as.setFont(Class681.cf);
      this.as.setForeground(Color.red);
      this.add(this.as);
      this.kr = new Class643("sc/e/7.png", --1, 117 & 91, Class681.ak, Class681.c, "兑换", this);
      this.dy = new Class643("sc/e/7.png", --1, 95 & 114, Class681.ak, Class681.c, "洗点", this);
      this.avm = new Class643("sc/e/26.png", --1, 123 & 87, Class681.ak, Class681.c, "确定加点", this);
      this.kr.setBounds(4583 & 28351, 21429 & 11775, 127 & 68, 123 & 30);
      this.dy.setBounds(19900 & 13307, 476, 68, 26);
      this.avm.setBounds(428, 448, 92, 26);
      this.add(this.kr);
      this.add(this.dy);
      this.add(this.avm);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.p();
      }

   }

   public RoleSummoning gj() {
      return this.vd().getPet(this.ne);
   }

   public Point akt(int var1) {
      if (var1 == (27 & 111)) {
         return new Point(26589 & 6642, 15848 & 17271);
      } else if (var1 == (125 & 14)) {
         return new Point(15350 & 17807, 4541 & 28539);
      } else if (var1 == (119 & 29)) {
         return new Point(26495 & 6589, 10207 & 22975);
      } else if (var1 == (86 & 63)) {
         return new Point(17279 & 16095, 16283 & 16887);
      } else if (var1 == (31 & 127)) {
         return new Point(19195 & 14117, 11773 & 21302);
      } else if (var1 == (39 & 120)) {
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

   public void d() {
      Iterator var2;
      Iterator var10000 = var2 = this.im.iterator();

      while(var10000.hasNext()) {
         <undefinedtype> var1 = (<undefinedtype>)var2.next();
         var10000 = var2;
         var1.d();
      }

      String[] var6 = this.nc != null && !this.nc.equals("") ? this.nc.split("=") : null;
      int var7 = var6 != null ? Integer.parseInt(var6[3 & 4]) : 0;
      int var3 = --1;
      int var4 = var6 != null ? var6.length : 0;

      for(int var8 = var3; var8 < var4; var8 = var3) {
         <undefinedtype> var5;
         if ((var5 = this.aks(Integer.parseInt(var6[var3]))) != null) {
            var5.ab(--1);
            var7 -= var5.bn;
         }

         ++var3;
      }

      this.as.setText(String.valueOf(var7));
      this.s();
   }
}
