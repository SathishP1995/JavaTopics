
public class Arrays {
    public static void main(String args[]){
        int[] numbers = {1,2,3};
        int[] temp = new int[5];
        int length = numbers.length;
        System.out.println("The length of 1st array:"+length);
        for(int j=0; j<length;j++){
            temp[j] = numbers[j];
        }
        numbers = temp;
        System.out.println("The Final output:"+numbers.length);

        /*int[] copyNumbers = {1,5,6,8};
        int[] copiedNumbers = Arrays.copyOf(copyNumbers, 8);*/

    }
}
