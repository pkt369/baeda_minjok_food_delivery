package sjcm.foodDelivery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import sjcm.foodDelivery.Repository.UserRepository;
import sjcm.foodDelivery.domain.Address;
import sjcm.foodDelivery.domain.User;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
@Transactional
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testUser() {
        User user = new User("userA", 20, new Address("city", "10", "10"));
        User savedUser = userRepository.save(user);

        Optional<User> find = userRepository.findById(savedUser.getId());

        Assertions.assertThat(find.get()).isEqualTo(user);
    }
}
