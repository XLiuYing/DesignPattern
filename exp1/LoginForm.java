import DAO.UserDAO;

public class LoginForm {
    private UserDAO dao;

    public void init(){
        System.out.println("初始化成功！");
        dao = new UserDAO();
        dao.findUser("a", "b");
    }

    public void display(){
        System.out.println("成功显示...");
    }

    public void validate(){
        System.out.println("验证成功！");
    }

}
