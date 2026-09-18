class RandomizedSet {

    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        // Already exists
        if (map.containsKey(val)) {
            return false;
        }

        // Add value to the end
        list.add(val);

        // Store its index
        map.put(val, list.size() - 1);

        return true;
    }
    
    public boolean remove(int val) {
        // Doesn't exist
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int lastValue = list.get(list.size() - 1);

        // Move the last element into the position of val
        list.set(index, lastValue);

        // Update the last element's index
        map.put(lastValue, index);

        // Remove the last element
        list.remove(list.size() - 1);

        // Remove val from map
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */