/*
 * Decompiled with CFR 0.152.
 */
package com.xy.v;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiiIiiiiIiIi {
    public static Random iIiIiiiiIiIii = new Random();
    public static BigDecimal IiIIIiiiiIiiI;
    public static long iiIiiiiiiiIii;
    public static long IiiiiiiiIIIII;
    public static final int ALLATORIxDEMO = 20;

    /*
     * Unable to fully structure code
     */
    public static List<String> ALLATORIxDEMO(String path) {
        block9: {
            IiiiiiiiIIIII = new File(path);
            if (!IiiiiiiiIIIII.exists()) {
                return null;
            }
            IiiiiiiiIIIII = new ArrayList<String>();
            try {
                IiiiiiiiIIIII = new FileInputStream(IiiiiiiiIIIII);
                IiiiiiiiIIIII = new InputStreamReader((InputStream)IiiiiiiiIIIII, "UTF-8");
                IiiiiiiiIIIII = new BufferedReader(IiiiiiiiIIIII);
                if (true) ** GOTO lbl23
                {
                    catch (IOException IiiiiiiiIIIII) {
                        IiiiiiiiIIIII.printStackTrace();
                        break block9;
                    }
                }
            }
            catch (FileNotFoundException IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                return IiiiiiiiIIIII;
            }
            catch (IOException IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
                return IiiiiiiiIIIII;
            }
            do {
                IiiiiiiiIIIII.add(IiiiiiiiIIIII);
lbl23:
                // 2 sources

            } while ((IiiiiiiiIIIII = IiiiiiiiIIIII.readLine()) != null);
        }
        IiiiiiiiIIIII.close();
        IiiiiiiiIIIII.close();
        IiiiiiiiIIIII.close();
        return IiiiiiiiIIIII;
    }

    public static boolean iIiIiiiiIIiii(String name) {
        boolean IiiiiiiiIIIII = true;
        String[] IiiiiiiiIIIII2 = "\u7ba1\u7406|GM|gm|Gm|gM|\u5356|\u7269\u96c6|\u83dc|\u65b0\u5f00|\u7fa4|\u53f7|\u5e01|\u8279|\u8d31".split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (name.contains(IiiiiiiiIIIII2[IiiiiiiiIIIII3])) {
                IiiiiiiiIIIII = false;
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    public static int ALLATORIxDEMO(BigDecimal se) {
        int IiiiiiiiIIIII = se.intValue() % 10;
        if (IiiiiiiiIIIII == 1) return 1;
        if (IiiiiiiiIIIII == 2) return 1;
        if (IiiiiiiiIIIII == 3) return 1;
        if (IiiiiiiiIIIII == 7) return 1;
        if (IiiiiiiiIIIII != 9) return 0;
        return 1;
    }

    /*
     * Exception decompiling
     */
    public static String iIiIiiiiIIiii(String path) {
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

    public static String iIiIiiiiIIiIi() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        String IiiiiiiiIIIII2 = System.getProperty("os.name");
        IiiiiiiiIIIII2 = IiiiiiiiIIIII2.toUpperCase().replace(" ", "");
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("-");
        }
        IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
        IiiiiiiiIIIII2 = IiiiIiiiiIiIi.iIiIiiiiIIiii();
        IiiiiiiiIIIII2 = IiiiiiiiIIIII2.toUpperCase().replace(" ", "");
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("-");
        }
        IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
        IiiiiiiiIIIII2 = IiiiIiiiiIiIi.iiiIiiiiiiIIi();
        IiiiiiiiIIIII2 = IiiiiiiiIIIII2.toUpperCase().replace(" ", "");
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("-");
        }
        IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
        IiiiiiiiIIIII2 = IiiiIiiiiIiIi.ALLATORIxDEMO();
        IiiiiiiiIIIII2 = IiiiiiiiIIIII2.toUpperCase().replace(" ", "");
        if (IiiiiiiiIIIII.length() != 0) {
            IiiiiiiiIIIII.append("-");
        }
        IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
        return IiiiiiiiIIIII.toString();
    }

    public static String ALLATORIxDEMO(String s) {
        String IiiiiiiiIIIII = "";
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < s.length()) {
            String IiiiiiiiIIIII3 = Integer.toHexString(s.charAt(IiiiiiiiIIIII2));
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII) + IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII;
    }

    static {
        IiiiiiiiIIIII = 180000L;
        iiIiiiiiiiIii = 3500L;
        IiIIIiiiiIiiI = new BigDecimal("99999999999");
    }

    public static void iiiIiiiiiiIIi(String path, String txt) {
        try {
            OutputStreamWriter IiiiiiiiIIIII = new OutputStreamWriter((OutputStream)new FileOutputStream(new File(path)), "UTF-8");
            BufferedWriter IiiiiiiiIIIII2 = new BufferedWriter(IiiiiiiiIIIII);
            IiiiiiiiIIIII2.write(txt);
            IiiiiiiiIIIII2.close();
            IiiiiiiiIIIII.close();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            try {
                IiiiiiiiIIIII.printStackTrace();
                return;
            }
            catch (Exception IiiiiiiiIIIII3) {
                IiiiiiiiIIIII3.printStackTrace();
                return;
            }
        }
    }

    public static String iiiIiiiiiiIIi() {
        String IiiiiiiiIIIII = "";
        try {
            Process IiiiiiiiIIIII2 = Runtime.getRuntime().exec(new String[]{"wmic", "cpu", "get", "ProcessorId"});
            IiiiiiiiIIIII2.getOutputStream().close();
            Scanner scanner = new Scanner(IiiiiiiiIIIII2.getInputStream());
            String IiiiiiiiIIIII3 = scanner.next();
            IiiiiiiiIIIII = scanner.next();
            scanner.close();
            return IiiiiiiiIIIII;
        }
        catch (IOException IiiiiiiiIIIII4) {
            IiiiiiiiIIIII4.printStackTrace();
            return IiiiiiiiIIIII;
        }
    }

    public static String iIiIiiiiIIiii() {
        try {
            InetAddress IiiiiiiiIIIII = InetAddress.getLocalHost();
            return IiiiiiiiIIIII.getHostName().toString().replace("-", ",");
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return "00000000000000";
        }
    }

    public static boolean ALLATORIxDEMO(String ChangeName) {
        String[] IiiiiiiiIIIII = new String[]{"!", "|", "*", "&", "@", "#", "$", "%", "^", "/"};
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (ChangeName.indexOf(IiiiiiiiIIIII[IiiiiiiiIIIII2]) != -1) {
                return false;
            }
            ++IiiiiiiiIIIII2;
        }
        return true;
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public static String ALLATORIxDEMO() {
        try {
            InetAddress IiiiiiiiIIIII = InetAddress.getLocalHost();
            byte[] IiiiiiiiIIIII2 = NetworkInterface.getByInetAddress(IiiiiiiiIIIII).getHardwareAddress();
            StringBuffer IiiiiiiiIIIII3 = new StringBuffer("");
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.length) {
                String IiiiiiiiIIIII5 = Integer.toHexString(IiiiiiiiIIIII2[IiiiiiiiIIIII4] & 0xFF);
                if (IiiiiiiiIIIII5.length() == 1) {
                    IiiiiiiiIIIII3.append("0" + IiiiiiiiIIIII5);
                } else {
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII5);
                }
                ++IiiiiiiiIIIII4;
            }
            return IiiiiiiiIIIII3.toString().toUpperCase();
        }
        catch (Exception IiiiiiiiIIIII) {
            return "000000000000";
        }
    }

    public static String ALLATORIxDEMO(BigDecimal se) {
        int IiiiiiiiIIIII = se.intValue() % 10;
        if (IiiiiiiiIIIII == 1) return "\u7537";
        if (IiiiiiiiIIIII == 2) return "\u7537";
        if (IiiiiiiiIIIII == 3) return "\u7537";
        if (IiiiiiiiIIIII == 7) return "\u7537";
        if (IiiiiiiiIIIII != 9) return "\u5973";
        return "\u7537";
    }

    public static void iIiIiiiiIIiii(String path, String text) {
        try {
            File IiiiiiiiIIIII = new File(path);
            if (!IiiiiiiiIIIII.exists()) {
                IiiiiiiiIIIII.createNewFile();
            }
            IiiiIiiiiIiIi.ALLATORIxDEMO(path, text);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public static void ALLATORIxDEMO(String path, String text) {
        try {
            OutputStreamWriter IiiiiiiiIIIII = new OutputStreamWriter((OutputStream)new FileOutputStream(path), "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(IiiiiiiiIIIII);
            bufferedWriter.write(text);
            bufferedWriter.close();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }
}
