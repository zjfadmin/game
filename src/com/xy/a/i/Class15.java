package com.xy.a.i;

import com.xy.bean.LoginResult;
import com.xy.bean.SuitOperBean;
import com.xy.entity.PartJade;
import com.xy.game.RoleData;
import com.xy.i.Class11;
import com.xy.i.Class18;
import com.xy.q.Class49;
import com.xy.q.Class52;
import com.xy.q.Class54;
import com.xy.readbean.MoneyType;
import com.xy.readbean.RoleSuitBean;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Class15 extends com.xy.q.Class30 {
   private DefaultListModel<String> pk;
   private JScrollPane pl;
   private int gw;
   private com.xy.q.Class14[] pm;
   private boolean ak;
   private com.xy.q.Class27 pn;
   private Class52 ls;
   private Class35[] po;
   private MoneyType pp;
   private com.xy.w.Class18[] aw;
   private JList<String> pq;
   private int ae;
   private com.xy.i.Class11[] hd;
   private JLabel[] o;
   public int ah;

   public Class15(GameView var1) {
      super(65, 2, com.xy.q.Class30.afz, var1);
      String var10017 = "\u0004\u001aX\u001dXHY\t\u0019\u001e";
      this.yy(-1, 0, 552, 441, com.xy.q.Class30.agh);
      com.xy.w.Class9 var61 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10018 = "嶴杠筠弼";
      this.yu(var61, "已有符录");
      this.pk = new DefaultListModel<>();
      this.pq = new JList<>();
      this.pq.setOpaque(false);
      this.pq.setSelectionBackground(new Color(33, 42, 52));
      this.pq.setSelectionForeground(Color.white);
      this.pq.setForeground(Color.white);
      this.pq.setFont(Class49.cp);
      this.pq.setBackground(Class49.bk);
      this.pq.setModel(this.pk);
      this.pq.setSelectionMode(0);
      this.pq.addListSelectionListener(new Class29(this));
      this.pl = com.xy.q.Class1.g(47, 42, 165, 318, this.pq, -1);
      this.add(this.pl);
      this.hd = new com.xy.i.Class11[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.hd.length; var10000 = var2) {
         com.xy.i.Class11[] var8 = this.hd;
         String var10004 = "\u0004\u001aX\u001cXOY\t\u0019\u001e";
         int var10006 = 14 + var2;
         String var55;
         Class15 var10010;
         if (var2 == 0) {
            var55 = "澆浒";
            var55 = "激活";
            var10010 = this;
         } else if (var2 == 2) {
            var55 = "菀忮";
            var55 = "获得";
            var10010 = this;
         } else if (var2 == 3) {
            var55 = "剦阍";
            var55 = "删除";
            var10010 = this;
         } else if (var2 == 4) {
            var55 = "敁弬";
            var55 = "收录";
            var10010 = this;
         } else if (var2 == 5) {
            var55 = "留批珏筏";
            var55 = "生成玉符";
            var10010 = this;
         } else {
            var55 = "";
            var10010 = this;
         }

         Class11 var10002 = new Class11("sc/e/6.png", 1, var10006, Class49.ch, null, var55, var10010);
         var8[var2] = var10002;
         this.hd[var2].setBounds(430, 193, 34, 18);
         Class15 var9;
         if (var2 == 0) {
            var9 = this;
            this.hd[var2].setFont(Class49.bz);
         } else if (var2 == 1) {
            var9 = this;
            var10002 = this.hd[var2];
            String var10003 = "\n\u0014V\u0012VAIY\t\u0019\u001e";
            var10002.setImage("sc/e/60.png");
            this.hd[var2].setBounds(194, 367, 18, 18);
         } else if (var2 == 2) {
            var9 = this;
            this.hd[var2].setFont(Class49.bz);
            this.hd[var2].setBounds(473, 368, 34, 18);
         } else if (var2 != 3 && var2 != 4) {
            if (var2 == 5) {
               this.hd[var2].setForeground(Color.black);
               com.xy.i.Class11 var10001 = this.hd[var2];
               String var37 = "\n\u0014V\u0012VEOY\t\u0019\u001e";
               var10001.setImage("sc/e/26.png");
               this.hd[var2].setBounds(329, 395, 99, 25);
            }

            var9 = this;
         } else {
            var9 = this;
            this.hd[var2].setForeground(Color.black);
            var10002 = this.hd[var2];
            String var49 = "5\ni\fi^h\u0019(\u000e";
            var10002.setImage("sc/e/7.png");
            this.hd[var2].setBounds(65 + (var2 - 3) * 71, 395, 59, 25);
         }

         var9.add(this.hd[var2++]);
      }

      this.o = new JLabel[9];

      for (int var10 = var2 = 0; var10 < this.o.length; var10 = var2) {
         String var10008 = "e\nvYvYvY";
         this.o[var2] = com.xy.q.Class1.f(45, 21, 165, 21, 10, Class49.c("#c000000"), Class49.ch);
         JLabel var11 = this.o[var2];
         String var22;
         if (var2 == 0) {
            var22 = "嶅敏弢央袲呴";
            var22 = "已收录套装名";
         } else if (var2 == 1) {
            var22 = "嶛数弼珏筏邮亟";
            var22 = "已收录玉符部件";
         } else if (var2 == 2) {
            var22 = "厖敁弬夠攉";
            var22 = "可收录套数";
         } else if (var2 == 3) {
            var22 = "當扖乃收ｳ";
            var22 = "生成个数：";
         } else if (var2 == 4) {
            var22 = "戹靷醨铆｣";
            var22 = "所需金钱：";
         } else if (var2 == 5) {
            var22 = "戆革瀳侇偺ｳ";
            var22 = "所需灵修值：";
         } else if (var2 == 6) {
            var22 = "珇杰瀂侗偋｣";
            var22 = "现有灵修值：";
         } else if (var2 == 7) {
            var22 = "告乩夑袬亃乩乬邁亰权数弼新･烿冒fIfIfI菱忾";
            var22 = "同一套装仅一个部件未收录时，点击      获得";
         } else if (var2 == 8) {
            var22 = "伆畟筟弢厖互畦仐宀廣盽現筟";
            var22 = "使用符录可以生产对应的玉符";
         } else {
            var22 = "";
         }

         var11.setText(var22);
         if (var2 == 0) {
            JLabel var31 = this.o[var2];
            String var39 = "e\n\u0000/\u0000/\u0000/";
            var31.setForeground(Class49.c("#cFFFFFF"));
            this.o[var2].setHorizontalAlignment(0);
         }

         Class15 var12;
         if (var2 == 1) {
            var12 = this;
            JLabel var50 = this.o[var2];
            String var54 = "T\u001a1?1?1?";
            var50.setForeground(Class49.c("#cFFFFFF"));
            this.o[var2].setHorizontalAlignment(0);
            this.o[var2].setBounds(215, 21, 308, 21);
         } else if (var2 == 2) {
            var12 = this;
            this.o[var2].setBounds(48, 366, 86, 19);
         } else if (var2 >= 3 && var2 <= 6) {
            var12 = this;
            this.o[var2].setHorizontalAlignment(4);
            this.o[var2].setBounds(218, 249 + (var2 - 3) * 39, 110, 20);
         } else if (var2 == 7) {
            var12 = this;
            this.o[var2].setFont(Class49.n);
            this.o[var2].setBounds(219, 195, 288, 14);
            JLabel var32 = this.o[var2];
            String var40 = "e\n\u0000/\u0000/\u0000/";
            var32.setForeground(Class49.c("#cFFFFFF"));
         } else {
            if (var2 == 8) {
               this.o[var2].setFont(Class49.n);
               this.o[var2].setBounds(218, 223, 288, 14);
            }

            var12 = this;
         }

         var12.add(this.o[var2++]);
      }

      this.pm = new com.xy.q.Class14[3];

      for (int var13 = var2 = 0; var13 < this.pm.length; var13 = var2) {
         this.pm[var2] = com.xy.q.Class1.i(0, 0, 0, 0, 10, Color.white, Class49.w);
         com.xy.q.Class14 var14 = this.pm[var2];
         String var33 = "\n\u0014V\u0013VFNY\t\u0019\u001e";
         var14.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
         Class15 var15;
         if (var2 == 0) {
            var15 = this;
            this.pm[var2].setBounds(135, 366, 78, 19);
         } else if (var2 == 1) {
            var15 = this;
            this.pm[var2].setBounds(328, 288, 144, 20);
         } else {
            if (var2 == 2) {
               this.pm[var2].setBounds(328, 327, 144, 20);
            }

            var15 = this;
         }

         var15.add(this.pm[var2++]);
      }

      String var16 = "\u001a%F\"Fw^h\u0019(\u000e";
      com.xy.q.Class36 var6 = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), Class49.w, Color.white);
      var6.setBounds(328, 249, 144, 20);
      this.add(var6);
      this.pn = new com.xy.q.Class27(15, var6, this);
      this.pp = new MoneyType();
      String var60 = "瀌侙偅";
      this.pp.setIdAndKey(0, "灵修值");
      this.ls = com.xy.q.Class1.m(328, 366, 144, 20, 10, Color.white, Class49.w, this.pp, var1);
      this.ls.n(2);
      String var10005 = "\u001a%F\"Fw^h\u0019(\u000e";
      this.ls.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.ls);
      this.po = new Class35[8];

      int var3;
      for (int var17 = var3 = 0; var17 < this.po.length; var17 = var3) {
         this.po[var3] = new Class35(this);
         Class15 var18;
         if (var3 >= 0 && var3 <= 3) {
            var18 = this;
            this.po[var3].setBounds(230 + 62 * var3, 51, 59, 58);
         } else {
            if (var3 >= 4 && var3 <= 7) {
               this.po[var3].setBounds(245 + 64 * (var3 - 4), 119, 59, 58);
            }

            var18 = this;
         }

         var18.add(this.po[var3++]);
      }

      this.aw = new com.xy.w.Class18[4];

      for (int var19 = var3 = 0; var19 < this.aw.length; var19 = var3) {
         this.aw[var3] = new com.xy.w.Class18();
         Class15 var20;
         if (var3 == 0) {
            var20 = this;
            com.xy.w.Class18 var44 = this.aw[var3];
            String var51 = "\n\u0014V\u0013VELY\t\u0019\u001e";
            var44.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var3].setBounds(45, 21, 165, 21);
         } else if (var3 == 1) {
            var20 = this;
            com.xy.w.Class18 var45 = this.aw[var3];
            String var52 = "\u001a%F\"Ft]h\u0019(\u000e";
            var45.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            this.aw[var3].setBounds(45, 21, 165, 340);
         } else if (var3 == 2) {
            var20 = this;
            com.xy.w.Class18 var46 = this.aw[var3];
            String var53 = "\n\u0014V\u0013VELY\t\u0019\u001e";
            var46.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var3].setBounds(215, 21, 308, 21);
         } else {
            if (var3 == 3) {
               com.xy.w.Class18 var34 = this.aw[var3];
               String var47 = "\u001a%F\"Ft]h\u0019(\u000e";
               var34.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aw[var3].setBounds(215, 21, 308, 200);
            }

            var20 = this;
         }

         var20.add(this.aw[var3++]);
      }
   }

   public void ak(Class54 var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.po.length; var10000 = var2) {
         Class35 var10 = this.po[var2];
         var2++;
         Class35.ago(var10).setBorder(BorderFactory.createEmptyBorder());
      }

      var1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
      PartJade var8 = (PartJade)var1.jx();
      this.gw = var8.getPartId();
      int[] var4 = this.yt().bd((int)var8.getSuitid()).getParts();
      String[] var5 = this.yx().getPackRecord().getCollect(this.ae);
      String var6 = String.valueOf(this.gw);
      int var7;
      int var11 = var7 = 0;

      String var12;
      while (true) {
         if (var11 >= var5.length) {
            var12 = var6;
            break;
         }

         if (var5[var7].equals(var6)) {
            var12 = var6 = null;
            break;
         }

         var11 = ++var7;
      }

      Class15 var14;
      if (var12 == null) {
         com.xy.i.Class11 var13 = this.hd[0];
         String var10002 = "\n\u0014V\u0012VBMY\t\u0019\u001e";
         var13.setBtn(-1, "sc/e/54.png");
         var14 = this;
         this.hd[0].setForeground(Color.GRAY);
         this.ak = true;
      } else if (var5.length + 1 == var4.length) {
         com.xy.i.Class11 var15 = this.hd[0];
         String var16 = "5\ni\fi_h\u0019(\u000e";
         var15.setBtn(1, "sc/e/6.png");
         var14 = this;
         this.hd[0].setForeground(Color.WHITE);
         this.ak = false;
      } else {
         var14 = this;
         com.xy.i.Class11 var10001 = this.hd[0];
         String var10003 = "\n\u0014V\u0012VBMY\t\u0019\u001e";
         var10001.setBtn(-1, "sc/e/54.png");
         this.hd[0].setForeground(Color.GRAY);
         this.ak = false;
      }

      var14.pn.ty().setText("0");
   }

   public void lk(RoleSuitBean var1) {
      this.ae = var1 != null ? var1.getSuitID() : 0;
      this.gw = -1;
      this.ak = false;
      com.xy.i.Class11 var10000 = this.hd[0];
      String var10002 = "\u001a%F#Fs]h\u0019(\u000e";
      var10000.setBtn(-1, "sc/e/54.png");
      this.hd[0].setForeground(Color.GRAY);
      this.pn.ty().setText("0");
      this.ls.l();
      int var2 = 0;

      for (int var9 = var2; var9 < this.po.length; var9 = var2) {
         this.po[var2++].t();
      }

      if (var1 != null) {
         int[] var7 = var1.getParts();
         String[] var3 = this.yx().getPackRecord().getCollect(this.ae);

         int var4;
         for (int var10 = var4 = 0; var10 < var7.length && var4 < this.po.length; var10 = var4) {
            String var5 = String.valueOf(var7[var4]);
            int var6;
            int var11 = var6 = 0;

            while (true) {
               Class15 var12;
               if (var11 >= var3.length) {
                  var12 = this;
               } else {
                  if (!var3[var6].equals(var5)) {
                     var11 = ++var6;
                     continue;
                  }

                  var5 = null;
                  var12 = this;
               }

               Class35.agn(var12.po[var4]).setText(var5 != null ? "0" : "1");
               PartJade var8;
               (var8 = new PartJade(this.ae, var7[var4])).setJade1(var5 != null ? 0 : 1);
               Class35.ago(this.po[var4]).gs(15, var8);
               Class35 var13 = this.po[var4];
               var4++;
               Class35.ago(var13).setBorder(BorderFactory.createEmptyBorder());
               break;
            }
         }
      }
   }

   // $VF: synthetic method
   static JList ll(Class15 var0) {
      return var0.pq;
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 >= 0L && this.gw != -1 && this.ak) {
         long var4 = this.za().l(2, 12) ? 100000 : 1000000;
         RoleData var10000 = this.yx();
         long var7 = var10000.getLoginResult().getGold().longValue() / var4;
         long var9 = var10000.getLoginResult().getScoretype(this.pp.getKey()).longValue() / 10L;
         long var11 = Math.min(var7, var9);
         if (var1 > var11 && var11 <= 999L) {
            return var11;
         } else {
            return var1 > 999L ? 999L : null;
         }
      } else {
         return 0L;
      }
   }

   public void ds(long var1, JTextField var3) {
      if (var1 > 0L && this.gw != -1 && this.ak) {
         long var4 = this.za().l(2, 12) ? 100000 : 1000000;
         Class49.b(this.pm[1], var4 * var1);
         Class49.b(this.pm[2], 10L * var1);
      } else {
         Class49.b(this.pm[1], 0L);
         Class49.b(this.pm[2], 0L);
      }
   }

   public void h() {
      this.lk(null);
      com.xy.v.Class8 var1 = this.yt();
      RoleData var2;
      List var3;
      this.ah = (var3 = (var2 = this.yx()).getPackRecord().c()) != null ? var3.size() : 0;
      int var10000 = 0;
      this.pk.removeAllElements();

      for (int var4 = 0; var10000 < this.ah; var10000 = ++var4) {
         RoleSuitBean var5;
         if ((var5 = var1.bd((Integer)var3.get(var4))) != null) {
            this.pk.addElement(var5.getSname());
         }
      }

      com.xy.q.Class14 var6 = this.pm[0];
      StringBuilder var10001 = new StringBuilder(String.valueOf(this.ah));
      String var10002 = "V";
      var6.setText(var10001.append("/").append(var2.getPackRecord().getSuitNum()).toString());
   }

   public void g(int var1) {
      RoleData var2;
      LoginResult var3 = (var2 = this.yx()).getLoginResult();
      if (var1 == 15) {
         BigDecimal var14 = new BigDecimal(this.za().gameType == 2 ? 20000000 : 100000000);
         if (var3.getGold().compareTo(var14) < 0) {
            GameView var20 = this.afx;
            String var43 = "靆觨";
            StringBuilder var31 = new StringBuilder("需要").append(var14.longValue() / 10000L);
            String var38 = ".醦幸戺肄壩務乽阩YW";
            var20.dp(var31.append("W金币才能增加上限..").toString());
         } else {
            int var17 = var2.getPackRecord().getSuitNum() + 1;
            var2.getPackRecord().setSuitNum(var17);
            ParamTool.g(var14.longValue(), this.afx);
            String var45 = "Z";
            String var19 = Agreement.getSendTextAES("1", "3" + var17);
            this.za().k(var19);
            com.xy.q.Class14 var30 = this.pm[0];
            StringBuilder var37 = new StringBuilder(String.valueOf(this.ah));
            String var42 = "V";
            var30.setText(var37.append("/").append(var2.getPackRecord().getSuitNum()).toString());
         }
      } else if (this.ae != 0) {
         if (var1 == 14) {
            if (this.gw == -1) {
               String var29 = "讱遠抯伉觇澩浽盭珏筏hG";
               this.afx.dp("请选择你要激活的玉符..");
            } else if (new BigDecimal(500000).compareTo(var3.getGold()) > 0) {
               String var28 = "醦幸乺跊YW";
               this.afx.dp("金币不足..");
            } else {
               String var34 = "瀜侨偕";
               if (200L > var3.getScoretype("灵修值").longValue()) {
                  String var27 = "瀌侙偅乺跊ｻ徒双菎厡呞YW";
                  this.afx.dp("灵修值不足，快去获取吧..");
               } else if (var2.getPackRecord().e(this.ae, this.gw) != null) {
                  String var26 = "泧杠厩澩浽盭邮亟hG";
                  this.afx.dp("没有可激活的部件..");
               } else {
                  SuitOperBean var13 = new SuitOperBean();
                  PartJade var16 = new PartJade(this.ae, this.gw);
                  var16.setJade1(0);
                  var13.setJade(var16);
                  var13.setType(8);
                  String var18 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var13));
                  this.za().k(var18);
                  var3.setGold(var3.getGold().subtract(new BigDecimal(500000)));
                  String var41 = var3.getScore();
                  String var44 = "瀌侙偅JKGI";
                  var3.setScore(com.xy.v.Class5.a(var41, "灵修值=200", 3));
                  var34 = "淎聾什[vY烿瀜侨偕fIfI戥阍什\\v>醗幨hG";
                  this.afx.dp("消耗了200点灵修值    扣除了50W金币..");
                  com.xy.i.Class11 var10000 = this.hd[0];
                  var34 = "\n\u0014V\u0012VBMY\t\u0019\u001e";
                  var10000.setBtn(-1, "sc/e/54.png");
                  this.hd[0].setForeground(Color.GRAY);
               }
            }
         } else if (var1 == 17) {
            SuitOperBean var12 = new SuitOperBean();
            PartJade var15 = new PartJade(this.ae, 0);
            var12.setJade(var15);
            var12.setType(8);
            String var6 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var12));
            this.za().k(var6);
         } else {
            if (var1 == 19) {
               if (this.gw == -1) {
                  String var25 = "讱遠抯伉觇當扖盭珏筏hG";
                  this.afx.dp("请选择你要生成的玉符..");
                  return;
               }

               if (!this.ak) {
                  String var24 = "伙辯泘敁弬辰欝現筟YW";
                  this.afx.dp("你还没收录过此玉符..");
                  return;
               }

               int var4;
               if ((var4 = (int)this.pn.ee()) <= 0) {
                  String var23 = "讱迺儣伉觇當扖盭珏筏收醦hG";
                  this.afx.dp("请输入你要生成的玉符数量..");
                  return;
               }

               long var5 = this.za().l(2, 12) ? 100000 : 1000000;
               BigDecimal var7 = new BigDecimal(var5 * var4);
               BigDecimal var8 = new BigDecimal(10 * var4);
               if (var7.compareTo(var3.getGold()) > 0) {
                  String var22 = "醦幸乺跊YW";
                  this.afx.dp("金币不足..");
                  return;
               }

               String var10002 = "瀜侨偕";
               if (var8.compareTo(var3.getScoretype("灵修值")) > 0) {
                  String var21 = "瀌侙偅乺跊ｻ徒双菎厡呞YW";
                  this.afx.dp("灵修值不足，快去获取吧..");
                  return;
               }

               PartJade var9;
               (var9 = new PartJade(this.ae, this.gw)).setJade(1, var4);
               SuitOperBean var10 = new SuitOperBean();
               var10.setJade(var9);
               var10.setType(9);
               String var11 = Agreement.getSendTextAES("suitoperate", com.xy.v.Class31.a().toJson(var10));
               this.za().k(var11);
               var3.setGold(var3.getGold().subtract(var7));
               String var10003 = var3.getScore();
               String var10006 = "瀳侇偺T";
               var3.setScore(com.xy.v.Class5.a(var10003, "灵修值=" + var8, 3));
               GameView var10001 = this.afx;
               String var10004 = "深聠仿";
               StringBuilder var32 = new StringBuilder("消耗了").append(var8);
               var10003 = "烐瀳侇偺IfIf戊阢仯";
               StringBuilder var33 = var32.append("点灵修值    扣除了").append(var7.longValue() / 10000L);
               var10003 = ".醦幸YW";
               var10001.dp(var33.append("W金币..").toString());
               this.pn.ty().setText("0");
            }
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   @Override
   public void l() {
      this.h();
      super.l();
   }
}
