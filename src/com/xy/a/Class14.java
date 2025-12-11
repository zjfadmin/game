package com.xy.a;

import com.xy.bean.LoginResult;
import com.xy.entity.RoleSummoning;
import com.xy.formula.PetProperty;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

class Class14 extends JComponent implements MouseListener, MouseMotionListener {
   private int gs;
   private int gt;
   private int gu;
   private int gv;
   private int gw;
   // $VF: synthetic field
   final Class74 gx;
   private int gy;
   private int gz;
   private int z;
   private boolean bv;
   private int cn;
   private int ha;
   private int cb;
   private int ae;
   private int ds;
   private int eg;
   private int ah;

   public void fk(int var1, double var2) {
      int var4;
      int var10000;
      if ((var4 = (int)(var2 * this.cn)) < 0) {
         var4 = 0;
         var10000 = var1;
      } else {
         if (var4 > this.cn) {
            var4 = this.cn;
         }

         var10000 = var1;
      }

      if (var10000 == 0) {
         this.ha = var4;
      } else if (var1 == 1) {
         this.gu = var4;
      } else {
         if (var1 == 2) {
            this.eg = var4;
         }
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.bv = Boolean.TRUE;
      int var2 = this.ah == 0 ? 17 : 15;
      this.ae = var1.getY() / var2;
      this.t();
   }

   public Class14(Class74 var1, int var2, int var3) {
      this.gx = var1;
      this.ah = var3;
      this.cn = var2;
      this.gz = this.gv = this.ds = 0;
      Class14 var10000;
      if (var3 == 0) {
         this.gy = this.gt = this.cb = 12;
         var10000 = this;
         this.gs = 17;
         this.gw = 34;
         this.z = 0;
      } else {
         if (var3 == 1) {
            this.gy = this.gt = this.cb = 12;
            this.gs = 15;
            this.gw = 30;
            this.z = 0;
         }

         var10000 = this;
      }

      var10000.addMouseListener(this);
      this.addMouseMotionListener(this);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.bv = Boolean.FALSE;
      this.ae = -1;
      this.t();
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   protected void paintComponent(Graphics var1) {
      if (this.ha > 0) {
         var1.drawImage(com.xy.w.Class16.h, this.gz, this.gs, this.ha, this.gy, null);
      }

      if (this.gu > 0) {
         var1.drawImage(com.xy.w.Class16.b, this.gv, this.gw, this.gu, this.gt, null);
      }

      if (this.eg > 0) {
         var1.drawImage(com.xy.w.Class16.g, this.ds, this.z, this.eg, this.cb, null);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      int var2 = this.ah == 0 ? 17 : 15;
      if (this.ae != var1.getY() / var2) {
         this.ae = var1.getY() / var2;
         this.t();
      }
   }

   public void t() {
      if (this.ae >= 0 && this.ae <= 2) {
         Class48 var1 = (Class48)this.gx.zc().j(46);
         if (this.ah == 0) {
            LoginResult var2 = this.gx.yx().getLoginResult();
            if (this.ae == 0) {
               int var7 = com.xy.v.Class4.q(var2.getGrade());
               int var4 = com.xy.v.Class4.s(var2.getGrade());
               if (var7 <= 3) {
                  String var34 = "\u0000x\u0015\b纊骬l\u001ae";
                  StringBuilder var15 = new StringBuilder("EXP(经验): ").append(var2.getExperience().toString());
                  String var24 = "l";
                  var1.bq(var15.append("/").append(this.gx.yt().ag(var7, var4)).toString());
                  return;
               }

               String var33 = "\u0000x\u0015\b纊骬l\u001ae";
               var1.bq("EXP(经验): " + var2.getExperience().toString());
               return;
            }

            if (this.ae == 1) {
               com.xy.d.Class11 var6 = this.gx.afx.getBattleScene() != null
                  ? this.gx.afx.getBattleScene().getBattleUnit(0, this.gx.afx.roleData.getRoleId())
                  : null;
               if (var6 != null) {
                  String var32 = "\u0018\u0013x汗蠐jjc";
                  StringBuilder var14 = new StringBuilder("HP(气血): ").append(var6.cg().getHp_Current());
                  String var23 = "j";
                  var1.bq(var14.append("/").append(var6.cg().getHp_Total()).toString());
                  return;
               }

               String var31 = "\u0018\u0013x汗蠐jjc";
               StringBuilder var13 = new StringBuilder("HP(气血): ").append(var2.getHp().intValue());
               String var22 = "j";
               var1.bq(var13.append("/").append(this.gx.yx().getRoleProperty().getHp()).toString());
               return;
            }

            if (this.ae == 2) {
               com.xy.d.Class11 var3 = this.gx.afx.getBattleScene() != null
                  ? this.gx.afx.getBattleScene().getBattleUnit(0, this.gx.afx.roleData.getRoleId())
                  : null;
               if (var3 != null) {
                  String var30 = "\u001d\u0013x沖勋jjc";
                  StringBuilder var12 = new StringBuilder("MP(法力): ").append(var3.cg().getMp_Current());
                  String var21 = "j";
                  var1.bq(var12.append("/").append(var3.cg().getMp_Total()).toString());
                  return;
               }

               String var10003 = "\u001d\u0013x沖勋jjc";
               StringBuilder var10001 = new StringBuilder("MP(法力): ").append(var2.getMp().intValue());
               String var10002 = "j";
               var1.bq(var10001.append("/").append(this.gx.yx().getRoleProperty().getMp()).toString());
               return;
            }
         } else if (this.ah == 1) {
            RoleSummoning var5;
            if ((var5 = this.gx.yx().getChosePet()) == null) {
               return;
            }

            if (this.ae == 0) {
               String var39 = "\u0006\b\u0013x續髜jjc";
               StringBuilder var20 = new StringBuilder("EXP(经验): ").append(var5.getExp().toString());
               String var29 = "j";
               var1.bq(var20.append("/").append(this.gx.yt().m(var5.getTurnRount(), com.xy.v.Class4.f(var5.getGrade()))).toString());
               return;
            }

            if (this.ae == 1) {
               com.xy.d.Class11 var9 = this.gx.afx.getBattleScene() != null ? this.gx.afx.getBattleScene().getBattleUnit(1, var5.getSid().longValue()) : null;
               if (var9 != null) {
                  String var38 = "\u0018\u0013x汗蠐jjc";
                  StringBuilder var19 = new StringBuilder("HP(气血): ").append(var9.cg().getHp_Current());
                  String var28 = "j";
                  var1.bq(var19.append("/").append(var9.cg().getHp_Total()).toString());
                  return;
               }

               int[] var11 = PetProperty.getPetHMASp(var5, this.gx.yx());
               String var37 = "\u0018\u0013x汗蠐jjc";
               StringBuilder var18 = new StringBuilder("HP(气血): ").append(var5.getBasishp(var11[0]));
               String var27 = "j";
               var1.bq(var18.append("/").append(var11[0]).toString());
               return;
            }

            if (this.ae == 2) {
               com.xy.d.Class11 var8 = this.gx.afx.getBattleScene() != null ? this.gx.afx.getBattleScene().getBattleUnit(1, var5.getSid().longValue()) : null;
               if (var8 != null) {
                  String var36 = "\u001d\u0013x沖勋jjc";
                  StringBuilder var17 = new StringBuilder("MP(法力): ").append(var8.cg().getMp_Current());
                  String var26 = "j";
                  var1.bq(var17.append("/").append(var8.cg().getMp_Total()).toString());
                  return;
               }

               int[] var10 = PetProperty.getPetHMASp(var5, this.gx.yx());
               String var35 = "\u001d\u0013x沖勋jjc";
               StringBuilder var16 = new StringBuilder("MP(法力): ").append(var5.getBasismp(var10[1]));
               String var25 = "j";
               var1.bq(var16.append("/").append(var10[1]).toString());
            }
         }
      } else {
         this.gx.zc().f(46);
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = this.ah == 0 ? 17 : 15;
      if (this.gx.ze().getBattleScene() == null && var1.getY() % var2 <= 12) {
         int var3;
         if ((var3 = var1.getY() / var2 - 1) >= 0 && var3 < 2) {
            com.xy.q.Class9.ae(var3 + (this.ah == 0 ? 0 : 2), this.gx.yx());
         }
      }
   }
}
