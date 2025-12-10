package com.xy;

import com.xy.bean.Commodity;
import com.xy.bean.Stall;
import com.xy.bean.StallBean;
import com.xy.bean.StallBuy;
import com.xy.bean.StallNeedBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StallBuyData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class9 extends Class345 {
   private JComponent asy;
   private Class436 asz;
   public Class6 ata;
   public static Class8 atb;
   private JLabel[] atc;
   private int atd;
   private int jf;
   private Class217 ate;
   private Class556 jh;
   private Class436 atf;
   private Class322 jj;
   private Class436[] atg;
   private Class322 ath;
   private JLabel[] ati;
   private Class436 atj;
   private Class322 atk;
   private JScrollPane atl;
   private Class556 atm;
   private Class322 tc;
   private Class319 atn;
   private RichLabel ato;
   private Class245[] atp;
   private JLabel[] atq;
   private MoneyType atr;
   private JComponent ats;
   private Class322[] att;
   private RichLabel atu;
   private <undefinedtype>[] atv;
   private JScrollPane atw;
   private Stall atx;
   private Class245 aty;
   private Class436 atz;
   private Class436[] aad;
   private Class322 tq;
   private Class44 aix;
   private JComponent aua;
   private Class319 amm;
   private Class322[] ahp;
   private Class44 aob;
   private int gw;
   private Commodity aub;
   private Class245[] jc;
   private StallNeedBean auc;
   private <undefinedtype>[] aud;
   private Class436 bl;
   private Class217 ako;

   public void o() {
      if (this.jf == (3 & 5)) {
         this.s();
      }

   }

   public Long x(long var1, JTextField var3) {
      if (var3 == this.ate) {
         if (var1 >= 0L && this.auc != null) {
            Goodstable var7;
            if ((var7 = (Goodstable)this.aix.hr()) != null) {
               var7 = this.vd().getGood(var7.getRgid());
            }

            if (var7 == null) {
               return 0L;
            } else {
               long var5 = (long)Math.min(var7.getUsetime(), this.auc.getTotal() - this.auc.getNum());
               return var1 > var5 ? var5 : null;
            }
         } else {
            return 0L;
         }
      } else if (var1 >= 0L && this.aub != null) {
         long var4 = Math.min(this.vd().getLoginResult().getGold().longValue() / this.aub.getMoney(), (long)(this.aub.getGood() != null ? this.aub.getGood().getUsetime() : 1));
         return var1 > var4 ? var4 : null;
      } else {
         return 0L;
      }
   }

   public void aja(Stall var1) {
      int var4 = this.atx != null && this.atx.getId() == var1.getId() ? 2 ^ 3 : 0;
      StallNeedBean var3 = var4 != 0 ? this.auc : null;
      Stall var10001 = this.atx = var1;
      this.aty.setText(var1.getStall());
      boolean var2 = var1.h(3 ^ 3);
      boolean var5 = var1.h(--1);
      boolean var6 = var1.h(5 >> 1);
      boolean var7 = var10001.h(--3);
      Class322 var10000 = this.att[3 ^ 3];
      int var10;
      boolean var10002;
      if (var2) {
         var10 = --2;
         var10002 = var2;
      } else {
         var10 = -1;
         var10002 = var2;
      }

      var10000.setBtn(var10, var10002 ? "sc/e/61.png" : "sc/e/74.png");
      var10000 = this.att[4 ^ 5];
      if (var5) {
         var10 = 1 ^ 3;
         var10002 = var5;
      } else {
         var10 = -1;
         var10002 = var5;
      }

      var10000.setBtn(var10, var10002 ? "sc/e/61.png" : "sc/e/74.png");
      var10000 = this.att[5 >> 1];
      if (var6) {
         var10 = 5 >> 1;
         var10002 = var6;
      } else {
         var10 = -1;
         var10002 = var6;
      }

      var10000.setBtn(var10, var10002 ? "sc/e/61.png" : "sc/e/74.png");
      Class9 var9;
      if (var2) {
         var9 = this;
         this.dp(2 & 5);
      } else if (var5) {
         var9 = this;
         this.dp(--1);
      } else if (var6) {
         this.dp(5 >> 1);
         var9 = this;
      } else {
         this.att[3 ^ 3].setBtn(--2, "sc/e/61.png");
         this.dp(2 & 5);
         var9 = this;
      }

      int var8;
      if ((var8 = var9.jf) == (3 & 5) && !var7) {
         var8 = 2 & 5;
      }

      this.do(var8);
      if (var4 != 0 && var8 == --1 && var3 != null && (var3 = var1.getStallNeedBean(var3.getId())) != null && var3.getTotal() > var3.getNum()) {
         this.aai(var3);
      }

      if (var1.getId() == 0) {
         var9 = this;
         this.tq.setVisible((boolean)(5 >> 3));
         this.ath.setVisible((boolean)(3 >> 2));
         this.atk.setVisible((boolean)(3 & 4));
      } else if (Class394.v(var1.getRoleid(), this.vd().getLoginResult().getRole_id())) {
         this.tq.setText("收摊");
         var9 = this;
         this.tq.setVisible((boolean)(2 ^ 3));
         this.ath.setVisible((boolean)(3 ^ 3));
         this.atk.setVisible((boolean)(--1));
      } else {
         this.tq.setText("购买");
         var9 = this;
         this.tq.setVisible((boolean)(--1));
         this.ath.setVisible((boolean)(3 & 5));
         this.atk.setVisible(false);
      }

      var9.ajc(var1);
      this.abr((Commodity)null);
      if (this.ve().m(this.ae()) == null) {
         this.ve().a(this.ae());
      }

   }

   public void z(long var1, JTextField var3) {
      if (var3 == this.ate) {
         if (this.auc != null && var1 > 0L) {
            Class681.j(this.atp[5 >> 3], this.auc.getMoney() * var1);
         } else {
            Class681.j(this.atp[3 ^ 3], 0L);
         }
      } else if (this.aub != null && var1 > 0L) {
         Class681.j(this.jc[3 & 4], this.aub.getMoney() * var1);
      } else {
         Class681.j(this.jc[3 >> 2], 0L);
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.aej.bl()) {
         this.o();
      }

   }

   public boolean aa(long var1, JTextField var3) {
      return (boolean)(--1);
   }

   public void p() {
      this.gw = 3 >> 2;
      this.as(this.gw);
      this.aai((StallNeedBean)null);
   }

   public void ajb(String var1, StringBuffer var2) {
      String var12 = null;
      String var4 = null;
      String var5 = null;
      int var6 = 3 ^ 3;
      int var7 = --1;
      long var8 = 0L;
      int var10 = 3 ^ 3;
      int var11 = 3 >> 2;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 != var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var11 + (4 ^ 5))) == -4 >> 2) {
            var3 = var1.length();
         }

         if (var10 == (2 ^ 3)) {
            var12 = var1.substring(var11, var3);
            var10000 = var3;
         } else if (var10 == --3) {
            var4 = var1.substring(var11, var3);
            var10000 = var3;
         } else if (var10 == --4) {
            var7 = Integer.parseInt(var1.substring(var11, var3));
            var10000 = var3;
         } else if (var10 == --5) {
            var8 = (long)var7 * Long.parseLong(var1.substring(var11, var3));
            var10000 = var3;
         } else if (var10 == (39 & 94)) {
            var5 = var1.substring(var11, var3);
            var10000 = var3;
         } else {
            if (var10 == (31 & 103) && var1.substring(var11, var3).startsWith("守护")) {
               var6 = --1;
            }

            var10000 = var3;
         }

         ++var10;
         var11 = var10000 + 1;
      }

      var2.append("#R");
      var2.append(var12);
      var2.append("　#G");
      var2.append(var4);
      var2.append("#W以#Y");
      var2.append(var8);
      var2.append("#W的价格出售了");
      if (var6 == 0) {
         var2.append("#G");
         var2.append(var7);
         var2.append("#W个#G");
         var2.append(var5);
      } else {
         var2.append("守护#G");
         var2.append(var5);
      }
   }

   public void s() {
      Class603 var1 = this.vc();

      int var2;
      for(int var10000 = var2 = 3 ^ 3; var10000 < this.atv.length; var10000 = var2) {
         StallBuyData var3 = this.atv[var2].akf != null ? var1.an(this.atv[var2].akf.getId()) : null;
         <undefinedtype> var4 = this.atv[var2];
         ++var2;
         var4.lb = this.ata.cp(var3);
      }

      StallBuyData var5 = this.auc != null ? var1.an(this.auc.getId()) : null;
      this.ata.bh(var5);
   }

   public void do(int var1) {
      if (var1 != 3 >> 1 || this.uw().gamePawn) {
         this.jf = var1;

         int var2;
         for(int var10000 = var2 = 3 ^ 3; var10000 < this.ahp.length; var10000 = var2) {
            this.ahp[var2].setKeep((boolean)(var2 == this.jf ? 2 ^ 3 : 0));
            ++var2;
         }

         if (var1 == 0) {
            this.atm.cc();
         }

         if (var1 == --1) {
            this.p();
         }

         this.aua.setVisible((boolean)(var1 == 0 ? 5 >> 2 : 0));
         this.ats.setVisible((boolean)(var1 == (4 ^ 5) ? 3 >> 1 : 0));
         this.asy.setVisible((boolean)(var1 == --2 ? 5 >> 2 : 0));
         this.d();
      }
   }

   public void aai(StallNeedBean var1) {
      Class9 var10000 = this;
      StallNeedBean var3 = var1;
      Class9 var4 = var10000;
      var4.auc = var3;
      var4.aix.c(3 >> 2, (Object)null);
      if (var3 != null) {
         Class681.j(var4.atp[3 & 5], var3.getMoney());
         var10000 = var4;
      } else {
         var4.atp[4 ^ 5].setText("");
         var10000 = var4;
      }

      var10000.ate.setText("");
      var4.d();
      StallBuyData var2 = var3 != null ? var4.vc().an(var3.getId()) : null;
      var4.ata.bh(var2);
   }

   public void dp(int var1) {
      if (var1 != 5 >> 1) {
         this.atd = var1;

         int var10000;
         int var2;
         for(var10000 = var2 = 3 ^ 3; var10000 < this.att.length; var10000 = var2) {
            this.att[var2].setKeep((boolean)(var2 == this.atd ? --1 : 0));
            ++var2;
         }

         var2 = 2 & 5;
         int var3;
         Commodity var4;
         if (var1 == 0) {
            for(var10000 = var3 = 3 & 4; var10000 < this.atx.getGoodstables().length; var10000 = var3) {
               if ((var4 = this.atx.getGoodstables()[var3]) != null) {
                  this.aud[var2++].abr(var4);
               }

               ++var3;
            }

            var10000 = var2;
         } else {
            if (var1 == 3 >> 1) {
               for(var10000 = var3 = 3 ^ 3; var10000 < this.atx.getPets().length; var10000 = var3) {
                  if ((var4 = this.atx.getPets()[var3]) != null) {
                     this.aud[var2++].abr(var4);
                  }

                  ++var3;
               }
            }

            var10000 = var2;
         }

         var3 = var10000;

         for(var10000 = var3; var10000 < this.aud.length; var10000 = var3) {
            this.aud[var3++].abr((Commodity)null);
         }

         this.d();
      }
   }

   public void as(int var1) {
      int var2 = (this.atx.getNeedNum() - --1) / this.atv.length;
      var1 = Math.max(2 & 5, var1);
      var1 = Math.min(var2, var1);
      var2 = 5 >> 3;
      int var5 = (var1 *= this.atv.length) + this.atv.length;
      List var4 = this.atx.getNeeds();
      int var3 = 3 >> 2;
      int var6 = var4 != null ? var4.size() : 0;

      int var10000;
      for(var10000 = var3; var10000 < var6 && var2 < var5; var10000 = var3) {
         StallNeedBean var7;
         if ((var7 = (StallNeedBean)var4.get(var3)).getNum() < var7.getTotal()) {
            if (var2 >= var1) {
               this.atv[var2 - var1].aai(var7);
            }

            ++var2;
         }

         ++var3;
      }

      for(var10000 = var3 = Math.max(var2, var1); var10000 < var5; var10000 = var3) {
         int var10001 = var3 - var1;
         ++var3;
         this.atv[var10001].aai((StallNeedBean)null);
      }

      this.s();
   }

   public void abr(Commodity var1) {
      if ((this.aub = var1) == null) {
         this.aob.c(3 & 4, (Object)null);
         this.jc[--1].setText("");
         this.ako.setText("");
         this.d();
      } else {
         Class9 var10000;
         if (var1.getGood() != null) {
            var10000 = this;
            this.aob.c(90 & 55, var1.getGood());
         } else {
            if (var1.getPet() != null) {
               this.aob.c(85 & 63, var1.getPet());
            }

            var10000 = this;
         }

         Class681.j(var10000.jc[3 & 5], var1.getMoney());
         this.ako.setText("1");
         this.d();
      }
   }

   public void d() {
      int var10000;
      int var1;
      Class9 var2;
      if (this.aub != null && this.jf == 0) {
         for(var10000 = var1 = 3 ^ 3; var10000 < this.aud.length; var10000 = var1) {
            if (this.aud[var1].akg != null && this.aud[var1].akg == this.aub) {
               this.bl.setBounds(this.aud[var1].getX() - (2 ^ 3), this.aud[var1].getY() - --1, this.aud[var1].getWidth() + (1 ^ 3), this.aud[var1].getHeight() + --2);
               this.bl.setVisible((boolean)(3 >> 1));
               return;
            }

            ++var1;
         }

         var2 = this;
      } else {
         if (this.auc != null && this.jf == (3 & 5)) {
            for(var10000 = var1 = 5 >> 3; var10000 < this.atv.length; var10000 = var1) {
               if (this.atv[var1].akf != null && this.atv[var1].akf == this.auc) {
                  this.bl.setBounds(this.atv[var1].getX() - (4 ^ 5), this.atv[var1].getY() - --1, this.atv[var1].getWidth() + (5 >> 1), this.atv[var1].getHeight() + (5 >> 1));
                  this.bl.setVisible((boolean)(--1));
                  return;
               }

               ++var1;
            }
         }

         var2 = this;
      }

      var2.bl.setVisible((boolean)(3 & 4));
   }

   public void y(int var1) {
      int var10;
      if (var1 == (23027 & 9981)) {
         if (this.atx.getId() != 0) {
            if (Class394.v(this.atx.getRoleid(), this.vd().getLoginResult().getRole_id())) {
               this.atx.setState(Class124.f);
               String var9 = Agreement.getSendTextAES("stall", Class695.b().toJson(this.atx));
               this.uw().d(var9);
               this.ve().n(this.ae());
            } else if (this.aub == null) {
               this.aej.f("你还没有选中商品");
            } else if (!this.aej.t()) {
               RoleData var8 = this.vd();
               if ((var10 = (int)this.amm.gl()) <= 0) {
                  this.aej.f("你购买数量为0");
               } else {
                  StallBuy var6;
                  String var7;
                  long var11;
                  int var10006;
                  if (this.aub.getGood() != null) {
                     if (var10 > this.aub.getGood().getUsetime()) {
                        this.aej.f("物品数量不足");
                     } else if ((var10 = var8.getGoodPackSum(this.aub.getGood().getType(), this.aub.getGood().getGoodsid(), var10)) <= 0) {
                        this.aej.f("你背包已满");
                     } else if ((var11 = (long)var10 * this.aub.getMoney()) > 0L && var11 <= var8.getLoginResult().getGold().longValue()) {
                        var6 = new StallBuy();
                        var10006 = 3 >> 2;
                        var6.setId(this.atx.getId());
                        var6.setType(var10006);
                        var6.setBuyid(this.aub.getGood().getRgid());
                        var6.setSum(var10);
                        var7 = Agreement.getSendTextAES("stallbuy", Class695.b().toJson(var6));
                        this.uw().d(var7);
                     } else {
                        this.aej.f("金钱不足");
                     }
                  } else if (this.aub.getPet() != null) {
                     if (var8.pets.size() >= (55 & 93)) {
                        this.aej.f("您的召唤兽可携带的数量已满！！！");
                     } else if ((var11 = this.aub.getMoney()) > 0L && var11 <= var8.getLoginResult().getGold().longValue()) {
                        var6 = new StallBuy();
                        int var10002 = --1;
                        var10006 = --1;
                        var6.setId(this.atx.getId());
                        var6.setType(var10006);
                        var6.setBuyid(this.aub.getPet().getSid());
                        var6.setSum(var10002);
                        var7 = Agreement.getSendTextAES("stallbuy", Class695.b().toJson(var6));
                        this.uw().d(var7);
                     } else {
                        this.aej.f("金钱不足");
                     }
                  } else {
                     this.aub.getLingbao();
                  }
               }
            }
         }
      } else if (var1 == (5110 & 27899)) {
         if (this.gw <= 0) {
            this.aej.f("当前是首页");
         } else {
            this.gw -= 3 >> 1;
            this.as(this.gw);
            this.d();
         }
      } else if (var1 == (19699 & 13311)) {
         var10 = (this.atx.getNeedNum() - (3 >> 1)) / this.atv.length;
         if (this.gw >= var10) {
            this.aej.f("当前是尾页");
         } else {
            this.gw += 5 >> 2;
            this.as(this.gw);
            this.d();
         }
      } else if (var1 == (30463 & 2548)) {
         if (!this.aej.t()) {
            if (this.auc == null) {
               this.aej.f("你没有选中的收购种类");
            } else {
               int var2;
               if ((var2 = (int)this.atn.gl()) <= 0) {
                  this.aej.f("你出售数量为0");
               } else {
                  Goodstable var3;
                  if ((var3 = (Goodstable)this.aix.hr()) != null) {
                     var3 = this.vd().getGood(var3.getRgid());
                  }

                  if (var3 == null) {
                     this.aej.f("你没有选中的物品");
                  } else {
                     StallBuy var4 = new StallBuy();
                     int var10008 = --3;
                     var4.setId(this.atx.getId());
                     var4.setType(var10008);
                     var4.setSoldId(this.auc.getId());
                     var4.setBuyid(var3.getRgid());
                     var4.setSum(var2);
                     String var5 = Agreement.getSendTextAES("stallbuy", Class695.b().toJson(var4));
                     this.uw().d(var5);
                  }
               }
            }
         }
      } else {
         if (var1 == (27638 & 5369)) {
            Class658.cy(21247 & 11701, this.aej);
         }

      }
   }

   public void ajc(Stall var1) {
      int var4 = var1 != null ? var1.getId() : 0;
      if (var4 == 0) {
         this.atu.setTextSize("", 30719 & 2333);
      } else {
         List var6 = var1.getMsg();
         List var8 = var1.getMsg2();
         int var2;
         StringBuffer var3;
         int var5;
         int var9;
         List var10;
         Object var10001;
         if (var6 != null) {
            var3 = new StringBuffer((2295 & 30600) * var6.size());
            var2 = 3 ^ 3;
            var5 = var6.size();

            for(var9 = var2; var9 < var5; var9 = var2) {
               if (var3.length() != 0) {
                  var3.append("#r");
               }

               var10001 = var6.get(var2);
               ++var2;
               this.ajd((String)var10001, var3);
            }

            this.atu.setTextSize(var3.toString(), 27519 & 5533);
            JScrollBar var7 = this.atw.getVerticalScrollBar();
            var10 = var8;
            var7.setMaximum(this.atu.getHeight());
            var7.setValue(var7.getMaximum());
         } else {
            this.atu.setTextSize("", 2431 & 30621);
            var10 = var8;
         }

         if (var10 != null) {
            var3 = new StringBuffer((18373 & 14522) * var8.size());
            var2 = 2 & 5;
            var5 = var8.size();

            for(var9 = var2; var9 < var5; var9 = var2) {
               if (var3.length() != 0) {
                  var3.append("#r");
               }

               var10001 = var8.get(var2);
               ++var2;
               this.ajb((String)var10001, var3);
            }

            this.ato.setTextSize(var3.toString(), 22815 & 10237);
            JScrollBar var11 = this.atl.getVerticalScrollBar();
            var11.setMaximum(this.ato.getHeight());
            var11.setValue(var11.getMaximum());
         } else {
            this.ato.setTextSize("", 285 & 32767);
         }
      }
   }

   public void ajd(String var1, StringBuffer var2) {
      String var12 = null;
      String var4 = null;
      String var5 = null;
      int var6 = 3 ^ 3;
      int var7 = --1;
      long var8 = 0L;
      int var10 = 3 ^ 3;
      int var11 = 5 >> 3;

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 != var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var11 + (4 ^ 5))) == -4 >> 2) {
            var3 = var1.length();
         }

         if (var10 == (2 ^ 3)) {
            var12 = var1.substring(var11, var3);
            var10000 = var3;
         } else if (var10 == --3) {
            var4 = var1.substring(var11, var3);
            var10000 = var3;
         } else if (var10 == --4) {
            var7 = Integer.parseInt(var1.substring(var11, var3));
            var10000 = var3;
         } else if (var10 == --5) {
            var8 = (long)var7 * Long.parseLong(var1.substring(var11, var3));
            var10000 = var3;
         } else if (var10 == (30 & 103)) {
            var5 = var1.substring(var11, var3);
            var10000 = var3;
         } else {
            if (var10 == (95 & 39) && var1.substring(var11, var3).startsWith("守护")) {
               var6 = 2 ^ 3;
            }

            var10000 = var3;
         }

         ++var10;
         var11 = var10000 + 1;
      }

      var2.append("#R");
      var2.append(var12);
      var2.append("　#G");
      var2.append(var4);
      var2.append("#W花费#Y");
      var2.append(var8);
      var2.append("#W的价格购买了");
      if (var6 == 0) {
         var2.append("#G");
         var2.append(var7);
         var2.append("#W个#G");
         var2.append(var5);
      } else {
         var2.append("守护#G");
         var2.append(var5);
      }
   }

   public void ew(Goodstable var1, int var2) {
      this.aix.c(5 >> 2, var1);
      this.ate.setText(String.valueOf(var2));
   }

   public void fm(StallBean var1) {
      if (this.atx != null && this.atx.getId() == var1.getId()) {
         this.ve().n(this.ae());
      }

   }

   public Class9(GameView var1) {
      int var10001 = --3;
      int var10005 = -4 >> 2;
      int var10007 = 3 >> 2;
      super(14301 & 18619, --2, Class345.aef, var1);
      this.gw = var10007;
      this.va(var10005, 2 & 5, 1791 & 31668, 20987 & 12271, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 127 & 68, 127 & 68, 127 & 68, 127 & 68, (boolean)(2 & 5)), "查看出售");
      Class322[] var6 = new Class322[var10001];
      boolean var10003 = true;
      this.ahp = var6;

      int var2;
      Class322[] var5;
      Font var15;
      int var10000;
      Class322 var10002;
      int var10006;
      String var10009;
      Class9 var10010;
      for(var10000 = var2 = 3 >> 2; var10000 < this.ahp.length; var10000 = var2) {
         var5 = this.ahp;
         var10002 = new Class322;
         var10005 = 5 >> 1;
         var10006 = (30711 & 2287) + var2;
         var15 = Class681.cf;
         Color[] var10008 = Class681.c;
         if (var2 == 0) {
            var10009 = "出售";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "收购";
            var10010 = this;
         } else if (var2 == (1 ^ 3)) {
            var10009 = "交易记录";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/72.png", var10005, var10006, var15, var10008, var10009, var10010);
         var5[var2] = var10002;
         this.ahp[var2].setOffsetTexts(Class681.bv);
         this.ahp[var2].setBounds((63 & 125) + (125 & 94) * var2, 95 & 47, 117 & 95, 43 & 117);
         this.add(this.ahp[var2++]);
      }

      this.aty = Class133.a(32083 & 1020, 55 & 94, 11959 & 20991, 59 & 87, 127 & 10, Color.white, Class681.ab);
      this.aty.eq(Class511.q("sc/d/17.png", 22 & 111, 22 & 111, 22 & 111, 22 & 111, (boolean)(3 ^ 3)));
      this.add(this.aty);
      this.bl = new Class436(Class511.q("sc/d/90.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.add(this.bl);
      this.atk = new Class322("sc/e/31.png", --1, 240, Class681.ak, Class681.c, "吆喝", this);
      this.atk.setBounds(530, 17, 79, 25);
      this.add(this.atk);
      if (!this.uw().gamePawn) {
         this.atk.setVisible((boolean)(3 ^ 3));
      }

      var10001 = --3;
      this.aua = new JComponent() {
      };
      this.ats = new JComponent() {
      };
      this.asy = new JComponent() {
      };
      this.aua.setBounds(3 & 4, 3 & 4, 692, 491);
      this.ats.setBounds(5 >> 3, 5 >> 3, 692, 491);
      this.asy.setBounds(2 & 5, 2 & 5, 692, 491);
      this.add(this.aua);
      this.add(this.ats);
      this.add(this.asy);
      var6 = new Class322[var10001];
      var10003 = true;
      this.att = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.att.length; var10000 = var2) {
         var5 = this.att;
         var10002 = new Class322;
         var10005 = 1 ^ 3;
         var10006 = 236 + var2;
         var15 = Class681.cw;
         if (var2 == 0) {
            var10009 = "道具";
            var10010 = this;
         } else if (var2 == --1) {
            var10009 = "召唤兽";
            var10010 = this;
         } else if (var2 == --2) {
            var10009 = "灵宝";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/61.png", var10005, var10006, var15, (Color[])null, var10009, var10010);
         var5[var2] = var10002;
         this.att[var2].setOffsetTexts(Class681.cl);
         this.att[var2].setBounds(59 + 92 * var2, 53, 90, 24);
         this.aua.add(this.att[var2++]);
      }

      var10001 = --4;
      this.att[--2].setVisible((boolean)(2 & 5));
      this.tq = new Class322("sc/e/31.png", --1, 241, Class681.ak, Class681.c, "购买", this);
      this.tq.setBounds(525, 433, 79, 25);
      this.aua.add(this.tq);
      JLabel[] var8 = new JLabel[var10001];
      var10003 = true;
      this.atq = var8;

      for(var10000 = var2 = 3 & 4; var10000 < this.atq.length; var10000 = var2) {
         this.atq[var2] = Class133.b(162 + var2 % (1 ^ 3) * 169, 424 + var2 / --2 * 27, 36, 19, Color.black, Class681.ak);
         this.atq[var2].setText(var2 == 0 ? "数量" : (var2 == --1 ? "总价" : (var2 == --2 ? "单价" : (var2 == --3 ? "现金" : ""))));
         this.atq[var2].setHorizontalAlignment(10);
         this.aua.add(this.atq[var2++]);
      }

      var10001 = 1 ^ 3;
      this.ako = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)), Class681.q, Color.white);
      this.ako.setBounds(198, 424, 114, 19);
      this.aua.add(this.ako);
      this.amm = new Class319(15, this.ako, this);
      Class245[] var10 = new Class245[var10001];
      var10003 = true;
      this.jc = var10;

      Class9 var9;
      for(var10000 = var2 = 5 >> 3; var10000 < this.jc.length; var10000 = var2) {
         this.jc[var2] = Class133.a(0, 0, 0, 0, 10, Color.white, Class681.q);
         this.jc[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
         if (var2 == 0) {
            var9 = this;
            this.jc[var2].setBounds(367, 424, 114, 19);
         } else {
            if (var2 == 1) {
               this.jc[var2].setBounds(198, 451, 114, 19);
            }

            var9 = this;
         }

         var9.aua.add(this.jc[var2++]);
      }

      this.atr = new MoneyType();
      this.atr.setIdAndKey(1, "金钱");
      this.atm = Class133.m(367, 451, 114, 19, 10, Color.white, Class681.q, this.atr, var1);
      this.atm.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
      this.atm.ab(5 >> 1);
      this.aua.add(this.atm);
      <undefinedtype>[] var11 = new <undefinedtype>[24];
      var10003 = true;
      this.aud = var11;

      for(var10000 = var2 = 0; var10000 < this.aud.length; var10000 = var2) {
         this.aud[var2] = new MouseListener(var2, false) {
            private Class44 aix;
            private boolean cb;
            private JLabel bs;
            private StallNeedBean akf;
            private int gw;
            private Class245 pu;
            private Class436 uc;
            private boolean lb;
            private Commodity akg;
            private JLabel rk;
            private <undefinedtype> afe;

            public void aai(StallNeedBean var1) {
               int var10002 = 3 ^ 3;
               this.akf = var1;
               this.lb = (boolean)var10002;
               int var10001;
               if (var1 == null) {
                  var10001 = 2 & 5;
                  this.aix.c(3 ^ 3, (Object)null);
                  this.setVisible((boolean)var10001);
               } else {
                  StallBuyData var2 = Class9.this.vc().an(var1.getId());
                  this.aix.c(31 & 121, var1);
                  this.rk.setText(String.valueOf(var1.getTotal() - var1.getNum()));
                  this.bs.setText(var2 != null ? var2.getName() : "未知物品");
                  var10001 = 5 >> 2;
                  Class681.j(this.pu, var1.getMoney());
                  this.setVisible((boolean)var10001);
               }
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void abr(Commodity var1) {
               this.akg = var1;
               if (this.akg == null) {
                  int var10001 = 3 & 4;
                  this.aix.c(2 & 5, (Object)null);
                  this.setVisible((boolean)var10001);
               } else {
                  Class681.j(this.pu, var1.getMoney());
                  <undefinedtype> var10000;
                  if (var1.getGood() != null) {
                     this.aix.c(30 & 115, var1.getGood());
                     this.rk.setText(GoodType.ag(var1.getGood().getType()) ? var1.getGood().getUsetime().toString() : "");
                     int var10002 = 57 & 119;
                     var10000 = this;
                     this.bs.setText(var1.getGood().getGoodsname());
                     this.rk.setForeground(Color.white);
                     this.rk.setHorizontalAlignment(47 & 90);
                     this.bs.setFont(Class681.q);
                     this.rk.setBounds(26 & 109, 26 & 109, 106 & 61, 30 & 111);
                     this.bs.setBounds(119 & 63, 71 & 63, 126 & 121, 50 & 95);
                     this.pu.setBounds(126 & 55, 123 & 28, 86 & 127, 31 & 115);
                     this.aix.setBounds(15 & 119, 15 & 119, 127 & 40, 127 & 40);
                     this.uc.fw("sc/d/81.png");
                     this.uc.eq((Class604)null);
                     this.uc.setBounds(--5, --5, 44, 44);
                     this.setBounds(var10002 + 151 * (this.gw % --4), 82 + 55 * (this.gw / --4), 148, 54);
                  } else {
                     if (var1.getPet() != null) {
                        this.aix.c(21, var1.getPet());
                        this.rk.setText(Class224.t(var1.getPet().getGrade()) + "级");
                        this.bs.setText(var1.getPet().getSummoningname());
                        this.rk.setForeground(Color.black);
                        this.rk.setHorizontalAlignment(--4);
                        this.bs.setFont(Class681.ak);
                        this.rk.setBounds(200, 15, 80, 19);
                        this.bs.setBounds(78, 15, 150, 19);
                        this.pu.setBounds(78, 43, 205, 19);
                        this.aix.setBounds(13, 11, 53, 53);
                        this.uc.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(2 & 5)));
                        this.uc.q();
                        this.uc.setBounds(9, 7, 61, 61);
                        this.setBounds(49 + 303 * (this.gw % --2), 85 + 82 * (this.gw / (5 >> 1)), 300, 76);
                     }

                     var10000 = this;
                  }

                  var10000.setVisible(true);
               }
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
               if (this.cb) {
                  Class9.this.aai(this.akf);
               } else {
                  Class9.this.abr(this.akg);
               }
            }

            protected void paintChildren(Graphics var1) {
               super.paintChildren(var1);
               if (this.lb) {
                  if (Class9.atb == null) {
                     Class9.atb = Class330.s("sc/mouse/flicker2.tcp", (short[])null);
                  }

                  Class9.atb.d(Class280.l(), 3 ^ 3);
                  Class9.atb.aa(var1, --4, --5);
               }

            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
            }

            public {
               int var10005 = 5 >> 3;
               int var10007 = 3 >> 2;
               int var10009 = 3 >> 2;
               this.afe = this;
               this.gw = var2;
               this.cb = var3;
               this.rk = Class133.c(var10009, 3 >> 2, 3 >> 2, 3 >> 2, 59 & 78, Color.black, Class681.ab);
               this.bs = Class133.c(var10007, 3 >> 2, 3 >> 2, 3 >> 2, 78 & 59, Color.black, Class681.ak);
               this.pu = Class133.a(var10005, 5 >> 3, 5 >> 3, 5 >> 3, 15 & 122, Color.white, Class681.q);
               this.pu.eq(Class511.q("sc/d/17.png", 38 & 95, 38 & 95, 38 & 95, 38 & 95, (boolean)(5 >> 3)));
               this.aix = new Class44(Class9.this.gk()) {
                  public void af(MouseEvent var1) {
                     afe.mouseReleased(var1);
                  }
               };
               Class436 var10003 = new Class436;
               if (var3) {
                  ;
               }

               this.uc = var10003;
               if (var3) {
                  this.rk.setForeground(Color.white);
                  this.rk.setHorizontalAlignment(91 & 46);
                  this.bs.setForeground(Color.black);
                  this.bs.setFont(Class681.bm);
                  this.bs.setHorizontalAlignment(42 & 95);
                  this.aix.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
                  this.aix.ad(Class44.aqx);
                  this.aix.gt((boolean)(2 & 5));
                  this.aix.setBounds(61 & 74, --5, 63 & 111, 63 & 109);
                  this.rk.setBounds(46 & 95, 127 & 11, 105 & 62, 46 & 95);
                  this.bs.setBounds(59 & 127, 75 & 62, 132, 14);
                  this.pu.setBounds(57, 29, 134, 19);
                  this.uc.setBounds(3 ^ 3, 3 ^ 3, 200, 56);
               }

               this.add(this.rk);
               this.add(this.bs);
               this.add(this.aix);
               this.add(this.pu);
               this.add(this.uc);
               this.addMouseListener(this);
            }
         };
         this.aua.add(this.aud[var2++]);
      }

      this.atf = new Class436(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
      this.atf.setBounds(44, 77, 612, 338);
      this.aua.add(this.atf);
      this.aob = new Class44(this);
      this.aob.setBounds(101, 424, 46, 46);
      this.aua.add(this.aob);
      this.atj = new Class436(Class511.q("sc/d/81.png", 5, 5, 5, 5, false));
      this.atj.setBounds(99, 422, 50, 50);
      this.aua.add(this.atj);
      this.jj = new Class322("sc/e/47.png", 1, 242, this);
      this.tc = new Class322("sc/e/48.png", 1, 243, this);
      this.ath = new Class322("sc/e/31.png", 1, 244, Class681.ak, Class681.c, "出售", this);
      this.jj.setBounds(655, 267, 18, 18);
      this.tc.setBounds(655, 309, 18, 18);
      this.ath.setBounds(525, 433, 79, 25);
      this.ats.add(this.jj);
      this.ats.add(this.tc);
      this.ats.add(this.ath);
      var8 = new JLabel[6];
      var10003 = true;
      this.ati = var8;

      for(var10000 = var2 = 0; var10000 < this.ati.length; var10000 = var2) {
         this.ati[var2] = Class133.b(44, 53, 612, 21, Color.white, Class681.ak);
         this.ati[var2].setText(var2 == 0 ? "正在收购的物品" : (var2 == 1 ? "可以出售的物品" : (var2 == 2 ? "数量" : (var2 == 3 ? "总价" : (var2 == 4 ? "单价" : (var2 == 5 ? "现金" : ""))))));
         this.ati[var2].setHorizontalAlignment(0);
         if (var2 == 1) {
            var9 = this;
            this.ati[var2].setBounds(44, 333, 612, 21);
         } else {
            if (var2 >= 2 && var2 <= 5) {
               this.ati[var2].setHorizontalAlignment(10);
               this.ati[var2].setBounds(162 + (var2 - 2) % 2 * 169, 424 + (var2 - 2) / 2 * 27, 36, 19);
               this.ati[var2].setForeground(Color.black);
            }

            var9 = this;
         }

         var9.ats.add(this.ati[var2++]);
      }

      this.ate = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, false), Class681.q, Color.white);
      this.ate.setBounds(198, 424, 114, 19);
      this.ats.add(this.ate);
      this.atn = new Class319(15, this.ate, this);
      var10 = new Class245[2];
      var10003 = true;
      this.atp = var10;

      for(var10000 = var2 = 0; var10000 < this.jc.length; var10000 = var2) {
         this.atp[var2] = Class133.a(0, 0, 0, 0, 10, Color.white, Class681.q);
         this.atp[var2].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
         if (var2 == 0) {
            var9 = this;
            this.atp[var2].setBounds(367, 424, 114, 19);
         } else {
            if (var2 == 1) {
               this.atp[var2].setBounds(198, 451, 114, 19);
            }

            var9 = this;
         }

         var9.ats.add(this.atp[var2++]);
      }

      this.jh = Class133.m(367, 451, 114, 19, 10, Color.white, Class681.q, this.atr, var1);
      this.jh.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, false));
      this.jh.ab(2);
      this.ats.add(this.jh);
      this.aix = new Class44(this);
      this.aix.setBounds(101, 424, 46, 46);
      this.ats.add(this.aix);
      this.asz = new Class436(Class511.q("sc/d/81.png", 5, 5, 5, 5, false));
      this.asz.setBounds(99, 422, 50, 50);
      this.ats.add(this.asz);
      var11 = new <undefinedtype>[12];
      var10003 = true;
      this.atv = var11;

      for(var10000 = var2 = 0; var10000 < this.atv.length; var10000 = var2) {
         this.atv[var2] = new MouseListener(var2, true) {
            private Class44 aix;
            private boolean cb;
            private JLabel bs;
            private StallNeedBean akf;
            private int gw;
            private Class245 pu;
            private Class436 uc;
            private boolean lb;
            private Commodity akg;
            private JLabel rk;
            private <undefinedtype> afe;

            public void aai(StallNeedBean var1) {
               int var10002 = 3 ^ 3;
               this.akf = var1;
               this.lb = (boolean)var10002;
               int var10001;
               if (var1 == null) {
                  var10001 = 2 & 5;
                  this.aix.c(3 ^ 3, (Object)null);
                  this.setVisible((boolean)var10001);
               } else {
                  StallBuyData var2 = Class9.this.vc().an(var1.getId());
                  this.aix.c(31 & 121, var1);
                  this.rk.setText(String.valueOf(var1.getTotal() - var1.getNum()));
                  this.bs.setText(var2 != null ? var2.getName() : "未知物品");
                  var10001 = 5 >> 2;
                  Class681.j(this.pu, var1.getMoney());
                  this.setVisible((boolean)var10001);
               }
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public void abr(Commodity var1) {
               this.akg = var1;
               if (this.akg == null) {
                  int var10001 = 3 & 4;
                  this.aix.c(2 & 5, (Object)null);
                  this.setVisible((boolean)var10001);
               } else {
                  Class681.j(this.pu, var1.getMoney());
                  <undefinedtype> var10000;
                  if (var1.getGood() != null) {
                     this.aix.c(30 & 115, var1.getGood());
                     this.rk.setText(GoodType.ag(var1.getGood().getType()) ? var1.getGood().getUsetime().toString() : "");
                     int var10002 = 57 & 119;
                     var10000 = this;
                     this.bs.setText(var1.getGood().getGoodsname());
                     this.rk.setForeground(Color.white);
                     this.rk.setHorizontalAlignment(47 & 90);
                     this.bs.setFont(Class681.q);
                     this.rk.setBounds(26 & 109, 26 & 109, 106 & 61, 30 & 111);
                     this.bs.setBounds(119 & 63, 71 & 63, 126 & 121, 50 & 95);
                     this.pu.setBounds(126 & 55, 123 & 28, 86 & 127, 31 & 115);
                     this.aix.setBounds(15 & 119, 15 & 119, 127 & 40, 127 & 40);
                     this.uc.fw("sc/d/81.png");
                     this.uc.eq((Class604)null);
                     this.uc.setBounds(--5, --5, 44, 44);
                     this.setBounds(var10002 + 151 * (this.gw % --4), 82 + 55 * (this.gw / --4), 148, 54);
                  } else {
                     if (var1.getPet() != null) {
                        this.aix.c(21, var1.getPet());
                        this.rk.setText(Class224.t(var1.getPet().getGrade()) + "级");
                        this.bs.setText(var1.getPet().getSummoningname());
                        this.rk.setForeground(Color.black);
                        this.rk.setHorizontalAlignment(--4);
                        this.bs.setFont(Class681.ak);
                        this.rk.setBounds(200, 15, 80, 19);
                        this.bs.setBounds(78, 15, 150, 19);
                        this.pu.setBounds(78, 43, 205, 19);
                        this.aix.setBounds(13, 11, 53, 53);
                        this.uc.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(2 & 5)));
                        this.uc.q();
                        this.uc.setBounds(9, 7, 61, 61);
                        this.setBounds(49 + 303 * (this.gw % --2), 85 + 82 * (this.gw / (5 >> 1)), 300, 76);
                     }

                     var10000 = this;
                  }

                  var10000.setVisible(true);
               }
            }

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseReleased(MouseEvent var1) {
               if (this.cb) {
                  Class9.this.aai(this.akf);
               } else {
                  Class9.this.abr(this.akg);
               }
            }

            protected void paintChildren(Graphics var1) {
               super.paintChildren(var1);
               if (this.lb) {
                  if (Class9.atb == null) {
                     Class9.atb = Class330.s("sc/mouse/flicker2.tcp", (short[])null);
                  }

                  Class9.atb.d(Class280.l(), 3 ^ 3);
                  Class9.atb.aa(var1, --4, --5);
               }

            }

            public void mousePressed(MouseEvent var1) {
            }

            public void mouseClicked(MouseEvent var1) {
            }

            public {
               int var10005 = 5 >> 3;
               int var10007 = 3 >> 2;
               int var10009 = 3 >> 2;
               this.afe = this;
               this.gw = var2;
               this.cb = var3;
               this.rk = Class133.c(var10009, 3 >> 2, 3 >> 2, 3 >> 2, 59 & 78, Color.black, Class681.ab);
               this.bs = Class133.c(var10007, 3 >> 2, 3 >> 2, 3 >> 2, 78 & 59, Color.black, Class681.ak);
               this.pu = Class133.a(var10005, 5 >> 3, 5 >> 3, 5 >> 3, 15 & 122, Color.white, Class681.q);
               this.pu.eq(Class511.q("sc/d/17.png", 38 & 95, 38 & 95, 38 & 95, 38 & 95, (boolean)(5 >> 3)));
               this.aix = new Class44(Class9.this.gk()) {
                  public void af(MouseEvent var1) {
                     afe.mouseReleased(var1);
                  }
               };
               Class436 var10003 = new Class436;
               if (var3) {
                  ;
               }

               this.uc = var10003;
               if (var3) {
                  this.rk.setForeground(Color.white);
                  this.rk.setHorizontalAlignment(91 & 46);
                  this.bs.setForeground(Color.black);
                  this.bs.setFont(Class681.bm);
                  this.bs.setHorizontalAlignment(42 & 95);
                  this.aix.eq(Class511.q("sc/d/4.png", --5, --5, --5, --5, (boolean)(5 >> 3)));
                  this.aix.ad(Class44.aqx);
                  this.aix.gt((boolean)(2 & 5));
                  this.aix.setBounds(61 & 74, --5, 63 & 111, 63 & 109);
                  this.rk.setBounds(46 & 95, 127 & 11, 105 & 62, 46 & 95);
                  this.bs.setBounds(59 & 127, 75 & 62, 132, 14);
                  this.pu.setBounds(57, 29, 134, 19);
                  this.uc.setBounds(3 ^ 3, 3 ^ 3, 200, 56);
               }

               this.add(this.rk);
               this.add(this.bs);
               this.add(this.aix);
               this.add(this.pu);
               this.add(this.uc);
               this.addMouseListener(this);
            }
         };
         this.atv[var2].setBounds(47 + var2 % 3 * 203, 82 + var2 / 3 * 61, 200, 56);
         this.ats.add(this.atv[var2++]);
      }

      Class216[] var16 = new Class216[2];
      boolean var14 = true;
      Class216[] var4 = var16;

      int var3;
      for(var10000 = var3 = 0; var10000 < var4.length; var10000 = var3) {
         var4[var3] = new Class216(var3 == 0 ? "sc/e/47.png" : "sc/e/48.png", 1, var3, this);
         var4[var3].setBounds(655, 354 + 42 * var3, 18, 18);
         this.ats.add(var4[var3++]);
      }

      this.ata = new Class6(this, 10, 1, 60, 60, 1, 1, 45, 353);
      this.ata.hf(Class511.a("sc/d/4.png"));
      this.ata.aix(var4, 1);
      this.ats.add(this.ata);
      Class436[] var13 = new Class436[4];
      var10003 = true;
      this.atg = var13;

      for(var10000 = var3 = 0; var10000 < this.atg.length; var10000 = var3) {
         label289: {
            this.atg[var3] = new Class436();
            if (var3 >= 0 && var3 <= 1) {
               this.atg[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
               if (var3 == 0) {
                  var9 = this;
                  this.atg[var3].setBounds(44, 53, 612, 21);
                  break label289;
               }

               if (var3 == 1) {
                  var9 = this;
                  this.atg[var3].setBounds(44, 333, 612, 21);
                  break label289;
               }
            } else if (var3 >= 2 && var3 <= 3) {
               this.atg[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
               if (var3 == 2) {
                  var9 = this;
                  this.atg[var3].setBounds(44, 53, 612, 274);
                  break label289;
               }

               if (var3 == 3) {
                  this.atg[var3].setBounds(44, 333, 612, 80);
               }
            }

            var9 = this;
         }

         var9.ats.add(this.atg[var3++]);
      }

      var8 = new JLabel[2];
      var10003 = true;
      this.atc = var8;

      for(var10000 = var3 = 0; var10000 < this.atc.length; var10000 = var3) {
         this.atc[var3] = Class133.b(42 + 305 * var3, 54, 305, 21, Color.white, Class681.ak);
         this.atc[var3].setText(var3 == 0 ? "出售记录" : (var3 == 1 ? "收购记录" : ""));
         this.atc[var3].setHorizontalAlignment(0);
         this.asy.add(this.atc[var3++]);
      }

      this.atu = new RichLabel("", Class681.ce);
      this.ato = new RichLabel("", Class681.ce);
      this.atw = Class133.f(45, 74, 301, 375, this.atu, 20);
      this.atl = Class133.f(350, 74, 301, 375, this.ato, 20);
      this.asy.add(this.atw);
      this.asy.add(this.atl);
      var13 = new Class436[4];
      var10003 = true;
      this.aad = var13;

      for(var10000 = var3 = 0; var10000 < this.aad.length; var10000 = var3) {
         this.aad[var3] = new Class436();
         if (var3 == 0) {
            var9 = this;
            this.aad[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
            this.aad[var3].setBounds(42, 54, 305, 21);
         } else if (var3 == 1) {
            var9 = this;
            this.aad[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
            this.aad[var3].setBounds(347, 54, 305, 21);
         } else if (var3 == 2) {
            var9 = this;
            this.aad[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.aad[var3].setBounds(42, 54, 305, 397);
         } else {
            if (var3 == 3) {
               this.aad[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
               this.aad[var3].setBounds(347, 54, 305, 397);
            }

            var9 = this;
         }

         var9.asy.add(this.aad[var3++]);
      }

      this.atz = new Class436(Class511.q("sc/d/35.png", 80, 10, 80, 10, false));
      this.atz.setBounds(35, 29, 611, 20);
      this.add(this.atz);
   }
}
