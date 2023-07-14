public class Cat {
    private String name;
    private int age;
    private int kittens;
    private String eat;
    private int price;


    public Cat(String name, int age, int kittens, String eat,int price) {
        this.name = name;
        this.age = age;
        this.kittens = kittens;
        this.eat = eat;
        this.price =price;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKittens() {
        return kittens;
    }

    public void setKittens(int kittens) {
        this.kittens = kittens;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}



