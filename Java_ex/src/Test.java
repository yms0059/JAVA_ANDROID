import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/*
		//변수선언과 비슷한다
		//배열의 크기는최초에 한번 설정되면 변경이 불가 하다.
		int i=0;
		int[] iArr= {10,20,30,40,50};
		for(i=0;i<iArr.length;i++) {
			System.out.println(iArr[i]);
			//10 20 30 40 50
		}
		
		
		int[] iArr2=new int[5];
		iArr2[0]=10;
		iArr2[1]=20;
		iArr2[2]=30;
		iArr2[3]=40;
		iArr2[4]=50;
		for(i=0; i<5; i++){
			System.out.println(iArr[i]);
		}*/
		
		/*int[] iArr1 = {10, 20, 30, 40, 50};
		int[] iArr2 = iArr1;
		int[] iArr3 = {1, 2, 3};
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] = " + iArr1[i]);
			System.out.println("iArr2[" + i + "] = " + iArr2[i]);
		}
		
		iArr2[0] = 100;
		iArr2[1] = 200;
		iArr2[2] = 300;
		iArr2[3] = 400;
		iArr2[4] = 500;
		
		for (int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "] = " + iArr1[i]);//iArr1[i]=iArr2[i]			
			System.out.println("iArr2[" + i + "] = " + iArr2[i]);//그래서 1도 100으로 시작한다
		}
		
		System.out.println("iArr1 : " + iArr1);//[I@7852e922
		System.out.println("iArr2 : " + iArr2);//[I@7852e922
		System.out.println("iArr3 : " + iArr3);//[I@4e25154f
		*/
		
	/*	String[] names= {"영희","철수","길동","영수","말자"};
		int[] scores=new int[5];
		int average=0;
		int maxScore=0;
		int minScore=0;
		int maxIndex=0;
		int minIndex=0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<scores.length;i++) {
			System.out.println(names[i]+"키를 입력하세요 : ");
			scores[i]=scanner.nextInt();//
			average=average+scores[i];
		}
		
		System.out.println("평균신장은"+(average/scores.length)+"입니다");
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>maxScore) {
				maxScore=scores[i];
				maxIndex=i;
			}
		}
		
		System.out.println("가장 큰 학생은 " + names[maxIndex] + "입니다.");
		
		minIndex=maxIndex;
		for(int i = 0; i<scores.length; i++) {
			if(scores[i] < minScore) {
				minScore = scores[i];
				minIndex = i;
			}
		}
		System.out.println("가장 작은 학생은 " + names[minIndex] + "입니다.");
	*/
		
		int[][] iArr = new int[3][];
		iArr[0] = new int[2];
		iArr[1] = new int[3];
		iArr[2] = new int[2];
		
		iArr[0][0] = 10;
		iArr[0][1] = 20;
		
		iArr[1][0] = 100;
		iArr[1][1] = 200;
		iArr[1][2] = 300;
		
		iArr[2][0] = 1000;
		iArr[2][1] = 2000;
		
		for (int i = 0; i < iArr.length; i++) {
			for(int j=0; j < iArr[i].length; j++) {
				System.out.println(iArr[i][j]);
			}
		}
		
		for (int i = 0; i<iArr.length; i++) {
			System.out.println(Arrays.toString(iArr[i]));
		}
		
		int[][] jArr = new int[3][2];
		jArr[0][0] = 10;
		
	}

}
