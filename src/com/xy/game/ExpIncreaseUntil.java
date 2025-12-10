/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.a.iiIiIiiiiIiIi
 *  com.xy.bean.LoginResult
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.ExpUtil
 *  com.xy.formula.PetProperty
 *  com.xy.game.RoleData
 *  com.xy.readbean.Goodstable
 *  com.xy.text.GameView
 */
package com.xy.game;

import com.xy.a.a.iiIiIiiiiIiIi;
import com.xy.bean.LoginResult;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.formula.PetProperty;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.text.GameView;
import java.math.BigDecimal;

public class ExpIncreaseUntil {
    public static void ALLATORIxDEMO(GameView gameView) {
        LoginResult IiiiiiiiIIIII;
        LoginResult loginResult = IiiiiiiiIIIII = gameView.roleData.getLoginResult();
        LoginResult loginResult2 = IiiiiiiiIIIII;
        loginResult.setGrade(Integer.valueOf(loginResult2.getGrade() + 1));
        loginResult.setBone(Integer.valueOf(loginResult2.getBone() + 1));
        loginResult.setSpir(Integer.valueOf(loginResult2.getSpir() + 1));
        loginResult.setPower(Integer.valueOf(loginResult2.getPower() + 1));
        loginResult.setSpeed(Integer.valueOf(loginResult2.getSpeed() + 1));
        if (IiiiiiiiIIIII.getTurnAround() >= 4) {
            IiiiiiiiIIIII.setCalm(Integer.valueOf(IiiiiiiiIIIII.getCalm() + 1));
        }
        gameView.roleData.getRoleProperty().isReset = false;
        gameView.roleData.getRoleProperty().IiiIiiiiiiIiI();
        gameView.roleData.getRoleProperty().IIIIIiiiiIIii();
        gameView.roleData.getRoleProperty().isReset = true;
        IiiiiiiiIIIII.setHp(new BigDecimal(gameView.roleData.getRoleProperty().getHp()));
        IiiiiiiiIIIII.setMp(new BigDecimal(gameView.roleData.getRoleProperty().getMp()));
        gameView.roleData.getRoleProperty().IIIiiiiiiIIiI();
    }

    /*
     * WARNING - void declaration
     */
    public static void iIiIiiiiIIiIi(String v, RoleData roleData) {
        void IiiiiiiiIIIII;
        String[] stringArray = v.split("=");
        Mount IiiiiiiiIIIII2 = roleData.getMount(new BigDecimal(IiiiiiiiIIIII[0].substring(1)));
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        IiiiiiiiIIIII2.setMountlvl(Integer.valueOf(Integer.parseInt((String)IiiiiiiiIIIII[1])));
        IiiiiiiiIIIII2.setExp(Integer.valueOf(Integer.parseInt((String)IiiiiiiiIIIII[2])));
        IiiiiiiiIIIII2.setProficiency(Integer.valueOf(Integer.parseInt((String)IiiiiiiiIIIII[3])));
        if (!roleData.iiiIiiiiiiIIi(IiiiiiiiIIIII2.getMid())) return;
        roleData.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    /*
     * WARNING - void declaration
     */
    public static void iiiIiiiiiiIIi(String v, RoleData roleData) {
        void IiiiiiiiIIIII;
        String[] stringArray = v.split("=");
        Lingbao IiiiiiiiIIIII2 = roleData.getLingbao(new BigDecimal(IiiiiiiiIIIII[0].substring(1)));
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        IiiiiiiiIIIII2.setLingbaolvl(new BigDecimal((String)IiiiiiiiIIIII[1]));
        IiiiiiiiIIIII2.setLingbaoexe(new BigDecimal((String)IiiiiiiiIIIII[2]));
        IiiiiiiiIIIII2.setLingbaoqihe(Long.parseLong((String)IiiiiiiiIIIII[3]));
        if (!roleData.iIiIiiiiIIiIi(IiiiiiiiIIIII2.getBaoid())) return;
        roleData.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    /*
     * Unable to fully structure code
     */
    public static void iIiIiiiiIIiii(String v, RoleData roleData) {
        block16: {
            block15: {
                IiiiiiiiIIIII = roleData.getLoginResult();
                IiiiiiiiIIIII = v.split("=");
                IiiiiiiiIIIII = IiiiiiiiIIIII.getHp().intValue();
                IiiiiiiiIIIII = IiiiiiiiIIIII.getMp().intValue();
                if (IiiiiiiiIIIII.length >= 4) {
                    IiiiiiiiIIIII = new BigDecimal(IiiiiiiiIIIII[2]).intValue();
                    IiiiiiiiIIIII = new BigDecimal(IiiiiiiiIIIII[3]).intValue();
                }
                if (IiiiiiiiIIIII == 0) {
                    IiiiiiiiIIIII = roleData.getRoleProperty().getHp();
                    IiiiiiiiIIIII = roleData.getRoleProperty().getMp();
                }
                IiiiiiiiIIIII.setHp(new BigDecimal(IiiiiiiiIIIII));
                IiiiiiiiIIIII.setMp(new BigDecimal(IiiiiiiiIIIII));
                IiiiiiiiIIIII.setExperience(new BigDecimal(IiiiiiiiIIIII[1]));
                IiiiiiiiIIIII = Integer.parseInt(IiiiiiiiIIIII[0].substring(1));
                if (IiiiiiiiIIIII.length <= 4) break block15;
                IiiiiiiiIIIII.setGrade(Integer.valueOf(IiiiiiiiIIIII));
                roleData.getGameView().roleUnit.iIiIiiiiIiIii.setGrade(Integer.valueOf(IiiiiiiiIIIII));
                IiiiiiiiIIIII = 4;
                if (true) ** GOTO lbl55
            }
            IiiiiiiiIIIII = IiiiiiiiIIIII.getGrade();
            if (IiiiiiiiIIIII != IiiiiiiiIIIII) {
                IiiiiiiiIIIII.setGrade(Integer.valueOf(IiiiiiiiIIIII));
                roleData.getGameView().roleUnit.iIiIiiiiIiIii.setGrade(Integer.valueOf(IiiiiiiiIIIII));
                IiiiiiiiIIIII = IiiiiiiiIIIII - IiiiiiiiIIIII;
                IiiiiiiiIIIII.setBone(Integer.valueOf(IiiiiiiiIIIII.getBone() + IiiiiiiiIIIII));
                IiiiiiiiIIIII.setSpir(Integer.valueOf(IiiiiiiiIIIII.getSpir() + IiiiiiiiIIIII));
                IiiiiiiiIIIII.setPower(Integer.valueOf(IiiiiiiiIIIII.getPower() + IiiiiiiiIIIII));
                IiiiiiiiIIIII.setSpeed(Integer.valueOf(IiiiiiiiIIIII.getSpeed() + IiiiiiiiIIIII));
                if (IiiiiiiiIIIII.getTurnAround() >= 4) {
                    IiiiiiiiIIIII.setCalm(Integer.valueOf(IiiiiiiiIIIII.getCalm() + IiiiiiiiIIIII));
                }
                roleData.getRoleProperty().isReset = false;
                roleData.getRoleProperty().IiiIiiiiiiIiI();
                IiiiiiiiIIIII.setHp(new BigDecimal(roleData.getRoleProperty().getHp()));
                IiiiiiiiIIIII.setMp(new BigDecimal(roleData.getRoleProperty().getMp()));
                roleData.getRoleProperty().isReset = true;
                roleData.getRoleProperty().IIIiiiiiiIIiI();
            }
            break block16;
            do {
                if (IiiiiiiiIIIII == 4) {
                    IiiiiiiiIIIII.setBone(Integer.valueOf(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII])));
                } else if (IiiiiiiiIIIII == 5) {
                    IiiiiiiiIIIII.setSpir(Integer.valueOf(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII])));
                } else if (IiiiiiiiIIIII == 6) {
                    IiiiiiiiIIIII.setPower(Integer.valueOf(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII])));
                } else if (IiiiiiiiIIIII == 7) {
                    IiiiiiiiIIIII.setSpeed(Integer.valueOf(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII])));
                } else if (IiiiiiiiIIIII == 8) {
                    IiiiiiiiIIIII.setCalm(Integer.valueOf(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII])));
                }
                ++IiiiiiiiIIIII;
lbl55:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
        }
        if ((IiiiiiiiIIIII = (iiIiIiiiiIiIi)roleData.getGameView().getFormManagement().iIiIiiiiIIiii(105)) != null) {
            IiiiiiiiIIIII.IiiIiiiiiiIiI();
        }
        roleData.getGameView().baseView.IIiIIiiiIiIIi();
    }

    public static void ALLATORIxDEMO(String[] stringArray, RoleData roleData) {
        String[] vs;
        Goodstable IiiiiiiiIIIII = roleData.getGood(new BigDecimal(vs[0]));
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.getType() != 750L) {
            return;
        }
        String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.getValue().split("\\|");
        StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII2[0]);
        IiiiiiiiIIIII3.append("|");
        IiiiiiiiIIIII3.append(IiiiiiiiIIIII2[1]);
        IiiiiiiiIIIII3.append("|\u5185\u4e39\u7b49\u7ea7=");
        IiiiiiiiIIIII3.append(vs[1]);
        IiiiiiiiIIIII3.append("\u8f6c");
        IiiiiiiiIIIII3.append(vs[2]);
        IiiiiiiiIIIII3.append("|\u7ecf\u9a8c=");
        IiiiiiiiIIIII3.append(vs[3]);
        IiiiiiiiIIIII.setValue(IiiiiiiiIIIII3.toString());
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String v, RoleData roleData) {
        void IiiiiiiiIIIII;
        String[] stringArray = v.split("=");
        RoleSummoning IiiiiiiiIIIII2 = roleData.getPet(new BigDecimal(IiiiiiiiIIIII[0].substring(1)));
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getGrade();
        int IiiiiiiiIIIII4 = Integer.parseInt((String)IiiiiiiiIIIII[1]);
        IiiiiiiiIIIII2.setGrade(Integer.valueOf(IiiiiiiiIIIII4));
        IiiiiiiiIIIII2.setExp(new BigDecimal((String)IiiiiiiiIIIII[2]));
        IiiiiiiiIIIII2.setFriendliness(Long.valueOf(Long.parseLong((String)IiiiiiiiIIIII[3])));
        if (IiiiiiiiIIIII4 != IiiiiiiiIIIII3) {
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII4 - IiiiiiiiIIIII3;
            IiiiiiiiIIIII2.setBone(Integer.valueOf(IiiiiiiiIIIII2.getBone() + IiiiiiiiIIIII5));
            IiiiiiiiIIIII2.setSpir(Integer.valueOf(IiiiiiiiIIIII2.getSpir() + IiiiiiiiIIIII5));
            IiiiiiiiIIIII2.setPower(Integer.valueOf(IiiiiiiiIIIII2.getPower() + IiiiiiiiIIIII5));
            IiiiiiiiIIIII2.setSpeed(Integer.valueOf(IiiiiiiiIIIII2.getSpeed() + IiiiiiiiIIIII5));
            if (IiiiiiiiIIIII2.getTurnRount() >= 4) {
                IiiiiiiiIIIII2.setCalm(Integer.valueOf(IiiiiiiiIIIII2.getCalm() + IiiiiiiiIIIII5));
            }
            int[] IiiiiiiiIIIII6 = PetProperty.getPetHMASp((RoleSummoning)IiiiiiiiIIIII2, (RoleData)roleData);
            IiiiiiiiIIIII2.setBasishp(IiiiiiiiIIIII6[0]);
            IiiiiiiiIIIII2.setBasismp(IiiiiiiiIIIII6[1]);
        } else {
            int IiiiiiiiIIIII7 = Integer.parseInt((String)IiiiiiiiIIIII[4]);
            int IiiiiiiiIIIII8 = Integer.parseInt((String)IiiiiiiiIIIII[5]);
            RoleSummoning roleSummoning = IiiiiiiiIIIII2;
            if (IiiiiiiiIIIII7 == 0) {
                void IiiiiiiiIIIII9;
                int[] nArray = PetProperty.getPetHMASp((RoleSummoning)roleSummoning, (RoleData)roleData);
                IiiiiiiiIIIII2.setBasishp((int)IiiiiiiiIIIII9[0]);
                IiiiiiiiIIIII2.setBasismp((int)IiiiiiiiIIIII9[1]);
            } else {
                roleSummoning.setBasishp(IiiiiiiiIIIII7);
                IiiiiiiiIIIII2.setBasismp(IiiiiiiiIIIII8);
            }
        }
        if (!roleData.ALLATORIxDEMO(IiiiiiiiIIIII2.getSid())) return;
        roleData.getRoleProperty().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static void ALLATORIxDEMO(Lingbao lingbao, long addexp, GameView gameView) {
        boolean IiiiiiiiIIIII;
        int IiiiiiiiIIIII2 = lingbao.getLingbaolvl().intValue();
        long IiiiiiiiIIIII3 = lingbao.getLingbaoexe().longValue();
        long IiiiiiiiIIIII4 = ExpUtil.iIiIiiiiIIiii((int)IiiiiiiiIIIII2);
        IiiiiiiiIIIII3 += addexp;
        StringBuffer IiiiiiiiIIIII5 = new StringBuffer();
        IiiiiiiiIIIII5.append("#X#Y\u4f60\u7684");
        IiiiiiiiIIIII5.append(lingbao.getBaoname());
        IiiiiiiiIIIII5.append("\u83b7\u5f97\u4e86");
        IiiiiiiiIIIII5.append(ExpUtil.ALLATORIxDEMO((long)addexp));
        IiiiiiiiIIIII5.append("\u9053\u884c");
        gameView.chatBox.addChat(6, IiiiiiiiIIIII5.toString());
        boolean bl = false;
        long l = IiiiiiiiIIIII3;
        while (l >= IiiiiiiiIIIII4) {
            if (IiiiiiiiIIIII2 >= 200) break;
            if (IiiiiiiiIIIII2 != 0 && IiiiiiiiIIIII2 % 30 == 0) {
                IiiiiiiiIIIII3 = IiiiiiiiIIIII4;
                gameView.iIiIiiiiIIiii("\u7a81\u7834\u540e\u624d\u53ef\u7ee7\u7eed\u5347\u7ea7");
                break;
            }
            IiiiiiiiIIIII4 = ExpUtil.iIiIiiiiIIiii((int)(++IiiiiiiiIIIII2));
            IiiiiiiiIIIII = true;
            l = IiiiiiiiIIIII3 -= IiiiiiiiIIIII4;
        }
        if (IiiiiiiiIIIII) {
            StringBuffer IiiiiiiiIIIII6 = new StringBuffer();
            IiiiiiiiIIIII6.append("\u4f60\u7684");
            IiiiiiiiIIIII6.append(lingbao.getBaoname());
            IiiiiiiiIIIII6.append("\u5347\u7ea7\u4e86");
            gameView.iIiIiiiiIIiii(IiiiiiiiIIIII6.toString());
        }
        lingbao.setLingbaolvl(new BigDecimal(IiiiiiiiIIIII2));
        lingbao.setLingbaoexe(new BigDecimal(IiiiiiiiIIIII3));
    }
}
