public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Возраст человека равен "+age+".");
            System.out.println("Он совершеннолетний");
        }
        else  {
            System.out.println("Возраст человека равен "+age+".");
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println(" ");
        System.out.println("Задача 2");
        int t = 2;
        if (t < 5) {
            System.out.println("На улице "+t+" градусов.");
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else  {
            System.out.println("На улице "+t+" градусов.");
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Задача 3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость "+speed+", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость "+speed+", можно ездить спокойно.");
        }
    }
    public static void task4 (){
        System.out.println(" ");
        System.out.println("Задача 4");
        int age = 1;
        if((age >= 2) && (age <= 6)){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад.");
        }
        if(age>=7 && age<=18){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу.");
        }
        if(age>=18 && age<=24){
            System.out.println("Если возраст человека равен "+age+", то его место в университете.");
        }
        if(age>24){
            System.out.println("Если возраст человека равен "+age+", то ему пора ходить на работу.");
        }
        else {
            System.out.println("Тебе ещё рано ^_^");
        }
    }
    public static void task5 (){
        System.out.println(" ");
        System.out.println("Задача 5");
        int age = 16;
        if(age<5){
            System.out.println("Возраст ребенка равен "+age+". Ему нельзя кататься на аттракционе.");
        }
        if(age>=5 && age<=14){
            System.out.println("Возраст ребенка равен "+age+". Ему можно кататься на аттракционе в сопровождении.");
        }
        else {
            System.out.println("Возраст ребенка равен "+age+". Он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6 (){
        System.out.println(" ");
        System.out.println("Задача 6");
        int quantityPeople = 102;
        if(quantityPeople > 60){
            if(quantityPeople > 102){
                System.out.println("Вагон заполнен");
            }
            else {
                int standingPlace = quantityPeople - 60;
                int freePlase = 102 - quantityPeople;
                System.out.println("В вагоне занято: 60 сидячих мест и "+standingPlace+" стоячих мест. Свободно "+freePlase+" мест.");
            }
        }
        else {
            int freePlase = 102 - quantityPeople;
            System.out.println("В вагоне занято: "+quantityPeople+" сидячих мест. Свободно "+freePlase+" мест.");
        }
    }
    public static void task7 (){
        System.out.println(" ");
        System.out.println("Задача 7");
        int one = 2;
        int two = 2;
        int three = 2;
        System.out.println("one = "+ one);
        System.out.println("two = "+ two);
        System.out.println("three = "+ three);
        if(one>two && one> three){
            int difOne = one - two;
            int difTwo = one - three;
            System.out.println("Первое число больше второго на "+difOne+" и больше третьего на "+ difTwo);
            if(two>three){
                int dif = two - three;
                System.out.println("А второе число больше третьего на "+ dif);
            }
            else {
                int dif = three - two;
                System.out.println("А третье число больше второго на "+ dif);
            }
        }
        if(two>one && two> three){
            int difOne = two - one;
            int difTwo = two - three;
            System.out.println("Второе число больше первого на "+difOne+" и больше третьего на "+ difTwo);
            if(one>three){
                int dif = one - three;
                System.out.println("А первое число больше третьего на "+ dif);
            }
            else {
                int dif = three - one;
                System.out.println("А третье число больше первого на "+ dif);
            }
        }
        if(three>one && three> two){
            int difOne = three - one;
            int difTwo = three - two;
            System.out.println("Третье число больше первого на "+difOne+" и больше второго на "+ difTwo);
            if(one>two){
                int dif = one - two;
                System.out.println("А первое число больше второго на "+ dif);
            }
            else {
                int dif = two - one;
                System.out.println("А второе число больше первого на "+ dif);
            }
        }
    }
}