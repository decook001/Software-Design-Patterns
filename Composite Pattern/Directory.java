package com.company;

import java.util.ArrayList;

public class Directory implements AbstractFile {
    String Name;
    int ind =0;
    AbstractFile [] Files = new AbstractFile[100];

    Directory(String name)
    {
        Name=name;
    }

    void add(AbstractFile file)
    {
        if(ind<100)
            Files[ind++]=file;
    }

    void delete()
    {
        if(ind>0)
            ind--;
    }

    @Override
    public void ls()
    {
        System.out.println(Name);
        for(int i=0;i<ind;i++)
        {
            Files[i].ls();
        }
    }
}
