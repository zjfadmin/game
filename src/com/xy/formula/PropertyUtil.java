/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iiIiiiiiIIiiI
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.MountSkill
 *  com.xy.entity.Pal
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.BaseMountSkill
 *  com.xy.formula.BaseQl
 *  com.xy.formula.CustomFunction
 *  com.xy.formula.GoodType
 *  com.xy.formula.PetProperty
 *  com.xy.formula.Ql
 *  com.xy.formula.QualityZW
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.socket.GameClient
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiIiIiiiiiIiI
 *  com.xy.v.IiiiIiiiiIIII
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.formula;

import com.xy.a.iiIiiiiiIIiiI;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.BaseQl;
import com.xy.formula.CustomFunction;
import com.xy.formula.GoodType;
import com.xy.formula.PetProperty;
import com.xy.formula.Ql;
import com.xy.formula.QualityZW;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiIiIiiiiiIiI;
import com.xy.v.IiiiIiiiiIIII;
import com.xy.v.IiiiiiiiiIIII;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PropertyUtil {
    public static Map<String, BaseMountSkill> mountSkillMap;
    public static double[][] zuoqi;
    public static String[] SH_HEAD_BASE2;
    public static String[] SH_HEAD_BASE3;
    public static String[] SH_HEAD_BASE1;
    public static double[] xishu;

    /*
     * WARNING - void declaration
     */
    public static String ALLATORIxDEMO(String mes, Mount mount, String skillname) {
        void IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        double IiiiiiiiIIIII3 = 1.0;
        if (mount.getMountid() == 2 || mount.getMountid() == 4) {
            IiiiiiiiIIIII3 = 1.2;
        }
        if ((IiiiiiiiIIIII2 = mount.getMountlvl().intValue()) > 100) {
            IiiiiiiiIIIII2 -= 100;
        }
        int n = (int)Math.floor((float)mount.getSpri().intValue() + (float)IiiiiiiiIIIII2 / 10.0f * (float)mount.getSpri().intValue() / 2.0f);
        int IiiiiiiiIIIII4 = (int)Math.floor((float)mount.getPower().intValue() + (float)IiiiiiiiIIIII2 / 10.0f * (float)mount.getPower().intValue() / 2.0f);
        int IiiiiiiiIIIII5 = (int)Math.floor((float)mount.getBone().intValue() + (float)IiiiiiiiIIIII2 / 10.0f * (float)mount.getBone().intValue() / 2.0f);
        int IiiiiiiiIIIII6 = mount.getProficiency();
        double IiiiiiiiIIIII7 = 0.0;
        if (mes.equals("HP")) {
            if (skillname.equals("\u91d1\u8eab\u4e0d\u574f")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[2] + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[1]) * IiiiiiiiIIIII3 / zuoqi[4][0] + (double)(IiiiiiiiIIIII6 / 10000) / zuoqi[4][1];
            } else if (skillname.equals("\u540e\u53d1\u5236\u4eba")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[0] + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[3]) * IiiiiiiiIIIII3 / zuoqi[16][0] + (double)IiiiiiiiIIIII6 / xishu[7] / zuoqi[16][1];
            } else if (skillname.equals("\u5fc3\u5982\u6b62\u6c34")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[2] + (double)IiiiiiiiIIIII * xishu[1] + (double)IiiiiiiiIIIII4 * xishu[5]) * IiiiiiiiIIIII3 / zuoqi[1][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[1][1];
            }
        } else if (mes.equals("MP")) {
            if (skillname.equals("\u5929\u96f7\u6012\u706b")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[4] + (double)IiiiiiiiIIIII * xishu[3] + (double)IiiiiiiiIIIII4 * xishu[0]) * IiiiiiiiIIIII3 / zuoqi[13][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[13][1];
            } else if (skillname.equals("\u5174\u98ce\u4f5c\u6d6a")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[1] + (double)IiiiiiiiIIIII * xishu[2] + (double)IiiiiiiiIIIII4 * xishu[5]) * IiiiiiiiIIIII3 / zuoqi[10][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[10][1];
            } else if (skillname.equals("\u4e07\u52ab\u4e0d\u590d")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[5] + (double)(IiiiiiiiIIIII * true) + (double)IiiiiiiiIIIII4 * xishu[4]) * IiiiiiiiIIIII3 / zuoqi[8][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[8][1];
            }
        } else if (mes.equals("AP")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[5] + (double)IiiiiiiiIIIII * xishu[4] + (double)(IiiiiiiiIIIII4 * 1)) * IiiiiiiiIIIII3 / zuoqi[18][0] + (double)IiiiiiiiIIIII6 / xishu[7] / zuoqi[18][1];
        } else if (mes.equals("SP")) {
            if (skillname.equals("\u593a\u547d\u8ffd\u9b42")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[4] + (double)IiiiiiiiIIIII * xishu[0] + (double)IiiiiiiiIIIII4 * xishu[3]) * IiiiiiiiIIIII3 / zuoqi[21][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[21][1];
            } else if (skillname.equals("\u5929\u795e\u62a4\u4f53")) {
                IiiiiiiiIIIII7 = ((double)(IiiiiiiiIIIII5 * 1) + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[4]) * IiiiiiiiIIIII3 / zuoqi[3][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[3][1];
            }
        } else if (mes.equals("\u8fde\u51fb\u7387") || mes.equals("\u81f4\u547d") || mes.equals("\u547d\u4e2d")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[5] + (double)IiiiiiiiIIIII * xishu[1] + (double)IiiiiiiiIIIII4 * xishu[2]) * IiiiiiiiIIIII3 / zuoqi[22][0] + (double)(IiiiiiiiIIIII6 / 10000) / zuoqi[22][1];
        } else if (mes.equals("\u6297\u9b3c\u706b")) {
            if (skillname.equals("\u5929\u795e\u62a4\u4f53")) {
                IiiiiiiiIIIII7 = ((double)(IiiiiiiiIIIII5 * 1) + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[4]) * IiiiiiiiIIIII3 / zuoqi[2][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[2][1];
            } else if (skillname.equals("\u5929\u96f7\u6012\u706b")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[4] + (double)IiiiiiiiIIIII * xishu[2] + (double)IiiiiiiiIIIII4 * xishu[1]) * IiiiiiiiIIIII3 / zuoqi[15][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[15][1];
            } else if (skillname.equals("\u5174\u98ce\u4f5c\u6d6a")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[1] + (double)IiiiiiiiIIIII * xishu[2] + (double)IiiiiiiiIIIII4 * xishu[5]) * IiiiiiiiIIIII3 / zuoqi[12][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[12][1];
            }
        } else if (mes.equals("\u6297\u98ce\u6cd5") || mes.equals("\u6297\u706b\u6cd5") || mes.equals("\u6297\u6c34\u6cd5") || mes.equals("\u6297\u96f7\u6cd5")) {
            if (skillname.equals("\u5929\u795e\u62a4\u4f53")) {
                IiiiiiiiIIIII7 = ((double)(IiiiiiiiIIIII5 * 1) + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[4]) * IiiiiiiiIIIII3 / zuoqi[2][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[2][1];
            } else if (skillname.equals("\u5174\u98ce\u4f5c\u6d6a")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[1] + (double)IiiiiiiiIIIII * xishu[2] + (double)IiiiiiiiIIIII4 * xishu[5]) * IiiiiiiiIIIII3 / zuoqi[12][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[12][1];
            } else if (skillname.equals("\u5929\u96f7\u6012\u706b")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[4] + (double)IiiiiiiiIIIII * xishu[2] + (double)IiiiiiiiIIIII4 * xishu[1]) * IiiiiiiiIIIII3 / zuoqi[15][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[15][1];
            }
        } else if (mes.equals("\u706b\u6cd5\u4f24\u5bb3") || mes.equals("\u96f7\u6cd5\u4f24\u5bb3") || mes.equals("\u706b\u96f7\u4f24\u5bb3")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[5] + (double)IiiiiiiiIIIII * xishu[3] + (double)IiiiiiiiIIIII4 * xishu[0]) * IiiiiiiiIIIII3 / zuoqi[14][0] + (double)(IiiiiiiiIIIII6 / 10000) / zuoqi[14][1];
        } else if (mes.equals("\u6297\u706b\u96f7")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[4] + (double)IiiiiiiiIIIII * xishu[2] + (double)IiiiiiiiIIIII4 * xishu[1]) * IiiiiiiiIIIII3 / zuoqi[15][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[15][1];
        } else if (mes.equals("\u6297\u7269\u7406")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[3] + (double)IiiiiiiiIIIII * xishu[5] + (double)IiiiiiiiIIIII4 * xishu[0]) * IiiiiiiiIIIII3 / zuoqi[5][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[5][1];
        } else if (mes.equals("\u6297\u9707\u6151")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[3] + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[1]) * IiiiiiiiIIIII3 / zuoqi[6][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[6][1];
        } else if (mes.equals("\u6297\u4e2d\u6bd2")) {
            if (skillname.equals("\u91d1\u8eab\u4e0d\u574f")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[2] + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[0]) * IiiiiiiiIIIII3 / zuoqi[7][0] + (double)(IiiiiiiiIIIII6 / 10000) / zuoqi[7][1];
            } else if (skillname.equals("\u5fc3\u5982\u6b62\u6c34")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[3] + (double)IiiiiiiiIIIII * xishu[0] + (double)IiiiiiiiIIIII4 * xishu[4]) * IiiiiiiiIIIII3 / zuoqi[0][0] + (double)IiiiiiiiIIIII6 / xishu[7] / zuoqi[0][1];
            }
        } else if (mes.equals("\u6297\u4e09\u5c38\u866b")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[2] + (double)IiiiiiiiIIIII * xishu[4] + (double)IiiiiiiiIIIII4 * xishu[0]) * 125.0 / 3.0 + (double)(IiiiiiiiIIIII6 * 1500 / 100000);
        } else if (mes.equals("\u72c2\u66b4")) {
            if (skillname.equals("\u7834\u91dc\u6c89\u821f")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[4] + (double)IiiiiiiiIIIII * xishu[4] + (double)(IiiiiiiiIIIII4 * 1)) * IiiiiiiiIIIII3 / zuoqi[19][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[19][1];
            } else if (skillname.equals("\u540e\u53d1\u5236\u4eba")) {
                IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[1] + (double)IiiiiiiiIIIII * xishu[5] + (double)IiiiiiiiIIIII4 * xishu[3]) * IiiiiiiiIIIII3 / zuoqi[17][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[17][1];
            }
        } else if (mes.equals("\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387") || mes.equals("\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[4] + (double)IiiiiiiiIIIII * xishu[5] + (double)(IiiiiiiiIIIII4 * 1)) * IiiiiiiiIIIII3 / zuoqi[20][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[20][1];
        } else if (mes.equals("\u98ce\u6cd5\u4f24\u5bb3") || mes.equals("\u6c34\u6cd5\u4f24\u5bb3")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[0] + (double)IiiiiiiiIIIII * xishu[3] + (double)IiiiiiiiIIIII4 * xishu[5]) * IiiiiiiiIIIII3 / zuoqi[11][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[11][1];
        } else if (mes.equals("\u52a0\u5f3a\u98ce") || mes.equals("\u52a0\u5f3a\u706b") || mes.equals("\u52a0\u5f3a\u6c34") || mes.equals("\u52a0\u5f3a\u96f7")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[5] + (double)(IiiiiiiiIIIII * true) + (double)IiiiiiiiIIIII4 * xishu[5]) * IiiiiiiiIIIII3 / zuoqi[9][0] + (double)IiiiiiiiIIIII6 / xishu[6] / zuoqi[9][1];
        } else if (mes.equals("\u6297\u660f\u7761") || mes.equals("\u6297\u5c01\u5370") || mes.equals("\u6297\u6df7\u4e71")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[3] + (double)IiiiiiiiIIIII * xishu[0] + (double)IiiiiiiiIIIII4 * xishu[4]) * IiiiiiiiIIIII3 / zuoqi[0][0] + (double)IiiiiiiiIIIII6 / xishu[7] / zuoqi[0][1];
        } else if (mes.equals("\u6297\u9057\u5fd8")) {
            IiiiiiiiIIIII7 = ((double)IiiiiiiiIIIII5 * xishu[3] + (double)IiiiiiiiIIIII * xishu[0] + (double)IiiiiiiiIIIII4 * xishu[4]) * IiiiiiiiIIIII3 / zuoqi[0][0] + (double)IiiiiiiiIIIII6 / xishu[7] / zuoqi[0][1];
        }
        String IiiiiiiiIIIII8 = String.valueOf(mes) + "=" + PropertyUtil.ALLATORIxDEMO((Double)(IiiiiiiiIIIII7 / 100.0));
        if (!mes.equals("\u6297\u4e09\u5c38\u866b")) return IiiiiiiiIIIII8;
        IiiiiiiiIIIII8 = String.valueOf(mes) + "=" + (int)PropertyUtil.ALLATORIxDEMO((Double)IiiiiiiiIIIII7);
        return IiiiiiiiIIIII8;
    }

    public static String iIiIiiiiIIiii(Mount mount, String skillname) {
        if (skillname.equals("\u593a\u547d\u8ffd\u9b42")) {
            return PropertyUtil.ALLATORIxDEMO("SP", mount, "\u593a\u547d\u8ffd\u9b42");
        }
        if (skillname.equals("\u5929\u96f7\u6012\u706b")) {
            return PropertyUtil.ALLATORIxDEMO("MP", mount, "\u5929\u96f7\u6012\u706b");
        }
        if (skillname.equals("\u91d1\u8eab\u4e0d\u574f")) {
            return PropertyUtil.ALLATORIxDEMO("HP", mount, "\u91d1\u8eab\u4e0d\u574f");
        }
        if (skillname.equals("\u7834\u91dc\u6c89\u821f")) {
            return PropertyUtil.ALLATORIxDEMO("AP", mount, "\u7834\u91dc\u6c89\u821f");
        }
        if (skillname.equals("\u5174\u98ce\u4f5c\u6d6a")) {
            return PropertyUtil.ALLATORIxDEMO("MP", mount, "\u5174\u98ce\u4f5c\u6d6a");
        }
        if (skillname.equals("\u5929\u795e\u62a4\u4f53")) {
            return PropertyUtil.ALLATORIxDEMO("SP", mount, "\u5929\u795e\u62a4\u4f53");
        }
        if (skillname.equals("\u540e\u53d1\u5236\u4eba")) {
            return PropertyUtil.ALLATORIxDEMO("HP", mount, "\u540e\u53d1\u5236\u4eba");
        }
        if (skillname.equals("\u4e07\u52ab\u4e0d\u590d")) {
            return PropertyUtil.ALLATORIxDEMO("MP", mount, "\u4e07\u52ab\u4e0d\u590d");
        }
        if (!skillname.equals("\u5fc3\u5982\u6b62\u6c34")) return null;
        return PropertyUtil.ALLATORIxDEMO("HP", mount, "\u5fc3\u5982\u6b62\u6c34");
    }

    public static int iIiIiiiiIIiii(double mhsn) {
        if (mhsn > 0.28) {
            return 5;
        }
        if (mhsn > 0.21) {
            return 4;
        }
        if (mhsn > 0.14) {
            return 3;
        }
        if (!(mhsn > 0.7)) return 1;
        return 2;
    }

    public static String ALLATORIxDEMO(String data) {
        int IiiiiiiiIIIII = data.indexOf("=");
        String IiiiiiiiIIIII2 = data.substring(0, IiiiiiiiIIIII);
        if (!IiiiiiiiIIIII2.equals("\u6297\u4e09\u5c38\u866b")) return String.valueOf(IiiiiiiiIIIII2) + "+" + (int)(Float.parseFloat(data.substring(IiiiiiiiIIIII + 1)) * 100.0f) + "%";
        return String.valueOf(IiiiiiiiIIIII2) + "+" + IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)(IiiiiiiiIIIII + 1), (int)data.length());
    }

    public static double ALLATORIxDEMO(Double value) {
        return new BigDecimal(value).setScale(2, 4).doubleValue();
    }

    /*
     * WARNING - void declaration
     */
    public static String getBaoString(Lingbao lingbao, RoleData roleData, int size) {
        void IiiiiiiiIIIII;
        size = (size - 6) / 2 / 6 * 6;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        StringBuffer IiiiiiiiIIIII4 = new StringBuffer();
        Map<String, Double> map = PropertyUtil.getBaoMap(lingbao, roleData);
        IiiiiiiiIIIII4.append("#G\u5951\u5408\u5ea6");
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
        IiiiiiiiIIIII4.append(((Double)IiiiiiiiIIIII.get("\u5951\u5408\u5ea6")).longValue());
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII4.length() - IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = (size - 36 - IiiiiiiiIIIII5 * 6) / 6;
        int IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII3) {
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII4.insert(IiiiiiiiIIIII2, " ");
        }
        IiiiiiiiIIIII4.append(" \u6d3b\u8dc3\u5ea6");
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
        IiiiiiiiIIIII4.append(String.valueOf(((Double)IiiiiiiiIIIII.get("\u6d3b\u8dc3")).longValue()) + "#W(" + lingbao.getBaoactive() + ")");
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4.length() - 2 - IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = (size - 36 - IiiiiiiiIIIII5 * 6) / 6;
        IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII3) {
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII4.insert(IiiiiiiiIIIII2, " ");
        }
        IiiiiiiiIIIII4.append("#r#G\u901f\u5ea6");
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
        IiiiiiiiIIIII4.append(String.valueOf(((Double)IiiiiiiiIIIII.get("\u901f\u5ea6")).longValue()) + "#W(" + lingbao.getBaospeed() + ")");
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4.length() - 2 - IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = (size - 24 - IiiiiiiiIIIII5 * 6) / 6;
        IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII3) {
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII4.insert(IiiiiiiiIIIII2, " ");
        }
        IiiiiiiiIIIII4.append(" #G\u63f4\u52a9");
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
        IiiiiiiiIIIII4.append(String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((Double)IiiiiiiiIIIII.get("\u652f\u63f4") * 100.0), (int)1)) + "#W(" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)(lingbao.getAssistance() * 100.0), (int)1) + ")");
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4.length() - 2 - IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = (size - 24 - IiiiiiiiIIIII5 * 6) / 6;
        IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII3) {
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII4.insert(IiiiiiiiIIIII2, " ");
        }
        if (lingbao.getBaotype().equals("\u653b\u51fb")) {
            IiiiiiiiIIIII4.append("#r#G\u4f24\u5bb3");
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
            IiiiiiiiIIIII4.append(String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((Double)IiiiiiiiIIIII.get("\u4f24\u5bb3") * 100.0), (int)1)) + "#W(" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)(Double.parseDouble(lingbao.getBaoap()) * 100.0), (int)1) + ")");
        } else if (lingbao.getBaotype().equals("\u8f85\u52a9")) {
            IiiiiiiiIIIII4.append("#r#G\u56de\u590d");
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
            IiiiiiiiIIIII4.append(String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((Double)IiiiiiiiIIIII.get("\u56de\u590d") * 100.0), (int)1)) + "#W(" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)(Double.parseDouble(lingbao.getBaoreply()) * 100.0), (int)1) + ")");
        } else {
            IiiiiiiiIIIII4.append("#r#G\u843d\u5b9d");
            IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
            IiiiiiiiIIIII4.append(String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((Double)IiiiiiiiIIIII.get("\u843d\u5b9d") * 100.0), (int)1)) + "#W(" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)(lingbao.getBaoshot() * 100.0), (int)1) + ")");
        }
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4.length() - 2 - IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = (size - 24 - IiiiiiiiIIIII5 * 6) / 6;
        IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII3) {
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII4.insert(IiiiiiiiIIIII2, " ");
        }
        IiiiiiiiIIIII4.append(" #G\u6297\u843d\u5b9d");
        IiiiiiiiIIIII2 = IiiiiiiiIIIII4.length();
        IiiiiiiiIIIII4.append(String.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((double)((Double)IiiiiiiiIIIII.get("\u6297\u843d\u5b9d") * 100.0), (int)1)) + "#W(" + IIiiIiiiiIIiI.ALLATORIxDEMO((double)(lingbao.getResistshop() * 100.0), (int)1) + ")");
        IiiiiiiiIIIII5 = IiiiiiiiIIIII4.length() - 2 - IiiiiiiiIIIII2;
        IiiiiiiiIIIII3 = (size - 36 - IiiiiiiiIIIII5 * 6) / 6;
        IiiiiiiiIIIII6 = 0;
        while (IiiiiiiiIIIII6 < IiiiiiiiIIIII3) {
            ++IiiiiiiiIIIII6;
            IiiiiiiiIIIII4.insert(IiiiiiiiIIIII2, " ");
        }
        IIiIiiiiIiIII.ALLATORIxDEMO((Map)IiiiiiiiIIIII);
        return IiiiiiiiIIIII4.toString();
    }

    public static String ALLATORIxDEMO(Mount mount, String skillname) {
        String IiiiiiiiIIIII = "";
        if (skillname.equals("\u593a\u547d\u8ffd\u9b42")) {
            String IiiiiiiiIIIII2 = PropertyUtil.ALLATORIxDEMO("SP", mount, "\u593a\u547d\u8ffd\u9b42");
            String IiiiiiiiIIIII3 = PropertyUtil.ALLATORIxDEMO("\u8fde\u51fb\u7387", mount, "\u593a\u547d\u8ffd\u9b42");
            String IiiiiiiiIIIII4 = PropertyUtil.ALLATORIxDEMO("\u81f4\u547d", mount, "\u593a\u547d\u8ffd\u9b42");
            String IiiiiiiiIIIII5 = PropertyUtil.ALLATORIxDEMO("\u547d\u4e2d", mount, "\u593a\u547d\u8ffd\u9b42");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII2) + "|" + IiiiiiiiIIIII3 + "|" + IiiiiiiiIIIII4 + "|" + IiiiiiiiIIIII5;
            return IiiiiiiiIIIII;
        }
        if (skillname.equals("\u5929\u96f7\u6012\u706b")) {
            String IiiiiiiiIIIII6 = PropertyUtil.ALLATORIxDEMO("MP", mount, "\u5929\u96f7\u6012\u706b");
            String IiiiiiiiIIIII7 = PropertyUtil.ALLATORIxDEMO("\u706b\u6cd5\u4f24\u5bb3", mount, "\u5929\u96f7\u6012\u706b");
            String IiiiiiiiIIIII8 = PropertyUtil.ALLATORIxDEMO("\u96f7\u6cd5\u4f24\u5bb3", mount, "\u5929\u96f7\u6012\u706b");
            String IiiiiiiiIIIII9 = PropertyUtil.ALLATORIxDEMO("\u6297\u706b", mount, "\u5929\u96f7\u6012\u706b");
            String IiiiiiiiIIIII10 = PropertyUtil.ALLATORIxDEMO("\u6297\u96f7", mount, "\u5929\u96f7\u6012\u706b");
            String IiiiiiiiIIIII11 = PropertyUtil.ALLATORIxDEMO("\u6297\u9b3c\u706b", mount, "\u5929\u96f7\u6012\u706b");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII6) + "|" + IiiiiiiiIIIII7 + "|" + IiiiiiiiIIIII8 + "|" + IiiiiiiiIIIII9 + "|" + IiiiiiiiIIIII10 + "|" + IiiiiiiiIIIII11;
            return IiiiiiiiIIIII;
        }
        if (skillname.equals("\u91d1\u8eab\u4e0d\u574f")) {
            String IiiiiiiiIIIII12 = PropertyUtil.ALLATORIxDEMO("HP", mount, "\u91d1\u8eab\u4e0d\u574f");
            String IiiiiiiiIIIII13 = PropertyUtil.ALLATORIxDEMO("\u6297\u7269\u7406", mount, "\u91d1\u8eab\u4e0d\u574f");
            String IiiiiiiiIIIII14 = PropertyUtil.ALLATORIxDEMO("\u6297\u9707\u6151", mount, "\u91d1\u8eab\u4e0d\u574f");
            String IiiiiiiiIIIII15 = PropertyUtil.ALLATORIxDEMO("\u6297\u4e2d\u6bd2", mount, "\u91d1\u8eab\u4e0d\u574f");
            String IiiiiiiiIIIII16 = PropertyUtil.ALLATORIxDEMO("\u6297\u4e09\u5c38\u866b", mount, "\u91d1\u8eab\u4e0d\u574f");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII12) + "|" + IiiiiiiiIIIII13 + "|" + IiiiiiiiIIIII14 + "|" + IiiiiiiiIIIII15 + "|" + IiiiiiiiIIIII16;
            return IiiiiiiiIIIII;
        }
        if (skillname.equals("\u7834\u91dc\u6c89\u821f")) {
            String IiiiiiiiIIIII17 = PropertyUtil.ALLATORIxDEMO("AP", mount, "\u7834\u91dc\u6c89\u821f");
            String IiiiiiiiIIIII18 = PropertyUtil.ALLATORIxDEMO("\u72c2\u66b4", mount, "\u7834\u91dc\u6c89\u821f");
            String IiiiiiiiIIIII19 = PropertyUtil.ALLATORIxDEMO("\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387", mount, "\u7834\u91dc\u6c89\u821f");
            String IiiiiiiiIIIII20 = PropertyUtil.ALLATORIxDEMO("\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6", mount, "\u7834\u91dc\u6c89\u821f");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII17) + "|" + IiiiiiiiIIIII18 + "|" + IiiiiiiiIIIII19 + "|" + IiiiiiiiIIIII20;
            return IiiiiiiiIIIII;
        }
        if (skillname.equals("\u5174\u98ce\u4f5c\u6d6a")) {
            String IiiiiiiiIIIII21 = PropertyUtil.ALLATORIxDEMO("MP", mount, "\u5174\u98ce\u4f5c\u6d6a");
            String IiiiiiiiIIIII22 = PropertyUtil.ALLATORIxDEMO("\u98ce\u6cd5\u4f24\u5bb3", mount, "\u5174\u98ce\u4f5c\u6d6a");
            String IiiiiiiiIIIII23 = PropertyUtil.ALLATORIxDEMO("\u6c34\u6cd5\u4f24\u5bb3", mount, "\u5174\u98ce\u4f5c\u6d6a");
            String IiiiiiiiIIIII24 = PropertyUtil.ALLATORIxDEMO("\u6297\u98ce\u6cd5", mount, "\u5174\u98ce\u4f5c\u6d6a");
            String IiiiiiiiIIIII25 = PropertyUtil.ALLATORIxDEMO("\u6297\u6c34\u6cd5", mount, "\u5174\u98ce\u4f5c\u6d6a");
            String IiiiiiiiIIIII26 = PropertyUtil.ALLATORIxDEMO("\u6297\u9b3c\u706b", mount, "\u5174\u98ce\u4f5c\u6d6a");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII21) + "|" + IiiiiiiiIIIII22 + "|" + IiiiiiiiIIIII23 + "|" + IiiiiiiiIIIII24 + "|" + IiiiiiiiIIIII25 + "|" + IiiiiiiiIIIII26;
            return IiiiiiiiIIIII;
        }
        if (skillname.equals("\u5929\u795e\u62a4\u4f53")) {
            String IiiiiiiiIIIII27 = PropertyUtil.ALLATORIxDEMO("SP", mount, "\u5929\u795e\u62a4\u4f53");
            String IiiiiiiiIIIII28 = PropertyUtil.ALLATORIxDEMO("\u6297\u98ce\u6cd5", mount, "\u5929\u795e\u62a4\u4f53");
            String IiiiiiiiIIIII29 = PropertyUtil.ALLATORIxDEMO("\u6297\u706b\u6cd5", mount, "\u5929\u795e\u62a4\u4f53");
            String IiiiiiiiIIIII30 = PropertyUtil.ALLATORIxDEMO("\u6297\u6c34\u6cd5", mount, "\u5929\u795e\u62a4\u4f53");
            String IiiiiiiiIIIII31 = PropertyUtil.ALLATORIxDEMO("\u6297\u96f7\u6cd5", mount, "\u5929\u795e\u62a4\u4f53");
            String IiiiiiiiIIIII32 = PropertyUtil.ALLATORIxDEMO("\u6297\u9b3c\u706b", mount, "\u5929\u795e\u62a4\u4f53");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII27) + "|" + IiiiiiiiIIIII28 + "|" + IiiiiiiiIIIII29 + "|" + IiiiiiiiIIIII30 + "|" + IiiiiiiiIIIII31 + "|" + IiiiiiiiIIIII32;
            return IiiiiiiiIIIII;
        }
        if (skillname.equals("\u540e\u53d1\u5236\u4eba")) {
            String IiiiiiiiIIIII33 = PropertyUtil.ALLATORIxDEMO("HP", mount, "\u540e\u53d1\u5236\u4eba");
            String IiiiiiiiIIIII34 = PropertyUtil.ALLATORIxDEMO("\u72c2\u66b4", mount, "\u540e\u53d1\u5236\u4eba");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII33) + "|" + IiiiiiiiIIIII34;
            return IiiiiiiiIIIII;
        }
        if (skillname.equals("\u4e07\u52ab\u4e0d\u590d")) {
            String IiiiiiiiIIIII35 = PropertyUtil.ALLATORIxDEMO("MP", mount, "\u4e07\u52ab\u4e0d\u590d");
            String IiiiiiiiIIIII36 = PropertyUtil.ALLATORIxDEMO("\u52a0\u5f3a\u98ce", mount, "\u4e07\u52ab\u4e0d\u590d");
            String IiiiiiiiIIIII37 = PropertyUtil.ALLATORIxDEMO("\u52a0\u5f3a\u706b", mount, "\u4e07\u52ab\u4e0d\u590d");
            String IiiiiiiiIIIII38 = PropertyUtil.ALLATORIxDEMO("\u52a0\u5f3a\u6c34", mount, "\u4e07\u52ab\u4e0d\u590d");
            String IiiiiiiiIIIII39 = PropertyUtil.ALLATORIxDEMO("\u52a0\u5f3a\u96f7", mount, "\u4e07\u52ab\u4e0d\u590d");
            IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII35) + "|" + IiiiiiiiIIIII36 + "|" + IiiiiiiiIIIII37 + "|" + IiiiiiiiIIIII38 + "|" + IiiiiiiiIIIII39;
            return IiiiiiiiIIIII;
        }
        if (!skillname.equals("\u5fc3\u5982\u6b62\u6c34")) return IiiiiiiiIIIII;
        String IiiiiiiiIIIII40 = PropertyUtil.ALLATORIxDEMO("HP", mount, "\u5fc3\u5982\u6b62\u6c34");
        String IiiiiiiiIIIII41 = PropertyUtil.ALLATORIxDEMO("\u6297\u660f\u7761", mount, "\u5fc3\u5982\u6b62\u6c34");
        String IiiiiiiiIIIII42 = PropertyUtil.ALLATORIxDEMO("\u6297\u5c01\u5370", mount, "\u5fc3\u5982\u6b62\u6c34");
        String IiiiiiiiIIIII43 = PropertyUtil.ALLATORIxDEMO("\u6297\u4e2d\u6bd2", mount, "\u5fc3\u5982\u6b62\u6c34");
        String IiiiiiiiIIIII44 = PropertyUtil.ALLATORIxDEMO("\u6297\u6df7\u4e71", mount, "\u5fc3\u5982\u6b62\u6c34");
        String IiiiiiiiIIIII45 = PropertyUtil.ALLATORIxDEMO("\u6297\u9057\u5fd8", mount, "\u5fc3\u5982\u6b62\u6c34");
        IiiiiiiiIIIII = String.valueOf(IiiiiiiiIIIII40) + "|" + IiiiiiiiIIIII41 + "|" + IiiiiiiiIIIII42 + "|" + IiiiiiiiIIIII43 + "|" + IiiiiiiiIIIII44 + "|" + IiiiiiiiIIIII45;
        return IiiiiiiiIIIII;
    }

    public static Ql getPalQl(Pal pal, RoleData roleData) {
        Ql IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO();
        if (pal == null) {
            return IiiiiiiiIIIII;
        }
        if (roleData.getObjectArea().ALLATORIxDEMO(pal.getpId()) == null) {
            return IiiiiiiiIIIII;
        }
        for (Map.Entry<String, Double> IiiiiiiiIIIII2 : PropertyUtil.getPalMap(pal, false, roleData).entrySet()) {
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII2.getKey(), (double)IiiiiiiiIIIII2.getValue());
        }
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public static void getMountSHSXString(int id, RoleData roleData, StringBuffer buffer, boolean total) {
        block10: {
            IiiiiiiiIIIII = roleData.getMountSHByindex(id);
            IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[id]);
            if (!total) break block10;
            buffer.append("#G");
            IiiiiiiiIIIII = 1.0;
            IiiiiiiiIIIII = roleData.getMountSHByindex(0);
            if (IiiiiiiiIIIII.getLvl() > 0 && (IiiiiiiiIIIII = (IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[0])).getMountSHByZTPercentage(id, IiiiiiiiIIIII.getLvl())) > 0.0) {
                IiiiiiiiIIIII += IiiiiiiiIIIII / 100.0;
                buffer.append(BaseMountSH.SH_HEAD_NAME[id]);
                buffer.append("\u5b88\u62a4\u5c5e\u6027\u63d0\u5347");
                buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)1));
                buffer.append("%");
            }
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII.getLvl() - 1;
            IiiiiiiiIIIII = IiiiiiiiIIIII / IiiiiiiiIIIII.getBases().length;
            IiiiiiiiIIIII = 1 + IiiiiiiiIIIII % IiiiiiiiIIIII.getBases().length;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII.getBases().length : IiiiiiiiIIIII;
            if (true) ** GOTO lbl57
        }
        buffer.append(IiiiiiiiIIIII.getLvl() == 0 ? "#c727272" : "#G");
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl80
        do {
            if ((IiiiiiiiIIIII >> IiiiiiiiIIIII & 1) != 1) {
                IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII];
                IiiiiiiiIIIII = (double)(IiiiiiiiIIIII + (IiiiiiiiIIIII < IiiiiiiiIIIII ? 1 : 0)) * IiiiiiiiIIIII.getValue();
                IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                    if ((IiiiiiiiIIIII >> IiiiiiiiIIIII & 1) != 1 && IiiiiiiiIIIII.getKey().equals(IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII].getKey())) {
                        IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII;
                        IiiiiiiiIIIII += (double)(IiiiiiiiIIIII + (IiiiiiiiIIIII < IiiiiiiiIIIII ? 1 : 0)) * IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII].getValue();
                    }
                    ++IiiiiiiiIIIII;
                }
                if (!(IiiiiiiiIIIII <= 0.0)) {
                    IiiiiiiiIIIII *= IiiiiiiiIIIII;
                    if (buffer.length() > 0) {
                        buffer.append("#r");
                    }
                    buffer.append(IiiiiiiiIIIII.getKey());
                    buffer.append(" +");
                    buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)1));
                    buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getKey()));
                }
            }
            ++IiiiiiiiIIIII;
lbl57:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        return;
        do {
            if (IiiiiiiiIIIII != 0) {
                buffer.append("#r");
            }
            if (IiiiiiiiIIIII == IiiiiiiiIIIII.getLvl()) {
                buffer.append("#c727272");
            }
            var7_19 = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII % IiiiiiiiIIIII.getBases().length];
            buffer.append(IiiiiiiiIIIII + 1);
            buffer.append(IiiiiiiiIIIII < 9 ? "\u7ea7  " : "\u7ea7 ");
            buffer.append(IiiiiiiiIIIII.getKey());
            buffer.append(" +");
            buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII.getValue(), (int)1));
            ++IiiiiiiiIIIII;
            buffer.append(iiIiiiiiIIiiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getKey()));
lbl80:
            // 2 sources

        } while (IiiiiiiiIIIII < 24);
    }

    /*
     * Unable to fully structure code
     */
    public static Ql getPetQl(RoleSummoning pet, RoleData roleData) {
        block85: {
            block86: {
                block87: {
                    block84: {
                        IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO();
                        if (pet == null) {
                            return IiiiiiiiIIIII;
                        }
                        IiiiiiiiIIIII = roleData.getObjectArea();
                        IiiiiiiiIIIII = 75;
                        try {
                            if (pet.getStye() == null || pet.getStye().length() <= 1) break block84;
                            IiiiiiiiIIIII = pet.getStye().split("\\|");
                            IiiiiiiiIIIII = 1;
                            if (true) ** GOTO lbl31
                        }
                        catch (Exception IiiiiiiiIIIII) {
                            IiiiiiiiIIIII.printStackTrace();
                            break block85;
                        }
                        do {
                            if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("-")).length >= 2 && (IiiiiiiiIIIII = roleData.getGoodEquip(new BigDecimal(IiiiiiiiIIIII[1]))) != null && IiiiiiiiIIIII.getType() != 729L) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
                                IiiiiiiiIIIII = 6;
                                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("\u70bc\u5316\u5c5e\u6027")) {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("\\&");
                                        IiiiiiiiIIIII = 1;
                                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                            if (!IiiiiiiiIIIII[0].endsWith("\u7b49\u7ea7")) {
                                                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII[0], (double)Double.parseDouble(IiiiiiiiIIIII[1]));
                                            }
                                            ++IiiiiiiiIIIII;
                                        }
                                    }
                                    ++IiiiiiiiIIIII;
                                }
                            }
                            ++IiiiiiiiIIIII;
lbl31:
                            // 2 sources

                        } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                    }
                    if (pet.getResistance() != null && !pet.getResistance().equals("")) {
                        IiiiiiiiIIIII = pet.getResistance().split("\\|");
                        if (IiiiiiiiIIIII.length >= 3) {
                            IiIiIiiiiiIiI.ALLATORIxDEMO();
                            return IiiiiiiiIIIII;
                        }
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                            IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[1]);
                            if (IiiiiiiiIIIII != 30.0) {
                                IiIiIiiiiiIiI.ALLATORIxDEMO();
                                return IiiiiiiiIIIII;
                            }
                            ++IiiiiiiiIIIII;
                            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII[0], (double)IiiiiiiiIIIII);
                        }
                    }
                    if ((IiiiiiiiIIIII = roleData.getPetMount(pet.getSid())) == null) break block86;
                    IiiiiiiiIIIII += 20;
                    if (!roleData.getGameView().getClient().gameMount) break block87;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getDataValue("JN");
                    if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) break block86;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getMountlvl();
                    if (IiiiiiiiIIIII > 100) {
                        IiiiiiiiIIIII -= 100;
                    }
                    IiiiiiiiIIIII = (int)Math.floor((float)IiiiiiiiIIIII.getSpri().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)IiiiiiiiIIIII.getSpri().intValue() / 2.0f);
                    IiiiiiiiIIIII = (int)Math.floor((float)IiiiiiiiIIIII.getPower().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)IiiiiiiiIIIII.getPower().intValue() / 2.0f);
                    IiiiiiiiIIIII = (int)Math.floor((float)IiiiiiiiIIIII.getBone().intValue() + (float)IiiiiiiiIIIII / 10.0f * (float)IiiiiiiiIIIII.getBone().intValue() / 2.0f);
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getMountCZ();
                    IiiiiiiiIIIII = IiiiiiiiIIIII >> 6;
                    if (IiiiiiiiIIIII > 0) {
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < 3) {
                            if ((IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII & 1) != 0) {
                                v0 = IiiiiiiiIIIII = (IiiiiiiiIIIII >> 2 * IiiiiiiiIIIII + 1 & 1) == 1 ? 1 : 0;
                                if (IiiiiiiiIIIII == 0) {
                                    IiiiiiiiIIIII += IiiiiiiiIIIII != 0 ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                                } else if (IiiiiiiiIIIII == 1) {
                                    IiiiiiiiIIIII += IiiiiiiiIIIII != 0 ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                                } else if (IiiiiiiiIIIII == 2) {
                                    IiiiiiiiIIIII += IiiiiiiiIIIII != 0 ? IiiiiiiiIIIII : -IiiiiiiiIIIII;
                                }
                            }
                            ++IiiiiiiiIIIII;
                        }
                    }
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.length()) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("#", IiiiiiiiIIIII + 1);
                        if (IiiiiiiiIIIII == -1) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                        }
                        if ((IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill(IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII))) != null) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getXs(IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII.getProficiency().intValue(), IiiiiiiiIIIII.getMountid().intValue());
                            IiiiiiiiIIIII = 0;
                            while (IiiiiiiiIIIII < IiiiiiiiIIIII.getBases().length) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII];
                                ++IiiiiiiiIIIII;
                                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII.getKey(), (double)(IiiiiiiiIIIII / IiiiiiiiIIIII.getValue()));
                            }
                        }
                        IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getMountid() == 7 ? roleData.getLimit("\u767e\u70bc\u4e39") : null;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getQls().length : 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getQls()[IiiiiiiiIIIII];
                        ++IiiiiiiiIIIII;
                        QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII.getKey(), (double)IiiiiiiiIIIII.getValue());
                    }
                    IiiiiiiiIIIII = roleData.getMountSHByindex(0);
                    IiiiiiiiIIIII = roleData.getMountSHByMountId(IiiiiiiiIIIII.getMountid().intValue());
                    if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getLvl() > 0) {
                        IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[IiiiiiiiIIIII.getId()]);
                        IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[0]);
                        var18_55 = false;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getLvl() - 1;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getMountSHByZT(IiiiiiiiIIIII.getId(), IiiiiiiiIIIII.getLvl());
                        IiiiiiiiIIIII = IiiiiiiiIIIII / IiiiiiiiIIIII.getBases().length;
                        IiiiiiiiIIIII = 1 + IiiiiiiiIIIII % IiiiiiiiIIIII.getBases().length;
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII > 0 ? IiiiiiiiIIIII.getBases().length : IiiiiiiiIIIII;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII];
                            if (!(IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[0]) || IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[1]) || IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[2]) || IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE1[3]) || IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[0]) || IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[1]) || IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[2]) || IiiiiiiiIIIII.getKey().equals(PropertyUtil.SH_HEAD_BASE2[3]))) {
                                IiiiiiiiIIIII = (double)(IiiiiiiiIIIII + (IiiiiiiiIIIII < IiiiiiiiIIIII ? 1 : 0)) * IiiiiiiiIIIII.getValue() * IiiiiiiiIIIII;
                                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII.getKey(), (double)IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
                        }
                    }
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII.getMountid().intValue())) > 0) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getMounts()[IiiiiiiiIIIII - 1];
                        IiiiiiiiIIIII = 0;
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getBases() != null && IiiiiiiiIIIII.getB3() > 0 ? IiiiiiiiIIIII.getBases().length : 0;
                        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII];
                            if (IiiiiiiiIIIII.getKey().equals("\u6280\u80fd")) {
                                IiiiiiiiIIIII = (int)IiiiiiiiIIIII.getValue();
                                IiiiiiiiIIIII = (int)IiiiiiiiIIIII.getValue2();
                                if (IiiiiiiiIIIII == 2105 || IiiiiiiiIIIII == 2105) {
                                    IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade());
                                    IiiiiiiiIIIII = Double.valueOf(pet.getGrowlevel());
                                    IiiiiiiiIIIII = Math.abs(PetProperty.getPetValue((int)IiiiiiiiIIIII, (int)pet.getSpeed(), (double)IiiiiiiiIIIII, (int)pet.getSp(), (int)3));
                                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u8eb2\u95ea\u7387", (double)((double)IiiiiiiiIIIII * (IiiiiiiiIIIII == 2105 ? 1.0E-4 : 2.0E-4) * (double)IiiiiiiiIIIII));
                                } else if (IiiiiiiiIIIII == 2145 || IiiiiiiiIIIII == 2146) {
                                    IiiiiiiiIIIII = -(IiiiiiiiIIIII == 2146 ? 0.6 : 0.6) * (double)IiiiiiiiIIIII;
                                    IiiiiiiiIIIII = (IiiiiiiiIIIII == 2146 ? 0.6 : 0.4) * (double)IiiiiiiiIIIII;
                                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u7269\u7406\u5438\u6536\u7387", (double)IiiiiiiiIIIII);
                                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u6297\u4ed9\u6cd5", (double)IiiiiiiiIIIII);
                                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u56db\u6297", (double)IiiiiiiiIIIII);
                                }
                            } else {
                                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII.getKey(), (double)IiiiiiiiIIIII.getValue());
                            }
                            ++IiiiiiiiIIIII;
                        }
                    }
                    break block86;
                    break block86;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII.getMountskill();
                if (IiiiiiiiIIIII != null) {
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
                        IiiiiiiiIIIII = PropertyUtil.ALLATORIxDEMO((Mount)IiiiiiiiIIIII, ((MountSkill)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getSkillname()).split("\\|");
                        IiiiiiiiIIIII = 0;
                        while (IiiiiiiiIIIII < ((Goodstable)IiiiiiiiIIIII).length) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                            IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[1]);
                            if (!(IiiiiiiiIIIII[0].equals("HP") || IiiiiiiiIIIII[0].equals("MP") || IiiiiiiiIIIII[0].equals("AP") || IiiiiiiiIIIII[0].equals("SP"))) {
                                if (IiiiiiiiIIIII[0].equals("\u98ce\u6cd5\u4f24\u5bb3") || IiiiiiiiIIIII[0].equals("\u6c34\u6cd5\u4f24\u5bb3") || IiiiiiiiIIIII[0].equals("\u706b\u6cd5\u4f24\u5bb3") || IiiiiiiiIIIII[0].equals("\u96f7\u6cd5\u4f24\u5bb3")) {
                                    IiiiiiiiIIIII *= 10000.0;
                                } else if (IiiiiiiiIIIII[0].indexOf("\u6b21\u6570") == -1 && IiiiiiiiIIIII[0].indexOf("\u4e09\u5c38") == -1) {
                                    IiiiiiiiIIIII *= 100.0;
                                }
                                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII[0], (double)IiiiiiiiIIIII);
                            }
                            ++IiiiiiiiIIIII;
                        }
                        ++IiiiiiiiIIIII;
                    }
                }
            }
            if (pet.getInnerGoods() != null && !pet.getInnerGoods().equals("")) {
                IiiiiiiiIIIII = pet.getInnerGoods().split("\\|");
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                    IiiiiiiiIIIII = roleData.getGoodEquip(new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII]));
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.getGoodsname();
                        v1 = IiiiiiiiIIIII = IiiiiiiiIIIII.equals("\u7ea2\u989c\u767d\u53d1") != false || IiiiiiiiIIIII.equals("\u6885\u82b1\u4e09\u5f04") != false || IiiiiiiiIIIII.equals("\u5f00\u5929\u8f9f\u5730") != false || IiiiiiiiIIIII.equals("\u4e07\u4f5b\u671d\u5b97") != false || IiiiiiiiIIIII.equals("\u6697\u6e21\u9648\u4ed3") != false || IiiiiiiiIIIII.equals("\u501f\u529b\u6253\u529b") != false || IiiiiiiiIIIII.equals("\u51cc\u6ce2\u5fae\u6b65") != false;
                        if (IiiiiiiiIIIII) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
                            IiiiiiiiIIIII = IiiiiiiiIIIII[2].split("\\=");
                            IiiiiiiiIIIII = IiiiiiiiIIIII[1].split("\\\u8f6c");
                            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[1]);
                            IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0]);
                            PropertyUtil.ALLATORIxDEMO(pet, IiiiiiiiIIIII, IiiiiiiiIIIII, IiiiiiiiIIIII, (String)IiiiiiiiIIIII);
                        }
                    }
                    ++IiiiiiiiIIIII;
                }
            }
            if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)pet.getLyk())) {
                IiiiiiiiIIIII = pet.getLyk();
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII < IiiiiiiiIIIII.length()) {
                    IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("|", IiiiiiiiIIIII + 1);
                    if (IiiiiiiiIIIII == -1) {
                        IiiiiiiiIIIII = IiiiiiiiIIIII.length();
                    }
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII.indexOf("=", IiiiiiiiIIIII + 1)) != -1 && IiiiiiiiIIIII < IiiiiiiiIIIII && !(IiiiiiiiIIIII = IiiiiiiiIIIII.substring(IiiiiiiiIIIII, IiiiiiiiIIIII)).equals("\u7269\u54c1\u4eb2\u5bc6")) {
                        QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)IiiiiiiiIIIII, (double)Double.parseDouble(IiiiiiiiIIIII.substring(IiiiiiiiIIIII + 1, IiiiiiiiIIIII)));
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII + 1;
                }
            }
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, pet.getSkill(), 1, pet.getFriendliness(), pet, IiiiiiiiIIIII, roleData.getGameView().getClient());
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, pet.getPetSkills(), 1, pet.getFriendliness(), pet, IiiiiiiiIIIII, roleData.getGameView().getClient());
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, pet.getBeastSkills(), 1, pet.getFriendliness(), pet, IiiiiiiiIIIII, roleData.getGameView().getClient());
            if (pet.getFriendliness() > 100000L) {
                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u8fde\u51fb\u7387", (double)(5.0 + CustomFunction.ALLATORIxDEMO((long)pet.getFriendliness(), (double)0.7)));
                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u8fde\u51fb\u6b21\u6570", (double)((int)(3.0 + CustomFunction.ALLATORIxDEMO((long)pet.getFriendliness(), (double)0.2))));
                QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u547d\u4e2d\u7387", (double)(2.0 + CustomFunction.ALLATORIxDEMO((long)pet.getFriendliness(), (double)0.4)));
            }
            if (roleData.getGameView().getClient().gameBattle) {
                IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)pet.getGrade());
                if (IiiiiiiiIIIII >= 135) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)11250.0);
                } else if (IiiiiiiiIIIII >= 125) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)9040.0);
                } else if (IiiiiiiiIIIII >= 115) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)7750.0);
                } else if (IiiiiiiiIIIII >= 105) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)6500.0);
                } else if (IiiiiiiiIIIII >= 95) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)5500.0);
                } else if (IiiiiiiiIIIII >= 85) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)3150.0);
                } else if (IiiiiiiiIIIII >= 75) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)1900.0);
                } else if (IiiiiiiiIIIII >= 65) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)1150.0);
                } else if (IiiiiiiiIIIII >= 55) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)800.0);
                } else if (IiiiiiiiIIIII >= 45) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)450.0);
                } else if (IiiiiiiiIIIII >= 35) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)300.0);
                } else if (IiiiiiiiIIIII >= 25) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)200.0);
                } else if (IiiiiiiiIIIII >= 15) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)100.0);
                } else if (IiiiiiiiIIIII >= 5) {
                    QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u9632\u5fa1", (double)50.0);
                }
            }
        }
        IiiiiiiiIIIII.IiiIiiiiiiIiI((double)IiiiiiiiIIIII);
        IiiiiiiiIIIII.ALLATORIxDEMO((double)(IiiiiiiiIIIII + (pet.getTurnRount() >= 4 ? 10 : 0)));
        if (IiiiiiiiIIIII.getRolewxj() != 0.0 || IiiiiiiiIIIII.getRolewxm() != 0.0 || IiiiiiiiIIIII.getRolewxt() != 0.0 || IiiiiiiiIIIII.getRolewxs() != 0.0 || IiiiiiiiIIIII.getRolewxh() != 0.0) {
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u91d1", (double)(Double.parseDouble(pet.getGold()) / 2.0));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u6728", (double)(Double.parseDouble(pet.getWood()) / 2.0));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u571f", (double)(Double.parseDouble(pet.getSoil()) / 2.0));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u6c34", (double)(Double.parseDouble(pet.getWater()) / 2.0));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u706b", (double)(Double.parseDouble(pet.getFire()) / 2.0));
        } else {
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u91d1", (double)Double.parseDouble(pet.getGold()));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u6728", (double)Double.parseDouble(pet.getWood()));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u571f", (double)Double.parseDouble(pet.getSoil()));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u6c34", (double)Double.parseDouble(pet.getWater()));
            QualityZW.iIiIiiiiIIiii((Ql)IiiiiiiiIIIII, (String)"\u706b", (double)Double.parseDouble(pet.getFire()));
        }
        IiiiiiiiIIIII.setRolewxj((double)((int)IiiiiiiiIIIII.getRolewxj()));
        IiiiiiiiIIIII.setRolewxm((double)((int)IiiiiiiiIIIII.getRolewxm()));
        IiiiiiiiIIIII.setRolewxt((double)((int)IiiiiiiiIIIII.getRolewxt()));
        IiiiiiiiIIIII.setRolewxs((double)((int)IiiiiiiiIIIII.getRolewxs()));
        IiiiiiiiIIIII.setRolewxh((double)((int)IiiiiiiiIIIII.getRolewxh()));
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public static void ALLATORIxDEMO(Ql ql, String skillMsg, int skillLvl, long qm, RoleSummoning pet, IiiiiiiiiIIII objectArea, GameClient gameClient) {
        if (skillMsg == null) return;
        if (skillMsg.equals("")) {
            return;
        }
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = skillMsg.split("\\|");
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block80: {
                block81: {
                    block79: {
                        if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("L")) break block79;
                        IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                        IiiiiiiiIIIII = 3;
                        if (true) ** GOTO lbl285
                    }
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("Q") || IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("T")) break block80;
                    if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith("X")) break block81;
                    IiiiiiiiIIIII = false;
                    if (gameClient.ALLATORIxDEMO(2, 8) || gameClient.ALLATORIxDEMO(2, 10)) {
                        IiiiiiiiIIIII = pet.ALLATORIxDEMO("1250");
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    IiiiiiiiIIIII = 1;
                    if (true) ** GOTO lbl313
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("=");
                if (IiiiiiiiIIIII != -1) {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII);
                }
                var14_16 = IiiiiiiiIIIII[IiiiiiiiIIIII];
                tmp = -1;
                switch (var14_16.hashCode()) {
                    case 1509352: {
                        if (!var14_16.equals("1207")) break;
                        tmp = 1;
                        break;
                    }
                    case 1509353: {
                        if (!var14_16.equals("1208")) break;
                        tmp = 2;
                        break;
                    }
                    case 1509354: {
                        if (!var14_16.equals("1209")) break;
                        tmp = 3;
                        break;
                    }
                    case 1509379: {
                        if (!var14_16.equals("1213")) break;
                        tmp = 4;
                        break;
                    }
                    case 1509380: {
                        if (!var14_16.equals("1214")) break;
                        tmp = 5;
                        break;
                    }
                    case 1509409: {
                        if (!var14_16.equals("1222")) break;
                        tmp = 6;
                        break;
                    }
                    case 1509413: {
                        if (!var14_16.equals("1226")) break;
                        tmp = 7;
                        break;
                    }
                    case 1515142: {
                        if (!var14_16.equals("1810")) break;
                        tmp = 8;
                        break;
                    }
                    case 1515143: {
                        if (!var14_16.equals("1811")) break;
                        tmp = 9;
                        break;
                    }
                    case 1515145: {
                        if (!var14_16.equals("1813")) break;
                        tmp = 10;
                        break;
                    }
                    case 1515147: {
                        if (!var14_16.equals("1815")) break;
                        tmp = 11;
                        break;
                    }
                    case 1515148: {
                        if (!var14_16.equals("1816")) break;
                        tmp = 12;
                        break;
                    }
                    case 1515149: {
                        if (!var14_16.equals("1817")) break;
                        tmp = 13;
                        break;
                    }
                    case 1515150: {
                        if (!var14_16.equals("1818")) break;
                        tmp = 14;
                        break;
                    }
                    case 1515151: {
                        if (!var14_16.equals("1819")) break;
                        tmp = 15;
                        break;
                    }
                    case 1515173: {
                        if (!var14_16.equals("1820")) break;
                        tmp = 10;
                        break;
                    }
                    case 1515174: {
                        if (!var14_16.equals("1821")) break;
                        tmp = 10;
                        break;
                    }
                    case 1515175: {
                        if (!var14_16.equals("1822")) break;
                        tmp = 10;
                        break;
                    }
                    case 1515176: {
                        if (!var14_16.equals("1823")) break;
                        tmp = 10;
                        break;
                    }
                    case 1515177: {
                        if (!var14_16.equals("1824")) break;
                        tmp = 10;
                        break;
                    }
                    case 1515240: {
                        if (!var14_16.equals("1845")) break;
                        tmp = 16;
                        break;
                    }
                    case 1515241: {
                        if (!var14_16.equals("1846")) break;
                        tmp = 17;
                        break;
                    }
                    case 1515271: {
                        if (!var14_16.equals("1855")) break;
                        tmp = 18;
                        break;
                    }
                    case 1515272: {
                        if (!var14_16.equals("1856")) break;
                        tmp = 19;
                        break;
                    }
                    case 1515273: {
                        if (!var14_16.equals("1857")) break;
                        tmp = 20;
                        break;
                    }
                    case 1515275: {
                        if (!var14_16.equals("1859")) break;
                        tmp = 21;
                        break;
                    }
                    case 1515297: {
                        if (!var14_16.equals("1860")) break;
                        tmp = 22;
                        break;
                    }
                    case 46759957: {
                        if (!var14_16.equals("11005")) break;
                        tmp = 23;
                        break;
                    }
                }
                switch (tmp) {
                    case 8: {
                        IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.3);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u98ce", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u706b", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6c34", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u96f7", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9b3c\u706b", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7387", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7a0b\u5ea6", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 9: {
                        IiiiiiiiIIIII = 10.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.6);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u98ce", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u706b", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6c34", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u96f7", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9b3c\u706b", (double)(-IiiiiiiiIIIII));
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7387", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7a0b\u5ea6", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 10: {
                        IiiiiiiiIIIII = 2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.2);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 11: {
                        IiiiiiiiIIIII = 2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.2);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u91d1", (double)50.0);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 12: {
                        IiiiiiiiIIIII = 2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.2);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6728", (double)50.0);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 13: {
                        IiiiiiiiIIIII = 2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.2);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6c34", (double)50.0);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 14: {
                        IiiiiiiiIIIII = 2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.2);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u706b", (double)50.0);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 15: {
                        IiiiiiiiIIIII = 2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.2);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u571f", (double)50.0);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 1: {
                        IiiiiiiiIIIII = 3.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.2);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u8fde\u51fb\u7387", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 2: {
                        IiiiiiiiIIIII = 10.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.6);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 3: {
                        IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.3);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u72c2\u66b4\u7387", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u81f4\u547d\u7387", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 4: {
                        IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.3);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7387", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7a0b\u5ea6", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 5: {
                        if (!gameClient.gameBattle) {
                            IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.4);
                            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u72c2\u66b4\u7387", (double)IiiiiiiiIIIII);
                            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u81f4\u547d\u7387", (double)IiiiiiiiIIIII);
                            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u547d\u4e2d\u7387", (double)IiiiiiiiIIIII);
                            break;
                        }
                        break block80;
                    }
                    case 6: {
                        IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.4);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9707\u6151", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 7: {
                        IiiiiiiiIIIII = 10.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.6);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u7269\u7406\u5438\u6536", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 16: {
                        IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.5);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u9644\u52a0\u5c01\u5370\u653b\u51fb", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 17: {
                        IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.5);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u9644\u52a0\u6df7\u4e71\u653b\u51fb", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 18: {
                        IiiiiiiiIIIII = 10.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.6);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u81f4\u547d\u7387", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 19: {
                        IiiiiiiiIIIII = 10.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.6);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u4ed9\u6cd5\u72c2\u66b4", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 20: {
                        IiiiiiiiIIIII = 10.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.6);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u4ed9\u6cd5", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 21: {
                        IiiiiiiiIIIII = 3.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.3);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 22: {
                        IiiiiiiiIIIII = 5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.5);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u9644\u52a0\u4e09\u5c38\u653b\u51fb", (double)IiiiiiiiIIIII);
                        break;
                    }
                    case 23: {
                        IiiiiiiiIIIII = objectArea.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                        if (IiiiiiiiIIIII == null) break;
                        IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII.getValue()) + Double.parseDouble(IiiiiiiiIIIII.getGrow()) * (double)skillLvl;
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                        break;
                    }
                }
                break block80;
                do {
                    if ((IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].indexOf("-")) != -1 && (IiiiiiiiIIIII = objectArea.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(0, IiiiiiiiIIIII))) != null && IiiiiiiiIIIII.getSkillid().equals("11005")) {
                        IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII].substring(IiiiiiiiIIIII + 1));
                        var9_10 = Double.parseDouble(IiiiiiiiIIIII.getValue()) + Double.parseDouble(IiiiiiiiIIIII.getGrow()) * (double)skillLvl;
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u5c01\u5370", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u6df7\u4e71", (double)IiiiiiiiIIIII);
                        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u6297\u9057\u5fd8", (double)IiiiiiiiIIIII);
                    }
                    ++IiiiiiiiIIIII;
lbl285:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                break block80;
                do {
                    if ((IiiiiiiiIIIII = objectArea.iIiIiiiiIIiii(IiiiiiiiIIIII[IiiiiiiiIIIII])) != null) {
                        if (IiiiiiiiIIIII.getSkillid().equals("1255")) {
                            if (gameClient.gameBattle) {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u8fde\u51fb\u7387", (double)((1.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.12)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            } else {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u8fde\u51fb\u7387", (double)((2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.15)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            }
                        } else if (IiiiiiiiIIIII.getSkillid().equals("1256")) {
                            if (gameClient.gameBattle) {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u81f4\u547d\u7387", (double)((1.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.12)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            } else {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u81f4\u547d\u7387", (double)((2.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.15)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            }
                        } else if (IiiiiiiiIIIII.getSkillid().equals("1259")) {
                            if (gameClient.gameBattle) {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387", (double)((1.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.1)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            } else {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387", (double)((5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.25)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            }
                        } else if (IiiiiiiiIIIII.getSkillid().equals("1260")) {
                            if (gameClient.gameBattle) {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6", (double)((1.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.1)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            } else {
                                QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6", (double)((5.0 + CustomFunction.ALLATORIxDEMO((long)qm, (double)0.25)) * (IiiiiiiiIIIII != false ? 1.0 : 0.7)));
                            }
                        }
                    }
                    ++IiiiiiiiIIIII;
lbl313:
                    // 2 sources

                } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public static double ALLATORIxDEMO(int zhs_zscs, int nd_zscs) {
        if (zhs_zscs * nd_zscs == 1) {
            return 1.04;
        }
        if (zhs_zscs * nd_zscs == 4) {
            return 1.071;
        }
        if (zhs_zscs * nd_zscs == 6) {
            return 1.073;
        }
        if (zhs_zscs * nd_zscs != 9) return 1.0;
        return 1.09;
    }

    /*
     * Unable to fully structure code
     */
    public static Map<String, Double> getPalMap(Pal pal, boolean isV, RoleData roleData) {
        block13: {
            block11: {
                block12: {
                    IiiiiiiiIIIII = IIiIiiiiIiIII.ALLATORIxDEMO();
                    IiiiiiiiIIIII = roleData.getObjectArea().ALLATORIxDEMO(pal.getpId());
                    if (IiiiiiiiIIIII == null) {
                        return IiiiiiiiIIIII;
                    }
                    v0 = roleData.getLoginResult().getGrade();
                    IiiiiiiiIIIII = IiiiIiiiiIIII.ALLATORIxDEMO((int)v0);
                    IiiiiiiiIIIII = IiiiIiiiiIIII.iIiIiiiiIIiii((int)v0);
                    if (!isV) break block12;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getJds();
                    IiiiiiiiIIIII = IiiiiiiiIIIII[0] + IiiiiiiiIIIII[1] + IiiiiiiiIIIII[2] + IiiiiiiiIIIII[3];
                    var11_9 = IiiiiiiiIIIII + IiiiiiiiIIIII * 40;
                    PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6839\u9aa8", IiiiiiiiIIIII + IiiiiiiiIIIII / IiiiiiiiIIIII * IiiiiiiiIIIII.getJds()[0]);
                    PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u7075\u6027", IiiiiiiiIIIII + IiiiiiiiIIIII / IiiiiiiiIIIII * IiiiiiiiIIIII.getJds()[1]);
                    PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u529b\u91cf", IiiiiiiiIIIII + IiiiiiiiIIIII / IiiiiiiiIIIII * IiiiiiiiIIIII.getJds()[2]);
                    PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u654f\u6377", IiiiiiiiIIIII + IiiiiiiiIIIII / IiiiiiiiIIIII * IiiiiiiiIIIII.getJds()[3]);
                    IiiiiiiiIIIII = IiiiiiiiIIIII % IiiiiiiiIIIII;
                    IiiiiiiiIIIII = 0;
                    ** GOTO lbl33
                }
                if (IiiiiiiiIIIII.getKx() == null || IiiiiiiiIIIII.getKx().equals("")) break block11;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getKx().split("\\|");
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl43
                while (IiiiiiiiIIIII > 0) {
                    if (IiiiiiiiIIIII[IiiiiiiiIIIII] != false) {
                        if (IiiiiiiiIIIII > IiiiiiiiIIIII[IiiiiiiiIIIII]) {
                            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII == 0 ? "\u6839\u9aa8" : (IiiiiiiiIIIII == 1 ? "\u7075\u6027" : (IiiiiiiiIIIII == 2 ? "\u529b\u91cf" : "\u654f\u6377")), IiiiiiiiIIIII.getJds()[IiiiiiiiIIIII]);
                            IiiiiiiiIIIII -= IiiiiiiiIIIII.getJds()[IiiiiiiiIIIII];
                        } else {
                            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII == 0 ? "\u6839\u9aa8" : (IiiiiiiiIIIII == 1 ? "\u7075\u6027" : (IiiiiiiiIIIII == 2 ? "\u529b\u91cf" : "\u654f\u6377")), IiiiiiiiIIIII);
                            IiiiiiiiIIIII = 0;
                        }
                    }
                    ++IiiiiiiiIIIII;
lbl33:
                    // 2 sources

                    if (IiiiiiiiIIIII < ((Object)IiiiiiiiIIIII).length) continue;
                    break block11;
                }
                break block11;
                do {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    IiiiiiiiIIIII = Double.parseDouble(IiiiiiiiIIIII[1]);
                    if (IiiiiiiiIIIII.length == 3) {
                        IiiiiiiiIIIII += Double.parseDouble(IiiiiiiiIIIII[2]) * (double)IiiiiiiiIIIII;
                    }
                    ++IiiiiiiiIIIII;
                    PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[0], IiiiiiiiIIIII);
lbl43:
                    // 2 sources

                } while (IiiiiiiiIIIII < ((int[])IiiiiiiiIIIII).length);
            }
            if (pal.getParts() == null || pal.getParts().equals("")) break block13;
            IiiiiiiiIIIII = pal.getParts().split("\\|");
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < ((int[])IiiiiiiiIIIII).length) {
                block14: {
                    IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                    IiiiiiiiIIIII = roleData.getGoodEquip(new BigDecimal(IiiiiiiiIIIII[1]));
                    if (IiiiiiiiIIIII == null) break block14;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.getValue().split("\\|");
                    IiiiiiiiIIIII = 1;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
                        block16: {
                            block15: {
                                if (!IiiiiiiiIIIII[IiiiiiiiIIIII].startsWith(GoodType.Extras[0])) break block15;
                                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("\\&");
                                IiiiiiiiIIIII = 1;
                                if (true) ** GOTO lbl67
                            }
                            IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[0], QualityZW.getDouble((String)IiiiiiiiIIIII[1]));
                            break block16;
                            do {
                                IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII].split("=");
                                ++IiiiiiiiIIIII;
                                PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII[0], Double.parseDouble(IiiiiiiiIIIII[1]));
lbl67:
                                // 2 sources

                            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
                        }
                        ++IiiiiiiiIIIII;
                    }
                }
                ++IiiiiiiiIIIII;
            }
        }
        if (isV != false) return IiiiiiiiIIIII;
        IiiiiiiiIIIII = (Double)IiiiiiiiIIIII.remove("\u56db\u6297");
        if (IiiiiiiiIIIII != null) {
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u6df7\u4e71", IiiiiiiiIIIII.doubleValue());
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u5c01\u5370", IiiiiiiiIIIII.doubleValue());
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u660f\u7761", IiiiiiiiIIIII.doubleValue());
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u9057\u5fd8", IiiiiiiiIIIII.doubleValue());
        }
        if ((IiiiiiiiIIIII = (Object)((Double)IiiiiiiiIIIII.remove("\u6297\u4ed9\u6cd5"))) == null) return IiiiiiiiIIIII;
        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u98ce", IiiiiiiiIIIII.doubleValue());
        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u706b", IiiiiiiiIIIII.doubleValue());
        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u6c34", IiiiiiiiIIIII.doubleValue());
        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII, "\u6297\u96f7", IiiiiiiiIIIII.doubleValue());
        return IiiiiiiiIIIII;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     */
    public static synchronized Map<String, Double> getBaoMap(Lingbao lingbao, RoleData roleData) {
        Object IiiiiiiiIIIII;
        Map IiiiiiiiIIIII2 = IIiIiiiiIiIII.ALLATORIxDEMO();
        IiiiiiiiIIIII2.put("\u5951\u5408\u5ea6", Double.valueOf(lingbao.getLingbaoqihe()));
        IiiiiiiiIIIII2.put("\u6d3b\u8dc3", Double.valueOf(lingbao.getBaoactive().intValue()));
        IiiiiiiiIIIII2.put("\u901f\u5ea6", Double.parseDouble(lingbao.getBaospeed()));
        IiiiiiiiIIIII2.put("\u652f\u63f4", lingbao.getAssistance());
        IiiiiiiiIIIII2.put("\u4f24\u5bb3", Double.parseDouble(lingbao.getBaoap()));
        IiiiiiiiIIIII2.put("\u56de\u590d", Double.parseDouble(lingbao.getBaoreply()));
        IiiiiiiiIIIII2.put("\u843d\u5b9d", lingbao.getBaoshot());
        IiiiiiiiIIIII2.put("\u6297\u843d\u5b9d", lingbao.getResistshop());
        if (lingbao.getTianfuskill() != null) {
            IiiiiiiiIIIII = lingbao.getTianfuskill().split("\\|");
            int IiiiiiiiIIIII3 = 0;
            while (IiiiiiiiIIIII3 < ((String[])IiiiiiiiIIIII).length) {
                int IiiiiiiiIIIII4;
                int n = IiiiiiiiIIIII[IiiiiiiiIIIII3].startsWith("\u4f4e\u7ea7") ? 1 : (IiiiiiiiIIIII4 = ((String)IiiiiiiiIIIII[IiiiiiiiIIIII3]).startsWith("\u9ad8\u7ea7") ? 2 : 0);
                if (IiiiiiiiIIIII4 != 0) {
                    String IiiiiiiiIIIII5 = ((String)IiiiiiiiIIIII[IiiiiiiiIIIII3]).substring(2);
                    if (IiiiiiiiIIIII5.equals("\u5951\u5408")) {
                        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u5951\u5408\u5ea6\u767e\u5206\u6bd4", (double)IiiiiiiiIIIII4 * 0.1);
                    } else if (IiiiiiiiIIIII5.equals("\u95ea\u73b0")) {
                        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u652f\u63f4", (double)IiiiiiiiIIIII4 * 0.1);
                    } else if (IiiiiiiiIIIII5.equals("\u6d3b\u8dc3")) {
                        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u6d3b\u8dc3\u767e\u5206\u6bd4", (double)IiiiiiiiIIIII4 * 0.1);
                    } else if (IiiiiiiiIIIII5.equals("\u62b5\u6297")) {
                        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u6297\u843d\u5b9d", (double)IiiiiiiiIIIII4 * 0.1);
                    } else if (IiiiiiiiIIIII5.equals("\u654f\u6377")) {
                        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u901f\u5ea6", IiiiiiiiIIIII4 == 1 ? 200 : 300);
                    } else if (IiiiiiiiIIIII5.endsWith("\u589e\u5f3a") || IiiiiiiiIIIII5.endsWith("\u56de\u751f")) {
                        int n2 = 0;
                        if (IiiiiiiiIIIII5.startsWith("\u6839\u9aa8")) {
                            n2 = roleData.getRoleProperty().getBone() / 4;
                        } else if (IiiiiiiiIIIII5.startsWith("\u7075\u6027")) {
                            n2 = roleData.getRoleProperty().getSpir() / 4;
                        } else if (IiiiiiiiIIIII5.startsWith("\u529b\u91cf")) {
                            n2 = roleData.getRoleProperty().getPower() / 4;
                        } else if (IiiiiiiiIIIII5.startsWith("\u654f\u6377")) {
                            n2 = roleData.getRoleProperty().getSpeed() / 4;
                        }
                        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII5.endsWith("\u589e\u5f3a") ? "\u4f24\u5bb3" : "\u56de\u590d", (double)(IiiiiiiiIIIII4 * n2) * 5.0E-4);
                    }
                }
                ++IiiiiiiiIIIII3;
            }
        }
        if (lingbao.getFushis() != null && !lingbao.getFushis().equals("")) {
            IiiiiiiiIIIII = lingbao.getFushis().split("\\|");
            Object object = IiiiiiiiIIIII;
            int n = ((String[])object).length;
            int n3 = 0;
            while (n3 < n) {
                String IiiiiiiiIIIII3 = object[n3];
                Goodstable IiiiiiiiIIIII6 = roleData.getGoodEquip(new BigDecimal(IiiiiiiiIIIII3));
                if (IiiiiiiiIIIII6 != null) {
                    String[] IiiiiiiiIIIII7 = IiiiiiiiIIIII6.getValue().split("\\|");
                    Map IiiiiiiiIIIII8 = IIiIiiiiIiIII.ALLATORIxDEMO();
                    int IiiiiiiiIIIII9 = 0;
                    while (IiiiiiiiIIIII9 < IiiiiiiiIIIII7.length) {
                        if (!IiiiiiiiIIIII7[IiiiiiiiIIIII9].startsWith(GoodType.Extras[1])) {
                            ++IiiiiiiiIIIII9;
                            continue;
                        }
                        String[] IiiiiiiiIIIII10 = IiiiiiiiIIIII7[IiiiiiiiIIIII9].split("&");
                        int IiiiiiiiIIIII11 = 2;
                        boolean bl = true;
                        do {
                            if (bl && !(bl = false) && true) continue;
                            int IiiiiiiiIIIII12 = IiiiiiiiIIIII10[IiiiiiiiIIIII11].indexOf("=");
                            if (IiiiiiiiIIIII12 != -1) {
                                String IiiiiiiiIIIII13 = IiiiiiiiIIIII10[IiiiiiiiIIIII11].substring(0, IiiiiiiiIIIII12);
                                double IiiiiiiiIIIII14 = Double.parseDouble(IiiiiiiiIIIII10[IiiiiiiiIIIII11].substring(IiiiiiiiIIIII12 + 1));
                                PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII8, IiiiiiiiIIIII13, IiiiiiiiIIIII14);
                            }
                            ++IiiiiiiiIIIII11;
                        } while (IiiiiiiiIIIII11 < IiiiiiiiIIIII10.length);
                        IiiiiiiiIIIII7[IiiiiiiiIIIII9] = null;
                        break;
                    }
                    IiiiiiiiIIIII9 = 0;
                    while (IiiiiiiiIIIII9 < IiiiiiiiIIIII7.length) {
                        int IiiiiiiiIIIII15;
                        if (IiiiiiiiIIIII7[IiiiiiiiIIIII9] != null && (IiiiiiiiIIIII15 = IiiiiiiiIIIII7[IiiiiiiiIIIII9].indexOf("=")) != -1) {
                            String IiiiiiiiIIIII16 = IiiiiiiiIIIII7[IiiiiiiiIIIII9].substring(0, IiiiiiiiIIIII15);
                            double IiiiiiiiIIIII17 = Double.parseDouble(IiiiiiiiIIIII7[IiiiiiiiIIIII9].substring(IiiiiiiiIIIII15 + 1));
                            if (IiiiiiiiIIIII16.equals("\u8d1f\u654f")) {
                                IiiiiiiiIIIII16 = "\u901f\u5ea6";
                                IiiiiiiiIIIII17 = -IiiiiiiiIIIII17;
                            } else if (!IiiiiiiiIIIII16.equals("\u901f\u5ea6") && !IiiiiiiiIIIII16.equals("\u6d3b\u8dc3")) {
                                IiiiiiiiIIIII17 /= 100.0;
                            }
                            Double IiiiiiiiIIIII18 = (Double)IiiiiiiiIIIII8.get(IiiiiiiiIIIII16.equals("\u8d1f\u654f") ? "\u52a0\u5f3a\u901f\u5ea6" : "\u52a0\u5f3a" + IiiiiiiiIIIII16);
                            if (IiiiiiiiIIIII18 != null) {
                                IiiiiiiiIIIII17 *= 1.0 + IiiiiiiiIIIII18 / 100.0;
                            }
                            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII16, IiiiiiiiIIIII17);
                        }
                        ++IiiiiiiiIIIII9;
                    }
                    IIiIiiiiIiIII.ALLATORIxDEMO((Map)IiiiiiiiIIIII8);
                }
                ++n3;
            }
        }
        if ((IiiiiiiiIIIII = (Double)IiiiiiiiIIIII2.remove("\u5951\u5408\u5ea6\u767e\u5206\u6bd4")) != null) {
            PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u5951\u5408\u5ea6", (Double)IiiiiiiiIIIII2.get("\u5951\u5408\u5ea6") * (Double)IiiiiiiiIIIII);
        }
        if ((IiiiiiiiIIIII = (Double)IiiiiiiiIIIII2.remove("\u6d3b\u8dc3\u767e\u5206\u6bd4")) == null) return IiiiiiiiIIIII2;
        PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, "\u6d3b\u8dc3", (Double)IiiiiiiiIIIII2.get("\u6d3b\u8dc3") * (Double)IiiiiiiiIIIII);
        return IiiiiiiiIIIII2;
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(RoleSummoning roleSummoning, Ql ql, int nddj, int ndzscs, String goodsname) {
        int IiiiiiiiIIIII = IiiiIiiiiIIII.iiiiiiiiIIiii((int)roleSummoning.getGrade());
        int IiiiiiiiIIIII2 = roleSummoning.getTurnRount();
        long IiiiiiiiIIIII3 = roleSummoning.getFriendliness();
        if (goodsname.equals("\u6697\u5ea6\u9648\u4ed3")) {
            void IiiiiiiiIIIII4;
            double d = Math.floor((Math.pow((double)(IiiiiiiiIIIII * nddj) * 0.04, 0.5) * (1.0 + 0.25 * (double)ndzscs) + Math.pow(IiiiiiiiIIIII3, 0.16666666666666666) * PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, ndzscs) * (double)nddj / 50.0) * 1000.0) * 5.0E-6;
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u8eb2\u95ea", (double)((double)Math.round((double)(IiiiiiiiIIIII4 * 10000.0)) / 100.0));
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u53cd\u51fb", (double)((double)Math.round((double)(IiiiiiiiIIIII4 * 10000.0)) / 100.0));
            return;
        }
        if (goodsname.equals("\u51cc\u6ce2\u5fae\u6b65")) {
            double IiiiiiiiIIIII5 = Math.floor((Math.pow((double)(IiiiiiiiIIIII * nddj) * 0.04, 0.5) * (1.0 + 0.25 * (double)ndzscs) + Math.pow(IiiiiiiiIIIII3, 0.16666666666666666) * PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, ndzscs) * (double)nddj / 50.0) * 1000.0) * 1.0E-5;
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u8eb2\u95ea\u7387", (double)((double)Math.round(IiiiiiiiIIIII5 * 10000.0) / 100.0));
            return;
        }
        if (goodsname.equals("\u501f\u529b\u6253\u529b")) {
            void IiiiiiiiIIIII6;
            double IiiiiiiiIIIII7 = Math.floor((Math.pow((double)(IiiiiiiiIIIII * nddj) * 0.04, 0.5) * (1.0 + 0.25 * (double)ndzscs) + Math.pow(IiiiiiiiIIIII3, 0.16666666666666666) * PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, ndzscs) * (double)nddj / 50.0) * 1000.0) * 1.0E-5;
            int n = PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII7);
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u51fb\u7387", (double)((double)Math.round(IiiiiiiiIIIII7 * 10000.0) / 100.0));
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u51fb\u6b21\u6570", (double)((double)IiiiiiiiIIIII6));
            return;
        }
        if (goodsname.equals("\u6885\u82b1\u4e09\u5f04")) {
            double IiiiiiiiIIIII8 = Math.floor((Math.pow((double)(IiiiiiiiIIIII * nddj) * 0.04, 0.5) * (1.0 + 0.25 * (double)ndzscs) + Math.pow(IiiiiiiiIIIII3, 0.16666666666666666) * PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, ndzscs) * (double)nddj / 50.0) * 1000.0) * 5.0E-6;
            int IiiiiiiiIIIII6 = PropertyUtil.iIiIiiiiIIiii(IiiiiiiiIIIII8);
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u4ed9\u6cd5\u8fde\u51fb\u7387", (double)((double)Math.round(IiiiiiiiIIIII8 * 10000.0) / 100.0));
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u4ed9\u6cd5\u8fde\u51fb\u6b21\u6570", (double)IiiiiiiiIIIII6);
            return;
        }
        if (goodsname.equals("\u7ea2\u989c\u767d\u53d1")) {
            double IiiiiiiiIIIII9 = Math.floor((Math.pow((double)(IiiiiiiiIIIII * nddj) * 0.04, 0.5) * (1.0 + 0.25 * (double)ndzscs) + Math.pow(IiiiiiiiIIIII3, 0.16666666666666666) * PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, ndzscs) * (double)nddj / 50.0) * 1000.0) * 5.0E-6;
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u4ed9\u6cd5\u72c2\u66b4", (double)((double)Math.round(IiiiiiiiIIIII9 * 10000.0) / 100.0));
            return;
        }
        if (goodsname.equals("\u5f00\u5929\u8f9f\u5730")) {
            double IiiiiiiiIIIII9 = Math.floor((Math.pow((double)(IiiiiiiiIIIII * nddj) * 0.04, 0.5) * (1.0 + 0.25 * (double)ndzscs) + Math.pow(IiiiiiiiIIIII3, 0.16666666666666666) * PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, ndzscs) * (double)nddj / 50.0) * 1000.0) * 5.0E-6;
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u4ed9\u6cd5\u6297\u6027\u7387", (double)((double)Math.round(IiiiiiiiIIIII9 * 10000.0) / 100.0 * 0.7));
            QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u5ffd\u89c6\u4ed9\u6cd5\u6297\u6027\u7a0b\u5ea6", (double)((double)Math.round(IiiiiiiiIIIII9 * 10000.0) / 100.0));
            return;
        }
        if (!goodsname.equals("\u4e07\u4f5b\u671d\u5b97")) return;
        double IiiiiiiiIIIII10 = Math.floor((Math.pow((double)(IiiiiiiiIIIII * nddj) * 0.04, 0.5) * (1.0 + 0.25 * (double)ndzscs) + Math.pow(IiiiiiiiIIIII3, 0.16666666666666666) * PropertyUtil.ALLATORIxDEMO(IiiiiiiiIIIII2, ndzscs) * (double)nddj / 50.0) * 1000.0) * 5.0E-6;
        double IiiiiiiiIIIII11 = IiiiiiiiIIIII10 * 2.0;
        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7387", (double)((double)Math.round(IiiiiiiiIIIII10 * 10000.0) / 100.0));
        QualityZW.iIiIiiiiIIiii((Ql)ql, (String)"\u53cd\u9707\u7a0b\u5ea6", (double)((double)Math.round(IiiiiiiiIIIII11 * 10000.0) / 100.0));
    }

    static {
        xishu = new double[]{0.3, 0.3, 0.7, 0.7, 0.0, 0.0, 10000.0, 10000.0, 1.2};
        zuoqi = new double[][]{{4.115226337, 1.141552511}, {14.40329218, 3.99543379}, {4.8, 1.333333333}, {14.4, 4.0}, {14.4, 4.0}, {3.6, 1.0}, {7.2, 2.0}, {4.8, 1.333333333}, {7.2, 2.0}, {4.8, 1.333333333}, {7.2, 2.0}, {4.8, 1.333333333}, {7.2, 2.0}, {7.2, 2.0}, {4.8, 1.333333333}, {7.2, 2.0}, {14.4, 4.0}, {4.8, 1.333333333}, {7.2, 2.0}, {4.8, 1.333333333}, {3.6, 1.0}, {14.4, 4.0}, {7.2, 2.0}};
        mountSkillMap = new HashMap<String, BaseMountSkill>();
        SH_HEAD_BASE1 = new String[]{"\u6c14\u8840", "\u6cd5\u529b", "\u653b\u51fb", "\u901f\u5ea6"};
        SH_HEAD_BASE2 = new String[]{"\u6c14\u8840\u52a0\u6210", "\u6cd5\u529b\u52a0\u6210", "\u653b\u51fb\u52a0\u6210", "\u901f\u5ea6\u52a0\u6210"};
        SH_HEAD_BASE3 = new String[]{"\u9644\u52a0\u6c14\u8840", "\u9644\u52a0\u9b54\u6cd5", "\u9644\u52a0\u653b\u51fb", "\u9644\u52a0\u901f\u5ea6"};
        int[] nArray = new int[3];
        nArray[0] = 30;
        nArray[1] = 70;
        mountSkillMap.put("\u593a\u547d\u8ffd\u9b42", new BaseMountSkill("\u593a\u547d\u8ffd\u9b42", nArray, 3, 14.4, new BaseQl[]{new BaseQl("\u547d\u4e2d", 7.2), new BaseQl("\u8fde\u51fb\u7387", 7.2), new BaseQl("\u81f4\u547d", 7.2)}));
        int[] nArray2 = new int[3];
        nArray2[1] = 100;
        mountSkillMap.put("\u7834\u91dc\u6c89\u821f", new BaseMountSkill("\u7834\u91dc\u6c89\u821f", nArray2, 2, 7.2, new BaseQl[]{new BaseQl("\u72c2\u66b4\u7387", 4.8), new BaseQl("\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6", 3.6), new BaseQl("\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387", 3.6)}));
        int[] nArray3 = new int[3];
        nArray3[1] = 70;
        nArray3[2] = 30;
        mountSkillMap.put("\u540e\u53d1\u5236\u4eba", new BaseMountSkill("\u540e\u53d1\u5236\u4eba", nArray3, 0, 14.4, new BaseQl[]{new BaseQl("\u72c2\u66b4\u7387", 4.8), new BaseQl("\u81f4\u547d", 4.8)}));
        int[] nArray4 = new int[3];
        nArray4[0] = 70;
        nArray4[1] = 30;
        mountSkillMap.put("\u5929\u96f7\u6012\u706b", new BaseMountSkill("\u5929\u96f7\u6012\u706b", nArray4, 1, 7.2, new BaseQl[]{new BaseQl("\u52a0\u5f3a\u706b", 4.8), new BaseQl("\u52a0\u5f3a\u96f7", 4.8), new BaseQl("\u52a0\u5f3a\u9b3c\u706b", 4.8), new BaseQl("\u6297\u706b", 7.2), new BaseQl("\u6297\u96f7", 7.2), new BaseQl("\u6297\u9b3c\u706b", 7.2)}));
        int[] nArray5 = new int[3];
        nArray5[0] = 70;
        nArray5[2] = 30;
        mountSkillMap.put("\u5174\u98ce\u4f5c\u6d6a", new BaseMountSkill("\u5174\u98ce\u4f5c\u6d6a", nArray5, 1, 7.2, new BaseQl[]{new BaseQl("\u52a0\u5f3a\u98ce", 4.8), new BaseQl("\u52a0\u5f3a\u6c34", 4.8), new BaseQl("\u52a0\u5f3a\u9b3c\u706b", 4.8), new BaseQl("\u6297\u98ce", 7.2), new BaseQl("\u6297\u6c34", 7.2), new BaseQl("\u6297\u9b3c\u706b", 7.2)}));
        int[] nArray6 = new int[3];
        nArray6[0] = 100;
        mountSkillMap.put("\u4e07\u52ab\u4e0d\u590d", new BaseMountSkill("\u4e07\u52ab\u4e0d\u590d", nArray6, 1, 7.2, new BaseQl[]{new BaseQl("\u5f3a\u4ed9\u6cd5", 4.8), new BaseQl("\u52a0\u5f3a\u9b3c\u706b", 4.8)}));
        int[] nArray7 = new int[3];
        nArray7[1] = 30;
        nArray7[2] = 70;
        mountSkillMap.put("\u91d1\u8eab\u4e0d\u574f", new BaseMountSkill("\u91d1\u8eab\u4e0d\u574f", nArray7, 0, 14.4, new BaseQl[]{new BaseQl("\u6297\u7269\u7406", 3.6), new BaseQl("\u6297\u9707\u6151", 7.2), new BaseQl("\u6297\u4e2d\u6bd2", 4.8), new BaseQl("\u6297\u4e09\u5c38\u866b", 0.024)}));
        int[] nArray8 = new int[3];
        nArray8[2] = 100;
        mountSkillMap.put("\u5929\u795e\u62a4\u4f53", new BaseMountSkill("\u5929\u795e\u62a4\u4f53", nArray8, 3, 14.4, new BaseQl[]{new BaseQl("\u6297\u4ed9\u6cd5", 4.8), new BaseQl("\u6297\u9b3c\u706b", 4.8)}));
        int[] nArray9 = new int[3];
        nArray9[0] = 30;
        nArray9[2] = 70;
        mountSkillMap.put("\u5fc3\u5982\u6b62\u6c34", new BaseMountSkill("\u5fc3\u5982\u6b62\u6c34", nArray9, 0, 14.4, new BaseQl[]{new BaseQl("\u6297\u4eba\u6cd5", 4.11522633744856), new BaseQl("\u6297\u9057\u5fd8", 4.11522633744856)}));
        int[] nArray10 = new int[3];
        nArray10[0] = 30;
        nArray10[1] = 70;
        mountSkillMap.put("\u53cd\u5ba2\u4e3a\u4e3b", new BaseMountSkill("\u53cd\u5ba2\u4e3a\u4e3b", nArray10, 2, 7.2, new BaseQl[]{new BaseQl("\u53cd\u51fb\u7387", 4.8), new BaseQl("\u53cd\u51fb\u65f6\u5ffd\u89c6\u9632\u5fa1\u51e0\u7387", 7.2), new BaseQl("\u53cd\u51fb\u65f6\u5ffd\u89c6\u9632\u5fa1\u7a0b\u5ea6", 7.2)}));
        int[] nArray11 = new int[3];
        nArray11[1] = 50;
        nArray11[2] = 50;
        mountSkillMap.put("\u53cd\u6cbb\u5176\u8eab", new BaseMountSkill("\u53cd\u6cbb\u5176\u8eab", nArray11, 0, 14.4, new BaseQl[]{new BaseQl("\u8eb2\u95ea\u7387", 9.2), new BaseQl("\u53cd\u9707\u7387", 7.2), new BaseQl("\u53cd\u9707\u7a0b\u5ea6", 7.2)}));
        int[] nArray12 = new int[3];
        nArray12[0] = 70;
        nArray12[2] = 30;
        mountSkillMap.put("\u5f97\u5fc3\u5e94\u624b", new BaseMountSkill("\u5f97\u5fc3\u5e94\u624b", nArray12, 1, 7.2, new BaseQl[]{new BaseQl("\u5ffd\u89c6\u4ed9\u6cd5", 7.2), new BaseQl("\u5ffd\u89c6\u9b3c\u706b", 7.2), new BaseQl("\u4ed9\u6cd5\u72c2\u66b4", 7.2), new BaseQl("\u9b3c\u706b\u72c2\u66b4", 7.2), new BaseQl("\u4ed9\u6cd5\u72c2\u66b4\u7a0b\u5ea6", 7.2), new BaseQl("\u9b3c\u706b\u72c2\u66b4\u7a0b\u5ea6", 7.2)}));
        int[] nArray13 = new int[3];
        nArray13[0] = 70;
        nArray13[1] = 30;
        mountSkillMap.put("\u5c71\u5916\u9752\u5c71", new BaseMountSkill("\u5c71\u5916\u9752\u5c71", nArray13, 3, 14.4, new BaseQl[]{new BaseQl("\u589e\u52a0\u5f3a\u514b\u6548\u679c", 5.18134715)}));
        int[] nArray14 = new int[3];
        nArray14[0] = 30;
        nArray14[2] = 70;
        mountSkillMap.put("\u89c6\u9669\u5982\u5937", new BaseMountSkill("\u89c6\u9669\u5982\u5937", nArray14, 0, 14.4, new BaseQl[]{new BaseQl("\u62b5\u5fa1\u5f3a\u514b\u6548\u679c", 7.2)}));
        int[] nArray15 = new int[3];
        nArray15[1] = 30;
        nArray15[2] = 70;
        mountSkillMap.put("\u6e38\u5203\u6709\u4f59", new BaseMountSkill("\u6e38\u5203\u6709\u4f59", nArray15, 3, 20.9, new BaseQl[]{new BaseQl("\u6cd5\u672f\u8eb2\u95ea", 14.4), new BaseQl("\u968f\u673a\u6297\u7075\u5b9d\u4f24\u5bb3", 0.0048)}));
        mountSkillMap.put("\u4e2d\u5929", new BaseMountSkill("\u4e2d\u5929", new BaseQl[]{new BaseQl("\u56db\u8c61\u5b88\u62a4\u4e4b\u529b", 10.0), new BaseQl("\u56db\u8c61\u5b88\u62a4\u4e4b\u529b", 15.0), new BaseQl("\u56db\u8c61\u5b88\u62a4\u4e4b\u529b", 15.0), new BaseQl("\u56db\u8c61\u5b88\u62a4\u4e4b\u529b", 20.0), new BaseQl("\u56db\u8c61\u5b88\u62a4\u4e4b\u529b", 20.0), new BaseQl("\u56db\u8c61\u5b88\u62a4\u4e4b\u529b", 20.0)}));
        mountSkillMap.put("\u9752\u9f99", new BaseMountSkill("\u9752\u9f99", new BaseQl[]{new BaseQl("\u901f\u5ea6", 2.0), new BaseQl("\u7269\u7406\u5438\u6536", 0.5), new BaseQl("\u6c14\u8840", 500.0), new BaseQl("\u901f\u5ea6\u52a0\u6210", 0.5), new BaseQl("\u901f\u5ea6", 2.0), new BaseQl("\u7269\u7406\u5438\u6536", 0.5), new BaseQl("\u6cd5\u529b", 500.0), new BaseQl("\u6cd5\u672f\u8eb2\u95ea", 0.5)}));
        mountSkillMap.put("\u767d\u864e", new BaseMountSkill("\u767d\u864e", new BaseQl[]{new BaseQl("\u653b\u51fb", 200.0), new BaseQl("\u653b\u51fb\u52a0\u6210", 0.5), new BaseQl("\u6c14\u8840", 500.0), new BaseQl("\u72c2\u66b4\u7387", 1.0), new BaseQl("\u653b\u51fb", 200.0), new BaseQl("\u653b\u51fb\u52a0\u6210", 0.5), new BaseQl("\u6c14\u8840", 500.0), new BaseQl("\u547d\u4e2d\u7387", 1.0)}));
        mountSkillMap.put("\u6731\u96c0", new BaseMountSkill("\u6731\u96c0", new BaseQl[]{new BaseQl("\u6cd5\u529b", 500.0), new BaseQl("\u6cd5\u529b\u52a0\u6210", 0.5), new BaseQl("\u6c14\u8840", 500.0), new BaseQl("\u5ffd\u89c6\u6297\u4ed9\u6cd5\u9b3c\u706b", 1.0), new BaseQl("\u6cd5\u529b", 500.0), new BaseQl("\u6cd5\u529b\u52a0\u6210", 0.5), new BaseQl("\u6c14\u8840", 500.0), new BaseQl("\u4ed9\u6cd5\u9b3c\u706b\u547d\u4e2d\u7387", 0.5)}));
        mountSkillMap.put("\u7384\u6b66", new BaseMountSkill("\u7384\u6b66", new BaseQl[]{new BaseQl("\u6c14\u8840", 500.0), new BaseQl("\u6c14\u8840\u52a0\u6210", 0.5), new BaseQl("\u6cd5\u529b", 500.0), new BaseQl("\u6297\u81f4\u547d\u7387", 1.0), new BaseQl("\u6c14\u8840", 500.0), new BaseQl("\u6c14\u8840\u52a0\u6210", 0.5), new BaseQl("\u6cd5\u529b", 500.0), new BaseQl("\u6297\u4ed9\u6cd5\u9b3c\u706b\u72c2\u66b4\u7387", 1.0)}));
    }

    /*
     * Unable to fully structure code
     */
    public static void getMountSHZTString(RoleData roleData, StringBuffer buffer, boolean total) {
        block5: {
            IiiiiiiiIIIII = roleData.getMountSHByindex(0);
            IiiiiiiiIIIII = PropertyUtil.getBaseMountSkill(BaseMountSH.SH_HEAD_NAME[0]);
            if (!total) break block5;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl26
        }
        buffer.append(IiiiiiiiIIIII.getLvl() == 0 ? "#c727272" : "#G");
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl49
        do {
            v0 = IiiiiiiiIIIII = IiiiiiiiIIIII.getLvl() > 0 ? IiiiiiiiIIIII.getMountSHByZTPercentage(IiiiiiiiIIIII + 1, IiiiiiiiIIIII.getLvl()) : 0.0;
            if (IiiiiiiiIIIII <= 0.0) {
                return;
            }
            buffer.append(IiiiiiiiIIIII == 0 ? "#G" : "#r");
            buffer.append(BaseMountSH.SH_HEAD_NAME[1 + IiiiiiiiIIIII]);
            buffer.append("\u5b88\u62a4\u5c5e\u6027\u63d0\u5347");
            buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII, (int)1));
            ++IiiiiiiiIIIII;
            buffer.append("%");
lbl26:
            // 2 sources

        } while (IiiiiiiiIIIII < 4);
        return;
        do {
            if (IiiiiiiiIIIII != 0) {
                buffer.append("#r");
            }
            if (IiiiiiiiIIIII == IiiiiiiiIIIII.getLvl()) {
                buffer.append("#c727272");
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getBases()[IiiiiiiiIIIII / 4];
            buffer.append(IiiiiiiiIIIII + 1);
            buffer.append(IiiiiiiiIIIII < 9 ? "\u7ea7  " : "\u7ea7 ");
            buffer.append(BaseMountSH.SH_HEAD_NAME[1 + IiiiiiiiIIIII % 4]);
            buffer.append("\u5b88\u62a4\u5c5e\u6027\u63d0\u5347");
            buffer.append(IIiiIiiiiIIiI.ALLATORIxDEMO((double)IiiiiiiiIIIII.getValue(), (int)1));
            ++IiiiiiiiIIIII;
            buffer.append("%");
lbl49:
            // 2 sources

        } while (IiiiiiiiIIIII < 24);
    }

    public static BaseMountSkill getBaseMountSkill(String skillName) {
        return mountSkillMap.get(skillName);
    }

    public static double getMapValue(Map<String, Double> map, String key) {
        Double IiiiiiiiIIIII = map.get(key);
        if (IiiiiiiiIIIII == null) return 0.0;
        return IiiiiiiiIIIII;
    }

    public static int ALLATORIxDEMO(double jl) {
        if (jl > 0.56) {
            return 10;
        }
        if (jl > 0.51) {
            return 8;
        }
        if (jl > 0.45) {
            return 7;
        }
        if (jl > 0.39) {
            return 6;
        }
        if (jl > 0.32) {
            return 5;
        }
        if (jl > 0.25) {
            return 4;
        }
        if (jl > 0.17) {
            return 3;
        }
        if (!(jl > 0.09)) return 1;
        return 2;
    }

    public static void ALLATORIxDEMO(Map<String, Double> map, String key, double value) {
        if (value == 0.0) {
            return;
        }
        Double IiiiiiiiIIIII = map.get(key);
        if (IiiiiiiiIIIII != null) {
            value += IiiiiiiiIIIII.doubleValue();
        }
        map.put(key, value);
    }
}
