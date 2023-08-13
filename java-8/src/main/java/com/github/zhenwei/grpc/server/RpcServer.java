package com.github.zhenwei.grpc.server;

import com.github.zhenwei.grpc.impl.RandomImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class RpcServer {

    //macos proto version = libprotoc 22.3
    public static void main(String[] args) {
        try {
            Server server = ServerBuilder.forPort(8888).addService(new RandomImpl()).build().start();
            System.out.println("rpc server start");
            server.awaitTermination();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
