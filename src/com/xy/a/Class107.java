package com.xy.a;

import com.xy.bean.Commodity;
import com.xy.bean.Stall;
import com.xy.bean.StallBean;
import com.xy.bean.StallBuy;
import com.xy.bean.StallNeedBean;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.StallBuyData;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class107 extends com.xy.q.Class30 {
   private Class15[] anh;
   private com.xy.q.Class14 ani;
   private JScrollPane anj;
   private Stall ank;
   private com.xy.w.Class18 anl;
   private com.xy.w.Class18 anm;
   private JComponent ann;
   private JLabel[] ano;
   private com.xy.q.Class14[] anp;
   private com.xy.q.Class54 anq;
   private com.xy.i.Class18 aea;
   public static com.xy.w.Class1 anr;
   private JScrollPane ans;
   private com.xy.q.Class52 ant;
   private com.xy.i.Class18[] anu;
   private com.xy.q.Class36 anv;
   private com.xy.q.Class52 anw;
   private com.xy.i.Class18 anx;
   private int any;
   public com.xy.q.Class43 anz;
   private com.xy.w.Class18 aek;
   private JLabel[] aoa;
   private com.xy.w.Class18 aob;
   private RichLabel aoc;
   private int aod;
   private com.xy.q.Class36 aoe;
   private JComponent aof;
   private MoneyType aog;
   private com.xy.w.Class18[] aoh;
   private StallNeedBean aoi;
   private Class15[] aoj;
   private com.xy.i.Class18 aok;
   private RichLabel aol;
   private com.xy.q.Class14[] dx;
   private com.xy.q.Class27 aom;
   private com.xy.w.Class18[] zv;
   private com.xy.w.Class18 kh;
   private com.xy.i.Class18 aon;
   private JComponent ahn;
   private com.xy.i.Class18 aoo;
   private com.xy.i.Class18[] aop;
   private JLabel[] r;
   private com.xy.q.Class54 vo;
   private Commodity aoq;
   private int eg;
   private com.xy.q.Class27 gd;

   public void agq(String var1, StringBuffer var2) {
      String var3 = null;
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      int var7 = 1;
      long var8 = 0L;
      int var10 = 0;
      int var11 = 0;
      int var12;
      int var10000 = var12 = 0;

      while (var10000 != var1.length()) {
         String var10001 = "M";
         if ((var12 = var1.indexOf("|", var11 + 1)) == -1) {
            var12 = var1.length();
         }

         if (var10 == 1) {
            var3 = var1.substring(var11, var12);
            var10000 = var12;
         } else if (var10 == 3) {
            var4 = var1.substring(var11, var12);
            var10000 = var12;
         } else if (var10 == 4) {
            var7 = Integer.parseInt(var1.substring(var11, var12));
            var10000 = var12;
         } else if (var10 == 5) {
            var8 = var7 * Long.parseLong(var1.substring(var11, var12));
            var10000 = var12;
         } else if (var10 == 6) {
            var5 = var1.substring(var11, var12);
            var10000 = var12;
         } else {
            if (var10 == 7) {
               String var15 = var1.substring(var11, var12);
               var10001 = "寨抐";
               if (var15.startsWith("守护")) {
                  var6 = true;
               }
            }

            var10000 = var12;
         }

         var10++;
         var11 = var10000 + 1;
         var10000 = var12;
      }

      String var10002 = "Nc";
      var2.append("#R");
      var2.append(var3);
      String var10004 = "〴Cs";
      var2.append("　#G");
      var2.append(var4);
      String var10006 = "\u0012:仔Nh";
      var2.append("#W以#Y");
      var2.append(var8);
      String var10008 = "Cc盤仃桜凎啎亲";
      var2.append("#W的价格出售了");
      if (!var6) {
         String var18 = "Nv";
         var2.append("#G");
         var2.append(var7);
         String var10003 = "\u00177丞Cs";
         var2.append("#W个#G");
         var2.append(var5);
      } else {
         String var17 = "寥投Nv";
         var2.append("守护#G");
         var2.append(var5);
      }
   }

   public void agr(StallBean var1) {
      if (this.ank != null && this.ank.getId() == var1.getId()) {
         this.zc().f(this.lj());
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         this.f();
      }
   }

   public void lm(int var1) {
      if (var1 == 241) {
         if (this.ank.getId() != 0) {
            if (com.xy.v.Class12.x(this.ank.getRoleid(), this.yx().getLoginResult().getRole_id())) {
               this.ank.setState(com.xy.d.Class3.r);
               String var9 = Agreement.getSendTextAES("stall", com.xy.v.Class31.a().toJson(this.ank));
               this.za().k(var9);
               this.zc().f(this.lj());
            } else if (this.aoq == null) {
               String var27 = "伀迬況朽適丙唦哵";
               this.afx._do("你还没有选中商品");
            } else if (!this.afx.ah()) {
               RoleData var8 = this.yx();
               int var11;
               if ((var11 = (int)this.aom.ee()) <= 0) {
                  String var26 = "佑赀乁攝釾乗\u0001";
                  this.afx._do("你购买数量为0");
               } else if (this.aoq.getGood() != null) {
                  if (var11 > this.aoq.getGood().getUsetime()) {
                     String var25 = "爉哵攐釻乭趇";
                     this.afx._do("物品数量不足");
                  } else if ((var11 = var8.getGoodPackSum(this.aoq.getGood().getType(), this.aoq.getGood().getGoodsid(), var11)) <= 0) {
                     String var24 = "佑股匴嶟滐";
                     this.afx._do("你背包已满");
                  } else {
                     long var14;
                     if ((var14 = var11 * this.aoq.getMoney()) > 0L && var14 <= var8.getLoginResult().getGold().longValue()) {
                        StallBuy var15 = new StallBuy();
                        var15.setId(this.ank.getId());
                        var15.setType(0);
                        var15.setBuyid(this.aoq.getGood().getRgid());
                        var15.setSum(var11);
                        String var16 = Agreement.getSendTextAES("stallbuy", com.xy.v.Class31.a().toJson(var15));
                        this.za().k(var16);
                     } else {
                        String var23 = "醱钅乭趇";
                        this.afx._do("金钱不足");
                     }
                  }
               } else if (this.aoq.getPet() != null) {
                  if (var8.pets.size() >= 21) {
                     String var22 = "情皵厁唕儐叞摗帗盩敁醢巃溌ＰｬＰ";
                     this.afx._do("您的召唤兽可携带的数量已满！！！");
                  } else {
                     long var13;
                     if ((var13 = this.aoq.getMoney()) > 0L && var13 <= var8.getLoginResult().getGold().longValue()) {
                        StallBuy var6 = new StallBuy();
                        var6.setId(this.ank.getId());
                        var6.setType(1);
                        var6.setBuyid(this.aoq.getPet().getSid());
                        var6.setSum(1);
                        String var7 = Agreement.getSendTextAES("stallbuy", com.xy.v.Class31.a().toJson(var6));
                        this.za().k(var7);
                     } else {
                        String var21 = "醱钅乭趇";
                        this.afx._do("金钱不足");
                     }
                  }
               } else {
                  this.aoq.getLingbao();
               }
            }
         }
      } else if (var1 == 242) {
         if (this.aod <= 0) {
            String var20 = "形删昞駻顄";
            this.afx._do("当前是首页");
         } else {
            this.aod--;
            this.g(this.aod);
            this.h();
         }
      } else if (var1 == 243) {
         int var10 = (this.ank.getNeedNum() - 1) / this.anh.length;
         if (this.aod >= var10) {
            String var19 = "彧刭昛属顁";
            this.afx._do("当前是尾页");
         } else {
            this.aod++;
            this.g(this.aod);
            this.h();
         }
      } else if (var1 == 244) {
         if (!this.afx.ah()) {
            if (this.aoi == null) {
               String var18 = "伍沐杤逸乀皵敛贜禠籊";
               this.afx._do("你没有选中的收购种类");
            } else {
               int var2;
               if ((var2 = (int)this.gd.ee()) <= 0) {
                  String var17 = "佔冚唚攐釻乚\u0004";
                  this.afx._do("你出售数量为0");
               } else {
                  Goodstable var3;
                  if ((var3 = (Goodstable)this.vo.jx()) != null) {
                     var3 = this.yx().getGood(var3.getRgid());
                  }

                  if (var3 == null) {
                     String var10001 = "伍沐杤逸乀皵爄哰";
                     this.afx._do("你没有选中的物品");
                  } else {
                     StallBuy var4 = new StallBuy();
                     var4.setId(this.ank.getId());
                     var4.setType(3);
                     var4.setSoldId(this.aoi.getId());
                     var4.setBuyid(var3.getRgid());
                     var4.setSum(var2);
                     String var5 = Agreement.getSendTextAES("stallbuy", com.xy.v.Class31.a().toJson(var4));
                     this.za().k(var5);
                  }
               }
            }
         }
      } else {
         if (var1 == 240) {
            com.xy.i.Class0.ff(181, this.afx);
         }
      }
   }

   public void gg(StallNeedBean var1) {
      StallNeedBean var10000 = this.aoi = var1;
      this.vo.gs(0, null);
      Class107 var3;
      if (var10000 != null) {
         var3 = this;
         com.xy.q.Class49.b(this.dx[1], var1.getMoney());
      } else {
         var3 = this;
         this.dx[1].setText("");
      }

      var3.anv.setText("");
      this.h();
      StallBuyData var2 = var1 != null ? this.yt().cb(var1.getId()) : null;
      this.anz.po(var2);
   }

   public void c() {
      com.xy.v.Class8 var1 = this.yt();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.anh.length; var10000 = var2) {
         StallBuyData var3 = Class15.gj(this.anh[var2]) != null ? var1.cb(Class15.gj(this.anh[var2]).getId()) : null;
         Class15 var5 = this.anh[var2];
         var2++;
         Class15.gi(var5, this.anz.afn(var3));
      }

      StallBuyData var4 = this.aoi != null ? var1.cb(this.aoi.getId()) : null;
      this.anz.po(var4);
   }

   public void ags(String var1, StringBuffer var2) {
      String var3 = null;
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      int var7 = 1;
      long var8 = 0L;
      int var10 = 0;
      int var11 = 0;
      int var12;
      int var10000 = var12 = 0;

      while (var10000 != var1.length()) {
         String var10001 = "H";
         if ((var12 = var1.indexOf("|", var11 + 1)) == -1) {
            var12 = var1.length();
         }

         if (var10 == 1) {
            var3 = var1.substring(var11, var12);
            var10000 = var12;
         } else if (var10 == 3) {
            var4 = var1.substring(var11, var12);
            var10000 = var12;
         } else if (var10 == 4) {
            var7 = Integer.parseInt(var1.substring(var11, var12));
            var10000 = var12;
         } else if (var10 == 5) {
            var8 = var7 * Long.parseLong(var1.substring(var11, var12));
            var10000 = var12;
         } else if (var10 == 6) {
            var5 = var1.substring(var11, var12);
            var10000 = var12;
         } else {
            if (var10 == 7) {
               String var15 = var1.substring(var11, var12);
               var10001 = "寥投";
               if (var15.startsWith("守护")) {
                  var6 = true;
               }
            }

            var10000 = var12;
         }

         var10++;
         var11 = var10000 + 1;
         var10000 = var12;
      }

      String var10002 = "Cf";
      var2.append("#R");
      var2.append(var3);
      String var10004 = "〱Nv";
      var2.append("　#G");
      var2.append(var4);
      String var10006 = "Cc苑贍Cm";
      var2.append("#W花费#Y");
      var2.append(var8);
      String var10008 = "Nf盩仆桑贜丝亷";
      var2.append("#W的价格购买了");
      if (!var6) {
         String var18 = "Cs";
         var2.append("#G");
         var2.append(var7);
         String var10003 = "\u0012:丛Nv";
         var2.append("#W个#G");
         var2.append(var5);
      } else {
         String var17 = "寨抐Cs";
         var2.append("守护#G");
         var2.append(var5);
      }
   }

   public Class107(GameView var1) {
      super(153, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u001eRBUB\u0000CA\u0003V";
      this.aod = 0;
      this.yy(-1, 0, 692, 491, com.xy.q.Class30.agh);
      com.xy.w.Class9 var82 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "枅眿冚唚";
      this.yu(var82, "查看出售");
      this.aop = new com.xy.i.Class18[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.aop.length; var10000 = var2) {
         com.xy.i.Class18[] var15 = this.aop;
         var10004 = "B\u000e\u001e\b\u001eZ\u0003CA\u0003V";
         int var10006 = 231 + var2;
         String var100;
         Class107 var10010;
         if (var2 == 0) {
            var100 = "冚唚";
            var100 = "出售";
            var10010 = this;
         } else if (var2 == 1) {
            var100 = "敛贜";
            var100 = "收购";
            var10010 = this;
         } else if (var2 == 2) {
            var100 = "仄昧诐彡";
            var100 = "交易记录";
            var10010 = this;
         } else {
            var100 = "";
            var10010 = this;
         }

         com.xy.i.Class18 var10002 = new com.xy.i.Class18("sc/e/72.png", 2, var10006, com.xy.q.Class49.bx, com.xy.q.Class49.bv, var100, var10010);
         var15[var2] = var10002;
         this.aop[var2].setOffsetTexts(com.xy.q.Class49.d);
         this.aop[var2].setBounds(61 + 92 * var2, 15, 85, 33);
         this.add(this.aop[var2++]);
      }

      this.ani = com.xy.q.Class1.i(336, 22, 183, 19, 10, Color.white, com.xy.q.Class49.n);
      var10004 = "B\u000e\u001e\t\u001e\\\u0006CA\u0003V";
      this.ani.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ani);
      String var10007 = "G\u0003\u001b\u0004\u001bY\u0004ND\u000eS";
      this.aek = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/90.png", 6, 6, 6, 6, false));
      this.add(this.aek);
      String var103 = "B\u000e\u001e\b\u001e^\u0000CA\u0003V";
      String var10014 = "呦喩";
      this.anx = new com.xy.i.Class18("sc/e/31.png", 1, 240, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "吆喝", this);
      this.anx.setBounds(530, 17, 79, 25);
      this.add(this.anx);
      if (!this.za().gamePawn) {
         this.anx.setVisible(false);
      }

      this.aof = new Class105(this);
      this.ann = new Class77(this);
      this.ahn = new Class72(this);
      this.aof.setBounds(0, 0, 692, 491);
      this.ann.setBounds(0, 0, 692, 491);
      this.ahn.setBounds(0, 0, 692, 491);
      this.add(this.aof);
      this.add(this.ann);
      this.add(this.ahn);
      this.anu = new com.xy.i.Class18[3];

      for (int var16 = var2 = 0; var16 < this.anu.length; var16 = var2) {
         com.xy.i.Class18[] var17 = this.anu;
         var10004 = "B\u000e\u001e\b\u001e[\u0000CA\u0003V";
         int var96 = 236 + var2;
         Class107 var111;
         if (var2 == 0) {
            var103 = "逳元";
            var103 = "道具";
            var111 = this;
         } else if (var2 == 1) {
            var103 = "叝啉兌";
            var103 = "召唤兽";
            var111 = this;
         } else if (var2 == 2) {
            var103 = "瀕宩";
            var103 = "灵宝";
            var111 = this;
         } else {
            var103 = "";
            var111 = this;
         }

         com.xy.i.Class18 var64 = new com.xy.i.Class18("sc/e/61.png", 2, var96, com.xy.q.Class49.ck, null, var103, var111);
         var17[var2] = var64;
         this.anu[var2].setOffsetTexts(com.xy.q.Class49.bo);
         this.anu[var2].setBounds(59 + 92 * var2, 53, 90, 24);
         this.aof.add(this.anu[var2++]);
      }

      this.anu[2].setVisible(false);
      var10007 = "B\u000e\u001e\b\u001e^\u0000CA\u0003V";
      String var10012 = "赍乄";
      this.aea = new com.xy.i.Class18("sc/e/31.png", 1, 241, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "购买", this);
      this.aea.setBounds(525, 433, 79, 25);
      this.aof.add(this.aea);
      this.ano = new JLabel[4];

      for (int var18 = var2 = 0; var18 < this.ano.length; var18 = var2) {
         this.ano[var2] = com.xy.q.Class1.k(162 + var2 % 2 * 169, 424 + var2 / 2 * 27, 36, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var19 = this.ano[var2];
         String var43;
         if (var2 == 0) {
            var43 = "攝釾";
            var43 = "数量";
         } else if (var2 == 1) {
            var43 = "恛仃";
            var43 = "总价";
         } else if (var2 == 2) {
            var43 = "匸仆";
            var43 = "单价";
         } else if (var2 == 3) {
            var43 = "珐釥";
            var43 = "现金";
         } else {
            var43 = "";
         }

         var19.setText(var43);
         this.ano[var2].setHorizontalAlignment(10);
         this.aof.add(this.ano[var2++]);
      }

      String var10005 = "B\u000e\u001e\t\u001e\\\u0006CA\u0003V";
      this.aoe = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.aoe.setBounds(198, 424, 114, 19);
      this.aof.add(this.aoe);
      this.aom = new com.xy.q.Class27(15, this.aoe, this);
      this.anp = new com.xy.q.Class14[2];

      for (int var20 = var2 = 0; var20 < this.anp.length; var20 = var2) {
         this.anp[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var21 = this.anp[var2];
         String var47 = "G\u0003\u001b\u0004\u001bQ\u0003ND\u000eS";
         var21.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         Class107 var22;
         if (var2 == 0) {
            var22 = this;
            this.anp[var2].setBounds(367, 424, 114, 19);
         } else {
            if (var2 == 1) {
               this.anp[var2].setBounds(198, 451, 114, 19);
            }

            var22 = this;
         }

         var22.aof.add(this.anp[var2++]);
      }

      this.aog = new MoneyType();
      var103 = "醼钀";
      this.aog.setIdAndKey(1, "金钱");
      this.ant = com.xy.q.Class1.m(367, 451, 114, 19, 10, Color.white, com.xy.q.Class49.w, this.aog, var1);
      var10005 = "G\u0003\u001b\u0004\u001bQ\u0003ND\u000eS";
      this.ant.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.ant.n(2);
      this.aof.add(this.ant);
      this.aoj = new Class15[24];

      for (int var24 = var2 = 0; var24 < this.aoj.length; var24 = var2) {
         this.aoj[var2] = new Class15(this, var2, false);
         this.aof.add(this.aoj[var2++]);
      }

      var10007 = "B\u000e\u001e\t\u001e_\u0005CA\u0003V";
      this.kh = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.kh.setBounds(44, 77, 612, 338);
      this.aof.add(this.kh);
      this.anq = new com.xy.q.Class54(this);
      this.anq.setBounds(101, 424, 46, 46);
      this.aof.add(this.anq);
      var103 = "G\u0003\u001b\u0004\u001bX\u0005ND\u000eS";
      this.anl = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/81.png", 5, 5, 5, 5, false));
      this.anl.setBounds(99, 422, 50, 50);
      this.aof.add(this.anl);
      var10014 = "B\u000e\u001e\b\u001eY\u0006CA\u0003V";
      this.aok = new com.xy.i.Class18("sc/e/47.png", 1, 242, this);
      String var10013 = "G\u0003\u001b\u0005\u001bT\fND\u000eS";
      this.aon = new com.xy.i.Class18("sc/e/48.png", 1, 243, this);
      var10012 = "B\u000e\u001e\b\u001e^\u0000CA\u0003V";
      String var10017 = "冚唚";
      this.aoo = new com.xy.i.Class18("sc/e/31.png", 1, 244, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "出售", this);
      this.aok.setBounds(655, 267, 18, 18);
      this.aon.setBounds(655, 309, 18, 18);
      this.aoo.setBounds(525, 433, 79, 25);
      this.ann.add(this.aok);
      this.ann.add(this.aon);
      this.ann.add(this.aoo);
      this.r = new JLabel[6];

      for (int var25 = var2 = 0; var25 < this.r.length; var25 = var2) {
         this.r[var2] = com.xy.q.Class1.k(44, 53, 612, 21, Color.white, com.xy.q.Class49.ch);
         JLabel var26 = this.r[var2];
         String var49;
         if (var2 == 0) {
            var49 = "歒坅攇赀皵爄哰";
            var49 = "正在收购的物品";
         } else if (var2 == 1) {
            var49 = "叛亅凎啎皰爉哵";
            var49 = "可以出售的物品";
         } else if (var2 == 2) {
            var49 = "攝釾";
            var49 = "数量";
         } else if (var2 == 3) {
            var49 = "恛仃";
            var49 = "总价";
         } else if (var2 == 4) {
            var49 = "匸仆";
            var49 = "单价";
         } else if (var2 == 5) {
            var49 = "珐釥";
            var49 = "现金";
         } else {
            var49 = "";
         }

         var26.setText(var49);
         this.r[var2].setHorizontalAlignment(0);
         Class107 var27;
         if (var2 == 1) {
            var27 = this;
            this.r[var2].setBounds(44, 333, 612, 21);
         } else {
            if (var2 >= 2 && var2 <= 5) {
               this.r[var2].setHorizontalAlignment(10);
               this.r[var2].setBounds(162 + (var2 - 2) % 2 * 169, 424 + (var2 - 2) / 2 * 27, 36, 19);
               this.r[var2].setForeground(Color.black);
            }

            var27 = this;
         }

         var27.ann.add(this.r[var2++]);
      }

      var10005 = "B\u000e\u001e\t\u001e\\\u0006CA\u0003V";
      this.anv = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.anv.setBounds(198, 424, 114, 19);
      this.ann.add(this.anv);
      this.gd = new com.xy.q.Class27(15, this.anv, this);
      this.dx = new com.xy.q.Class14[2];

      for (int var29 = var2 = 0; var29 < this.anp.length; var29 = var2) {
         this.dx[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, com.xy.q.Class49.w);
         com.xy.q.Class14 var30 = this.dx[var2];
         String var55 = "G\u0003\u001b\u0004\u001bQ\u0003ND\u000eS";
         var30.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         Class107 var31;
         if (var2 == 0) {
            var31 = this;
            this.dx[var2].setBounds(367, 424, 114, 19);
         } else {
            if (var2 == 1) {
               this.dx[var2].setBounds(198, 451, 114, 19);
            }

            var31 = this;
         }

         var31.ann.add(this.dx[var2++]);
      }

      this.anw = com.xy.q.Class1.m(367, 451, 114, 19, 10, Color.white, com.xy.q.Class49.w, this.aog, var1);
      var10005 = "B\u000e\u001e\t\u001e\\\u0006CA\u0003V";
      this.anw.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.anw.n(2);
      this.ann.add(this.anw);
      this.vo = new com.xy.q.Class54(this);
      this.vo.setBounds(101, 424, 46, 46);
      this.ann.add(this.vo);
      var103 = "G\u0003\u001b\u0004\u001bX\u0005ND\u000eS";
      this.anm = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/81.png", 5, 5, 5, 5, false));
      this.anm.setBounds(99, 422, 50, 50);
      this.ann.add(this.anm);
      this.anh = new Class15[12];

      for (int var33 = var2 = 0; var33 < this.anh.length; var33 = var2) {
         this.anh[var2] = new Class15(this, var2, true);
         this.anh[var2].setBounds(47 + var2 % 3 * 203, 82 + var2 / 3 * 61, 200, 56);
         this.ann.add(this.anh[var2++]);
      }

      com.xy.i.Class3[] var11 = new com.xy.i.Class3[2];

      int var3;
      for (int var34 = var3 = 0; var34 < var11.length; var34 = var3) {
         if (var3 == 0) {
            var10004 = "B\u000e\u001e\b\u001eY\u0006CA\u0003V";
            var10004 = "sc/e/47.png";
         } else {
            var10004 = "G\u0003\u001b\u0005\u001bT\fND\u000eS";
            var10004 = "sc/e/48.png";
         }

         com.xy.i.Class3 var56 = new com.xy.i.Class3(var10004, 1, var3, this);
         var11[var3] = var56;
         var11[var3].setBounds(655, 354 + 42 * var3, 18, 18);
         this.ann.add(var11[var3++]);
      }

      this.anz = new com.xy.q.Class43(this, 10, 1, 60, 60, 1, 1, 45, 353);
      var10005 = "\u001eRBUB\u0005CA\u0003V";
      this.anz.gt(com.xy.w.Class16.c("sc/d/4.png"));
      this.anz.vo(var11, 1);
      this.ann.add(this.anz);
      this.zv = new com.xy.w.Class18[4];

      for (int var35 = var3 = 0; var35 < this.zv.length; var35 = var3) {
         Class107 var36;
         label266: {
            this.zv[var3] = new com.xy.w.Class18();
            if (var3 >= 0 && var3 <= 1) {
               com.xy.w.Class18 var58 = this.zv[var3];
               String var74 = "G\u0003\u001b\u0004\u001bR\u0001ND\u000eS";
               var58.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
               if (var3 == 0) {
                  var36 = this;
                  this.zv[var3].setBounds(44, 53, 612, 21);
                  break label266;
               }

               if (var3 == 1) {
                  var36 = this;
                  this.zv[var3].setBounds(44, 333, 612, 21);
                  break label266;
               }
            } else if (var3 >= 2 && var3 <= 3) {
               com.xy.w.Class18 var57 = this.zv[var3];
               String var73 = "B\u000e\u001e\t\u001e_\u0005CA\u0003V";
               var57.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               if (var3 == 2) {
                  var36 = this;
                  this.zv[var3].setBounds(44, 53, 612, 274);
                  break label266;
               }

               if (var3 == 3) {
                  this.zv[var3].setBounds(44, 333, 612, 80);
               }
            }

            var36 = this;
         }

         var36.ann.add(this.zv[var3++]);
      }

      this.aoa = new JLabel[2];

      for (int var38 = var3 = 0; var38 < this.aoa.length; var38 = var3) {
         this.aoa[var3] = com.xy.q.Class1.k(42 + 305 * var3, 54, 305, 21, Color.white, com.xy.q.Class49.ch);
         JLabel var39 = this.aoa[var3];
         String var60;
         if (var3 == 0) {
            var60 = "冚唚诐彡";
            var60 = "出售记录";
         } else if (var3 == 1) {
            var60 = "敛贜话彤";
            var60 = "收购记录";
         } else {
            var60 = "";
         }

         var39.setText(var60);
         this.aoa[var3].setHorizontalAlignment(0);
         this.ahn.add(this.aoa[var3++]);
      }

      this.aol = new RichLabel("", com.xy.q.Class49.ac);
      this.aoc = new RichLabel("", com.xy.q.Class49.ac);
      this.anj = com.xy.q.Class1.g(45, 74, 301, 375, this.aol, 20);
      this.ans = com.xy.q.Class1.g(350, 74, 301, 375, this.aoc, 20);
      this.ahn.add(this.anj);
      this.ahn.add(this.ans);
      this.aoh = new com.xy.w.Class18[4];

      for (int var40 = var3 = 0; var40 < this.aoh.length; var40 = var3) {
         this.aoh[var3] = new com.xy.w.Class18();
         Class107 var41;
         if (var3 == 0) {
            var41 = this;
            com.xy.w.Class18 var77 = this.aoh[var3];
            var10003 = "G\u0003\u001b\u0004\u001bR\u0001ND\u000eS";
            var77.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aoh[var3].setBounds(42, 54, 305, 21);
         } else if (var3 == 1) {
            var41 = this;
            com.xy.w.Class18 var78 = this.aoh[var3];
            var10003 = "B\u000e\u001e\t\u001e_\u0004CA\u0003V";
            var78.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aoh[var3].setBounds(347, 54, 305, 21);
         } else if (var3 == 2) {
            var41 = this;
            com.xy.w.Class18 var79 = this.aoh[var3];
            var10003 = "G\u0003\u001b\u0004\u001bR\u0000ND\u000eS";
            var79.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aoh[var3].setBounds(42, 54, 305, 397);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var62 = this.aoh[var3];
               String var80 = "B\u000e\u001e\t\u001e_\u0005CA\u0003V";
               var62.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aoh[var3].setBounds(347, 54, 305, 397);
            }

            var41 = this;
         }

         var41.ahn.add(this.aoh[var3++]);
      }

      String var97 = "G\u0003\u001b\u0004\u001bS\u0001ND\u000eS";
      this.aob = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/35.png", 80, 10, 80, 10, false));
      this.aob.setBounds(35, 29, 611, 20);
      this.add(this.aob);
   }

   public void bi(int var1) {
      if (var1 != 2) {
         this.eg = var1;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.anu.length; var10000 = ++var2) {
            this.anu[var2].setKeep(var2 == this.eg);
         }

         var2 = 0;
         int var10;
         if (var1 == 0) {
            int var3;
            for (int var9 = var3 = 0; var9 < this.ank.getGoodstables().length; var9 = ++var3) {
               Commodity var4;
               if ((var4 = this.ank.getGoodstables()[var3]) != null) {
                  this.aoj[var2++].gl(var4);
               }
            }

            var10 = var2;
         } else {
            int var6;
            if (var1 == 1) {
               for (int var11 = var6 = 0; var11 < this.ank.getPets().length; var11 = ++var6) {
                  Commodity var8;
                  if ((var8 = this.ank.getPets()[var6]) != null) {
                     this.aoj[var2++].gl(var8);
                  }
               }
            }

            var10 = var2;
         }

         int var7 = var10;

         for (int var12 = var7; var12 < this.aoj.length; var12 = var7) {
            this.aoj[var7++].gl(null);
         }

         this.h();
      }
   }

   public void e() {
      this.aod = 0;
      this.g(this.aod);
      this.gg(null);
   }

   public void y(int var1) {
      if (var1 != 1 || this.za().gamePawn) {
         this.any = var1;

         int var2;
         for (int var10000 = var2 = 0; var10000 < this.aop.length; var10000 = ++var2) {
            this.aop[var2].setKeep(var2 == this.any);
         }

         if (var1 == 0) {
            this.ant.l();
         }

         if (var1 == 1) {
            this.e();
         }

         this.aof.setVisible(var1 == 0);
         this.ann.setVisible(var1 == 1);
         this.ahn.setVisible(var1 == 2);
         this.h();
      }
   }

   public void f() {
      if (this.any == 1) {
         this.c();
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var3 == this.anv) {
         if (var1 >= 0L && this.aoi != null) {
            Goodstable var7;
            if ((var7 = (Goodstable)this.vo.jx()) != null) {
               var7 = this.yx().getGood(var7.getRgid());
            }

            if (var7 == null) {
               return 0L;
            } else {
               long var5 = Math.min(var7.getUsetime(), this.aoi.getTotal() - this.aoi.getNum());
               return var1 > var5 ? var5 : null;
            }
         } else {
            return 0L;
         }
      } else if (var1 >= 0L && this.aoq != null) {
         long var4 = Math.min(
            this.yx().getLoginResult().getGold().longValue() / this.aoq.getMoney(), this.aoq.getGood() != null ? this.aoq.getGood().getUsetime() : 1
         );
         return var1 > var4 ? var4 : null;
      } else {
         return 0L;
      }
   }

   public void agt(Stall var1) {
      boolean var2 = this.ank != null && this.ank.getId() == var1.getId();
      StallNeedBean var3 = var2 ? this.aoi : null;
      this.ank = var1;
      this.ani.setText(var1.getStall());
      boolean var4 = var1.i(0);
      boolean var5 = var1.i(1);
      boolean var6 = var1.i(2);
      boolean var7 = var1.i(3);
      com.xy.i.Class18 var10000 = this.anu[0];
      byte var10001;
      boolean var10002;
      if (var4) {
         var10001 = 2;
         var10002 = var4;
      } else {
         var10001 = -1;
         var10002 = var4;
      }

      String var20;
      if (var10002) {
         String var19 = "B\u000e\u001e\b\u001e[\u0000CA\u0003V";
         var20 = "sc/e/61.png";
      } else {
         String var21 = "G\u0003\u001b\u0005\u001bW\u0000ND\u000eS";
         var20 = "sc/e/74.png";
      }

      var10000.setBtn(var10001, var20);
      var10000 = this.anu[1];
      if (var5) {
         var10001 = 2;
         var10002 = var5;
      } else {
         var10001 = -1;
         var10002 = var5;
      }

      String var24;
      if (var10002) {
         String var23 = "B\u000e\u001e\b\u001e[\u0000CA\u0003V";
         var24 = "sc/e/61.png";
      } else {
         String var25 = "G\u0003\u001b\u0005\u001bW\u0000ND\u000eS";
         var24 = "sc/e/74.png";
      }

      var10000.setBtn(var10001, var24);
      var10000 = this.anu[2];
      if (var6) {
         var10001 = 2;
         var10002 = var6;
      } else {
         var10001 = -1;
         var10002 = var6;
      }

      String var28;
      if (var10002) {
         String var27 = "B\u000e\u001e\b\u001e[\u0000CA\u0003V";
         var28 = "sc/e/61.png";
      } else {
         String var29 = "G\u0003\u001b\u0005\u001bW\u0000ND\u000eS";
         var28 = "sc/e/74.png";
      }

      var10000.setBtn(var10001, var28);
      Class107 var12;
      if (var4) {
         var12 = this;
         this.bi(0);
      } else if (var5) {
         var12 = this;
         this.bi(1);
      } else if (var6) {
         this.bi(2);
         var12 = this;
      } else {
         var10000 = this.anu[0];
         String var30 = "B\u000e\u001e\b\u001e[\u0000CA\u0003V";
         var10000.setBtn(2, "sc/e/61.png");
         this.bi(0);
         var12 = this;
      }

      int var8;
      if ((var8 = var12.any) == 1 && !var7) {
         var8 = 0;
      }

      this.y(var8);
      if (var2 && var8 == 1 && var3 != null && (var3 = var1.getStallNeedBean(var3.getId())) != null && var3.getTotal() > var3.getNum()) {
         this.gg(var3);
      }

      Class107 var14;
      if (var1.getId() == 0) {
         var14 = this;
         this.aea.setVisible(false);
         this.aoo.setVisible(false);
         this.anx.setVisible(false);
      } else if (com.xy.v.Class12.x(var1.getRoleid(), this.yx().getLoginResult().getRole_id())) {
         String var17 = "敖摾";
         this.aea.setText("收摊");
         var14 = this;
         this.aea.setVisible(true);
         this.aoo.setVisible(false);
         this.anx.setVisible(true);
      } else {
         String var18 = "赀乁";
         this.aea.setText("购买");
         var14 = this;
         this.aea.setVisible(true);
         this.aoo.setVisible(true);
         this.anx.setVisible(false);
      }

      var14.agu(var1);
      this.gl(null);
      if (this.zc().l(this.lj()) == null) {
         this.zc().b(this.lj());
      }
   }

   public void h() {
      Class107 var3;
      if (this.aoq != null && this.any == 0) {
         int var2;
         for (int var4 = var2 = 0; var4 < this.aoj.length; var4 = ++var2) {
            if (Class15.gk(this.aoj[var2]) != null && Class15.gk(this.aoj[var2]) == this.aoq) {
               this.aek.setBounds(this.aoj[var2].getX() - 1, this.aoj[var2].getY() - 1, this.aoj[var2].getWidth() + 2, this.aoj[var2].getHeight() + 2);
               this.aek.setVisible(true);
               return;
            }
         }

         var3 = this;
      } else {
         int var1;
         if (this.aoi != null && this.any == 1) {
            for (int var10000 = var1 = 0; var10000 < this.anh.length; var10000 = ++var1) {
               if (Class15.gj(this.anh[var1]) != null && Class15.gj(this.anh[var1]) == this.aoi) {
                  this.aek.setBounds(this.anh[var1].getX() - 1, this.anh[var1].getY() - 1, this.anh[var1].getWidth() + 2, this.anh[var1].getHeight() + 2);
                  this.aek.setVisible(true);
                  return;
               }
            }
         }

         var3 = this;
      }

      var3.aek.setVisible(false);
   }

   public void gl(Commodity var1) {
      if ((this.aoq = var1) == null) {
         this.anq.gs(0, null);
         this.anp[1].setText("");
         this.aoe.setText("");
         this.h();
      } else {
         Class107 var10000;
         if (var1.getGood() != null) {
            var10000 = this;
            this.anq.gs(18, var1.getGood());
         } else {
            if (var1.getPet() != null) {
               this.anq.gs(21, var1.getPet());
            }

            var10000 = this;
         }

         com.xy.q.Class49.b(var10000.anp[1], var1.getMoney());
         this.aoe.setText("1");
         this.h();
      }
   }

   public void ds(long var1, JTextField var3) {
      if (var3 == this.anv) {
         if (this.aoi != null && var1 > 0L) {
            com.xy.q.Class49.b(this.dx[0], this.aoi.getMoney() * var1);
         } else {
            com.xy.q.Class49.b(this.dx[0], 0L);
         }
      } else if (this.aoq != null && var1 > 0L) {
         com.xy.q.Class49.b(this.anp[0], this.aoq.getMoney() * var1);
      } else {
         com.xy.q.Class49.b(this.anp[0], 0L);
      }
   }

   public void g(int var1) {
      int var3 = (this.ank.getNeedNum() - 1) / this.anh.length;
      var1 = Math.max(0, var1);
      var1 = Math.min(var3, var1);
      int var4 = 0;
      int var5;
      int var6 = (var5 = var1 * this.anh.length) + this.anh.length;
      List var7 = this.ank.getNeeds();
      int var8 = 0;
      int var9 = var7 != null ? var7.size() : 0;

      for (int var10000 = var8; var10000 < var9 && var4 < var6; var10000 = ++var8) {
         StallNeedBean var10;
         if ((var10 = (StallNeedBean)var7.get(var8)).getNum() < var10.getTotal()) {
            if (var4 >= var5) {
               this.anh[var4 - var5].gg(var10);
            }

            var4++;
         }
      }

      for (int var14 = var8 = Math.max(var4, var5); var14 < var6; var14 = var8) {
         int var10001 = var8 - var5;
         var8++;
         this.anh[var10001].gg(null);
      }

      this.c();
   }

   public void agu(Stall var1) {
      int var2 = var1 != null ? var1.getId() : 0;
      if (var2 == 0) {
         this.aol.setTextSize("", 285);
      } else {
         List var3 = var1.getMsg();
         List var4 = var1.getMsg2();
         List var12;
         if (var3 != null) {
            StringBuffer var5 = new StringBuffer(128 * var3.size());
            int var6 = 0;
            int var7 = var3.size();

            for (int var10000 = var6; var10000 < var7; var10000 = var6) {
               if (var5.length() != 0) {
                  String var10001 = "CF";
                  var5.append("#r");
               }

               Object var15 = var3.get(var6);
               var6++;
               this.ags((String)var15, var5);
            }

            this.aol.setTextSize(var5.toString(), 285);
            JScrollBar var9 = this.anj.getVerticalScrollBar();
            var12 = var4;
            var9.setMaximum(this.aol.getHeight());
            var9.setValue(var9.getMaximum());
         } else {
            this.aol.setTextSize("", 285);
            var12 = var4;
         }

         if (var12 != null) {
            StringBuffer var8 = new StringBuffer(128 * var4.size());
            int var10 = 0;
            int var11 = var4.size();

            for (int var13 = var10; var13 < var11; var13 = var10) {
               if (var8.length() != 0) {
                  String var16 = "NC";
                  var8.append("#r");
               }

               Object var17 = var4.get(var10);
               var10++;
               this.agq((String)var17, var8);
            }

            this.aoc.setTextSize(var8.toString(), 285);
            JScrollBar var14 = this.ans.getVerticalScrollBar();
            var14.setMaximum(this.aoc.getHeight());
            var14.setValue(var14.getMaximum());
         } else {
            this.aoc.setTextSize("", 285);
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void cb(Goodstable var1, int var2) {
      this.vo.gs(1, var1);
      this.anv.setText(String.valueOf(var2));
   }
}
