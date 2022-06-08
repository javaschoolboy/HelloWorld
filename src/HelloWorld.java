class HelloWorld {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "white", 2);
        System.out.println(cat.voice());
        System.out.println(cat.name + ", " + cat.color + ", " + cat.age);
    }
}

class Cat {
    String name;
    String color;
    int age;

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    Cat() {
        System.out.println("Constructor");
    }

    String voice() {
        return "meow!";
    }
}