package com.xuhuaze.music.service.impl;

import com.xuhuaze.music.dao.ConsumerMapper;
import com.xuhuaze.music.domain.Consumer;
import com.xuhuaze.music.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* 前端用户service实现类
* */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private ConsumerMapper consumerMapper;
    @Override
    public boolean insert(Consumer consumer) {
        return consumerMapper.insert(consumer)>0;
    }

    @Override
    public boolean update(Consumer consumer) {
        return consumerMapper.update(consumer)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return consumerMapper.delete(id)>0;
    }

    @Override
    public Consumer selectByPrimaryKey(Integer id) {
        return consumerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Consumer> allConsumer() {
        return consumerMapper.allConsumer();
    }

    @Override
    public Consumer getByUserName(String username) {
        return consumerMapper.getByUserName(username);
    }

    @Override
    public boolean verifyPassword(String username, String password) {
        return consumerMapper.verifyPassword(username,password)>0;
    }
}
