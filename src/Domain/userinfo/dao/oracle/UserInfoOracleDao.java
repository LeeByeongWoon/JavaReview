package Domain.userinfo.dao.oracle;

import Domain.userinfo.UserInfo;
import Domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into Oracle UserId: "+userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Oracle UserId: "+userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into Oracle UserId: "+userInfo.getUserId());
    }
}
