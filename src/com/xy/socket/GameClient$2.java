/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.socket.GameClient
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 */
package com.xy.socket;

import com.xy.socket.GameClient;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.TimeUnit;

/*
 * Exception performing whole class analysis ignored.
 */
class GameClient.2
implements ChannelFutureListener {
    static /* synthetic */ GameClient ALLATORIxDEMO(GameClient.2 arg0) {
        return arg0.GameClient.this;
    }

    public void ALLATORIxDEMO(ChannelFuture futureListener) throws Exception {
        if (futureListener.isSuccess()) {
            System.out.println("\u8fde\u63a5\u6210\u529f");
            GameClient.this.socketNum = 0;
            GameClient.ALLATORIxDEMO((GameClient)GameClient.this, (Channel)futureListener.channel());
            if (GameClient.ALLATORIxDEMO((GameClient)GameClient.this) == null) return;
            GameClient.ALLATORIxDEMO((GameClient)GameClient.this).writeAndFlush((Object)GameClient.ALLATORIxDEMO((GameClient)GameClient.this));
            return;
        }
        futureListener.channel().eventLoop().schedule((Runnable)new /* Unavailable Anonymous Inner Class!! */, 10L, TimeUnit.SECONDS);
    }

    GameClient.2() {
    }
}
