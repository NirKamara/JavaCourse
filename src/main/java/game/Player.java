package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cloudera on 12/2/16.
 */

public class Player {
    private int id;
    private String name;
    private List<Integer> retries = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRetries() {
        return retries;
    }

    public void setRetry(int retry) {
        this.retries.add(retry);
    }
}


