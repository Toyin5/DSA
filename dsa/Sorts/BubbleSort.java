package dsa.Sorts;
public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        System.out.println("Before sorting");
        Display(arr);

        SortDescendingly(arr);
        System.out.println("\nAfter sorting: Descendingly");
        Display(arr);

        SortAscendingly(arr);
        System.out.println("\nAfter sorting: Ascendingly");
        Display(arr);
    }
    
    public static void Display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }

    public static void SortAscendingly(int[] arr){
      for (int i = 0; i < arr.length; i++) {
            //assume the minimum value is the first index
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                //check with the rest of the array
                if (arr[j] < min){
                    //update minimum
                    min = arr[j];
                    //swap
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }   
    }

    public static void SortDescendingly(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //assume the minimum value is the first index
            int max = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                //check with the rest of the array
                if (arr[j] > max){
                    //update minimum
                    max = arr[j];
                    //swap
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }   
    }
}