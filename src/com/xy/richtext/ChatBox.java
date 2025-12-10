/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.ChatBox$ChatRichLabel
 *  com.xy.richtext.ChatBox$TextList
 *  com.xy.richtext.ChatFileRandom
 *  com.xy.richtext.InputBean
 *  com.xy.richtext.RichLabel
 *  com.xy.richtext.TextListFile
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiIIIiiiiiiIi
 *  com.xy.v.IiiIIiiiiIiii
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iiIIiiiiIiiII
 */
package com.xy.richtext;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.ChatBox;
import com.xy.richtext.ChatFileRandom;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.richtext.TextListFile;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiIIIiiiiiiIi;
import com.xy.v.IiiIIiiiiIiii;
import com.xy.v.IiiiIiiiiIiIi;
import java.awt.Font;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/*
 * Exception performing whole class analysis ignored.
 */
public class ChatBox {
    private int maxH;
    private LinkedList<ChatRichLabel> list2;
    private boolean load1;
    private long fileBattleIndex;
    private static int CHATMAX_FILE;
    private int pointH2;
    private LinkedList<ChatRichLabel> list1;
    private int width;
    private long fileIndex;
    private int newH2;
    private LinkedList<ChatRichLabel> listCache;
    private static Map<String, TextList> textMapCache;
    private int maxH1;
    public static Map<Long, ChatFileRandom> chatFileMap;
    private static int CHATMAX;
    private Map<Integer, TextListFile> fileMap;
    private boolean load2;
    private int maxH2;
    private int pointH1;
    private int pointH;
    private int newH1;
    private GameView gameView;
    private boolean loadCache;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void clearTextListFile(int id) {
        Map<Integer, TextListFile> map = this.fileMap;
        synchronized (map) {
            TextListFile IiiiiiiiIIIII = this.fileMap.get(id);
            if (IiiiiiiiIIIII == null) {
                return;
            }
            if (id == 7) {
                this.fileBattleIndex = 0L;
            }
            IiiiiiiiIIIII.points.clear();
            IiiiiiiiIIIII.fileList.clear();
            return;
        }
    }

    private /* synthetic */ int addChatPoint(int H, int maxH, int newH) {
        return Math.min(Math.max(H - newH, 0), maxH);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    private static /* synthetic */ long saveTextList(long fileIndex, long roleId, TextListFile textListFile) {
        try {
            IiiiiiiiIIIII = new StringBuffer();
            var7_5 = textListFile.fileList.iterator();
            if (true) ** GOTO lbl14
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return fileIndex;
        }
        do {
            IiiiiiiiIIIII = (String)var7_5.next();
            IiiiiiiiIIIII.append((String)IiiiiiiiIIIII);
            IiiiiiiiIIIII.append("\n");
lbl14:
            // 2 sources

        } while (var7_5.hasNext());
        textListFile.fileList.clear();
        IiiiiiiiIIIII = IiiIIiiiiIiii.iIiIiiiiIIiii((byte[])IiiiiiiiIIIII.toString().getBytes(IiIIIiiiiiiIi.iIiiIiiiiiiII));
        {
            var8_7 = IiiiiiiiIIIII = ChatBox.getChatFileRandom(textListFile.id, roleId, fileIndex == 0L);
            synchronized (var8_7) {
                IiiiiiiiIIIII.use = 0;
                IiiiiiiiIIIII.randomFile.seek(fileIndex);
                IiiiiiiiIIIII.randomFile.write((byte[])IiiiiiiiIIIII);
                // MONITOREXIT @DISABLED, blocks:[2, 3, 5] lbl23 : MonitorExitStatement: MONITOREXIT : var8_7
                v0 = textListFile;
            }
        }
        {
            v0.points.add(new com.xy.v.iiIIiiiiIiiII(fileIndex, (long)((Object)IiiiiiiiIIIII).length));
            return fileIndex + (long)((Object)IiiiiiiiIIIII).length;
        }
    }

    public ChatBox(int width, GameView gameView) {
        this.gameView = gameView;
        this.pointH = -1;
        this.pointH1 = -1;
        this.pointH2 = -1;
        this.listCache = new LinkedList();
        this.list1 = new LinkedList();
        this.list2 = new LinkedList();
        this.fileMap = new HashMap<Integer, TextListFile>();
        this.setWidth(width);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addChat(int id, String text) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)text)) {
            return;
        }
        ChatRichLabel IiiiiiiiIIIII = new ChatRichLabel(this);
        ChatRichLabel.access$1((ChatRichLabel)IiiiiiiiIIIII, (int)id);
        ChatRichLabel.access$2((ChatRichLabel)IiiiiiiiIIIII, (String)text);
        ChatBox chatBox = this;
        synchronized (chatBox) {
            if (this.listCache.size() >= CHATMAX) {
                this.loadChatByGroup();
            }
            this.listCache.addLast(IiiiiiiiIIIII);
            this.loadCache = true;
        }
        if (!this.gameView.getClient().gameText) return;
        this.addTextListFile(id == 11 ? 3 : (id == 10 ? 7 : (id == 7 ? 5 : id)), text);
    }

    /*
     * Unable to fully structure code
     */
    public static void ResetAndRemove() {
        try {
            IiiiiiiiIIIII = ChatBox.chatFileMap.keySet().iterator();
            if (true) ** GOTO lbl10
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
        do {
            if ((IiiiiiiiIIIII = ChatBox.chatFileMap.get(IiiiiiiiIIIII = IiiiiiiiIIIII.next().longValue())) != null && !IiiiiiiiIIIII.isEnd()) continue;
            IiiiiiiiIIIII.remove();
lbl10:
            // 3 sources

        } while (IiiiiiiiIIIII.hasNext());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static RichLabel getTextList(String text, Font font, int size) {
        TextList IiiiiiiiIIIII = null;
        Map<String, TextList> map = textMapCache;
        synchronized (map) {
            IiiiiiiiIIIII = textMapCache.get(text);
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = RichLabel.getTextList((String)text);
                textMapCache.put(text, IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII.use;
        }
        return new RichLabel(text, IiiiiiiiIIIII.list, IiiiiiiiIIIII.isInteractive, font, size);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public static ChatFileRandom getChatFileRandom(int id, long roleId, boolean fileNew) {
        String IiiiiiiiIIIII = "sc/msg/" + IiiiIiiiiIiIi.ALLATORIxDEMO((String)(String.valueOf(roleId) + (id == 7 ? ":battle" : ":chat"))) + ".txt";
        Map<Long, ChatFileRandom> map = chatFileMap;
        synchronized (map) {
            ChatFileRandom IiiiiiiiIIIII2 = chatFileMap.get(roleId);
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII2 = new ChatFileRandom(IiiiiiiiIIIII, fileNew);
                chatFileMap.put(roleId, IiiiiiiiIIIII2);
            } else {
                IiiiiiiiIIIII2.setFileNew(fileNew);
            }
            return IiiiiiiiIIIII2;
        }
    }

    private static /* synthetic */ void removeTextList(ChatRichLabel chatRichLabel) {
        if (chatRichLabel == null) return;
        if (ChatRichLabel.access$0((ChatRichLabel)chatRichLabel) == null) {
            return;
        }
        ChatBox.removeTextList(ChatRichLabel.access$0((ChatRichLabel)chatRichLabel));
    }

    static {
        CHATMAX = 160;
        CHATMAX_FILE = 30;
        textMapCache = new HashMap<String, TextList>();
        chatFileMap = new HashMap<Long, ChatFileRandom>();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void addTextListFile(int id, String text) {
        Map<Integer, TextListFile> map = this.fileMap;
        synchronized (map) {
            TextListFile IiiiiiiiIIIII = this.fileMap.get(id);
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new TextListFile(id);
                this.fileMap.put(id, IiiiiiiiIIIII);
            }
            IiiiiiiiIIIII.fileList.add(text);
            if (IiiiiiiiIIIII.fileList.size() < CHATMAX_FILE) return;
            if (id == 7) {
                this.fileBattleIndex = ChatBox.saveTextList(this.fileBattleIndex, this.gameView.getClient().getRoleId(), IiiiiiiiIIIII);
            } else {
                this.fileIndex = ChatBox.saveTextList(this.fileIndex, this.gameView.getClient().getRoleId(), IiiiiiiiIIIII);
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    private /* synthetic */ void loadChat() {
        ChatBox chatBox = this;
        synchronized (chatBox) {
            this.loadChatByGroup();
            int IiiiiiiiIIIII = this.maxH1;
            int IiiiiiiiIIIII2 = this.maxH2;
            if (this.load1) {
                IiiiiiiiIIIII = this.loadChat(this.width, this.list1);
                int n = this.newH1 = this.list1.size() > 0 ? ChatRichLabel.access$0((ChatRichLabel)this.list1.getLast()).getHeight() : 0;
                if (this.pointH1 == 0) {
                    this.pointH1 = -1;
                }
                this.load1 = false;
            }
            if (this.load2) {
                IiiiiiiiIIIII2 = this.loadChat(this.width, this.list2);
                int n = this.newH2 = this.list2.size() > 0 ? ChatRichLabel.access$0((ChatRichLabel)this.list2.getLast()).getHeight() : 0;
                if (this.pointH2 == 0) {
                    this.pointH2 = -1;
                }
                this.load2 = false;
            }
            this.maxH1 = IiiiiiiiIIIII;
            this.maxH2 = IiiiiiiiIIIII2;
            this.maxH = this.maxH1 + this.maxH2;
            if (this.pointH == 0) {
                this.pointH = -1;
            }
            if (this.pointH1 > this.maxH1) {
                this.pointH1 = this.maxH1;
            }
            if (this.pointH2 > this.maxH2) {
                this.pointH2 = this.maxH2;
            }
            if (this.pointH <= this.maxH) return;
            this.pointH = this.maxH;
            return;
        }
    }

    public void addChat(int type, int h, int height) {
        if (this.loadCache) {
            this.loadChat();
        }
        if (type == 1) {
            if (this.pointH1 == -1 && height > 0) {
                this.pointH1 = this.addChatPoint(height, this.maxH1, this.newH1);
            }
            this.pointH1 = Math.max(Math.min(this.pointH1 + h, this.maxH1), 0);
            return;
        }
        if (type == 2) {
            if (this.pointH2 == -1 && height > 0) {
                this.pointH2 = this.addChatPoint(height, this.maxH2, this.newH2);
            }
            this.pointH2 = Math.max(Math.min(this.pointH2 + h, this.maxH2), 0);
            return;
        }
        if (type != 0) return;
        if (this.pointH == -1 && height > 0) {
            this.pointH = this.addChatPoint(height, this.maxH, this.newH1 + this.newH2);
        }
        this.pointH = Math.max(Math.min(this.pointH + h, this.maxH), 0);
    }

    private /* synthetic */ InputBean isMonitor(int x, int y, int indexH, int H, int maxH, int newH, LinkedList<ChatRichLabel> list) {
        if (indexH == -1) {
            indexH = Math.min(Math.max(H - newH, 0), maxH);
        }
        indexH -= maxH;
        int IiiiiiiiIIIII = 0;
        for (ChatRichLabel IiiiiiiiIIIII2 : list) {
            if (ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII2) == null) return null;
            IiiiiiiiIIIII = ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII2).getHeight();
            if ((indexH += IiiiiiiiIIIII) >= 0 && indexH >= y) {
                return ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII2).isMonitor(x, y - (indexH - IiiiiiiiIIIII));
            }
            if (indexH > maxH) return null;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void setWidth(int n) {
        if (this.width == (width -= 10)) {
            return;
        }
        ChatBox chatBox = this;
        synchronized (chatBox) {
            void width;
            if (this.width == width) {
                return;
            }
            this.width = width;
            this.load1 = true;
            this.load2 = true;
            this.loadCache = true;
            return;
        }
    }

    private /* synthetic */ void paint(Graphics g, int indexH, int H, int maxH, int newH, LinkedList<ChatRichLabel> list) {
        if (indexH == -1) {
            indexH = Math.min(Math.max(H - newH, 0), maxH);
        }
        int IiiiiiiiIIIII = 0;
        g.translate(0, indexH -= maxH);
        for (ChatRichLabel IiiiiiiiIIIII2 : list) {
            if (ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII2) == null) {
                return;
            }
            g.translate(0, IiiiiiiiIIIII);
            IiiiiiiiIIIII = ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII2).getHeight();
            if ((indexH += IiiiiiiiIIIII) >= 0) {
                ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII2).paint(g);
            }
            if (indexH <= maxH) continue;
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void removeTextList(RichLabel richLabel) {
        if (richLabel == null) {
            return;
        }
        Map<String, TextList> map = textMapCache;
        synchronized (map) {
            TextList IiiiiiiiIIIII = textMapCache.get(richLabel.getText());
            if (IiiiiiiiIIIII == null) {
                return;
            }
            --IiiiiiiiIIIII.use;
            if (IiiiiiiiIIIII.use > 0) return;
            textMapCache.remove(richLabel.getText());
            return;
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    private /* synthetic */ int loadChat(int width, LinkedList<ChatRichLabel> list) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        try {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ++IiiiiiiiIIIII2;
                ChatRichLabel IiiiiiiiIIIII3 = (ChatRichLabel)iterator.next();
                if (ChatRichLabel.access$4((ChatRichLabel)IiiiiiiiIIIII3) != width || ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII3) == null) {
                    if (ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII3) != null) {
                        ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII3).setTextSize(ChatRichLabel.access$5((ChatRichLabel)IiiiiiiiIIIII3), width);
                    } else {
                        ChatRichLabel.access$6((ChatRichLabel)IiiiiiiiIIIII3, (RichLabel)ChatBox.getTextList(ChatRichLabel.access$5((ChatRichLabel)IiiiiiiiIIIII3), iiIIiiiiIiiII.iIIIiiiiIIIii, width));
                    }
                    ChatRichLabel.access$7((ChatRichLabel)IiiiiiiiIIIII3, (int)width);
                }
                if (IiiiiiiiIIIII2 == list.size()) continue;
                IiiiiiiiIIIII += ChatRichLabel.access$0((ChatRichLabel)IiiiiiiiIIIII3).getHeight();
            }
            return IiiiiiiiIIIII;
        }
        catch (Exception IiiiiiiiIIIII4) {
            list.clear();
            return 0;
        }
    }

    public void paint(Graphics g, int y1, int y2, int h1, int h2) {
        Graphics IiiiiiiiIIIII;
        if (this.loadCache) {
            this.loadChat();
        }
        Graphics graphics = g.create(5, y1, this.width, h1);
        this.paint(IiiiiiiiIIIII, this.pointH1, h1, this.maxH1, this.newH1, this.list1);
        IiiiiiiiIIIII.dispose();
        IiiiiiiiIIIII = g.create(5, y2, this.width, h2);
        this.paint(IiiiiiiiIIIII, this.pointH2, h2, this.maxH2, this.newH2, this.list2);
        IiiiiiiiIIIII.dispose();
    }

    public InputBean isMonitor(int x, int y, int y1, int y2, int h1, int h2) {
        if (x < 5) return null;
        if (x > this.width - 5) {
            return null;
        }
        if (y > y1 && y < y1 + h1) {
            if (!this.load1) {
                if (!this.load2) return this.isMonitor(x, y - y1, this.pointH1, h1, this.maxH1, this.newH1, this.list1);
            }
            this.loadChat();
            return this.isMonitor(x, y - y1, this.pointH1, h1, this.maxH1, this.newH1, this.list1);
        }
        if (y <= y2) return null;
        if (y >= y2 + h2) return null;
        if (!this.load1) {
            if (!this.load2) return this.isMonitor(x, y - y2, this.pointH2, h2, this.maxH2, this.newH2, this.list2);
        }
        this.loadChat();
        return this.isMonitor(x, y - y2, this.pointH2, h2, this.maxH2, this.newH2, this.list2);
    }

    public TextListFile getTextListFile(int id) {
        return this.fileMap.get(id);
    }

    private /* synthetic */ void loadChatByGroup() {
        for (ChatRichLabel IiiiiiiiIIIII : this.listCache) {
            if (ChatRichLabel.access$3((ChatRichLabel)IiiiiiiiIIIII) == 5 || ChatRichLabel.access$3((ChatRichLabel)IiiiiiiiIIIII) == 7) {
                if (this.list1.size() > CHATMAX) {
                    ChatBox.removeTextList(this.list1.removeFirst());
                }
                this.list1.addLast(IiiiiiiiIIIII);
                this.load1 = true;
                continue;
            }
            int IiiiiiiiIIIII2 = ChatRichLabel.access$3((ChatRichLabel)IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2 == 2) {
                IiiiiiiiIIIII2 = 3;
            } else if (IiiiiiiiIIIII2 == 3) {
                IiiiiiiiIIIII2 = 2;
            } else if (IiiiiiiiIIIII2 == 6) {
                IiiiiiiiIIIII2 = 5;
            } else if (IiiiiiiiIIIII2 == 10) {
                IiiiiiiiIIIII2 = 4;
            } else if (IiiiiiiiIIIII2 == 11) {
                IiiiiiiiIIIII2 = 3;
            }
            if ((this.gameView.systemData.chatUp >> IiiiiiiiIIIII2 & 1L) == 1L) {
                if (this.list1.size() > CHATMAX) {
                    ChatBox.removeTextList(this.list1.removeFirst());
                }
                this.list1.addLast(IiiiiiiiIIIII);
                this.load1 = true;
            }
            if ((this.gameView.systemData.chatDown >> IiiiiiiiIIIII2 & 1L) != 1L) continue;
            if (this.list2.size() > CHATMAX) {
                ChatBox.removeTextList(this.list2.removeFirst());
            }
            this.list2.addLast(IiiiiiiiIIIII);
            this.load2 = true;
        }
        this.listCache.clear();
        this.loadCache = false;
    }
}
