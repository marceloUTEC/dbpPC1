package com.examplez.dbppc1.TicketType;
import com.examplez.dbppc1.CampusEvent.campusEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface ticketTypeRepository extends JpaRepository<ticketType, Long>{

    Optional<ticketType> findByTicketTypeUsername(String username);
    boolean existsByTicketTypeUsername(String username);
}