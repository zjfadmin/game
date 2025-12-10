package com.xy;

import com.xy.bean.RoleShow;
import com.xy.formula.SkillUtil;
import com.xy.scene.BWDHTeam;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;

public class Class525 extends Class345 {
   private <undefinedtype>[] ayp;
   private Class8 bm;
   private Class226 auo;
   private Class436 bl;
   private int m;

   public boolean t() {
      this.uq((BWDHTeam)null);
      return super.t();
   }

   public void ans(BWDHTeam var1) {
      this.uq(var1);
      this.ve().a(this.ae());
   }

   public Class525(GameView var1) {
      int var10006 = -4 >> 2;
      int var10010 = 3 >> 2;
      super(20471 & 12475, 1 ^ 3, Class345.aef, var1);
      this.m = var10010;
      this.bm = null;
      this.va(var10006, 3 >> 2, 15230 & 18169, 13819 & 19182, Class345.aeo);
      this.uv(Class511.q("sc/d/145.png", 62 & 125, 62 & 125, 31741 & 1226, 109 & 118, (boolean)(5 >> 3)), (String)null);
      this.aea.setImage("sc/e/162.png");
      this.aea.setBounds(25342 & 8015, 79 & 58, 63 & 91, 63 & 91);
      int var10004 = -4 >> 2;
      int var10005 = 5 >> 3;
      Font var4 = Class681.cm;
      String[] var10008 = new String[--4];
      boolean var5 = true;
      var10008[3 ^ 3] = "队";
      var10008[2 ^ 3] = "伍";
      var10008[1 ^ 3] = "名";
      var10008[--3] = "称";
      this.auo = new Class226((String)null, var10004, var10005, var4, (Color[])null, var10008, this.gk());
      int var10001 = --5;
      this.auo.setForeground(Class681.c("#c7D6120"));
      this.auo.setBounds(127 & 25, 63 & 123, 31 & 116, 120 & 127);
      this.auo.ad(new Class116(3 >> 1, 94 & 53, 3 & 4, 3 & 4));
      this.add(this.auo);
      <undefinedtype>[] var3 = new <undefinedtype>[var10001];
      boolean var10003 = true;
      this.ayp = var3;

      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < this.ayp.length; var10000 = var2) {
         this.ayp[var2] = new Class456() {
            private JLabel at;
            private Class19 ue;
            private RoleShow uf;
            private Class436 bl;
            private Class436 ih;

            protected void paintChildren(Graphics var1) {
               super.paintChildren(var1);
               if (this.uf != null) {
                  if (Class525.this.bm == null) {
                     Class525.this.bm = Class330.q(Class222.m("long"));
                  }

                  if (Class525.this.bm != null) {
                     Class525.this.bm.d(Class280.l(), 2 & 5);
                     Class525.this.bm.aa(var1, 85 & 110, 15547 & 17358);
                  }

                  if (this.ue == null) {
                     this.ue = Class330.ai(this.uf.getSpecies_id().longValue(), --2, 4 ^ 5, (String)null);
                  }

                  this.ue.a(var1, 108 & 87, 17598 & 15307, --4, Class280.l());
               }
            }

            public {
               int var10007 = 39 & 127;
               this.at = Class133.b(var10007, 12783 & 20155, 93 & 111, 63 & 84, Color.white, Class681.bm);
               this.at.setHorizontalAlignment(3 ^ 3);
               this.bl = new Class436();
               this.ih = new Class436("sc/d/139.png");
               this.bl.setBounds(105 & 31, 32767 & 167, 127 & 29, 127 & 29);
               this.ih.setBounds(5 >> 3, 23484 & 9455, 4239 & 28663, 52 & 95);
               this.add(this.at);
               this.add(this.bl);
               this.add(this.ih);
            }

            public void le(RoleShow var1) {
               int var10001;
               if ((this.uf = var1) == null) {
                  var10001 = 3 >> 2;
                  this.ue = null;
                  this.setVisible((boolean)var10001);
               } else {
                  var10001 = --1;
                  this.at.setText(var1.getRolename());
                  this.bl.fw("sc/d/" + ((13255 & 19646) + (SkillUtil.getSepciesIndex(var1.getSpecies_id()) - --1) / (1 ^ 3)) + ".png");
                  this.ue = null;
                  this.setVisible((boolean)var10001);
               }
            }
         };
         this.ayp[var2].setBounds((119 & 47) + (111 & 124) * var2, 11, 135, 200);
         this.ayp[var2].setVisible((boolean)(2 & 5));
         this.add(this.ayp[var2++]);
      }

      this.bl = new Class436("sc/d/133.png");
      this.bl.setBounds(21, 30, 29, 164);
      this.add(this.bl);
   }


   private void uq(BWDHTeam var1) {
      this.m = var1 != null ? var1.getId() : 0;
      int var10000;
      if (var1 == null) {
         int var5;
         for(var10000 = var5 = 3 >> 2; var10000 < this.ayp.length; var10000 = var5) {
            this.ayp[var5++].le((RoleShow)null);
         }

         Class226 var10 = this.auo;
         String[] var9 = new String[--4];
         boolean var10003 = true;
         var9[3 & 4] = "队";
         var9[2 ^ 3] = "伍";
         var9[5 >> 1] = "名";
         var9[--3] = "称";
         var10.df(var9);
      } else {
         RoleShow[] var2 = var1.getRoleShows();

         int var3;
         for(var10000 = var3 = 3 ^ 3; var10000 < this.ayp.length; var10000 = var3) {
            RoleShow var4 = var3 < var2.length ? var2[var3] : null;
            this.ayp[var3++].le(var4);
         }

         String[] var8 = new String[var1.getName().length()];
         boolean var10002 = true;
         String[] var6 = var8;

         int var7;
         for(var10000 = var7 = 3 & 4; var10000 < var6.length; var10000 = var7) {
            String var11 = var1.getName();
            int var10001 = var7;
            var11 = var11.substring(var7, var7 + (4 ^ 5));
            ++var7;
            var6[var10001] = var11;
         }

         this.auo.df(var6);
      }
   }
}
