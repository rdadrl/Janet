package Janet;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeBase {
    private static KnowledgeBase globalInstance = new KnowledgeBase();

    public static KnowledgeBase getInstance() {
        return globalInstance;
    }

    private KnowledgeBase() {
    }

    public static List<String> knownLanguages = new ArrayList<String>();
}
