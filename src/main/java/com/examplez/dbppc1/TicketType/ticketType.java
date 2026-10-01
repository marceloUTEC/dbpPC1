package com.examplez.dbppc1.TicketType;
import com.examplez.dbppc1.CampusEvent.campusEvent;
import jakarta.persistence.*;
import lombok.*;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "ticketType")
public class ticketType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Integer registeredCount;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "campusEvent_id")
    private campusEvent campusEvent;


}

