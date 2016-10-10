
class Default implements Status {
    public void change_status(FSM wrapper){
        wrapper.set_status(new Default());
    }

    public String toString(){
        return "Default";
    }
}
