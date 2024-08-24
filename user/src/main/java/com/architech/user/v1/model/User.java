/**
 * User entity
 */


package com.architech.user.v1.model;

import java.time.Instant;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name="user")
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @NotNull(message="Username is required!")
    private String username;

    @NotNull(message="Email is required!")
    private String email;

    @NotNull(message="Password is required!")
    private String password;

    private String role;

    private Instant createdDate;

    private Instant modifiedDate;

    public User() {}

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;
    }

    public static class UserBuilder {
        private String username;
        private String email;
        private String password;
        private String role;
        
        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }
        public UserBuilder setRole(String role) {
            this.role = role;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
}
