package com.xy.a.a;

import com.xy.bean.SuitOperBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.PartJade;
import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.i.Class18;
import com.xy.i.Class4;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameReadBar;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class44 extends com.xy.q.Class30 {
   private com.xy.v.Class24[] alr;
   private BigDecimal ko;
   private com.xy.i.Class4[] als;
   private BigDecimal bt;
   private com.xy.q.Class54 alt;
   private int aa;
   private int cn;
   private String alu;
   private com.xy.q.Class27 aal;
   private com.xy.q.Class36 alv;
   private int ds;
   private JLabel[] o;
   private com.xy.w.Class18[] cl;

   public void aey(BigDecimal var1, com.xy.v.Class24[] var2, Goodstable var3) {
      this.alu = null;
      this.cn = 12;
      this.ko = var1;
      this.alr = var2;
      this.aa = this.yx().t(var2);
      this.ds = 1;
      this.alt.gs(1, var3);
      this.o[1].setText(var3.getGoodsname());
      JLabel var10003 = this.o[2];
      String var10006 = "厳儏挾歿攬d";
      var10003.setText("可兑换次数:" + this.aa);
      this.g(132);
      this.zc().b(this.lj());
   }

   public void bb(Goodstable var1) {
      if (var1.getType() == 721L) {
         this.alu = null;
         this.cn = 13;
         this.ko = var1.getRgid();
         this.aa = var1.getUsetime();
         this.ds = 1;
         this.alt.gs(1, var1);
         if (var1.getType() == 721L) {
            this.ds = 3;
            JLabel var10000 = this.o[1];
            String var10001 = "儔捘瀰兹昳";
            var10000.setText("兑换灵元晶");
         }

         JLabel var10003 = this.o[2];
         String var10006 = "厳儏挾歿攬d";
         var10003.setText("可兑换次数:" + this.aa / this.ds);
         this.g(132);
         this.zc().b(this.lj());
      }
   }

   public void ds(long var1, JTextField var3) {
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void aez(int var1, BigDecimal var2, Goodstable var3) {
      this.alu = null;
      this.alr = null;
      this.cn = var1;
      this.ko = var2;
      this.bt = var3.getRgid();
      this.aa = var3.getUsetime();
      this.ds = 1;
      if (var3.getType() == 118L) {
         int var10001 = this.ds;
         String var10002 = var3.getValue();
         String var10003 = "非觝攮醓c";
         String var10004 = "9";
         this.ds = Math.max(var10001, com.xy.v.Class12.f(var10002, "需要数量=", "|"));
      }

      this.alt.gs(1, var3);
      this.o[1].setText(var3.getGoodsname());
      JLabel var4 = this.o[2];
      String var10006 = "抻杕攮醓d";
      var4.setText("拥有数量:" + this.aa / this.ds);
      this.g(132);
      this.zc().b(this.lj());
   }

   public void adb(BigDecimal var1, String var2) {
      this.alr = null;
      this.cn = 11;
      this.ko = var1;
      this.alu = var2;
      this.aa = (int)this.yx().getLoginResult().getContribution().longValue();
      this.ds = 1500;
      this.alt.gs(16, 2019);
      this.o[1].setText(var2.substring(2));
      JLabel var10003 = this.o[2];
      String var10006 = "騪允此敊\u007f";
      var10003.setText("驯养次数:" + this.aa / this.ds);
      this.g(132);
      this.zc().b(this.lj());
   }

   public void g(int var1) {
      if (var1 == 131) {
         this.alv.setText("1");
      } else if (var1 == 132) {
         if (this.cn != 11 && this.cn != 12 && this.cn != 13) {
            Goodstable var13;
            if ((var13 = this.yx().getGood(this.bt)) != null) {
               int var17 = var13.getUsetime();
               if (var13.getType() == 118L && var13.getGoodsid().intValue() != 81229) {
                  String var37 = var13.getValue();
                  String var70 = "设杛x";
                  String var81 = "\"";
                  if (com.xy.v.Class12.o(var37, "读条=", "|") == 0L) {
                     var17 = Math.min(10, var17);
                  }
               }

               this.alv.setText(String.valueOf(var17));
            }
         } else {
            this.alv.setText(String.valueOf(this.aa / this.ds));
         }
      } else if (var1 == 133) {
         this.zc().f(this.lj());
      } else {
         if (var1 == 134) {
            if (this.cn == 11) {
               int var12 = Math.min((int)this.aal.ee(), this.aa / this.ds);
               String var61 = "戼釵騪允厇戢厩唞儸予它";
               int var36;
               if (this.alu.equals("批量驯养参战召唤兽亲密")) {
                  var36 = 53;
               } else {
                  var61 = "戥醑騳儥圌髏纓髒";
                  if (this.alu.equals("批量驯养坐骑经验")) {
                     var36 = 54;
                  } else {
                     var61 = "戼釵騪允圕骫担胇燚绹廣";
                     if (this.alu.equals("批量驯养坐骑技能熟练度")) {
                        var36 = 55;
                     } else {
                        var61 = "戥醑騳儥瀩寃复呖";
                        if (this.alu.equals("批量驯养灵宝契合")) {
                           var36 = 56;
                        } else {
                           var61 = "扃醊驕儾灏寘绵髉";
                           if (this.alu.equals("批量驯养灵宝经验")) {
                              var36 = 57;
                           } else {
                              var61 = "戥醑騳儥駊乴厞扆沉寃纓髒";
                              var36 = this.alu.equals("批量驯养首个参战法宝经验") ? 58 : 0;
                           }
                        }
                     }
                  }
               }

               int var16 = var36;
               if (var12 > 0 && var16 != 0) {
                  StringBuilder var68 = new StringBuilder(String.valueOf(var16));
                  String var79 = "\"";
                  StringBuilder var69 = var68.append("|").append(this.ko);
                  var79 = "9";
                  String var20 = Agreement.getSendTextAES("gangbattle", var69.append("|").append(var12).toString());
                  this.za().k(var20);
                  this.zc().f(this.lj());
                  return;
               }

               var61 = "敊醊丷肸一u";
               this.afx.dp("数量不能为0");
               return;
            }

            if (this.cn == 12) {
               RoleData var11 = this.yx();
               int var15;
               if ((var15 = Math.min((int)this.aal.ee(), var11.t(this.alr))) <= 0) {
                  String var60 = "攬醑乑肣书n";
                  this.afx.dp("数量不能为0");
                  return;
               }

               Goodstable var19;
               if ((var19 = this.yt().ay(this.ko)) != null && var11.getGoodPackSum(var19.getType(), var19.getGoodsid(), var15) >= var15) {
                  com.xy.v.Class24[] var21 = new com.xy.v.Class24[this.alr.length];

                  int var27;
                  for (int var35 = var27 = 0; var35 < var21.length; var35 = var27) {
                     int var58 = var27;
                     com.xy.v.Class24 var78 = new com.xy.v.Class24(this.alr[var27].b, this.alr[var27].a * var15);
                     var27++;
                     var21[var58] = var78;
                  }

                  List var28;
                  if ((var28 = var11.bj(var21)) == null) {
                     String var59 = "爵咟乑跭";
                     this.afx.dp("物品不足");
                     return;
                  }

                  PartJade var32;
                  (var32 = new PartJade(10L, this.ko.intValue())).setJade1(var15);
                  SuitOperBean var8 = new SuitOperBean();
                  var8.setType(21);
                  var8.setJade(var32);
                  var8.setGoods(var11.bb(var28));
                  String var9 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var8));
                  this.za().k(var9);
                  this.zc().f(this.lj());
                  return;
               }

               String var57 = "胶區巈溤";
               this.afx.dp("背包已满");
               return;
            }

            if (this.cn == 13) {
               Goodstable var10;
               if ((var10 = this.yx().getGood(this.ko)) == null) {
                  String var56 = "牓咄巈么孢坭";
                  this.afx.dp("物品已不存在");
                  return;
               }

               int var14;
               if ((var14 = Math.min((int)this.aal.ee(), var10.getUsetime() / this.ds)) <= 0) {
                  String var55 = "攬醑乑肣书n";
                  this.afx.dp("数量不能为0");
                  return;
               }

               PartJade var18 = new PartJade(var10.getRgid().longValue(), var14);
               SuitOperBean var5 = new SuitOperBean();
               var5.setType(24);
               var5.setJade(var18);
               String var26 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var5));
               this.za().k(var26);
               this.zc().f(this.lj());
               return;
            }

            Goodstable var2;
            if ((var2 = this.yx().getGood(this.bt)) == null) {
               String var54 = "牓咄巈么孢坭";
               this.afx.dp("物品已不存在");
               return;
            }

            int var3;
            if ((var3 = Math.min((int)this.aal.ee(), var2.getUsetime() / this.ds)) <= 0) {
               String var53 = "攬醑乑肣书n";
               this.afx.dp("数量不能为0");
               return;
            }

            long var4 = var2.getType();
            Class44 var10000;
            if (this.cn == 0) {
               if (var4 != 88L && var4 != 112L && var4 != 151L && !GoodType.p(var4) && !GoodType.s(var4)) {
                  if (var4 == 132L) {
                     com.xy.a.Class6 var25 = (com.xy.a.Class6)this.ze().getFormManagement().j(27);
                     var25.cb(var2, var3);
                     this.zc().f(this.lj());
                     return;
                  }

                  if (var4 == 118L) {
                     if (this.yx().getGoodPackSum(-1L, new BigDecimal(-1), 1) == 0) {
                        String var51 = "佚盁胶區巈溤";
                        this.afx.dp("你的背包已满");
                        return;
                     }

                     String var34 = var2.getValue();
                     String var49 = "讥朽c";
                     String var76 = "9";
                     long var31;
                     if ((var31 = com.xy.v.Class12.o(var34, "读条=", "|")) > 0L) {
                        GameReadBar var50 = this.afx.getGameReadBar();
                        String var10005 = "v";
                        StringBuilder var10004 = new StringBuilder("(").append(var3);
                        var10005 = "l强呪";
                        var50.setReadBar(
                           var3, 3, var10004.append(")开启").append(var2.getGoodsname()).toString(), Math.max(300L, var31), com.xy.v.Class22.l(), var2.getRgid()
                        );
                        this.zc().f(this.lj());
                        return;
                     }

                     var2.n(var3 * this.ds);
                     if (var2.getUsetime() <= 0) {
                        this.yx().ag(var2.getRgid());
                     }
                  } else {
                     var2.n(var3 * this.ds);
                     if (var2.getUsetime() <= 0) {
                        this.yx().ag(var2.getRgid());
                     }
                  }
               }

               StringBuilder var52 = new StringBuilder(String.valueOf(var2.getRgid().toString()));
               String var77 = "\"";
               String var24 = Agreement.getSendTextAES("user", var52.append("|").append(var3).toString());
               var10000 = this;
               this.afx.getClient().k(var24);
            } else if (this.cn == 1) {
               RoleSummoning var23;
               if ((var23 = this.yx().getPet(this.ko)) == null) {
                  String var48 = "厩唞儸巈么孢坭";
                  this.afx.dp("召唤兽已不存在");
                  return;
               }

               if (var4 == 715L) {
                  if (var23.getFriendliness() >= 20000000L) {
                     String var43 = "讻厰啺儡盚仮官偠嶬溽｟";
                     this.afx._do("该召唤兽的亲密值已满！");
                     return;
                  }
               } else if (var4 != 2040L && var4 != 1005L && var4 == 2323L) {
                  String var33 = var23.getPetSkills();
                  String var44 = "\tu\tq";
                  if (var33.indexOf("3034") == -1) {
                     var44 = "讻厰啺儡泿杕aca";
                     this.afx._do("该召唤兽没有???");
                     return;
                  }
               }

               StringBuilder var45 = new StringBuilder(String.valueOf(var2.getRgid().toString()));
               String var74 = "9";
               var45 = var45.append("|").append(var23.getSid());
               var74 = "\"";
               String var30 = Agreement.getSendTextAES("userpet", var45.append("|").append(var3).toString());
               var10000 = this;
               this.afx.getClient().k(var30);
            } else {
               label218: {
                  if (this.cn != 2) {
                     if (this.cn == 3) {
                        Baby var22;
                        if ((var22 = this.yx().getBaby(this.ko)) == null) {
                           String var42 = "孓嬕巈么孢坭";
                           this.afx.dp("孩子已不存在");
                           return;
                        }

                        if (var4 != 133L) {
                        }

                        StringBuilder var40 = new StringBuilder().append(var2.getRgid());
                        String var72 = "\"";
                        var40 = var40.append("|").append(var22.getBabyid());
                        var72 = "9";
                        String var29 = Agreement.getSendTextAES("userbaby", var40.append("|").append(var3).toString());
                        var10000 = this;
                        this.afx.getClient().k(var29);
                        break label218;
                     }

                     if (this.cn == 4) {
                        Lingbao var6;
                        if ((var6 = this.yx().getLingbao(this.ko)) == null) {
                           String var39 = "瀫寁扈沉寃嶮乓嬄坶";
                           this.afx.dp("灵宝或法宝已不存在");
                           return;
                        }

                        StringBuilder var10001 = new StringBuilder().append(var2.getRgid());
                        String var10002 = "9";
                        var10001 = var10001.append("|").append(var6.getBaoid());
                        var10002 = "\"";
                        String var7 = Agreement.getSendTextAES("userling", var10001.append("|").append(var3).toString());
                        this.afx.getClient().k(var7);
                     }
                  }

                  var10000 = this;
               }
            }

            var10000.zc().f(this.lj());
         }
      }
   }

   public Class44(GameView var1) {
      super(162, 3, com.xy.q.Class30.afz, var1);
      String var10003 = "/=s:sor.29";
      this.yy(-1, 0, 234, 186, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.als = new com.xy.i.Class4[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.als.length; var10000 = var2) {
         com.xy.i.Class4[] var5 = this.als;
         String var10004 = "I&\u0015 \u0015s\u00145T\"";
         int var10006 = 131 + var2;
         String var27;
         Class44 var10010;
         if (var2 == 0) {
            var27 = "杜屑";
            var27 = "最小";
            var10010 = this;
         } else if (var2 == 1) {
            var27 = "机奢";
            var27 = "最大";
            var10010 = this;
         } else if (var2 == 2) {
            var27 = "厊淖";
            var27 = "取消";
            var10010 = this;
         } else if (var2 == 3) {
            var27 = "硔察";
            var27 = "确定";
            var10010 = this;
         } else {
            var27 = "";
            var10010 = this;
         }

         Class4 var10002 = new Class4("sc/e/6.png", 1, var10006, Class49.ch, null, var27, var10010);
         var5[var2] = var10002;
         Class44 var6;
         if (var2 != 0 && var2 != 1) {
            if (var2 == 2 || var2 == 3) {
               var10002 = this.als[var2];
               var10003 = "/=s;sir.29";
               var10002.setImage("sc/e/7.png");
               this.als[var2].setBounds(32 + 111 * (var2 - 2), 136, 59, 25);
               this.als[var2].setForeground(Color.black);
            }

            var6 = this;
         } else {
            var6 = this;
            this.als[var2].setBounds(32 + 136 * var2, 103, 34, 18);
            this.als[var2].setFont(com.xy.q.Class49.bz);
         }

         var6.add(this.als[var2++]);
      }

      this.o = new JLabel[3];

      for (int var7 = var2 = 0; var7 < this.o.length; var7 = var2) {
         Color var24;
         int var10007;
         if (var2 == 1) {
            var24 = Color.red;
            var10007 = var2;
         } else {
            var24 = Color.white;
            var10007 = var2;
         }

         this.o[var2] = com.xy.q.Class1.k(21, 16, 192, 21, var24, var10007 == 0 ? com.xy.q.Class49.ch : com.xy.q.Class49.w);
         JLabel var8 = this.o[var2];
         String var12;
         if (var2 == 0) {
            var12 = "为镫佅畭";
            var12 = "一键使用";
         } else if (var2 == 1) {
            var12 = "嬺举仸洟纟举";
            var12 = "学习交流练习";
         } else if (var2 == 2) {
            var12 = "t\bv\u0016q\u000fs";
            var12 = "123,456";
         } else {
            var12 = "";
         }

         var8.setText(var12);
         Class44 var9;
         if (var2 == 0) {
            var9 = this;
            this.o[var2].setHorizontalAlignment(0);
         } else {
            if (var2 >= 1 && var2 <= 2) {
               this.o[var2].setHorizontalAlignment(10);
               this.o[var2].setBounds(84, 51 + (var2 - 1) * 21, 150, 16);
            }

            var9 = this;
         }

         var9.add(this.o[var2++]);
      }

      String var25 = "-?q8qmir.29";
      this.alv = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
      this.alv.setBounds(70, 103, 94, 19);
      this.add(this.alv);
      this.aal = new com.xy.q.Class27(15, this.alv, this);
      this.alt = new com.xy.q.Class54(this);
      this.alt.wp(com.xy.q.Class54.atp);
      this.alt.setBounds(31, 47, 45, 45);
      var25 = "6Yj^j\u000ft\u00145T\"";
      this.alt.dq("sc/d/51.png");
      this.add(this.alt);
      this.cl = new com.xy.w.Class18[2];

      for (int var10 = var2 = 0; var10 < this.cl.length; var10 = var2) {
         this.cl[var2] = new com.xy.w.Class18();
         Class44 var11;
         if (var2 == 0) {
            var11 = this;
            com.xy.w.Class18 var19 = this.cl[var2];
            var10003 = "-?q8qnkr.29";
            var19.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.cl[var2].setBounds(21, 16, 192, 21);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var15 = this.cl[var2];
               String var20 = "6Yj^j\bq\u00145T\"";
               var15.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.cl[var2].setBounds(21, 16, 192, 152);
            }

            var11 = this;
         }

         var11.add(this.cl[var2++]);
      }
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.afx.dh()) {
         if (this.cn == 11) {
            int var2 = (int)this.yx().getLoginResult().getContribution().longValue();
            if (this.aa != var2) {
               this.aa = var2;
               JLabel var10000 = this.o[2];
               String var10003 = "騱儧歿攬d";
               var10000.setText("驯养次数:" + var2 / this.ds);
               return;
            }
         } else if (this.cn == 12) {
            int var3 = this.yx().t(this.alr);
            if (this.aa != var3) {
               this.aa = var3;
               JLabel var6 = this.o[2];
               String var9 = "叕儔捘此敊\u007f";
               var6.setText("可兑换次数:" + var3 / this.ds);
               return;
            }
         } else if (this.cn == 13) {
            Goodstable var4;
            if ((var4 = this.yx().getGood(this.ko)) == null) {
               this.zc().f(this.lj());
               return;
            }

            if (this.aa != var4.getUsetime()) {
               this.aa = var4.getUsetime();
               JLabel var7 = this.o[2];
               String var10 = "厳儏挾歿攬d";
               var7.setText("可兑换次数:" + this.aa / this.ds);
               return;
            }
         } else {
            Goodstable var5;
            if ((var5 = this.yx().getGood(this.bt)) == null) {
               this.zc().f(this.lj());
               return;
            }

            if (this.aa != var5.getUsetime()) {
               this.aa = var5.getUsetime();
               JLabel var8 = this.o[2];
               String var11 = "抠朳攵釵\u007f";
               var8.setText("拥有数量:" + this.aa / this.ds);
            }
         }
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else if (this.cn != 11 && this.cn != 12 && this.cn != 13) {
         if (this.bt == null) {
            return 0L;
         } else {
            Goodstable var4;
            if ((var4 = this.yx().getGood(this.bt)) == null) {
               return 0L;
            } else {
               int var5 = var4.getUsetime() / this.ds;
               if (var4.getType() == 118L && var4.getGoodsid().intValue() != 81229) {
                  String var10000 = var4.getValue();
                  String var10001 = "设杛x";
                  String var10002 = "\"";
                  if (com.xy.v.Class12.o(var10000, "读条=", "|") == 0L) {
                     var5 = Math.min(10, var5);
                  }
               }

               return var1 > var5 ? (long)var5 : null;
            }
         }
      } else {
         return var1 > this.aa / this.ds ? (long)(this.aa / this.ds) : null;
      }
   }
}
