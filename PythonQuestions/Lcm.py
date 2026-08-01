from gcd_file import Gcd 
class Lcm(Gcd):
    def lcm(self ,a,b,z):
        lm = 1;
        lm = abs(a*b)/z
        return lm
lc = Lcm();
a=int(input("Enter First Number"))
b=int(input("Enter Second Number"))
   
z=lc.Gcd(a,b)
print(lc.lcm(a,b,z))

