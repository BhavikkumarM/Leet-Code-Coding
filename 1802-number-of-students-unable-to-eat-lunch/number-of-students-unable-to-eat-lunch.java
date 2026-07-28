class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i:students){
            q.offer(i);

        }
        int top=0;
        int count=0;
        while(!q.isEmpty() && count<q.size()){
            if(q.peek() == sandwiches[top]){
                q.poll();
                count=0;
                top++;

            }
            else{
                count++;
                q.offer(q.poll());
            }
        }
        return count;
    }
}