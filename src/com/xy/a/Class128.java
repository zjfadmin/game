package com.xy.a;

import com.xy.bean.FriendBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class128 extends com.xy.q.Class30 {
   private com.xy.i.Class12[] awi;
   private com.xy.i.Class12[] awj;
   private com.xy.q.Class47 awk;
   private long kd;

   public Class128(GameView var1) {
      super(4, 2, com.xy.q.Class30.afz, var1);
      String var10006 = "d\u000e8\t8_$Cg\u0003p";
      this.yy(-1, 0, 160, 496, com.xy.q.Class30.agf);
      this.yu(com.xy.w.Class16.m("sc/d/23.png", 68, 68, 68, 68, false), null);
      String var10008 = "$VxPx\u0004a\u001b'[0";
      this.agi = new com.xy.i.Class0("sc/e/16.png", 1, this.lj(), this);
      this.agi.setBounds(143, 9, 12, 11);
      this.add(this.agi);
      this.awi = new com.xy.i.Class12[3];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.awi.length; var10000 = var2) {
         var10006 = "d\u000e8\b8";
         this.awi[var2] = new com.xy.i.Class12("sc/e/" + (17 + var2) + ".png", 1, 0, this);
         Class128 var7;
         if (var2 == 0) {
            var7 = this;
            this.awi[var2].setBounds(4, 29, 53, 25);
         } else if (var2 == 1) {
            var7 = this;
            this.awi[var2].setBounds(5 + 54 * var2, 34, 52, 21);
         } else {
            if (var2 == 2) {
               this.awi[var2].setBounds(5 + 54 * var2, 34, 41, 21);
            }

            var7 = this;
         }

         var7.add(this.awi[var2++]);
      }

      this.awj = new com.xy.i.Class12[5];

      for (int var8 = var2 = 0; var8 < this.awj.length; var8 = var2) {
         String var10009 = "$VxPx";
         this.awj[var2] = new com.xy.i.Class12("sc/e/" + (20 + var2) + ".png", 1, 1 + var2, this);
         this.awj[var2].setBounds(8 + 31 * var2, 472, 20, 17);
         this.add(this.awj[var2++]);
      }

      this.awk = new com.xy.q.Class47(this, 30);
      this.awk.be(true);
      this.awk.setBounds(5, 58, 150, 400);
      this.add(this.awk);
      this.awk.ajq().removeAllChildren();
      FriendBean var5 = new FriendBean();
      String var10015 = "奊诊糓灢";
      var5.setRoleName("大话精灵");
      var5.setSpeciesId(999999);
      FriendBean var6 = this.yx().am(var5);
      com.xy.q.Class34 var3;
      com.xy.q.Class34 var10011 = var3 = new com.xy.q.Class34(var6.getRoleName(), var6);
      var10011.m(com.xy.q.Class49.d(0));
      var10011.f(com.xy.q.Class49.ck);
      String var10016 = "$";
      var10011.b(new com.xy.w.Class13(com.xy.w.Class16.c(com.xy.w.Class15.l("s" + var6.getSpeciesId())), 28, 28, 2, 2));
      this.awk.ajq().add(new DefaultMutableTreeNode(var3));
      DefaultMutableTreeNode var18 = this.awk.ajq();
      String var10012 = "圿绒奪厦L]J";
      var18.add(new DefaultMutableTreeNode("在线好友[0]"));
      DefaultMutableTreeNode var16 = this.awk.ajq();
      String var20 = "扆皱太叾\f\u0005x\u0005\n";
      var16.add(new DefaultMutableTreeNode("我的好友[0/0]"));
      DefaultMutableTreeNode var10007 = this.awk.ajq();
      String var10010 = "帟忿兤粖L]J";
      var10007.add(new DefaultMutableTreeNode("师徒关系[0]"));
      DefaultMutableTreeNode var13 = this.awk.ajq();
      String var19 = "纄企氈湣\f\u0005\n";
      var13.add(new DefaultMutableTreeNode("结伴江湖[0]"));
      DefaultMutableTreeNode var10005 = this.awk.ajq();
      var10008 = "跿杠奪厦L]J";
      var10005.add(new DefaultMutableTreeNode("跨服好友[0]"));
      DefaultMutableTreeNode var10004 = this.awk.ajq();
      String var15 = "禬氤太叾\f\u0005\n";
      var10004.add(new DefaultMutableTreeNode("移民好友[0]"));
      DefaultMutableTreeNode var10003 = this.awk.ajq();
      var10006 = "丣斛奪厦L]J";
      var10003.add(new DefaultMutableTreeNode("临时好友[0]"));
      DefaultMutableTreeNode var10 = this.awk.ajq();
      String var11 = "黤呚占\f\u0005\n";
      var10.add(new DefaultMutableTreeNode("黑名单[0]"));
      this.awk.t();
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         if (!this.dh()) {
            this.yv(this.afx.screenData.Screen_x - 200, 120, this.getWidth(), this.getHeight());
            super.l();
         }
      }
   }

   public void ef(long var1) {
      synchronized (this) {
         this.ami(var1, null);
         this.h();
         this.awk.t();
      }
   }

   public void h() {
      DefaultMutableTreeNode var1;
      int var2 = (var1 = this.awk.ajq()).getChildCount();

      int var3;
      for (int var10000 = var3 = 1; var10000 < var2; var10000 = ++var3) {
         DefaultMutableTreeNode var4;
         String var5 = ((String)(var4 = (DefaultMutableTreeNode)var1.getChildAt(var3)).getUserObject()).substring(0, 4);
         if (var3 != 2) {
            var4.setUserObject(var5 + "[" + var4.getChildCount() + "]");
         } else {
            int var6 = 0;

            int var7;
            for (int var9 = var7 = 0; var9 < var4.getChildCount(); var9 = ++var7) {
               DefaultMutableTreeNode var8;
               if ((var8 = (DefaultMutableTreeNode)var4.getChildAt(var7)).getUserObject() instanceof com.xy.q.Class34
                  && ((FriendBean)((com.xy.q.Class34)var8.getUserObject()).j()).f()) {
                  var6++;
               }
            }

            StringBuilder var10 = new StringBuilder(String.valueOf(var5)).append("[").append(var6);
            String var10001 = "8";
            var4.setUserObject(var10.append("/").append(var4.getChildCount()).append("]").toString());
         }
      }
   }

   public boolean dh() {
      if (System.currentTimeMillis() - this.kd < com.xy.v.Class22.k) {
         return false;
      } else {
         this.kd = System.currentTimeMillis() - com.xy.v.Class22.k + com.xy.v.Class22.h * 5;
         String var1 = Agreement.getSendTextAES("friend", String.valueOf(this.yx().getRoleId()));
         this.za().k(var1);
         return true;
      }
   }

   public void amg(List<FriendBean> var1, boolean var2) {
      synchronized (this) {
         DefaultMutableTreeNode var4;
         int var5 = (var4 = this.awk.ajq()).getChildCount();

         int var6;
         for (int var10000 = var6 = 0; var10000 < var5; var10000 = var6) {
            DefaultMutableTreeNode var11 = (DefaultMutableTreeNode)var4.getChildAt(var6);
            var6++;
            var11.removeAllChildren();
         }

         Iterator var7;
         for (Iterator var12 = var7 = var1.iterator(); var12.hasNext(); var12 = var7) {
            FriendBean var9 = (FriendBean)var7.next();
            FriendBean var10;
            this.ami((var10 = this.yx().am(var9)).getFid(), var10);
         }

         this.h();
         if (var2) {
            this.kd = System.currentTimeMillis();
            this.zc().b(this.lj());
         }

         this.awk.t();
      }
   }

   public void amh(FriendBean var1, int var2) {
      if (var1 != null) {
         if (var2 == 1) {
            ((Class52)this.afx.getFormManagement().j(56)).st(this.yx().getFriend(var1.getFid()));
         } else {
            if (var2 == 3) {
               ((Class65)this.afx.getFormManagement().j(76)).st(this.yx().getFriend(var1.getFid()));
            }
         }
      }
   }

   public void st(FriendBean var1) {
      synchronized (this) {
         FriendBean var4;
         this.ami((var4 = this.yx().am(var1)).getFid(), var4);
         this.h();
         this.awk.t();
      }
   }

   public void ami(long var1, FriendBean var3) {
      int var4 = 0;
      com.xy.q.Class34 var5 = null;
      if (var3 != null) {
         var4 = var3.getGroup();
         if (var3.getFid() != 0L && var4 == 0) {
            var4 = 7;
         }

         (var5 = new com.xy.q.Class34(var3.getRoleName(), var3)).m(var3.f() ? com.xy.q.Class49.d(com.xy.v.Class4.q(var3.getLvl())) : com.xy.q.Class49.d(-1));
         var5.f(com.xy.q.Class49.ai);
         String var10002 = "$";
         String var6 = com.xy.w.Class15.l("s" + var3.getSpeciesId());
         var5.b(new com.xy.w.Class13(com.xy.w.Class16.c(var6), 24, 24, 1, 1));
      }

      DefaultMutableTreeNode var12;
      int var7 = (var12 = this.awk.ajq()).getChildCount();

      int var8;
      label77:
      for (int var10000 = var8 = 1; var10000 < var7; var10000 = ++var8) {
         DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var12.getChildAt(var8);

         int var10;
         for (int var13 = var10 = 0; var13 < var9.getChildCount(); var13 = ++var10) {
            DefaultMutableTreeNode var11;
            if ((var11 = (DefaultMutableTreeNode)var9.getChildAt(var10)).getUserObject() instanceof com.xy.q.Class34
               && ((FriendBean)((com.xy.q.Class34)var11.getUserObject()).j()).getFid() == var1) {
               if (var8 == 1 && var5 != null && var3.f()) {
                  var11.setUserObject(var5);
                  continue label77;
               }

               if (var8 != 1 && var5 != null && var8 == var4) {
                  var11.setUserObject(var5);
                  continue label77;
               }

               var9.remove(var10);
               continue label77;
            }
         }

         if (var5 != null && (var8 == 1 && var3.f() || var8 != 0 && var8 == var4)) {
            var9.add(new DefaultMutableTreeNode(var5));
         }
      }
   }
}
