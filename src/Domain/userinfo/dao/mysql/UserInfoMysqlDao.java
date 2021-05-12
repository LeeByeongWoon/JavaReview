package Domain.userinfo.dao.mysql;

import Domain.userinfo.UserInfo;
import Domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into Mysql UserId: "+userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Mysql UserId: "+userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from Mysql UserId: "+userInfo.getUserId());
    }
}
