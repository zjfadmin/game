package com.xy;

import com.xy.bean.FriendBean;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class Class637 extends Class345 {
   private Class464[] anc;
   private Class464[] s;
   private long om;
   private Class512 n;

   public void d() {
      DefaultMutableTreeNode var4;
      int var7 = (var4 = this.n.aqa()).getChildCount();

      int var3;
      for(int var10000 = var3 = --1; var10000 < var7; var10000 = var3) {
         DefaultMutableTreeNode var1;
         String var5 = ((String)(var1 = (DefaultMutableTreeNode)var4.getChildAt(var3)).getUserObject()).substring(3 >> 2, --4);
         if (var3 != 5 >> 1) {
            var1.setUserObject(var5 + "[" + var1.getChildCount() + "]");
         } else {
            int var6 = 0;

            int var2;
            for(var10000 = var2 = 3 ^ 3; var10000 < var1.getChildCount(); var10000 = var2) {
               DefaultMutableTreeNode var8;
               if ((var8 = (DefaultMutableTreeNode)var1.getChildAt(var2)).getUserObject() instanceof Class625 && ((FriendBean)((Class625)var8.getUserObject()).g()).c()) {
                  ++var6;
               }

               ++var2;
            }

            var1.setUserObject(var5 + "[" + var6 + "/" + var1.getChildCount() + "]");
         }

         ++var3;
      }

   }

   public void q() {
      if (this.vd() != null) {
         if (!this.bl()) {
            this.vf(this.aej.screenData.Screen_x - (17407 & 15560), 120 & 127, this.getWidth(), this.getHeight());
            super.q();
         }
      }
   }

   public void gh(long var1) {
      synchronized(this) {
         this.afa(var1, (FriendBean)null);
         this.d();
         this.n.q();
      }
   }

   public void afa(long var1, FriendBean var3) {
      int var4 = 3 & 4;
      Class625 var5 = null;
      if (var3 != null) {
         var4 = var3.getGroup();
         if (var3.getFid() != 0L && var4 == 0) {
            var4 = 63 & 71;
         }

         (var5 = new Class625(var3.getRoleName(), var3)).k(var3.c() ? Class681.i(Class224.g(var3.getLvl())) : Class681.i(-1));
         var5.f(Class681.cn);
         String var6 = Class222.l("s" + var3.getSpeciesId());
         var5.a(new Class530(Class511.a(var6), 125 & 26, 125 & 26, 4 ^ 5, 4 ^ 5));
      }

      DefaultMutableTreeNode var12;
      int var7 = (var12 = this.n.aqa()).getChildCount();

      int var8;
      for(int var10000 = var8 = 4 ^ 5; var10000 < var7; var10000 = var8) {
         DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var12.getChildAt(var8);

         label80: {
            int var10;
            for(var10000 = var10 = 3 & 4; var10000 < var9.getChildCount(); var10000 = var10) {
               DefaultMutableTreeNode var11;
               if ((var11 = (DefaultMutableTreeNode)var9.getChildAt(var10)).getUserObject() instanceof Class625 && ((FriendBean)((Class625)var11.getUserObject()).g()).getFid() == var1) {
                  if (var8 == (2 ^ 3) && var5 != null && var3.c()) {
                     var11.setUserObject(var5);
                     break label80;
                  }

                  if (var8 != (2 ^ 3) && var5 != null && var8 == var4) {
                     var11.setUserObject(var5);
                     break label80;
                  }

                  var9.remove(var10);
                  break label80;
               }

               ++var10;
            }

            if (var5 != null && (var8 == --1 && var3.c() || var8 != 0 && var8 == var4)) {
               var9.add(new DefaultMutableTreeNode(var5));
            }
         }

         ++var8;
      }

   }

   public void afb(List<FriendBean> var1, boolean var2) {
      synchronized(this) {
         DefaultMutableTreeNode var4;
         int var5 = (var4 = this.n.aqa()).getChildCount();

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var5; var10000 = var3) {
            DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var4.getChildAt(var3);
            ++var3;
            var10.removeAllChildren();
         }

         Iterator var7;
         for(Iterator var11 = var7 = var1.iterator(); var11.hasNext(); var11 = var7) {
            FriendBean var9 = (FriendBean)var7.next();
            this.afa((var9 = this.vd().bh(var9)).getFid(), var9);
         }

         this.d();
         if (var2) {
            this.om = System.currentTimeMillis();
            this.ve().a(this.ae());
         }

         this.n.q();
      }
   }

   public void afc(FriendBean var1) {
      synchronized(this) {
         this.afa((var1 = this.vd().bh(var1)).getFid(), var1);
         this.d();
         this.n.q();
      }
   }

   public Class637(GameView var1) {
      int var10001 = --3;
      int var10008 = -4 >> 2;
      super(--4, 5 >> 1, Class345.aef, var1);
      this.va(var10008, 3 & 4, 18869 & 14058, 11760 & 21503, Class345.aei);
      this.uv(Class511.q("sc/d/23.png", 78 & 117, 78 & 117, 78 & 117, 78 & 117, (boolean)(3 ^ 3)), (String)null);
      this.aea = new Class658("sc/e/16.png", --1, this.ae(), this);
      this.aea.setBounds(6591 & 26319, 89 & 47, 78 & 61, 79 & 59);
      this.add(this.aea);
      Class464[] var6 = new Class464[var10001];
      boolean var10003 = true;
      this.anc = var6;

      int var10000;
      int var3;
      for(var10000 = var3 = 3 ^ 3; var10000 < this.anc.length; var10000 = var3) {
         this.anc[var3] = new Class464("sc/e/" + ((95 & 49) + var3) + ".png", --1, 5 >> 3, this);
         Class637 var5;
         if (var3 == 0) {
            var5 = this;
            this.anc[var3].setBounds(--4, 61 & 95, 53 & 127, 61 & 91);
         } else if (var3 == (4 ^ 5)) {
            var5 = this;
            this.anc[var3].setBounds(--5 + (63 & 118) * var3, 127 & 34, 125 & 54, 29 & 119);
         } else {
            if (var3 == 5 >> 1) {
               this.anc[var3].setBounds(--5 + (119 & 62) * var3, 34, 41, 21);
            }

            var5 = this;
         }

         var5.add(this.anc[var3++]);
      }

      var6 = new Class464[--5];
      var10003 = true;
      this.s = var6;

      for(var10000 = var3 = 3 & 4; var10000 < this.s.length; var10000 = var3) {
         this.s[var3] = new Class464("sc/e/" + (20 + var3) + ".png", 5 >> 2, (5 >> 2) + var3, this);
         this.s[var3].setBounds(8 + 31 * var3, 472, 20, 17);
         this.add(this.s[var3++]);
      }

      this.n = new Class512(this, 30);
      this.n.ak((boolean)(3 & 5));
      this.n.setBounds(--5, 58, 150, 400);
      this.add(this.n);
      this.n.aqa().removeAllChildren();
      FriendBean var4 = new FriendBean();
      var4.setRoleName("大话精灵");
      var4.setSpeciesId(999999);
      var4 = this.vd().bh(var4);
      Class625 var2;
      Class625 var10011 = var2 = new Class625(var4.getRoleName(), var4);
      var10011.k(Class681.i(5 >> 3));
      var10011.f(Class681.cw);
      var10011.a(new Class530(Class511.a(Class222.l("s" + var4.getSpeciesId())), 28, 28, --2, --2));
      this.n.aqa().add(new DefaultMutableTreeNode(var2));
      this.n.aqa().add(new DefaultMutableTreeNode("在线好友[0]"));
      this.n.aqa().add(new DefaultMutableTreeNode("我的好友[0/0]"));
      this.n.aqa().add(new DefaultMutableTreeNode("师徒关系[0]"));
      this.n.aqa().add(new DefaultMutableTreeNode("结伴江湖[0]"));
      this.n.aqa().add(new DefaultMutableTreeNode("跨服好友[0]"));
      this.n.aqa().add(new DefaultMutableTreeNode("移民好友[0]"));
      this.n.aqa().add(new DefaultMutableTreeNode("临时好友[0]"));
      this.n.aqa().add(new DefaultMutableTreeNode("黑名单[0]"));
      this.n.q();
   }

   public void afd(FriendBean var1, int var2) {
      if (var1 != null) {
         if (var2 == --1) {
            ((Class494)this.aej.getFormManagement().e(125 & 58)).afc(this.vd().getFriend(var1.getFid()));
         } else {
            if (var2 == --3) {
               ((Class304)this.aej.getFormManagement().e(125 & 78)).afc(this.vd().getFriend(var1.getFid()));
            }

         }
      }
   }

   public boolean bl() {
      if (System.currentTimeMillis() - this.om < (long)Class280.t) {
         return (boolean)(3 ^ 3);
      } else {
         this.om = System.currentTimeMillis() - (long)Class280.t + (long)(Class280.i * --5);
         String var1 = Agreement.getSendTextAES("friend", String.valueOf(this.vd().getRoleId()));
         this.uw().d(var1);
         return (boolean)(2 ^ 3);
      }
   }
}
