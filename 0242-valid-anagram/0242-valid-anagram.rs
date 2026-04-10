impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        let mut s1 = [0;26];
        let mut s2 = [0;26];
        if s.len() != t.len(){
            return false;
        }
        for i in s.as_bytes().iter(){
            let pos = (i - b'a') as usize;
            s1[pos] += 1;
        }

        for i in t.as_bytes().iter(){
            let pos = (i - b'a') as usize;
            s2[pos] += 1;
        }

        if s1 == s2 {true} else {false}

    }
}