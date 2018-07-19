package org.rakam.server.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;

public class RakamWebSocketFrame {
    private ChannelHandlerContext ctx;
    private WebSocketFrame frame;

    public RakamWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame) {
        this.ctx = ctx;
        this.frame = frame;
    }

    public ChannelHandlerContext getCtx() {
        return ctx;
    }

    public WebSocketFrame getFrame() {
        return frame;
    }
}
