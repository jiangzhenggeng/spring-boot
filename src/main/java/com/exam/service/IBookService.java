package com.exam.service;

import com.exam.domain.Book;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@Transactional
public interface IBookService extends IService<Book> {

}
