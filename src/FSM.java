
public class FSM {
    private Status current_status;

    public FSM() {
        current_status = new Default();
    }

    public void set_status(Status s) {
        current_status = s;
    }

    public void change_status() {
        current_status.change_status(this);
    }

    public Status get_status(){
        return current_status;
    }
}
