import java.util.Arrays;

public class Top {
    private int[] state;
    private int N;

    public Top(int numberOfCells, int N) {
        state = new int[numberOfCells];
        this.N = N;
        for (int i=0; i<N; i++) {
            state[N-1+i] = 1;
            state[state.length-N-i] = 1;
        }
    }

    public void print() {
        for (int cellValue : state) {
            if (cellValue == 1) {
                System.out.print("♥");
            } else {
                System.out.print("♡");
            }
        }
        System.out.println();
    }

    public void update() {
        int[] nextState = new int[state.length];
        for (int i = 0; i < state.length; i++) {
            int left, center, right;
            if (i == 0) {
                left = 0;
            } else {
                left = state[i - 1];
            }
            center = state[i];
            if (i + 1 < state.length) {
                right = state[i + 1];
            } else {
                right = 0;
            }
            nextState[i] = Math.max(Math.max(left, center), right);
            //if left + center + right > 1 -> turn black
        }
        state = nextState;
    }

    
    public void run() {
        print();
        for (int i = 0; i < N-1; i++) {
            update();
            print();
        }
    }
}
