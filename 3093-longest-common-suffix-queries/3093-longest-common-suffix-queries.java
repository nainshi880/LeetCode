class Solution {
        class TrieNode {
        TrieNode[] child = new TrieNode[26];
        int idx = -1;
    }

    TrieNode root = new TrieNode();

    String[] words;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        words = wordsContainer;

        int best = 0;

        for(int i = 1; i < words.length; i++) {

            if(words[i].length() < words[best].length()) {
                best = i;
            }
        }

        root.idx = best;

        for(int i = 0; i < words.length; i++) {
            insert(words[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        for(int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }

    void insert(String s, int idx) {

        TrieNode node = root;

        for(int i = s.length() - 1; i >= 0; i--) {

            int ch = s.charAt(i) - 'a';

            if(node.child[ch] == null) {
                node.child[ch] = new TrieNode();
            }

            node = node.child[ch];

            if(node.idx == -1 ||
               words[idx].length() < words[node.idx].length()) {

                node.idx = idx;
            }
        }
    }

    int search(String s) {

        TrieNode node = root;

        int ans = root.idx;

        for(int i = s.length() - 1; i >= 0; i--) {

            int ch = s.charAt(i) - 'a';

            if(node.child[ch] == null) {
                break;
            }

            node = node.child[ch];

            ans = node.idx;
        }

        return ans;
    }
}