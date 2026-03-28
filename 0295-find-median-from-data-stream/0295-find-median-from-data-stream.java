class MedianFinder {
  PriorityQueue<Integer> min = new PriorityQueue<>();
  PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
    }
    public void addNum(int num) {
       max.add(num);
          min.add(max.poll());
        if(max.size() == min.size()+2) min.add(max.remove());
        if(min.size() == max.size()+2) max.add(min.remove());
        
    }
    
    public double findMedian() {
       if(min.size() == max.size()+1) return min.peek();
       else if(max.size() == min.size()+1) return max.peek();
       else return (max.peek() + min.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */