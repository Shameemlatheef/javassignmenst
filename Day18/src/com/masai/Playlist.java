package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    public List<Song> songs = new ArrayList<>();
    public void addSong(Song song){


//           if (songs.contains(song)) {
//               System.out.println("alrready added");
//           }
        if(songs.contains(song)){
            System.out.println("alrready added");
        }
           else {
               songs.add(song);
               System.out.println("song added succesfully");
           }

    }
}
