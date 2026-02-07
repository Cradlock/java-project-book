## Абстрактный класс

Класс созданный чтобы его методы и обьекты переопределяли, от него нельзя создавать обьекты
только наследоватся, используется ключевое слово `abstract`


```
abstract class Shape{ // нельзя создать обьект: new Shape(); compile error 
    int x;
    int y;

    Shape(int x,int y){
        this.x = x;
        this.y = y;


    }

    void print(){}

}


class Rectangle extends Shape{

    int w;
    int h;

    Rectangle(int x,int y,int w,int y){
        super(x,y); // Используется для Shape конструктора


        this.w = w;
        this.y = y;
    }

}


```








