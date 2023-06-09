package com.exam.service.impl;

import com.exam.domain.Book;
import com.exam.dao.BookDao;
import com.exam.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

}
