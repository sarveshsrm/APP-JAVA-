def complex_operations(complex1, complex2):
    addition = complex1 + complex2
    subtraction = complex1 - complex2
    multiplication = complex1 * complex2
    division = complex1 / complex2
    return addition, subtraction, multiplication, division

# Example usage
real1 = float(input("Enter the real part of the first complex number: "))
imaginary1 = float(input("Enter the imaginary part of the first complex number: "))
complex1 = complex(real1, imaginary1)

real2 = float(input("Enter the real part of the second complex number: "))
imaginary2 = float(input("Enter the imaginary part of the second complex number: "))
complex2 = complex(real2, imaginary2)

add, subtract, multiply, divide = complex_operations(complex1, complex2)

print("Addition:", add)
print("Subtraction:", subtract)
print("Multiplication:", multiply)
print("Division:", divide)
