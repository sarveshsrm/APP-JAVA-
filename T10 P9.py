def count_case_letters(input_string):
    upper_count = 0
    lower_count = 0
    for char in input_string:
        if char.isupper():
            upper_count += 1
        elif char.islower():
            lower_count += 1
    return upper_count, lower_count

input_string = input("Enter a string: ")
upper, lower = count_case_letters(input_string)

print("Number of uppercase letters:", upper)
print("Number of lowercase letters:", lower)
