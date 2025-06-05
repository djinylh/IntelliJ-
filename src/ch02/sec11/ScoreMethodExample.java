package ch02.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10,200);
        System.out.println(randomScore);

        System.out.println("------------");


        char grade = getGrade(randomScore);
        // 100점 초과시 혹은 0점 미만시 ' '리턴
        // 90점 이상 'a'리턴
        //80점 이상 b 리턴
        //70점 이상 c 리턴
        // 나머지 d 리턴
        System.out.println(grade);
    }

    public static int getRandomValue(int i, int i1){

        return (int)(Math.random() * (i1 - i +1 )) + i;
    }



public static char getGrade(int randomScore){



    if(randomScore > 100 || randomScore < 0 ) {
       return ' ';
    }
    else if (randomScore >= 90) {
        return 'A';
    }
    else if ( randomScore >= 80) {
        return 'B';
    }
    else if (randomScore >=70) {
        return 'C';
    } else {
        return 'D';
    }
}
}
