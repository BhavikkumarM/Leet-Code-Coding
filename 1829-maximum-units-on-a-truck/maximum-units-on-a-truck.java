class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {  int totalunit=0;
        Arrays.sort(boxTypes,(a,b) ->b[1]-a[1]);  
        for(int []a:boxTypes){
            int box=a[0];
            int units=a[1];
            box=Math.min(box,truckSize);
            totalunit +=box*units;
            truckSize-=box;
            if(truckSize==0) return totalunit;

        }      
        return totalunit;
    }
}