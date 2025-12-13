class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String,List<String>> map=new TreeMap<>();
        List<String> validCoupons=new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(!code[i].trim().isEmpty() && isActive[i] && (businessLine[i].equals("electronics")||businessLine[i].equals("grocery")||businessLine[i].equals("pharmacy")||businessLine[i].equals("restaurant"))){
                boolean isValid=true;
                for(char c:code[i].toCharArray()){
                    if(!Character.isLetter(c) && !Character.isDigit(c) && c!='_'){
                        isValid=false;
                        break;
                    }
                }
                if(isValid){
                    if(map.containsKey(businessLine[i])){
                        map.get(businessLine[i]).add(code[i]);
                    }else{
                        List<String> list=new ArrayList<>();
                        list.add(code[i]);
                        map.put(businessLine[i],list);
                    }
                }
            }
        }
        for(List<String> values:map.values()){
            Collections.sort(values);
            validCoupons.addAll(values);
        }
        return validCoupons;
    }
}