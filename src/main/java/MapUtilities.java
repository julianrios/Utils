import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapUtilities {
    private Map<String, String> routes = new TreeMap<>();

//    public Router() {
//        this.routes = new HashMap<>();
//    }

    public void add(String path, String controller) {
        this.routes.put(path, controller);
    }

    public Integer size() {
        return this.routes.size();
    }

    public String getController(String path) {
        return this.routes.get(path);
    }

    public void update(String path, String studentController) {
        this.routes.put(path, studentController);
    }

    public void remove(String path) {
        this.routes.remove(path);
    }

    @Override
    public String toString() {
//        For HashMap
//        String pathName = "";
//        Set<String> routerPaths = routes.keySet();
//        for(String path : routerPaths) {
//            pathName = (path + " -> " + getController(path) + "\n") + pathName;
//        }
//        return pathName;

//      For TreeMap
//        String routerPath = routes.toString().replace("{", "")
//                .replace("=", " -> ")
//                .replace(", ", "\n")
//                .replace("}", "")+"\n";
//        return routerPath;

        String result = "";
        Set<Map.Entry<String, String>> entries = routes.entrySet();

        for(Map.Entry<String, String> e : entries ) {
            String format = e.getKey() + " -> " + e.getValue() + "\n";
            result += format;
        }

        return  result;
    }
}
