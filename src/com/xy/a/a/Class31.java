package com.xy.a.a;

import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class31 extends com.xy.q.Class30 {
   private com.xy.w.Class0 ahv;
   private JList<String> ahw;
   private JScrollPane rf;
   private com.xy.q.Class6 f;
   private com.xy.w.Class18[] aw;
   private JScrollPane cp;
   private com.xy.q.Class14[] s;
   private com.xy.i.Class4[] ly;
   private DefaultListModel<String> rp;
   private JLabel[] au;

   @Override
   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.ahv != null) {
         this.ahv.r(var1, 110, 180, 0, com.xy.v.Class22.l());
      }
   }

   public void c() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         Mount var2;
         if ((var2 = var1.getChoseMount()) != null) {
            int var3;
            if ((var3 = var1.getLoginResult().getMount_id()) != var2.getMountid()) {
               int var6;
               for (int var10 = var6 = 0; var10 < var1.mounts.size(); var10 = ++var6) {
                  if (var3 == var1.mounts.get(var6).getMountid()) {
                     this.rp.set(var6, var1.mounts.get(var6).getMountname());
                  } else if (var2.getMountid() == var1.mounts.get(var6).getMountid()) {
                     String var10003 = "b.c";
                     this.rp.set(var6, "(*)" + var1.mounts.get(var6).getMountname());
                  }
               }

               var1.getLoginResult().setMount_id(var2.getMountid());
               StringBuilder var12 = new StringBuilder("M").append(var2.getMountid());
               String var10002 = "K";
               String var7 = Agreement.getSendTextAES("rolechange", var12.append("=").append(var2.getMid()).toString());
               this.za().k(var7);
               com.xy.i.Class4 var11 = this.ly[0];
               String var13 = "伕急";
               var11.setText("休息");
            } else {
               int var4;
               int var10000 = var4 = 0;

               RoleData var8;
               while (true) {
                  if (var10000 >= var1.mounts.size()) {
                     var8 = var1;
                     break;
                  }

                  if (var3 == var1.mounts.get(var4).getMountid()) {
                     this.rp.set(var4, var1.mounts.get(var4).getMountname());
                     var8 = var1;
                     break;
                  }

                  var10000 = ++var4;
               }

               var8.getLoginResult().setMount_id(0);
               String var5 = Agreement.getSendTextAES("rolechange", "M");
               this.za().k(var5);
               com.xy.i.Class4 var9 = this.ly[0];
               String var10001 = "骝丮";
               var9.setText("骑乘");
            }
         }
      }
   }

   @Override
   public void l() {
      this.e();
      super.l();
   }

   @Override
   public boolean ah() {
      this.b(null);
      return super.ah();
   }

   public void e() {
      RoleData var1 = this.yx();
      this.rp.removeAllElements();
      int var2 = -1;
      int var3 = var1.getLoginResult().getMount_id();

      int var4;
      for (int var10000 = var4 = 0; var10000 < var1.mounts.size(); var10000 = ++var4) {
         Mount var5 = var1.mounts.get(var4);
         if (var3 == var5.getMountid()) {
            String var10004 = "b.c";
            this.rp.addElement("(*)" + var5.getMountname());
            var2 = var4;
         } else {
            this.rp.addElement(var5.getMountname());
         }
      }

      this.f.t();
      boolean var6;
      RoleData var10001;
      if (var2 == -1) {
         var6 = true;
         var10001 = var1;
      } else {
         var6 = false;
         var10001 = var1;
      }

      if (var6 & var10001.mounts.size() != 0) {
         var2 = 0;
      }

      if (var2 != -1) {
         this.ahw.setSelectedIndex(var2);
      }
   }

   public void f() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         Mount var2;
         if ((var2 = var1.getChoseMount()) != null) {
            RolePet var3;
            RoleSummoning var4 = (var3 = var1.getRolePet(this.f.ee())) != null ? var3.getPet() : null;
            if (var4 == null) {
               String var14 = "读避拥伖覍篗刺盲叠啒共ｷ";
               this.afx._do("请选择你要管制的召唤兽！");
            } else {
               Mount var5;
               if ((var5 = var1.getPetMount(var4.getSid())) != null && var5.getMountid() != var2.getMountid()) {
                  String var13 = "诡厦唠儷巶裡兲亜坔髛箥剼";
                  this.afx._do("该召唤兽已被其他坐骑管制");
               } else {
                  byte var6 = 0;
                  byte var10000;
                  if (var2.getSid() != null && var4.getSid().compareTo(var2.getSid()) == 0) {
                     var10000 = var6 = -1;
                     var2.setSid(null);
                  } else if (var2.getOthrersid() != null && var4.getSid().compareTo(var2.getOthrersid()) == 0) {
                     var10000 = var6 = -2;
                     var2.setOthrersid(null);
                  } else if (var2.getSid3() != null && var4.getSid().compareTo(var2.getSid3()) == 0) {
                     var10000 = var6 = -3;
                     var2.setSid3(null);
                  } else if (var2.getSid() == null) {
                     var2.setSid(var4.getSid());
                     var10000 = var6 = 1;
                  } else if (var2.getOthrersid() == null) {
                     var2.setOthrersid(var4.getSid());
                     var10000 = var6 = 2;
                  } else {
                     if (var2.getMountlvl() > 100 && var2.getSid3() == null) {
                        var2.setSid3(var4.getSid());
                        var6 = 3;
                     }

                     var10000 = var6;
                  }

                  if (var10000 == 0) {
                     String var10001 = "皘剁圦骝篗刺乼陜W";
                     this.afx._do("目前坐骑管制上限!");
                  } else {
                     this.f.t();
                     String var7 = Agreement.getSendTextAES("changemountvalue", com.xy.v.Class31.a().toJson(var2));
                     this.za().k(var7);
                  }
               }
            }
         }
      }
   }

   public void h() {
      int var10000 = 0;
      this.ahv = null;

      for (int var1 = 0; var10000 < this.s.length; var10000 = var1) {
         this.s[var1++].setText(null);
      }
   }

   public Class31(GameView var1) {
      super(7, 2, com.xy.q.Class30.afz, var1);
      String var10015 = "\u007f\u0015#\u0012#G\"\u0006b\u0011";
      this.yy(-2, 0, 412, 475, com.xy.q.Class30.agh);
      com.xy.w.Class9 var43 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10016 = "坔髛";
      this.yu(var43, "坐骑");
      this.rp = new DefaultListModel<>();
      this.ahw = new JList<>();
      this.ahw.setOpaque(false);
      this.ahw.setSelectionBackground(com.xy.q.Class53.wu);
      this.ahw.setSelectionForeground(Color.white);
      this.ahw.setForeground(Color.white);
      this.ahw.setFont(com.xy.q.Class49.ac);
      this.ahw.setBackground(com.xy.q.Class49.bk);
      this.ahw.setModel(this.rp);
      this.ahw.addListSelectionListener(new Class37(this));
      this.rf = com.xy.q.Class1.g(47, 266, 140, 159, this.ahw, 20);
      this.add(this.rf);
      JLabel var2 = com.xy.q.Class1.f(193, 245, 110, 20, 0, Color.white, com.xy.q.Class49.ch);
      JLabel var3 = com.xy.q.Class1.f(303, 245, 70, 20, 0, Color.white, com.xy.q.Class49.ch);
      String var10005 = "箥剼坔髛";
      String var10007 = "厚唨儋";
      var2.setText("召唤兽");
      var3.setText("管制坐骑");
      this.add(var2);
      this.add(var3);
      this.f = new com.xy.q.Class6(this);
      this.f.setBounds(0, 0, 200, 20);
      this.cp = com.xy.q.Class1.g(193, 265, 200, 160, this.f, 20);
      this.add(this.cp);
      this.ly = new com.xy.i.Class4[5];

      int var4;
      for (int var10000 = var4 = 0; var10000 < this.ly.length; var10000 = var4) {
         String var10006 = "\u007f\u0015#\u0013#A\"\u0006b\u0011";
         this.ly[var4] = new com.xy.i.Class4("sc/e/7.png", 1, 61 + var4, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "", this);
         this.ly[var4].setBounds(44 + 73 * var4, 432, 59, 25);
         com.xy.i.Class4 var8 = this.ly[var4];
         String var15;
         if (var4 == 0) {
            var15 = "伕急";
            var15 = "休息";
         } else if (var4 == 1) {
            var15 = "箭剀";
            var15 = "管制";
         } else if (var4 == 2) {
            var15 = "喆儱";
            var15 = "喂养";
         } else if (var4 == 3) {
            var15 = "抌肋";
            var15 = "技能";
         } else if (var4 == 4) {
            var15 = "攺畕";
            var15 = "放生";
         } else {
            var15 = "";
         }

         var8.setText(var15);
         this.add(this.ly[var4++]);
      }

      this.au = new JLabel[9];

      for (int var9 = var4 = 0; var9 < this.au.length; var9 = ++var4) {
         if (var4 != 7 && var4 != 8) {
            this.au[var4] = com.xy.q.Class1.f(198, 28 + 34 * var4, 36, 19, 0, var4 >= 6 && var4 <= 8 ? Color.white : Color.black, com.xy.q.Class49.ch);
            JLabel var10 = this.au[var4];
            String var21;
            if (var4 == 0) {
               var21 = "筅绑";
               var21 = "等级";
            } else if (var4 == 1) {
               var21 = "佗勑";
               var21 = "体力";
            } else if (var4 == 2) {
               var21 = "灹恑";
               var21 = "灵性";
            } else if (var4 == 3) {
               var21 = "功醅";
               var21 = "力量";
            } else if (var4 == 4) {
               var21 = "栵髞";
               var21 = "根骨";
            } else if (var4 == 5) {
               var21 = "绋髆";
               var21 = "经验";
            } else if (var4 == 6) {
               var21 = "坜髧创蠞";
               var21 = "坐骑列表";
            } else if (var4 == 7) {
               var21 = "厦唠儷";
               var21 = "召唤兽";
            } else if (var4 == 8) {
               var21 = "箭剀坜髧";
               var21 = "管制坐骑";
            } else {
               var21 = "";
            }

            var10.setText(var21);
            Class31 var11;
            if (var4 == 6) {
               var11 = this;
               this.au[var4].setBounds(45, 245, 143, 21);
            } else if (var4 == 7) {
               var11 = this;
               this.au[var4].setBounds(222, 245, 63, 21);
            } else {
               if (var4 == 8) {
                  this.au[var4].setBounds(308, 245, 73, 21);
               }

               var11 = this;
            }

            var11.add(this.au[var4]);
         }
      }

      this.s = new com.xy.q.Class14[6];

      for (int var12 = var4 = 0; var12 < this.s.length; var12 = var4) {
         this.s[var4] = com.xy.q.Class1.i(243, 28 + 34 * var4, 138, 19, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var31 = this.s[var4];
         String var10003 = "9ge`e5}*:j-";
         var31.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         this.add(this.s[var4++]);
      }

      this.aw = new com.xy.w.Class18[5];

      for (int var13 = var4 = 0; var13 < this.aw.length; var13 = var4) {
         this.aw[var4] = new com.xy.w.Class18();
         Class31 var14;
         if (var4 == 0) {
            var14 = this;
            com.xy.w.Class18 var33 = this.aw[var4];
            String var39 = "\u0005oYhY=@\"\u0006b\u0011";
            var33.mt(com.xy.w.Class16.m("sc/d/16.png", 2, 2, 2, 2, false));
            this.aw[var4].setBounds(45, 24, 143, 200);
         } else if (var4 == 1) {
            var14 = this;
            com.xy.w.Class18 var34 = this.aw[var4];
            String var40 = "9ge`e6\u007f*:j-";
            var34.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var4].setBounds(45, 245, 143, 21);
         } else if (var4 == 2) {
            var14 = this;
            com.xy.w.Class18 var35 = this.aw[var4];
            String var41 = "\u0005oYhY>C\"\u0006b\u0011";
            var35.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var4].setBounds(191, 245, 204, 21);
         } else if (var4 == 3) {
            var14 = this;
            com.xy.w.Class18 var36 = this.aw[var4];
            String var42 = "9ge`e6~*:j-";
            var36.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aw[var4].setBounds(45, 245, 143, 180);
         } else {
            if (var4 == 4) {
               com.xy.w.Class18 var30 = this.aw[var4];
               String var37 = "\u0005oYhY>B\"\u0006b\u0011";
               var30.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aw[var4].setBounds(191, 245, 204, 180);
            }

            var14 = this;
         }

         var14.add(this.aw[var4++]);
      }
   }

   // $VF: synthetic method
   static JList aah(Class31 var0) {
      return var0.ahw;
   }

   public void b(Mount var1) {
      RoleData var2;
      if ((var2 = this.yx()) != null) {
         var2.setChoseMountId(var1 != null ? var1.getMid() : null);
         this.h();
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

            com.xy.i.Class4 var12 = this.ly[0];
            String var14;
            if (var2.getLoginResult().getMount_id() == var1.getMountid()) {
               var14 = "伝怙";
               var14 = "休息";
            } else {
               var14 = "骕丒";
               var14 = "骑乘";
            }

            var12.setText(var14);
            this.s[0].setText(var1.getMountlvlString());
            this.s[1].setText("" + var1.getLive());
            this.s[2].setText(String.valueOf(var4));
            this.s[3].setText(String.valueOf(var5));
            this.s[4].setText(String.valueOf(var6));
            Class31 var13;
            if (var3 < 100) {
               var13 = this;
               com.xy.q.Class14 var16 = this.s[5];
               StringBuilder var10002 = new StringBuilder().append(var1.getExp());
               String var10003 = "Y";
               var16.setText(var10002.append("/").append(ExpUtil.getMountExp(var1.getMountlvl())).toString());
            } else {
               var13 = this;
               com.xy.q.Class14 var17 = this.s[5];
               StringBuilder var18 = new StringBuilder().append(var1.getExp());
               String var19 = "e=s=s=s";
               var17.setText(var18.append("/999999").toString());
            }

            var13.ahv = com.xy.w.Class11.p((long)var1.getMountid().intValue() << 40 | var2.getLoginResult().getSpecies_id().longValue(), 2, 1, null);
            Class1 var11;
            if ((var11 = (Class1)this.afx.getFormManagement().l(20)) != null) {
               var11.b(var1);
            }
         }
      }
   }
}
