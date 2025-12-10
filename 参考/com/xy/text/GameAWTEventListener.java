package com.xy.text;

import com.xy.by;
import com.xy.dV;
import com.xy.eP;
import com.xy.ev;
import com.xy.fC;
import com.xy.iO;
import com.xy.jZ;
import com.xy.lE;
import com.xy.lj;
import com.xy.mi;
import com.xy.battle.BattleControl;
import com.xy.bean.ChatBean;
import com.xy.bean.FightOperation;
import com.xy.bean.FriendBean;
import com.xy.readbean.Goodstable;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.ParamTool;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JTextField;

public class GameAWTEventListener implements AWTEventListener {
   private long time;
   static String[] v;

   public void iz(GameView var1, KeyEvent var2) {
      try {
         if (var1.getBattleScene() != null) {
            BattleControl var13;
            iO var14;
            if ((var14 = (var13 = var1.getBattleControl()).getHandleUnit()) == null) {
               return;
            }

            FightOperation var15 = var14.bt().getType() == 0 ? var13.RoleOperation : var13.PetOperation;
            if (var2.getKeyCode() == (91 & 101)) {
               int var10003 = -4 >> 2;
               var15.a((boolean)(4 ^ 5), -4 >> 2, 2 & 5, (String)null);
               var15.setCamp(var10003);
               var13.s(var15);
               return;
            }

            if (var2.getKeyCode() == (95 & 119)) {
               lj.acu(--1, var13);
               return;
            }

            if (var2.getKeyCode() == (127 & 68)) {
               lj.acr(var13);
               return;
            }

            if (var2.getKeyCode() == (119 & 77)) {
               lj.acu(5 >> 1, var13);
               return;
            }

            if (var2.getKeyCode() == (86 & 125)) {
               lj.acx(var13);
               return;
            }

            if (var2.getKeyCode() == (114 & 79)) {
               lj.acw(var13);
               return;
            }

            if (var2.getKeyCode() == (91 & 119)) {
               Skill var6 = var15.getSpell() != null ? var1.getObjectArea().bg(var15.getSpell()) : null;
               if (var6 == null) {
                  var1.f("没有默认的法术");
                  return;
               }

               var13.setMouseIndex(eP.f, var6);
               var1.getFormManagement().n(103 & 58);
               var1.getFormManagement().n(126 & 47);
               var13.f();
               return;
            }

            if (var2.getKeyCode() == (94 & 123)) {
               lj.acp(var13);
            }

            return;
         }

         if (var2.getKeyCode() == (123 & 53)) {
            lE.cy(54 & 95, var1);
            return;
         }

         if (var2.getKeyCode() == (59 & 118)) {
            lE.cy(4095 & 28827, var1);
            return;
         }

         if (var2.getKeyCode() == (89 & 119)) {
            lE.cy(--3, var1);
            return;
         }

         if (var2.getKeyCode() == (95 & 119)) {
            lE.cy(3 >> 2, var1);
            return;
         }

         if (var2.getKeyCode() == 79) {
            lE.cy(6, var1);
            return;
         }

         if (var2.getKeyCode() == 73 || var2.getKeyCode() == 69) {
            lE.cy(2, var1);
            return;
         }

         if (var2.getKeyCode() == 65) {
            var1.setMouseIndex(eP.a);
            return;
         }

         String var8;
         if (var2.getKeyCode() == 84) {
            if (var1.baseView.au(--3)) {
               var8 = Agreement.getSendTextAES("team6", (String)null);
               var1.getClient().d(var8);
               var1.baseView.jy(--3, (boolean)(5 >> 3));
               return;
            }

            if (var1.roleData.teamBean != null) {
               lE.cy(13, var1);
               return;
            }

            var1.setMouseIndex(eP.d);
            return;
         }

         if (var2.getKeyCode() == 71) {
            var1.setMouseIndex(eP.n);
            return;
         }

         if (var2.getKeyCode() == 88) {
            var1.setMouseIndex(eP.e);
            return;
         }

         if (var2.getKeyCode() == 82) {
            short var17;
            GameView var10001;
            if (var1.getClient().gameMount) {
               var17 = 172;
               var10001 = var1;
            } else {
               var17 = 7;
               var10001 = var1;
            }

            lE.cy(var17, var10001);
            return;
         }

         if (var2.getKeyCode() == 70) {
            by var10;
            if ((var10 = var1.baseView).au(9)) {
               FriendBean var12;
               if ((var12 = var1.roleData.getFriendChat()) != null) {
                  var12.setChat((boolean)(3 ^ 3));
                  ((jZ)var1.getFormManagement().e(56)).afc(var1.roleData.getFriend(var12.getFid()));
               }

               if (var1.roleData.getFriendChat() == null) {
                  var10.jy(9, (boolean)(5 >> 3));
               }

               return;
            }

            lE.cy(4, var1);
            return;
         }

         if (var2.getKeyCode() == 89) {
            lE.cy(--1, var1);
            return;
         }

         if (var2.getKeyCode() == 86) {
            lE.cy(43, var1);
            return;
         }

         if (var2.getKeyCode() == 66) {
            lE.cy(48, var1);
            return;
         }

         if (var2.getKeyCode() == 83) {
            var1.baseView.y(21);
            return;
         }

         if (var2.getKeyCode() == 48) {
            lE.cy(52, var1);
            return;
         }

         if (var2.getKeyCode() == 51) {
            lE.cy(150, var1);
            return;
         }

         if (var2.getKeyCode() == 52) {
            SystemData.ISNAME = (boolean)(SystemData.ISNAME ? 2 & 5 : 1);
            return;
         }

         if (var2.getKeyCode() == 53) {
            SystemData.ISTCP = (boolean)(SystemData.ISTCP ? 5 >> 3 : 1);
            return;
         }

         if (var2.getKeyCode() == 54) {
            SystemData.ISSTALL = (boolean)(SystemData.ISSTALL ? 5 >> 3 : 1);
            return;
         }

         if (var2.getKeyCode() == 55) {
            SystemData.ISMOUNT = (boolean)(SystemData.ISMOUNT ? 5 >> 3 : 1);

            int var9;
            for(int var10000 = var9 = 3 ^ 3; var10000 < GameMain.frameList.size(); var10000 = var9) {
               GameFrame var11 = (GameFrame)GameMain.frameList.get(var9);

               int var5;
               for(var10000 = var5 = 5 >> 3; var10000 < var11.gameList.size(); var10000 = var5) {
                  Object var16 = var11.gameList.get(var5);
                  ++var5;
                  ((GameView)var16).mapScene.u();
               }

               ++var9;
            }

            return;
         }

         if (var2.getKeyCode() == 67 && var1.getClient().VALUE.indexOf("P") != -4 >> 2) {
            if (var1.roleData.goodChoses[14] != null) {
               var8 = Agreement.getSendTextAES("rolechange", "FE" + var1.roleData.goodChoses[14]);
               var1.getClient().d(var8);
               return;
            }

            Goodstable var3;
            if ((var3 = var1.roleData.getUsableFly()) != null) {
               String var4 = Agreement.getSendTextAES("rolechange", "FE" + var3.getRgid());
               var1.getClient().d(var4);
               return;
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public void cx(GameView var1) {
      if (var1 != null) {
         JTextField var2;
         if ((var2 = var1.getBaseView().jj()).isFocusOwner()) {
            String var6;
            if ((var6 = ((dV)var2.getDocument()).nn()).equals("")) {
               var1.fw("请输入内容");
            } else {
               int var7;
               if ((var7 = var1.roleData.getLoginResult().getTurnAround() * (29 & 118)) < (52 & 95)) {
                  var7 = 28 & 119;
               }

               if (var2.getText().length() > var7) {
                  var1.fw("最大字符限制" + var7 + "个");
               } else if (ee(var6)) {
                  var1.fw("发送内容带有敏感词");
               } else {
                  var2.setText("");
                  int var5 = var1.getBaseView().e();
                  this.jb(var1, var6, var5);
               }
            }
         } else {
            fC var3;
            jZ var4;
            if ((var3 = var1.getFormManagement().m(63 & 120)) == null || !(var4 = (jZ)var3).ajf().isFocusOwner()) {
               if (var1.isVisible() && var1.gameFrame.isFocused()) {
                  var2.requestFocus();
               }

            }
         }
      }
   }

   public void eventDispatched(AWTEvent var1) {
      int var2;
      KeyEvent var5;
      if (var1.getClass() == KeyEvent.class && (var5 = (KeyEvent)var1).getID() == (12243 & 20925)) {
         for(int var10000 = var2 = 5 >> 3; var10000 < GameMain.frameList.size(); var10000 = var2) {
            GameFrame var3;
            if ((var3 = (GameFrame)GameMain.frameList.get(var2)).isFocused()) {
               try {
                  this.ja(var5, var3);
                  return;
               } catch (Exception var4) {
                  var4.printStackTrace();
                  return;
               }
            }

            ++var2;
         }
      }

   }

   static {
      String[] var10000 = new String[18 & 125];
      boolean var10002 = true;
      var10000[3 ^ 3] = "#T";
      var10000[3 >> 1] = "#X";
      var10000[5 >> 1] = "#J";
      var10000[--3] = "#Q";
      var10000[--4] = "#D";
      var10000[--5] = "#P";
      var10000[94 & 39] = "#F";
      var10000[47 & 87] = "#H";
      var10000[29 & 106] = "Q号";
      var10000[79 & 57] = "q号";
      var10000[95 & 42] = "QQ";
      var10000[27 & 111] = "qq";
      var10000[127 & 12] = "Qq";
      var10000[125 & 15] = "公益服";
      var10000[78 & 63] = "免费送";
      var10000[79 & 63] = "扣扣群";
      v = var10000;
   }

   public static boolean ee(String var0) {
      int var1;
      for(int var10000 = var1 = 2 & 5; var10000 < v.length; var10000 = var1) {
         if (var0.indexOf(v[var1]) != -4 >> 2) {
            return (boolean)(3 & 5);
         }

         ++var1;
      }

      return (boolean)(3 >> 2);
   }

   public void ja(KeyEvent var1, GameFrame var2) {
      if (var1.getKeyCode() == (90 & 47)) {
         this.cx(var2.gameView);
      } else if (var1.getKeyCode() >= (122 & 117) && var1.getKeyCode() <= (119 & 127)) {
         var2.gameView.baseView.ki().y(var1.getKeyCode() - (126 & 113));
      } else if (var1.isAltDown()) {
         this.iz(var2.gameView, var1);
      } else {
         if (var1.isControlDown()) {
            if (var1.getKeyCode() >= (119 & 57) && var1.getKeyCode() <= (125 & 59)) {
               var2.setGameView(var1.getKeyCode() - (51 & 125));
               return;
            }

            if (var1.getKeyCode() == (27 & 109)) {
               var2.setGameView();
            }
         }

      }
   }

   public void jb(GameView var1, String var2, int var3) {
      if (var3 >= 0 && var3 <= --4) {
         long var4 = ev.f();
         if (var3 == --3) {
            if (var4 - this.time < 10000L) {
               var1.fw("世界喊话间隔10秒");
               return;
            }
         } else if (var3 == 0) {
            if (var4 - this.time < 2000L) {
               var1.fw("当前喊话间隔2秒");
               return;
            }
         } else if (var3 == (1 ^ 3)) {
            if (var1.roleData.getLoginResult().getGang_id().compareTo(new BigDecimal(2 & 5)) == 0) {
               var1.fw("您没有帮派，无法发送帮派信息！！");
               return;
            }

            if (var4 - this.time < 2000L) {
               var1.fw("当前喊话间隔2秒");
               return;
            }
         } else if (var3 == 3 >> 1) {
            if (var1.roleData.teamBean == null) {
               var1.fw("您还没有加入队伍，无法发送队伍信息！！");
               return;
            }

            if (var4 - this.time < 2000L) {
               var1.fw("当前喊话间隔2秒");
               return;
            }
         } else if (var3 == --4) {
            Goodstable var6;
            if ((var6 = var1.roleData.az(2324L)) == null) {
               var1.fw("您没有足够小喇叭");
               return;
            }

            int var10002 = 3 >> 1;
            var6.ab(--1);
            ParamTool.g(var6, var10002, var1.getClient());
            if (var6.getUsetime() <= 0) {
               var1.roleData.h(var6.getRgid());
            }
         }

         this.time = var4;
         ChatBean var7 = new ChatBean();
         var7.setId(var3);
         var7.setMessage(var2);
         var2 = Agreement.getSendTextAES("chat", mi.b().toJson(var7));
         var1.getClient().d(var2);
      }
   }
}
