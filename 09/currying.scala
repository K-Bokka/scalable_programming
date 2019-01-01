def plainOldSum(x: Int, y: Int) = x + y

def curriedSum(x: Int)(y: Int) = x + y

def first(x: Int) = (y: Int) => x + y

val second = first(1)

second(2)
