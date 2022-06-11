package com.company;

public class Application {
    Shape[] ArrayOShape = new Shape[4] ;
    Application()
    {
        ArrayOShape[0] = new Circle(10);
        ArrayOShape[1] = new Circle(34);
        ArrayOShape[2] = new Rectangle(5, 7);
        ArrayOShape[3] = new Rectangle(4, 8);


    }

    Shape[] copy()
    {
        Shape[] re=new Shape[4];
        for (int i=0;i<4;i++)
        {
            re[i]=ArrayOShape[i].cloneIt();
        }
        return re;
    }

}
