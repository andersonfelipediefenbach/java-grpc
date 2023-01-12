import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.UserService;

import java.io.IOException;
import java.util.logging.Logger;

public class Application {
    private static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(50052).addService(new UserService()).build();

        server.start();

        logger.info("Serve started on " + server.getPort());

        server.awaitTermination();

    }
}
