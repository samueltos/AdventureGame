package AdventureGame;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int location;
    private final String description;
    public final Map<String, Integer> exits;

    public Location(int location, String description) {
        this.location = location;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int newLocation){
        exits.put(direction, newLocation);
    }

    public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}

