package com.example.demo.domain.repository.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;

    @Column
    private String email;

    @Column(nullable = false)
    private Boolean is_valid;
}
