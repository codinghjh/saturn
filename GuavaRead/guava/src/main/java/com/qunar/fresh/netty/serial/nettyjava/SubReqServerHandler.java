package com.qunar.fresh.netty.serial.nettyjava;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * @version 1.0.0 @author junhua.han @date 2017-12-22 @time 上午12:51 <br>
 */
@ChannelHandler.Sharable
public class SubReqServerHandler extends ChannelHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        SubscribeReq req = (SubscribeReq) msg;
        if("Lilinfeng".equalsIgnoreCase(req.getUserName())){
            System.out.println("Service accept client subscribe req : [" + req.toString() + "]");
            ctx.writeAndFlush(resp(req.getSubReqId()));
        }
    }

    private SubscribeResp resp(int subReqId){
        SubscribeResp resp = new SubscribeResp();
        resp.setSubReqId(subReqId);
        resp.setRespCode(0);
        resp.setDesc("Netty book order succeed, 3 days later, sent to this designated address");
        return resp;
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
