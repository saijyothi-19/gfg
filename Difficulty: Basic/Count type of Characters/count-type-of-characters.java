class Sol {
    public boolean isUpper(char ch){
        return ch>='A' && ch<='Z';
    }
     public boolean isLower(char ch){
        return ch>='a' && ch<='z';
    }
     public boolean isNumeric(char ch){
        return ch>='0' && ch<='9';
    }
    int[] count(String s) {
        int up=0,lo=0,num=0,spec=0;
        int res[]=new int[4];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isUpper(c)){
                up++;
            }else if(isLower(c)){
                lo++;
            }else if(isNumeric(c)){
                num++;
            }else{
                spec++;
            }
        }
        res[0]=up;
        res[1]=lo;
        res[2]=num;
        res[3]=spec;
        return res;
         
        
    }
}

