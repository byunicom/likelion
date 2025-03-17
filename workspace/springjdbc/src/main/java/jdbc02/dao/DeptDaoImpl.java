package jdbc02.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class DeptDaoImpl implements DeptDao {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public void insertDept(Dept dept) {
        String sql="INSERT INTO dept (dept_name, location) VALUES (?,?)";
        jdbcTemplate.update(sql, dept.getDeptName(),dept.getLocation());
    }

    @Override
    public List<Dept> findAllDept() {
//        return List.of();
        return jdbcTemplate.query("SELECT * FROM dept", new BeanPropertyRowMapper<>(Dept.class));
    }

    @Override
    public void updateDept(Dept dept) {
        String sql = "UPDATE dept SET dept_name=?, location=? WHERE dept_no=?";
        jdbcTemplate.update(sql, dept.getDeptName(), dept.getLocation(), dept.getId());
    }

    @Override
    public void deleteDept(Integer id) {
        String sql = "DELETE FROM dept WHERE dept_no=?";
        jdbcTemplate.update(sql,id);
    }
}
