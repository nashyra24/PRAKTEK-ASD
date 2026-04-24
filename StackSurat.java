public class StackSurat {
    Surat19[] data;
    int top;

    StackSurat(int kapasitas) {
        data = new Surat19[kapasitas];
        top = -1;
    }

    boolean isFull() {
        return top == data.length - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Surat19 s) {
        if (!isFull()) {
            data[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Surat19 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Surat19 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Belum ada surat.");
            return null;
        }
    }

    void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                data[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}