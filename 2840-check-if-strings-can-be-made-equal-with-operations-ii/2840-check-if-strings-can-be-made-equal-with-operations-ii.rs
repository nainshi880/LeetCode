impl Solution {
    pub fn check_strings(s1: String, s2: String) -> bool {
        let mut even1 = vec![0; 26];
        let mut odd1 = vec![0; 26];
        let mut even2 = vec![0; 26];
        let mut odd2 = vec![0; 26];

        for (i, ch) in s1.chars().enumerate() {
            if i % 2 == 0 {
                even1[(ch as u8 - b'a') as usize] += 1;
            } else {
                odd1[(ch as u8 - b'a') as usize] += 1;
            }
        }

        for (i, ch) in s2.chars().enumerate() {
            if i % 2 == 0 {
                even2[(ch as u8 - b'a') as usize] += 1;
            } else {
                odd2[(ch as u8 - b'a') as usize] += 1;
            }
        }

        even1 == even2 && odd1 == odd2
    }
}