
class Yes implements Status
{
    public void change_status(FSM wrapper)
    {
        wrapper.set_status(new Yes());
        System.out.println("");
    }

    public String toString(){
        return "Yes";
    }
}
