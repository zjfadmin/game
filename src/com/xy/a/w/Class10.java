package com.xy.a.w;

import com.xy.bean.LoginResult;
import com.xy.bean.TitleBean;
import com.xy.entity.Titletable;
import com.xy.game.RoleData;
import com.xy.q.Class49;
import com.xy.q.Class60;
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

public class Class10 extends com.xy.q.Class30 {
   private DefaultListModel<Class60> pd;
   private RichLabel av;
   private JLabel[] ch;
   private com.xy.w.Class18[] aw;
   private JScrollPane cp;
   private com.xy.i.Class20[] pe;
   private com.xy.q.Class14 oo;
   private JScrollPane ba;
   private JList<Class60> pf;

   // $VF: synthetic method
   static JList lg(Class10 var0) {
      return var0.pf;
   }

   @Override
   public void l() {
      com.xy.i.Class20 var10000 = this.pe[1];
      String var1;
      if (SystemData.ISTITLE) {
         var1 = "險薊秊豖";
         var1 = "隐藏称谓";
      } else {
         var1 = "昛祋秕豢";
         var1 = "显示称谓";
      }

      var10000.setText(var1);
      super.l();
   }

   public void lh(TitleBean var1) {
      this.pd.removeAllElements();
      LoginResult var2 = this.yx().getLoginResult();
      this.oo.setText(var2.getTitle());
      int var3 = 0;
      int var4 = var1.getTitletables() != null ? var1.getTitletables().size() : 0;

      for (int var10000 = var3; var10000 < var4; var10000 = var3) {
         Titletable var5 = var1.getTitletables().get(var3);
         DefaultListModel var11 = this.pd;
         String var10003 = var5.getTitlename();
         var3++;
         var11.addElement(new Class60(var10003, null));
      }

      if (var2.getGang_id() != null && var2.getGangname() != null && var2.getGangpost() != null) {
         this.pd.addElement(new Class60(var2.getGangname() + var2.getGangpost(), null));
      }

      LoginResult var15;
      label70: {
         if (!com.xy.v.Class12.h(var2.getMarryObject())) {
            String var12 = var2.getSex();
            String var10001 = "畆";
            if (var12.equals("男")) {
               var15 = var2;
               DefaultListModel var23 = this.pd;
               StringBuilder var71 = new StringBuilder(String.valueOf(var2.getMarryObject()));
               String var10005 = "盁耻儩";
               var23.addElement(new Class60(var71.append("的老公").toString(), null));
               break label70;
            }

            String var13 = var2.getSex();
            var10001 = "夂";
            if (var13.equals("女")) {
               DefaultListModel var14 = this.pd;
               StringBuilder var26 = new StringBuilder(String.valueOf(var2.getMarryObject()));
               String var10004 = "盁耻娃";
               var14.addElement(new Class60(var26.append("的老婆").toString(), null));
            }
         }

         var15 = var2;
      }

      String var24 = "凞朱煻普";
      double var10;
      if ((var10 = var15.getKilltype("击杀煞星")) >= 7.0) {
         String var27 = "圊焛断墮";
         this.pd.addElement(new Class60("地煞斗士", null));
      }

      if (var10 >= 11.0) {
         String var28 = "圕焯兮普";
         this.pd.addElement(new Class60("地煞克星", null));
      }

      if (var10 >= 15.0) {
         String var29 = "圊焛戢礛";
         this.pd.addElement(new Class60("地煞战神", null));
      }

      int var6 = this.ky(this.yx().getTaskSystem().f(110, 3));
      BigDecimal var7 = var2.getRace_id();
      String[] var8;
      if (var7.compareTo(new BigDecimal(10001)) == 0) {
         String[] var16 = new String[10];
         String var30 = "歃柦斕买";
         var16[0] = "武林新丁";
         var30 = "汥渓尵蘻";
         var16[1] = "江湖小虾";
         var30 = "含贆乮禱";
         var16[2] = "后起之秀";
         var30 = "歜柒髢戎";
         var16[3] = "武林高手";
         var30 = "飫屩奢俑";
         var16[4] = "风尘奇侠";
         var30 = "旚厉險墮";
         var16[5] = "无双隐士";
         var30 = "丳奧髽介";
         var16[6] = "世外高人";
         var30 = "汥渓侚雕";
         var16[7] = "江湖侠隐";
         var30 = "旅攽圆聴";
         var16[8] = "无敌圣者";
         var30 = "丳甉贞呞";
         var16[9] = "三界贤君";
         var8 = var16;
      } else if (var7.compareTo(new BigDecimal(10002)) == 0) {
         String[] var17 = new String[10];
         String var40 = "叁瀄粛恛";
         var17[0] = "古灵精怪";
         var40 = "魿勞粄瀰";
         var17[1] = "魅力精灵";
         var40 = "魱帊佚聴";
         var17[2] = "魔幻使者";
         var40 = "妬与好萬";
         var17[3] = "妖之奇葩";
         var40 = "夌礯煻普";
         var17[4] = "天神煞星";
         var40 = "丽儸妬瀰";
         var17[5] = "万兽妖灵";
         var40 = "淒乧魱珺";
         var17[6] = "混世魔王";
         var40 = "丳甉妬亜";
         var17[7] = "三界妖仙";
         var40 = "魱礯臖屻";
         var17[8] = "魔神至尊";
         var40 = "齪奬妬珎";
         var17[9] = "齐天妖王";
         var8 = var17;
      } else if (var7.compareTo(new BigDecimal(10003)) == 0) {
         String[] var18 = new String[10];
         String var50 = "仼瀄尪窔";
         var18[0] = "仙灵小童";
         var50 = "逷造乱亜";
         var18[1] = "逍遥之仙";
         var50 = "陣坁飻亨";
         var18[2] = "陆地飞仙";
         var50 = "旚柄夓幍";
         var18[3] = "无极天师";
         var50 = "祻杋眺介";
         var18[4] = "神机真人";
         var50 = "陷鬑釫亜";
         var18[5] = "降魔金仙";
         var50 = "釴軚尯聴";
         var18[6] = "金身尊者";
         var50 = "夐奓飤亜";
         var18[7] = "太外飞仙";
         var50 = "丢坒夌屻";
         var18[8] = "万圣天尊";
         var50 = "乧奬圙伞";
         var18[9] = "九天圣佛";
         var8 = var18;
      } else {
         String[] var19 = new String[10];
         String var60 = "阑暈尪魍";
         var19[0] = "阴曹小鬼";
         var60 = "飢湿乱鬇";
         var19[1] = "飘渺之魂";
         var60 = "幘凔鬙墚";
         var19[2] = "幽冥鬼士";
         var60 = "勄鬇佅聀";
         var19[3] = "勾魂使者";
         var60 = "傉同刁審";
         var19[4] = "催命判官";
         var60 = "阎陶旚幽";
         var19[5] = "阴阳无常";
         var60 = "阫缦鬙珺";
         var19[6] = "阎罗鬼王";
         var60 = "冟瀰鬆亜";
         var19[7] = "冥灵鬼仙";
         var60 = "乸希祻呪";
         var19[8] = "九幽神君";
         var60 = "阎邸夝幘";
         var19[9] = "阴都大帝";
         var8 = var19;
      }

      int var9;
      for (int var20 = var9 = 0; var20 < var6; var20 = var9) {
         String var70 = var8[var9];
         var9++;
         this.pd.addElement(new Class60(var70, null));
      }

      DefaultListModel var25 = this.pd;
      StringBuilder var72 = new StringBuilder(String.valueOf(this.za().getAreaName()));
      String var73 = "严吩";
      var25.addElement(new Class60(var72.append("一员").toString(), null));
      Class10 var21;
      if (this.pd.size() > 0) {
         this.pf.setSelectedIndex(0);
         var21 = this;
      } else {
         this.li(null);
         var21 = this;
      }

      var21.zc().b(this.lj());
   }

   public int ky(int var1) {
      if (var1 >= 3265) {
         return 9;
      } else if (var1 >= 3253) {
         return 8;
      } else if (var1 >= 3239) {
         return 7;
      } else if (var1 >= 3227) {
         return 6;
      } else if (var1 >= 3215) {
         return 5;
      } else if (var1 >= 3204) {
         return 4;
      } else if (var1 >= 3187) {
         return 3;
      } else if (var1 >= 3178) {
         return 2;
      } else {
         return var1 >= 3166 ? 1 : 0;
      }
   }

   public Class10(GameView var1) {
      super(10, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "I&\u0015!\u0015t\u00145T\"";
      this.yy(-2, 0, 291, 395, com.xy.q.Class30.agh);
      com.xy.w.Class9 var21 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10004 = "曑效秕豢";
      this.yu(var21, "更改称谓");
      this.ch = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ch.length; var10000 = ++var2) {
         this.ch[var2] = com.xy.q.Class1.f(48, 33, 72, 19, 0, Color.white, Class49.ch);
         JLabel var5 = this.ch[var2];
         String var13;
         if (var2 == 0) {
            var13 = "彩刈秊豖";
            var13 = "当前称谓";
         } else if (var2 == 1) {
            var13 = "拀杸秕豢";
            var13 = "拥有称谓";
         } else {
            var13 = "";
         }

         var5.setText(var13);
         this.add(this.ch[var2]);
         if (var2 == 0) {
            this.ch[var2].setForeground(Color.black);
         } else if (var2 == 1) {
            this.ch[var2].setBounds(50, 56, 210, 21);
         }
      }

      this.oo = com.xy.q.Class1.i(124, 33, 134, 19, 0, Color.white, Class49.ac);
      String var10005 = "6Yj^j\u000br\u00145T\"";
      this.oo.mt(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false));
      this.add(this.oo);
      this.pd = new DefaultListModel<>();
      this.pf = new JList<>();
      com.xy.q.Class1.c(this.pf, Color.white, Class49.cp);
      this.pf.setModel(this.pd);
      this.pf.addListSelectionListener(new Class29(this));
      this.cp = com.xy.q.Class1.g(50, 77, 210, 128, this.pf, -1);
      this.add(this.cp);
      this.av = com.xy.v.Class27.j("", Class49.cp, 190);
      this.ba = com.xy.q.Class1.g(52, 206, 206, 108, this.av, -1);
      this.add(this.ba);
      this.aw = new com.xy.w.Class18[3];

      for (int var6 = var2 = 0; var6 < this.aw.length; var6 = var2) {
         this.aw[var2] = new com.xy.w.Class18();
         if (var2 == 0) {
            com.xy.w.Class18 var7 = this.aw[var2];
            String var15 = "\u0002F^A^\u0017D\u000b\u0001K\u0016";
            var7.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
            var6 = var2;
         } else {
            com.xy.w.Class18 var9 = this.aw[var2];
            String var16 = "6Yj^j\bq\u00145T\"";
            var9.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
            var6 = var2;
         }

         Class10 var10;
         if (var6 == 0) {
            var10 = this;
            this.aw[var2].setBounds(50, 56, 210, 21);
         } else if (var2 == 1) {
            var10 = this;
            this.aw[var2].setBounds(50, 56, 210, 150);
         } else {
            if (var2 == 2) {
               this.aw[var2].setBounds(50, 205, 210, 110);
            }

            var10 = this;
         }

         var10.add(this.aw[var2++]);
      }

      this.pe = new com.xy.i.Class20[2];

      for (int var11 = var2 = 0; var11 < this.pe.length; var11 = var2) {
         String var10006 = "\u0002F^@^\u0017G\u000b\u0001K\u0016";
         this.pe[var2] = new com.xy.i.Class20("sc/e/26.png", 1, 371 + var2, Class49.ch, Class49.bv, "", this);
         this.pe[var2].setBounds(51 + 111 * var2, 332, 99, 25);
         com.xy.i.Class20 var12 = this.pe[var2];
         String var18;
         if (var2 == 0) {
            var18 = "曎敼秊豖";
            var18 = "更改称谓";
         } else if (var2 == 1) {
            var18 = "隵薾秕豢";
            var18 = "隐藏称谓";
         } else {
            var18 = "";
         }

         var12.setText(var18);
         this.add(this.pe[var2++]);
      }
   }

   public void li(Class60 var1) {
      Title var2 = var1 != null ? this.yt().an(var1.b()) : null;
      if (var2 == null) {
         this.av.setTextSize(null, 190);
      } else {
         StringBuffer var3 = new StringBuffer();
         if (var2.getText() != null) {
            var3.append(var2.getText());
         }

         if (var2.getValue() != null) {
            if (var3.length() != 0) {
               String var10001 = "\u00197";
               var3.append("#r");
            }

            String var4 = var2.getValue();
            String var10002 = "y\r";
            String var10003 = "\u00197";
            var3.append(var4.replace("\\|", "#r"));
         }

         this.av.setTextSize(var3.toString(), 190);
      }
   }

   public void g(int var1) {
      if (var1 != 371) {
         if (var1 == 372) {
            SystemData.ISTITLE = !SystemData.ISTITLE;
            com.xy.i.Class20 var10000 = this.pe[1];
            String var8;
            if (SystemData.ISTITLE) {
               var8 = "險薊秊豖";
               var8 = "隐藏称谓";
            } else {
               var8 = "昛祋秕豢";
               var8 = "显示称谓";
            }

            var10000.setText(var8);
         }
      } else if (this.afx.mapScene.a != 3315L && (this.afx.scene == null || this.afx.scene.getSceneId() != 1011)) {
         Class60 var2;
         if ((var2 = this.pf.getSelectedValue()) == null) {
            String var6 = "讆逬折悍觰曑效皡禁谶ｰ";
            this.afx._do("请选择您要更改的称谓！");
         } else {
            String var3 = var2.b();
            String var4 = Agreement.getSendTextAES("titlechange", var3);
            this.za().k(var4);
            RoleData var5 = this.yx();
            this.afx.roleUnit.aq(var3);
            var5.getLoginResult().setTitle(var3);
            var5.getRoleProperty().y();
            var5.ao(false);
         }
      } else {
         String var10001 = "讠圀昪丷肸曎挧秊豖";
         this.afx.dp("该场景不能更换称谓");
      }
   }
}
