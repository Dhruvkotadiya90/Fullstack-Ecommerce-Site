package User;
import java.util.List;

public interface IService {

    List<User> getAllUser();

    User saveUser(User user);

    void removeUser(Long id);


}
