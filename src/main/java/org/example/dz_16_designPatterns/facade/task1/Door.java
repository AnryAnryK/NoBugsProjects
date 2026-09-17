package org.example.dz_16_designPatterns.facade.task1;

/*
Фасад для управления дверью (открыть, закрыть, заблокировать)
Описание
В нашей системе есть несколько операций для управления дверью:
Открытие двери.
Закрытие двери.
Блокировка двери.
Каждая операция реализована в своём классе.
Задача — создать фасад, который будет объединять эти операции и предоставлять простой интерфейс для работы с дверью.
 */

public class Door {
	private final OpenDoor openDoor;
	private final CloseDoor closeDoor;
	private final BlockDoor blockDoor;

	public Door() {
		this(new OpenDoor(), new CloseDoor(), new BlockDoor());
	}

	public Door(OpenDoor openDoor, CloseDoor closeDoor, BlockDoor blockDoor) {
		this.openDoor = openDoor;
		this.closeDoor = closeDoor;
		this.blockDoor = blockDoor;
	}

	public void open() {
		openDoor.open();
	}

	public void close() {
		closeDoor.close();
	}

	public void block() {
		blockDoor.block();
	}
}
