def inc(x: Int) = x + 1
inc(2)
val inc2: Int => Int = x => x + 1
inc2(2)
val add : (Int, Int) => Int = (x, y) => x + y
add(2,3)
((x: Int, y: Int) => x + y)(2, 3)
val combine = (a: Any) => (b: Any) => (c: Any) => a +: b +: List(c)
val a = combine(1)
val b = a(2)
val c = b(3)
println(c)
println(combine('a')('b')('c'))
println(List(1, 2, 3, 4, 5).map(x => x * 2))
println(for (x <- List(1, 2, 3, 4, 5)) yield x * 2)
println(List(1,2,3,4,5,6,7,8,9).filter(_ < 5))
println(for (x <- List(1, 2, 3, 4, 5) if x < 5) yield x)
