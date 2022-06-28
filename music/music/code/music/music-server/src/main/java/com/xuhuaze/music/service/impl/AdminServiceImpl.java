package com.xuhuaze.music.service.impl;

import com.xuhuaze.music.dao.AdminMapper;
import com.xuhuaze.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class AdminServiceImpl implements AdminService {
        @Autowired
        private AdminMapper adminMapper;
    @Override
    public boolean verifyPassword(String username, String password) {
        return adminMapper.verifyPassword(username, password)>0;
    }
}
