public class Fish {
    private String name;
    private int age ;
    private String live;
    private String color;
    private int length;

    public Fish(String name,int age, String live,String color,int length){
        this.name= name;
        this.age=age;
        this.live=live;
        this.color = color;
        this.length= length;
    }
    public  Fish(){

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

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
