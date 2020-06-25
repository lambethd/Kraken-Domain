package runescape;

import domain.IDocument;

public class Runeday implements IDocument {
    public Integer lastConfigUpdateRuneday;

    public Runeday() {
    }

    public Runeday(Integer lastConfigUpdateRuneday) {
        this.lastConfigUpdateRuneday = lastConfigUpdateRuneday;
    }
}
