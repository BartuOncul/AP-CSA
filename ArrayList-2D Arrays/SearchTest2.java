public class SearchTest
{
    public static int binarySearch(int[] elements, int target)
    {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right)
        {
            int middle = (left + right) / 2;
            if (target < elements[middle])
            {
                right = middle - 1;
            }
            else if (target > elements[middle])
            {
                left = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {-20, 3, 15, 81, 432};

        // test when the target is in the middle
        int index = binarySearch(arr1, 15);
        System.out.println(index);

        // test when the target is the first item in the array
        index = binarySearch(arr1, -20);
        System.out.println(index);

        // test when the target is in the array - last
        index = binarySearch(arr1, 432);
        System.out.println(index);

        // test when the target is not in the array
        index = binarySearch(arr1, 53);
        System.out.println(index);
    }
}

