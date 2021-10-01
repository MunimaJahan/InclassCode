package arrayexample;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		final int SIZE=5;
		
		int[] numbers=new int[SIZE];
		char[] vowel= {'a','e','i','o','u'};
		for(i=0;i<numbers.length;i++) {
			numbers[i]=i;
		}
		numbers[4]=11;
		
		int max=0;
		for(i=0;i<numbers.length;i++) {
			//System.out.println(numbers[i]);
			if(max<numbers[i]) {
				max=numbers[i];
			}
		}
		for(i=0;i<vowel.length;i++) {
			System.out.println(vowel[i]);
		}
		System.out.println(max);
	}

}
