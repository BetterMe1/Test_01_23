package xust;


/*
1.爬楼梯
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
注意：给定 n 是一个正整数。

示例 1：
输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶

示例 2：
输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
 */

/*
 * 算法思想：
 * 先找到其中的规律：
 * 1层台阶时有1种方法，2层台阶时有2种方法，3层台阶时有3种方法，
 * 4层台阶时有5种方法，1111  211 121 112 22 
 * 5层台阶时有8种方法，11111 2111 1211 1121 1112 221 212 122 
 * 6层台阶时有13种方法，
 * 我们会发现这就是斐波那契数列，斐波那契数列为：1 1 2 3 5 13 18 ... 
 * 因此计算方法就转换成了计算斐波那契数列。
 */
//public class Test_0122 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		System.out.println(So.climbStairs(6));	
//	}
//}
//class Solution {
//    public int climbStairs(int n) {
//    	if(n < 0){//n为非负整数
//    		return -1;
//    	}
//        if(n == 0 || n == 1){//台阶数为0或1时有1种方法，也就是斐波那契数列的前两个数
//        	return 1;
//        }
//        int left = 1;
//        int right = 1;
//        int ret = 0;
//        for(int i=2 ;i<=n; i++){
//            ret = left + right;
//            left = right;
//            right = ret;
//        }
//        return ret;
//    }
//}


/*
2.合并两个有序数组
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
说明:
初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

示例:
输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
输出: [1,2,2,3,5,6]
 */
/*
 * 算法思想：
 * 由于nums1、nums2是有序的，因此依次从nums1、nums2有元素的右端进行比较（初始下标为m-1、n-1），
 * 找出最大值，若最大值是nums1中最右端的值，则m--,若最大值是nums2中最右端的值，则n--,
 * 用i标记合并后的nums1右端，初始为m+n-1，将每次找到的最大值放入合并后的nums1数组右端，
 * 每放一次，i--，直到放完为止，此时nums1成为了合并两个数组后的数组。
 */
//public class Test_0122 {
//	public static void main(String[] args) {
//		int[] nums1 = {1,2,3,4,0,0,0,0};
//		int m = 4;
//		System.out.print("nums1: ");
//		for(int i=0; i<m; i++){
//			System.out.print(nums1[i]+" ");
//		}
//		System.out.println();
//		int[] nums2 = {2,4,5,6};
//		int n = 4;
//		System.out.print("nums2: ");
//		for(int i=0; i<n; i++){
//			System.out.print(nums2[i]+" ");
//		}
//		System.out.println();
//		Solution So = new Solution();
//		So.merge(nums1, m, nums2, n);
//		System.out.print("合并后的nums1: ");
//		for(int i = 0; i < m+n; i++){
//			System.out.print(nums1[i]+ " ");
//		}
//	}
//}
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//    	int max =0;
//    	for(int i= m + n - 1;i >= 0;i--){
//    		if(m>=1 && n>=1){
//    			if(nums1[m-1] > nums2[n-1]){
//    				max = nums1[m-1];
//        			m--;		
//    			}
//    			else{
//    				max = nums2[n-1];
//        			n--;
//    			}
//    		}
//    		else if(m>=1){
//    			max = nums1[m-1];
//    			m--;
//    		}
//    		else{
//    			max = nums2[n-1];
//    			n--;
//    		}
//        	nums1[i] = max;
//    	}
//    }
//}
/*
3.x的平方根
实现 int sqrt(int x) 函数。
计算并返回 x 的平方根，其中 x 是非负整数。
由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:
输入: 4
输出: 2

示例 2:
输入: 8
输出: 2
说明: 8 的平方根是 2.82842..., 
由于返回类型是整数，小数部分将被舍去。
 */
/*
 * 算法思想：
 * 对整数x求根，则x必须大于0,如果判断x<1，则返回-1（表示输入数据有误），x==1时返回1，
 * 其他情况下：对x求根的结果肯定不会大于x/2,因此遍历从1到x/2之间的数字，用i代表此数字，满足i<=x/i && (i+1)>x/(i+1)时i即为x的根，跳出循环。
 */
public class Test_0122 {
	public static void main(String[] args) {
		Solution So = new Solution();
		System.out.println(So.mySqrt(2147395600));	
	}
}
class Solution {
    public int mySqrt(int x) {
    	if(x<1){
    		return -1;
    	}
        if(x == 1){
        	return x;
        }
        int ret = 0;
        for(int i=1;i<=x/2;i++){
        	//i*i<=x<(i+1)*(i+1)时满足条件，但是两数相乘容易导致数据溢出，因此换做用除法表示，i<=x/i && (i+1)>(x/(i+1))
        	if(i<=x/i && (i+1)>(x/(i+1))){
        		ret = i;
        		break;
        	}
        }
        return ret;
    }
}
