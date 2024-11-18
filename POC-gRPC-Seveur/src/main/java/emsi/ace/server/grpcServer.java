package emsi.ace.server;

import emsi.ace.service.BankGrpcService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class grpcServer {

    private Server server;

    // Start method
    public void start() throws IOException {
        int port = 9999;
        server = ServerBuilder.forPort(port)
                .addService(new BankGrpcService())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);


    }

    // Stop method
    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown();
        }
    }

    // Block until shutdown
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final grpcServer server = new grpcServer();
        server.start();
        server.blockUntilShutdown();
    }
}
