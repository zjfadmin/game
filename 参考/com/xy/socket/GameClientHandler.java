package com.xy.socket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

public class GameClientHandler extends SimpleChannelInboundHandler<String> {
   private GameClient client;

   protected void a(ChannelHandlerContext var1, String var2) {
      try {
         if (var2 != null) {
            ParamTool.j(var2, this.client);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void userEventTriggered(ChannelHandlerContext var1, Object var2) throws Exception {
      if (var2 instanceof IdleStateEvent && ((IdleStateEvent)var2).state() == IdleState.WRITER_IDLE) {
         this.client.d("bibi\n");
      }

      super.userEventTriggered(var1, var2);
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
   }

   public GameClientHandler(GameClient var1) {
      this.client = var1;
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      System.out.println("断线");
      this.client.w();
      super.channelInactive(var1);
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) throws Exception {
      var1.close();
      super.exceptionCaught(var1, var2);
   }
}
