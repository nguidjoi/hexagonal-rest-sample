package org.devware.sample.domain.service;

import org.devware.sample.domain.model.User;
import java.util.List;

public interface UserService {
    List<User> listUsers(int min, int max);
}
