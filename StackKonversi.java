public class StackKonversi {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(int nilai) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = nilai;
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            int nilai = tumpukanBiner[top];
            top--;
            return nilai;
        } else {
            System.out.println("Stack kosong!");
            return -1; // Mengembalikan -1 sebagai indikator stack kosong
        }
    }
    public String konversiDesimalKeBiner(int nilai) {
        if (nilai == 0) return "0";
        top = -1;
        while (nilai > 0) {
            int sisa = nilai % 2;
            push(sisa);
            nilai /= 2;
        }

        String biner = "";
        while (!isEmpty()) {
            biner += pop();
        }

        return biner;
    }
}