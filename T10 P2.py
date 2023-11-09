def find_maximum(num1, num2, num3):
    max_number = max(num1, num2, num3)
    return max_number

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
num3 = int(input("Enter the third number: "))

maximum_number = find_maximum(num1, num2, num3)
print("Maximum number is:", maximum_number)
