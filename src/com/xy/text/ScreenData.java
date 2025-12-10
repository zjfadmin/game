/*
 * Decompiled with CFR 0.152.
 */
package com.xy.text;

public class ScreenData {
    public static final int Screen_y_3 = 768;
    public static final int Screen_y_D_Int = 700;
    public static final int Screen_x_D_Int = 1024;
    public int Screen_y;
    public static final int Screen_x_1 = 1024;
    public static final int Screen_y_0 = 600;
    public static final int Screen_x_2 = 1280;
    public static final double Screen_x_D = 1024.0;
    public static final int Screen_y_2 = 960;
    public int Screen_x;
    public int ChatFram_y;
    public static final int Screen_y_1 = 768;
    public static final int Screen_x_0 = 800;
    public static final double Screen_y_D = 700.0;
    public static final int Screen_x_3 = 1366;
    public boolean isChat = true;
    public int ChatFram_X;
    public int TeamImg_x;

    public int getScreen_y() {
        return this.Screen_y;
    }

    public int getTeamImg_x() {
        return this.TeamImg_x;
    }

    public int getCentreY(int h) {
        return (this.Screen_y - h) / 2;
    }

    public int getScreen_x() {
        return this.Screen_x;
    }

    public int getCentreX(int w) {
        return (this.Screen_x - w) / 2;
    }

    public ScreenData(int showView) {
        this.ALLATORIxDEMO(showView);
    }

    public void ALLATORIxDEMO(int showView) {
        switch (showView) {
            case 0: {
                this.Screen_x = 800;
                this.Screen_y = 600;
                this.ChatFram_X = 300;
                this.ChatFram_y = 600;
                this.TeamImg_x = 270;
                return;
            }
            case 1: {
                this.Screen_x = 1024;
                this.Screen_y = 768;
                this.ChatFram_X = 300;
                this.ChatFram_y = 768;
                this.TeamImg_x = 494;
                return;
            }
            case 2: {
                this.Screen_x = 1280;
                this.Screen_y = 960;
                this.ChatFram_X = 300;
                this.ChatFram_y = 960;
                this.TeamImg_x = 750;
                return;
            }
            case 3: {
                this.Screen_x = 1366;
                this.Screen_y = 768;
                this.ChatFram_X = 300;
                this.ChatFram_y = 768;
                this.TeamImg_x = 836;
                break;
            }
        }
    }

    public int getChatFram_y() {
        return this.ChatFram_y;
    }

    public int getChatFram_X() {
        return this.ChatFram_X;
    }
}
