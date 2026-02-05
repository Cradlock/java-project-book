## interface
`interface` - это класс контракт который описывает что класс должен
уметь делать.
Пример:

```
public interface Remote{
    
    // Неважно как но обьекты должны уметь это делать
    void on();

    void off();
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

    }
} 

```

