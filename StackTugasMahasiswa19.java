public class StackTugasMahasiswa19 {
    Mahasiswa19[] stack;
    int top;
    int size;

    public StackTugasMahasiswa19(int size) {
        this.size = size;
        stack = new Mahasiswa19[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa19 mhs) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas.");
            return;
        }
        stack[++top] = mhs;
    }

    public Mahasiswa19 pop() {
        if (isEmpty()) {
            return null; 
        }
        return stack[top--];
    }

    public Mahasiswa19 peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public Mahasiswa19 peekBottom() {
        if (isEmpty()) {
            return null;
        }
        return stack[0];
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.printf("%s\t%s\t%s\n",
                    stack[i].nama,
                    stack[i].nim,
                    stack[i].kelas);
        }
    }

    public int count() {
        return top + 1;
    }
}