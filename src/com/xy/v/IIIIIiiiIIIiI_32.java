/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIIiIiiiIiIII
 *  com.xy.v.IiIIIiiiIIiII
 *  com.xy.v.iIiIiiiiIiIII
 */
package com.xy.v;

import com.xy.v.IIIiIiiiIiIII;
import com.xy.v.IiIIIiiiIIiII;
import com.xy.v.iIiIiiiiIiIII;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IIIIIiiiIIIiI {
    private static IIIiIiiiIiIII iIiIiiiiIiIii;
    private static List<IIIiIiiiIiIII> IiIIIiiiiIiiI;
    private static boolean iiIiiiiiiiIii;
    private static boolean IiiiiiiiIIIII;
    private static Object ALLATORIxDEMO;

    /*
     * Exception decompiling
     */
    public static void iIiIiiiiIIiii(boolean kz1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void ALLATORIxDEMO(boolean kz2) {
        Object object = ALLATORIxDEMO;
        synchronized (object) {
            iiIiiiiiiiIii = kz2;
            if (IiiiiiiiIIIII) return;
            IIIIIiiiIIIiI.ALLATORIxDEMO();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void iIiIiiiiIIiIi(String path) {
        Object object = ALLATORIxDEMO;
        synchronized (object) {
            if (!IiiiiiiiIIIII) {
                return;
            }
            try {
                if (iIiIiiiiIiIii != null && iIiIiiiiIiIii.ALLATORIxDEMO().equals(path)) {
                    if (iIiIiiiiIiIii.ALLATORIxDEMO()) return;
                    iIiIiiiiIiIii.iIiIiiiiIIiii();
                    return;
                }
                if (iIiIiiiiIiIii != null) {
                    iIiIiiiiIiIii.iiiiiiiiIIiii();
                    iIiIiiiiIiIii.finalize();
                }
                iIiIiiiiIiIii = null;
                File IiiiiiiiIIIII = new File("sc/music/" + path);
                if (!IiiiiiiiIIIII.exists()) {
                    return;
                }
                iIiIiiiiIiIii = new IIIiIiiiIiIII(path);
                iIiIiiiiIiIii.iiiIiiiiiiIIi();
                iIiIiiiiIiIii.ALLATORIxDEMO(true);
            }
            catch (Exception IiiiiiiiIIIII) {
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public static void ALLATORIxDEMO() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[DOLOOP]], but top level block is 2[TRYBLOCK]
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
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public static void iiiIiiiiiiIIi(String path) {
        Object object = ALLATORIxDEMO;
        synchronized (object) {
            if (!IiiiiiiiIIIII) {
                return;
            }
            if (path == null) {
                if (iIiIiiiiIiIii == null) return;
                iIiIiiiiIiIii.iiiiiiiiIIiii();
            } else {
                IIIIIiiiIIIiI.iIiIiiiiIIiIi(path);
            }
            return;
        }
    }

    static {
        ALLATORIxDEMO = new Object();
        IiiiiiiiIIIII = true;
        iiIiiiiiiiIii = true;
        IiIIIiiiiIiiI = new ArrayList<IIIiIiiiIiIII>();
    }

    public static void main(String[] stringArray) throws InterruptedException {
        System.out.println("\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n");
        new Thread((Runnable)new IiIIIiiiIIiII()).start();
        new Thread((Runnable)new iIiIiiiiIiIII()).start();
        Thread.sleep(2000L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static void iIiIiiiiIIiii(String path) {
        var1_1 = IIIIIiiiIIIiI.ALLATORIxDEMO;
        synchronized (var1_1) {
            block12: {
                if (!IIIIIiiiIIIiI.iiIiiiiiiiIii) {
                    return;
                }
                IiiiiiiiIIIII = IIIIIiiiIIIiI.IiIIIiiiiIiiI.size() - 1;
                if (true) ** GOTO lbl20
                {
                    catch (Exception IiiiiiiiIIIII) {
                        break block12;
                    }
                    catch (Throwable var2_5) {
                        // empty catch block
                        break block12;
                    }
                }
                do {
                    if (IIIIIiiiIIIiI.IiIIIiiiiIiiI.get(IiiiiiiiIIIII).ALLATORIxDEMO().equals(path)) {
                        return;
                    }
                    --IiiiiiiiIIIII;
lbl20:
                    // 2 sources

                } while (IiiiiiiiIIIII >= 0);
                IiiiiiiiIIIII = new File("sc/music/" + path);
                if (!IiiiiiiiIIIII.exists()) {
                    return;
                }
                IiiiiiiiIIIII = new IIIiIiiiIiIII(path);
                IIIIIiiiIIIiI.IiIIIiiiiIiiI.add(IiiiiiiiIIIII);
                IiiiiiiiIIIII.iiiIiiiiiiIIi();
                IiiiiiiiIIIII.ALLATORIxDEMO(false);
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static void ALLATORIxDEMO(IIIiIiiiIiIII yinxiao) {
        var1_1 = IIIIIiiiIIIiI.ALLATORIxDEMO;
        synchronized (var1_1) {
            try {
                yinxiao.iiiiiiiiIIiii();
                yinxiao.finalize();
                ** GOTO lbl10
            }
            catch (Throwable IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
lbl10:
                // 2 sources

                IIIIIiiiIIIiI.IiIIIiiiiIiiI.remove(yinxiao);
                return;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void ALLATORIxDEMO(String path) {
        Object object = ALLATORIxDEMO;
        synchronized (object) {
            if (iIiIiiiiIiIii == null) return;
            if (!iIiIiiiiIiIii.ALLATORIxDEMO().equals(path)) {
                return;
            }
            iIiIiiiiIiIii.iiiiiiiiIIiii();
            return;
        }
    }
}
