use std::collections::HashMap;
impl Solution {
    pub fn is_isomorphic(s: String, t: String) -> bool {
        let mut map1 = HashMap::new();
        let mut map2 = HashMap::new();

        let s = s.as_bytes();
        let t = t.as_bytes();

        for i in 0..s.len(){
            if *map1.entry(s[i]).or_insert(t[i]) != t[i]{
                return false;
            }

            if *map2.entry(t[i]).or_insert(s[i]) != s[i]{
                return false;
            }
        }
        true
    }
}