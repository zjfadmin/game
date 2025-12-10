/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.PrivateData
 *  com.xy.formula.Arith
 *  com.xy.formula.MsgUntil
 *  com.xy.readbean.Skill
 *  com.xy.socket.GameClient
 *  com.xy.v.IIIiiiiiIiIiI
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.formula;

import com.xy.bean.PrivateData;
import com.xy.formula.Arith;
import com.xy.formula.MsgUntil;
import com.xy.readbean.Skill;
import com.xy.socket.GameClient;
import com.xy.v.IIIiiiiiIiIiI;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import java.math.BigDecimal;

public class SkillUtil {
    public static String[] skillSF;
    public static String[] skillText;
    public static String[] skillMsg;
    public static String[] skillSM;

    public static void ALLATORIxDEMO(PrivateData data, BigDecimal se) {
        String[] IiiiiiiiIIIII = data.getSkill("S");
        String[] IiiiiiiiIIIII2 = SkillUtil.getSepciesS(SkillUtil.getSepciesN(se));
        if (IiiiiiiiIIIII == null) return;
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII[IiiiiiiiIIIII4].split("_");
            if (IiiiiiiiIIIII3.length() != 0) {
                IiiiiiiiIIIII3.append("#");
            }
            IiiiiiiiIIIII3.append(SkillUtil.ALLATORIxDEMO(Integer.parseInt(IiiiiiiiIIIII5[0]), IiiiiiiiIIIII2));
            IiiiiiiiIIIII3.append("_");
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII3.append(IiiiiiiiIIIII5[1]);
        }
        data.setSkills("S", IiiiiiiiIIIII3.toString());
    }

    public static String getFMType(int index) {
        if (index == 1) {
            return "\u5b88\u4e2d";
        }
        if (index == 2) {
            return "\u8840\u5203";
        }
        if (index == 3) {
            return "\u4e71\u795e";
        }
        if (index == 4) {
            return "\u795e\u529b";
        }
        if (index == 5) {
            return "\u673a\u53d8";
        }
        if (index == 6) {
            return "\u795e\u529b";
        }
        if (index == 7) {
            return "\u5fa1\u517d";
        }
        if (index == 8) {
            return "\u6212\u5b9a";
        }
        if (index == 9) {
            return "\u795e\u529b";
        }
        if (index == 10) {
            return "\u7075\u5149";
        }
        if (index == 11) {
            return "\u653b\u575a";
        }
        if (index == 12) {
            return "\u7834\u58c1";
        }
        if (index == 13) {
            return "\u62a4\u6301";
        }
        if (index == 14) {
            return "\u6b63\u5fc3";
        }
        if (index == 15) {
            return "\u7981\u5492";
        }
        if (index == 16) {
            return "\u6f5c\u9f99";
        }
        if (index == 17) {
            return "\u4ea2\u9f99";
        }
        if (index != 18) return "";
        return "\u60ca\u9f99";
    }

    public static String ALLATORIxDEMO(String key, String text, int id, int skillLvl) {
        String IiiiiiiiIIIII = null;
        if (key.startsWith("\u6570\u503c")) {
            int IiiiiiiiIIIII2 = key.length() > 2 ? IIiiIiiiiIIiI.ALLATORIxDEMO((String)key, (int)2, (int)key.length()) - 1 : 0;
            double IiiiiiiiIIIII3 = 0.0;
            if (id == 2101) {
                IiiiiiiiIIIII3 = 1 * skillLvl;
            } else if (id == 2102) {
                IiiiiiiiIIIII3 = 2 * skillLvl;
            } else if (id == 2103) {
                IiiiiiiiIIIII3 = 0.5 * (double)skillLvl;
            } else if (id == 2104) {
                IiiiiiiiIIIII3 = 1 * skillLvl;
            } else if (id == 2105) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 0.2 * (double)skillLvl : (double)(500 * skillLvl);
            } else if (id == 2106) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 0.4 * (double)skillLvl : (double)(1000 * skillLvl);
            } else if (id == 2107) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 0.2 * (double)skillLvl : (IiiiiiiiIIIII2 == 1 ? (double)(100 * skillLvl) : (IiiiiiiiIIIII2 == 2 ? 1.2 * (double)skillLvl : (double)(600 * skillLvl)));
            } else if (id == 2108) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 0.3 * (double)skillLvl : (IiiiiiiiIIIII2 == 1 ? (double)(200 * skillLvl) : (IiiiiiiiIIIII2 == 2 ? 1.8 * (double)skillLvl : (double)(1200 * skillLvl)));
            } else if (id == 2109) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(45 + skillLvl) : (IiiiiiiiIIIII2 == 1 ? (double)(2 * skillLvl) : 1.5 * (double)skillLvl);
            } else if (id == 2110) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 45 + skillLvl : (IiiiiiiiIIIII2 == 1 ? 4 * skillLvl : 3 * skillLvl);
            } else if (id == 2111) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 22.5 + 0.5 * (double)skillLvl : (double)(IiiiiiiiIIIII2 == 1 ? 2 * skillLvl : 1 * skillLvl);
            } else if (id == 2112) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 22.5 + 0.5 * (double)skillLvl : (IiiiiiiiIIIII2 == 1 ? (double)(3 * skillLvl) : 1.5 * (double)skillLvl);
            } else if (id == 2113) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(3 * skillLvl) : 1.5 * (double)skillLvl;
            } else if (id == 2114) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 5 * skillLvl : 3 * skillLvl;
            } else if (id == 2115) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 2 * skillLvl : (IiiiiiiiIIIII2 == 1 ? 45 + skillLvl : 90 + skillLvl);
            } else if (id == 2116) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 3 * skillLvl : (IiiiiiiiIIIII2 == 1 ? 60 + skillLvl : 105 + skillLvl);
            } else if (id == 2117) {
                IiiiiiiiIIIII3 = 0.6 * (double)skillLvl;
            } else if (id == 2118) {
                IiiiiiiiIIIII3 = 1 * skillLvl;
            } else if (id == 2119) {
                IiiiiiiiIIIII3 = 0.8 * (double)skillLvl;
            } else if (id == 2120) {
                IiiiiiiiIIIII3 = 1.6 * (double)skillLvl;
            } else if (id == 2121) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(30 + skillLvl) : (IiiiiiiiIIIII2 == 1 ? 0.6 * (double)skillLvl : (double)(3000 * skillLvl));
            } else if (id == 2122) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 30 + skillLvl : (IiiiiiiiIIIII2 == 1 ? 1 * skillLvl : 5000 * skillLvl);
            } else if (id == 2123) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(30 + skillLvl) : 0.2 * (double)skillLvl;
            } else if (id == 2124) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(30 + skillLvl) : 0.4 * (double)skillLvl;
            } else if (id == 2125) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(60 + skillLvl) : 0.6 * (double)skillLvl;
            } else if (id == 2126) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 60 + skillLvl : 1 * skillLvl;
            } else if (id == 2127) {
                IiiiiiiiIIIII3 = 0.1 * (double)skillLvl;
            } else if (id == 2128) {
                IiiiiiiiIIIII3 = 0.2 * (double)skillLvl;
            } else if (id == 2129) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(3 * skillLvl) : 0.6 * (double)skillLvl;
            } else if (id == 2130) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 4 * skillLvl : 1 * skillLvl;
            } else if (id == 2131) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(3 * skillLvl) : 0.6 * (double)skillLvl;
            } else if (id == 2132) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 4 * skillLvl : 1 * skillLvl;
            } else if (id == 2133) {
                IiiiiiiiIIIII3 = 1 * skillLvl;
            } else if (id == 2134) {
                IiiiiiiiIIIII3 = 1.5 * (double)skillLvl;
            } else if (id == 2135) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(3 * skillLvl) : 0.6 * (double)skillLvl;
            } else if (id == 2136) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 5 * skillLvl : 1 * skillLvl;
            } else if (id == 2137) {
                IiiiiiiiIIIII3 = 3 * skillLvl;
            } else if (id == 2138) {
                IiiiiiiiIIIII3 = 5 * skillLvl;
            } else if (id == 2139) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 2 * skillLvl : 1 * skillLvl;
            } else if (id == 2140) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 3 * skillLvl : 2 * skillLvl;
            } else if (id == 2141) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 2 * skillLvl : 1 * skillLvl;
            } else if (id == 2142) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 3 * skillLvl : 2 * skillLvl;
            } else if (id == 2143) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? (double)(30 + skillLvl) : (IiiiiiiiIIIII2 == 1 ? 9.0 + 0.6 * (double)skillLvl : (double)(36000 + 2400 * skillLvl));
            } else if (id == 2144) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 45 + skillLvl : (IiiiiiiiIIIII2 == 1 ? 15 + 1 * skillLvl : 60000 + 4000 * skillLvl);
            } else if (id == 2145) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 0.6 * (double)skillLvl : 0.4 * (double)skillLvl;
            } else if (id == 2146) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII2 == 0 ? 0.6 * (double)skillLvl : 0.6 * (double)skillLvl;
            }
            IiiiiiiiIIIII = String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII3, (int)1)) + "%";
        }
        if (IiiiiiiiIIIII != null) return text.replace("{" + key + "}", IiiiiiiiIIIII);
        return text;
    }

    public static int getSmIndex(String type) {
        if (type.equals("\u6df7")) {
            return 1;
        }
        if (type.equals("\u51b0")) {
            return 2;
        }
        if (type.equals("\u7761")) {
            return 3;
        }
        if (type.equals("\u6bd2")) {
            return 4;
        }
        if (type.equals("\u9707")) {
            return 5;
        }
        if (type.equals("\u653b")) {
            return 6;
        }
        if (type.equals("\u76d8")) {
            return 7;
        }
        if (type.equals("\u901f")) {
            return 8;
        }
        if (type.equals("\u98ce")) {
            return 9;
        }
        if (type.equals("\u96f7")) {
            return 10;
        }
        if (type.equals("\u6c34")) {
            return 11;
        }
        if (type.equals("\u706b")) {
            return 12;
        }
        if (type.equals("\u51a5")) {
            return 13;
        }
        if (type.equals("\u86ca")) {
            return 14;
        }
        if (type.equals("\u5fd8")) {
            return 15;
        }
        if (type.equals("\u60d1")) {
            return 16;
        }
        if (type.equals("\u5288")) {
            return 17;
        }
        if (type.equals("\u6d8c")) {
            return 18;
        }
        if (type.equals("\u96e8")) {
            return 19;
        }
        if (!type.equals("\u6447")) return 0;
        return 20;
    }

    public static String getSkillSM(String skillName, IiiiiiiiiIIII objectArea) {
        Skill IiiiiiiiIIIII = objectArea.ALLATORIxDEMO(skillName);
        if (IiiiiiiiIIIII == null) {
            return null;
        }
        int IiiiiiiiIIIII2 = Integer.parseInt(IiiiiiiiIIIII.getSkillid());
        if (IiiiiiiiIIIII2 > 1000 && IiiiiiiiIIIII2 <= 1100) {
            return skillMsg[(IiiiiiiiIIIII2 - 1001) / 5];
        }
        if (IiiiiiiiIIIII2 > 9000 && IiiiiiiiIIIII2 <= 10000) {
            return "\u5957\u88c5";
        }
        if (IiiiiiiiIIIII2 <= 12000) return null;
        if (IiiiiiiiIIIII2 > 13000) return null;
        return "\u6cd5\u95e8";
    }

    public static String ALLATORIxDEMO(int type, double value, double sv, double sld) {
        value = type == 1 ? (value += sv * sld) : (type == 2 ? (value + sv * sld) * 1.68 : (type == 3 ? (value + sv * sld) * 2.75 : (type == 4 ? 8.6 + 8.75E-4 * sld : (type == 5 ? (8.6 + 8.75E-4 * sld) * 0.7 : (type == 6 ? (value + sv * sld) * 3.36 : (type == 7 ? (value + sv * sld) * 2.88 : (type == 8 ? 6.4 + 6.4E-4 * sld : (type == 9 ? 2.8 + 2.9E-4 * sld : (type == 10 ? 12.5 + 0.00124 * sld : (type == 11 ? (12.5 + 0.00124 * sld) * 0.67 : (type == 12 ? (double)((int)(21.6 + 0.00216 * sld)) : (type == 13 ? 5.5 + 5.6E-4 * sld : (type == 14 ? 2.2 + 2.0E-4 * sld : (type == 15 ? 18.8 + 0.00186 * sld : (type == 16 ? 25.3 + 0.0025 * sld : (type == 17 ? 5.4 + 5.35E-4 * sld : (type == 18 ? 1.6 + 1.55E-4 * sld : (type == 19 ? (value + sv * sld) * 0.7 : (type == 20 ? (value + sv * sld) * 2.05 : (type == 21 ? (value + sv * sld) * 7.73 : (type == 22 ? (value + sv * sld) * 19.33 : (type == 23 ? (value + sv * sld) * 1.735 : (type == 24 ? (value + sv * sld) * 3.76 : (type == 25 ? 18.1 + 0.0018 * sld : (type == 26 ? 13.8 + 0.0014 * sld : (type == 27 ? 7.8 + 7.9E-4 * sld : (value += sv * sld)))))))))))))))))))))))))));
        return "#R" + (value < 1000.0 ? IIiiIiiiiIIiI.ALLATORIxDEMO((double)value, (int)1) : Integer.valueOf((int)value)) + "#G";
    }

    public static int getFMMax(int lvl, GameClient gameClient) {
        if (gameClient.gameType == 2) {
            if (lvl >= 480) {
                return 10000;
            }
            if (lvl >= 475) {
                return 8000;
            }
            if (lvl >= 470) {
                return 6000;
            }
            if (lvl < 465) return 2000;
            return 4000;
        }
        if (lvl >= 500) {
            return 10000;
        }
        if (lvl >= 490) {
            return 8000;
        }
        if (lvl >= 480) {
            return 6000;
        }
        if (lvl < 470) return 2000;
        return 4000;
    }

    public static int getSmIndex(int sepciesId, int index) {
        if (sepciesId == 1) {
            if (index == 0) {
                return 2;
            }
            if (index != 1) return 1;
            return 3;
        }
        if (sepciesId == 2) {
            if (index == 0) {
                return 2;
            }
            if (index != 1) return 4;
            return 3;
        }
        if (sepciesId == 3) {
            if (index == 0) {
                return 5;
            }
            if (index != 1) return 8;
            return 6;
        }
        if (sepciesId == 4) {
            if (index == 0) {
                return 5;
            }
            if (index != 1) return 7;
            return 6;
        }
        if (sepciesId == 5) {
            if (index == 0) {
                return 10;
            }
            if (index != 1) return 9;
            return 11;
        }
        if (sepciesId == 6) {
            if (index == 0) {
                return 10;
            }
            if (index != 1) return 12;
            return 11;
        }
        if (sepciesId == 7) {
            if (index == 0) {
                return 15;
            }
            if (index != 1) return 14;
            return 13;
        }
        if (sepciesId == 8) {
            if (index == 0) {
                return 15;
            }
            if (index != 1) return 16;
            return 13;
        }
        if (sepciesId == 9) {
            if (index == 0) {
                return 17;
            }
            if (index != 1) return 20;
            return 19;
        }
        if (sepciesId != 10) return 0;
        if (index == 0) {
            return 17;
        }
        if (index != 1) return 18;
        return 19;
    }

    public static String[] getSepciesS(String se) {
        if (se.equals("\u7537\u9b3c")) {
            return new String[]{"\u9057\u5fd8", "\u9b3c\u706b", "\u4e09\u5c38\u866b"};
        }
        if (se.equals("\u5973\u9b3c")) {
            return new String[]{"\u9057\u5fd8", "\u9b3c\u706b", "\u9b45\u60d1"};
        }
        if (se.equals("\u7537\u4ed9")) {
            return new String[]{"\u96f7", "\u6c34", "\u98ce"};
        }
        if (se.equals("\u5973\u4ed9")) {
            return new String[]{"\u96f7", "\u6c34", "\u706b"};
        }
        if (se.equals("\u7537\u9b54")) {
            return new String[]{"\u9707\u6151", "\u52a0\u653b", "\u52a0\u901f"};
        }
        if (se.equals("\u5973\u9b54")) {
            return new String[]{"\u9707\u6151", "\u52a0\u653b", "\u76d8\u4e1d"};
        }
        if (se.equals("\u7537\u4eba")) {
            return new String[]{"\u5c01\u5370", "\u660f\u7761", "\u6df7\u4e71"};
        }
        if (se.equals("\u5973\u4eba")) {
            return new String[]{"\u5c01\u5370", "\u660f\u7761", "\u6bd2"};
        }
        if (se.equals("\u7537\u9f99")) {
            return new String[]{"\u9739\u96f3", "\u7518\u9716", "\u6276\u6447"};
        }
        if (!se.equals("\u5973\u9f99")) return null;
        return new String[]{"\u9739\u96f3", "\u7518\u9716", "\u6ca7\u6ce2"};
    }

    public static String getSkillBySMText(int i) {
        if (i >= skillText.length) return null;
        return skillText[i];
    }

    public static int ALLATORIxDEMO(int id, String[] ses) {
        int IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = id >= 1006 && id <= 1010 || id >= 1046 && id <= 1050 || id >= 1021 && id <= 1025 || id >= 1071 && id <= 1075 || id >= 1081 && id <= 1085 ? 0 : (id >= 1011 && id <= 1015 || id >= 1051 && id <= 1055 || id >= 1026 && id <= 1030 || id >= 1061 && id <= 1065 || id >= 1071 && id <= 1075 || id >= 1091 && id <= 1095 ? 1 : 2);
        String IiiiiiiiIIIII2 = ses[IiiiiiiiIIIII];
        int IiiiiiiiIIIII3 = id % 5;
        if (IiiiiiiiIIIII3 == 0) {
            IiiiiiiiIIIII3 = 5;
        }
        if (IiiiiiiiIIIII2.equals("\u5c01\u5370")) {
            id = 1005 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u660f\u7761")) {
            id = 1010 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u6df7\u4e71")) {
            id = 1000 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u6bd2")) {
            id = 1015 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u96f7")) {
            id = 1045 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u6c34")) {
            id = 1050 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u98ce")) {
            id = 1040 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u706b")) {
            id = 1055 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u9707\u6151")) {
            id = 1020 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u52a0\u653b")) {
            id = 1025 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u52a0\u901f")) {
            id = 1035 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u76d8\u4e1d")) {
            id = 1030 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u9057\u5fd8")) {
            id = 1070 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u9b3c\u706b")) {
            id = 1060 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u4e09\u5c38\u866b")) {
            id = 1065 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u9b45\u60d1")) {
            id = 1075 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u9739\u96f3")) {
            id = 1080 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u6ca7\u6ce2")) {
            id = 1085 + IiiiiiiiIIIII3;
            return id;
        }
        if (IiiiiiiiIIIII2.equals("\u7518\u9716")) {
            id = 1090 + IiiiiiiiIIIII3;
            return id;
        }
        if (!IiiiiiiiIIIII2.equals("\u6276\u6447")) return id;
        id = 1095 + IiiiiiiiIIIII3;
        return id;
    }

    public static int getFMIndex(int raceAndSex, int index) {
        if (raceAndSex == 1) {
            if (index == 0) {
                return 1;
            }
            if (index != 1) return 3;
            return 2;
        }
        if (raceAndSex == 2) {
            if (index == 0) {
                return 1;
            }
            if (index != 1) return 4;
            return 3;
        }
        if (raceAndSex == 3) {
            if (index == 0) {
                return 5;
            }
            if (index != 1) return 7;
            return 6;
        }
        if (raceAndSex == 4) {
            if (index == 0) {
                return 8;
            }
            if (index != 1) return 7;
            return 9;
        }
        if (raceAndSex == 5 || raceAndSex == 6) {
            if (index == 0) {
                return 10;
            }
            if (index != 1) return 12;
            return 11;
        }
        if (raceAndSex == 7) {
            if (index == 0) {
                return 11;
            }
            if (index != 1) return 14;
            return 13;
        }
        if (raceAndSex == 8) {
            if (index == 0) {
                return 8;
            }
            if (index != 1) return 15;
            return 11;
        }
        if (raceAndSex != 9) {
            if (raceAndSex != 10) return 0;
        }
        if (index == 0) {
            return 16;
        }
        if (index != 1) return 18;
        return 17;
    }

    public static double getFMSld(double sld) {
        if (sld <= 2000.0) {
            return -3000.0 + sld * 2.0;
        }
        if (sld <= 4000.0) {
            return 1000.0 + (sld - 2000.0) * 1.9;
        }
        if (sld <= 6000.0) {
            return 4800.0 + (sld - 4000.0) * 1.8;
        }
        if (!(sld <= 8000.0)) return 11800.0 + (sld - 8000.0) * 1.6;
        return 8400.0 + (sld - 6000.0) * 1.7;
    }

    public static String getSmKey(int index) {
        if (index == 1) {
            return "\u6df7";
        }
        if (index == 2) {
            return "\u51b0";
        }
        if (index == 3) {
            return "\u7761";
        }
        if (index == 4) {
            return "\u6bd2";
        }
        if (index == 5) {
            return "\u9707";
        }
        if (index == 6) {
            return "\u653b";
        }
        if (index == 7) {
            return "\u76d8";
        }
        if (index == 8) {
            return "\u901f";
        }
        if (index == 9) {
            return "\u98ce";
        }
        if (index == 10) {
            return "\u96f7";
        }
        if (index == 11) {
            return "\u6c34";
        }
        if (index == 12) {
            return "\u706b";
        }
        if (index == 13) {
            return "\u51a5";
        }
        if (index == 14) {
            return "\u86ca";
        }
        if (index == 15) {
            return "\u5fd8";
        }
        if (index == 16) {
            return "\u60d1";
        }
        if (index == 17) {
            return "\u5288";
        }
        if (index == 18) {
            return "\u6d8c";
        }
        if (index == 19) {
            return "\u96e8";
        }
        if (index != 20) return "?";
        return "\u6447";
    }

    public static void ALLATORIxDEMO(StringBuffer buffer, String remark, Skill skill, int lvl) {
        double IiiiiiiiIIIII = Double.parseDouble(skill.getValue());
        double IiiiiiiiIIIII2 = Double.parseDouble(skill.getGrow());
        int IiiiiiiiIIIII3 = 0;
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while (true) {
            if ((IiiiiiiiIIIII3 = remark.indexOf("{\u516c\u5f0f", IiiiiiiiIIIII5)) == -1) {
                buffer.append(remark.substring(IiiiiiiiIIIII5));
                return;
            }
            buffer.append(remark.substring(IiiiiiiiIIIII5, IiiiiiiiIIIII3));
            IiiiiiiiIIIII4 = remark.indexOf("}", IiiiiiiiIIIII3 + 3);
            String IiiiiiiiIIIII6 = remark.substring(IiiiiiiiIIIII3 + 3, IiiiiiiiIIIII4);
            buffer.append("#R");
            switch (IiiiiiiiIIIII6) {
                case "\u4e00": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl)));
                    break;
                }
                case "\u4e8c": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 2.5)));
                    break;
                }
                case "\u4e09": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 0.375)));
                    break;
                }
                case "\u56db": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 + (double)lvl)));
                    break;
                }
                case "\u4e94": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 3.0)));
                    break;
                }
                case "\u516d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 500.0)));
                    break;
                }
                case "\u4e03": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl * 2.0)));
                    break;
                }
                case "\u516b": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl * 0.5)));
                    break;
                }
                case "\u4e5d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII - IiiiiiiiIIIII2 * (double)lvl)));
                    break;
                }
                case "\u5341": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(50.0 + IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl)));
                    break;
                }
                case "\u5341\u4e00": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 10.0)));
                    break;
                }
                case "\u5341\u4e8c": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl / 24000.0)));
                    break;
                }
                case "\u5341\u4e09": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 800.0)));
                    break;
                }
                case "\u5341\u56db": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl / 6.0)));
                    break;
                }
                case "\u5341\u4e94": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII + (double)Math.min(lvl, 3))));
                    break;
                }
                case "\u5341\u516d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII + (double)(lvl > 3 ? lvl - 3 : 0) - 2.0)));
                    break;
                }
                case "\u5341\u4e03": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(10000.0 + IiiiiiiiIIIII2 * (double)lvl * 250.0)));
                    break;
                }
                case "\u5341\u516b": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(13000.0 + IiiiiiiiIIIII2 * (double)(lvl <= 4 ? 4 : lvl + 1) * 500.0)));
                    break;
                }
                case "\u5341\u4e5d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 1000.0)));
                    break;
                }
                case "\u4e8c\u5341": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 2.5)));
                    break;
                }
                case "\u4e8c\u5341\u4e00": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 0.4)));
                    break;
                }
                case "\u4e8c\u5341\u4e8c": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII * 2.5 + IiiiiiiiIIIII2 * (double)lvl)));
                    break;
                }
                case "\u4e8c\u5341\u4e09": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 0.25)));
                    break;
                }
                case "\u4e8c\u5341\u56db": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 0.75)));
                    break;
                }
                case "\u4e8c\u5341\u4e94": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(25.0 + IiiiiiiiIIIII2 * (double)lvl * 2.5)));
                    break;
                }
                case "\u4e8c\u5341\u516d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl * 5.0)));
                    break;
                }
                case "\u4e8c\u5341\u4e03": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 3000.0)));
                    break;
                }
                case "\u4e8c\u5341\u516b": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII * 1500.0 + IiiiiiiiIIIII2 * (double)lvl * 3000.0)));
                    break;
                }
                case "\u4e8c\u5341\u4e5d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(100.0 / (lvl <= 2 ? IiiiiiiiIIIII2 * (double)lvl * 10.0 : (double)(10 + 5 * lvl)))));
                    break;
                }
                case "\u4e09\u5341": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)lvl * 0.008)));
                    break;
                }
                case "\u4e09\u5341\u4e00": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(50.0 + IiiiiiiiIIIII - IiiiiiiiIIIII2 * (double)lvl)));
                    break;
                }
                case "\u4e09\u5341\u4e8c": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(20.0 + IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl)));
                    break;
                }
                case "\u4e09\u5341\u4e09": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(2 * lvl)));
                    break;
                }
                case "\u4e09\u5341\u56db": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII * IiiiiiiiIIIII2 * (double)lvl * 600.0)));
                    break;
                }
                case "\u4e09\u5341\u4e94": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(60.0 + IiiiiiiiIIIII2 * (double)lvl * 5.0)));
                    break;
                }
                case "\u4e09\u5341\u516d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)(lvl + 1))));
                    break;
                }
                case "\u4e09\u5341\u4e03": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII2 * (double)(lvl + 1) * 10000.0)));
                    break;
                }
                case "\u4e09\u5341\u516b": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(lvl <= 2 ? 1 : (lvl <= 4 ? 2 : 3))));
                    break;
                }
                case "\u4e94\u5341": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(30 + 10 * lvl)));
                    break;
                }
                case "\u4e94\u5341\u4e00": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 5.0)));
                    break;
                }
                case "\u4e94\u5341\u4e8c": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(5 + lvl)));
                    break;
                }
                case "\u4e94\u5341\u4e09": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 15.0)));
                    break;
                }
                case "\u4e94\u5341\u56db": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 4.0)));
                    break;
                }
                case "\u4e94\u5341\u4e94": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 10.0)));
                    break;
                }
                case "\u4e94\u5341\u516d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 3.75)));
                    break;
                }
                case "\u4e94\u5341\u4e03": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) / 3.0 * 10.0)));
                    break;
                }
                case "\u4e94\u5341\u516b": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 6.0)));
                    break;
                }
                case "\u4e94\u5341\u4e5d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(55 + 5 * lvl)));
                    break;
                }
                case "\u516d\u5341": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(5 * lvl)));
                    break;
                }
                case "\u516d\u5341\u4e00": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 3.0)));
                    break;
                }
                case "\u516d\u5341\u4e8c": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(1 + lvl)));
                    break;
                }
                case "\u516d\u5341\u4e09": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 8.0)));
                    break;
                }
                case "\u516d\u5341\u56db": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(10 + 2 * lvl)));
                    break;
                }
                case "\u516d\u5341\u4e94": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(50 + 5 * lvl)));
                    break;
                }
                case "\u516d\u5341\u516d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(55 + lvl)));
                    break;
                }
                case "\u516d\u5341\u4e03": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(10000 + 2000 * lvl)));
                    break;
                }
                case "\u516d\u5341\u516b": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl + IiiiiiiiIIIII2)));
                    break;
                }
                case "\u516d\u5341\u4e5d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(2 * lvl)));
                    break;
                }
                case "\u4e03\u5341": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(3 * lvl)));
                    break;
                }
                case "\u4e03\u5341\u4e00": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(4 * lvl)));
                    break;
                }
                case "\u4e03\u5341\u4e8c": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(6 * lvl)));
                    break;
                }
                case "\u4e03\u5341\u4e09": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(0.1 * (double)lvl)));
                    break;
                }
                case "\u4e03\u5341\u56db": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(0.2 * (double)lvl)));
                    break;
                }
                case "\u4e03\u5341\u4e94": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 0.375)));
                    break;
                }
                case "\u4e03\u5341\u516d": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)((IiiiiiiiIIIII + IiiiiiiiIIIII2 * (double)lvl) * 2.0)));
                    break;
                }
                case "\u4e03\u5341\u4e03": {
                    buffer.append(IIIiiiiiIiIiI.iIiIiiiiIIiii((double)(3 + lvl)));
                    break;
                }
            }
            buffer.append("#G");
            IiiiiiiiIIIII5 = IiiiiiiiIIIII4 + 1;
        }
    }

    public static String getFMMsg(int index) {
        if (index == 1) {
            return "\u9002\u5408\u8840\u6297\u578b\u4eba\u65cf#r\u4f7f\u7528\u6280\u80fd\u63d0\u9ad8\u81ea\u8eab\u7684\u53d7\u5230\u7684\u4f24\u5bb3\u51cf\u514d\u548c\u4ed9\u6cd5\u9b3c\u706b\u7269\u7406\u6297\u6027\uff0c\u63d0\u5347\u81ea\u8eab\u7684\u751f\u5b58\u80fd\u529b\u3002";
        }
        if (index == 2) {
            return "\u9002\u5408\u8f85\u52a9\u578b\u4eba\u65cf#r\u4f7f\u654c\u65b9\u76ee\u6807\u5728\u53d7\u5230\u4f24\u5bb3\u65f6\u53d7\u5230\u989d\u5916\u4f24\u5bb3\uff0c\u63d0\u9ad8\u961f\u4f0d\u8f93\u51fa\u80fd\u529b\u3002";
        }
        if (index == 3) {
            return "\u9002\u5408\u63a7\u5236\u578b\u4eba\u65cf#r\u964d\u4f4e\u76ee\u6807\u5e08\u95e8\u6cd5\u672f\u7684\u547d\u4e2d\u51e0\u7387\uff0c\u63d0\u9ad8\u81ea\u5df1\u7684\u63a7\u5236\u80fd\u529b\u3002";
        }
        if (index == 4) {
            return "\u9002\u5408\u7269\u7406\u578b\u4eba\u65cf#r\u63d0\u9ad8\u81ea\u8eab\u653b\u51fb\u529b/\u5ffd\u89c6\u9632\u5fa1\u548c\u547d\u4e2d\uff0c\u653b\u51fb\u65f6\u6709\u51e0\u7387\u989d\u5916\u5206\u88c2\u653b\u51fb\u548c\u5ffd\u89c6\u654c\u65b9\u8eb2\u95ea/\u53cd\u9707/\u53cd\u51fb\u3002";
        }
        if (index == 5) {
            return "\u9002\u5408\u7efc\u5408\u578b\u9b54\u65cf#r\u589e\u52a0\u81ea\u8eab\u548c\u961f\u53cb\u7684\u6cd5\u672f\u547d\u4e2d\u51e0\u7387\u548c\u6cd5\u672f\u8eb2\u95ea\u51e0\u7387\uff0c\u63d0\u5347\u961f\u4f0d\u6574\u4f53\u6218\u6597\u80fd\u529b\u3002";
        }
        if (index == 6) {
            return "\u9002\u5408\u7269\u7406\u578b\u9b54\u65cf#r\u63d0\u9ad8\u81ea\u8eab\u653b\u51fb\u529b\u548c\u4ed9\u6cd5\u4eba\u6cd5\u6297\u6027\uff0c\u653b\u51fb\u65f6\u6709\u51e0\u7387\u989d\u5916\u5206\u88c2\u653b\u51fb\uff0c\u9020\u6210\u989d\u5916\u7684\u7269\u7406\u4f24\u5bb3\u3002";
        }
        if (index == 7) {
            return "\u9002\u5408\u8f85\u52a9\u578b\u9b54\u65cf#r\u589e\u52a0\u5df1\u65b9\u53ec\u5524\u517d\u7684\u5c5e\u6027\u548c\u8fdb\u573a\u7684\u673a\u4f1a\uff0c\u63d0\u5347\u81ea\u5df1\u7684\u8f85\u52a9\u80fd\u529b\u3002";
        }
        if (index == 8) {
            return "\u9002\u5408\u9632\u5fa1\u578b\u9b54\u65cf#r\u589e\u52a0\u81ea\u8eab\u53ca\u961f\u53cb\u7684\u6cd5\u672f\u8eb2\u95ea\u51e0\u7387\u548c\u4f24\u5bb3\u51cf\u514d\uff0c\u63d0\u5347\u961f\u4f0d\u7684\u9632\u5fa1\u80fd\u529b\u3002";
        }
        if (index == 9) {
            return "\u9002\u5408\u7269\u7406\u578b\u9b54\u65cf#r\u63d0\u9ad8\u81ea\u8eab\u653b\u51fb\u529b\u548c\u901f\u5ea6\uff0c\u653b\u51fb\u65f6\u6709\u51e0\u7387\u989d\u5916\u5206\u88c2\u653b\u51fb\u548c\u56de\u590d\u5df1\u65b9\u5355\u4f4d\u6c14\u8840\u3002";
        }
        if (index == 10) {
            return "\u9002\u5408\u538b\u5236\u578b\u4ed9\u65cf#r\u589e\u52a0\u81ea\u8eab\u53ca\u961f\u53cb\u7684\u6cd5\u672f\u547d\u4e2d\u548c\u6cd5\u672f\u66b4\u51fb\u51e0\u7387\uff0c\u63d0\u5347\u961f\u4f0d\u7684\u6301\u7eed\u6218\u6597\u80fd\u529b\u3002";
        }
        if (index == 11) {
            return "\u9002\u5408\u7206\u53d1\u578b\u4ed9\u65cf\u53ca\u9b3c\u65cf#r\u52a0\u6df1\u654c\u65b9\u53d7\u5230\u81ea\u5df1\u548c\u961f\u53cb\u7684\u4f24\u5bb3\uff0c\u63d0\u5347\u961f\u4f0d\u7684\u6574\u4f53\u8f93\u51fa\u80fd\u529b\u3002";
        }
        if (index == 12) {
            return "\u9002\u5408\u7a33\u5b9a\u578b\u4ed9\u65cf#r\u4f7f\u81ea\u5df1\u53ca\u961f\u53cb\u9020\u6210\u7684\u4f24\u5bb3\u6309\u4e00\u5b9a\u767e\u5206\u6bd4\u8f6c\u5316\u4e3a\u5723\u795e\u4f24\u5bb3\uff0c\u63d0\u5347\u961f\u4f0d\u7684\u6574\u4f53\u8f93\u51fa\u80fd\u529b\u3002";
        }
        if (index == 13) {
            return "\u9002\u5408\u56de\u590d\u578b\u9b3c\u65cf#r\u4e3a\u5df1\u65b9\u5355\u4f4d\u56de\u590d\u6c14\u8840\u65f6\u989d\u5916\u589e\u52a0\u62a4\u76fe\uff0c\u63d0\u5347\u961f\u4f0d\u7684\u751f\u5b58\u80fd\u529b\u3002";
        }
        if (index == 14) {
            return "\u9002\u5408\u8840\u6297\u578b\u9b3c\u65cf#r\u589e\u52a0\u81ea\u8eab\u4eba\u6cd5\u6297\u6027/\u6cd5\u672f\u8eb2\u95ea\u51e0\u7387\u548c\u53cd\u9707\uff0c\u63d0\u9ad8\u81ea\u8eab\u7684\u751f\u5b58\u80fd\u529b\u3002";
        }
        if (index == 15) {
            return "\u9002\u5408\u63a7\u5236\u578b\u9b3c\u65cf#r\u964d\u4f4e\u654c\u65b9\u76ee\u6807\u9020\u6210\u7684\u4f24\u5bb3\uff0c\u63d0\u5347\u961f\u4f0d\u7684\u6574\u4f53\u9632\u5fa1\u80fd\u529b\u3002";
        }
        if (index == 16) {
            return "\u9002\u5408\u8f85\u52a9\u578b\u9f99\u65cf#r\u4f7f\u5df1\u65b9\u5355\u4f4d\u51fb\u6740\u654c\u65b9\u5355\u4f4d\u65f6\u6062\u590d\u5df1\u65b9\u6c14\u8840\uff0c\u63d0\u9ad8\u5df1\u65b9\u751f\u5b58\u80fd\u529b\u3002";
        }
        if (index == 17) {
            return "\u9002\u5408\u8f93\u51fa\u578b\u9f99\u65cf#r\u4f7f\u81ea\u5df1\u9020\u6210\u7684\u4f24\u5bb3\u8f6c\u5316\u4e3a\u795e\u5723\u4f24\u5bb3\uff0c\u63d0\u5347\u81ea\u5df1\u7684\u8f93\u51fa\u80fd\u529b\u3002";
        }
        if (index != 18) return "";
        return "\u9002\u5408\u8f93\u51fa\u578b\u9f99\u65cf#r\u63d0\u9ad8\u81ea\u5df1\u8fde\u51fb\u65f6\u7684\u4f24\u5bb3\u548c\u8fde\u51fb\u51e0\u7387\uff0c\u63d0\u5347\u81ea\u5df1\u7684\u8f93\u51fa\u80fd\u529b\u3002";
    }

    public static int getFMCS(int type, double sld) {
        if (type == 1) {
            if (sld >= 8320.0) {
                return 5;
            }
            if (sld >= 2160.0) {
                return 4;
            }
            if (!(sld >= 220.0)) return 2;
            return 3;
        }
        if (type == 2) {
            if (sld >= 8780.0) {
                return 6;
            }
            if (sld >= 2760.0) {
                return 5;
            }
            if (!(sld >= 380.0)) return 3;
            return 4;
        }
        if (type == 3) {
            if (sld >= 5060.0) {
                return 4;
            }
            if (!(sld >= 390.0)) return 2;
            return 3;
        }
        if (type == 4) {
            if (sld >= 8780.0) {
                return 4;
            }
            if (sld >= 2760.0) {
                return 3;
            }
            if (!(sld >= 380.0)) return 1;
            return 2;
        }
        if (type == 5) {
            if (sld >= 5060.0) {
                return 3;
            }
            if (!(sld >= 390.0)) return 1;
            return 2;
        }
        if (type == 6) {
            if (sld >= 8320.0) {
                return 6;
            }
            if (sld >= 2160.0) {
                return 5;
            }
            if (!(sld >= 220.0)) return 3;
            return 4;
        }
        if (type == 7) {
            if (sld >= 8780.0) {
                return 7;
            }
            if (sld >= 2760.0) {
                return 6;
            }
            if (!(sld >= 380.0)) return 4;
            return 5;
        }
        if (type == 8) {
            if (sld >= 8780.0) {
                return 5;
            }
            if (sld >= 3860.0) {
                return 4;
            }
            if (!(sld >= 1220.0)) return 2;
            return 3;
        }
        if (type == 9) {
            if (sld >= 8320.0) {
                return 4;
            }
            if (sld >= 2160.0) {
                return 3;
            }
            if (!(sld >= 220.0)) return 1;
            return 2;
        }
        if (type == 10) {
            if (sld >= 5060.0) {
                return 6;
            }
            if (!(sld >= 390.0)) return 4;
            return 5;
        }
        if (type == 11) {
            if (sld >= 8780.0) {
                return 5;
            }
            if (sld >= 2760.0) {
                return 4;
            }
            if (!(sld >= 380.0)) return 2;
            return 3;
        }
        if (type != 12) return 1;
        if (sld >= 5060.0) {
            return 5;
        }
        if (!(sld >= 390.0)) return 3;
        return 4;
    }

    static {
        skillMsg = new String[]{"\u6df7", "\u51b0", "\u7761", "\u6bd2", "\u6151", "\u725b", "\u76d8", "\u901f", "\u98ce", "\u96f7", "\u6c34", "\u706b", "\u51a5", "\u86ca", "\u5fd8", "\u9b45", "\u9739", "\u6ca7", "\u9716", "\u6447"};
        skillSM = new String[]{"\u5316\u751f\u5bfa", "\u5c06\u519b\u5e9c", "\u65b9\u5bf8\u5c71", "\u5973\u513f\u6751", "\u9ed1\u6c34\u6cb3", "\u9b54\u738b\u5be8", "\u76d8\u4e1d\u6d1e", "\u72ee\u9a7c\u5cad", "\u4e94\u5e84\u89c2", "\u5929\u5bab", "\u9f99\u5bab", "\u666e\u9640\u5c71", "\u767d\u9aa8\u6d1e", "\u5927\u96c1\u5854", "\u9634\u90fd\u6bbf", "\u5170\u82e5\u5bfa", "\u6d41\u5dde", "\u701b\u6d32", "\u84ec\u83b1", "\u65b9\u58f6"};
        skillSF = new String[]{"\u7a7a\u5ea6\u7985\u5e08", "\u7a0b\u54ac\u91d1", "\u83e9\u63d0\u7956\u5e08", "\u5b59\u5a46\u5a46", "\u9ed1\u6c34\u86df\u738b", "\u725b\u9b54\u738b", "\u76d8\u4e1d\u5a18\u5a18", "\u5927\u5927\u738b", "\u9547\u5143\u5927\u4ed9", "\u592a\u4e0a\u8001\u541b", "\u4e1c\u6d77\u9f99\u738b", "\u89c2\u97f3\u59d0\u59d0", "\u767d\u9aa8\u4e4b\u7075", "\u4e09\u5c38\u795e", "\u738b\u4e07\u5e73", "\u8042\u5c0f\u5029", "\u5929\u67f1", "\u6ca7\u6f9c\u4e4b\u773c", "\u9f99\u9996\u6728", "\u6446\u5c3e\u77a7"};
        skillText = new String[]{"\u6df7\u4e71", "\u51b0\u51bb", "\u660f\u7761", "\u6bd2\u7cfb", "\u9707\u6151", "\u5f3a\u529b", "\u52a0\u9632", "\u6025\u901f", "\u98ce", "\u96f7", "\u6c34", "\u706b", "\u9b3c\u706b", "\u4e09\u5c38\u866b", "\u9057\u5fd8", "\u9b45\u60d1", "\u6d41\u5468", "\u701b\u6d32", "\u84ec\u83b1", "\u65b9\u58f6"};
    }

    public static String getSepciesN(BigDecimal se) {
        int IiiiiiiiIIIII = se.intValue();
        if (IiiiiiiiIIIII == 23001) return "\u7537\u9b3c";
        if (IiiiiiiiIIIII == 23002) return "\u7537\u9b3c";
        if (IiiiiiiiIIIII == 23003) return "\u7537\u9b3c";
        if (IiiiiiiiIIIII == 23007) {
            return "\u7537\u9b3c";
        }
        if (IiiiiiiiIIIII == 23004) return "\u5973\u9b3c";
        if (IiiiiiiiIIIII == 23005) return "\u5973\u9b3c";
        if (IiiiiiiiIIIII == 23006) return "\u5973\u9b3c";
        if (IiiiiiiiIIIII == 23008) {
            return "\u5973\u9b3c";
        }
        if (IiiiiiiiIIIII == 24001) return "\u7537\u9f99";
        if (IiiiiiiiIIIII == 24002) return "\u7537\u9f99";
        if (IiiiiiiiIIIII == 24003) {
            return "\u7537\u9f99";
        }
        if (IiiiiiiiIIIII == 24004) return "\u5973\u9f99";
        if (IiiiiiiiIIIII == 24005) return "\u5973\u9f99";
        if (IiiiiiiiIIIII == 24006) {
            return "\u5973\u9f99";
        }
        if (IiiiiiiiIIIII == 22001) return "\u7537\u4ed9";
        if (IiiiiiiiIIIII == 22002) return "\u7537\u4ed9";
        if (IiiiiiiiIIIII == 22003) return "\u7537\u4ed9";
        if (IiiiiiiiIIIII == 22007) return "\u7537\u4ed9";
        if (IiiiiiiiIIIII == 22009) return "\u7537\u4ed9";
        if (IiiiiiiiIIIII == 22011) {
            return "\u7537\u4ed9";
        }
        if (IiiiiiiiIIIII == 22004) return "\u5973\u4ed9";
        if (IiiiiiiiIIIII == 22005) return "\u5973\u4ed9";
        if (IiiiiiiiIIIII == 22006) return "\u5973\u4ed9";
        if (IiiiiiiiIIIII == 22008) return "\u5973\u4ed9";
        if (IiiiiiiiIIIII == 22010) return "\u5973\u4ed9";
        if (IiiiiiiiIIIII == 22012) {
            return "\u5973\u4ed9";
        }
        if (IiiiiiiiIIIII == 21001) return "\u7537\u9b54";
        if (IiiiiiiiIIIII == 21002) return "\u7537\u9b54";
        if (IiiiiiiiIIIII == 21003) return "\u7537\u9b54";
        if (IiiiiiiiIIIII == 21007) return "\u7537\u9b54";
        if (IiiiiiiiIIIII == 21009) return "\u7537\u9b54";
        if (IiiiiiiiIIIII == 21011) {
            return "\u7537\u9b54";
        }
        if (IiiiiiiiIIIII == 21004) return "\u5973\u9b54";
        if (IiiiiiiiIIIII == 21005) return "\u5973\u9b54";
        if (IiiiiiiiIIIII == 21006) return "\u5973\u9b54";
        if (IiiiiiiiIIIII == 21008) return "\u5973\u9b54";
        if (IiiiiiiiIIIII == 21010) return "\u5973\u9b54";
        if (IiiiiiiiIIIII == 21012) {
            return "\u5973\u9b54";
        }
        if (IiiiiiiiIIIII == 20001) return "\u7537\u4eba";
        if (IiiiiiiiIIIII == 20002) return "\u7537\u4eba";
        if (IiiiiiiiIIIII == 20003) return "\u7537\u4eba";
        if (IiiiiiiiIIIII == 20007) return "\u7537\u4eba";
        if (IiiiiiiiIIIII == 20009) return "\u7537\u4eba";
        if (IiiiiiiiIIIII == 20011) {
            return "\u7537\u4eba";
        }
        if (IiiiiiiiIIIII == 20004) return "\u5973\u4eba";
        if (IiiiiiiiIIIII == 20005) return "\u5973\u4eba";
        if (IiiiiiiiIIIII == 20006) return "\u5973\u4eba";
        if (IiiiiiiiIIIII == 20008) return "\u5973\u4eba";
        if (IiiiiiiiIIIII == 20010) return "\u5973\u4eba";
        if (IiiiiiiiIIIII != 20012) return null;
        return "\u5973\u4eba";
    }

    public static int getSepciesIndex(BigDecimal se, int type) {
        int IiiiiiiiIIIII = se.intValue() - 20000;
        if (IiiiiiiiIIIII < 1000) {
            if (IiiiiiiiIIIII == 1 || IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 9) {
                if (type == 0) {
                    return 1;
                }
                if (type != 1) return 0;
                return 2;
            }
            if (type == 0) {
                return 1;
            }
            if (type != 1) return 3;
            return 2;
        }
        if (IiiiiiiiIIIII < 2000) {
            if ((IiiiiiiiIIIII %= 1000) == 1 || IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 9) {
                if (type == 0) {
                    return 4;
                }
                if (type != 1) return 7;
                return 5;
            }
            if (type == 0) {
                return 4;
            }
            if (type != 1) return 6;
            return 5;
        }
        if (IiiiiiiiIIIII < 3000) {
            if ((IiiiiiiiIIIII %= 1000) == 1 || IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 9) {
                if (type == 0) {
                    return 9;
                }
                if (type != 1) return 8;
                return 10;
            }
            if (type == 0) {
                return 9;
            }
            if (type != 1) return 11;
            return 10;
        }
        if (IiiiiiiiIIIII < 4000) {
            if ((IiiiiiiiIIIII %= 1000) == 1 || IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 9) {
                if (type == 0) {
                    return 14;
                }
                if (type != 1) return 13;
                return 12;
            }
            if (type == 0) {
                return 14;
            }
            if (type != 1) return 15;
            return 12;
        }
        if (IiiiiiiiIIIII >= 5000) return -1;
        if ((IiiiiiiiIIIII %= 1000) == 1 || IiiiiiiiIIIII == 2 || IiiiiiiiIIIII == 3 || IiiiiiiiIIIII == 7 || IiiiiiiiIIIII == 9) {
            if (type == 0) {
                return 16;
            }
            if (type != 1) return 19;
            return 18;
        }
        if (type == 0) {
            return 16;
        }
        if (type != 1) return 17;
        return 18;
    }

    public static String ALLATORIxDEMO(String remark, Skill skillAll, double level) {
        remark = remark.replace("{\u516c\u5f0f\u4e00}", String.valueOf(Arith.iiiIiiiiiiIIi((double)Double.parseDouble(skillAll.getGrow()), (double)level)));
        return remark;
    }

    public static String ALLATORIxDEMO(Skill skill, double sld) {
        String IiiiiiiiIIIII;
        double IiiiiiiiIIIII2 = SkillUtil.getFMSld(sld);
        String IiiiiiiiIIIII3 = "#G" + skill.getRemark();
        double IiiiiiiiIIIII4 = Double.parseDouble(skill.getValue());
        double IiiiiiiiIIIII5 = Double.parseDouble(skill.getGrow());
        int IiiiiiiiIIIII6 = 1;
        while (IiiiiiiiIIIII6 <= 27) {
            IiiiiiiiIIIII = MsgUntil.iIiIiiiiIIiii((int)IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII6 > 10 && IiiiiiiiIIIII6 % 10 == 0) {
                IiiiiiiiIIIII = String.valueOf(MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 / 10))) + "\u5341";
            } else if (IiiiiiiiIIIII6 > 20) {
                IiiiiiiiIIIII = String.valueOf(MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 / 10))) + "\u5341" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 % 10));
            } else if (IiiiiiiiIIIII6 > 10) {
                IiiiiiiiIIIII = "\u5341" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 % 10));
            }
            IiiiiiiiIIIII = "{\u6cd5\u95e8" + IiiiiiiiIIIII + "}";
            IiiiiiiiIIIII3 = IiiiiiiiIIIII3.replace(IiiiiiiiIIIII, SkillUtil.ALLATORIxDEMO(IiiiiiiiIIIII6++, IiiiiiiiIIIII4, IiiiiiiiIIIII5, IiiiiiiiIIIII2));
        }
        IiiiiiiiIIIII6 = 1;
        while (IiiiiiiiIIIII6 <= 12) {
            IiiiiiiiIIIII = MsgUntil.iIiIiiiiIIiii((int)IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII6 > 10 && IiiiiiiiIIIII6 % 10 == 0) {
                IiiiiiiiIIIII = String.valueOf(MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 / 10))) + "\u5341";
            } else if (IiiiiiiiIIIII6 > 20) {
                IiiiiiiiIIIII = String.valueOf(MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 / 10))) + "\u5341" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 % 10));
            } else if (IiiiiiiiIIIII6 > 10) {
                IiiiiiiiIIIII = "\u5341" + MsgUntil.iIiIiiiiIIiii((int)(IiiiiiiiIIIII6 % 10));
            }
            IiiiiiiiIIIII = "{\u6cd5\u95e8\u91cd\u6570" + IiiiiiiiIIIII + "}";
            StringBuilder stringBuilder = new StringBuilder("#R").append(SkillUtil.getFMCS(IiiiiiiiIIIII6, sld)).append("#G");
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII3.replace(IiiiiiiiIIIII, stringBuilder.toString());
        }
        return IiiiiiiiIIIII3;
    }

    public static String getSkillMsg(int i) {
        if (i >= skillMsg.length) return null;
        return skillMsg[i];
    }

    public static int getSepciesIndex(BigDecimal se) {
        int IiiiiiiiIIIII = se.intValue();
        if (IiiiiiiiIIIII == 23001) return 7;
        if (IiiiiiiiIIIII == 23002) return 7;
        if (IiiiiiiiIIIII == 23003) return 7;
        if (IiiiiiiiIIIII == 23007) {
            return 7;
        }
        if (IiiiiiiiIIIII == 23004) return 8;
        if (IiiiiiiiIIIII == 23005) return 8;
        if (IiiiiiiiIIIII == 23006) return 8;
        if (IiiiiiiiIIIII == 23008) {
            return 8;
        }
        if (IiiiiiiiIIIII == 24001) return 9;
        if (IiiiiiiiIIIII == 24002) return 9;
        if (IiiiiiiiIIIII == 24003) {
            return 9;
        }
        if (IiiiiiiiIIIII == 24004) return 10;
        if (IiiiiiiiIIIII == 24005) return 10;
        if (IiiiiiiiIIIII == 24006) {
            return 10;
        }
        if (IiiiiiiiIIIII == 22001) return 5;
        if (IiiiiiiiIIIII == 22002) return 5;
        if (IiiiiiiiIIIII == 22003) return 5;
        if (IiiiiiiiIIIII == 22007) return 5;
        if (IiiiiiiiIIIII == 22009) return 5;
        if (IiiiiiiiIIIII == 22011) {
            return 5;
        }
        if (IiiiiiiiIIIII == 22004) return 6;
        if (IiiiiiiiIIIII == 22005) return 6;
        if (IiiiiiiiIIIII == 22006) return 6;
        if (IiiiiiiiIIIII == 22008) return 6;
        if (IiiiiiiiIIIII == 22010) return 6;
        if (IiiiiiiiIIIII == 22012) {
            return 6;
        }
        if (IiiiiiiiIIIII == 21001) return 3;
        if (IiiiiiiiIIIII == 21002) return 3;
        if (IiiiiiiiIIIII == 21003) return 3;
        if (IiiiiiiiIIIII == 21007) return 3;
        if (IiiiiiiiIIIII == 21009) return 3;
        if (IiiiiiiiIIIII == 21011) {
            return 3;
        }
        if (IiiiiiiiIIIII == 21004) return 4;
        if (IiiiiiiiIIIII == 21005) return 4;
        if (IiiiiiiiIIIII == 21006) return 4;
        if (IiiiiiiiIIIII == 21008) return 4;
        if (IiiiiiiiIIIII == 21010) return 4;
        if (IiiiiiiiIIIII == 21012) {
            return 4;
        }
        if (IiiiiiiiIIIII == 20001) return 1;
        if (IiiiiiiiIIIII == 20002) return 1;
        if (IiiiiiiiIIIII == 20003) return 1;
        if (IiiiiiiiIIIII == 20007) return 1;
        if (IiiiiiiiIIIII == 20009) return 1;
        if (IiiiiiiiIIIII == 20011) {
            return 1;
        }
        if (IiiiiiiiIIIII == 20004) return 2;
        if (IiiiiiiiIIIII == 20005) return 2;
        if (IiiiiiiiIIIII == 20006) return 2;
        if (IiiiiiiiIIIII == 20008) return 2;
        if (IiiiiiiiIIIII == 20010) return 2;
        if (IiiiiiiiIIIII != 20012) return 0;
        return 2;
    }

    public static String ALLATORIxDEMO(Skill skill, int skillLvl) {
        int IiiiiiiiIIIII = Integer.parseInt(skill.getSkillid());
        String IiiiiiiiIIIII2 = skill.getRemark();
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        int IiiiiiiiIIIII4 = 0;
        int IiiiiiiiIIIII5 = 0;
        while ((IiiiiiiiIIIII4 = IiiiiiiiIIIII2.indexOf("{", IiiiiiiiIIIII5)) != -1 && (IiiiiiiiIIIII5 = IiiiiiiiIIIII2.indexOf("}", IiiiiiiiIIIII4 + 1)) != -1) {
            String IiiiiiiiIIIII6 = IiiiiiiiIIIII2.substring(IiiiiiiiIIIII4 + 1, IiiiiiiiIIIII5);
            if (IiiiiiiiIIIII6.indexOf("{") != -1) {
                ++IiiiiiiiIIIII4;
                continue;
            }
            int IiiiiiiiIIIII7 = IiiiiiiiIIIII2.length();
            IiiiiiiiIIIII2 = SkillUtil.ALLATORIxDEMO(IiiiiiiiIIIII6, IiiiiiiiIIIII2, IiiiiiiiIIIII, skillLvl);
            IiiiiiiiIIIII5 += IiiiiiiiIIIII2.length() - IiiiiiiiIIIII7;
        }
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII2);
        return IiiiiiiiIIIII3.toString();
    }

    public static String getSkillBySM(int i) {
        if (i >= skillSM.length) return null;
        return skillSM[i];
    }

    public static String getSkillBySMSF(int i) {
        if (i >= skillSF.length) return null;
        return skillSF[i];
    }
}
