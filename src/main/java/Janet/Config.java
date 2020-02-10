package Janet;

import betterLog.out;

import java.lang.reflect.Field;
import java.util.List;

public class Config {
    private KnowledgeBase kb;

    public Config() {

    }

    public void loadFromKB() {

    }

    public void saveIntoKB(KnowledgeBase kb) throws IllegalAccessException {
        Field[] fields = KnowledgeBase.class.getFields();

        betterLog.out.log("Reconstructing memory from Knowledge Base...");
        for (Field field : fields) {
            if (field.getType() == java.util.List.class) {
                betterLog.out.success("Found memory: " + out.ANSI_BLUE + field.getName() + out.ANSI_GREEN +", as a list.");
                List v = (List) field.get(kb);
                for (int i = 0; i < v.size(); i++) {
                    System.out.println(v.get(i));
                }
            }

        }
    }

}
