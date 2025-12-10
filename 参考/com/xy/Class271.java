package com.xy;

import com.xy.battle.BattleConnection;
import com.xy.battle.BattleScene;
import com.xy.formula.Ql;
import com.xy.richtext.RichLabel;
import com.xy.text.GameEDTRunnable;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Class271 {
   private static LinkedList<BattleScene> a = new LinkedList();
   private static ConcurrentHashMap<Integer, Class603> b = new ConcurrentHashMap();
   private static Class370<GameEDTRunnable> c = new Class370();
   private static BattleScene d;
   private static long e = 844424930131968L;
   private static Class370<Map<String, Double>> f = new Class370();
   private static long g = 562949953421312L;
   private static long h = 281474976710656L;
   private static Class370<RichLabel> i = new Class370();
   private static Class370<Ql> j = new Class370();

   public static BattleScene a(long var0) {
      if (var0 == 0L) {
         return null;
      } else {
         Iterator var3;
         for(Iterator var10000 = var3 = a.iterator(); var10000.hasNext(); var10000 = var3) {
            BattleScene var2;
            if ((var2 = (BattleScene)var3.next()).getBattleId() == var0) {
               return var2;
            }
         }

         return null;
      }
   }

   public static void b(RichLabel var0) {
      if (var0 != null) {
         var0.clear();
         i.a(var0);
      }
   }

   public static Class603 c(int var0) {
      return (Class603)b.get(var0);
   }

   public static void d(Map<String, Double> var0) {
      var0.clear();
      f.a(var0);
   }

   public static Map<String, Double> e() {
      Map var0;
      return (Map)((var0 = (Map)f.b()) != null ? var0 : new HashMap());
   }

   public static void f(GameEDTRunnable var0) {
      var0.c();
      c.a(var0);
   }

   public static Class603 g(int var0, String var1, int var2) {
      synchronized(b) {
         Class603 var4;
         if ((var4 = c(var0)) != null) {
            return var4;
         } else {
            b.put(var0, var4 = new Class603(var0, var1, var2));
            return var4;
         }
      }
   }

   public static LinkedList<BattleScene> h() {
      return a;
   }

   public static Ql i() {
      Ql var0;
      return (var0 = (Ql)j.b()) != null ? var0 : new Ql();
   }

   public static BattleScene j(BattleConnection var0) {
      synchronized(a) {
         BattleScene var2 = d;
         d = null;
         if (var2 == null) {
            var2 = new BattleScene();
         }

         var2.ac(var0);
         a.add(var2);
         return var2;
      }
   }

   public static GameEDTRunnable k() {
      GameEDTRunnable var0;
      if ((var0 = (GameEDTRunnable)c.b()) == null) {
         var0 = new GameEDTRunnable();
      }

      return var0;
   }

   public static RichLabel l(String var0, Font var1, int var2) {
      RichLabel var3;
      if ((var3 = (RichLabel)i.b()) == null) {
         return var2 == 0 ? new RichLabel(var0, var1) : new RichLabel(var0, var1, var2);
      } else {
         var3.setFont(var1);
         if (var2 == 0) {
            var3.setText(var0);
            return var3;
         } else {
            var3.setTextSize(var0, var2);
            return var3;
         }
      }
   }

   public static void m(Ql var0) {
      var0.d();
      j.a(var0);
   }
}
