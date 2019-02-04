import java.util.Arrays;

public class MergeSort{
  public static void main(String[] args){
    int[] exampleArr = {4,3,1,2,56,23,12,20,40,49,300,20,1,4,5};
    mergeSort(exampleArr);
    for(int x : exampleArr){
      System.out.println(x);
    }
    return;
  }

  public static void mergeSort(int[] arr){
    int len = arr.length;

    if(len <= 1) { return; }

    int median = (int) len / 2;
    int[] left = Arrays.copyOfRange(arr, 0, median);
    int[] right = Arrays.copyOfRange(arr, median, len);
    
    mergeSort(left);
    mergeSort(right);

    int leftLen = left.length;
    int rightLen = right.length;

    int leftPointer = 0;
    int rightPointer = 0;
    int index = 0;

    while(leftPointer < leftLen && rightPointer < rightLen){
      if(left[leftPointer] < right[rightPointer]){
        arr[index] = left[leftPointer];
        leftPointer++;
      }
      else{
        arr[index] = right[rightPointer];
        rightPointer++;
      }
      index++;
    }

    while(leftPointer < leftLen){
      arr[index] = left[leftPointer];
      leftPointer++;
      index++;
    }
    while(rightPointer < rightLen){
      arr[index] = right[rightPointer];
      rightPointer++;
      index++;
    }

  }

}