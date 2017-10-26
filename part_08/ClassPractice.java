package part_08;

class ExceptionExercise {

    static void genException() throws Exception {
        int nums[] = new int[7];

        System.out.println("No exception yet.");

        nums[7] = 10;
    }

    public static void main(String[] args) {
        try {
            genException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}