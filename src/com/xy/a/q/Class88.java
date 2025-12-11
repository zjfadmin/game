package com.xy.a.q;

import com.xy.battle.BattleMan;
import com.xy.battle.BattleScene;
import com.xy.battle.TypeState;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.i.Class18;
import com.xy.i.Class19;
import com.xy.q.Class49;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Class88 extends com.xy.q.Class30 {
   private boolean ak;
   private com.xy.q.Class53 ana;
   private int z;
   private JLabel sy;
   private BigDecimal[] anb;
   private com.xy.w.Class18[] aw;
   private com.xy.i.Class19[] ahs;
   private JScrollPane i;
   private JList<com.xy.q.Class53> ro;
   private List<com.xy.q.Class53> iv;
   private Class56[] anc;

   @Override
   public void l() {
      if (this.yx() != null) {
         this.anc[2].n(this.afx.systemData.d() ? 0 : 1);
         this.y(this.z);
         super.l();
      }
   }

   public void xi() {
      List var1 = this.agl(0);
      this.ana = null;
      this.ro.removeAll();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.iv.size(); var10000 = var2) {
         this.iv.get(var2++).t();
      }

      List var3 = this.yx().ba();
      int var4 = 0;
      int var5 = var3.size();

      for (int var7 = var4; var7 < var5; var7 = ++var4) {
         RolePet var6;
         if ((var6 = (RolePet)var3.get(var4)).getHelp() != 0 && (var1 == null || !var1.contains(var6.getId()))) {
            this.ew(var6.getPet());
         }
      }

      this.a();
      this.ro.setPreferredSize(new Dimension(180, 20 * this.ro.getComponentCount()));
      this.h();
   }

   public void bi(int var1) {
      this.z = var1;
   }

   public void a() {
      if (this.anb != null) {
         int var1 = this.ro.getComponentCount();
         ArrayList var2 = new ArrayList();

         int var3;
         for (int var10000 = var3 = 0; var10000 < this.iv.size(); var10000 = var3) {
            var2.add(this.iv.get(var3++));
         }

         for (int var6 = var3 = this.anb.length - 1; var6 >= 0; var6 = var3) {
            this.agk(this.anb[var3--], var2);
         }

         for (int var7 = var3 = 0; var7 < var2.size() && var3 < var1; var7 = var3) {
            ((com.xy.q.Class53)var2.get(var3)).n(var3 + 1);
            com.xy.q.Class53 var8 = (com.xy.q.Class53)var2.get(var3);
            int var10 = 20 * var3;
            var3++;
            var8.setBounds(0, var10, 180, 20);
         }

         this.iv = var2;
      }
   }

   public void agk(BigDecimal var1, List<com.xy.q.Class53> var2) {
      int var3 = 0;
      int var4 = var2.size();

      for (int var10000 = var3; var10000 < var4; var10000 = ++var3) {
         if (var2.get(var3).ee() == var1.longValue()) {
            var2.add(0, var2.remove(var3));
            return;
         }
      }
   }

   public List<BigDecimal> agl(int var1) {
      this.ak = this.afx.getBattleScene() != null && this.afx.getClient().gameBattle;
      this.anb = null;
      ArrayList var2 = null;
      if (this.ak) {
         RoleData var3 = this.yx();
         BattleScene var4;
         com.xy.d.Class11 var5 = (var4 = this.afx.getBattleScene()) != null ? var4.getBattleUnit(0, var3.getRoleId()) : null;
         if (var5 != null) {
            var2 = new ArrayList();
            BattleMan var10000 = var5.cg();
            String var10;
            if (var1 == 0) {
               var10 = "及啘兛";
               var10 = "召唤兽";
            } else {
               var10 = "灚宷";
               var10 = "灵宝";
            }

            List var6 = var10000.j(var10);

            int var7;
            for (int var9 = var7 = 0; var9 < var6.size(); var9 = ++var7) {
               if (((TypeState)var6.get(var7)).getState() != 0) {
                  int var8 = Integer.parseInt(((TypeState)var6.get(var7)).getType());
                  var2.add(new BigDecimal(var8));
               }
            }

            if (var1 == 0) {
               this.anb = var5.cg().petIds;
               return var2;
            }

            if (var1 == 1) {
               this.anb = var5.cg().lingIds;
            }
         }
      }

      return var2;
   }

   public void c() {
      List var1 = this.agl(0);
      this.ana = null;
      this.ro.removeAll();

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.iv.size(); var10000 = var2) {
         this.iv.get(var2++).t();
      }

      RoleData var7 = this.yx();
      int var3 = 0;
      int var4 = var7.lingbaoList.size();

      for (int var8 = var3; var8 < var4; var8 = ++var3) {
         BigDecimal var5 = var7.lingbaoList.get(var3);
         Lingbao var6;
         if ((var6 = var7.getLingbao(var5)) != null && (var1 == null || !var1.contains(var6.getBaoid()))) {
            this.cq(var6);
         }
      }

      this.a();
      this.ro.setPreferredSize(new Dimension(180, 20 * this.ro.getComponentCount()));
      this.h();
   }

   public void y(int var1) {
      if (var1 == -1) {
         var1 = this.z == 0 ? 1 : 0;
      }

      this.z = var1;
      String var3;
      if (this.z == 0) {
         var3 = "及啘兛";
         var3 = "召唤兽";
      } else {
         var3 = "灚宷";
         var3 = "灵宝";
      }

      this.sy.setText(var3);
      com.xy.i.Class19 var10000 = this.ahs[0];
      if (this.z == 0) {
         var3 = "宆";
         var3 = "宠";
      } else {
         var3 = "灟";
         var3 = "灵";
      }

      var10000.setText(var3);
      JLabel var2 = Class56.ww(this.anc[1]);
      if (this.z == 0) {
         var3 = "锧實馰厭及啘兛";
         var3 = "锁定首发召唤兽";
      } else {
         var3 = "键宰馹叻灚宷";
         var3 = "锁定首发灵宝";
      }

      var2.setText(var3);
      if (this.z == 0) {
         this.xi();
      } else {
         this.c();
      }
   }

   public void g(int var1) {
      if (this.ana != null) {
         int var2 = this.ana.il();
         int var3 = var1 == 0 ? var2 - 1 : (var1 == 1 ? var2 + 1 : (var1 == 2 ? 1 : this.ro.getComponentCount()));
         if (var3 >= 1 && var3 <= this.ro.getComponentCount()) {
            com.xy.q.Class53 var4 = this.iv.get(var3 - 1);
            long var5 = this.ana.ee();
            String var7 = this.ana.en().getText();
            this.ana.ru(var4.ee(), var4.en().getText());
            var4.ru(var5, var7);
            this.kz(var4);
         }
      }
   }

   public void cq(Lingbao var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.iv.size(); var10000 = ++var2) {
         com.xy.q.Class53 var3;
         if ((var3 = this.iv.get(var2)).ee() == 0L) {
            var3.n(var2 + 1);
            var3.cq(var1);
            var3.setBounds(0, 20 * var2, 180, 20);
            this.ro.add(var3);
            return;
         }
      }

      com.xy.q.Class53 var4 = new com.xy.q.Class53(this);
      var4.n(this.ro.getComponentCount() + 1);
      var4.cq(var1);
      var4.setBounds(0, 20 * this.ro.getComponentCount(), 180, 20);
      this.iv.add(var4);
      this.ro.add(var4);
   }

   public void e() {
      RoleData var1 = this.yx();
      Class88 var10000;
      if (this.z == 0) {
         var1.setHelpPet(!var1.x());
         var10000 = this;
         var1.bl();
      } else {
         var1.setHelpLing(!var1.w());
         var10000 = this;
         var1.p();
      }

      if (var10000.ak) {
         this.f();
      }

      this.h();
   }

   public BigDecimal[] agm() {
      BigDecimal[] var1 = new BigDecimal[this.ro.getComponentCount()];

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.length; var10000 = var2) {
         int var10001 = var2;
         BigDecimal var10002 = new BigDecimal(this.iv.get(var2).ee());
         var2++;
         var1[var10001] = var10002;
      }

      return var1;
   }

   public void kz(com.xy.q.Class53 var1) {
      int var10000 = 0;
      this.ana = var1;

      for (int var2 = 0; var10000 < this.iv.size(); var10000 = ++var2) {
         com.xy.q.Class53 var3;
         (var3 = this.iv.get(var2)).en().setForeground(var1 == var3 ? Color.RED : Color.green);
      }
   }

   public void f() {
      if (!this.ak) {
         RoleData var7 = this.yx();
         if (this.z == 0) {
            var7.setHelpBB(this.agm());
         } else {
            var7.setHelpLB(this.agm());
         }
      } else {
         RoleData var1 = this.yx();
         BigDecimal[] var2;
         if ((var2 = this.agm()).length != 0) {
            StringBuffer var3;
            (var3 = new StringBuffer()).append(this.z == 0 ? 7 : 8);
            if (this.z == 0) {
               var3.append(var1.x() ? 1 : 0);
            } else {
               var3.append(var1.w() ? 1 : 0);
            }

            int var4;
            for (int var10000 = var4 = 0; var10000 < var2.length; var10000 = var4) {
               String var10001 = "Z";
               var3.append("|");
               var3.append(var2[var4++]);
            }

            String var8 = Agreement.getSendTextAES("1", var3.toString());
            this.afx.getClient().k(var8);
            BattleScene var5;
            com.xy.d.Class11 var6 = (var5 = this.afx.getBattleScene()) != null ? var5.getBattleUnit(0, this.yx().getRoleId()) : null;
            if (var6 != null) {
               if (this.z == 0) {
                  var6.cg().petIds = var2;
                  return;
               }

               if (this.z == 1) {
                  var6.cg().lingIds = var2;
               }
            }
         }
      }
   }

   public void h() {
      RoleData var1 = this.yx();
      if (this.z == 0) {
         this.anc[0].n(var1.x() ? 1 : 0);
      } else {
         if (this.z == 1) {
            this.anc[0].n(var1.w() ? 1 : 0);
         }
      }
   }

   public Class88(GameView var1) {
      super(62, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "\u000fESBS\u0017RV\u0012A";
      this.z = -1;
      this.yy(-3, 0, 297, 442, com.xy.q.Class30.agh);
      com.xy.w.Class9 var25 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "讑罄掽庥";
      this.yu(var25, "设置排序");
      String var10011 = "_E:`:`:`";
      this.sy = com.xy.q.Class1.f(47, 26, 200, 21, 0, com.xy.q.Class49.c("#cFFFFFF"), com.xy.q.Class49.ch);
      String var10005 = "叆唋兗";
      this.sy.setText("召唤兽");
      this.add(this.sy);
      this.ahs = new com.xy.i.Class19[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ahs.length; var10000 = var2) {
         com.xy.i.Class19[] var5 = this.ahs;
         String var10004 = "U\u001f\t\u0019\tH\u0016RV\u0012A";
         int var10006 = 1 + var2;
         Class88 var10010;
         if (var2 == 0) {
            var10009 = "宊";
            var10009 = "宠";
            var10010 = this;
         } else if (var2 == 1) {
            var10009 = "";
            var10010 = this;
         } else if (var2 == 2) {
            var10009 = "";
            var10010 = this;
         } else if (var2 == 3) {
            var10009 = "顐";
            var10009 = "顶";
            var10010 = this;
         } else if (var2 == 4) {
            var10009 = "庿";
            var10009 = "底";
            var10010 = this;
         } else if (var2 == 5) {
            var10009 = "価孾诂罈";
            var10009 = "保存设置";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         Class19 var10002 = new Class19("sc/e/40.png", 1, var10006, Class49.bz, null, var10009, var10010);
         var5[var2] = var10002;
         Class88 var6;
         if (var2 == 0) {
            var6 = this;
            this.ahs[var2].setBounds(257, 74, 18, 18);
         } else if (var2 == 1) {
            var6 = this;
            var10002 = this.ahs[var2];
            String var10003 = "YL\u0005J\u0005\u001b\u001d\u0001ZAM";
            var10002.setImage("sc/e/47.png");
            this.ahs[var2].setBounds(257, 128, 18, 18);
         } else if (var2 == 2) {
            var6 = this;
            var10002 = this.ahs[var2];
            String var22 = "U\u001f\t\u0019\tH\u001eRV\u0012A";
            var10002.setImage("sc/e/48.png");
            this.ahs[var2].setBounds(257, 157, 18, 18);
         } else if (var2 == 3) {
            var6 = this;
            this.ahs[var2].setBounds(257, 211, 18, 18);
         } else if (var2 == 4) {
            var6 = this;
            this.ahs[var2].setBounds(257, 240, 18, 18);
         } else {
            if (var2 == 5) {
               com.xy.i.Class19 var10001 = this.ahs[var2];
               String var16 = "YL\u0005J\u0005\u001d\u0012\u0001ZAM";
               var10001.setImage("sc/e/28.png");
               this.ahs[var2].setBounds(47, 333, 85, 18);
            }

            var6 = this;
         }

         var6.add(this.ahs[var2++]);
      }

      this.iv = new ArrayList<>();
      this.ro = new JList<>();
      this.ro.setBackground(com.xy.q.Class49.bk);
      this.ro.setSelectionMode(0);
      this.i = com.xy.q.Class1.g(47, 47, 200, 279, this.ro, 20);
      this.add(this.i);
      this.anc = new Class56[3];

      for (int var7 = var2 = 0; var7 < this.anc.length; var7 = var2) {
         Class56[] var8 = this.anc;
         int var12 = var2;
         Class56 var11 = new Class56(this, var2, this);
         var2++;
         var8[var12] = var11;
      }

      this.aw = new com.xy.w.Class18[2];

      for (int var9 = var2 = 0; var9 < this.aw.length; var9 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         Class88 var10;
         if (var2 == 0) {
            var10 = this;
            com.xy.w.Class18 var19 = this.aw[var2];
            String var24 = "U\u001f\t\u0018\tN\u0013RV\u0012A";
            var19.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            this.aw[var2].setBounds(47, 26, 200, 21);
         } else {
            if (var2 == 1) {
               com.xy.w.Class18 var13 = this.aw[var2];
               String var20 = "YL\u0005K\u0005\u001d\u001e\u0001ZAM";
               var13.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
               this.aw[var2].setBounds(47, 26, 200, 300);
            }

            var10 = this;
         }

         var10.add(this.aw[var2++]);
      }
   }

   public void ew(RoleSummoning var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < this.iv.size(); var10000 = ++var2) {
         com.xy.q.Class53 var3;
         if ((var3 = this.iv.get(var2)).ee() == 0L) {
            var3.n(var2 + 1);
            var3.ew(var1);
            var3.setBounds(0, 20 * var2, 180, 20);
            this.ro.add(var3);
            return;
         }
      }

      com.xy.q.Class53 var4 = new com.xy.q.Class53(this);
      var4.n(this.ro.getComponentCount() + 1);
      var4.ew(var1);
      var4.setBounds(0, 20 * this.ro.getComponentCount(), 180, 20);
      this.iv.add(var4);
      this.ro.add(var4);
   }
}
