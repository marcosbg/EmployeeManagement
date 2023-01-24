package com.example.EmployeeManagement;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstName", nullable = false)
    @Setter
    private String firstName;

    @Column(name = "lastName", nullable = false)
    @Setter
    private String lastName;

    @Column(name = "email", nullable = false)
    @Setter
    private String email;

    @Column(name = "role", nullable = false)
    @Setter
    private String role;

    @Column(name = "salary", nullable = false)
    @Setter
    private String salary;

    @CreationTimestamp
    @Column(name = "date", nullable = false)
    @Getter
    private LocalDateTime date;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Employee employee))
            return false;

        return Objects.equals(this.id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}
