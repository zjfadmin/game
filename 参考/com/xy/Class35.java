package com.xy;

import com.xy.battle.TypeState;
import com.xy.entity.RoleSummoning;
import com.xy.formula.SkillUtil;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.readbean.XuanBao;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class35 extends Class345 {
   private RichLabel bv;
   private Color wg;
   private <undefinedtype>[] anp;
   private Class514 anq;

   public void afq(Class514 var1) {
      Class603 var4 = this.vc();
      this.anq = var1;

      int var5;
      int var10000;
      for(var10000 = var5 = 5 >> 3; var10000 < this.anp.length; var10000 = var5) {
         this.anp[var5++].q();
      }

      List var8 = var1.bt().g("技能");
      int var2;
      TypeState var3;
      <undefinedtype> var9;
      String[] var10;
      boolean var10003;
      if (var1.bt().getType() == 0) {
         for(var10000 = var2 = 3 & 4; var10000 < var8.size(); var10000 = var2) {
            if ((var3 = (TypeState)var8.get(var2)).getState() == 0 || var3.getState() == 5 >> 1) {
               String var6;
               if ((var6 = SkillUtil.getSkillSM(var3.getType(), var4)) == null) {
                  this.anp[--5].vv(var3);
               } else if (var6.equals("套装")) {
                  this.anp[--4].vv(var3);
               } else if (var6.equals("法门")) {
                  this.anp[--3].vv(var3);
               } else {
                  int var7;
                  var10000 = var7 = 0;

                  while(true) {
                     if (var10000 >= 3) {
                        this.anp[--5].vv(var3);
                        break;
                     }

                     if (this.anp[var7].agg == null || this.anp[var7].agg[3 & 4].equals(var6)) {
                        if (this.anp[var7].agg == null) {
                           var9 = this.anp[var7];
                           var10 = new String[2 ^ 3];
                           var10003 = true;
                           var10[5 >> 3] = var6;
                           var9.agg = var10;
                        }

                        this.anp[var7].vv(var3);
                        break;
                     }

                     ++var7;
                     var10000 = var7;
                  }
               }
            }

            ++var2;
         }

         var9 = this.anp[--3];
         var10 = new String[1 ^ 3];
         var10003 = true;
         var10[5 >> 3] = "法";
         var10[--1] = "门";
         var9.agg = var10;
         var9 = this.anp[--4];
         var10 = new String[--2];
         var10003 = true;
         var10[3 >> 2] = "套";
         var10[2 ^ 3] = "装";
         var9.agg = var10;
         var9 = this.anp[--5];
         var10 = new String[1 ^ 3];
         var10003 = true;
         var10[3 >> 2] = "其";
         var10[5 >> 2] = "他";
         var9.agg = var10;

         for(var10000 = var2 = 5 >> 3; var10000 < this.anp.length; var10000 = var2) {
            this.anp[var2].setBounds(--5 + var2 % --3 * (25806 & 7101), (74 & 63) + var2 / --3 * (19627 & 13310), 9935 & 22967, 28399 & 4528);
            this.anp[var2++].setVisible((boolean)(--1));
         }

         this.vf(-4 >> 2, 5 >> 3, 6565 & 26622, 25949 & 7158);
         this.bv.setTextSize("当前MP:" + var1.bt().getMp_Current(), 6110 & 27057);
         this.bv.setBounds(30 & 109, 6519 & 26558, this.bv.getWidth(), this.bv.getHeight());
      } else {
         for(var10000 = var2 = 0; var10000 < var8.size(); var10000 = var2) {
            if ((var3 = (TypeState)var8.get(var2)).getState() == 0 || var3.getState() == (1 ^ 3)) {
               this.anp[5 >> 3].vv(var3);
            }

            ++var2;
         }

         var9 = this.anp[2 & 5];
         var10 = new String[3];
         var10003 = true;
         var10[3 >> 2] = "召";
         var10[--1] = "唤";
         var10[2] = "兽";
         var9.agg = var10;
         var9 = this.anp[4 ^ 5];
         var10 = new String[2];
         var10003 = true;
         var10[3 ^ 3] = "其";
         var10[1] = "他";
         var9.agg = var10;

         for(var10000 = var2 = 0; var10000 < 2; var10000 = var2) {
            this.anp[var2].setBounds(5 + var2 * (223 & 32684), 123 & 14, 27631 & 5271, 20767 & 12270);
            this.anp[var2++].setVisible(true);
         }

         this.vf(-1, 0, 5482 & 27575, 5482 & 27575);
         this.bv.setTextSize("当前MP:" + var1.bt().getMp_Current(), 18430 & 14737);
         this.bv.setBounds(12, 260, this.bv.getWidth(), this.bv.getHeight());
      }
   }

   public Class35(GameView var1) {
      int var10001 = 15 & 118;
      int var10005 = -4 >> 2;
      super(47 & 114, --2, Class345.aef, var1);
      this.wg = Class681.c("#cCBB55B");
      this.va(var10005, 3 & 4, 15271 & 17916, 14775 & 18302, Class345.aei);
      this.uv(Class511.q("sc/c/0", 31 & 102, 31 & 102, 31 & 102, 31 & 102, (boolean)(3 & 4)), (String)null);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.anp = var3;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.anp.length; var10000 = var2) {
         this.anp[var2] = new JComponent() {
            String[] agg;
            List<null> ie = new ArrayList();
            int m;

            public void q() {
               int var10000 = 3 >> 2;
               int var10002 = 3 >> 2;
               this.setVisible((boolean)(3 & 4));
               this.m = var10002;

               for(int var1 = var10000; var10000 < this.ie.size(); var10000 = var1) {
                  Object var2 = this.ie.get(var1);
                  ++var1;
                  ((<undefinedtype>)var2).vv((TypeState)null);
               }

               this.agg = null;
            }

            public void vv(TypeState var1) {
               this.wt().vv(var1);
            }

            public <undefinedtype> wt() {
               Object var1 = this.m < this.ie.size() ? (<undefinedtype>)this.ie.get(this.m) : null;
               if (var1 == null) {
                  this.ie.add(var1 = new MouseListener() {
                     int gv;
                     String afm;
                     Class436 ec;
                     private boolean po;
                     Skill afn;
                     JLabel d;
                     int bn;
                     private boolean bb;
                     // $FF: synthetic field
                     final Class35 afo;

                     public void mouseEntered(MouseEvent var1) {
                        this.po = Boolean.TRUE;
                        if (this.afn != null) {
                           Class270 var10 = (Class270)this.afo.ve().e(62 & 111);
                           if (Class35.afr(this.afo).bt().getType() != 0) {
                              RoleSummoning var11;
                              if ((var11 = this.afo.vd().getPet(new BigDecimal(Class35.afr(this.afo).bt().getId()))) != null) {
                                 var10.sf(this.afn, 1.0D, Class224.p(var11.getGrade()), Class224.n(var11.getGrade()));
                              }

                           } else {
                              RoleData var2;
                              RoleData var10001 = var2 = this.afo.vd();
                              int var8 = Class224.d(var10001.getLoginResult().getGrade());
                              int var4 = Class224.g(var10001.getLoginResult().getGrade());
                              int var7;
                              int var10000;
                              if (this.gv >= (32477 & 16291) && this.gv <= (32510 & 16295)) {
                                 Class603 var13 = this.afo.vc();
                                 Goodstable var14 = null;

                                 XuanBao var9;
                                 Goodstable var12;
                                 for(var10000 = var7 = 95 & 47; var10000 < 18; var10000 = var7) {
                                    if ((var12 = var2.getGood(var2.goodChoses[var7])) != null && (var9 = var13.cb(var12.getBaseXuanBao().getId())) != null && var9.getSkillId() == this.gv) {
                                       var14 = var12;
                                       break;
                                    }

                                    ++var7;
                                 }

                                 var10000 = var7 = 0;

                                 Goodstable var15;
                                 while(true) {
                                    if (var10000 >= var2.xuanBaoList.size()) {
                                       var15 = var14;
                                       break;
                                    }

                                    if ((var12 = var2.getGood((BigDecimal)var2.xuanBaoList.get(var7))) != null && (var9 = var13.cb(var12.getBaseXuanBao().getId())) != null && var9.getSkillId() == this.gv) {
                                       var15 = var14 = var12;
                                       break;
                                    }

                                    ++var7;
                                    var10000 = var7;
                                 }

                                 if (var15 != null) {
                                    var10.oj(var14, (boolean)(2 & 5));
                                 }

                              } else {
                                 int var5 = var4 == 0 ? 32596 & 10171 : (var4 == --1 ? 15291 & 32476 : (var4 == 5 >> 1 ? 20279 & 32488 : 25000));
                                 boolean var6 = this.afo.uw().gameBattle && (var2.getRoleProperty().sld1 > 0 || var2.getRoleProperty().sld2 > 0);
                                 if (var6) {
                                    var7 = (this.gv - (31723 & 2045)) / --5 + --1;
                                    int var3 = 3 ^ 3;
                                    if (var7 == var2.getRoleProperty().sm1) {
                                       var3 = (int)((double)var3 + (double)var2.getRoleProperty().sld1 * 67.5D);
                                       var10000 = var5;
                                    } else {
                                       if (var7 == var2.getRoleProperty().sm2) {
                                          var3 = (int)((double)var3 + (double)var2.getRoleProperty().sld2 * 67.5D);
                                       }

                                       var10000 = var5;
                                    }

                                    var5 = var10000 + var3;
                                 }

                                 var10.sf(this.afn, (double)var5, var8, var4);
                              }
                           }
                        }
                     }

                     public void mouseReleased(MouseEvent var1) {
                        this.vu(Boolean.FALSE);
                        if (this.po) {
                           this.afo.aej.getBattleControl().setMouseIndex(Class320.f, this.afn);
                           this.afo.aej.getFormManagement().n(103 & 58);
                           this.afo.aej.getFormManagement().n(111 & 62);
                           this.afo.aej.getBattleControl().f();
                        }

                     }

                     public void vu(Boolean var1) {
                        if (this.bb != var1) {
                           this.bb = var1;
                           super.setBounds(this.getX() + (this.bb ? 3 >> 1 : -1), this.getY() + (this.bb ? 3 >> 1 : -1), this.getWidth(), this.getHeight());
                        }
                     }

                     public void vv(TypeState var1) {
                        this.afm = var1 != null ? var1.getType() : null;
                        this.bn = var1 != null ? var1.getState() : 0;
                        this.afn = this.afm != null ? this.afo.vc().bg(this.afm) : null;
                        if (this.afn == null) {
                           int var10001 = 3 ^ 3;
                           this.ec.q();
                           this.d.setText((String)null);
                           this.setVisible((boolean)var10001);
                        } else {
                           this.gv = Integer.parseInt(this.afn.getSkillid());
                           <undefinedtype> var10000;
                           if ((this.gv <= (28521 & 13246) || this.gv >= (30587 & 12180)) && (this.gv <= (28384 & 16383) || this.gv >= (14030 & 31737)) && (this.gv < (16063 & 32705) || this.gv > (32503 & 16302))) {
                              var10000 = this;
                              this.ec.hf(Class222.g(this.afn.getSkillid()));
                           } else {
                              var10000 = this;
                              this.ec.hf(Class222.s(this.gv));
                           }

                           var10000.d.setText(this.afn.getSkillname());
                           this.d.setForeground(this.bn == --2 ? Color.red : Color.white);
                           this.setVisible((boolean)(2 ^ 3));
                        }
                     }

                     public void mouseExited(MouseEvent var1) {
                        this.vu(Boolean.FALSE);
                        this.po = Boolean.FALSE;
                        this.afo.ve().n(111 & 62);
                     }

                     public {
                        int var10003 = 95 & 59;
                        this.afo = var1;
                        super();
                        this.ec = new Class436();
                        this.ec.setBounds(5 >> 3, 5 >> 3, 31 & 120, 31 & 120);
                        this.d = Class133.b(var10003, 3 & 4, 127 & 85, 63 & 89, Color.white, Class681.bx);
                        this.add(this.ec);
                        this.add(this.d);
                        this.addMouseListener(this);
                     }

                     public void mousePressed(MouseEvent var1) {
                        this.vu(Boolean.TRUE);
                     }

                     public void mouseClicked(MouseEvent var1) {
                     }

                     public void setBounds(int var1, int var2, int var3, int var4) {
                        super.setBounds(var1 + (this.bb ? 5 >> 2 : 0), var2 + (this.bb ? --1 : 0), var3, var4);
                     }
                  });
                  ((<undefinedtype>)var1).setBounds(54 & 95, (1 ^ 3) + this.m * (63 & 94), 127 & 115, 31 & 121);
                  this.add((Component)var1);
               }

               this.m += --1;
               return (<undefinedtype>)var1;
            }
         };
         this.anp[var2].setVisible((boolean)(3 >> 2));
         this.add(this.anp[var2++]);
      }

      this.bv = new RichLabel("", Class681.y);
      this.add(this.bv);
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2;
      Graphics2D var10000 = var2 = (Graphics2D)var1;
      Object var8 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
      Object var4 = var10000.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
      Object var5 = var10000.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
      Object var6 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object var7 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Object var11;
      if (var8 != RenderingHints.VALUE_RENDER_QUALITY) {
         var11 = var4;
         var2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      } else {
         var8 = null;
         var11 = var4;
      }

      if (var11 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
         var11 = var5;
         var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
      } else {
         var4 = null;
         var11 = var5;
      }

      if (var11 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
         var11 = var6;
         var2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      } else {
         var5 = null;
         var11 = var6;
      }

      if (var11 != RenderingHints.VALUE_STROKE_DEFAULT) {
         var11 = var7;
         var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      } else {
         var6 = null;
         var11 = var7;
      }

      Graphics var12;
      if (var11 != RenderingHints.VALUE_ANTIALIAS_ON) {
         var12 = var1;
         var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      } else {
         var7 = null;
         var12 = var1;
      }

      var12.setColor(this.wg);
      int var10 = 5 >> 3;
      var1.setFont(Class681.cq);

      for(int var3 = var10; var10 < this.anp.length; var10 = var3) {
         int var9;
         if (this.anp[var3].isVisible() && this.anp[var3].agg != null) {
            for(var10 = var9 = 0; var10 < this.anp[var3].agg.length; var10 = var9) {
               var1.drawString(this.anp[var3].agg[var9], this.anp[var3].getX(), this.anp[var3].getY() + (87 & 57) + (63 & 89) * var9++);
            }
         }

         ++var3;
      }

      if (var8 != null) {
         var2.setRenderingHint(RenderingHints.KEY_RENDERING, var8);
      }

      if (var4 != null) {
         var2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var4);
      }

      if (var5 != null) {
         var2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var5);
      }

      if (var6 != null) {
         var2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var6);
      }

      if (var7 != null) {
         var2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var7);
      }

   }

   public void q() {
      Class514 var1;
      if ((var1 = this.aej.getBattleControl().getHandleUnit()) != null) {
         this.afq(var1);
         super.q();
      }
   }


   static Class514 afr(Class35 var0) {
      return var0.anq;
   }
}
