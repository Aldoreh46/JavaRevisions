import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        
        Set<String> list3 = new LinkedHashSet<String>();
        list3.addAll(Arrays.asList(names1));
        list3.addAll(Arrays.asList(names2));
        String array3[] = list3.toArray(new String[list3.size()]);

        return array3;
    }

    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}