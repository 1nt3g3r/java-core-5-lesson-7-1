package interfaces.thesamemethod.tags;

public class TagTest {
    public static void main(String[] args) {
        useTagA(new Tagged());
        useTagB(new Tagged());

        Object o = null;

        if(o instanceof TagB) {
            //do smth
        } else if (o instanceof TagA) {
            //do another
        }

    }

    public static void useTagA(TagA item) {
        //todo smth with item
    }

    public static void useTagB(TagB item) {
        //todo smth with item
    }
}
