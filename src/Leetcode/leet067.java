package Leetcode;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class leet067 {
    public static String addBinary(String a, String b) {

        StringBuffer result = new StringBuffer();
        int i = a.length() - 1, j = b.length() -1;
        int flag = 0;

        for(; i >= 0 || j >= 0; i--,j--){
            int a1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int b1 = j >= 0 ? b.charAt(j) - '0' : 0;
            int tmp = a1 + b1 + flag;

            if(tmp < 2){
                result.append(tmp + "");
                flag = 0;
            }
            else if(tmp == 2){
                result.append("0");
                flag = 1;
            }else{
                result.append("1");
                flag = 1;
            }
        }
        if(flag == 1){
            result.append("1");
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("111","111"));
    }
}
