package com.examplez.dbppc1.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface eventRegistrationRepository extends JpaRepository<eventRegistration, Long>{

    Optional<eventRegistration> eventRegistrationByUsername(String username);
    boolean existsByEventRegistrationUsername(String username);

}