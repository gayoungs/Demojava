package Quiz15;

public class MyBag implements IBag{

	private String[] arr  = new String[100]; //클래스에는 크기가 100인 String[]을 선언해주세요.
	private int index;				//나만 사용할 것
	
	@Override
	public void insert(String item) {
		arr[index] = item;
		index++;	
	}

	@Override
	public void print() {
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}		
		System.out.println();
	}

	@Override
	public int search(String item) {
		for(int i = 0; i < index; i++) {
			if(arr[i].equals(item)) {  //index와 item은 같다 문자열 비교	
				return i;              //찾는경우 i를 출력 못찾을경우 반복문 빠져나와서 -1
			}
		}
		return -1; // 없는 경우 -1   
	}

	@Override
	public boolean delete(String item) {
		for(int i = 0; i < index; i++) {
			
			//찾은경우의 조건
			if(arr[i].equals(item))  {
				//뒤의 아이템을 당기고 종료 (내위치부터 출발)
				for(int j = i; j < index - 1; j++) {  
					arr[j] = arr[j+1]; 
				}
				arr[index-1] = null; 
				index--;
				return true;
			}
		}
		return false; 
	}
}