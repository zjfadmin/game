/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIIIIiiiIIIiI
 *  com.xy.v.IiiIiiiiIIIii
 *  com.xy.v.iIIIIiiiIiiIi
 *  com.xy.v.iiIiIiiiiiIIi
 */
package com.xy.v;

import com.xy.v.IIIIIiiiIIIiI;
import com.xy.v.IiiIiiiiIIIii;
import com.xy.v.iIIIIiiiIiiIi;
import com.xy.v.iiIiIiiiiiIIi;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiiiIiIII {
    private AudioFormat iIiiIiiiiiiII;
    private String IIiiIiiiIIiIi;
    IIIiIiiiIiIII iIiIiiiiIiIii = this;
    private SourceDataLine IiIIIiiiiIiiI;
    private volatile boolean iiIiiiiiiiIii = true;
    private Thread IiiiiiiiIIIII;
    private AudioInputStream ALLATORIxDEMO;

    static /* synthetic */ void iIiIiiiiIIiii(IIIiIiiiIiIII arg0) {
        arg0.IiiIiiiiiiIiI();
    }

    public void iiiiiiiiIIiii() {
        new Thread((Runnable)new IiiIiiiiIIIii(this)).start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void IiiIiiiiiiIiI() {
        IIIiIiiiIiIII iIIiIiiiIiIII = this;
        synchronized (iIIiIiiiIiIII) {
            this.iiIiiiiiiiIii = false;
            this.notifyAll();
            return;
        }
    }

    public void ALLATORIxDEMO(Thread mainThread) {
        this.IiiiiiiiIIIII = mainThread;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void iIiIiiiiIIiIi() {
        IIIiIiiiIiIII iIIiIiiiIiIII = this;
        synchronized (iIIiIiiiIiIII) {
            this.iiIiiiiiiiIii = true;
            this.notifyAll();
            return;
        }
    }

    public void ALLATORIxDEMO(String musicPath) {
        this.IIiiIiiiIIiIi = musicPath;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.IiIIIiiiiIiiI.drain();
        this.IiIIIiiiiIiiI.close();
        this.ALLATORIxDEMO.close();
    }

    public void iiiIiiiiiiIIi() {
        try {
            File IiiiiiiiIIIII = new File("sc/music/" + this.IIiiIiiiIIiIi);
            this.ALLATORIxDEMO = AudioSystem.getAudioInputStream(IiiiiiiiIIIII);
            this.iIiiIiiiiiiII = this.ALLATORIxDEMO.getFormat();
            if (this.iIiiIiiiiiiII.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
                this.iIiiIiiiiiiII = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, this.iIiiIiiiiiiII.getSampleRate(), 16, this.iIiiIiiiiiiII.getChannels(), this.iIiiIiiiiiiII.getChannels() * 2, this.iIiiIiiiiiiII.getSampleRate(), false);
                this.ALLATORIxDEMO = AudioSystem.getAudioInputStream(this.iIiiIiiiiiiII, this.ALLATORIxDEMO);
            }
            DataLine.Info IiiiiiiiIIIII2 = new DataLine.Info(SourceDataLine.class, this.iIiiIiiiiiiII, -1);
            this.IiIIIiiiiIiiI = (SourceDataLine)AudioSystem.getLine(IiiiiiiiIIIII2);
            this.IiIIIiiiiIiiI.open(this.iIiiIiiiiiiII);
            this.IiIIIiiiiIiiI.start();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            System.err.println(this.IIiiIiiiIIiIi);
            System.err.println("\u97f3\u4e50\u62a5\u9519");
            IIIIIiiiIIIiI.iIiIiiiiIIiii((boolean)false);
            IIIIIiiiIIIiI.ALLATORIxDEMO((boolean)false);
            return;
        }
    }

    public IIIiIiiiIiIII(String musicPath) {
        this.IIiiIiiiIIiIi = musicPath;
    }

    public void iIiIiiiiIIiii() {
        new Thread((Runnable)new iiIiIiiiiiIIi(this)).start();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    private /* synthetic */ void iIiIiiiiIIiii(boolean loop) throws InterruptedException {
        try {
            if (loop) {
                while (true) {
                    this.ALLATORIxDEMO();
                }
            }
        }
        catch (Exception exception) {
            return;
        }
        {
            this.ALLATORIxDEMO();
            this.IiIIIiiiiIiiI.drain();
            this.IiIIIiiiiIiiI.close();
            this.ALLATORIxDEMO.close();
            return;
        }
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiIiiiIiIII arg0) {
        arg0.iIiIiiiiIIiIi();
    }

    public Thread ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    static /* synthetic */ void ALLATORIxDEMO(IIIiIiiiIiIII arg0, boolean arg1) throws InterruptedException {
        arg0.iIiIiiiiIIiii(arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void ALLATORIxDEMO() throws Exception {
        int IiiiiiiiIIIII;
        IIIiIiiiIiIII iIIiIiiiIiIII = this;
        synchronized (iIIiIiiiIiIII) {
            this.iiIiiiiiiiIii = true;
        }
        File IiiiiiiiIIIII2 = new File("sc/music/" + this.IIiiIiiiIIiIi);
        this.ALLATORIxDEMO = AudioSystem.getAudioInputStream(IiiiiiiiIIIII2);
        this.iIiiIiiiiiiII = this.ALLATORIxDEMO.getFormat();
        if (this.iIiiIiiiiiiII.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
            this.iIiiIiiiiiiII = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, this.iIiiIiiiiiiII.getSampleRate(), 16, this.iIiiIiiiiiiII.getChannels(), this.iIiiIiiiiiiII.getChannels() * 2, this.iIiiIiiiiiiII.getSampleRate(), false);
            this.ALLATORIxDEMO = AudioSystem.getAudioInputStream(this.iIiiIiiiiiiII, this.ALLATORIxDEMO);
        }
        byte[] IiiiiiiiIIIII3 = new byte[1024];
        while ((IiiiiiiiIIIII = this.ALLATORIxDEMO.read(IiiiiiiiIIIII3, 0, IiiiiiiiIIIII3.length)) != -1) {
            IIIiIiiiIiIII iIIiIiiiIiIII2 = this;
            synchronized (iIIiIiiiIiIII2) {
                while (!this.iiIiiiiiiiIii) {
                    this.wait();
                }
            }
            this.IiIIIiiiiIiiI.write(IiiiiiiiIIIII3, 0, IiiiiiiiIIIII);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(boolean bl) {
        void loop;
        this.IiiiiiiiIIIII = new Thread((Runnable)new iIIIIiiiIiiIi(this, (boolean)loop));
        this.IiiiiiiiIIIII.start();
    }

    public boolean ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public String ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }
}
