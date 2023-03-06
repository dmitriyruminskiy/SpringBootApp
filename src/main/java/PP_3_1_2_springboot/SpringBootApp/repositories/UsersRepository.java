package PP_3_1_2_springboot.SpringBootApp.repositories;

import PP_3_1_2_springboot.SpringBootApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsersRepository extends JpaRepository<User, Integer> {
}
