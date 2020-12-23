# https://docs.scala-lang.org/tour/traits.html

scala> trait Iterator[A] {
     | def hasNext: Boolean
     | def next(): A
     | }
defined trait Iterator

scala> 

scala> class IntIterator(to: Int) extends Iterator[Int] {
     | private var current = 0
     | override def hasNext : Boolean = current < to
     | override def next(): Int = {
     | if (hasNext){
     |     val t = current
     |     current += 1
     |     t
     | }else 0
     | }
     | }
defined class IntIterator

scala> 

scala> 

scala> val iterator = new IntIterator(10)
iterator: IntIterator = IntIterator@698d6d30

scala> iterator.next()
res4: Int = 0

scala> iterator.next()
res5: Int = 1

scala> iterator.next()
res6: Int = 2

