package com.examplez.dbppc1.CampusEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface campusEventRepository extends JpaRepository<campusEvent, Long>{

    Optional<campusEvent>findByCampusEventUsername(String username);

    boolean existsByCampusEventUsername(String username);

}
