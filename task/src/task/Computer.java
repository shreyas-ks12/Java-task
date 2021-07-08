package task;

public class Computer extends Device {

public Computer(int power,int time, int memory, int cost) {
	super(power , time , memory , cost);
}

public void ComPower() {
	System.out.println("Computer consumes: " +power);
}
public void CompCost() {
	System.out.println("power cost of Computer: " +cost);
}
}
