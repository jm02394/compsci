package FrogSimulation;

public class FrogSimulationDriver {
	public static void main(String[] args) {
		FrogSimulation sim = new FrogSimulation(24, 5);

		System.out.println(sim.runSimulations(400));
	}
}
