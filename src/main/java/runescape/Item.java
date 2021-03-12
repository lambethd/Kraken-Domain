package runescape;

import domain.IDocument;
import org.springframework.data.annotation.Id;

public class Item implements IDocument {
    public String iconLink;
    public String largeIconLink;
    @Id
    public Integer id;
    public ItemCategory type;
    public String typeIconLink;
    public String name;
    public String description;
    public ItemMovement current;
    public ItemMovement today;
    public Boolean members;
    public Integer lastUpdatedRuneDay;
    public String wikiName;
    public Integer buyingLimit;
}
