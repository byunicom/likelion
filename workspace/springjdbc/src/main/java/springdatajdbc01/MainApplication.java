package springdatajdbc01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    @Bean
    public Book book(){
        return new Book();
    }

    @Bean
    public CommandLineRunner batchUpdateDemo(JdbcTemplate jdbcTemplate){
        //위 코드를 람다식을 이용ㅇ해서 간편하게 써준다면...
        return args -> {

            List<User> users = Arrays.asList(
                    new User("kang","kang@exam.com"),
                    new User("hong","hong@exam.com"),
                    new User("kim","kim@exam.com"),
                    new User("lee","lee@exam.com")
            );

            String sql = "INSERT INTO users(name, email) VALUES(?,?)";
            jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    User user = users.get(i);
                    ps.setString(1,user.getName());
                    ps.setString(2,user.getEmail());
                }

                @Override
                public int getBatchSize() {
                    return users.size();
                }
            });

        };
    }
}
