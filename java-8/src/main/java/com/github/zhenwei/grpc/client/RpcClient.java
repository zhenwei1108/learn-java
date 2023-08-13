package com.github.zhenwei.grpc.client;

import com.github.zhenwei.grpc.GrpcRandom;
import com.github.zhenwei.grpc.RandomGeneratorGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888).usePlaintext().build();
        RandomGeneratorGrpc.RandomGeneratorBlockingStub blockingStub = RandomGeneratorGrpc.newBlockingStub(channel);
        GrpcRandom.RpcDataRequest request = GrpcRandom.RpcDataRequest.newBuilder().setRandomLength(32).build();

        GrpcRandom.RpcDataResponse rpcDataResponse = blockingStub.genRandom(request);
        System.out.println("收到应答："+rpcDataResponse.getRandom());
        channel.shutdown();
    }

}
