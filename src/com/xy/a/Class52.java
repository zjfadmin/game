package com.xy.a;

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

public class Class52 extends com.xy.q.Class30 {
   private com.xy.w.Class18 yb;
   private JLabel da;
   private JScrollPane yc;
   private com.xy.w.Class18 xf;
   private RichLabel re;
   private com.xy.q.Class16 yd;
   private JScrollPane rf;
   private RichLabel ed;
   private JLabel[] ap;
   private FriendBean ye;
   private com.xy.w.Class18 gh;
   private com.xy.w.Class18 af;
   private com.xy.i.Class12 yf;
   private com.xy.w.Class18 dn;

   public void f() {
      JScrollBar var10000 = this.rf.getVerticalScrollBar();
      var10000.setMaximum(this.re.getHeight());
      var10000.setValue(var10000.getMaximum());
   }

   public Class52(GameView var1) {
      super(56, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "S&\u000f!\u000ft\u000e5N\"";
      this.yy(-1, 0, 356, 411, com.xy.q.Class30.agh);
      this.yu(com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false), null);
      this.rm(true);
      this.gh = new com.xy.w.Class18();
      this.gh.setBounds(23, 18, 40, 40);
      this.add(this.gh);
      String var10009 = "\\;\u0000<\u0000j\u0017v_6H";
      this.af = new com.xy.w.Class18("sc/d/28.png");
      this.af.setBounds(17, 12, 52, 52);
      this.add(this.af);
      this.ap = new JLabel[2];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.ap.length; var10000 = ++var2) {
         this.ap[var2] = com.xy.q.Class1.k(73, 23, 200, 18, Color.black, com.xy.q.Class49.k);
         JLabel var3 = this.ap[var2];
         String var4;
         if (var2 == 1) {
            var4 = "厔逡么兓閨";
            var4 = "发送不关闭";
         } else {
            var4 = "";
         }

         var3.setText(var4);
         this.add(this.ap[var2]);
         if (var2 == 1) {
            this.ap[var2].setBounds(39, 297, 200, 19);
         }
      }

      this.da = com.xy.q.Class1.k(75, 46, 120, 19, Color.black, com.xy.q.Class49.w);
      this.add(this.da);
      this.ed = new RichLabel("", com.xy.q.Class49.w);
      this.ed.setBounds(147, 43, 124, 19);
      this.add(this.ed);
      this.re = com.xy.v.Class27.j("", com.xy.q.Class49.ac, 228);
      this.rf = com.xy.q.Class1.g(24, 87, 306, 206, this.re, 200);
      this.add(this.rf);
      String var10010 = "\\;\u0000<\u0000i\u0018v_6H";
      this.yd = com.xy.q.Class1.d(com.xy.w.Class16.m("sc/d/17.png", 3, 3, 3, 3, false), com.xy.q.Class49.bz, Color.white);
      this.yd.setLineWrap(true);
      this.yd.setWrapStyleWord(true);
      this.yc = com.xy.q.Class1.g(20, 319, 314, 44, this.yd, 20);
      this.add(this.yc);
      this.xf = new com.xy.w.Class18();
      var10008 = "6CjDj\u0012p\u000e5N\"";
      this.xf.mt(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
      this.xf.setBounds(20, 67, 312, 21);
      this.add(this.xf);
      this.dn = new com.xy.w.Class18();
      var10009 = "\\;\u0000<\u0000j\u001bv_6H";
      this.dn.mt(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.dn.setBounds(20, 67, 312, 228);
      this.add(this.dn);
      String var10012 = "6CjEj\u0013u\u000e5N\"";
      this.yb = new com.xy.w.Class18("sc/e/30.png");
      this.yb.setBounds(20, 298, 17, 17);
      this.add(this.yb);
      String var10013 = "+LwJw\u0018v_6H";
      String var10018 = "叱遄";
      this.yf = new com.xy.i.Class12("sc/e/7.png", 1, 201, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "发送", this);
      this.yf.setBounds(269, 368, 59, 25);
      this.add(this.yf);
   }

   public boolean ss(long var1, String var3) {
      if (this.ye != null && this.ye.getFid() == var1) {
         this.re.addText(var3, 286);
         this.f();
         return true;
      } else {
         return false;
      }
   }

   public void h() {
      String var10000 = this.yd.getText().trim();
      String var10002 = "{]";
      String var1;
      if (!(var1 = var10000.replace("\n", "#r")).equals("")) {
         this.yd.setText(null);
         ChatFriendBean var2 = new ChatFriendBean();
         var2.setSendRoleId(this.yx().getLoginResult().getRole_id());
         var2.setRolename(this.yx().getLoginResult().getRolename());
         var2.setFriendName(this.ye.getRoleName());
         var2.setMessage(var1);
         var2.setTime(com.xy.v.Class22.f());
         String var3 = Agreement.getSendTextAES("friendchat", com.xy.v.Class31.a().toJson(var2));
         this.za().k(var3);
         StringBuffer var4;
         StringBuffer var5 = var4 = new StringBuffer();
         String var10001 = "\u00037\u0003\u0017";
         var5.append("#r#R");
         var4.append(com.xy.v.Class22.i(com.xy.v.Class22.l()));
         String var10003 = "\u000f";
         var4.append(" ");
         var4.append(this.yx().getLoginResult().getRolename());
         String var10005 = "\u00037\u0003\u0012";
         var4.append("#r#W");
         var4.append(var1);
         this.ye.c(var4.toString());
         this.re.addText(var4.toString(), 286);
         this.f();
      }
   }

   public void st(FriendBean var1) {
      this.ye = var1;
      this.yd.setText(null);
      String var10003 = "\\";
      this.gh.dp(com.xy.w.Class15.l("s" + var1.getSpeciesId()));
      BeauBean var2;
      Class52 var10000;
      if ((var2 = var1.getBeauBean()) == null) {
         var10000 = this;
         String var10004 = "\u0003\u0012";
         this.ed.setText("#W" + var1.getFid());
      } else if (var2.a()) {
         var10000 = this;
         RichLabel var10001 = this.ed;
         String var6 = "{y\u001aj\u0019z";
         StringBuilder var10002 = new StringBuilder("#VBEAU").append(var2.toString());
         var10003 = "\u0003\t";
         var10001.setText(var10002.append("#L").toString());
      } else {
         var10000 = this;
         String var7 = "{L\u001eih\u001f\u001ei";
         this.ed.setText("#cFF00FF" + var2.getBeau());
      }

      var10000.ap[0].setForeground(com.xy.q.Class49.d(com.xy.v.Class4.q(var1.getLvl())));
      this.ap[0].setText(var1.getRoleName());
      if (var1.getGroup() == 0) {
         String var4 = "霛奝厎";
         this.da.setText("非好友");
         var10000 = this;
      } else {
         this.da.setText(com.xy.v.Class4.h(var1.getLvl()));
         var10000 = this;
      }

      var10000.re.setTextSize(var1.getChat(), 286);
      this.f();
      this.zc().b(this.lj());
   }

   public JTextArea su() {
      return this.yd;
   }
}
