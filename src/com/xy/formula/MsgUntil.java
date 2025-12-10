/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.GoodType
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.formula;

import com.xy.entity.RoleSummoning;
import com.xy.formula.GoodType;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;
import java.awt.Color;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MsgUntil {
    static String[] fbs = new String[]{"\u94f6\u7d22\u91d1\u94c3", "\u5c06\u519b\u4ee4", "\u5927\u52bf\u9524", "\u4e03\u5b9d\u73b2\u73d1\u5854", "\u9ed1\u9f99\u73e0", "\u5e7d\u51a5\u9b3c\u624b", "\u5927\u624b\u5370", "\u7edd\u60c5\u97ad", "\u60c5\u7f51", "\u5b9d\u83b2\u706f", "\u91d1\u7b8d\u513f", "\u756a\u5929\u5370", "\u9526\u8955\u8888\u88df", "\u767d\u9aa8\u722a", "\u5316\u8776"};

    public static String ALLATORIxDEMO(int lvl, GameClient gameClient) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        String[] IiiiiiiiIIIII2 = null;
        IiiiiiiiIIIII2 = gameClient.ALLATORIxDEMO(2, 3) ? new String[]{"\u6297\u7269\u7406", "\u6297\u9707\u6151", "\u6297\u98ce", "\u6297\u96f7", "\u6297\u6c34", "\u6297\u706b", "\u6297\u6df7\u4e71", "\u6297\u660f\u7761", "\u6297\u5c01\u5370", "\u6297\u4e2d\u6bd2"} : new String[]{"\u6297\u7269\u7406", "\u6297\u9707\u6151", "\u6297\u98ce", "\u6297\u96f7", "\u6297\u6c34", "\u6297\u706b", "\u6297\u6df7\u4e71", "\u6297\u660f\u7761", "\u6297\u5c01\u5370", "\u6297\u4e2d\u6bd2", "\u6297\u9057\u5fd8", "\u6297\u9b3c\u706b"};
        IiiiiiiiIIIII.append(String.valueOf(MsgUntil.ALLATORIxDEMO(IiiiiiiiIIIII2)) + "=");
        int IiiiiiiiIIIII3 = (lvl - 1) / 40 + 1;
        double IiiiiiiiIIIII4 = MsgUntil.getDouble((double)((IiiiiiiiIIIII3 - 1) * 2) + 0.1, (double)(IiiiiiiiIIIII3 * 2) + 0.1, 1);
        if (IiiiiiiiIIIII4 > 10.0) {
            IiiiiiiiIIIII4 = 10.0;
        }
        IiiiiiiiIIIII.append(IiiiiiiiIIIII4);
        return IiiiiiiiIIIII.toString();
    }

    public static int getSxlxz(String value) {
        int IiiiiiiiIIIII;
        block11: {
            block12: {
                block13: {
                    block14: {
                        IiiiiiiiIIIII = 0;
                        String string = MsgUntil.ALLATORIxDEMO(0, GoodType.getExtra((String)value, (String)GoodType.Extras[3]));
                        switch (string.hashCode()) {
                            case 647926: {
                                if (!string.equals("\u4f20\u4e16")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block11;
                            }
                            case 811615: {
                                if (string.equals("\u628a\u73a9")) break;
                                return IiiiiiiiIIIII;
                            }
                            case 828695: {
                                if (!string.equals("\u65e0\u4ef7")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block12;
                            }
                            case 953250: {
                                if (!string.equals("\u73cd\u85cf")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block13;
                            }
                            case 1157111: {
                                if (!string.equals("\u8d34\u8eab")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block14;
                            }
                        }
                        IiiiiiiiIIIII = 10;
                        return IiiiiiiiIIIII;
                    }
                    IiiiiiiiIIIII = 20;
                    return IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = 40;
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 80;
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 160;
        return IiiiiiiiIIIII;
    }

    public static String getStarArrayAttribute(String name) {
        if (name.equals("\u6731\u96c0")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u51b0\u6df7\u7761\u5fd8\u6297\u6027";
        }
        if (name.equals("\u9752\u9f99")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u4ed9\u6cd5\u6297\u6027";
        }
        if (name.equals("\u767d\u864e")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u9b3c\u706b\u3001\u4e09\u5c38\u866b\u6297\u6027";
        }
        if (name.equals("\u7384\u6b66")) {
            return "\u7455\u75b5:\u7565\u5fae\u51cf\u5c11\u5168\u961f\u9707\u6151\u6297\u6027";
        }
        if (name.equals("\u91d1\u725b")) {
            return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u3001\u53ec\u5524\u517d\u5bf9\u654c\u65b9\u9020\u6210\u7684\u7269\u7406\u4f24\u5bb3\u6709\u4e00\u5b9a\u7684\u52a0\u6210";
        }
        if (name.equals("\u706b\u733f")) {
            return "\u82e5\u5bf9\u65b9\u7075\u5b9d\u5bf9\u672c\u65b9\u4efb\u610f\u5355\u4f4d\u9020\u6210\u4f24\u5bb3\uff0c\u62b5\u6297\u4e00\u5b9a\u7a0b\u5ea6\u4f24\u5bb3\uff1b\u6bcf2\u56de\u5408\u53ef\u751f\u6548\u4e00\u6b21";
        }
        if (name.equals("\u8d64\u9a6c")) {
            return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u3001\u53ec\u5524\u517d\u83b7\u5f97\u4e00\u5b9a\u7ecf\u9a8c\u52a0\u6210";
        }
        if (!name.equals("\u9ec4\u9e64")) return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u3001\u53ec\u5524\u517d\u7684\u4ed9\u6cd5\u3001\u9b3c\u706b\u3001\u9707\u6151\u6709\u4e00\u5b9a\u52a0\u6210";
        return "\u672c\u65b9\u6240\u6709\u4eba\u7269\u589e\u52a0\u51b0\u6df7\u7761\u5fd8\u6297\u6027";
    }

    public static boolean iIiIiiiiIIiii(String bn) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < fbs.length) {
            if (fbs[IiiiiiiiIIIII].equals(bn)) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public static int getSM(int type, int id) {
        if (!MsgUntil.ALLATORIxDEMO(type, id)) {
            return -1;
        }
        if (type == 19) {
            return 9;
        }
        if (type == 20) {
            return 11;
        }
        if (type == 21) {
            return 8;
        }
        if (type == 22) {
            return 10;
        }
        if (type == 23) {
            return 1;
        }
        if (type == 24) {
            return 2;
        }
        if (type == 25) {
            return 3;
        }
        if (type == 26) {
            return 0;
        }
        if (type == 27) {
            return 4;
        }
        if (type == 28) {
            return 5;
        }
        if (type == 29) {
            return 6;
        }
        if (type == 30) {
            return 7;
        }
        if (type == 72) {
            return 12;
        }
        if (type == 73) {
            return 13;
        }
        if (type == 74) {
            return 14;
        }
        if (type != 75) return -1;
        return 15;
    }

    public static String ALLATORIxDEMO(String id) {
        String IiiiiiiiIIIII = null;
        if (id.equals("1")) {
            IiiiiiiiIIIII = "\u5e3d\u5b50";
            return IiiiiiiiIIIII;
        }
        if (id.equals("2")) {
            IiiiiiiiIIIII = "\u9879\u94fe";
            return IiiiiiiiIIIII;
        }
        if (id.equals("3")) {
            IiiiiiiiIIIII = "\u8863\u670d";
            return IiiiiiiiIIIII;
        }
        if (id.equals("6")) {
            IiiiiiiiIIIII = "\u9762\u5177";
            return IiiiiiiiIIIII;
        }
        if (id.equals("7")) {
            IiiiiiiiIIIII = "\u8170\u5e26";
            return IiiiiiiiIIIII;
        }
        if (id.equals("8")) {
            IiiiiiiiIIIII = "\u62ab\u98ce";
            return IiiiiiiiIIIII;
        }
        if (id.equals("9")) {
            IiiiiiiiIIIII = "\u6302\u4ef6";
            return IiiiiiiiIIIII;
        }
        if (id.equals("10")) {
            IiiiiiiiIIIII = "\u5de6\u6212\u6307";
            return IiiiiiiiIIIII;
        }
        if (!id.equals("11")) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = "\u53f3\u6212\u6307";
        return IiiiiiiiIIIII;
    }

    public static String getPalEquipAgree(String value, String type) {
        String[] IiiiiiiiIIIII = value.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith(type)) {
                return IiiiiiiiIIIII[IiiiiiiiIIIII2];
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    public static boolean ALLATORIxDEMO(String name) {
        if (name.equals("\u6731\u96c0")) return true;
        if (name.equals("\u9752\u9f99")) return true;
        if (name.equals("\u767d\u864e")) return true;
        if (!name.equals("\u7384\u6b66")) return false;
        return true;
    }

    public static String getWingGoodsQuality(String quality) {
        switch (quality) {
            case "\u628a\u73a9": {
                return "1";
            }
            case "\u8d34\u8eab": {
                return "2";
            }
            case "\u73cd\u85cf": {
                return "3";
            }
            case "\u65e0\u4ef7": {
                return "4";
            }
            case "\u4f20\u4e16": {
                return "5";
            }
            case "\u795e\u8ff9": {
                return "6";
            }
        }
        return null;
    }

    public static Integer iIiIiiiiIIiii(String attr) {
        if (attr.equals("\u91d1")) {
            return 1;
        }
        if (attr.equals("\u6728")) {
            return 2;
        }
        if (attr.equals("\u571f")) {
            return 3;
        }
        if (attr.equals("\u6c34")) {
            return 4;
        }
        if (!attr.equals("\u706b")) return null;
        return 5;
    }

    public static String getValuesMessage(String[] values, String strType) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < values.length) {
            if (values[IiiiiiiiIIIII].startsWith(strType)) {
                if (!"\u89c9\u9192\u6280".equals(strType)) return values[IiiiiiiiIIIII].split("=")[1];
                return values[IiiiiiiiIIIII];
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public static int getUpStarData(String DataStr, int starLvl, String qualityAttr) {
        double IiiiiiiiIIIII = Double.parseDouble(DataStr);
        if (qualityAttr != null) return (int)(IiiiiiiiIIIII * (1.0 + (double)starLvl * 0.1) * (1.0 + MsgUntil.getQualityAttr(qualityAttr)));
        return 0;
    }

    public static String ALLATORIxDEMO(String id, boolean tz) {
        if (id.equals("0")) {
            return "\u6b66\u5668";
        }
        if (id.equals("1")) {
            return "\u5e3d\u5b50";
        }
        if (id.equals("2")) {
            return "\u9879\u94fe";
        }
        if (id.equals("3")) {
            return "\u8863\u670d";
        }
        if (id.equals("4")) {
            return "\u62a4\u8eab\u7b26";
        }
        if (id.equals("5")) {
            return "\u978b\u5b50";
        }
        if (id.equals("6")) {
            return "\u9762\u5177";
        }
        if (id.equals("7")) {
            return "\u8170\u5e26";
        }
        if (id.equals("8")) {
            return "\u62ab\u98ce";
        }
        if (id.equals("9")) {
            return "\u6302\u4ef6";
        }
        if (id.equals("10")) {
            if (!tz) return "\u6212\u6307";
            return "\u5de6\u6212\u6307";
        }
        if (!id.equals("11")) return null;
        if (!tz) return "\u6212\u6307";
        return "\u53f3\u6212\u6307";
    }

    public static int ALLATORIxDEMO(String name) {
        int IiiiiiiiIIIII;
        block11: {
            block12: {
                block13: {
                    block14: {
                        IiiiiiiiIIIII = 0;
                        String string = name;
                        switch (string.hashCode()) {
                            case 647926: {
                                if (!string.equals("\u4f20\u4e16")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block11;
                            }
                            case 811615: {
                                if (string.equals("\u628a\u73a9")) break;
                                return IiiiiiiiIIIII;
                            }
                            case 828695: {
                                if (!string.equals("\u65e0\u4ef7")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block12;
                            }
                            case 953250: {
                                if (!string.equals("\u73cd\u85cf")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block13;
                            }
                            case 1157111: {
                                if (!string.equals("\u8d34\u8eab")) {
                                    return IiiiiiiiIIIII;
                                }
                                break block14;
                            }
                        }
                        IiiiiiiiIIIII = 1;
                        return IiiiiiiiIIIII;
                    }
                    IiiiiiiiIIIII = 2;
                    return IiiiiiiiIIIII;
                }
                IiiiiiiiIIIII = 3;
                return IiiiiiiiIIIII;
            }
            IiiiiiiiIIIII = 4;
            return IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 5;
        return IiiiiiiiIIIII;
    }

    public static String iIiIiiiiIIiii(int lvl) {
        switch (lvl) {
            case 1: {
                return "\u4e00";
            }
            case 2: {
                return "\u4e8c";
            }
            case 3: {
                return "\u4e09";
            }
            case 4: {
                return "\u56db";
            }
            case 5: {
                return "\u4e94";
            }
            case 6: {
                return "\u516d";
            }
            case 7: {
                return "\u4e03";
            }
            case 8: {
                return "\u516b";
            }
            case 9: {
                return "\u4e5d";
            }
            case 10: {
                return "\u5341";
            }
        }
        return "\u96f6";
    }

    public static void getNpcOption(int type, List<String> list) {
        if (type >= 5 && type <= 10 || type == 13 || type == 14 || type == 15 || type == 18 || type == 37 || type == 45 || type == 50 || type == 99 || type == 120 || type == 121 || type == 123 || type == 124 || type == 125 || type == 131 || type == 735) {
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type >= 19 && type <= 30 || type == 72 || type == 73 || type == 74 || type == 75 || type == 1006) {
            list.add("\u6211\u8981\u56de\u957f\u5b89");
        } else if (type == 39) {
            list.add("\u6211\u8981\u67e5\u8be2\u5269\u4f59\u53cc\u500d\u65f6\u95f4");
            list.add("\u6211\u8981\u51bb\u7ed3\u53cc\u500d\u65f6\u95f4");
            list.add("\u6211\u8981\u9886\u53d6\u4e00\u5c0f\u65f6\u53cc\u500d\u65f6\u95f4");
            list.add("\u6211\u8981\u9886\u53d6\u4e8c\u5c0f\u65f6\u53cc\u500d\u65f6\u95f4");
        } else if (type == 40) {
            list.add("\u6211\u8981\u4f4f\u5e97(\u6263\u96642000\u94f6\u4e24)");
            list.add("\u6362\u4e2a\u9ad8\u7ea7\u85cf\u5b9d\u56fe");
            list.add("\u6362\u4e2a\u8d85\u7ea7\u85cf\u5b9d\u56fe");
        } else if (type == 12) {
            list.add("\u6211\u8981\u6253\u9020\u666e\u901a\u88c5\u5907");
            list.add("\u6211\u8981\u5347\u7ea7\u795e\u5175");
            list.add("\u6211\u8981\u4e0a\u795e\u5175\u77f3");
            list.add("\u6211\u8981\u5408\u6210\u70bc\u5996\u77f3");
            list.add("\u7b26\u77f3");
        } else if (type == 16) {
            list.add("\u6cbb\u7597\u5f53\u524d\u53ec\u5524\u517d\u5e76\u6062\u590d\u5fe0\u8bda");
            list.add("\u6cbb\u7597\u5168\u90e8\u53ec\u5524\u517d\u5e76\u6062\u590d\u5fe0\u8bda");
        } else if (type == 32) {
            list.add("\u6211\u8981\u4e00\u9897\u60c5\u82b1\u82d7");
        } else if (type == 36) {
            list.add("\u6211\u662f\u6765\u53ec\u5524\u4f60\u7684");
        } else if (type == 38) {
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
            list.add("\u795e\u517d\u5b66\u4e60\u6280\u80fd");
            list.add("\u98de\u5347\u5f53\u524d\u53c2\u6218\u795e\u517d");
        } else if (type == 44) {
            list.add("\u8f6c\u751f\u5f53\u524d\u53ec\u5524\u517d");
            list.add("\u70b9\u5316\u5f53\u524d\u5750\u9a91");
            list.add("\u70b9\u5316\u5f53\u524d\u53ec\u5524\u517d");
        } else if (type == 47) {
            list.add("\u6211\u5df2\u505a\u597d\u4e86\u8f6c\u751f\u51c6\u5907");
        } else if (type == 48) {
            list.add("\u6211\u60f3\u8f6c\u6362\u79cd\u65cf");
        } else if (type == 54) {
            list.add("\u6253\u902011-16\u7ea7\u88c5\u5907");
        } else if (type == 57) {
            list.add("\u6211\u662f\u6765\u6350\u94b1\u7684");
            list.add("\u6211\u662f\u6765\u9886\u5de5\u8d44\u7684");
        } else if (type == 58) {
            list.add("\u66f4\u6539\u5e2e\u6d3e\u4e3b\u5b88\u62a4");
            list.add("\u66f4\u6539\u5e2e\u6d3e\u526f\u5b88\u62a4");
        } else if (type == 59) {
            list.add("\u5355\u4eba\u62a4\u9001\u7269\u8d44");
            list.add("\u7ec4\u961f\u62a4\u9001\u7269\u8d44");
        } else if (type == 61) {
            list.add("\u6211\u6765\u62a5\u540d\u53c2\u52a0\u5e2e\u6218");
            list.add("\u6211\u8981\u53c2\u52a0\u5e2e\u6218");
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 63) {
            list.add("\u6211\u8981\u521b\u5efa\u5e2e\u6d3e");
            list.add("\u52a0\u5165\u5e2e\u6d3e");
        } else if (type == 64) {
            list.add("\u8fdb\u5165\u5e2e\u6d3e");
        } else if (type == 66) {
            list.add("\u6211\u8981\u5408\u6210\u4ed9\u5668");
            list.add("\u6211\u8981\u5347\u7ea7\u4ed9\u5668");
            list.add("\u6211\u8981\u6d17\u70bc\u4ed9\u5668");
        } else if (type == 69) {
            list.add("\u6211\u8981\u57f9\u517b\u62a4\u8eab\u7b26");
            list.add("\u6211\u8981\u91cd\u94f8\u62a4\u8eab\u7b26");
            list.add("\u6211\u8981\u57f9\u517b\u9970\u54c1");
            list.add("\u6211\u8981\u91cd\u94f8\u9970\u54c1");
            list.add("\u57f9\u517b\u5f69\u6676\u77f3");
        } else if (type == 31) {
            list.add("\u6211\u8981\u53d6\u56de\u7269\u54c1");
            list.add("\u6211\u8981\u5178\u5f53\u7269\u54c1");
        } else if (type == 130) {
            list.add("\u6211\u8981\u9886\u517b\u4e00\u4e2a\u7537\u5b69");
            list.add("\u6211\u8981\u9886\u517b\u4e00\u4e2a\u5973\u5b69");
        } else if (type == 1001) {
            list.add("\u6211\u8981\u8131\u79bb\u5e2e\u6218");
            list.add("\u6211\u8981\u8fdb\u5165\u9ad8\u624b\u6311\u6218\u8d5b");
            list.add("\u6211\u8981\u8fdb\u5165\u6218\u573a");
            list.add("\u56de\u5230\u8425\u5730");
        } else if (type == 1003) {
            list.add("\u5267\u6bd2\u5c01\u5370\u4e4b\u4e66");
            list.add("\u5bd2\u51b0\u5c01\u5370\u4e4b\u4e66");
            list.add("\u5929\u96f7\u5c01\u5370\u4e4b\u4e66");
            list.add("\u5fa1\u5251\u5c01\u5370\u4e4b\u4e66");
            list.add("\u72c2\u529b\u5c01\u5370\u4e4b\u4e66");
        } else if (type == 1004) {
            list.add("\u51a5\u7075\u53e4\u5377");
            list.add("\u73b2\u73d1\u53e4\u5377");
            list.add("\u5de8\u7ffc\u53e4\u5377");
            list.add("\u846b\u82a6\u53e4\u5377");
            list.add("\u5982\u610f\u53e4\u5377");
        } else if (type == 1005) {
            list.add("\u82cd\u51db\u53e4\u5377");
            list.add("\u8d6d\u708e\u53e4\u5377");
            list.add("\u5f53\u5eb7\u53e4\u5377");
            list.add("\u677e\u9f20\u53e4\u5377");
            list.add("\u4f73\u97f3\u5c0f\u4f7f\u53e4\u5377");
        } else if (type == 1100) {
            list.add("\u6211\u8981\u6fc0\u6d3b\u5151\u5956\u7801");
            list.add("\u5151\u6362\u5f69\u6676\u77f3");
        } else if (type == 126) {
            list.add("\u6211\u8981\u53c2\u52a0\u6c34\u9646\u5927\u4f1a");
            list.add("\u9886\u53d6\u6c34\u9646\u5927\u4f1a\u5956\u52b1");
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 128) {
            list.add("\u6211\u8981\u4e0b\u6311\u6218\u4e66");
        } else if (type == 129) {
            list.add("\u6211\u8981\u5151\u6362\u7075\u4fee\u503c");
            list.add("\u6211\u8981\u6536\u5f55\u7389\u7b26(\u7389\u7b26\u8f6c\u7b26\u5f55)");
            list.add("\u6211\u8981\u67e5\u770b\u5df2\u6709\u7b26\u5f55(\u7b26\u5f55\u8f6c\u7389\u7b26)");
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
            list.add("\u6211\u8981\u56de\u957f\u5b89");
        } else if (type == 132) {
            list.add("\u524d\u9014\u7f08\u7f08,\u6211\u8fd8\u662f\u518d\u51c6\u5907\u4e0b\u5427");
        } else if (type == 133) {
            list.add("\u5e74(588\u788e\u7247)");
            list.add("\u753b\u4e2d\u4ed9(488\u788e\u7247)");
            list.add("\u767d\u6cfd(468\u788e\u7247)");
        } else if (type == 134) {
            list.add("\u9f99\u9a6c(188\u788e\u7247)");
            list.add("\u753b\u76ae\u5a18\u5b50(188\u788e\u7247)");
            list.add("\u5b54\u96c0\u660e\u738b(188\u788e\u7247)");
            list.add("\u5317\u51a5\u9f99\u541b(288\u788e\u7247)");
            list.add("\u5b5f\u6781(288\u788e\u7247)");
            list.add("\u955c\u82b1\u6c34\u6708(388\u788e\u7247)");
            list.add("\u5999\u97f3\u683e\u5973(388\u788e\u7247)");
        } else if (type == 136) {
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 1106) {
            list.add("\u53c2\u52a0\u79cd\u65cf\u8d5b");
            list.add("\u4e00\u952e\u9886\u53d6\u79cd\u65cf\u8d5b\u5956\u52b1");
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 515) {
            list.add("\u53c2\u52a0\u64c2\u53f0\u8d5b");
            list.add("\u4e00\u952e\u9886\u53d6\u64c2\u53f0\u8d5b\u5956\u52b1");
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 520) {
            list.add("\u6211\u8981\u8fdb\u884c\u4e5d\u751f\u4e5d\u6b7b\u6311\u6218");
        } else if (type == 85) {
            list.add("\u6211\u8981\u6253\u9020,\u6458\u6284\u5b9d\u77f3");
            list.add("\u6211\u8981\u5408\u6210\u5b9d\u77f3\u7b49");
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 800) {
            list.add("\u6211\u8981\u53c2\u52a0\u8de8\u670d\u8054\u8d5b");
        } else if (type == 530) {
            list.add("\u6211\u6765\u4e0a\u4ea4\u5730\u715e\u661f\u4e4b\u9b42");
        } else if (type == 605) {
            list.add("\u6211\u8981\u56de\u5230500\u5e74\u524d");
            list.add("\u9886\u53d6\u5927\u95f9\u5929\u5bab\u5956\u52b1");
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 42) {
            list.add("\u6211\u6765\u4e0a\u4ea4\u4e0a\u53e4\u5b9d\u7bb1");
        } else if (type == 43) {
            list.add("\u6211\u6765\u4e0a\u4ea4\u4e0a\u53e4\u5b9d\u7bb1");
        } else if (type == 103) {
            list.add("\u6211\u8981\u53c2\u89c2\u4e0a\u53e4\u6218\u573a\u7684\u98ce\u91c7");
        } else if (type == 104) {
            list.add("\u9001\u6211\u56de\u540e\u65b9\u8425\u5730");
        } else if (type == 105) {
            list.add("\u795e\u529b\u52a0\u6301");
        } else if (type == 2021) {
            list.add("\u5347\u7ea7\u5e2e\u6d3e\u7b49\u7ea7");
        } else if (type == 2024) {
            list.add("\u6211\u8981\u63d0\u4ea4\u6750\u6599");
        } else if (type == 2025) {
            list.add("\u6211\u60f3\u4e70\u70b9\u4e1c\u897f");
        } else if (type == 2026) {
            list.add("\u5b88\u62a4\u5c0f\u6210\u4fee\u70bc");
            list.add("\u5b88\u62a4\u5927\u6210\u4fee\u70bc");
        } else if (type == 2027) {
            list.add("\u6211\u8981\u53c2\u52a0\u5168\u540d\u7ade\u6280\u5207\u78cb");
            list.add("\u6211\u6765\u6362\u70b9\u7ade\u6280\u7269\u54c1");
        } else if (type == 2028) {
            list.add("\u6211\u8981\u6311\u6218\u8bd5\u70bc\u5e7b\u5883");
            list.add("\u6211\u70b9\u9519\u4e86,\u6211\u5b9e\u529b\u672a\u5230,\u4e0d\u6562\u5c1d\u8bd5");
        } else if (type != 49 && type != 56 && type != 70) {
            return;
        }
        if (type == 2028) return;
        if (type == 132) return;
        if (type == 134) return;
        if (type == 129) {
            return;
        }
        list.add("\u6211\u4ec0\u4e48\u90fd\u4e0d\u505a");
    }

    public static double ALLATORIxDEMO(String attr, String value, String num) {
        Integer IiiiiiiiIIIII = MsgUntil.iIiIiiiiIIiii(attr);
        Integer IiiiiiiiIIIII2 = MsgUntil.iIiIiiiiIIiii(value);
        int IiiiiiiiIIIII3 = Math.abs(IiiiiiiiIIIII - IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 == 1 || IiiiiiiiIIIII3 == 4) {
            if (IiiiiiiiIIIII == 1) {
                if (IiiiiiiiIIIII2 == 5) return (double)Integer.parseInt(num) * 0.1;
            }
            if (IiiiiiiiIIIII > IiiiiiiiIIIII2) {
                return (double)Integer.parseInt(num) * 0.1;
            }
        }
        IiiiiiiiIIIII = MsgUntil.ALLATORIxDEMO(attr);
        IiiiiiiiIIIII2 = MsgUntil.ALLATORIxDEMO(value);
        IiiiiiiiIIIII3 = Math.abs(IiiiiiiiIIIII - IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 != 1) {
            if (IiiiiiiiIIIII3 != 4) return (double)Integer.parseInt(num) * 0.2;
        }
        if (IiiiiiiiIIIII == 1) {
            if (IiiiiiiiIIIII2 == 5) return (double)Integer.parseInt(num) * 0.3;
        }
        if (IiiiiiiiIIIII <= IiiiiiiiIIIII2) return (double)Integer.parseInt(num) * 0.2;
        return (double)Integer.parseInt(num) * 0.3;
    }

    public static String ALLATORIxDEMO(int type) {
        String IiiiiiiiIIIII = "\u628a\u73a9";
        switch (type) {
            case 1: {
                IiiiiiiiIIIII = "\u628a\u73a9";
                return IiiiiiiiIIIII;
            }
            case 2: {
                IiiiiiiiIIIII = "\u8d34\u8eab";
                return IiiiiiiiIIIII;
            }
            case 3: {
                IiiiiiiiIIIII = "\u73cd\u85cf";
                return IiiiiiiiIIIII;
            }
            case 4: {
                IiiiiiiiIIIII = "\u65e0\u4ef7";
                return IiiiiiiiIIIII;
            }
            case 5: {
                IiiiiiiiIIIII = "\u4f20\u4e16";
                return IiiiiiiiIIIII;
            }
        }
        return IiiiiiiiIIIII;
    }

    public static String ALLATORIxDEMO(String lvlStr, String goodlvlStr) {
        int IiiiiiiiIIIII = Integer.parseInt(lvlStr);
        int IiiiiiiiIIIII2 = Integer.parseInt(goodlvlStr);
        if (IiiiiiiiIIIII > 5) {
            if (IiiiiiiiIIIII != 6) return "?";
            if (IiiiiiiiIIIII2 != 10) return "?";
            return "\u88c5\u5907\u91cd\u94f8";
        }
        if (IiiiiiiiIIIII + 5 == IiiiiiiiIIIII2) {
            return "\u88c5\u5907\u5347\u7ea7";
        }
        if (IiiiiiiiIIIII + 4 != IiiiiiiiIIIII2) return "?";
        return "\u88c5\u5907\u91cd\u94f8";
    }

    public static BigDecimal getWingGoodsTrue(Goodstable wingUpStarGoods, Integer goodsValue) {
        if (goodsValue == null) {
            return null;
        }
        String IiiiiiiiIIIII = wingUpStarGoods.getValue().split("=")[1];
        if (goodsValue <= 2) {
            if (!IiiiiiiiIIIII.equals("1")) return null;
            return new BigDecimal("100000000");
        }
        if (goodsValue <= 5) {
            if (!IiiiiiiiIIIII.equals("2")) return null;
            return new BigDecimal("200000000");
        }
        if (goodsValue <= 8) {
            if (!IiiiiiiiIIIII.equals("3")) return null;
            return new BigDecimal("300000000");
        }
        if (goodsValue <= 11) {
            if (!IiiiiiiiIIIII.equals("4")) return null;
            return new BigDecimal("400000000");
        }
        if (goodsValue > 14) return null;
        if (!IiiiiiiiIIIII.equals("5")) return null;
        return new BigDecimal("500000000");
    }

    public static Color getQualityColor(String qualityName) {
        switch (qualityName) {
            case "\u628a\u73a9": {
                return iiIIiiiiIiiII.IiiIiiiiIIiiI;
            }
            case "\u8d34\u8eab": {
                return iiIIiiiiIiiII.IIIiiiiiIiIIi;
            }
            case "\u73cd\u85cf": {
                return iiIIiiiiIiiII.iiIIiiiiIiIIi;
            }
            case "\u65e0\u4ef7": {
                return iiIIiiiiIiiII.IiIiiiiiiiiIi;
            }
            case "\u4f20\u4e16": {
                return iiIIiiiiIiiII.IIIiiiiiiiIII;
            }
            case "\u795e\u8ff9": {
                return iiIIiiiiIiiII.iiIiIiiiIiiiI;
            }
        }
        return null;
    }

    public static Integer ALLATORIxDEMO(String attr) {
        if (attr.equals("\u91d1")) {
            return 1;
        }
        if (attr.equals("\u6c34")) {
            return 2;
        }
        if (attr.equals("\u6728")) {
            return 3;
        }
        if (attr.equals("\u706b")) {
            return 4;
        }
        if (!attr.equals("\u571f")) return null;
        return 5;
    }

    public static int iIiIiiiiIIiii(int type) {
        int IiiiiiiiIIIII = 0;
        switch (type) {
            case 1: {
                IiiiiiiiIIIII = 5;
                return IiiiiiiiIIIII;
            }
            case 2: {
                IiiiiiiiIIIII = 4;
                return IiiiiiiiIIIII;
            }
            case 3: {
                IiiiiiiiIIIII = 3;
                return IiiiiiiiIIIII;
            }
            case 4: {
                IiiiiiiiIIIII = 3;
                return IiiiiiiiIIIII;
            }
        }
        return IiiiiiiiIIIII;
    }

    public static double getQualityAttr(String qualityAttr) {
        switch (qualityAttr) {
            case "\u628a\u73a9": {
                return 0.0;
            }
            case "\u8d34\u8eab": {
                return 0.2;
            }
            case "\u73cd\u85cf": {
                return 0.4;
            }
            case "\u65e0\u4ef7": {
                return 0.8;
            }
            case "\u4f20\u4e16": {
                return 1.6;
            }
            case "\u795e\u8ff9": {
                return 3.2;
            }
        }
        return -1.0;
    }

    public static double getDouble(double min, double max, int type) {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < type) {
            ++IiiiiiiiIIIII2;
            IiiiiiiiIIIII.append("0");
        }
        max -= min;
        max = max / 4.0 * (double)IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(5);
        DecimalFormat IiiiiiiiIIIII22 = new DecimalFormat("#." + IiiiiiiiIIIII);
        return Double.valueOf(IiiiiiiiIIIII22.format(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextDouble() * max + min));
    }

    public static String ALLATORIxDEMO(int type, String value) {
        String[] IiiiiiiiIIIII = value.split("\\&");
        String IiiiiiiiIIIII2 = "";
        String IiiiiiiiIIIII3 = IiiiiiiiIIIII[3];
        if (type == 0) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
            return IiiiiiiiIIIII2;
        }
        if (type != 1) {
            if (type != 3) return IiiiiiiiIIIII2;
            int IiiiiiiiIIIII4 = MsgUntil.ALLATORIxDEMO(IiiiiiiiIIIII3) + 1;
            IiiiiiiiIIIII2 = MsgUntil.ALLATORIxDEMO(IiiiiiiiIIIII4);
            return IiiiiiiiIIIII2;
        }
        int IiiiiiiiIIIII5 = MsgUntil.ALLATORIxDEMO(IiiiiiiiIIIII3) + 1;
        StringBuffer IiiiiiiiIIIII6 = new StringBuffer();
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII7 != 0) {
                IiiiiiiiIIIII6.append("&");
            }
            if (IiiiiiiiIIIII7 != 3) {
                IiiiiiiiIIIII6.append(IiiiiiiiIIIII[IiiiiiiiIIIII7]);
            } else {
                IiiiiiiiIIIII6.append(MsgUntil.ALLATORIxDEMO(IiiiiiiiIIIII5));
            }
            ++IiiiiiiiIIIII7;
        }
        IiiiiiiiIIIII2 = IiiiiiiiIIIII6.toString();
        return IiiiiiiiIIIII2;
    }

    public static String getGoodValue(String value, String key) {
        if (value == null) return null;
        if (value.equals("")) {
            return null;
        }
        String[] IiiiiiiiIIIII = value.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith(key)) {
                return IiiiiiiiIIIII[IiiiiiiiIIIII2];
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    public static int ALLATORIxDEMO(int type) {
        int IiiiiiiiIIIII = 0;
        switch (type) {
            case 1: {
                IiiiiiiiIIIII = 1;
                return IiiiiiiiIIIII;
            }
            case 2: {
                IiiiiiiiIIIII = 1;
                return IiiiiiiiIIIII;
            }
            case 3: {
                IiiiiiiiIIIII = 2;
                return IiiiiiiiIIIII;
            }
            case 4: {
                IiiiiiiiIIIII = 2;
                return IiiiiiiiIIIII;
            }
            case 5: {
                IiiiiiiiIIIII = 3;
                return IiiiiiiiIIIII;
            }
        }
        return IiiiiiiiIIIII;
    }

    public static boolean ALLATORIxDEMO(int type, int id) {
        if (type == 19) {
            if (id == 22001) return true;
            if (id == 22002) return true;
            if (id == 22003) return true;
            if (id == 22007) return true;
            if (id == 22004) return true;
            if (id == 22005) return true;
            if (id == 22006) return true;
            if (id == 22008) return true;
            if (id == 22009) return true;
            if (id == 22010) return true;
            return false;
        }
        if (type == 20) {
            if (id == 22004) return true;
            if (id == 22005) return true;
            if (id == 22006) return true;
            if (id == 22008) return true;
            if (id == 22010) return true;
            return false;
        }
        if (type == 21) {
            if (id == 22001) return true;
            if (id == 22002) return true;
            if (id == 22003) return true;
            if (id == 22007) return true;
            if (id == 22009) return true;
            return false;
        }
        if (type == 22) {
            if (id == 22001) return true;
            if (id == 22002) return true;
            if (id == 22003) return true;
            if (id == 22007) return true;
            if (id == 22009) return true;
            if (id == 22004) return true;
            if (id == 22005) return true;
            if (id == 22006) return true;
            if (id == 22008) return true;
            if (id == 22010) return true;
            return false;
        }
        if (type == 23) {
            if (id == 20001) return true;
            if (id == 20002) return true;
            if (id == 20003) return true;
            if (id == 20007) return true;
            if (id == 20009) return true;
            if (id == 20004) return true;
            if (id == 20005) return true;
            if (id == 20006) return true;
            if (id == 20008) return true;
            if (id == 20010) return true;
            return false;
        }
        if (type == 24) {
            if (id == 20001) return true;
            if (id == 20002) return true;
            if (id == 20003) return true;
            if (id == 20007) return true;
            if (id == 20009) return true;
            if (id == 20004) return true;
            if (id == 20005) return true;
            if (id == 20006) return true;
            if (id == 20008) return true;
            if (id == 20010) return true;
            return false;
        }
        if (type == 25) {
            if (id == 20004) return true;
            if (id == 20005) return true;
            if (id == 20006) return true;
            if (id == 20008) return true;
            if (id == 20010) return true;
            return false;
        }
        if (type == 26) {
            if (id == 20001) return true;
            if (id == 20002) return true;
            if (id == 20003) return true;
            if (id == 20007) return true;
            if (id == 20009) return true;
            return false;
        }
        if (type == 27) {
            if (id == 21001) return true;
            if (id == 21002) return true;
            if (id == 21003) return true;
            if (id == 21007) return true;
            if (id == 21009) return true;
            if (id == 21004) return true;
            if (id == 21005) return true;
            if (id == 21006) return true;
            if (id == 21008) return true;
            if (id == 21010) return true;
            return false;
        }
        if (type == 28) {
            if (id == 21001) return true;
            if (id == 21002) return true;
            if (id == 21003) return true;
            if (id == 21007) return true;
            if (id == 21009) return true;
            if (id == 21004) return true;
            if (id == 21005) return true;
            if (id == 21006) return true;
            if (id == 21008) return true;
            if (id == 21010) return true;
            return false;
        }
        if (type == 29) {
            if (id == 21004) return true;
            if (id == 21005) return true;
            if (id == 21006) return true;
            if (id == 21008) return true;
            if (id == 21010) return true;
            return false;
        }
        if (type == 30) {
            if (id == 21001) return true;
            if (id == 21002) return true;
            if (id == 21003) return true;
            if (id == 21007) return true;
            if (id == 21009) return true;
            return false;
        }
        if (type == 72) {
            if (id == 23001) return true;
            if (id == 23002) return true;
            if (id == 23003) return true;
            if (id == 23004) return true;
            if (id == 23005) return true;
            if (id == 23006) return true;
            return false;
        }
        if (type == 73) {
            if (id == 23001) return true;
            if (id == 23002) return true;
            if (id == 23003) return true;
            return false;
        }
        if (type == 74) {
            if (id == 23001) return true;
            if (id == 23002) return true;
            if (id == 23003) return true;
            if (id == 23004) return true;
            if (id == 23005) return true;
            if (id == 23006) return true;
            return false;
        }
        if (type != 75) return false;
        if (id == 23004) return true;
        if (id == 23005) return true;
        if (id == 23006) return true;
        return false;
    }

    public static void ALLATORIxDEMO(RoleSummoning pet) {
        if (pet.getSummoningid().equals("200102")) {
            pet.setSummoningskin("400105");
            return;
        }
        if (pet.getSummoningid().equals("200103")) {
            pet.setSummoningskin("400102");
            return;
        }
        if (pet.getSummoningid().equals("200104")) {
            pet.setSummoningskin("400106");
            return;
        }
        if (pet.getSummoningid().equals("200105")) {
            pet.setSummoningskin("400105");
            return;
        }
        if (pet.getSummoningid().equals("200106")) {
            pet.setSummoningskin("400103");
            return;
        }
        if (pet.getSummoningid().equals("200107")) {
            pet.setSummoningskin("400104");
            return;
        }
        if (pet.getSummoningskin().equals("400107")) {
            pet.setSummoningskin("500152");
            return;
        }
        if (pet.getSummoningskin().equals("400108")) {
            pet.setSummoningskin("500153");
            return;
        }
        if (pet.getSummoningskin().equals("400109")) {
            pet.setSummoningskin("500151");
            return;
        }
        if (pet.getSummoningskin().equals("400110")) {
            pet.setSummoningskin("500154");
            return;
        }
        if (pet.getSummoningskin().equals("400111")) {
            pet.setSummoningskin("500155");
            return;
        }
        if (pet.getSummoningskin().equals("400120")) {
            pet.setSummoningskin("500156");
            return;
        }
        if (pet.getSummoningskin().equals("400121")) {
            pet.setSummoningskin("400521");
            return;
        }
        if (pet.getSummoningskin().equals("400127")) {
            pet.setSummoningskin("500157");
            return;
        }
        if (pet.getSummoningskin().equals("500150")) {
            pet.setSummoningskin("500231");
            return;
        }
        if (pet.getSummoningskin().equals("500158")) {
            pet.setSummoningskin("500204");
            return;
        }
        if (!pet.getSummoningskin().equals("500159")) return;
        pet.setSummoningskin("500205");
    }

    public static String getStarName(int index) {
        if (index == 0) {
            return "\u8d64\u5e1d\u5bab";
        }
        if (index == 1) {
            return "\u9752\u5e1d\u5bab";
        }
        if (index == 2) {
            return "\u9ec4\u5e1d\u5bab";
        }
        if (index == 3) {
            return "\u767d\u5e1d\u5bab";
        }
        if (index != 4) return "\u8d64\u5e1d\u5bab";
        return "\u9ed1\u5e1d\u5bab";
    }

    public static BigDecimal ALLATORIxDEMO(String one, String two, String three) {
        return new BigDecimal(one).add(new BigDecimal(two)).add(new BigDecimal(three)).divide(new BigDecimal(3), 2, 4);
    }

    public static int getGoodLvl(String value) {
        int IiiiiiiiIIIII = value.indexOf("=");
        if (IiiiiiiiIIIII == -1) {
            return 0;
        }
        int IiiiiiiiIIIII2 = value.indexOf("|");
        if (IiiiiiiiIIIII2 != -1) return IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII2);
        IiiiiiiiIIIII2 = value.length();
        return IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII2);
    }

    public static String ALLATORIxDEMO(String[] stringArray) {
        String[] v;
        return stringArray[IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(v.length)];
    }

    public static String getQualityColorOx(String qualityName) {
        switch (qualityName) {
            case "\u628a\u73a9": {
                return "#c29BF6B";
            }
            case "\u8d34\u8eab": {
                return "#c01FBF9";
            }
            case "\u73cd\u85cf": {
                return "#cEFEE0C";
            }
            case "\u65e0\u4ef7": {
                return "#cDB0ACD";
            }
            case "\u4f20\u4e16": {
                return "#cF35E01";
            }
            case "\u795e\u8ff9": {
                return "#cFB0001";
            }
        }
        return null;
    }
}
