class Reduce {
    public int numberOfSteps(int num) {
        int counter = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num/2;
                counter ++;
                continue;
            } else {
                num -= 1;
                counter ++;
                continue;
            }
        }
        return counter;
    }
}
