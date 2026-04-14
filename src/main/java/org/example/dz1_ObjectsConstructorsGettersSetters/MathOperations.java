package org.example.dz1_ObjectsConstructorsGettersSetters;

public class MathOperations {


	/*
	1. Напишите класс MathOperations

	Условие:
Создайте класс MathOperations с методами:
add(int x, int y) — возвращает сумму двух чисел
subtract(int x, int y) — разницу
multiply(int x, int y) — произведение
divide(int x, int y) — результат деления в double

В main вызовите каждый метод с произвольными числами и выведите результат.
	 */

	public static void main(String[] args) {

		System.out.println("Задание 1");
		int add1 = add(1, 2);
		System.out.println("Результат суммы двух чисел равен : " + add1);

		int subtr1 = subtract(5, 4);
		System.out.println("Результат вычитания двух чисел равен : " + subtr1);

		int multi1 = multiply(10, 4);
		System.out.println("Результат умножения двух чисел равен : " + multi1);

		double div1 = divide(11, 4);
		System.out.println("Результат деления двух чисел равен : " + div1);
		double div2 = divide(11, 0);
		System.out.println("Результат деления двух чисел, в котором второе число 0 равен : " + div2);

		System.out.println("===============================================");
		System.out.println("Задание 2");

		System.out.println("Результат возврата большего из двух чисел : " + findMax(2, 10));

		System.out.println("===============================================");
		System.out.println("Задание 3");

		System.out.println("Результат разницы между двумя числами : " + difference(1, 9));

		System.out.println("===============================================");
		System.out.println("Задание 4");

		System.out.println("Площадь квадрата равна : " + squareArea(10));
		System.out.println("Периметр квадрата равен : " + squarePerimeter(10));


		System.out.println("===============================================");
		System.out.println("Задание 5");

		System.out.println("Количество минут : " + convertSecondsToMinutes(600));

		System.out.println("===============================================");
		System.out.println("Задание 6");

		System.out.println("Средняя скорость авто равна : " + averageSpeed(100, 1));
		System.out.println("Средняя скорость пешехода равна : " + averageSpeed(10, 2));

		System.out.println("===============================================");
		System.out.println("Задание 7");

		System.out.println("Значение гипотенузы равно : " + findHypotenuse(5, 6));


		System.out.println("===============================================");
		System.out.println("Задание 8");

		System.out.println("Длина окружности по формуле 2πr равна : " + circleCircumference(2));

		System.out.println("===============================================");
		System.out.println("Задание 9");

		System.out.println("Часть в % от общего числа составляет : " + calculatePercentage(75, 25));
		System.out.println("Часть в % от общего числа составляет при делении на 0 : " + calculatePercentage(75, 0));


		System.out.println("===============================================");
		System.out.println("Задание 10");

		System.out.println("Результат перевода градусов из Цельсия в Фаренгейт : " + celsiusToFahrenheit(10));
		System.out.println("Результат перевода градусов из Фаренгейта в Цельсий  : " + fahrenheitToCelsius(10));

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static double divide(int x, int y) {
		return (double) x / y;
	}


	/*
	2. Реализуйте метод для нахождения максимума двух чисел
Условие:
Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
Вызовите метод в main и выведите результат.

Метод для нахождения максимума двух чисел: используй встроенную функцию Math.max(a, b). Верни результат напрямую или через переменную.
	 */

	public static int findMax(int a, int b) {
		return Math.max(a, b);

	}

	/*
	3. Метод для нахождения разницы между двумя числами
Условие:
Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
Проверьте метод в main.

Метод для нахождения разницы между двумя числами: используй Math.abs(x - y), чтобы получить положительное значение независимо от порядка аргументов.
	 */

	public static int difference(int x, int y) {
		return Math.abs(x - y);
	}

		/*
	4. Методы для площади и периметра квадрата
Условие:
Создайте два метода:
squareArea(int side) — возвращает площадь квадрата
squarePerimeter(int side) — возвращает периметр

Вызовите оба метода в main с примером.

Методы для площади и периметра квадрата: формулы: площадь = side * side, периметр = 4 * side.

	 */

	public static int squareArea(int side) {
		return side * side;
	}

	public static int squarePerimeter(int side) {
		return side * 4;
	}


	/*5. Метод для перевода секунд в минуты
Условие:
Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
Вызовите метод в main и выведите результат.

Метод для перевода секунд в минуты: деление: seconds / 60.0 — результат лучше вернуть как double, особенно если нужно точное значение.
	 */

	public static double convertSecondsToMinutes(int seconds) {
		return (double) seconds / 60;
	}


	/*6. Метод для вычисления средней скорости
Условие:
Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
Вызовите метод с разными значениями. */

	public static double averageSpeed(double distance, double time) {
		return distance / time;
	}


	/*7. Метод для нахождения гипотенузы
Условие:
Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
√(a² + b²)
Вызовите метод с несколькими наборами чисел.

Метод для нахождения гипотенузы: используй Math.sqrt(a*a + b*b) для вычисления. Убедись, что аргументы положительные.
*/

	public static double findHypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);

	}

	/*8. Метод для длины окружности
Условие:
Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
Проверьте работу на нескольких значениях.


Метод для длины окружности: используй Math.PI для числа π. Формула: 2 * Math.PI * radius.
	 */

	public static double circleCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	/*
	9. Метод для вычисления процентов
Условие:
Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
Пример: 25 из 200 → 12.5%

Метод для вычисления процентов: формула: (part / total) * 100. Убедись, что total не ноль, иначе деление вызовет ошибку.
	 */

	public static double calculatePercentage(double total, double part) {
		return ((part / total) * 100);
	}

	/*
	10. Методы перевода температуры
Условие:
Создайте два метода:
celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
Проверьте оба метода в main.
	 */

	public static double celsiusToFahrenheit(double c){
		return (c * 9 / 5) + 32;
	}

	public static double fahrenheitToCelsius(double f){
		return (((f - 32) * 5) / 9);
	}

}
