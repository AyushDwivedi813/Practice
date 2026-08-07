import math


def perfectnum(n):
    s = 0
    if(n<1):
        return False
    for i in range(2,(math.sqrt(n))+1):
        if(n%i==0):
            s+=i

    return s == n
print(perfectnum(6))

