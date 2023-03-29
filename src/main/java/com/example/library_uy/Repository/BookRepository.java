package com.example.library_uy.Repository;

import com.example.library_uy.Dto.BookDto;
import com.example.library_uy.Entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private SessionFactory sessionFactory;
    public Book save(Book book) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);

        transaction.commit();
        session.close();
        return book;
    }

    public List<Book> list() {
        Session session = sessionFactory.openSession();
        Query<Book> query = session.createNativeQuery(" select * from book ", Book.class);
        List<Book>list = query.getResultList();
        session.close();
        return list;
    }

    public List<BookDto> getList() {
        Session session = sessionFactory.openSession();
        Query<BookDto> query = session.createNativeQuery(" select * from book ", BookDto.class);
        List<BookDto> list = query.getResultList();
        session.close();

        return list;
    }

    public void delete(BookDto id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(id);
        transaction.commit();
        session.close();
    }

}
