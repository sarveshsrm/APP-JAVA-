print("Geometric Shape Calculator")
print("1. Circle")
print("2. Rectangle")
print("3. Triangle")
choice = int(input("Enter your choice (1/2/3): "))

if choice == 1:
    radius = float(input("Enter the radius of the circle: "))
    circle_area = 3.14 * radius ** 2
    circle_perimeter = 2 * 3.14 * radius
    print(f"Circle Area: {circle_area:.2f}")
    print(f"Circle Perimeter: {circle_perimeter:.2f}")

elif choice == 2:
    length = float(input("Enter the length of the rectangle: "))
    width = float(input("Enter the width of the rectangle: "))
    rectangle_area = length * width
    rectangle_perimeter = 2 * (length + width)
    print(f"Rectangle Area: {rectangle_area:.2f}")
    print(f"Rectangle Perimeter: {rectangle_perimeter:.2f}")

elif choice == 3:
    base = float(input("Enter the base of the triangle: "))
    height = float(input("Enter the height of the triangle: "))
    triangle_area = 0.5 * base * height
    print(f"Triangle Area: {triangle_area:.2f}")

else:
    print("Invalid choice. Please enter 1, 2, or 3.")
