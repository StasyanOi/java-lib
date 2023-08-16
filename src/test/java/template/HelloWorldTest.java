package template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testGetHelloWorld() {
        var helloWorld = new HelloWorld();
        assertEquals("Hello world!", helloWorld.get());
    }
}