package Assignment;

public class checkArrayRotation {

    public static int findRotationPointIndex(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                return (i + 1) % n;
            }
        }

        // If no rotation point is found, return 0
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {9, 6, 1, 2, 3, 4};
        int rotationPointIndex = findRotationPointIndex(arr);

        System.out.println("Rotation Point Index: " + rotationPointIndex);
    }
}