public class Student {
    private String Name , Sex , Department ;
    private float English , Chinese , Math , Sum , Average;
    public Student(String name1,String sex1,String department1,float english1,float chinese1, float math1){
        Name=name1;
        Sex=sex1;
        Department=department1;
        English=english1;
        Chinese=chinese1;
        Math=math1;
    }
    public void ShowInto(){
        System.out.println("姓名：" + Name);
        System.out.println("性別：" + Sex);
        System.out.println("系別：" + Department);
        System.out.println("國文："+  Chinese);
        System.out.println("英文："+  English);
        System.out.println("數學："+  Math);
    }
    public void ShowString(){
        System.out.println("姓名：" + Name);
        System.out.println("性別：" + Sex);
        System.out.println("系別：" + Department);
    }
    public void ShowScore(){
        System.out.println("英文：" + English);
        System.out.println("國文：" + Chinese);
        System.out.println("數學：" + Math);
    }

    public String getName() { return Name; }

    public float getEnglish() { return English; }

    public float getChinese() { return Chinese; }

    public float getMath() { return Math; }

    public float getSum() { Sum = English + Chinese + Math ;
        return Sum; }

    public float getAverage() { Average = (English + Chinese + Math) /3;
        return Average; }
}
