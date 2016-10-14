
public class StateMachine {
    private boolean evenZero = true;
    private boolean evenOne = true;


    public void accept(int nextNumber) {
        switch (nextNumber) {
            case 0:
                evenOne = !evenOne;
                break;
            case 1:
                evenZero = !evenZero;
                break;
            default:
                throw new IllegalArgumentException("Unexpected input: " + nextNumber);
        }
    }

    public State getState() {
        if (evenZero && !evenOne) {
            return State.YES;
        }
        return State.NO;
    }
}
