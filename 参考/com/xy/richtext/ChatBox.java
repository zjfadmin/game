package com.xy.richtext;

import com.xy.W;
import com.xy.bS;
import com.xy.dG;
import com.xy.dJ;
import com.xy.hd;
import com.xy.lz;
import com.xy.text.GameView;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class ChatBox {
   private long fileBattleIndex;
   public static Map<Long, ChatFileRandom> chatFileMap = new HashMap();
   private int pointH1;
   private LinkedList<ChatBox.ChatRichLabel> listCache;
   private boolean load1;
   private int newH2;
   private boolean loadCache;
   private long fileIndex;
   private static int CHATMAX_FILE = 30 & 127;
   private GameView gameView;
   private int pointH;
   private int newH1;
   private int width;
   private int maxH2;
   private LinkedList<ChatBox.ChatRichLabel> list2;
   private static int CHATMAX = 1768 & 31159;
   private int pointH2;
   private static Map<String, ChatBox.TextList> textMapCache = new HashMap();
   private boolean load2;
   private Map<Integer, TextListFile> fileMap;
   private int maxH;
   private int maxH1;
   private LinkedList<ChatBox.ChatRichLabel> list1;

   public static void removeTextList(RichLabel var0) {
      if (var0 != null) {
         synchronized(textMapCache) {
            ChatBox.TextList var2;
            if ((var2 = (ChatBox.TextList)textMapCache.get(var0.getText())) != null) {
               var2.use -= 5 >> 2;
               if (var2.use <= 0) {
                  textMapCache.remove(var0.getText());
               }

            }
         }
      }
   }

   public void addChat(int var1, String var2) {
      if (!hd.o(var2)) {
         ChatBox.ChatRichLabel var3 = new ChatBox.ChatRichLabel();
         var3.id = var1;
         var3.text = var2;
         int var10001;
         synchronized(this) {
            if (this.listCache.size() >= CHATMAX) {
               this.loadChatByGroup();
            }

            var10001 = 5 >> 2;
            this.listCache.addLast(var3);
            this.loadCache = (boolean)var10001;
         }

         if (this.gameView.getClient().gameText) {
            String var10002;
            if (var1 == (79 & 59)) {
               var10001 = --3;
               var10002 = var2;
            } else if (var1 == (11 & 126)) {
               var10001 = 39 & 95;
               var10002 = var2;
            } else if (var1 == (95 & 39)) {
               var10001 = --5;
               var10002 = var2;
            } else {
               var10001 = var1;
               var10002 = var2;
            }

            this.addTextListFile(var10001, var10002);
         }

      }
   }

   public TextListFile getTextListFile(int var1) {
      return (TextListFile)this.fileMap.get(var1);
   }

   public void paint(Graphics var1, int var2, int var3, int var4, int var5) {
      if (this.loadCache) {
         this.loadChat();
      }

      Graphics var10000 = var1;
      var1 = var1.create(--5, var2, this.width, var4);
      int var10001 = --5;
      this.paint(var1, this.pointH1, var4, this.maxH1, this.newH1, this.list1);
      var1.dispose();
      var1 = var10000.create(var10001, var3, this.width, var5);
      this.paint(var1, this.pointH2, var5, this.maxH2, this.newH2, this.list2);
      var1.dispose();
   }


   private InputBean isMonitor(int var1, int var2, int var3, int var4, int var5, int var6, LinkedList<ChatBox.ChatRichLabel> var7) {
      if (var3 == -4 >> 2) {
         var3 = Math.min(Math.max(var4 - var6, 3 ^ 3), var5);
      }

      var3 -= var5;
      var4 = 3 ^ 3;

      ChatBox.ChatRichLabel var8;
      Iterator var9;
      for(Iterator var10000 = var9 = var7.iterator(); var10000.hasNext() && (var8 = (ChatBox.ChatRichLabel)var9.next()).richLabel != null; var10000 = var9) {
         var4 = var8.richLabel.getHeight();
         if ((var3 += var4) >= 0 && var3 >= var2) {
            return var8.richLabel.isMonitor(var1, var2 - (var3 - var4));
         }

         if (var3 > var5) {
            break;
         }
      }

      return null;
   }


   private int loadChat(int var1, LinkedList<ChatBox.ChatRichLabel> var2) {
      int var5 = 3 >> 2;
      int var4 = 2 & 5;

      try {
         Iterator var6;
         for(Iterator var8 = var6 = var2.iterator(); var8.hasNext(); var8 = var6) {
            ++var4;
            ChatBox.ChatRichLabel var3 = (ChatBox.ChatRichLabel)var6.next();
            if (var3.width != var1 || var3.richLabel == null) {
               ChatBox.ChatRichLabel var9;
               if (var3.richLabel != null) {
                  var3.richLabel.setTextSize(var3.text, var1);
                  var9 = var3;
               } else {
                  var3.richLabel = getTextList(var3.text, lz.q, var1);
                  var9 = var3;
               }

               var9.width = var1;
            }

            if (var4 != var2.size()) {
               var5 += var3.richLabel.getHeight();
            }
         }

         return var5;
      } catch (Exception var7) {
         int var10000 = 3 & 4;
         var2.clear();
         return var10000;
      }
   }

   public void setWidth(int var1) {
      var1 -= 10;
      if (this.width != var1) {
         synchronized(this) {
            if (this.width != var1) {
               int var10001 = --1;
               int var10003 = --1;
               int var10005 = 5 >> 2;
               this.width = var1;
               this.load1 = (boolean)var10005;
               this.load2 = (boolean)var10003;
               this.loadCache = (boolean)var10001;
            }
         }
      }
   }

   public static RichLabel getTextList(String var0, Font var1, int var2) {
      ChatBox.TextList var3 = null;
      synchronized(textMapCache) {
         if ((var3 = (ChatBox.TextList)textMapCache.get(var0)) == null) {
            textMapCache.put(var0, var3 = RichLabel.getTextList(var0));
         }

         var3.use += --1;
      }

      return new RichLabel(var0, var3.list, var3.isInteractive, var1, var2);
   }


   private void loadChat() {
      synchronized(this) {
         this.loadChatByGroup();
         int var2 = this.maxH1;
         int var3 = this.maxH2;
         if (this.load1) {
            var2 = this.loadChat(this.width, this.list1);
            this.newH1 = this.list1.size() > 0 ? ((ChatBox.ChatRichLabel)this.list1.getLast()).richLabel.getHeight() : 0;
            if (this.pointH1 == 0) {
               this.pointH1 = -4 >> 2;
            }

            this.load1 = (boolean)(5 >> 3);
         }

         if (this.load2) {
            var3 = this.loadChat(this.width, this.list2);
            this.newH2 = this.list2.size() > 0 ? ((ChatBox.ChatRichLabel)this.list2.getLast()).richLabel.getHeight() : 0;
            if (this.pointH2 == 0) {
               this.pointH2 = -4 >> 2;
            }

            this.load2 = (boolean)(3 & 4);
         }

         this.maxH1 = var2;
         this.maxH2 = var3;
         this.maxH = this.maxH1 + this.maxH2;
         if (this.pointH == 0) {
            this.pointH = -4 >> 2;
         }

         if (this.pointH1 > this.maxH1) {
            this.pointH1 = this.maxH1;
         }

         if (this.pointH2 > this.maxH2) {
            this.pointH2 = this.maxH2;
         }

         if (this.pointH > this.maxH) {
            this.pointH = this.maxH;
         }

      }
   }

   public static ChatFileRandom getChatFileRandom(int var0, long var1, boolean var3) {
      String var4 = "sc/msg/" + W.j(var1 + (var0 == (39 & 95) ? ":battle" : ":chat")) + ".txt";
      synchronized(chatFileMap) {
         ChatFileRandom var10000;
         ChatFileRandom var6;
         if ((var6 = (ChatFileRandom)chatFileMap.get(var1)) == null) {
            chatFileMap.put(var1, var6 = new ChatFileRandom(var4, var3));
            var10000 = var6;
         } else {
            var10000 = var6;
            var6.setFileNew(var3);
         }

         return var10000;
      }
   }


   private static void removeTextList(ChatBox.ChatRichLabel var0) {
      if (var0 != null && var0.richLabel != null) {
         removeTextList(var0.richLabel);
      }
   }


   private static long saveTextList(long var0, long var2, TextListFile var4) {
      TextListFile var6 = var4;

      try {
         StringBuffer var5 = new StringBuffer();
         Iterator var7;
         Iterator var10000 = var7 = var6.fileList.iterator();

         while(var10000.hasNext()) {
            String var10 = (String)var7.next();
            var10000 = var7;
            var5.append(var10);
            var5.append("\n");
         }

         var6.fileList.clear();
         byte[] var11 = bS.b(var5.toString().getBytes(dG.e));
         ChatFileRandom var12;
         synchronized(var12 = getChatFileRandom(var6.id, var2, (boolean)(var0 == 0L ? 3 & 5 : 0))) {
            var12.use = 3 & 4;
            var12.randomFile.seek(var0);
            var12.randomFile.write(var11);
         }

         var6.points.add(new dJ(var0, (long)var11.length));
         return var0 + (long)var11.length;
      } catch (Exception var9) {
         var9.printStackTrace();
         return var0;
      }
   }

   public void addTextListFile(int var1, String var2) {
      Map var4;
      synchronized(var4 = this.fileMap) {
         TextListFile var3;
         if ((var3 = (TextListFile)this.fileMap.get(var1)) == null) {
            this.fileMap.put(var1, var3 = new TextListFile(var1));
         }

         Map var10000;
         label24: {
            var3.fileList.add(var2);
            if (var3.fileList.size() >= CHATMAX_FILE) {
               if (var1 == (55 & 79)) {
                  var10000 = var4;
                  this.fileBattleIndex = saveTextList(this.fileBattleIndex, this.gameView.getClient().getRoleId(), var3);
                  break label24;
               }

               this.fileIndex = saveTextList(this.fileIndex, this.gameView.getClient().getRoleId(), var3);
            }

            var10000 = var4;
         }

      }
   }

   public void clearTextListFile(int var1) {
      synchronized(this.fileMap) {
         TextListFile var3;
         if ((var3 = (TextListFile)this.fileMap.get(var1)) != null) {
            if (var1 == (7 & 127)) {
               this.fileBattleIndex = 0L;
            }

            var3.points.clear();
            var3.fileList.clear();
         }
      }
   }


   private void paint(Graphics var1, int var2, int var3, int var4, int var5, LinkedList<ChatBox.ChatRichLabel> var6) {
      if (var2 == -4 >> 2) {
         var2 = Math.min(Math.max(var3 - var5, 3 & 4), var4);
      }

      var2 -= var4;
      var3 = 2 & 5;
      var1.translate(3 & 4, var2);

      Iterator var8;
      for(Iterator var10000 = var8 = var6.iterator(); var10000.hasNext(); var10000 = var8) {
         ChatBox.ChatRichLabel var7;
         if ((var7 = (ChatBox.ChatRichLabel)var8.next()).richLabel == null) {
            return;
         }

         var1.translate(3 >> 2, var3);
         var3 = var7.richLabel.getHeight();
         if ((var2 += var3) >= 0) {
            var7.richLabel.paint(var1);
         }

         if (var2 > var4) {
            return;
         }
      }

   }

   public static void ResetAndRemove() {
      try {
         Iterator var0;
         for(Iterator var10000 = var0 = chatFileMap.keySet().iterator(); var10000.hasNext(); var10000 = var0) {
            long var1 = (Long)var0.next();
            ChatFileRandom var4;
            if ((var4 = (ChatFileRandom)chatFileMap.get(var1)) == null || var4.isEnd()) {
               var0.remove();
            }
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public ChatBox(int var1, GameView var2) {
      int var10006 = -4 >> 2;
      int var10008 = -4 >> 2;
      int var10010 = -4 >> 2;
      super();
      this.gameView = var2;
      this.pointH = var10010;
      this.pointH1 = var10008;
      this.pointH2 = var10006;
      this.listCache = new LinkedList();
      this.list1 = new LinkedList();
      this.list2 = new LinkedList();
      this.fileMap = new HashMap();
      this.setWidth(var1);
   }


   private void loadChatByGroup() {
      Iterator var2;
      Iterator var10000 = var2 = this.listCache.iterator();

      while(true) {
         int var10001;
         while(var10000.hasNext()) {
            ChatBox.ChatRichLabel var1;
            if ((var1 = (ChatBox.ChatRichLabel)var2.next()).id != --5 && var1.id != (63 & 71)) {
               int var3;
               ChatBox var4;
               if ((var3 = var1.id) == --2) {
                  var3 = --3;
                  var4 = this;
               } else if (var3 == --3) {
                  var3 = --2;
                  var4 = this;
               } else if (var3 == (110 & 23)) {
                  var3 = --5;
                  var4 = this;
               } else if (var3 == (46 & 91)) {
                  var3 = --4;
                  var4 = this;
               } else {
                  if (var3 == (123 & 15)) {
                     var3 = --3;
                  }

                  var4 = this;
               }

               if ((var4.gameView.systemData.chatUp >> var3 & 1L) == 1L) {
                  if (this.list1.size() > CHATMAX) {
                     removeTextList((ChatBox.ChatRichLabel)this.list1.removeFirst());
                  }

                  var10001 = 3 & 5;
                  this.list1.addLast(var1);
                  this.load1 = (boolean)var10001;
               }

               if ((this.gameView.systemData.chatDown >> var3 & 1L) == 1L) {
                  if (this.list2.size() > CHATMAX) {
                     removeTextList((ChatBox.ChatRichLabel)this.list2.removeFirst());
                  }

                  var10001 = 5 >> 2;
                  this.list2.addLast(var1);
                  this.load2 = (boolean)var10001;
               }

               var10000 = var2;
            } else {
               if (this.list1.size() > CHATMAX) {
                  removeTextList((ChatBox.ChatRichLabel)this.list1.removeFirst());
               }

               var10001 = 4 ^ 5;
               this.list1.addLast(var1);
               this.load1 = (boolean)var10001;
               var10000 = var2;
            }
         }

         var10001 = 3 & 4;
         this.listCache.clear();
         this.loadCache = (boolean)var10001;
         return;
      }
   }


   private int addChatPoint(int var1, int var2, int var3) {
      return Math.min(Math.max(var1 - var3, 2 & 5), var2);
   }

   public InputBean isMonitor(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= --5 && var1 <= this.width - --5) {
         if (var2 > var3 && var2 < var3 + var5) {
            if (this.load1 || this.load2) {
               this.loadChat();
            }

            return this.isMonitor(var1, var2 - var3, this.pointH1, var5, this.maxH1, this.newH1, this.list1);
         } else if (var2 > var4 && var2 < var4 + var6) {
            if (this.load1 || this.load2) {
               this.loadChat();
            }

            return this.isMonitor(var1, var2 - var4, this.pointH2, var6, this.maxH2, this.newH2, this.list2);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void addChat(int var1, int var2, int var3) {
      if (this.loadCache) {
         this.loadChat();
      }

      if (var1 == --1) {
         if (this.pointH1 == -4 >> 2 && var3 > 0) {
            this.pointH1 = this.addChatPoint(var3, this.maxH1, this.newH1);
         }

         this.pointH1 = Math.max(Math.min(this.pointH1 + var2, this.maxH1), 3 >> 2);
      } else if (var1 == --2) {
         if (this.pointH2 == -4 >> 2 && var3 > 0) {
            this.pointH2 = this.addChatPoint(var3, this.maxH2, this.newH2);
         }

         this.pointH2 = Math.max(Math.min(this.pointH2 + var2, this.maxH2), 2 & 5);
      } else {
         if (var1 == 0) {
            if (this.pointH == -4 >> 2 && var3 > 0) {
               this.pointH = this.addChatPoint(var3, this.maxH, this.newH1 + this.newH2);
            }

            this.pointH = Math.max(Math.min(this.pointH + var2, this.maxH), 5 >> 3);
         }

      }
   }

   class ChatRichLabel {
      private int id;
      private int width;
      private RichLabel richLabel;
      private String text;
   }

   static class TextList {
      public boolean isInteractive;
      public int use;
      public ArrayList<Object> list;

      public TextList() {
      }
   }
}
