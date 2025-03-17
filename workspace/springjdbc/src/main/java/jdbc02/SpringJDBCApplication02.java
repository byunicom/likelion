package jdbc02;

import jdbc01.User;
import jdbc02.dao.Dept;
import jdbc02.dao.DeptDao;
import jdbc02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class SpringJDBCApplication02 implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBCApplication02.class, args);
    }

//    @Autowired
//    private UserDao userDao;

    @Autowired
    private DeptDao deptDao;

    @Override
    public void run(String... args) throws Exception {
//        //insert dept
//        deptDao.insertDept(new Dept(null, "comp","haman"));
//        //update dept
//        deptDao.updateDept(new Dept(1, "computer","Haman"));
////        delete dept
//        deptDao.deleteDept(1);
        //select dept
        List<Dept> deptList = deptDao.findAllDept();
        for(Dept dept:deptList){
            System.out.println(dept);
        }

        //두개의 값이 다르면
        RowMapper<Dept> rowMapper = new RowMapper<Dept>() {
            @Override
            public Dept mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Dept(){

                };
            }
//            @Override
//            public jdbc01.User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new User(
//                        rs.getLong("id"),
//                        rs.getString("name"),
//                        rs.getString("email")
//                );
//            }
        };

//        //insert test
//        userDao.insertUser(new User(null, "kang","kang@exam.com"));
//        //update test
//        userDao.updateUserEmail("kang","kang22@exam.com");
//        //delete test
//        userDao.deleteUser("kang");
//        //select test
//        List<User> users = userDao.findAllUsers();
//        for(User user:users){
//            System.out.println(user);
//        }
    }
}
