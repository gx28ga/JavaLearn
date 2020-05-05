package day5;

class InnerClassTest {
    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();
        dog.method();
        Person.Bird bird = new Person().new Bird();
        bird.display();
    }
}

class Person {
    String name = "Person";
    static class Dog {
        String name = "Dog";
        public void method() {

        }
    }

    class Bird {
        String name = "bird";
        void display() {
            System.out.println(this.name);

            System.out.println(Person.this.name);
            System.out.println(new Dog().name);

        }

    }


    {
        class BB {

        }
    }

    public void method() {
        class AA {

        }
    }

    public Person () {
        class CC {

        }
    }
}