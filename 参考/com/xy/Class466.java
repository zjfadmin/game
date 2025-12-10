package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseValue;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Skill;
import com.xy.readbean.TYC;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Class466 extends Class345 {
   private int em;
   private Class643 vs;
   private String vt;
   private Class643 vu;
   private Class643[] vv;
   private Class643 vw;
   private Image ll;
   private Image vx;
   private Class643 vy;
   private JLabel at;
   private String nc;
   private List<null> im;
   private BigDecimal ne;
   private Image fq;
   private Image rv;

   public static String nj(int var0, double var1, double var3, int var5) {
      if (var0 == 5 >> 2) {
         var1 += var3 * (double)var5;
      } else if (var0 == 5 >> 1) {
         var1 = var1 / 6.0D * 5.0D + var3 / 3.0D * 10.0D * (double)var5;
      } else if (var0 == --3) {
         var1 = var1 / 10.0D * 9.0D + var3 / 10.0D * 3.0D * (double)var5;
      } else if (var0 == --4) {
         var1 = (var1 + var3 * (double)var5) * 2.5D;
      } else if (var0 == --5) {
         var1 = var3 / 3.0D * 10.0D * (double)var5;
      } else if (var0 == (7 & 126)) {
         var1 = (var1 + var3 * (double)var5) * 10.0D;
      } else if (var0 == (39 & 95)) {
         var1 = var1 * 10.0D + var3 * 15.0D * (double)var5;
      } else if (var0 == (11 & 125)) {
         var1 = (double)((114 & 63) + (95 & 42) * var5);
      } else if (var0 == (58 & 79)) {
         var1 = 0.1D + 0.035D * (double)var5;
      } else if (var0 == (123 & 15)) {
         var1 = (double)((62 & 85) + (3 >> 1) * var5);
      } else if (var0 == (111 & 28)) {
         var1 = (double)((59 & 108) + --1 * var5);
      } else if (var0 == (63 & 77)) {
         var1 = 50.0D - 1.2D * (double)var5;
      } else if (var0 == (78 & 63)) {
         var1 = 20.0D - 0.5D * (double)var5;
      } else if (var0 == (95 & 47)) {
         var1 = 2.5D + 0.08D * (double)var5;
      } else if (var0 == (60 & 83)) {
         var1 = 28.0D + 2.4D * (double)var5;
      } else if (var0 == (113 & 31)) {
         var1 = (double)((74 & 63) + (74 & 63) * var5);
      } else if (var0 == 18) {
         var1 = (double)(20 + 10 * var5);
      } else if (var0 == 19) {
         var1 = 11.0D + 1.3D * (double)var5;
      } else if (var0 == 20) {
         var1 = 28.0D + 2.4D * (double)var5;
      } else if (var0 == 21) {
         var1 = 3.8D + 0.54D * (double)var5;
      } else if (var0 == 22) {
         var1 = 11.0D + 0.31D * (double)var5;
      } else if (var0 == 23) {
         var1 = 97.5D + 2.75D * (double)var5;
      } else if (var0 == 24) {
         var1 = 13.5D + 0.75D * (double)var5;
      } else if (var0 == 25) {
         var1 = 5.5D + 0.65D * (double)var5;
      } else if (var0 == 26) {
         var1 = 3.0D + 0.4D * (double)var5;
      } else if (var0 == 27) {
         var1 = (double)(15 + --5 * var5);
      } else if (var0 == 28) {
         var1 = var1 + var3 * (double)var5 + 2.0D;
      } else if (var0 == 29) {
         var1 = var1 + var3 * (double)var5 + 4.0D;
      } else if (var0 == 30) {
         var1 = (double)Math.min(var5, --3);
      } else if (var0 == 31) {
         var1 = (double)(9000 + 2500 * var5);
      } else if (var0 == 32) {
         var1 = (double)(4500 + 1250 * var5);
      } else if (var0 == 33) {
         var1 = (double)('鱀' + 2000 * var5);
      } else if (var0 == 34) {
         var1 = (double)('\uea60' + 8000 * var5);
      } else {
         var1 += var3 * (double)var5;
      }

      return "#R" + Class509.d(var1) + "#G";
   }

   public void dg() {
      RoleSummoning var10000 = this.gj();
      int var6 = var10000.getTurnRount();
      int var8 = Class224.p(var10000.getGrade());
      int var10 = var10000.getLxGZ();
      int var4 = 2 & 5;

      <undefinedtype> var1;
      int var5;
      int var14;
      for(var14 = var5 = 3 & 4; var14 < this.im.size(); var14 = var5) {
         if ((var1 = (<undefinedtype>)this.im.get(var5)).isVisible()) {
            var4 += var1.br;
         }

         ++var5;
      }

      for(var14 = var5 = 2 & 5; var14 < this.im.size(); var14 = var5) {
         if ((var1 = (<undefinedtype>)this.im.get(var5)).isVisible()) {
            var1.po = (boolean)(2 & 5);
            <undefinedtype> var15;
            if (var1.avh.getList() == null) {
               var1.lc = (boolean)(--1);
               var15 = var1;
            } else {
               var1.lc = false;
               var15 = var1;
            }

            int var7;
            var14 = var7 = var15.avh.getList().size() - (5 >> 2);

            label99:
            while(true) {
               int var10001;
               if (var14 < 0) {
                  var10001 = 3 >> 1;
                  var1.po = (boolean)(3 & 4);
                  var1.lc = (boolean)var10001;
                  break;
               }

               TYC var2;
               int var3;
               if ((var2 = (TYC)var1.avh.getList().get(var7)).getType() == 5 >> 1) {
                  int[] var9 = var2.getVs();
                  var3 = Math.min(var1.br, var9.length - (3 >> 1));
                  if (var9[var3] > var4 - var1.br) {
                     var1.lc = (boolean)(3 >> 2);
                     break;
                  }
               } else if (var2.getType() == --4) {
                  if (var6 < var2.getV1() || var6 == var2.getV1() && var8 < var2.getV2()) {
                     var1.lc = (boolean)(3 ^ 3);
                     break;
                  }
               } else {
                  int var13;
                  if (var2.getType() == --5) {
                     for(var14 = var13 = 5 >> 3; var14 < var2.getVs().length; var14 = var13) {
                        <undefinedtype> var12;
                        if ((var12 = this.nt(var2.getVs()[var13])) != null && var12.br > 0 && var12.gc != var1.gc) {
                           var1.lc = (boolean)(3 ^ 3);
                           break label99;
                        }

                        ++var13;
                     }
                  } else if (var2.getType() == (111 & 22)) {
                     var13 = var2.getV1();

                     for(var14 = var3 = 5 >> 3; var14 < var2.getVs().length; var14 = var3) {
                        <undefinedtype> var11;
                        if ((var11 = this.nt(var2.getVs()[var3])) != null && var11.br > 0) {
                           --var13;
                        }

                        ++var3;
                     }

                     if (var13 <= 0 && var1.br <= 0) {
                        var1.lc = (boolean)(3 & 4);
                        break;
                     }
                  } else if (var2.getType() == (39 & 95) && var10 < var2.getV1()) {
                     var10001 = --1;
                     var1.lc = (boolean)(3 ^ 3);
                     var1.po = (boolean)var10001;
                     break;
                  }
               }

               --var7;
               var14 = var7;
            }
         }

         ++var5;
      }

      this.at.setText(String.valueOf(this.em - var4));
   }

   public void as(int var1) {
      int var10000;
      int var2;
      for(var10000 = var2 = 5 >> 3; var10000 < this.vv.length; var10000 = var2) {
         this.vv[var2].setVisible((boolean)(var1 == 0 ? 3 & 5 : 0));
         ++var2;
      }

      this.vs.setVisible((boolean)(var1 == (3 & 5) ? 2 ^ 3 : 0));
      this.vy.setVisible((boolean)(var1 == 5 >> 2 ? 3 & 5 : 0));

      for(var10000 = var2 = 3 >> 2; var10000 < this.im.size(); var10000 = var2) {
         <undefinedtype> var3 = (<undefinedtype>)this.im.get(var2);
         if (var1 == (2 ^ 3)) {
            var3.setVisible((boolean)(var3.gc != 0 ? 3 & 5 : 0));
         } else {
            var3.setVisible((boolean)(3 ^ 3));
         }

         ++var2;
      }

   }

   public String nk(Skill var1, Object var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("#cffffff【等级】\t");
      var3.append(var2.br);
      var3.append("/");
      var3.append(var2.cy);
      var3.append("#r【技能类别】\t");
      var3.append("被动");
      var3.append("#r#G");
      var3.append(nm(var1, var2.br));
      var3.append("#r#W学习条件");
      int var8 = 5 >> 3;

      for(int var10000 = var8; var10000 < var2.avh.getList().size(); var10000 = var8) {
         TYC var4;
         int var10;
         if ((var4 = (TYC)var2.avh.getList().get(var8)).getType() == (1 ^ 3)) {
            int[] var9 = var4.getVs();
            var10 = Math.min(var2.br, var9.length - (3 & 5));
            var3.append("#r#Y需已分配点数#R" + var9[var10] + "#Y点");
         } else if (var4.getType() == --4) {
            var3.append("#r#Y召唤兽要达到" + (var4.getV1() == --4 ? "点化" : var4.getV1() + "转") + var4.getV2() + "级");
         } else {
            int var5;
            if (var4.getType() == --5) {
               var3.append("#r与#R");
               var5 = 3 ^ 3;
               var10 = 5 >> 3;

               for(var10000 = var10; var10000 < var4.getVs().length; var10000 = var10) {
                  Skill var7;
                  if (var4.getVs()[var10] != var2.gc && (var7 = this.vc().bf(String.valueOf(var4.getVs()[var10]))) != null) {
                     if (var5 == 0) {
                        var3.append("、");
                     }

                     var3.append(var7.getSkillname());
                     var5 = 3 >> 1;
                  }

                  ++var10;
               }

               var3.append("#Y互斥");
            } else if (var4.getType() == (6 & 127)) {
               var3.append("#r可同时修炼#R");
               var5 = 3 ^ 3;

               for(var10000 = var5; var10000 < var4.getVs().length; var10000 = var5) {
                  Skill var6;
                  if ((var6 = this.vc().bf(String.valueOf(var4.getVs()[var5]))) != null) {
                     if (var5 != 0) {
                        var3.append("、");
                     }

                     var3.append(var6.getSkillname());
                  }

                  ++var5;
               }

               var3.append("#Y中的#R");
               var3.append(var4.getV1());
               var3.append("#Y种技能");
            }
         }

         ++var8;
      }

      return var3.toString();
   }

   public static String nm(Skill var0, int var1) {
      String var7 = var0.getRemark();
      double var3 = Double.parseDouble(var0.getValue());
      double var5 = Double.parseDouble(var0.getGrow());

      int var2;
      for(int var10000 = var2 = 3 & 5; var10000 <= 34; var10000 = var2) {
         String var8 = MsgUntil.b(var2);
         if (var2 > (62 & 75) && var2 % (62 & 75) == 0) {
            var8 = MsgUntil.b(var2 / (75 & 62)) + "十";
         } else if (var2 > (92 & 55)) {
            var8 = MsgUntil.b(var2 / (90 & 47)) + "十" + MsgUntil.b(var2 % (10 & 127));
         } else if (var2 > (94 & 43)) {
            var8 = "十" + MsgUntil.b(var2 % (14 & 123));
         }

         var8 = "{灵犀" + var8 + "}";
         var7 = var7.replace(var8, nj(var2++, var3, var5, var1));
      }

      return var7;
   }

   public void o() {
      Class643[] var10001 = new Class643[--3];
      boolean var10003 = true;
      this.vv = var10001;

      int var1;
      for(int var10000 = var1 = 3 ^ 3; var10000 < this.vv.length; var10000 = var1) {
         this.vv[var1] = new Class643("sc/b/B" + ((23407 & 9723) + var1) + ".png", 4 ^ 5, (95 & 127) + var1, this);
         this.vv[var1].setBounds((52 & 127) + (22974 & 9975) * var1, 62 & 77, 21487 & 11451, 28539 & 4574);
         this.add(this.vv[var1++]);
      }

   }

   public RoleSummoning gj() {
      return this.vd().getPet(this.ne);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.d();
      }

   }

   public void y(int var1) {
      RoleSummoning var2;
      if ((var2 = this.gj()) != null) {
         if (var1 == (95 & 127)) {
            this.f("物理系");
         } else if (var1 == (105 & 118)) {
            this.f("法术系");
         } else if (var1 == (125 & 99)) {
            this.f("辅助系");
         } else if (var1 == (91 & 127)) {
            ((Class54)this.ve().e(127 & 116)).bk(var2.getSid());
         } else if (var1 == (94 & 125)) {
            int var7 = var2.getLxValue();
            int var8 = var2.getLxGZ();
            if (var7 != 0) {
               long var10000;
               int var10001;
               if (this.uw().n(--2, 108 & 31)) {
                  var10000 = 1000000L;
                  var10001 = var8;
               } else {
                  var10000 = 10000000L;
                  var10001 = var8;
               }

               long var5 = var10000 * (long)var10001;
               this.aej.aal(new ConfirmBean(109 & 31, "LXXD|" + var2.getSid(), "#Y你确定要花费#R" + var5 / 10000L + "W#Y大话币重洗灵犀技能"));
            }
         } else {
            String var3;
            if (var1 == (95 & 125)) {
               if ((var3 = var2.getLx()) != null && var3.indexOf("系") != -4 >> 2) {
                  this.aej.f("需要洗点后才能重新选择天赋系");
               } else {
                  this.f("");
               }
            } else {
               if (var1 == (95 & 126)) {
                  if ((var3 = this.nn()) == null) {
                     this.aej.f("请修改点数");
                     return;
                  }

                  String var4 = Agreement.getSendTextAES("userpet", "LXJN|" + var2.getSid() + "|" + var3);
                  this.uw().d(var4);
               }

            }
         }
      }
   }

   public synchronized void p() {
      Class603 var4;
      List var2 = (var4 = this.vc()).l(this.vt);
      String[] var10000;
      if (this.nc != null) {
         var10000 = this.nc.split("=");
      } else {
         var10000 = new String[0];
         boolean var10002 = true;
      }

      String[] var3 = var10000;
      if (var3.length > --2 && !var3[5 >> 1].equals(this.vt)) {
         this.ve().n(119 & 123);
      } else {
         int var1;
         int var11;
         for(var11 = var1 = 0; var11 < this.im.size(); var11 = var1) {
            <undefinedtype> var5 = (<undefinedtype>)this.im.get(var1);
            ++var1;
            var5.akl(this.ns(var2, var5.ay));
         }

         for(var11 = var1 = --3; var11 < var3.length; var11 = var1) {
            Skill var8;
            int var9;
            if ((var9 = var3[var1].indexOf("-")) != -4 >> 2 && (var8 = var4.bf(var3[var1].substring(3 >> 2, var9))) != null) {
               int var6 = Integer.parseInt(var8.getSkillid());
               int var7 = Integer.parseInt(var3[var1].substring(var9 + --1));
               <undefinedtype> var10;
               if ((var10 = this.nt(var6)) != null) {
                  var10.gv = var7;
                  var10.br = var7;
                  var10.cy = Integer.parseInt(var8.getSkilllevel());
               }
            }

            ++var1;
         }

         this.dg();
      }
   }

   public String nn() {
      int var4 = 3 ^ 3;
      StringBuffer var2;
      (var2 = new StringBuffer()).append(this.vt);
      int var3 = 5 >> 3;

      for(int var10000 = var3; var10000 < this.im.size(); var10000 = var3) {
         <undefinedtype> var1;
         if ((var1 = (<undefinedtype>)this.im.get(var3)).gc != 0 && var1.br > 0) {
            if (var4 == 0 && var1.br > var1.gv) {
               var4 = 5 >> 2;
            }

            var2.append("=");
            var2.append(var1.gc);
            var2.append("-");
            var2.append(var1.br);
         }

         ++var3;
      }

      if (var4 != 0) {
         return var2.toString();
      } else {
         return null;
      }
   }

   public void v(RoleSummoning var1) {
      this.ne = var1.getSid();
      this.nc = var1.getLx();
      Class466 var10000;
      if (this.nc == null) {
         this.f("");
         var10000 = this;
      } else if (this.nc.indexOf("物理系") != -4 >> 2) {
         var10000 = this;
         this.f("物理系");
      } else if (this.nc.indexOf("法术系") != -4 >> 2) {
         var10000 = this;
         this.f("法术系");
      } else if (this.nc.indexOf("辅助系") != -4 >> 2) {
         var10000 = this;
         this.f("辅助系");
      } else {
         var10000 = this;
         this.f("");
      }

      var10000.ve().a(this.ae());
   }

   public Class466(GameView var1) {
      int var10006 = -4 >> 2;
      super(115 & 127, 1 ^ 3, Class345.aef, var1);
      this.fq = Class511.a("sc/b/S271.png");
      this.vx = Class511.a("sc/b/S39.png");
      this.ll = Class511.a("sc/b/蒙版w34,h34.png");
      this.rv = Class511.a("sc/b/78_png.xy2uiimg.btn_plock.png");
      this.va(var10006, 3 >> 2, 9175 & 24236, 30709 & 2463, Class345.aeo);
      this.at = new JLabel("0");
      this.at.setBounds(29093 & 3806, 24055 & 9080, 124 & 43, 56 & 87);
      this.at.setFont(Class681.cd);
      this.at.setForeground(Color.white);
      this.add(this.at);
      this.vu = new Class643("sc/e/7.png", 3 & 5, 127 & 91, Class681.ak, Class681.c, "兑换", this);
      this.vw = new Class643("sc/e/7.png", 3 & 5, 127 & 92, Class681.ak, Class681.c, "洗点", this);
      this.vu.setBounds(2495 & 30462, 893 & 32239, 84 & 111, 30 & 123);
      this.vw.setBounds(8495 & 24537, 14701 & 18431, 79 & 116, 26);
      this.add(this.vu);
      this.add(this.vw);
      this.o();
      this.s();
   }

   public void f(String var1) {
      int var10004;
      if ((this.vt = var1).equals("物理系")) {
         var10004 = 3 & 5;
         this.fx("sc/b/S268.png");
         this.as(var10004);
         this.em = BaseValue.getLxLvl(this.gj().getLxValue());
         this.p();
      } else if (var1.equals("法术系")) {
         var10004 = 2 ^ 3;
         this.fx("sc/b/S269.png");
         this.as(var10004);
         this.em = BaseValue.getLxLvl(this.gj().getLxValue());
         this.p();
      } else if (var1.equals("辅助系")) {
         this.fx("sc/b/S270.png");
         this.as(5 >> 2);
         this.em = BaseValue.getLxLvl(this.gj().getLxValue());
         this.p();
      } else {
         this.fx("sc/b/S267.png");
         this.as(5 >> 3);
      }
   }

   public TYC ns(List<TYC> var1, int var2) {
      int var3;
      for(int var10000 = var3 = 5 >> 3; var10000 < var1.size(); var10000 = var3) {
         TYC var4;
         if ((var4 = (TYC)var1.get(var3)).getV1() == var2) {
            return var4;
         }

         ++var3;
      }

      return null;
   }

   public void s() {
      this.vs = new Class643("sc/b/B366.png", --1, 95 & 125, this);
      this.vy = new Class643("sc/e/26.png", 5 >> 2, 127 & 94, Class681.ak, Class681.c, "确定加点", this);
      this.vs.setBounds(2 & 5, 28478 & 4599, 127 & 55, 63 & 107);
      this.vy.setBounds(27134 & 6143, 10607 & 22525, 125 & 94, 63 & 90);
      this.add(this.vs);
      this.add(this.vy);
      int var10002 = 3 & 4;
      this.im = new ArrayList();
      int var1 = var10002;

      for(int var10000 = var1; var10000 < 24; var10000 = var1) {
         MouseListener var2 = null;
         Class466 var3;
         if (var1 < (55 & 78)) {
            var2 = new MouseListener((107 & 31) + var1) {
               private Image kx;
               private int br;
               private int gv;
               private int gc;
               private boolean hg;
               private boolean po;
               private int ay;
               private TYC avh;
               private boolean lc;
               private int cy;

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  this.hg = Boolean.TRUE;
               }

               public void mouseExited(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  Class466.this.ve().n(111 & 62);
               }

               protected void paintComponent(Graphics var1) {
                  if (this.gc != 0 && this.kx != null) {
                     var1.drawImage(Class466.this.fq, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                     <undefinedtype> var10000;
                     if (this.hg) {
                        var1.drawImage(this.kx, --5, --5, this.getWidth() - (78 & 57), this.getHeight() - (124 & 11), this);
                        var10000 = this;
                     } else {
                        var1.drawImage(this.kx, --4, --4, this.getWidth() - (120 & 15), this.getHeight() - (10 & 125), this);
                        var10000 = this;
                     }

                     if (var10000.lc) {
                        var1.drawImage(Class466.this.vx, 95 & 57, 55 & 107, 95 & 57, 15 & 127, this);
                        var1.setColor(Color.white);
                        var1.setFont(Class681.bm);
                        var1.drawString(this.br + "/" + this.cy, 31 & 123, 119 & 56);
                        var10000 = this;
                     } else {
                        var1.drawImage(Class466.this.ll, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                        var10000 = this;
                     }

                     if (var10000.po) {
                        var1.drawImage(Class466.this.rv, 122 & 21, 94 & 47, 122 & 21, 123 & 22, this);
                     }

                  }
               }

               public void akl(TYC var1) {
                  this.gc = var1 != null ? var1.getV2() : 0;
                  int var10002 = 2 & 5;
                  int var10004 = 3 ^ 3;
                  int var10006 = 3 ^ 3;
                  this.avh = var1;
                  this.gv = var10006;
                  this.br = var10004;
                  this.cy = var10002;
                  if (this.gc == 0) {
                     this.kx = null;
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     this.kx = Class222.g(String.valueOf(this.gc));
                     this.setVisible((boolean)(--1));
                     Skill var2;
                     if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                        this.cy = Integer.parseInt(var2.getSkilllevel());
                     }

                  }
               }

               public void mouseReleased(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  if (this.lc) {
                     if (!Class466.this.at.getText().equals("0")) {
                        int var2;
                        if ((var2 = this.br + (var1.isMetaDown() ? -4 >> 2 : 1)) >= this.gv) {
                           if (var2 <= this.cy) {
                              this.br = var2;
                              Class466.this.dg();
                           }
                        }
                     }
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  Skill var2;
                  if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                     ((Class270)Class466.this.ve().e(62 & 111)).rl(var2.getSkillname(), Class466.this.nk(var2, this));
                  }
               }

               public {
                  int var10001 = 127 & 90;
                  int var10005 = 3 >> 2;
                  this.ay = var2;
                  this.setVisible((boolean)var10005);
                  this.addMouseListener(this);
                  this.setBounds(var10001 + (var2 / (63 & 74) - (3 & 5)) * (111 & 94), (126 & 31) + (var2 % (15 & 122) - (2 ^ 3)) * (127 & 55), 54 & 123, 54 & 123);
               }
            };
            var3 = this;
         } else if (var1 < (78 & 59)) {
            var2 = new MouseListener((95 & 54) + var1 - (54 & 79)) {
               private Image kx;
               private int br;
               private int gv;
               private int gc;
               private boolean hg;
               private boolean po;
               private int ay;
               private TYC avh;
               private boolean lc;
               private int cy;

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  this.hg = Boolean.TRUE;
               }

               public void mouseExited(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  Class466.this.ve().n(111 & 62);
               }

               protected void paintComponent(Graphics var1) {
                  if (this.gc != 0 && this.kx != null) {
                     var1.drawImage(Class466.this.fq, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                     <undefinedtype> var10000;
                     if (this.hg) {
                        var1.drawImage(this.kx, --5, --5, this.getWidth() - (78 & 57), this.getHeight() - (124 & 11), this);
                        var10000 = this;
                     } else {
                        var1.drawImage(this.kx, --4, --4, this.getWidth() - (120 & 15), this.getHeight() - (10 & 125), this);
                        var10000 = this;
                     }

                     if (var10000.lc) {
                        var1.drawImage(Class466.this.vx, 95 & 57, 55 & 107, 95 & 57, 15 & 127, this);
                        var1.setColor(Color.white);
                        var1.setFont(Class681.bm);
                        var1.drawString(this.br + "/" + this.cy, 31 & 123, 119 & 56);
                        var10000 = this;
                     } else {
                        var1.drawImage(Class466.this.ll, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                        var10000 = this;
                     }

                     if (var10000.po) {
                        var1.drawImage(Class466.this.rv, 122 & 21, 94 & 47, 122 & 21, 123 & 22, this);
                     }

                  }
               }

               public void akl(TYC var1) {
                  this.gc = var1 != null ? var1.getV2() : 0;
                  int var10002 = 2 & 5;
                  int var10004 = 3 ^ 3;
                  int var10006 = 3 ^ 3;
                  this.avh = var1;
                  this.gv = var10006;
                  this.br = var10004;
                  this.cy = var10002;
                  if (this.gc == 0) {
                     this.kx = null;
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     this.kx = Class222.g(String.valueOf(this.gc));
                     this.setVisible((boolean)(--1));
                     Skill var2;
                     if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                        this.cy = Integer.parseInt(var2.getSkilllevel());
                     }

                  }
               }

               public void mouseReleased(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  if (this.lc) {
                     if (!Class466.this.at.getText().equals("0")) {
                        int var2;
                        if ((var2 = this.br + (var1.isMetaDown() ? -4 >> 2 : 1)) >= this.gv) {
                           if (var2 <= this.cy) {
                              this.br = var2;
                              Class466.this.dg();
                           }
                        }
                     }
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  Skill var2;
                  if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                     ((Class270)Class466.this.ve().e(62 & 111)).rl(var2.getSkillname(), Class466.this.nk(var2, this));
                  }
               }

               public {
                  int var10001 = 127 & 90;
                  int var10005 = 3 >> 2;
                  this.ay = var2;
                  this.setVisible((boolean)var10005);
                  this.addMouseListener(this);
                  this.setBounds(var10001 + (var2 / (63 & 74) - (3 & 5)) * (111 & 94), (126 & 31) + (var2 % (15 & 122) - (2 ^ 3)) * (127 & 55), 54 & 123, 54 & 123);
               }
            };
            var3 = this;
         } else if (var1 < (93 & 46)) {
            var2 = new MouseListener((105 & 55) + var1 - 10) {
               private Image kx;
               private int br;
               private int gv;
               private int gc;
               private boolean hg;
               private boolean po;
               private int ay;
               private TYC avh;
               private boolean lc;
               private int cy;

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  this.hg = Boolean.TRUE;
               }

               public void mouseExited(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  Class466.this.ve().n(111 & 62);
               }

               protected void paintComponent(Graphics var1) {
                  if (this.gc != 0 && this.kx != null) {
                     var1.drawImage(Class466.this.fq, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                     <undefinedtype> var10000;
                     if (this.hg) {
                        var1.drawImage(this.kx, --5, --5, this.getWidth() - (78 & 57), this.getHeight() - (124 & 11), this);
                        var10000 = this;
                     } else {
                        var1.drawImage(this.kx, --4, --4, this.getWidth() - (120 & 15), this.getHeight() - (10 & 125), this);
                        var10000 = this;
                     }

                     if (var10000.lc) {
                        var1.drawImage(Class466.this.vx, 95 & 57, 55 & 107, 95 & 57, 15 & 127, this);
                        var1.setColor(Color.white);
                        var1.setFont(Class681.bm);
                        var1.drawString(this.br + "/" + this.cy, 31 & 123, 119 & 56);
                        var10000 = this;
                     } else {
                        var1.drawImage(Class466.this.ll, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                        var10000 = this;
                     }

                     if (var10000.po) {
                        var1.drawImage(Class466.this.rv, 122 & 21, 94 & 47, 122 & 21, 123 & 22, this);
                     }

                  }
               }

               public void akl(TYC var1) {
                  this.gc = var1 != null ? var1.getV2() : 0;
                  int var10002 = 2 & 5;
                  int var10004 = 3 ^ 3;
                  int var10006 = 3 ^ 3;
                  this.avh = var1;
                  this.gv = var10006;
                  this.br = var10004;
                  this.cy = var10002;
                  if (this.gc == 0) {
                     this.kx = null;
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     this.kx = Class222.g(String.valueOf(this.gc));
                     this.setVisible((boolean)(--1));
                     Skill var2;
                     if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                        this.cy = Integer.parseInt(var2.getSkilllevel());
                     }

                  }
               }

               public void mouseReleased(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  if (this.lc) {
                     if (!Class466.this.at.getText().equals("0")) {
                        int var2;
                        if ((var2 = this.br + (var1.isMetaDown() ? -4 >> 2 : 1)) >= this.gv) {
                           if (var2 <= this.cy) {
                              this.br = var2;
                              Class466.this.dg();
                           }
                        }
                     }
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  Skill var2;
                  if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                     ((Class270)Class466.this.ve().e(62 & 111)).rl(var2.getSkillname(), Class466.this.nk(var2, this));
                  }
               }

               public {
                  int var10001 = 127 & 90;
                  int var10005 = 3 >> 2;
                  this.ay = var2;
                  this.setVisible((boolean)var10005);
                  this.addMouseListener(this);
                  this.setBounds(var10001 + (var2 / (63 & 74) - (3 & 5)) * (111 & 94), (126 & 31) + (var2 % (15 & 122) - (2 ^ 3)) * (127 & 55), 54 & 123, 54 & 123);
               }
            };
            var3 = this;
         } else if (var1 < 14) {
            var2 = new MouseListener(43 + var1 - 12) {
               private Image kx;
               private int br;
               private int gv;
               private int gc;
               private boolean hg;
               private boolean po;
               private int ay;
               private TYC avh;
               private boolean lc;
               private int cy;

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  this.hg = Boolean.TRUE;
               }

               public void mouseExited(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  Class466.this.ve().n(111 & 62);
               }

               protected void paintComponent(Graphics var1) {
                  if (this.gc != 0 && this.kx != null) {
                     var1.drawImage(Class466.this.fq, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                     <undefinedtype> var10000;
                     if (this.hg) {
                        var1.drawImage(this.kx, --5, --5, this.getWidth() - (78 & 57), this.getHeight() - (124 & 11), this);
                        var10000 = this;
                     } else {
                        var1.drawImage(this.kx, --4, --4, this.getWidth() - (120 & 15), this.getHeight() - (10 & 125), this);
                        var10000 = this;
                     }

                     if (var10000.lc) {
                        var1.drawImage(Class466.this.vx, 95 & 57, 55 & 107, 95 & 57, 15 & 127, this);
                        var1.setColor(Color.white);
                        var1.setFont(Class681.bm);
                        var1.drawString(this.br + "/" + this.cy, 31 & 123, 119 & 56);
                        var10000 = this;
                     } else {
                        var1.drawImage(Class466.this.ll, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                        var10000 = this;
                     }

                     if (var10000.po) {
                        var1.drawImage(Class466.this.rv, 122 & 21, 94 & 47, 122 & 21, 123 & 22, this);
                     }

                  }
               }

               public void akl(TYC var1) {
                  this.gc = var1 != null ? var1.getV2() : 0;
                  int var10002 = 2 & 5;
                  int var10004 = 3 ^ 3;
                  int var10006 = 3 ^ 3;
                  this.avh = var1;
                  this.gv = var10006;
                  this.br = var10004;
                  this.cy = var10002;
                  if (this.gc == 0) {
                     this.kx = null;
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     this.kx = Class222.g(String.valueOf(this.gc));
                     this.setVisible((boolean)(--1));
                     Skill var2;
                     if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                        this.cy = Integer.parseInt(var2.getSkilllevel());
                     }

                  }
               }

               public void mouseReleased(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  if (this.lc) {
                     if (!Class466.this.at.getText().equals("0")) {
                        int var2;
                        if ((var2 = this.br + (var1.isMetaDown() ? -4 >> 2 : 1)) >= this.gv) {
                           if (var2 <= this.cy) {
                              this.br = var2;
                              Class466.this.dg();
                           }
                        }
                     }
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  Skill var2;
                  if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                     ((Class270)Class466.this.ve().e(62 & 111)).rl(var2.getSkillname(), Class466.this.nk(var2, this));
                  }
               }

               public {
                  int var10001 = 127 & 90;
                  int var10005 = 3 >> 2;
                  this.ay = var2;
                  this.setVisible((boolean)var10005);
                  this.addMouseListener(this);
                  this.setBounds(var10001 + (var2 / (63 & 74) - (3 & 5)) * (111 & 94), (126 & 31) + (var2 % (15 & 122) - (2 ^ 3)) * (127 & 55), 54 & 123, 54 & 123);
               }
            };
            var3 = this;
         } else if (var1 < 16) {
            var2 = new MouseListener(53 + var1 - 14) {
               private Image kx;
               private int br;
               private int gv;
               private int gc;
               private boolean hg;
               private boolean po;
               private int ay;
               private TYC avh;
               private boolean lc;
               private int cy;

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  this.hg = Boolean.TRUE;
               }

               public void mouseExited(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  Class466.this.ve().n(111 & 62);
               }

               protected void paintComponent(Graphics var1) {
                  if (this.gc != 0 && this.kx != null) {
                     var1.drawImage(Class466.this.fq, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                     <undefinedtype> var10000;
                     if (this.hg) {
                        var1.drawImage(this.kx, --5, --5, this.getWidth() - (78 & 57), this.getHeight() - (124 & 11), this);
                        var10000 = this;
                     } else {
                        var1.drawImage(this.kx, --4, --4, this.getWidth() - (120 & 15), this.getHeight() - (10 & 125), this);
                        var10000 = this;
                     }

                     if (var10000.lc) {
                        var1.drawImage(Class466.this.vx, 95 & 57, 55 & 107, 95 & 57, 15 & 127, this);
                        var1.setColor(Color.white);
                        var1.setFont(Class681.bm);
                        var1.drawString(this.br + "/" + this.cy, 31 & 123, 119 & 56);
                        var10000 = this;
                     } else {
                        var1.drawImage(Class466.this.ll, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                        var10000 = this;
                     }

                     if (var10000.po) {
                        var1.drawImage(Class466.this.rv, 122 & 21, 94 & 47, 122 & 21, 123 & 22, this);
                     }

                  }
               }

               public void akl(TYC var1) {
                  this.gc = var1 != null ? var1.getV2() : 0;
                  int var10002 = 2 & 5;
                  int var10004 = 3 ^ 3;
                  int var10006 = 3 ^ 3;
                  this.avh = var1;
                  this.gv = var10006;
                  this.br = var10004;
                  this.cy = var10002;
                  if (this.gc == 0) {
                     this.kx = null;
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     this.kx = Class222.g(String.valueOf(this.gc));
                     this.setVisible((boolean)(--1));
                     Skill var2;
                     if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                        this.cy = Integer.parseInt(var2.getSkilllevel());
                     }

                  }
               }

               public void mouseReleased(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  if (this.lc) {
                     if (!Class466.this.at.getText().equals("0")) {
                        int var2;
                        if ((var2 = this.br + (var1.isMetaDown() ? -4 >> 2 : 1)) >= this.gv) {
                           if (var2 <= this.cy) {
                              this.br = var2;
                              Class466.this.dg();
                           }
                        }
                     }
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  Skill var2;
                  if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                     ((Class270)Class466.this.ve().e(62 & 111)).rl(var2.getSkillname(), Class466.this.nk(var2, this));
                  }
               }

               public {
                  int var10001 = 127 & 90;
                  int var10005 = 3 >> 2;
                  this.ay = var2;
                  this.setVisible((boolean)var10005);
                  this.addMouseListener(this);
                  this.setBounds(var10001 + (var2 / (63 & 74) - (3 & 5)) * (111 & 94), (126 & 31) + (var2 % (15 & 122) - (2 ^ 3)) * (127 & 55), 54 & 123, 54 & 123);
               }
            };
            var3 = this;
         } else if (var1 < 18) {
            var2 = new MouseListener(63 + var1 - 16) {
               private Image kx;
               private int br;
               private int gv;
               private int gc;
               private boolean hg;
               private boolean po;
               private int ay;
               private TYC avh;
               private boolean lc;
               private int cy;

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  this.hg = Boolean.TRUE;
               }

               public void mouseExited(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  Class466.this.ve().n(111 & 62);
               }

               protected void paintComponent(Graphics var1) {
                  if (this.gc != 0 && this.kx != null) {
                     var1.drawImage(Class466.this.fq, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                     <undefinedtype> var10000;
                     if (this.hg) {
                        var1.drawImage(this.kx, --5, --5, this.getWidth() - (78 & 57), this.getHeight() - (124 & 11), this);
                        var10000 = this;
                     } else {
                        var1.drawImage(this.kx, --4, --4, this.getWidth() - (120 & 15), this.getHeight() - (10 & 125), this);
                        var10000 = this;
                     }

                     if (var10000.lc) {
                        var1.drawImage(Class466.this.vx, 95 & 57, 55 & 107, 95 & 57, 15 & 127, this);
                        var1.setColor(Color.white);
                        var1.setFont(Class681.bm);
                        var1.drawString(this.br + "/" + this.cy, 31 & 123, 119 & 56);
                        var10000 = this;
                     } else {
                        var1.drawImage(Class466.this.ll, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                        var10000 = this;
                     }

                     if (var10000.po) {
                        var1.drawImage(Class466.this.rv, 122 & 21, 94 & 47, 122 & 21, 123 & 22, this);
                     }

                  }
               }

               public void akl(TYC var1) {
                  this.gc = var1 != null ? var1.getV2() : 0;
                  int var10002 = 2 & 5;
                  int var10004 = 3 ^ 3;
                  int var10006 = 3 ^ 3;
                  this.avh = var1;
                  this.gv = var10006;
                  this.br = var10004;
                  this.cy = var10002;
                  if (this.gc == 0) {
                     this.kx = null;
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     this.kx = Class222.g(String.valueOf(this.gc));
                     this.setVisible((boolean)(--1));
                     Skill var2;
                     if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                        this.cy = Integer.parseInt(var2.getSkilllevel());
                     }

                  }
               }

               public void mouseReleased(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  if (this.lc) {
                     if (!Class466.this.at.getText().equals("0")) {
                        int var2;
                        if ((var2 = this.br + (var1.isMetaDown() ? -4 >> 2 : 1)) >= this.gv) {
                           if (var2 <= this.cy) {
                              this.br = var2;
                              Class466.this.dg();
                           }
                        }
                     }
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  Skill var2;
                  if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                     ((Class270)Class466.this.ve().e(62 & 111)).rl(var2.getSkillname(), Class466.this.nk(var2, this));
                  }
               }

               public {
                  int var10001 = 127 & 90;
                  int var10005 = 3 >> 2;
                  this.ay = var2;
                  this.setVisible((boolean)var10005);
                  this.addMouseListener(this);
                  this.setBounds(var10001 + (var2 / (63 & 74) - (3 & 5)) * (111 & 94), (126 & 31) + (var2 % (15 & 122) - (2 ^ 3)) * (127 & 55), 54 & 123, 54 & 123);
               }
            };
            var3 = this;
         } else {
            var2 = new MouseListener(71 + var1 - 18) {
               private Image kx;
               private int br;
               private int gv;
               private int gc;
               private boolean hg;
               private boolean po;
               private int ay;
               private TYC avh;
               private boolean lc;
               private int cy;

               public void mouseClicked(MouseEvent var1) {
               }

               public void mousePressed(MouseEvent var1) {
                  this.hg = Boolean.TRUE;
               }

               public void mouseExited(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  Class466.this.ve().n(111 & 62);
               }

               protected void paintComponent(Graphics var1) {
                  if (this.gc != 0 && this.kx != null) {
                     var1.drawImage(Class466.this.fq, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                     <undefinedtype> var10000;
                     if (this.hg) {
                        var1.drawImage(this.kx, --5, --5, this.getWidth() - (78 & 57), this.getHeight() - (124 & 11), this);
                        var10000 = this;
                     } else {
                        var1.drawImage(this.kx, --4, --4, this.getWidth() - (120 & 15), this.getHeight() - (10 & 125), this);
                        var10000 = this;
                     }

                     if (var10000.lc) {
                        var1.drawImage(Class466.this.vx, 95 & 57, 55 & 107, 95 & 57, 15 & 127, this);
                        var1.setColor(Color.white);
                        var1.setFont(Class681.bm);
                        var1.drawString(this.br + "/" + this.cy, 31 & 123, 119 & 56);
                        var10000 = this;
                     } else {
                        var1.drawImage(Class466.this.ll, 3 ^ 3, 3 ^ 3, this.getWidth(), this.getHeight(), this);
                        var10000 = this;
                     }

                     if (var10000.po) {
                        var1.drawImage(Class466.this.rv, 122 & 21, 94 & 47, 122 & 21, 123 & 22, this);
                     }

                  }
               }

               public void akl(TYC var1) {
                  this.gc = var1 != null ? var1.getV2() : 0;
                  int var10002 = 2 & 5;
                  int var10004 = 3 ^ 3;
                  int var10006 = 3 ^ 3;
                  this.avh = var1;
                  this.gv = var10006;
                  this.br = var10004;
                  this.cy = var10002;
                  if (this.gc == 0) {
                     this.kx = null;
                     this.setVisible((boolean)(3 ^ 3));
                  } else {
                     this.kx = Class222.g(String.valueOf(this.gc));
                     this.setVisible((boolean)(--1));
                     Skill var2;
                     if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                        this.cy = Integer.parseInt(var2.getSkilllevel());
                     }

                  }
               }

               public void mouseReleased(MouseEvent var1) {
                  this.hg = Boolean.FALSE;
                  if (this.lc) {
                     if (!Class466.this.at.getText().equals("0")) {
                        int var2;
                        if ((var2 = this.br + (var1.isMetaDown() ? -4 >> 2 : 1)) >= this.gv) {
                           if (var2 <= this.cy) {
                              this.br = var2;
                              Class466.this.dg();
                           }
                        }
                     }
                  }
               }

               public void mouseEntered(MouseEvent var1) {
                  Skill var2;
                  if ((var2 = Class466.this.vc().bf(String.valueOf(this.gc))) != null) {
                     ((Class270)Class466.this.ve().e(62 & 111)).rl(var2.getSkillname(), Class466.this.nk(var2, this));
                  }
               }

               public {
                  int var10001 = 127 & 90;
                  int var10005 = 3 >> 2;
                  this.ay = var2;
                  this.setVisible((boolean)var10005);
                  this.addMouseListener(this);
                  this.setBounds(var10001 + (var2 / (63 & 74) - (3 & 5)) * (111 & 94), (126 & 31) + (var2 % (15 & 122) - (2 ^ 3)) * (127 & 55), 54 & 123, 54 & 123);
               }
            };
            var3 = this;
         }

         var3.im.add(var2);
         ++var1;
         this.add(var2);
      }

   }

   public synchronized void d() {
      RoleSummoning var1;
      if ((var1 = this.gj()) == null) {
         this.ve().n(127 & 115);
      } else {
         int var2 = BaseValue.getLxLvl(var1.getLxValue());
         this.em = var2;
         if (this.vt != null && !this.vt.equals("")) {
            String var3;
            if ((var3 = var1.getLx()) == null) {
               var3 = "";
            }

            if (!var3.equals(this.nc)) {
               this.nc = var3;
               this.p();
            }
         } else {
            this.at.setText(String.valueOf(var2));
         }
      }
   }

   public <undefinedtype> nt(int var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.im.size(); var10000 = var2) {
         <undefinedtype> var3;
         if ((var3 = (<undefinedtype>)this.im.get(var2)).gc == var1) {
            return var3;
         }

         ++var2;
      }

      return null;
   }
}
