/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClient
 *  com.xy.text.GameMain
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IiIIIiiiiiiIi
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.text;

import com.xy.socket.GameClient;
import com.xy.text.GameMain;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IiIIIiiiiiiIi;
import com.xy.v.IiiiIiiiiIiIi;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;

public class WatchServiceRunnable
implements Runnable {
    private WatchService watcher;
    static long sendVersionTime;
    static long sendShowLoginTime;
    private Path path = Paths.get("map/", new String[0]);
    private String historyText;

    public static boolean ALLATORIxDEMO(String v1, String v2) {
        if (v1 != null && v1.equals("")) {
            v1 = null;
        }
        if (v2 != null && v2.equals("")) {
            v2 = null;
        }
        if (v1 != null) {
            if (v2 != null) return v1.equals(v2);
        }
        if (v1 != null) return false;
        if (v2 != null) return false;
        return true;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    @Override
    public void run() {
        try {
            WatchKey IiiiiiiiIIIII;
            do {
                IiiiiiiiIIIII = this.watcher.take();
                for (WatchEvent<?> IiiiiiiiIIIII2 : IiiiiiiiIIIII.pollEvents()) {
                    if (IiiiiiiiIIIII2.kind() == StandardWatchEventKinds.OVERFLOW) continue;
                    Path IiiiiiiiIIIII3 = (Path)IiiiiiiiIIIII2.context();
                    try {
                        this.ALLATORIxDEMO(IiiiiiiiIIIII3.toString());
                    }
                    catch (Exception IiiiiiiiIIIII4) {
                        IiiiiiiiIIIII4.printStackTrace();
                    }
                }
            } while (IiiiiiiiIIIII.reset());
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public WatchServiceRunnable() throws IOException {
        this.watcher = FileSystems.getDefault().newWatchService();
        this.path.register(this.watcher, StandardWatchEventKinds.ENTRY_MODIFY);
    }

    public static synchronized void ALLATORIxDEMO(long handleId, int state) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("GAME|");
        IiiiiiiiIIIII.append(System.currentTimeMillis());
        IiiiiiiiIIIII.append("|");
        IiiiiiiiIIIII.append(handleId);
        IiiiiiiiIIIII.append("|");
        IiiiiiiiIIIII.append(state);
        IiiiIiiiiIiIi.iIiIiiiiIIiii((String)"map/game", (String)IiIIIiiiiiiIi.iIiIiiiiIIiii((String)IiiiiiiiIIIII.toString(), (String)GameMain.mac));
    }

    public static synchronized void iIiIiiiiIIiii(String[] areas) {
        if (System.currentTimeMillis() - sendVersionTime < 1000L) {
            return;
        }
        sendVersionTime = System.currentTimeMillis();
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("VERSION|");
        IiiiiiiiIIIII.append(System.currentTimeMillis());
        IiiiiiiiIIIII.append("|");
        IiiiiiiiIIIII.append(GameMain.VERSION);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < areas.length) {
            IiiiiiiiIIIII.append("|");
            IiiiiiiiIIIII.append(areas[IiiiiiiiIIIII2++]);
        }
        IiiiIiiiiIiIi.iIiIiiiiIIiii((String)"map/game", (String)IiIIIiiiiiiIi.iIiIiiiiIIiii((String)IiiiiiiiIIIII.toString(), (String)GameMain.mac));
    }

    public static synchronized void ALLATORIxDEMO(String[] v) {
        if (GameMain.frameList == null) {
            GameMain.frameList = new ArrayList();
        }
        long IiiiiiiiIIIII = Long.parseLong(v[0]);
        int IiiiiiiiIIIII2 = Integer.parseInt(v[1]);
        int IiiiiiiiIIIII3 = Integer.parseInt(v[2]);
        long IiiiiiiiIIIII4 = Long.parseLong(v[3]);
        String IiiiiiiiIIIII5 = v[4];
        String IiiiiiiiIIIII6 = v[5];
        String[] IiiiiiiiIIIII7 = GameMain.getAreas((int)IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII7 == null) {
            return;
        }
        if (GameMain.getGameNum() >= 20) {
            WatchServiceRunnable.ALLATORIxDEMO(IiiiiiiiIIIII, 2);
            return;
        }
        boolean IiiiiiiiIIIII8 = false;
        String IiiiiiiiIIIII9 = null;
        String IiiiiiiiIIIII10 = null;
        int IiiiiiiiIIIII11 = 0;
        int IiiiiiiiIIIII12 = 0;
        int IiiiiiiiIIIII13 = 0;
        while (IiiiiiiiIIIII13 < IiiiiiiiIIIII7.length) {
            int IiiiiiiiIIIII14 = IiiiiiiiIIIII7[IiiiiiiiIIIII13].indexOf("_");
            if (IiiiiiiiIIIII3 != Integer.parseInt(IiiiiiiiIIIII7[IiiiiiiiIIIII13].substring(0, IiiiiiiiIIIII14))) {
                ++IiiiiiiiIIIII13;
                continue;
            }
            String[] stringArray = IiiiiiiiIIIII7[IiiiiiiiIIIII13].split("_");
            IiiiiiiiIIIII9 = stringArray[4];
            IiiiiiiiIIIII10 = stringArray[1];
            IiiiiiiiIIIII11 = Integer.parseInt(stringArray[2]);
            IiiiiiiiIIIII12 = Integer.parseInt(stringArray[3]);
            IiiiiiiiIIIII8 = true;
            break;
        }
        if (!IiiiiiiiIIIII8) {
            return;
        }
        try {
            IiiiiiiiIIIII3 = Math.abs(IiiiiiiiIIIII3);
            IIiIiiiiIiIII.ALLATORIxDEMO((int)IiiiiiiiIIIII3, IiiiiiiiIIIII10, (int)IiiiiiiiIIIII12);
            if (GameMain.frameList.size() == 0) {
                GameMain.ALLATORIxDEMO();
            }
            GameClient IiiiiiiiIIIII15 = new GameClient(IiiiiiiiIIIII, IiiiiiiiIIIII3, IiiiiiiiIIIII9, IiiiiiiiIIIII10, IiiiiiiiIIIII11, IiiiiiiiIIIII12, IiiiiiiiIIIII4, IiiiiiiiIIIII5, IiiiiiiiIIIII6);
            IiiiiiiiIIIII15.iiiIiiiiiiIIi();
        }
        catch (Exception IiiiiiiiIIIII16) {
            IiiiiiiiIIIII16.printStackTrace();
            WatchServiceRunnable.ALLATORIxDEMO(IiiiiiiiIIIII, 1);
            return;
        }
        WatchServiceRunnable.ALLATORIxDEMO(IiiiiiiiIIIII, 0);
        try {
            Thread.sleep(800L);
            return;
        }
        catch (Exception IiiiiiiiIIIII17) {
            IiiiiiiiIIIII17.printStackTrace();
            return;
        }
    }

    public static void iIiIiiiiIIiii(String cmd) {
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public void ALLATORIxDEMO(String fileName) {
        if (!fileName.equals("login")) {
            return;
        }
        String IiiiiiiiIIIII = IiiiIiiiiIiIi.iIiIiiiiIIiii((String)("map/" + fileName));
        if (WatchServiceRunnable.ALLATORIxDEMO(this.historyText, IiiiiiiiIIIII)) {
            return;
        }
        this.historyText = IiiiiiiiIIIII;
        String IiiiiiiiIIIII2 = IiIIIiiiiiiIi.ALLATORIxDEMO((String)IiiiiiiiIIIII, (String)GameMain.mac);
        if (IiiiiiiiIIIII2 == null) {
            GameMain.mac = IiiiIiiiiIiIi.iIiIiiiiIIiIi();
            return;
        }
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.indexOf("|");
        String IiiiiiiiIIIII4 = IiiiiiiiIIIII2.substring(0, IiiiiiiiIIIII3);
        IiiiiiiiIIIII3 = IiiiiiiiIIIII2.indexOf("|", IiiiiiiiIIIII3 + 1);
        long IiiiiiiiIIIII5 = Long.parseLong(IiiiiiiiIIIII2.substring(IiiiiiiiIIIII4.length() + 1, IiiiiiiiIIIII3));
        IiiiiiiiIIIII2 = IiiiiiiiIIIII2.substring(IiiiiiiiIIIII3 + 1);
        if (IiiiiiiiIIIII4.equals("VERSION")) {
            String[] IiiiiiiiIIIII6 = GameMain.getAreas((int)Integer.parseInt(IiiiiiiiIIIII2));
            if (IiiiiiiiIIIII6 == null) {
                return;
            }
            WatchServiceRunnable.iIiIiiiiIIiii(IiiiiiiiIIIII6);
            return;
        }
        if (IiiiiiiiIIIII4.equals("GAME")) {
            String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII2.split("\\|");
            WatchServiceRunnable.ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
        if (!IiiiiiiiIIIII4.equals("EXIT")) return;
        if (!GameMain.ALLATORIxDEMO()) return;
        System.exit(0);
    }

    public static synchronized void ALLATORIxDEMO() {
        if (System.currentTimeMillis() - sendShowLoginTime < 1000L) {
            return;
        }
        sendShowLoginTime = System.currentTimeMillis();
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        IiiiiiiiIIIII.append("SHOWLOGIN|");
        IiiiiiiiIIIII.append(System.currentTimeMillis());
        IiiiiiiiIIIII.append("|");
        IiiiiiiiIIIII.append(GameMain.VERSION);
        IiiiIiiiiIiIi.iIiIiiiiIIiii((String)"map/game", (String)IiIIIiiiiiiIi.iIiIiiiiIIiii((String)IiiiiiiiIIIII.toString(), (String)GameMain.mac));
        WatchServiceRunnable.iIiIiiiiIIiii(String.valueOf(System.getProperty("user.dir")) + "\\startLogin.bat");
    }
}
