/**
 * User Repository
 */

package com.architech.user.v1.repository;

import com.architech.user.v1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
}
