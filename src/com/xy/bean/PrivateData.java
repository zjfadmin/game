/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class PrivateData {
    private String Skills;
    private String born;
    private String taskComplete;
    private String TimingGood;
    private String taskData;

    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }

    public void setSkills(String type, String skill) {
        if (this.Skills == null || this.Skills.equals("")) {
            if (skill == null) return;
            if (skill.equals("")) return;
            this.Skills = String.valueOf(type) + skill;
            return;
        }
        StringBuffer IiiiiiiiIIIII = new StringBuffer();
        String[] IiiiiiiiIIIII2 = this.Skills.split("\\|");
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 < IiiiiiiiIIIII2.length) {
            if (!IiiiiiiiIIIII2[IiiiiiiiIIIII3].startsWith(type)) {
                if (IiiiiiiiIIIII.length() != 0) {
                    IiiiiiiiIIIII.append("|");
                }
                IiiiiiiiIIIII.append(IiiiiiiiIIIII2[IiiiiiiiIIIII3]);
            }
            ++IiiiiiiiIIIII3;
        }
        if (skill != null && !skill.equals("")) {
            if (IiiiiiiiIIIII.length() != 0) {
                IiiiiiiiIIIII.append("|");
            }
            IiiiiiiiIIIII.append(type);
            IiiiiiiiIIIII.append(skill);
        }
        this.Skills = IiiiiiiiIIIII.toString();
    }

    public String getTimingGood() {
        return this.TimingGood;
    }

    public String getSkills() {
        if (this.Skills != null) return this.Skills;
        return "";
    }

    public void setSkills(String skills) {
        this.Skills = skills;
    }

    public String[] getSkill(String type) {
        if (this.Skills == null) return null;
        if (this.Skills.equals("")) {
            return null;
        }
        String[] IiiiiiiiIIIII = this.Skills.split("\\|");
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            if (IiiiiiiiIIIII[IiiiiiiiIIIII2].startsWith(type)) {
                return IiiiiiiiIIIII[IiiiiiiiIIIII2].substring(1).split("#");
            }
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    public void setTimingGood(String timingGood) {
        this.TimingGood = timingGood;
    }

    public String getTaskData() {
        return this.taskData;
    }

    public void setTaskComplete(String taskComplete) {
        this.taskComplete = taskComplete;
    }

    public String getBorn() {
        return this.born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getTaskComplete() {
        return this.taskComplete;
    }
}
