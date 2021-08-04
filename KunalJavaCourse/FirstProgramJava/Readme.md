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
