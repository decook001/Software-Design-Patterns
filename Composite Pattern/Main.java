package com.company;

public class Main
{
    public static void main(String[] args) {
	// write your code here
        Directory book = new Directory("Book");

        Directory scifi = new Directory("SciFi");
        scifi.add(new File("Inception"));
        scifi.add(new File("Interesteller"));

        Directory thriller = new Directory("Thriller");
        thriller.add(new File("The Dark Knight"));
        thriller.add(new File("Shwashank Redemption"));

        book.add(scifi);
        book.add(thriller);

        book.ls();

    }
}
