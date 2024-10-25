import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        Set<String> set = new HashSet<>();
        
        for (String dir : folder) {
            // Check if the current directory is a subfolder of any existing folder in the set
            boolean isSubfolder = false;
            for (String existing : set) {
                if (dir.startsWith(existing + "/")) {
                    isSubfolder = true;
                    break;
                }
            }
            // If it's not a subfolder, add it to the set
            if (!isSubfolder) {
                set.add(dir);
            }
        }
        
        return new ArrayList<>(set);
    }
}