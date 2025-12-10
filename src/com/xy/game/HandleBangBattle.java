/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iIiIiiiiiiiIi
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.d.IIiIiiiiIiIII
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.game.HandleOption
 *  com.xy.game.RoleData
 *  com.xy.readbean.Door
 *  com.xy.scene.BangFightScene
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 */
package com.xy.game;

import com.xy.a.a.iIiIiiiiiiiIi;
import com.xy.a.iIIiiiiiIIIIi;
import com.xy.d.IIiIiiiiIiIII;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.readbean.Door;
import com.xy.scene.BangFightScene;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class HandleBangBattle {
    public static String ALLATORIxDEMO(String type, iIIiiiiiIIIIi npcView) {
        if (type.equals("\u9a6f\u517b\u53c2\u6218\u53ec\u5524\u517d\u4eb2\u5bc6")) {
            BigDecimal IiiiiiiiIIIII = npcView.ALLATORIxDEMO().getLoginResult().getSummoning_id();
            if (IiiiiiiiIIIII != null) return "44|" + IiiiiiiiIIIII;
            npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u5e76\u6ca1\u6709\u643a\u5e26\u53ec\u5524\u517d!!!");
            return null;
        }
        Mount IiiiiiiiIIIII = npcView.ALLATORIxDEMO().getMount(npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getMount_id());
        if (IiiiiiiiIIIII != null) return String.valueOf(type.equals("\u9a6f\u517b\u5750\u9a91\u7ecf\u9a8c") ? "45|" : "46|") + IiiiiiiiIIIII.getMid();
        npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u5f53\u524d\u672a\u9a91\u5750\u9a91");
        return null;
    }

    public static void iIiIiiiiIIiii(String type, iIIiiiiiIIIIi npcView) {
        Lingbao IiiiiiiiIIIII;
        RoleData IiiiiiiiIIIII2 = npcView.ALLATORIxDEMO();
        if (type.equals("\u6279\u91cf\u9a6f\u517b\u53c2\u6218\u53ec\u5524\u517d\u4eb2\u5bc6")) {
            BigDecimal IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getLoginResult().getSummoning_id();
            if (IiiiiiiiIIIII3 == null) {
                npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u5e76\u6ca1\u6709\u643a\u5e26\u53ec\u5524\u517d!!!");
                return;
            }
            iIiIiiiiiiiIi IiiiiiiiIIIII4 = (iIiIiiiiiiiIi)npcView.ALLATORIxDEMO().iiiIiiiiiiIIi(162);
            IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII3, type);
            return;
        }
        if (type.equals("\u6279\u91cf\u9a6f\u517b\u5750\u9a91\u7ecf\u9a8c") || type.equals("\u6279\u91cf\u9a6f\u517b\u5750\u9a91\u6280\u80fd\u719f\u7ec3\u5ea6")) {
            Mount IiiiiiiiIIIII5 = IiiiiiiiIIIII2.getMount(npcView.iiIIiiiiIiIIi.roleUnit.iIiIiiiiIiIii.getMount_id());
            if (IiiiiiiiIIIII5 == null) {
                npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u5f53\u524d\u672a\u9a91\u5750\u9a91");
                return;
            }
            iIiIiiiiiiiIi IiiiiiiiIIIII6 = (iIiIiiiiiiiIi)npcView.ALLATORIxDEMO().iiiIiiiiiiIIi(162);
            IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII5.getMid(), type);
            return;
        }
        if (type.equals("\u6279\u91cf\u9a6f\u517b\u7075\u5b9d\u5951\u5408") || type.equals("\u6279\u91cf\u9a6f\u517b\u7075\u5b9d\u7ecf\u9a8c")) {
            Lingbao IiiiiiiiIIIII7;
            Lingbao lingbao = IiiiiiiiIIIII7 = IiiiiiiiIIIII2.lingbaoChoses[0] != null ? IiiiiiiiIIIII2.getLingbao(IiiiiiiiIIIII2.lingbaoChoses[0]) : null;
            if (IiiiiiiiIIIII7 == null) {
                npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u5e76\u6ca1\u6709\u643a\u5e26\u7075\u5b9d!!!");
                return;
            }
            iIiIiiiiiiiIi IiiiiiiiIIIII8 = (iIiIiiiiiiiIi)npcView.ALLATORIxDEMO().iiiIiiiiiiIIi(162);
            IiiiiiiiIIIII8.ALLATORIxDEMO(IiiiiiiiIIIII7.getBaoid(), type);
            return;
        }
        if (!type.equals("\u6279\u91cf\u9a6f\u517b\u9996\u4e2a\u53c2\u6218\u6cd5\u5b9d\u7ecf\u9a8c")) return;
        Lingbao lingbao = IiiiiiiiIIIII = IiiiiiiiIIIII2.lingbaoChoses[1] != null ? IiiiiiiiIIIII2.getLingbao(IiiiiiiiIIIII2.lingbaoChoses[1]) : null;
        if (IiiiiiiiIIIII == null) {
            npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u60a8\u5e76\u6ca1\u6709\u643a\u5e26\u6cd5\u5b9d!!!(\u6700\u5de6\u8fb9\u53c2\u6218\u7684\u6cd5\u5b9d)");
            return;
        }
        iIiIiiiiiiiIi IiiiiiiiIIIII9 = (iIiIiiiiiiiIi)npcView.ALLATORIxDEMO().iiiIiiiiiiIIi(162);
        IiiiiiiiIIIII9.ALLATORIxDEMO(IiiiiiiiIIIII.getBaoid(), type);
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String type, iIIiiiiiIIIIi npcView) {
        String IiiiiiiiIIIII;
        String IiiiiiiiIIIII2 = null;
        switch (type) {
            case "\u6211\u6765\u62a5\u540d\u53c2\u52a0\u5e2e\u6218": {
                IiiiiiiiIIIII2 = "0";
                break;
            }
            case "\u6211\u8981\u53c2\u52a0\u5e2e\u6218": {
                IiiiiiiiIIIII2 = "1";
                break;
            }
            case "\u6211\u8981\u8131\u79bb\u5e2e\u6218": {
                IiiiiiiiIIIII2 = "2";
                break;
            }
            case "\u6211\u8981\u8fdb\u5165\u9ad8\u624b\u6311\u6218\u8d5b": {
                IiiiiiiiIIIII2 = "3";
                break;
            }
            case "\u6211\u8981\u8fdb\u5165\u6218\u573a": {
                IiiiiiiiIIIII2 = "4";
                break;
            }
            case "\u56de\u5230\u8425\u5730": {
                IiiiiiiiIIIII2 = "5";
                break;
            }
            case "\u6211\u8981\u6311\u6218": {
                IiiiiiiiIIIII2 = "6";
                break;
            }
            case "\u6211\u8981\u53d6\u6d88\u6311\u6218": {
                IiiiiiiiIIIII2 = "7";
                break;
            }
            case "\u6211\u8981\u5e94\u6218": {
                IiiiiiiiIIIII2 = "8";
                break;
            }
            case "\u6211\u8981\u7ed9\u5854\u5145\u80fd": {
                if (IiiiiiiiIIIII2 == null) {
                    IiiiiiiiIIIII2 = "9|";
                }
            }
            case "\u6211\u8981\u653b\u51fb\u5854": {
                if (IiiiiiiiIIIII2 == null) {
                    IiiiiiiiIIIII2 = "10|";
                }
            }
            case "\u6211\u8981\u53d6\u6d88\u64cd\u4f5c": {
                if (IiiiiiiiIIIII2 == null) {
                    IiiiiiiiIIIII2 = "11|";
                }
            }
            case "\u6211\u8981\u6390\u65ad\u70ae\u706b": {
                if (IiiiiiiiIIIII2 == null) {
                    IiiiiiiiIIIII2 = "12|";
                }
                if (npcView.iiIIiiiiIiIIi.scene == null) return;
                if (!(npcView.iiIIiiiiIiIIi.scene instanceof BangFightScene)) {
                    return;
                }
                IiiiiiiiIIIII = (BangFightScene)npcView.iiIIiiiiIiIIi.scene;
                if (((BangFightScene)IiiiiiiiIIIII).buildMouse == null) {
                    return;
                }
                IiiiiiiiIIIII2 = String.valueOf(IiiiiiiiIIIII2) + ((BangFightScene)IiiiiiiiIIIII).buildMouse.getBh();
                break;
            }
            case "\u6211\u8981\u9886\u53d6\u5b88\u536b\u87e0\u6843\u56ed\u5956\u52b1": {
                IiiiiiiiIIIII2 = "13";
                break;
            }
            case "\u6211\u8981\u53bb\u5b88\u536b\u87e0\u6843\u56ed": {
                void IiiiiiiiIIIII3;
                Door door = new Door();
                IiiiiiiiIIIII3.setDoormap("3324");
                IiiiiiiiIIIII3.setDoorpoint("1800|600");
                HandleOption.ALLATORIxDEMO((Door)door, (int)2, (GameView)npcView.iiIIiiiiIiIIi);
                return;
            }
            case "\u8fdb\u5165\u5b9d\u5e93\u4e8c\u5c42": {
                IiiiiiiiIIIII2 = "14";
                break;
            }
            case "\u8fdb\u5165\u5b9d\u5e93\u4e09\u5c42": {
                IiiiiiiiIIIII2 = "15";
                break;
            }
            case "\u8fdb\u5165\u5b9d\u5e93\u56db\u5c42": {
                IiiiiiiiIIIII2 = "16";
                break;
            }
            case "\u6311\u6218\u4e00\u5c42\u5b88\u62a4\u8005": {
                IiiiiiiiIIIII2 = "17";
                break;
            }
            case "\u6311\u6218\u4e8c\u5c42\u5b88\u62a4\u8005": {
                IiiiiiiiIIIII2 = "18";
                break;
            }
            case "\u6311\u6218\u4e09\u5c42\u5b88\u62a4\u8005": {
                IiiiiiiiIIIII2 = "19";
                break;
            }
            case "\u6311\u6218\u56db\u5c42\u5b88\u62a4\u8005": {
                IiiiiiiiIIIII2 = "20";
                break;
            }
            case "\u53c2\u52a0\u79cd\u65cf\u8d5b": {
                npcView.iiIIiiiiIiIIi.getFormManagement().iiiIiiiiiiIIi(41);
                IiiiiiiiIIIII2 = "21";
                break;
            }
            case "\u4e00\u952e\u9886\u53d6\u79cd\u65cf\u8d5b\u5956\u52b1": {
                IiiiiiiiIIIII2 = "22";
                break;
            }
            case "\u79cd\u65cf\u8d5b\u5339\u914d": {
                IiiiiiiiIIIII2 = "23";
                break;
            }
            case "\u53d6\u6d88\u79cd\u65cf\u8d5b\u5339\u914d": {
                IiiiiiiiIIIII2 = "24";
                break;
            }
            case "\u6211\u8981\u63a5\u6536\u6218\u4e66": {
                IiiiiiiiIIIII2 = "26|" + npcView.iIiIiiiiIIiii();
                break;
            }
            case "\u6211\u8981\u53d6\u6d88\u6218\u4e66": {
                IiiiiiiiIIIII2 = "27|" + npcView.iIiIiiiiIIiii();
                break;
            }
            case "\u6211\u8981\u89c2\u6218": {
                IiiiiiiiIIIII2 = "28|" + npcView.iIiIiiiiIIiii();
                break;
            }
            case "\u53c2\u52a0\u64c2\u53f0\u8d5b": {
                IiiiiiiiIIIII2 = "29";
                break;
            }
            case "\u4e00\u952e\u9886\u53d6\u64c2\u53f0\u8d5b\u5956\u52b1": {
                IiiiiiiiIIIII2 = "30";
                break;
            }
            case "\u6211\u8981\u8fdb\u884c\u4e5d\u751f\u4e5d\u6b7b\u6311\u6218": {
                IiiiiiiiIIIII2 = "31";
                break;
            }
            case "\u5f00\u542f\u6843\u6e90\u4ed9\u5883": {
                IiiiiiiiIIIII2 = "32";
                break;
            }
            case "\u6211\u8981\u53c2\u52a0\u8de8\u670d\u8054\u8d5b": {
                IiiiiiiiIIIII2 = "33";
                break;
            }
            case "\u6211\u8981\u56de\u5230500\u5e74\u524d": {
                IiiiiiiiIIIII2 = "34";
                break;
            }
            case "\u6211\u6765\u4e0a\u4ea4\u5730\u715e\u661f\u4e4b\u9b42": 
            case "\u6211\u6765\u4e0a\u4ea4\u4e0a\u53e4\u5b9d\u7bb1": {
                iiiiiiiiiiIiI IiiiiiiiIIIII4 = npcView.ALLATORIxDEMO();
                if (IiiiiiiiIIIII4 == null) return;
                if (!(IiiiiiiiIIIII4 instanceof IIiIiiiiIiIII)) {
                    return;
                }
                IIiIiiiiIiIII IiiiiiiiIIIII5 = (IIiIiiiiIiIII)IiiiiiiiIIIII4;
                long IiiiiiiiIIIII6 = IiiiiiiiIIIII4.iiIiIiiiiIIIi - npcView.iiIIiiiiIiIIi.roleUnit.iiIiIiiiiIIIi;
                long IiiiiiiiIIIII7 = IiiiiiiiIIIII4.IIiiiiiiiIIIi - npcView.iiIIiiiiIiIIi.roleUnit.IIiiiiiiiIIIi;
                if (Math.abs(IiiiiiiiIIIII6) >= 200L || Math.abs(IiiiiiiiIIIII7) >= 200L) {
                    npcView.iiIIiiiiIiIIi.iiiIiiiiiiIIi("\u4f60\u79bbNPC\u592a\u8fdc\u4e86");
                    return;
                }
                IiiiiiiiIIIII2 = "35|" + IiiiiiiiIIIII5.iiiIiiiiiiiIi.getNpctype();
                break;
            }
            case "\u6211\u8981\u53c2\u89c2\u4e0a\u53e4\u6218\u573a\u7684\u98ce\u91c7": {
                IiiiiiiiIIIII2 = "36";
                break;
            }
            case "\u9001\u6211\u56de\u540e\u65b9\u8425\u5730": {
                IiiiiiiiIIIII2 = "37";
                break;
            }
            case "\u9886\u53d6\u5927\u95f9\u5929\u5bab\u5956\u52b1": {
                IiiiiiiiIIIII2 = "38";
                break;
            }
            case "\u6211\u8981\u53c2\u52a0\u6c34\u9646\u5927\u4f1a": {
                IiiiiiiiIIIII2 = "39";
                break;
            }
            case "\u9886\u53d6\u6c34\u9646\u5927\u4f1a\u5956\u52b1": {
                IiiiiiiiIIIII2 = "40";
                break;
            }
            case "\u9886\u53d6\u7ecf\u9a8c\u52a0\u6210": {
                IiiiiiiiIIIII2 = "41";
                break;
            }
            case "\u9886\u53d6\u5f3a\u6cd5\u52a0\u6210": {
                IiiiiiiiIIIII2 = "42";
                break;
            }
            case "\u9886\u53d6\u6297\u6027\u52a0\u6210": {
                IiiiiiiiIIIII2 = "43";
                break;
            }
            case "\u9a6f\u517b\u53c2\u6218\u53ec\u5524\u517d\u4eb2\u5bc6": 
            case "\u9a6f\u517b\u5750\u9a91\u6280\u80fd\u719f\u7ec3\u5ea6": 
            case "\u9a6f\u517b\u5750\u9a91\u7ecf\u9a8c": {
                IiiiiiiiIIIII2 = HandleBangBattle.ALLATORIxDEMO(type, npcView);
                break;
            }
            case "\u5347\u7ea7\u5e2e\u6d3e\u7b49\u7ea7": {
                IiiiiiiiIIIII2 = "47";
                break;
            }
            case "\u5347\u7ea7\u79d1\u6280\u7b49\u7ea7": {
                IiiiiiiiIIIII2 = "48";
                break;
            }
            case "\u5347\u7ea7\u9a6f\u517b\u5e08\u7b49\u7ea7": {
                IiiiiiiiIIIII2 = "49";
                break;
            }
            case "\u6211\u8981\u53c2\u52a0\u5927\u4e71\u6597": {
                IiiiiiiiIIIII2 = "50";
                break;
            }
            case "\u9886\u53d6\u5927\u4e71\u6597\u5403\u9e21\u5956\u52b1": {
                IiiiiiiiIIIII2 = "51";
                break;
            }
            case "\u6211\u8981\u9886\u53d6\u5e2e\u6218\u5956\u52b1": {
                IiiiiiiiIIIII2 = "52";
                break;
            }
            case "\u6279\u91cf\u9a6f\u517b\u53c2\u6218\u53ec\u5524\u517d\u4eb2\u5bc6": 
            case "\u6279\u91cf\u9a6f\u517b\u5750\u9a91\u7ecf\u9a8c": 
            case "\u6279\u91cf\u9a6f\u517b\u7075\u5b9d\u5951\u5408": 
            case "\u6279\u91cf\u9a6f\u517b\u7075\u5b9d\u7ecf\u9a8c": 
            case "\u6279\u91cf\u9a6f\u517b\u5750\u9a91\u6280\u80fd\u719f\u7ec3\u5ea6": 
            case "\u6279\u91cf\u9a6f\u517b\u9996\u4e2a\u53c2\u6218\u6cd5\u5b9d\u7ecf\u9a8c": {
                HandleBangBattle.iIiIiiiiIIiii(type, npcView);
                return;
            }
        }
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"gangbattle", IiiiiiiiIIIII2);
        npcView.ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII);
    }
}
