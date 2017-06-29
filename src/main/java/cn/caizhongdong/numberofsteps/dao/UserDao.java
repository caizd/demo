package cn.caizhongdong.numberofsteps.dao;


import cn.caizhongdong.numberofsteps.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    public User getUserById(@Param(value="id") int id);
}
