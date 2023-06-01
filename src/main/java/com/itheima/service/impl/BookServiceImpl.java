package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.insert(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.updateById(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.deleteById(id);
        return true;
    }

    public Book getById(Integer id) {
        // 异常学习
//        try {
//            int i = 1 / 0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SAVE_OK, "sdvsdvs", e);
//        }
//        if (id == 1) {
//            throw new BusinessException(Code.SAVE_OK, "hhhh");
//        }
        return bookDao.selectById(id);
    }

    public List<Book> getAll() {
        return bookDao.selectList(null);
    }
}
