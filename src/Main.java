import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Student stud[] = new Student[5];
        Option op = new Option();
        boolean boo = true;
        for (int i = 0 ; i < 5 ; i ++){
            stud[i] = new Student(scn.next(), scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
        }
        while (boo){
            op.options();
            System.out.println();
            System.out.print("請輸入選項：");
            int k = scn.nextInt();
            int Number = 0;
            float Sum = 0;
            switch (k){
                case 1 :
                for(int i = 0 ; i < 5 ; i ++){
                    System.out.println((i + 1) + "." + stud[i].getName());
                }
                    System.out.println("你要找哪個同學：");
                    Number = scn.nextInt();
                    stud[Number - 1].ShowInto();
                    break;
                case 2:
                    for(int i = 0 ; i < 5 ; i ++){
                        stud[i].ShowInto();
                        System.out.println("-------------------");
                    }
                    break;
                case 3:
                    System.out.println("1.英文");
                    System.out.println("2.國文");
                    System.out.println("3.數學");
                    System.out.print("你要查詢哪一個項目：");
                    Number = scn.nextInt();
                    switch (Number){
                        case 1:
                            for(int i = 0 ; i < 5 ; i ++){
                                Sum += stud[i].getChinese();
                            }
                            Sum /= 5;
                            System.out.println("國文平均：" + Sum);
                            Sum = 0;
                            break;
                        case 2:
                            for (int i = 0; i < 5; i++) {
                                Sum += stud[i].getEnglish();
                            }
                            Sum /= 5;
                            System.out.println("英文平均：" + Sum);
                            Sum = 0;
                            break;
                        case 3:
                            for (int i = 0; i < 5; i++) {
                                Sum += stud[i].getMath();
                            }
                            Sum /= 5;
                            System.out.println("數學平均：" + Sum);
                            break;
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1) + "." + stud[i].getName());
                    }
                    System.out.print("請輸入你要查詢哪一位同學：");
                    Number = scn.nextInt();
                    Sum = stud[Number - 1].getSum();
                    System.out.println("總分：" + Sum);
                    Sum = stud[Number - 1].getAverage();
                    System.out.println("平均：" + Sum);
                    break;
                case 5:
                    boo = false;
                    break;
            }
        }
    }
}