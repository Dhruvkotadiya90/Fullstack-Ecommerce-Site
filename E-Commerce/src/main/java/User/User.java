package User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", nullable = false)
        private long id;

        @Column(name = "Name", nullable = false)
        private String name;

        @Column(name = "age", nullable = false)
        private int age;

        @Column(name = "email", nullable = false)
        private String email;

        @Column(name = "phone", nullable = false)
        private double phone;


}
