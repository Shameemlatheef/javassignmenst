package com.masai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
       // Song f=new Song();
        Playlist a=new Playlist();
        System.out.println("Enter no of songs");

        int i=d.nextInt();
        for(int j=0;j<i;j++){
            System.out.println("enter moviename");
            String movie=d.next();
            System.out.println("ENter the song name");
            String son=d.next();
            Song g=new Song(movie,son);

            a.addSong(g);
            //g.play();
            System.out.println("============");
        }

for(Song j:a.songs){
    j.play();
}
    }
}

