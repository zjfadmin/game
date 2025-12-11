package com.xy.a.a;

import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class0 extends com.xy.q.Class30 {
   private com.xy.q.Class45 a;
   private Class7[] b;
   private JLabel[] c;
   private com.xy.w.Class0 d;
   private com.xy.i.Class4[] e;
   private com.xy.q.Class6 f;
   private Image g;
   private RichLabel h;
   private JScrollPane i;
   private com.xy.w.Class18[] j;
   private com.xy.q.Class14[] k;
   private JScrollPane l;

   public void a() {
      int var10000 = 0;
      this.d = null;

      for (int var1 = 0; var10000 < this.k.length; var10000 = var1) {
         this.k[var1++].setText(null);
      }
   }

   public void b(Mount var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         var2.setChoseMountId(var1 != null ? var1.getMid() : null);
         this.a();
         if (var1 == null) {
            this.zc().f(20);
         } else {
            int var3;
            if ((var3 = var1.getMountlvl()) > 100) {
               var3 -= 100;
            }

            int var4 = (int)Math.floor(var1.getSpri().intValue() + var3 / 10.0F * var1.getSpri().intValue() / 2.0F);
            int var5 = (int)Math.floor(var1.getPower().intValue() + var3 / 10.0F * var1.getPower().intValue() / 2.0F);
            int var6 = (int)Math.floor(var1.getBone().intValue() + var3 / 10.0F * var1.getBone().intValue() / 2.0F);
            int var7;
            int var8;
            int var9;
            if ((var8 = (var7 = var1.getMountCZ()) >> 6) > 0) {
               for (int var10000 = var9 = 0; var10000 < 3; var10000 = ++var9) {
                  if ((var7 >> 2 * var9 & 1) != 0) {
                     boolean var10 = (var7 >> 2 * var9 + 1 & 1) == 1;
                     if (var9 == 0) {
                        var4 += var10 ? var8 : -var8;
                     } else if (var9 == 1) {
                        var5 += var10 ? var8 : -var8;
                     } else if (var9 == 2) {
                        var6 += var10 ? var8 : -var8;
                     }
                  }
               }
            }

            com.xy.i.Class4 var14 = this.e[0];
            String var21;
            if (var2.getLoginResult().getMount_id() == var1.getMountid()) {
               var21 = "也骹";
               var21 = "下骑";
            } else {
               var21 = "骚乀";
               var21 = "骑乘";
            }

            var14.setText(var21);
            this.k[0].setText(var1.getMountlvlString());
            this.k[1].setText("" + var1.getLive());
            this.k[2].setText(String.valueOf(var4));
            this.k[3].setText(String.valueOf(var5));
            this.k[4].setText(String.valueOf(var6));
            Class0 var15;
            if (var3 < 100) {
               var15 = this;
               com.xy.q.Class14 var23 = this.k[5];
               StringBuilder var10002 = new StringBuilder().append(var1.getExp());
               String var10003 = "\u0007";
               var23.setText(var10002.append("/").append(ExpUtil.getMountExp(var1.getMountlvl())).toString());
            } else {
               var15 = this;
               com.xy.q.Class14 var24 = this.k[5];
               StringBuilder var25 = new StringBuilder().append(var1.getExp());
               String var28 = "72!2!2!";
               var24.setText(var25.append("/999999").toString());
            }

            var15.d = com.xy.w.Class11.p((long)var1.getMountid().intValue() << 40 | var2.getLoginResult().getSpecies_id().longValue(), 2, 1, null);
            Class0 var18;
            if (var1.getMountlvl() > 100) {
               for (int var16 = var9 = 0; var16 < 3; var16 = var9) {
                  Class7 var17 = this.b[var9];
                  int var26 = 69 + 65 * var9;
                  var9++;
                  var17.setBounds(636, var26, 59, 57);
               }

               var18 = this;
               this.b[2].setVisible(true);
            } else {
               for (int var19 = var9 = 0; var19 < 2; var19 = var9) {
                  Class7 var20 = this.b[var9];
                  int var27 = 91 + 68 * var9;
                  var9++;
                  var20.setBounds(636, var27, 59, 57);
               }

               var18 = this;
               this.b[2].setVisible(false);
            }

            var18.c();
            Class1 var13;
            if ((var13 = (Class1)this.afx.getFormManagement().l(20)) != null) {
               var13.b(var1);
            }
         }
      }
   }

   public void c() {
      Mount var2 = this.yx().getChoseMount();
      this.b[0].i(var2 != null ? var2.getSid() : null);
      this.b[1].i(var2 != null ? var2.getOthrersid() : null);
      this.b[2].i(var2 != null ? var2.getSid3() : null);
   }

   public void d(BigDecimal var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Mount var3;
         if ((var3 = var2.getChoseMount()) != null) {
            RoleSummoning var4 = var1 != null ? var2.getPet(var1) : null;
            if (var4 == null) {
               String var9 = "讣逡抽佈觕箉剢皬厸唌儩Ｉ";
               this.afx._do("请选择你要管制的召唤兽！");
            } else {
               byte var5 = 0;
               byte var10000;
               if (com.xy.v.Class12.x(var3.getSid(), var1)) {
                  var10000 = var5 = 1;
                  var3.setSid(null);
               } else if (com.xy.v.Class12.x(var3.getOthrersid(), var1)) {
                  var10000 = var5 = 2;
                  var3.setOthrersid(null);
               } else {
                  if (com.xy.v.Class12.x(var3.getSid3(), var1)) {
                     var5 = 3;
                     var3.setSid3(null);
                  }

                  var10000 = var5;
               }

               if (var10000 == 0) {
                  String var10001 = "叴唯入丆袳诮坈骚箹刽9";
                  this.afx._do("召唤兽不被该坐骑管制!");
               } else {
                  String var6 = Agreement.getSendTextAES("changemountvalue", com.xy.v.Class31.a().toJson(var3));
                  this.za().k(var6);
                  this.f.t();
                  this.c();
               }
            }
         }
      }
   }

   public void e() {
      this.b(null);
   }

   public void f() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         Mount var2;
         if ((var2 = var1.getChoseMount()) != null) {
            if (var1.getLoginResult().getMount_id() == var2.getMountid()) {
               var1.getLoginResult().setMount_id(0);
               String var5 = Agreement.getSendTextAES("rolechange", "M");
               this.za().k(var5);
               com.xy.i.Class4 var6 = this.e[0];
               String var8 = "髅买";
               var6.setText("骑乘");
            } else {
               var1.getLoginResult().setMount_id(var2.getMountid());
               StringBuilder var10001 = new StringBuilder("M").append(var2.getMountid());
               String var10002 = "%";
               String var4 = Agreement.getSendTextAES("rolechange", var10001.append("=").append(var2.getMid()).toString());
               this.za().k(var4);
               com.xy.i.Class4 var10000 = this.e[0];
               String var7 = "也骹";
               var10000.setText("下骑");
            }
         }
      }
   }

   public Class0(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.g = com.xy.w.Class16.c("sc/d/149.png");
      this.yy(0, 0, 743, 519, com.xy.q.Class30.agf);
      this.a = new com.xy.q.Class45(this);
      this.a.setBounds(0, 0, 200, 20);
      this.i = com.xy.q.Class1.g(50, 71, 207, 221, this.a, 20);
      this.add(this.i);
      this.f = new com.xy.q.Class6(this);
      this.f.setBounds(0, 0, 422, 20);
      this.l = com.xy.q.Class1.g(279, 301, 422, 195, this.f, 20);
      this.add(this.l);
      this.b = new Class7[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.b.length; var10000 = var2) {
         this.b[var2] = new Class7(this);
         this.add(this.b[var2++]);
      }

      this.e = new com.xy.i.Class4[3];

      for (int var7 = var2 = 0; var7 < this.e.length; var7 = var2) {
         com.xy.i.Class4[] var8 = this.e;
         int var10006 = 171 + var2;
         String var40;
         Class0 var10010;
         if (var2 == 0) {
            var40 = "一骉";
            var40 = "下骑";
            var10010 = this;
         } else if (var2 == 1) {
            var40 = "拔胕";
            var40 = "技能";
            var10010 = this;
         } else if (var2 == 2) {
            var40 = "喉兣";
            var40 = "喂养";
            var10010 = this;
         } else {
            var40 = "";
            var10010 = this;
         }

         com.xy.i.Class4 var29 = new com.xy.i.Class4("sc/e/7.png", 1, var10006, com.xy.q.Class49.ch, null, var40, var10010);
         var8[var2] = var29;
         this.e[var2].setForeground(Color.black);
         this.e[var2].setBounds(48 + 76 * var2, 477, 59, 25);
         this.add(this.e[var2++]);
      }

      this.c = new JLabel[10];

      for (int var9 = var2 = 0; var9 < this.c.length; var9 = var2) {
         this.c[var2] = com.xy.q.Class1.k(48, 298 + 30 * var2, 36, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var10 = this.c[var2];
         String var16;
         if (var2 == 0) {
            var16 = "笝纏";
            var16 = "等级";
         } else if (var2 == 1) {
            var16 = "佘劃";
            var16 = "体力";
         } else if (var2 == 2) {
            var16 = "瀡怏";
            var16 = "灵性";
         } else if (var2 == 3) {
            var16 = "劐釗";
            var16 = "力量";
         } else if (var2 == 4) {
            var16 = "桭骀";
            var16 = "根骨";
         } else if (var2 == 5) {
            var16 = "组骔";
            var16 = "经验";
         } else if (var2 == 6) {
            var16 = "篵刞";
            var16 = "管制";
         } else if (var2 == 7) {
            var16 = "坛骉刜衰";
            var16 = "坐骑列表";
         } else if (var2 == 8) {
            var16 = "叄啰兕剃血";
            var16 = "召唤兽列表";
         } else if (var2 == 9) {
            var16 = "箪刮坛骉";
            var16 = "管制坐骑";
         } else {
            var16 = "";
         }

         var10.setText(var16);
         this.c[var2].setHorizontalAlignment(10);
         Class0 var11;
         if (var2 == 6) {
            var11 = this;
            this.c[var2].setBounds(534, 152, 36, 19);
         } else if (var2 == 7) {
            var11 = this;
            this.c[var2].setForeground(Color.white);
            this.c[var2].setHorizontalAlignment(0);
            this.c[var2].setBounds(48, 50, 210, 21);
         } else if (var2 == 8) {
            var11 = this;
            this.c[var2].setForeground(Color.white);
            this.c[var2].setBounds(330, 281, 100, 21);
         } else {
            if (var2 == 9) {
               this.c[var2].setForeground(Color.white);
               this.c[var2].setBounds(540, 281, 100, 21);
            }

            var11 = this;
         }

         var11.add(this.c[var2++]);
      }

      this.h = new RichLabel("", com.xy.q.Class49.n);
      String var39 = "\u000b7n\u0012\u0018d\u0018d叛镺\u000b7\u0018d\u0018d\u0018d炑冯刿蠼刯挶箉剢ＤwK\u0012nd\u0018d\u0018厧锆wKd\u0018d\u0018d\u0018热凓奠僧覷陌篵刞";
      this.h.setTextSize("#cFF0000右键#c000000点击列表切换管制，#cFF0000右键#c000000点击头像解除管制", 300);
      this.h.setBounds(358, 259, this.h.getWidth(), this.h.getHeight());
      this.add(this.h);
      this.k = new com.xy.q.Class14[6];

      for (int var12 = var2 = 0; var12 < this.k.length; var12 = var2) {
         this.k[var2] = com.xy.q.Class1.i(90, 298 + 30 * var2, 168, 19, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var32 = this.k[var2];
         String var10003 = "kh7o7:/%he\u007f";
         var32.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.k[var2++]);
      }

      this.j = new com.xy.w.Class18[7];

      for (int var13 = var2 = 0; var13 < this.j.length; var13 = var2) {
         Class0 var14;
         label159: {
            this.j[var2] = new com.xy.w.Class18();
            if (var2 == 0 || var2 == 1) {
               com.xy.w.Class18 var15 = this.j[var2];
               String var28 = "[7\u00070\u0007f\u001dzX:O";
               var15.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
               if (var2 == 0) {
                  var14 = this;
                  this.j[var2].setBounds(48, 50, 210, 21);
                  break label159;
               }

               if (var2 == 1) {
                  var14 = this;
                  this.j[var2].setBounds(277, 281, 426, 21);
                  break label159;
               }
            } else if (var2 >= 2 && var2 <= 4) {
               com.xy.w.Class18 var27 = this.j[var2];
               String var36 = "kh7o79,%he\u007f";
               var27.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               if (var2 == 2) {
                  var14 = this;
                  this.j[var2].setBounds(48, 50, 210, 242);
                  break label159;
               }

               if (var2 == 3) {
                  var14 = this;
                  this.j[var2].setBounds(277, 58, 230, 200);
                  break label159;
               }

               if (var2 == 4) {
                  var14 = this;
                  this.j[var2].setBounds(277, 281, 426, 215);
                  break label159;
               }
            } else {
               if (var2 == 5) {
                  var14 = this;
                  com.xy.w.Class18 var35 = this.j[var2];
                  String var38 = "'K{L{\u0019a\u0018zX:O";
                  var35.dp("sc/d/150.png");
                  this.j[var2].setBounds(585, 133, 30, 56);
                  break label159;
               }

               if (var2 == 6) {
                  com.xy.w.Class18 var26 = this.j[var2];
                  String var34 = "kh7o78.%he\u007f";
                  var26.mt(com.xy.w.Class16.m("sc/d/36.png", 30, 30, 30, 30, false));
                  this.j[var2].setBounds(269, 50, 446, 453);
               }
            }

            var14 = this;
         }

         var14.add(this.j[var2++]);
      }
   }

   public void g(int var1) {
      if (var1 == 171) {
         this.f();
      } else if (var1 == 172) {
         if (this.ze().getBattleScene() == null) {
            com.xy.i.Class0.ff(20, this.afx);
         }
      } else {
         if (var1 == 173) {
            if (this.ze().getBattleScene() != null) {
               return;
            }

            com.xy.i.Class0.ff(2, this.afx);
         }
      }
   }

   public void h() {
      this.a.t();
      this.f.t();
   }

   public void i(BigDecimal var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         Mount var3;
         if ((var3 = var2.getChoseMount()) != null) {
            RoleSummoning var4 = var1 != null ? var2.getPet(var1) : null;
            if (var4 == null) {
               String var12 = "诼逑拢佸覊箹刽皜叧唼其９";
               this.afx._do("请选择你要管制的召唤兽！");
            } else {
               Mount var5;
               if ((var5 = var2.getPetMount(var4.getSid())) != null && var5.getMountid() == var3.getMountid()) {
                  String var11 = "叄啰兕嶦袃讱坸髅箉剢\t";
                  this.afx._do("召唤兽已被该坐骑管制!");
               } else if (var3.getSid() == null
                  || var3.getOthrersid() == null
                  || var3.getMountlvl() > 100 && (var3.getMountlvl() <= 100 || var3.getSid3() == null)) {
                  if (var5 != null) {
                     if (com.xy.v.Class12.x(var5.getSid(), var1)) {
                        var5.setSid(null);
                     } else if (com.xy.v.Class12.x(var5.getOthrersid(), var1)) {
                        var5.setOthrersid(null);
                     } else if (com.xy.v.Class12.x(var5.getSid3(), var1)) {
                        var5.setSid3(null);
                     }

                     String var6 = Agreement.getSendTextAES("changemountvalue", com.xy.v.Class31.a().toJson(var5));
                     this.za().k(var6);
                  }

                  byte var8 = 0;
                  byte var10000;
                  if (var3.getSid() == null) {
                     var10000 = var8 = 1;
                     var3.setSid(var4.getSid());
                  } else if (var3.getOthrersid() == null) {
                     var10000 = var8 = 2;
                     var3.setOthrersid(var4.getSid());
                  } else {
                     if (var3.getMountlvl() > 100 && var3.getSid3() == null) {
                        var8 = 3;
                        var3.setSid3(var4.getSid());
                     }

                     var10000 = var8;
                  }

                  if (var10000 != 0) {
                     String var7 = Agreement.getSendTextAES("changemountvalue", com.xy.v.Class31.a().toJson(var3));
                     this.za().k(var7);
                  }

                  this.f.t();
                  this.c();
               } else {
                  String var10001 = "诽坛骉箪刮吆卍巹滹";
                  this.afx._do("该坐骑管制名单已满");
               }
            }
         }
      }
   }

   @Override
   protected void paintChildren(Graphics var1) {
      if (this.afx.dh()) {
         this.c();
      }

      super.paintChildren(var1);
      if (this.d != null) {
         this.d.r(var1, 392, 220, 0, com.xy.v.Class22.l());
      }
   }

   // $VF: synthetic method
   static Image j(Class0 var0) {
      return var0.g;
   }
}
