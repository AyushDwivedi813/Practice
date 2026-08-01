def is_palindrome(num) :
    if num<0:
        return False

    original_num = num
    reversed_num = 0
    while num > 0 :
        ld = num % 10
        reversed_num = (reversed_num * 10) + ld
        num = num // 10
    return original_num == reversed_num    

test_num = 13231

if is_palindrome(test_num):
    print(f"{test_num} is a Palindrome")
else:
    print(f"{test_num} is not a Palindrome")