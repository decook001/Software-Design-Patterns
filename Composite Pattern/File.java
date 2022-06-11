package com.company;

public class File implements AbstractFile {
    String Name;
    File(String name)
    {
        Name=name;
    }

    @Override
    public void ls() {
        System.out.println(Name);
    }
}
