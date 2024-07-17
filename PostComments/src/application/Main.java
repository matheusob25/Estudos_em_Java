package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime postDate = LocalDateTime.parse("21/06/2018 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        LocalDateTime postDate2 = LocalDateTime.parse("21/06/2018 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        Scanner sc = new Scanner(System.in);
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(postDate, "Traveling to new Zeland", "I'm going to visit this wonderful country!", 12);
        p1.addComments(c1);
        p1.addComments(c2);


        System.out.println(p1);
//        System.out.println(postDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));



        sc.close();
    }
}