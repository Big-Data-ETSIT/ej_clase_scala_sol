# Scala problems

## Execution

```
cd code
scalac ./src/main/scala/Ej1_sol.scala
scala Ej1Sol
```

Alternatively when is only one object

```
cd code
scala ./src/main/scala/Ej1_sol.scala
```

Alternatively with sbt
```
cd code
sbt compile
sbt "runMain Ej1Sol"
```

## Generate executable with sbt


```
sbt package
scala -cp  target/scala-2.12/code_2.12-0.1.0-SNAPSHOT.jar Ej1Sol
```