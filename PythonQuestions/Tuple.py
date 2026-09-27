tuple = (1,4,6,7,9)
tuple1 =('ayush','kunj','kunso')
print(tuple)
print(tuple1)

# Print the First Third and Last Element

num = (10,45,65,7,98,67)
print(num[0]) # First Element
print(num[2]) # 3rd Element
print(num[-1]) # Last Element

# Find the number of elements in a tuple without manually counting.
print(len(num)) # 6 output

# manual

num=(10,100,1000,20,1002,302,7008)
for i in range (7):
    print(num[i])
# Alternate approach
for i in num : 
    print(num[i])

# Print elements from index 2 to 5 and reverse the tuple using slicing.

t = (1, 2, 3, 4, 5, 6, 7, 8)
# print(t[2:6])

print(t[::-1])