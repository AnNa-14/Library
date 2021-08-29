package com.library.exercise;

import java.io.IOException;
import java.util.List;

public interface UserRepository {
    void insert(User user);
    List<User> findAll() throws IOException, ClassNotFoundException;
    boolean existsByEmailAndPassword(String email, String password);

}
