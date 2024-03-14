package co.com.chapterback.usecase.user;

import co.com.chapterback.model.user.User;
import co.com.chapterback.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class UserUseCase {
    private final UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }

    public User getUser(String id) {
        return  userRepository.getUser(id);
    }

}
