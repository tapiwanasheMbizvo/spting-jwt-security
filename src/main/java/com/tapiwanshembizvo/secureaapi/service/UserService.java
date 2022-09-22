package com.tapiwanshembizvo.secureaapi.service;

import com.tapiwanshembizvo.secureaapi.models.AppUser;
import com.tapiwanshembizvo.secureaapi.models.Role;

import java.util.List;

public interface UserService {

    AppUser saveUser(AppUser user);
    Role saveRole (Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();

}
