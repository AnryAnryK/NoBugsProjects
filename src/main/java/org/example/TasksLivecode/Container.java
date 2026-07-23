package org.example.TasksLivecode;

/*
Container With Most Water
Вам дан массив целых чисел height, где height[i] представляет высоту вертикальной линии, проведенной в точке i.
Выберите две линии так, чтобы вместе с осью X они образовали контейнер, способный вместить максимальное количество воды.
Верните максимальную площадь (объем воды), которую может содержать такой контейнер.

Примечания:
Контейнер нельзя наклонять.
Количество воды определяется как:
ширина = расстояние между двумя линиями;
высота = высота более низкой из двух линий.

Вход:
height = [1,8,6,2,5,4,8,3,7]
Выход:
49

Пояснение:
Максимальная площадь получается при выборе линий с высотами 8 и 7.
Расстояние между ними равно 7, минимальная высота равна 7, поэтому площадь составляет 7 × 7 = 49.


Псевдокод:
int left = 0;
int right = array.lengh -1;

 */

public class Container {

	public static int findContainerWithMostWater(int[] array) {
		int left = 0;
		int right = array.length - 1;
		int maxArea = 0;

		while (left < right) {

			int height = Math.min(array[left], array[right]);
			int weight = right - left;

			if (maxArea < height * weight) {
				maxArea = height * weight;
			}
			if (array[left] < array[right]) {
				left++;
			} else right--;
		}
		return maxArea;
	}

	public static void main(String[] args) {
		System.out.println(findContainerWithMostWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
	}
}
