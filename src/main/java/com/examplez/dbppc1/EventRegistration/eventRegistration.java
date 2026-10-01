package com.examplez.dbppc1.EventRegistration;
import com.examplez.dbppc1.CampusEvent.campusEvent;
import com.examplez.dbppc1.TicketType.ticketType;
import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "evenRegistration")
public class eventRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private ZonedDateTime registeredAt;

    @Column
    private String status;


    @ManyToOne
    @JoinColumn(name = "campusEvent_id")
    private campusEvent campusEvent;

     @ManyToMany
    @JoinColumn(name = "ticketType_id")
    private ticketType ticketType;

}

