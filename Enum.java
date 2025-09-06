enum Status{
    Runnning, Pending, Failed,Success;
}
public  class Enum{
    public static void main(String[] args) {
        Status s=Status.Runnning;
        System.out.println(s.ordinal());
    }
}