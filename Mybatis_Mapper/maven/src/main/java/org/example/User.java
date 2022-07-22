package org.example;

public class User {
    private static String users;
    private static String brithy;
    private static Integer passwords;
    private static Integer id;
    private static Integer ids;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        User.id = id;
    }

    @Override
    public String toString() {
        return "stu { "+"user= "+getUsers()+"\n"+"brithy= "+getBrithy()+"\n"+"passwords= "+getPasswords()+"\n"+
                "id= "+getId()+"\n"+"ids= "+getIds();
    }

    public static String getUsers() {
        return users;
    }

    public static void setUsers(String users) {
        User.users = users;
    }

    public static Integer getPasswords() {
        return passwords;
    }

    public static void setPasswords(Integer passwords) {
        User.passwords = passwords;
    }

    public static Integer getIds() {
        return ids;
    }

    public static void setIds(Integer ids) {
        User.ids = ids;
    }

    public static String getBrithy() {
        return brithy;
    }

    public static void setBrithy(String brithy) {
        User.brithy = brithy;
    }


}
