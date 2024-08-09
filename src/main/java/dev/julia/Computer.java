package dev.julia;

public class Computer {
    private final String brand;
    private final int memorySize;
    private final String processorFeatures;
    private final String operatingSystem;
    private final double price;

   
    public Computer(String brand, int memorySize, String processorFeatures, String operatingSystem, double price) {
        this.brand = brand;
        this.memorySize = memorySize;
        this.processorFeatures = processorFeatures;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    
    public String getBrand() {
        return brand;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public String getProcessorFeatures() {
        return processorFeatures;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer [brand=" + brand + ", memorySize=" + memorySize + 
               "GB, processor=" + processorFeatures + ", operatingSystem=" + 
               operatingSystem + ", price=" + price + "]";
    }
}
