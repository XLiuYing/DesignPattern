public class LoginForm {

    private AbstractButton button;

    public void display() {
        button = new RectangleButton();
        Class c1 = null;
        c1 = button.getClass();
        System.out.println("当前使用的按钮类的类名为：");
        System.out.println(c1.getName());
        button = new CircleButton();
        Class c2 = null;
        c2 = button.getClass();
        System.out.println("当前使用的按钮类的类名为：");
        System.out.println(c2.getName());
    }
}
