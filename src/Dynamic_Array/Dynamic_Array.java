package Dynamic_Array;

public class Dynamic_Array {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);

        }
    }

    public void add(int value, int index) {  //avelacnel tivy uzac indeqsum
        if (index < 0 || index > size) {
            System.err.println("error");
        } else {
            if (array.length == size) {
                extend();
            }
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];

            }
            array[index] = value;
            size++;
        }
    }

    public void set(int value, int index) {  // dnum e nshvac tivy ayd indeqsi tak
        if (index < 0 || index > size) {
            System.err.println("error");
        } else {
            array[index] = value;
        }
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("error");
            return -1;
        }
        return array[index];
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            System.err.println("error");
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];

        }
        size--;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean isExist(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}




