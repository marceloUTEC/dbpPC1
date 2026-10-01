package com.examplez.dbppc1.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface userRepository extends JpaRepository<user, Long>{

    Optional<user>findByUsername(String username);

    boolean existsByUsername(String username);

}
