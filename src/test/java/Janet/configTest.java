package Janet;

public class configTest {
    public static void main (String[] args) {
        Config config = new Config();

        try {
            config.saveIntoKB(KnowledgeBase.getInstance());
        } catch (IllegalAccessException e) {
            System.out.println("Janet is unable to save current knowledge base.");
            e.printStackTrace();
        }
    }
}
