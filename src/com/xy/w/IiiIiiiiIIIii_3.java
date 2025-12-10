/*
 * Decompiled with CFR 0.152.
 */
package com.xy.w;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIiiiiIIIii {
    private int IiiiiiiiIIIII;
    public RandomAccessFile ALLATORIxDEMO;

    /*
     * Exception decompiling
     */
    public boolean ALLATORIxDEMO() {
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

    public int ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public IiiIiiiiIIIii(String fileName) {
        try {
            this.ALLATORIxDEMO = new RandomAccessFile(fileName, "r");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void ALLATORIxDEMO(int use) {
        this.IiiiiiiiIIIII = use;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(long pos, byte[] bs) throws IOException {
        IiiIiiiiIIIii iiiIiiiiIIIii = this;
        synchronized (iiiIiiiiIIIii) {
            this.IiiiiiiiIIIII = 0;
            this.ALLATORIxDEMO.seek(pos);
            this.ALLATORIxDEMO.read(bs);
            return;
        }
    }
}
