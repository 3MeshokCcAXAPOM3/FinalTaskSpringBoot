package task.finaltaskspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task.finaltaskspringboot.models.User;

import java.util.List;

public interface UserDAO extends JpaRepository <User, Long> {
//    List<User> getAllUser();
//    User getUserById(long id);
//    void saveUser(User user);
//    void deleteUser(long id);
//    void updateUser(User user);


}
