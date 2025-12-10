package com.xy;

import com.xy.bean.FightingForesee;
import com.xy.bean.FriendBean;
import com.xy.bean.RoleShow;
import com.xy.entity.Friend;
import com.xy.game.GameMove;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.readbean.Door;
import com.xy.scene.BangFightScene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Class183 extends Class292 {
   public RoleShow r;
   private boolean s;
   private List<Class116> t;
   private String[] u;
   public long v;
   private boolean w;
   private Class427 x;

   public void q() {
      if (this.t != null) {
         int var1;
         for(int var10000 = var1 = 0; var10000 < this.t.size(); var10000 = var1) {
            Class116 var2 = (Class116)this.t.get(var1);
            ++var1;
            var2.b(this.ab, this.al, this.as, this.af.z());
         }

      }
   }

   public static void r(GameView var0) {
      var0.setMouseIndex(Class320.l);
      if (ab(var0)) {
         String var1 = Agreement.getSendTextAES("team1", (String)null);
         var0.getClient().d(var1);
      }
   }

   public List<Class116> s() {
      if (this.t == null) {
         this.t = new ArrayList();
      }

      return this.t;
   }

   public void t(Graphics var1) {
      if (this.ad != null) {
         Graphics2D var6;
         Graphics2D var10000 = var6 = (Graphics2D)var1;
         Object var5 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
         Object var4 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
         Object var8;
         if (var5 != RenderingHints.VALUE_STROKE_DEFAULT) {
            var8 = var4;
            var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
         } else {
            var5 = null;
            var8 = var4;
         }

         Graphics var9;
         if (var8 != RenderingHints.VALUE_ANTIALIAS_ON) {
            var9 = var1;
            var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         } else {
            var4 = null;
            var9 = var1;
         }

         var9.setFont(Class681.cd);
         int var3 = this.ak + (92 & 63);
         int var2;
         if (SystemData.ISTITLE && this.ai != null) {
            if (this.aj == 0) {
               this.aj = var1.getFontMetrics().stringWidth(this.ai) / (1 ^ 3);
            }

            var2 = this.am - this.aj;
            var1.setColor(Class681.au);
            var1.drawString(this.ai, var2 + --1, var3 + --1);
            var1.setColor(this.aa);
            int var10003 = var3;
            var3 += 19;
            var1.drawString(this.ai, var2, var10003);
         }

         if (this.ag == 0) {
            this.ag = var1.getFontMetrics().stringWidth(this.ad) / (1 ^ 3);
         }

         var2 = this.am - this.ag;
         if (this.r.getSkill_id() != null) {
            Image var7 = Class222.u(this.r.getSkill_id());
            var1.drawImage(var7, var2 - (63 & 92), var3 - (82 & 63), (ImageObserver)null);
         }

         var1.setColor(Class681.au);
         var1.drawString(this.ad, var2 + (5 >> 2), var3 + (3 & 5));
         var1.setColor(Class681.i(this.r.getTurnAround()));
         var1.drawString(this.ad, var2, var3);
         if (var5 != null) {
            var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var5);
         }

         if (var4 != null) {
            var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var4);
         }

      }
   }

   public boolean u() {
      return this.s || this.w && this.be() == (3 & 5);
   }

   public void v(GameView var1, boolean var2, boolean var3) {
      if (this.aq != null && this.aq.b() && this.h()) {
         Door var4;
         if (!var2 && (var4 = var1.mapScene.z(this.ab, this.al, this.ar)) != null) {
            int var10003 = 3 ^ 3;
            this.aq.setValue(3 ^ 3, 0L, (String)null);
            HandleOption.ac(var4, var10003, var1);
            return;
         }

         if (var3) {
            this.an(var1);
         }
      }

   }

   public void i(boolean var1) {
      this.x = var1 ? new Class427(this) : null;
   }

   public void w(RoleShow var1) {
      try {
         this.ab = (this.r = var1).getX();
         this.al = var1.getY();
         Class183 var10000;
         if (this.al >= Class650.a) {
            var10000 = this;
            this.ar = 3 & 5;
            this.al &= Class650.a;
         } else {
            var10000 = this;
            this.ar = 2 & 5;
         }

         var10000.ad = var1.getRolename();
         this.ai = var1.getTitle();
         this.aa = var1.getColorTitle() != null ? var1.getColorTitle() : Class681.bp;
         this.ac();
         super.ba((String)null, var1);
         this.q();
         this.bs(var1.getPlayer_Paths(), var1.getSp());
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void k(Graphics var1) {
      Class8 var2;
      if (this.r.getFighting() != 0) {
         if ((var2 = Class222.e()) != null) {
            var2.d(this.an, 3 >> 2);
            var2.aa(var1, this.am - (42 & 95), this.ak - (115 & 127));
            return;
         }
      } else if (this.r.getTroop_id() != null && this.r.getCaptian() == --1 && (var2 = Class222.o()) != null) {
         var2.d(this.an, 2 & 5);
         var2.aa(var1, this.am - (27 & 110), this.ak - (26863 & 6069));
      }

   }

   public void x(int var1, int var2, int var3, int var4) {
      super.x(var1, var2, var3, var4);
      this.r.setX(var1);
      this.r.setY(var3 > 0 ? Class650.a + var2 : var2);
   }

   public static void y(BigDecimal var0, GameView var1) {
      var1.setMouseIndex(Class320.l);
      if (ab(var1)) {
         String var2 = Agreement.getSendTextAES("team2", var0.toString());
         var1.getClient().d(var2);
      }
   }

   public static boolean z(String var0) {
      if (Class394.o(var0)) {
         return (boolean)(3 ^ 3);
      } else {
         try {
            return (boolean)(Integer.parseInt(var0.split("\\|")[--1]) != 0 ? --1 : 0);
         } catch (Exception var2) {
            int var10000 = 3 >> 2;
            var2.printStackTrace();
            return (boolean)var10000;
         }
      }
   }

   public void a(GameView var1) {
      int var2 = var1.roleUnit == this ? 3 >> 1 : 0;
      if (var1.getMouseIndex() == Class320.d) {
         if (var2 != 0) {
            r(var1);
         } else {
            y(this.r.getRole_id(), var1);
         }
      } else if (var1.getMouseIndex() == Class320.n) {
         al(this, var1);
      } else if (var1.getMouseIndex() == Class320.k) {
         ao(this.r.getRole_id(), this.r.getRolename(), var1);
      } else if (var1.getMouseIndex() == Class320.e) {
         ak(this, var1);
      } else if (var1.getMouseIndex() == Class320.a) {
         ah(this, var1);
      } else {
         if (var2 == 0) {
            ((Class119)var1.getFormManagement().e(9374 & 23547)).le(this.r);
         }

      }
   }

   public boolean aa(GameView var1) {
      if (!var1.getClient().n(5 >> 1, --3) && !var1.getClient().n(--2, 47 & 88) && !var1.getClient().n(1 ^ 3, 125 & 11) && !var1.getClient().n(1 ^ 3, 11 & 126) && !var1.getClient().n(1 ^ 3, 60 & 79)) {
         return (boolean)(!this.s && !this.w ? 5 >> 3 : 1);
      } else {
         return this.s;
      }
   }

   public void o(long var1, Class471 var3) {
      this.an += var1;
      if (this.ao != null) {
         this.ao.d(var1);
      }

      if (this.au() && this.h()) {
         Class183 var10000;
         if (this.aq.d(var1, this)) {
            this.az(3 >> 1);
            var10000 = this;
         } else {
            this.az(2);
            var10000 = this;
            this.af(1 ^ 3);
         }

         var10000.ae();
         if (this.u != null) {
            Class183 var5 = this;

            int var2;
            for(int var6 = var2 = --1; var6 < this.u.length; var6 = var2) {
               Class183 var4;
               if ((var4 = var3.a(this.u[var2])) != null) {
                  var4.m(var5.ai(), var5.be());
                  var5 = var4;
               }

               ++var2;
            }
         }
      }

      if (this.x != null) {
         this.x.a(this, (boolean)(this.aq != null && this.aq.b() ? 3 & 5 : 0));
      }

      this.bf();
   }

   public boolean g() {
      return (boolean)(this.r.getBooth_id() == null ? 5 >> 2 : 0);
   }

   public static boolean ab(GameView var0) {
      if (var0.roleUnit.r.getMapid() != 3321L && var0.roleUnit.r.getMapid() != 3322L) {
         int var10000;
         if (z(var0.roleData.getLoginResult().getTaskDaily())) {
            var10000 = 3 >> 2;
            var0.fw("坐牢状态无法组队");
            return (boolean)var10000;
         } else if (var0.roleUnit.r.getTroop_id() != null) {
            var10000 = 3 & 4;
            var0.fw("你已经有队伍了");
            return (boolean)var10000;
         } else {
            return true;
         }
      } else {
         var0.fw("该地图无法组队");
         return (boolean)(5 >> 3);
      }
   }

   public boolean h() {
      return this.r.getTroop_id() == null || this.u != null || this.u == null && Class394.o(this.r.getTeamInfo());
   }

   public void ac() {
      this.u = null;
      if (this.r.getTroop_id() != null && !Class394.o(this.r.getTeamInfo())) {
         this.u = this.r.getTeamInfo().split("\\|");
         if (!this.u[3 & 4].equals(this.r.getRolename())) {
            this.u = null;
         }

         this.r.setCaptian(this.u != null ? 3 & 5 : 0);
      } else {
         String[] var10001 = new String[4 ^ 5];
         boolean var10003 = true;
         var10001[5 >> 3] = this.r.getRolename();
         this.u = var10001;
         this.r.setCaptian(3 ^ 3);
      }
   }

   public String[] ad() {
      return this.u;
   }

   public void j(Graphics var1) {
      if (SystemData.ISNAME || this.ac == 0) {
         this.t(var1);
      }

      this.bn(var1);
      this.k(var1);
      this.n(var1);
   }

   public void ae() {
      Class183 var10000;
      if (this.s().size() >= (109 & 31)) {
         if (this.af.z() == (4 ^ 5)) {
            Class116 var1;
            Class116 var10001 = var1 = (Class116)this.t.remove(2 & 5);
            var10000 = this;
            var10001.b(this.ab, this.al, this.as, this.af.z());
            this.t.add(var1);
         } else {
            var10000 = this;
            this.ai().a(1 ^ 3);
         }
      } else {
         var10000 = this;
         this.t.add(new Class116(this.ab, this.al, this.as, this.af.z()));
      }

      if (var10000.ao != null && this.af.z() == --1) {
         this.ao.a(this.ab, this.al, this.as);
      }

   }

   public void af(int var1) {
      if (this.t != null) {
         int var2;
         for(int var10000 = var2 = 0; var10000 < this.t.size(); var10000 = var2) {
            Object var3 = this.t.get(var2);
            ++var2;
            ((Class116)var3).a(var1);
         }

      }
   }

   public void ag(String var1, Color var2) {
      if (var2 == null) {
         var2 = Class681.bp;
      }

      this.r.setTitle(var1);
      super.ag(var1, var2);
   }

   public static void ah(Class183 var0, GameView var1) {
      var1.setMouseIndex(Class320.l);
      if (!var1.roleUnit.h()) {
         var1.fw("队员没有权限操作");
      } else if (var0.r.getFighting() != 0) {
         String var6 = Agreement.getSendTextAES("battleconnection", String.valueOf(var0.r.getFighting()));
         var1.getClient().d(var6);
      } else {
         int var2 = var1.roleUnit == var0 ? 3 >> 1 : 0;
         if (var2 == 0) {
            if (var1.mapScene.d.getMapId() == 3315L && var1.scene != null && var1.scene instanceof BangFightScene) {
               BangFightScene var5;
               if ((var5 = (BangFightScene)var1.scene).manstate == (2 ^ 3)) {
                  var1.fw("你需要等待一段时间才能投入战斗");
               } else if (!var5.i()) {
                  var1.fw("你当前状态被限制");
               } else if ((var1.roleUnit.u != null ? var1.roleUnit.u.length : 1) < BangFightScene.MINSUM) {
                  var1.fw("最少人数" + BangFightScene.MINSUM);
               } else {
                  am(var0, 47 & 91, var1);
               }
            } else if (var1.roleUnit.r.getGrade() >= (62 & 95) && var0.r.getGrade() >= (62 & 95)) {
               if (var1.roleUnit.r.getBooth_id() == null && var0.r.getBooth_id() == null) {
                  String[] var4;
                  if ((var4 = var0.u) == null) {
                     var4 = var0.r.getTeam().split("\\|");
                  }

                  int var3;
                  for(int var10000 = var3 = 0; var10000 < var4.length; var10000 = var3) {
                     if (var4[var3].equals(var1.roleUnit.ad)) {
                        var1.fw("玩家是你的队员");
                        return;
                     }

                     ++var3;
                  }

                  am(var0, --5, var1);
               } else {
                  var1.fw("你或者玩家处于摆摊状态");
               }
            } else {
               var1.fw("禁止30级以内的切磋");
            }
         }
      }
   }

   public Class116 ai() {
      if (this.s().size() == 0) {
         this.t.add(new Class116(this.ab, this.al, this.as, this.af.z()));
      }

      return (Class116)this.t.get(2 & 5);
   }

   public void aj() {
      if (this.aq == null) {
         this.aq = new GameMove(0.18D);
      }

      this.aq.setSp(this.r.getSp());
   }

   public void b(Graphics var1, Class292 var2, GameView var3) {
      if (!SystemData.ISTCP && var3.roleUnit != this) {
         this.af.n();
      } else {
         if (this.x != null) {
            this.x.c(var1, var3);
         }

         Class183 var10000;
         if (var3.mapScene.w(this.ab / Class409.a, this.al / Class409.a, 2 & 5)) {
            if (var2 == this) {
               var10000 = this;
               this.af.t(var1, this.am, this.ak, this.as, this.an, 0.6F);
            } else {
               var10000 = this;
               this.af.w(var1, this.am, this.ak, this.as, this.an, 0.6F);
            }
         } else if (var2 == this) {
            var10000 = this;
            this.af.t(var1, this.am, this.ak, this.as, this.an, 1.0F);
         } else {
            var10000 = this;
            this.af.a(var1, this.am, this.ak, this.as, this.an);
         }

         if (var10000.ao != null) {
            this.ao.b(var1, var3);
         }

      }
   }

   public Class183(RoleShow var1) {
      int var10003 = --1;
      super();
      this.v = 0L;
      this.ac = var10003;
      this.w(var1);
   }

   public void m(Class116 var1, int var2) {
      this.ae();
      this.r.setX(var1.a);
      this.r.setY(var1.b);
      this.ab = var1.a;
      this.al = var1.b;
      this.as = var1.d;
      this.az(var2);
   }

   public static void ak(Class183 var0, GameView var1) {
      int var2 = var1.roleUnit == var0 ? --1 : 0;
      if (var2 != 0) {
         var1.f("不能和自己交易！！");
      } else {
         var1.setMouseIndex(Class320.l);
         if (var1.mapScene.ad().getMapKf() != 0) {
            var1.f("跨服频道禁用交易");
         } else {
            String var3 = Agreement.getSendTextAES("TransState", "0|" + var0.r.getRolename());
            var1.getClient().d(var3);
         }
      }
   }

   public static void al(Class292 var0, GameView var1) {
      int var2 = var1.roleUnit == var0 ? --1 : 0;
      if (var2 != 0) {
         var1.f("不能将物品给与自己！！");
      } else {
         var1.setMouseIndex(Class320.l);
         if (var1.mapScene.ad().getMapKf() != 0) {
            var1.f("跨服频道禁用给予");
         } else if (var1.getFormManagement().m(63 & 76) != null) {
            var1.fw("你现在已经处于给予状态");
         } else {
            ((Class381)var1.getFormManagement().e(44 & 95)).add(var0);
         }
      }
   }

   public static void am(Class183 var0, int var1, GameView var2) {
      FightingForesee var3 = new FightingForesee();
      var3.setYidui(var2.roleUnit.r.getTeam());
      var3.setErdui(var0.r.getTeam());
      var3.setType(var1);
      String var4 = Agreement.getSendTextAES("fig2", Class695.b().toJson(var3));
      var2.getClient().d(var4);
   }

   public void an(GameView var1) {
      if (var1.getBattleScene() == null && Class27.c.nextInt(124 & 23) == 0) {
         RoleData var2;
         if ((var2 = var1.roleData).getTaskSystem().getTaskXL(var1.mapScene.b())) {
            HandleOption.ab(--3, var1);
         } else if (var1.mapScene.i) {
            if (var2.getLimit("摄妖香") == null || Class224.d(var2.getLoginResult().getGrade()) - (79 & 58) <= var1.mapScene.ad().getMapLvl()) {
               HandleOption.ab(0, var1);
            }
         }
      }
   }

   public static void ao(BigDecimal var0, String var1, GameView var2) {
      int var3 = var2.roleData.getRoleId() == var0.longValue() ? --1 : 0;
      if (var3 != 0) {
         var2.fw("自己加自己?");
      } else {
         var2.setMouseIndex(Class320.l);
         FriendBean var4;
         if ((var4 = var2.roleData.getFriend(var0.longValue())) != null && var4.getGroup() != 0) {
            var2.fw("你已经添加#G" + var1 + "#Y为好友");
         } else {
            Friend var5 = new Friend();
            var5.setFriendid(var0);
            var5.setRoleid(var2.roleUnit.r.getRole_id());
            String var6 = Agreement.getSendTextAES("addfriend", Class695.b().toJson(var5));
            var2.getClient().d(var6);
            var2.fw("你添加#G" + var1 + "#Y为好友");
         }
      }
   }

   public int ap() {
      return this.u != null ? this.u.length : 1;
   }

   public void aq(boolean var1, boolean var2) {
      int var10001 = 2 & 5;
      this.s = var1;
      this.w = (boolean)var10001;
   }

   public int l(Class292 var1) {
      Class183 var2 = (Class183)var1;
      return this.r.getRole_id().compareTo(var2.r.getRole_id());
   }
}
