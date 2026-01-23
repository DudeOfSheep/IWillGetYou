public class manager {
  public static void main(String[] args) {
    Playlist Teto = new Playlist(6, "Teto!!!");
    System.out.println(Teto);

    Teto.append("Teto Territory", "Cegook", 228, 2000000000);
    Teto.append("Bird Brain", "Jamie Page", 256, 8156);

    Teto.printSongList();

    Teto.set_index(0, "Bird Brain", "Jamie Page", 256, 8156);

    Teto.printSongList();
  }
}
