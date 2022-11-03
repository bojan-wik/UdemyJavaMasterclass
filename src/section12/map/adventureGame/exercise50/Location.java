package section12.map.adventureGame.exercise50;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String name;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String name, String description) {
        this.locationID = locationID;
        this.name = name;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
//        return exits;
        return new HashMap<String, Integer>(exits);
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
