package org.devware.sample.infrastructure.impl;

import org.devware.sample.domain.model.User;
import org.devware.sample.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> listUsers(int min, int max) {
        return Arrays.asList(
                User.builder()
                        .code(1)
                        .firstName("alain")
                        .lastName("Nguidjoi Bell")
                        .Roles(Arrays.asList("ADMIN", "USER")).build(),
                User.builder()
                        .code(2)
                        .firstName("roger")
                        .lastName("Federer")
                        .Roles(Arrays.asList("ARTIST", "USER")).build(),
                User.builder()
                        .code(3)
                        .firstName("Raphael")
                        .lastName("Nadal")
                        .Roles(Arrays.asList("CREATOR", "USER")).build(),

                User.builder()
                        .code(4)
                        .firstName("Novak")
                        .lastName("Djokovich")
                        .Roles(Arrays.asList("USER")).build()

        );
    }
}
