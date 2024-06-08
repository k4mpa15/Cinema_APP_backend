package pl.wat.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.backend.entity.User;
import pl.wat.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean registerUser(String email, String password, String name, String surname, String phone) {
        if (userRepository.existsByEmail(email)) {
            return false;
        }

        User user = new User();
        user.setEmail(email);
        user.setPasswordHash(password); // pamiętaj, aby hasło zaszyfrować przed zapisaniem
        user.setName(name);
        user.setSurname(surname);
        user.setPhone(phone);

        userRepository.save(user);
        return true;
    }
}
