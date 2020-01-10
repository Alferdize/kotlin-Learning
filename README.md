# kotlin-Learning



## Compiling Codes as Executable Jar file
 
`kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar`


## Compiling Codes as a library

`kotlinc HelloWorld.kt -d HelloWorld.jar`


## Running our Kotlin Program

`kotlin -classpath HelloWorld.jar HelloWorldKt`
