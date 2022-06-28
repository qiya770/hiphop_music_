package com.xuhuaze.music.service;

import com.xuhuaze.music.domain.Consumer;

import java.util.List;
/*
* 前端用户service类
* */
public interface ConsumerService {
    /*
     * 增加
     * */
    public boolean insert(Consumer consumer);

    /*
     * 修改
     * */
    public boolean update(Consumer consumer);

    /*
     * 删除
     * */
    public boolean delete(Integer id);

    /*
     * 根据主键查询整个对象
     * */
    public Consumer selectByPrimaryKey(Integer id);

    /*
     * 查询所有用户
     * */
    public List<Consumer> allConsumer();

    /*
     * 根据账号查询
     * */
    public Consumer getByUserName(String username);

    /*
     * 验证密码
     * */
    public boolean verifyPassword(String username,String password);
}
