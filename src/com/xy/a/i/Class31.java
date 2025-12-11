package com.xy.a.i;

import com.xy.entity.PartJade;
import com.xy.q.Class49;
import com.xy.readbean.Goodstable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

public class Class31 extends JComponent {
   public PartJade aiy;
   private Image hf;
   private com.xy.q.Class30 cw;
   public com.xy.w.Class18[] cl = new com.xy.w.Class18[5];

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      if (this.hf == null) {
         String var10001 = "ed9e9T#08wx`";
         this.hf = com.xy.w.Class16.c("sc/b/S57.png");
      }

      var1.drawImage(this.hf, 0, 0, 291, 171, this);
      var1.setColor(Color.white);
      var1.setFont(Class49.ac);
      var1.drawString(String.valueOf(this.aiy.getJade1()), 30, 27);
      var1.drawString(String.valueOf(this.aiy.getJade2()), 120, 27);
      var1.drawString(String.valueOf(this.aiy.getJade3()), 210, 27);
      var1.drawString(String.valueOf(this.aiy.getJade4()), 75, 105);
      var1.drawString(String.valueOf(this.aiy.getJade5()), 165, 105);
   }

   // $VF: synthetic method
   static com.xy.q.Class30 abr(Class31 var0) {
      return var0.cw;
   }

   public Class31(com.xy.q.Class30 var1, PartJade var2) {
      int var10000 = 0;
      this.setPreferredSize(new Dimension(270, 170));
      this.setLayout(null);
      this.setBackground(Class49.bk);
      this.aiy = var2;
      this.cw = var1;

      for (int var3 = 0; var10000 < 5; var10000 = var3) {
         this.cl[var3] = new com.xy.w.Class18();
         this.cl[var3].addMouseListener(new Class18(this, var3 + 1));
         Class31 var4;
         if (var3 < 3) {
            var4 = this;
            this.cl[var3].setBounds(30 + var3 * 90, 17, 54, 51);
         } else {
            var4 = this;
            this.cl[var3].setBounds(75 + (var3 - 3) * 90, 97, 54, 51);
         }

         var4.add(this.cl[var3++]);
      }
   }

   public static Goodstable abs(PartJade var0, int var1) {
      String var2 = "";
      if (var1 == 1) {
         String var10000 = "瀄宸奘尯烍刓盵玬筗Ｉ厞辺郛Ｉ厞祾疴Ｉ厞祭秾Ｉ厞仁袴夢他町珵妼盵叽卧〧Q\u0005Q\u0005Q\u0005Q\u0005咰贍ｫ抯珘";
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：把玩";
      } else if (var1 == 2) {
         String var4 = "灲宋央尜炻删皃玟笡：叨辉邭：叨祍痂：叨神禈：叨仲裂夑亠甉玃妏皃収匑〔'6'6'6'6哆贾＝财躬";
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：贴身";
      } else if (var1 == 3) {
         String var5 = "瀄宸奘尯烍刓盵玬筗Ｉ厞辺郛Ｉ厞祾疴Ｉ厞祭秾Ｉ厞仁袴夢他町珵妼盵叽卧〧Q\u0005Q\u0005Q\u0005Q\u0005咰贍ｫ珨薾";
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：珍藏";
      } else if (var1 == 4) {
         String var6 = "灲宋央尜炻删皃玟笡：叨辉邭：叨祍痂：叨神禈：叨仲裂夑亠甉玃妏皃収匑〔'6'6'6'6哆贾＝时仰";
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：无价";
      } else if (var1 == 5) {
         String var7 = "瀄宸奘尯烍刓盵玬筗Ｉ厞辺郛Ｉ厞祾疴Ｉ厞祭秾Ｉ厞仁袴夢他町珵妼盵叽卧〧Q\u0005Q\u0005Q\u0005Q\u0005咰贍ｫ伅乧";
         var2 = "灵宝天尊炼制的玉符，可辟邪，可祛病，可祈福，可令装备产生玄妙的变化。        品质：传世";
      }

      Goodstable var3 = new Goodstable();
      String var10008 = "灐寬玬筗";
      String var10012 = "b}oa";
      var3.setSkin("tzyf" + var1);
      var3.setGoodsname("灵宝玉符");
      var3.setInstruction(var2);
      var3.setValue("");
      var3.setQuality(1L);
      return var3;
   }

   public void ck(PartJade var1) {
      this.aiy = var1;
   }
}
