def num_digits(num):
    tem=num
    count = 0
    while(tem != 0):
        tem //= 10
        count+=1
    print(count)
num=int(input())
num_digits(num)

