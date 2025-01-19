package exercisepgm_1;

//here car is x bike is y 4x+2y=w; and x+y =v; from this we create equation for count of car and bike
public class NoofBikeAndVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int wheels=540;
		int vehicle=200;
		int car=(wheels-2*(vehicle))/2;
		int bike=vehicle-car;
		
		System.out.print(bike+" "+car);
		

	}

}
