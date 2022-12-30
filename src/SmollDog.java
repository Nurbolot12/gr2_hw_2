public class SmollDog extends Animal implements Printable {
    private int iq;

    public SmollDog(String age , int iq) {
        super(age);
        this.iq = iq;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\niq: " + iq;
    }
    @Override
    public void print() {
        System.out.println(getInfo());
    }
}

