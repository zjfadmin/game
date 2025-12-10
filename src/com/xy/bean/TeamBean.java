/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.TeamRole
 */
package com.xy.bean;

import com.xy.entity.TeamRole;
import java.math.BigDecimal;
import java.util.List;

public class TeamBean {
    private String eTask;
    private List<TeamRole> teams;
    private String eTeam;
    private BigDecimal teamId;
    private String eMsg;

    public String geteTeam() {
        return this.eTeam;
    }

    public void seteMsg(String eMsg) {
        this.eMsg = eMsg;
    }

    public String geteTask() {
        return this.eTask;
    }

    public void seteTeam(String eTeam) {
        this.eTeam = eTeam;
    }

    /*
     * Unable to fully structure code
     */
    public boolean ALLATORIxDEMO(TeamRole role, int type) {
        block7: {
            block6: {
                if (type != 0) break block6;
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = this.teams.size();
                if (true) ** GOTO lbl25
            }
            if (type != 1) break block7;
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = this.teams.size();
            if (true) ** GOTO lbl35
        }
        if (type != 2) return false;
        IiiiiiiiIIIII = this.teams.get(0);
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = -1;
        IiiiiiiiIIIII = 1;
        IiiiiiiiIIIII = this.teams.size();
        if (true) ** GOTO lbl43
        do {
            if ((IiiiiiiiIIIII = this.teams.get(IiiiiiiiIIIII)).getRoleId().compareTo(role.getRoleId()) == 0) {
                IiiiiiiiIIIII = IiiiiiiiIIIII.getState();
                IiiiiiiiIIIII.ALLATORIxDEMO(role);
                if (IiiiiiiiIIIII == IiiiiiiiIIIII.getState()) return false;
                return true;
            }
            ++IiiiiiiiIIIII;
lbl25:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        this.teams.add(role);
        return true;
        do {
            if ((IiiiiiiiIIIII = this.teams.get(IiiiiiiiIIIII)).getRoleId().compareTo(role.getRoleId()) == 0) {
                this.teams.remove(IiiiiiiiIIIII);
                return true;
            }
            ++IiiiiiiiIIIII;
lbl35:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        return false;
        do {
            if ((IiiiiiiiIIIII = this.teams.get(IiiiiiiiIIIII)).getRoleId().compareTo(role.getRoleId()) == 0) {
                IiiiiiiiIIIII = IiiiiiiiIIIII;
                IiiiiiiiIIIII = IiiiiiiiIIIII;
                break;
            }
            ++IiiiiiiiIIIII;
lbl43:
            // 2 sources

        } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
        if (IiiiiiiiIIIII == null) return false;
        IiiiiiiiIIIII.ALLATORIxDEMO(role);
        IiiiiiiiIIIII.setState(0);
        this.teams.set(0, IiiiiiiiIIIII);
        this.teams.set(IiiiiiiiIIIII, IiiiiiiiIIIII);
        return true;
    }

    public void setTeamId(BigDecimal teamId) {
        this.teamId = teamId;
    }

    public void setTeams(List<TeamRole> teams) {
        this.teams = teams;
    }

    public List<TeamRole> getTeams() {
        return this.teams;
    }

    public void seteTask(String eTask) {
        this.eTask = eTask;
    }

    public BigDecimal getTeamId() {
        return this.teamId;
    }

    public String geteMsg() {
        return this.eMsg;
    }
}
