class Cat {

    public static int counter;
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name=name;
        this.age=age;
        counter++;
        if(Cat.getNumberOfCats()>5){
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}