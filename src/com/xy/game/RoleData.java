/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IIIIIiiiIiIii
 *  com.xy.a.q.IIIIiiiiIIIIi
 *  com.xy.a.q.iiIiIiiiIIIiI
 *  com.xy.a.w.iIiIiiiiIiIII
 *  com.xy.bean.BeauBean
 *  com.xy.bean.FriendBean
 *  com.xy.bean.LoginResult
 *  com.xy.bean.PrivateData
 *  com.xy.bean.RoleShow
 *  com.xy.bean.RoleSystem
 *  com.xy.bean.TeamBean
 *  com.xy.bean.UseCardBean
 *  com.xy.entity.Baby
 *  com.xy.entity.Friendtable
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.PackRecord
 *  com.xy.entity.Pal
 *  com.xy.entity.RoleSummoning
 *  com.xy.formula.BaseMeridians
 *  com.xy.formula.BaseMountSH
 *  com.xy.formula.BaseValue
 *  com.xy.formula.GoodType
 *  com.xy.formula.RoleProperty
 *  com.xy.formula.SkillUtil
 *  com.xy.game.GameUtil
 *  com.xy.game.PKSys
 *  com.xy.game.RolePet
 *  com.xy.game.RoleTaskData
 *  com.xy.readbean.Activity2Role
 *  com.xy.readbean.ActivityRole
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.MoneyType
 *  com.xy.readbean.Skill
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.GameView
 *  com.xy.v.IIIiiiiiiiiIi
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIIiiiiIiiII
 *  com.xy.v.iiIiIiiiiIiii
 *  com.xy.v.iiIiiiiiIIiii
 */
package com.xy.game;

import com.xy.a.q.IIIIIiiiIiIii;
import com.xy.a.q.IIIIiiiiIIIIi;
import com.xy.a.q.iiIiIiiiIIIiI;
import com.xy.a.w.iIiIiiiiIiIII;
import com.xy.bean.BeauBean;
import com.xy.bean.FriendBean;
import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.RoleSystem;
import com.xy.bean.TeamBean;
import com.xy.bean.UseCardBean;
import com.xy.entity.Baby;
import com.xy.entity.Friendtable;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.PackRecord;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.formula.BaseMeridians;
import com.xy.formula.BaseMountSH;
import com.xy.formula.BaseValue;
import com.xy.formula.GoodType;
import com.xy.formula.RoleProperty;
import com.xy.formula.SkillUtil;
import com.xy.game.GameUtil;
import com.xy.game.PKSys;
import com.xy.game.RolePet;
import com.xy.game.RoleTaskData;
import com.xy.readbean.Activity2Role;
import com.xy.readbean.ActivityRole;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MoneyType;
import com.xy.readbean.Skill;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.GameView;
import com.xy.v.IIIiiiiiiiiIi;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIIiiiiIiiII;
import com.xy.v.iiIiIiiiiIiii;
import com.xy.v.iiIiiiiiIIiii;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RoleData {
    public List<BigDecimal> ddGoodsList;
    private PrivateData privateData;
    public BigDecimal[] goodPacks;
    private BigDecimal chosePalId;
    public RoleTaskData taskSystem;
    public List<RolePet> pets;
    private boolean helpLing = true;
    public List<Baby> babys;
    private Map<Long, FriendBean> friendMap;
    private BigDecimal chosePetId;
    private RoleProperty roleProperty;
    private boolean helpPet = true;
    private BigDecimal choseBaoId;
    public Map<String, UseCardBean> limitMap;
    public BigDecimal lastFlyId;
    private PackRecord packRecord;
    private long[] shortCutSkills;
    private BigDecimal choseMountId;
    private Map<Integer, ActivityRole> activityMap;
    private BigDecimal choseBabyId;
    private LoginResult loginResult;
    private GameView gameView;
    private BaseMountSH[] mountSHs;
    public BigDecimal[] goodChoses;
    public TeamBean teamBean;
    public List<Pal> pals;
    public Map<BigDecimal, Lingbao> lingbaoMap;
    private PKSys pkSys;
    private List<Goodstable> parcelList;
    private BigDecimal choseStarCardId;
    public List<BigDecimal> fabaoList;
    private boolean lockPack = true;
    private long roleId;
    private RoleSystem roleSystem;
    private Map<BigDecimal, Goodstable> goodMap;
    private BigDecimal choseWingId;
    public List<BigDecimal> flyList;
    public List<BigDecimal> lingbaoList;
    public List<BigDecimal> wingGoodsList;
    public List<Mount> mounts;
    public List<BigDecimal> starCardList;
    public BigDecimal[] lingbaoChoses;

    public void iiiiIiiiIiIiI() {
        HashMap<String, UseCardBean> IiiiiiiiIIIII = new HashMap<String, UseCardBean>();
        String IiiiiiiiIIIII2 = this.privateData.getTimingGood();
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2)) {
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII2.split("\\^");
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII3.length) {
                String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII3[IiiiiiiiIIIII4].split("#");
                UseCardBean IiiiiiiiIIIII6 = new UseCardBean();
                int IiiiiiiiIIIII7 = 0;
                while (IiiiiiiiIIIII7 < IiiiiiiiIIIII5.length) {
                    if (IiiiiiiiIIIII7 == 0) {
                        IiiiiiiiIIIII6.setName(IiiiiiiiIIIII5[IiiiiiiiIIIII7]);
                    } else if (IiiiiiiiIIIII7 == 1) {
                        IiiiiiiiIIIII6.setType(IiiiiiiiIIIII5[IiiiiiiiIIIII7]);
                    } else if (IiiiiiiiIIIII7 == 2) {
                        IiiiiiiiIIIII6.setSkin(IiiiiiiiIIIII5[IiiiiiiiIIIII7]);
                    } else if (IiiiiiiiIIIII7 == 3) {
                        long IiiiiiiiIIIII8 = Long.parseLong(IiiiiiiiIIIII5[IiiiiiiiIIIII7]);
                        if (IiiiiiiiIIIII8 < 100000000L) {
                            IiiiiiiiIIIII8 *= 60000L;
                        } else if (IiiiiiiiIIIII8 < 2000000000L) {
                            IiiiiiiiIIIII8 *= 1000L;
                        }
                        IiiiiiiiIIIII6.setTime(IiiiiiiiIIIII8);
                    } else if (IiiiiiiiIIIII7 == 4) {
                        IiiiiiiiIIIII6.setValue(IiiiiiiiIIIII5[IiiiiiiiIIIII7]);
                    }
                    ++IiiiiiiiIIIII7;
                }
                ++IiiiiiiiIIIII4;
                IiiiiiiiIIIII.put(IiiiiiiiIIIII6.getType(), IiiiiiiiIIIII6);
            }
        }
        this.limitMap = IiiiiiiiIIIII;
    }

    public Long getShortCutGoodByIndex(BigDecimal rgid) {
        return rgid.longValue() + Integer.MAX_VALUE;
    }

    public FriendBean getFriend(long id) {
        if (this.friendMap == null) return null;
        return this.friendMap.get(id);
    }

    public Goodstable getGoodEquip(BigDecimal rgid) {
        Goodstable IiiiiiiiIIIII = rgid != null ? this.goodMap.get(rgid) : null;
        if (IiiiiiiiIIIII == null) return null;
        if (IiiiiiiiIIIII.getStatus() != 1) return null;
        return IiiiiiiiIIIII;
    }

    public Mount getPetMount(BigDecimal petId) {
        if (this.mounts == null) {
            return null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.mounts.size()) {
            Mount IiiiiiiiIIIII2 = this.mounts.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.ALLATORIxDEMO(petId)) {
                return IiiiiiiiIIIII2;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void setChoseMountId(BigDecimal choseMountId) {
        this.choseMountId = choseMountId;
    }

    public void iiiIiiiiiiIIi(String value) {
        if (this.activityMap == null) {
            this.activityMap = new HashMap<Integer, ActivityRole>();
        } else {
            this.activityMap.clear();
        }
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)value)) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < value.length()) {
            IiiiiiiiIIIII2 = value.indexOf("|", IiiiiiiiIIIII + 1);
            if (IiiiiiiiIIIII2 == -1) {
                IiiiiiiiIIIII2 = value.length();
            }
            this.ALLATORIxDEMO(value, IiiiiiiiIIIII, IiiiiiiiIIIII2);
            IiiiiiiiIIIII = IiiiiiiiIIIII2 + 1;
        }
    }

    public long getMoney(MoneyType moneyType) {
        if (moneyType.getId() == 1) {
            return this.loginResult.getGold().longValue();
        }
        if (moneyType.getId() == 2) {
            return this.loginResult.getSavegold().longValue();
        }
        if (moneyType.getId() == 3) {
            return this.loginResult.getCodecard().longValue();
        }
        if (moneyType.getId() == 4) {
            return this.loginResult.getMoney().longValue();
        }
        if (moneyType.getId() == 5) {
            return this.loginResult.getPaysum().longValue();
        }
        if (moneyType.getId() == -1) {
            return moneyType.getMax();
        }
        if (moneyType.getId() == -2) {
            int IiiiiiiiIIIII = (int)(moneyType.getMax() >> 32);
            int IiiiiiiiIIIII2 = (int)(moneyType.getMax() & Integer.MAX_VALUE);
            return this.getActivityMoney(IiiiiiiiIIIII, IiiiiiiiIIIII2);
        }
        if (moneyType.getId() == -3) {
            int IiiiiiiiIIIII = (int)(moneyType.getMax() >> 32);
            int IiiiiiiiIIIII3 = (int)(moneyType.getMax() & Integer.MAX_VALUE);
            return this.getActivityMoney(IiiiiiiiIIIII, IiiiiiiiIIIII3) - this.getActivityMoney(IiiiiiiiIIIII, -IiiiiiiiIIIII3);
        }
        if (moneyType.getId() == -4) {
            return this.getGoodTypeNum((int)moneyType.getMax());
        }
        if (moneyType.getKey() == null) return 0L;
        return this.loginResult.getScoretype(moneyType.getKey()).longValue();
    }

    public List<iiIIiiiiIiiII> iIiIiiiiIIiii(iiIIiiiiIiiII ... list) {
        ArrayList<iiIIiiiiIiiII> IiiiiiiiIIIII = null;
        int IiiiiiiiIIIII2 = list.length;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.goodPacks.length) {
            Goodstable IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII2 > 0 && this.goodPacks[IiiiiiiiIIIII3] != null && (IiiiiiiiIIIII4 = this.getGood(this.goodPacks[IiiiiiiiIIIII3])) != null) {
                int IiiiiiiiIIIII5 = 0;
                while (IiiiiiiiIIIII5 < list.length) {
                    iiIIiiiiIiiII IiiiiiiiIIIII6 = list[IiiiiiiiIIIII5];
                    if (IiiiiiiiIIIII6 != null && IiiiiiiiIIIII6.ALLATORIxDEMO == (long)IiiiiiiiIIIII4.getType().intValue()) {
                        if ((long)IiiiiiiiIIIII4.getUsetime().intValue() >= IiiiiiiiIIIII6.IiiiiiiiIIIII) {
                            --IiiiiiiiIIIII2;
                            list[IiiiiiiiIIIII5] = null;
                            IiiiiiiiIIIII6.ALLATORIxDEMO = IiiiiiiiIIIII4.getRgid().longValue();
                        } else {
                            IiiiiiiiIIIII6.IiiiiiiiIIIII -= (long)IiiiiiiiIIIII4.getUsetime().intValue();
                            IiiiiiiiIIIII6 = new iiIIiiiiIiiII(IiiiiiiiIIIII4.getRgid().longValue(), (long)IiiiiiiiIIIII4.getUsetime().intValue());
                        }
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII = new ArrayList<iiIIiiiiIiiII>();
                        }
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII6);
                    }
                    ++IiiiiiiiIIIII5;
                }
            }
            ++IiiiiiiiIIIII3;
        }
        if (IiiiiiiiIIIII2 != 0) return null;
        return IiiiiiiiIIIII;
    }

    public static int getPackNumTwo(int TurnAround) {
        return RoleData.getPackNum(TurnAround) * 24;
    }

    public void iiiIiiiiiiIIi(BigDecimal id, int index) {
        if (id == null) {
            return;
        }
        if (index < 0) return;
        if (index >= this.goodPacks.length) {
            return;
        }
        BigDecimal IiiiiiiiIIIII = this.goodPacks[index];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII2] != null && this.goodPacks[IiiiiiiiIIIII2].compareTo(id) == 0) {
                this.goodPacks[IiiiiiiiIIIII2] = IiiiiiiiIIIII;
                this.goodPacks[index] = id;
                return;
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public Goodstable getFlyGood(int index) {
        if (index >= this.flyList.size()) return null;
        return this.getGood(this.flyList.get(index));
    }

    public void iIiIiiiiIIiii(int activityId) {
        this.activityMap.remove(activityId);
    }

    public void ALLATORIxDEMO(int activityId, ActivityRole activityRole) {
        if (this.activityMap == null) {
            this.activityMap = new HashMap<Integer, ActivityRole>();
        }
        this.activityMap.put(activityId, activityRole);
    }

    public void setChosePalId(BigDecimal chosePalId) {
        this.chosePalId = chosePalId;
    }

    public Mount getMount(BigDecimal mId) {
        if (mId == null) {
            return null;
        }
        for (Mount IiiiiiiiIIIII : this.mounts) {
            if (IiiiiiiiIIIII.getMid().compareTo(mId) != 0) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public void setLockPack() {
        this.lockPack = !this.lockPack;
    }

    public void setChoseBaoId(BigDecimal choseBaoId) {
        this.choseBaoId = choseBaoId;
    }

    /*
     * Unable to fully structure code
     */
    public void iiiiiiiiIIiii(List<RoleSummoning> list) {
        block8: {
            block7: {
                IiiiiiiiIIIII = false;
                IiiiiiiiIIIII = new ArrayList<RolePet>();
                IiiiiiiiIIIII = this.packRecord.getHelpBb();
                if (IiiiiiiiIIIII == null) break block7;
                IiiiiiiiIIIII = IiiiiiiiIIIII.split("\\|");
                IiiiiiiiIIIII = ((String[])IiiiiiiiIIIII).length <= 0 || IiiiiiiiIIIII[0].equals("SHUT") == false;
                IiiiiiiiIIIII = ((String[])IiiiiiiiIIIII).length > 0 && IiiiiiiiIIIII[0].equals("SHUT") != false ? 1 : 0;
                if (true) ** GOTO lbl17
            }
            IiiiiiiiIIIII = true;
            break block8;
            do {
                var7_9 = new RolePet((String)IiiiiiiiIIIII[IiiiiiiiIIIII]);
                ++IiiiiiiiIIIII;
                IiiiiiiiIIIII.add(IiiiiiiiIIIII);
lbl17:
                // 2 sources

            } while (IiiiiiiiIIIII < ((RoleSummoning)IiiiiiiiIIIII).length);
        }
        for (RoleSummoning IiiiiiiiIIIII : list) {
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
                if (IiiiiiiiIIIII.getSid().compareTo(((RolePet)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getId()) != 0) {
                    ++IiiiiiiiIIIII;
                    continue;
                }
                IiiiiiiiIIIII = (RolePet)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                break;
            }
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new RolePet(IiiiiiiiIIIII.getSid());
                IiiiiiiiIIIII.add(IiiiiiiiIIIII);
            }
            IiiiiiiiIIIII.setPet(IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            if (((RolePet)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getPet() == null) {
                IiiiiiiiIIIII.remove(IiiiiiiiIIIII);
            }
            --IiiiiiiiIIIII;
        }
        this.helpPet = IiiiiiiiIIIII;
        this.pets = IiiiiiiiIIIII;
    }

    public Goodstable getEquipGood(int index) {
        return this.getGoodEquip(this.goodChoses[index]);
    }

    public void iIiIiiiiIIiii(BigDecimal id, int path) {
        if (id == null) {
            Lingbao IiiiiiiiIIIII = this.getLingbao(this.lingbaoChoses[path]);
            if (IiiiiiiiIIIII == null) return;
            if (IiiiiiiiIIIII.getEquipment() != 1) return;
            this.lingbaoChoses[path] = null;
            IiiiiiiiIIIII.setEquipment(0);
            ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII, (GameClient)this.gameView.getClient());
            this.roleProperty.ALLATORIxDEMO(IiiiiiiiIIIII.getKangxing(), false);
            return;
        }
        Lingbao IiiiiiiiIIIII = this.getLingbao(id);
        if (IiiiiiiiIIIII == null) return;
        if (IiiiiiiiIIIII.getEquipment() != 0) return;
        if (!IiiiiiiiIIIII.getBaotype().equals("\u6cd5\u5b9d")) {
            path = 0;
            this.iIiIiiiiIIiii(null, 0);
        } else {
            path = this.lingbaoChoses[1] == null ? 1 : 2;
            this.iIiIiiiiIIiii(null, path);
        }
        this.lingbaoChoses[path] = IiiiiiiiIIIII.getBaoid();
        IiiiiiiiIIIII.setEquipment(1);
        ParamTool.ALLATORIxDEMO((Lingbao)IiiiiiiiIIIII, (GameClient)this.gameView.getClient());
        this.roleProperty.ALLATORIxDEMO(IiiiiiiiIIIII.getKangxing(), true);
    }

    public Goodstable getStarCardGood(int index) {
        if (index >= this.starCardList.size()) return null;
        return this.getGood(this.starCardList.get(index));
    }

    public boolean iIiIiiiiIIiIi() {
        return this.lockPack;
    }

    public void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

    public boolean iiiIiiiiiiIIi() {
        if (this.parcelList == null) return false;
        return true;
    }

    public Skill getShortCutSkillById(long id) {
        if (id == 0L) {
            return null;
        }
        int IiiiiiiiIIIII = (int)(id >> 8);
        int IiiiiiiiIIIII2 = (int)(id & 0xFFL);
        if (IiiiiiiiIIIII >= 1 && IiiiiiiiIIIII <= 3) {
            int IiiiiiiiIIIII3 = SkillUtil.getSepciesIndex((BigDecimal)this.loginResult.getSpecies_id(), (int)(IiiiiiiiIIIII - 1));
            int IiiiiiiiIIIII4 = 1001 + IiiiiiiiIIIII3 * 5 + IiiiiiiiIIIII2;
            return this.getObjectArea().iIiIiiiiIIiii(String.valueOf(IiiiiiiiIIIII4));
        }
        if (IiiiiiiiIIIII != 4) return null;
        BaseMeridians IiiiiiiiIIIII5 = this.roleProperty.getMeridians(0);
        IiiiiiiiIIIII2 = IiiiiiiiIIIII5 != null && IiiiiiiiIIIII5.getKey() != null ? Integer.parseInt(IiiiiiiiIIIII5.getKey()) - 1 : -1;
        if (IiiiiiiiIIIII2 == -1) return null;
        int IiiiiiiiIIIII6 = SkillUtil.getSepciesIndex((BigDecimal)this.loginResult.getSpecies_id());
        int IiiiiiiiIIIII7 = SkillUtil.getFMIndex((int)IiiiiiiiIIIII6, (int)IiiiiiiiIIIII2);
        return this.getObjectArea().iIiIiiiiIIiii(String.valueOf(12000 + IiiiiiiiIIIII7));
    }

    public void iiiIiiiiiiIIi(Goodstable good) {
        if (this.parcelList == null) return;
        if (good == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.parcelList.size()) {
            if (this.parcelList.get(IiiiiiiiIIIII).getRgid().compareTo(good.getRgid()) != 0) {
                ++IiiiiiiiIIIII;
                continue;
            }
            if (good.getUsetime() > 0) {
                this.parcelList.set(IiiiiiiiIIIII, good);
                return;
            }
            this.parcelList.remove(IiiiiiiiIIIII);
            return;
        }
        this.parcelList.add(good);
    }

    public Baby getChoseBaby() {
        return this.getBaby(this.choseBabyId);
    }

    public long getShortCutSkill(int index) {
        return this.shortCutSkills[index];
    }

    public boolean IiiIiiiiiiIiI(BigDecimal id) {
        if (this.choseBabyId == null) return false;
        if (id == null) {
            return false;
        }
        if (this.choseBabyId.compareTo(id) != 0) return false;
        return true;
    }

    public void ALLATORIxDEMO(List<RoleSummoning> pets, List<Mount> mounts, List<Lingbao> lingbaos, List<Baby> babys, List<Pal> pals) {
        this.mounts = mounts;
        this.babys = babys;
        this.pals = pals;
        this.iiiiiiiiIIiii(pets);
        this.ALLATORIxDEMO(lingbaos);
    }

    public void setBabys(List<Baby> babys) {
        this.babys = babys;
    }

    public void setHelpPet(boolean helpPet) {
        this.helpPet = helpPet;
    }

    public BeauBean getBeau() {
        UseCardBean IiiiiiiiIIIII = this.getLimit("\u9753\u53f7");
        if (IiiiiiiiIIIII == null) return null;
        return IiiiiiiiIIIII.ALLATORIxDEMO();
    }

    public Mount getMount(int lvl) {
        if (lvl == 0) {
            return null;
        }
        for (Mount IiiiiiiiIIIII : this.mounts) {
            if (IiiiiiiiIIIII.getMountid() != lvl) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public int getBBRolePet() {
        int IiiiiiiiIIIII = 0;
        for (RolePet IiiiiiiiIIIII2 : this.pets) {
            if (IiiiiiiiIIIII2.getBb() == 0) continue;
            IiiiiiiiIIIII |= 1 << IiiiiiiiIIIII2.getBb();
        }
        int IiiiiiiiIIIII3 = 1;
        while (IiiiiiiiIIIII3 <= 4) {
            if ((IiiiiiiiIIIII >>> IiiiiiiiIIIII3 & 1) == 0) {
                return IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII3;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public void IiiIiiiiiiIiI(List<iiIIiiiiIiiII> points) {
        ArrayList<Goodstable> IiiiiiiiIIIII = new ArrayList<Goodstable>();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < points.size()) {
            void IiiiiiiiIIIII3;
            iiIIiiiiIiiII iiIIiiiiIiiII2 = points.get(IiiiiiiiIIIII2);
            Goodstable IiiiiiiiIIIII4 = this.getGood(new BigDecimal(IiiiiiiiIIIII3.ALLATORIxDEMO));
            if (IiiiiiiiIIIII4 != null) {
                IiiiiiiiIIIII4.ALLATORIxDEMO((int)IiiiiiiiIIIII3.IiiiiiiiIIIII);
                if (IiiiiiiiIIIII4.getUsetime() <= 0) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII4.getRgid());
                }
                IiiiiiiiIIIII.add(IiiiiiiiIIIII4);
            }
            ++IiiiiiiiIIIII2;
        }
        ParamTool.ALLATORIxDEMO(IiiiiiiiIIIII, (int)1, (GameClient)this.gameView.getClient());
    }

    public void IIiIIiiiiiIiI() {
        ArrayList<Goodstable> IiiiiiiiIIIII = new ArrayList<Goodstable>();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.ddGoodsList.size()) {
            Goodstable IiiiiiiiIIIII3 = this.goodMap.get(this.ddGoodsList.get(IiiiiiiiIIIII2));
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII.add(IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII2;
        }
        Collections.sort(IiiiiiiiIIIII, IIIiiiiiiiiIi.ALLATORIxDEMO);
        ArrayList<BigDecimal> IiiiiiiiIIIII22 = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII4 = 0;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII.size()) {
            Object e = IiiiiiiiIIIII.get(IiiiiiiiIIIII4);
            ++IiiiiiiiIIIII4;
            IiiiiiiiIIIII22.add(((Goodstable)e).getRgid());
        }
        this.ddGoodsList = IiiiiiiiIIIII22;
    }

    public Pal getPal(int pId) {
        for (Pal IiiiiiiiIIIII : this.pals) {
            if (IiiiiiiiIIIII.getpId() != pId) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public ActivityRole getActivity(int activityId) {
        return this.activityMap.get(activityId);
    }

    public void IIIiIiiiIiIii() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (!this.helpLing) {
            IiiiiiiiIIIII.append("SHUT");
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.lingbaoList.size()) {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(this.lingbaoList.get(IiiiiiiiIIIII2++));
        }
        String IiiiiiiiIIIII22 = IiiiiiiiIIIII.toString();
        if (IiiiiiiiIIIII22.equals(this.packRecord.getHelpLing())) {
            return;
        }
        this.packRecord.setHelpLing(IiiiiiiiIIIII22);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"1", (String)(String.valueOf(2) + this.packRecord.getHelpLing()));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void iiiIiiiiiiIIi(BigDecimal rgid) {
        Goodstable IiiiiiiiIIIII;
        Goodstable goodstable = IiiiiiiiIIIII = rgid != null ? this.getGood(rgid) : null;
        if (IiiiiiiiIIIII == null) {
            return;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(1);
        if (IiiiiiiiIIIII.getUsetime() > 0) return;
        this.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
    }

    /*
     * Unable to fully structure code
     */
    public int getGoodPackSum(long type, BigDecimal id, int sum) {
        block4: {
            IiiiiiiiIIIII = 0;
            if (!GoodType.ALLATORIxDEMO((Long)type)) break block4;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl13
        }
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl19
        do {
            if (this.goodPacks[IiiiiiiiIIIII] == null) return sum;
            if (id.compareTo(this.getGood(this.goodPacks[IiiiiiiiIIIII]).getGoodsid()) == 0) {
                return sum;
            }
            ++IiiiiiiiIIIII;
lbl13:
            // 2 sources

        } while (IiiiiiiiIIIII < this.goodPacks.length);
        return IiiiiiiiIIIII;
        do {
            if (this.goodPacks[IiiiiiiiIIIII] == null && ++IiiiiiiiIIIII >= sum) {
                return sum;
            }
            ++IiiiiiiiIIIII;
lbl19:
            // 2 sources

        } while (IiiiiiiiIIIII < this.goodPacks.length);
        return IiiiiiiiIIIII;
    }

    public RoleProperty getRoleProperty() {
        return this.roleProperty;
    }

    public Long getShortCutSkillByIndex(int skillId) {
        int IiiiiiiiIIIII;
        int IiiiiiiiIIIII2;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < 3) {
            IiiiiiiiIIIII2 = SkillUtil.getSepciesIndex((BigDecimal)this.loginResult.getSpecies_id(), (int)IiiiiiiiIIIII3);
            IiiiiiiiIIIII = 0;
            while (IiiiiiiiIIIII < 5) {
                if (1001 + IiiiiiiiIIIII2 * 5 + IiiiiiiiIIIII == skillId) {
                    return IiiiiiiiIIIII3 + 1 << 8 | IiiiiiiiIIIII;
                }
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII3;
        }
        BaseMeridians IiiiiiiiIIIII22 = this.roleProperty.getMeridians(0);
        IiiiiiiiIIIII2 = IiiiiiiiIIIII22 != null && IiiiiiiiIIIII22.getKey() != null ? Integer.parseInt(IiiiiiiiIIIII22.getKey()) - 1 : -1;
        if (IiiiiiiiIIIII2 == -1) return null;
        IiiiiiiiIIIII = SkillUtil.getSepciesIndex((BigDecimal)this.loginResult.getSpecies_id());
        int IiiiiiiiIIIII4 = SkillUtil.getFMIndex((int)IiiiiiiiIIIII, (int)IiiiiiiiIIIII2);
        if (12000 + IiiiiiiiIIIII4 != skillId) return null;
        return 1024L;
    }

    public long getGoodTypeNum(int type) {
        long IiiiiiiiIIIII = 0L;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII2] != null && this.getGood(this.goodPacks[IiiiiiiiIIIII2]).getType() == (long)type) {
                IiiiiiiiIIIII += (long)this.getGood(this.goodPacks[IiiiiiiiIIIII2]).getUsetime().intValue();
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public IiiiiiiiiIIII getObjectArea() {
        return this.gameView.getObjectArea();
    }

    public void IIiIIiiiIiIIi() {
        long[] IiiiiiiiIIIII = new long[8];
        String IiiiiiiiIIIII2 = this.packRecord.getShortCutSkills();
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2)) {
            IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((long[])IiiiiiiiIIIII, (String)IiiiiiiiIIIII2, (int)0, (String)",");
        }
        this.shortCutSkills = IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(Lingbao lingbao) {
        return this.ALLATORIxDEMO(lingbao.getBaoname(), lingbao.getBaoid(), this.fabaoList, this.lingbaoMap);
    }

    public int ALLATORIxDEMO(iiIIiiiiIiiII[] longs) {
        int IiiiiiiiIIIII = longs.length > 0 ? Integer.MAX_VALUE : 0;
        iiIIiiiiIiiII[] iiIIiiiiIiiIIArray = longs;
        int n = iiIIiiiiIiiIIArray.length;
        int n2 = 0;
        while (n2 < n) {
            iiIIiiiiIiiII IiiiiiiiIIIII2 = iiIIiiiiIiiIIArray[n2];
            int IiiiiiiiIIIII3 = 0;
            int IiiiiiiiIIIII4 = 0;
            while (IiiiiiiiIIIII4 < this.goodPacks.length) {
                Goodstable IiiiiiiiIIIII5;
                if (this.goodPacks[IiiiiiiiIIIII4] != null && (IiiiiiiiIIIII5 = this.getGood(this.goodPacks[IiiiiiiiIIIII4])) != null && IiiiiiiiIIIII2.ALLATORIxDEMO == (long)IiiiiiiiIIIII5.getGoodsid().intValue()) {
                    IiiiiiiiIIIII3 += IiiiiiiiIIIII5.getUsetime().intValue();
                }
                ++IiiiiiiiIIIII4;
            }
            if ((IiiiiiiiIIIII = (int)Math.min((long)IiiiiiiiIIIII, (long)IiiiiiiiIIIII3 / IiiiiiiiIIIII2.IiiiiiiiIIIII)) <= 0) break;
            ++n2;
        }
        if (IiiiiiiiIIIII <= 0) return 0;
        return IiiiiiiiIIIII;
    }

    public boolean iIiIiiiiIIiIi(BigDecimal id) {
        if (this.choseBaoId == null) return false;
        if (id == null) {
            return false;
        }
        if (this.choseBaoId.compareTo(id) != 0) return false;
        return true;
    }

    public Lingbao getLingbao(BigDecimal baoid) {
        return this.lingbaoMap.get(baoid);
    }

    public List<Baby> getBabys() {
        return this.babys;
    }

    public boolean iiiIiiiiiiIIi(BigDecimal id) {
        if (this.choseMountId == null) return false;
        if (id == null) {
            return false;
        }
        if (this.choseMountId.compareTo(id) != 0) return false;
        return true;
    }

    public UseCardBean getLimit(String type) {
        return this.limitMap.get(type);
    }

    public RoleData(long roleId, GameView gameView) {
        this.roleId = roleId;
        this.gameView = gameView;
    }

    public Goodstable getGood(BigDecimal rgid) {
        return this.goodMap.get(rgid);
    }

    public Lingbao getLingBaoIndex(int index) {
        if (index >= this.lingbaoList.size()) return null;
        return this.getLingbao(this.lingbaoList.get(index));
    }

    public PrivateData getPrivateData() {
        return this.privateData;
    }

    public boolean iIiIiiiiIIiii() {
        return this.helpLing;
    }

    public int getFaPJ() {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.fabaoList.size()) {
            Lingbao IiiiiiiiIIIII3 = this.getLingbao(this.fabaoList.get(IiiiiiiiIIIII2));
            if (IiiiiiiiIIIII3 != null) {
                IiiiiiiiIIIII += BaseValue.getFv((Lingbao)IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO() {
        return this.helpPet;
    }

    private /* synthetic */ void ALLATORIxDEMO(String value, int index, int valueEnd) {
        int IiiiiiiiIIIII = value.indexOf("#", index + 1);
        if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > valueEnd) {
            IiiiiiiiIIIII = valueEnd;
        }
        int IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII);
        index = IiiiiiiiIIIII + 1;
        if ((IiiiiiiiIIIII = value.indexOf("#", index + 1)) == -1 || IiiiiiiiIIIII > valueEnd) {
            IiiiiiiiIIIII = valueEnd;
        }
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII) != 2) return;
        this.activityMap.put(IiiiiiiiIIIII2, (ActivityRole)new Activity2Role(value, IiiiiiiiIIIII + 1, valueEnd));
    }

    public boolean ALLATORIxDEMO(int id) {
        if (id == 0) {
            return false;
        }
        for (RolePet IiiiiiiiIIIII : this.pets) {
            if (IiiiiiiiIIIII.getBb() == 0) continue;
            if (IiiiiiiiIIIII.getBb1() == id) return true;
            if (IiiiiiiiIIIII.getBb2() != id) continue;
            return true;
        }
        return false;
    }

    public void ALLATORIxDEMO(int trun) {
        BigDecimal[] IiiiiiiiIIIII = new BigDecimal[RoleData.getPackNumTwo(trun)];
        if (this.goodPacks != null) {
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < this.goodPacks.length && IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
                int n = IiiiiiiiIIIII2;
                BigDecimal bigDecimal = this.goodPacks[IiiiiiiiIIIII2];
                ++IiiiiiiiIIIII2;
                IiiiiiiiIIIII[n] = bigDecimal;
            }
        }
        this.goodPacks = IiiiiiiiIIIII;
    }

    public boolean iIiIiiiiIIiii(BigDecimal id) {
        if (this.chosePalId == null) return false;
        if (id == null) {
            return false;
        }
        if (this.chosePalId.compareTo(id) != 0) return false;
        return true;
    }

    public void IIiiIiiiiIiII() {
        PackRecord IiiiiiiiIIIII;
        String IiiiiiiiIIIII2 = this.getPackRecordString();
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (String)(IiiiiiiiIIIII = this.getPackRecord()).getRecord())) {
            return;
        }
        IiiiiiiiIIIII.setRecord(IiiiiiiiIIIII2);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"1", (String)(String.valueOf(0) + IiiiiiiiIIIII2));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public void setChoseBabyId(BigDecimal choseBabyId) {
        this.choseBabyId = choseBabyId;
    }

    public boolean ALLATORIxDEMO(Goodstable goodTable) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII] == null) {
                this.goodPacks[IiiiiiiiIIIII] = goodTable.getRgid();
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public void IIIiiiiiiIIiI() {
        this.mountSHs = new BaseMountSH[5];
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.mountSHs.length) {
            int n = IiiiiiiiIIIII;
            BaseMountSH baseMountSH = this.packRecord.getMountSH(IiiiiiiiIIIII);
            ++IiiiiiiiIIIII;
            this.mountSHs[n] = baseMountSH;
        }
    }

    public void iIiIiiiiIIiii(String type) {
        IIIIiiiiIIIIi IiiiiiiiIIIII;
        UseCardBean IiiiiiiiIIIII2 = this.limitMap.remove(type);
        if (IiiiiiiiIIIII2 == null) {
            return;
        }
        if ((type.equals("\u6708\u5361") || type.equals("\u5b63\u5361")) && (IiiiiiiiIIIII = (IIIIiiiiIIIIi)this.gameView.getFormManagement().iIiIiiiiIIiii(39)) != null) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(2);
        }
        boolean IiiiiiiiIIIII22 = false;
        boolean IiiiiiiiIIIII3 = false;
        boolean IiiiiiiiIIIII4 = false;
        boolean IiiiiiiiIIIII5 = false;
        IiiiiiiiIIIII22 |= IiiiiiiiIIIII2.getType().equals("\u53d8\u8eab\u5361") || IiiiiiiiIIIII2.getType().equals("\u5f3a\u6cd5\u578b") || IiiiiiiiIIIII2.getType().equals("\u52a0\u6297\u578b") || IiiiiiiiIIIII2.getType().equals("\u589e\u76ca\u578b") || IiiiiiiiIIIII2.getType().equals("VIP") || IiiiiiiiIIIII2.getType().equals("\u5e2e\u6d3e") || IiiiiiiiIIIII2.getType().equals("\u5355\u4eba\u7ade\u6280\u573a");
        IiiiiiiiIIIII3 |= IiiiiiiiIIIII2.getType().equals("\u53d8\u8eab\u5361") || IiiiiiiiIIIII2.getType().equals("\u7ae5\u5361");
        IiiiiiiiIIIII4 |= IiiiiiiiIIIII2.getType().equals("\u9650\u65f6\u793c\u5305");
        if (!(IiiiiiiiIIIII5 |= IiiiiiiiIIIII2.getType().equals("\u9753\u53f7"))) {
            this.gameView.iiiIiiiiiiIIi(String.valueOf(IiiiiiiiIIIII2.getName()) + "\u5df2\u7ecf\u5931\u53bb\u6548\u679c");
        }
        if (IiiiiiiiIIIII22) {
            this.getRoleProperty().ALLATORIxDEMO();
        }
        if (IiiiiiiiIIIII3) {
            this.ALLATORIxDEMO(false);
        }
        if (IiiiiiiiIIIII5) {
            this.getRoleProperty().IIiIIiiiIiIIi();
        }
        this.gameView.baseView.iIiiIiiiiIiiI |= IiiiiiiiIIIII4;
        this.gameView.baseView.IIiiiiiiIiiII = true;
    }

    public BaseMountSH getMountSHByMountId(int mountId) {
        int IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < this.mountSHs.length) {
            if (this.mountSHs[IiiiiiiiIIIII].ALLATORIxDEMO(mountId) != 0) {
                return this.mountSHs[IiiiiiiiIIIII];
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(BigDecimal id) {
        block8: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            block9: {
                                IiiiiiiiIIIII = false;
                                IiiiiiiiIIIII = this.goodMap.remove(id);
                                if (IiiiiiiiIIIII == null) {
                                    return;
                                }
                                if (IiiiiiiiIIIII.getType() != 8888L) break block9;
                                if (IiiiiiiiIIIII.getStatus() == 1 && IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.goodChoses[12], (BigDecimal)id)) {
                                    this.goodChoses[12] = null;
                                    IiiiiiiiIIIII = true;
                                }
                                this.wingGoodsList.remove(IiiiiiiiIIIII.getRgid());
                                break block8;
                            }
                            if (IiiiiiiiIIIII.getType() != 8901L) break block10;
                            if (IiiiiiiiIIIII.getStatus() == 1 && IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.goodChoses[14], (BigDecimal)id)) {
                                this.goodChoses[14] = null;
                                IiiiiiiiIIIII = true;
                            }
                            this.flyList.remove(IiiiiiiiIIIII.getRgid());
                            break block8;
                        }
                        if (IiiiiiiiIIIII.getType() != 520L || IiiiiiiiIIIII.getStatus() != 4 && IiiiiiiiIIIII.getStatus() != 1) break block11;
                        if (IiiiiiiiIIIII.getStatus() == 1 && IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.goodChoses[13], (BigDecimal)id)) {
                            this.goodChoses[13] = null;
                            IiiiiiiiIIIII = true;
                        }
                        this.starCardList.remove(IiiiiiiiIIIII.getRgid());
                        break block8;
                    }
                    if (IiiiiiiiIIIII.getStatus() != 2) break block12;
                    this.ddGoodsList.remove(IiiiiiiiIIIII.getRgid());
                    break block8;
                }
                if (IiiiiiiiIIIII.getStatus() != 1) break block13;
                IiiiiiiiIIIII = 0;
                if (true) ** GOTO lbl47
            }
            if (IiiiiiiiIIIII.getStatus() != 0) break block8;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl54
            do {
                if (this.goodChoses[IiiiiiiiIIIII] != null && this.goodChoses[IiiiiiiiIIIII].compareTo(IiiiiiiiIIIII.getRgid()) == 0) {
                    this.goodChoses[IiiiiiiiIIIII] = null;
                    IiiiiiiiIIIII = true;
                    break block8;
                }
                ++IiiiiiiiIIIII;
lbl47:
                // 2 sources

            } while (IiiiiiiiIIIII < this.goodChoses.length);
            break block8;
            do {
                if (this.goodPacks[IiiiiiiiIIIII] != null && this.goodPacks[IiiiiiiiIIIII].compareTo(IiiiiiiiIIIII.getRgid()) == 0) {
                    this.goodPacks[IiiiiiiiIIIII] = null;
                    break;
                }
                ++IiiiiiiiIIIII;
lbl54:
                // 2 sources

            } while (IiiiiiiiIIIII < this.goodPacks.length);
        }
        if (IiiiiiiiIIIII == false) return;
        this.roleProperty.IIIIIiiiiIIii();
    }

    public BaseMountSH getMountSHByindex(int index) {
        return this.mountSHs[index];
    }

    public List<FriendBean> getFriendList() {
        if (this.friendMap == null) {
            return new ArrayList<FriendBean>(0);
        }
        ArrayList<FriendBean> IiiiiiiiIIIII = new ArrayList<FriendBean>(this.friendMap.size());
        for (FriendBean IiiiiiiiIIIII2 : this.friendMap.values()) {
            IiiiiiiiIIIII.add(IiiiiiiiIIIII2);
        }
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiii(Goodstable good) {
        iiIiIiiiIIIiI IiiiiiiiIIIII;
        IIIIIiiiIiIii IiiiiiiiIIIII2 = (IIIIIiiiIiIii)this.gameView.getFormManagement().iIiIiiiiIIiii(61);
        if (IiiiiiiiIIIII2 != null && (IiiiiiiiIIIII2.iiiIiiiiiiIIi() == 0 || IiiiiiiiIIIII2.iiiIiiiiiiIIi() == 1 || IiiiiiiiIIIII2.iiiIiiiiiiIIi() == 2)) {
            IiiiiiiiIIIII2.ALLATORIxDEMO().ALLATORIxDEMO(good);
        }
        if ((IiiiiiiiIIIII = (iiIiIiiiIIIiI)this.gameView.getFormManagement().iIiIiiiiIIiii(26)) == null) return;
        IiiiiiiiIIIII.iIiIiiiiIIiii(good);
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public void iIiIiiiiIIiIi(List<BigDecimal> packGoodList) {
        try {
            String IiiiiiiiIIIII = this.packRecord.getRecord();
            if (IiiiiiiiIIIII != null && !IiiiiiiiIIIII.equals("")) {
                String[] IiiiiiiiIIIII2 = IiiiiiiiIIIII.split("\\|");
                int IiiiiiiiIIIII3 = 0;
                while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
                    BigDecimal IiiiiiiiIIIII4;
                    String[] IiiiiiiiIIIII5 = IiiiiiiiIIIII2[IiiiiiiiIIIII3].split("-");
                    int IiiiiiiiIIIII6 = Integer.parseInt(IiiiiiiiIIIII5[0]);
                    if (IiiiiiiiIIIII6 < this.goodPacks.length && this.goodPacks[IiiiiiiiIIIII6] == null && packGoodList.remove(IiiiiiiiIIIII4 = new BigDecimal(IiiiiiiiIIIII5[1]))) {
                        this.goodPacks[IiiiiiiiIIIII6] = IiiiiiiiIIIII4;
                    }
                    ++IiiiiiiiIIIII3;
                }
            }
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
        }
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 < packGoodList.size()) {
            BigDecimal IiiiiiiiIIIII8 = packGoodList.get(IiiiiiiiIIIII7);
            while (IiiiiiiiIIIII < this.goodPacks.length) {
                if (this.goodPacks[IiiiiiiiIIIII] == null) {
                    this.goodPacks[IiiiiiiiIIIII] = IiiiiiiiIIIII8;
                    break;
                }
                ++IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII7;
        }
    }

    public void setHelpLing(boolean helpLing) {
        this.helpLing = helpLing;
    }

    public String getGoodNum(BigDecimal sid, StringBuffer buffer, int size) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodPacks.length) {
            Goodstable IiiiiiiiIIIII2;
            Goodstable goodstable = IiiiiiiiIIIII2 = this.goodPacks[IiiiiiiiIIIII] != null ? this.getGood(this.goodPacks[IiiiiiiiIIIII]) : null;
            if (IiiiiiiiIIIII2 != null && IiiiiiiiIIIII2.getGoodsid().compareTo(sid) == 0) {
                if (IiiiiiiiIIIII2.getGoodlock() == 1) {
                    return "\u9053\u5177\u88ab\u4e0a\u9501";
                }
                if (buffer.length() != 0) {
                    buffer.append("|");
                }
                buffer.append(IiiiiiiiIIIII2.getRgid());
                buffer.append("=");
                if (size > IiiiiiiiIIIII2.getUsetime()) {
                    buffer.append(IiiiiiiiIIIII2.getUsetime());
                    size -= IiiiiiiiIIIII2.getUsetime().intValue();
                } else {
                    buffer.append(size);
                    size = 0;
                }
                if (size == 0) {
                    return null;
                }
            }
            ++IiiiiiiiIIIII;
        }
        if (size <= 0) return null;
        return "\u6570\u91cf\u4e0d\u8db3";
    }

    public FriendBean ALLATORIxDEMO(long id) {
        return null;
    }

    public void iiiIiiiiiiIIi(List<Goodstable> goods) {
        if (goods == null) {
            this.parcelList = null;
            return;
        }
        Collections.sort(goods, IIIiiiiiiiiIi.ALLATORIxDEMO);
        this.parcelList = goods;
    }

    public BigDecimal getChosePetId() {
        return this.chosePetId;
    }

    public void IIIIIiiiiIIii() {
        String IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((long[])this.shortCutSkills, (int)0, (String)",");
        this.packRecord.setShortCutSkills("JN" + IiiiiiiiIIIII);
        String IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"1", (String)(String.valueOf(6) + IiiiiiiiIIIII));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public static int getPackNum(int TurnAround) {
        if (TurnAround < 5) return TurnAround + 1;
        return 5;
    }

    public Lingbao getFaBaoIndex(int index) {
        if (index >= this.fabaoList.size()) return null;
        return this.getLingbao(this.fabaoList.get(index));
    }

    public FriendBean ALLATORIxDEMO(FriendBean friendBean) {
        FriendBean IiiiiiiiIIIII;
        if (this.friendMap == null) {
            this.friendMap = new HashMap<Long, FriendBean>();
        }
        if ((IiiiiiiiIIIII = this.getFriend(friendBean.getFid())) != null) {
            return IiiiiiiiIIIII.ALLATORIxDEMO(friendBean);
        }
        this.friendMap.put(friendBean.getFid(), friendBean);
        return friendBean;
    }

    public boolean ALLATORIxDEMO(String bn, BigDecimal baoId, List<BigDecimal> fabaoList, Map<BigDecimal, Lingbao> lingbaoMap) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < fabaoList.size()) {
            Lingbao IiiiiiiiIIIII2 = lingbaoMap.get(fabaoList.get(IiiiiiiiIIIII));
            if (IiiiiiiiIIIII2.getBaoname().equals(bn)) {
                if (IiiiiiiiIIIII2.getBaoid().compareTo(baoId) == 0) return false;
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public void setChosePetId(BigDecimal chosePetId) {
        this.chosePetId = chosePetId;
    }

    public RolePet getBBRolePet(int index) {
        if (index <= 0) {
            return null;
        }
        for (RolePet IiiiiiiiIIIII : this.pets) {
            if (IiiiiiiiIIIII.getBb() == index) return IiiiiiiiIIIII;
        }
        return null;
    }

    public void setHelpLB(BigDecimal[] ids) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < ids.length) {
            BigDecimal IiiiiiiiIIIII3 = ids[IiiiiiiiIIIII2];
            int IiiiiiiiIIIII4 = IiiiiiiiIIIII;
            while (IiiiiiiiIIIII4 < this.lingbaoList.size()) {
                if (this.lingbaoList.get(IiiiiiiiIIIII4).compareTo(IiiiiiiiIIIII3) == 0) {
                    if (IiiiiiiiIIIII != IiiiiiiiIIIII4) {
                        BigDecimal IiiiiiiiIIIII5 = this.lingbaoList.get(IiiiiiiiIIIII);
                        this.lingbaoList.set(IiiiiiiiIIIII, this.lingbaoList.get(IiiiiiiiIIIII4));
                        this.lingbaoList.set(IiiiiiiiIIIII4, IiiiiiiiIIIII5);
                    }
                    ++IiiiiiiiIIIII;
                    break;
                }
                ++IiiiiiiiIIIII4;
            }
            ++IiiiiiiiIIIII2;
        }
        this.IIIiIiiiIiIii();
    }

    public void ALLATORIxDEMO(boolean saveTX) {
        String IiiiiiiiIIIII;
        String IiiiiiiiIIIII2;
        RoleShow IiiiiiiiIIIII3 = this.gameView.roleUnit.iIiIiiiiIiIii;
        List IiiiiiiiIIIII4 = this.gameView.roleData.getPackRecord().getPutTX();
        String IiiiiiiiIIIII5 = IiiiiiiiIIIII3.getSkin();
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII5, (String)(IiiiiiiiIIIII2 = GameUtil.getRoleSkin((String)this.gameView.roleData.getRoleSkin(), (List)IiiiiiiiIIIII4, (RoleShow)IiiiiiiiIIIII3, (RoleData)this)))) {
            return;
        }
        IiiiiiiiIIIII3.setSkin(IiiiiiiiIIIII2.equals("") ? null : IiiiiiiiIIIII2);
        this.getLoginResult().setSkin(IiiiiiiiIIIII3.getSkin());
        this.gameView.roleUnit.ALLATORIxDEMO(null, IiiiiiiiIIIII3);
        if (saveTX && IiiiiiiiIIIII4 != null && IiiiiiiiIIIII4.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            ((StringBuffer)((Object)IiiiiiiiIIIII)).append("E");
            ((StringBuffer)((Object)IiiiiiiiIIIII)).append((String)IiiiiiiiIIIII4.get(0));
            int IiiiiiiiIIIII6 = 1;
            while (IiiiiiiiIIIII6 < IiiiiiiiIIIII4.size()) {
                ((StringBuffer)((Object)IiiiiiiiIIIII)).append("_");
                ((StringBuffer)((Object)IiiiiiiiIIIII)).append((String)IiiiiiiiIIIII4.get(IiiiiiiiIIIII6++));
            }
            IiiiiiiiIIIII2 = IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII2) ? ((StringBuffer)((Object)IiiiiiiiIIIII)).toString() : String.valueOf(IiiiiiiiIIIII2) + "|" + ((StringBuffer)((Object)IiiiiiiiIIIII)).toString();
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"1", (String)(String.valueOf(5) + IiiiiiiiIIIII2));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII);
    }

    public Goodstable getUsableFly() {
        Goodstable IiiiiiiiIIIII = this.getGood(this.lastFlyId);
        if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getBaseFly().getRl() > 0) {
            return IiiiiiiiIIIII;
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.flyList.size()) {
            IiiiiiiiIIIII = this.getGood(this.flyList.get(IiiiiiiiIIIII2));
            if (IiiiiiiiIIIII.getBaseFly().getRl() > 0) {
                return IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    public void iIiIiiiiIIiii(List<Goodstable> goods) {
        this.iiiIiiiiiiIIi();
        ArrayList<BigDecimal> IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        for (Goodstable IiiiiiiiIIIII2 : goods) {
            if (IiiiiiiiIIIII2.getUsetime() <= 0) continue;
            if (IiiiiiiiIIIII2.getType() == 8888L) {
                if (IiiiiiiiIIIII2.getStatus() == 1) {
                    this.goodChoses[12] = IiiiiiiiIIIII2.getRgid();
                }
                this.wingGoodsList.add(IiiiiiiiIIIII2.getRgid());
            } else if (IiiiiiiiIIIII2.getType() == 8901L) {
                this.flyList.add(IiiiiiiiIIIII2.getRgid());
                if (IiiiiiiiIIIII2.getStatus() == 1) {
                    this.goodChoses[14] = IiiiiiiiIIIII2.getRgid();
                    this.lastFlyId = this.goodChoses[14];
                }
            } else if (IiiiiiiiIIIII2.getType() == 520L && (IiiiiiiiIIIII2.getStatus() == 4 || IiiiiiiiIIIII2.getStatus() == 1)) {
                if (IiiiiiiiIIIII2.getStatus() == 1) {
                    this.goodChoses[13] = IiiiiiiiIIIII2.getRgid();
                }
                this.starCardList.add(IiiiiiiiIIIII2.getRgid());
            } else if (IiiiiiiiIIIII2.getStatus() == 2) {
                this.ddGoodsList.add(IiiiiiiiIIIII2.getRgid());
            } else if (IiiiiiiiIIIII2.getStatus() != 1) {
                IiiiiiiiIIIII.add(IiiiiiiiIIIII2.getRgid());
            }
            this.goodMap.put(IiiiiiiiIIIII2.getRgid(), IiiiiiiiIIIII2);
        }
        this.setEquipGoodsList(this.packRecord.getEquipType("E"));
        this.iIiIiiiiIIiIi(IiiiiiiiIIIII);
        this.IIiIIiiiiiIiI();
    }

    public void ALLATORIxDEMO(Goodstable good) {
        if (good == null) {
            return;
        }
        if (good.getRole_id().compareTo(this.loginResult.getRole_id()) != 0 && this.iiiIiiiiiiIIi() && good.getRole_id().longValue() == 100000000L + this.roleId) {
            this.iiiIiiiiiiIIi(good);
            return;
        }
        if (good.getType() == -1L) {
            this.ALLATORIxDEMO(String.valueOf(-good.getGoodsid().longValue()));
            return;
        }
        if (good.getUsetime() <= 0) {
            this.iIiIiiiiIIiii(good.getRgid());
            this.iIiIiiiiIIiii(good);
            return;
        }
        Goodstable IiiiiiiiIIIII = this.getGood(good.getRgid());
        if (IiiiiiiiIIIII != null) {
            if (IiiiiiiiIIIII.getStatus() == good.getStatus()) {
                this.goodMap.put(good.getRgid(), good);
                IiiiiiiiIIIII.setRgid(good.getRgid());
                this.iIiIiiiiIIiii(good);
                return;
            }
            this.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
        }
        boolean IiiiiiiiIIIII2 = false;
        this.goodMap.put(good.getRgid(), good);
        if (good.getType() == 8888L) {
            if (good.getStatus() == 1) {
                this.goodChoses[12] = good.getRgid();
                IiiiiiiiIIIII2 = true;
            }
            this.wingGoodsList.add(good.getRgid());
        } else if (good.getType() == 8901L) {
            this.flyList.add(good.getRgid());
            if (good.getStatus() == 1) {
                this.goodChoses[14] = good.getRgid();
                this.lastFlyId = this.goodChoses[14];
                IiiiiiiiIIIII2 = true;
            }
        } else if (good.getType() == 520L && (good.getStatus() == 4 || good.getStatus() == 1)) {
            if (good.getStatus() == 1) {
                this.goodChoses[13] = good.getRgid();
                IiiiiiiiIIIII2 = true;
            }
            this.starCardList.add(good.getRgid());
        } else if (good.getStatus() == 2) {
            this.ddGoodsList.add(good.getRgid());
            this.IIiIIiiiiiIiI();
        } else if (good.getStatus() == 1) {
            int IiiiiiiiIIIII3 = GoodType.ALLATORIxDEMO((long)good.getType());
            if (IiiiiiiiIIIII3 != -1) {
                if (IiiiiiiiIIIII3 != 10) {
                    this.goodChoses[IiiiiiiiIIIII3] = good.getRgid();
                } else {
                    this.goodChoses[this.goodChoses[10] == null ? 10 : 11] = good.getRgid();
                }
                IiiiiiiiIIIII2 = true;
            }
        } else if (good.getStatus() == 0) {
            this.ALLATORIxDEMO(good);
        }
        if (IiiiiiiiIIIII2) {
            this.roleProperty.IIIIIiiiiIIii();
        }
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.setRgid(good.getRgid());
        }
        this.iIiIiiiiIIiii(good);
    }

    public void ALLATORIxDEMO(Lingbao lingbao) {
        this.lingbaoMap.remove(lingbao.getBaoid());
        this.lingbaoList.remove(lingbao.getBaoid());
        lingbao.setOperation("\u5220\u9664");
        ParamTool.ALLATORIxDEMO((Lingbao)lingbao, (GameClient)this.getGameView().getClient());
    }

    public long getActivityMoney(int activityId, int key) {
        ActivityRole IiiiiiiiIIIII = this.getActivity(activityId);
        if (IiiiiiiiIIIII == null) return 0L;
        return IiiiiiiiIIIII.getValueByKey(key) - IiiiiiiiIIIII.getValueByKey(-key);
    }

    /*
     * Unable to fully structure code
     */
    public void iiiiiiiiIIiii() {
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = false;
        IiiiiiiiIIIII = iIiIIiiiIiiiI.iIiIiiiiIIiii();
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = this.limitMap.entrySet().iterator();
        while (IiiiiiiiIIIII.hasNext()) {
            block14: {
                IiiiiiiiIIIII = IiiiiiiiIIIII.next().getValue();
                if (!IiiiiiiiIIIII.getType().equals("\u9650\u65f6\u793c\u5305")) break block14;
                IiiiiiiiIIIII = IiiiiiiiIIIII.getKeysByActivity();
                IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
                if (true) ** GOTO lbl53
            }
            if (!IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII)) continue;
            IiiiiiiiIIIII.remove();
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new StringBuffer("T");
            } else {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(IiiiiiiiIIIII.getType());
            if (IiiiiiiiIIIII.getType().equals("\u9753\u53f7")) {
                this.gameView.iiiIiiiiiiIIi("\u4f60\u7684\u9753\u53f7\u5df2\u5230\u671f");
                IiiiiiiiIIIII = true;
                continue;
            }
            IiiiiiiiIIIII |= IiiiiiiiIIIII.getType().equals("\u53d8\u8eab\u5361") != false || IiiiiiiiIIIII.getType().equals("\u5f3a\u6cd5\u578b") != false || IiiiiiiiIIIII.getType().equals("\u52a0\u6297\u578b") != false || IiiiiiiiIIIII.getType().equals("\u589e\u76ca\u578b") != false || IiiiiiiiIIIII.getType().equals("VIP") != false || IiiiiiiiIIIII.getType().equals("\u5e2e\u6d3e") != false || IiiiiiiiIIIII.getType().equals("\u5355\u4eba\u7ade\u6280\u573a") != false;
            IiiiiiiiIIIII |= IiiiiiiiIIIII.getType().equals("\u53d8\u8eab\u5361") != false || IiiiiiiiIIIII.getType().equals("\u7ae5\u5361") != false || IiiiiiiiIIIII.getType().equals("\u5149\u6b66") != false;
            this.gameView.iiiIiiiiiiIIi(String.valueOf(IiiiiiiiIIIII.getName()) + "\u5df2\u7ecf\u5931\u53bb\u6548\u679c");
            continue;
            do {
                IiiiiiiiIIIII = (iiIiIiiiiIiii)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII >= IiiiiiiiIIIII.ALLATORIxDEMO) {
                    IiiiiiiiIIIII.remove(IiiiiiiiIIIII);
                    if (!IiiiiiiiIIIII) {
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII = new StringBuffer("T");
                        } else {
                            IiiiiiiiIIIII.append("|");
                        }
                        IiiiiiiiIIIII.append(IiiiiiiiIIIII.getType());
                        IiiiiiiiIIIII = true;
                    }
                    IiiiiiiiIIIII.append("=");
                    IiiiiiiiIIIII.append(IiiiiiiiIIIII.IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII.size() == 0) {
                        IiiiiiiiIIIII.remove();
                    }
                }
                --IiiiiiiiIIIII;
lbl53:
                // 2 sources

            } while (IiiiiiiiIIIII >= 0);
        }
        if (IiiiiiiiIIIII == null) {
            this.gameView.baseView.iIiiIiiiiIiiI |= IiiiiiiiIIIII;
            this.gameView.baseView.IIiiiiiiIiiII = true;
            return;
        }
        IiiiiiiiIIIII = Agreement.getSendTextAES((String)"usercard", (String)IiiiiiiiIIIII.toString());
        this.gameView.getClient().ALLATORIxDEMO((String)IiiiiiiiIIIII);
        if (IiiiiiiiIIIII) {
            this.getRoleProperty().ALLATORIxDEMO();
        }
        if (IiiiiiiiIIIII) {
            this.ALLATORIxDEMO(false);
        }
        if (IiiiiiiiIIIII) {
            this.getRoleProperty().IIiIIiiiIiIIi();
        }
        this.gameView.baseView.iIiiIiiiiIiiI |= IiiiiiiiIIIII;
        this.gameView.baseView.IIiiiiiiIiiII = true;
    }

    public PKSys getPkSys() {
        if (this.pkSys != null) return this.pkSys;
        this.pkSys = new PKSys(this);
        return this.pkSys;
    }

    public Baby getBaby(BigDecimal babyId) {
        if (babyId == null) {
            return null;
        }
        for (Baby IiiiiiiiIIIII : this.babys) {
            if (IiiiiiiiIIIII.getBabyid().compareTo(babyId) != 0) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public void ALLATORIxDEMO(BigDecimal id) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII] != null && this.goodPacks[IiiiiiiiIIIII].compareTo(id) == 0) {
                this.goodPacks[IiiiiiiiIIIII] = null;
                return;
            }
            ++IiiiiiiiIIIII;
        }
    }

    public Goodstable ALLATORIxDEMO(long type) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII] != null && this.getGood(this.goodPacks[IiiiiiiiIIIII]).getType() == type) {
                return this.getGood(this.goodPacks[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public String getRoleSkin() {
        UseCardBean IiiiiiiiIIIII = this.getLimit("\u7ae5\u5361");
        if (IiiiiiiiIIIII == null) {
            IiiiiiiiIIIII = this.getLimit("\u53d8\u8eab\u5361");
        }
        if (IiiiiiiiIIIII == null) return null;
        return IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getValue(), (String)"\u76ae\u80a4=", (String)"|");
    }

    /*
     * Unable to fully structure code
     */
    public void IiiIiiiiiiIiI() {
        IiiiiiiiIIIII = (BigDecimal[])this.goodPacks.clone();
        IiiiiiiiIIIII = new ArrayList<Goodstable>();
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < IiiiiiiiIIIII.length) {
            block6: {
                v0 = IiiiiiiiIIIII = IiiiiiiiIIIII[IiiiiiiiIIIII] != null ? this.getGood(IiiiiiiiIIIII[IiiiiiiiIIIII]) : null;
                if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.getGoodlock() != 1 && IiiiiiiiIIIII.getType() != 2010L && IiiiiiiiIIIII.getType() != 2011L && IiiiiiiiIIIII.getType() != 2012L) {
                    IiiiiiiiIIIII[IiiiiiiiIIIII] = null;
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII.size()) {
                        IiiiiiiiIIIII = (Goodstable)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII.getType() <= IiiiiiiiIIIII.getType() && (IiiiiiiiIIIII.getType().longValue() != IiiiiiiiIIIII.getType().longValue() || IiiiiiiiIIIII.getGoodsid().longValue() <= IiiiiiiiIIIII.getGoodsid().longValue())) {
                            IiiiiiiiIIIII.add(IiiiiiiiIIIII, IiiiiiiiIIIII);
                            break block6;
                        }
                        ++IiiiiiiiIIIII;
                    }
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII);
                }
            }
            ++IiiiiiiiIIIII;
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        ** GOTO lbl32
        {
            block7: {
                if (IiiiiiiiIIIII[IiiiiiiiIIIII] != null) break block7;
                IiiiiiiiIIIII[IiiiiiiiIIIII] = ((Goodstable)IiiiiiiiIIIII.get(IiiiiiiiIIIII)).getRgid();
                ** GOTO lbl31
            }
            ++IiiiiiiiIIIII;
            do {
                if (IiiiiiiiIIIII < IiiiiiiiIIIII.length) continue block2;
lbl31:
                // 2 sources

                ++IiiiiiiiIIIII;
lbl32:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.size());
        }
        this.goodPacks = IiiiiiiiIIIII;
    }

    public long getRoleId() {
        return this.roleId;
    }

    public FriendBean ALLATORIxDEMO(Friendtable friendtable) {
        FriendBean IiiiiiiiIIIII;
        if (this.friendMap == null) {
            this.friendMap = new HashMap<Long, FriendBean>();
        }
        if ((IiiiiiiiIIIII = this.getFriend(friendtable.getRole_id().longValue())) == null) {
            IiiiiiiiIIIII = new FriendBean();
            this.friendMap.put(friendtable.getRole_id().longValue(), IiiiiiiiIIIII);
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(friendtable);
        return IiiiiiiiIIIII;
    }

    public void iIiIiiiiIIiIi() {
        if (this.taskSystem == null) {
            this.taskSystem = new RoleTaskData(this);
        }
        this.taskSystem.iIiIiiiiIIiIi();
    }

    public LoginResult getLoginResult() {
        return this.loginResult;
    }

    public RoleTaskData getTaskSystem() {
        return this.taskSystem;
    }

    public Goodstable getWingGood(int index) {
        if (index >= this.wingGoodsList.size()) return null;
        return this.getGood(this.wingGoodsList.get(index));
    }

    public boolean ALLATORIxDEMO(String string) {
        return this.ALLATORIxDEMO(string, this.fabaoList, this.lingbaoMap);
    }

    public void ALLATORIxDEMO(Long id, int index) {
        if (id == null) {
            return;
        }
        if (index >= this.shortCutSkills.length) {
            return;
        }
        long IiiiiiiiIIIII = index >= 0 ? this.shortCutSkills[index] : 0L;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.shortCutSkills.length) {
            if (this.shortCutSkills[IiiiiiiiIIIII2] == id) {
                this.shortCutSkills[IiiiiiiiIIIII2] = IiiiiiiiIIIII;
                if (index < 0) return;
                this.shortCutSkills[index] = id;
                return;
            }
            ++IiiiiiiiIIIII2;
        }
        if (index < 0) return;
        this.shortCutSkills[index] = id;
    }

    public List<RolePet> ALLATORIxDEMO() {
        int[] IiiiiiiiIIIII = new int[]{1806, 1820, 1821, 1822, 1823, 1824, 1825, 1826, 1827};
        block0: for (RolePet IiiiiiiiIIIII2 : this.pets) {
            String IiiiiiiiIIIII3 = IiiiiiiiIIIII2.getPet().getPetSkills();
            if (IiiiiiiiIIIII3 == null || IiiiiiiiIIIII3.equals("")) {
                IiiiiiiiIIIII2.setHelp(0);
                continue;
            }
            String[] IiiiiiiiIIIII4 = IiiiiiiiIIIII3.split("\\|");
            int IiiiiiiiIIIII5 = 0;
            while (IiiiiiiiIIIII5 < IiiiiiiiIIIII4.length) {
                if (!(IiiiiiiiIIIII4[IiiiiiiiIIIII5].startsWith("L") || IiiiiiiiIIIII4[IiiiiiiiIIIII5].startsWith("Q") || IiiiiiiiIIIII4[IiiiiiiiIIIII5].startsWith("T") || IiiiiiiiIIIII4[IiiiiiiiIIIII5].startsWith("X"))) {
                    int IiiiiiiiIIIII6 = IiiiiiiiIIIII4[IiiiiiiiIIIII5].indexOf("=");
                    int IiiiiiiiIIIII7 = Integer.parseInt(IiiiiiiiIIIII6 == -1 ? IiiiiiiiIIIII4[IiiiiiiiIIIII5] : IiiiiiiiIIIII4[IiiiiiiiIIIII5].substring(0, IiiiiiiiIIIII6));
                    int IiiiiiiiIIIII8 = 0;
                    while (IiiiiiiiIIIII8 < IiiiiiiiIIIII.length) {
                        if (IiiiiiiiIIIII[IiiiiiiiIIIII8] == IiiiiiiiIIIII7) {
                            if (IiiiiiiiIIIII2.getHelp() != 0) continue block0;
                            IiiiiiiiIIIII2.setHelp(99);
                            continue block0;
                        }
                        ++IiiiiiiiIIIII8;
                    }
                }
                ++IiiiiiiiIIIII5;
            }
            IiiiiiiiIIIII2.setHelp(0);
        }
        return this.getHelpBb();
    }

    /*
     * WARNING - void declaration
     */
    public List<BigDecimal> ALLATORIxDEMO(List<iiIIiiiiIiiII> points) {
        ArrayList<BigDecimal> IiiiiiiiIIIII = new ArrayList<BigDecimal>();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < points.size()) {
            void IiiiiiiiIIIII3;
            iiIIiiiiIiiII iiIIiiiiIiiII2 = points.get(IiiiiiiiIIIII2);
            Goodstable IiiiiiiiIIIII4 = this.getGood(new BigDecimal(IiiiiiiiIIIII3.ALLATORIxDEMO));
            if (IiiiiiiiIIIII4 != null) {
                int IiiiiiiiIIIII5 = 0;
                while ((long)IiiiiiiiIIIII5 < IiiiiiiiIIIII3.IiiiiiiiIIIII) {
                    ++IiiiiiiiIIIII5;
                    IiiiiiiiIIIII.add(IiiiiiiiIIIII4.getRgid());
                }
                IiiiiiiiIIIII4.ALLATORIxDEMO((int)IiiiiiiiIIIII3.IiiiiiiiIIIII);
                if (IiiiiiiiIIIII4.getUsetime() <= 0) {
                    this.iIiIiiiiIIiii(IiiiiiiiIIIII4.getRgid());
                }
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    /*
     * Unable to fully structure code
     */
    public void iiiIiiiiiiIIi() {
        block14: {
            block13: {
                block12: {
                    if (this.goodMap != null) {
                        this.goodMap.clear();
                    } else {
                        this.goodMap = new HashMap<BigDecimal, Goodstable>();
                    }
                    if (this.wingGoodsList != null) {
                        this.wingGoodsList.clear();
                    } else {
                        this.wingGoodsList = new ArrayList<BigDecimal>();
                    }
                    if (this.starCardList != null) {
                        this.starCardList.clear();
                    } else {
                        this.starCardList = new ArrayList<BigDecimal>();
                    }
                    if (this.flyList != null) {
                        this.flyList.clear();
                    } else {
                        this.flyList = new ArrayList<BigDecimal>();
                    }
                    if (this.ddGoodsList != null) {
                        this.ddGoodsList.clear();
                    } else {
                        this.ddGoodsList = new ArrayList<BigDecimal>();
                    }
                    if (this.goodChoses == null) break block12;
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl29
                }
                this.goodChoses = new BigDecimal[15];
                break block13;
                do {
                    this.goodChoses[IiiiiiiiIIIII++] = null;
lbl29:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.goodChoses.length);
            }
            if (this.goodPacks == null || this.goodPacks.length != RoleData.getPackNumTwo(this.loginResult.getTurnAround())) break block14;
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl39
        }
        this.goodPacks = new BigDecimal[RoleData.getPackNumTwo(this.loginResult.getTurnAround())];
        return;
        do {
            this.goodPacks[IiiiiiiiIIIII++] = null;
lbl39:
            // 2 sources

        } while (IiiiiiiiIIIII < this.goodPacks.length);
    }

    public Goodstable getPawnGood(int index) {
        if (index >= this.ddGoodsList.size()) return null;
        return this.getGood(this.ddGoodsList.get(index));
    }

    public RoleSystem getRoleSystem() {
        return this.roleSystem;
    }

    public void ALLATORIxDEMO(String name, String type, String skin, String value, long time) {
        IIIIiiiiIIIIi IiiiiiiiIIIII;
        if (time == -1L) {
            this.iIiIiiiiIIiii(type);
            return;
        }
        UseCardBean IiiiiiiiIIIII2 = this.getLimit(type);
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2.setName(name);
            IiiiiiiiIIIII2.setTime(time);
            IiiiiiiiIIIII2.setValue(value);
            if (!IiiiiiiiIIIII2.getSkin().equals(skin)) {
                IiiiiiiiIIIII2.setSkin(skin);
            }
        } else {
            IiiiiiiiIIIII2 = new UseCardBean(name, type, skin, time, value);
            this.limitMap.put(type, IiiiiiiiIIIII2);
        }
        if ((type.equals("\u6708\u5361") || type.equals("\u5b63\u5361")) && (IiiiiiiiIIIII = (IIIIiiiiIIIIi)this.gameView.getFormManagement().iIiIiiiiIIiii(39)) != null) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(2);
        }
        boolean IiiiiiiiIIIII22 = false;
        boolean IiiiiiiiIIIII3 = false;
        boolean IiiiiiiiIIIII4 = false;
        boolean IiiiiiiiIIIII5 = false;
        IiiiiiiiIIIII3 |= IiiiiiiiIIIII2.getType().equals("\u53d8\u8eab\u5361") || IiiiiiiiIIIII2.getType().equals("\u7ae5\u5361") || IiiiiiiiIIIII2.getType().equals("\u5149\u6b66");
        IiiiiiiiIIIII4 |= IiiiiiiiIIIII2.getType().equals("\u9650\u65f6\u793c\u5305");
        IiiiiiiiIIIII5 |= IiiiiiiiIIIII2.getType().equals("\u9753\u53f7");
        if (IiiiiiiiIIIII22 |= IiiiiiiiIIIII2.getType().equals("\u53d8\u8eab\u5361") || IiiiiiiiIIIII2.getType().equals("\u5f3a\u6cd5\u578b") || IiiiiiiiIIIII2.getType().equals("\u52a0\u6297\u578b") || IiiiiiiiIIIII2.getType().equals("\u589e\u76ca\u578b") || IiiiiiiiIIIII2.getType().equals("VIP") || IiiiiiiiIIIII2.getType().equals("\u5e2e\u6d3e") || IiiiiiiiIIIII2.getType().equals("\u5355\u4eba\u7ade\u6280\u573a") || IiiiiiiiIIIII2.getType().equals("\u56de\u84dd\u7b26")) {
            this.getRoleProperty().ALLATORIxDEMO();
        }
        if (IiiiiiiiIIIII3) {
            this.ALLATORIxDEMO(false);
        }
        if (IiiiiiiiIIIII5) {
            this.getRoleProperty().IIiIIiiiIiIIi();
        }
        this.gameView.baseView.iIiiIiiiiIiiI |= IiiiiiiiIIIII4;
        this.gameView.baseView.IIiiiiiiIiiII = true;
    }

    public Pal getChosePal() {
        return this.getPal(this.chosePalId);
    }

    public GameView getGameView() {
        return this.gameView;
    }

    public boolean ALLATORIxDEMO(String bn, List<BigDecimal> fabaoList, Map<BigDecimal, Lingbao> lingbaoMap) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < fabaoList.size()) {
            if (lingbaoMap.get(fabaoList.get(IiiiiiiiIIIII)).getBaoname().equals(bn)) {
                return true;
            }
            ++IiiiiiiiIIIII;
        }
        return false;
    }

    public Lingbao getChoseBao() {
        return this.getLingbao(this.choseBaoId);
    }

    public void ALLATORIxDEMO(PackRecord packRecord, RoleSystem roleSystem, PrivateData privateData, LoginResult loginResult) {
        if (loginResult != null) {
            this.loginResult = loginResult;
        }
        if (roleSystem != null) {
            this.roleSystem = roleSystem;
        }
        if (packRecord != null) {
            this.packRecord = packRecord;
        }
        if (privateData == null) return;
        this.privateData = privateData;
    }

    /*
     * WARNING - void declaration
     */
    public RolePet ALLATORIxDEMO(RoleSummoning pet) {
        void IiiiiiiiIIIII;
        RolePet rolePet = new RolePet(pet.getSid());
        rolePet.setPet(pet);
        this.pets.add((RolePet)IiiiiiiiIIIII);
        return IiiiiiiiIIIII;
    }

    public boolean ALLATORIxDEMO(BigDecimal id) {
        if (this.chosePetId == null) return false;
        if (id == null) {
            return false;
        }
        if (this.chosePetId.compareTo(id) != 0) return false;
        return true;
    }

    public void ALLATORIxDEMO(List<Lingbao> lingbaos) {
        Object IiiiiiiiIIIII;
        boolean IiiiiiiiIIIII3 = false;
        BigDecimal[] IiiiiiiiIIIII4 = new BigDecimal[3];
        ArrayList<BigDecimal> IiiiiiiiIIIII5 = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> IiiiiiiiIIIII6 = new ArrayList<BigDecimal>();
        HashMap<BigDecimal, Lingbao> IiiiiiiiIIIII7 = new HashMap<BigDecimal, Lingbao>();
        for (Lingbao lingbao : lingbaos) {
            if (!lingbao.getBaotype().equals("\u6cd5\u5b9d")) {
                IiiiiiiiIIIII5.add(lingbao.getBaoid());
                if (lingbao.getEquipment() == 1) {
                    IiiiiiiiIIIII4[0] = lingbao.getBaoid();
                }
            } else {
                if (this.ALLATORIxDEMO(lingbao.getBaoname(), IiiiiiiiIIIII6, IiiiiiiiIIIII7)) {
                    lingbao.setOperation("\u5220\u9664");
                    IiiiiiiiIIIII = Agreement.getSendTextAES((String)"updateling", (String)iiIiiiiiIIiii.ALLATORIxDEMO().toJson(lingbao));
                    this.gameView.getClient().ALLATORIxDEMO((String)IiiiiiiiIIIII);
                    continue;
                }
                IiiiiiiiIIIII6.add(lingbao.getBaoid());
                if (lingbao.getEquipment() == 1) {
                    IiiiiiiiIIIII4[IiiiiiiiIIIII4[1] == null ? 1 : 2] = lingbao.getBaoid();
                }
            }
            IiiiiiiiIIIII7.put(lingbao.getBaoid(), lingbao);
        }
        String string = this.packRecord.getHelpLing();
        if (string == null || string.equals("") || string.equals("null")) {
            IiiiiiiiIIIII3 = true;
        } else {
            int IiiiiiiiIIIII8 = 0;
            IiiiiiiiIIIII = string.split("\\|");
            IiiiiiiiIIIII3 = ((String[])IiiiiiiiIIIII).length <= 0 || !IiiiiiiiIIIII[0].equals("SHUT");
            int IiiiiiiiIIIII9 = ((String[])IiiiiiiiIIIII).length > 0 && IiiiiiiiIIIII[0].equals("SHUT") ? 1 : 0;
            while (IiiiiiiiIIIII9 < ((String[])IiiiiiiiIIIII).length) {
                BigDecimal IiiiiiiiIIIII10 = new BigDecimal(IiiiiiiiIIIII[IiiiiiiiIIIII9]);
                int IiiiiiiiIIIII11 = IiiiiiiiIIIII8;
                while (IiiiiiiiIIIII11 < IiiiiiiiIIIII5.size()) {
                    if (((BigDecimal)IiiiiiiiIIIII5.get(IiiiiiiiIIIII11)).compareTo(IiiiiiiiIIIII10) != 0) {
                        ++IiiiiiiiIIIII11;
                        continue;
                    }
                    if (IiiiiiiiIIIII8 != IiiiiiiiIIIII11) {
                        BigDecimal IiiiiiiiIIIII12 = (BigDecimal)IiiiiiiiIIIII5.get(IiiiiiiiIIIII8);
                        IiiiiiiiIIIII5.set(IiiiiiiiIIIII8, IiiiiiiiIIIII10);
                        IiiiiiiiIIIII5.set(IiiiiiiiIIIII11, IiiiiiiiIIIII12);
                    }
                    ++IiiiiiiiIIIII8;
                    break;
                }
                ++IiiiiiiiIIIII9;
            }
        }
        this.helpLing = IiiiiiiiIIIII3;
        this.lingbaoMap = IiiiiiiiIIIII7;
        this.fabaoList = IiiiiiiiIIIII6;
        this.lingbaoList = IiiiiiiiIIIII5;
        this.lingbaoChoses = IiiiiiiiIIIII4;
    }

    public void setHelpBB(BigDecimal[] ids) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.pets.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            block3: {
                RolePet IiiiiiiiIIIII3 = this.pets.get(IiiiiiiiIIIII);
                int IiiiiiiiIIIII4 = 0;
                while (IiiiiiiiIIIII4 < ids.length) {
                    if (ids[IiiiiiiiIIIII4].compareTo(IiiiiiiiIIIII3.getId()) == 0) {
                        IiiiiiiiIIIII3.setHelp(IiiiiiiiIIIII4 + 1);
                        break block3;
                    }
                    ++IiiiiiiiIIIII4;
                }
                IiiiiiiiIIIII3.setHelp(0);
            }
            ++IiiiiiiiIIIII;
        }
        this.iIiIiiiiIIiii();
    }

    public PackRecord getPackRecord() {
        return this.packRecord;
    }

    public List<iiIIiiiiIiiII> ALLATORIxDEMO(iiIIiiiiIiiII ... list) {
        ArrayList<iiIIiiiiIiiII> IiiiiiiiIIIII = null;
        int IiiiiiiiIIIII2 = list.length;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < this.goodPacks.length) {
            Goodstable IiiiiiiiIIIII4;
            if (IiiiiiiiIIIII2 > 0 && this.goodPacks[IiiiiiiiIIIII3] != null && (IiiiiiiiIIIII4 = this.getGood(this.goodPacks[IiiiiiiiIIIII3])) != null) {
                int IiiiiiiiIIIII5 = 0;
                while (IiiiiiiiIIIII5 < list.length) {
                    iiIIiiiiIiiII IiiiiiiiIIIII6 = list[IiiiiiiiIIIII5];
                    if (IiiiiiiiIIIII6 != null && IiiiiiiiIIIII6.ALLATORIxDEMO == (long)IiiiiiiiIIIII4.getGoodsid().intValue()) {
                        if ((long)IiiiiiiiIIIII4.getUsetime().intValue() >= IiiiiiiiIIIII6.IiiiiiiiIIIII) {
                            --IiiiiiiiIIIII2;
                            list[IiiiiiiiIIIII5] = null;
                            IiiiiiiiIIIII6.ALLATORIxDEMO = IiiiiiiiIIIII4.getRgid().longValue();
                        } else {
                            IiiiiiiiIIIII6.IiiiiiiiIIIII -= (long)IiiiiiiiIIIII4.getUsetime().intValue();
                            IiiiiiiiIIIII6 = new iiIIiiiiIiiII(IiiiiiiiIIIII4.getRgid().longValue(), (long)IiiiiiiiIIIII4.getUsetime().intValue());
                        }
                        if (IiiiiiiiIIIII == null) {
                            IiiiiiiiIIIII = new ArrayList<iiIIiiiiIiiII>();
                        }
                        IiiiiiiiIIIII.add(IiiiiiiiIIIII6);
                    }
                    ++IiiiiiiiIIIII5;
                }
            }
            ++IiiiiiiiIIIII3;
        }
        if (IiiiiiiiIIIII2 != 0) return null;
        return IiiiiiiiIIIII;
    }

    public Goodstable ALLATORIxDEMO(BigDecimal sid) {
        if (sid == null) {
            return null;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII] != null && this.getGood(this.goodPacks[IiiiiiiiIIIII]).getGoodsid().compareTo(sid) == 0) {
                return this.getGood(this.goodPacks[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public Pal getPal(BigDecimal palId) {
        if (palId == null) {
            return null;
        }
        for (Pal IiiiiiiiIIIII : this.pals) {
            if (IiiiiiiiIIIII.getId().compareTo(palId) != 0) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public RoleSummoning getPet(BigDecimal petId) {
        if (petId == null) {
            return null;
        }
        for (RolePet IiiiiiiiIIIII : this.pets) {
            if (IiiiiiiiIIIII.getId().compareTo(petId) != 0) continue;
            return IiiiiiiiIIIII.getPet();
        }
        return null;
    }

    public RolePet getRolePet(long petId) {
        if (petId == 0L) {
            return null;
        }
        for (RolePet IiiiiiiiIIIII : this.pets) {
            if (IiiiiiiiIIIII.getId().longValue() != petId) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public Goodstable getParcelGood(int index) {
        if (this.parcelList == null) return null;
        if (index >= this.parcelList.size()) return null;
        return this.parcelList.get(index);
    }

    public void iIiIiiiiIIiii() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        if (!this.helpPet) {
            IiiiiiiiIIIII.append("SHUT");
        }
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.pets.size()) {
            RolePet rolePet = this.pets.get(IiiiiiiiIIIII2);
            ++IiiiiiiiIIIII2;
            rolePet.ALLATORIxDEMO(IiiiiiiiIIIII);
        }
        String IiiiiiiiIIIII22 = IiiiiiiiIIIII.toString();
        if (IiiiiiiiIIIII22.equals(this.packRecord.getHelpBb())) {
            return;
        }
        this.packRecord.setHelpBb(IiiiiiiiIIIII22);
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"1", (String)(String.valueOf(1) + this.packRecord.getHelpBb()));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public RoleSummoning getChosePet() {
        return this.getPet(this.chosePetId);
    }

    public List<RolePet> getHelpBb() {
        ArrayList<RolePet> IiiiiiiiIIIII = new ArrayList<RolePet>();
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        RolePet IiiiiiiiIIIII4 = null;
        boolean IiiiiiiiIIIII5 = true;
        while (IiiiiiiiIIIII5) {
            IiiiiiiiIIIII5 = false;
            IiiiiiiiIIIII4 = null;
            int IiiiiiiiIIIII6 = 0;
            int IiiiiiiiIIIII7 = this.pets.size();
            while (IiiiiiiiIIIII6 < IiiiiiiiIIIII7) {
                RolePet IiiiiiiiIIIII8 = this.pets.get(IiiiiiiiIIIII6);
                if (!(IiiiiiiiIIIII8.getHelp() == 0 || IiiiiiiiIIIII8.getHelp() < IiiiiiiiIIIII3 || IiiiiiiiIIIII.contains(IiiiiiiiIIIII8) || IiiiiiiiIIIII4 != null && IiiiiiiiIIIII4.getHelp() <= IiiiiiiiIIIII8.getHelp())) {
                    IiiiiiiiIIIII4 = IiiiiiiiIIIII8;
                }
                ++IiiiiiiiIIIII6;
            }
            if (IiiiiiiiIIIII4 == null) continue;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII4.getHelp();
            IiiiiiiiIIIII5 = true;
            IiiiiiiiIIIII4.setHelp(++IiiiiiiiIIIII2);
            IiiiiiiiIIIII.add(IiiiiiiiIIIII4);
        }
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO() {
        if (this.roleProperty == null) {
            this.roleProperty = new RoleProperty(this);
        }
        this.roleProperty.IIiiIiiiiIiII();
    }

    public void setEquipGoodsList(BigDecimal[] ids) {
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 12) {
            int n = IiiiiiiiIIIII;
            BigDecimal bigDecimal = ids[IiiiiiiiIIIII];
            ++IiiiiiiiIIIII;
            this.goodChoses[n] = bigDecimal;
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < 12) {
            if (this.goodChoses[IiiiiiiiIIIII] != null) {
                CharSequence IiiiiiiiIIIII2;
                if (this.getEquipGood(IiiiiiiiIIIII) == null) {
                    StringBuffer IiiiiiiiIIIII3 = new StringBuffer();
                    IiiiiiiiIIIII3.append("E");
                    IiiiiiiiIIIII3.append(IiiiiiiiIIIII);
                    IiiiiiiiIIIII3.append("=A");
                    IiiiiiiiIIIII3.append(this.goodChoses[IiiiiiiiIIIII]);
                    IiiiiiiiIIIII2 = Agreement.getSendTextAES((String)"rolechange", (String)IiiiiiiiIIIII3.toString());
                    this.getGameView().getClient().ALLATORIxDEMO((String)IiiiiiiiIIIII2);
                    this.goodChoses[IiiiiiiiIIIII] = null;
                } else {
                    int IiiiiiiiIIIII4 = IiiiiiiiIIIII + 1;
                    while (IiiiiiiiIIIII4 < 12) {
                        if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.goodChoses[IiiiiiiiIIIII], (BigDecimal)this.goodChoses[IiiiiiiiIIIII4])) {
                            IiiiiiiiIIIII2 = new StringBuffer();
                            ((StringBuffer)IiiiiiiiIIIII2).append("E");
                            ((StringBuffer)IiiiiiiiIIIII2).append(IiiiiiiiIIIII);
                            ((StringBuffer)IiiiiiiiIIIII2).append("=A");
                            ((StringBuffer)IiiiiiiiIIIII2).append(this.goodChoses[IiiiiiiiIIIII4]);
                            String IiiiiiiiIIIII5 = Agreement.getSendTextAES((String)"rolechange", (String)((StringBuffer)IiiiiiiiIIIII2).toString());
                            this.getGameView().getClient().ALLATORIxDEMO(IiiiiiiiIIIII5);
                            this.goodChoses[IiiiiiiiIIIII4] = null;
                        }
                        ++IiiiiiiiIIIII4;
                    }
                }
            }
            ++IiiiiiiiIIIII;
        }
    }

    public String getPackRecordString() {
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII2] != null) {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII2);
                IiiiiiiiIIIII.append("-");
                IiiiiiiiIIIII.append(this.goodPacks[IiiiiiiiIIIII2]);
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII.toString();
    }

    public FriendBean getFriendChat() {
        if (this.friendMap == null) {
            return null;
        }
        for (FriendBean IiiiiiiiIIIII : this.friendMap.values()) {
            if (!IiiiiiiiIIIII.iIiIiiiiIIiii()) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public int getGoodNum(BigDecimal sid) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.goodPacks.length) {
            if (this.goodPacks[IiiiiiiiIIIII2] != null && this.getGood(this.goodPacks[IiiiiiiiIIIII2]).getGoodsid().compareTo(sid) == 0) {
                IiiiiiiiIIIII += this.getGood(this.goodPacks[IiiiiiiiIIIII2]).getUsetime().intValue();
            }
            ++IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    public Mount getChoseMount() {
        return this.getMount(this.choseMountId);
    }

    public void ALLATORIxDEMO(String id) {
        this.packRecord.ALLATORIxDEMO(id);
        iIiIiiiiIiIII IiiiiiiiIIIII = (iIiIiiiiIiIII)this.gameView.getFormManagement().iIiIiiiiIIiii(38);
        if (IiiiiiiiIIIII == null) return;
        IiiiiiiiIIIII.IiiIiiiiiiIiI();
    }

    public void ALLATORIxDEMO(BigDecimal id, int num) {
        if (this.parcelList == null) {
            return;
        }
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.parcelList.size()) {
            Goodstable IiiiiiiiIIIII2 = this.parcelList.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.getRgid().compareTo(id) != 0) {
                ++IiiiiiiiIIIII;
                continue;
            }
            if (num > 0) {
                IiiiiiiiIIIII2.setRgid(id);
                IiiiiiiiIIIII2.setUsetime(Integer.valueOf(num));
                return;
            }
            this.parcelList.remove(IiiiiiiiIIIII);
            return;
        }
    }
}
