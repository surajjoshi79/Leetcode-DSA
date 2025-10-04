class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Map<String,List<String>> map=new HashMap<>();
        List<String> geneBank=new ArrayList<>(Arrays.asList(bank));
        if(!geneBank.contains(endGene)){
            return -1;
        }
        geneBank.add(startGene);
        for(String gene:geneBank){
            for(int i=0;i<gene.length();i++){
                String pattern=gene.substring(0,i)+"*"+gene.substring(i+1);
                if(map.containsKey(pattern)){
                    map.get(pattern).add(gene);
                }else{
                    List<String> list=new ArrayList<>();
                    list.add(gene);
                    map.put(pattern,list);
                }
            }
        }
        Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        queue.offer(startGene);
        visited.add(startGene);
        int res=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String gene=queue.poll();
                if(gene.equals(endGene)){
                    return res;
                }
                for(int j=0;j<gene.length();j++){
                    String pattern=gene.substring(0,j)+"*"+gene.substring(j+1);
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
        return -1;
    }
}