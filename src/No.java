
class No implements Status
{
    public void change_status(FSM wrapper)
    {
        wrapper.set_status(new Yes());
        System.out.println("   low speed");
    }

    public String toString(){
        return "No";
    }
}