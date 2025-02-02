package UseCases;/*
Unit tests for PlaylistManager.java
*/
import UseCases.PlaylistManager;
import Entities.Playlist;
import Entities.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlaylistManagerTest {
    PlaylistManager manager;
    Playlist playlist1;
    Playlist playlist2;
    User user;

    @Before
    public void setUp(){
        manager = new PlaylistManager();
        //TODO: Make the constructor of Playlist public
        playlist1 = new Playlist("playlist1");
        playlist2 = new Playlist("playlist2");
        user = new User("username", "password");
    }

    @After
    public void tearDown(){

    }

    @Test
    public void testAddPlaylist(){
        boolean success = manager.addPlaylist(playlist1, user);
        assert(success);
    }

    @Test
    public void testRemovePlaylistSuccess(){
        manager.addPlaylist(playlist1, user);
        boolean success = manager.removePlaylist(playlist1, user);
        assert(success);
    }

    @Test
    public void testRemovePlaylistFailure(){
        manager.addPlaylist(playlist1, user);
        boolean success = manager.removePlaylist(playlist2, user);
        assert(!success);
    }

}
