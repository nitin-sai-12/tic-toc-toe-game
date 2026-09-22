import java.util.*;
class aa{
public static void main(String args[]){
int[] nums={10,10,10,10};
System.out.println("enter the k value:");
int k=sc.nextInt();
Arrays.sort(nums);
int sl=-1;
for(int i=nums.length-k;i>=0;i--){
if(nums[i]!=nums[i+1]){
sl=nums[i];
break;
}

}
System.out.println(sl);
System.out.println(nums);
}
}