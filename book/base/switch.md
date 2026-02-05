## Switch case
в `Java` switch/case можно использовтаь следующим способом.

```
int oper = 1;
int a = 12; int b = 5;

int result = switch (oper) 
{
    case 1 -> a*b;
    case 2 -> a+b;
    case 3 -> a-b;
    case 4 -> a/b;

    default -> 0;
}

```
В зависимости от `oper` он выполнить определенное действие и вернет 
результат.


