package com.xy.a;

import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameAWTEventListener;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Class117 extends com.xy.q.Class30 {
   private com.xy.q.Class27[] ny;
   private RichLabel ed;
   private JLabel[] ap;
   private com.xy.i.Class20 aai;
   private com.xy.w.Class18 gh;
   private com.xy.q.Class16 api;
   private JScrollPane ba;
   private com.xy.q.Class36[] agq;

   public Class117(GameView var1) {
      super(181, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "1KmLm\u0019lX,O";
      this.yy(-1, 0, 364, 340, com.xy.q.Class30.agh);
      com.xy.w.Class9 var10 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10007 = "贬郖喁诅";
      this.yu(var10, "货郎喊话");
      String var10008 = "[!\u0007'\u0007p\u001elX,O";
      String var10013 = "弋姓扬衔";
      this.aai = new com.xy.i.Class20("sc/e/26.png", 1, 373, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "开始执行", this);
      this.aai.setBounds(145, 295, 99, 25);
      this.add(this.aai);
      this.ap = new JLabel[4];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ap.length; var10000 = ++var2) {
         this.ap[var2] = com.xy.q.Class1.k(49, 27, 100, 19, Color.black, com.xy.q.Class49.ch);
         JLabel var4 = this.ap[var2];
         String var6;
         if (var2 == 0) {
            var6 = "嗈诵诼罆";
            var6 = "喊话设置";
         } else if (var2 == 1) {
            var6 = "闿隌刍钇";
            var6 = "间隔分钟";
         } else if (var2 == 2) {
            var6 = "嗈诵正敘";
            var6 = "喊话次数";
         } else if (var2 == 3) {
            var6 = "喁诅冎审";
            var6 = "喊话内容";
         } else {
            var6 = "";
         }

         var4.setText(var6);
         this.ap[var2].setHorizontalAlignment(10);
         this.add(this.ap[var2]);
         if (var2 == 0) {
            this.ap[var2].setFont(com.xy.q.Class49.bx);
         } else if (var2 >= 1 && var2 <= 3) {
            this.ap[var2].setBounds(70, 69 + (var2 - 1) * 25, 72, 19);
         }
      }

      this.ed = new RichLabel("", com.xy.q.Class49.n);
      var10006 = "aKr\u0018r\u0018r\u0018膨劀嗈诵ｘ\u000b0糓纝毧雖丨毷旞閶否膨劀嗈诵\u3040\u000b0毧正喢讟手阦\u000b!n\u0004\u0018r\u0018r\u001ar\u0018aKr\u0018r\u0018r\u0018久丌奥诵幃〪";
      this.ed.setTextSize("#c000000自动喊话：#r系统每隔一段时间后自动喊话。#r每次喊话扣除#cFF0000200#c000000万两大话币。", 280);
      this.ed.setBounds(55, 232, this.ed.getWidth(), this.ed.getHeight());
      this.add(this.ed);
      this.agq = new com.xy.q.Class36[2];
      this.ny = new com.xy.q.Class27[2];

      for (int var5 = var2 = 0; var5 < this.agq.length; var5 = var2) {
         var10006 = "kh7o7:/%he\u007f";
         this.agq[var2] = com.xy.q.Class1.j(com.xy.w.Class16.m("sc/d/17.png", 6, 6, 6, 6, false), com.xy.q.Class49.w, Color.white);
         this.agq[var2].setBounds(144, 69 + 25 * var2, 115, 19);
         this.ny[var2] = new com.xy.q.Class27(0, this.agq[var2], this);
         this.add(this.agq[var2++]);
      }

      var10007 = "[!\u0007&\u0007s\u001flX,O";
      this.api = com.xy.q.Class1.d(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.ac, Color.white);
      this.api.setLineWrap(true);
      this.api.setWrapStyleWord(true);
      this.ba = com.xy.q.Class1.g(74, 140, 250, 77, this.api, 20);
      this.add(this.ba);
      this.gh = new com.xy.w.Class18();
      String var10005 = "kh7o78.%he\u007f";
      this.gh.mt(com.xy.w.Class16.m("sc/d/36.png", 20, 20, 20, 20, false));
      this.gh.setBounds(54, 52, 281, 176);
      this.add(this.gh);
   }

   @Override
   public void l() {
      com.xy.q.Class36 var10003 = this.agq[0];
      String var10004 = "\u001d";
      var10003.setText("5");
      com.xy.q.Class36 var10002 = this.agq[1];
      String var1 = ":(";
      var10002.setText("10");
      this.api.setText(null);
      super.l();
   }

   public void g(int var1) {
      if (var1 == 373) {
         int var2 = (int)this.ny[0].ee();
         int var3 = (int)this.ny[1].ee();
         if (var2 <= 0) {
            String var11 = "斴關閶隼乏胕乸\u0018";
            this.afx._do("时间间隔不能为0");
            return;
         }

         if (var3 <= 0) {
            String var10 = "喁诅欪敨丆胥丱(";
            this.afx._do("喊话次数不能为0");
            return;
         }

         String var4;
         if (com.xy.v.Class12.h(var4 = this.api.getText().trim().replace("\n", ""))) {
            String var9 = "嗈诵凇宑乏胕乸穒";
            this.afx._do("喊话内容不能为空");
            return;
         }

         if (var4.length() > 100) {
            String var8 = "朋夿孜笾陛刮:(;串";
            this.afx.dp("最大字符限制100个");
            return;
         }

         if (GameAWTEventListener.nb(var4)) {
            String var7 = "叹遃冭寻帎杋敧慝该";
            this.afx.dp("发送内容带有敏感词");
            return;
         }

         StringBuffer var5;
         StringBuffer var10000 = var5 = new StringBuffer();
         String var10001 = "Y^LDUX_";
         var10000.append("AUTOMSG");
         var5.append(var2);
         String var10003 = "T";
         var5.append("|");
         var5.append(var3);
         String var10005 = "d";
         var5.append("|");
         var5.append(var4);
         String var6 = Agreement.getSendTextAES("stall", var5.toString());
         this.za().k(var6);
         this.zc().f(this.lj());
      }
   }
}
