package ChatServer.src.Server;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServerTest {

    private Server server;
    @Test
    void init(){
        server = new Server(9000);
    }

    @Test
    void test(){

    }


    @Test
    void test2(){
        assertTrue(server.c.isRunning());
    }


}