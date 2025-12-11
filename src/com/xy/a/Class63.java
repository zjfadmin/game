package com.xy.a;

import com.xy.bean.RoleSystem;
import com.xy.game.RoleData;
import com.xy.socket.Agreement;
import com.xy.text.GameMain;
import com.xy.text.GameView;

public class Class63 extends com.xy.q.Class30 {
   private com.xy.i.Class18 md;
   private com.xy.i.Class18 ce;
   private Class119[] abc;

   public void f() {
      long var1 = Class119.ajs(this.abc[0]).il()
         | Class119.ajs(this.abc[1]).il() << 4
         | Class119.ajt(this.abc[2]) << 8
         | Class119.ajt(this.abc[3]) << 9
         | Class119.ajt(this.abc[10]) << 10
         | Class119.ajt(this.abc[11]) << 11
         | Class119.ajt(this.abc[12]) << 14;
      if (this.za().l(2, 12)) {
         var1 |= Class119.ajt(this.abc[13]) << 16;
      }

      if (this.afx.systemData.setSystemValue(var1)) {
         this.afx.screenData.a(this.afx.systemData.getShowView());
         this.afx.gameFrame.t();
      }

      GameMain.gameRunnable.setFPS(this.afx.systemData.getFPS());
      this.afx.l();
      RoleSystem var4 = this.yx().getRoleSystem();
      boolean var5 = false;
      if (!com.xy.v.Class12.z(var4.getIsPk(), Class119.ajt(this.abc[4]))) {
         var4.setIsPk(Class119.ajt(this.abc[4]));
         var5 = true;
      }

      if (!com.xy.v.Class12.z(var4.getIsNews(), Class119.ajt(this.abc[5]))) {
         var4.setIsNews(Class119.ajt(this.abc[5]));
         var5 = true;
      }

      if (!com.xy.v.Class12.z(var4.getIsMail(), Class119.ajt(this.abc[6]))) {
         var4.setIsMail(Class119.ajt(this.abc[6]));
         var5 = true;
      }

      if (!com.xy.v.Class12.z(var4.getIsFriend(), Class119.ajt(this.abc[7]))) {
         var4.setIsFriend(Class119.ajt(this.abc[7]));
         var5 = true;
      }

      if (!com.xy.v.Class12.z(var4.getIsGood(), Class119.ajt(this.abc[8]))) {
         var4.setIsGood(Class119.ajt(this.abc[8]));
         var5 = true;
      }

      if (!com.xy.v.Class12.z(var4.getIsTeam(), Class119.ajt(this.abc[9]))) {
         var4.setIsTeam(Class119.ajt(this.abc[9]));
         var5 = true;
      }

      if (var5) {
         String var6 = Agreement.getSendTextAES("roleSystem", com.xy.v.Class31.a().toJson(var4));
         this.za().k(var6);
      }
   }

   public void h() {
      RoleData var1;
      if ((var1 = this.yx()) != null) {
         this.abc[0].cc(0, this.afx.systemData.getShowView());
         this.abc[1].cc(1, this.afx.systemData.getFPSMax());
         this.abc[2].cc(2, this.afx.systemData.a() ? 1 : 0);
         this.abc[3].cc(3, this.afx.systemData.g() ? 1 : 0);
         this.abc[4].cc(4, var1.getRoleSystem().getIsPk() == 1 ? 1 : 0);
         this.abc[5].cc(5, var1.getRoleSystem().getIsNews() == 1 ? 1 : 0);
         this.abc[6].cc(6, var1.getRoleSystem().getIsMail() == 1 ? 1 : 0);
         this.abc[7].cc(7, var1.getRoleSystem().getIsFriend() == 1 ? 1 : 0);
         this.abc[8].cc(8, var1.getRoleSystem().getIsGood() == 1 ? 1 : 0);
         this.abc[9].cc(9, var1.getRoleSystem().getIsTeam() == 1 ? 1 : 0);
         this.abc[10].cc(10, this.afx.systemData.e() ? 1 : 0);
         this.abc[11].cc(11, this.afx.systemData.c() ? 1 : 0);
         this.abc[12].cc(12, this.afx.systemData.k() ? 1 : 0);
         if (this.za().l(2, 12)) {
            this.abc[13].cc(13, this.afx.systemData.f() ? 1 : 0);
         }
      }
   }

   @Override
   public void l() {
      if (this.yx() != null) {
         this.h();
         super.l();
      }
   }

   public Class63(GameView var1) {
      super(50, 2, com.xy.q.Class30.afz, var1);
      String var10008 = "07l0lem$-3";
      this.yy(-1, 0, 552, 334, com.xy.q.Class30.agf);
      com.xy.w.Class9 var4 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10009 = "湑戵诗罔";
      this.yu(var4, "游戏设置");
      String var10010 = "' {&{qbm$-3";
      String var10015 = "侴孢诗罔";
      this.md = new com.xy.i.Class18("sc/e/26.png", 1, 113, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "保存设置", this);
      var10009 = "' {&{qbm$-3";
      String var10014 = "適净湑戵";
      this.ce = new com.xy.i.Class18("sc/e/26.png", 1, 114, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "退出游戏", this);
      this.md.setBounds(99, 280, 99, 25);
      this.ce.setBounds(368, 280, 99, 25);
      this.add(this.md);
      this.add(this.ce);
      this.abc = new Class119[this.za().l(2, 12) ? 14 : 13];

      int var2;
      for (int var10000 = var2 = 0; var10000 < this.abc.length; var10000 = var2) {
         this.abc[var2] = new Class119(this, var2, this);
         this.abc[var2].cc(var2++, 0);
      }
   }
}
