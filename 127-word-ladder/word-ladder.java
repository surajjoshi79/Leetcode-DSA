class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Map<String,List<String>> map=new HashMap<>();
        wordList.add(beginWord);
        for(String word:wordList){
            for(int i=0;i<word.length();i++){
                String pattern=word.substring(0,i)+"*"+word.substring(i+1);
                if(map.containsKey(pattern)){
                    map.get(pattern).add(word);
                }else{
                    List<String> list=new ArrayList<>();
                    list.add(word);
                    map.put(pattern,list);
                }
            }
        }
        Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        int res=1;
        queue.offer(beginWord);
        visited.add(beginWord);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String word=queue.poll();
                if(word.equals(endWord)){
                    return res;
                }
                for(int j=0;j<word.length();j++){
                    String pattern=word.substring(0,j)+"*"+word.substring(j+1);
                    for(String nei:map.get(pattern)){
                        if(!visited.contains(nei)){
                            queue.offer(nei);
                            visited.add(nei);
                        }
                    }
                }
            }
            res++;
        }
        return 0;
    }
}