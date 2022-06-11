package com.company;

public class Database {

    private static Database  database;

    private Database(){}

    public void call()
    {
        System.out.println("db is calling");
    }

    public static Database getInstance()
    {
        if(database==null)
        {
            database=new Database();
        }
        return database;
    }

}
