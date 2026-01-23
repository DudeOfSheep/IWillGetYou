public class playlist {
  String[] Song_Titles;
  String[] Artists;
  int[] Song_Lengths;
  int[] Song_Play_Counts;
  int size;
  String name;
  int empty_index = 0;

  public playlist(int size, String name) {
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

  public boolean set_index(String title, String artist, int length, int plays, int index) {
    if (index >= size || index < 0) {
      return false;
    }

    Song_Titles[index] = title;
    Artists[index] = artist;
    Song_Lengths[index] = length;
    Song_Play_Counts[index] = plays;

    return true;
  }
}
