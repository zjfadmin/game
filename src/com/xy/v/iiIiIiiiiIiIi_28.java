/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.RookieGuideBean
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.v;

import com.xy.readbean.RookieGuideBean;
import com.xy.v.IiiiiiiiiIIII;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiIiIiiiiIiIi {
    public static String[] ALLATORIxDEMO = new String[]{"\u7248\u672c\u7279\u8272", "\u529f\u80fd\u4ecb\u7ecd", "\u5347\u7ea7\u653b\u7565", "\u88c5\u5907\u73a9\u6cd5", "\u5957\u88c5\u7cfb\u7edf", "\u6d3b\u52a8\u73a9\u6cd5", "\u7075\u5b9d\u7b26\u77f3", "\u5b50\u5973\u57f9\u517b"};

    public static void ALLATORIxDEMO(DefaultMutableTreeNode top, IiiiiiiiiIIII objectArea) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < ALLATORIxDEMO.length) {
            List<String> IiiiiiiiIIIII2;
            DefaultMutableTreeNode IiiiiiiiIIIII3 = new DefaultMutableTreeNode(ALLATORIxDEMO[IiiiiiiiIIIII]);
            if (iiIiIiiiiIiIi.ALLATORIxDEMO(ALLATORIxDEMO[IiiiiiiiIIIII]) != null && (IiiiiiiiIIIII2 = iiIiIiiiiIiIi.ALLATORIxDEMO(iiIiIiiiiIiIi.ALLATORIxDEMO(ALLATORIxDEMO[IiiiiiiiIIIII]), objectArea)) != null && IiiiiiiiIIIII2.size() > 0) {
                int IiiiiiiiIIIII4 = 0;
                while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.size()) {
                    IiiiiiiiIIIII3.add(new DefaultMutableTreeNode(IiiiiiiiIIIII2.get(IiiiiiiiIIIII4++)));
                }
            }
            ++IiiiiiiiIIIII;
            top.add(IiiiiiiiIIIII3);
        }
    }

    public static String ALLATORIxDEMO(String name, IiiiiiiiiIIII objectArea) {
        String IiiiiiiiIIIII = "";
        for (Map.Entry IiiiiiiiIIIII2 : objectArea.ALLATORIxDEMO().getRookieguide().entrySet()) {
            if (!((RookieGuideBean)IiiiiiiiIIIII2.getValue()).getGuidename().equals(name)) continue;
            IiiiiiiiIIIII = ((RookieGuideBean)IiiiiiiiIIIII2.getValue()).getBootcontent();
        }
        if (!IiiiiiiiIIIII.equals("")) return IiiiiiiiIIIII;
        return null;
    }

    public static String ALLATORIxDEMO(String name) {
        String IiiiiiiiIIIII = "";
        if (name.equals("\u6e38\u620f\u4ecb\u7ecd")) {
            IiiiiiiiIIIII = "#r #r#Y\u6b22\u8fce\u6765\u5230\u5927\u8bdd\u897f\u6e38!!! #38#38#r #r#W\u672c\u670d\u662f\u5de5\u4f5c\u5ba4\u5386\u65f6\u4e00\u5e74#R\u81ea\u4e3b\u7814\u53d1#W\u7248\u672c,\u4e0d\u662f\u968f\u98ce,\u4e0d\u662f\u6728\u5934.#r #r\u6db5\u76d630\u79cd\u771f\u5b9e#G\u7075\u5b9d#W,#G\u6cd5\u5b9d#W\u7cfb\u7edf,#G\u9f99\u795e\u5927\u70ae\u5e2e\u6218#W\u7cfb\u7edf,\u81ea\u5e26\u771f\u5b9e#G\u5929\u751f\u6280\u80fd#W,#G\u53ec\u5524\u517d\u9970\u54c1#W\u7cfb\u7edf,#G\u5957\u88c5#W\u7cfb\u7edf,\u771f\u5b9e#G\u98de\u5347\u70b9\u5316#W,\u5b98\u670d\u7684#GAI\u6311\u6218#W\u4f53\u5236,\u8fdb\u9636\u5f0f\u7684\u73a9\u6cd5\u3002#r #r\u540e\u7eed\u5c06\u63a8\u51fa#G\u5149\u6b66#W\u7cfb\u7edf,#G\u5750\u9a91\u67d3\u8272#W\u7b49\u597d\u73a9\u7684\u7cfb\u7edf\u3002#28#115#r #r\u5e73\u6c11\u9760#R\u65f6\u95f4#W\u80fd\u62e5\u6709\u4e00\u5207,#R\u4eff\u5b98\u957f\u4e45\u670d#W,\u975e\u4e00\u4e24\u5929\u9876\u7ea7,\u9002\u5408\u5e73\u6c11,\u5546\u4eba\u5165\u9a7b,\u559c\u6b22\u5feb\u9910\u7684\u7ed5\u9053!#r #r\u672c\u6e38\u620f\u5bf9\u8fd0\u884c\u7535\u8111\u6709\u4e00\u5b9a\u7684\u8981\u6c42,\u5177\u4f53\u53ef\u4ee5\u67e5\u770b\u7fa4\u6587\u4ef6\u7684\uff08\u6e38\u620f\u8fd0\u884c\u73af\u5883\u53ca\u5efa\u8bae\uff09\u9009\u62e9\u81ea\u5df1\u5408\u9002\u7684\u6e38\u620f\u65b9\u5f0f!";
        } else if (name.equals("\u5145\u503c\u6bd4\u4f8b")) {
            IiiiiiiiIIIII = "#r #r#Y\u672c\u670d\u5145\u503c\u6bd4\u4f8b#R 1 #Y\u6bd4#R 100 #Y,\u9700\u8981\u5145\u503c\u7684\u73a9\u5bb6\u6253\u5f00\u5546\u57ce,\u9009\u62e9\u5143\u5b9d\u5145\u503c!#r #r#W\u5145\u503c#G 100  #W\u9001#G 100 #W#r\u5145\u503c#G 200  #W\u9001#G 200 #W#r\u5145\u503c#G 300  #W\u9001#G 300 #W#r\u5145\u503c#G 400  #W\u9001#G 400 #W#r\u5145\u503c#G 500  #W\u9001#G 500 #W#r\u5145\u503c#G 1000 #W\u9001#G 1000 #W#r\u5145\u503c#G 3000 #W\u9001#G 3000 #W#r #r\u672c\u670d\u4e00\u5207\u5145\u503c\u8d70\u5546\u57ce,\u8d60\u9001\u798f\u5229\u81ea\u52a8\u5230\u8d26,\u65e0\u989d\u5916\u798f\u5229\u3001\u4ee5\u53ca\u7ebf\u4e0b\u5145\u503c\u7684\u8bf4\u6cd5,\u4e3a\u4e86\u6e38\u620f\u7684\u516c\u5e73\u7a33\u5b9a\u6027,\u8bf7\u514d\u5f00\u5c0a\u53e3! ";
        } else if (name.equals("\u5347\u7ea7\u653b\u7565")) {
            IiiiiiiiIIIII = "#r #r\u65b0\u624b\u73a9\u5bb6\u521b\u5efa\u597d\u89d2\u8272\u4ee5\u540e\u8fdb\u5165\u6e38\u620f,\u627e\uff08#G44#W,#G9#W\uff09#G\u65b0\u624b\u4f7f\u8005#W\u9886\u53d6#R\u65b0\u624b\u793c\u5305#W,#r #r\u7136\u540e\u5230#Y\u957f\u5b89\u6742\u8d27\u5e97#W\u8d2d\u4e70\u4eba\u53c2\u679c,\u5403\u5230#R31#W\u7ea7\u540e\u8d2d\u4e7015\u4e2a\u87e0\u6843\u738b,#r #r\u5230#Y\u957f\u5b89\u6865#WNPC#G\u5f20\u95fb#W\u5904\u4f20\u9001\u5230\u957f\u5b89\u6bd4\u6b66\u9986,\u6839\u636e\u5f53\u524d\u79cd\u65cf\u9009\u62e9\u5bf9\u5e94\u7684\u6cd5\u672f\u5e08\u95e8\u4f20\u9001,\u5b66\u4e60\u5b8c\u6280\u80fd\u4ee5\u540e\u5c31\u53ef\u4ee5\u5f00\u59cb\u5347\u7ea7\u4e86.#r #r\u7531\u4e8e\u672c\u6e38\u620f\u5bf9\u7535\u8111\u914d\u7f6e\u6709\u4e00\u5b9a\u8981\u6c42,\u65e0\u6cd5\u591a\u5f00\u7684\u73a9\u5bb6\u53ef\u4ee5\u4f7f\u7528\u65b0\u624b\u793c\u5305\u91cc\u8d60\u9001\u7684#R\u5355\u4eba\u793c\u76d2#W\u8fdb\u884c\u5355\u4eba\u5347\u7ea7\uff0c#r #r\u524d\u671f\u591a\u5f00\u515a\u5347\u7ea7\u961f\u4f0d\u63a8\u8350:#G \u4eba-\u9b54-\u9b54-\u4ed9-\u4ed9#W\uff0c\u5347\u7ea7\u4ee5\u7761\u6740\u4e3a\u4e3b,\u51fa\u624b\u987a\u5e8f:#G \u9b54\u62bd-\u4ed9\u79d2-\u4eba\u7761#W,\u4ec5\u4f9b\u53c2\u8003,\u73a9\u5bb6\u6839\u636e\u5b9e\u9645\u60c5\u51b5\u8fdb\u884c\u8c03\u6574!";
        } else if (name.equals("\u88c5\u5907\u73a9\u6cd5")) {
            IiiiiiiiIIIII = "#r #r#G\u672c\u670d\u88c5\u5907\u5c5e\u6027#R 80\uff05#G\u63a5\u8fd1\u5b98\u65b9\uff0c\u82e5\u5bf9\u88c5\u5907\u5c5e\u6027\u4e0d\u61c2\u7684\u73a9\u5bb6\u53ef\u4ee5\u67e5\u8be2\u5b98\u65b9\uff01";
        } else if (name.equals("\u6d3b\u52a8\u73a9\u6cd5")) {
            IiiiiiiiIIIII = "";
        } else if (name.equals("\u7075\u5b9d\u7b26\u77f3")) {
            IiiiiiiiIIIII = "";
        } else if (name.equals("\u5b50\u5973\u57f9\u517b")) {
            IiiiiiiiIIIII = "#r #r\u6e38\u620f\u91cc\u76f8\u7231\u7684\u7537\u3001\u5973\u89d2\u8272\u53ef\u4ee5\u4e00\u8d77\u7ec4\u961f\u5230#Y\u957f\u5b89\u57ce#W\uff08#G232#W,#G224#W\uff09#G\u6708\u8001#W\u5904\u8fdb\u884c\u7ed3\u5a5a.#r #r\u5a5a\u540e\u53ef\u4ee5\u7ec4\u961f\u5230#Y\u957f\u5b89\u57ce#W\uff08#G162#W,#G121#W\uff09#G\u8d85\u7ea7\u7ba1\u5bb6#W\u5904\u5f00\u59cb\u6d1e\u623f,\u6d1e\u623f\u5b8c\u6bd5\u540e\u7b49\u5f851\u5206\u949f\u5b69\u5b50\u51fa\u751f,#r #r\u5973\u65b9\u9009\u62e9\u786e\u5b9a\u5219\u5b69\u5b50\u5728\u5973\u65b9\u8eab\u4e0a,\u5973\u65b9\u9009\u62e9\u53d6\u6d88\u5219\u5b69\u5b50\u5728\u7537\u65b9\u8eab\u4e0a!";
        } else if (name.equals("\u7248\u672c\u7279\u8272")) {
            IiiiiiiiIIIII = "#r #r#Y                \u552f\u4e00\u72ec\u5bb6\u7248\u672c#r #r#W\u672c\u670d\u6a21\u62df\u5b98\u65b9\u8fd0\u8425\uff0c\u91c7\u7528#G\u5b98\u65b9\u5168\u670d\u51e0\u7387\u5236#W\u8bbe\u5b9a#r #r\u8ba9\u4f60\u4f53\u9a8c#R 70% #W\u76f8\u4f3c\u7a0b\u5ea6\u4eff\u5b98\u73a9\u6cd5\uff0c\u5b98\u65b9#G\u602a\u7269\u667a\u80fdAI#W,#G\u51e0\u7387\u611f#W\uff0c\u8ba9\u4f60\u5145\u6ee1\u6fc0\u60c5\u3002#r #r#W\u91c7\u7528\u5b98\u65b9#R\u6000\u65e7#W\u6d3b\u52a8\u4e3b\u9898\uff0c#G\u57ce\u4e1c\u9b45\u5f71#W\uff0c#G\u9f99\u5bab\u5bfb\u5b9d#W\uff0c#G\u5927\u95f9\u5929\u5bab#W\uff0c#G\u5929\u964d\u7075\u7334#W\uff0c#G\u5929\u5bab\u5bfb\u5b9d#W\uff0c#G\u5929\u964d\u7965\u745e#W\uff0c#G\u5e74\u5e74\u6709\u9c7c#W\uff0c\u7b49\u7b49\u3002";
        } else if (name.equals("\u529f\u80fd\u4ecb\u7ecd")) {
            IiiiiiiiIIIII = "#r #r#Y\u5feb\u6377\u952e\uff1a\uff08#R\u548c\u5b98\u65b999%\u4e00\u81f4#Y\uff09#r#G\u6218\u6597\u5916\uff1a#W#r#YAlt+1\uff1a#W\u5c0f\u5730\u56fe          #YAlt+S\uff1a#W\u7cfb\u7edf\u8bbe\u7f6e#r#YAlt+W\uff1a#W\u4eba\u7269\u4fe1\u606f        #YAlt+R\uff1a#W\u5750\u9a91#r#YAlt+X\uff1a#W\u4ea4\u6613            #YAlt+E\uff1a#W\u9053\u5177\u680f#r#YAlt+Q\uff1a#W\u4efb\u52a1\u680f          #YAlt+T\uff1a#W\u7ec4\u961f\u529f\u80fd#r#YAlt+Y\uff1a#W\u5b69\u5b50\u529f\u80fd        #YAlt+A\uff1a#W\u5207\u78cb#r#YAlt+O\uff1a#W\u53ec\u5524\u517d\u754c\u9762      #YAlt+F\uff1a#W\u597d\u53cb\u529f\u80fd#r#YAlt+V\uff1a#W\u6cd5\u5b9d\u754c\u9762        #YAlt+M\uff1a#W\u5e2e\u6d3e\u754c\u9762#r#YAlt+G\uff1a#W\u7ed9\u4e88 #r #r#G\u6218\u6597\u5185\uff1a#r#YAlt+W\uff1a#W\u6cd5\u672f\u5217\u8868        #YAlt+E\uff1a#W\u9053\u5177\u680f#r#YAlt+D\uff1a#W\u9632\u5fa1            #YAlt+T\uff1a#W\u4fdd\u62a4#r#YAlt+A\uff1a#W\u968f\u673a\u7269\u7406\u653b\u51fb    #YAlt+B\uff1a#W\u6355\u6293#r#YAlt+S\uff1a#W\u4e0a\u4e00\u6b21\u4f7f\u7528\u8fc7\u7684\u6280\u80fd#r #r#R\u4e0b\u8f7d\u6e38\u620f\uff1a#r#W\u5f53\u524d\u6240\u5728\u7fa4\u804a\u6253#G \u4e0b\u8f7d #W\uff0c\u673a\u5668\u4eba\u56de\u590d\u6709\u7fa4\u7a7a\u95f4#G\u4e0b\u8f7d\u5730\u5740#W\u3002\u5207\u8bb0#Y\u5173\u95ed\u6740\u6bd2\u8f6f\u4ef6#W\uff0c\u4e0d\u7136\u5ba2\u6237\u7aef\u4e0d\u80fd\u6b63\u5e38\u5b89\u88c5\u4f7f\u7528\u3002#r #r#R\u6e38\u620f\u6ce8\u518c\uff1a#r#W\u53ef\u5728\u7fa4\u804a\u5185\u8f93\u5165#G \u6ce8\u518c #W\uff0c\u673a\u5668\u4eba\u81ea\u52a8\u56de\u590d\u3002#r\u5ba2\u6237\u7aef#Y\u66f4\u65b0\u5b8c\u6bd5#W\u540e\uff0c\u70b9#G \u5f00\u59cb\u6e38\u620f #W\u8fdb\u5165\u767b\u5f55\u7a97\u53e3#Y\u9009\u62e9\u533a\u670d#W\u8fdb\u5165\u8d26\u53f7\u754c\u9762\u70b9\u51fb#G\u6ce8\u518c#W\u3002#r #r#R\u521b\u5efa\u89d2\u8272\uff1a#r#W\u6839\u636e\u81ea\u8eab\u60c5\u51b5\u521b\u5efa\u597d\u89d2\u8272#r#YNPC\u65b0\u624b\u4f7f\u8005#W\u6709\u65b0\u624b\u5ba0\u7269\uff0c\u6839\u636e#G\u81ea\u5df1\u7684\u559c\u597d#W\u5e26\u4e0a\u4e00\u53ea\u5c31\u5f00\u5e72\u5427#89#r#Y\u65b0\u624b\u793c\u5305#W\u6253\u5f00\u53ef\u83b7\u5f97#G\u65b0\u624b\u88c5\u5907#W\u4e00\u5957\u3002#28#r #r";
        } else if (name.equals("\u5957\u88c5\u7cfb\u7edf")) {
            IiiiiiiiIIIII = "#r #r#Y                \u5957\u88c5\u7cfb\u7edf#r#W\u5206\u4e3a:#r#G\u5957\u88c5\u5408\u6210     \u5957\u88c5\u6d17\u7ec3     \u5957\u88c5\u6536\u5f55#r\u5957\u88c5\u6d17\u7ec3     \u5957\u88c5\u5347\u7ea7     \u5957\u88c5\u8f6c\u79fb/\u62c6\u89e3#r #r#Y\u7075\u4fee\u503c:#r#W\u4f5c\u4e3a\u5957\u88c5\u6240\u6709\u529f\u80fd\u7684#R\u57fa\u7840\u6750\u6599#W\uff0c\u7075\u4fee\u503c\u53ef\u4ee5\u4f7f\u7528#Y\u4e5d\u5929\u7384\u7389#W\u6765\u5151\u6362\uff0c\u4e5f\u53ef\u4ee5\u4f7f\u7528#Y\u65e0\u7528\u7684\u7389\u7b26#W\u6765\u5151\u6362\uff0c#r #r#W\u6ce8\uff1a#R\u7389\u7b26\u548c\u5408\u6210\u540e\u7684\u5957\u88c5\u90fd\u65e0\u6cd5\u4ea4\u6613\u3002";
        }
        if (!IiiiiiiiIIIII.equals("")) return IiiiiiiiIIIII;
        return null;
    }

    public static Integer ALLATORIxDEMO(String name) {
        int IiiiiiiiIIIII = 0;
        if (name.equals("\u6e38\u620f\u4ecb\u7ecd")) {
            IiiiiiiiIIIII = 1;
        } else if (name.equals("\u5145\u503c\u6bd4\u4f8b")) {
            IiiiiiiiIIIII = 2;
        } else if (name.equals("\u5347\u7ea7\u653b\u7565")) {
            IiiiiiiiIIIII = 3;
        } else if (name.equals("\u88c5\u5907\u73a9\u6cd5")) {
            IiiiiiiiIIIII = 4;
        } else if (name.equals("\u6d3b\u52a8\u73a9\u6cd5")) {
            IiiiiiiiIIIII = 5;
        } else if (name.equals("\u7075\u5b9d\u7b26\u77f3")) {
            IiiiiiiiIIIII = 6;
        } else if (name.equals("\u5b50\u5973\u57f9\u517b")) {
            IiiiiiiiIIIII = 7;
        } else if (name.equals("\u7248\u672c\u7279\u8272")) {
            IiiiiiiiIIIII = 8;
        } else if (name.equals("\u529f\u80fd\u4ecb\u7ecd")) {
            IiiiiiiiIIIII = 9;
        } else if (name.equals("\u5957\u88c5\u7cfb\u7edf")) {
            IiiiiiiiIIIII = 10;
        }
        if (IiiiiiiiIIIII != 0) return IiiiiiiiIIIII;
        return null;
    }

    public static List<String> ALLATORIxDEMO(int fid, IiiiiiiiiIIII objectArea) {
        Map.Entry IiiiiiiiIIIII3;
        if (objectArea.ALLATORIxDEMO().getRookieguide() == null) {
            return null;
        }
        Object IiiiiiiiIIIII2 = new ArrayList<String>();
        for (Map.Entry IiiiiiiiIIIII3 : objectArea.ALLATORIxDEMO().getRookieguide().entrySet()) {
            if (((RookieGuideBean)IiiiiiiiIIIII3.getValue()).getFid() != fid) continue;
            IiiiiiiiIIIII2.add((String)((RookieGuideBean)IiiiiiiiIIIII3.getValue()).getGuidename());
        }
        if (fid != 5) return IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = new ArrayList();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.size()) {
            IiiiiiiiIIIII3.add((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4++));
        }
        IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII2.size()) {
            if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5468\u4e00\u6d3b\u52a8")) {
                IiiiiiiiIIIII3.set(0, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5468\u4e8c\u6d3b\u52a8")) {
                IiiiiiiiIIIII3.set(1, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5468\u4e09\u6d3b\u52a8")) {
                IiiiiiiiIIIII3.set(2, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5468\u56db\u6d3b\u52a8")) {
                IiiiiiiiIIIII3.set(3, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5468\u4e94\u6d3b\u52a8")) {
                IiiiiiiiIIIII3.set(4, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5468\u516d\u6d3b\u52a8")) {
                IiiiiiiiIIIII3.set(5, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5468\u65e5\u6d3b\u52a8")) {
                IiiiiiiiIIIII3.set(6, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u5730\u715e\u661f\u5206\u5e03")) {
                IiiiiiiiIIIII3.set(7, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            } else if (((String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4)).equals("\u8fdb\u9636\u6311\u6218")) {
                IiiiiiiiIIIII3.set(8, (String)IiiiiiiiIIIII2.get(IiiiiiiiIIIII4));
            }
            ++IiiiiiiiIIIII4;
        }
        IiiiiiiiIIIII2.clear();
        IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
        return IiiiiiiiIIIII2;
    }
}
