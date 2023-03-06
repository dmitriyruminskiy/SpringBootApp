package PP_3_1_2_springboot.SpringBootApp.services;

import PP_3_1_2_springboot.SpringBootApp.entities.User;

import java.util.List;

public interface UsersService {
    public List<User> findAll();
    public User findOne(int id);
    public void save(User user);
    public void update(int id, User updatedUser);
    public void delete(int id);

}
