package com.examplez.dbppc1.User;
import jakarta.persistence.*;
import lombok.*;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String password;

    public user(
            String username,
            String email,
            String role,
            String password
    ){
        this.username = username;
        this.email = email;
        this.role = role;
        this.password = password;
    }


}

