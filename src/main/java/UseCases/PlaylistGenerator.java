package UseCases;
/*
 * PlaylistGenerator takes in the string of user input and generates a playlist of songs
 */


import Entities.Playlist;
import Entities.Song;

import java.util.*;

public class PlaylistGenerator {
    public static Playlist generatePlaylist( ArrayList<String> words){
        Playlist newPlaylist = new Playlist();
        List<String> wordList = (List<String>) words;
//        for (String s : words) {
//            Song song = SongGenerator.generateSong(s); //create a song entity for that song
//            // receive the song entities and instantiate a playlist entity
//            newPlaylist.addSong(song);
//        }
        int s = 0;
        int e = words.size();
        while (s < words.size()) {
            // check if no song starts with the word at index s
            if (s == e) {
                // shift the starting index to after that song
                s = s + 1;
                // shift the end index to the very back to restart the search
                e = words.size();
            }
            else {
                String songName = String.join(" ", wordList.subList(s, e));
                // System.out.println(songName);
                // make request to song generator
                Song newSong = SongGenerator.generateSong(songName);
                // check if we got a song with that name
                if (!newSong.getName().equals("")) {
                    newPlaylist.addSong(newSong);
                    // System.out.println(newSong);
                    // shift the starting index to the end
                    s = e;
                    // shift back the ending index.
                    e = words.size();
                } else {
                    // when we didn't find a song that starts with S and ends with E,
                    // we decrement the end index by 1.
                    e = e - 1;
                }
            }
        }
        return newPlaylist;
    }



}
