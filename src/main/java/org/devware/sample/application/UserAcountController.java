package org.devware.sample.application;

import org.devware.sample.domain.model.User;
import org.devware.sample.domain.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/user")
@PreAuthorize("isAuthenticated()")
public class UserAcountController {

    private final UserService userService;

    public UserAcountController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    @PreAuthorize("hasAuthority('VIEW_USER')")
    Flux<User> listUsers(int min, int max) {
        return Flux.fromIterable(
                userService.listUsers(min, max)
        );

    }

}
