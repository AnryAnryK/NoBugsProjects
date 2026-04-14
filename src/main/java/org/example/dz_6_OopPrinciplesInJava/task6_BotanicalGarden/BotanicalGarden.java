package org.example.dz_6_OopPrinciplesInJava.task6_BotanicalGarden;

public class BotanicalGarden extends Plant {

	@Override
	public void care() {}


	public void care(Plant plant) {
		plant.care();
	}

	public static void main(String[] args) {

		BotanicalGarden botanicalGarden1 = new BotanicalGarden();
		Plant orchid1 = new Orchid();
		botanicalGarden1.care(orchid1);

		Plant cactus1 = new Cactus();
		botanicalGarden1.care(cactus1);
	}
}
