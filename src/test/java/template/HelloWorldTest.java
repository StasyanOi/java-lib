package template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testGetHelloWorld() {
        var helloWorld = new HelloWorld();
        Assertions.assertEquals("Hello world!", helloWorld.get());
    }
}