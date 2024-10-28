package dsatask2;
public class kokoEatingbanana {
    public static void main(String[] args) {
        int[]piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
        
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=getMax(piles);
        while(left<right){
            int mid=left+(right-left)/2;
            int hoursrequired=getHours(piles,mid);
            if(hoursrequired<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
    public static int getMax(int[]piles){
        int max=0;
        for(int pile:piles){
            if(pile>max){
                max=pile;
            }
        }
        return max;
    }
    public static int getHours(int[]piles,int speed){
        int hours=0;
        for(int pile:piles){
            hours+=(pile+speed-1)/speed;

        }
        return hours;
    }
    
}
