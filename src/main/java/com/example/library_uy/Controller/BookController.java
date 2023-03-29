package com.example.library_uy.Controller;

import com.example.library_uy.Dto.BookDto;
import com.example.library_uy.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(value = "/create")
    private BookDto create(@RequestBody BookDto bookDto){
    return bookService.create(bookDto);
    }

    @GetMapping("/list")
    private void list(){
        bookService.list();
    }

    @GetMapping("/list1")
    private void list1(){
        bookService.list1();
    }

    @GetMapping("/list/{id}")
    private void listId(@PathVariable("id") BookDto bookDtoId){
        bookService.listID(bookDtoId);

    }


    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id") BookDto id){
        bookService.deleteID(id);
    }

    @DeleteMapping("/delete1/{id}")
    private void delete1(@PathVariable("id") BookDto id){
        bookService.deleteID1(id);
    }


    @PutMapping("/put/{id}")
    private void put(@PathVariable("id") BookDto id , @RequestBody BookDto bookDto){

    }





}
