package com.xy.a.q;

import com.xy.bean.GiveGoodsBean;
import com.xy.formula.GoodType;
import com.xy.game.RoleData;
import com.xy.game.RoleTaskData;
import com.xy.game.Task;
import com.xy.readbean.Bbuy;
import com.xy.readbean.Goodstable;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class17 extends com.xy.q.Class30 {
   private com.xy.w.Class18 ei;
   private com.xy.q.Class27[] ny;
   private com.xy.i.Class19 kv;
   private JLabel[] ap;
   private int cb;
   private com.xy.q.Class21 nz;
   private BigDecimal bn;
   private com.xy.d.Class4 cs;
   private com.xy.i.Class3[] oa;

   @Override
   public void l() {
      this.h();
      super.l();
   }

   public Class17(GameView var1) {
      super(12, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "ed9c968wx`";
      this.yy(-1, 0, 392, 375, com.xy.q.Class30.agh);
      com.xy.w.Class9 var16 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "绝仂";
      this.yu(var16, "给予");
      String var10008 = "ed9b908wx`";
      String var10013 = "绝仂";
      this.kv = new com.xy.i.Class19("sc/e/7.png", 1, 73, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "给予", this);
      this.kv.setBounds(293, 274, 59, 25);
      this.add(this.kv);
      this.ny = new com.xy.q.Class27[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ny.length; var10000 = var2) {
         String var5 = "tu(r('08wx`";
         com.xy.q.Class36 var3 = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.w, Color.white);
         var3.setBounds(101, 266 + var2 * 28, 154, 19);
         var3.setHorizontalAlignment(10);
         this.add(var3);
         com.xy.q.Class27[] var10001 = this.ny;
         int var10002 = var2;
         com.xy.q.Class27 var10003 = new com.xy.q.Class27(15, var3, this);
         var2++;
         var10001[var10002] = var10003;
      }

      this.ap = new JLabel[4];

      for (int var6 = var2 = 0; var6 < this.ap.length; var6 = ++var2) {
         int var10004 = 266 + 28 * var2;
         var10008 = "')4z4z4z";
         this.ap[var2] = com.xy.q.Class1.f(43, var10004, 58, 19, 4, com.xy.q.Class49.c("#c000000"), com.xy.q.Class49.ch);
         JLabel var7 = this.ap[var2];
         String var9;
         if (var2 == 0) {
            var9 = "敷6釈";
            var9 = "数 量";
         } else if (var2 == 1) {
            var9 = "钼$乮";
            var9 = "银 两";
         } else if (var2 == 2) {
            var9 = "玮宠＝";
            var9 = "玩家：";
         } else if (var2 == 3) {
            var9 = "孢个亠洋";
            var9 = "学习交流";
         } else {
            var9 = "";
         }

         var7.setText(var9);
         this.add(this.ap[var2]);
         if (var2 == 2) {
            JLabel var13 = this.ap[var2];
            String var14 = "5dPA&7&7";
            var13.setForeground(com.xy.q.Class49.c("#cFF0000"));
            this.ap[var2].setBounds(52, 325, 58, 19);
            this.ap[var2].setHorizontalAlignment(10);
         }

         if (var2 == 3) {
            this.ap[var2].setBounds(102, 325, 250, 19);
            this.ap[var2].setHorizontalAlignment(10);
         }
      }

      this.ei = new com.xy.w.Class18();
      String var15 = "9ge`e5s*:j-";
      this.ei.mt(com.xy.w.Class16.m("sc/d/19.png", 30, 30, 30, 30, false));
      this.ei.setBounds(44, 46, 309, 207);
      this.add(this.ei);
      this.nz = new Class68(this, this, 6, 4, 51, 51, 0, 0, 45, 48);
      var10006 = "tu(r('?8wx`";
      this.nz.gt(com.xy.w.Class16.c("sc/d/18.png"));
      this.nz.rm(true);
      this.nz.be(true);
      this.add(this.nz);
   }

   public void c() {
      this.cb = 0;
      this.f();
   }

   public void ds(long var1, JTextField var3) {
   }

   public void kf(int var1, Goodstable var2, int var3, com.xy.d.Class1 var4) {
      Bbuy var5;
      if ((var5 = this.yt().bc(var2.getGoodsid())) != null && (var5.getPrice1() != 0L || var1 != 1) && (var5.getPrice2() != 0L || var1 != 2)) {
         GiveGoodsBean var6 = new GiveGoodsBean();
         var6.setType(var1);
         var6.setRgid(var2.getRgid());
         var6.setSum(var3);
         String var7 = Agreement.getSendTextAES("give", com.xy.v.Class31.a().toJson(var6));
         this.za().k(var7);
         this.f();
         this.i(var2.getRgid());
      } else {
         String var10001 = "乇屚仄囚敼茇嚾";
         this.afx._do("不属于回收范围");
      }
   }

   public void i(BigDecimal var1) {
      int var2 = this.cb == 1 ? 1 : (this.cb == 2 ? 2 : 0);
      if (var2 != 0) {
         com.xy.v.Class8 var3 = this.yt();
         RoleData var4 = this.yx();

         int var5;
         int var6;
         for (int var10000 = var6 = (var5 = this.nz.dx() + this.nz.vq().length) - 24; var10000 < var4.goodPacks.length && var6 < var5; var10000 = ++var6) {
            Goodstable var7;
            Bbuy var8;
            if ((var7 = var4.getGood(var4.goodPacks[var6])) != null
               && (var1 == null || var7.getRgid().compareTo(var1) != 0)
               && var7.getGoodlock() != 1
               && (var8 = var3.bc(var7.getGoodsid())) != null
               && (var2 == 1 && var8.getPrice1() != 0L || var2 == 2 && var8.getPrice2() != 0L)) {
               this.nz.n(var6);
               this.hr(var7, true);
               return;
            }
         }

         return;
      }
   }

   public void kg(Goodstable var1, int var2, com.xy.d.Class9 var3) {
      GiveGoodsBean var4 = new GiveGoodsBean();
      var4.setOtherID(new BigDecimal(var3.au.getI()));
      var4.setType(3);
      var4.setRgid(var1.getRgid());
      var4.setSum(var2);
      String var5 = Agreement.getSendTextAES("give", com.xy.v.Class31.a().toJson(var4));
      this.za().k(var5);
      this.f();
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void kh(Goodstable var1, int var2, com.xy.d.Class1 var3) {
      RoleTaskData var10000 = this.yx().getTaskSystem();
      String var10001 = "经亏牿哆";
      Task var5;
      if ((var5 = var10000.e("给予物品", var1.getGoodsname())) == null) {
         var10001 = "害佤盎牭咋丙殡三慕兰跩";
         this.afx._do("对你的物品丝毫不感兴趣");
      } else {
         String var10003 = "@";
         StringBuilder var7 = new StringBuilder("G").append(var5.getTaskId());
         String var10002 = "6";
         StringBuilder var8 = var7.append("|").append(var1.getRgid());
         var10002 = "{";
         String var6 = Agreement.getSendTextAES("taskN", var8.append("|").append(var2).toString());
         this.za().k(var6);
         this.f();
      }
   }

   public void e() {
      if (!this.afx.ah() && this.cs != null) {
         RoleData var1 = this.yx();
         Goodstable var2 = this.bn != null ? var1.getGood(this.bn) : null;
         int var3 = Math.min((int)this.ny[0].ee(), var2 != null ? var2.getUsetime() : 0);
         if (var2 != null && var2.getGoodlock() == 1) {
            String var10 = "爣哅裡劤镋";
            this.afx._do("物品被加锁");
         } else if (this.cs instanceof com.xy.d.Class8) {
            if (var2 != null && GoodType.aw(var2)) {
               String var9 = "牿哆时泒经亏";
               this.afx._do("物品无法给予");
            } else {
               this.ki(var2, var3, (com.xy.d.Class8)this.cs);
            }
         } else if (var2 == null || var3 <= 0) {
            String var8 = "泫服遃丩盎牭咋";
            this.afx._do("没有选中的物品");
         } else if (this.cs instanceof com.xy.d.Class1) {
            com.xy.d.Class1 var4 = (com.xy.d.Class1)this.cs;
            if (var1.getTaskSystem().getTaskGive(Integer.parseInt(var4.d.getNpcid()))) {
               this.kh(var2, var3, (com.xy.d.Class1)this.cs);
            } else {
               String var10000 = var4.d.getNpctype();
               String var10001 = "!6";
               if (var10000.equals("71")) {
                  this.kf(1, var2, var3, (com.xy.d.Class1)this.cs);
               } else {
                  var10000 = var4.d.getNpctype();
                  var10001 = "<s";
                  if (var10000.equals("89")) {
                     this.kf(2, var2, var3, (com.xy.d.Class1)this.cs);
                  } else {
                     var10001 = "対佶皃牿哆下毬丛愘兢趤";
                     this.afx._do("对你的物品丝毫不感兴趣");
                  }
               }
            }
         } else {
            if (this.cs instanceof com.xy.d.Class9) {
               this.kg(var2, var3, (com.xy.d.Class9)this.cs);
            }
         }
      }
   }

   public void f() {
      this.ny[0].ty().setText("0");
      this.ny[1].ty().setText("0");
      this.bn = null;
      this.nz.n(-1);
   }

   public void ki(Goodstable var1, int var2, com.xy.d.Class8 var3) {
      BigDecimal var4;
      if ((var4 = this.em()) == null) {
         String var10001 = "釕铻三跹";
         this.afx._do("金钱不足");
      } else if (var1 != null || var4.longValue() > 0L) {
         GiveGoodsBean var5 = new GiveGoodsBean();
         var5.setType(0);
         var5.setOtherID(var3.ap.getRole_id());
         var5.setOtherName(var3.ap.getRolename());
         var5.setRgid(var1 != null ? var1.getRgid() : null);
         var5.setSum(var2);
         var5.setGold(var4);
         String var6 = Agreement.getSendTextAES("give", com.xy.v.Class31.a().toJson(var5));
         this.za().k(var6);
         this.f();
      }
   }

   public BigDecimal em() {
      try {
         long var1;
         if ((var1 = this.ny[1].ee()) <= 0L) {
            return new BigDecimal(0);
         } else {
            return this.yx().getLoginResult().getGold().longValue() < var1 ? null : new BigDecimal(var1);
         }
      } catch (Exception var3) {
         return null;
      }
   }

   // $VF: synthetic method
   static int kj(Class17 var0) {
      return var0.cb;
   }

   public com.xy.d.Class4 bp() {
      return this.cs;
   }

   public void kk(com.xy.d.Class4 var1) {
      this.c();
      Class17 var10000;
      if (var1 instanceof com.xy.d.Class8) {
         var10000 = this;
         this.ny[1].ty().setEditable(true);
         JLabel var10001 = this.ap[2];
         String var10002 = "珣宲p";
         var10001.setText("玩家:");
      } else if (var1 instanceof com.xy.d.Class1) {
         RoleData var2 = this.yx();
         com.xy.d.Class1 var3 = (com.xy.d.Class1)var1;
         if (!var2.getTaskSystem().getTaskGive(Integer.parseInt(var3.d.getNpcid()))) {
            String var4 = var3.d.getNpctype();
            String var8 = "!6";
            if (var4.equals("71")) {
               var10000 = this;
               this.cb = 1;
            } else {
               String var6 = var3.d.getNpctype();
               var8 = "<s";
               if (!var6.equals("89")) {
                  var8 = "仑奫僈丛惴琐佧";
                  this.afx._do("他好像不想理你");
                  return;
               }

               this.cb = 2;
               var10000 = this;
            }
         } else {
            var10000 = this;
         }

         var10000.ny[1].ty().setEditable(false);
         var10000 = this;
         JLabel var11 = this.ap[2];
         String var13 = "J\u001aGp";
         var11.setText("NPC:");
      } else {
         if (var1 instanceof com.xy.d.Class9) {
            this.ny[1].ty().setEditable(false);
            JLabel var7 = this.ap[2];
            String var12 = "陗无攱贻=";
            var7.setText("限时收购:");
         }

         var10000 = this;
      }

      var10000.ap[3].setText(var1.ae());
      this.cs = var1;
      if (this.cb == 1 || this.cb == 2) {
         this.i(null);
      }

      this.zc().b(this.lj());
   }

   public void h() {
      int var1 = 1 + this.yx().goodPacks.length / 24;
      if (this.oa == null || this.oa.length != var1) {
         this.oa = this.zd(this.oa, var1, this.nz.ah());
         short var2 = 353;
         byte var3 = 46;

         int var4;
         for (int var10000 = var4 = 0; var10000 < this.oa.length; var10000 = var4) {
            com.xy.i.Class3 var5 = this.oa[var4];
            int var10002 = var3 + var4 * 35;
            var4++;
            var5.setBounds(var2, var10002, 36, 33);
         }

         this.nz.vr(this.oa, 0);
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 == 0L) {
         return null;
      } else if (var1 < 0L) {
         return 0L;
      } else if (var3 == this.ny[0].ty()) {
         RoleData var9 = this.yx();
         Goodstable var5 = this.bn != null ? var9.getGood(this.bn) : null;
         if (this.cb != 1 && this.cb != 2) {
            if (var5 == null) {
               return 0L;
            } else {
               return var1 > var5.getUsetime().intValue() ? var5.getUsetime().longValue() : null;
            }
         } else if (var5 != null) {
            Bbuy var6;
            if ((var6 = this.yt().bc(var5.getGoodsid())) != null) {
               long var7 = var1 > var5.getUsetime().intValue() ? var5.getUsetime().longValue() : var1;
               var7 *= this.cb == 1 ? var6.getPrice1() : var6.getPrice2();
               this.ny[1].ty().setText(String.valueOf(var7));
            }

            return var1 > var5.getUsetime().intValue() ? var5.getUsetime().longValue() : null;
         } else {
            this.ny[1].ty().setText("0");
            return 0L;
         }
      } else if (var3 == this.ny[1].ty()) {
         if (this.cb != 1 && this.cb != 2) {
            long var4 = this.yx().getLoginResult().getGold().longValue();
            return var1 > var4 ? var4 : null;
         } else {
            return null;
         }
      } else {
         return 0L;
      }
   }

   public void hr(Goodstable var1, boolean var2) {
      if (!com.xy.v.Class12.x(this.bn, var1.getRgid())) {
         this.bn = var1.getRgid();
         this.ny[0].ty().setText(String.valueOf(0));
      }

      long var3 = var2 ? var1.getUsetime().intValue() : this.ny[0].ee() + 1L;
      this.ny[0].ty().setText(String.valueOf(var3));
   }
}
