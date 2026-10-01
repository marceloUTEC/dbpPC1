package com.examplez.dbppc1.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class userService {
    private final userRepository userRepository;

    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public UserResponse create(RegisterUserRequest request){
        if(request.getUsername().isEmpty() || request.getEmail().isEmpty() || request.getPassword().isEmpty() || request.getRole().isEmpty()){
            throw new IllegalArgumentException("Username, email, password, and role cannot be blank");
        }

        user user = new user(
                request.getUsername(),
                request.getEmail(),
                request.getPassword(),
                request.getRole()
        );

        user savedUser = userRepository.save(user);
        return new UserResponse(savedUser.getId(), savedUser.getUsername(), savedUser.getEmail(), savedUser.getRole());


    }



}
