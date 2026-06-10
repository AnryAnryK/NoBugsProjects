package org.example.dz_14_ComplexTasks.task5;

/*
Задача 5: Инвентарь склада

Описание:
Разработайте систему для управления складом, которая позволяет добавлять и извлекать товары различных типов. Система должна управлять
доступом к складу через переменную isInventoryOpen и обрабатывать ситуации, когда товары заканчиваются, выбрасывая исключение OutOfStockException.

Функциональные требования:
Классы и интерфейсы:
+ Product: Продукт имеет минимальные характеристики, такими как название, цена и категория.

InventoryService:
+Сервис для управления товарами на складе. Должен поддерживать операции добавления товара и извлечения товара по категории.

Управление товарными запасами:
+ Хранение товаров осуществляется в структуре Map<String, List<Product>>, где ключ - это категория товара.
+ Метод для добавления товара на склад. Если флаг isInventoryOpen равен false, операция добавления не должна выполняться.
+ Метод для получения товара по категории. Если в указанной категории нет товаров, должно выбрасываться исключение OutOfStockException.

Работа с данными:
+ Использование Stream API для поиска и фильтрации товаров по категориям.
Фильтрация товаров по цене с использованием лямбда-выражений.
 */

public class Product {
	private final String productName;
	private final double productPrice;
	private final String productCategory;

	public Product(String productName, double productPrice, String productCategory) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}
}
