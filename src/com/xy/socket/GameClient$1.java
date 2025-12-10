/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClientHandler
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.codec.DelimiterBasedFrameDecoder
 *  io.netty.handler.codec.Delimiters
 *  io.netty.handler.codec.string.StringDecoder
 *  io.netty.handler.codec.string.StringEncoder
 *  io.netty.handler.timeout.IdleStateHandler
 */
package com.xy.socket;

import com.xy.socket.GameClientHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

class GameClient.1
extends ChannelInitializer<SocketChannel> {
    /*
     * WARNING - void declaration
     */
    protected void ALLATORIxDEMO(SocketChannel socketChannel) throws Exception {
        void IiiiiiiiIIIII;
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        channelPipeline.addLast("framer", (ChannelHandler)new DelimiterBasedFrameDecoder(Integer.MAX_VALUE, Delimiters.lineDelimiter()));
        IiiiiiiiIIIII.addLast("decoder", (ChannelHandler)new StringDecoder(Charset.forName("utf-8")));
        IiiiiiiiIIIII.addLast("encoder", (ChannelHandler)new StringEncoder(Charset.forName("utf-8")));
        IiiiiiiiIIIII.addLast(new ChannelHandler[]{new IdleStateHandler(0L, 30L, 0L, TimeUnit.SECONDS)});
        IiiiiiiiIIIII.addLast(new ChannelHandler[]{new GameClientHandler(GameClient.this)});
    }

    GameClient.1() {
    }
}
