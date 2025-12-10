package com.xy;

import com.xy.bean.BeauBean;
import com.xy.bean.ChatFriendBean;
import com.xy.bean.FriendBean;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Class494 extends Class345 {
   private JLabel[] fx;
   private Class436 aue;
   private Class436 ahe;
   private Class436 ts;
   private JScrollPane w;
   private RichLabel dr;
   private Class72 auf;
   private Class436 ec;
   private Class464 aug;
   private JScrollPane fl;
   private FriendBean auh;
   private Class436 av;
   private RichLabel acv;
   private JLabel ax;

   public void s() {
      JScrollBar var10000 = this.fl.getVerticalScrollBar();
      var10000.setMaximum(this.acv.getHeight());
      var10000.setValue(var10000.getMaximum());
   }

   public JTextArea ajf() {
      return this.auf;
   }

   public void d() {
      String var1;
      if (!(var1 = this.auf.getText().trim().replace("\n", "#r")).equals("")) {
         this.auf.setText((String)null);
         ChatFriendBean var2 = new ChatFriendBean();
         var2.setSendRoleId(this.vd().getLoginResult().getRole_id());
         var2.setRolename(this.vd().getLoginResult().getRolename());
         var2.setFriendName(this.auh.getRoleName());
         var2.setMessage(var1);
         var2.setTime(Class280.f());
         String var3 = Agreement.getSendTextAES("friendchat", Class695.b().toJson(var2));
         this.uw().d(var3);
         StringBuffer var4;
         (var4 = new StringBuffer()).append("#r#R");
         var4.append(Class280.i(Class280.l()));
         var4.append(" ");
         var4.append(this.vd().getLoginResult().getRolename());
         var4.append("#r#W");
         var4.append(var1);
         this.auh.d(var4.toString());
         this.acv.addText(var4.toString(), 24030 & 9023);
         this.s();
      }
   }

   public boolean ajg(long var1, String var3) {
      if (this.auh != null && this.auh.getFid() == var1) {
         this.acv.addText(var3, 9183 & 23870);
         this.s();
         return (boolean)(5 >> 2);
      } else {
         return false;
      }
   }

   public Class494(GameView var1) {
      int var10001 = --2;
      int var10006 = --1;
      int var10010 = -4 >> 2;
      super(63 & 120, --2, Class345.aef, var1);
      this.va(var10010, 3 ^ 3, 27630 & 5493, 31707 & 1471, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 103 & 92, 103 & 92, 103 & 92, 103 & 92, (boolean)(3 & 4)), (String)null);
      this.ak((boolean)var10006);
      this.av = new Class436();
      this.av.setBounds(95 & 55, 126 & 19, 125 & 42, 125 & 42);
      this.add(this.av);
      this.ts = new Class436("sc/d/28.png");
      this.ts.setBounds(23 & 121, 31 & 108, 53 & 126, 53 & 126);
      this.add(this.ts);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.fx = var3;

      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < this.fx.length; var10000 = var2) {
         this.fx[var2] = Class133.b(91 & 109, 95 & 55, 3272 & 29695, 118 & 27, Color.black, Class681.bu);
         this.fx[var2].setText(var2 == --1 ? "发送不关闭" : "");
         this.add(this.fx[var2]);
         if (var2 == --1) {
            this.fx[var2].setBounds(39 & 127, 32761 & 303, 200, 19);
         }

         ++var2;
      }

      this.ax = Class133.b(75, 46, 120, 19, Color.black, Class681.q);
      this.add(this.ax);
      this.dr = new RichLabel("", Class681.q);
      this.dr.setBounds(147, 43, 124, 19);
      this.add(this.dr);
      this.acv = Class271.l("", Class681.ce, 228);
      this.fl = Class133.f(24, 87, 306, 206, this.acv, 200);
      this.add(this.fl);
      this.auf = Class133.g(Class511.q("sc/d/17.png", --3, --3, --3, --3, (boolean)(2 & 5)), Class681.bm, Color.white);
      this.auf.setLineWrap((boolean)(--1));
      this.auf.setWrapStyleWord((boolean)(4 ^ 5));
      this.w = Class133.f(20, 319, 314, 44, this.auf, 20);
      this.add(this.w);
      this.ahe = new Class436();
      this.ahe.eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(2 & 5)));
      this.ahe.setBounds(20, 67, 312, 21);
      this.add(this.ahe);
      this.aue = new Class436();
      this.aue.eq(Class511.q("sc/d/24.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 & 4)));
      this.aue.setBounds(20, 67, 312, 228);
      this.add(this.aue);
      this.ec = new Class436("sc/e/30.png");
      this.ec.setBounds(20, 298, 17, 17);
      this.add(this.ec);
      this.aug = new Class464("sc/e/7.png", 3 >> 1, 201, Class681.ak, Class681.c, "发送", this);
      this.aug.setBounds(269, 368, 59, 25);
      this.add(this.aug);
   }

   public void afc(FriendBean var1) {
      this.auh = var1;
      this.auf.setText((String)null);
      this.av.fw(Class222.l("s" + var1.getSpeciesId()));
      Class494 var10000;
      BeauBean var2;
      if ((var2 = var1.getBeauBean()) == null) {
         var10000 = this;
         this.dr.setText("#W" + var1.getFid());
      } else if (var2.a()) {
         this.dr.setText("#VBEAU" + var2.toString() + "#L");
         var10000 = this;
      } else {
         this.dr.setText("#cFF00FF" + var2.getBeau());
         var10000 = this;
      }

      var10000.fx[3 ^ 3].setForeground(Class681.i(Class224.g(var1.getLvl())));
      this.fx[3 & 4].setText(var1.getRoleName());
      if (var1.getGroup() == 0) {
         this.ax.setText("非好友");
         var10000 = this;
      } else {
         this.ax.setText(Class224.r(var1.getLvl()));
         var10000 = this;
      }

      var10000.acv.setTextSize(var1.getChat(), 5086 & 27967);
      this.s();
      this.ve().a(this.ae());
   }
}
