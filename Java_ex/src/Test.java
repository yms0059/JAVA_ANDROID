import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/*
		//��������� ����Ѵ�
		//�迭�� ũ������ʿ� �ѹ� �����Ǹ� ������ �Ұ� �ϴ�.
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
			System.out.println("iArr2[" + i + "] = " + iArr2[i]);//�׷��� 1�� 100���� �����Ѵ�
		}
		
		System.out.println("iArr1 : " + iArr1);//[I@7852e922
		System.out.println("iArr2 : " + iArr2);//[I@7852e922
		System.out.println("iArr3 : " + iArr3);//[I@4e25154f
		*/
		
	/*	String[] names= {"����","ö��","�浿","����","����"};
		int[] scores=new int[5];
		int average=0;
		int maxScore=0;
		int minScore=0;
		int maxIndex=0;
		int minIndex=0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<scores.length;i++) {
			System.out.println(names[i]+"Ű�� �Է��ϼ��� : ");
			scores[i]=scanner.nextInt();//
			average=average+scores[i];
		}
		
		System.out.println("��ս�����"+(average/scores.length)+"�Դϴ�");
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>maxScore) {
				maxScore=scores[i];
				maxIndex=i;
			}
		}
		
		System.out.println("���� ū �л��� " + names[maxIndex] + "�Դϴ�.");
		
		minIndex=maxIndex;
		for(int i = 0; i<scores.length; i++) {
			if(scores[i] < minScore) {
				minScore = scores[i];
				minIndex = i;
			}
		}
		System.out.println("���� ���� �л��� " + names[minIndex] + "�Դϴ�.");
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
