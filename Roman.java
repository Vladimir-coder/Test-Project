import java.util.*;


public class Roman extends Calculator {
	
	 public static int getNumber() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Введите число:");
	        if(sc.hasNextLine()) {
	        	String rNum=sc.nextLine();
	            return convert(rNum);
	        } else {
	            System.out.println("Ошибка при вводе. Повторите ввод");
	            return getNumber();
	        }
	 }
	 public static int convert(String romanNum){
			int arabNum;
			if(romanNum.equals("I")){
				arabNum=1;
			}else if(romanNum.equals("II")){
				arabNum=2;
			}else if(romanNum.equals("III")){
				arabNum=3;
			}else if(romanNum.equals("IV")){
				arabNum=4;
			}else if(romanNum.equals("V")){
				arabNum=5;
			}else if(romanNum.equals("VI")){
				arabNum=6;
			}else if(romanNum.equals("VII")){
				arabNum=7;
			}else if(romanNum.equals("VIII")){
				arabNum=8;
			}else if(romanNum.equals("IX")){
				arabNum=9;
			}else if(romanNum.equals("X")){
				arabNum=10;
			}else{
				System.out.println("Не корректный ввод!Попробуйте ещё раз!");
				return getNumber();
			}
			return arabNum;
		}
	 	public static void printRoman(int x){
	 		String[] numRom={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
			int[]arr={1,2,3,4,5,6,7,8,9,10};
			for(int i=0;i<numRom.length;i++){
				if(x==arr[i]){
					System.out.println(numRom[i]);
			 }
			}
			for(int i=0;i<10;i++){
				if(x==(11+i)){
					System.out.println("X"+numRom[i]);	
			 }
			}
			for(int i=0;i<10;i++){
				if(x==(21+i)){
					System.out.println("XX"+numRom[i]);	
			 }
	        }	
			for(int i=0;i<9;i++){
				if(x==(31+i)){
					System.out.println("XXX"+numRom[i]);	
			 }
	        }
			for(int i=0;i<9;i++){
				if(x==(41+i)){
					System.out.println("XL"+numRom[i]);	
			 }
	        }	
			for(int i=0;i<9;i++){
				if(x==(51+i)){
					System.out.println("L"+numRom[i]);	
			 }
	        }	
			for(int i=0;i<9;i++){
				if(x==(61+i)){
					System.out.println("LX"+numRom[i]);	
			 }
	        }
			for(int i=0;i<9;i++){
				if(x==(71+i)){
					System.out.println("LXX"+numRom[i]);	
			 }
	        }
			for(int i=0;i<9;i++){
				if(x==(81+i)){
					System.out.println("LXXX"+numRom[i]);	
			 }
	        }	
			for(int i=0;i<9;i++){
				if(x==(91+i)){
					System.out.println("XC"+numRom[i]);	
			 }
	        }	
			 if(x==40){
				
				System.out.println("XL");	
			}else if(x==50){
				
				System.out.println("L");	
			}else if(x==60){
				
				System.out.println("LX");	
			}else if(x==70){
				
				System.out.println("LXX");	
			}else if(x==80){
				
				System.out.println("LXXX");	
			}else if(x==90){
				
				System.out.println("XC");	
			}else if(x==100){
				
				System.out.println("C");	
			}
			
			
	 	}
	}

