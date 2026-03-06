// Definition for singly-linked list.
// #[derive(PartialEq, Eq, Clone, Debug)]
// pub struct ListNode {
//   pub val: i32,
//   pub next: Option<Box<ListNode>>
// }
// 
// impl ListNode {
//   #[inline]
//   fn new(val: i32) -> Self {
//     ListNode {
//       next: None,
//       val
//     }
//   }
// }

impl Solution {
    pub fn swap_pairs(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        match head {
            Some(mut first) => {
                match first.next.take() {
                    Some(mut second) => {
                        let rest = Self::swap_pairs(second.next.take());
                        first.next = rest;
                        second.next = Some(first);
                        Some(second)
                    }
                    None => Some(first),
                }
            }
            None => None,
        }
    }
}