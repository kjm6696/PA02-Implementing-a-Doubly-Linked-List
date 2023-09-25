import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Testing {
    @Test
    public void testAppend() {
        LinkedList<Integer> dll = new LinkedList<>();
        Album album = new Album(1, "Michael Jackson", "Thriller", 9);
        assertNull(dll.head);
        dll.append(album.getAlbumSongs());
        System.out.println(album.getAlbumSongs());
        assertEquals(album.getAlbumSongs(), (Object)dll.head.data);
    }

    @Test
    public void testInsert(){
        LinkedList<Integer> dll = new LinkedList<>();
        Album album = new Album(1, "Michael Jackson", "Thriller", 9);
        dll.append(album.getAlbumSongs());
        Album album2 = new Album(1, "Red Hot Chili Peppers", "Californication", 15);
        // 0 is head, 1 is tail
        dll.insert(0, album2.getAlbumSongs());
        assertEquals(album2.getAlbumSongs(), (Object)dll.head.data);
    }
}
