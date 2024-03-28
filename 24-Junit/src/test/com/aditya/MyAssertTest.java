package test.com.aditya;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void test(){
        boolean test = todos.contains("AWS");
        assertEquals(true, true);
        assertEquals(3, todos.size());
        assertEquals(3, todos.size(), "Size is not matching");
        assertTrue(test);
    }
}
