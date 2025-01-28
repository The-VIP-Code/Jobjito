package dev.thevipcode.jobjito.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "user_address")
    private String userAddress;
    
    @Column(name = "user_email", unique = true)
    private String userEmail;
    
    @Column(name = "user_phone")
    private String userPhone;
    
    @Column(name = "user_password")
    private String userPassword;
    
    @Enumerated(EnumType.STRING)
    private UserRole userRole;


}