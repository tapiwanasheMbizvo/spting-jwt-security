package com.tapiwanshembizvo.secureaapi.repos;


import com.tapiwanshembizvo.secureaapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {


    Role findByName(String name);
}
