# scalable_programming
For Scala lerning

ref: https://www.amazon.co.jp/dp/B01LYPRFI7


example
```shell
$ brew install scala
$ scala
Welcome to Scala 2.12.5 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_152).
Type in expressions for evaluation. Or try :help.

scala> new Rational(1, 2)
<console>:12: error: not found: type Rational
       new Rational(1, 2)
           ^

scala> :load rational.scala
Loading rational.scala...
defined class Rational

scala> new Rational(1, 2)
Created1/2
res1: Rational = Rational@314b9e4b

scala> :reset
Resetting interpreter state.
Forgetting this session history:

:load rational.scala
new Rational(1, 2)

Forgetting all expression results and named terms: $intp
Forgetting defined types: Rational

scala> new Rational(1, 2)
<console>:12: error: not found: type Rational
       new Rational(1, 2)
           ^

scala> :quit
```
