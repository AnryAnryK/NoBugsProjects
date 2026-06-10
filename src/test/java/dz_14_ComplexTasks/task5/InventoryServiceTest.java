package dz_14_ComplexTasks.task5;

import org.example.dz_14_ComplexTasks.task5.InventoryService;
import org.example.dz_14_ComplexTasks.task5.OutOfStockException;
import org.example.dz_14_ComplexTasks.task5.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {

	@Test
	@DisplayName("Позитивные тесты: проверка добавления Товара при включенном флаге isInventoryOpen = true")
	public void checkAddProductWithActiveFlagPositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 0.2, "Хозтовары");
		inventoryService1.getFlagSsInventoryOpen(true);
		assertEquals("Лопатка", inventoryService1.addProduct(product1).getProductName());
	}

	@Test
	@DisplayName("Позитивные тесты: проверка добавления Товара при выключенном флаге isInventoryOpen = false")
	public void checkAddProductWithNotActiveFlagPositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 0.2, "Хозтовары");
		inventoryService1.getFlagSsInventoryOpen(false);
		assertThrows(OutOfStockException.class, () -> inventoryService1.addProduct(product1).getProductName());
	}

	@Test
	@DisplayName("Позитивные тесты: проверка выбора Товара по Категории при включенном флаге isInventoryOpen = true")
	public void checkGetProductByCategoryWithActiveFlagPositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 0.2, "Хозтовары");
		inventoryService1.getFlagSsInventoryOpen(true);
		Product actualResul = inventoryService1.addProduct(product1);
		assertEquals(actualResul, inventoryService1.getProductByCategory("Хозтовары"));
	}

	@Test
	@DisplayName("Позитивные тесты: проверка выбора Товара по Категории при выключенном флаге isInventoryOpen = false")
	public void checkGetProductByCategoryWithNotActiveFlagPositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 0.2, "Хозтовары");
		inventoryService1.getFlagSsInventoryOpen(false);
		assertThrows(OutOfStockException.class, () -> inventoryService1.addProduct(product1));
	}


	@Test
	@DisplayName("Негативные тесты: проверка выбора Товара по ОТСУТСТВУЮЩЕЙ Категории при включенном флаге isInventoryOpen = true")
	public void checkGetProductByAbsentCategoryWithActiveFlagNegativeTests() {
		InventoryService inventoryService1 = new InventoryService();
		inventoryService1.getFlagSsInventoryOpen(true);
		assertThrows(OutOfStockException.class, () -> inventoryService1.getProductByCategory("Хозтовары1"));
	}

	@Test
	@DisplayName("Негативные тесты: проверка выбора Товара по ОТСУТСТВУЮЩЕЙ Категории при выключенном флаге isInventoryOpen = false")
	public void checkGetProductByAbsentCategoryWithNotActiveFlagNegativeTests() {
		InventoryService inventoryService1 = new InventoryService();
		inventoryService1.getFlagSsInventoryOpen(false);
		assertThrows(OutOfStockException.class, () -> inventoryService1.getProductByCategory("Хозтовары1"));
	}

	@Test
	@DisplayName("Позитивные тесты: проверка поиска и фильтрации товаров по категории")
	public void checkAddProductWithActiveFlagByCategoryPositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 0.2, "Хозтовары");
		inventoryService1.getFlagSsInventoryOpen(true);
		inventoryService1.addProduct(product1);
		inventoryService1.findAndGetProductByCategoryFiltersStreamApi(product1);
		assertEquals("Хозтовары", inventoryService1.addProduct(product1).getProductCategory());
	}

	@Test
	@DisplayName("Позитивные тесты: проверка поиска и фильтрации товаров по цене")
	public void checkAddProductWithActiveFlagByPricePositiveTests() throws OutOfStockException {
		InventoryService inventoryService1 = new InventoryService();
		Product product1 = new Product("Лопатка", 0.2, "Хозтовары");
		inventoryService1.getFlagSsInventoryOpen(true);
		inventoryService1.addProduct(product1);
		assertEquals(0.2, inventoryService1.findAndGetProductByPriceFiltersStreamApi(product1).getProductPrice());
	}
}
