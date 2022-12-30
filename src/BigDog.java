public class BigDog extends Animal implements Printable {
    private int force;

    public BigDog(String age, int force) {
        super(age);
        this.force = force;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nforce: " + force;
    }

    @Override
    public void print() {
        System.out.println(getInfo());
    }
}
