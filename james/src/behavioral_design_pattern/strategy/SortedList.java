package behavioral_design_pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {

    private SortStrategy strategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        strategy.sort(items);
    }
}