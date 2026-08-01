def fibbonaci(terms):
    i = first = 0
    second = 1
    while i < terms :
        print (f"{first}")
        next = first + second 
        first = second
        second = next 
        i+=1

fibbonaci(int(input("Enter Terms")))