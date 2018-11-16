# Javassist Tutorial

## Tasks

All tasks will be coded in the `quickstart` module.

1. Prepare your working environment.
    * Clone the `javassist-tutorial` repository.

        ```
        git clone https://github.com/Software-Testing/javassist-tutorial.git:
        ```

    * Build the entire project
    
        ```
        cd javassist-tutorial
        mvn package
        ```
    * Open the `javassist-tutorial` project with the IDE fo your preference. (It should work :P)

2. Create a new class named `Point`. Verify the result using `javap`.
    * Add two integer fields `x` and `y` to the class. Explore different alternatives to do so.
    * Add getters and setters to both fields.
    * Override the `toString` method.

3. Use a `Loader` to report all classes being loaded during the execution of the `QuotesApp` class located in the `input` module.

## Independent tasks

You should perform the following tasks on your own. All tasks will target classes from the `input` module.

4. Add a `translate` method to the `Point` class that translates the coordinates using a given pair of integer values. With the result it should be possible to do something like:
    ```Java
    Point p = new Point(3, 4);
    p.translate(3, -2);
    ```
    the point is now at `(6,2)`.

5. Modify the `toString` method of the `Quote` class to add ellipsis at the end if the result is longer than 20 characters.
    **Example:**
    The following code
    ```Java

    Quote phrase = new Quote("Yoda", "Do or do not. There is no try.");
    System.out.println(phrase);
    ```
    prints `Yoda - Do or do not. There is no try` but after the modification should print `Yoda - Do or do n...`.

    On the other hand:
    ```Java

    Quote phrase = new Quote("Hodor", "Hodor");
    System.out.println(phrase);
    ```

    prints `Hodor - Hodor` originally and should print the same after the modification.

6. Execute the class `QuotesApp` and modify all methods of the loaded classes to make them print their signature to the console when invoked.

7. Perform the modification of the second independent task dynamically using a `Translator` and execute `QuotesApp`.

8. The class `FileUtils` has several methods that take a `java.io.FileWriter` as a parameter and possibly other parameters as well. For all those methods generate an overloaded version that instead of a `java.io.FileWriter` object they receive a `String` with the path of the output file. The new methods should create the file, invoke the original method, close the file. If there are more parameters, they should be passed as well. The new methods should return the same values as the original methods and handle possible exceptions.


## Resources

The Javassit [Github site](http://jboss-javassist.github.io/javassist/) contains pointers to tutorials and further materials.
A [Github repository](https://github.com/jboss-javassist/javassist) is also available.
