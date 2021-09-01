public class Main {

    public static int getMaxValue(int[] weight, int[] values, int capacity){
        int[] pValues = new int[4];
        for(int i = 0; i< weight.length; i++){
            pValues[i] = values[i] / weight[i];
        }
        int max = 0;
        while(capacity>0){
            int i_max = 0, currentMax = 0;
            for(int i = 0; i<pValues.length; i++){
                if(pValues[i]>currentMax){
                    currentMax = pValues[i];
                    i_max = i;
                }
            }
            int a = Math.min(weight[i_max],capacity);
            capacity -= a;
            pValues[i_max] = 0;
            max += a*currentMax;
        }
        return max;
    }

    public static void main(String[] args) {

        //The weights and values can be entered by the user as well
        int[] weight = {10, 40, 20, 30 };
        int[] values = {60, 40, 100, 120};
        int capacity = 50;
        System.out.println(getMaxValue(weight,values,capacity));

    }
}
