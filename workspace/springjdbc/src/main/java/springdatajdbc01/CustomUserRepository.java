package springdatajdbc01;

import org.springframework.data.domain.Page;
import java.awt.print.Pageable;

public interface CustomUserRepository {
    Page<User> findAllUserWithPagination(Pageable pageable);

    Page<User> findAllUsersWithPagination(org.springframework.data.domain.Pageable pageable);
}
