package ErSearch;

/**
 * 二分法实现查找
 * Search 非递归查询
 * Search 递归查找法
 */
public class ErSearch {
    public static int Search (int [] arr , int target){
        int start=0;
        int end = arr.length;
        int mid;

        while (start<=end){
            mid =(start+end)/2;
            if(arr[mid]==target){
                return target;
            }else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }

    public static  int Search2(int [] arr ,int start,int end,int target){
        int mid = (start+end)/2;
        if(arr[mid] == target ){
            return mid;
        }else if(arr[mid]<target){
            return Search2(arr,mid+1,end,target);
        }else if(arr[mid]>target){
            return Search2(arr,start,mid-1,target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[9] ;
        for(int i=0;i<9;i++){
            arr[i]=i;
        }
        System.out.println( Search2(arr,0,arr.length,7) );
    }
}
