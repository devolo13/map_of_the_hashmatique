import java.util.HashMap;

public class TrackList {
    public HashMap<String, String> generateTrackList (){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Ripped Pants", "All just because I ripped my pants.");
        trackList.put("Jellyfish Jam", "AYE!");
        trackList.put("F.U.N.", "F is for friends who do stuff together.");
        trackList.put("Texas", "The ocean's no place for a squirrel.");
        return trackList;
    }

    public Object getOneSong(String title){
        HashMap<String, String> songs = generateTrackList();
        String song = title + ": " + songs.get(title);
        return song;
    }

    public Object getOneSong(String title, HashMap<String, String> trackList){
        HashMap<String, String> songs = trackList;
        String song = title + ": " + songs.get(title);
        return song;
    }

    public void printAllSongs(){
        HashMap<String, String> songs = generateTrackList();
        songs.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

