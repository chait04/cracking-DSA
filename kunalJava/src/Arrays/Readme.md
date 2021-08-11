- primitives are stored in stack memory and objects are in heap memory;

# Arrays

dynamic memory allocation it happens in heap memory

- in c/c++ u have continious memory allocation...
- in java it is diffrent, it depends on `JVM` weather to make it contineous or not..
- array objects are stored in heap
- heap objects are not contineous, not contineous means `in ram it dosent get contineous blocks`

```java
// in the below array everything is going to be 00000

int [] arr = new int[5]// here creating array of fixed length
int [] arr2 = { 3,2,13,1 }
```

## null

- if you dont assigned anything to var then its value will be `null`.
- refrence var also points to null.

arrays are mutable in java

# Dynamic Arrays

`import java.util.*;`
Syntax:- `ArrayList<Integer> list = new ArryaList<>(10)`

- the size is fixed..
