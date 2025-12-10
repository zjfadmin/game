/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.text.GameFrame
 *  com.xy.text.GameMain$1
 *  com.xy.text.GameRunnable
 *  com.xy.text.GameView
 *  com.xy.text.WatchServiceRunnable
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.text;

import com.xy.text.GameFrame;
import com.xy.text.GameMain;
import com.xy.text.GameRunnable;
import com.xy.text.GameView;
import com.xy.text.WatchServiceRunnable;
import com.xy.v.IiiiIiiiiIiIi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GameMain {
    public static String VERSION;
    public static long VERSIONSIZE;
    public static List<GameFrame> frameList;
    public static String mac;
    public static int frameIndex;
    public static int index;
    public static WatchServiceRunnable watchServiceRunnable;
    public static GameRunnable gameRunnable;

    public static synchronized GameFrame ALLATORIxDEMO() {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < frameList.size()) {
            GameFrame IiiiiiiiIIIII2 = frameList.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.gameList.size() < 5) return IiiiiiiiIIIII2;
            ++IiiiiiiiIIIII;
        }
        ++frameIndex;
        1 IiiiiiiiIIIII2 = new /* Unavailable Anonymous Inner Class!! */;
        SwingUtilities.invokeLater((Runnable)IiiiiiiiIIIII2);
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 10000) {
            try {
                Thread.sleep(20L);
                for (GameFrame IiiiiiiiIIIII4 : frameList) {
                    if (IiiiiiiiIIIII4.frameIndex != frameIndex) continue;
                    return IiiiiiiiIIIII4;
                }
            }
            catch (Exception IiiiiiiiIIIII5) {
                IiiiiiiiIIIII5.printStackTrace();
            }
            ++IiiiiiiiIIIII3;
        }
        return frameList.get(0);
    }

    public static boolean ALLATORIxDEMO() {
        if (frameList == null) {
            return true;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < frameList.size()) {
            if (GameMain.frameList.get((int)IiiiiiiiIIIII).gameList.size() != 0) {
                return false;
            }
            ++IiiiiiiiIIIII;
        }
        return true;
    }

    public static int getGameNum() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < frameList.size()) {
            GameFrame IiiiiiiiIIIII3 = frameList.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII += IiiiiiiiIIIII3.gameList.size();
        }
        return IiiiiiiiIIIII;
    }

    public static void ALLATORIxDEMO(GameFrame gameFrame) {
        frameList.remove(gameFrame);
        if (frameList.size() == 0) {
            System.exit(0);
            return;
        }
        gameFrame.dispose();
    }

    static {
        mac = IiiiIiiiiIiIi.iIiIiiiiIIiIi();
        index = -1;
        VERSION = "version-45.5";
        VERSIONSIZE = 23045L;
        frameIndex = 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void main(String[] stringArray) throws Exception {
        void IiiiiiiiIIIII;
        String[] args;
        System.out.println("\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n");
        if (args == null || args.length == 0) {
            args = new String[]{"frame", "0"};
        }
        if (args == null) return;
        if (args.length < 2) return;
        watchServiceRunnable = new WatchServiceRunnable();
        new Thread((Runnable)watchServiceRunnable).start();
        if (args[0].equals("frame")) {
            if (frameList == null) {
                frameList = new ArrayList<GameFrame>();
            }
            if (frameList.size() != 0) return;
            GameMain.ALLATORIxDEMO();
            return;
        }
        String[] IiiiiiiiIIIII2 = GameMain.getAreas(Integer.parseInt(args[1]));
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if (args[0].equals("version")) {
            WatchServiceRunnable.iIiIiiiiIIiii((String[])IiiiiiiiIIIII2);
            return;
        }
        if (!args[0].equals("game")) return;
        String[] stringArray2 = new String[6];
        IiiiiiiiIIIII[0] = args[2];
        IiiiiiiiIIIII[1] = args[1];
        IiiiiiiiIIIII[2] = args[3];
        IiiiiiiiIIIII[3] = args[4];
        IiiiiiiiIIIII[4] = args[5];
        IiiiiiiiIIIII[5] = args[6];
        WatchServiceRunnable.ALLATORIxDEMO((String[])IiiiiiiiIIIII);
    }

    public static boolean ALLATORIxDEMO(long roleId) {
        if (frameList == null) {
            return false;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < frameList.size()) {
            GameFrame IiiiiiiiIIIII2 = frameList.get(IiiiiiiiIIIII);
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.gameList.size() - 1;
            while (IiiiiiiiIIIII3 >= 0) {
                GameView IiiiiiiiIIIII4 = (GameView)IiiiiiiiIIIII2.gameList.get(IiiiiiiiIIIII3);
                if (IiiiiiiiIIIII4.isDraw && IiiiiiiiIIIII4.getClient().iiiIiiiiiiIIi()) {
                    if (IiiiiiiiIIIII4.roleData.getRoleId() == roleId) return true;
                }
                --IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public static String[] getAreas(int downloadId) {
        String[] IiiiiiiiIIIII = null;
        if (downloadId == 1781) {
            IiiiiiiiIIIII = new String[]{new String("79_47.98.143.156_7772_8882_\u7b56\u9a6c\u5954\u817e_1")};
            return IiiiiiiiIIIII;
        }
        if (downloadId == 1782) {
            IiiiiiiiIIIII = new String[]{new String("82_1.13.187.206_7771_8881_\u9f99\u817e\u4e00\u533a_1"), new String("-82_127.0.0.10_7771_8881_\u9f99\u817e\u4e00\u533a\u76fe_1")};
            return IiiiiiiiIIIII;
        }
        if (downloadId == 2613) {
            IiiiiiiiIIIII = new String[]{new String("83_47.96.190.102_7771_8881_\u6ca7\u6d77\u6708\u660e_1"), new String("-83_127.0.0.10_7771_8881_\u6ca7\u6d77\u6708\u660e\u76fe_1")};
            return IiiiiiiiIIIII;
        }
        if (downloadId == 3518) {
            IiiiiiiiIIIII = new String[]{new String("85_xn.zgxy2.top_10601_10602_\u6cb3\u5317\u4e13\u533a_1")};
            return IiiiiiiiIIIII;
        }
        if (downloadId != 7187) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = new String[]{new String("78_116.62.56.142_7772_8882_\u5b9d\u8c61\u56fd_1"), new String("-78_127.1.254.1_7772_8882_\u5b9d\u8c61\u56fd\u76fe_1"), new String("81_116.62.56.142_7773_8883_\u5b9d\u8c61\u4e8c\u533a_1"), new String("-81_127.1.254.1_7772_8882_\u5b9d\u8c61\u4e8c\u533a\u76fe_1")};
        return IiiiiiiiIIIII;
    }
}
