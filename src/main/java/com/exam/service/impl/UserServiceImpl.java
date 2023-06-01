package com.exam.service.impl;

import com.exam.domain.User;
import com.exam.dao.UserDao;
import com.exam.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> listAll(Integer page, Integer size) {
        return userDao.getUserList((page - 1) * size, size);
    }
}
