
class Incorrect implements Status {
    public void change_status(FSM wrapper) {
        wrapper.set_status(new Incorrect());
    }

    public String toString(){
        return "Incorrect";
    }
}
