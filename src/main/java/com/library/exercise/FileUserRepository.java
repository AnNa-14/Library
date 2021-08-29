package com.library.exercise;

import java.io.*;
import java.util.List;

public class FileUserRepository implements UserRepository{
    private static final String FILENAME = "user.data";


    @Override
    public void insert(User user) {

        List<User>users = findAll ();
        users.add(user);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream (FILENAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

    @Override
    public List<User> findAll() {


        try {

            FileInputStream fileInputStream = new FileInputStream (FILENAME);
            try (ObjectInputStream objectInputStream = new ObjectInputStream (fileInputStream)) {
                Object object = objectInputStream.readObject ();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace ();




    }
        return null;
    }
}
