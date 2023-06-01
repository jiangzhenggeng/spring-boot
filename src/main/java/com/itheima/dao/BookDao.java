package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

//
@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Insert("INSERT INTO tbl_book (type,name,description)values(#{type},#{name},#{description})")
//    public void save(Book book);
//
//    @Update("UPDATE tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
//    public void update(Book book);
//
//    @Delete("DELETE FROM tbl_book where id=#{id}")
//    public void delete(Integer id);
//
//    @Select("SELECT * FROM tbl_book where id=#{id}")
//    public Book getById(Integer id);
//
//    @Select("SELECT * FROM tbl_book")
//    public List<Book> getAll();


}
