## Наследование

`Наследование` используется при помощи `extends`:

```
class Parent{
    int val;


    void do(){
        ... //
    }
}


class Child extends Parent{
    
    @Override
    void do(){
        ... //

        super.do(); // Метод родителя
    }

    Child(){
        super(); // Вызов конструктора родителя
    }
}
```


`super` - функция даюшая доступ к родителю

> Можно указать только одного родителя.



