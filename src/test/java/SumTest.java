import org.example.service.ArrayService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumTest {
    ArrayService arrayService;

    @BeforeEach
    void setup(){
        arrayService= new ArrayService();
    }

    @Test
    void testInputValid(){
        assertEquals(6,arrayService.calculatorSumOfArray(new int[]{1,2,3}));
    }
    @Test
    void testInputInvalid(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            arrayService.calculatorSumOfArray(new int[]{-1,2,3});
        });
        assertEquals("Data input is invalid",exception.getMessage());
    }
    @Test
    void testEmptyArray(){
        assertThrows(RuntimeException.class, () -> arrayService.calculatorSumOfArray(new int[]{}));
    }



}
