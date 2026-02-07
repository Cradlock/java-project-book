## interface
`interface` - это класс контракт который описывает что класс должен
уметь делать.
Пример:

```
public interface Remote{
    
    // Неважно как но обьекты должны уметь это делать
    void on();

    void off();

    
    // Привязан к самому Remote 
    static void info(){
        ... 
    }

}

public interface Pricer{
    
    void buy();


    void sale();
}

```

А классы подписывают контракт через `implements`

```
class TV implements Remote,Pricer {
    
    @Override
    public void on(){
        ...
    }

    @Override 
    public void off()[
        ...
    }

    @Override 
    public void buy(){
        ... 
    }

    @Override 
    public void sale(){
        ...
    }
} 

```
> Через `interface` нельза создавать обьект

> Все переменные автоматически становатся `public static final`
---
При помощи интерфейсов можно использовать полиморфизм.
```
Remote controllers[] = { new TV(),new Smarpthone(),new Microwave };

for(Remote r : controllers){
    r.on(); // каждому дает команду включится и каждый делает по своему
}
```
Тут программа работает с интерфейсом и ей абсолютно все равно 
кто-то на самом деле он просто выполняет то что есть у всех


> Если у двух интерфесов одинаковые методы он просто используется 
то что было опредеделенно. А если оба помечены как `default` то
компилятор попрости вручную решить конфликт







