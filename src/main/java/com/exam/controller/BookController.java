package com.exam.controller;

import com.common.Code;
import com.common.Result;
import com.exam.domain.Book;
import com.exam.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        iBookService.save(book);
        return new Result(Code.SAVE_OK, null, "成功");
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        iBookService.updateById(book);
        return new Result(Code.SAVE_OK, null, "成功");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        iBookService.removeById(id);
        return new Result(Code.SAVE_OK, null, "成功");
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = iBookService.getById(id);
        return new Result(Code.SAVE_OK, book, "成功");
    }

    @GetMapping
    public Result getAll() {
        List<Book> book = iBookService.list();
        return new Result(Code.SAVE_OK, book, "成功");
    }

}
