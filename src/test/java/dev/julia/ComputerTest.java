package dev.julia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ComputerTest {


     @Test
    public void testComputerCreation() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.50);

        assertEquals("Dell", computer.getBrand());
        assertEquals(16, computer.getMemorySize());
        assertEquals("Intel i7", computer.getProcessorFeatures());
        assertEquals("Windows 10", computer.getOperatingSystem());
        assertEquals(1200.50, computer.getPrice());
    }

    @Test
    public void testToString() {
        Computer computer = new Computer("HP", 8, "AMD Ryzen 5", "Windows 11", 900.75);
        String expected = "Computer [brand=HP, memorySize=8GB, processor=AMD Ryzen 5, operatingSystem=Windows 11, price=900.75]";
        assertEquals(expected, computer.toString());
    }
}

