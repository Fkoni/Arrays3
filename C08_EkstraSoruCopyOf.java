package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C08_EkstraSoruCopyOf {

	public static void main(String[] args) {
		/*
		 P ve q boyutunda iki sıralanmış A ve B dizisi verildiğinde, sıralanmış düzeni koruyarak 
		 * A'nın öğelerini B ile birleştirmek için bir Java programı yazın, yani A'yı ilk p en küçük öğelerle doldurun 
		 * ve B'yi kalan öğelerle doldurun.
            Örnek:
        Giriş :
        int[] A = { 1, 5, 6, 7, 8, 10 }
        int[] B = { 2, 4, 9 }
        Çıkış:
        Sıralı Diziler:
         A: [1, 2, 4, 5, 6, 7]
         B: [8, 9, 10]
		 */
		
		int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        
        int birlesmis[]= Arrays.copyOf(A, A.length +B.length);
        
        System.out.println(Arrays.toString(birlesmis)); // [1, 5, 6, 7, 8, 10, 0, 0, 0]
        
        for (int i = A.length; i < birlesmis.length; i++) { // B nin elemanlarini sona ekleyelim
        	birlesmis[i]= B[i-A.length];
			
		}
		
        System.out.println(Arrays.toString(birlesmis)); // [1, 5, 6, 7, 8, 10, 2, 4, 9]
        
        Arrays.sort(birlesmis); // siralayalim
        System.out.println(Arrays.toString(birlesmis)); // [1, 2, 4, 5, 6, 7, 8, 9, 10]
        
        // A nin uzunlugu kadar elemani birlesmisten aLIP a'ya atayalim
        
        for (int i = 0; i < A.length; i++) {
        	A[i]=birlesmis[i];
			
		}
        System.out.println(Arrays.toString(A)); // [1, 2, 4, 5, 6, 7] A nin son hali
        
        // Kalan elemanlari B ye atayalim
        
        for (int i = A.length; i < birlesmis.length; i++) { // B nin elemanlarini sona ekleyelim
        	B[i-A.length]=birlesmis[i];
			
		}
        System.out.println(Arrays.toString(B));

	}

}