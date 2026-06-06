package com.e_commerce.E_Commerce.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", nullable = false)
        private Long id;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "age", nullable = false)
        private int age;

        @Column(name = "email", nullable = false)
        private String email;

        @Column(name = "phone", nullable = false)
        private String phone;


}
