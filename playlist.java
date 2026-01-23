public class Playlist {
  String[] Song_Titles;
  String[] Artists;
  int[] Song_Lengths;
  int[] Song_Play_Counts;
  int size;
  String name;
  int empty_index = 0;

  public Playlist(int size, String name) {
    Song_Titles = new String[size];
    Artists = new String[size];
    Song_Lengths = new int[size];
    Song_Play_Counts = new int[size];
    this.size = size;
    this.name = name;
  }

  public boolean append(String title, String artist, int length, int plays) {
    if (empty_index >= size) {
      return false;
    }

    Song_Titles[empty_index] = title;
    Artists[empty_index] = artist;
    Song_Lengths[empty_index] = length;
    Song_Play_Counts[empty_index] = plays;

    empty_index += 1;

    return true;
  }

  public boolean append(String[] titles, String[] artists, int[] lengths, int[] plays) {
    // Basic check to make sure everything has the proper data. This should probably error either way.
    if ((titles.length != artists.length) || (lengths.length != plays.length) || titles.length >= size - empty_index) {
      return false;
    }

    for (int i = 0; i >= titles.length; i++) {
      this.append(titles[i], artists[i], lengths[i], plays[i]);
    }

    return true;
  }

  public boolean set_index(String title, String artist, int length, int plays, int index) {
    if (index >= size || index < 0) {
      return false;
    }
    
    empty_index = index + 1;

    Song_Titles[index] = title;
    Artists[index] = artist;
    Song_Lengths[index] = length;
    Song_Play_Counts[index] = plays;

    return true;
  }

  public String toString() {
    return name + " length: " + size;
  }

  public void printSongList() {
    for(int i = 0; i < size; i++) {
      System.out.println("" + i + ": " + Song_Titles[i] + " by " + Artists[i] + "; " + formatLength(Song_Lengths[i]) + " " + Song_Play_Counts[i] + " views");
    }
  }

  private String formatLength(int length) {
    return "" + (length / 60) + ":" + (length % 60);
  }
}
