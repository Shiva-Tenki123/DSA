class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> al=new ArrayList<>();
        Queue<String> qu=new LinkedList<>();
        qu.offer("a");
        qu.offer("b");
        qu.offer("c");
        while(!qu.isEmpty()){
            String current=qu.poll();
            if(current.length()==n){
                al.add(current);
                continue;
            }
            char lastchar=current.charAt(current.length()-1);
            if(lastchar=='a'){
                qu.offer(current+"b");
                qu.offer(current+"c");
            }
            else if(lastchar=='b'){
                qu.offer(current+"a");
                qu.offer(current+"c");
            }
            else{
                qu.offer(current+"a");
                qu.offer(current+"b");
            }
        }
        if(al.size()<k){
            return "";
        }
        return al.get(k-1);
    }
}