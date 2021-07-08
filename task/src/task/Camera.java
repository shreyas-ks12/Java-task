package task;

public class Camera extends Device {
	
	public Camera(int power, int time, int memory, int cost) {
		super(power, time , memory, cost);
		
	}
	public void CamPower(){
		System.out.println("Camera consumes power of:" +power+"KW");
		
	}
	public void Camcost() {
		System.out.println("Power cost of Camera is :" +cost);
	}

}
