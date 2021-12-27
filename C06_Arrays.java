package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		
		int arr1 []= {3,5,7,10};
		int arr2 []= {3,5,7,10,12,15};

		
		int[] sonuc = new int [arr1.length + arr2.length];
		 
		for (int i=0; i<arr1.length + arr2.length; i++)
		{
			if (i<arr1.length)
				sonuc[i]=arr1[i];
			else
				sonuc[i]=arr2[i-arr1.length];
		}
		 
		Arrays.sort(sonuc);
		 
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println("arr2 :"+Arrays.toString(arr2));
		System.out.println("Birleştirilmiş arr: "+ Arrays.toString(sonuc));

	}

}
