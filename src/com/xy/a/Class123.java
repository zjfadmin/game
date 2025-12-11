package com.xy.a;

import com.xy.battle.BattleMan;
import com.xy.battle.TypeState;
import com.xy.formula.SkillUtil;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;

public class Class123 extends com.xy.q.Class30 {
   private RichLabel bk;
   private Color asu;
   private Class8[] asv;
   private com.xy.d.Class11 asw;

   public Class123(GameView var1) {
      super(34, 2, com.xy.q.Class30.afz, var1);
      String var10003 = "\u0015pIpI#";
      String var10007 = "v\u0010\u00161\u0017F`1";
      this.asu = com.xy.q.Class49.c("#cCBB55B");
      this.yy(-1, 0, 420, 310, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/c/0", 6, 6, 6, 6, false), null);
      this.asv = new Class8[6];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.asv.length; var10000 = var2) {
         this.asv[var2] = new Class8(this);
         this.asv[var2].setVisible(false);
         this.add(this.asv[var2++]);
      }

      this.bk = new RichLabel("", com.xy.q.Class49.aw);
      this.add(this.bk);
   }

   @Override
   protected void paintComponent(final Graphics graphics) {
      super.paintComponent(graphics);
      final Graphics2D graphics2D2;
      final Graphics2D graphics2D = graphics2D2 = (Graphics2D)graphics;
      Object renderingHint = graphics2D.getRenderingHint(RenderingHints.KEY_RENDERING);
      Object renderingHint2 = graphics2D.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
      Object renderingHint3 = graphics2D.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
      Object renderingHint4 = graphics2D.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object renderingHint5 = graphics2D.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Object o;
      if (renderingHint != RenderingHints.VALUE_RENDER_QUALITY) {
         o = renderingHint2;
         graphics2D2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      }
      else {
         renderingHint = null;
         o = renderingHint2;
      }
      Object o2;
      if (o != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
         o2 = renderingHint3;
         graphics2D2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
      }
      else {
         renderingHint2 = null;
         o2 = renderingHint3;
      }
      Object o3;
      if (o2 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
         o3 = renderingHint4;
         graphics2D2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      }
      else {
         renderingHint3 = null;
         o3 = renderingHint4;
      }
      Object o4;
      if (o3 != RenderingHints.VALUE_STROKE_DEFAULT) {
         o4 = renderingHint5;
         graphics2D2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      }
      else {
         renderingHint4 = null;
         o4 = renderingHint5;
      }
      Graphics graphics2;
      if (o4 != RenderingHints.VALUE_ANTIALIAS_ON) {
         graphics2 = graphics;
         graphics2D2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }
      else {
         renderingHint5 = null;
         graphics2 = graphics;
      }
      graphics2.setColor(this.asu);
      final int i = 0;
      graphics.setFont(com.xy.q.Class49.f);
      int n = i;
      while (i < this.asv.length) {
         if (this.asv[n].isVisible()) {
            if (this.asv[n].er != null) {
               int n2;
               int j = n2 = 0;
               while (j < this.asv[n].er.length) {
                  graphics.drawString(this.asv[n].er[n2], this.asv[n].getX(), this.asv[n].getY() + 17 + 25 * n2++);
                  j = n2;
               }
            }
         }
         ++n;
      }
      if (renderingHint != null) {
         graphics2D2.setRenderingHint(RenderingHints.KEY_RENDERING, renderingHint);
      }
      if (renderingHint2 != null) {
         graphics2D2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, renderingHint2);
      }
      if (renderingHint3 != null) {
         graphics2D2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, renderingHint3);
      }
      if (renderingHint4 != null) {
         graphics2D2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, renderingHint4);
      }
      if (renderingHint5 != null) {
         graphics2D2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, renderingHint5);
      }
   }

   public void akw(com.xy.d.Class11 var1) {
      com.xy.v.Class8 var2 = this.yt();
      this.asw = var1;

      int var3;
      for (int var10000 = var3 = 0; var10000 < this.asv.length; var10000 = var3) {
         this.asv[var3++].t();
      }

      BattleMan var23 = var1.cg();
      String var10002 = "拕肎";
      List var8 = var23.j("技能");
      if (var1.cg().getType() == 0) {
         int var10;
         label77:
         for (int var17 = var10 = 0; var17 < var8.size(); var17 = ++var10) {
            TypeState var12;
            if ((var12 = (TypeState)var8.get(var10)).getState() == 0 || var12.getState() == 2) {
               String var6;
               if ((var6 = SkillUtil.getSkillSM(var12.getType(), var2)) == null) {
                  this.asv[5].ea(var12);
               } else {
                  String var27 = "失裖";
                  if (var6.equals("套装")) {
                     this.asv[4].ea(var12);
                  } else {
                     String var28 = "沀閛";
                     if (var6.equals("法门")) {
                        this.asv[3].ea(var12);
                     } else {
                        int var7;
                        for (int var18 = var7 = 0; var18 < 3; var18 = ++var7) {
                           if (this.asv[var7].er == null || this.asv[var7].er[0].equals(var6)) {
                              if (this.asv[var7].er == null) {
                                 this.asv[var7].er = new String[]{var6};
                              }

                              this.asv[var7].ea(var12);
                              continue label77;
                           }
                        }

                        this.asv[5].ea(var12);
                     }
                  }
               }
            }
         }

         Class8 var19 = this.asv[3];
         String[] var29 = new String[2];
         String var38 = "泆";
         var29[0] = "法";
         var38 = "閛";
         var29[1] = "门";
         var19.er = var29;
         var19 = this.asv[4];
         String[] var30 = new String[2];
         var38 = "奄";
         var30[0] = "套";
         var38 = "袶";
         var30[1] = "装";
         var19.er = var30;
         var19 = this.asv[5];
         String[] var31 = new String[2];
         var38 = "入";
         var31[0] = "其";
         var38 = "亥";
         var31[1] = "他";
         var19.er = var31;

         for (int var22 = var10 = 0; var22 < this.asv.length; var22 = var10) {
            this.asv[var10].setBounds(5 + var10 % 3 * 140, 10 + var10 / 3 * 170, 135, 160);
            this.asv[var10++].setVisible(true);
         }

         this.yv(-1, 0, 420, 340);
         var38 = "彀别^6)";
         this.bk.setTextSize("当前MP:" + var1.cg().getMp_Current(), 400);
         this.bk.setBounds(12, 310, this.bk.getWidth(), this.bk.getHeight());
      } else {
         int var4;
         for (int var13 = var4 = 0; var13 < var8.size(); var13 = ++var4) {
            TypeState var5;
            if ((var5 = (TypeState)var8.get(var4)).getState() == 0 || var5.getState() == 2) {
               this.asv[0].ea(var5);
            }
         }

         Class8 var14 = this.asv[0];
         String[] var24 = new String[3];
         String var10004 = "原";
         var24[0] = "召";
         var10004 = "唷";
         var24[1] = "唤";
         var10004 = "儎";
         var24[2] = "兽";
         var14.er = var24;
         var14 = this.asv[1];
         String[] var25 = new String[2];
         var10004 = "入";
         var25[0] = "其";
         var10004 = "亥";
         var25[1] = "他";
         var14.er = var25;

         for (int var16 = var4 = 0; var16 < 2; var16 = var4) {
            this.asv[var4].setBounds(5 + var4 * 140, 10, 135, 270);
            this.asv[var4++].setVisible(true);
         }

         this.yv(-1, 0, 290, 290);
         var10004 = "彀别^6)";
         this.bk.setTextSize("当前MP:" + var1.cg().getMp_Current(), 400);
         this.bk.setBounds(12, 260, this.bk.getWidth(), this.bk.getHeight());
      }
   }

   // $VF: synthetic method
   static com.xy.d.Class11 akx(Class123 var0) {
      return var0.asw;
   }

   @Override
   public void l() {
      com.xy.d.Class11 var1;
      if ((var1 = this.afx.getBattleControl().getHandleUnit()) != null) {
         this.akw(var1);
         super.l();
      }
   }
}
