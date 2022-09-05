package search.timkiem_dequy;


public class SearchRecursive {

      private static  int [] list = {2,3,7,12,34,56,87,123};
        //sắp xếp lại theo thứ tự từ bé đến lớn

        //Khai báo hàm binary search sử dụng đệ quy

    public static int binarySearch(int [] arr, int left, int right, int value) {
        while (left<=right) {
            int mid = (left + right)/2; //Khai báo biến mid và gán giá trị tb cộng (ở giữa)
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] >value) { //so sánh phần tử bên trái của mid, right = mid -1;
                right = mid -1;
            } else { //value > arr[mid] so sánh phần tử bên phải của mid, left = mid + 1
                left = mid + 1;
            }
            return binarySearch(arr, left, right, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,0, list.length-1, 12 ));
        System.out.println(binarySearch(list,0, list.length-1, 34 ));
        System.out.println(binarySearch(list,0, list.length-1, 123 ));
    }

}
