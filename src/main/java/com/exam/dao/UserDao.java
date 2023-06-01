package com.exam.dao;

import com.exam.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@Mapper
public interface UserDao {

    @Select("select * from tbl_user where id=#{id}")
    public User getById(Integer id);


    public List<User> getUserList(@Param("offset") Integer offset, @Param("size") Integer size);

}
