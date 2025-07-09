package java8;
interface DAO{
    void login();
}
public class DaoImpl implements DAO {
    public void login(){
        System.out.println("login successful");
    }

    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        dao.login();
    }
}
