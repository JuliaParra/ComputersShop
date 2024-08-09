package dev.julia;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {
    private Store store;
    private Computer computer1;
    private Computer computer2;

    @BeforeEach
    public void setUp() {
        store = new Store("TechStore", "John Doe", "123456789");
        computer1 = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.50);
        computer2 = new Computer("HP", 8, "AMD Ryzen 5", "Windows 11", 900.75);
        store.addComputer(computer1);
        store.addComputer(computer2);
    }

    @Test
    public void testAddComputer() {
        Computer computer3 = new Computer("Lenovo", 12, "Intel i5", "Linux", 750.00);
        store.addComputer(computer3);
        assertEquals(3, store.listComputers().size());
    }

    @Test
    public void testRemoveNonexistentComputer() {
        store.removeComputer("NonexistentBrand");
        assertEquals(2, store.listComputers().size());
    }

    @Test
    public void testRemoveComputerFromEmptyStore() {
        Store emptyStore = new Store("EmptyStore", "Jane Doe", "987654321");
        emptyStore.removeComputer("Dell");
        assertTrue(emptyStore.listComputers().isEmpty());
    }

    @Test
    public void testFindNonexistentComputer() {
        Computer result = store.findComputer("NonexistentBrand");
        assertNull(result);
    }

    @Test
    public void testFindComputerInEmptyStore() {
        Store emptyStore = new Store("EmptyStore", "Jane Doe", "987654321");
        Computer result = emptyStore.findComputer("Dell");
        assertNull(result);
    }

    @Test
    public void testRemoveComputer() {
        store.removeComputer("Dell");
        List<Computer> computers = store.listComputers();
        assertEquals(1, computers.size());
        assertNull(store.findComputer("Dell"));
    }

    @Test
    public void testFindComputer() {
        Computer result = store.findComputer("HP");
        assertNotNull(result);
        assertEquals("HP", result.getBrand());
    }

    @Test
    public void testListComputers() {
        List<Computer> computers = store.listComputers();
        assertEquals(2, computers.size());
    }

    @Test
    public void testListComputersWhenEmpty() {
        Store emptyStore = new Store("EmptyStore", "Jane Doe", "987654321");
        List<Computer> computers = emptyStore.listComputers();
        assertTrue(computers.isEmpty());
    }
}