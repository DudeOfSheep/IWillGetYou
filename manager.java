public class manager {
  public static void main(String[] args) {
    Playlist Teto = new Playlist(6, "Teto!!!");
    System.out.println(Teto);

    Teto.append("Teto Territory", "Cegook", 228, 2000000000);
    Teto.append("Bird Brain", "Jamie Page", 256, 8156);

    Teto.printSongList();

    Teto.set_index(0, "Bird Brain", "Jamie Page", 256, 8156);

    Teto.printSongList();
    Teto.mostViewed();
    Teto.leastViewed();
    Teto.longestLength();
    Teto.shortestLength();
    System.out.println(Teto.getTotalLength());
    System.out.println("Songs greater than 2:50: " + Teto.countByLength(230));
    Teto.reccomendSong();
  }
}
