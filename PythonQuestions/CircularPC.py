def isPrime(n):
    if n < 2 :
        False
    for i in range (2,int(n**0.5)+1):
        if n % 2 == 0:
            return False
    return True
def isCircularPrime(n):
    s = str(n)
    for i in range (len(s)):
        rotated = int(s[i:]+s[:i])
        if not isPrime(rotated) :
            return False
    return True

n = int(input("Enter Number"))
isPrime(n)
print(isCircularPrime(n))