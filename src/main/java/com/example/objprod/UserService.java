package com.example.objprod;

import com.example.objprod.entities.Role;
import com.example.objprod.entities.User;
import com.example.objprod.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
//@Data
//@Accessors(chain = true)
public class UserService implements UserDetailsService {
     @Autowired
     UserRepository userRepo;


     @Autowired
     BCryptPasswordEncoder bCryptPasswordEncoder;
//    public void addUser(){
//
//    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByLogin(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return user;
    }
    public User findUserById(Long userId) {
        Optional<User> userFromDb = userRepo.findById(userId);
        return userFromDb.orElse(new User());
    }

    public List<User> allUsers() {
        return userRepo.findAll();
    }

    public boolean saveUser(User user,String role) {
        User userFromDB = userRepo.findByLogin(user.getUsername());

        if (userFromDB != null) {
            return false;
        }
        if (role.equals("ROLE_DOCTOR"))
        user.setRoles(Collections.singleton(new Role(2L, role)));
        if (role.equals("ROLE_USER"))
            user.setRoles(Collections.singleton(new Role(1L, role)));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return true;
    }

    public boolean deleteUser(Long userId) {
        if (userRepo.findById(userId).isPresent()) {
            userRepo.deleteById(userId);
            return true;
        }
        return false;
    }

    public String getCurrentUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }

//    public List<User> usergtList(Long idMin) {
//        return em.createQuery("SELECT u FROM User u WHERE u.id > :paramId", User.class)
//                .setParameter("paramId", idMin).getResultList();
//    }
}
