package com.xy;

import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class364 extends Class345 {
   private RichLabel bp;
   private Class285 bbc;
   private JScrollPane w;
   private Class436[] oi;
   private Class643[] y;
   private Image gd;
   private Class19 dt;
   private JScrollPane fl;
   private Class245[] al;
   private Class255 bbd;
   private <undefinedtype>[] bbe;
   private JLabel[] u;

   public void asb(BigDecimal var1) {
      RoleData var2;
      if ((var2 = this.vd()) != null) {
         Mount var3;
         if ((var3 = var2.getChoseMount()) != null) {
            RoleSummoning var4 = var1 != null ? var2.getPet(var1) : null;
            if (var4 == null) {
               this.aej.f("请选择你要管制的召唤兽！");
            } else {
               int var6 = 0;
               int var10000;
               if (Class394.v(var3.getSid(), var1)) {
                  var10000 = var6 = 5 >> 2;
                  var3.setSid((BigDecimal)null);
               } else if (Class394.v(var3.getOthrersid(), var1)) {
                  var10000 = var6 = --2;
                  var3.setOthrersid((BigDecimal)null);
               } else {
                  if (Class394.v(var3.getSid3(), var1)) {
                     var6 = --3;
                     var3.setSid3((BigDecimal)null);
                  }

                  var10000 = var6;
               }

               if (var10000 == 0) {
                  this.aej.f("召唤兽不被该坐骑管制!");
               } else {
                  String var5 = Agreement.getSendTextAES("changemountvalue", Class695.b().toJson(var3));
                  this.uw().d(var5);
                  this.bbc.q();
                  this.p();
               }
            }
         }
      }
   }

   public void dg() {
      RoleData var1;
      if ((var1 = this.vd()) != null) {
         Mount var2;
         if ((var2 = var1.getChoseMount()) != null) {
            String var3;
            if (var1.getLoginResult().getMount_id() == var2.getMountid()) {
               var1.getLoginResult().setMount_id(5 >> 3);
               var3 = Agreement.getSendTextAES("rolechange", "M");
               this.uw().d(var3);
               this.y[2 & 5].setText("骑乘");
            } else {
               var1.getLoginResult().setMount_id(var2.getMountid());
               var3 = Agreement.getSendTextAES("rolechange", "M" + var2.getMountid() + "=" + var2.getMid());
               this.uw().d(var3);
               this.y[3 ^ 3].setText("下骑");
            }
         }
      }
   }

   public void y(int var1) {
      if (var1 == (7355 & 25583)) {
         this.dg();
      } else if (var1 == (21679 & 11260)) {
         if (this.ux().getBattleScene() == null) {
            Class658.cy(20, this.aej);
         }
      } else {
         if (var1 == (31741 & 1199)) {
            if (this.ux().getBattleScene() != null) {
               return;
            }

            Class658.cy(2, this.aej);
         }

      }
   }

   public void o() {
      this.adi((Mount)null);
   }

   public void adi(Mount var1) {
      RoleData var9;
      if ((var9 = this.vd()) != null) {
         var9.setChoseMountId(var1 != null ? var1.getMid() : null);
         this.d();
         if (var1 == null) {
            this.ve().n(63 & 84);
         } else {
            int var8;
            if ((var8 = var1.getMountlvl()) > (109 & 118)) {
               var8 -= 100;
            }

            int var4 = (int)Math.floor((double)((float)var1.getSpri() + (float)var8 / 10.0F * (float)var1.getSpri() / 2.0F));
            int var5 = (int)Math.floor((double)((float)var1.getPower() + (float)var8 / 10.0F * (float)var1.getPower() / 2.0F));
            int var6 = (int)Math.floor((double)((float)var1.getBone() + (float)var8 / 10.0F * (float)var1.getBone() / 2.0F));
            int var2;
            int var3;
            int var7;
            int var10000;
            if ((var3 = (var7 = var1.getMountCZ()) >> (78 & 55)) > 0) {
               for(var10000 = var2 = 2 & 5; var10000 < 3; var10000 = var2) {
                  if ((var7 >> (5 >> 1) * var2 & --1) != 0) {
                     int var10 = (var7 >> (1 ^ 3) * var2 + (3 & 5) & 5 >> 2) == (2 ^ 3) ? 5 >> 2 : 0;
                     if (var2 == 0) {
                        var4 += var10 != 0 ? var3 : -var3;
                     } else if (var2 == (3 & 5)) {
                        var5 += var10 != 0 ? var3 : -var3;
                     } else if (var2 == 5 >> 1) {
                        var6 += var10 != 0 ? var3 : -var3;
                     }
                  }

                  ++var2;
               }
            }

            this.y[5 >> 3].setText(var9.getLoginResult().getMount_id() == var1.getMountid() ? "下骑" : "骑乘");
            this.al[5 >> 3].setText(var1.getMountlvlString());
            this.al[--1].setText("" + var1.getLive());
            this.al[1 ^ 3].setText(String.valueOf(var4));
            this.al[--3].setText(String.valueOf(var5));
            this.al[--4].setText(String.valueOf(var6));
            Class364 var12;
            if (var8 < (125 & 102)) {
               var12 = this;
               this.al[--5].setText(var1.getExp() + "/" + ExpUtil.getMountExp(var1.getMountlvl()));
            } else {
               var12 = this;
               this.al[--5].setText(var1.getExp() + "/999999");
            }

            var12.dt = Class330.ai((long)var1.getMountid() << (124 & 43) | var9.getLoginResult().getSpecies_id().longValue(), 5 >> 1, 5 >> 2, (String)null);
            <undefinedtype> var13;
            int var10001;
            int var10002;
            if (var1.getMountlvl() > (124 & 103)) {
               for(var10000 = var2 = 3 >> 2; var10000 < 3; var10000 = var2) {
                  var13 = this.bbe[var2];
                  var10001 = 4734 & 28669;
                  var10002 = (109 & 87) + (65 & 127) * var2;
                  ++var2;
                  var13.setBounds(var10001, var10002, 63 & 123, 121 & 63);
               }

               var12 = this;
               this.bbe[--2].setVisible((boolean)(5 >> 2));
            } else {
               for(var10000 = var2 = 0; var10000 < 2; var10000 = var2) {
                  var13 = this.bbe[var2];
                  var10001 = 12156 & 21247;
                  var10002 = (127 & 91) + (100 & 95) * var2;
                  ++var2;
                  var13.setBounds(var10001, var10002, 123 & 63, 123 & 61);
               }

               var12 = this;
               this.bbe[5 >> 1].setVisible((boolean)(5 >> 3));
            }

            var12.p();
            Class287 var11;
            if ((var11 = (Class287)this.aej.getFormManagement().m(20)) != null) {
               var11.adi(var1);
            }

         }
      }
   }

   public void p() {
      Mount var1 = this.vd().getChoseMount();
      this.bbe[2 & 5].bk(var1 != null ? var1.getSid() : null);
      this.bbe[3 & 5].bk(var1 != null ? var1.getOthrersid() : null);
      this.bbe[--2].bk(var1 != null ? var1.getSid3() : null);
   }

   protected void paintChildren(Graphics var1) {
      if (this.aej.bl()) {
         this.p();
      }

      super.paintChildren(var1);
      if (this.dt != null) {
         this.dt.a(var1, 15323 & 17836, 3326 & 29661, 3 & 4, Class280.l());
      }

   }

   public void s() {
      this.bbd.q();
      this.bbc.q();
   }

   public void d() {
      int var10000 = 3 & 4;
      this.dt = null;

      for(int var1 = var10000; var10000 < this.al.length; var10000 = var1) {
         this.al[var1++].setText((String)null);
      }

   }

   public void bk(BigDecimal var1) {
      RoleData var2;
      if ((var2 = this.vd()) != null) {
         Mount var3;
         if ((var3 = var2.getChoseMount()) != null) {
            RoleSummoning var4 = var1 != null ? var2.getPet(var1) : null;
            if (var4 == null) {
               this.aej.f("请选择你要管制的召唤兽！");
            } else {
               Mount var7;
               if ((var7 = var2.getPetMount(var4.getSid())) != null && var7.getMountid() == var3.getMountid()) {
                  this.aej.f("召唤兽已被该坐骑管制!");
               } else if (var3.getSid() == null || var3.getOthrersid() == null || var3.getMountlvl() > (111 & 116) && (var3.getMountlvl() <= (109 & 118) || var3.getSid3() == null)) {
                  if (var7 != null) {
                     if (Class394.v(var7.getSid(), var1)) {
                        var7.setSid((BigDecimal)null);
                     } else if (Class394.v(var7.getOthrersid(), var1)) {
                        var7.setOthrersid((BigDecimal)null);
                     } else if (Class394.v(var7.getSid3(), var1)) {
                        var7.setSid3((BigDecimal)null);
                     }

                     String var5 = Agreement.getSendTextAES("changemountvalue", Class695.b().toJson(var7));
                     this.uw().d(var5);
                  }

                  int var8 = 0;
                  int var10000;
                  if (var3.getSid() == null) {
                     var10000 = var8 = 5 >> 2;
                     var3.setSid(var4.getSid());
                  } else if (var3.getOthrersid() == null) {
                     var10000 = var8 = 1 ^ 3;
                     var3.setOthrersid(var4.getSid());
                  } else {
                     if (var3.getMountlvl() > (126 & 101) && var3.getSid3() == null) {
                        var8 = --3;
                        var3.setSid3(var4.getSid());
                     }

                     var10000 = var8;
                  }

                  if (var10000 != 0) {
                     String var6 = Agreement.getSendTextAES("changemountvalue", Class695.b().toJson(var3));
                     this.uw().d(var6);
                  }

                  this.bbc.q();
                  this.p();
               } else {
                  this.aej.f("该坐骑管制名单已满");
               }
            }
         }
      }
   }

   public Class364(GameView var1) {
      int var10001 = --3;
      int var10005 = 54 & 123;
      int var10009 = 3 ^ 3;
      super(-4 >> 2, -4 >> 2, Class345.aei, var1);
      this.gd = Class511.a("sc/d/149.png");
      this.va(var10009, 2 & 5, 11007 & 22503, 22127 & 11159, Class345.aei);
      this.bbd = new Class255(this);
      this.bbd.setBounds(3 & 4, 3 & 4, 3272 & 29695, 118 & 29);
      this.w = Class133.f(var10005, 111 & 87, 26063 & 6911, 28639 & 4349, this.bbd, 84 & 63);
      this.add(this.w);
      int var10006 = 7519 & 25527;
      this.bbc = new Class285(this);
      this.bbc.setBounds(5 >> 3, 5 >> 3, 24574 & 8615, 31 & 116);
      this.fl = Class133.f(var10006, 30207 & 2861, 4014 & 29175, 15103 & 17859, this.bbc, 87 & 60);
      this.add(this.fl);
      <undefinedtype>[] var4 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.bbe = var4;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 >> 2; var10000 < this.bbe.length; var10000 = var2) {
         this.bbe[var2] = new MouseListener() {
            private Image rg;
            private BigDecimal py;

            public {
               this.addMouseListener(this);
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
               if (this.py != null && var1.isMetaDown()) {
                  Class364.this.asb(this.py);
               }

            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void bk(BigDecimal var1) {
               if (!Class394.v(var1, this.py)) {
                  this.py = var1;
                  RoleSummoning var2 = var1 != null ? Class364.this.vd().getPet(var1) : null;
                  this.rg = var2 != null ? Class222.t("p" + var2.getSummoningskin()) : null;
               }
            }

            protected void paintComponent(Graphics var1) {
               var1.drawImage(Class364.this.gd, 5 >> 3, 5 >> 3, this.getWidth(), this.getHeight(), (ImageObserver)null);
               if (this.rg != null) {
                  var1.drawImage(this.rg, 29 & 110, 75 & 63, 39 & 123, 39 & 123, (ImageObserver)null);
               }

            }

            public void mouseEntered(MouseEvent var1) {
            }
         };
         this.add(this.bbe[var2++]);
      }

      Class643[] var5 = new Class643[--3];
      var10003 = true;
      this.y = var5;

      for(var10000 = var2 = 5 >> 3; var10000 < this.y.length; var10000 = var2) {
         Class643[] var3 = this.y;
         Class643 var8 = new Class643;
         var10005 = 3 & 5;
         var10006 = 171 + var2;
         Font var10007 = Class681.ak;
         String var11;
         Class364 var10010;
         if (var2 == 0) {
            var11 = "下骑";
            var10010 = this;
         } else if (var2 == 3 >> 1) {
            var11 = "技能";
            var10010 = this;
         } else if (var2 == --2) {
            var11 = "喂养";
            var10010 = this;
         } else {
            var11 = "";
            var10010 = this;
         }

         var8.<init>("sc/e/7.png", var10005, var10006, var10007, (Color[])null, var11, var10010);
         var3[var2] = var8;
         this.y[var2].setForeground(Color.black);
         this.y[var2].setBounds(48 + 76 * var2, 477, 59, 25);
         this.add(this.y[var2++]);
      }

      JLabel[] var6 = new JLabel[10];
      var10003 = true;
      this.u = var6;

      Class364 var7;
      for(var10000 = var2 = 5 >> 3; var10000 < this.u.length; var10000 = var2) {
         this.u[var2] = Class133.b(48, 298 + 30 * var2, 36, 19, Color.black, Class681.ak);
         this.u[var2].setText(var2 == 0 ? "等级" : (var2 == 3 >> 1 ? "体力" : (var2 == (1 ^ 3) ? "灵性" : (var2 == --3 ? "力量" : (var2 == --4 ? "根骨" : (var2 == --5 ? "经验" : (var2 == 6 ? "管制" : (var2 == 7 ? "坐骑列表" : (var2 == 8 ? "召唤兽列表" : (var2 == 9 ? "管制坐骑" : ""))))))))));
         this.u[var2].setHorizontalAlignment(10);
         if (var2 == 6) {
            var7 = this;
            this.u[var2].setBounds(534, 152, 36, 19);
         } else if (var2 == 7) {
            var7 = this;
            this.u[var2].setForeground(Color.white);
            this.u[var2].setHorizontalAlignment(5 >> 3);
            this.u[var2].setBounds(48, 50, 210, 21);
         } else if (var2 == 8) {
            var7 = this;
            this.u[var2].setForeground(Color.white);
            this.u[var2].setBounds(330, 281, 100, 21);
         } else {
            if (var2 == 9) {
               this.u[var2].setForeground(Color.white);
               this.u[var2].setBounds(540, 281, 100, 21);
            }

            var7 = this;
         }

         var7.add(this.u[var2++]);
      }

      this.bp = new RichLabel("", Class681.ab);
      this.bp.setTextSize("#cFF0000右键#c000000点击列表切换管制，#cFF0000右键#c000000点击头像解除管制", 300);
      this.bp.setBounds(358, 259, this.bp.getWidth(), this.bp.getHeight());
      this.add(this.bp);
      Class245[] var9 = new Class245[6];
      var10003 = true;
      this.al = var9;

      for(var10000 = var2 = 3 & 4; var10000 < this.al.length; var10000 = var2) {
         this.al[var2] = Class133.a(90, 298 + 30 * var2, 168, 19, 10, Color.white, Class681.q);
         this.al[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 ^ 3)));
         this.add(this.al[var2++]);
      }

      Class436[] var10 = new Class436[7];
      var10003 = true;
      this.oi = var10;

      for(var10000 = var2 = 2 & 5; var10000 < this.oi.length; var10000 = var2) {
         label176: {
            this.oi[var2] = new Class436();
            if (var2 != 0 && var2 != (4 ^ 5)) {
               if (var2 >= (1 ^ 3) && var2 <= --4) {
                  this.oi[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 & 4)));
                  if (var2 == (1 ^ 3)) {
                     var7 = this;
                     this.oi[var2].setBounds(48, 50, 210, 242);
                     break label176;
                  }

                  if (var2 == --3) {
                     var7 = this;
                     this.oi[var2].setBounds(277, 58, 230, 200);
                     break label176;
                  }

                  if (var2 == --4) {
                     var7 = this;
                     this.oi[var2].setBounds(277, 281, 426, 215);
                     break label176;
                  }
               } else {
                  if (var2 == --5) {
                     var7 = this;
                     this.oi[var2].fw("sc/d/150.png");
                     this.oi[var2].setBounds(585, 133, 30, 56);
                     break label176;
                  }

                  if (var2 == 6) {
                     this.oi[var2].eq(Class511.q("sc/d/36.png", 30, 30, 30, 30, (boolean)(2 & 5)));
                     this.oi[var2].setBounds(269, 50, 446, 453);
                  }
               }
            } else {
               this.oi[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 >> 2)));
               if (var2 == 0) {
                  var7 = this;
                  this.oi[var2].setBounds(48, 50, 210, 21);
                  break label176;
               }

               if (var2 == (2 ^ 3)) {
                  var7 = this;
                  this.oi[var2].setBounds(277, 281, 426, 21);
                  break label176;
               }
            }

            var7 = this;
         }

         var7.add(this.oi[var2++]);
      }

   }
}
