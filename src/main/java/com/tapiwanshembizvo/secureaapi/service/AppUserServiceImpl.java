package com.tapiwanshembizvo.secureaapi.service;

import com.tapiwanshembizvo.secureaapi.models.AppUser;
import com.tapiwanshembizvo.secureaapi.models.Role;
import com.tapiwanshembizvo.secureaapi.repos.AppUserRepository;
import com.tapiwanshembizvo.secureaapi.repos.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements  UserService{

    private final AppUserRepository appUserRepository;
    private  final RoleRepository roleRepository;


    @Override
    public AppUser saveUser(AppUser user) {
        log.info("SAVING  user "+ user+ " TO the db ");
       return  appUserRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {

        log.info("SAVING role "+ role+ " TO the db ");
        return  roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

        log.info("ADD new role {} to user {}", roleName, username);
        AppUser user = appUserRepository.findUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("GETTING USER "+ username);
        return  appUserRepository.findUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {

        log.info("Get all users ");
      return   appUserRepository.findAll();
    }
}
