/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.timeout.IdleState
 *  io.netty.handler.timeout.IdleStateEvent
 */
package com.xy.socket;

import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

public class GameClientHandler
extends SimpleChannelInboundHandler<String> {
    private GameClient client;

    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
        super.exceptionCaught(ctx, cause);
    }

    public GameClientHandler(GameClient client) {
        this.client = client;
    }

    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent && ((IdleStateEvent)evt).state() == IdleState.WRITER_IDLE) {
            this.client.ALLATORIxDEMO("bibi\n");
        }
        super.userEventTriggered(ctx, evt);
    }

    protected void ALLATORIxDEMO(ChannelHandlerContext ctx, String msg) {
        try {
            if (msg == null) {
                return;
            }
            ParamTool.iIiIiiiiIIiii((String)msg, (GameClient)this.client);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("\u65ad\u7ebf");
        this.client.iIiIiiiiIIiii();
        super.channelInactive(ctx);
    }
}
