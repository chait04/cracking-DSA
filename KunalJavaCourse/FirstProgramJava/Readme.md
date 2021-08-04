## Steps For your first java program

- Everything in java file contains in `class`
- className should be similar to File Name
- this class should be `public`
- `Public` means this class can be access from anywhere

- Dont worry of you dont understand anything

<br />
<hr>
<br />

## If your code is not working

- check if you have installed JDK properly
- run `javac Main.java` , you will get `.class` file which contains byteCode.
- install this extension pack `Java Extension Pack vscjava.vscode-java-pack` for vs code its life saver.

<br />
<hr>
<br />

## lets understand the code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

<br />

- public- means anyone can access it.
- class- just a group of properties and functions
- file should be similar to class Name
- in classes we have methods
- `main` function is a reserverd keyword in java, its the entry point of java file
- **static**- here main is our entry point so we dont wanted to create the obj of that.
- `void` - it is return type, void means we dont want to return anything...

# Intel JI IDE

- we have packages just to sepearate the files and not to have messey code

- `psvm` to get void main function
- `sout` - System.out.println()

The `out` folder contains the all out put of java files,

# output

- `System.out.println("ITs working");` what this thing is saying is, form system out print this line for me
- `System` is what java people created for us, and `out` is assume command line. `println` is a method on that `System` class
- By default `out` is null, means it will print data on command line.

# input

- `Scanner` will read everything you want
- ` Scanner input = new Scanner(System.in);`- scanner is a class which take input, `System.in` means take input through keyboard

> Print the output

- to print the output ` System.out.println(input.next());` will use `next()` function, it will take first string till it finds space from line.
- to print the whole line we have `nextLine()`

# Primitive Data types

- primitive - means the last data type which you cant break into other datatype
- `String name = "chaii"` here you can break string intro single chars, so its not a `primitive` data type

```java

// examples
        int rollNum = 34;

        char letter = 'c';

        // it is float so we write `f` in last
        float deciNum = 45.23f;

        double largeDecimalNumber = 23.332432432;

        // it is long , so `L` in end
        long largeInteger = 234242343133L;

        boolean check  = false;
```

## Program to take input and output

```java

public Class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll no");
        int rollNum = input.nextInt()
        System.out.print("Your number is: " + rollNum )
    }
}

```

# Something

- to write big number `2000,302,232` you cant do this comma is not allowed , so replace it with `_` :-
  `200_324_2322.22`

- input.nextInt()- to get integer
- input.nextFloat() - to get float

# Type casting

- java also have implicit Type casting
- explicit conversion:- convert float into number `(int)(67.21423f)`
- ex: - float num = 324.3424f
  float num = (int)(324.123132f) //type casting

- `byte`- max range of byte var is `256`, if you provide more than that; them it will give you the reminder 256 % 257

```java
        int a = 258;
        byte b= (byte)(a);

        System.out.println(b); // 2
```

- if we have two or more than 2 types, it converts them into the `higher` type value
  ex: - int + float + double = here double is bigger so evberythingwill comverted into `double`

```java

  byte b = 23;
        char c = 'c';
        int i = 23;
        long l = 2323432l;
        short s = 3;
        float f = 34.23f;
        double d = 0.232323;

        double result = ( f*b ) + (i/c) - (d*s);

        System.out.println(( f*b ) + " " + (i/c) + " " + (d*s));
        System.out.println(result);
```

# Rules of Type Promotion

- int \* int = int
- int \* float = float

# Temp

formula to convert temp C in temp Far
`float tempInFar = (tempInCel * 9/5) + 32;`
