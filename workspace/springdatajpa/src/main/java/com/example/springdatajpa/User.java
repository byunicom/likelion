package com.example.springdatajpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="jpa_user")
@ToString   //jpa 사용시 주의해서 사용할 것.
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public User(String name, String email){
        this.name=name;
        this.email=email;
    }

}
