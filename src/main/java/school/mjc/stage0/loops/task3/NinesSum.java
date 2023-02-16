package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String num = "";
        int result = 0;
        for (int i = 1; i <=lengthOfLastNumber; i++){
            num = num + "9";
            result = result + Integer.parseInt(num);
        }
        System.out.println(result);
    }
}
