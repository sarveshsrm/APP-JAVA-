def celsius_to_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

# Example usage
celsius_temp = float(input("Enter temperature in Celsius: "))
converted_fahrenheit = celsius_to_fahrenheit(celsius_temp)
print(f"{celsius_temp} Celsius is equal to {converted_fahrenheit:.2f} Fahrenheit.")

fahrenheit_temp = float(input("Enter temperature in Fahrenheit: "))
converted_celsius = fahrenheit_to_celsius(fahrenheit_temp)
print(f"{fahrenheit_temp} Fahrenheit is equal to {converted_celsius:.2f} Celsius.")
