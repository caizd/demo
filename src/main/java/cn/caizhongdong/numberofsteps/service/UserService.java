package cn.caizhongdong.numberofsteps.service;

import cn.caizhongdong.numberofsteps.domain.User;
import cn.caizhongdong.numberofsteps.dao.UserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Log log = LogFactory.getLog(UserService.class);

    @Autowired
    private UserDao userDao;


    public User retrieveOrder(int id) {
        return userDao.getUserById(id);
    }
}
