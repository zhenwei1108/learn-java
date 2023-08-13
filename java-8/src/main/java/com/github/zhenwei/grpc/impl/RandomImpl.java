package com.github.zhenwei.grpc.impl;

import com.github.zhenwei.grpc.GrpcRandom;
import com.github.zhenwei.grpc.RandomGeneratorGrpc;
import io.grpc.stub.StreamObserver;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;

public class RandomImpl extends RandomGeneratorGrpc.RandomGeneratorImplBase {

    @Override
    public void genRandom(GrpcRandom.RpcDataRequest request, StreamObserver<GrpcRandom.RpcDataResponse> responseObserver) {
        System.out.println("收到请求:"+request);
        int randomLength = request.getRandomLength();
        byte[] random = new byte[randomLength];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(random);
        GrpcRandom.RpcDataResponse response = GrpcRandom.RpcDataResponse.newBuilder().setRandom(Base64.getEncoder().encodeToString(random)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
