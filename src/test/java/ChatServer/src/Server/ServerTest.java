package ChatServer.src.Server;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServerTest {

    public volatile Server server;
    @Test
    void runServer(){
        server = new Server(9000);
    }

    @Test
   void anotherOne(){
       System.out.println("This is another one");
       assertTrue(server.c.isRunning());
   }
    @Test
    void test2(){
        System.out.println("Thi is test 2");
    }



}
