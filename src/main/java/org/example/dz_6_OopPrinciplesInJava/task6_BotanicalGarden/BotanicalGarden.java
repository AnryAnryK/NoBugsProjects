package org.example.dz_6_OopPrinciplesInJava.task6_BotanicalGarden;

public class BotanicalGarden {

	private Plant plant;

	public void setPlant(Plant plant){
		this.plant = plant;
	}


	public void care() {
		plant.care();
	}

	public static void main(String[] args) {

		BotanicalGarden botanicalGarden1 = new BotanicalGarden();
		Plant orchid1 = new Orchid();
		botanicalGarden1.setPlant(orchid1);
		botanicalGarden1.care();

		Plant cactus1 = new Cactus();
		botanicalGarden1.setPlant(cactus1);
		botanicalGarden1.care();
	}
}
