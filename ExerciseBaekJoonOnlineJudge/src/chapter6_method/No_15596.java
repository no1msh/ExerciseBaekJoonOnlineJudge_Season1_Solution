package chapter6_method;

public class No_15596 
{
	// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
	long sum(int[] a) {
		long sum = 0;
		   
		for (int value : a)
			sum+= value;
     
        return sum;
    }

}
