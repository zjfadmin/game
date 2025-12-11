package com.xy.a.w;

import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.formula.ExpUtil;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.readbean.TYCModel;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.Class32;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class20 extends com.xy.q.Class30 {
   public int zz;
   private com.xy.i.Class20 aaa;
   private com.xy.i.Class20 aab;
   private com.xy.q.Class19 aac;
   private com.xy.w.Class18[] aad;
   public int sc;
   private com.xy.w.Class18 aae;
   public int gt;
   private JLabel cy;
   private List<Class2> aaf;
   private com.xy.i.Class20 aag;
   private com.xy.i.Class20 aah;
   private com.xy.i.Class20 tf;
   private JLabel xg;
   private com.xy.i.Class20 qo;
   public int aa;
   public int cn;
   private com.xy.w.Class18 co;
   private com.xy.i.Class20 aai;
   private com.xy.i.Class20 aaj;
   public int ds;
   private boolean bi;
   public int ah;

   public void a() {
      this.xg.setText(String.valueOf(this.sc - this.cn));
      Iterator var2;
      Iterator var10000 = var2 = this.aaf.iterator();

      while (var10000.hasNext()) {
         Class2 var1;
         if (Class2.cz(var1 = (Class2)var2.next()) == null) {
            var10000 = var2;
         } else {
            Class2 var3;
            if (Class2.cy(var1) >= 5) {
               var3 = var1;
               Class2.cv(var1, false);
            } else {
               var3 = var1;
               Class2.cv(var1, this.uo(var1, var1, true));
            }

            var3.c();
            var10000 = var2;
         }
      }
   }

   public void c() {
      if (this.gt == 0 && this.cn <= this.sc) {
         boolean var1 = false;
         StringBuffer var2;
         (var2 = new StringBuffer()).append(this.ah);
         Iterator var4 = this.aaf.iterator();
         Iterator var10000 = var4;

         while (var10000.hasNext()) {
            Class2 var3;
            if (Class2.cz(var3 = (Class2)var4.next()) != null) {
               if (Class2.cy(var3) == 0) {
                  var10000 = var4;
                  continue;
               }

               int var5 = 0;
               int var9;
               if (Class2.cz(var3).getType() == 0) {
                  byte var7;
                  var9 = var7 = 0;
               } else if (Class2.cz(var3).getType() == 1) {
                  var9 = (Class2.cz(var3).getKey() == this.aa ? 1 : 2) << 9;
               } else {
                  if (Class2.cz(var3).getType() == 2) {
                     var5 = 1536;
                  }

                  var9 = var5;
               }

               var5 = var9 | Class2.cz(var3).getLvl() << 6 | Class2.cz(var3).getIndex() << 3 | Class2.cy(var3);
               String var10002 = "d";
               var2.append("#");
               var2.append(var5);
               if (Class2.cy(var3) > Class2.cu(var3)) {
                  var1 = true;
               }
            }

            var10000 = var4;
         }

         if (!var1) {
            String var10 = "泂杦侍敖盧疺辚";
            this.afx._do("没有修改的痕迹");
         } else {
            RoleData var6 = this.yx();
            var6.getPrivateData().setSkills("N", var2.toString());
            var6.getRoleProperty().k();
            ParamTool.a(var6.getPrivateData(), this.za());
            var6.getRoleProperty().y();
            this.g(0);
            String var10001 = "嶵依嬟";
            this.afx._do("已保存");
         }
      }
   }

   public void de(int var1, String[] var2) {
      this.ah = var1;
      this.bi = var2 != null;
      this.cn = 0;
      this.aa = SkillUtil.getSmIndex(this.ds, this.ah == 2 ? 1 : 0);
      this.zz = SkillUtil.getSmIndex(this.ds, this.ah == 0 ? 1 : 2);
      int var3 = SkillUtil.getSmIndex(this.ds, this.ah == 0 ? 2 : (this.ah == 1 ? 1 : 0));
      com.xy.w.Class18 var10008 = this.aad[8];
      String var10011 = "4#h#h";
      var10008.dp("sc/c/" + (112 + this.aa));
      com.xy.w.Class18 var10007 = this.aad[9];
      String var10010 = "\u0010\fL\fL";
      var10007.dp("sc/c/" + (112 + this.zz));
      com.xy.w.Class18 var10006 = this.aad[10];
      String var10009 = "4#h#h";
      var10006.dp("sc/c/" + (132 + this.aa));
      com.xy.w.Class18 var10005 = this.aad[11];
      String var14 = "\u0010\fL\fL";
      var10005.dp("sc/c/" + (132 + this.zz));
      com.xy.w.Class18 var10004 = this.aad[12];
      String var13 = "4#h#h";
      var10004.dp("sc/c/" + (112 + var3));
      com.xy.v.Class8 var4 = this.yt();
      int var5 = 0;
      List var6 = var4.br(this.ds);
      var5 = this.uh(var5, 0, var6);
      var6 = var4.br(4294967296L | this.aa);
      var5 = this.uh(var5, 1, var6);
      var6 = var4.br(4294967296L | this.zz);
      var5 = this.uh(var5, 2, var6);
      var6 = var4.br(8589934592L | (this.zz > this.aa ? this.zz << 8 | this.aa : this.aa << 8 | this.zz));
      this.lm(this.uh(var5, 3, var6));
      this.tg(var2);
      this.a();
   }

   public int uh(int var1, int var2, List<TYCModel> var3) {
      int var4 = -1;
      int var5 = 0;
      Iterator var7;
      Iterator var10000 = var7 = var3.iterator();

      while (var10000.hasNext()) {
         TYCModel var6 = (TYCModel)var7.next();
         this.up(var1).da(var6);
         var1++;
         if (var4 != -1 && var4 == var6.getLvl()) {
            var5++;
            var10000 = var7;
         } else {
            if (var4 != -1) {
               this.ul(var5, var1 - 1, var4, var2);
            }

            var4 = var6.getLvl();
            var5 = 1;
            var10000 = var7;
         }
      }

      this.ul(var5, var1, var4, var2);
      return var1;
   }

   public void ui(int var1) {
      this.sc = var1;
      this.xg.setText(String.valueOf(var1 - this.cn));
   }

   public boolean dh() {
      return this.bi;
   }

   public void uj(int var1) {
      if (var1 == 0) {
         this.co.setBounds(117, 517, 98, 22);
         this.xg.setBounds(173, 517, 60, 22);
         this.aab.setBounds(216, 519, 34, 18);
         this.qo.setBounds(252, 519, 34, 18);
         this.aai.setBounds(52, 515, 59, 25);
         this.aae.setVisible(false);
         this.cy.setVisible(false);
         this.aac.setVisible(false);
         this.aai.y(301);
         String var6 = "\u001c\u0000@\u0006@TA\u0013\u0001\u0004";
         this.aai.setImage("sc/e/7.png");
         String var3 = "則挥";
         this.aai.setText("切换");
         var3 = "\u001c\u0000@\u0006@UA\u0013\u0001\u0004";
         this.aab.setBtn(1, "sc/e/6.png");
         var6 = "橡折勠烾";
         this.aaa.setText("模拟加点");
         var6 = "\u0010\fL\nL]UA\u0013\u0001\u0004";
         this.aaj.setBtn(1, "sc/e/26.png");
      } else {
         this.co.setBounds(52, 517, 98, 22);
         this.xg.setBounds(108, 517, 60, 22);
         this.aab.setBounds(151, 519, 34, 18);
         this.qo.setBounds(187, 519, 34, 18);
         this.aai.setBounds(320, 518, 17, 17);
         this.aae.setVisible(true);
         this.cy.setVisible(true);
         this.aai.y(302);
         this.aai.setText(null);
         String var10002 = "3$o$or";
         this.aai.setImage("sc/c/5");
         var10002 = "\u001c\u0000@\u0000@RZ[";
         this.aab.setBtn(-1, "sc/c/158");
         String var10003 = "厖淏橡折";
         this.aaa.setText("取消模拟");
         var10003 = "\u001c\u0000@\u0000@RZZ";
         this.aaj.setBtn(-1, "sc/c/159");
      }
   }

   public void lm(int var1) {
      int var2;
      for (int var10000 = var2 = var1; var10000 < this.aaf.size(); var10000 = var2) {
         Object var3 = this.aaf.get(var2);
         var2++;
         ((Class2)var3).da(null);
      }
   }

   public void bi(int var1) {
      this.y(var1);
      this.de(0, null);
      this.cy.setText(this.aac.td().get(var1 - 1));
      this.aac.setVisible(false);
   }

   // $VF: synthetic method
   static com.xy.q.Class19 uk(Class20 var0) {
      return var0.aac;
   }

   public void ul(int var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = 0;
      int var10000;
      if (var4 == 0) {
         var5 = 400 - var1 * 42 / 2;
         var6 = 76;
         var10000 = var2;
      } else if (var4 == 1) {
         var5 = var3 != 2 && var3 != 4 ? (var3 == 3 ? 66 : 126) : 81;
         var6 = 116 + var3 * 54;
         var10000 = var2;
      } else if (var4 == 2) {
         var5 = var3 != 2 && var3 != 4 ? (var3 == 3 ? 66 : 126) : 81;
         var5 = 795 - var5 - var1 * 42;
         var6 = 116 + var3 * 54;
         var10000 = var2;
      } else {
         if (var4 == 3) {
            var5 = 400 - var1 * 42 / 2;
            var6 = 116 + var3 * 54;
         }

         var10000 = var2;
      }

      int var7;
      for (int var10 = var7 = var10000 - var1; var10 < var2; var10 = var7) {
         Class2 var8 = this.up(var7);
         int var10001 = var5 + Class2.cz(var8).getIndex() * 42;
         var7++;
         var8.setBounds(var10001, var6, 38, 38);
      }
   }

   // $VF: synthetic method
   static List um(Class20 var0) {
      return var0.aaf;
   }

   public Class2 un(int var1, int var2, int var3, int var4) {
      Iterator var6;
      Iterator var10000 = var6 = this.aaf.iterator();

      while (var10000.hasNext()) {
         Class2 var5;
         if (!(var5 = (Class2)var6.next()).isVisible()) {
            var10000 = var6;
         } else if (Class2.cz(var5).getType() != var1) {
            var10000 = var6;
         } else if (Class2.cz(var5).getKey() != var2) {
            var10000 = var6;
         } else if (Class2.cz(var5).getLvl() != var3) {
            var10000 = var6;
         } else {
            if (Class2.cz(var5).getIndex() == var4) {
               return var5;
            }

            var10000 = var6;
         }
      }

      return null;
   }

   public void e() {
      if (this.gt == 1) {
         this.bf().setVisible(true);
      }
   }

   public boolean uo(Class2 var1, Class2 var2, boolean var3) {
      if (Class2.cz(var1).getType() != 0 && (var1 != var2 || var3)) {
         if (Class2.cz(var1).getType() == 1) {
            int var4 = Class2.cz(var1).getLvl() == 1 ? 20 : 5;
            if (this.uq(0, Class2.cz(var1).getKey(), Class2.cz(var1).getLvl() - 1, null, var2, var3) < var4) {
               return false;
            }

            int var5;
            if ((var5 = this.uq(0, Class2.cz(var1).getKey(), Class2.cz(var1).getLvl(), null, var2, var3)) > 10) {
               return false;
            }

            if (Class2.cz(var1).getLvl() > 1) {
               var4 = this.uq(0, Class2.cz(var1).getKey(), Class2.cz(var1).getLvl() - 1, null, var2, var3);
               if (var5 > var4) {
                  return false;
               }
            }

            if (Class2.cz(var1).getLvl() == 5) {
               int var6 = Class2.cy(var1);
               if (var1 == var2) {
                  var6 += var3 ? 1 : -1;
               }

               var4 = var6 == 0 ? 20 : (var6 == 1 ? 21 : (var6 == 2 ? 26 : (var6 == 3 ? 31 : (var6 == 4 ? 36 : 40))));
               if (this.uq(1, Class2.cz(var1).getKey(), Class2.cz(var1).getLvl(), null, var2, var3) < var4) {
                  return false;
               }
            }

            if (Class2.cz(var1).getLvl() == 5 || Class2.cz(var1).getLvl() == 6) {
               Class20 var10000;
               if (Class2.cz(var1).getLvl() == 5) {
                  if (this.uq(0, Class2.cz(var1).getKey() == this.aa ? this.zz : this.aa, 5, null, var2, var3) > 0) {
                     int var10 = Class2.cy(var1);
                     if (var1 == var2) {
                        var10 += var3 ? 1 : -1;
                     }

                     var4 = var10 == 0 ? 119 : 120;
                     var10000 = this;
                  } else {
                     var4 = 0;
                     var10000 = this;
                  }
               } else {
                  var4 = 80;
                  var10000 = this;
               }

               if (var10000.uq(2, 0, 0, null, var2, var3) < var4) {
                  return false;
               }
            }

            if (Class2.cz(var1).getLvl() == 5 && this.uq(0, Class2.cz(var1).getKey(), 5, var1, var2, var3) > 0) {
               return false;
            }

            if (Class2.cz(var1).getLvl() == 6 && this.uq(3, Class2.cz(var1).getKey(), 5, var1, var2, var3) < 5) {
               return false;
            }
         } else if (Class2.cz(var1).getType() == 2) {
            if (this.uq(0, this.aa, Class2.cz(var1).getLvl(), null, var2, var3) < 5) {
               return false;
            }

            if (this.uq(0, this.zz, Class2.cz(var1).getLvl(), null, var2, var3) < 5) {
               return false;
            }

            if (this.uq(0, 0, Class2.cz(var1).getLvl(), var1, var2, var3) > 0) {
               return false;
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public void cv(Class2 var1, boolean var2) {
      int var3;
      if ((var3 = Class2.cy(var1) + (var2 ? 1 : -1)) >= Class2.cu(var1) && var3 <= 5 && this.cn + (var2 ? 1 : -1) <= this.sc) {
         Iterator var5;
         Iterator var10000 = var5 = this.aaf.iterator();

         while (var10000.hasNext()) {
            Class2 var4;
            if (Class2.cz(var4 = (Class2)var5.next()) != null) {
               if (Class2.cy(var4) == 0) {
                  var10000 = var5;
                  continue;
               }

               if (!this.uo(var4, var1, var2)) {
                  return;
               }
            }

            var10000 = var5;
         }

         var1.n(var3);
         this.cn += var2 ? 1 : -1;
         this.a();
      }
   }

   public JComponent bf() {
      return this.aac;
   }

   public Class2 up(int var1) {
      Class2 var2 = var1 < this.aaf.size() ? this.aaf.get(var1) : null;
      if (var2 == null) {
         this.aaf.add(var2 = new Class2(this));
         this.add(var2);
      }

      return var2;
   }

   public void y(int var1) {
      if (var1 != 0) {
         int var2 = (this.ds - 1) / 2;
         int var3 = (var1 - 1) / 2;
         this.ds = var1;
         if (var3 != var2) {
            String var10008 = "\u0010\fL\fL";
            this._do("sc/c/" + (88 + var3));
            String var10007 = "4#h#h";
            this.tf.setImage("sc/c/" + (93 + var3 * 3));
            String var10006 = "\u0010\fL\fL";
            this.aah.setImage("sc/c/" + (94 + var3 * 3));
            String var10005 = "4#h#h";
            this.aag.setImage("sc/c/" + (95 + var3 * 3));
            com.xy.w.Class18 var10001 = this.aad[6];
            String var10004 = "\u0010\fL\fL";
            var10001.dp("sc/c/" + (108 + var3));
            com.xy.w.Class18 var10000 = this.aad[7];
            String var10003 = "4#h#h";
            var10000.dp("sc/c/" + (108 + var3));
         }
      }
   }

   public int uq(int var1, int var2, int var3, Class2 var4, Class2 var5, boolean var6) {
      if (var1 == 2) {
         return this.cn + (var5 == null ? 0 : (var6 ? 1 : -1));
      } else {
         int var7 = 0;
         Iterator var9;
         Iterator var10000 = var9 = this.aaf.iterator();

         while (var10000.hasNext()) {
            Class2 var8;
            if (Class2.cz(var8 = (Class2)var9.next()) != null) {
               if (var8 == var4) {
                  var10000 = var9;
                  continue;
               }

               int var10 = Class2.cy(var8);
               if (var8 == var5) {
                  var10 += var6 ? 1 : -1;
               }

               if (var10 < 0) {
                  var10000 = var9;
                  continue;
               }

               if (var1 == 0) {
                  if (Class2.cz(var8).getType() == 0) {
                     if (var3 == 0) {
                        var7 += var10;
                        var10000 = var9;
                        continue;
                     }
                  } else if (Class2.cz(var8).getType() == 1) {
                     if (var2 == Class2.cz(var8).getKey() && var3 == Class2.cz(var8).getLvl()) {
                        var7 += var10;
                        var10000 = var9;
                        continue;
                     }
                  } else if (Class2.cz(var8).getType() == 2 && var2 == 0 && var3 == Class2.cz(var8).getLvl()) {
                     var7 += var10;
                     var10000 = var9;
                     continue;
                  }
               } else if (var1 == 1) {
                  if (Class2.cz(var8).getType() == 1) {
                     if (var2 == Class2.cz(var8).getKey()) {
                        var7 += var10;
                        var10000 = var9;
                        continue;
                     }
                  } else if (Class2.cz(var8).getType() == 2 && var2 == 0) {
                     var7 += var10;
                     var10000 = var9;
                     continue;
                  }
               } else if (var1 == 3 && var4 != null) {
                  if (Class2.cz(var8).getType() != Class2.cz(var4).getType()) {
                     var10000 = var9;
                  } else if (Class2.cz(var8).getKey() != Class2.cz(var4).getKey()) {
                     var10000 = var9;
                  } else if (Class2.cz(var8).getLvl() + 1 != Class2.cz(var4).getLvl()) {
                     var10000 = var9;
                  } else {
                     if (Class2.cz(var8).getIndex() == Class2.cz(var4).getIndex()) {
                        int var11;
                        return var11 = var7 + var10;
                     }

                     var10000 = var9;
                  }
                  continue;
               }
            }

            var10000 = var9;
         }

         return var7;
      }
   }

   public void f() {
      if (this.gt == 1) {
         this.de(this.ah, null);
      } else if (this.cn != 0) {
         long var1 = this.cn * (this.za().l(2, 12) ? 200000 : 5000000);
         GameView var10000 = this.afx;
         String var10004 = String.valueOf(var1);
         String var10007 = "L4伏砍寵觢苞赚L1";
         StringBuilder var10005 = new StringBuilder("#W你确定要花费#R").append(var1 / 10000L);
         String var10006 = "\u0010c\u0010钶乣l醊缮奮潔笑勠烾呗x";
         var10000.dm(new ConfirmBean(15, var10004, var10005.append("W#W银两,重置天演策加点吗?").toString()));
      }
   }

   public void tg(String[] var1) {
      if (var1 != null) {
         int var2 = 0;

         int var3;
         for (int var10000 = var3 = 1; var10000 < var1.length; var10000 = var3) {
            int var4 = (var2 = Integer.parseInt(var1[var3])) >> 9 & 7;
            int var5 = 0;
            int var6 = var2 >> 6 & 7;
            int var7 = var2 >> 3 & 7;
            byte var10;
            Class20 var12;
            if (var4 == 0) {
               var10 = 0;
               var12 = this;
               var5 = this.ds;
            } else if (var4 == 1) {
               var10 = 1;
               var12 = this;
               var5 = this.aa;
            } else if (var4 == 2) {
               var10 = 1;
               var12 = this;
               var5 = this.zz;
            } else {
               var10 = 2;
               var5 = this.zz > this.aa ? this.zz << 8 | this.aa : this.aa << 8 | this.zz;
               var12 = this;
            }

            Class2 var8 = var12.un(var10, var5, var6, var7);
            var8.n(var2 & 7);
            Class2.cx(var8, Class2.cy(var8));
            var3++;
            this.cn = this.cn + Class2.cy(var8);
         }
      }
   }

   public int ur(int var1, int var2, int var3, Class2 var4) {
      return this.uq(var1, var2, var3, var4, null, true);
   }

   public void g(int var1) {
      if (var1 == -1) {
         var1 = this.gt == 0 ? 1 : 0;
      }

      if (this.gt != var1) {
         this.uj(var1);
      }

      this.gt = var1;
      this.cn = 0;
      if (this.gt == 0) {
         RoleData var2;
         LoginResult var10003 = (var2 = this.yx()).getLoginResult();
         String var10004 = "7";
         this.ui(ExpUtil.getTSP(var10003.getExtraPointInt("T")));
         String[] var3 = var2.getPrivateData().getSkill("N");
         this.y(SkillUtil.getSepciesIndex(var2.getLoginResult().getSpecies_id()));
         int var10001;
         String[] var10002;
         if (var3 != null) {
            var10001 = Integer.parseInt(var3[0]);
            var10002 = var3;
         } else {
            var10001 = 0;
            var10002 = var3;
         }

         this.de(var10001, var10002);
      } else {
         this.ui(120);
         this.bi(1);
      }
   }

   public Class20(GameView var1) {
      super(-1, -1, com.xy.q.Class30.agf, var1);
      this.yy(0, 0, 776, 560, com.xy.q.Class30.agf);
      this.wp(new Class32(48, 63, 31, 52));
      this.gt = -1;
      String[] var10000 = new String[10];
      String var10003 = "畷份";
      var10000[0] = "男人";
      var10003 = "夜仙";
      var10000[1] = "女人";
      var10003 = "畷鬓";
      var10000[2] = "男魔";
      var10003 = "夜鬷";
      var10000[3] = "女魔";
      var10003 = "畷亞";
      var10000[4] = "男仙";
      var10003 = "夜人";
      var10000[5] = "女仙";
      var10003 = "畷魻";
      var10000[6] = "男鬼";
      var10003 = "夜魟";
      var10000[7] = "女鬼";
      var10003 = "畷鿞";
      var10000[8] = "男龙";
      var10003 = "夜鿺";
      var10000[9] = "女龙";
      String[] var2 = var10000;
      String var10009 = "3$o$ovup";
      this.aac = new com.xy.q.Class19(64, 120, "sc/c/157", var2);
      this.add(this.aac);
      this.aac.th().addMouseListener(new Class23(this));
      String var10008 = "\u001c\u0000@\u0006@TA\u0013\u0001\u0004";
      String var10013 = "則挥";
      this.aai = new com.xy.i.Class20("sc/e/7.png", 1, 301, Class49.ch, Class49.bv, "切换", this);
      this.add(this.aai);
      String var10010 = "\u001c\u0000@\u0006@UA\u0013\u0001\u0004";
      String var10015 = "儑挥";
      this.aab = new com.xy.i.Class20("sc/e/6.png", 1, 303, Class49.bz, null, "兑换", this);
      this.aab.setOffsetTexts(Class49.ag);
      this.add(this.aab);
      String var10011 = "\u001c\u0000@\u0006@UA\u0013\u0001\u0004";
      String var10016 = "浗烾";
      this.qo = new com.xy.i.Class20("sc/e/6.png", 1, 304, Class49.bz, null, "洗点", this);
      this.qo.setOffsetTexts(Class49.ag);
      this.add(this.qo);
      var10011 = "\u0010\fL\nL]UA\u0013\u0001\u0004";
      var10016 = "橡折勠烾";
      this.aaa = new com.xy.i.Class20("sc/e/26.png", 1, 305, Class49.ch, Class49.bv, "模拟加点", this);
      this.add(this.aaa);
      String var10012 = "\u0010\fL\nL]UA\u0013\u0001\u0004";
      String var10017 = "砮诣勠烾";
      this.aaj = new com.xy.i.Class20("sc/e/26.png", 1, 306, Class49.ch, Class49.bv, "确认加点", this);
      this.add(this.aaj);
      this.xg = new JLabel();
      this.xg.setForeground(Color.white);
      this.xg.setFont(Class49.ac);
      this.add(this.xg);
      String var10014 = "\u001c\u0000@\u0000@RZV";
      this.co = new com.xy.w.Class18("sc/c/155");
      this.add(this.co);
      this.cy = new JLabel();
      this.cy.setForeground(Color.white);
      this.cy.setFont(Class49.ac);
      this.add(this.cy);
      var10016 = "3$o$ovuq";
      this.aae = new com.xy.w.Class18("sc/c/156");
      this.add(this.aae);
      this.aac.setBounds(272, 397, 64, 120);
      this.cy.setBounds(274, 517, 64, 20);
      this.aae.setBounds(235, 517, 104, 20);
      this.aaa.setBounds(540, 515, 99, 25);
      this.aaj.setBounds(645, 515, 99, 25);
      this.tf = new com.xy.i.Class20(null, 1, 307, this);
      this.aah = new com.xy.i.Class20(null, 1, 308, this);
      this.aag = new com.xy.i.Class20(null, -1, 309, this);
      this.tf.setBounds(329, 372, 73, 92);
      this.aah.setBounds(393, 372, 73, 92);
      this.aag.setBounds(350, 435, 99, 72);
      this.add(this.tf);
      this.add(this.aah);
      this.add(this.aag);
      this.aad = new com.xy.w.Class18[13];

      int var3;
      for (int var4 = var3 = this.aad.length - 1; var4 >= 0; var4 = var3) {
         com.xy.w.Class18[] var5 = this.aad;
         String var16;
         if (var3 < 6) {
            var16 = "\u001c\u0000@\u0000@RZW";
            var16 = "sc/c/154";
         } else {
            var16 = null;
         }

         com.xy.w.Class18 var10001 = new com.xy.w.Class18(var16);
         var5[var3] = var10001;
         Class20 var6;
         if (var3 == 0) {
            var6 = this;
            this.aad[var3].setBounds(141, 425, 11, 14);
         } else if (var3 == 1) {
            var6 = this;
            this.aad[var3].setBounds(183, 425, 11, 14);
         } else if (var3 == 2) {
            var6 = this;
            this.aad[var3].setBounds(225, 425, 11, 14);
         } else if (var3 == 3) {
            var6 = this;
            this.aad[var3].setBounds(557, 425, 11, 14);
         } else if (var3 == 4) {
            var6 = this;
            this.aad[var3].setBounds(599, 425, 11, 14);
         } else if (var3 == 5) {
            var6 = this;
            this.aad[var3].setBounds(641, 425, 11, 14);
         } else if (var3 == 6) {
            var6 = this;
            this.aad[var3].setBounds(164, 110, 95, 60);
         } else if (var3 == 7) {
            var6 = this;
            this.aad[var3].setBounds(537, 110, 95, 60);
         } else if (var3 == 8) {
            var6 = this;
            this.aad[var3].setBounds(198, 123, 33, 33);
         } else if (var3 == 9) {
            var6 = this;
            this.aad[var3].setBounds(570, 123, 33, 33);
         } else if (var3 == 10) {
            var6 = this;
            this.aad[var3].setBounds(343, 445, 33, 33);
         } else if (var3 == 11) {
            var6 = this;
            this.aad[var3].setBounds(420, 445, 33, 33);
         } else {
            if (var3 == 12) {
               this.aad[var3].setBounds(382, 384, 33, 33);
            }

            var6 = this;
         }

         var6.add(this.aad[var3--]);
      }

      this.aaf = new ArrayList<>();
   }

   public void h() {
      this.g(0);
   }

   public int dx() {
      return this.ah;
   }
}
