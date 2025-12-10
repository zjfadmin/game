package com.xy.socket;

import com.xy.text.GameMain;
import com.xy.text.GameView;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.AdaptiveRecvByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

public class GameClient {
   private String userName;
   public boolean gameXuanBao;
   public boolean gameBattle;
   private boolean isDoConnect;
   public boolean gameMount;
   public String bq;
   public int gameTypeIndex2;
   public boolean gameNewTyc;
   public boolean gamePawn;
   public boolean[] tss;
   public int gameType;
   public String VALUE;
   public boolean gamePetSkill;
   private long handleId;
   private long roleId;
   public boolean drawCloud;
   private String sendMsg;
   public boolean gameSZZ;
   private Bootstrap bootstrap;
   public GameView gameView;
   private String userPwd;
   private int areaId;
   public String gn;
   public boolean gameMsg;
   public boolean gameBaby;
   int socketNum;
   public boolean gameBBXY;
   private NioEventLoopGroup workGroup;
   private int portWeb;
   public boolean gameKey;
   public int gameTypeIndex;
   public int gameTypeIndex3;
   private Channel channel;
   public boolean[] bqs;
   private String ip;
   public int gameVersion2;
   public boolean gamePetManual;
   private String areaName;
   private int portTcp;
   public String gameUX;
   public int gameVersion1;
   public boolean gameBeau;
   public boolean gameText;
   public long assetIndex;

   public boolean a() {
      return (boolean)(this.gameVersion1 == --5 ? 3 & 5 : 0);
   }

   public boolean b() {
      return (boolean)(this.gameType == 5 >> 1 && this.gameTypeIndex == (93 & 46) && this.gameTypeIndex2 == (15 & 118) ? 2 ^ 3 : 0);
   }

   public int getPortTcp() {
      return this.portTcp;
   }

   public void c() {
      try {
         if (this.s()) {
            this.setDoConnect((boolean)(5 >> 3));
            this.getChannel().close();
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public String getIp() {
      return this.ip;
   }

   public String getAreaName() {
      return this.areaName;
   }

   public long getRoleId() {
      return this.roleId;
   }

   public void d(String var1) {
      if (this.s()) {
         this.getChannel().writeAndFlush(var1);
      }
   }

   public GameClient(long var1, int var3, String var4, String var5, int var6, int var7, long var8, String var10, String var11) {
      int var10021 = 3 & 4;
      int var10025 = 54 & 89;
      int var10027 = 24 & 119;
      int var10037 = 5 >> 3;
      int var10039 = 3 >> 2;
      int var10041 = 3 >> 2;
      int var10043 = 3 & 4;
      int var10045 = 3 & 4;
      int var10047 = 3 ^ 3;
      int var10049 = 3 ^ 3;
      int var10051 = 3 ^ 3;
      int var10053 = 3 ^ 3;
      int var10055 = 2 & 5;
      int var10057 = 2 & 5;
      int var10059 = 3 ^ 3;
      int var10061 = 3 ^ 3;
      int var10063 = 2 & 5;
      int var10065 = 2 & 5;
      int var10067 = --1;
      int var10069 = --1;
      int var10071 = 4 ^ 5;
      int var10073 = --5;
      int var10075 = 30 & 109;
      int var10077 = 1 ^ 3;
      int var10079 = 3 >> 1;
      super();
      this.isDoConnect = (boolean)var10079;
      this.gameType = var10077;
      this.gameTypeIndex = var10075;
      this.gameTypeIndex2 = var10073;
      this.gameTypeIndex3 = var10071;
      this.gameVersion1 = var10069;
      this.gameVersion2 = var10067;
      this.gameNewTyc = (boolean)var10065;
      this.gameBBXY = (boolean)var10063;
      this.gameSZZ = (boolean)var10061;
      this.gameMsg = (boolean)var10059;
      this.gameKey = (boolean)var10057;
      this.drawCloud = (boolean)var10055;
      this.gameText = (boolean)var10053;
      this.gameBattle = (boolean)var10051;
      this.gamePetSkill = (boolean)var10049;
      this.gameBaby = (boolean)var10047;
      this.gameMount = (boolean)var10045;
      this.gamePawn = (boolean)var10043;
      this.gameBeau = (boolean)var10041;
      this.gamePetManual = (boolean)var10039;
      this.gameXuanBao = (boolean)var10037;
      this.gameUX = "ABC";
      this.bq = "0";
      this.gn = "dbc";
      this.VALUE = "ABCDGHIJ";
      boolean[] var12 = new boolean[var10027];
      boolean var10029 = true;
      this.bqs = var12;
      boolean[] var14 = new boolean[var10025];
      boolean var13 = true;
      this.tss = var14;
      this.assetIndex = -111L;
      this.socketNum = var10021;
      this.handleId = var1;
      this.areaId = var3;
      this.areaName = var4;
      this.ip = var5;
      this.portTcp = var6;
      this.portWeb = var7;
      this.roleId = var8;
      this.userName = var10;
      this.userPwd = var11;
      this.sendMsg = Agreement.getSendTextAES("enterGame", var8 + "|" + var10 + "|" + var11 + "|" + GameMain.mac);
   }

   public boolean f() {
      return (boolean)(this.gameVersion1 == --3 ? 2 ^ 3 : 0);
   }

   public boolean g() {
      return (boolean)(this.gameVersion1 == --4 ? --1 : 0);
   }

   public String getSendMsg() {
      return this.sendMsg;
   }

   public boolean h() {
      return (boolean)(this.gameType == 5 >> 1 && this.gameTypeIndex == (79 & 59) ? 2 ^ 3 : 0);
   }

   public Channel getChannel() {
      return this.channel;
   }

   public boolean i() {
      return (boolean)(this.gameType == --2 && this.gameTypeIndex == (94 & 45) && this.gameTypeIndex2 == --5 ? 5 >> 2 : 0);
   }

   public void j(String var1) {
      int var2;
      for(int var10000 = var2 = 3 & 4; var10000 < var1.length(); var10000 = var2) {
         char var3;
         if ((var3 = var1.charAt(var2)) >= (124 & 51) && var3 <= (57 & 127)) {
            this.bqs[var3 - (119 & 56)] = (boolean)(3 & 5);
         }

         ++var2;
      }

   }

   public void setGameType(String var1) {
      this.gameVersion1 = Integer.parseInt(var1);
      if (this.gameVersion1 > (103 & 124)) {
         this.gameVersion2 = this.gameVersion1 / (101 & 126);
         this.gameVersion1 %= 108 & 119;
      }

   }

   public boolean k(int var1) {
      return this.bqs[var1];
   }

   public void setDoConnect(boolean var1) {
      this.isDoConnect = var1;
   }

   public boolean l() {
      return this.isDoConnect;
   }

   public void m() {
      try {
         this.workGroup = new NioEventLoopGroup();
         this.bootstrap = new Bootstrap();
         ((Bootstrap)((Bootstrap)((Bootstrap)this.bootstrap.group(this.workGroup)).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, Boolean.valueOf((boolean)(5 >> 2)))).handler(new ChannelInitializer<SocketChannel>() {
            protected void b(SocketChannel var1) throws Exception {
               ChannelPipeline var2 = var1.pipeline();
               int var10000 = --1;
               var2.addLast("framer", new DelimiterBasedFrameDecoder(Integer.MAX_VALUE, Delimiters.lineDelimiter()));
               var2.addLast("decoder", new StringDecoder(Charset.forName("utf-8")));
               var2.addLast("encoder", new StringEncoder(Charset.forName("utf-8")));
               ChannelHandler[] var10001 = new ChannelHandler[var10000];
               boolean var10003 = true;
               var10001[3 >> 2] = new IdleStateHandler(0L, 30L, 0L, TimeUnit.SECONDS);
               var2.addLast(var10001);
               var10001 = new ChannelHandler[4 ^ 5];
               var10003 = true;
               var10001[2 & 5] = new GameClientHandler(GameClient.this);
               var2.addLast(var10001);
            }
         });
         this.bootstrap.option(ChannelOption.RCVBUF_ALLOCATOR, AdaptiveRecvByteBufAllocator.DEFAULT);
         this.bootstrap.option(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
         this.w();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public long getHandleId() {
      return this.handleId;
   }

   public boolean n(int var1, int var2) {
      return (boolean)(this.gameType == var1 && this.gameTypeIndex == var2 ? 3 >> 1 : 0);
   }

   public void setTS(int var1, boolean var2) {
      this.tss[var1] = var2;
   }

   public boolean o() {
      return (boolean)(this.gameType == 5 >> 1 && this.gameTypeIndex == (76 & 63) && this.gameTypeIndex2 == --3 ? 4 ^ 5 : 0);
   }

   public boolean p() {
      return (boolean)(this.gameVersion1 == (91 & 45) ? 2 ^ 3 : 0);
   }

   public boolean q() {
      return (boolean)(this.gameType == (1 ^ 3) && this.gameTypeIndex == (63 & 76) && this.gameTypeIndex2 == (111 & 23) ? 4 ^ 5 : 0);
   }

   public boolean r() {
      return (boolean)(this.gameVersion1 == (118 & 15) ? 4 ^ 5 : 0);
   }

   public boolean s() {
      return (boolean)(this.l() && this.getChannel() != null && this.getChannel().isActive() ? --1 : 0);
   }

   public int getPortWeb() {
      return this.portWeb;
   }

   public int getAreaId() {
      return this.areaId;
   }

   public boolean u() {
      return (boolean)(this.gameVersion1 == (127 & 7) ? --1 : 0);
   }

   public boolean v() {
      return (boolean)(this.gameVersion1 == --2 ? --1 : 0);
   }

   protected void w() throws Exception {
      if (this.isDoConnect) {
         if (this.channel == null || !this.channel.isActive()) {
            this.channel = null;
            ChannelFuture var1 = this.bootstrap.connect(this.ip, this.portTcp);
            var1.addListener(new ChannelFutureListener() {
               public void gz(ChannelFuture var1) throws Exception {
                  if (var1.isSuccess()) {
                     System.out.println("连接成功");
                     GameClient.this.socketNum = 5 >> 3;
                     GameClient.this.channel = var1.channel();
                     if (GameClient.this.sendMsg != null) {
                        GameClient.this.channel.writeAndFlush(GameClient.this.sendMsg);
                        return;
                     }
                  } else {
                     var1.channel().eventLoop().schedule(new Runnable() {
                        public void run() {
                           try {
                              GameClient var10000 = GameClient.this;
                              int var10002 = var10000.socketNum;
                              var10000.socketNum = var10002 + (3 >> 1);
                              if (var10002 <= (15 & 122)) {
                                 GameClient.this.w();
                              } else {
                                 System.exit(0);
                              }
                           } catch (Exception var2) {
                              var2.printStackTrace();
                           }
                        }
                     }, 10L, TimeUnit.SECONDS);
                  }

               }
            });
         }
      }
   }

   public boolean y() {
      return (boolean)(this.gameType == 5 >> 1 && this.gameTypeIndex == (92 & 47) && this.gameTypeIndex2 == (1 ^ 3) ? --1 : 0);
   }

   public boolean z(int var1) {
      return this.tss[var1];
   }

   public boolean aa() {
      return (boolean)(this.gameVersion1 == (108 & 27) ? --1 : 0);
   }
}
