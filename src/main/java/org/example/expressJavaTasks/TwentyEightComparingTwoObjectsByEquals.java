package org.example.expressJavaTasks;

/*
Реализовать equals и hashCode в классе Book по полям title и author.

Переопределить equals и hashCode.
 */

import java.util.Objects;

public class TwentyEightComparingTwoObjectsByEquals {


	static class Book {
		String title;
		String author;


		Book(String title, String author) {
			this.title = title;
			this.author = author;
		}

//		public boolean equals(Object o) {                               // учебный вариант решения !
//			if (this == o) return true;
//			if (!(o instanceof Book)) return false;
//			Book b = (Book) o;
//			return title.equals(b.title) && author.equals(b.author);
//		}


		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Book book = (Book) o;
			return Objects.equals(title, book.title) && Objects.equals(author, book.author);
		}

		@Override
		public int hashCode() {
			return Objects.hash(title, author);
		}
	}


		public static void main(String[] args) {
			TwentyEightComparingTwoObjectsByEquals.Book book1 = new TwentyEightComparingTwoObjectsByEquals.Book("Капитанская дочка", "А.С. Пушкин");
			TwentyEightComparingTwoObjectsByEquals.Book book2 = new TwentyEightComparingTwoObjectsByEquals.Book("Капитанская дочка", "А.С. Пушкин");
			System.out.println(book1.equals(book2));
		}
	}
//}
