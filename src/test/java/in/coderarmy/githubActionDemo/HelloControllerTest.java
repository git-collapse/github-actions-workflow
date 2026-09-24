package in.coderarmy.githubActionDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void shouldReturnHelloMessage() {

        HelloController controller = new HelloController();

        String result = controller.hello();

        assertEquals(
                "Hello from Coder Army! Welcome back. How are You? shubham",
                result
        );
    }
}