package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.domain.query.QueryBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private BookDao bookDao;


    @Test
    void getAll() {
//        QueryWrapper<Book> wrapper = new QueryWrapper<Book>();
//        wrapper.lt("id", 3);
//        wrapper.lambda().eq(Book::getId, 3);


        QueryBook queryBook = new QueryBook();
        queryBook.setType("22");
        queryBook.setType2(5);

//        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<Book>();
        // 查询投影（只支持已有的字段）
//        wrapper.select(Book::getId,Book::getName);
//        wrapper.eq(queryBook.getType()!=null, Book::getId, queryBook.getType())
//                .or()
//                .eq(Book::getId, queryBook.getType2());


//        List<Book> boos = bookDao.selectList(wrapper);

        QueryWrapper<Book> wrapper = new QueryWrapper<Book>();
        // 查询投影（可以使用自定义字段）
        wrapper.select("count(*) as total", "id");
        wrapper.groupBy("type");
        List<Map<String, Object>> boos = bookDao.selectMaps(wrapper);
        System.out.println(boos);
    }

    @Test
    void getIPage() {
        IPage page = new Page(2, 1);
        bookDao.selectPage(page, null);

        System.out.println("getCurrent:"+page.getCurrent());
        System.out.println("getPages:"+page.getPages());
        System.out.println("getSize:"+page.getSize());
        System.out.println("getTotal:"+page.getTotal());
        System.out.println("getRecords:"+page.getRecords());
    }

}
