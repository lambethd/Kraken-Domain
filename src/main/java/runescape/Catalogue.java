package runescape;

import domain.IDocument;

import java.util.List;

public class Catalogue implements IDocument {
    public List<ItemCategory> types;
    public List<LetterGroup> alpha;
}
