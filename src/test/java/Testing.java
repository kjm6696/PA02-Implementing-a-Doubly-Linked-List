
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@SuppressWarnings("ALL")
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
        Album album2 = new Album(2, "Red Hot Chili Peppers", "Californication", 15);
        // 0 is head, 1 is tail
        dll.insert(0, album2.getAlbumSongs());
        assertEquals(album2.getAlbumSongs(), (Object)dll.head.data);
    }

    @Test
    public void testDelete(){
        LinkedList<Integer> dll = new LinkedList<>();
        Album album = new Album(1, "Michael Jackson", "Thriller", 9);
        dll.append(album.getAlbumSongs());
        Album album2 = new Album(2, "Red Hot Chili Peppers", "Californication", 15);
        dll.append(album2.getAlbumSongs());
        dll.delete(0);
        assertNull(dll.head);
    }

    @Test
    public void testGetIndex(){
        LinkedList<Integer> dll = new LinkedList<>();
        Album album = new Album(1, "Michael Jackson", "Thriller", 9);
        dll.append(album.getAlbumSongs());
        Album album2 = new Album(2, "Red Hot Chili Peppers", "Californication", 15);
        dll.append(album2.getAlbumSongs());
        assertEquals(0, dll.getIndex(album.albumSongs));
        assertEquals(1, dll.getIndex(album2.albumSongs));
    }

    @Test
    public void testToString() {
        LinkedList<String> dll = new LinkedList<>();
        assertEquals("NULL", dll.toString());
        Album album = new Album(1, "Michael Jackson", "Thriller", 9);
        dll.append(album.toString());
        assertEquals("9 -> NULL", dll.toString());
        Album album2 = new Album(2, "Red Hot Chili Peppers", "Californication", 15);
        dll.append(album2.toString());
        assertEquals("15 -> NULL", dll.toString());


    }

    @Test
    public void testShuffle(){
        LinkedList<String> dll = new LinkedList<>();
        Album album = new Album(1, "Michael Jackson", "Thriller", 9);
        dll.append(album.toString());
        Album album2 = new Album(2, "Red Hot Chili Peppers", "Californication", 15);
        dll.append(album2.toString());
        assertEquals("15 -> 9 -> NULL", dll.shuffle(dll.tail.data));
    }


}
