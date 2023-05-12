package Quiz19;

import java.util.HashSet;
import java.util.Set;

import java.util.Random;

public class SetQuiz01 {

	public static void main(String[] args) {

		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * 1. Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장해주세요.
		 */

		Set<Integer> set = new HashSet <>();

		Random ran = new Random();

		while(set.size() < 6) {
		int a = ran.nextInt(45) + 1; // 1~45
		set.add(a);
		}
		System.out.println("로또번호:" + set.toString());
		}

	}
