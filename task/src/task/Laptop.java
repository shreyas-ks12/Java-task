package task;

public class Laptop extends Device {

public Laptop(int power,int time, int memory, int cost) {
	super(power , time , memory , cost);
}

public void LPower() {
	System.out.println("Laptop  consumes: " +power);
}
public void LCost() {
	System.out.println("Power cost of Laptop" +cost);
}
}
