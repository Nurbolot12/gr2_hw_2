public class Dog extends Animal implements Printable{
    private int fast;

    public Dog(String age, int fast ) {
        super(age);
        this.fast = fast;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nfast: " + fast;
    }

    @Override
    public void print() {
        System.out.println(getInfo());

    }
}

