package com.leejinseok.demo2;

import com.leejinseok.demo2.domain.Book;
import com.leejinseok.demo2.domain.Category;
import com.leejinseok.demo2.repository.BookRepository;
import com.leejinseok.demo2.repository.CategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class Demo2ApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Test
	public void saveEntity(){

		Category category = new Category();
		category.setGenre("컴퓨터/IT");
		categoryRepository.save(category);

		Book book = new Book();
		book.setName("운영체제");
		book.setCategory(category);
		book.getCategory().getBook().add(book);
		bookRepository.save(book);

		Category category2 = new Category();
		category2.setGenre("응용컴퓨터");
		categoryRepository.save(category2);
		book.setCategory(category2);
		book.getCategory().getBook().add(book);
		bookRepository.save(book);



//		assertThat(book.getCategory().getGenre()).isEqualTo("컴퓨터/IT");
//		assertThat(category.getBook()).contains(book);
	}

}
