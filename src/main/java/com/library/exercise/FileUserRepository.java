package com.library.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileUserRepository implements UserRepository{
    private static final String FILENAME = "user.data";

    @Override
    public void insert(User user) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream (FILENAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
