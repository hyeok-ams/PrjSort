package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(5);
		list.add(34);
		list.add(28);
		list.add(16);
		list.add(8);
		
		dispList(list);//정렬되지 않은 무순출력
		list.add(7);
		list.add(28);
		list.add(4);
		dispList(list);//정렬되지 않은 무순출력
		
		//compAsc
		//Comparator 인터페이스를 이용하여 이름이 없는 클래스(익명 클래스)에 코딩을
		// 추가하여 인터페이스를 new 할 수 있다.
		// 익명 : Anonymous 이름없는
		// 람다식 사용전 익명클래스 사용법
		Comparator<Integer> compAsc = new Comparator<Integer>() {
			//오름차순 정렬
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
		};
		Comparator<Integer> compDesc = new Comparator<Integer>() {
			//내림차순 정렬
			@Override
			public int compare(Integer o1, Integer o2) {
			
				return o2 - o1;
			}
		};
		
		
		//오름차순 정렬해서 출력
		Collections.sort(list, compAsc);
		dispList(list);// 오름차순 출력
				
		//내림차순 정렬해서 출력
		Collections.sort(list, compDesc);
		dispList(list);// 내림차순 출력
		
		
		//------------------------------------------
		//코딩을 줄이는 방법
		//문자열 대상으로 정렬
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("이순신");
		names.add("김유신");
		names.add("강감찬");
		names.add("을지문덕");
		names.add("권율");
		
		dispName(names);
		
		//오름차순 정렬
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		dispName(names);
		
		//내림차순 정렬
		//람다식은 아래같이 함수가 하나일때만 람다식으로 사용가능
		/*
		
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
			
		});
		 */
		/*
		Collections.sort(names,(o1,o2)->{
			return o2.compareTo(o1);
		});
		 */
		//람다식
		Collections.sort(names,(o1,o2)-> o2.compareTo(o1));
		dispName(names);

	}

	private static void dispName(ArrayList<String> names) {
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
	}

	private static void dispList(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}
		System.out.println();
	}

}
