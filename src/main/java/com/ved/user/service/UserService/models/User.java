package com.ved.user.service.UserService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "users")
@Table(name = "users")
public class User {

    @Id
    private String id;
    private String name;
    @Column(unique = true)
    private String email;
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
