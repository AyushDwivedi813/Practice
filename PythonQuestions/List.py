# Python program to demonstrate the use of list and its length
list =[1,3,4,5,6,7,8,9,10]
print("The List is: ", list)

list1 =['ayush','sachin','rahul','rohit'] 
print("The List is: ", list1)


# Finding the length of both lists
print("Length of Number List: ", len(list)," + Length of Name List: ", len(list1))

# Print Specific Element of List
print("First Element of Number list:",list[0])
print("First Element of Name list:",list1[0])

# Last element of list
print("Last Element in Number :",list[-1])
print("Last Element in Names : ",list1[-1])

# Add element to the end of the list
list1.append('Kunj')
list.append(11)
print(list)
print(list1)

# Add element at specific index
list1.insert(2,'kunso')
list.insert(1,2)

print(list)
print(list1)

# remove specific element from list

list.remove(11)
list1.remove('rahul')

print(list)
print(list1)

# Find the largest and smallest number in list
print("Largest in Numbers :" , max(list))
print("Minimum in Numbers :" , min(list))

print("Largest in Names :" , max(list1))
print("Minimum in Names :" , min(list1))

# Sum of all in list
x=sum(list)

print("Sum is : ",x)

# Reverse list without using slicing

reverse_list =[]
for i in list:
    reverse_list.insert(0,i)

print(reverse_list)

reverse_list1 =[]
for i in list1:
    reverse_list1.insert(0,i)

print(reverse_list1)

# With Slicing

slice_reversenum = list[::-1]
slice_reversename = list1[::-1]
print(slice_reversenum)
print(slice_reversename)

# Count how many times element occurs in list

x = list.count(2)
y = list1.count('ayush')

print("2 occurs",x,"Times")
print("ayush occurs",y,"Times")