package jdbc02.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
//final 이라고 붙어있는 생성자만 추가해주는 어노테이션.
// 가장 많이 사용하는 조합
@Repository
public class UserDaoImpl implements UserDao{
    private final JdbcTemplate jdbcTemplate;

    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getEmail());
    }

    @Override
    public List<User> findAllUsers() {
        return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void updateUserEmail(String name, String email) {
        String sql = "UPDATE users SET email=? WHERE name=?";
        jdbcTemplate.update(sql,email, name);
    }

    @Override
    public void deleteUser(String name) {
        String sql = "DELETE FROM users WHERE name=?";
        jdbcTemplate.update(sql,name);
    }
}
