def reverse_string(input_string):
    reversed_string = input_string[::-1]
    return reversed_string

def is_palindrome(input_string):
    reversed_string = reverse_string(input_string)
    if input_string == reversed_string:
        return True
    else:
        return False

input_string = input("Enter a string: ")

reversed_str = reverse_string(input_string)
print("Reversed string:", reversed_str)

if is_palindrome(input_string):
    print(input_string, "is a palindrome.")
else:
    print(input_string, "is not a palindrome.")
