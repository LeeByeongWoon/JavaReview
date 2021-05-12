package Domain.web.userinfo;

import Domain.userinfo.UserInfo;
import Domain.userinfo.dao.UserInfoDao;
import Domain.userinfo.dao.mysql.UserInfoMysqlDao;
import Domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbtype = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("tfh100");
        userInfo.setPassword("asd123");
        userInfo.setUserName("lee");

        UserInfoDao userInfoDao = null;
        if (dbtype.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbtype.equals("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
