/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.text;

import com.xy.v.IIiiIiiiiIIiI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SystemData {
    public long chatDown;
    public static boolean isOld;
    public boolean b7;
    public static boolean ISNAME;
    private int showView = 1;
    public static boolean shadow;
    public static boolean ISTCP;
    private int FPSMax = 1;
    public boolean music;
    public static boolean isWing;
    public static boolean ISSTALL;
    public boolean b5;
    public boolean b2;
    public boolean musicSound;
    public boolean b1;
    public long value = this.showView | this.FPSMax << 4;
    public static boolean ISMOUNT;
    public static boolean ISTITLE;
    public boolean b3;
    public boolean b6;
    public boolean b4;
    public long chatUp;

    public boolean IIiiIiiiiIiII() {
        return this.music;
    }

    public void iIiIiiiiIIiii() {
        FileOutputStream IiiiiiiiIIIII = null;
        try {
            Properties IiiiiiiiIIIII2 = new Properties();
            IiiiiiiiIIIII = new FileOutputStream("map/sys");
            IiiiiiiiIIIII2.setProperty("value", String.valueOf(this.value));
            IiiiiiiiIIIII2.setProperty("chatUp", String.valueOf(this.chatUp));
            IiiiiiiiIIIII2.setProperty("chatDown", String.valueOf(this.chatDown));
            IiiiiiiiIIIII2.store(IiiiiiiiIIIII, null);
        }
        catch (IOException IiiiiiiiIIIII3) {
            IiiiiiiiIIIII3.printStackTrace();
        }
        try {
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.close();
            return;
        }
        catch (IOException IiiiiiiiIIIII4) {
            IiiiiiiiIIIII4.printStackTrace();
        }
    }

    public void setB3(boolean b3) {
        this.b3 = b3;
    }

    public boolean IIIiiiiiiIIiI() {
        return this.b2;
    }

    public void setB7(boolean b7) {
        this.b7 = b7;
    }

    public void setB6(boolean b6) {
        this.b6 = b6;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public boolean setValue(long value) {
        if (this.value == value) {
            return false;
        }
        int IiiiiiiiIIIII = this.showView;
        this.ALLATORIxDEMO(value);
        this.iIiIiiiiIIiii();
        if (IiiiiiiiIIIII == this.showView) return false;
        return true;
    }

    public boolean IIIIIiiiiIIii() {
        return this.b6;
    }

    public void setB2(boolean b2) {
        this.b2 = b2;
    }

    public int getShowView() {
        return this.showView;
    }

    public boolean iiiiiiiiIIiii() {
        return this.b1;
    }

    public void setMusicSound(boolean musicSound) {
        this.musicSound = musicSound;
    }

    public int getFPS() {
        if (this.FPSMax == 0) {
            return 30;
        }
        if (this.FPSMax == 1) {
            return 40;
        }
        if (this.FPSMax == 2) {
            return 50;
        }
        if (this.FPSMax != 3) return 30;
        return 60;
    }

    static {
        ISTCP = true;
        ISNAME = true;
        ISMOUNT = true;
        ISSTALL = true;
        ISTITLE = true;
    }

    public boolean setValue() {
        long IiiiiiiiIIIII = this.showView | this.FPSMax << 4;
        if (this.music) {
            IiiiiiiiIIIII |= 0x100L;
        }
        if (this.musicSound) {
            IiiiiiiiIIIII |= 0x200L;
        }
        if (this.b1) {
            IiiiiiiiIIIII |= 0x400L;
        }
        if (this.b2) {
            IiiiiiiiIIIII |= 0x800L;
        }
        if (this.b3) {
            IiiiiiiiIIIII |= 0x1000L;
        }
        if (this.b4) {
            IiiiiiiiIIIII |= 0x2000L;
        }
        if (this.b5) {
            IiiiiiiiIIIII |= 0x4000L;
        }
        if (this.b6) {
            IiiiiiiiIIIII |= 0x8000L;
        }
        if (!this.b7) return this.setValue(IiiiiiiiIIIII);
        IiiiiiiiIIIII |= 0x10000L;
        return this.setValue(IiiiiiiiIIIII);
    }

    public void setB5(boolean b5) {
        this.b5 = b5;
    }

    public boolean IiiIiiiiiiIiI() {
        return this.b7;
    }

    public boolean iIiIiiiiIIiIi() {
        return this.musicSound;
    }

    public void ALLATORIxDEMO() {
        FileInputStream IiiiiiiiIIIII = null;
        InputStreamReader IiiiiiiiIIIII2 = null;
        try {
            File IiiiiiiiIIIII3 = new File("map/sys");
            if (IiiiiiiiIIIII3.exists()) {
                Properties IiiiiiiiIIIII4 = new Properties();
                IiiiiiiiIIIII = new FileInputStream(IiiiiiiiIIIII3);
                IiiiiiiiIIIII2 = new InputStreamReader((InputStream)IiiiiiiiIIIII, "UTF-8");
                IiiiiiiiIIIII4.load(IiiiiiiiIIIII2);
                String IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getProperty("value");
                this.ALLATORIxDEMO(Long.parseLong(IiiiiiiiIIIII5));
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getProperty("chatUp");
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII5)) {
                    IiiiiiiiIIIII5 = "32";
                }
                this.chatUp = Long.parseLong(IiiiiiiiIIIII5);
                IiiiiiiiIIIII5 = IiiiiiiiIIIII4.getProperty("chatDown");
                if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII5)) {
                    IiiiiiiiIIIII5 = "31";
                }
                this.chatDown = Long.parseLong(IiiiiiiiIIIII5);
            }
        }
        catch (Exception IiiiiiiiIIIII6) {
            IiiiiiiiIIIII6.printStackTrace();
        }
        try {
            if (IiiiiiiiIIIII2 != null) {
                IiiiiiiiIIIII2.close();
            }
        }
        catch (IOException IiiiiiiiIIIII7) {
            IiiiiiiiIIIII7.printStackTrace();
        }
        try {
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.close();
            return;
        }
        catch (IOException IiiiiiiiIIIII8) {
            IiiiiiiiIIIII8.printStackTrace();
        }
    }

    public boolean iiiIiiiiiiIIi() {
        return this.b4;
    }

    public void setB4(boolean b4) {
        this.b4 = b4;
    }

    public boolean setSystemValue(long value) {
        if (this.b3) {
            value |= 0x1000L;
        }
        if (this.b4) {
            value |= 0x2000L;
        }
        if (!this.b6) return this.setValue(value);
        value |= 0x8000L;
        return this.setValue(value);
    }

    public void setShowView(int showView) {
        this.showView = showView;
    }

    public boolean iIiIiiiiIIiii() {
        return this.b3;
    }

    public void setB1(boolean b1) {
        this.b1 = b1;
    }

    public int getFPSMax() {
        return this.FPSMax;
    }

    public boolean ALLATORIxDEMO() {
        return this.b5;
    }

    public SystemData() {
        this.ALLATORIxDEMO();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(long l) {
        void value;
        long l2 = this.value = value;
        this.showView = (int)(l2 & 0xFL);
        this.FPSMax = (int)(l2 >> 4 & 0xFL);
        this.music = (value >> 8 & 1L) == 1L;
        this.musicSound = (value >> 9 & 1L) == 1L;
        this.b1 = (value >> 10 & 1L) == 1L;
        this.b2 = (value >> 11 & 1L) == 1L;
        this.b3 = (value >> 12 & 1L) == 1L;
        this.b4 = (value >> 13 & 1L) == 1L;
        this.b5 = (value >> 14 & 1L) == 1L;
        this.b6 = (value >> 15 & 1L) == 1L;
        this.b7 = (value >> 16 & 1L) == 1L;
        isOld = this.b1;
        isWing = this.b2;
    }
}
