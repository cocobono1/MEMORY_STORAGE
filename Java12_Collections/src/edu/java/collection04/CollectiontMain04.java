package edu.java.collection04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectiontMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		
		// 학생 정보(이름, 점수)를 3개 입력받아서 list에  저장(반복문 사용)
		for(int i = 0; i < 3; i++) {
			System.out.println("학생 이름 입력>");
			String name = sc.next();
			System.out.println("수학 점수 입력>");
			int math = sc.nextInt();
			System.out.println("영어 점수 입력>");
			int eng = sc.nextInt();	
			
			Score score = new Score(math, eng);
			Student stu = new Student(name, score);
            list.add(stu);
		}
		sc.close();
		// 전체 데이터 검색(출력)		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("---학생[" + i + "] 정보---");
			Student student = list.get(i);
			System.out.println("이름 : " + student.getName());
			System.out.println("수학 : " + student.getScore().getMath());
			System.out.println("영어 : " + student.getScore().getEng());
		}
		
		// 데이터 수정
		// 1번 인덱스의 학생 정보를 변경
		// 예시) 이름 : 둘리
		//      수학 : 100
		//      영어 : 50
		list.set(1, new Student("둘리", new Score(100, 50)));
		// 0번 인덱스 학생의 영어 점수만 변경
		list.get(0).getScore().setEng(50);
		// 변경된 리스트의 모든 데이터 출력
		for(Student student : list) {
			System.out.println("이름 : " + student.getName());
			System.out.println("수학 : " + student.getScore().getMath());
			System.out.println("영어 : " + student.getScore().getEng());
		}
		// 데이터 삭제 : 1번 인덱스 학생의 모든 정보 삭제
		list.remove(1);
	}// end main()

}// end CollectionMain04
