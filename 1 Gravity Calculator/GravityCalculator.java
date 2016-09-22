class GravityCalculator{
	public static void main(String[]arguments){
		double gravity=-9.81;
		double initialVelocity =0.0;
		double fallingtime =10.0;
		double initialPosition=0.0;
		double finalPosition=0.0;
		finalPosition=(0.5)*gravity*fallingtime*fallingtime+initialVelocity*fallingtime+initialPosition;
		System.out.println("The objects position after "+ fallingtime +" seconds is "+ finalPosition+" m");
	}



}
