package runescape;

public class UrlConstants {
    public static String URL_PREFIX = "https://secure.runescape.com/m=itemdb_rs/api/";
    public static String INFO_SUFFIX = "info.json";
    public static String CATALOGUE_SUFFIX = "catalogue/category.json?category={CATEGORY_ID}";
    public static String ITEM_SUFFIX = "catalogue/items.json?category={CATEGORY_ID}&alpha={ALPHA}&page={PAGE_ID}";
    public static String DETAIL_SUFFIX = "catalogue/detail.json?item={ITEM_ID}";
    public static String GRAPH_SUFFIX = "graph/{ITEM_ID}.json";
    public static String WIKI_PREFIX = "https://runescape.wiki/w/Module:Exchange/{ITEM_NAME}/Data";
    public static String WEIRD_GLOOP_PREFIX = "https://api.weirdgloop.org/exchange/history/rs/sample?compress=true&id={ITEM_ID}";

    public static String ITEM_ID_REPLACE = "{ITEM_ID}";
    public static String CATEGORY_ID_REPLACE = "{CATEGORY_ID}";
    public static String PAGE_ID_REPLACE = "{PAGE_ID}";
    public static String ALPHA_REPLACE = "{ALPHA}";
    public static String ITEM_NAME_REPLACE = "{ITEM_NAME}";
}
