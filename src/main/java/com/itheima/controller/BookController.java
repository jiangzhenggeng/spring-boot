package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        bookService.save(book);
        return new Result(Code.SAVE_OK, null, "成功");
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        bookService.update(book);
        return new Result(Code.SAVE_OK, null, "成功");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        bookService.delete(id);
        return new Result(Code.SAVE_OK, null, "成功");
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return new Result(Code.SAVE_OK, book, "成功");
    }

    @GetMapping
    public Result getAll() {
        List<Book> book = bookService.getAll();
        return new Result(Code.SAVE_OK, book, "成功");
    }

}
