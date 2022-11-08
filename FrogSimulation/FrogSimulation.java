package FrogSimulation;

public class FrogSimulation {
	private int goalDistance;
	private int maxHops;

	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}

	private int hopDistance() {
		return (int) (Math.random() * 62) - 30;
	}

	public boolean simulate() {
		int p = 0;
		for (int i = 0; i < this.maxHops; i++) {
			p += this.hopDistance();
			if (p < 0)
				return false;
			if (p > this.goalDistance)
				return true;
		}
		return false;
	}

	public double runSimulations(int num) {
		int amount = 0;
		for (int i = 0; i < num; i++) {
			if (this.simulate())
				amount++;
		}
		return (double) amount / (double) num;
	}
}
