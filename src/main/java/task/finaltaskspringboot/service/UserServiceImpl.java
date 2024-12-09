package task.finaltaskspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.finaltaskspringboot.models.User;
import task.finaltaskspringboot.repository.UserDAO;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
    userDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
    userDAO.save(user);
    }

//    @PostConstruct
//    public void addFirstUserInTable() {
//        if (userDAO.getAllUser().isEmpty()){
//        User user1 = new User("Artem", "sdasd@dsafsd.ru","admin");
//        User user2 = new User("Alex", "sdsdsdd@dsafjh.by","user");
//        userDAO.saveUser(user1);
//        userDAO.saveUser(user2);}}
}
