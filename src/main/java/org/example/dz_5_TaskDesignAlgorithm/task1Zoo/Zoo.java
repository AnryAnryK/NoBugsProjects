package org.example.dz_5_TaskDesignAlgorithm.task1Zoo;

public class Zoo extends Animals {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		Elephant elephant1 = new Elephant();
		Bird bird1 = new Bird();
		Cat cat1 = new Cat();

		zoo.animalInToZoo("Слон");
		zoo.print();
		elephant1.makeNoice();
		elephant1.move();
		zoo.animalInToZoo("Птица");
		zoo.print();
		bird1.makeNoice();
		bird1.move();
		zoo.animalInToZoo("Кошка");
		zoo.print();
		cat1.makeNoice();
		cat1.move();

		zoo.animalOutFromZoo("Кошка");
		zoo.print();
	}

	int countOfPlaceInZoo = 0;
	final int maxCountAnimalInZoo = 2;
	String animalName;


	public void animalInToZoo(String animalName) {
		this.animalName = animalName;

		if (countOfPlaceInZoo <= maxCountAnimalInZoo) {
			System.out.println("============================");
			System.out.println("Добавили животное в зоопарк ");
			countOfPlaceInZoo++;
			System.out.println("Всего животных в зоопарке : " + countOfPlaceInZoo);
			System.out.println("Вид животного в зоопарке : " + animalName);

			if (countOfPlaceInZoo > maxCountAnimalInZoo){
				System.out.println("Добавить животное нельзя, зоопарк переполнится");
			}
		}
	}


	public void animalOutFromZoo(String animalName) {
		this.animalName = animalName;

		if (countOfPlaceInZoo > maxCountAnimalInZoo) {
			System.out.println("============================");
			System.out.println("Увезли животное из зоопарка ");
			countOfPlaceInZoo--;
			System.out.println("Всего животных в зоопарке : " + countOfPlaceInZoo);
			System.out.println("Вид животного в зоопарке : " + animalName);
		}
		if (countOfPlaceInZoo <= 0) {
			System.out.println("Увозить некого, зоопарк пуст");
		}
	}

	public void print() {
//		System.out.println("Всего животных в зоопарке : " + countOfPlaceInZoo);
//		System.out.println("Вид животного в зоопарке : " + animalName);
	}
}
