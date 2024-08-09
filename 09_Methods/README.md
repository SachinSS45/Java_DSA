# Functions/Methods in java

For repeated code we can bundle in some specific way i.e in method.We can use again and again.


## Syntax : 

           
```
access_modifier return_type method_name( parameter ){
          //body
        return type;
}
```
Refer : [Code](https://github.com/SachinSS45/Java_DSA/blob/master/09_Methods/Codes/src/com/sachin/Greeting.java) -> How to return void from method.
#### Return Type : 
```
It is nothing when method call finishes. The one who is calling the method.
void : It is used when you don't want to return anything
```
Refer : 
[Code](https://github.com/SachinSS45/Java_DSA/blob/master/09_Methods/Codes/src/com/sachin/Main.java)
#### Difference between parameter and arguments :
Parameters : A parameter is a variable used to define a particular value during a function definition. Whenever we define a function we introduce our compiler with some variables that are being used in the running of that function. These variables are often termed as Parameters. 

Arguments : An argument is a value passed to a function when the function is called. Whenever any function is called during the execution of the program there are some values passed with the function. These values are called arguments.

Refer : [Code](https://github.com/SachinSS45/Java_DSA/blob/master/09_Methods/Codes/src/com/sachin/Sum.java)
```
public class Demo {
    // a and b are paramaters
    public static int multiply(int a, int b)
    {
        return a * b;
    }
    
    public static void main(String[] args)
    {
        int x = 2;
        int y = 5;
 
        // the variables x and y are arguments
        int product = multiply(x, y);
 
        System.out.println("PRODUCT IS: " + product);//10
    }
}

