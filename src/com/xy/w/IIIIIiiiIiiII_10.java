/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.v.IiiiIiiiiIiIi
 *  com.xy.v.iiIiiiiiIIiii
 *  com.xy.w.IIiIiiiiIIiii
 *  com.xy.w.IiiiiiiiiIIII
 */
package com.xy.w;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.v.IiiiIiiiiIiIi;
import com.xy.v.iiIiiiiiIIiii;
import com.xy.w.IIiIiiiiIIiii;
import com.xy.w.IiiiiiiiiIIII;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIIIiiiIiiII {
    private static List<String> iiIIIiiiiiiiI;
    public static Image IiIiiiiiIIIII;
    public static Map<String, SoftReference<Image>> iiIiIiiiiIIIi;
    public static final byte[] iiiiIiiiIiiII;
    public static Map<String, IIiIiiiiIIiii> iiiIiiiiiiiIi;
    public static final int iIiiIiiiiiiII = 0xFFFFFF;
    public static Image IIiiIiiiIIiIi;
    public static Image iIiIiiiiIiIii;
    public static Map<String, IiiiiiiiiIIII> IiIIIiiiiIiiI;
    public static final int iiIiiiiiiiIii = 123;
    public static Map<Integer, com.xy.n.IIIIIiiiIiiII> IiiiiiiiIIIII;
    public static Image ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    public static byte[] ALLATORIxDEMO(byte[] buf) {
        block3: {
            if (buf.length >= 16) break block3;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl12
        }
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl19
        do {
            v0 = IiiiiiiiIIIII;
            v1 = (byte)(buf[IiiiiiiiIIIII] ^ IIIIIiiiIiiII.iiiiIiiiIiiII[IiiiiiiiIIIII % IIIIIiiiIiiII.iiiiIiiiIiiII.length]);
            ++IiiiiiiiIIIII;
            buf[v0] = v1;
lbl12:
            // 2 sources

        } while (IiiiiiiiIIIII < buf.length);
        return buf;
        do {
            v2 = IiiiiiiiIIIII;
            v3 = (byte)(buf[IiiiiiiiIIIII] ^ IIIIIiiiIiiII.iiiiIiiiIiiII[IiiiiiiiIIIII % IIIIIiiiIiiII.iiiiIiiiIiiII.length]);
            ++IiiiiiiiIIIII;
            buf[v2] = v3;
lbl19:
            // 2 sources

        } while (IiiiiiiiIIIII < 8);
        IiiiiiiiIIIII = buf.length - 8;
        while (IiiiiiiiIIIII < buf.length) {
            v4 = IiiiiiiiIIIII;
            v5 = (byte)(buf[IiiiiiiiIIIII] ^ IIIIIiiiIiiII.iiiiIiiiIiiII[IiiiiiiiIIIII % IIIIIiiiIiiII.iiiiIiiiIiiII.length]);
            ++IiiiiiiiIIIII;
            buf[v4] = v5;
        }
        return buf;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled unnecessary exception pruning
     */
    public static IiiiiiiiiIIII iIiIiiiiIIiii(String imgPath) {
        Image IiiiiiiiIIIII;
        if (iiIIIiiiiiiiI.contains(imgPath)) {
            return null;
        }
        IiiiiiiiiIIII IiiiiiiiIIIII2 = IiIIIiiiiIiiI.get(imgPath);
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2.ALLATORIxDEMO(4);
            return IiiiiiiiIIIII2;
        }
        byte[] IiiiiiiiIIIII3 = IIIIIiiiIiiII.ALLATORIxDEMO("sc/head/N" + imgPath + ".png");
        Image image = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? Toolkit.getDefaultToolkit().createImage(IiiiiiiiIIIII3) : null;
        if (IiiiiiiiIIIII == null) {
            iiIIIiiiiiiiI.add(imgPath);
            return null;
        }
        IiiiiiiiIIIII2 = new IiiiiiiiiIIII(4, IiiiiiiiIIIII);
        IiiiiiiiIIIII2 = new IiiiiiiiiIIII(4, IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put(imgPath, IiiiiiiiIIIII2);
        try {
            block8: {
                int IiiiiiiiIIIII4;
                block7: {
                    IiiiiiiiIIIII4 = 0;
                    if (!true) break block7;
                    if (IiiiiiiiIIIII2.ALLATORIxDEMO().getHeight(null) != -1) return IiiiiiiiIIIII2;
                    if (IiiiiiiiIIIII4 >= 10) break block8;
                }
                do {
                    ++IiiiiiiiIIIII4;
                    Thread.sleep(5L);
                    if (IiiiiiiiIIIII2.ALLATORIxDEMO().getHeight(null) != -1) return IiiiiiiiIIIII2;
                } while (IiiiiiiiIIIII4 < 10);
            }
            return IiiiiiiiIIIII2;
        }
        catch (Exception IiiiiiiiIIIII5) {
            IiiiiiiiIIIII5.printStackTrace();
        }
        return IiiiiiiiIIIII2;
    }

    public static Image iiiIiiiiiiIIi(String path) {
        if (path == null) {
            return null;
        }
        SoftReference<Image> IiiiiiiiIIIII = iiIiIiiiiIIIi.get(path);
        if (IiiiiiiiIIIII == null) return IIIIIiiiIiiII.iIiIiiiiIIiii(path);
        if (IiiiiiiiIIIII.get() != null) return IiiiiiiiIIIII.get();
        return IIIIIiiiIiiII.iIiIiiiiIIiii(path);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public static com.xy.n.IIIIIiiiIiiII ALLATORIxDEMO(int mapModel) throws Exception {
        Map<Integer, com.xy.n.IIIIIiiiIiiII> map = IiiiiiiiIIIII;
        synchronized (map) {
            com.xy.n.IIIIIiiiIiiII IiiiiiiiIIIII = IIIIIiiiIiiII.IiiiiiiiIIIII.get(mapModel);
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = mapModel > 0 ? com.xy.n.IIIIIiiiIiiII.ALLATORIxDEMO((String)("sc/map/" + mapModel + ".map")) : com.xy.n.IIIIIiiiIiiII.ALLATORIxDEMO((String)("sc/map/" + -mapModel + "A.map"));
                IiiiiiiiIIIII.iiiIiiiiiiiIi = mapModel;
                IIIIIiiiIiiII.IiiiiiiiIIIII.put(mapModel, IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII.IIiiIiiiIIiIi;
            return IiiiiiiiIIIII;
        }
    }

    static {
        iiiiIiiiIiiII = iiIiiiiiIIiii.ALLATORIxDEMO().fromJson("[-35,-70,-105,116,81,46,11,-24,-59,-94,127,92,57,22,-13,-48,-83,-118,103,68,33,-2,-37,-72,-107,114,79,44,9,-26,-61,-96,125,90,55,20,-15,-50,-85,-120,101,66,31,-4,-39,-74,-109,112,77,42,7,-28,-63,-98,123,88,53,18,-17,-52,-87,-122,99,64,29,-6,-41,-76,-111,110,75,40,5,-30,-65,-100,121,86,51,16,-19,-54,-89,-124,97,62,27,-8,-43,-78,-113,108,73,38,3,-32,-67,-102,119,84,49,14,-21,-56,-91,-126,95,60,25,-10,-45,-80,-115,106,71,36,1,-34,-69,-104,117,82,47,12,-23,-58,-93,-128,93,58,23,-12,-47,-82,-117,104,69,34,-1,-36,-71,-106,115,80,45,10,-25,-60,-95,126,91,56,21,-14,-49,-84,-119,102,67,32,-3,-38,-73,-108,113,78,43,8,-27,-62,-97,124,89,54,19,-16,-51,-86,-121,100,65,30,-5,-40,-75,-110,111,76,41,6,-29,-64,-99,122,87,52,17,-18,-53,-88,-123,98,63,28,-7,-42,-77,-112,109,74,39,4,-31,-66,-101,120,85,50,15,-20,-55,-90,-125,96,61,26,-9,-44,-79,-114,107,72,37,2,-33,-68,-103,118,83,48,13,-22,-57,-92,-127,94,59,24,-11,-46,-81,-116,105,70,35,0,-35,-70,-105,116,81,46,11,-24,-59,-94,127,92,57,22,-13,-48,-83,-118,103,68,33,-2,-37,-72,-107,114,79,44,9,-26,-61,-96,125,90,55,20,-15,-50,-85,-120,101,66,31,-4,-39,-74,-109,112,77,42,7,-28,-63,-98,123,88,53,18,-17,-52,-87,-122,99,64,29,-6,-41,-76,-111,110,75,40,5,-30,-65,-100,121,86,51,16,-19,-54,-89,-124,97,62,27,-8,-43,-78,-113,108,73,38,3,-32,-67,-102,119,84,49,14,-21,-56,-91,-126,95,60,25,-10,-45,-80,-115,106,71,36,1,-34,-69,-104,117,82,47,12,-23,-58,-93,-128,93,58,23,-12,-47,-82,-117,104,69,34,-1,-36,-71,-106,115,80,45,10,-25,-60,-95,126,91,56,21,-14,-49,-84,-119,102,67,32,-3,-38,-73,-108,113,78,43,8,-27,-62,-97,124,89,54,19,-16,-51,-86,-121,100,65,30,-5,-40,-75,-110,111,76,41,6,-29,-64,-99,122,87,52,17,-18,-53,-88,-123,98,63,28,-7,-42,-77,-112,109,74,39,4,-31,-66,-101,120,85,50,15,-20,-55,-90,-125,96,61,26,-9,-44,-79,-114,107,72,37,2,-33,-68,-103,118,83,48,13,-22,-57,-92,-127,94,59,24,-11,-46,-81,-116,105,70,35,0]", byte[].class);
        iiIiIiiiiIIIi = new HashMap<String, SoftReference<Image>>();
        IiIIIiiiiIiiI = new HashMap<String, IiiiiiiiiIIII>();
        iiiIiiiiiiiIi = new HashMap<String, IIiIiiiiIIiii>();
        IiiiiiiiIIIII = new HashMap<Integer, com.xy.n.IIIIIiiiIiiII>();
        IIiiIiiiIIiIi = IIIIIiiiIiiII.iiiIiiiiiiIIi("sc/c/42");
        iIiIiiiiIiIii = IIIIIiiiIiiII.iiiIiiiiiiIIi("sc/c/43");
        IiIiiiiiIIIII = IIIIIiiiIiiII.iiiIiiiiiiIIi("sc/c/44");
        iiIIIiiiiiiiI = new ArrayList<String>();
    }

    private static synchronized /* synthetic */ Image iIiIiiiiIIiii(String path) {
        Image IiiiiiiiIIIII;
        SoftReference<Image> IiiiiiiiIIIII2 = iiIiIiiiiIIIi.get(path);
        if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.get() != null) {
            return IiiiiiiiIIIII2.get();
        }
        byte[] IiiiiiiiIIIII3 = IIIIIiiiIiiII.ALLATORIxDEMO(path);
        Image image = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? Toolkit.getDefaultToolkit().createImage(IiiiiiiiIIIII3) : null;
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = IIIIIiiiIiiII.ALLATORIxDEMO();
            iiIiIiiiiIIIi.put(path, IiiiiiiiIIIII2);
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII.getWidth(null);
        iiIiIiiiiIIIi.put(path, new SoftReference<Image>(IiiiiiiiIIIII));
        return IiiiiiiiIIIII;
    }

    public static void iIiIiiiiIIiii(Graphics g, Image image, int x, int y, int w, int h) {
        if (image == null) return;
        if (image.getWidth(null) == -1) {
            return;
        }
        int IiiiiiiiIIIII = image.getWidth(null);
        int IiiiiiiiIIIII2 = image.getHeight(null);
        IiiiiiiiIIIII = (int)((double)IiiiiiiiIIIII * 0.8);
        IiiiiiiiIIIII2 = (int)((double)IiiiiiiiIIIII2 * 0.8);
        g.drawImage(image, x + (w - IiiiiiiiIIIII) / 2, y + (h - IiiiiiiiIIIII2) / 2, IiiiiiiiIIIII, IiiiiiiiIIIII2, null);
    }

    /*
     * Exception decompiling
     */
    public static byte[] ALLATORIxDEMO(String path) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 6[CATCHBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompile(CFRDecompiler.java:91)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:122)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.lang.Thread.run(Thread.java:748)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled unnecessary exception pruning
     */
    public static IiiiiiiiiIIII ALLATORIxDEMO(String imgPath) {
        Image IiiiiiiiIIIII;
        String IiiiiiiiIIIII2 = "SMAP " + imgPath;
        if (iiIIIiiiiiiiI.contains(IiiiiiiiIIIII2)) {
            return null;
        }
        IiiiiiiiiIIII IiiiiiiiIIIII3 = IiIIIiiiiIiiI.get(IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3.ALLATORIxDEMO(4);
            return IiiiiiiiIIIII3;
        }
        byte[] IiiiiiiiIIIII4 = IIIIIiiiIiiII.ALLATORIxDEMO("sc/smap/s" + imgPath + ".png");
        Image image = IiiiiiiiIIIII = IiiiiiiiIIIII4 != null ? Toolkit.getDefaultToolkit().createImage(IiiiiiiiIIIII4) : null;
        if (IiiiiiiiIIIII == null) {
            iiIIIiiiiiiiI.add(IiiiiiiiIIIII2);
            return null;
        }
        IiiiiiiiIIIII3 = new IiiiiiiiiIIII(4, IiiiiiiiIIIII);
        IiiiiiiiIIIII3 = new IiiiiiiiiIIII(4, IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
        try {
            block8: {
                int IiiiiiiiIIIII5;
                block7: {
                    IiiiiiiiIIIII5 = 0;
                    if (!true) break block7;
                    if (IiiiiiiiIIIII3.ALLATORIxDEMO().getHeight(null) != -1) return IiiiiiiiIIIII3;
                    if (IiiiiiiiIIIII5 >= 10) break block8;
                }
                do {
                    ++IiiiiiiiIIIII5;
                    Thread.sleep(5L);
                    if (IiiiiiiiIIIII3.ALLATORIxDEMO().getHeight(null) != -1) return IiiiiiiiIIIII3;
                } while (IiiiiiiiIIIII5 < 10);
            }
            return IiiiiiiiIIIII3;
        }
        catch (Exception IiiiiiiiIIIII6) {
            IiiiiiiiIIIII6.printStackTrace();
        }
        return IiiiiiiiIIIII3;
    }

    public static synchronized Image ALLATORIxDEMO() {
        if (ALLATORIxDEMO != null) return ALLATORIxDEMO;
        ALLATORIxDEMO = IIIIIiiiIiiII.iIiIiiiiIIiii("sc/b/\u5c0f\u5730\u56fe\u7ea2\u70b90000.png");
        return ALLATORIxDEMO;
    }

    public static void ALLATORIxDEMO(Graphics g, Image image, int x, int y, int w, int h) {
        if (image == null) return;
        if (image.getWidth(null) == -1) {
            return;
        }
        int IiiiiiiiIIIII = image.getWidth(null);
        int IiiiiiiiIIIII2 = image.getHeight(null);
        if (IiiiiiiiIIIII <= 40 && IiiiiiiiIIIII2 <= 40) {
            g.drawImage(image, x + (w - IiiiiiiiIIIII) / 2, y + (h - IiiiiiiiIIIII2) / 2, IiiiiiiiIIIII, IiiiiiiiIIIII2, null);
            return;
        }
        g.drawImage(image, x + (120 - IiiiiiiiIIIII) * w / 240, y + (120 - IiiiiiiiIIIII2) * h / 240, Math.round((float)(IiiiiiiiIIIII * w) / 120.0f), Math.round((float)(IiiiiiiiIIIII2 * h) / 120.0f), null);
    }

    public static void iIiIiiiiIIiii() {
        Iterator<String> IiiiiiiiIIIII = IiIIIiiiiIiiI.keySet().iterator();
        while (IiiiiiiiIIIII.hasNext()) {
            String IiiiiiiiIIIII2 = IiiiiiiiIIIII.next();
            if (!IiIIIiiiiIiiI.get(IiiiiiiiIIIII2).ALLATORIxDEMO()) continue;
            IiiiiiiiIIIII.remove();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static void ALLATORIxDEMO() {
        var0 = IIIIIiiiIiiII.IiiiiiiiIIIII;
        synchronized (var0) {
            IiiiiiiiIIIII = System.currentTimeMillis();
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IIIIIiiiIiiII.IiiiiiiiIIIII.keySet().iterator();
            if (true) ** GOTO lbl16
            do {
                IiiiiiiiIIIII = IiiiiiiiIIIII.next();
                IiiiiiiiIIIII = IIIIIiiiIiiII.IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII.IIiiIiiiIIiIi > 0 || IiiiiiiiIIIII - IiiiiiiiIIIII.iIiiIiiiiiiII <= IiiiIiiiiIiIi.IiiiiiiiIIIII) continue;
                IiiiiiiiIIIII.ALLATORIxDEMO();
                IiiiiiiiIIIII.remove();
lbl16:
                // 3 sources

            } while (IiiiiiiiIIIII.hasNext());
            return;
        }
    }

    public static IIiIiiiiIIiii ALLATORIxDEMO(String srcImageFile, int w1, int h1, int w2, int h2, boolean l) {
        String IiiiiiiiIIIII;
        IIiIiiiiIIiii IiiiiiiiIIIII2;
        IIiIiiiiIIiii IiiiiiiiIIIII3 = iiiIiiiiiiiIi.get(srcImageFile);
        if (IiiiiiiiIIIII3 == null) {
            IiiiiiiiIIIII3 = new IIiIiiiiIIiii(IIIIIiiiIiiII.iiiIiiiiiiIIi(srcImageFile), w1, h1, w2, h2);
            iiiIiiiiiiiIi.put(srcImageFile, IiiiiiiiIIIII3);
            iiiIiiiiiiiIi.put(String.valueOf(srcImageFile) + " " + w1 + " " + w2 + " " + h1 + " " + h2, IiiiiiiiIIIII3);
            if (l) {
                return IiiiiiiiIIIII3;
            }
        }
        if (l) {
            return new IIiIiiiiIIiii(IiiiiiiiIIIII3).ALLATORIxDEMO(w1, h1, w2, h2);
        }
        if (IiiiiiiiIIIII3.iIiIiiiiIIiIi() == w1 && IiiiiiiiIIIII3.ALLATORIxDEMO() == h1 && IiiiiiiiIIIII3.iiiIiiiiiiIIi() == w2) {
            if (IiiiiiiiIIIII3.iIiIiiiiIIiii() == h2) return IiiiiiiiIIIII3;
        }
        if ((IiiiiiiiIIIII2 = iiiIiiiiiiiIi.get(IiiiiiiiIIIII = String.valueOf(srcImageFile) + " " + w1 + " " + w2 + " " + h1 + " " + h2)) != null) return IiiiiiiiIIIII2;
        IiiiiiiiIIIII2 = new IIiIiiiiIIiii(IiiiiiiiIIIII3).ALLATORIxDEMO(w1, h1, w2, h2);
        iiiIiiiiiiiIi.put(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        return IiiiiiiiIIIII2;
    }

    public static Image ALLATORIxDEMO(String imgPath) {
        Image IiiiiiiiIIIII;
        String IiiiiiiiIIIII2 = "MAP " + imgPath;
        if (iiIIIiiiiiiiI.contains(IiiiiiiiIIIII2)) {
            return IIIIIiiiIiiII.ALLATORIxDEMO();
        }
        IiiiiiiiiIIII IiiiiiiiIIIII3 = IiIIIiiiiIiiI.get(IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 != null) {
            IiiiiiiiIIIII3.ALLATORIxDEMO(4);
            return IiiiiiiiIIIII3.ALLATORIxDEMO();
        }
        byte[] IiiiiiiiIIIII4 = IIIIIiiiIiiII.ALLATORIxDEMO("sc/map/" + imgPath + ".jpg");
        Image image = IiiiiiiiIIIII = IiiiiiiiIIIII4 != null ? Toolkit.getDefaultToolkit().createImage(IiiiiiiiIIIII4) : null;
        if (IiiiiiiiIIIII == null) {
            iiIIIiiiiiiiI.add(IiiiiiiiIIIII2);
            return IIIIIiiiIiiII.ALLATORIxDEMO();
        }
        IiiiiiiiIIIII3 = new IiiiiiiiiIIII(4, IiiiiiiiIIIII);
        IiiiiiiiIIIII3 = new IiiiiiiiiIIII(4, IiiiiiiiIIIII);
        IiIIIiiiiIiiI.put(IiiiiiiiIIIII2, IiiiiiiiIIIII3);
        return IiiiiiiiIIIII3.ALLATORIxDEMO();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void ALLATORIxDEMO(com.xy.n.IIIIIiiiIiiII mapDecoder) {
        Map<Integer, com.xy.n.IIIIIiiiIiiII> map = IiiiiiiiIIIII;
        synchronized (map) {
            if (mapDecoder == null) {
                return;
            }
            --mapDecoder.IIiiIiiiIIiIi;
            mapDecoder.iIiiIiiiiiiII = System.currentTimeMillis();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(Image image, BufferedImage clipImage) {
        void IiiiiiiiIIIII;
        void IiiiiiiiIIIII2;
        Graphics2D graphics2D = clipImage.createGraphics();
        IiiiiiiiIIIII2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        IiiiiiiiIIIII2.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        IiiiiiiiIIIII2.clearRect(0, 0, clipImage.getWidth(), clipImage.getHeight());
        graphics2D.drawImage(image, 0, 0, clipImage.getWidth(), clipImage.getHeight(), null);
        RoundRectangle2D.Double IiiiiiiiIIIII3 = new RoundRectangle2D.Double(0.0, 0.0, clipImage.getWidth(), clipImage.getHeight(), clipImage.getWidth(), clipImage.getHeight());
        Area area = new Area(new Rectangle(0, 0, clipImage.getWidth(), clipImage.getHeight()));
        area.subtract(new Area(IiiiiiiiIIIII3));
        IiiiiiiiIIIII2.setComposite(AlphaComposite.Clear);
        IiiiiiiiIIIII2.fill((Shape)IiiiiiiiIIIII);
        IiiiiiiiIIIII2.dispose();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Point ALLATORIxDEMO(int mapModel) {
        try {
            Map<Integer, com.xy.n.IIIIIiiiIiiII> map = IiiiiiiiIIIII;
            synchronized (map) {
                com.xy.n.IIIIIiiiIiiII IiiiiiiiIIIII = IIIIIiiiIiiII.IiiiiiiiIIIII.get(mapModel);
                if (IiiiiiiiIIIII == null) return com.xy.n.IIIIIiiiIiiII.ALLATORIxDEMO((String)("sc/map/" + mapModel + ".map"));
                return new Point(IiiiiiiiIIIII.IiIiiiiiIIIII, IiiiiiiiIIIII.iIiIiiiiIiIii);
            }
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return new Point(800, 600);
        }
    }
}
