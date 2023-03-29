package com.example.library_uy.Service;

import com.example.library_uy.Dto.BookDto;
import com.example.library_uy.Entity.Book;
import com.example.library_uy.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    private List<BookDto> bookDtoList = new LinkedList<>();
    public BookDto create(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setPublishYear(bookDto.getPublishYear());
        bookRepository.save(book);
        return null;
    }

    public void list() {
        List<Book> bookDtoList = bookRepository.list();
        bookDtoList.forEach(bookDto -> System.out.println(bookDto));
    }
    public void list1() {
        List<BookDto> bookDtoList = bookRepository.getList();
        bookDtoList.forEach(bookDto -> System.out.println(bookDto));
    }

    public void listID(BookDto bookDtoId) {
        Optional<Book> optional = bookRepository.list().stream().filter(bookDto -> bookDto.getId().equals(bookDtoId)).findAny();

    }

    public void deleteID(BookDto id) {
          bookRepository.list().removeIf(book -> book.getId().equals(id));
    }

    public void deleteID1(BookDto id) {
        bookRepository.delete(id);
    }

}




