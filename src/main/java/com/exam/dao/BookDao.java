package com.exam.dao;

import com.exam.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
