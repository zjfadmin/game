package com.xy;

import com.xy.bean.ConfirmBean;
import com.xy.bean.LoginResult;
import com.xy.entity.Pal;
import com.xy.formula.BaseValue;
import com.xy.formula.PetProperty;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.readbean.AllPal;
import com.xy.readbean.PalData;
import com.xy.readbean.Skill;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class135 extends Class345 {
   public <undefinedtype> agi;
   public <undefinedtype> agj;
   private Class643[] abs;
   private JScrollPane eb;
   private JComponent km;
   public int fk;
   private int ay;
   private JLabel d;
   private Class436[] e;
   private static Image fq;
   public <undefinedtype> lr;

   public void dp(int var1) {
      int var10000 = 3 >> 2;
      this.ay = var1;

      for(var1 = var10000; var10000 < this.abs.length; var10000 = var1) {
         this.abs[var1].setKeep((boolean)(var1 == this.ay ? --1 : 0));
         ++var1;
      }

      this.agi.setVisible((boolean)(this.ay == 0 ? 4 ^ 5 : 0));
      this.lr.setVisible((boolean)(this.ay == --1 ? 2 ^ 3 : 0));
      this.agj.setVisible((boolean)(this.ay == 5 >> 1 ? 2 ^ 3 : 0));
   }

   public void q() {
      this.p();
      Class135 var10000;
      RoleData var1;
      if ((var1 = this.vd()) != null && var1.getChosePal() != null) {
         var10000 = this;
         this.as(var1.getChosePal().getpId());
      } else {
         if (this.km.getComponentCount() != 0) {
            <undefinedtype> var2 = (<undefinedtype>)this.km.getComponent(3 & 4);
            this.as(var2.m);
         }

         var10000 = this;
      }

      var10000.dp(0);
      super.q();
   }

   public synchronized void as(int var1) {
      RoleData var2;
      if ((var2 = this.vd()) != null) {
         this.fk = var1;
         PalData var3 = this.vc().aa(var1);
         Pal var4;
         var2.setChosePalId((var4 = var2.getPal(var1)) != null ? var4.getId() : null);
         this.agi.bw(var4, var3);
         this.lr.bw(var4, var3);
         this.agj.bw(var4, var3);
      }
   }

   public boolean t() {
      this.agi.lx = null;
      return super.t();
   }

   public int wu(BigDecimal var1, String var2) {
      return this.wv(var1, var2 != null && !var2.equals("") ? var2.split("\\|") : null);
   }

   public void y(int var1) {
      int var3;
      String var5;
      int var6;
      Pal var7;
      int var10000;
      if (var1 == (127 & 123)) {
         if (this.agi.xo[3 >> 2].getText().equals("激活")) {
            this.d();
         } else if ((var7 = this.vd().getPal(this.fk)) != null) {
            if (!this.agi.t()) {
               var5 = this.vd().getLoginResult().getPals();
               int var9;
               if ((var9 = this.wu(var7.getId(), var5)) != -4 >> 2) {
                  var3 = 0;

                  for(var10000 = var6 = 3 >> 2; var10000 < 5; var10000 = var6) {
                     if (var9 != var6) {
                        Class643[] var12;
                        int var10001;
                        if (var6 == 0) {
                           var12 = this.agi.xo;
                           var10001 = (5 >> 1) + var3;
                           ++var3;
                           var12[var10001].setText("休息");
                        } else {
                           var12 = this.agi.xo;
                           var10001 = --2 + var3;
                           ++var3;
                           var12[var10001].setText(BaseValue.getPalBtnArrStr(var6 - --1));
                        }
                     }

                     ++var6;
                  }

                  this.agi.ak((boolean)(3 & 5));
               }
            }
         }
      } else if (var1 == (124 & 127)) {
         if ((var7 = this.vd().getPal(this.fk)) == null) {
            this.aej.fw("你还没有激活当前伙伴");
         } else {
            ((Class207)this.ve().e(43 & 92)).aoo(PropertyUtil.getPalQl(var7, this.vd()), 1 ^ 3, var7.getId());
         }
      } else if (var1 >= (125 & 127) && var1 <= (28126 & 4769)) {
         if ((var7 = this.vd().getPal(this.fk)) != null) {
            String[] var4 = (var5 = this.vd().getLoginResult().getPals()) != null && !var5.equals("") ? var5.split("\\|") : null;
            var3 = BaseValue.getPalBtnArrStr(this.agi.xo[(5 >> 1) + var1 - (127 & 125)].getText());
            var6 = 3 & 5;
            int var10 = 3 >> 1;
            StringBuffer var2 = new StringBuffer();
            int var8;
            if (var4 != null) {
               for(var10000 = var8 = 2 & 5; var10000 < var4.length; var10000 = var8) {
                  if (!var4[var8].equals(var7.getId().toString())) {
                     label130: {
                        if (var10++ == var3) {
                           var6 = 3 >> 2;
                           if (var2.length() != 0) {
                              var2.append("|");
                           }

                           var2.append(var7.getId());
                           if (var4.length == --4) {
                              break label130;
                           }
                        }

                        if (var2.length() != 0) {
                           var2.append("|");
                        }

                        var2.append(var4[var8]);
                     }
                  }

                  ++var8;
               }
            }

            if (var6 != 0 && var3 > 0) {
               if (var2.length() != 0) {
                  var2.append("|");
               }

               var2.append(var7.getId());
            }

            this.vd().getLoginResult().setPals(var2.toString());
            String var11 = Agreement.getSendTextAES("userpal", "P" + var7.getId() + "|" + (var3 == 0 ? -4 >> 2 : var3 - (3 >> 1)));
            this.uw().d(var11);
            this.agi.t();
            this.p();
            this.agi.ab(var3);
         }
      } else {
         if (var1 == (16294 & 16603)) {
            Class658.cy(5 >> 1, this.aej);
         }

      }
   }

   public int wv(BigDecimal var1, String[] var2) {
      if (var1 == null) {
         return -4 >> 2;
      } else if (var2 == null) {
         return 3 >> 2;
      } else {
         int var3;
         for(int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {
            if (var1.toString().equals(var2[var3])) {
               return var3 + --1;
            }

            ++var3;
         }

         return 2 & 5;
      }
   }

   public synchronized void p() {
      RoleData var9;
      if ((var9 = this.vd()) != null) {
         LoginResult var2;
         LoginResult var10000 = var2 = var9.getLoginResult();
         String var5 = Class224.r(var10000.getGrade());
         String[] var4 = var10000.getPals() != null && !var2.getPals().equals("") ? var2.getPals().split("\\|") : null;
         AllPal var13 = this.vc().ar();
         ArrayList var3 = new ArrayList();
         int var6 = 5 >> 3;
         int var7 = this.km.getComponentCount();
         Iterator var8;
         Iterator var18 = var8 = var13.getAllPalData().values().iterator();

         while(true) {
            int var20;
            label82:
            while(var18.hasNext()) {
               PalData var14 = (PalData)var8.next();
               Object var1 = null;
               Object var19;
               if (var6 < var7) {
                  var19 = var1 = (<undefinedtype>)this.km.getComponent(var6);
               } else {
                  var1 = new MouseListener() {
                     private Image gd;
                     private Class436 et;
                     private int ay;
                     private Class643 qn;
                     private JLabel ir;
                     private JLabel rk;
                     private int m;

                     public void mousePressed(MouseEvent var1) {
                        Class135.this.as(this.m);
                     }

                     protected void paintComponent(Graphics var1) {
                        super.paintComponent(var1);
                        if (Class135.fq == null) {
                           Class135.fq = Class511.a("sc/b/S153.png");
                        }

                        var1.drawImage(Class135.fq, 3 >> 2, 3 >> 2, 25043 & 7871, 113 & 63, this);
                     }

                     public void mouseEntered(MouseEvent var1) {
                     }

                     public void mouseClicked(MouseEvent var1) {
                     }

                     protected void paintChildren(Graphics var1) {
                        super.paintChildren(var1);
                        if (this.gd != null) {
                           var1.drawImage(this.gd, 5 >> 3, 5 >> 3, 20695 & 12219, 127 & 49, this);
                        }

                     }

                     public void ab(int var1) {
                        this.m = var1;
                        PalData var2 = Class135.this.vc().aa(var1);
                        this.et.hf(Class222.t("p" + var2.getSkin()));
                        this.ir.setText(var2.getName());
                        this.rk.setText((String)null);
                     }

                     public void mouseReleased(MouseEvent var1) {
                     }

                     public void mouseExited(MouseEvent var1) {
                     }

                     public void js(PalData var1, Pal var2, String[] var3, String var4) {
                        this.m = var1.getPalId();
                        this.et.hf(Class222.t("p" + var1.getSkin()));
                        this.ir.setText(var1.getName());
                        if (var4 != null) {
                           this.rk.setText(var4 + "级");
                        }

                        this.jt(var2, var3, var4);
                     }

                     public void jt(Pal var1, String[] var2, String var3) {
                        Class135 var10001 = Class135.this;
                        BigDecimal var10002;
                        String[] var10003;
                        if (var1 != null) {
                           var10002 = var1.getId();
                           var10003 = var2;
                        } else {
                           var10002 = null;
                           var10003 = var2;
                        }

                        this.ay = var10001.wv(var10002, var10003);
                        if (this.ay == -4 >> 2) {
                           this.qn.setBtn(5 >> 3, (String)null);
                           this.qn.setText((String)null);
                           this.gd = Class511.a("sc/b/B235.png");
                        } else {
                           this.gd = null;
                           this.rk.setText(var3 + "级");
                           if (this.ay == 0) {
                              this.qn.setBtn(3 ^ 3, (String)null);
                              this.qn.setText((String)null);
                           } else {
                              this.qn.setBtn(3 >> 1, "sc/e/5.png");
                              this.qn.setText(BaseValue.getPalBtnArrStr(this.ay - (5 >> 2)));
                           }
                        }
                     }

                     public {
                        int var10005 = -4 >> 2;
                        this.ay = var10005;
                        this.setPreferredSize(new Dimension(23763 & 9151, 115 & 61));
                        this.et = new Class436();
                        this.et.setBounds(--5, --4, 53 & 111, 53 & 111);
                        this.add(this.et);
                        this.ir = new JLabel();
                        this.ir.setForeground(Color.white);
                        this.ir.setFont(Class681.ce);
                        this.ir.setBounds(127 & 45, --5, 102 & 95, 94 & 49);
                        this.add(this.ir);
                        this.rk = new JLabel();
                        this.rk.setForeground(Color.white);
                        this.rk.setFont(Class681.ce);
                        this.rk.setBounds(125 & 47, 57 & 95, 95 & 102, 81 & 62);
                        this.add(this.rk);
                        this.qn = new Class643("sc/e/5.png", 4 ^ 5, 3 >> 2, Class681.bm, (Color[])null, "", Class135.this.gk());
                        this.qn.setBounds(108 & 119, 41 & 94, 110 & 51, 23 & 121);
                        this.qn.setForeground(Color.white);
                        this.qn.removeMouseListener(this.qn);
                        this.add(this.qn);
                        this.addMouseListener(this);
                     }
                  };
                  var19 = var1;
                  this.km.add((Component)var1);
               }

               Pal var10002 = var9.getPal(var14.getPalId());
               ++var6;
               ((<undefinedtype>)var19).js(var14, var10002, var4, var5);
               int var10;
               var20 = var10 = 5 >> 3;

               while(true) {
                  if (var20 >= var3.size()) {
                     var18 = var8;
                     var3.add(var1);
                     continue label82;
                  }

                  int var11 = ((<undefinedtype>)var3.get(var10)).ay;
                  int var12 = ((<undefinedtype>)var3.get(var10)).m;
                  if (((<undefinedtype>)var1).ay == -4 >> 2) {
                     if (var11 == -4 >> 2 && ((<undefinedtype>)var1).m < var12) {
                        break;
                     }
                  } else if (((<undefinedtype>)var1).ay == 0) {
                     if (var11 <= 0 && (var11 == -4 >> 2 || ((<undefinedtype>)var1).m < var12)) {
                        break;
                     }
                  } else if ((var11 <= 0 || ((<undefinedtype>)var1).ay < var11) && (var11 > 0 || ((<undefinedtype>)var1).ay > var11)) {
                     break;
                  }

                  ++var10;
                  var20 = var10;
               }

               var3.add(var10, var1);
               var18 = var8;
            }

            int var15;
            for(var20 = var15 = 3 ^ 3; var20 < var3.size(); var20 = var15) {
               <undefinedtype> var16 = (<undefinedtype>)var3.get(var15);
               int var10001 = 5 >> 2;
               int var10003 = 3 & 4;
               int var10004 = var15 * (126 & 51);
               int var10005 = 18429 & 14475;
               ++var15;
               var16.setBounds(var10003, var10004, var10005, 119 & 58);
               var16.setVisible((boolean)var10001);
            }

            var15 = var3.size();
            int var17 = this.km.getComponentCount();

            for(var20 = var15; var20 < var17; var20 = var15) {
               <undefinedtype> var21 = (<undefinedtype>)this.km.getComponent(var15);
               ++var15;
               var21.setVisible((boolean)(5 >> 3));
            }

            this.km.setPreferredSize(new Dimension(2299 & 30605, (118 & 59) * var3.size()));
            return;
         }
      }
   }

   public void s() {
      String var1 = Class224.r(this.vd().getLoginResult().getGrade());
      var1 = var1 + "级";
      this.km.getComponentCount();
      int var2 = 3 ^ 3;
      int var3 = this.km.getComponentCount();

      for(int var10000 = var2; var10000 < var3; var10000 = var2) {
         <undefinedtype> var4 = (<undefinedtype>)this.km.getComponent(var2);
         ++var2;
         var4.rk.setText(var1);
      }

      if (this.fk != 0) {
         this.agi.c[--2].setText(var1);
      }

   }

   public Class135(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      int var10007 = -4 >> 2;
      super(111 & 121, 1 ^ 3, Class345.aef, var1);
      this.fk = var10007;
      this.va(var10005, 3 ^ 3, 14131 & 19199, 1919 & 31231, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 117 & 78, 117 & 78, 117 & 78, 117 & 78, (boolean)(3 >> 2)), "伙伴系统");
      Class643[] var4 = new Class643[var10001];
      boolean var10003 = true;
      this.abs = var4;

      int var2;
      int var10000;
      int var10006;
      for(var10000 = var2 = 2 & 5; var10000 < this.abs.length; var10000 = var2) {
         Class643[] var3 = this.abs;
         Class643 var10002 = new Class643;
         var10005 = 5 >> 1;
         var10006 = (123 & 124) + var2;
         Font var8 = Class681.cf;
         Color[] var10008 = Class681.c;
         String var10009;
         Class135 var10010;
         if (var2 == 0) {
            var10009 = "队伍";
            var10010 = this;
         } else if (var2 == (3 & 5)) {
            var10009 = "技能";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "装备";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/38.png", var10005, var10006, var8, var10008, var10009, var10010);
         var3[var2] = var10002;
         this.abs[var2].setOffsetTexts(Class681.bv);
         this.abs[var2].setBounds((28151 & 4830) + (123 & 86) * var2, 59 & 93, 95 & 111, 109 & 51);
         this.add(this.abs[var2++]);
      }

      var10001 = --3;
      this.d = Class133.b(62 & 111, 63 & 95, 24799 & 8123, 63 & 85, Color.white, Class681.ak);
      this.d.setHorizontalAlignment(3 ^ 3);
      this.d.setText("伙伴列表");
      this.add(this.d);
      var10006 = 51 & 125;
      this.km = new JComponent() {
      };
      this.eb = Class133.f(var10006, 115 & 63, 153, 310, this.km, 20);
      this.add(this.eb);
      this.agi = new JComponent() {
         private Class245[] zh;
         private JLabel[] c;
         public Class19 lx;
         private Class643[] xo;
         private Class436 ih;

         protected void paintChildren(Graphics var1) {
            super.paintChildren(var1);
            if (this.lx != null) {
               this.lx.a(var1, 19391 & 13661, 4079 & 28958, 3 >> 2, Class280.l());
            }

         }

         public boolean t() {
            if (this.xo[--2].isVisible()) {
               int var10000 = 5 >> 2;
               this.ak((boolean)(3 ^ 3));
               return (boolean)var10000;
            } else {
               return false;
            }
         }

         public void ak(boolean var1) {
            int var2;
            for(int var10000 = var2 = 5 >> 1; var10000 < this.xo.length; var10000 = var2) {
               this.xo[var2++].setVisible(var1);
            }

         }

         public {
            int var10001 = 94 & 39;
            Class643[] var5 = new Class643[var10001];
            boolean var10003 = true;
            this.xo = var5;

            int var2;
            int var10000;
            for(var10000 = var2 = 3 & 4; var10000 < this.xo.length; var10000 = var2) {
               Class643[] var3 = this.xo;
               Class643 var10002 = new Class643;
               int var10005 = 5 >> 2;
               int var10006 = (123 & 127) + var2;
               Font var10007 = Class681.ak;
               Color[] var10008 = Class681.c;
               String var10009;
               Class135 var10010;
               if (var2 == 0) {
                  var10009 = "调整";
                  var10010 = Class135.this;
               } else if (var2 == (2 ^ 3)) {
                  var10009 = "抗性";
                  var10010 = Class135.this;
               } else {
                  var10009 = "";
                  var10010 = Class135.this;
               }

               var3[var2] = var10002;
               <undefinedtype> var4;
               if (var2 != 0 && var2 != 3 >> 1) {
                  var4 = this;
                  this.xo[var2].setBounds(23034 & 9957, (13025 & 19967) + (var2 - (5 >> 1)) * (93 & 59), 127 & 59, 61 & 91);
               } else {
                  var4 = this;
                  this.xo[var2].setBounds((17903 & 15088) + var2 * (111 & 95), 16759 & 16333, 127 & 59, 127 & 25);
               }

               var4.add(this.xo[var2++]);
            }

            JLabel[] var6 = new JLabel[13 & 122];
            var10003 = true;
            this.c = var6;

            for(var10000 = var2 = 3 ^ 3; var10000 < this.c.length; var10000 = var2) {
               this.c[var2] = Class133.c(2941 & 30206, (119 & 90) + (126 & 29) * var2, 45, 19, 3 & 4, Color.black, Class681.ak);
               this.c[var2].setText(var2 == 0 ? "名字" : (var2 == --1 ? "门派" : (var2 == 5 >> 1 ? "等级" : (var2 == --3 ? "资质" : (var2 == --4 ? "气血" : (var2 == --5 ? "法力" : (var2 == 6 ? "攻击" : (var2 == 7 ? "速度" : ""))))))));
               this.add(this.c[var2++]);
            }

            Class245[] var7 = new Class245[8];
            var10003 = true;
            this.zh = var7;

            for(var10000 = var2 = 3 ^ 3; var10000 < this.zh.length; var10000 = var2) {
               this.zh[var2] = Class133.a(425, 82 + 28 * var2, 114, 19, 10, Color.white, Class681.q);
               this.zh[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 & 4)));
               this.add(this.zh[var2++]);
            }

            this.ih = new Class436(Class511.q("sc/d/16.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 >> 2)));
            this.ih.setBounds(205, 70, 175, 244);
            this.add(this.ih);
         }

         public void ab(int var1) {
            if (var1 == 0) {
               this.xo[3 & 4].setText("参战");
            } else if (var1 > 0) {
               this.xo[3 & 4].setText("调整");
            } else {
               this.xo[3 >> 2].setText("激活");
            }
         }

         public void bw(Pal var1, PalData var2) {
            RoleData var5;
            String var4 = Class224.r((var5 = Class135.this.vd()).getLoginResult().getGrade());
            int[] var3 = PetProperty.getPalHMASp(var1, var2, var5);
            this.zh[3 >> 2].setText(var2.getName());
            this.zh[--1].setText(var2.getTrait());
            this.zh[1 ^ 3].setText(var4 + "级");
            this.zh[--3].setForeground(BaseValue.getPalLvlColor(var1 == null ? 0.0D : var1.getGrow()));
            this.zh[--3].setText(BaseValue.getPalLvl(var1 == null ? 0.0D : var1.getGrow()));
            this.zh[--4].setText(String.valueOf(var3[3 ^ 3]));
            this.zh[--5].setText(String.valueOf(var3[--1]));
            this.zh[79 & 54].setText(String.valueOf(var3[5 >> 1]));
            this.zh[103 & 31].setText(String.valueOf(var3[--3]));
            <undefinedtype> var10000;
            if (this.lx == null) {
               this.lx = Class330.f(var2.getSkin(), 111 & 23, --1, (String)null);
               var10000 = this;
            } else {
               this.lx = Class330.w(this.lx, --1, var2.getSkin());
               var10000 = this;
            }

            Class135 var7 = Class135.this;
            BigDecimal var10001;
            RoleData var10002;
            if (var1 != null) {
               var10001 = var1.getId();
               var10002 = var5;
            } else {
               var10001 = null;
               var10002 = var5;
            }

            int var6 = var7.wu(var10001, var10002.getLoginResult().getPals());
            int var8 = 3 & 4;
            this.ab(var6);
            this.ak((boolean)var8);
         }
      };
      this.lr = new JComponent() {
         private JLabel[] ai;
         private JList<String> yp;
         private Class436[] pv;
         private RichLabel bv;
         private JScrollPane nk;
         private DefaultListModel<String> fn;
         private Class643[] aco;

         public void arj(Skill var1, boolean var2) {
            this.bv.setText((String)null);
            if (var1 != null) {
               RoleData var8 = Class135.this.vd();
               RoleData var10001 = var8;
               int var9 = Class224.d(var8.getLoginResult().getGrade());
               int var3 = Class224.g(var10001.getLoginResult().getGrade());
               double var4 = (double)(var9 * (3510 & 29407));
               String var6;
               if ((var6 = Class683.apn(Integer.parseInt(var1.getSkillid()), var1, var4, var9, var3)) != null) {
                  this.bv.addText(var6);
               }

               Dimension var7 = this.bv.computeSize(111 & 126);
               this.bv.setSize(var7);
               this.bv.setPreferredSize(var7);
            }
         }

         public void bw(Pal var1, PalData var2) {
            this.fn.removeAllElements();
            this.arj((Skill)null, (boolean)(3 & 4));
            if (var2.getSkill() != null && !var2.getSkill().equals("")) {
               String[] var4 = var2.getSkill().split("\\|");

               int var5;
               for(int var10000 = var5 = 3 >> 2; var10000 < var4.length; var10000 = var5) {
                  Skill var3;
                  if ((var3 = Class135.this.vc().bf(var4[var5])) != null) {
                     this.fn.addElement(var3.getSkillname());
                  }

                  ++var5;
               }

            }
         }

         public {
            int var10001 = --2;
            Class643[] var4 = new Class643[var10001];
            boolean var10003 = true;
            this.aco = var4;

            int var2;
            int var10000;
            for(var10000 = var2 = 5 >> 3; var10000 < this.aco.length; var10000 = var2) {
               Class643[] var3 = this.aco;
               Class643 var10002 = new Class643;
               int var10005 = --1;
               int var10006 = (1409 & 31487) + var2;
               Font var10007 = Class681.ak;
               Color[] var10008 = Class681.c;
               String var10009;
               Class135 var10010;
               if (var2 == 0) {
                  var10009 = "删除技能";
                  var10010 = Class135.this;
               } else if (var2 == (2 ^ 3)) {
                  var10009 = "使用物品";
                  var10010 = Class135.this;
               } else {
                  var10009 = "";
                  var10010 = Class135.this;
               }

               var3[var2] = var10002;
               this.aco[var2].setBounds((20479 & 12493) + var2 * (109 & 123), 10199 & 22893, 127 & 99, 31 & 121);
               this.add(this.aco[var2++]);
            }

            JLabel[] var5 = new JLabel[1 ^ 3];
            var10003 = true;
            this.ai = var5;

            for(var10000 = var2 = 2 & 5; var10000 < this.ai.length; var10000 = var2) {
               this.ai[var2] = Class133.c(9117 & 24063, 119 & 78, 127 & 127, 21 & 127, 2 & 5, Color.white, Class681.ak);
               this.ai[var2].setText(var2 == 0 ? "技能名称" : (var2 == (4 ^ 5) ? "技能介绍" : ""));
               if (var2 == (3 & 5)) {
                  this.ai[var2].setBounds(18365 & 14815, 19115 & 13823, 127 & 127, 29 & 119);
               }

               this.add(this.ai[var2++]);
            }

            var10001 = --5;
            this.bv = new RichLabel();
            this.add(this.bv);
            this.fn = new DefaultListModel();
            this.yp = new JList();
            this.yp.setOpaque((boolean)(2 & 5));
            this.yp.setSelectionBackground(new Color(121 & 39, 122 & 47, 52));
            this.yp.setSelectionForeground(Color.YELLOW);
            this.yp.setForeground(Color.YELLOW);
            this.yp.setFont(Class681.ca);
            this.yp.setBackground(Class681.cu);
            this.yp.setModel(this.fn);
            this.yp.setSelectionMode(2 & 5);
            this.yp.addListSelectionListener(new ListSelectionListener() {
               public void valueChanged(ListSelectionEvent var1) {
                  if (!var1.getValueIsAdjusting()) {
                     String var2;
                     if ((var2 = (String)yp.getSelectedValue()) == null || var2.equals("")) {
                        return;
                     }

                     arj(Class135.this.vc().bg(var2), (boolean)(2 & 5));
                  }

               }
            });
            this.yp.setBounds(415, 90, 113, 78);
            this.add(this.yp);
            this.nk = Class133.f(416, 192, 128, 165, this.bv, 30);
            this.add(this.nk);
            Class436[] var7 = new Class436[var10001];
            var10003 = true;
            this.pv = var7;

            for(var10000 = var2 = 3 ^ 3; var10000 < this.pv.length; var10000 = var2) {
               this.pv[var2] = new Class436();
               <undefinedtype> var6;
               if (var2 == 0) {
                  var6 = this;
                  this.pv[var2].fw("sc/d/79.png");
                  this.pv[var2].setBounds(205, 70, 204, 243);
               } else if (var2 == (3 & 5)) {
                  var6 = this;
                  this.pv[var2].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
                  this.pv[var2].setBounds(413, 70, 127, 21);
               } else if (var2 == (1 ^ 3)) {
                  var6 = this;
                  this.pv[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 >> 2)));
                  this.pv[var2].setBounds(413, 171, 127, 21);
               } else if (var2 == --3) {
                  var6 = this;
                  this.pv[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(2 & 5)));
                  this.pv[var2].setBounds(413, 70, 127, 101);
               } else {
                  if (var2 == --4) {
                     this.pv[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
                     this.pv[var2].setBounds(413, 171, 127, 187);
                  }

                  var6 = this;
               }

               var6.add(this.pv[var2++]);
            }

         }
      };
      this.agj = new JComponent() {
         private Class436[] e;
         private Class643 dy;
         private Class331 dz;

         protected void paintChildren(Graphics var1) {
            super.paintChildren(var1);
            if (Class135.this.agi.lx != null) {
               Class135.this.agi.lx.a(var1, 31575 & 1467, 2046 & 30991, 3 ^ 3, Class280.l());
            }

         }

         public {
            int var10001 = 28 & 127;
            this.dy = new Class643("sc/e/26.png", --1, 15787 & 17110, Class681.ak, Class681.c, "物品栏", Class135.this.gk());
            this.dy.setBounds(26623 & 6371, 25957 & 7135, 107 & 119, 127 & 25);
            this.add(this.dy);
            this.dz = new Class331(Class135.this.gk(), --3, --4, 115 & 61, 115 & 61, 27 & 109, 63 & 71, 20475 & 12662, 74 & 127);
            this.add(this.dz);
            Class436[] var4 = new Class436[var10001];
            boolean var10003 = true;
            this.e = var4;

            int var2;
            for(int var10000 = var2 = 2 & 5; var10000 < this.e.length; var10000 = var2) {
               if (var2 != 0 && var2 != --1 && var2 != --2) {
                  this.e[var2] = new Class436();
                  this.add(this.e[var2]);
                  if (var2 == 0) {
                     this.e[var2].eq(Class511.q("sc/d/35.png", 127 & 80, 26 & 111, 127 & 80, 79 & 58, (boolean)(2 & 5)));
                     this.e[var2].setBounds(5629 & 27326, 39 & 127, 359, 20);
                  } else if (var2 == (4 ^ 5)) {
                     this.e[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(5 >> 3)));
                     this.e[var2].setBounds(46, 31, 152, 21);
                  } else if (var2 == (1 ^ 3)) {
                     this.e[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
                     this.e[var2].setBounds(46, 31, 152, 330);
                  } else if (var2 == --3) {
                     this.e[var2].eq(Class511.q("sc/d/16.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
                     this.e[var2].setBounds(205, 70, 143, 244);
                  } else if (var2 >= --4 && var2 <= 15) {
                     <undefinedtype> var3;
                     if (var2 == --4) {
                        var3 = this;
                        this.e[var2].fw("sc/d/7.png");
                     } else if (var2 == --5) {
                        var3 = this;
                        this.e[var2].fw("sc/d/8.png");
                     } else if (var2 == 6) {
                        var3 = this;
                        this.e[var2].fw("sc/d/6.png");
                     } else if (var2 == 7) {
                        var3 = this;
                        this.e[var2].fw("sc/d/12.png");
                     } else if (var2 == 8) {
                        var3 = this;
                        this.e[var2].fw("sc/d/10.png");
                     } else if (var2 == 9) {
                        var3 = this;
                        this.e[var2].fw("sc/d/5.png");
                     } else if (var2 == 10) {
                        var3 = this;
                        this.e[var2].fw("sc/d/11.png");
                     } else if (var2 == 11) {
                        var3 = this;
                        this.e[var2].fw("sc/d/9.png");
                     } else if (var2 == 12) {
                        var3 = this;
                        this.e[var2].fw("sc/d/14.png");
                     } else if (var2 == 13) {
                        var3 = this;
                        this.e[var2].fw("sc/d/15.png");
                     } else if (var2 == 14) {
                        var3 = this;
                        this.e[var2].fw("sc/d/13.png");
                     } else {
                        if (var2 == 15) {
                           this.e[var2].fw("sc/d/13.png");
                        }

                        var3 = this;
                     }

                     var3.e[var2].setBounds(369 + (var2 - --4) % --3 * 58, 73 + (var2 - --4) / --3 * 56, 50, 50);
                  } else if (var2 >= 16 && var2 <= 27) {
                     this.e[var2].fw("sc/d/4.png");
                     this.e[var2].setBounds(365 + (var2 - 16) % --3 * 58, 70 + (var2 - 16) / 3 * 56, 59, 57);
                  }
               }

               ++var2;
            }

         }

         public void bw(Pal var1, PalData var2) {
            this.q();
            if (var1 != null && var1.getParts() != null && !var1.getParts().equals("")) {
               if (Class135.this.vd() != null) {
                  String[] var5 = var1.getParts().split("\\|");

                  int var6;
                  for(int var10000 = var6 = 3 & 4; var10000 < var5.length; var10000 = var6) {
                     int var3;
                     if ((var3 = var5[var6].indexOf("=")) != -4 >> 2) {
                        int var4 = Integer.parseInt(var5[var6].substring(3 >> 2, var3));
                        BigDecimal var7 = new BigDecimal(var5[var6].substring(var3 + (3 & 5)));
                        this.bx(var7, var4);
                     }

                     ++var6;
                  }

               }
            }
         }

         public void q() {
            int var1;
            for(int var10000 = var1 = 3 >> 2; var10000 < this.dz.aiy().length; var10000 = var1) {
               if (this.dz.aiy()[var1] != null) {
                  this.dz.aiy()[var1].g();
               }

               ++var1;
            }

         }

         public void bx(BigDecimal var1, int var2) {
            Class467 var3;
            if ((var3 = this.dz.aiy()[var2]) == null) {
               this.dz.aiy()[var2] = var3 = new Class467();
            }

            var3.d(Class135.this.vd().getGood(var1));
         }
      };
      this.agi.setBounds(3 ^ 3, 3 ^ 3, 563, 383);
      this.lr.setBounds(3 & 4, 3 & 4, 563, 383);
      this.agj.setBounds(3 ^ 3, 3 ^ 3, 563, 383);
      this.add(this.agi);
      this.add(this.lr);
      this.add(this.agj);
      Class436[] var6 = new Class436[var10001];
      var10003 = true;
      this.e = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         Class135 var5;
         if (var2 == 0) {
            var5 = this;
            this.e[var2].eq(Class511.q("sc/d/35.png", 80, 10, 80, 10, (boolean)(3 & 4)));
            this.e[var2].setBounds(188, 39, 359, 20);
         } else if (var2 == 5 >> 2) {
            var5 = this;
            this.e[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(2 & 5)));
            this.e[var2].setBounds(46, 31, 155, 21);
         } else {
            if (var2 == --2) {
               this.e[var2].eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
               this.e[var2].setBounds(46, 31, 155, 330);
            }

            var5 = this;
         }

         var5.add(this.e[var2++]);
      }

   }

   public void d() {
      PalData var1;
      if ((var1 = this.vc().aa(this.fk)) == null) {
         this.aej.fw("请先选中一个伙伴");
      } else {
         Class135 var10000;
         StringBuffer var3;
         label29: {
            String var2 = var1.getXh();
            var3 = new StringBuffer();
            var3.append("#W确定要激活#G");
            var3.append(var1.getName());
            if (var2 != null && !"".equals(var2)) {
               var3.append("#W吗?消耗:#R");
               var3.append(var2.substring(2 ^ 3, var2.length()));
               if (var2.startsWith("D")) {
                  var10000 = this;
                  var3.append("大话币#W。");
                  break label29;
               }

               if (var2.startsWith("X")) {
                  var10000 = this;
                  var3.append("仙玉#W。");
                  break label29;
               }
            } else {
               var3.append("吗?消耗:#R无消耗#W。");
            }

            var10000 = this;
         }

         var10000.aej.aal(new ConfirmBean(63 & 87, String.valueOf(this.fk), var3.toString()));
      }
   }
}
