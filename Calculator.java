import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args) {
    	System.out.println("1-Арабский/n 2-Римский");
    	Scanner sc=new Scanner(System.in);
    	int vibor=sc.nextInt();
    	if(vibor==1){
       int num1 = getNumber();
       int num2 = getNumber();
       int result =getOperation(num1,num2); 
        System.out.println("Результат:" + result);
    	}else if(vibor==2){
    		int num1=Roman.getNumber();
    		int num2=Roman.getNumber();
    		int result =getOperation(num1,num2); 
    	        System.out.print("Результат:" );
    	       Roman.printRoman(result);
    	}else{
    		System.out.println("Некорректный ввод!");
    	}
    }
 
    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if(sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
            return getNumber();
        }
    }
 
    public static int getOperation(int x,int y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0;
        if(sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation(x,y);
        }
        switch (operationNumber) {
            case 1:
                return x+y;
            case 2:
                return x-y;
            case 3:
                return x*y;
            case 4:
                return x/y;
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation(x,y);
        }
    }
 
    public static int add(int num1, int num2) {
        return num1+num2;
    }
 
    public static int sub(int num1, int num2) {
        return num1-num2;
    }
 
    public static int mul(int num1, int num2) {
        return num1*num2;
    }
 
    public static int div(int num1, int num2) {
        if(num2 != 0.0) {
            return num1/num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return getNumber();
        }
    }
}