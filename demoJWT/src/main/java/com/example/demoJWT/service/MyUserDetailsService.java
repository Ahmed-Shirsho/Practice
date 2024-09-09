package com.example.demoJWT.service;

import com.example.demoJWT.model.UserPrincipals;
import com.example.demoJWT.model.Users;
import com.example.demoJWT.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService  implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);

        if(user == null){
            System.out.println("Usre not found");
            throw new UsernameNotFoundException("User not found");

        }
        return new UserPrincipals(user);
    }
}
