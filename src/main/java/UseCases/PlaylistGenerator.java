package UseCases;
/*
* PlaylistGenerator takes in the string of user input and generates a playlist of songs
*/


import java.util.*;

public class PlaylistGenerator {

    //do i return this like this?
    public <Playlist> generatePlaylist( ArrayList<String> songs){
        for (String s : songs) {
            SongGenerator(s); //create a song entity for that song
            // recieve the song entities and instantiate a playlist entity
            Playlist

}

//