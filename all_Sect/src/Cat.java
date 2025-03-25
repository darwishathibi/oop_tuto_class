public class Cat {
    final String name;
    int age;

    public Cat(){
        name="koko";
        age=4;
    }

    public Cat(String name, int age){
        this.name=name;
        this.age=age;
//        name = n;
//        age = a;

    }

    public Cat(String name){
        this.name=name;
//        name = a;
    }

    public static void main(String[] args) {

        Cat mycat = new Cat();
        System.out.println(mycat.name);
        System.out.println(mycat.age);

        Cat mycat2 = new Cat("kiki", 5);
        System.out.println(mycat2.name);
        System.out.println(mycat2.age);
    }


}
