package runescape;


import java.time.LocalDateTime;
import java.util.List;

public class Graph {
    public int id;
    public List<Pair<LocalDateTime, Float>> daily;
    public List<Pair<LocalDateTime, Float>> average;
}
