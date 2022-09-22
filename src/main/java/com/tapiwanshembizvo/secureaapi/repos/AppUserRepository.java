package com.tapiwanshembizvo.secureaapi.repos;

import com.tapiwanshembizvo.secureaapi.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository<AppUser, Long> {


    AppUser findUsername(String username);
}
