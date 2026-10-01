package com.examplez.dbppc1.CampusEvent;
import com.examplez.dbppc1.User.user;
import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "campusEvent")
public class campusEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private ZonedDateTime eventDate;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String status;

    @ManyToMany
    @JoinColumn(name = "user")
    private user user;


}

