package xust;


/*
1.��¥��
������������¥�ݡ���Ҫ n ������ܵ���¥����
ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
ע�⣺���� n ��һ����������

ʾ�� 1��
���룺 2
����� 2
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 ��
2.  2 ��

ʾ�� 2��
���룺 3
����� 3
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 �� + 1 ��
2.  1 �� + 2 ��
3.  2 �� + 1 ��
 */

/*
 * �㷨˼�룺
 * ���ҵ����еĹ��ɣ�
 * 1��̨��ʱ��1�ַ�����2��̨��ʱ��2�ַ�����3��̨��ʱ��3�ַ�����
 * 4��̨��ʱ��5�ַ�����1111  211 121 112 22 
 * 5��̨��ʱ��8�ַ�����11111 2111 1211 1121 1112 221 212 122 
 * 6��̨��ʱ��13�ַ�����
 * ���ǻᷢ�������쳲��������У�쳲���������Ϊ��1 1 2 3 5 13 18 ... 
 * ��˼��㷽����ת�����˼���쳲��������С�
 */
//public class Test_0122 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		System.out.println(So.climbStairs(6));	
//	}
//}
//class Solution {
//    public int climbStairs(int n) {
//    	if(n < 0){//nΪ�Ǹ�����
//    		return -1;
//    	}
//        if(n == 0 || n == 1){//̨����Ϊ0��1ʱ��1�ַ�����Ҳ����쳲��������е�ǰ������
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
2.�ϲ�������������
�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣
˵��:
��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�

ʾ��:
����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
���: [1,2,2,3,5,6]
 */
/*
 * �㷨˼�룺
 * ����nums1��nums2������ģ�������δ�nums1��nums2��Ԫ�ص��Ҷ˽��бȽϣ���ʼ�±�Ϊm-1��n-1����
 * �ҳ����ֵ�������ֵ��nums1�����Ҷ˵�ֵ����m--,�����ֵ��nums2�����Ҷ˵�ֵ����n--,
 * ��i��Ǻϲ����nums1�Ҷˣ���ʼΪm+n-1����ÿ���ҵ������ֵ����ϲ����nums1�����Ҷˣ�
 * ÿ��һ�Σ�i--��ֱ������Ϊֹ����ʱnums1��Ϊ�˺ϲ��������������顣
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
//		System.out.print("�ϲ����nums1: ");
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
3.x��ƽ����
ʵ�� int sqrt(int x) ������
���㲢���� x ��ƽ���������� x �ǷǸ�������
���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��

ʾ�� 1:
����: 4
���: 2

ʾ�� 2:
����: 8
���: 2
˵��: 8 ��ƽ������ 2.82842..., 
���ڷ���������������С�����ֽ�����ȥ��
 */
/*
 * �㷨˼�룺
 * ������x�������x�������0,����ж�x<1���򷵻�-1����ʾ�����������󣩣�x==1ʱ����1��
 * ��������£���x����Ľ���϶��������x/2,��˱�����1��x/2֮������֣���i��������֣�����i<=x/i && (i+1)>x/(i+1)ʱi��Ϊx�ĸ�������ѭ����
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
        	//i*i<=x<(i+1)*(i+1)ʱ������������������������׵��������������˻����ó�����ʾ��i<=x/i && (i+1)>(x/(i+1))
        	if(i<=x/i && (i+1)>(x/(i+1))){
        		ret = i;
        		break;
        	}
        }
        return ret;
    }
}
