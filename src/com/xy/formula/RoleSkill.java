/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

import java.util.ArrayList;
import java.util.List;

public class RoleSkill {
    private static RoleSkill roleSkill;

    public List<String> ALLATORIxDEMO(int type) {
        ArrayList<Integer> IiiiiiiiIIIII = new ArrayList<Integer>();
        if (type < 1 || type > 10) {
            IiiiiiiiIIIII.add(type);
        } else {
            switch ((type + 1) / 2) {
                case 1: {
                    IiiiiiiiIIIII.add(23);
                    IiiiiiiiIIIII.add(24);
                    if (type % 2 == 0) {
                        IiiiiiiiIIIII.add(25);
                        break;
                    }
                    IiiiiiiiIIIII.add(26);
                    break;
                }
                case 2: {
                    IiiiiiiiIIIII.add(27);
                    IiiiiiiiIIIII.add(28);
                    if (type % 2 == 0) {
                        IiiiiiiiIIIII.add(29);
                        break;
                    }
                    IiiiiiiiIIIII.add(30);
                    break;
                }
                case 3: {
                    IiiiiiiiIIIII.add(19);
                    IiiiiiiiIIIII.add(22);
                    if (type % 2 == 0) {
                        IiiiiiiiIIIII.add(20);
                        break;
                    }
                    IiiiiiiiIIIII.add(21);
                    break;
                }
                case 4: {
                    IiiiiiiiIIIII.add(72);
                    IiiiiiiiIIIII.add(74);
                    if (type % 2 == 0) {
                        IiiiiiiiIIIII.add(75);
                        break;
                    }
                    IiiiiiiiIIIII.add(73);
                    break;
                }
                case 5: {
                    IiiiiiiiIIIII.add(76);
                    IiiiiiiiIIIII.add(77);
                    if (type % 2 == 0) {
                        IiiiiiiiIIIII.add(79);
                        break;
                    }
                    IiiiiiiiIIIII.add(78);
                    break;
                }
            }
        }
        ArrayList<String> IiiiiiiiIIIII2 = new ArrayList<String>();
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII.size() - 1;
        while (IiiiiiiiIIIII3 >= 0) {
            switch ((Integer)IiiiiiiiIIIII.get(IiiiiiiiIIIII3)) {
                case 19: {
                    IiiiiiiiIIIII2.add("1046");
                    IiiiiiiiIIIII2.add("1047");
                    IiiiiiiiIIIII2.add("1048");
                    IiiiiiiiIIIII2.add("1049");
                    IiiiiiiiIIIII2.add("1050");
                    break;
                }
                case 20: {
                    IiiiiiiiIIIII2.add("1056");
                    IiiiiiiiIIIII2.add("1057");
                    IiiiiiiiIIIII2.add("1058");
                    IiiiiiiiIIIII2.add("1059");
                    IiiiiiiiIIIII2.add("1060");
                    break;
                }
                case 21: {
                    IiiiiiiiIIIII2.add("1041");
                    IiiiiiiiIIIII2.add("1042");
                    IiiiiiiiIIIII2.add("1043");
                    IiiiiiiiIIIII2.add("1044");
                    IiiiiiiiIIIII2.add("1045");
                    break;
                }
                case 22: {
                    IiiiiiiiIIIII2.add("1051");
                    IiiiiiiiIIIII2.add("1052");
                    IiiiiiiiIIIII2.add("1053");
                    IiiiiiiiIIIII2.add("1054");
                    IiiiiiiiIIIII2.add("1055");
                    break;
                }
                case 23: {
                    IiiiiiiiIIIII2.add("1006");
                    IiiiiiiiIIIII2.add("1007");
                    IiiiiiiiIIIII2.add("1008");
                    IiiiiiiiIIIII2.add("1009");
                    IiiiiiiiIIIII2.add("1010");
                    break;
                }
                case 24: {
                    IiiiiiiiIIIII2.add("1011");
                    IiiiiiiiIIIII2.add("1012");
                    IiiiiiiiIIIII2.add("1013");
                    IiiiiiiiIIIII2.add("1014");
                    IiiiiiiiIIIII2.add("1015");
                    break;
                }
                case 25: {
                    IiiiiiiiIIIII2.add("1016");
                    IiiiiiiiIIIII2.add("1017");
                    IiiiiiiiIIIII2.add("1018");
                    IiiiiiiiIIIII2.add("1019");
                    IiiiiiiiIIIII2.add("1020");
                    break;
                }
                case 26: {
                    IiiiiiiiIIIII2.add("1001");
                    IiiiiiiiIIIII2.add("1002");
                    IiiiiiiiIIIII2.add("1003");
                    IiiiiiiiIIIII2.add("1004");
                    IiiiiiiiIIIII2.add("1005");
                    break;
                }
                case 27: {
                    IiiiiiiiIIIII2.add("1021");
                    IiiiiiiiIIIII2.add("1022");
                    IiiiiiiiIIIII2.add("1023");
                    IiiiiiiiIIIII2.add("1024");
                    IiiiiiiiIIIII2.add("1025");
                    break;
                }
                case 28: {
                    IiiiiiiiIIIII2.add("1026");
                    IiiiiiiiIIIII2.add("1027");
                    IiiiiiiiIIIII2.add("1028");
                    IiiiiiiiIIIII2.add("1029");
                    IiiiiiiiIIIII2.add("1030");
                    break;
                }
                case 29: {
                    IiiiiiiiIIIII2.add("1031");
                    IiiiiiiiIIIII2.add("1032");
                    IiiiiiiiIIIII2.add("1033");
                    IiiiiiiiIIIII2.add("1034");
                    IiiiiiiiIIIII2.add("1035");
                    break;
                }
                case 30: {
                    IiiiiiiiIIIII2.add("1036");
                    IiiiiiiiIIIII2.add("1037");
                    IiiiiiiiIIIII2.add("1038");
                    IiiiiiiiIIIII2.add("1039");
                    IiiiiiiiIIIII2.add("1040");
                    break;
                }
                case 72: {
                    IiiiiiiiIIIII2.add("1061");
                    IiiiiiiiIIIII2.add("1062");
                    IiiiiiiiIIIII2.add("1063");
                    IiiiiiiiIIIII2.add("1064");
                    IiiiiiiiIIIII2.add("1065");
                    break;
                }
                case 73: {
                    IiiiiiiiIIIII2.add("1066");
                    IiiiiiiiIIIII2.add("1067");
                    IiiiiiiiIIIII2.add("1068");
                    IiiiiiiiIIIII2.add("1069");
                    IiiiiiiiIIIII2.add("1070");
                    break;
                }
                case 74: {
                    IiiiiiiiIIIII2.add("1071");
                    IiiiiiiiIIIII2.add("1072");
                    IiiiiiiiIIIII2.add("1073");
                    IiiiiiiiIIIII2.add("1074");
                    IiiiiiiiIIIII2.add("1075");
                    break;
                }
                case 75: {
                    IiiiiiiiIIIII2.add("1076");
                    IiiiiiiiIIIII2.add("1077");
                    IiiiiiiiIIIII2.add("1078");
                    IiiiiiiiIIIII2.add("1079");
                    IiiiiiiiIIIII2.add("1080");
                    break;
                }
                case 76: {
                    IiiiiiiiIIIII2.add("1081");
                    IiiiiiiiIIIII2.add("1082");
                    IiiiiiiiIIIII2.add("1083");
                    IiiiiiiiIIIII2.add("1084");
                    IiiiiiiiIIIII2.add("1085");
                    break;
                }
                case 77: {
                    IiiiiiiiIIIII2.add("1091");
                    IiiiiiiiIIIII2.add("1092");
                    IiiiiiiiIIIII2.add("1093");
                    IiiiiiiiIIIII2.add("1094");
                    IiiiiiiiIIIII2.add("1095");
                    break;
                }
                case 78: {
                    IiiiiiiiIIIII2.add("1096");
                    IiiiiiiiIIIII2.add("1097");
                    IiiiiiiiIIIII2.add("1098");
                    IiiiiiiiIIIII2.add("1099");
                    IiiiiiiiIIIII2.add("1100");
                    break;
                }
                case 79: {
                    IiiiiiiiIIIII2.add("1086");
                    IiiiiiiiIIIII2.add("1087");
                    IiiiiiiiIIIII2.add("1088");
                    IiiiiiiiIIIII2.add("1089");
                    IiiiiiiiIIIII2.add("1090");
                    break;
                }
            }
            --IiiiiiiiIIIII3;
        }
        return IiiiiiiiIIIII2;
    }

    public static RoleSkill getRoleSkill() {
        if (roleSkill != null) return roleSkill;
        roleSkill = new RoleSkill();
        return roleSkill;
    }

    public String[] getAllSkill(int type, int sld) {
        List<String> IiiiiiiiIIIII = this.ALLATORIxDEMO(type);
        String[] IiiiiiiiIIIII2 = new String[IiiiiiiiIIIII.size()];
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII.size()) {
            int n = IiiiiiiiIIIII3;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(IiiiiiiiIIIII.get(IiiiiiiiIIIII3)));
            ++IiiiiiiiIIIII3;
            IiiiiiiiIIIII2[n] = stringBuilder.append("_").append(sld).toString();
        }
        return IiiiiiiiIIIII2;
    }
}
