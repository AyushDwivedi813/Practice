def powerofnum(nu,pow) :
    i=1
    num=nu
    while(i<pow):
        num*=nu
        i+=1
    print(f"{nu} the power {pow} is {num}")
nu =int(input("Enter NUM : "))
pow =int(input(f"Enter Power of on {nu} :"))
powerofnum(nu,pow)
