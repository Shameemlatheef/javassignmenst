package com.masai;

import java.util.Objects;

public class Song {
    private String moviename;
    private String songname;

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(moviename, song.moviename) && Objects.equals(songname, song.songname);
//        Song s1=this;
//        Song s2=(Song)o;
//        return s1.getMoviename().equalsIgnoreCase(s2.getMoviename())&&s1.getSongname().equalsIgnoreCase(s2.getSongname());
      }

    @Override
    public int hashCode() {
        return Objects.hash(moviename, songname);
    }

    public Song() {
    }

    public Song(String moviename, String songname) {
        this.moviename = moviename;
        this.songname = songname;
    }
    public void play(){
        System.out.println(songname+" of "+moviename);
    }
}
