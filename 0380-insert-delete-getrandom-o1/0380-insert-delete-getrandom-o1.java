class RandomizedSet {
        ArrayList<Integer> ans;
    public RandomizedSet() {
       ans = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(ans.contains(val)) return false;
        ans.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!ans.contains(val)) return false;
        ans.remove(Integer.valueOf(val));
        return true;
    }
    
    public int getRandom() {
        Random ran = new Random();
        return ans.get(ran.nextInt(ans.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */