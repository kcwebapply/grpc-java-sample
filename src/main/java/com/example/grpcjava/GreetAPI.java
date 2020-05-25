package com.example.grpcjava;

import com.example.grpcjava.protogen.GreetGrpc;
import com.example.grpcjava.protogen.GreetRequest;
import com.example.grpcjava.protogen.GreetResponse;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Component;

@GRpcService
@Component
public class GreetAPI extends GreetGrpc.GreetImplBase {


    @Override
    public void greeting(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        String value = request.getValue();
        System.out.println("value!!!"+value);
        GreetResponse greetResponse = GreetResponse.newBuilder().setValue("Greeting!"+ value).build();
        responseObserver.onNext(greetResponse);
        responseObserver.onCompleted();

    }
}
