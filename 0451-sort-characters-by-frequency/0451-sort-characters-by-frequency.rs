use std::collections::HashMap;
impl Solution {
    pub fn frequency_sort(mut s: String) -> String {
        let mut map = HashMap::new();

        for i in s.chars(){
            *map.entry(i).or_insert(0) += 1;
        }
        
        let mut arr : Vec<char> = s.chars().collect();

        arr.sort_by( |a,b| {
            let t1 = *map.get(&a).unwrap();
            let t2 = *map.get(&b).unwrap();
            if t1 == t2{
                b.cmp(&a)
            } else {
                t2.cmp(&t1)
            }
        });

        let res : String = arr.iter().collect();
        res
    }
}