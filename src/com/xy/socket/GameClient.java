/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.Agreement
 *  com.xy.text.GameMain
 *  com.xy.text.GameView
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.buffer.PooledByteBufAllocator
 *  io.netty.channel.AdaptiveRecvByteBufAllocator
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 */
package com.xy.socket;

import com.xy.socket.Agreement;
import com.xy.text.GameMain;
import com.xy.text.GameView;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.AdaptiveRecvByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GameClient {
    private String sendMsg;
    public boolean gameMsg = false;
    public int gameType = 2;
    private String userName;
    private int portWeb;
    private long handleId;
    public String VALUE = "ABCDGHIJ";
    public boolean gameKey = false;
    public boolean drawCloud = false;
    public int gameTypeIndex = 1;
    public boolean gamePawn = false;
    public boolean gameSZZ = false;
    private Channel channel;
    public int gameTypeIndex2 = 1;
    public boolean gamePetSkill = false;
    public GameView gameView;
    private String areaName;
    private NioEventLoopGroup workGroup;
    public boolean gameBaby = false;
    private Bootstrap bootstrap;
    public boolean gameBeau = false;
    private long roleId;
    private boolean isDoConnect = true;
    private int areaId;
    public long assetIndex = -111L;
    private String userPwd;
    public String bq = "18234567#abcdegf";
    public boolean gameText = false;
    public boolean gameBattle = false;
    private int portTcp;
    private String ip;
    public boolean gameMount = false;
    public boolean gameBBXY = false;
    public boolean gameNewTyc = false;
    public String gn = "dbc";
    int socketNum = 0;

    public void iiiIiiiiiiIIi() {
        try {
            this.workGroup = new NioEventLoopGroup();
            this.bootstrap = new Bootstrap();
            ((Bootstrap)((Bootstrap)((Bootstrap)this.bootstrap.group((EventLoopGroup)this.workGroup)).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)new /* Unavailable Anonymous Inner Class!! */);
            this.bootstrap.option(ChannelOption.RCVBUF_ALLOCATOR, (Object)AdaptiveRecvByteBufAllocator.DEFAULT);
            this.bootstrap.option(ChannelOption.ALLOCATOR, (Object)PooledByteBufAllocator.DEFAULT);
            this.iIiIiiiiIIiii();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            throw new RuntimeException(IiiiiiiiIIIII);
        }
    }

    public long getHandleId() {
        return this.handleId;
    }

    public void setDoConnect(boolean isDoConnect) {
        this.isDoConnect = isDoConnect;
    }

    static /* synthetic */ void ALLATORIxDEMO(GameClient arg0, Channel arg1) {
        arg0.channel = arg1;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public int getPortTcp() {
        return this.portTcp;
    }

    public String getSendMsg() {
        return this.sendMsg;
    }

    static /* synthetic */ Channel ALLATORIxDEMO(GameClient arg0) {
        return arg0.channel;
    }

    public boolean iiiiiiiiIIiii() {
        if (this.gameType != 2) return false;
        if (this.gameTypeIndex != 12) return false;
        if (this.gameTypeIndex2 != 2) return false;
        return true;
    }

    protected void iIiIiiiiIIiii() throws Exception {
        if (!this.isDoConnect) {
            return;
        }
        if (this.channel != null && this.channel.isActive()) {
            return;
        }
        this.channel = null;
        ChannelFuture channelFuture = this.bootstrap.connect(this.ip, this.portTcp);
        channelFuture.addListener((GenericFutureListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public boolean IiiIiiiiiiIiI() {
        if (this.gameType != 2) return false;
        if (this.gameTypeIndex != 12) return false;
        if (this.gameTypeIndex2 != 3) return false;
        return true;
    }

    static /* synthetic */ String ALLATORIxDEMO(GameClient arg0) {
        return arg0.sendMsg;
    }

    public long getRoleId() {
        return this.roleId;
    }

    public GameClient(long handleId, int areaId, String areaName, String ip, int portTcp, int portWeb, long roleId, String userName, String userPwd) {
        this.handleId = handleId;
        this.areaId = areaId;
        this.areaName = areaName;
        this.ip = ip;
        this.portTcp = portTcp;
        this.portWeb = portWeb;
        this.roleId = roleId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.sendMsg = Agreement.getSendTextAES((String)"enterGame", (String)(String.valueOf(roleId) + "|" + userName + "|" + userPwd + "|" + GameMain.mac));
    }

    public String getIp() {
        return this.ip;
    }

    public void ALLATORIxDEMO() {
        try {
            if (!this.iiiIiiiiiiIIi()) {
                return;
            }
            this.setDoConnect(false);
            this.getChannel().close();
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public boolean iIiIiiiiIIiIi() {
        if (this.gameType != 2) return false;
        if (this.gameTypeIndex != 12) return false;
        if (this.gameTypeIndex2 != 6) return false;
        return true;
    }

    public int getAreaId() {
        return this.areaId;
    }

    public boolean iiiIiiiiiiIIi() {
        if (!this.iIiIiiiiIIiii()) return false;
        if (this.getChannel() == null) return false;
        if (!this.getChannel().isActive()) return false;
        return true;
    }

    public int getPortWeb() {
        return this.portWeb;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void ALLATORIxDEMO(String sendMsg) {
        if (!this.iiiIiiiiiiIIi()) {
            return;
        }
        this.getChannel().writeAndFlush((Object)sendMsg);
    }

    public boolean ALLATORIxDEMO(int type, int typeIndex) {
        if (this.gameType != type) return false;
        if (this.gameTypeIndex != typeIndex) return false;
        return true;
    }

    public boolean iIiIiiiiIIiii() {
        return this.isDoConnect;
    }

    public boolean ALLATORIxDEMO() {
        if (this.gameType != 2) return false;
        if (this.gameTypeIndex != 12) return false;
        if (this.gameTypeIndex2 != 5) return false;
        return true;
    }
}
