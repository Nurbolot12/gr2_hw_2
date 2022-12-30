public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("Dog"),
                createObject("BigDog"),
                createObject("SmollDog")
        };

        for (Printable element: printables) {
            element.print();

        }



    };
    public static Printable createObject(String className){
        switch (className){
            case "Dog":
                Dog dog= new Dog("13",12);
                return dog;
            case "BigDog":
                BigDog bigDog = new BigDog("12",12);
                return bigDog;
            case "SmollDog":
                SmollDog smollDog = new SmollDog("10",100);
                return smollDog;
        }
        return null;
    }

}