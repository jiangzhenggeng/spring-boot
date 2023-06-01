package com.exam.service;

import com.exam.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@Transactional
public interface IUserService {

    public User getById(Integer id);

    public List<User> listAll(Integer page, Integer size);
}
