package edu.java.homework;

public class 강정묵04_1 {

	public static void main(String[] args) {
		String str = "사과:배:바나나:복숭아";
		String[] str1 = str.split(":");
		StringBuffer buff = new StringBuffer();
		
		for (int i = 0; i < str1.length; i++) {
            buff.append(str1[i]);           
        }       
        System.out.println(buff.toString());
	}
}
