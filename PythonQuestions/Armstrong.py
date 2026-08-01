def armstrong(num):
    ds = str(num)
    d = len(ds)
    t2 = num
    sum = 0
    while t2 > 0:
        ld = t2 % 10
        sum += ld ** d
        t2 //= 10
    return (sum == num)
result = armstrong(int(input("Enter Number")))
print(result)

