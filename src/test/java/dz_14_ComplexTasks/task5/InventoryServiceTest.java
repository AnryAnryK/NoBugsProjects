package dz_14_ComplexTasks.task5;

import org.example.dz_14_ComplexTasks.task5.InventoryService;
import org.example.dz_14_ComplexTasks.task5.OutOfStockException;
import org.example.dz_14_ComplexTasks.task5.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryServiceTest {

	@Test
	@DisplayName("Позитивные тесты: проверка добавления Товара")
	public void checkAddProductPositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 2, "Хозтовары");
		assertEquals("Лопатка", inventoryService1.addProduct(product1).getProductName());
	}

	@Test
	@DisplayName("Позитивные тесты: проверка выбора Товара по Категории")
	public void checkGetProductByCategoryPositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 2, "Хозтовары");

		inventoryService1.getProductByCategory("Лопатка", z);

		assertEquals("Хозтовары", inventoryService1.addProduct(product1).getProductCategory());
	}
}
