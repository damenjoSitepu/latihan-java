public class JavaInsertions {
    int numArray[] = null;

    // Default Initializing Value In Constructor Method
    public JavaInsertions(int sizeOfArray) {
        numArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            numArray[i] = Integer.MIN_VALUE;
        }
    }

    // Inserting Values To The Array Of Integer
    public void insertNumber(int position, int value) {
        try {
            // Check apakah posisi index sudah ditempati atau belum
            if (numArray[position] == Integer.MIN_VALUE) {
                numArray[position] = value;
                System.out.println("Value " + value + " In Position: " + position + " Succesfully Inserted!");
            } else {
                System.out.println("Value " + value + " In Position: " + position
                        + " Failed To Inserted Because The Position Was Occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println(
                    "The Position And The Values That You Want To Be Inserted Was Reach The Maximum Length Of Our Array Size!");
        }

    }

}
