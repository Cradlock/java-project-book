## Generics

`Generics` - универсальный шаблон, который позволяет указать тип данных с которым работаеш 
ввиде аргумента.

```
List<String> container = new ArrayList<>();
container.add("Hello");
// container.add(1212); Ошибка
```


`<String>` - указывает с каким типом данных работает. 

Можно также указать свой Generics через угловые скобки.

```


class Box <T> { // для всего класса

    private T item;

    public void set(T item) {
        this.item = item; 
    }


    public T get(){
        return this.item;
    }

    public static <K> void print(K a) { // для функции
        System.out.println(a);
    }

}

```

`T,K` - это типы которые может задать пользователь.

> Можно указать несколько типов
```
<T,K>
```


> Эти скобки всегда указывается до возвращаемого типа данных или после названия класса
```
class SomeClass<...> {} 
```
---
```
public static <...> type someFunction() {}
```

## extends
`extends` -  ключевое слово которое ограничивает типы, типы так что `T` может быть
самим классом или неследником из указанных


```
// Ошибка! Java не знает, есть ли у типа T метод doubleValue()
public <T> void printDouble(T number) {
    System.out.println(number.doubleValue()); 
}

// А вот так — работает!
public <T extends Number> void printDouble(T number) {
    // Теперь Java уверена: раз T — это Number или его подкласс, 
    // значит у него точно есть метод doubleValue()
    System.out.println(number.doubleValue());
}

```
Можно также использовать для интерфейсов

```
interface Runable<T>{

    void run()

}
```
и в функции
```
public <T extends Runable<T>> void run (T obj){
    obj.run(); // Метод Run точно будет
}

```
Можно также сделать несколько ограничений:
```
// T должен быть наследником Animal И реализовывать интерфейс Runnable
class Cage<T extends Animal & Runnable> {
    // ...
}
```
> Если среди ограничений есть класс он должен быть первым и только один класс но можно несколько интерфейсов

```
public <T extends ClassA & InterfaceB & InterfaceC> void process(T item) {
    // Внутри метода доступны методы и ClassA, и InterfaceB, и InterfaceC
}
```




