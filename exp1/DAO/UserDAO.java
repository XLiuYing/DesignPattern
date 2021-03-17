package DAO;

import Utils.DBUtil;

import java.sql.Connection;

public class UserDAO {

    private DBUtil db;

    public Boolean findUser(String username, String userPassword){
        db = new DBUtil();
        Connection conn = db.getConnection();
        System.out.println("查询成功！");
        return true;
    }
}
