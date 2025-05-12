// 6. House Robber
// You can't rob two adjacent houses. Maximize loot.
// Input: nums = [2,7,9,3,1]
// Output: 12 (Rob 2 + 9 + 1)

package Dynamic_Programing;

public class problem6 {
public static int maxloot(int[] nums){
    if(nums.length==0) return 0;

    int n= nums.length;
    int looteve=0;
    int lootodd=0;
    for(int i=0;i<n;i=i+2){
        int lootevenum=nums[i];
        looteve+=lootevenum;
    }
    for(int i=1;i<n;i=i+2){
        int lootoddnum=nums[i];
        lootodd+=lootoddnum;
    }
    if(looteve>lootodd) return looteve;
    else return lootodd;
}
    public static void main(String[] args) {
    int[] nums={2,7,9,3,1};
    System.out.println(maxloot(nums));
}    
}
