class Gcd:
    def gcd(self, a , b):
            oa=a
            ob=b
            r = 1
            while b != 0:
                r  = a % b
                a = b  
                b = r
            return a            
a = int(input("Enter First number"))
b = int(input("Enter Second number"))
obj= Gcd()
print(obj.gcd(a,b)) 