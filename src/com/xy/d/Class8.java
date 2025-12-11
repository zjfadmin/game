package com.xy.d;

import com.xy.a.Class26;
import com.xy.a.q.Class17;
import com.xy.bean.FightingForesee;
import com.xy.bean.FriendBean;
import com.xy.bean.RoleShow;
import com.xy.entity.Friend;
import com.xy.game.GameMove;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.readbean.Door;
import com.xy.scene.BangFightScene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.Class12;
import com.xy.v.Class31;
import com.xy.v.Class32;
import com.xy.w.Class15;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Class8 extends Class4 {
   public long an = 0L;
   private String[] ao;
   public RoleShow ap;
   private boolean aq;
   private List<Class32> ar;
   private boolean as;
   private Class7 at;

   public void ay() {
      if (this.ar != null) {
         int var1;
         for (int var10000 = var1 = 0; var10000 < this.ar.size(); var10000 = var1) {
            Class32 var2 = this.ar.get(var1);
            var1++;
            var2.d(this.ae, this.v, this.ak, this.ac.j());
         }
      }
   }

   public static void az(BigDecimal var0, GameView var1) {
      var1.setMouseIndex(com.xy.v.Class3.k);
      if (bi(var1)) {
         String var2 = Agreement.getSendTextAES("team2", var0.toString());
         var1.getClient().k(var2);
      }
   }

   public String[] ba() {
      return this.ao;
   }

   public boolean bb() {
      return this.ap.getTroop_id() == null || this.ao != null || this.ao == null && Class12.h(this.ap.getTeamInfo());
   }

   public void bc(GameView var1) {
      if (var1.getBattleScene() == null && com.xy.v.Class0.a.nextInt(20) == 0) {
         RoleData var2 = var1.roleData;
         if (var1.roleData.getTaskSystem().getTaskXL(var1.mapScene.w())) {
            HandleOption.v(3, var1);
         } else if (var1.mapScene.l) {
            String var10001 = "摒妺馏";
            if (var2.getLimit("摄妖香") == null || com.xy.v.Class4.s(var2.getLoginResult().getGrade()) - 10 <= var1.mapScene.l().getMapLvl()) {
               HandleOption.v(0, var1);
            }
         }
      }
   }

   public void bd(int var1) {
      if (this.ar != null) {
         int var2;
         for (int var10000 = var2 = 0; var10000 < this.ar.size(); var10000 = var2) {
            Object var3 = this.ar.get(var2);
            var2++;
            ((Class32)var3).k(var1);
         }
      }
   }

   public boolean k() {
      return this.ap.getBooth_id() == null;
   }

   public static void be(GameView var0) {
      var0.setMouseIndex(com.xy.v.Class3.k);
      if (bi(var0)) {
         String var1 = Agreement.getSendTextAES("team1", null);
         var0.getClient().k(var1);
      }
   }

   public void q(boolean var1) {
      this.at = var1 ? new Class7(this) : null;
   }

   public void bf(boolean var1, boolean var2) {
      this.as = var1;
      this.aq = false;
   }

   public static void bg(Class8 var0, GameView var1) {
      var1.setMouseIndex(com.xy.v.Class3.k);
      if (!var1.roleUnit.bb()) {
         String var13 = "阳呎沍期杯陆擡佊";
         var1.dp("队员没有权限操作");
      } else if (var0.ap.getFighting() != 0) {
         String var5 = Agreement.getSendTextAES("battleconnection", String.valueOf(var0.ap.getFighting()));
         var1.getClient().k(var5);
      } else {
         boolean var2 = var1.roleUnit == var0;
         if (!var2) {
            if (var1.mapScene.r.getMapId() == 3315L && var1.scene != null && var1.scene instanceof BangFightScene) {
               BangFightScene var6;
               if ((var6 = (BangFightScene)var1.scene).manstate == 1) {
                  String var12 = "佪震見筎徏万殿旱闾扊胷抒兯戟斝";
                  var1.dp("你需要等待一段时间才能投入战斗");
               } else if (!var6.i()) {
                  String var11 = "佌彅剡犠怭袽陼删";
                  var1.dp("你当前状态被限制");
               } else if ((var1.roleUnit.ao != null ? var1.roleUnit.ao.length : 1) < BangFightScene.MINSUM) {
                  String var10003 = "朇尛亽敺";
                  var1.dp("最少人数" + BangFightScene.MINSUM);
               } else {
                  bj(var0, 11, var1);
               }
            } else if (var1.roleUnit.ap.getGrade() < 30 || var0.ap.getGrade() < 30) {
               String var10 = "禭歴\u001f&纋仳冩皒别磝";
               var1.dp("禁止30级以内的切磋");
            } else if (var1.roleUnit.ap.getBooth_id() == null && var0.ap.getBooth_id() == null) {
               String[] var3 = var0.ao;
               if (var0.ao == null) {
                  String var10000 = var0.ap.getTeam();
                  String var8 = "pj";
                  var3 = var10000.split("\\|");
               }

               int var4;
               for (int var7 = var4 = 0; var7 < var3.length; var7 = ++var4) {
                  if (var3[var4].equals(var1.roleUnit.w)) {
                     String var9 = "玣宱春佧皎阘呒";
                     var1.dp("玩家是你的队员");
                     return;
                  }
               }

               bj(var0, 5, var1);
            } else {
               String var10001 = "佪我耏玮宼夃亄摁摀犱怋";
               var1.dp("你或者玩家处于摆摊状态");
            }
         }
      }
   }

   public static boolean bh(String var0) {
      if (Class12.h(var0)) {
         return false;
      } else {
         try {
            String var10001 = "pj";
            return Integer.parseInt(var0.split("\\|")[1]) != 0;
         } catch (Exception var2) {
            var2.printStackTrace();
            return false;
         }
      }
   }

   public static boolean bi(GameView var0) {
      if (var0.roleUnit.ap.getMapid() == 3321L || var0.roleUnit.ap.getMapid() == 3322L) {
         String var10001 = "误圷围旧泟练阕";
         var0.dp("该地图无法组队");
         return false;
      } else if (bh(var0.roleData.getLoginResult().getTaskDaily())) {
         String var1 = "坼牴犚怗旌泃绨阉";
         var0.dp("坐牢状态无法组队");
         return false;
      } else if (var0.roleUnit.ap.getTroop_id() != null) {
         String var10002 = "佪巵绅朎阕伊二";
         var0.dp("你已经有队伍了");
         return false;
      } else {
         return true;
      }
   }

   @Override
   public void an(final Graphics graphics) {
      if (this.w == null) {
         return;
      }
      final Graphics2D graphics2D2;
      final Graphics2D graphics2D = graphics2D2 = (Graphics2D)graphics;
      Object renderingHint = graphics2D.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object renderingHint2 = graphics2D.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Object o;
      if (renderingHint != RenderingHints.VALUE_STROKE_DEFAULT) {
         o = renderingHint2;
         graphics2D2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      }
      else {
         renderingHint = null;
         o = renderingHint2;
      }
      Graphics graphics2;
      if (o != RenderingHints.VALUE_ANTIALIAS_ON) {
         graphics2 = graphics;
         graphics2D2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }
      else {
         renderingHint2 = null;
         graphics2 = graphics;
      }
      graphics2.setFont(Class49.ab);
      int n = this.y + 28;
      if (SystemData.ISTITLE && this.ag != null) {
         if (this.am == 0) {
            this.am = graphics.getFontMetrics().stringWidth(this.ag) / 2;
         }
         final int n2 = this.x - this.am;
         graphics.setColor(Class49.z);
         graphics.drawString(this.ag, n2 + 1, n + 1);
         graphics.setColor(Class49.u);
         final String ag = this.ag;
         final int n3 = n2;
         final int n4 = n;
         n += 19;
         graphics.drawString(ag, n3, n4);
      }
      if (this.aj == 0) {
         this.aj = graphics.getFontMetrics().stringWidth(this.w) / 2;
      }
      final int n5 = this.x - this.aj;
      if (this.ap.getSkill_id() != null) {
         graphics.drawImage(Class15.n(this.ap.getSkill_id()), n5 - 28, n - 18, null);
      }
      graphics.setColor(Class49.z);
      graphics.drawString(this.w, n5 + 1, n + 1);
      graphics.setColor(Class49.d(this.ap.getTurnAround()));
      graphics.drawString(this.w, n5, n);
      if (renderingHint != null) {
         graphics2D2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, renderingHint);
      }
      if (renderingHint2 != null) {
         graphics2D2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, renderingHint2);
      }
   }

   public static void bj(Class8 var0, int var1, GameView var2) {
      FightingForesee var3 = new FightingForesee();
      var3.setYidui(var2.roleUnit.ap.getTeam());
      var3.setErdui(var0.ap.getTeam());
      var3.setType(var1);
      String var4 = Agreement.getSendTextAES("fig2", Class31.a().toJson(var3));
      var2.getClient().k(var4);
   }

   @Override
   public void aq(String var1) {
      this.ap.setTitle(var1);
      super.aq(var1);
   }

   public void bk() {
      this.ao = null;
      if (this.ap.getTroop_id() != null && !Class12.h(this.ap.getTeamInfo())) {
         String var10002 = this.ap.getTeamInfo();
         String var10003 = "[v";
         this.ao = var10002.split("\\|");
         if (!this.ao[0].equals(this.ap.getRolename())) {
            this.ao = null;
         }

         this.ap.setCaptian(this.ao != null ? 1 : 0);
      } else {
         this.ao = new String[]{this.ap.getRolename()};
         this.ap.setCaptian(0);
      }
   }

   @Override
   public void aj(long var1, com.xy.n.Class0 var3) {
      this.z += var1;
      if (this.ai != null) {
         this.ai.b(var1);
      }

      if (this.ah() && this.bb()) {
         Class8 var10000;
         if (this.ad.d(var1, this)) {
            var10000 = this;
            this.s(1);
         } else {
            var10000 = this;
            this.s(2);
            this.bd(2);
         }

         var10000.g();
         if (this.ao != null) {
            Class8 var4 = this;

            int var5;
            for (int var7 = var5 = 1; var7 < this.ao.length; var7 = ++var5) {
               Class8 var6;
               if ((var6 = var3.j(this.ao[var5])) != null) {
                  var6.bm(var4.bo(), var4.av());
                  var4 = var6;
               }
            }
         }
      }

      if (this.at != null) {
         this.at.c(this, this.ad != null && this.ad.b());
      }

      this.y();
   }

   @Override
   public void o(Graphics var1, Class4 var2, GameView var3) {
      if (!SystemData.ISTCP && var3.roleUnit != this) {
         this.ac.m();
      } else {
         if (this.at != null) {
            this.at.a(var1, var3);
         }

         Class8 var10000;
         if (var3.mapScene.f(this.ae / com.xy.n.Class2.q, this.v / com.xy.n.Class2.q, 0)) {
            if (var2 == this) {
               var10000 = this;
               this.ac.d(var1, this.x, this.y, this.ak, this.z, 0.6F);
            } else {
               var10000 = this;
               this.ac.c(var1, this.x, this.y, this.ak, this.z, 0.6F);
            }
         } else if (var2 == this) {
            var10000 = this;
            this.ac.d(var1, this.x, this.y, this.ak, this.z, 1.0F);
         } else {
            var10000 = this;
            this.ac.r(var1, this.x, this.y, this.ak, this.z);
         }

         if (var10000.ai != null) {
            this.ai.d(var1, var3);
         }
      }
   }

   public void bl(GameView var1, boolean var2, boolean var3) {
      if (this.ad != null && this.ad.b() && this.bb()) {
         Door var4;
         if (!var2 && (var4 = var1.mapScene.af(this.ae, this.v, this.al)) != null) {
            this.ad.setValue(0, 0L, null);
            HandleOption.d(var4, 0, var1);
            return;
         }

         if (var3) {
            this.bc(var1);
         }
      }
   }

   @Override
   public void aa() {
      if (this.ad == null) {
         this.ad = new GameMove(0.18);
      }

      this.ad.setSp(this.ap.getSp());
   }

   public void g() {
      Class8 var10000;
      if (this.bp().size() >= 13) {
         if (this.ac.j() == 1) {
            Class32 var1;
            Class32 var10002 = var1 = this.ar.remove(0);
            var10000 = this;
            var10002.d(this.ae, this.v, this.ak, this.ac.j());
            this.ar.add(var1);
         } else {
            var10000 = this;
            this.bo().k(2);
         }
      } else {
         var10000 = this;
         this.ar.add(new Class32(this.ae, this.v, this.ak, this.ac.j()));
      }

      if (var10000.ai != null && this.ac.j() == 1) {
         this.ai.c(this.ae, this.v, this.ak);
      }
   }

   @Override
   public void i(Graphics var1) {
      if (SystemData.ISNAME || this.aa == 0) {
         this.an(var1);
      }

      this.ad(var1);
      this.d(var1);
      this.aw(var1);
   }

   @Override
   public int c(Class4 var1) {
      Class8 var2 = (Class8)var1;
      return this.ap.getRole_id().compareTo(var2.ap.getRole_id());
   }

   @Override
   public void b(GameView var1) {
      boolean var2 = var1.roleUnit == this;
      if (var1.getMouseIndex() == com.xy.v.Class3.h) {
         if (var2) {
            be(var1);
         } else {
            az(this.ap.getRole_id(), var1);
         }
      } else if (var1.getMouseIndex() == com.xy.v.Class3.l) {
         bn(this, var1);
      } else if (var1.getMouseIndex() == com.xy.v.Class3.f) {
         bq(this.ap.getRole_id(), this.ap.getRolename(), var1);
      } else if (var1.getMouseIndex() == com.xy.v.Class3.j) {
         bt(this, var1);
      } else if (var1.getMouseIndex() == com.xy.v.Class3.d) {
         bg(this, var1);
      } else {
         if (!var2) {
            ((Class26)var1.getFormManagement().j(154)).kt(this.ap);
         }
      }
   }

   public Class8(RoleShow var1) {
      this.aa = 1;
      this.bs(var1);
   }

   public boolean n() {
      return this.as || this.aq && this.av() == 1;
   }

   public void bm(Class32 var1, int var2) {
      this.g();
      this.ap.setX(var1.d);
      this.ap.setY(var1.a);
      this.ae = var1.d;
      this.v = var1.a;
      this.ak = var1.b;
      this.s(var2);
   }

   public static void bn(Class4 var0, GameView var1) {
      boolean var2 = var1.roleUnit == var0;
      if (var2) {
         String var4 = "丛胑尐牅哗绵丘臆巧Ｍ７";
         var1._do("不能将物品给与自己！！");
      } else {
         var1.setMouseIndex(com.xy.v.Class3.k);
         if (var1.mapScene.l().getMapKf() != 0) {
            String var3 = "路朇颖遙禆產绞亂";
            var1._do("跨服频道禁用给予");
         } else if (var1.getFormManagement().l(12) != null) {
            String var10001 = "佶玜圾州给夨亘绵亞犚怗";
            var1.dp("你现在已经处于给予状态");
         } else {
            ((Class17)var1.getFormManagement().j(12)).kk(var0);
         }
      }
   }

   public Class32 bo() {
      if (this.bp().size() == 0) {
         this.ar.add(new Class32(this.ae, this.v, this.ak, this.ac.j()));
      }

      return this.ar.get(0);
   }

   @Override
   public void d(Graphics var1) {
      if (this.ap.getFighting() != 0) {
         com.xy.w.Class1 var2;
         if ((var2 = Class15.q()) != null) {
            var2.j(this.z, 0);
            var2.ab(var1, this.x - 10, this.y - 115);
            return;
         }
      } else {
         com.xy.w.Class1 var3;
         if (this.ap.getTroop_id() != null && this.ap.getCaptian() == 1 && (var3 = Class15.k()) != null) {
            var3.j(this.z, 0);
            var3.ab(var1, this.x - 10, this.y - 165);
         }
      }
   }

   @Override
   public void u(int var1, int var2, int var3, int var4) {
      super.u(var1, var2, var3, var4);
      this.ap.setX(var1);
      this.ap.setY(var3 > 0 ? com.xy.n.Class6.i + var2 : var2);
   }

   public List<Class32> bp() {
      if (this.ar == null) {
         this.ar = new ArrayList<>();
      }

      return this.ar;
   }

   public static void bq(BigDecimal var0, String var1, GameView var2) {
      boolean var3 = var2.roleData.getRoleId() == var0.longValue();
      if (var3) {
         String var8 = "臆巧劌臼川)";
         var2.dp("自己加自己?");
      } else {
         var2.setMouseIndex(com.xy.v.Class3.k);
         FriendBean var4;
         if ((var4 = var2.roleData.getFriend(var0.longValue())) != null && var4.getGroup() != 0) {
            String var10 = "佪巵绅淼努$M";
            StringBuilder var7 = new StringBuilder("你已经添加#G").append(var1);
            String var9 = "5u丬契叝";
            var2.dp(var7.append("#Y为好友").toString());
         } else {
            Friend var5 = new Friend();
            var5.setFriendid(var0);
            var5.setRoleid(var2.roleUnit.ap.getRole_id());
            String var6 = Agreement.getSendTextAES("addfriend", Class31.a().toJson(var5));
            var2.getClient().k(var6);
            String var10003 = "佪淼努$M";
            StringBuilder var10001 = new StringBuilder("你添加#G").append(var1);
            String var10002 = "5u丬契叝";
            var2.dp(var10001.append("#Y为好友").toString());
         }
      }
   }

   public boolean br(GameView var1) {
      return var1.getClient().l(2, 3) || var1.getClient().l(2, 8) || var1.getClient().l(2, 9) || var1.getClient().l(2, 10) || var1.getClient().l(2, 12)
         ? this.as
         : this.as || this.aq;
   }

   public void bs(RoleShow var1) {
      try {
         this.ae = (this.ap = var1).getX();
         this.v = var1.getY();
         Class8 var10000;
         if (this.v >= com.xy.n.Class6.i) {
            var10000 = this;
            this.al = 1;
            this.v = this.v & com.xy.n.Class6.i;
         } else {
            var10000 = this;
            this.al = 0;
         }

         var10000.w = var1.getRolename();
         this.ag = var1.getTitle();
         this.bk();
         super.af(null, var1);
         this.ay();
         this.t(var1.getPlayer_Paths(), var1.getSp());
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static void bt(Class8 var0, GameView var1) {
      boolean var2 = var1.roleUnit == var0;
      if (var2) {
         String var4 = "万胺咆臭巻亣昙＆＋";
         var1._do("不能和自己交易！！");
      } else {
         var1.setMouseIndex(com.xy.v.Class3.k);
         if (var1.mapScene.l().getMapKf() != 0) {
            String var10001 = "跄望颽遅禭甾予昅";
            var1._do("跨服频道禁用交易");
         } else {
            String var10003 = "7v";
            String var3 = Agreement.getSendTextAES("TransState", "0|" + var0.ap.getRolename());
            var1.getClient().k(var3);
         }
      }
   }
}
