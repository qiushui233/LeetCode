package Leetcode;

import java.util.Iterator;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:

输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。
示例 2:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
 * @author 程浩洋
 *
 */
public class leet066 {
	
	
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len-1;
        
        if (digits[i] != 9) {
			digits[i]++;
		}else {
			 while (digits[i] == 9) {
				 i--;
				 if (i == -1) {
					 int[] res = new int[len+1];
					 System.arraycopy(digits, 0, res, 1, len);
					 digits = res;
					 break;
				}
			 }
			 
			 if (i == -1) {
				digits[i+1]++;
				for(int j = i+2;j < len+1;j++) {
					digits[j] = 0;
				}
				
			}else {
				digits[i]++;
				for(int j = i+1;j < len;j++) {
					digits[j] = 0;
				}
			}
			 
			
			 
		}
		
        return digits;
    }
    
    public static void main(String[] args) {
		int[] a = {8,9,9,9};
		
		a = plusOne(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}
}
