package com.xy;

import com.xy.bean.LoginResult;
import com.xy.bean.TitleBean;
import com.xy.entity.Titletable;
import com.xy.game.RoleData;
import com.xy.readbean.Title;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class410 extends Class345 {
   private JScrollPane ea;
   private Class70[] aqn;
   private RichLabel z;
   private JLabel[] iv;
   private DefaultListModel<Class367> ace;
   private JList<Class367> aqo;
   private Class436[] e;
   private Class245 cv;
   private JScrollPane af;

   public void ahq(TitleBean var1) {
      this.ace.removeAllElements();
      LoginResult var2 = this.vd().getLoginResult();
      this.cv.setText(var2.getTitle());
      int var3 = 3 & 4;
      int var4 = var1.getTitletables() != null ? var1.getTitletables().size() : 0;

      int var10000;
      String var10003;
      for(var10000 = var3; var10000 < var4; var10000 = var3) {
         Titletable var5 = (Titletable)var1.getTitletables().get(var3);
         DefaultListModel var11 = this.ace;
         var10003 = var5.getTitlename();
         ++var3;
         var11.addElement(new Class367(var10003, (Object)null));
      }

      if (var2.getGang_id() != null && var2.getGangname() != null && var2.getGangpost() != null) {
         this.ace.addElement(new Class367(var2.getGangname() + var2.getGangpost(), (Object)null));
      }

      LoginResult var12;
      label68: {
         if (!Class394.o(var2.getMarryObject())) {
            if (var2.getSex().equals("男")) {
               var12 = var2;
               this.ace.addElement(new Class367(var2.getMarryObject() + "的老公", (Object)null));
               break label68;
            }

            if (var2.getSex().equals("女")) {
               this.ace.addElement(new Class367(var2.getMarryObject() + "的老婆", (Object)null));
            }
         }

         var12 = var2;
      }

      double var9;
      if ((var9 = var12.getKilltype("击杀煞星")) >= 7.0D) {
         this.ace.addElement(new Class367("地煞斗士", (Object)null));
      }

      if (var9 >= 11.0D) {
         this.ace.addElement(new Class367("地煞克星", (Object)null));
      }

      if (var9 >= 15.0D) {
         this.ace.addElement(new Class367("地煞战神", (Object)null));
      }

      int var6 = this.mi(this.vd().getTaskSystem().d(127 & 110, --3));
      BigDecimal var7 = var2.getRace_id();
      String[] var10;
      String[] var13;
      boolean var10002;
      if (var7.compareTo(new BigDecimal(26623 & 16145)) == 0) {
         var13 = new String[11 & 126];
         var10002 = true;
         var13[2 & 5] = "武林新丁";
         var13[4 ^ 5] = "江湖小虾";
         var13[5 >> 1] = "后起之秀";
         var13[--3] = "武林高手";
         var13[--4] = "风尘奇侠";
         var13[--5] = "无双隐士";
         var13[30 & 103] = "世外高人";
         var13[95 & 39] = "江湖侠隐";
         var13[121 & 14] = "无敌圣者";
         var13[59 & 77] = "三界贤君";
         var10 = var13;
      } else if (var7.compareTo(new BigDecimal(12250 & 30519)) == 0) {
         var13 = new String[79 & 58];
         var10002 = true;
         var13[2 & 5] = "古灵精怪";
         var13[5 >> 2] = "魅力精灵";
         var13[--2] = "魔幻使者";
         var13[--3] = "妖之奇葩";
         var13[--4] = "天神煞星";
         var13[--5] = "万兽妖灵";
         var13[39 & 94] = "混世魔王";
         var13[23 & 111] = "三界妖仙";
         var13[57 & 78] = "魔神至尊";
         var13[47 & 89] = "齐天妖王";
         var10 = var13;
      } else {
         var10000 = var7.compareTo(new BigDecimal(28563 & 14207));
         int var14 = 62 & 75;
         if (var10000 == 0) {
            var13 = new String[var14];
            var10002 = true;
            var13[2 & 5] = "仙灵小童";
            var13[--1] = "逍遥之仙";
            var13[--2] = "陆地飞仙";
            var13[--3] = "无极天师";
            var13[--4] = "神机真人";
            var13[--5] = "降魔金仙";
            var13[127 & 6] = "金身尊者";
            var13[7] = "太外飞仙";
            var13[8] = "万圣天尊";
            var13[9] = "九天圣佛";
            var10 = var13;
         } else {
            var13 = new String[var14];
            var10002 = true;
            var13[2 & 5] = "阴曹小鬼";
            var13[3 & 5] = "飘渺之魂";
            var13[1 ^ 3] = "幽冥鬼士";
            var13[--3] = "勾魂使者";
            var13[--4] = "催命判官";
            var13[5] = "阴阳无常";
            var13[6] = "阎罗鬼王";
            var13[7] = "冥灵鬼仙";
            var13[8] = "九幽神君";
            var13[9] = "阴都大帝";
            var10 = var13;
         }
      }

      int var8;
      for(var10000 = var8 = 0; var10000 < var6; var10000 = var8) {
         var10003 = var10[var8];
         ++var8;
         this.ace.addElement(new Class367(var10003, (Object)null));
      }

      this.ace.addElement(new Class367(this.uw().getAreaName() + "一员", (Object)null));
      Class410 var15;
      if (this.ace.size() > 0) {
         this.aqo.setSelectedIndex(5 >> 3);
         var15 = this;
      } else {
         this.ahr((Class367)null);
         var15 = this;
      }

      var15.ve().a(this.ae());
   }

   public void y(int var1) {
      if (var1 != (2551 & 30587)) {
         if (var1 == (15222 & 17917)) {
            SystemData.ISTITLE = (boolean)(SystemData.ISTITLE ? 3 ^ 3 : 1);
            this.aqn[5 >> 2].setText(SystemData.ISTITLE ? "隐藏称谓" : "显示称谓");
         }

      } else if (this.aej.mapScene.l != 3315L && (this.aej.scene == null || this.aej.scene.getSceneId() != (12287 & 21491))) {
         Class367 var2;
         if ((var2 = (Class367)this.aqo.getSelectedValue()) == null) {
            this.aej.f("请选择您要更改的称谓！");
         } else {
            String var4 = var2.d();
            String var3 = Agreement.getSendTextAES("titlechange", var4);
            this.uw().d(var3);
            RoleData var5 = this.vd();
            this.aej.roleUnit.ag(var4, this.vc().u(var4));
            int var10001 = 3 & 4;
            var5.getLoginResult().setTitle(var4);
            var5.getRoleProperty().n();
            var5.f((boolean)var10001);
         }
      } else {
         this.aej.fw("该场景不能更换称谓");
      }
   }

   public void q() {
      this.aqn[2 ^ 3].setText(SystemData.ISTITLE ? "隐藏称谓" : "显示称谓");
      super.q();
   }

   public void ahr(Class367 var1) {
      Title var2 = var1 != null ? this.vc().a(var1.d()) : null;
      if (var2 == null) {
         this.z.setTextSize((String)null, 3583 & 29374);
      } else {
         StringBuffer var3 = new StringBuffer();
         if (var2.getText() != null) {
            var3.append(var2.getText());
         }

         if (var2.getValue() != null) {
            if (var3.length() != 0) {
               var3.append("#r");
            }

            var3.append(var2.getValue().replace("\\|", "#r"));
         }

         this.z.setTextSize(var3.toString(), 32255 & 702);
      }
   }

   public int mi(int var1) {
      if (var1 >= (24291 & 11741)) {
         return 61 & 75;
      } else if (var1 >= (12031 & 23989)) {
         return 30 & 105;
      } else if (var1 >= (3767 & 32239)) {
         return 71 & 63;
      } else if (var1 >= (3295 & 32699)) {
         return 94 & 39;
      } else if (var1 >= (7423 & 28559)) {
         return --5;
      } else if (var1 >= (23956 & 12015)) {
         return --4;
      } else if (var1 >= (19967 & 15987)) {
         return --3;
      } else if (var1 >= (24170 & 11775)) {
         return --2;
      } else {
         return var1 >= (24318 & 11615) ? 4 ^ 5 : 0;
      }
   }

   public Class410(GameView var1) {
      int var10001 = 5 >> 1;
      int var10005 = -2 & -1;
      super(78 & 59, 1 ^ 3, Class345.aef, var1);
      this.va(var10005, 3 ^ 3, 22827 & 10231, 31115 & 2047, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 79 & 116, 79 & 116, 79 & 116, 79 & 116, (boolean)(3 >> 2)), "更改称谓");
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.iv = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 >> 2; var10000 < this.iv.length; var10000 = var2) {
         this.iv[var2] = Class133.c(62 & 113, 107 & 53, 109 & 90, 119 & 27, 3 & 4, Color.white, Class681.ak);
         this.iv[var2].setText(var2 == 0 ? "当前称谓" : (var2 == (2 ^ 3) ? "拥有称谓" : ""));
         this.add(this.iv[var2]);
         if (var2 == 0) {
            this.iv[var2].setForeground(Color.black);
         } else if (var2 == (3 & 5)) {
            this.iv[var2].setBounds(126 & 51, 61 & 122, 12538 & 20439, 21 & 127);
         }

         ++var2;
      }

      var10001 = --3;
      this.cv = Class133.a(126 & 125, 125 & 35, 9374 & 23527, 19, 3 >> 2, Color.white, Class681.ce);
      this.cv.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
      this.add(this.cv);
      this.ace = new DefaultListModel();
      this.aqo = new JList();
      Class133.j(this.aqo, Color.white, Class681.bx);
      this.aqo.setModel(this.ace);
      this.aqo.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               Class367 var2;
               if ((var2 = (Class367)Class410.this.aqo.getSelectedValue()) == null) {
                  return;
               }

               Class410.this.ahr(var2);
            }

         }
      });
      this.af = Class133.f(50, 77, 210, 128, this.aqo, -4 >> 2);
      this.add(this.af);
      this.z = Class271.l("", Class681.bx, 190);
      this.ea = Class133.f(52, 206, 206, 108, this.z, -4 >> 2);
      this.add(this.ea);
      Class436[] var4 = new Class436[var10001];
      var10003 = true;
      this.e = var4;

      for(var10000 = var2 = 3 >> 2; var10000 < this.e.length; var10000 = var2) {
         this.e[var2] = new Class436();
         if (var2 == 0) {
            this.e[var2].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
            var10000 = var2;
         } else {
            this.e[var2].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(5 >> 3)));
            var10000 = var2;
         }

         Class410 var5;
         if (var10000 == 0) {
            var5 = this;
            this.e[var2].setBounds(50, 56, 210, 21);
         } else if (var2 == (3 & 5)) {
            var5 = this;
            this.e[var2].setBounds(50, 56, 210, 150);
         } else {
            if (var2 == --2) {
               this.e[var2].setBounds(50, 205, 210, 110);
            }

            var5 = this;
         }

         var5.add(this.e[var2++]);
      }

      Class70[] var6 = new Class70[--2];
      var10003 = true;
      this.aqn = var6;

      for(var10000 = var2 = 2 & 5; var10000 < this.aqn.length; var10000 = var2) {
         this.aqn[var2] = new Class70("sc/e/26.png", 4 ^ 5, 371 + var2, Class681.ak, Class681.c, "", this);
         this.aqn[var2].setBounds(51 + 111 * var2, 332, 99, 25);
         this.aqn[var2].setText(var2 == 0 ? "更改称谓" : (var2 == --1 ? "隐藏称谓" : ""));
         this.add(this.aqn[var2++]);
      }

   }
}
