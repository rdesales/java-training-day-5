public class Cellphone implements Comparable <Cellphone> {

    private String brand;
    private int internalMemory;
    private int ram;
    private int cost;

    public Cellphone(String brand, int internalMemory, int ram, int cost) {
	this.brand = brand;
	this.internalMemory = internalMemory;
	this.ram = ram;
	this.cost = cost;
    }

    public String getBrand() {
	return brand;
    }
     public int getInternalMemory() {
	return internalMemory;
    }

    public int getRam() {
	return ram;
    }

    public int getCost() {
	return cost;
    }

    @Override
    public String toString() {
	return "Brand: " + brand + "\nInternal Memory: "+ internalMemory + "\nRAM: " + ram + "\nCost: " + cost;
    }

    /**
     * Comparable is fo objects which know their order by themselves
     */
    //Comparing by cost
    @Override
    public int compareTo(Cellphone c) {
	return (cost >= c.cost)? 1 : -1;
    }

}
