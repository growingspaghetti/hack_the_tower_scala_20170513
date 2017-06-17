2017 06 13 London Java Community Hack The Tower
===============================================
https://tsrtesttest.appspot.com/wiki/scala

You've got to use

|scala  |sbt     |scalaTest|
|:-----:|:------:|:-------:|
|v2.12.2|v0.13.15|v3.0.0   |

build.sbt
```
scalaVersion := "2.12.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % Test
```

Scala Sheet
-----------
![scala worksheet](./scalaworksheet.png)


Object with main(args[])
------------------------
![new scala class](./nwescalaclass.png)

![kind -> object](newkindobject.png)

Define function
---------------
```
def getResult(number: Int): String = {
def main(args: Array[String]): Unit = {
```

function is a value
-------------------
http://alvinalexander.com/scala/how-to-use-functions-as-variables-values-in-scala-fp
```
val double = (i: Int) => { i * 2 }
```
is equivalent to
```
def double(i: Int) = {
  i * 2 //return
}
```

```
val f: (Int) => Boolean = i => { i % 2 == 0 }
```
is equivalent to
```
def f(i: Int): Boolean => {
  i % 2 == 0 //return
}
```

under score
-----------
?, default, it
```
val f: Int => Boolean = _ % 2 == 0
```
is equivalent to
```
def f(_: Int): Boolean => {
  _ % 2 == 0 //return
}
```

Return
------
http://docs.scala-lang.org/tutorials/tour/pattern-matching.html
```
if   return a
else return b
```
```
def matchTest(x: Int): String = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "many"
}
```

Extra keywords
--------------
```
Unit / void .wrap()
Explicit approach, Inplicit approach //val add: (Int, Int) => Int = (x,y) => x + y
```

http://twitter.github.io/effectivescala/

Haskell
=======
```
:type (&&)
(&&) :: Bool -> Bool -> Bool
```
is equivalent to like
```
$man &&

&&(1)                    BSD General Commands Manual                   &&(1)

NAME
       && - evaluate both expr`A` and expr `B` are true

SYNOPSIS
       && A:Bool B:Bool [options] [pathname ...]

DESCRIPTION
       Display the result of evaluation of expressions in Bool.

       The two expressions are mandatory arguments.
```

```
    e = 2.7182818284 :: Float
    k = v :: t
```
is equivalent to scala's
```
val e: Double = 2.7182818284

*println(e)
e: Double = 2.7182818284
2.7182818284
```

Definition of HashMap is
```
$:t HashMap
HashMap :: * -> * -> *
```

Install Haskell Interpreter
---------------------------
Synaptic > Haskell > STACK

```
ryoji@ubuntu:~$ ghci
GHCi, version 7.10.3: http://www.haskell.org/ghc/  :? for help
Prelude> 1 * 2
2
Prelude> :t 1
1 :: Num a => a
Prelude> :t return 1
return 1 :: (Monad m, Num a) => m a
```

https://downloads.haskell.org/~ghc/7.8.4/docs/html/users_guide/interactive-evaluation.html
```
Prelude> x <- return 42
Prelude> print x
42
Prelude> :t x
x :: Integer
```
is equivalent to Bash's
```
print `return 42`
```

https://stackoverflow.com/questions/5417623/ghci-not-in-scope-message
http://learnyouahaskell.com/syntax-in-functions

module
```
bmi :: Floating a => a -> a -> a
bmi weight height = weight / height ^ 2
..<interactive>:21:1: Not in scope:
```
is equivalent to like scala's
```
def bmi(<?>: of Floating, <?>: of Floating): <?> = {
  ? / ? ^ 2
}
def bmiImpl(weight: Double, height: Double): Double = {
  weight / height ^ 2
}
```

```
Prelude> let lucky x = show (x + 1)
Prelude> :t lucky
lucky :: (Num a, Show a) => a -> String
Prelude> lucky 1
"2"

Prelude> let bmi weight height = weight / height ^ 2
Prelude> bmi 80 2.0
20.0

Prelude> :show bindings
x :: Integer = 42
lucky :: (Num a, Show a) => a -> String = _
bmi :: Fractional a => a -> a -> a = _
```
*Fractional. Not Floating.
```
bmi::Fractional(weight::Fractional, height::Fractional) {
  weight / height ^ 2
}
```