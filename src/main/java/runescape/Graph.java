package runescape;


import domain.IDocument;

import java.time.LocalDateTime;
import java.util.List;

public class Graph implements IDocument {
    public int id;
    public List<Pair<LocalDateTime, Float>> daily;
    public List<Pair<LocalDateTime, Float>> average;
    public int lastUpdatedRuneDay;
}
