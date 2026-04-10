impl Solution {
    pub fn rotate_string(s: String, goal: String) -> bool {
        let new = s.clone() + &s;
        if s.len() != goal.len(){
            return false;
        } else if s.len() == 1{
            if s == goal {return true;} else {return false;}
        } 

        if new.contains(&goal){
            return true;
        } else{
            return false;
        }

    }
}