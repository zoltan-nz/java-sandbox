# Playing with Java ByteCode

This is a simple experiment with Java ByteCode. Creating basic `java` files, compiling with `javac` and checking out the `class` file content with `javap -v`

```
$ cd ./src/main/java/nz/zoltan
$ javac -source 1.5 -target 1.5 Prints.java
$ javap -v Prints
```

```java
public static void main( String[] args ) {
    System.out.println( "Hello World!" );
    System.out.println( 1 );
    System.out.println( true );
    System.out.println( 1.1314 );
}
```

```text
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #3                  // String Hello World!
         5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        11: iconst_1
        12: invokevirtual #5                  // Method java/io/PrintStream.println:(I)V
        15: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        18: iconst_1
        19: invokevirtual #6                  // Method java/io/PrintStream.println:(Z)V
        22: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        25: ldc2_w        #7                  // double 1.1314d
        28: invokevirtual #9                  // Method java/io/PrintStream.println:(D)V
        31: return
```

```java
public static void main(String[] args) {
    ArrayList<Double> doubles = new ArrayList<Double>();
    doubles.add(1.2);
    doubles.add(2.3);
    doubles.add(3.4);
    System.out.println(doubles);
}
```

```text
    Code:
      stack=3, locals=2, args_size=1
         0: new           #2                  // class java/util/ArrayList
         3: dup
         4: invokespecial #3                  // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_1
         9: ldc2_w        #4                  // double 1.2d
        12: invokestatic  #6                  // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        15: invokevirtual #7                  // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
        18: pop
        19: aload_1
        20: ldc2_w        #8                  // double 2.3d
        23: invokestatic  #6                  // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        26: invokevirtual #7                  // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
        29: pop
        30: aload_1
        31: ldc2_w        #10                 // double 3.4d
        34: invokestatic  #6                  // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
        37: invokevirtual #7                  // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
        40: pop
        41: getstatic     #12                 // Field java/lang/System.out:Ljava/io/PrintStream;
        44: aload_1
        45: invokevirtual #13                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        48: return
```