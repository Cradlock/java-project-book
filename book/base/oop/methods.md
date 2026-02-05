## Специфические методы классов


### Инициализатор
Это блок кода в фигурных скобках `{}` он не видимый и вызывается 
до всех методов.
```
class Person{
    int age;
    String name;
    
    static open;

    {
        this.age = 0;
        this.name = "Undefine";
    }
    
    // Можно также сделать static тогда вызовется один раз при создании класса 

    static {
        open = true;
    }
}
```



### Конструкторы
Метод в классе который используется при создании обьекта через new.
---
> Особенности:
* Имя совпадает с именем класса

* Нет возвращаемого типа

* Вызывается один раз при создании
---

**Типы конструктора**

- `default`: Создается сам. обозначется пустым

- `с параметрами`: Используется при создании (сам создаеш)
```

class Person{
    int age;
    String name;

    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

}
```

- `Копирования`: Принимает обьект того же класса и копирует данные
```
class Person{
    int age;
    String name;

    public Person(Person other){
        this.age = other.age;
        this.name = other.name;
    }

}

```



### Методы класса `Object`
Все классы неявно наследуются от общего класса `java.lang.Object`.
Это буквально прародитель всех классов.
И есть несколько методов все их можно переопределить:

- `equals`: Проверяет равны ли обьект.
```
boolean equals(SomeClass object){
    ... 
}
```
По дефолту сранивает адреса в памяти

- `hashCode`:Возврашает числовой опечаток обьекта.
```
int hashCode(){
    ...
}
```

- `toString`: Преврашает обьект в строку
```
String toString(){
    ...
}
```
По дефолту возврашает `ИмяКласс@хеш-код`

- `getClass`:Возврашет информацию о классе
```
Class<?> getClass(){
    ...
}
```

### Native методы
Методы которые используют функции которые упаковын в .dll или .so 
и лежат где-то в системе.

```

class SomeClass {
    // Тут только обьявление, реализация внутри .dll/.so 
    public native void fastCalculate();

    static {
        System.loadLibrary("NativeLibrary");
    }

}

```






### Default методы
Методы которые уже реализованы в интерфейсе, если метод реализован
то используется он.
```
public interface Vehicle {
    void drive(); // Обычный метод

    // Default метод с телом
    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
    // Метод honk() реализовывать НЕ ОБЯЗАТЕЛЬНО, он уже есть
}

```







