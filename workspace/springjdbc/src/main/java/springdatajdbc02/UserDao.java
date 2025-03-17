package springdatajdbc02;

public interface UserDao {
    void createAndUpdateUser(String name, String email, String newEmail);
}
