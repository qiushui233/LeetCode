package Leetcode;
/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5
	
 * @author 程浩洋
 *
 */
public class leet058 {
	
	public static void main(String[] args) {
		
	}
	
    public int lengthOfLastWord(String s) {
    	
    	s = s.trim();
    	
        int len = s.length();
        int re = 0;
        
        if (s.equals("") || s.equals(null)) {
			re = 0;
		}else {
			for (int i = len-1; i >= 0; i--) {
				if (s.charAt(i) == ' ') {
					break;
				}
				re++;
			}
		}
        return re;
    }
}
